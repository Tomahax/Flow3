package com.example.tomer.flow3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class GameActivity extends Activity implements View.OnClickListener {

    private ImageButton buttons[][] = new ImageButton[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState){
        for(int i = 0; i < 5; i++)
        {
            for(int k = 0; k < 5; k++)
            {
                String str = "ib"+i+k;
                str = str.toString();
                //int resId=getResources().getIdentifier(str, "id", getPackageName());
                int resId=GameActivity.this.getResources().getIdentifier(str,"id", GameActivity.this.getPackageName());

                buttons[i][k] = (ImageButton) findViewById(resId);

                Toast.makeText(this,resId,Toast.LENGTH_SHORT).show();
                if(buttons[i][k]!=null)
                {
                    buttons[i][k].setOnClickListener(this);
                }
                //buttons[i][k].setClickable(true);
            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.game, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onClick(View v)
    {
        Toast.makeText(this,"clicked",Toast.LENGTH_SHORT).show();

    }
}


