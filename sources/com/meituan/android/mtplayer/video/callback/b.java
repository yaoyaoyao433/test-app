package com.meituan.android.mtplayer.video.callback;

import android.support.annotation.FloatRange;
import com.meituan.android.mtplayer.video.BasePlayerParam;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface b<T extends BasePlayerParam> {
    void a(float f);

    void a(float f, float f2);

    void a(int i);

    void b();

    void c();

    void d();

    boolean e();

    void f();

    void g();

    int getCurrentPosition();

    int getDuration();

    void setLooping(boolean z);

    void setPlaySpeed(@FloatRange(from = 0.0d, to = 6.0d) float f);
}
