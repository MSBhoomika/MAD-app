package com.example.revalform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class apply_forms extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview=inflater.inflate(R.layout.apply_forms_frag,container,false);
        Button btreval= rootview.findViewById(R.id.reval);


        return inflater.inflate(R.layout.apply_forms_frag,container,false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Button newBlockButton = (Button) getActivity().findViewById(
                R.id.reval);
        newBlockButton.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View v) {

        Intent i=new Intent(getActivity(), ScrollingActivity.class);

        startActivity(i);
        ((Activity) getActivity()).overridePendingTransition(0, 0);
    }


}
