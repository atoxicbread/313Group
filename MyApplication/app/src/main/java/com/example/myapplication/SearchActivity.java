package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;


public class SearchActivity extends AppCompatActivity {
    private ImageButton lhw,hjp,pcr,lsh,tt,mos,slc,hp,flc,cmw,lm,dh,lft,ytat,lw,spc,cs,hht,klat,ft,lc,nls,ht,ks,ttc,pt,ttt,wkt,wlh;
    private Button lhw1,hjp1,pcr1,lsh1,tt1,mos1,slc1,hp1,flc1,cmw1,lm1,dh1,lft1,ytat1,lw1,spc1,cs1,hht1,klat1,ft1,lc1,nls1,ht1,ks1,ttc1,pt1,ttt1,wkt1,wlh1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        lhw = (ImageButton) findViewById(R.id.lhw);
        hjp = (ImageButton) findViewById(R.id.hjp);
        pcr = (ImageButton) findViewById(R.id.pcr);
        lsh = (ImageButton) findViewById(R.id.lsh);
        tt = (ImageButton) findViewById(R.id.tt);
        mos = (ImageButton) findViewById(R.id.mos);
        slc = (ImageButton) findViewById(R.id.slc);
        hp = (ImageButton) findViewById(R.id.hp);
        flc = (ImageButton) findViewById(R.id.flc);
        cmw = (ImageButton) findViewById(R.id.cmw);
        lm = (ImageButton) findViewById(R.id.lm);
        dh = (ImageButton) findViewById(R.id.dh);
        lft = (ImageButton) findViewById(R.id.lft);
        ytat = (ImageButton) findViewById(R.id.ytat);
        lw = (ImageButton) findViewById(R.id.lw);
        spc = (ImageButton) findViewById(R.id.spc);
        cs = (ImageButton) findViewById(R.id.cs);
        hht = (ImageButton) findViewById(R.id.hht);
        klat = (ImageButton) findViewById(R.id.klat);
        ft = (ImageButton) findViewById(R.id.ft);
        lc = (ImageButton) findViewById(R.id.lc);
        nls = (ImageButton) findViewById(R.id.nls);
        ht = (ImageButton) findViewById(R.id.ht);
        ks = (ImageButton) findViewById(R.id.ks);
        ttc = (ImageButton) findViewById(R.id.ttc);
        pt = (ImageButton) findViewById(R.id.pt);
        ttt = (ImageButton) findViewById(R.id.ttt);
        wkt = (ImageButton) findViewById(R.id.wkt);
        wlh = (ImageButton) findViewById(R.id.wlh);

        lhw1 = findViewById(R.id.lhw1);
        hjp1 = findViewById(R.id.hjp1);
        pcr1 = findViewById(R.id.pcr1);
        lsh1 = findViewById(R.id.lsh1);
        tt1 = findViewById(R.id.tt1);
        mos1 = findViewById(R.id.mos1);
        slc1 = findViewById(R.id.slc1);
        hp1 =  findViewById(R.id.hp1);
        flc1 = findViewById(R.id.flc1);
        cmw1 = findViewById(R.id.cmw1);
        lm1 = findViewById(R.id.lm1);
        dh1 = findViewById(R.id.dh1);
        lft1 = findViewById(R.id.lft1);
        ytat1 = findViewById(R.id.ytat1);
        lw1 =  findViewById(R.id.lw1);
        spc1 = findViewById(R.id.spc1);
        cs1 =  findViewById(R.id.cs1);
        hht1 =  findViewById(R.id.hht1);
        klat1 =  findViewById(R.id.klat1);
        ft1 = findViewById(R.id.ft1);
        lc1 = findViewById(R.id.lc1);
        nls1 = findViewById(R.id.nls1);
        ht1 = findViewById(R.id.ht1);
        ks1 = findViewById(R.id.ks1);
        ttc1 = findViewById(R.id.ttc1);
        pt1 = findViewById(R.id.pt1);
        ttt1 = findViewById(R.id.ttt1);
        wkt1 = findViewById(R.id.wkt1);
        wlh1 = findViewById(R.id.wlh1);

        lhw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.291745, 114.301904");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });

        hjp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.316243, 114.282138");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        pcr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.505722, 114.241917");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        lsh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.496079, 114.169293");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        tt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.257174, 114.193611");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        mos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.408596, 114.236418");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        slc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.256889, 113.985076");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        hp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.277319, 114.213825");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        flc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.203809, 113.856371");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        cmw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.238533, 113.987790");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        lm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.390190, 114.118388");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        dh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.505703, 114.241932");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        lft1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.296809, 114.017461");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        ytat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.376508, 114.099281");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        lw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.395470, 114.359672");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        spc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.226776, 113.904160");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        cs1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.436561, 114.326036");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        klat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.434798, 114.336825");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        ft1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.424790, 114.106410");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        lc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.406845, 113.988475");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        nls1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.516201, 114.207105");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        ht1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.255209, 113.913778");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        ks1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.504048, 114.172802");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        ttc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.241330, 113.881798");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        pt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.439576, 114.326260");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        ttt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.252152, 113.940593");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        wkt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.510166, 114.244331");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });
        wlh1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 创建URI对象，用于启动Google Maps应用程序并显示路线
                Uri uri = Uri.parse("http://maps.google.com/maps?saddr=当前位置&daddr=" + "22.272001, 113.950939");

                // 创建意图对象，用于启动Google Maps应用程序
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps"); // 设置要启动的应用程序包名，这里是Google Maps

                // 启动Google Maps应用程序
                startActivity(intent);
            }
        });


        lhw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=220520");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        hjp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=220805");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        pcr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200424");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        lsh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200710");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=220119");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        mos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200724");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        slc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=191025");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200610");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        flc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=211103");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        cmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=190322");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        lm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=190904");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        dh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=201204");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        lft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=201116");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        ytat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=210226");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        lw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200807");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        spc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200527");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=201014");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        hht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=181022");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        klat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=191004");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=201002");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200508");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        nls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=210917");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        ht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200506");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        ks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=210305");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        ttc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=210915");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        ft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=201002");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=200314");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        wkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=220518");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        wlh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://timhiking.com/en/blog.php?d=220309");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

    }
}