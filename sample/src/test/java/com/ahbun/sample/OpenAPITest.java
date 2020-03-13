package com.ahbun.sample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class OpenAPITest {
    private String openAPIInYAML;
    private String expectedToString;

    @Before
    public void setUp() throws Exception {
        File f = new File(ClassLoader.getSystemClassLoader().getResource("api.yaml").getPath());
        BufferedReader reader = new BufferedReader(new FileReader(f));

        String line = reader.readLine();
        StringBuilder sb = new StringBuilder();
        while (line != null) {
            sb.append(line + "\n");
            line = reader.readLine();
        }
        reader.close();

        openAPIInYAML = sb.toString();

        expectedToString = "OpenAPI{openapi='3.0.0', info=Info{title='Swagger Petstore', description='null', version='1.0.0', license=License{name='MIT', url='null'}}}";
    }

    @Test
    public void testSimplifiedOpenAPI() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try {
            OpenAPI openAPI = objectMapper.readValue(openAPIInYAML, OpenAPI.class);
            System.out.println(openAPI.toString());
            Assert.assertEquals(expectedToString, openAPI.toString());
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        }
    }
}