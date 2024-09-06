package utils;

import java.util.HashMap;
import java.util.ArrayList;



public class SendGridTemplateData{
    private HashMap<String, String> from = new HashMap<String, String>();
    private ArrayList<Object> personalizations = new ArrayList<Object>();
    private String template_id;

    public SendGridTemplateData(String toEmail, String templateID){
        from.put("email","a00290543@student.ait.ie");
        HashMap<String, String> to = new HashMap<String, String>();
        to.put("email",toEmail);
        personalizations.add(to);
        template_id = templateID;
    }
}