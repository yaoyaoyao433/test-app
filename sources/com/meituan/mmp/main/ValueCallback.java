package com.meituan.mmp.main;

import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface ValueCallback<T> {
    void onCancel();

    void onFail(String str);

    void onSuccess(T t);
}
