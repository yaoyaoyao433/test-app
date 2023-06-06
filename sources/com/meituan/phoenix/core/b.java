package com.meituan.phoenix.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import okhttp3.Dns;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends a {
    public static ChangeQuickRedirect f;
    public Dns g;
    public long h;
    public long i;
    public long j;

    public b(a aVar) {
        super(aVar.b);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36bc08a1046460647225faae90b92ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36bc08a1046460647225faae90b92ff");
            return;
        }
        this.h = -1L;
        this.i = -1L;
        this.j = -1L;
        a(aVar.c);
        a(aVar.e);
        this.d = true;
    }
}
