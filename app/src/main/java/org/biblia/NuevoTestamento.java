package org.biblia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.biblia.R;

/**
 * Created by haade on 13/09/2017.
 */

public class NuevoTestamento extends Fragment {

    //Constructor default
    public NuevoTestamento(){};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View nuevoTestamento = inflater.inflate(R.layout.nuevo_testamento, container, false);
        return nuevoTestamento;
    }
}