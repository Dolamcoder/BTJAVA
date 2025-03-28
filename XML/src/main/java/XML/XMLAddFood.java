package XML;

import Model.Food;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

import java.io.File;

public class XMLAddFood {
    public boolean addFoodToXML(String filePath, Food food) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("File not found: " + filePath);
                return false;
            }

            // Đọc file XML hiện tại
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            // Lấy node gốc <breakfast_menu>
            Element root = doc.getDocumentElement();

            // Tạo node mới <food>
            Element foodElement = doc.createElement("food");

            // Tạo ID mới: đếm số lượng <food> hiện tại và +1
            NodeList foodNodes = doc.getElementsByTagName("food");
            int count = foodNodes.getLength();
            String id = String.format("%03d", count + 1); // 001, 002, ...

            // Gán ID mới cho đối tượng food
            food.setId(id);

            // Tạo các element con
            Element idElement = doc.createElement("id");
            idElement.setTextContent(food.getId());

            Element nameElement = doc.createElement("name");
            nameElement.setTextContent(food.getName());

            Element priceElement = doc.createElement("price");
            priceElement.setTextContent(String.valueOf(food.getPrice()));

            Element descElement = doc.createElement("description");
            descElement.setTextContent(food.getDescription());

            Element calElement = doc.createElement("calories");
            calElement.setTextContent(String.valueOf(food.getCalories()));

            // Gắn các element con vào <food>
            foodElement.appendChild(idElement);
            foodElement.appendChild(nameElement);
            foodElement.appendChild(priceElement);
            foodElement.appendChild(descElement);
            foodElement.appendChild(calElement);

            // Gắn <food> vào root
            root.appendChild(foodElement);

            // Ghi lại file XML
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
