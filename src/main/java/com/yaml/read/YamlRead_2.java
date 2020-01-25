package com.yaml.read;

import java.io.File;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
public class YamlRead_2 {
	   public static void main(String[] args) {
	        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
	        try {
	        	YamlRead_1 user = mapper.readValue(new File(System.getProperty("user.dir")+"\\Test.yaml"), YamlRead_1.class);
	            System.out.println(ReflectionToStringBuilder.toString(user,ToStringStyle.MULTI_LINE_STYLE));
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
