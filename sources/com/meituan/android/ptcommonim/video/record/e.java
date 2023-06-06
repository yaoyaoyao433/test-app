package com.meituan.android.ptcommonim.video.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTIMRecordFragment b;

    private e(PTIMRecordFragment pTIMRecordFragment) {
        this.b = pTIMRecordFragment;
    }

    public static Runnable a(PTIMRecordFragment pTIMRecordFragment) {
        Object[] objArr = {pTIMRecordFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "467273c7dc42e4c4d346967323baede1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "467273c7dc42e4c4d346967323baede1") : new e(pTIMRecordFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a86b6a42b51cef36780d2ad764be7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a86b6a42b51cef36780d2ad764be7e");
        } else {
            PTIMRecordFragment.a(this.b);
        }
    }
}
