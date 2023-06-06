package com.hhmedic.android.sdk.listener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface HHCallListener {
    void onCallSuccess();

    void onCancel();

    void onFail(int i);

    void onFinish(long j);

    void onStart(String str);
}
