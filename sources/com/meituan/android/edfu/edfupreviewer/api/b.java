package com.meituan.android.edfu.edfupreviewer.api;

import android.graphics.Bitmap;
import android.view.View;
import com.meituan.android.edfu.edfupreviewer.surface.e;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Object obj);
    }

    void a(int i, int i2);

    void a(int i, boolean z);

    Bitmap getBitmap();

    Object getSurface();

    View getView();

    int getViewHeight();

    int getViewWidth();

    void setProduct(com.meituan.android.edfu.edfupreviewer.api.a aVar);

    void setRenderCallback(e eVar);

    void setRenderEnable(boolean z);

    void setSurfaceCallback(a aVar);
}
