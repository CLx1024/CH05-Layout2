package tw.tcnr13.m0500f;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {

    private Button b001;
    private TextView t003;
    private EditText e001;
    private DecimalFormat poundsFormat;
    private String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // void 不用回傳
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();    // 自定義方法
    }

    // 定義配置碼
    private void setupViewcomponent() {
        e001=(EditText)findViewById(R.id.m0500_e001);    // 輸入公斤→美元
        b001 = (Button) findViewById(R.id.m0500_b001);    // 執行換算按鈕
        t003 = (TextView) findViewById(R.id.m0500_t003);    // 公斤轉磅答案→美元轉台幣答案
        b001.setOnClickListener(b001On);
    }



        private View.OnClickListener b001On = new View.OnClickListener() {
        @Override
        public void onClick(View v) {    // 被按下按鈕要做的事
            poundsFormat = new DecimalFormat("0.00000");    // 格式化的宣告
            if (e001.getText().toString().length() > 0) {
                ans = poundsFormat.format(Float.parseFloat(e001.getText().toString()) * 29.9999);    // 0500f_美元轉台幣匯率
            } else {
                ans = "";
            }
            t003.setText(ans);
        }
    };
}