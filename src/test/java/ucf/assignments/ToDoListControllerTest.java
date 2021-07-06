package ucf.assignments;

import org.junit.jupiter.api.Test;

public class ToDoListControllerTest {

    @Test
    public void SaveListTest(){
        // make a new todolist model
        //initialize a list to the agenda
        //call save list
        //assert equals file
    }

    @Test
    public void SaveAllListTest(){
        // make a new todolist model
        //initialize two list to the agenda
        //call save all list
        //assert equals file
    }

    @Test
    public void LoadListTest(){
        // make a new todolist model
        //initialize a list to the agenda
        //call save list
        //call load list
        //assert equals list
    }

    @Test
    public void LoadAllListTest(){
        // make a new todolist model
        //initialize two list to the agenda
        //call save all list
        //call load all list
        //assert equals all list on agenda (via loop)
    }

    @Test
    public void addListTest(){
        //make a new todolist model
        //call addList
        //get variable info from List display
        //assert equal list title var and list title
    }

    @Test
    public void removeListTest(){
        //make a new todolist model
        //initialize a list into the agenda
        //call remove list
        //assert equals agenda being empty and true
    }

    @Test
    public void editListTest(){
        //make a new todolist model
        //initialize a list onto the agenda
        //call edit list
        //assert equal list title and list title var
    }

    @Test
    public void DisplayItemsTest(){
        //make a new todolist model
        //initialize a list onto agenda
        //initialize items onto the list
        //call display items
        //compare items to items list var
    }

    @Test
    public void DisplayCompletedItemsTest(){
        //make a new todolist model
        //initialize a list onto agenda
        //initialize items onto the list
        //mark half of items complete
        //call display items complete
        //compare completed items to completed items list var
    }

    @Test
    public void DisplayIncompleteItemsTest(){
        //make a new todolist model
        //initialize a list onto agenda
        //initialize items onto the list
        //mark half of items complete
        //call display items incomplete
        //compare incompleted items to incompleted items list var
    }
}
