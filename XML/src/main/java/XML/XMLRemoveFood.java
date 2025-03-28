package XML;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class XMLRemoveFood {
    public boolean removeFoodById(String filePath, String foodId) {
        try {
            // Bước 1: Đọc file XML
            File xmlFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();

            // Bước 2: Lấy danh sách <food>
            NodeList foodList = doc.getElementsByTagName("food");
            boolean found = false;

            for (int i = 0; i < foodList.getLength(); i++) {
                Node foodNode = foodList.item(i);

                if (foodNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element foodElement = (Element) foodNode;
                    String id = foodElement.getElementsByTagName("id").item(0).getTextContent();

                    if (id.equals(foodId)) {
                        foodElement.getParentNode().removeChild(foodElement);
                        found = true;
                        break; // Xóa 1 món là đủ
                    }
                }
            }

            if (found) {
                // Bước 3: Ghi lại file XML sau khi xóa
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(xmlFile);
                transformer.transform(source, result);

                return true;
            } else {
                System.out.println("Không tìm thấy món với ID: " + foodId);
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
