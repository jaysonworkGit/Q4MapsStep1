package kalpesh.mac.com.raandroid_header.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import kalpesh.mac.com.raandroid_header.R;
import kalpesh.mac.com.raandroid_header.model.Restaurant;


/**
 * Created by kalpesh on 04/09/2015.
 */
public class Adapter extends ArrayAdapter<Restaurant> {

    //String url="https://gist.githubusercontent.com/hart88/198f29ec5114a3ec3460/raw/8dd19a88f9b8d24c23d9960f3300d0c917a4f07c/";
    private Context context;
    private List<Restaurant> flowerList;
    private List<String> addresses;
    public Adapter(Context context, int resource, List<Restaurant> objects) {
        super(context, resource, objects);
        this.context = context;
        this.flowerList = objects;
        this.addresses =  new ArrayList<>();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.row, parent, false);
        Restaurant res = flowerList.get(position);
       TextView tv = (TextView) view.findViewById(R.id.title);
        tv.setText(res.getName());

        addAddresses(position, res.getAddress());

        ImageView img = (ImageView) view.findViewById(R.id.thumbnail);
        Picasso.with(getContext())
                .load(res.getLogo().get(0).getStandardResolutionURL())
                .resize(100, 100).into(img);

        return view;
    }

    private void addAddresses(int position,String object)
    {
        addresses.add(position,object);
    }

    public int getAddressesSize()
    {
        return addresses.size();
    }

    public List<String> getAddresses()
    {
        return addresses;
    }
}