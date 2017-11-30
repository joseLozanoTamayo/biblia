package org.biblia.org.bibllia.dto;

/**
 * Created by jose on 28/11/17.
 */

import org.biblia.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Repositorio ficticio de leads
 */
public class LeadsRepository {
    private static LeadsRepository repository = new LeadsRepository();
    private HashMap<String, LibroListViewDTO> leads = new HashMap<>();

    public static LeadsRepository getInstance() {
        return repository;
    }

    private LeadsRepository() {
        saveLead(new LibroListViewDTO("1", "Insures S.O.", 0));
        saveLead(new LibroListViewDTO("2", "Hospital Blue", 1));
        saveLead(new LibroListViewDTO("3", "Electrical Parts ltd", 2));
        saveLead(new LibroListViewDTO("4", "Creativa App", 3));
        saveLead(new LibroListViewDTO("5", "Neumáticos Press", 4));
        saveLead(new LibroListViewDTO("6", "Banco Nacional", 5));
        saveLead(new LibroListViewDTO("7", "Cooperativa Verde", 6));
        saveLead(new LibroListViewDTO("8", "Frutisofy", 7));
        saveLead(new LibroListViewDTO("9", "Seguros Boliver", 8));
        saveLead(new LibroListViewDTO("10", "Concesionario Motolox", 9));
    }

    private void saveLead(LibroListViewDTO lead) {
        leads.put(lead.getId(), lead);
    }

    public List<LibroListViewDTO> getLeads() {
        return new ArrayList<>(leads.values());
    }
}