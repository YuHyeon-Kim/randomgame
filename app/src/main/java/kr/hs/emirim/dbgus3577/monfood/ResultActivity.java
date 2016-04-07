package kr.hs.emirim.dbgus3577.monfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator28 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    static String TAG = "먼푸드:ResultActivity";

    TextView mResult;
    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작~~");

        mResult = (TextView) findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView);

        Log.d(TAG, "텍스트뷰 연결 성공~~");

        //랜덤함수
        Random r = new Random();
        int result = r.nextInt(3);
        Log.d(TAG, "랜덤값 생성~~ : "+result);
        // res, R
//        if (result == 0) {
//            mImageView.setImageResource(R.drawable.f01);
//        }
//        else if(result == 1){
//            mImageView.setImageResource(R.drawable.f02);
//        }
//        else if(result == 2){
//            mImageView.setImageResource(R.drawable.f03);
//        }
//
//        switch (result){
//            case 0 :
//                mImageView.setImageResource(R.drawable.f01); break;
//            case 1 :
//                mImageView.setImageResource(R.drawable.f02); break;
//            case 2 :
//                mImageView.setImageResource(R.drawable.f03); break;
//        }

        mImageView.setImageResource(R.drawable.f01 + result);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG, "인텐스값 읽기<name> : " + name);

        int age = intent.getIntExtra("age", -1);
        Log.d(TAG, "인텐스값 읽기<age> : " + age);

        mResult.setText(name + "님, 안녕하세요!");
    }
}