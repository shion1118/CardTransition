package work.shion.cardtransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.card.MaterialCardView;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MaterialCardView userCard;
    private ImageView userHeader;
    private ImageView userIcon;
    private TextView userName;
    private TextView userProfession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userCard = (MaterialCardView) findViewById(R.id.user_cardView);
        userHeader = (ImageView) findViewById(R.id.header_imageView);
        userIcon = (ImageView) findViewById(R.id.icon_imageView);
        userName = (TextView) findViewById(R.id.name_textView);
        userProfession = (TextView) findViewById(R.id.profession_textView);

        userCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityOptions options = ActivityOptions.
                        makeSceneTransitionAnimation(MainActivity.this,
                                Pair.create((View) userHeader, "userHeader"),
                                Pair.create((View) userIcon, "userIcon"),
                                Pair.create((View) userName, "userName"),
                                Pair.create((View) userProfession, "userProfession")
                        );

                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent, options.toBundle());
            }
        });
    }
}
