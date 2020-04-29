package com.example.android.afinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final int RC_SIGN_IN = 1;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference userReference;

    private FirebaseAuth msAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setTitle("Infinity Badminton");
        msAuth = FirebaseAuth.getInstance();


        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    //Toast.makeText(MainActivity.this, "Welcome to Infinity Badminton!", Toast.LENGTH_SHORT).show();

                } else {
                    List<AuthUI.IdpConfig> providers = Arrays.asList(
                            new AuthUI.IdpConfig.EmailBuilder().build(),
                            new AuthUI.IdpConfig.GoogleBuilder().build());

                    startActivityForResult(
                            AuthUI.getInstance()
                                    .createSignInIntentBuilder()
                                    .setIsSmartLockEnabled(false)
                                    .setAvailableProviders(providers)
                                    .build(),
                            RC_SIGN_IN);
                }
            }
        };

    }


    @Override
    protected void onStart() {
        super.onStart();
        msAuth.addAuthStateListener(mAuthStateListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        msAuth.removeAuthStateListener(mAuthStateListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sign_out_menu:
                AuthUI.getInstance().signOut(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void startActivity1(View view){
        Intent intent = new Intent(this,TutorialActivity.class);
        startActivity(intent);
    }

    public void startActivity2(View view){
        Intent intent = new Intent(this,CoachActivity.class);
        startActivity(intent);
    }

    public void startActivity3(View view){
        Intent intent = new Intent(this,TournamentActivity.class);
        startActivity(intent);
    }

    public void startActivity4(View view) {
        Intent intent = new Intent(this,BadIntroActivity.class);
        startActivity(intent);
    }

    public void courtSearch(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=Badminton Court");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void requestTrainingAdvice(View view) {
        Intent requestAdviceIntent = new Intent(this,RequestAdvice.class);
        startActivity(requestAdviceIntent);
    }

    public void aboutUs(View view) {
        Intent contactActivityIntent = new Intent(this, AboutUsActivity.class);
        startActivity(contactActivityIntent);
    }

    public void getReport(View view) {
        Intent getReportIntent = new Intent (this, GetReportActivity.class);
        startActivity(getReportIntent);
    }



}
