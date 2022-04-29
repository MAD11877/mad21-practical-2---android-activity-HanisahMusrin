package sg.edu.np.mad.hanisah.pracwk2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
private Button follow;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        follow = findViewById(R.id.button);
        follow.setOnClickListener(this);
        //String name = User.class.name;
        //String description = User.class.description;
    }

    @Override
    public void onClick(View v)
    {
        if (follow.getText().toString() == "FOLLOW")
        {
            follow.setText("UNFOLLOW");
            return;
        }
        follow.setText("FOLLOW");
    }
}

