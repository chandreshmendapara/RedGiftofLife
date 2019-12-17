package com.example.regoli;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.DatePickerDialog;
        import android.content.Intent;
        import android.graphics.Color;
        import android.graphics.drawable.ColorDrawable;
        import android.icu.text.Collator;
        import android.os.Bundle;

        import android.os.Handler;
        import android.view.View;
        import android.widget.Button;
        import android.widget.DatePicker;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;
        import android.widget.ProgressBar;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.Calendar;

        import static android.text.TextUtils.isEmpty;


public class MainActivity extends AppCompatActivity {
    //linearlayouts
    private LinearLayout first_layout, second_layout, third_layout, fourth_layout, fifth_layout, sixth_layout,seventh_layout, eight_layout,ninth_layout,tenth_layout, login1_layout,login3_layout;
    private LinearLayout eleventh_layout;

    //First Layout
    private Button signin,create_account;
            private  ImageButton back;


                //already sign up than
                    //login1 layout

                        private EditText mo_no;
                        private  ImageButton mo_no_next;

                     //login2 layout


                        //login 3 layout
                            private  TextView enter_number;
                            private  EditText verify_code;
                            private  ImageButton verified_next;

                            //login4 layout






    //Second Layout
    private EditText pnumber;
    private ImageButton pnumber_next;



    //Third Layout
    private ProgressBar progressBar;

    //Fourth Layout
    private EditText verify;
    private ImageButton verify_next;
    private TextView entered_number;

    //Fifth Layout
    private  EditText name;
    private  ImageButton name_next;

    //Sixth Layout
    private EditText email;
    private ImageButton email_next;


    //Seventh Layout
    private Button blood_a,blood_b,blood_ab,blood_o;




    //eighth Layout
    private Button positive,negative,choose_blood;


    // ninth layout
    private   EditText dob;
    private  TextView txt_dob;
    private  ImageButton dob_next;
    //DatePickerDialog.OnDateSetListener setListener;




    // tenth layout;

    private Button male,female;

    //eleventh

    private ImageButton weight_next;
    private EditText weight;


/*    all variable that I use for store user value etc

   for sign in s
        user_number for get user number
        user_code for get verification code

   for sign up
         guser_number  for  user number
         guser_code for verifications code
         guser_name for  user name
         guser_email for user email
         guser_blood for user blood type with Rhd  like A+,B+, etc
         guser_dob for dob
         guser_weight for weight of user






    */

   String user_number,user_code,guser_number,guser_code,guser_name,guser_email,guser_blood,guser_dob,guser_btype,guser_weight;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back = (ImageButton) findViewById(R.id.back);
        first_layout = (LinearLayout) findViewById(R.id.first_layout);

        login1_layout = (LinearLayout) findViewById(R.id.login1_layout);
        login3_layout = (LinearLayout) findViewById(R.id.login3_layout);

        second_layout = (LinearLayout) findViewById(R.id.second_layout);
        third_layout = (LinearLayout) findViewById(R.id.third_layout);
        fourth_layout = (LinearLayout) findViewById(R.id.fourth_layout);
        fifth_layout = (LinearLayout) findViewById(R.id.fifth_layout);
        sixth_layout = (LinearLayout) findViewById(R.id.sixth_layout);
        seventh_layout = (LinearLayout) findViewById(R.id.seventh_layout);
        eight_layout = (LinearLayout) findViewById(R.id.eight_layout);
        ninth_layout=(LinearLayout)findViewById(R.id.ninth_layout);
        tenth_layout=(LinearLayout)findViewById(R.id.tenth_layout);
        eleventh_layout=(LinearLayout)findViewById(R.id.eleventh_layout);


        first_layout.setVisibility(View.VISIBLE);
        back.setVisibility(View.GONE);

        //******

        signin = (Button) findViewById(R.id.signin);
        create_account = (Button) findViewById(R.id.create_account);


