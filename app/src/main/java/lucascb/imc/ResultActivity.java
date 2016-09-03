package lucascb.imc;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layoutResult);
        TextView txtview = (TextView) findViewById(R.id.tvResult);

        double imc = Double.parseDouble(getIntent().getStringExtra("imc"));

        if (imc < 18.50) {
            layout.setBackgroundColor(Color.YELLOW);
            txtview.setText("Abaixo do peso");
        }
        else if (imc < 25.00) {
            layout.setBackgroundColor(Color.GREEN);
            txtview.setText("Saudável");
        }
        else if (imc < 30.0) {
            layout.setBackgroundColor(Color.YELLOW);
            txtview.setText("Acima do peso");
        }
        else {
            layout.setBackgroundColor(Color.RED);
            txtview.setText("Obesidade");
        }
    }
}
