package com.sebastianbuza.proiect_os;

/**
 * Created by sebi on 27.06.2015.
 */

import java.io.IOException;
import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonGenerator {
    public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "Sebastian");
        obj.put("age", 20);

        JSONArray list = new JSONArray();
        list.add("example1");
        list.add("example2");
        list.add("example3");

        obj.put("messages", list);

        try {

            FileWriter file = new FileWriter("c:\\test.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);
    }
}
