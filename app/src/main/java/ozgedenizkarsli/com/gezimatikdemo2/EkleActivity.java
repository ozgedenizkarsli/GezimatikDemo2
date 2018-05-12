package ozgedenizkarsli.com.gezimatikdemo2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class EkleActivity extends AppCompatActivity {


    FirebaseDatabase database;
    DatabaseReference myRef;

    public void btn_gonder_child(View view){
        EditText edtad=findViewById(R.id.edtAd);
        EditText edtasla=findViewById(R.id.edtAsla);
        EditText edtyemek=findViewById(R.id.edtYemek);
        EditText edtkelime=findViewById(R.id.edtKelime);

        GeziPojo geziPojo=new GeziPojo();

        geziPojo.setSehir(edtad.getText().toString());
        geziPojo.setUckelime(edtkelime.getText().toString());
        geziPojo.setYapmadanDonme(edtasla.getText().toString());
        geziPojo.setYemek(edtyemek.getText().toString());
        String isim=edtad.getText().toString();
        myRef=database.getReference("Geziler");
        myRef.child(myRef.push().getKey()).setValue(geziPojo);

        /*myRef.child("GeziAdi:").setValue(edtad.getText().toString());
        myRef.child("YapmadanDonme:").setValue(edtasla.getText().toString());
        myRef.child("Yemek:").setValue(edtyemek.getText().toString());
        myRef.child("Uckelime:").setValue(edtkelime.getText().toString());*/

        Intent intent= new Intent(this,GeziActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekle);
        database=FirebaseDatabase.getInstance();
    }
}
