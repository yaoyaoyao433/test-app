package com.sankuai.waimai.store.goods.list.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.interfaces.a;
import com.sankuai.waimai.store.repository.model.g;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.widgets.recycler.a<com.sankuai.waimai.store.widgets.recycler.e> {
    public static ChangeQuickRedirect a;
    List<g> b;
    com.sankuai.waimai.store.goods.list.mach.a c;
    private final com.sankuai.waimai.store.goods.list.delegate.d d;
    private final LayoutInflater e;
    private a.InterfaceC1266a f;
    private int g;
    private long h;
    private boolean i;
    private SparseArray<g> j;

    public d(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, a.InterfaceC1266a interfaceC1266a) {
        Object[] objArr = {dVar, interfaceC1266a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66503aa86a8a1af829599edc14dc7f71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66503aa86a8a1af829599edc14dc7f71");
            return;
        }
        this.b = new ArrayList();
        this.f = interfaceC1266a;
        this.d = dVar;
        this.e = LayoutInflater.from(dVar.k());
    }

    public final void a(@Nullable List<g> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f301b277c5180f8fa9b3fa878b4272", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f301b277c5180f8fa9b3fa878b4272");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            this.b.addAll(list);
            for (int i = 0; i < this.b.size(); i++) {
                a(i, (g) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i));
            }
            if (this.j != null && this.j.size() > 0) {
                Iterator<g> it = this.b.iterator();
                while (it.hasNext()) {
                    g next = it.next();
                    if ((next == null || next.p == null || next.p.a) ? false : true) {
                        it.remove();
                    }
                }
            }
            m();
            c();
        }
    }

    public final void a(@Nullable g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac87b577bcdbb8d3a97d097e934ee7d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac87b577bcdbb8d3a97d097e934ee7d0");
        } else if (!a(this.b.size() - 1, gVar)) {
            this.b.add(gVar);
            m();
        } else {
            c();
        }
    }

    private boolean a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb455b2030bef3bb33841cc638bf97e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb455b2030bef3bb33841cc638bf97e6")).booleanValue();
        }
        if (b(gVar) && g.a(gVar.g)) {
            if (this.j == null) {
                this.j = new SparseArray<>();
            }
            gVar.p = new com.sankuai.waimai.store.repository.model.e(null);
            this.j.put(i, gVar);
            return true;
        }
        return false;
    }

    private static boolean b(g gVar) {
        return gVar != null && gVar.p == null;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c3d5e1ac46a988a495520e454411e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c3d5e1ac46a988a495520e454411e4");
        } else if (this.j == null || this.j.size() <= 0) {
        } else {
            while (this.j.size() > 0) {
                final int keyAt = this.j.keyAt(0);
                final g valueAt = this.j.valueAt(0);
                this.j.removeAt(0);
                al.a(new al.a() { // from class: com.sankuai.waimai.store.goods.list.adapter.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.util.al.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10c37d60eacf0dc73c3ac12f723cf59b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10c37d60eacf0dc73c3ac12f723cf59b");
                            return;
                        }
                        d.this.b();
                        d.this.c.a(keyAt, valueAt, "", 0);
                    }

                    @Override // com.sankuai.waimai.store.util.al.a
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb77c10e3440353fe09d3d20118e61ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb77c10e3440353fe09d3d20118e61ed");
                        } else if (valueAt.p.a) {
                            d.this.b.add(keyAt, valueAt);
                            d.this.m();
                        }
                    }
                }, this.d.l());
            }
        }
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0b4e7c2e4b8e7ecd84af39c96894a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0b4e7c2e4b8e7ecd84af39c96894a94");
        } else if (this.c == null) {
            this.c = new com.sankuai.waimai.store.goods.list.mach.a(this.d.k(), new com.sankuai.waimai.store.goods.list.mach.b(this.d.k(), this.d.b()));
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final com.sankuai.waimai.store.widgets.recycler.e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91347e2a99c916810a4438a7a34b67d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.widgets.recycler.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91347e2a99c916810a4438a7a34b67d");
        }
        if (i != 8) {
            if (i != 11) {
                switch (i) {
                    case 1:
                        return new com.sankuai.waimai.store.goods.list.viewblocks.content.holder.b(this.e.inflate(R.layout.wm_sc_view_three_column_floor_b, viewGroup, false), this.d, this.f);
                    case 2:
                        return new com.sankuai.waimai.store.goods.list.viewblocks.content.holder.d(this.d, this.f);
                    default:
                        return null;
                }
            }
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            b();
            return new com.sankuai.waimai.store.goods.list.viewblocks.content.holder.c(frameLayout, this.c);
        }
        return new com.sankuai.waimai.store.goods.list.viewblocks.content.holder.contract.a(this.e.inflate(R.layout.wm_st_goods_list_layout_retail_guess_title, viewGroup, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0484  */
    @Override // com.sankuai.waimai.store.widgets.recycler.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.store.widgets.recycler.e r32, int r33) {
        /*
            Method dump skipped, instructions count: 2000
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.adapter.d.a(com.sankuai.waimai.store.widgets.recycler.e, int):void");
    }

    public final void a(long j, boolean z) {
        Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92a2b3623899271b6e56eff5b63f00d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92a2b3623899271b6e56eff5b63f00d2");
            return;
        }
        this.i = z;
        this.h = j;
        m();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55c4e0abbab3ec9430dc18e15a52c142", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55c4e0abbab3ec9430dc18e15a52c142")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66856033c1f8aa2e08a412960ab9a0ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66856033c1f8aa2e08a412960ab9a0ed")).intValue();
        }
        g gVar = (g) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (gVar == null) {
            return 1;
        }
        return gVar.b;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a, com.sankuai.waimai.store.widgets.recycler.i
    public final void a(@NonNull com.sankuai.waimai.store.widgets.recycler.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887de891ad5d4ce748d268355a6681e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887de891ad5d4ce748d268355a6681e1");
            return;
        }
        super.a(eVar);
        if (eVar instanceof com.sankuai.waimai.store.goods.list.viewblocks.content.holder.c) {
            com.sankuai.waimai.store.goods.list.viewblocks.content.holder.c cVar = (com.sankuai.waimai.store.goods.list.viewblocks.content.holder.c) eVar;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.viewblocks.content.holder.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "8ef81257f7817172784dbac90ed063ba", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "8ef81257f7817172784dbac90ed063ba");
            } else if (cVar.b.b() != null) {
                cVar.b.b().b(cVar.c);
            }
        }
    }
}
