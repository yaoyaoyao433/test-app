package com.meituan.android.ptcommonim.pageadapter.message.item;

import com.meituan.android.ptcommonim.pageadapter.message.item.b;
import com.meituan.android.ptcommonim.pageadapter.message.view.PTIMMachRootView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final b.AnonymousClass2 b;

    private e(b.AnonymousClass2 anonymousClass2) {
        this.b = anonymousClass2;
    }

    public static Runnable a(b.AnonymousClass2 anonymousClass2) {
        Object[] objArr = {anonymousClass2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc1360b9ee0f4d96812f6c4577cad830", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc1360b9ee0f4d96812f6c4577cad830") : new e(anonymousClass2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a633610abc6d63e4ccc94551f4d589f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a633610abc6d63e4ccc94551f4d589f");
            return;
        }
        b.AnonymousClass2 anonymousClass2 = this.b;
        Object[] objArr2 = {anonymousClass2};
        ChangeQuickRedirect changeQuickRedirect2 = b.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a671fa10a5631a9676813c88c8407847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a671fa10a5631a9676813c88c8407847");
            return;
        }
        PTIMMachRootView pTIMMachRootView = b.this.n;
        if (pTIMMachRootView == null || !b.this.h) {
            return;
        }
        pTIMMachRootView.a(-1);
    }
}
