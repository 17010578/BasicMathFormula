package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17010578 on 18/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Math> mathList;


    public CustomAdapter(@NonNull Context context, int resource,
                         @NonNull ArrayList<Math> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.mathList = objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull()ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id ,parent,false);
        TextView tvArea = rowView.findViewById(R.id.textViewArea);
        TextView tvForm = rowView.findViewById(R.id.textViewForm);
        TextView tvLast = rowView.findViewById(R.id.textViewA);
        Math currentItem = mathList.get(position);
        tvArea.setText(currentItem.getArea());
        tvForm.setText(currentItem.getForm());
        tvLast.setText(currentItem.getLast());
        return rowView;
    }
}


