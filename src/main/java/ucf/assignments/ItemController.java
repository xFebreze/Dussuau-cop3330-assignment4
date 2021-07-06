package ucf.assignments;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class ItemController {

    @FXML
    public void addItemButtonClicked(javafx.event.ActionEvent actionevent){
        addItem();
    }

    @FXML
    public void removeItemButtonClicked(javafx.event.ActionEvent actionevent){
        removeItem();
    }

    @FXML
    public void editItemDescriptionButtonClicked(javafx.event.ActionEvent actionevent){
        editItemDescription();
    }

    @FXML
    public void editItemDueDateButtonClicked(javafx.event.ActionEvent actionevent){
        editItemDueDate();
    }

    @FXML
    public void alterCompletionButtonClicked(javafx.event.ActionEvent actionevent){
        alterItemComplete();
    }

    public static void addItem(){

        //Make pop up fxml (call another controller class)
            //Ask user for a description for new item
            //Ask user for due date of the new item
            //Make new item via user inputs for currently selected list

    }

    public static void removeItem(){

        //remove the selected Item from the currently selected list

    }

    public static void editItemDescription(){

        //Make pop up fxml (call another controller class)
            //Ask user for a description for the currently selected Item
            //call Item.updateDescription(Item, str)
                //replace the current description of the current item with new user description

    }

    public static void editItemDueDate(){

        //Make pop up fxml (call another controller class)
            //ASk user for new due date for selected Item (YYYY-MM-DD)
            //call Item.updateDueDate(Item, num)
                //replace the current due date of the current item with the new due date

    }

    public static void alterItemComplete(){

        //call Item.updateCompletion(Item)
            //This function should switch the completion on or off

    }

}