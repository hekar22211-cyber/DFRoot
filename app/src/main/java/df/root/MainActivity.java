package df.root;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isJoined = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // সঠিক লেআউট ফাইল সেট করা হলো
        setContentView(R.layout.activity_main);

        Button btnJoin = findViewById(R.id.btnJoinTelegram);
        
        if (btnJoin != null) {
            btnJoin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isJoined = true;
                    // আপনার টেলিগ্রাম চ্যানেল লিংক
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Gaming_Rahim_YT"));
                    startActivity(intent);
                }
            });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        // ব্যবহারকারী টেলিগ্রাম থেকে ব্যাক করে অ্যাপে আসলে চেক করবে
        if (isJoined) {
            Log.d("GamingRahimYT", "User returned from Telegram");
            Toast.makeText(this, "ধন্যবাদ! এখন অ্যাপ ব্যবহার করতে পারেন।", Toast.LENGTH_LONG).show();
            
            // এখানে চাইলে লক স্ক্রিন বা ভিউ হাইড করে মূল ফিচার এনেবল করতে পারেন
        }
    }
}
