package org.cs.exam.service.abstraction;


import org.cs.exam.dto.request.CreateExamRequest;
import org.cs.exam.dto.request.DeleteExamRequest;
import org.cs.exam.dto.request.ModifyExamRequest;
import org.cs.exam.dto.request.ModifyQuizRequest;
import org.cs.exam.dto.response.SelectExamResponse;
import org.cs.user.dto.UserDTO;

import java.util.ArrayList;

/*
*
*/
public interface IExamService {

    public void createExam(CreateExamRequest createExamRequest);

    public void modifyExam(ModifyExamRequest modifyExamRequest);

    public void modifyQuiz(ModifyQuizRequest modifyQuizRequest);

    public void deleteExam(DeleteExamRequest deleteExamRequest);

    public ArrayList<SelectExamResponse> selectExamsByProfessor(UserDTO professor);

    public SelectExamResponse selectExamByProfessor(UserDTO professor);

}
