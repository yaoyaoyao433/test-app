package com.sankuai.waimai.store.widgets.tag;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualtag.j;
import com.sankuai.waimai.platform.widget.tag.virtualtag.k;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.platform.widget.tag.virtualtag.a<c> {
    public static ChangeQuickRedirect c;
    public boolean d;
    public a e;
    private boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public d(Context context, List<c> list, boolean z) {
        super(context, null);
        Object[] objArr = {context, null, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c077eb7bfb35357bb02cec848552b02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c077eb7bfb35357bb02cec848552b02");
        } else {
            this.f = z;
        }
    }

    private c a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e02e8386a7916c824342eb4b1870a70", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e02e8386a7916c824342eb4b1870a70");
        }
        c d = c.d();
        d.i = cVar.i;
        d.h = cVar.h;
        d.n = false;
        d.g = cVar.g;
        g.a e = g.a.e();
        e.i = Integer.valueOf(this.f ? 0 : cVar.e.e.i.intValue());
        g.b e2 = g.b.e();
        e2.d = Integer.valueOf(this.f ? 0 : cVar.e.f.d.intValue());
        e2.e = 1.0f;
        int a2 = h.a(this.b, 4.0f);
        float f = a2;
        e2.f = new float[]{f, f, f, f};
        d.e = g.a(e, e2, 0);
        d.k = new ArrayList();
        com.sankuai.waimai.platform.widget.tag.virtualview.render.h e3 = com.sankuai.waimai.platform.widget.tag.virtualview.render.h.e();
        e3.e = false;
        e3.f = ((com.sankuai.waimai.platform.widget.tag.model.g) cVar.k.get(0)).p.f;
        e3.d = h.a(this.b, 11.0f);
        e3.i = a2;
        e3.h = this.f ? 0 : ((com.sankuai.waimai.platform.widget.tag.model.g) cVar.k.get(0)).p.h;
        com.sankuai.waimai.platform.widget.tag.model.g a3 = com.sankuai.waimai.platform.widget.tag.model.g.a(e3);
        a3.e = 0;
        a3.d = ((com.sankuai.waimai.platform.widget.tag.model.g) cVar.k.get(0)).d;
        g.a e4 = g.a.e();
        if (!this.f) {
            e4.i = cVar.k.get(0).n.e.i;
        }
        e4.f();
        a3.n = g.a(e4, g.b.e(), 0);
        d.k.add(a3);
        return d;
    }

    private int a(c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24edfda336157a6d5b8cb8c9a8f7d0f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24edfda336157a6d5b8cb8c9a8f7d0f")).intValue() : (cVar != null && cVar.l) ? cVar.m : i;
    }

    private int a(j jVar) {
        int i = 0;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480b93f1ccd40278985eb7685ed853fa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480b93f1ccd40278985eb7685ed853fa")).intValue();
        }
        if (jVar.d().isEmpty()) {
            return 0;
        }
        for (com.sankuai.waimai.platform.widget.tag.virtualtag.d dVar : jVar.d()) {
            if (dVar.i.f > i) {
                i = dVar.i.f;
            }
        }
        return i;
    }

    private c[] b(c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ad7f66c09ff5fd276856548a6f3892", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ad7f66c09ff5fd276856548a6f3892") : i < cVar.a(this.b, i)[0] ? new c[2] : new c[]{null, cVar};
    }

    private c[] a(c cVar, int i, int i2, boolean z) {
        c cVar2;
        c cVar3 = null;
        if (cVar == null || cVar.k == null || cVar.k.isEmpty()) {
            return null;
        }
        List<com.sankuai.waimai.platform.widget.tag.model.a> arrayList = new ArrayList<>(cVar.k);
        int i3 = i;
        List<com.sankuai.waimai.platform.widget.tag.model.a> list = null;
        boolean z2 = false;
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : cVar.k) {
            if (aVar != null) {
                if (aVar.e != 2) {
                    z2 = true;
                } else if (!z2) {
                    arrayList.remove(aVar);
                }
                int a2 = a(aVar, i3);
                if (a2 > i2) {
                    return null;
                }
                if (list == null) {
                    list = new ArrayList<>();
                }
                if (aVar.f + a2 + aVar.g > i3) {
                    if (list.isEmpty()) {
                        cVar2 = null;
                    } else {
                        com.sankuai.waimai.platform.widget.tag.model.a aVar2 = list.get(list.size() - 1);
                        if (aVar2 != null && aVar2.e == 2) {
                            list.remove(aVar2);
                        }
                        cVar2 = a(cVar, list);
                    }
                    if (!z) {
                        arrayList.removeAll(list);
                        if (!arrayList.isEmpty()) {
                            com.sankuai.waimai.platform.widget.tag.model.a aVar3 = arrayList.get(0);
                            if (aVar3 != null && aVar3.e == 2) {
                                arrayList.remove(aVar3);
                            }
                            cVar3 = a(cVar, arrayList);
                        }
                    }
                    return new c[]{cVar2, cVar3};
                }
                i3 -= (aVar.f + a2) + aVar.g;
                list.add(aVar);
            }
        }
        return null;
    }

    private c a(c cVar, List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {cVar, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b98cc6f3bf2ce5a43fceae7f50e70884", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b98cc6f3bf2ce5a43fceae7f50e70884");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        c cVar2 = new c();
        cVar2.i = cVar.i;
        cVar2.k = list;
        cVar2.j = cVar.j;
        cVar2.e = cVar.e;
        return cVar2;
    }

    @Nullable
    private c[] a(c cVar, int i, boolean z, int i2) {
        boolean z2;
        boolean z3;
        Object[] objArr = {cVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5394da2466804b37ad57c823e1a086", RobustBitConfig.DEFAULT_VALUE)) {
            return (c[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5394da2466804b37ad57c823e1a086");
        }
        if (cVar == null || cVar.k == null || cVar.k.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(cVar.k);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int b = b(arrayList, 0);
        if (b <= 2) {
            if (a(this.b, i, arrayList, 0, true) == b) {
                arrayList3.clear();
                arrayList2 = arrayList;
                z3 = false;
                z2 = true;
            } else {
                if (a(arrayList, i2)) {
                    arrayList2.clear();
                    arrayList3.clear();
                } else {
                    int a2 = a(this.b, i, arrayList, 0, false);
                    if (a2 == 0) {
                        if (z) {
                            arrayList2.clear();
                        } else {
                            arrayList2.clear();
                        }
                        arrayList3 = arrayList;
                        z3 = false;
                        z2 = true;
                    } else {
                        arrayList2.addAll(a(arrayList, 0, a2, 0));
                        arrayList3.clear();
                    }
                }
                z2 = true;
                z3 = false;
            }
        } else if (a(this.b, i, arrayList)) {
            arrayList3.clear();
            arrayList2 = arrayList;
            z3 = false;
            z2 = true;
        } else {
            if (a(arrayList, i2)) {
                arrayList2.clear();
                arrayList3.clear();
            } else {
                int a3 = a(this.b, i, arrayList, 0, true);
                if (a3 < 2) {
                    int a4 = a(this.b, i, arrayList, 0, false);
                    if (a4 == 0) {
                        if (z) {
                            arrayList2.clear();
                        } else {
                            arrayList2.clear();
                        }
                        arrayList3 = arrayList;
                        z3 = false;
                        z2 = true;
                    } else if (z) {
                        arrayList2.addAll(a(arrayList, 0, a4, 0));
                        z2 = true;
                        arrayList3.addAll(a(arrayList, a4, b - 1, 0));
                        z3 = true;
                    } else {
                        z2 = true;
                        arrayList2.addAll(a(arrayList, 0, a4, 0));
                        arrayList3.addAll(a(arrayList, a4, b - 1, 0));
                        z3 = false;
                    }
                } else if (z) {
                    arrayList2.addAll(a(arrayList, 0, a3, 0));
                    arrayList3.addAll(a(arrayList, a3, b, 0));
                } else {
                    arrayList2.addAll(a(arrayList, 0, a3, 0));
                    int i3 = b - 1;
                    arrayList2.addAll(a(arrayList, i3, b, 0));
                    arrayList3.addAll(a(arrayList, a3, i3, 0));
                }
            }
            z2 = true;
            z3 = false;
        }
        a((List<com.sankuai.waimai.platform.widget.tag.model.a>) arrayList2, false);
        a(arrayList3, z2);
        c a5 = a(cVar, arrayList2);
        c a6 = a(cVar, arrayList3);
        if (a6 != null && z3) {
            a6.i = 1L;
        }
        return new c[]{a5, a6};
    }

    private boolean a(Context context, int i, @NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {context, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36ae33c5e1ec76550e10756596778ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36ae33c5e1ec76550e10756596778ef")).booleanValue();
        }
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
            if (aVar != null) {
                int a2 = a(aVar, i) + aVar.f + aVar.g;
                if (i < a2) {
                    return false;
                }
                i -= a2;
            }
        }
        return true;
    }

    private boolean a(List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672bab48d766f7573c253645da3320d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672bab48d766f7573c253645da3320d5")).booleanValue();
        }
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : list) {
            if (aVar != null && a(aVar, i) > i) {
                return true;
            }
        }
        return false;
    }

    private int a(Context context, int i, @NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i2, boolean z) {
        List<com.sankuai.waimai.platform.widget.tag.model.a> a2;
        Object[] objArr = {context, Integer.valueOf(i), list, 0, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10b617fb0dd37ebad89d8070fb5a5328", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10b617fb0dd37ebad89d8070fb5a5328")).intValue();
        }
        int b = b(list, 0);
        if (b >= 2) {
            if (z && (a2 = a(list, b - 1, b, 0)) != null) {
                b--;
                i -= c(a2, i);
            }
            int i3 = 0;
            while (i3 < b) {
                int i4 = i3 + 1;
                List<com.sankuai.waimai.platform.widget.tag.model.a> a3 = a(list, i3, i4, 0);
                if (a3 != null) {
                    int c2 = c(a3, i);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45672815a04b0af1af8cef6c8c8f82f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45672815a04b0af1af8cef6c8c8f82f5")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14f2044bb6864ebbda8cf6272d53bbe5", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14f2044bb6864ebbda8cf6272d53bbe5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7487da1c114ee1c710127163dee16dcb", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7487da1c114ee1c710127163dee16dcb");
        }
        if (i >= 0 && i < i2) {
            return list.subList(a(list, i, 0)[0], a(list, i2 - 1, 0)[1]);
        }
        return new ArrayList();
    }

    private c[] a(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd78c6e09b7a8885d87cd391960b9a29", RobustBitConfig.DEFAULT_VALUE)) {
            return (c[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd78c6e09b7a8885d87cd391960b9a29");
        }
        if (cVar == null || cVar.k == null || cVar.k.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(cVar.k);
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
        return new c[]{a(cVar, arrayList), null};
    }

    private int a(com.sankuai.waimai.platform.widget.tag.model.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0b0c637170d6aaf5cf1d38654090ebd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0b0c637170d6aaf5cf1d38654090ebd")).intValue();
        }
        if (aVar != null) {
            int[] a2 = aVar.a(this.b, (i - aVar.f) - aVar.g);
            if (a2.length >= 2) {
                return a2[0];
            }
            return 0;
        }
        return 0;
    }

    private int c(List<com.sankuai.waimai.platform.widget.tag.model.a> list, int i) {
        int i2 = 0;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13d8049c200aad2fdb49b70417a97814", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13d8049c200aad2fdb49b70417a97814")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac87b8a8e273f390e80c8ac985ce080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac87b8a8e273f390e80c8ac985ce080");
        } else if (z) {
            c(list);
        } else {
            d(list);
        }
    }

    private void c(List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904a33894014256b69e114a9f836df37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904a33894014256b69e114a9f836df37");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cb206e613e84503a81f1d584c4f510c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cb206e613e84503a81f1d584c4f510c");
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

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.waimai.platform.widget.tag.virtualtag.d c(@android.support.annotation.NonNull com.sankuai.waimai.store.widgets.tag.c r19, int r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.widgets.tag.d.c(com.sankuai.waimai.store.widgets.tag.c, int):com.sankuai.waimai.platform.widget.tag.virtualtag.d");
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.a
    public final List<j> a(List<c> list, TagCanvasView.b bVar) {
        Object[] objArr = {list, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1ab4e9c346f760cd77553125f4b597", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1ab4e9c346f760cd77553125f4b597");
        }
        this.d = false;
        if (com.sankuai.shangou.stone.util.a.b(list) || bVar == null) {
            return new ArrayList();
        }
        int i = bVar.a;
        if (i == 1) {
            return c(list, bVar);
        }
        if (!this.f) {
            return b(list, bVar);
        }
        return a(list, bVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0139  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.sankuai.waimai.platform.widget.tag.virtualtag.j> a(java.util.List<com.sankuai.waimai.store.widgets.tag.c> r42, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.b r43, int r44) {
        /*
            Method dump skipped, instructions count: 951
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.widgets.tag.d.a(java.util.List, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView$b, int):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.sankuai.waimai.platform.widget.tag.virtualtag.j> b(java.util.List<com.sankuai.waimai.store.widgets.tag.c> r27, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.b r28) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.widgets.tag.d.b(java.util.List, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView$b):java.util.List");
    }

    private List<j> c(List<c> list, TagCanvasView.b bVar) {
        Object[] objArr = {list, bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9af839d72535df7e75963d318a2256", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9af839d72535df7e75963d318a2256");
        }
        int i = bVar.c;
        int min = Math.min(bVar.e, h.a(this.b));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<com.sankuai.waimai.platform.widget.tag.virtualtag.d> arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList<com.sankuai.waimai.platform.widget.tag.virtualtag.d> arrayList5 = new ArrayList();
        for (c cVar : list) {
            if (cVar.g == 0) {
                arrayList2.add(cVar);
            } else {
                arrayList4.add(cVar);
            }
        }
        k d = k.d(0);
        while (true) {
            if (arrayList4.size() <= 0) {
                break;
            }
            c cVar2 = (c) arrayList4.remove(0);
            if (cVar2 != null && !com.sankuai.shangou.stone.util.a.b(cVar2.k)) {
                int i2 = min - i;
                if (i2 >= cVar2.a(this.b, i2)[0]) {
                    com.sankuai.waimai.platform.widget.tag.virtualtag.d c2 = c(cVar2, i2);
                    min -= c2.i.e + i;
                    arrayList5.add(c2);
                    if (min <= 0) {
                        break;
                    }
                } else {
                    this.d = true;
                    break;
                }
            }
        }
        if (min > 0) {
            while (true) {
                if (arrayList2.size() <= 0) {
                    break;
                }
                c cVar3 = (c) arrayList2.remove(0);
                if (cVar3 != null && !com.sankuai.shangou.stone.util.a.b(cVar3.k)) {
                    int i3 = arrayList3.isEmpty() ? min : min - i;
                    if (i3 >= cVar3.a(this.b, i3)[0]) {
                        com.sankuai.waimai.platform.widget.tag.virtualtag.d c3 = c(cVar3, i3);
                        if (arrayList3.isEmpty()) {
                            min -= c3.i.e;
                        } else {
                            min -= c3.i.e + i;
                        }
                        arrayList3.add(c3);
                        if (min <= 0) {
                            break;
                        }
                    } else {
                        this.d = true;
                        break;
                    }
                }
            }
        }
        for (com.sankuai.waimai.platform.widget.tag.virtualtag.d dVar : arrayList3) {
            if (!d.e()) {
                dVar.l = i;
            }
            d.a(dVar);
        }
        for (com.sankuai.waimai.platform.widget.tag.virtualtag.d dVar2 : arrayList5) {
            if (!d.e()) {
                dVar2.l = i;
            }
            d.a(dVar2);
        }
        int a2 = a(d);
        d.c(0);
        d.g = a2;
        d.b(0);
        arrayList.add(d);
        if (this.e != null) {
            this.e.a(arrayList.size());
        }
        return arrayList;
    }
}
