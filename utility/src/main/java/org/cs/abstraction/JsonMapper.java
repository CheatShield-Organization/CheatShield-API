package org.cs.confinguration;

import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public interface IJsonMapper<T> {

    public Map<String,Object> SerializeObject(T entity);

    public T DeserializeObject(Map<String, Object> keyValueStructure);

}
