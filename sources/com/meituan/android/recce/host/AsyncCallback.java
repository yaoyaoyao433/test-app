package com.meituan.android.recce.host;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class AsyncCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long callbackRef;
    private HostImplement hostImplement;

    public AsyncCallback(HostImplement hostImplement, long j) {
        Object[] objArr = {hostImplement, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "242628c35562ff7a5bfa872f62291608", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "242628c35562ff7a5bfa872f62291608");
            return;
        }
        this.hostImplement = hostImplement;
        this.callbackRef = j;
    }

    public final boolean send(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7f03edf6a535b5bfe59996951e4cfd9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7f03edf6a535b5bfe59996951e4cfd9")).booleanValue();
        }
        if (this.hostImplement == null) {
            return false;
        }
        boolean callbackSend = this.hostImplement.callbackSend(this.callbackRef, bArr);
        this.hostImplement = null;
        return callbackSend;
    }
}
