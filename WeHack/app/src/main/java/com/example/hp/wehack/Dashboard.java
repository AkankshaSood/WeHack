package com.example.hp.wehack;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dashboard extends AppCompatActivity {

    private FirebaseAuth auth;
    DatabaseReference mDatabaseReference;
    String lan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard2);
        auth = FirebaseAuth.getInstance();
        mDatabaseReference = FirebaseDatabase.getInstance().getReference();

        LinearLayout llStudy = findViewById(R.id.study);
        LinearLayout llSpa = findViewById(R.id.spa);
        LinearLayout llParlour = findViewById(R.id.parlour);
        LinearLayout llRestaurant = findViewById(R.id.restraunt);
        LinearLayout llScience = findViewById(R.id.science);
        LinearLayout llMobileComputing = findViewById(R.id.mobileComputing);
        LinearLayout llMehendi = findViewById(R.id.mehendi);
        LinearLayout llMicrosoft = findViewById(R.id.microsoft);
        LinearLayout llbio = findViewById(R.id.bio);
        LinearLayout llChem = findViewById(R.id.chem);
        LinearLayout llComputer = findViewById(R.id.computer);
        LinearLayout llElectrician = findViewById(R.id.electrician);
        LinearLayout llEmbroidery = findViewById(R.id.embroidery);
        LinearLayout llStitching = findViewById(R.id.Stitching);
        LinearLayout llCooking = findViewById(R.id.cooking);

        llCooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showChangeLangDialog();
//                String user_id = auth.getCurrentUser().getUid();
//                FirebaseDatabase.getInstance().getReference(user_id).getKey();

                //FirebaseDatabase.getInstance().getReference().child("User").child(user_id).getKey().ge;

            }
        });}


        public void showChangeLangDialog() {
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
            LayoutInflater inflater = this.getLayoutInflater();
            final View dialogView = inflater.inflate(R.layout.dialog, null);
            dialogBuilder.setView(dialogView);

            final EditText edt = (EditText) dialogView.findViewById(R.id.edit1);

            dialogBuilder.setTitle("Custom dialog");
            dialogBuilder.setMessage("Enter language below");
            dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    lan = edt.getText().toString();
                    Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                    i.putExtra("lan",lan);
                    i.putExtra("stream","Cooking");
                    startActivity(i);
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    //  Action for 'NO' Button
                    dialog.cancel();
                    Toast.makeText(getApplicationContext(),"you choose no action for alertbox",
                            Toast.LENGTH_SHORT).show();
                }
            });

            AlertDialog b = dialogBuilder.create();
            b.show();
        }


        llbio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llChem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llElectrician.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llEmbroidery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llMehendi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llMicrosoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llMobileComputing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llParlour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llSpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llStitching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });

        llStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dashboard.this,ListOfVideos.class);
                startActivity(i);
            }
        });



}
