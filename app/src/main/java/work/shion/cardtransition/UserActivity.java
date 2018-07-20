package work.shion.cardtransition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class UserActivity extends AppCompatActivity {

    private EditText editName;
    private EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        editName = (EditText) findViewById(R.id.user_name_editText);
        editName.setText(getString(R.string.user_name));

        editPhone = (EditText) findViewById(R.id.user_phone_editText);
        editPhone.setText(getString(R.string.user_phone));
    }
}
