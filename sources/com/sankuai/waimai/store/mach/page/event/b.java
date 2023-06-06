package com.sankuai.waimai.store.mach.page.event;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements Mach.d {
    public static ChangeQuickRedirect a;
    private Context b;
    private long c;
    private long d;
    private Runnable e;

    public b(Context context) {
        this(context, 0L, 0L, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40329297bff77153f35adf11084bf62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40329297bff77153f35adf11084bf62");
        }
    }

    public b(Context context, long j, long j2, Runnable runnable) {
        Object[] objArr = {context, new Long(j), new Long(j2), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0cb97b62682617501d9afb803030daa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0cb97b62682617501d9afb803030daa");
            return;
        }
        this.b = context;
        this.c = j;
        this.d = j2;
        this.e = runnable;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    @Override // com.sankuai.waimai.mach.Mach.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull java.lang.String r13, @android.support.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.mach.page.event.b.a(java.lang.String, java.util.Map):void");
    }
}
