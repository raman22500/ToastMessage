package thirtyfour.com.toastlibrary;

import android.content.Context;
import android.widget.Toast;

public  class ToastSimpleMessage {




    public  void setMessage(Context c, String message) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();

    }
}