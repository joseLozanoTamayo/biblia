package org.biblia.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.biblia.R;

/**
 * Created by haade on 13/09/2017.
 */

public class Page_3  extends Fragment {

    //Constructor default
    public Page_3() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View PageTree = inflater.inflate(R.layout.list_item_libro, container, false);



        return PageTree;
    }
}