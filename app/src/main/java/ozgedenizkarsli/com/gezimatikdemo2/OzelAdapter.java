package ozgedenizkarsli.com.gezimatikdemo2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by DELL on 12.5.2018.
 */

public class OzelAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<GeziPojo> Gezipojonesne;

    public OzelAdapter(Activity activity, List<GeziPojo> gezipojo) {
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Gezipojonesne = gezipojo;

    }

    @Override
    public int getCount() {
        return Gezipojonesne.size();

    }

    @Override
    public GeziPojo getItem(int position) {
        return Gezipojonesne.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        GeziPojo geziPojo = Gezipojonesne.get(position);
        View satirView;
        satirView = mInflater.inflate(R.layout.geziitem, null);
        TextView textView = satirView.findViewById(R.id.bilgi);
        textView.setText("Şehir:"+geziPojo.getSehir()+" \n"+"Sakın Yapmadan Dönme:"+geziPojo.getYapmadanDonme()+"\n "+"Ne Yemelisin?:"+geziPojo.getYemek()+" \n"+"Şehrin Üç Kelime İle Özeti"+geziPojo.getUckelime());
        //textView.setText(geziPojo.getYapmadanDonme());
       // textView.setText(geziPojo.getYemek());
        //textView.setText(geziPojo.getUckelime());

        //ImageView imageView=(ImageView) satirView.findViewById(R.id.foto);
    return satirView;
    }


}
