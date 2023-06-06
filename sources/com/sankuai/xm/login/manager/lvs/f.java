package com.sankuai.xm.login.manager.lvs;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static ChangeQuickRedirect a;
    int b;
    final c c;

    public f(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be14998ac78849632815502a30dc8641", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be14998ac78849632815502a30dc8641");
        } else {
            this.c = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1604533c3c50ee87592dc18dbc74402c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1604533c3c50ee87592dc18dbc74402c")).booleanValue() : list == null || list.isEmpty();
    }

    public final List<com.sankuai.xm.login.manager.lvs.a> b(List<com.sankuai.xm.base.proto.protosingal.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6dd86756be0b204314cae3d4387f4f", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6dd86756be0b204314cae3d4387f4f");
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int min = Math.min(8, (size - 1) + 3);
        this.b = min;
        for (int i = 0; i < size; i++) {
            com.sankuai.xm.base.proto.protosingal.a aVar = list.get(i);
            com.sankuai.xm.login.manager.lvs.a a2 = com.sankuai.xm.login.manager.lvs.a.a(aVar.b, aVar.c, aVar.d, aVar.e);
            if (3 >= min) {
                a2.f = 3;
            } else {
                a2.f = min;
                min--;
            }
            if (a2.b()) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final List<com.sankuai.xm.login.manager.lvs.a> c(List<com.sankuai.xm.base.proto.protosingal.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7865a4c67e259a1f5c3dbf255f173976", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7865a4c67e259a1f5c3dbf255f173976");
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.sankuai.xm.base.proto.protosingal.a aVar = list.get(i);
            com.sankuai.xm.login.manager.lvs.a a2 = com.sankuai.xm.login.manager.lvs.a.a(aVar.b, aVar.c, aVar.d, aVar.e);
            a2.f = 0;
            a2.g = true;
            if (a2.b()) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final List<com.sankuai.xm.login.manager.lvs.a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bcfab3e466aabc9a90a214481d0108", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bcfab3e466aabc9a90a214481d0108");
        }
        e a2 = this.c != null ? this.c.a() : null;
        if (a2 != null) {
            this.b = a2.a;
            if (!a(a2.b)) {
                d(a2.b);
                if (a2.b.get(0).f <= 0) {
                    return null;
                }
            }
            return a2.b;
        }
        return null;
    }

    public final void d(List<com.sankuai.xm.login.manager.lvs.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7953eb2f1db2ba68694f0ab8f471adac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7953eb2f1db2ba68694f0ab8f471adac");
        } else {
            Collections.sort(list, new a());
        }
    }

    public final void a(List<com.sankuai.xm.base.proto.protosingal.a> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7213a7ca0b6f1360098a27cb22ecaf4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7213a7ca0b6f1360098a27cb22ecaf4f");
        } else if (!com.sankuai.xm.base.util.b.a(list) && !ac.a(str) && this.c != null) {
            ArrayList arrayList = new ArrayList();
            for (com.sankuai.xm.base.proto.protosingal.a aVar : list) {
                com.sankuai.xm.login.manager.lvs.a a2 = com.sankuai.xm.login.manager.lvs.a.a(aVar.b, aVar.c, aVar.d, aVar.e);
                if (a2.b()) {
                    arrayList.add(a2);
                }
            }
            this.c.a(arrayList, str);
            if (ac.a(str, com.sankuai.xm.network.setting.f.a().b().a(this.c.b))) {
                com.sankuai.xm.network.setting.f.a().b().a(list);
            }
        }
    }

    public final List<com.sankuai.xm.base.proto.protosingal.a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf5c34071c06389c78a3c3bd775832bc", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf5c34071c06389c78a3c3bd775832bc");
        }
        List<com.sankuai.xm.login.manager.lvs.a> b = this.c != null ? this.c.b() : null;
        if (com.sankuai.xm.base.util.b.a(b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.xm.login.manager.lvs.a aVar : b) {
            com.sankuai.xm.base.proto.protosingal.a aVar2 = new com.sankuai.xm.base.proto.protosingal.a();
            aVar2.b = aVar.b;
            aVar2.c = aVar.c;
            aVar2.d = aVar.e;
            aVar2.e = aVar.i;
            arrayList.add(aVar2);
        }
        return arrayList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a implements Comparator<com.sankuai.xm.login.manager.lvs.a> {
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.sankuai.xm.login.manager.lvs.a aVar, com.sankuai.xm.login.manager.lvs.a aVar2) {
            com.sankuai.xm.login.manager.lvs.a aVar3 = aVar;
            com.sankuai.xm.login.manager.lvs.a aVar4 = aVar2;
            Object[] objArr = {aVar3, aVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2648706f4631168ceeb19b8105a9f9f", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2648706f4631168ceeb19b8105a9f9f")).intValue();
            }
            if (aVar3.f < aVar4.f) {
                return 1;
            }
            return (aVar3.f == aVar4.f || aVar3.f <= aVar4.f) ? 0 : -1;
        }
    }

    public final void a(com.sankuai.xm.login.manager.lvs.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4311403deb39fc0931d685dfcdfe503e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4311403deb39fc0931d685dfcdfe503e");
        } else if (aVar != null) {
            aVar.f = Math.min(b(aVar), aVar.g ? 0 : this.b);
        }
    }

    private int b(com.sankuai.xm.login.manager.lvs.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f055e69dbdf01aaf28496672b86c310", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f055e69dbdf01aaf28496672b86c310")).intValue();
        }
        if (aVar.g) {
            if (aVar.f < -3) {
                return -3;
            }
            return aVar.f + 1;
        } else if (aVar.f < 0) {
            return 0;
        } else {
            return aVar.f + 1;
        }
    }
}
