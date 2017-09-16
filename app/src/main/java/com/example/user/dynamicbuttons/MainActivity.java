package com.example.user.dynamicbuttons;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout rl=(RelativeLayout)findViewById(R.id.rl);

        HorizontalScrollView sv=new HorizontalScrollView(this);
        sv.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT));
        LinearLayout ll= new LinearLayout(this);
        ll.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        ll.setOrientation(LinearLayout.HORIZONTAL);
        sv.addView(ll);

        for(int i = 0; i < 8; i++)
        {
            Button b = new Button(this);
            b.setBackground(this.getResources().getDrawable(R.drawable.layout_border));
            LinearLayout.LayoutParams rel_button1 = new LinearLayout.LayoutParams(190, 90);
            rel_button1.setMargins(5, 10, 0, 0);
            b.setLayoutParams(rel_button1);
            b.setText("Button "+i);
            ll.addView(b);
        }

        rl.addView(sv);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
