package com.meituan.android.recce.host;

import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceBridgeHandler$RecceInterfaceCallbackInternal$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecceBridgeHandler.RecceInterfaceCallbackInternal arg$1;
    private final int arg$2;
    private final String arg$3;
    private final String arg$4;

    public RecceBridgeHandler$RecceInterfaceCallbackInternal$$Lambda$1(RecceBridgeHandler.RecceInterfaceCallbackInternal recceInterfaceCallbackInternal, int i, String str, String str2) {
        this.arg$1 = recceInterfaceCallbackInternal;
        this.arg$2 = i;
        this.arg$3 = str;
        this.arg$4 = str2;
    }

    public static Runnable lambdaFactory$(RecceBridgeHandler.RecceInterfaceCallbackInternal recceInterfaceCallbackInternal, int i, String str, String str2) {
        Object[] objArr = {recceInterfaceCallbackInternal, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ee90991878cf68b2d38a71fc8ecb173", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ee90991878cf68b2d38a71fc8ecb173") : new RecceBridgeHandler$RecceInterfaceCallbackInternal$$Lambda$1(recceInterfaceCallbackInternal, i, str, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e46f47c7bb45cd8ed83b8541b6356d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e46f47c7bb45cd8ed83b8541b6356d02");
        } else {
            RecceBridgeHandler.RecceInterfaceCallbackInternal.lambda$send$0(this.arg$1, this.arg$2, this.arg$3, this.arg$4);
        }
    }
}
