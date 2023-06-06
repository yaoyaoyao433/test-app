package com.dianping.dataservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;
    private String b;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6973a8c12be05a203c334babb0644d87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6973a8c12be05a203c334babb0644d87");
        } else {
            this.b = str;
        }
    }

    @Override // com.dianping.dataservice.c
    public final String a() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }
}
