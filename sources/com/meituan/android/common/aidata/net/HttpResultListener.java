package com.meituan.android.common.aidata.net;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface HttpResultListener {
    void onFail(int i, String str);

    void onSuccess(HttpResult httpResult);
}
