package com.sankuai.waimai.store.mrn.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p {
    public static ChangeQuickRedirect a;
    public String b;
    public long c;

    public static p a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb75ebe95a4f925b0c9961add5e71a48", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb75ebe95a4f925b0c9961add5e71a48");
        }
        p pVar = new p();
        pVar.b = str;
        pVar.c = System.currentTimeMillis();
        return pVar;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5926c115c4a6f0c35661273719bc4afe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5926c115c4a6f0c35661273719bc4afe")).intValue();
        }
        if (this.b != null) {
            return this.b.hashCode();
        }
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48546838b1b84dc8cb9bb21f2b754e46", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48546838b1b84dc8cb9bb21f2b754e46")).booleanValue();
        }
        if (this.b != null) {
            return this.b.equals(obj);
        }
        return super.equals(obj);
    }
}
