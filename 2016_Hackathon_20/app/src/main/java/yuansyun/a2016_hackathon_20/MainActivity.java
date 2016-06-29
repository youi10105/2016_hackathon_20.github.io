package yuansyun.a2016_hackathon_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageButton抓取記憶體位置
        ImageButton nextPageBtn = (ImageButton)findViewById(R.id.startBtn);
        //點擊Start Btn切換第二頁
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , Page2.class);
                startActivity(intent);
            }
        });
    }
}
