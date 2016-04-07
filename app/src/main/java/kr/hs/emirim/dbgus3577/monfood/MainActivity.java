package kr.hs.emirim.dbgus3577.monfood;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_foods);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();
//        if (name == null) {
//            Toast.makeText(this, name + "이름을 입력해주세요~", Toast.LENGTH_LONG).show();
//            //눌렀을때 잠깐뜬다
//        } else {
//            Toast.makeText(this, name + " F.O.O.D.!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }

        try {
            Toast.makeText(this, name + " F.O.O.D.!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("age", 18);
            startActivity(intent);
        } catch(NullPointerException e) {
            Toast.makeText(this, name + "이름을 입력해주세요~", Toast.LENGTH_LONG).show();
        } catch (Exception e){
            //나머지 이외
            Toast.makeText(this, "뭔지 모르겠지만 잘 안되네요!", Toast.LENGTH_LONG).show();
        }


    }
}