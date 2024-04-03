package manager;

import locality.City;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.System.in;

public class XMLReader {
    public static void read(String path, boolean firstStart) throws FileNotFoundException, SAXException, IOException, ParserConfigurationException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));

        int line;
        StringBuilder text = new StringBuilder();
        while ((line = bis.read()) != -1) {
            text.append(line);
        }
        if (text.isEmpty()) {
            System.out.println("No element to add, your collection is clear");
            return;
        }
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(in);
        NodeList cityElements = document.getDocumentElement().getElementsByTagName("city");
        if (firstStart) {
            if (cityElements.getLength() == 0) {
                System.out.println("No element to add, your collection is clear");
            }
        }
        else {
            for (int i = 0; i < cityElements.getLength(); i++) {
                Node city = cityElements.item(i);
                NamedNodeMap attributes = city.getAttributes();
                String[] data = {attributes.getNamedItem("key").getNodeValue(), attributes.getNamedItem("id").getNodeValue(),
                        attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("x").getNodeValue(),
                        attributes.getNamedItem("y").getNodeValue(), attributes.getNamedItem("creationDate").getNodeValue(),
                        attributes.getNamedItem("area").getNodeValue(),attributes.getNamedItem("population").getNodeValue(),
                        attributes.getNamedItem("metersAboveSeaLevel").getNodeValue(),attributes.getNamedItem("establishmentDate").getNodeValue(),
                        attributes.getNamedItem("timezone").getNodeValue(),attributes.getNamedItem("standardOfLiving").getNodeValue(),
                        attributes.getNamedItem("governor").getNodeValue()};

                String key = data[0];
                try {
                    City cities = new City(data);
                    CollectionManager.add(key, (City) city);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }
    }
}
