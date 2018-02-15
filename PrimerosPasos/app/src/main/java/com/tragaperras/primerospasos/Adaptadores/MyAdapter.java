package com.tragaperras.primerospasos.Adaptadores;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tragaperras.primerospasos.R;

import java.util.List;

/**
 * Created by JuanPe on 14/02/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<UserModel> alumnosList;

    public MyAdapter(List<UserModel> userModelList)
    {
        this.alumnosList = userModelList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_lista_principal, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        String name = alumnosList.get(position).getName();
        holder.nameTextView.setText(name);

        String surname = alumnosList.get(position).getSurname();
        holder.surnameTextView.setText(surname);
    }

    @Override
    public int getItemCount() {
        return alumnosList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameTextView;
        private TextView surnameTextView;


    public ViewHolder(View v) {
        super(v);
        nameTextView = (TextView) v.findViewById(R.id.textUserName);
        surnameTextView = (TextView) v.findViewById(R.id.textUserSurname);

    }
    }
}
