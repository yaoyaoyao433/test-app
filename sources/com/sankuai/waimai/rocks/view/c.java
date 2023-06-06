package com.sankuai.waimai.rocks.view;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.rocks.view.mach.h;
import com.sankuai.waimai.rocks.view.mach.i;
import com.sankuai.waimai.rocks.view.viewmodel.d;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    private com.sankuai.waimai.rocks.view.b d;
    private com.sankuai.waimai.rocks.view.mach.a e;
    private d f;
    private Set<String> g;
    private int h;
    private h i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        boolean a(com.sankuai.waimai.rocks.node.a aVar, boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(com.sankuai.waimai.rocks.node.a aVar);

        void a(e eVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.rocks.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1133c {
        void a(d dVar);

        void a(List<com.sankuai.waimai.rocks.node.a> list);
    }

    public c(Context context, com.sankuai.waimai.rocks.view.mach.a aVar, d dVar, boolean z, boolean z2, boolean z3, String str, boolean z4) {
        Object[] objArr = {context, aVar, dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str, Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13938fd67bb38a2e8f9266c3bc865f73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13938fd67bb38a2e8f9266c3bc865f73");
            return;
        }
        this.g = new HashSet();
        this.d = new com.sankuai.waimai.rocks.view.b(context, g.a(context), 0, z4);
        this.e = aVar;
        this.f = dVar;
        this.h = 0;
        this.b = 0;
        this.c = z4;
        if (z) {
            this.i = new com.sankuai.waimai.rocks.view.mach.g(this.f, this.e, z2, str);
        } else {
            this.i = new i(this.f, this.e, z2, str);
        }
    }

    public final void a(int i, a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fec0c26b5e425906b5faed8ea55aa41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fec0c26b5e425906b5faed8ea55aa41");
            return;
        }
        int size = this.f.o.size();
        if (i <= 0 || i >= size) {
            return;
        }
        Iterator<e> it = this.f.o.iterator();
        for (int i2 = 0; it.hasNext() && i2 < size; i2++) {
            e next = it.next();
            if (next != null && next.s != null && i2 >= size - i) {
                String a2 = next.s.a();
                if (this.g.contains(a2)) {
                    this.g.remove(a2);
                }
                if (aVar == null || aVar.a(next.s, false)) {
                    this.h--;
                }
                this.b--;
                it.remove();
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882e0629a4c8f3d7e4cc05c61f585ef9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882e0629a4c8f3d7e4cc05c61f585ef9");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.f.o)) {
            for (e eVar : this.f.o) {
                if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                    ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).n();
                } else if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.b) {
                    a((com.sankuai.waimai.rocks.view.viewmodel.b) eVar);
                }
            }
            this.f.o.clear();
        }
    }

    public final void a(com.sankuai.waimai.rocks.node.b bVar, boolean z, boolean z2, boolean z3, InterfaceC1133c interfaceC1133c, a aVar) {
        e cVar;
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), interfaceC1133c, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c61ddb1145ec063b6db0463c0bfd8b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c61ddb1145ec063b6db0463c0bfd8b9");
            return;
        }
        this.d.b = bVar;
        if (!z) {
            this.f.p = this.d.a();
            this.h = 0;
            this.b = 0;
            this.g.clear();
            a();
        }
        this.f.q = this.d.b();
        this.d.c = z2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b += bVar.b.size();
        int size = this.f.o.size();
        for (int i = 0; i < bVar.b.size(); i++) {
            com.sankuai.waimai.rocks.node.a aVar2 = bVar.b.get(i);
            String a2 = aVar2.a();
            if (TextUtils.isEmpty(aVar2.e) || !this.g.contains(a2)) {
                new com.sankuai.waimai.rocks.view.viewmodel.c();
                if ("mach".equals(aVar2.m)) {
                    cVar = new com.sankuai.waimai.rocks.view.viewmodel.a();
                    cVar.u = 0;
                } else if (aVar2.b()) {
                    cVar = a(aVar2);
                } else {
                    cVar = new com.sankuai.waimai.rocks.view.viewmodel.c();
                    cVar.u = aVar2.c.hashCode();
                }
                if (this.c) {
                    if (TextUtils.equals("fall", bVar.a)) {
                        cVar.z = false;
                    } else if (TextUtils.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, bVar.a)) {
                        cVar.z = true;
                    }
                }
                cVar.s = aVar2;
                cVar.b = this.f.b;
                cVar.v = this.h;
                this.d.a(aVar2, size + i);
                arrayList.add(cVar);
                arrayList2.add(aVar2);
                if (!TextUtils.isEmpty(aVar2.e)) {
                    this.g.add(a2);
                }
                if (aVar == null || aVar.a(aVar2, true)) {
                    this.h++;
                }
            }
        }
        interfaceC1133c.a(arrayList2);
        h hVar = this.i;
        Object[] objArr2 = {interfaceC1133c, arrayList, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = h.b;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "58cfbb730a459ce09bfe63133f487b00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "58cfbb730a459ce09bfe63133f487b00");
        } else if (hVar.f) {
            hVar.a(interfaceC1133c, arrayList, z3);
        } else {
            hVar.b(interfaceC1133c, arrayList, z3);
        }
    }

    private void a(com.sankuai.waimai.rocks.view.viewmodel.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b2d9f787326649420ad1db8c666b89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b2d9f787326649420ad1db8c666b89");
        } else if (bVar.o != null && !bVar.o.isEmpty()) {
            for (e eVar : bVar.o) {
                if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                    ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).n();
                }
            }
        }
    }

    private com.sankuai.waimai.rocks.view.viewmodel.b a(com.sankuai.waimai.rocks.node.a aVar) {
        e cVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f39aa743bd11be421c5457093d2dcb9", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.viewmodel.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f39aa743bd11be421c5457093d2dcb9");
        }
        com.sankuai.waimai.rocks.view.viewmodel.b bVar = new com.sankuai.waimai.rocks.view.viewmodel.b();
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.rocks.node.a aVar2 : aVar.k) {
            if ("mach".equals(aVar2.m)) {
                cVar = new com.sankuai.waimai.rocks.view.viewmodel.a();
                cVar.u = 0;
            } else {
                cVar = new com.sankuai.waimai.rocks.view.viewmodel.c();
                cVar.u = aVar2.c.hashCode();
            }
            cVar.s = aVar2;
            cVar.v = this.h;
            arrayList.add(cVar);
        }
        bVar.o = arrayList;
        bVar.u = aVar.c.hashCode();
        bVar.s = aVar;
        bVar.v = this.h;
        return bVar;
    }

    public final void a(com.sankuai.waimai.rocks.node.a aVar, int i, boolean z, b bVar) {
        Object[] objArr = {aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aea0e586ab1118cb14505db4b0b0df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aea0e586ab1118cb14505db4b0b0df3");
            return;
        }
        e a2 = a(aVar, i, z);
        bVar.a(aVar);
        if (a2 == null) {
            return;
        }
        this.i.a(a2, bVar);
    }

    private e a(com.sankuai.waimai.rocks.node.a aVar, int i, boolean z) {
        Object[] objArr = {aVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c9174ec6ddd8eb339f09a0f6f54bcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c9174ec6ddd8eb339f09a0f6f54bcf");
        }
        e eVar = null;
        if (TextUtils.isEmpty(aVar.e) || !this.g.contains(aVar.a())) {
            if ("mach".equals(aVar.m)) {
                eVar = new com.sankuai.waimai.rocks.view.viewmodel.a();
                eVar.u = 0;
            } else {
                eVar = new com.sankuai.waimai.rocks.view.viewmodel.c();
                eVar.u = aVar.c.hashCode();
            }
            eVar.s = aVar;
            eVar.v = i;
            this.d.c = z;
            this.d.a(aVar, i);
        }
        return eVar;
    }
}
