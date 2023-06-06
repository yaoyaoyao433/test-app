package com.meituan.android.mrn.config.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.meituan.android.mrn.utils.config.f<d> {
    public static ChangeQuickRedirect a;
    final String b;

    @Override // com.meituan.android.mrn.utils.config.f
    public final /* bridge */ /* synthetic */ d a() {
        return this;
    }

    public d(com.meituan.android.mrn.utils.config.c<d> cVar, String str) {
        super(cVar);
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9f6cf4d95ac569343f39d8a335aacd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9f6cf4d95ac569343f39d8a335aacd2");
        } else {
            this.b = str;
        }
    }
}
