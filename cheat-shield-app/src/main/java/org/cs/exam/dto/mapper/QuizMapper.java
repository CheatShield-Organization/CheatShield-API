package org.cs.exam.dto.mapper;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestMapper {

    @NotBlank(message = "The exam does not have title!")
    private String title;

    private String description;

    @NotNull(message = "it has to have at least one question written!")
    private ArrayList<QuestionMapper> questions;
}


