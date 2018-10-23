package com.tfish0.yy.translateanimation;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.BottomSheetDialog;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import java.util.logging.Logger;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.click).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = new AlertDialog.Builder(MainActivity.this)
                        .create();
                dialog.show();
                Window window = dialog.getWindow();
                //dialog从底部弹出
                window.setGravity(Gravity.BOTTOM);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.width = getWindow().getWindowManager().getDefaultDisplay().getWidth();
                window.setAttributes(attributes);

                window.setBackgroundDrawable(null);

                //设置动画
                window.setWindowAnimations(R.style.dialog_style);

                View inflate = View.inflate(MainActivity.this, R.layout.item_dialog, null);
                dialog.setContentView(inflate);


            }
        });
        findViewById(R.id.click1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog dialog = new BottomSheetDialog(MainActivity.this);
                dialog.setContentView(R.layout.item_dialog);
                dialog.show();


            }
        });
    }
}
