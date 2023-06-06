package com.dianping.monitor.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k implements com.dianping.monitor.e {
    public static ChangeQuickRedirect a;
    private com.dianping.monitor.e b;

    public k(com.dianping.monitor.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7fefea7b180ad06792527f2b135e94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7fefea7b180ad06792527f2b135e94");
        } else {
            this.b = eVar;
        }
    }

    @Override // com.dianping.monitor.e
    public final void pvCat(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str2, String str3, int i8, String str4, String str5, String str6, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, String str7, String str8) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str2, str3, Integer.valueOf(i8), str4, str5, str6, hashMap, hashMap2, str7, str8};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "233a4bce9657bba48433e9d8d4aceb37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "233a4bce9657bba48433e9d8d4aceb37");
        } else {
            this.b.pvCat(j, str, i, i2, i3, i4, i5, i6, i7, str2, str3, i8, str4, str5, str6, hashMap, hashMap2, str7, str8);
        }
    }

    @Override // com.dianping.monitor.e
    public final void pv(long j, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6af3c5dff349b8bc2421636f01d61c3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6af3c5dff349b8bc2421636f01d61c3c");
        } else {
            this.b.pv(j, str, i, i2, i3, i4, i5, i6);
        }
    }

    @Override // com.dianping.monitor.e
    public final void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00b42984537664e7b7a21285e5f3477f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00b42984537664e7b7a21285e5f3477f");
        } else {
            this.b.pv3(j, str, i, i2, i3, i4, i5, i6, str2);
        }
    }

    @Override // com.dianping.monitor.e
    public final void pv3(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13baf535548a75e327d083257ec50240", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13baf535548a75e327d083257ec50240");
        } else {
            this.b.pv3(j, str, i, i2, i3, i4, i5, i6, str2, i7);
        }
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public final void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3, Integer.valueOf(i7)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba56cc442d51e1a315fccb7bb9edb76a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba56cc442d51e1a315fccb7bb9edb76a");
        } else {
            this.b.pv4(j, str, i, i2, i3, i4, i5, i6, str2, str3, i7);
        }
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public final void pv4(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ec4144932c9c7126ecfdeb5e425fff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ec4144932c9c7126ecfdeb5e425fff");
        } else {
            this.b.pv4(j, str, i, i2, i3, i4, i5, i6, str2, str3);
        }
    }

    @Override // dianping.com.nvlinker.stub.IMonitorService
    public final void flush() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ecbb6121bacd5b4f0724f8932da93e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ecbb6121bacd5b4f0724f8932da93e");
        } else {
            this.b.flush();
        }
    }

    @Override // com.dianping.monitor.e
    public final String getCommand(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0e07d6822c1960bcb38369319fb44ad", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0e07d6822c1960bcb38369319fb44ad") : this.b.getCommand(str);
    }
}
