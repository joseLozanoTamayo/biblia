package org.biblia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.biblia.R;
import org.biblia.org.bibllia.dto.LeadsRepository;
import org.biblia.org.bibllia.dto.LibroListViewDTO;
import org.biblia.org.bibllia.dto.LibrosAdapter;

import java.util.ArrayList;

/**
 * Created by haade on 13/09/2017.
 */

public class NuevoTestamento extends Fragment {

    private ListView listNuevoTestamento;
    private ArrayAdapter<LibroListViewDTO> listNuevoTestamentoAdapter;
    private String[] leadsNames = {
            "Mateo",
            "Marcos",
            "Lucas"
    };

    //Constructor default
    public NuevoTestamento() {
    }

    /**
     * @return
     */
    public static NuevoTestamento newInstance() {
        NuevoTestamento nuevoTestamento = new NuevoTestamento();
        return nuevoTestamento;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //if(getArguments() != null)

    }

    /**
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View nuevoTestamento = inflater.inflate(R.layout.nuevo_testamento, container, false);
        listNuevoTestamento = nuevoTestamento.findViewById(R.id.listNuevoTestamento);

        //listNuevoTestamentoAdapter = new ArrayAdapter(
        //        getActivity(),
        //        android.R.layout.simple_list_item_1,
        //        leadsNames
        //);

        listNuevoTestamentoAdapter = new LibrosAdapter(getActivity(),
                LeadsRepository.getInstance().getLeads());
        listNuevoTestamento.setAdapter(listNuevoTestamentoAdapter);
        return nuevoTestamento;
    }
}