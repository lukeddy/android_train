package android.tangzq.com.relativelayoutdemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView(){
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Button currbtn=(Button)v;
        Toast.makeText(this,currbtn.getText(),Toast.LENGTH_SHORT).show();
    }
}
