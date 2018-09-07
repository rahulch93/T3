package techworldtechnologies.t3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainGameActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine;
    EditText firstplayer,secondplayer;
    TextView tv;
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0;
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
        tv=(TextView) findViewById(R.id.tv);
        firstplayer=(EditText) findViewById(R.id.firstplayer);
        secondplayer=(EditText) findViewById(R.id.secondplayer);

            one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(j==0) {
                        one.setBackgroundResource(R.drawable.teeboard);
                        a = 1;
                        j=1;
                        k++;

                        one.setEnabled(false);
                    }
                    else
                    {
                        one.setBackgroundResource(R.drawable.threeboard);
                        a=2;
                        j=0;
                        k++;

                        one.setEnabled(false);
                    }
                    if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                    {
                        tv.setText("Player 1 is winner");
                        one.setEnabled(false);
                        two.setEnabled(false);
                        three.setEnabled(false);
                        four.setEnabled(false);
                        five.setEnabled(false);
                        six.setEnabled(false);
                        seven.setEnabled(false);
                        eight.setEnabled(false);
                        nine.setEnabled(false);
                    }
                    else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                    {
                        tv.setText("Player 2 is winner");
                        one.setEnabled(false);
                        two.setEnabled(false);
                        three.setEnabled(false);
                        four.setEnabled(false);
                        five.setEnabled(false);
                        six.setEnabled(false);
                        seven.setEnabled(false);
                        eight.setEnabled(false);
                        nine.setEnabled(false);
                    }
                    else if(k==9)
                    {
                        tv.setText("Draw");
                        one.setEnabled(false);
                        two.setEnabled(false);
                        three.setEnabled(false);
                        four.setEnabled(false);
                        five.setEnabled(false);
                        six.setEnabled(false);
                        seven.setEnabled(false);
                        eight.setEnabled(false);
                        nine.setEnabled(false);
                    }


                }
            });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    two.setBackgroundResource(R.drawable.teeboard);
                    b = 1;
                    j=1;
                    k++;
                    two.setEnabled(false);
                }
                else
                {
                    two.setBackgroundResource(R.drawable.threeboard);
                    b = 2;
                    j=0;
                    k++;
                    two.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");

                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    three.setBackgroundResource(R.drawable.teeboard);
                    c = 1;
                    j=1;
                    k++;
                    three.setEnabled(false);
                }
                else
                {
                    three.setBackgroundResource(R.drawable.threeboard);
                    c= 2;
                    j=0;
                    k++;
                    three.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    four.setBackgroundResource(R.drawable.teeboard);
                    d = 1;
                    j=1;
                    k++;
                    four.setEnabled(false);

                }
                else
                {
                    four.setBackgroundResource(R.drawable.threeboard);
                    d= 2;
                    j=0;
                    four.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    five.setBackgroundResource(R.drawable.teeboard);
                    e = 1;
                    j=1;
                    k++;
                    five.setEnabled(false);
                }
                else
                {
                    five.setBackgroundResource(R.drawable.threeboard);
                    e= 2;
                    j=0;
                    k++;
                    five.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    six.setBackgroundResource(R.drawable.teeboard);
                    f = 1;
                    j=1;
                    k++;
                    six.setEnabled(false);
                }
                else
                {
                    six.setBackgroundResource(R.drawable.threeboard);
                    f= 2;
                    j=0;
                    k++;
                    six.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    seven.setBackgroundResource(R.drawable.teeboard);
                    g = 1;
                    j=1;
                    k++;
                    seven.setEnabled(false);
                }
                else
                {
                    seven.setBackgroundResource(R.drawable.threeboard);
                    g= 2;
                    j=0;
                    k++;
                    seven.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }


            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    eight.setBackgroundResource(R.drawable.teeboard);
                    h = 1;
                    j=1;
                    k++;
                    eight.setEnabled(false);
                }
                else
                {
                    eight.setBackgroundResource(R.drawable.threeboard);
                    h= 2;
                    j=0;
                    k++;
                    eight.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(j==0) {
                    nine.setBackgroundResource(R.drawable.teeboard);
                    i = 1;
                    j=1;
                    k++;
                    nine.setEnabled(false);
                }
                else
                {
                    nine.setBackgroundResource(R.drawable.threeboard);
                    i= 2;
                    j=0;
                    k++;
                    nine.setEnabled(false);
                }
                if((a==1 && b==1 && c==1)||(a==1 && d==1 && g==1)||(a==1 && e==1 && i==1)||(c==1 && e==1 && g==1)||(d==1 && e==1 && f==1)||(g==1 && h==1 && i==1)||(b==1 && e==1 && h==1)||(c==1 && f==1 && i==1))
                {
                    tv.setText("Player 1 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if ((a==2 && b==2 && c==2)||(a==2 && d==2 && g==2)||(a==2 && e==2 && i==2)||(c==2 && e==2 && g==2)||(d==2 && e==2 && f==2)||(g==2 && h==2 && i==2)||(b==2 && e==2 && h==2)||(c==2 && f==2 && i==2))
                {
                    tv.setText("Player 2 is winner");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }
                else if(k==9)
                {
                    tv.setText("Draw");
                    one.setEnabled(false);
                    two.setEnabled(false);
                    three.setEnabled(false);
                    four.setEnabled(false);
                    five.setEnabled(false);
                    six.setEnabled(false);
                    seven.setEnabled(false);
                    eight.setEnabled(false);
                    nine.setEnabled(false);
                }

            }
        });

    }
}
