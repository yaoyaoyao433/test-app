package com.meituan.msc.modules.reporter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class m {
    public static ChangeQuickRedirect a;
    public String b;
    public long c;

    public m(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "947d3b0c7faee5ed22e2e067daefae11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "947d3b0c7faee5ed22e2e067daefae11");
            return;
        }
        this.b = str;
        this.c = j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends m {
        private a(String str, long j) {
            super(str, j);
        }

        public a(String str) {
            this(str, System.currentTimeMillis());
        }
    }
}
