package vn.edu.usth.crow;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import vn.edu.usth.crow.R;

public class CrowActivity extends AppCompatActivity {

    public MediaPlayer player = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crow);

        final Button all_dead = findViewById(R.id.all_dead);
        all_dead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.all_dead);
                player.start();
            }
        });

        final Button bockbock = findViewById(R.id.bockbock);
        bockbock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.bockbock);
                player.start();
            }
        });

        final Button brutal = findViewById(R.id.brutal);
        brutal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.brutal);
                player.start();
            }
        });

        final Button charge = findViewById(R.id.charge);
        charge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.charge);
                player.start();
            }
        });

        final Button crashburn = findViewById(R.id.crashburn);
        crashburn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.crash_burn);
                player.start();
            }
        });

        final Button cricket = findViewById(R.id.cricket);
        cricket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.cricket);
                player.start();
            }
        });

        final Button crowd1 = findViewById(R.id.crowd1);
        crowd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.crowd_1);
                player.start();
            }
        });

        final Button crowd2 = findViewById(R.id.crowd2);
        crowd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.crowd_2);
                player.start();
            }
        });

        final Button crybaby = findViewById(R.id.crybaby);
        crybaby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.crybaby);
                player.start();
            }
        });

        final Button disastah = findViewById(R.id.disastah);
        disastah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.disastah);
                player.start();
            }
        });

        final Button duiyoune = findViewById(R.id.duiyoune);
        duiyoune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.duiyou_ne);
                player.start();
            }
        });

        final Button echo = findViewById(R.id.echo);
        echo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.echo_slama_jama);
                player.start();
            }
        });

        final Button ez = findViewById(R.id.ez);
        ez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.easiest_money);
                player.start();
            }
        });
        final Button kiss = findViewById(R.id.kiss);
        kiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.kiss);
                player.start();
            }
        });

        final Button laka = findViewById(R.id.laka);
        laka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.laka);
                player.start();
            }
        });

        final Button liu = findViewById(R.id.liu);
        liu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.liu_liu_liu);
                player.start();
            }
        });

        final Button nextlevel = findViewById(R.id.nextlevel);
        nextlevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.next_level);
                player.start();
            }
        });

        final Button niqibuqi = findViewById(R.id.niqi);
        niqibuqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.niqibuqi);
                player.start();
            }
        });

        final Button oh_my_lord = findViewById(R.id.oh_my_lord);
        oh_my_lord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.oh_my_lord);
                player.start();
            }
        });

        final Button oy = findViewById(R.id.oy);
        oy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.oy_oy_oy);
                player.start();
            }
        });

        final Button partyhorn = findViewById(R.id.party_horn);
        partyhorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.party_horn);
                player.start();
            }
        });

        final Button playtowin = findViewById(R.id.playtowin);
        playtowin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.playing_to_win);
                player.start();
            }
        });

        final Button sad_bone = findViewById(R.id.sad_bone);
        sad_bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.sad_bone);
                player.start();
            }
        });

        final Button snore = findViewById(R.id.snore);
        snore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.snore);
                player.start();
            }
        });

        final Button that_was_questionable = findViewById(R.id.that_was_questionable);
        that_was_questionable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.that_was_questionable);
                player.start();
            }
        });

        final Button happened = findViewById(R.id.happened);
        happened.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.what_just_happened);
                player.start();
            }
        });

        final Button youreahero = findViewById(R.id.youre_a_hero);
        youreahero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.reset();
                player = MediaPlayer.create(getApplicationContext(), R.raw.youre_a_hero);
                player.start();
            }
        });
    }
}
