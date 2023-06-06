package com.meituan.msi.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class o {
    public static ChangeQuickRedirect t;
    public final List<o> u;
    public final String v;

    public o(String str, ArrayList<o> arrayList) {
        Object[] objArr = {str, arrayList};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb3ef04050d85ef7c54f54cf330b1b17", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb3ef04050d85ef7c54f54cf330b1b17");
            return;
        }
        this.v = str;
        this.u = arrayList;
    }

    public final o a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003218cc0ca6cb2804927daa64cb6131", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003218cc0ca6cb2804927daa64cb6131");
        }
        if (str == null || this.u == null || this.u.isEmpty()) {
            return null;
        }
        for (int i = 0; i < this.u.size(); i++) {
            if (str.equals(this.u.get(i).v)) {
                return this.u.get(i);
            }
        }
        return null;
    }
}
