import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUIReto3Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtNumeroReg;

    @FXML
    private TextArea txtDatos;

    @FXML
    private Button btnProcesar;

    @FXML
    private TextArea txtOutput;

    @FXML
    void processData(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtNumeroReg != null : "fx:id=\"txtNumeroReg\" was not injected: check your FXML file 'GUIReto3.fxml'.";
        assert txtDatos != null : "fx:id=\"txtDatos\" was not injected: check your FXML file 'GUIReto3.fxml'.";
        assert btnProcesar != null : "fx:id=\"btnProcesar\" was not injected: check your FXML file 'GUIReto3.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'GUIReto3.fxml'.";

    }
}
