package cn.neusoft;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1.获取主配置
		Configuration cfg =new Configuration();
		cfg.setDirectoryForTemplateLoading(new File("d:"+File.separator+"test_freemarker"));
		
		//2. 获取模板文件  
		Template t = cfg.getTemplate("Demo.ftl");
		
		
		//3.建立数据模型  
        Map<String,String> root = new HashMap<String,String>();  
        root.put("message", "hello world");  
        root.put("name", "dfe");
        
        //4.设置输出文件并输出
        Writer writer=new FileWriter(new File("d:"+File.separator+"test_freemarker"+File.separator+"Demo.html"));
        t.process(root, writer);
	}

}

/**
 * 总结: 
	Configuration cfg =new Configuration();
	Template t = cfg.getTemplate("d:"+File.separator+"test_freemarker"+File.separator+"Demo.ftl");
	这种方式是错误的。
 * **/
