package billflores.com.android_list_sample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import billflores.com.android_list_sample.R;
import billflores.com.android_list_sample.entity.Person;

/**
 * Created by Bill on 20/09/2017.
 */

public class PersonRecyclerView extends RecyclerView.Adapter<PersonRecyclerView.MyViewHolder>{
    private ArrayList<Person> personArrayList;

    public PersonRecyclerView(ArrayList personArrayList) {
        this.personArrayList = personArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.persons_rows, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.onBind(personArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return personArrayList.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName,textViewDni;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewName=(TextView) itemView.findViewById(R.id.textViewName);
            textViewDni=(TextView) itemView.findViewById(R.id.textViewDni);
        }
        public void onBind(Person person){
            textViewName.setText(person.getName());
            textViewDni.setText(person.getDni());
        }

    }

}
