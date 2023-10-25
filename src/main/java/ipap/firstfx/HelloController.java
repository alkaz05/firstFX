package ipap.firstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label labelRes;
    @FXML
    private TextField textY;
    @FXML
    private TextField txtX;
    @FXML
    public void plus(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(textY.getText());
        double z = x+y;
        labelRes.setText("Результат равен "+z);
    }
    @FXML
    public void minus(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(textY.getText());
        double z = x-y;
        labelRes.setText("Результат равен "+z);
    }

}
