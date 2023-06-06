package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public String d;
    public String e;
    public String f;
    public HashMap<Short, Integer> g;
    public long h;
    public long i;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86375eedad8b4e317e35181d9239599e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86375eedad8b4e317e35181d9239599e");
            return;
        }
        this.b = 0;
        this.c = 0L;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b3397a251c908bd191dfca766e8bb1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b3397a251c908bd191dfca766e8bb1");
            return;
        }
        super.a(bArr);
        this.b = p();
        this.c = q();
        this.d = r();
        this.e = r();
        this.f = r();
        Object a2 = a((short) 0, 0);
        if (a2 != null) {
            this.g = (HashMap) a2;
        }
        this.h = q();
        this.i = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fba27be275160e29d66fe2cccd6a9c25", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fba27be275160e29d66fe2cccd6a9c25");
        }
        return "PLoginRes {uri = " + this.q.b + "resCode=" + this.b + ", uid=" + this.c + ", cookie='" + this.d + "', lastDeviceData='" + this.e + "', alToken='" + this.f + "', traceid=" + this.h + ", time=" + this.i + '}';
    }
}
