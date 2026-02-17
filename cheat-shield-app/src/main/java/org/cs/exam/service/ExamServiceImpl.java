package org.cs.exam.service;

import org.cs.abstraction.JsonMapper;
import org.cs.entity.Exam;
import org.cs.entity.User;
import org.cs.exam.dto.mapper.QuizMapper;
import org.cs.exam.dto.request.DeleteExamRequest;
import org.cs.exam.dto.request.ModifyExamRequest;
import org.cs.exam.dto.request.ModifyQuizRequest;
import org.cs.exam.dto.response.SelectExamResponse;
import org.cs.exam.utility.mapper.QuizJsonConverter;
import org.cs.exam.dto.request.CreateExamRequest;
import org.cs.exam.service.abstraction.IExamService;
import org.cs.repository.ExamRepository;
import org.cs.repository.UserRepository;
import org.cs.user.dto.UserDTO;
import org.cs.user.utility.validation.UserValidator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Service
public class ExamService implements IExamService {

    private ExamRepository examRepository;

    private UserRepository userRepository;

    private JsonMapper<QuizMapper> jsonConverter;

    private UserValidator userValidator;

    public ExamService(ExamRepository examRepository, UserRepository userRepository, QuizJsonConverter jsonConverter, UserValidator userValidator){
        this.examRepository = examRepository;
        this.userRepository = userRepository;
        this.jsonConverter = jsonConverter;
        this.userValidator = userValidator;
    }

    public void createExam(CreateExamRequest createExamRequest){

        userValidator.ensureUserExistsByEmail(createExamRequest.professor().emailAddress());

        Exam exam = new Exam();

        exam.setExamPublicId(UUID.randomUUID().toString());
        exam.setTitle(createExamRequest.title());
        exam.setDescription(createExamRequest.description());
        exam.setType(createExamRequest.examType());

        exam.setQuizContent(jsonConverter.SerializeObject(createExamRequest.quizBody()));
        Optional<User> professor = userRepository.findUserByEmailAddress(createExamRequest.professor().emailAddress());

        exam.setProfessor(professor.get());

        examRepository.save(exam);

    }

    @Override
    public void modifyExam(ModifyExamRequest modifyExamRequest) {

    }

    @Override
    public void modifyQuiz(ModifyQuizRequest modifyQuizRequest) {

    }

    @Override
    public void deleteExam(DeleteExamRequest deleteExamRequest) {

    }

    @Override
    public ArrayList<SelectExamResponse> selectExamsByProfessor(UserDTO professor) {
        return null;
    }

    @Override
    public SelectExamResponse selectExamByProfessor(UserDTO professor) {
        return null;
    }
}
