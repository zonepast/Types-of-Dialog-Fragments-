package com.example.aff02.dialogfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showNormalDialog(View view)
    {
        FragmentManager manager = getFragmentManager();

        //Create object of dialog fragment..
        MyDialog myDialog = new MyDialog();
        myDialog.show(manager,"Dialog");
    }
    public void showListDialog(View view)
    {
        FragmentManager manager = getFragmentManager();

        //Create object of dialog fragment..
        ShowList showList = new ShowList();
        showList.show(manager,"Dialog");
    }

    public void showMultipleChoiceDialog(View view)
    {
        FragmentManager manager = getFragmentManager();

        //Create object of dialog fragment..
        ShowMultipleChoice showMultipleChoice = new ShowMultipleChoice();
        showMultipleChoice.show(manager,"Dialog");
    }

    public void showcustomdialog(View view)
    {
        FragmentManager manager = getFragmentManager();
        CustomDialog customDialog = new CustomDialog();
        customDialog.show(manager,"Dialog");
    }

    public void showcustomdialogtwo(View view)
    {
        FragmentManager manager = getFragmentManager();
        CustomDialogTwo customDialogTwo = new CustomDialogTwo();
        customDialogTwo.show(manager,"Dialog");
    }
    public void showTimePickerDialog(View view)
    {
        FragmentManager manager = getFragmentManager();
        DateTimePickerOne dateTimePickerOne = new DateTimePickerOne();
        dateTimePickerOne.show(manager,"Dialog");
    }
    public void showDatePickerDialog(View view)
    {
        FragmentManager manager = getFragmentManager();
        DatePicker datePicker = new DatePicker();
        datePicker.show(manager,"Dialog");
    }
    public void showasfragment(View view)
    {
        Dialogasfragment dialogasfragment = new Dialogasfragment();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group,dialogasfragment,"Dialog as Fragment");
        transaction.addToBackStack(String.valueOf(manager));
        transaction.commit();
    }

//    @Override
//    public void onDialog(String message) {
//        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
//    }
}
