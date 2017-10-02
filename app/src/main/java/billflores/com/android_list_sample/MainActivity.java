package billflores.com.android_list_sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import billflores.com.android_list_sample.adapter.PersonRecyclerView;
import billflores.com.android_list_sample.entity.Person;

/**
 * Created by Bill on 20/09/2017.
 */

public class MainActivity extends AppCompatActivity {
    private PersonRecyclerView personRecyclerView;
    private RecyclerView recyclerViewPerson;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewPerson= (RecyclerView) findViewById(R.id.recyclerViewPerson);

        recyclerViewPerson.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerViewPerson.setLayoutManager(linearLayoutManager);


        ArrayList<Person> personArrayList= new ArrayList<>();
        personArrayList.add(new Person("Bill Flores",586184));
        personArrayList.add(new Person("Fulanito",586184));
        personArrayList.add(new Person("Vengano",586184));
        personRecyclerView = new PersonRecyclerView(personArrayList);
        recyclerViewPerson.setAdapter(personRecyclerView);

    }
}
