package com.example.userregister;

/* Mikko Talonpoika 03/23 Olio-ohjelmointi viikko 9*/

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    TextView firstLast, degreeProgramme, email;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        firstLast = itemView.findViewById(R.id.tvFirstLast);
        degreeProgramme = itemView.findViewById(R.id.tvDegreeProgramme);
        email = itemView.findViewById(R.id.tvEmail);
    }
}
