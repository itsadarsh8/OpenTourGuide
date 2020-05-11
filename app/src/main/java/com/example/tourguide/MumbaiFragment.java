package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MumbaiFragment extends Fragment {

    public MumbaiFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.list_view,container,false);

        ArrayList<Data> arrayList= new ArrayList<>();
        arrayList.add(new Data("India Gate4","Nice Nice4"));

        DataAdapter dataAdapter=new DataAdapter(getActivity(),arrayList);

        ListView listView= rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }


}
