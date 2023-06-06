package com.meituan.android.ptcommonim.pageadapter.widget;

import com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTFrameMachContainer.AnonymousClass1 b;

    private c(PTFrameMachContainer.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static Runnable a(PTFrameMachContainer.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc307e3d2007819f5cfe8c1dd871f51a", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc307e3d2007819f5cfe8c1dd871f51a") : new c(anonymousClass1);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PTFrameMachContainer.b bVar;
        PTFrameMachContainer.b bVar2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01bdbbf39103c77f49ca2cebb3a5e3c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01bdbbf39103c77f49ca2cebb3a5e3c6");
            return;
        }
        PTFrameMachContainer.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect2 = PTFrameMachContainer.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1244c31eabfd8a76ab7d2af9c3c0a7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1244c31eabfd8a76ab7d2af9c3c0a7e0");
            return;
        }
        bVar = PTFrameMachContainer.this.f;
        if (bVar != null) {
            bVar2 = PTFrameMachContainer.this.f;
            bVar2.a();
        }
    }
}
