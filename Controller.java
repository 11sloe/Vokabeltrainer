
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.event.*;
import javafx.scene.control.*;
import javafx.scene.input.*;

public class Controller {

    private Vokabeltrainer trainer;

    @FXML
    private Label lblBegriff;

    @FXML
    private TextField txtEingabe;

    @FXML
    private Button btnPruefen;

    @FXML
    private Label lblMeldung;

    @FXML
    private Button btnWeiter;

    @FXML
    private Label lblAnzahl;

    public Controller()
    {
        trainer = new Vokabeltrainer();
        trainer.woerterEintragen();
    }

    @FXML
    private void initialize()   {
        neuesWort();
    }

    @FXML
    void pruefen(ActionEvent event) {
        String eingabe = txtEingabe.getText();

        if (trainer.pruefen(eingabe))
        {
            lblMeldung.setText("Richtig!");
        }
        else {
            lblMeldung.setText("Falsch!");
        }

    }

    @FXML
    void weiter(ActionEvent event) {  
        if (trainer.anzahlGeben()==0)
        {
            lblMeldung.setText("Fertig!");
        }else
        {
            neuesWort();
        }
    }

    private void neuesWort()
    {
        trainer.wortLaden();
        lblBegriff.setText(trainer.deutschGeben());
        lblMeldung.setText("?");
        lblAnzahl.setText(""+trainer.anzahlGeben());
        txtEingabe.setText("");
    }

}