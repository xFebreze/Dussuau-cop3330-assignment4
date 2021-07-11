package ucf.assignments;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;


public class ItemController implements Initializable {

    ObservableList <Item> toDoList = FXCollections.observableArrayList();

    @FXML TextField DescriptionField;
    @FXML DatePicker DueDate;
    @FXML TableView<Item> TableDisplay;
    @FXML TableColumn<Item, String> TableDescription;
    @FXML TableColumn<Item, String> TableDueDate;
    @FXML TableColumn<Item, String> TableCompletion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TableDescription.setCellValueFactory(new PropertyValueFactory<Item, String>("description"));
        TableDueDate.setCellValueFactory(new PropertyValueFactory<Item, String>("dueDate"));
        TableCompletion.setCellValueFactory(new PropertyValueFactory<Item, String>("complete"));
    }

    @FXML
    public void addItemButtonClicked(ActionEvent actionevent){

        //Convert text field and date picker to strings
        //call add item w/ strings

        String date = DueDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String str = DescriptionField.getText();
        addItem(str, date);
    }

    @FXML
    public void removeItemButtonClicked(ActionEvent actionevent){

        //grab the selected item
        //call remove item given selected item

        Item temp = TableDisplay.getSelectionModel().getSelectedItem();
        removeItem(temp);
    }

    @FXML
    public void clearItemsButtonCLicked(ActionEvent actionevent){

        //call ClearItems

        clearItems();
    }

    @FXML
    public void editItemDescriptionButtonClicked(ActionEvent actionevent){

        //convert textField to str
        //get selected Item
        //call editItemDescription

        String str = DescriptionField.getText();
        Item temp = TableDisplay.getSelectionModel().getSelectedItem();
        editItemDescription(str, temp);
    }

    @FXML
    public void editItemDueDateButtonClicked(ActionEvent actionevent){

        //convert dueDate to date
        //get selected Item
        //call editItemDueDate

        String date = DueDate.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Item temp = TableDisplay.getSelectionModel().getSelectedItem();
        editItemDueDate(date, temp);
    }

    @FXML
    public void alterCompletionButtonClicked(ActionEvent actionevent){
        //when edit items completion button is clicked
        alterItemComplete();
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

    @FXML
    public void saveListButtonClicked(ActionEvent actionevent){
        //when save list button is clicked
        saveList();
    }

    @FXML
    public void loadListButtonClicked(ActionEvent actionevent){
        //when load list button is clicked
        loadList();
    }

    public void addItem(String tempDescription, String tempDueDate){

        //add item to list
        //add item to Display

        toDoList.add(new Item (tempDescription,tempDueDate,false));
        TableDisplay.getItems().add(toDoList.get(toDoList.size()-1));
    }

    public void removeItem(Item tempItem){

        //remove item from list
        //remove item from display

        toDoList.remove(tempItem);
        TableDisplay.getItems().removeAll(tempItem);

    }

    public void clearItems(){

        //clear all items from list
        //clear all items from display

        toDoList.clear();
        TableDisplay.getItems().clear();
        System.out.println(toDoList.size());
    }

    public void editItemDescription(String tempDescription, Item tempItem){

        //find list index
        //edit item on list
        //edit item on table display

        int tempIndex = toDoList.indexOf(tempItem);
        toDoList.set(tempIndex, new Item (tempDescription, tempItem.getDueDate(), tempItem.getComplete()));
        TableDisplay.getItems().set(tempIndex, new Item (tempDescription, tempItem.getDueDate(), tempItem.getComplete()));
    }

    public void editItemDueDate(String tempDueDate, Item tempItem){

        //find list index
        //edit item on list
        //edit item on table display

        int tempIndex = toDoList.indexOf(tempItem);
        toDoList.set(tempIndex, new Item (tempItem.getDescription(), tempDueDate, tempItem.getComplete()));
        TableDisplay.getItems().set(tempIndex, new Item (tempItem.getDescription(), tempDueDate, tempItem.getComplete()));
    }

    public void alterItemComplete(){

        //call Item.updateCompletion(Item)
        //This function should switch the completion on or off

    }

    public void saveList(){

        //loop through currently selected list
        //store items of list into txt file

    }

    public void loadList(){

        //open txt file
        //read txt file and store into list of items

    }

    public void displayItems(){

        //loop through all items in the selected ToDoList
        //print out each item

    }

    public void displayItemsCompleted(){

        //loop through all items in the selected ToDoList
        //print out items that have "TRUE" for completed variable

    }

    public void displayItemsIncompleted(){

        //loop through all items in the selected ToDoList
        //print out items that have "FALSE" for completed variable

    }


}
