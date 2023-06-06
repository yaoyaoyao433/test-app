package com.sankuai.waimai.store.search.ui.result.dynamictag;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.platform.widget.tag.virtualtag.a<c> {
    public static ChangeQuickRedirect c;
    public boolean d;
    public boolean e;

    public d(Context context, List<c> list) {
        super(context, null);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb8a28eaef01853bb557c9c4109f91b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb8a28eaef01853bb557c9c4109f91b");
            return;
        }
        this.d = false;
        this.e = false;
    }

    private int a(j jVar) {
        int i = 0;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12d03c8eda12f4e18fad67f30f1e84a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12d03c8eda12f4e18fad67f30f1e84a9")).intValue();
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

    private c[] a(c cVar, int i, int i2, boolean z) {
        c cVar2;
        c cVar3 = null;
        if (cVar == null || cVar.i == null || cVar.i.isEmpty()) {
            return null;
        }
        List<com.sankuai.waimai.platform.widget.tag.model.a> arrayList = new ArrayList<>(cVar.i);
        int i3 = i;
        List<com.sankuai.waimai.platform.widget.tag.model.a> list = null;
        boolean z2 = false;
        for (com.sankuai.waimai.platform.widget.tag.model.a aVar : cVar.i) {
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
                i3 -= (aVar.f + a) + aVar.g;
                list.add(aVar);
            }
        }
        return null;
    }

    private c a(c cVar, List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {cVar, list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d57a5c7f6358dbf70c1e4b5945b10df", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d57a5c7f6358dbf70c1e4b5945b10df");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        c cVar2 = new c();
        cVar2.g = cVar.g;
        cVar2.i = list;
        cVar2.h = cVar.h;
        cVar2.e = cVar.e;
        return cVar2;
    }

    private boolean a(Context context, int i, @NonNull List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {context, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c8d749cd37ccfc03cfddd75b49a0db", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c8d749cd37ccfc03cfddd75b49a0db")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28aea9cb934e2bd44e342180172476e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28aea9cb934e2bd44e342180172476e0")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a96683d4fbc4298bf4c569c266e8d74e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a96683d4fbc4298bf4c569c266e8d74e")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df1f496b5a704f6d89c081684ce166b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df1f496b5a704f6d89c081684ce166b")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31fd081b22828c07c92017db8abec72d", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31fd081b22828c07c92017db8abec72d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac46ae82b1eeac03dcf4aee287cf0ebe", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac46ae82b1eeac03dcf4aee287cf0ebe");
        }
        if (i >= 0 && i < i2) {
            return list.subList(a(list, i, 0)[0], a(list, i2 - 1, 0)[1]);
        }
        return new ArrayList();
    }

    private c[] a(c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38c24f787907d909ad42e15f224388a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (c[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38c24f787907d909ad42e15f224388a9");
        }
        if (cVar == null || cVar.i == null || cVar.i.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(cVar.i);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1acb7c068e1b4e30c845d07a4eb7c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1acb7c068e1b4e30c845d07a4eb7c4")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b24a8235c8789e0dca6a1ebe31ee44d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b24a8235c8789e0dca6a1ebe31ee44d")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fea596f8444c4a92e14927fc7c3b445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fea596f8444c4a92e14927fc7c3b445");
        } else if (z) {
            c(list);
        } else {
            d(list);
        }
    }

    private void c(List<com.sankuai.waimai.platform.widget.tag.model.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c919c932b8a662d76251d17a8f3866df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c919c932b8a662d76251d17a8f3866df");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8602875939edfb0b4cab9923dfc3fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8602875939edfb0b4cab9923dfc3fa1");
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
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sankuai.waimai.platform.widget.tag.virtualtag.d a(@android.support.annotation.NonNull com.sankuai.waimai.store.search.ui.result.dynamictag.c r19, int r20) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.result.dynamictag.d.a(com.sankuai.waimai.store.search.ui.result.dynamictag.c, int):com.sankuai.waimai.platform.widget.tag.virtualtag.d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x04e5, code lost:
        r1 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03e3  */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v73 */
    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.waimai.platform.widget.tag.virtualtag.j> a(java.util.List<com.sankuai.waimai.store.search.ui.result.dynamictag.c> r37, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView.b r38) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.result.dynamictag.d.a(java.util.List, com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView$b):java.util.List");
    }
}
