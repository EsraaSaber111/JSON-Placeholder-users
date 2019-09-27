package com.example.esraa.jsondesin;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//Extend the RecyclerView.Adapter class//
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CustomViewHolder> {

    private List<RetroUsers> dataList;

    public MyAdapter(List<RetroUsers> dataList) {

        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

//Get a reference to the Views in our layout//

        public final View myView;

        TextView textUser, id,
                username, email, street, suite, city, zipcode, lat, lng, phone, website, companyname, catchPhrase, bs;

        CustomViewHolder(View itemView) {
            super(itemView);
            myView = itemView;

            textUser = myView.findViewById(R.id.user);
            // id = myView.findViewById(R.id.id);
            username = myView.findViewById(R.id.username);
            email = myView.findViewById(R.id.email);
            street = myView.findViewById(R.id.streettxt);
            suite = myView.findViewById(R.id.suite);
            city = myView.findViewById(R.id.city);
            //    zipcode = myView.findViewById(R.id.zipcode);
            // lat = myView.findViewById(R.id.lat);
            //lng = myView.findViewById(R.id.lng);
            phone = myView.findViewById(R.id.phone);
            website = myView.findViewById(R.id.website);
            companyname = myView.findViewById(R.id.companyname);
            catchPhrase = myView.findViewById(R.id.catchPhrase);
            bs = myView.findViewById(R.id.bs);
        }
    }

    @Override

//Construct a RecyclerView.ViewHolder//

    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layut, parent, false);
        return new CustomViewHolder(view);
    }

    @Override

//Set the data//


    public void onBindViewHolder(CustomViewHolder holder, int position) {

        holder.textUser.setText(" " + position);
        // holder.id.setText(dataList.get(position).getId());
        holder.email.setText(dataList.get(position).getEmail());
        holder.username.setText(dataList.get(position).getUsername());
        holder.street.setText(dataList.get(position).getAddress().getStreet());
        holder.suite.setText(dataList.get(position).getAddress().getSuite());
        holder.city.setText(dataList.get(position).getAddress().getCity());
        //   holder.zipcode.setText("zipcode: "+dataList.get(position).getAddress().getZipcode());
        //  holder.lat.setText("Geo lat: "+dataList.get(position).getAddress().getGeo().getLat());
        //  holder.lng.setText("Geo lng: "+dataList.get(position).getAddress().getGeo().getLng());
        holder.phone.setText(dataList.get(position).getPhone());
        holder.website.setText(dataList.get(position).getWebsite());
        holder.companyname.setText(dataList.get(position).getCompany().getCompanyname());
        holder.catchPhrase.setText(dataList.get(position).getCompany().getCatchPhrase());
        holder.bs.setText(dataList.get(position).getCompany().getBs());
    }


//Calculate the item count for the RecylerView//

    @Override
    public int getItemCount() {
        return dataList.size();
    }

}