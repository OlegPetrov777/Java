package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import sample.models.Person;
import sample.utils.DateUtil;

import javafx.scene.control.TextField;

public class PersonEditPageController {
    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField streetField;

    @FXML
    private TextField cityField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private TextField birthdayField;

    private Stage dialogueStage;
    private Person person;
    private boolean okClicked = false;

    public void setDialogueStage(Stage dialogueStage) {
        this.dialogueStage = dialogueStage;
    }

    @FXML
    private void initialize(){}

    public void setPerson(Person person){
        this.person = person;

        firstNameField.setText(person.getFirstName());
        lastNameField.setText(person.getLastName());
        streetField.setText(person.getStreet());
        cityField.setText(person.getCity());
        postalCodeField.setText(Integer.toString(person.getPostalCode()));
        birthdayField.setText(DateUtil.format(person.getBirthday()));
    }

    public boolean isOkClicked(){
        return okClicked;
    }

    @FXML
    private void handleCancel(){
        dialogueStage.close();
    }

    @FXML
    private void handleOk(){
        if(isInputValid()){
            person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
            person.setBirthday(DateUtil.parse(birthdayField.getText()));
            person.setFirstName(firstNameField.getText());
            person.setLastName(lastNameField.getText());
            person.setStreet(streetField.getText());
            person.setCity(cityField.getText());

            okClicked = true;
            dialogueStage.close();
        }
    }

    private boolean isInputValid(){
        String errorMessage = "";
        if(firstNameField.getText() == null || firstNameField.getText().length() == 0){
            errorMessage += "No name input\n";
        }

        if(lastNameField.getText() == null || lastNameField.getText().length() == 0){
            errorMessage += "No last name input\n";
        }

        if(streetField.getText() == null || streetField.getText().length() == 0){
            errorMessage += "No street input\n";
        }

        if(cityField.getText() == null || cityField.getText().length() == 0){
            errorMessage += "No city input\n";
        }

        if(postalCodeField.getText() == null || postalCodeField.getText().length() == 0){
            errorMessage += "No postal code input\n";
        }else{
            try{
                Integer.parseInt(postalCodeField.getText());
            }catch (NumberFormatException e){
                errorMessage += "Postal code must contain numbers\n";
            }
        }

        if(birthdayField.getText() == null || birthdayField.getText().length() == 0){
            errorMessage += "No birthday input\n";
        }else{
            if(!DateUtil.isValidDate(birthdayField.getText())){
                errorMessage += "Wrong date format. Please use dd.mm.yyyy\n";
            }
        }

        if (errorMessage.length()==0){
            return true;
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initOwner(dialogueStage);
            alert.setTitle("Error!");
            alert.setHeaderText("Wrong input!");
            alert.setContentText(errorMessage);

            alert.showAndWait();
            return false;
        }

    }
}
