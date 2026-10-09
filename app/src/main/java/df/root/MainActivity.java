package df.root;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isJoined = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main.xml ki niche holo layout file name); // লেআউট সেট করছি
        // যদি ওপরের লাইনে এরর আসে তবে শুধু নিচের লাইনটি রাখবেন:
        setContentView(R.layout.activity_main);

        Button btnJoin = findViewById(R.id.btnJoinTelegram);

        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isJoined = true;
                // আপনার টেলিগ্রাম লিংক
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Gaming_Rahim_YT"));
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        // ব্যবহারকারী টেলিগ্রাম থেকে ব্যাক করে অ্যাপে আসলে চেক করবে
        if (isJoined) {
            Toast.log("Welcome to Gaming Rahim YT!");
            Toast.makeText(this, "ধন্যবাদ! এখন অ্যাপ ব্যবহার করতে পারেন।", Toast.LENGTH_LONG).show();
            
            // এখানে আপনি চাইলে টেলিগ্রাম স্ক্রিন লুকিয়ে মূল এক্সপ্লয়েট ফিচার বা লেআউট দেখাতে পারেন
            // অথবা আপাতত ইউজারকে এভাবেই অ্যাপের মূল ইন্টারফেসে প্রবেশ করাতে পারেন।
        }
    }
}
