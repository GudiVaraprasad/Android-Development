package com.example.countrydetails;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<Country> {

    List<Country> countryList;

    Context context;

    int resource;

    public MyListAdapter(Context context, int resource, List<Country> countryList) {
        super(context, resource, countryList);
        this.context = context;
        this.resource = resource;
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewTeam = view.findViewById(R.id.textViewTeam);
        Button buttonDelete = view.findViewById(R.id.buttonDelete);

        Country country = countryList.get(position);

        imageView.setImageDrawable(context.getResources().getDrawable(country.getImage()));
        textViewName.setText(country.getName());
        textViewTeam.setText(country.getText());

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cdetails(position);
            }
        });

        return view;
    }

    private void Cdetails(final int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Want to see details ?");

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(context.getApplicationContext(),"Country Name : "country.getName().toString()+"\n"+"Country Description : "country.getText().toString(),Toast.LENGTH_SHORT).show();

                notifyDataSetChanged();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}