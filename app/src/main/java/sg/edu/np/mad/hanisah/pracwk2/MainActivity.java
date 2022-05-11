package sg.edu.np.mad.hanisah.pracwk2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{
private Button followBtn;
private boolean followVar = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //load name and desc from User object
        User u = new User();
        String name = u.name;
        String description = u.description;

        followBtn = findViewById(R.id.button);
        followBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (followBtn.getText().toString() == "FOLLOW")
        {
            followVar = true;
            followBtn.setText("UNFOLLOW");
            return;
        }
        followVar = false;
        followBtn.setText("FOLLOW");
        return;
    }
}

