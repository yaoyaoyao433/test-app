package com.meituan.android.ptcommonim.video.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTIMRecordFragment b;

    private h(PTIMRecordFragment pTIMRecordFragment) {
        this.b = pTIMRecordFragment;
    }

    public static Runnable a(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = {pTIMRecordFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a861b65e68ccc53dd880ed4ea8a212f", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a861b65e68ccc53dd880ed4ea8a212f") : new h(pTIMRecordFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59cf6372962735f82ebea58fa698d733", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59cf6372962735f82ebea58fa698d733");
        } else {
            PTIMRecordFragment.b(this.b);
        }
    }
}
