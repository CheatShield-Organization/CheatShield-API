package org.cs.exam.dto.request;

import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.cs.entity.enums.ExamType;
import org.cs.exam.dto.mapper.QuizMapper;
import org.cs.user.dto.UserDTO;

public record CreateExamRequest(

        @NotBlank(message = "The exam does not have title!")
        @NotNull(message = "The exam does not have title!")
        String title,

        String description,

        @Nullable
        @Valid
        QuizMapper quizBody,

        @NotNull(message = "Exams should be in a category either 'THEORY' or 'PRACTISE' ")
        ExamType examType,

        @NotNull(message = "The exam should has an owner!")
        @Valid
        UserDTO professor
) {
}
