package yuansyun.a2016_hackathon_20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
=======
import android.widget.ImageButton;
>>>>>>> 3916f2be97e534f1e0a58d7b2701597b346e30a5


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        Button nextPageBtn = (Button)findViewById(R.id.ITDBtn);
=======
        //ImageButton抓取記憶體位置
        ImageButton nextPageBtn = (ImageButton)findViewById(R.id.startBtn);
        //點擊Start Btn切換第二頁
>>>>>>> 3916f2be97e534f1e0a58d7b2701597b346e30a5
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
<<<<<<< HEAD
                intent.setClass(MainActivity.this , Introduction.class);
=======
                intent.setClass(MainActivity.this , Page2.class);
>>>>>>> 3916f2be97e534f1e0a58d7b2701597b346e30a5
                startActivity(intent);
            }
        });
    }
}
