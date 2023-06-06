package com.meituan.android.legwork.ui.component.pickerview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements com.meituan.android.legwork.ui.component.pickerview.listener.b {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.android.legwork.ui.component.pickerview.listener.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9349f625aa88dc05c318a49105f6a507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9349f625aa88dc05c318a49105f6a507");
        } else {
            a.a(this.b);
        }
    }
}
