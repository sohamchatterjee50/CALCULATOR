package com.example.sohamchatterjee.CALCULATOR;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
public static String exp="";
    public static int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calculate0(View view)
    {


        exp = exp + "0";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }


public void calculate1(View view)
{


        exp = exp + "1";
    TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate2(View view) {


            exp = exp + "2";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate3(View view) {


            exp = exp + "3";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate4(View view) {


            exp = exp + "4";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate5(View view) {


            exp = exp + "5";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate6(View view) {


            exp = exp + "6";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate7(View view) {


            exp = exp + "7";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate8(View view) {


            exp = exp + "8";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculate9(View view) {


            exp = exp + "9";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculatea(View view) {


            exp = exp + "+";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculates(View view) {


            exp = exp + "-";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculatem(View view) {

            exp = exp + "*";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculated(View view) {


            exp = exp + "/";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }
    public void calculater(View view) {


        exp = exp + "%";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }


    public void calculatedelall(View view) {


        exp = "";
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }

    public void calculatedel(View view) {


        String s="";
        for(int i=0;i<exp.length()-1;i++)
            s=s+exp.charAt(i);
exp=s;
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);
    }








    public void calculateres(View view) {

        result=(int)calculate(exp);
        exp = ""+result;
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(exp);

    }

public double calculate(String exp)
{

            String s=exp;
            StringTokenizer str=new StringTokenizer(s,"+*-/%");
            int cnt=str.countTokens();
            double[] n=new double[cnt];
            int len=0,len1=0;
            while(str.hasMoreTokens())
            {
                n[len++]=Float.parseFloat(str.nextToken());
            }
            char ch[]=new char[cnt-1];
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)>='0' && s.charAt(i)<='9')
                    continue;
                else
                    ch[len1++]=s.charAt(i);

            for(int i=0;i<cnt-1;i++)
            {
                if(ch[i]=='*' || ch[i]=='/' || ch[i]=='%')
                {
                    if(ch[i]=='*')
                    {
                        n[i+1]=n[i]*n[i+1];
                        n[i]=-1;
                    }

                    else if(ch[i]=='/')
                    {
                        n[i+1]=n[i]/n[i+1];
                        n[i]=-1;
                    }
                    else if(ch[i]=='%')
                    {
                        n[i+1]=((int)n[i])%((int)n[i+1]);
                        n[i]=-1;
                    }

                }


            }
            double n1[]=new double[cnt];
            int len2=0,len3=0;
            for(int i=0;i<cnt;i++)
            {
                if(n[i]==-1)
                    continue;
                else
                    n1[len2++]=n[i];
            }

            char ch1[]=new char[cnt-1];
            for(int i=0;i<cnt-1;i++)
            {
                if(ch[i]=='+' || ch[i]=='-')
                    ch1[len3++]=ch[i];
            }
            double ans=n1[0];
            for(int i=0;i<len2-1;i++)
            {
                if(ch[i]=='+')
                    ans=ans+n1[i+1];
                else if(ch[i]=='-')
                    ans=ans-n1[i+1];
            }

    return ans;
}


}
