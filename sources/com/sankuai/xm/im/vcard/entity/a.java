package com.sankuai.xm.im.vcard.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.p;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public long e;
    public short f;
    public short g;
    public String h;
    public String i;
    public short j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d181dc42b4d38c61311ce017a149e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d181dc42b4d38c61311ce017a149e5");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0L;
        this.f = (short) 0;
        this.g = (short) 1;
        this.h = "";
        this.i = null;
        this.j = (short) 1;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d85e620120913e49e2efa5199c2e78", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d85e620120913e49e2efa5199c2e78");
        }
        return "VCardInfo{avatarUrl='" + this.b + "', name='" + this.d + "', status='" + ((int) this.j) + "', infoId='" + this.e + "'}";
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d84db1ca88811a7b9c1a74ea776983", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d84db1ca88811a7b9c1a74ea776983")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.e == aVar.e && this.f == aVar.f && ac.a(this.h, aVar.h);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a85c32d6a3fdb6b766560ed4c22dfa", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a85c32d6a3fdb6b766560ed4c22dfa")).intValue() : p.a(Long.valueOf(this.e), Short.valueOf(this.f), this.h);
    }
}
