package com.mohamedfoad.testdatabase.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mohamedfoad.testdatabase.R;
import com.mohamedfoad.testdatabase.model.contact;

import java.util.List;

/**
 * Created by PC-SMART on 1/2/2018.
 */

public class ContactListAdapter extends BaseAdapter {


private Context mcontext;
    private List<contact> contactList;




    @Override
    public int getCount() {
        return contactList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return contactList.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

       view = View.inflate(mcontext, R.layout.list_item,null);

        TextView nameTextView = view.findViewById(R.id.contactName);
        TextView phoneTextView = view.findViewById(R.id.contactPhone);
        TextView groupTextView = view.findViewById(R.id.contactGroup);

        nameTextView.setText(contactList.get(position).getName());
       phoneTextView.setText(String.valueOf(contactList.get(position).getPhoneNumber()));
        groupTextView.setText(contactList.get(position).getGroup());


        return view;
    }
}
