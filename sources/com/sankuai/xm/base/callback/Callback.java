package com.sankuai.xm.base.callback;

import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public interface Callback<T> {
    @Keep
    void onFailure(int i, String str);

    void onSuccess(T t);
}
