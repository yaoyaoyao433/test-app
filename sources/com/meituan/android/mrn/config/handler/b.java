package com.meituan.android.mrn.config.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.mrn.utils.config.f<b> {
    public static ChangeQuickRedirect a;
    final String b;

    @Override // com.meituan.android.mrn.utils.config.f
    public final /* bridge */ /* synthetic */ b a() {
        return this;
    }

    public b(com.meituan.android.mrn.utils.config.c<b> cVar, String str) {
        super(cVar);
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d771fa41453b88bace98260ebf60dd83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d771fa41453b88bace98260ebf60dd83");
        } else {
            this.b = str;
        }
    }
}
