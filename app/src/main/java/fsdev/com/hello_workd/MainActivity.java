package fsdev.com.hello_workd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);


        btn.setOnClickListener (new OnClickListener(){
           public void onClick(View view){
                TextView txt = (TextView) findViewById(R.id.hello);
                txt.setText("Hello, World!");
            }
        });
    } // OnCreate()
}