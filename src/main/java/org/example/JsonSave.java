package org.example;

import com.google.gson.Gson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class JsonSave {

    public static void save(ArrayList<Say> list) throws IOException {


        // ObjectMapper 생성
        ObjectMapper mapper = new ObjectMapper();

        // Map을 JSON 파일로 저장
        mapper.writeValue(new File("data.json"), list);

    }

}
