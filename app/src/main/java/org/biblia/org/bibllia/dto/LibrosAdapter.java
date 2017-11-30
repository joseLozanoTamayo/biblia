package org.biblia.org.bibllia.dto;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.biblia.R;

import java.util.List;

/**
 * Created by jose on 28/11/17.
 */

public class LibrosAdapter extends ArrayAdapter<LibroListViewDTO> {

    public LibrosAdapter(Context context, List<LibroListViewDTO> objects) {
        super(context, 0, objects);

    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            convertView = layoutInflater.inflate(
                    R.layout.list_item_libro,
                    parent,
                    false
            );
        }

        ImageView avatar = convertView.findViewById(R.id.iv_avatar);
        TextView name = convertView.findViewById(R.id.tv_name);

        LibroListViewDTO libroListViewDTO = getItem(position);

        // Setup.
        Glide.with(getContext()).load(libroListViewDTO.getImagen()).into(avatar);
        name.setText(libroListViewDTO.getNombreLibro());

        return convertView;
    }
}
