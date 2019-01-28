package com.example.calsys.tzcard;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calsys.recyc.Inventory;
import com.example.calsys.recyc.R;

import java.util.List;

public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.RecyclerViewHolder> {
    private List<Inventory> RVsList;

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        public TextView tutor_name, tutor_age;
        public ImageView dp;
        public LinearLayout card_v;

        public RecyclerViewHolder(View view) {
            super(view);
            tutor_name = view.findViewById(R.id.name);
            tutor_age = view.findViewById(R.id.age);
            card_v = view.findViewById(R.id.card_v);
        }
    }

    public ArrayAdapter(List<Inventory> RVsList) {
        this.RVsList = RVsList;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        Inventory e = RVsList.get(position);
        holder.tutor_name.setText(e.getTutor_name());
        holder.tutor_age.setText(e.getTutor_age());

        holder.card_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = String.valueOf(RVsList.get(position));
                Toast.makeText(view.getContext(), "Item is clicked " + id, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return RVsList.size();
    }
}
