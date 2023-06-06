package com.sankuai.waimai.mach.widget.decorations;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.utils.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c950373005c3688c3ac2bd2bb87d9a1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c950373005c3688c3ac2bd2bb87d9a1d");
            return;
        }
        this.d = -16777216;
        this.e = 0;
        this.b = (int) i.c(strArr[0]);
        this.c = (int) i.c(strArr[1]);
        if (strArr.length > 2) {
            this.e = (int) i.c(strArr[2]);
            if (strArr.length > 3) {
                this.d = i.a(strArr[3]);
            }
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "040910cd525c277f3cdffdba8750dc4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "040910cd525c277f3cdffdba8750dc4d")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.e == bVar.e && this.d == bVar.d && this.b == bVar.b && this.c == bVar.c;
        }
        return false;
    }
}
