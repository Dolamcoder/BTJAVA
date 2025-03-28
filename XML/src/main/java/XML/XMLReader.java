package XML;

import Model.Food;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.File;
import java.util.ArrayList;

public class XMLReader {
    public static ArrayList<Food> readFoodFromXML(String filePath) {
        ArrayList<Food> foodList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File not found: " + filePath);
                return foodList;
            }

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("food");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node foodNode = nodeList.item(i);
                if (foodNode.getNodeType() == Node.ELEMENT_NODE) {
                    foodList.add(parseFoodElement((Element) foodNode));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodList;
    }

    private static Food parseFoodElement(Element foodElement) {
        String id = foodElement.getElementsByTagName("id").item(0).getTextContent().trim();
        String name = foodElement.getElementsByTagName("name").item(0).getTextContent().trim();
        double price = Double.parseDouble(foodElement.getElementsByTagName("price").item(0).getTextContent().trim());
        String description = foodElement.getElementsByTagName("description").item(0).getTextContent().trim();
        int calories = Integer.parseInt(foodElement.getElementsByTagName("calories").item(0).getTextContent().trim());

        return new Food(name, id, price, description, calories);
    }
}
