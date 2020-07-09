package sample;

import com.sun.xml.internal.ws.util.StringUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button one;
    @FXML
    Button two;
    @FXML
    Button three;
    @FXML
    Button four;
    @FXML
    Button five;
    @FXML
    Button six;
    @FXML
    Button seven;
    @FXML
    Button eight;
    @FXML
    Button nine;
    @FXML
    Button plus;
    @FXML
    Button minus;
    @FXML
    Button multiply;
    @FXML
    Button divisor;
    @FXML
    Button equal;
    @FXML
    Button point;
    @FXML
    Button zero;
    @FXML
    TextField textField;
    @FXML
    Button reset;

    String value;
    String value1;
    String value2;
    Float v1;
    Float v2;
    Float fullValue;
    int count = 0;
    String kvalue1;
    String kvalue2;
    Float kv1;
    Float kv2;
    Float kv;

    public void insertNumbers()
    {
        zero.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("0");
            textField.setText(value);
        });
        one.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("1");
            textField.setText(value);
        });
        two.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("2");
            textField.setText(value);
        });
        three.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("3");
            textField.setText(value);
        });
        four.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("4");
            textField.setText(value);
        });
        five.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("5");
            textField.setText(value);
        });
        six.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("6");
            textField.setText(value);
        });
        seven.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("7");
            textField.setText(value);
        });
        eight.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("8");
            textField.setText(value);
        });
        nine.setOnAction(event -> {
            value = textField.getText();
            value = value.concat("9");
            textField.setText(value);
        });
        point.setOnAction(event -> {
            value = textField.getText();
            value = value.concat(".");
            textField.setText(value);
        });
        plus.setOnAction(event -> {
            count = 1;
            value1 = textField.getText();
            value = value.concat(" + ");
            textField.setText(value);

        });
        minus.setOnAction(event -> {
            count = 2;
            value1 = textField.getText();
            value = value.concat(" - ");
            textField.setText(value);
        });
        multiply.setOnAction(event -> {
            count = 3;
            value1 = textField.getText();
            value = value.concat(" * ");
            textField.setText(value);
        });
        divisor.setOnAction(event -> {
            count = 4;
            value1 = textField.getText();
            value = value.concat(" / ");
            textField.setText(value);
        });
        equal.setOnAction(event -> {
            try {
                switch (count){
                    case 0 :
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setContentText("Enter Value First");
                        alert.show();
                        break;
                    case 1:
                        value2 = value.substring(value.indexOf("+") + 1);
                        v1 = Float.parseFloat(value1);
                        v2 = Float.parseFloat(value2);
                        fullValue = v1 + v2;
                        textField.setText(Float.toString(fullValue));
                        break;
                    case 2:
                        value2 = value.substring(value.indexOf("-") + 1);
                        v1 = Float.parseFloat(value1);
                        v2 = Float.parseFloat(value2);
                        fullValue = v1 - v2;
                        textField.setText(Float.toString(fullValue));
                        break;
                    case 3:
                        value2 = value.substring(value.indexOf("*") + 1);
                        v1 = Float.parseFloat(value1);
                        v2 = Float.parseFloat(value2);
                        fullValue = v1 * v2;
                        textField.setText(Float.toString(fullValue));
                        break;
                    case 4:
                        value2 = value.substring(value.indexOf("/") + 1);
                        v1 = Float.parseFloat(value1);
                        v2 = Float.parseFloat(value2);
                        fullValue = v1 / v2;
                        textField.setText(Float.toString(fullValue));
                        break;

                }
            }catch (Exception e)
            {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("Wrong Data entered");
                alert.show();
            }

        });
        reset.setOnAction(event -> {
            textField.setText("");
        });



    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
