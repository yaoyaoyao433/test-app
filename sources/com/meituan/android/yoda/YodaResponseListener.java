package com.meituan.android.yoda;

import android.support.annotation.Keep;
import com.meituan.android.yoda.retrofit.Error;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface YodaResponseListener {
    void onCancel(String str);

    void onError(String str, Error error);

    void onYodaResponse(String str, String str2);
}
