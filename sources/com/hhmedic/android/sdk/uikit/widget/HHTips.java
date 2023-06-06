package com.hhmedic.android.sdk.uikit.widget;

import android.content.Context;
import android.widget.Toast;
import com.hhmedic.android.sdk.base.utils.HHActivityCompat;
import com.hhmedic.android.sdk.base.utils.Logger;
import com.hhmedic.android.sdk.uikit.widget.dialog.HHTipDialog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHTips {
    private HHTipDialog mHud;

    public void showProgress(Context context) {
        try {
            if (this.mHud == null) {
                createHud(context);
            }
            if (this.mHud.isShowing()) {
                return;
            }
            this.mHud.show();
        } catch (Exception unused) {
        }
    }

    private void createHud(Context context) {
        this.mHud = new HHTipDialog.Builder(context).setIconType(1).create();
        this.mHud.setCancelable(true);
    }

    public void hideProgress(Context context) {
        try {
            if (HHActivityCompat.isDead(context) || this.mHud == null) {
                return;
            }
            this.mHud.dismiss();
            this.mHud = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void errorTips(Context context, String str) {
        try {
            if (HHActivityCompat.isDead(context)) {
                return;
            }
            Toast makeText = Toast.makeText(context, str, 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
        } catch (Exception e) {
            Logger.e("errorTips error:" + e.getMessage());
        }
    }

    public void successTips(Context context, String str) {
        errorTips(context, str);
    }
}
