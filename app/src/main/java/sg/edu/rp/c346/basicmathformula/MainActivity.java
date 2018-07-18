package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMath;
    ArrayList<Math> alMathList;
    CustomAdapter caMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvMath = findViewById(R.id.listViewMath);

        alMathList = new ArrayList<>();

        Math item1 = new Math("Area of rectangle","Length x Length","Formula type is : Area");

        Math item2 = new Math("Area of triangle","(Length of base x length)/2","Formula type is : Area");

        Math item3 = new Math("Area of cube ", "Length x Length x Length","Formula type is : Volume");
        alMathList.add(item1);
        alMathList.add(item2);
        alMathList.add(item3);

        caMath= new CustomAdapter(this,R.layout.math,alMathList);

        lvMath.setAdapter(caMath);

    }

    /**
     * Created by 17010578 on 18/7/2018.
     */

}