package com.example.tourguide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DelhiFragment extends Fragment {

    public DelhiFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.list_view,container,false);

        ArrayList<Data> arrayList= new ArrayList<>();
        arrayList.add(new Data("India Gate","Nice Nice"));

        DataAdapter dataAdapter=new DataAdapter(getActivity(),arrayList);

        ListView listView= rootView.findViewById(R.id.listViewId);

        listView.setAdapter(dataAdapter);

        return rootView;


    }


}
