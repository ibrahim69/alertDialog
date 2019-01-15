package com.popup;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout button18, button17;
    AlertDialog.Builder builder;
    LayoutInflater inflater;
    View dialogView;
    private Boolean amf = false, cof = false, bt18 = false, bt17 = false;
    String stringNumberAtas;
    ImageView trapesium_atas, trapesium_bawah, trapesium_kanan, trapesium_kiri, kotak;
    ImageView kotak18, kotak17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Popup Window
        button18 =  findViewById(R.id.btrl18);
        button17 = findViewById(R.id.btrl17);

        // set Odontogram
        kotak18 = findViewById(R.id.kotak_18);
        kotak17 = findViewById(R.id.kotak_17);

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                txt_hasil.setText(null);
                stringNumberAtas = "18";
                bt18 = true;
                DialogForm();
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                txt_hasil.setText(null);
                stringNumberAtas = "17";
                bt17 = true;
                DialogForm();
            }
        });


    }

    private void DialogForm() {
        builder = new AlertDialog.Builder(MainActivity.this);
        LayoutInflater inflater = getLayoutInflater();
        dialogView = inflater.inflate(R.layout.popup_odontogram, null);

//        String st19="19";

        final TextView tvnomerAtas = dialogView.findViewById(R.id.numberTop);
        tvnomerAtas.setText(stringNumberAtas);

        final ImageView trapesium_atas = dialogView.findViewById(R.id.trapesium_atas);
        final ImageView trapesium_kanan = dialogView.findViewById(R.id.trapesium_kanan);
        final ImageView trapesium_bawah = dialogView.findViewById(R.id.trapesium_bawah);
        final ImageView trapesium_kiri = dialogView.findViewById(R.id.trapesium_kiri);
        final ImageView kotak = dialogView.findViewById(R.id.kotak);

        final LinearLayout lylistgigiatas = dialogView.findViewById(R.id.lylistgigiatas);

        final Button btamf = dialogView.findViewById(R.id.amf_atas);
        final Button btcof= dialogView.findViewById(R.id.cof_atas);

//        trapesium_atas.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (lylistgigiatas.getVisibility() == View.GONE) {
//                    lylistgigiatas.setVisibility(View.VISIBLE);
//                }
//            }
//        }); nama    = txt_nama.getText().toString();
//                usia    = txt_usia.getText().toString();
//                alamat  = txt_alamat.getText().toString();
//                status = txt_status.getText().toString();
//
//                txt_hasil.setText("Nama : " + nama + "\n" + "Usia : " + usia + "\n" + "Alamat : " + alamat + "\n" + "Status : " + status);

//        trapesium_kanan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (lylistgigiatas.getVisibility() == View.GONE) {
//                    lylistgigiatas.setVisibility(View.VISIBLE);
//                }  else {
//                    lylistgigiatas.setVisibility(View.GONE);
//                }
//            }
//        });
//
//        trapesium_kiri.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (lylistgigiatas.getVisibility() == View.GONE) {
//                    lylistgigiatas.setVisibility(View.VISIBLE);
//                } else {
//                    lylistgigiatas.setVisibility(View.GONE);
//                }
//            }
//        });
//
//        trapesium_bawah.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (lylistgigiatas.getVisibility() == View.GONE) {
//                    lylistgigiatas.setVisibility(View.VISIBLE);
//                } else {
//                    lylistgigiatas.setVisibility(View.GONE);
//                }
//            }
//        });
//
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lylistgigiatas.getVisibility() == View.GONE) {
                    lylistgigiatas.setVisibility(View.VISIBLE);
                }

                Toast toast = Toast.makeText(getApplicationContext(),
                        "Anda telah memilih Kotak Tengah",
                        Toast.LENGTH_SHORT);

                toast.show();
            }
        });

        btamf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kotak.setImageResource(R.drawable.ic_gigi_tengah_amf);

                amf = true;

                if(lylistgigiatas.getVisibility() == View.VISIBLE) {
                    lylistgigiatas.setVisibility(View.GONE);
                }
            }
        });

        btcof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kotak.setImageResource(R.drawable.ic_gigi_tengah_cof);

                cof = true;

                if(lylistgigiatas.getVisibility() == View.VISIBLE) {
                    lylistgigiatas.setVisibility(View.GONE);
                }
            }
        });


        builder.setView(dialogView);
        builder.setCancelable(true);

        builder.setPositiveButton("SAVE", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
//                nama    = txt_nama.getText().toString();
//                usia    = txt_usia.getText().toString();
//                alamat  = txt_alamat.getText().toString();
//                status = txt_status.getText().toString();
//
//                txt_hasil.setText("Nama : " + nama + "\n" + "Usia : " + usia + "\n" + "Alamat : " + alamat + "\n" + "Status : " + status);
//                if (amf) {
//                    kotak18.setImageResource(R.drawable.ic_gigi_tengah_amf);
//
//                    kotak17.setImageResource(R.drawable.ic_gigi_tengah_amf);
//                }
//
//                if (cof) {
//                    kotak18.setImageResource(R.drawable.ic_gigi_tengah_cof);
//
//                    kotak17.setImageResource(R.drawable.ic_gigi_tengah_cof);
//                }

                if (bt18 == true) {
                    if (amf == true) {
                        kotak18.setImageResource(R.drawable.ic_gigi_tengah_amf);
                    } else if (cof == true) {
                        kotak18.setImageResource(R.drawable.ic_gigi_tengah_cof);
                    } else {
                        kotak18.setImageResource(R.drawable.ic_gigi_kotak_tengah);
                    }
                }

                if (bt17 == true) {
                    if (amf == true) {
                        kotak17.setImageResource(R.drawable.ic_gigi_tengah_amf);
                    } else if (cof == true) {
                        kotak17.setImageResource(R.drawable.ic_gigi_tengah_cof);
                    } else {
                        kotak17.setImageResource(R.drawable.ic_gigi_kotak_tengah);
                    }
                }

                dialog.dismiss();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builder.setView(dialogView);

        // Create the alert dialog
        AlertDialog dialog = builder.create();

        dialog.show();

        // Initialize a new window manager layout parameters
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();

        // Copy the alert dialog window attributes to new layout parameter instance
        layoutParams.copyFrom(dialog.getWindow().getAttributes());

        // Set the width and height for the layout parameters
        // This will bet the width and height of alert dialog
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT;

        // Apply the newly created layout parameters to the alert dialog window
        dialog.getWindow().setAttributes(layoutParams);
    }
}
