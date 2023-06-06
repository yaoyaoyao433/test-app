package com.sankuai.waimai.mach.model.value;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public float b;
    public String c;
    public int d;

    public a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56e31c723fc6288bbf64db52595fdb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56e31c723fc6288bbf64db52595fdb0");
            return;
        }
        this.c = "solid";
        this.d = 0;
        this.b = com.sankuai.waimai.mach.utils.g.a(strArr[0]);
        if (strArr.length > 1) {
            this.c = strArr[1];
            if (strArr.length > 2) {
                this.d = com.sankuai.waimai.mach.utils.i.a(strArr[2]);
            }
        }
    }

    public final float a() {
        return this.b;
    }
}
