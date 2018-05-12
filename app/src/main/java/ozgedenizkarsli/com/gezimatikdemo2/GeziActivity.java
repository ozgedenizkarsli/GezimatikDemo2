package ozgedenizkarsli.com.gezimatikdemo2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class GeziActivity extends AppCompatActivity {







    DatabaseReference dref;
    ListView listview;
    ArrayList<GeziPojo>list=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gezi);
        listview=findViewById(R.id.listele);


//        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
//        listview.setAdapter(adapter);

        dref= FirebaseDatabase.getInstance().getReference("Geziler");

       dref.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(DataSnapshot dataSnapshot) {
               for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                   GeziPojo userObj = postSnapshot.getValue(GeziPojo.class);
                   list.add(userObj);
               }
               OzelAdapter adaptorumuz=new OzelAdapter(GeziActivity.this, list);
               listview.setAdapter(adaptorumuz);
               // list.add(dataSnapshot.getValue(GeziPojo.class));
//                adapter.notifyDataSetChanged();
           }

           @Override
           public void onCancelled(DatabaseError databaseError) {

           }
       });
    }
    public void btnclick(View view){
        Intent intent=new Intent(this,EkleActivity.class);
        startActivity(intent);
    }
}
