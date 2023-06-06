package com.meituan.android.mrn.config.handler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g extends com.meituan.android.mrn.utils.config.f<g> {
    public static ChangeQuickRedirect a;
    final String b;
    final String c;

    @Override // com.meituan.android.mrn.utils.config.f
    public final /* bridge */ /* synthetic */ g a() {
        return this;
    }

    public g(com.meituan.android.mrn.utils.config.c<g> cVar, String str, String str2) {
        super(cVar);
        Object[] objArr = {cVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f275766573f96e2be2edf032eb29e01c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f275766573f96e2be2edf032eb29e01c");
            return;
        }
        this.b = str;
        this.c = str2;
    }
}
