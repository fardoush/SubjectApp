package com.example.recyclerviewjf;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.ViewHolder> {
    //context data
    private Context context;
    //model
    private List<Subject> subjectList;

    public SubjectAdapter(Context context, List<Subject> subjectList) {
        this.context = context;
        this.subjectList = subjectList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {// set 3rdstep
        //img,name set
        holder.imageView.setImageResource(subjectList.get(position).getImage());
        holder.textView.setText(subjectList.get(position).getName());
//second activity click &
       /* holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SecondActivity.class);
                //array list valu show
                String name = context.getString(R.string.c_programming);
                intent.putExtra("textView", name);
                context.startActivity(intent);
            }
        });*/

    }

    @Override
    public int getItemCount() {
        return subjectList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //find | hold 2nd step

        ImageView imageView;
        TextView textView;
        RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id._image);
            textView = itemView.findViewById(R.id._name);
            relativeLayout = itemView.findViewById(R.id.relativeId);

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (getLayoutPosition()==0 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.c_programming);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }

                    if (getLayoutPosition()==1 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.cpp_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==2 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==3 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==4 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==5 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==6 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==7 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                        if (getLayoutPosition()==8 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.c_programming);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }
                    if (getLayoutPosition()==9 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.php_Q);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    } if (getLayoutPosition()==10 ){

                        Intent intent = new Intent(context, SecondActivity.class);
                        //array list valu show
                        String name = context.getString(R.string.c_programming);
                        intent.putExtra("textView", name);
                        context.startActivity(intent);
                    }


                }
            });
        }
    }
}
