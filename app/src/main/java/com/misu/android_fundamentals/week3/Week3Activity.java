package com.misu.android_fundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.misu.android_fundamentals.R;
import com.misu.android_fundamentals.week3.models.Authentication;
import com.misu.android_fundamentals.week3.utils.EmailHelper;

public class Week3Activity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private CheckBox mCheckBoxAccept;
    private TextView mTextViewResult;
    private Authentication mAuthentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week3);

        mAuthentication = new Authentication();

        init();
    }

    private void init() {
        mEditTextEmail = findViewById(R.id.editText_email);
        mEditTextPhone = findViewById(R.id.editText_phone);
        mCheckBoxAccept = findViewById(R.id.checkBox_accept);
        mTextViewResult = findViewById(R.id.textView_result);
    }

    private boolean isEmailValid() {
        String email = mEditTextEmail.getText().toString();

        if (EmailHelper.isEmailValid(email)) {
            mAuthentication.setmEmail(email);
            return true;
        }

        mEditTextEmail.setError(getResources().getString(R.string.error_email_input));
        return false;
    }

    private boolean isPhoneValid() {
        String phone = mEditTextPhone.getText().toString();

        if (phone != null && !phone.isEmpty()) {
            mAuthentication.setmPhone(phone);
            return true;
        }

        mEditTextPhone.setError(getResources().getString(R.string.error_phone_valid));
        return false;
    }

    private boolean isAccepted() {
        if (mCheckBoxAccept.isChecked()) {
            mAuthentication.setmIsAccepted(true);
            return true;
        }
        Toast.makeText(Week3Activity.this, getResources().getString(R.string
                .error_is_accepted_input), Toast.LENGTH_LONG).show();
        return false;
    }

    public void bntSubmitOnClick(View view) {

        if (isEmailValid() && isPhoneValid() && isAccepted()) {
            mTextViewResult.setText(mAuthentication.toString());
        }
    }
}
