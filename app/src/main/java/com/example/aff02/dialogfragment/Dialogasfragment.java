package com.example.aff02.dialogfragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AFF02 on 11-Aug-17.
 */

public class Dialogasfragment extends Fragment {

    /*Remove onCreateDialog method because that doesn't work..because
    we are adding a dialog in the fragment..*/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.custom_dialog_two,null);
        return view;
    }

    //here we have reused the piece of code in the fragment which was initially
    //  a dialog
}
