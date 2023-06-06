package com.meituan.android.yoda;

import android.support.annotation.Keep;
import com.meituan.android.yoda.retrofit.Error;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public interface IYodaVerifyListener {
    void onCancel(String str);

    void onError(String str, Error error);

    void onFaceVerifyTerminal(String str, Error error, com.meituan.android.yoda.model.a[] aVarArr, String str2);

    void onSuccess(String str, String str2);
}
