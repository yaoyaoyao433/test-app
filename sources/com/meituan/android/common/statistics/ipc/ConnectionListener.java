package com.meituan.android.common.statistics.ipc;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ConnectionListener {
    void onConnectSuccess();

    void onConnectionFail(int i, String str);
}
