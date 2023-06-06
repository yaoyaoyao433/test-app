package com.meituan.msc.extern;

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

        void onSuccess(String str);

        void onTimeout();
    }

    void cancel(String str);

    void download(String str, String str2, Callback callback);
}
