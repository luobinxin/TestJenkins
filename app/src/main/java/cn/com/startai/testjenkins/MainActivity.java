package cn.com.startai.testjenkins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cn.com.startai.common.CommonSDKInterface;
import cn.com.startai.common.utils.CAppUtils;
import cn.com.startai.common.utils.TAndL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CommonSDKInterface.getInstance().init(getApplication());
        TAndL.TL("verName = "+ CAppUtils.getAppVersionName());
        TAndL.TL("verCode = "+ CAppUtils.getAppVersionCode());
    }
}
