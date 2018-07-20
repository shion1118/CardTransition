package work.shion.cardtransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.card.MaterialCardView;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MaterialCardView userCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userCard = (MaterialCardView) findViewById(R.id.user_cardView);
        userCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityOptions options = ActivityOptions.
                        makeSceneTransitionAnimation(MainActivity.this, (View) userCard, "user");

                Intent intent = new Intent(MainActivity.this, UserActivity.class);
                startActivity(intent, options.toBundle());
            }
        });
    }
}