        //if click on sign in

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                first_layout.setVisibility(View.GONE);
                login1_layout.setVisibility(View.VISIBLE);
                back.setVisibility(View.VISIBLE);
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        login1_layout.setVisibility(View.GONE);
                        first_layout.setVisibility(View.VISIBLE);
                    }
                });
            }
        });

        //****

        mo_no = (EditText) findViewById(R.id.mo_no);
        mo_no_next = (ImageButton) findViewById(R.id.mo_no_next);


        mo_no_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login1_layout.setVisibility(View.GONE);
                login3_layout.setVisibility(View.VISIBLE);
                user_number = mo_no.getText().toString();
                enter_number.setText(user_number);

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        login3_layout.setVisibility(View.GONE);
                        login1_layout.setVisibility(View.VISIBLE);


                    }
                });

            }
        });


        //*****

        enter_number = (TextView) findViewById(R.id.enter_number);

        verify_code = (EditText) findViewById(R.id.verify_code);
        verified_next = (ImageButton) findViewById(R.id.verified_next);


        verified_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_code = verify_code.getText().toString();
                Intent i = new Intent(MainActivity.this, Dashboard.class);
                startActivity(i);
                login3_layout.setVisibility(View.GONE);

            }

        });


        // if click on sign up

        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setVisibility(View.VISIBLE);
                first_layout.setVisibility(View.GONE);
                second_layout.setVisibility(View.VISIBLE);
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        second_layout.setVisibility(View.GONE);
                        first_layout.setVisibility(View.VISIBLE);


                    }
                });
            }
        });


        //****

        pnumber_next = (ImageButton) findViewById(R.id.pnumber_next);
        pnumber = (EditText) findViewById(R.id.pnumber);

        //store phone Number


        pnumber_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        first_layout.setVisibility(View.GONE);
                        second_layout.setVisibility(View.VISIBLE);


                    }
                });
                guser_number = pnumber.getText().toString();
                if(isEmpty(guser_number)){
                    pnumber.setHint("please enter phone number");
                    pnumber.setHintTextColor( getResources().getColor(R.color.error));

                }
                else {
                    second_layout.setVisibility(View.GONE);
                    fourth_layout.setVisibility(View.VISIBLE);


                    Toast.makeText(MainActivity.this, guser_number, Toast.LENGTH_LONG).show();
                    entered_number.setText(guser_number);
                }

            }
        });

        //******
//        progressBar =(ProgressBar)findViewById(R.id.progress_circular);
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                third_layout.setVisibility(View.GONE);
//                fourth_layout.setVisibility(View.VISIBLE);
//
//            }
//        },2);


        //******
        entered_number = (TextView) findViewById(R.id.yr_phnnumber);
        verify = (EditText) findViewById(R.id.verify);
        verify_next = (ImageButton) findViewById(R.id.verify_next);

        //store verification Code (OTP)


        verify_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fifth_layout.setVisibility(View.GONE);
                        fourth_layout.setVisibility(View.VISIBLE);


                    }
                });

                guser_code = verify.getText().toString();
                if(!isEmpty(guser_code)) {
                    fourth_layout.setVisibility(View.GONE);
                    fifth_layout.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, guser_code, Toast.LENGTH_LONG).show();
                }
                else{

                    verify.setHintTextColor(getResources().getColor(R.color.error));

                }
            }
        });


        //**************


        name = (EditText) findViewById(R.id.name);
        name_next = (ImageButton) findViewById(R.id.name_next);

        name_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fifth_layout.setVisibility(View.VISIBLE);
                        fourth_layout.setVisibility(View.GONE);


                    }
                });
                fifth_layout.setVisibility(View.GONE);
                sixth_layout.setVisibility(View.VISIBLE);
                guser_name = name.getText().toString();
                Toast.makeText(MainActivity.this, guser_name, Toast.LENGTH_LONG).show();
            }
        });

        //********
        email = (EditText) findViewById(R.id.email);
        email_next = (ImageButton) findViewById(R.id.email_next);

        email_next.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        fifth_layout.setVisibility(View.GONE);
                        sixth_layout.setVisibility(View.VISIBLE);


                    }
                });
                sixth_layout.setVisibility(View.GONE);
                seventh_layout.setVisibility(View.VISIBLE);
                guser_email = email.getText().toString();
                Toast.makeText(MainActivity.this, guser_email, Toast.LENGTH_LONG).show();
            }
        });


        //**********
        blood_a = (Button) findViewById(R.id.blood_a);
        blood_b = (Button) findViewById(R.id.blood_b);
        blood_ab = (Button) findViewById(R.id.blood_ab);
        blood_o = (Button) findViewById(R.id.blood_o);


        //store blood type


        blood_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        eight_layout.setVisibility(View.GONE);
                        seventh_layout.setVisibility(View.VISIBLE);


                    }
                });
                guser_btype = "A";
                seventh_layout.setVisibility(View.GONE);
                eight_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, guser_btype, Toast.LENGTH_SHORT).show();
                choose_blood.setText("A");


            }
        });
        blood_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        eight_layout.setVisibility(View.GONE);
                        seventh_layout.setVisibility(View.VISIBLE);


                    }
                });
                guser_btype = "B";
                seventh_layout.setVisibility(View.GONE);
                eight_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, guser_btype, Toast.LENGTH_SHORT).show();
                choose_blood.setText("B");


            }
        });
        blood_ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        eight_layout.setVisibility(View.GONE);
                        seventh_layout.setVisibility(View.VISIBLE);


                    }
                });
                guser_btype = "AB";
                seventh_layout.setVisibility(View.GONE);
                eight_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, guser_btype, Toast.LENGTH_SHORT).show();
                choose_blood.setText("AB");


            }
        });
        blood_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        eight_layout.setVisibility(View.GONE);
                        seventh_layout.setVisibility(View.VISIBLE);


                    }
                });
                guser_btype = "O";
                seventh_layout.setVisibility(View.GONE);
                eight_layout.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this, guser_btype, Toast.LENGTH_SHORT).show();
                choose_blood.setText("O");

            }
        });


        //************

        positive = (Button) findViewById(R.id.rhd_positive);
        negative = (Button) findViewById(R.id.rhd_negative);
        choose_blood=(Button) findViewById(R.id.choose_blood);
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ninth_layout.setVisibility(View.GONE);
                        eight_layout.setVisibility(View.VISIBLE);


                    }
                });
                guser_blood=guser_btype+"+";
                Toast.makeText(MainActivity.this,guser_blood,Toast.LENGTH_LONG).show();
                eight_layout.setVisibility(View.GONE);
                ninth_layout.setVisibility(View.VISIBLE);
            }
        });

        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        ninth_layout.setVisibility(View.GONE);
                        eight_layout.setVisibility(View.VISIBLE);


                    }
                });

                guser_blood=guser_btype+"-";
                Toast.makeText(MainActivity.this,guser_blood,Toast.LENGTH_LONG).show();
                eight_layout.setVisibility(View.GONE);
                ninth_layout.setVisibility(View.VISIBLE);
            }
        });


        //ninth layout
        dob = (EditText)findViewById(R.id.dob);
        dob_next=(ImageButton)findViewById(R.id.dob_next);
        txt_dob = (TextView)findViewById(R.id.txt_dob);
        Calendar calendar =Calendar.getInstance();
        final int year =calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day  = calendar.get(Calendar.DAY_OF_MONTH);
