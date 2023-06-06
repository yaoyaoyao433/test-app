package com.dianping.titans.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.dianping.titans.widget.BaseTitleBar;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface ITitleContentV2 extends BaseTitleBar.ITitleContent {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IImageTitleInterceptor {
        Bitmap onDownloadTitleImg(String str);

        Bitmap onTitleImgDownloaded(String str, Bitmap bitmap);
    }

    IImageTitleInterceptor getImageTitleInterceptor();

    boolean isDetachedFromWindow();

    void runOnUiThread(Runnable runnable);

    void setImageTitleInterceptor(IImageTitleInterceptor iImageTitleInterceptor);

    void setOnTitleClickListener(View.OnClickListener onClickListener);

    boolean setTitleImage(Bitmap bitmap);

    void setTitleImageLayout(int i, int i2);
}
