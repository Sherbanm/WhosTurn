package sherban.whosturn;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private LinearLayout button;

    private TextView playerName;

    private TextView turnTimer;

    private TextView reserveTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = (LinearLayout) findViewById(R.id.button7);
        playerName = (TextView) findViewById(R.id.playerName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "00:00:00";
                playerName.setText(message);
            }
        });
    }
}
