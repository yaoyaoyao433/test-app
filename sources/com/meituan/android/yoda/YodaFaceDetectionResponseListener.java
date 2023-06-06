package com.meituan.android.yoda;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class YodaFaceDetectionResponseListener {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public void onFaceDeFail() {
    }

    @Deprecated
    public void onFaceDeFail(int i) {
    }

    @Deprecated
    public void onFaceDeFail(int i, String str) {
    }

    public void onFaceDetSuccess() {
    }

    @Deprecated
    public abstract void onFaceDetectionResponse(com.meituan.android.yoda.model.a[] aVarArr);
}
