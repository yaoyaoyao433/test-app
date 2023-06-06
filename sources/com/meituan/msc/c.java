package com.meituan.msc;

import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import com.facebook.infer.annotation.ThreadConfined;
import com.meituan.msc.jse.bridge.ReadableArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c {
    <T> T a();

    @UiThread
    @ThreadConfined(ThreadConfined.UI)
    void a(int i, int i2, int i3);

    void a(int i, int i2, @Nullable ReadableArray readableArray);

    void a(int i, String str, @Nullable ReadableArray readableArray);
}
