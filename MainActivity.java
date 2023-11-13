package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //defined layouts here and not in xml file because they may dynamically change due to user's inputs
        LinearLayout firstLinearLayout=new LinearLayout(this);
        Button addButton =new Button(this);
        LinearLayout secondLinearLayout=new LinearLayout(this);
        //to display list of customers
        ScrollView scrollView=new ScrollView(this);
        //setting the orientation of the 2 layouts to vertical
        firstLinearLayout.setOrientation(LinearLayout.VERTICAL);
        secondLinearLayout.setOrientation(LinearLayout.VERTICAL);
        addButton.setText("Add Customer");
        addButton.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT));
        firstLinearLayout.addView(addButton);  //adding button to first layout
        scrollView.addView(secondLinearLayout);//adding second linear layout to scroll view
        firstLinearLayout.addView(scrollView);//add scrollview to the first linear layout
        setContentView(firstLinearLayout);//set the furst linear layout as the main one
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AddCustomerActivity.class);
                MainActivity.this.startActivity(intent);
                finish();
            }
        });
        for(Customer objCustomer : Customer.customersArrayList) {
            TextView txtCustomerInfo = new TextView(this) ;
            txtCustomerInfo.setTextAppearance(androidx.appcompat.R.style.TextAppearance_AppCompat_Display2);
            txtCustomerInfo.setText(objCustomer.toString());
            secondLinearLayout.addView(txtCustomerInfo);
        }
    }

}