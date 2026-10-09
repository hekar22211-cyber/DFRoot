package df.root;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // অ্যাপ ওপেন হওয়ার সাথে সাথেই টেলিগ্রাম পপআপ দেখানোর জন্য
        showTelegramPopup();
    }

    private void showTelegramPopup() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Gaming Rahim YT");
        builder.setMessage("অ্যাপটি ব্যবহার করতে প্রথমে আমাদের টেলিগ্রাম চ্যানেলে জয়েন করুন!");
        builder.setCancelable(false); // বাইরে ক্লিক করে পপআপ কাটতে পারবে না

        builder.setPositiveButton("টেলিগ্রাম জয়েন করুন", (dialog, which) -> {
            // আপনার টেলিগ্রাম চ্যানেলের লিংক
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Gaming_Rahim_YT"));
            startActivity(intent);
        });

        builder.setNegativeButton("বাতিল", (dialog, which) -> {
            dialog.dismiss();
            // চাইলে বাতিল করলে অ্যাপ বন্ধ করে দিতে পারেন:
            // finish();
        });

        builder.show();
    }
}
