package com.taobao.gcanvas.adapters.img;

import android.content.Context;
import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IGImageLoader {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface ImageCallback {
        void onCancel();

        void onFail(Object obj);

        void onSuccess(Bitmap bitmap);
    }

    void load(Context context, String str, ImageCallback imageCallback);
}
