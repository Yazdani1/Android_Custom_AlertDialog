package androidsqlite.com.customalertdialogpost;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstpost(View view){

        AlertDialog.Builder mydialog=new AlertDialog.Builder(MainActivity.this);

        LayoutInflater inflater=LayoutInflater.from(MainActivity.this);

        View info=inflater.inflate(R.layout.custom,null);

        mydialog.setView(info);

        final AlertDialog builder=mydialog.create();

        builder.setCancelable(false);

        Button btn=(Button)info.findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplication(),"You clicked ok button",Toast.LENGTH_SHORT).show();
                builder.dismiss();
            }
        });

        builder.show();

    }

}
