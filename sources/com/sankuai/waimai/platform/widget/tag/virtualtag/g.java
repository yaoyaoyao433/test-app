package com.sankuai.waimai.platform.widget.tag.virtualtag;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends a<com.sankuai.waimai.platform.widget.tag.model.d> {
    public static ChangeQuickRedirect c;
    public boolean d;
    protected Set<Map<String, String>> e;
    public c<Map<String, String>> f;
    private boolean i;
    private boolean j;
    private List<d> k;

    public g(Context context, List<com.sankuai.waimai.platform.widget.tag.model.d> list) {
        super(context, list);
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64efc0a03eb172c3ffff0ac21e4a73b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64efc0a03eb172c3ffff0ac21e4a73b");
        } else {
            this.d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0332  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v72 */
    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.waimai.platform.widget.tag.virtualtag.j> a(java.util.List<com.sankuai.waimai.platform.widget.tag.model.d> r37, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.b r38) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.widget.tag.virtualtag.g.a(java.util.List, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView$b):java.util.List");
    }

    private int a(j jVar) {
        int i = 0;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b833ce95bf8640c05f6534c4a22226bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b833ce95bf8640c05f6534c4a22226bf")).intValue();
        }
        if (jVar.d().isEmpty()) {
            return 0;
        }
        for (d dVar : jVar.d()) {
            if (dVar.i.f > i) {
                i = dVar.i.f;
            }
        }
        return i;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.a
    public final void a(List<j> list) {
        this.i = false;
        this.j = false;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07903527cf8dab904ea806e4d4b0f312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07903527cf8dab904ea806e4d4b0f312");
        } else if (this.e == null) {
        } else {
            if (this.f != null && this.e.size() > 0) {
                this.f.a(this.e);
            }
            this.e.clear();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.a
    public final void b(List<com.sankuai.waimai.platform.widget.tag.model.d> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af5cb8d3a9344d8c74b6361818b4092c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af5cb8d3a9344d8c74b6361818b4092c");
            return;
        }
        if (this.e == null) {
            this.e = new LinkedHashSet();
        } else {
            this.e.clear();
        }
        super.b(list);
    }

    public final List<d> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d6bff462fc998452036bde0724d05c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d6bff462fc998452036bde0724d05c");
        }
        if (this.i) {
            if (this.k == null) {
                return Collections.emptyList();
            }
            return Collections.unmodifiableList(this.k);
        }
        this.i = true;
        List<j> b = b();
        if (b.isEmpty()) {
            return Collections.emptyList();
        }
        if (this.k == null) {
            this.k = new ArrayList();
        } else {
            this.k.clear();
        }
        for (j jVar : b) {
            if (jVar != null && !jVar.e()) {
                this.k.addAll(jVar.d());
            }
        }
        if (this.k == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(this.k);
    }

    private com.sankuai.waimai.platform.widget.tag.model.d[] a(com.sankuai.waimai.platform.widget.tag.model.d dVar, int i, int i2, boolean z) {
        com.sankuai.waimai.platform.widget.tag.model.d dVar2;
        com.sankuai.waimai.platform.widget.tag.model.d dVar3 = null;
        if (dVar == null || dVar.f == null || dVar.f.isEmpty()) {
            return null;
        }
        List<com.sankuai.waimai.platform.widget.tag.model.a> arrayList = new ArrayList<>(dVar.f);
        int i3 = i;
        List<com.sankuai.waimai.platform.widget.tag.model.a> list = null;
        boolean z2 = false;
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : dVar.f) {
            if (aVar != null) {
                if (aVar.e != 2) {
                    z2 = true;
                } else if (!z2) {
                    arrayList.remove(aVar);
                }
                int a = a(aVar, i3);
                if (a > i2) {
                    return null;
                }
                if (list == null) {
                    list = new ArrayList<>();
                }
                if (aVar.f + a + aVar.g > i3) {
                    if (list.isEmpty()) {
                        dVar2 = null;
                    } else {
                        com.sankuai.waimai.platform.widget.tag.model.a aVar2 = list.get(list.size() - 1);
                        if (aVar2 != null && aVar2.e == 2) {
                            list.remove(aVar2);
                        }
                        dVar2 = a(dVar, list);
                    }
                    if (!z) {
                        arrayList.removeAll(list);
                        if (!arrayList.isEmpty()) {
                            com.sankuai.waimai.platform.widget.tag.model.a aVar3 = arrayList.get(0);
                            if (aVar3 != null && aVar3.e == 2) {
                                arrayList.remove(aVar3);
                            }
                            dVar3 = a(dVar, arrayList);
                        }
                    }
                    return new com.sankuai.waimai.platform.widget.tag.model.d[]{dVar2, dVar3};
                }
                i3 -= (aVar.f + a) + aVar.g;
                list.add(aVar);
            }
        }
        return null;
    }

    private com.sankuai.waimai.platform.widget.tag.model.d a(com.sankuai.waimai.platform.widget.tag.model.d dVar, List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {dVar, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764cccd13570e52e3aeae331a7863966", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.tag.model.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764cccd13570e52e3aeae331a7863966");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.sankuai.waimai.platform.widget.tag.model.d dVar2 = new com.sankuai.waimai.platform.widget.tag.model.d();
        dVar2.d = dVar.d;
        dVar2.f = list;
        dVar2.e = dVar.e;
        dVar2.n = dVar.n;
        dVar2.j = dVar.j;
        dVar2.o = dVar.o;
        return dVar2;
    }

    private boolean a(Context context, int i, @NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {context, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "041aae3b5432473de06a78b7c3542e36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "041aae3b5432473de06a78b7c3542e36")).booleanValue();
        }
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
            if (aVar != null) {
                int a = a(aVar, i) + aVar.f + aVar.g;
                if (i < a) {
                    return false;
                }
                i -= a;
            }
        }
        return true;
    }

    private boolean a(List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36e5ec16095b3d20292eada587583a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36e5ec16095b3d20292eada587583a8")).booleanValue();
        }
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
            if (aVar != null && a(aVar, i) > i) {
                return true;
            }
        }
        return false;
    }

    private int a(Context context, int i, @NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i2, boolean z) {
        List<com.sankuai.waimai.platform.widget.tag.model.a> a;
        Object[] objArr = {context, Integer.valueOf(i), list, 0, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e62c581fdb646afe97803b6d40e2fe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e62c581fdb646afe97803b6d40e2fe")).intValue();
        }
        int b = b(list, 0);
        if (b >= 2) {
            if (z && (a = a(list, b - 1, b, 0)) != null) {
                b--;
                i -= c(a, i);
            }
            int i3 = 0;
            while (i3 < b) {
                int i4 = i3 + 1;
                List<com.sankuai.waimai.platform.widget.tag.model.a> a2 = a(list, i3, i4, 0);
                if (a2 != null) {
                    int c2 = c(a2, i);
                    if (i < c2) {
                        return i3;
                    }
                    i -= c2;
                }
                i3 = i4;
            }
            return i3;
        }
        return 0;
    }

    private int b(List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i) {
        int i2 = 0;
        Object[] objArr = {list, 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c59150dd5937d750f0b7a1bb6489dc8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c59150dd5937d750f0b7a1bb6489dc8")).intValue();
        }
        if (list != null && !list.isEmpty()) {
            for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
                if (aVar != null && aVar.e == 0) {
                    i2++;
                }
            }
        }
        return i2;
    }

    private int[] a(@NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i, int i2) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b370a0188e2985ca83a881ce795e9238", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b370a0188e2985ca83a881ce795e9238");
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
            i3++;
            if (aVar != null && aVar.e == i2) {
                if (i4 == i) {
                    break;
                }
                i4++;
                i5 = i3;
            }
        }
        return new int[]{i5, i3};
    }

    private List<com.sankuai.waimai.platform.widget.tag.model.a> a(@NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i, int i2, int i3) {
        Object[] objArr = {list, Integer.valueOf(i), Integer.valueOf(i2), 0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1129c368121ca0b95b7f49483819757a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1129c368121ca0b95b7f49483819757a");
        }
        if (i >= 0 && i < i2) {
            return list.subList(a(list, i, 0)[0], a(list, i2 - 1, 0)[1]);
        }
        return new ArrayList();
    }

    private com.sankuai.waimai.platform.widget.tag.model.d[] a(com.sankuai.waimai.platform.widget.tag.model.d dVar, int i, int i2) {
        Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bf8d29805f0dffc26d848a72612ade", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.platform.widget.tag.model.d[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bf8d29805f0dffc26d848a72612ade");
        }
        if (dVar == null || dVar.f == null || dVar.f.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(dVar.f);
        int i3 = 0;
        while (true) {
            if (i3 >= arrayList.size()) {
                i3 = 0;
                break;
            }
            com.sankuai.waimai.platform.widget.tag.model.a aVar = arrayList.get(i3);
            if (aVar != null && a(aVar, i) + aVar.f + aVar.g > i) {
                break;
            }
            i3++;
        }
        if (i3 == 0) {
            return null;
        }
        arrayList.removeAll(arrayList.subList(i3, arrayList.size()));
        return new com.sankuai.waimai.platform.widget.tag.model.d[]{a(dVar, arrayList), null};
    }

    private int a(com.sankuai.waimai.platform.widget.tag.model.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0da3f74e1bf78d5b0473fcb6d247b86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0da3f74e1bf78d5b0473fcb6d247b86")).intValue();
        }
        if (aVar != null) {
            int[] a = aVar.a(this.b, (i - aVar.f) - aVar.g);
            if (a.length >= 2) {
                return a[0];
            }
            return 0;
        }
        return 0;
    }

    private int c(List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i) {
        int i2 = 0;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4ec6b8f5f77bc6a9310a56201e41b12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4ec6b8f5f77bc6a9310a56201e41b12")).intValue();
        }
        if (list != null) {
            for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
                if (aVar != null) {
                    i2 += a(aVar, i) + aVar.f + aVar.g;
                }
            }
        }
        return i2;
    }

    private void a(List<com.sankuai.waimai.platform.widget.tag.model.a> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddb013e097f55b0ddab4b7fae07ecf0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddb013e097f55b0ddab4b7fae07ecf0f");
        } else if (z) {
            c(list);
        } else {
            d(list);
        }
    }

    private void c(List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "177b81b59722516371bf6bce1d5404c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "177b81b59722516371bf6bce1d5404c3");
        } else if (list == null || list.isEmpty()) {
        } else {
            Iterator<com.sankuai.waimai.platform.widget.tag.model.a> it = list.iterator();
            while (it.hasNext()) {
                com.sankuai.waimai.platform.widget.tag.model.a next = it.next();
                if (next != null && next.e != 2) {
                    return;
                }
                it.remove();
            }
        }
    }

    private void d(List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4d78a8dd2af9ad14f8890bbacd5184", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4d78a8dd2af9ad14f8890bbacd5184");
        } else if (list != null && !list.isEmpty()) {
            for (int size = list.size() - 1; size >= 0; size--) {
                com.sankuai.waimai.platform.widget.tag.model.a aVar = list.get(size);
                if (aVar != null && aVar.e != 2) {
                    return;
                }
                list.remove(size);
            }
        }
    }

    private d a(@NonNull com.sankuai.waimai.platform.widget.tag.model.d dVar, int i) {
        i a;
        char c2 = 0;
        int i2 = 1;
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61148ef60a9b70651e05a9915967947e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61148ef60a9b70651e05a9915967947e");
        }
        ArrayList arrayList = new ArrayList();
        int[] a2 = dVar.a(this.b, i);
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : dVar.f) {
            Object[] objArr2 = new Object[i2];
            objArr2[c2] = aVar;
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62d85b5afeefba2cf040ce642fdd5251", RobustBitConfig.DEFAULT_VALUE)) {
                a = (i) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62d85b5afeefba2cf040ce642fdd5251");
            } else {
                int[] iArr = aVar.l;
                com.sankuai.waimai.platform.widget.tag.virtualview.render.g gVar = aVar.n;
                if (aVar instanceof com.sankuai.waimai.platform.widget.tag.model.g) {
                    a = h.a(com.sankuai.waimai.platform.widget.tag.virtualview.render.f.a(iArr), gVar, ((com.sankuai.waimai.platform.widget.tag.model.g) aVar).p);
                } else if (aVar instanceof com.sankuai.waimai.platform.widget.tag.model.c) {
                    a = b.a(com.sankuai.waimai.platform.widget.tag.virtualview.render.f.a(iArr), gVar, ((com.sankuai.waimai.platform.widget.tag.model.c) aVar).p);
                } else if (aVar instanceof com.sankuai.waimai.platform.widget.tag.model.f) {
                    a = f.a(com.sankuai.waimai.platform.widget.tag.virtualview.render.f.a(iArr), gVar);
                } else {
                    a = aVar instanceof com.sankuai.waimai.platform.widget.tag.model.e ? e.a(com.sankuai.waimai.platform.widget.tag.virtualview.render.f.a(iArr), gVar, ((com.sankuai.waimai.platform.widget.tag.model.e) aVar).p) : null;
                }
                if (a != null) {
                    a.l = aVar.f;
                    a.m = aVar.g;
                    long j = aVar.d;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = i.f;
                    if (PatchProxy.isSupport(objArr3, a, changeQuickRedirect3, false, "4f213464fa9da3d045cd9d36c3319543", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a, changeQuickRedirect3, false, "4f213464fa9da3d045cd9d36c3319543");
                    } else {
                        a.h = j;
                    }
                    com.sankuai.waimai.platform.widget.tag.util.d.a(a, aVar.h);
                    com.sankuai.waimai.platform.widget.tag.util.d.b(a, aVar.i);
                }
            }
            arrayList.add(a);
            c2 = 0;
            i2 = 1;
        }
        return d.a(com.sankuai.waimai.platform.widget.tag.virtualview.render.f.a(a2[0], a2[1]), dVar.n, arrayList, dVar.j, dVar.o);
    }
}
