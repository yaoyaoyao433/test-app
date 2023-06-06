package com.meituan.android.mtplayer.video.callback;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface IPlayerStateCallback {

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PlayState {
    }

    void a(int i);

    void a(int i, int i2, int i3);
}
