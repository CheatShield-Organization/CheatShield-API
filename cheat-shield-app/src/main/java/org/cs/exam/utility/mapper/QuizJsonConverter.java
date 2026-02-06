package org.cs.exam.configuration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.cs.confinguration.IJsonMapper;
import org.cs.exam.dto.mapper.QuizMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;


@Component
public class QuizJsonConverter implements IJsonMapper<QuizMapper> {

    private ObjectMapper mapper;

    @Override
    public Map<String, Object> SerializeObject(QuizMapper entity) {

        mapper = new ObjectMapper();

        Map<String, Object> quizConvertToMap = mapper.convertValue(entity, Map.class);

        return quizConvertToMap;
    }

    @Override
    public QuizMapper DeserializeObject(Map<String, Object> keyValueStructure) {
        mapper = new ObjectMapper();

        return null;
    }
}
