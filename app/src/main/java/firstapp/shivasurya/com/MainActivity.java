package firstapp.shivasurya.com;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private String mPHONE = "tel:08044112233";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mContactNow = (Button) findViewById(R.id.contactnow);
        //null check to ensure that button has reference and not null
        if (mContactNow != null) {
            mContactNow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(mPHONE));
                    startActivity(intent);
                }
            });
        }
    }
}
