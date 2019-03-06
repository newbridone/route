package com.ylx.route.util;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

public class HttpsClientZXUtil {

	public static String getResult(String productCode) throws Exception{
		SAXReader saxReader = new SAXReader();
		Document document;
		document = saxReader.read("https://tispfile.utourworld.com/upload/op/xml/agentLine/"+ productCode +".xml");
		String docXmlText = document.asXML();
		return docXmlText;
	}

	public static String getResultAll() throws Exception{
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read("https://tispfile.utourworld.com/upload/op/xml/agentLine/index.xml");
		String docXmlText = document.asXML();
		return docXmlText;
	}
}

