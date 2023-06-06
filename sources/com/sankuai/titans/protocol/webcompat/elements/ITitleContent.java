package com.sankuai.titans.protocol.webcompat.elements;

import android.graphics.Bitmap;
import android.view.View;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitleContent {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface IImageTitleInterceptor {
        Bitmap onDownloadTitleImg(String str);

        Bitmap onTitleImgDownloaded(String str, Bitmap bitmap);
    }

    int getCalculatedWidth();

    IImageTitleInterceptor getImageTitleInterceptor();

    String getTitleText();

    boolean isDetachedFromWindow();

    void runOnUiThread(Runnable runnable);

    void setImageTitleInterceptor(IImageTitleInterceptor iImageTitleInterceptor);

    void setOnTitleBarEventListener(OnTitleBarEventListener onTitleBarEventListener);

    void setOnTitleClickListener(View.OnClickListener onClickListener);

    void setTitleContentParams(JSONObject jSONObject);

    boolean setTitleImage(Bitmap bitmap);

    void setTitleImageLayout(int i, int i2);

    void setTitleText(String str);
}
