package com.aquaJax.fragmentcommunication.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by riinav on 17/3/14.
 */
public class FragmentB extends Fragment{

    private TextView textView;
    private String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_b, container, false);
        if (savedInstanceState != null) {
            data = savedInstanceState.getString("data", data);
            ((TextView)rootView.findViewById(R.id.textView)).setText(data);
        }

        return  rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        textView = (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changeText(String data) {
        this.data = data;
        textView.setText(data);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("data", data);
    }
}
