package com.dianping.titans.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ITitleBar {
    String getWebTitle();

    void performLLClick();

    void setBackgroundColor(int i);

    void setLLButton(Bitmap bitmap, View.OnClickListener onClickListener);

    void setLLButton(String str, int i, boolean z, View.OnClickListener onClickListener);

    void setLLButton(String str, String str2, boolean z, View.OnClickListener onClickListener);

    void setLRButton(Bitmap bitmap, View.OnClickListener onClickListener);

    void setLRButton(String str, int i, boolean z, View.OnClickListener onClickListener);

    void setLRButton(String str, String str2, boolean z, View.OnClickListener onClickListener);

    void setProgress(int i);

    void setProgressColor(int i);

    void setProgressDrawable(Drawable drawable);

    void setRLButton(Bitmap bitmap, View.OnClickListener onClickListener);

    void setRLButton(String str, int i, boolean z, View.OnClickListener onClickListener);

    void setRLButton(String str, String str2, boolean z, View.OnClickListener onClickListener);

    void setRRButton(Bitmap bitmap, View.OnClickListener onClickListener);

    void setRRButton(String str, int i, boolean z, View.OnClickListener onClickListener);

    void setRRButton(String str, String str2, boolean z, View.OnClickListener onClickListener);

    void setTitleContentParams(JSONObject jSONObject);

    void setWebTitle(String str);

    void showProgressBar(boolean z);

    void showTitleBar(boolean z);
}