/*
        txt_dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        MainActivity.this, android.R.style.Theme_Holo_Dialog, setListener,year,month,day);

                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();


            }
        });
        setListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayoffmonth) {
                month =month+1;
                String date = day+"-"+ month +"-"+year;
                txt_dob.setText(date);

            }
        };*/


            dob.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DatePickerDialog datePickerDialog = new DatePickerDialog(
                            MainActivity.this,android.R.style.Theme_Holo_Dialog_NoActionBar_MinWidth, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                            month = month+1;
                            String date = day+"-"+month+"-"+year;
                            dob.setText(date);
                        }
                    },year,month,day);
                    datePickerDialog.show();
                }
            });
            dob_next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    back.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            tenth_layout.setVisibility(View.GONE);
                            ninth_layout.setVisibility(View.VISIBLE);
                        }
                    });
                    ninth_layout.setVisibility(View.GONE);
                    tenth_layout.setVisibility(View.VISIBLE);

                }
            });



            //****

        male = (Button)findViewById(R.id.male);
        female = (Button)findViewById(R.id.female);

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        eleventh_layout.setVisibility(View.GONE);
                        tenth_layout.setVisibility(View.VISIBLE);
                    }
                });
                tenth_layout.setVisibility(View.GONE);
                eleventh_layout.setVisibility(View.VISIBLE);


            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        eleventh_layout.setVisibility(View.GONE);
                        tenth_layout.setVisibility(View.VISIBLE);
                    }
                });
                tenth_layout.setVisibility(View.GONE);
                eleventh_layout.setVisibility(View.VISIBLE);

            }
        });



        weight=(EditText)findViewById(R.id.weight);
        weight_next=(ImageButton)findViewById(R.id.weight_next);


        weight_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                guser_weight = weight.getText().toString();
                Intent i = new Intent(MainActivity.this,Dashboard.class);
                startActivity(i);


            }
        });




    }
    }







