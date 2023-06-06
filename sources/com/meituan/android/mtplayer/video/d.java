package com.meituan.android.mtplayer.video;

import android.graphics.Bitmap;
import android.view.View;
import com.meituan.android.mtplayer.video.callback.DisplayMode;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface d {
    void a(int i, int i2);

    void a(c cVar);

    boolean a();

    void b(int i, int i2);

    void b(c cVar);

    Bitmap getVideoBitmap();

    View getView();

    void setDisplayOpaque(boolean z);

    void setVideoDisplayMode(@DisplayMode int i);

    void setVideoRotation(int i);
}
