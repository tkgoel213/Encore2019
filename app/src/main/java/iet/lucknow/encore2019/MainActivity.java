package iet.lucknow.encore2019;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;

import iet.lucknow.encore2019.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
  public CardView Cultural;
  public CardView Technical;
  public CardView Sports;
  public CardView band;
  public CardView standup;
  public CardView star;
  public CardView Arts;
  public CardView Informal;
  public CardView perf;
  public CardView astro;
  public CardView mobile;
  public CardView starg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);
        FirebaseMessaging.getInstance().subscribeToTopic("NEWS");

        Cultural = findViewById(R.id.Cultural);
        Cultural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, main_events.class);
                intentLoadNewActivity.putExtra("frag",1);
            startActivity(intentLoadNewActivity);
        }

        });
        Technical = findViewById(R.id.Technical);
        Technical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, main_events.class);
                intentLoadNewActivity.putExtra("frag",0);
                startActivity(intentLoadNewActivity);
            }

        });
        Sports = findViewById(R.id.Sports);
        Sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, main_events.class);
                intentLoadNewActivity.putExtra("frag",2);
                startActivity(intentLoadNewActivity);
            }

        });
        Arts = findViewById(R.id.Arts);
        Arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, main_events.class);
                intentLoadNewActivity.putExtra("frag",3);
                startActivity(intentLoadNewActivity);
            }

        });
        Informal = findViewById(R.id.Informal);
        Informal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, main_events.class);
                intentLoadNewActivity.putExtra("frag",4);
                startActivity(intentLoadNewActivity);
            }

        });
        standup = findViewById(R.id.stand_card);
        standup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, iet.lucknow.encore2019.night.standup.class);
                startActivity(intentLoadNewActivity);
            }
        });
        band = findViewById(R.id.band_card);
        band.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, iet.lucknow.encore2019.night.band.class);
                startActivity(intentLoadNewActivity);
            }
        });
        perf = findViewById(R.id.Performance);
        perf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, performances.class);
                startActivity(intentLoadNewActivity);
            }
        });
        astro = findViewById(R.id.astro_card);
        astro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, iet.lucknow.encore2019.astro.class);
                startActivity(intentLoadNewActivity);
            }
        });
        mobile = findViewById(R.id.mobile_card);
        mobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, iet.lucknow.encore2019.mobile.class);
                startActivity(intentLoadNewActivity);
            }
        });
        starg = findViewById(R.id.starg_card);
        starg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity= new Intent(MainActivity.this, stargazing.class);
                startActivity(intentLoadNewActivity);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            finish();
            System.exit(0);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Technical) {
            Intent i = new Intent(MainActivity.this,main_events.class);
            i.putExtra("frag", 0);
            startActivity(i);

            // Handle the camera action
        } else if (id == R.id.Cultural_drawer) {
            Intent i = new Intent(MainActivity.this,main_events.class);
            i.putExtra("frag",1);
            startActivity(i);


        } else if (id == R.id.Sports) {
            Intent i = new Intent(MainActivity.this,main_events.class);
            i.putExtra("frag",2);
            startActivity(i);

        } else if (id == R.id.Nights) {
            Intent i = new Intent(MainActivity.this,nights.class);
            startActivity(i);

        } else if (id == R.id.Arts) {
            Intent i = new Intent(MainActivity.this, main_events.class);
            i.putExtra("frag", 3);
            startActivity(i);

        }
        else if (id == R.id.Informal) {
            Intent i = new Intent(MainActivity.this,main_events.class);
            i.putExtra("frag",4);
            startActivity(i);
        }
        else if (id == R.id.contact) {
            Intent i = new Intent(MainActivity.this, contact.class);
            startActivity(i);
        }

        else if (id == R.id.About) {
            Intent i = new Intent(MainActivity.this, about.class);
            startActivity(i);
        }
        else if (id == R.id.Schedule) {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);

        } else if (id == R.id.Weblink) {
                    Intent i = new Intent("android.intent.action.VIEW", Uri.parse("http://www.encore19.com"));
                    startActivity(i);
        }
        else if (id == R.id.share) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            String body = "https://play.google.com/store/apps/details?id=iet.lucknow.encore2019";
            i.putExtra(Intent.EXTRA_SUBJECT, "Check out our college fest ENCORE app");
            i.putExtra(Intent.EXTRA_SUBJECT, body);
            startActivity(Intent.createChooser(i, "Share via"));

        }


            DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
