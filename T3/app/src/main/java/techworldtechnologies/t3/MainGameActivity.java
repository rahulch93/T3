package techworldtechnologies.t3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainGameActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine;
    EditText firstplayer,secondplayer;
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maingame);
        one=(Button) findViewById(R.id.one);

        two=(Button) findViewById(R.id.two);

        three=(Button) findViewById(R.id.three);

        four=(Button) findViewById(R.id.four);
        five=(Button) findViewById(R.id.five);

        six=(Button) findViewById(R.id.six);

        seven=(Button) findViewById(R.id.seven);

        eight=(Button) findViewById(R.id.eight);
        nine=(Button) findViewById(R.id.nine);
        if(a==0) {
            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    one.setBackgroundResource(R.drawable.tee);
                    a = 1;
                }
            });
        }
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=0;
            }
        });

    }
}
