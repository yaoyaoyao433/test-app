package com.meituan.android.ptcommonim.ptcard;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;
    private final com.meituan.android.ptcommonim.ptcard.ptinvoice.b b;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "959f6cfb2b13e2b3c536d0b01a90fa52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "959f6cfb2b13e2b3c536d0b01a90fa52");
            return;
        }
        com.meituan.android.ptcommonim.base.util.a.a(context);
        this.b = new com.meituan.android.ptcommonim.ptcard.ptinvoice.b(context);
    }

    @Override // com.meituan.android.ptcommonim.ptcard.b
    public final d a(int i) {
        return this.b;
    }
}
