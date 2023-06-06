package com.sankuai.xm.im.vcard;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    List<Long> b;
    int c;
    public short d;
    public String e;
    public String f;
    public int g;
    long h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd38f4c0be207dee989fb36dcfa6864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd38f4c0be207dee989fb36dcfa6864");
        } else {
            this.b = new ArrayList();
        }
    }

    public static d a(long j, int i, short s, String str, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Short.valueOf(s), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16cf8f1b93174965e15f71df942b5b01", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16cf8f1b93174965e15f71df942b5b01") : a(j, i, s, str, i2, 0L);
    }

    public static d a(long j, int i, short s) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1236ad2ce36c6fe63e4c95cf89425a52", 6917529027641081856L) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1236ad2ce36c6fe63e4c95cf89425a52") : a(j, i, s, null, 0, 0L);
    }

    private static d a(long j, int i, short s, String str, int i2, long j2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Short.valueOf(s), str, Integer.valueOf(i2), 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fc0ebf1c50eecba956ccbf23c4c36c9", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fc0ebf1c50eecba956ccbf23c4c36c9");
        }
        d dVar = new d();
        dVar.b.add(Long.valueOf(j));
        dVar.c = i;
        dVar.d = s;
        dVar.f = str;
        dVar.g = i2;
        dVar.h = 0L;
        return dVar;
    }

    public static d a(@NonNull List<Long> list, int i, short s, long j) {
        Object[] objArr = {list, Integer.valueOf(i), Short.valueOf(s), 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef8465d522963f2e5e44759091ee55b1", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef8465d522963f2e5e44759091ee55b1");
        }
        d dVar = new d();
        dVar.b.addAll(list);
        dVar.c = i;
        dVar.d = s;
        dVar.h = 0L;
        return dVar;
    }

    public final long a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7adbbd11b43221f818b58a3ac0c028c", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7adbbd11b43221f818b58a3ac0c028c")).longValue();
        }
        if (this.b.isEmpty()) {
            return 0L;
        }
        return this.b.get(0).longValue();
    }

    public final d a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e6bec4289b7a9becc5f690e96c4fea", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e6bec4289b7a9becc5f690e96c4fea");
        }
        this.b.addAll(dVar.b);
        this.c = dVar.c;
        this.d = dVar.d;
        this.f = dVar.f;
        this.g = dVar.g;
        this.h = dVar.h;
        this.e = dVar.e;
        return this;
    }
}
