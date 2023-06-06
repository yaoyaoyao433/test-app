package com.meituan.android.recce.host;

import com.meituan.android.recce.host.binary.BinReader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceHostHandler$$Lambda$1 implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecceHostHandler arg$1;
    private final BinReader arg$2;

    public RecceHostHandler$$Lambda$1(RecceHostHandler recceHostHandler, BinReader binReader) {
        this.arg$1 = recceHostHandler;
        this.arg$2 = binReader;
    }

    public static Runnable lambdaFactory$(RecceHostHandler recceHostHandler, BinReader binReader) {
        Object[] objArr = {recceHostHandler, binReader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5de394b4d46c1db4fbecae0b675b0abb", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5de394b4d46c1db4fbecae0b675b0abb") : new RecceHostHandler$$Lambda$1(recceHostHandler, binReader);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eb025f1b24254e4bfb48d694a0ea315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eb025f1b24254e4bfb48d694a0ea315");
        } else {
            RecceHostHandler.lambda$applyViewChanged$0(this.arg$1, this.arg$2);
        }
    }
}
