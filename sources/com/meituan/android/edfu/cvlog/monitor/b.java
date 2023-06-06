package com.meituan.android.edfu.cvlog.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public boolean b;
    public String c;
    public String d;
    private int e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        int b;
        public boolean c;
        public String d;
        public String e;
    }

    private b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0633d3c755304874ec8c41970167a093", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0633d3c755304874ec8c41970167a093");
            return;
        }
        this.e = aVar.b;
        this.b = aVar.c;
        this.c = aVar.d;
        this.d = aVar.e;
    }
}
