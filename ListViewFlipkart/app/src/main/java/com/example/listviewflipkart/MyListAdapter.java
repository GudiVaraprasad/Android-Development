package com.example.listviewflipkart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;
public class MyListAdapter extends ArrayAdapter<Flipkart> {
    private final List<Flipkart> flipkartList;
    Context context;
    int resource;
    public MyListAdapter(Context context, int resource, List<Flipkart> flipkartList) {
        super(context, resource, flipkartList);
        this.context = context;
        this.resource = resource;
        this.flipkartList = flipkartList;
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        TextView textViewName = view.findViewById(R.id.textViewName);
        Button buttonAction = view.findViewById(R.id.buttonAction);
        Flipkart fk = flipkartList.get(position);

        textViewName.setText(fk.getName());
        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myToast(position);
            }
        });
        return view;
    }

    private void myToast(int position) {
        Toast.makeText(context.getApplicationContext(), "This is a Toast Message", Toast.LENGTH_SHORT).show();
    }
}
