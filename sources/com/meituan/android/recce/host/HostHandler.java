package com.meituan.android.recce.host;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface HostHandler {
    void applyViewChanged(int i, byte[] bArr);

    void asyncInvokeBridge(String str, String str2, AsyncCallback asyncCallback);

    String[] getViewManagerNameList();

    void reportError(int i, int i2, int i3, String str, String str2);

    byte[] syncInvokeBridge(String str, String str2);
}
