package ucf.assignments;

import javafx.fxml.FXML;

import java.awt.event.ActionEvent;

public class ToDoListModel {

    @FXML
    public void saveListButtonClicked(ActionEvent actionevent){
        //when save list button is clicked
        saveList();
    }

    @FXML
    public void saveAllListButtonClicked(ActionEvent actionevent){
        //when save all list button is clicked
        saveAllList();
    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionevent){
        //when load list button is clicked
        loadList();
    }

    @FXML
    public void loadAllListButtonClicked(ActionEvent actionevent){
        //when load all list button is clicked
        loadAllList();
    }

    @FXML
    public void addListButtonClicked(ActionEvent actionevent){
        //when add list button is clicked
        addList();
    }

    @FXML
    public void removeListButtonClicked(ActionEvent actionevent){
        //when remove list button is clicked
        removeList();
    }

    @FXML
    public void editListButtonClicked(ActionEvent actionevent){
        //when edit list button is clicked
        editList();
    }

    @FXML
    public void DisplayItemsButtonClicked(ActionEvent actionevent){
        //when display items button is clicked
        displayItems();
    }

    @FXML
    public void displayItemsCompletedButtonClicked(ActionEvent actionevent){
        //when display completed items button is clicked
        displayItemsCompleted();
    }

    @FXML
    public void displayItemsIncompletedButtonClicked(ActionEvent actionevent){
        //when display incomplete items button is clicked
        displayItemsIncompleted();
    }

    public static void saveList(){

        //loop through currently selected list
            //store items of list into txt file

    }

    public static void saveAllList(){

        //loop through list of list
            //loop through list of items
                //store each item into txt file

    }

    public static void loadList(){

        //open txt file
        //read txt file and store into list of items

    }

    public static void loadAllList(){

        //open txt file
        //read txt file and store each list into the list of list

    }

    public static void addList(){

        //Ask user for title of new ToDoList
        //Make a new ToDoList

    }

    public static void removeList(){

        //Remove currently selected ToDoList

    }

    public static void editList(){

        //Ask user for new title for the currently selected ToDoList
        //call ToDoList.updateTitle(ToDoList, str)
            //Replace the old ToDoList title with the user input

    }

    public static void displayItems(){

        //loop through all items in the selected ToDoList
            //print out each item

    }

    public static void displayItemsCompleted(){

        //loop through all items in the selected ToDoList
            //print out items that have "TRUE" for completed variable

    }

    public static void displayItemsIncompleted(){

        //loop through all items in the selected ToDoList
        //print out items that have "FALSE" for completed variable

    }

}
