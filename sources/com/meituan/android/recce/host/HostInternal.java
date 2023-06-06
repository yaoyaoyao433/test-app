package com.meituan.android.recce.host;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class HostInternal {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract void applyViewChanged(long j, int i);

    public abstract void asyncInvokeBridge(int i, byte[] bArr);

    public abstract boolean callbackSend(long j, byte[] bArr);

    public abstract void postDelayedMessage(long j, long j2);

    public abstract void reportError(int i, int i2, int i3, String str, String str2);

    public abstract byte[] syncInvokeBridge(String str, String str2);
}
