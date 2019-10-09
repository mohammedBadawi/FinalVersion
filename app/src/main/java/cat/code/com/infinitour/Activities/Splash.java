package cat.code.com.infinitour.Activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import cat.code.com.infinitour.R;

public class Splash extends AppCompatActivity {

    private ImageView  imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView = findViewById(R.id.logo);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.splashanime);
        imageView.startAnimation(animation);
        final Intent intent = new Intent(this,login.class);
        Thread timer = new Thread(){
           public void run () {
               try {
                   sleep(5000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               finally {
                   startActivity(intent);
                   finish();

               }

           }

        };
        timer.start();
    }
}
