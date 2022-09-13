package org.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XmlUtil {
    public static Object getBean(String config) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(config);

            NodeList nodeList = document.getElementsByTagName("className");
            Node child = nodeList.item(0).getFirstChild();
            String className = child.getNodeValue();
            return Class.forName(className).getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
