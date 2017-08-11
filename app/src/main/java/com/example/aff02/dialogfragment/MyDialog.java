package com.example.aff02.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by AFF02 on 10-Aug-17.
 */

public class MyDialog extends DialogFragment {

//    //describe the buttons..
//    Button yes,no;
//    Communicator communicator;
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        communicator=(Communicator) context;
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.dialog,null);
//        yes = (Button)view.findViewById(R.id.btnyes);
//        no = (Button)view.findViewById(R.id.btnno);
//        yes.setOnClickListener(this);
//        no.setOnClickListener(this);
//        setCancelable(false);
//        return view;
//    }
//
//
//    @Override
//    public void onClick(View view) {
//
//
//        if (view.getId()  == R.id.btnyes)
//        {
//            communicator.onDialog("Yes was clicked");
//            dismiss();
//            //Toast.makeText(getActivity(),"yes button was clicked",Toast.LENGTH_LONG).show();
//        }
//
//        else {
//
//            communicator.onDialog("no was clicked");
//            dismiss();
//            //Toast.makeText(getActivity(),"no was clicked",Toast.LENGTH_LONG).show();
//        }
//    }
//
//    public interface Communicator
//    {
//        public void onDialog(String message);
//    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("My Dialog");

        //now make a list of items
       builder.setMessage("Do you like the Dialog ?");
//        builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//
//                Toast.makeText(getActivity(),"you selected "+i,Toast.LENGTH_LONG).show();
//            }
//        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getActivity(),"-ve btn was clicked",Toast.LENGTH_LONG).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(getActivity(),"+ve btn was clicked",Toast.LENGTH_LONG).show();

            }
        });
        Dialog dialog = builder.create();
        return dialog;
    }
}
