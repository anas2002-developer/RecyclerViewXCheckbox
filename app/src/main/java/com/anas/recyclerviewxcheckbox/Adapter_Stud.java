package com.anas.recyclerviewxcheckbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Stud extends RecyclerView.Adapter<Adapter_Stud.Stud_ViewHolder> {

    Context context;
    ArrayList<Model_Stud> arrStud = new ArrayList<>();

    public Adapter_Stud(Context context, ArrayList<Model_Stud> arrStud) {
        this.context = context;
        this.arrStud = arrStud;
    }

    @NonNull
    @Override
    public Stud_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_row,parent,false);
        return new Stud_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Stud_ViewHolder holder, int position) {
        holder.txtStud_name.setText(arrStud.get(position).getStud_name());
        holder.txtStud_uid.setText(arrStud.get(position).getStud_uid());
        holder.imgStud_img.setImageResource(arrStud.get(position).getStud_img());

//        holder.checkBox.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, "fck u", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Stud_ViewHolder extends RecyclerView.ViewHolder {


        ImageView imgStud_img;
        TextView txtStud_name,txtStud_uid;
        CheckBox checkBox;
        public Stud_ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgStud_img = itemView.findViewById(R.id.imgStud_img);
            txtStud_name = itemView.findViewById(R.id.txtStud_name);
            txtStud_uid = itemView.findViewById(R.id.txtStud_uid);
            checkBox = itemView.findViewById(R.id.checkBox);

        }
    }
}
