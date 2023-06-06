package com.meituan.mmp.main;

import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface Downloader {

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public interface Callback {
        void onFail(String str);

        void onProgress(long j, long j2);

        void onSuccess(String str, long j);

        void onTimeout();
    }

    void cancel(String str);

    void download(String str, String str2, Callback callback);
}
