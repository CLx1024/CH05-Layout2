package tw.tcnrxx.m0500;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {

    // 1102 8:38 錄音      private EditText e001;
    private Button b001;
    private TextView t003;
    private EditText e001;
    private DecimalFormat poundsFormat;      //  1102 8:38 錄音
    private String ans;        //  1102 8:38 錄音
    private BottomNavigationView bottomBar;  // 1214 俊榕
    private EditText e001_f;
    private Button b001_f;
    private TextView t003_f;
    private LinearLayout l01;
    private LinearLayout l02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // void 不用回傳
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();    // 自定義方法
    }

    // 定義配置碼
    private void setupViewcomponent() {
        l01=(LinearLayout)(findViewById(R.id.m0500d_layout));
        l02=(LinearLayout)(findViewById(R.id.m0500f_layout));

        //  1102 8:38 錄音       e001 = (EditText) findViewById(R.id.m0500_e001);    // 輸入公斤
        e001=(EditText)findViewById(R.id.m0500_e001);   // 1102 8:38 錄音
        // e001.get          // 1102 8:38 錄音

        b001 = (Button) findViewById(R.id.m0500_b001);    // 執行換算按鈕
        t003 = (TextView) findViewById(R.id.m0500_t003);    // 公斤轉磅答案

        e001_f=(EditText)findViewById(R.id.m0500f_e001);    // 輸入公斤→美元
        b001_f = (Button) findViewById(R.id.m0500f_b001);    // 執行換算按鈕
        t003_f = (TextView) findViewById(R.id.m0500f_t003);    // 公斤轉磅答案→美元轉台幣答案
        b001_f.setOnClickListener(B001On);

        bottomBar = findViewById(R.id.bottom_menu);  // 1214 俊榕
        //bottomBar.setOnItemSelectedListener(bottomOn);  // 1214 俊榕

        b001.setOnClickListener(B001On);
    }

    // private String ans;           // 1102 8:38 錄音
        private View.OnClickListener B001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {    // 被按下按鈕要做的事
            switch(sele){


            }
//            // 1102 8:38 錄音        DecimalFormat poundsFormat = new DecimalFormat("0.00000");    // 格式化的宣告
//            poundsFormat = new DecimalFormat("0.00000");       // 1102 8:38 錄音
//            if (e001.getText().toString().length() > 0) {
//                ans = poundsFormat.format(Float.parseFloat(e001.getText().toString()) * 2.20462262);
//            } else {
//                ans = "";
//            }
//            t003.setText(ans);


        }

    };

    //public boolean onNavigationItemSelected
    private NavigationBarView.OnItemSelectedListener bottomOn = new NavigationBarView.OnItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.item01:
                    lay_show(1);
                    break;
                case R.id.item02:
                    lay_show(2);
                    break;
            }
            return true;
        }
    };

    private void lay_show(int i){
        l01.setVisibility(View.INVISIBLE);
        l02.setVisibility(View.INVISIBLE);
        switch(i){
            case 1:
                sele=i;
                l01.setVisibility(View.VISIBLE);
               break;
            case 2:
                l02.setVisibility(View.VISIBLE);
            break;
        }
    }


}