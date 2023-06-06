package com.sankuai.waimai.rocks.view.recyclerview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.view.block.d;
import com.sankuai.waimai.rocks.view.block.f;
import com.sankuai.waimai.rocks.view.block.g;
import com.sankuai.waimai.rocks.view.viewmodel.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    public volatile List<e> b;
    com.sankuai.waimai.rocks.view.mach.a c;
    public boolean d;
    public d e;
    @Nullable
    public com.meituan.android.cube.pga.block.a f;
    private List<e> g;
    private com.sankuai.waimai.rocks.view.recyclerview.b h;
    private Fragment i;
    private com.meituan.android.cube.pga.type.a j;
    private d.a k;
    private d.b l;
    @Nullable
    private com.meituan.android.cube.pga.block.a m;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface d {
        void a(View view, int i);
    }

    public a(com.sankuai.waimai.rocks.view.recyclerview.b bVar, com.sankuai.waimai.rocks.view.mach.a aVar, Fragment fragment, com.meituan.android.cube.pga.type.a aVar2, d.a aVar3, boolean z) {
        Object[] objArr = {bVar, aVar, fragment, aVar2, aVar3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9741ac26252a616ee265319793dad545", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9741ac26252a616ee265319793dad545");
            return;
        }
        this.l = new d.b() { // from class: com.sankuai.waimai.rocks.view.recyclerview.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.block.d.b
            public final void a(final int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88f0e96d70471d242511a0d3dc167fd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88f0e96d70471d242511a0d3dc167fd4");
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.rocks.view.recyclerview.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d8b40c49284bf9247b2be89ec9122ce", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d8b40c49284bf9247b2be89ec9122ce");
                                return;
                            }
                            rx.functions.c<a, Integer> d2 = a.this.c.d();
                            if (d2 != null) {
                                d2.a(a.this, Integer.valueOf(i));
                            } else {
                                a.this.notifyDataSetChanged();
                            }
                        }
                    });
                }
            }
        };
        this.b = new ArrayList();
        this.g = new ArrayList();
        this.h = bVar;
        this.c = aVar;
        this.i = fragment;
        this.j = aVar2;
        this.k = aVar3;
        this.d = z;
    }

    public final void a(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ebd36689080836a0fccc35d2441252e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ebd36689080836a0fccc35d2441252e");
            return;
        }
        int size = this.b.size();
        this.b.addAll(list);
        if (size == 0) {
            notifyDataSetChanged();
            return;
        }
        try {
            notifyItemRangeInserted(size + (this.f == null ? 0 : 1), list.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20ac8f393d48cfc903a8cd29fea896bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20ac8f393d48cfc903a8cd29fea896bb");
            return;
        }
        a();
        this.g.addAll(list);
        int size = this.b.size();
        if (size == 0) {
            notifyDataSetChanged();
            return;
        }
        try {
            notifyItemRangeChanged(size + (this.f == null ? 0 : 1), this.g.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9ffc854dcf310a6a16cf656f23ea40d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9ffc854dcf310a6a16cf656f23ea40d");
            return;
        }
        int size = this.g.size();
        this.g.clear();
        int size2 = this.b.size();
        if (size2 == 0) {
            notifyDataSetChanged();
            return;
        }
        try {
            if (this.f != null) {
                i = 1;
            }
            notifyItemRangeRemoved(size2 + i, size);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "164fc67fd5546d3ce0db615241befe10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "164fc67fd5546d3ce0db615241befe10");
            return;
        }
        if (this.f != null) {
            i--;
        }
        if (eVar == null || i < 0 || this.b == null) {
            return;
        }
        if (this.b.size() <= i) {
            this.b.add(eVar);
        } else {
            eVar.w = this.b.get(i).w;
            this.b.add((this.f != null ? 1 : 0) + i, eVar);
            for (int i2 = i + 1; i2 < this.b.size(); i2++) {
                this.b.get(i2).w++;
                eVar.o();
            }
        }
        notifyItemInserted(i);
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae9c68b8fe31b8232843ff2df8030d2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae9c68b8fe31b8232843ff2df8030d2c");
        }
        if (i == -1 && this.f != null) {
            return b.a(viewGroup.getContext());
        }
        if (i != -2 || this.m == null) {
            if (i == -3) {
                return new c(a(viewGroup, i));
            }
            return new c(a(viewGroup, i));
        }
        return b.a(viewGroup.getContext());
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        List<e> list;
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cc73898023c60b3d44df2c0a80a729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cc73898023c60b3d44df2c0a80a729");
            return;
        }
        int itemViewType = getItemViewType(i);
        if (itemViewType == -1) {
            ((b) sVar).a(this.f);
        } else if (itemViewType == -2) {
            ((b) sVar).a(this.m);
        } else {
            sVar.itemView.setTag(R.id.product_mode_tag_key, Integer.valueOf(itemViewType));
            int i2 = i - (this.f == null ? 0 : 1);
            com.sankuai.waimai.foundation.utils.log.a.b("mViewCreateListener", "mViewCreateListener: " + i2, new Object[0]);
            if (this.e != null) {
                this.e.a(sVar.itemView, i2);
            }
            if (i2 < this.b.size()) {
                list = this.b;
            } else {
                list = this.g;
                i2 -= this.b.size();
            }
            e eVar = list.get(i2);
            ViewGroup.LayoutParams layoutParams = sVar.itemView.getLayoutParams();
            if ((layoutParams instanceof StaggeredGridLayoutManager.b) && this.d) {
                ((StaggeredGridLayoutManager.b) layoutParams).b = eVar.z;
            }
            c cVar = (c) sVar;
            if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.b) {
                com.sankuai.waimai.rocks.view.viewmodel.b bVar = (com.sankuai.waimai.rocks.view.viewmodel.b) eVar;
                f fVar = (f) cVar.b;
                Object[] objArr2 = {bVar, fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "022fe872c4841a100656eaed50d498f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "022fe872c4841a100656eaed50d498f3");
                } else if (!a(bVar, fVar)) {
                    fVar.a(a(bVar));
                }
                cVar.a(cVar, bVar, i);
                return;
            }
            cVar.a(cVar, eVar, i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        List<e> list;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c91428a4728ac00cb5a739c23c08a47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c91428a4728ac00cb5a739c23c08a47")).intValue();
        }
        if (this.f == null || i != 0) {
            if (this.m == null || i != getItemCount() - 1) {
                int i2 = i - (this.f == null ? 0 : 1);
                if (i2 < this.b.size()) {
                    list = this.b;
                } else {
                    list = this.g;
                    i2 -= this.b.size();
                }
                e eVar = list.get(i2);
                if (this.d && !eVar.z && eVar.u == 0) {
                    return -3;
                }
                return eVar.u;
            }
            return -2;
        }
        return -1;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb099047135af6840e9dcfd75ec10f7a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb099047135af6840e9dcfd75ec10f7a")).intValue();
        }
        int size = this.b.size() + this.g.size();
        if (this.f != null) {
            size++;
        }
        return this.m != null ? size + 1 : size;
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2af283e8b73e567eec45be4fbfaa5e6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2af283e8b73e567eec45be4fbfaa5e6")).intValue() : this.b.size();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e738a55d3716d13435d32985012b1a1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e738a55d3716d13435d32985012b1a1b");
        } else {
            this.b.clear();
        }
    }

    private boolean a(com.sankuai.waimai.rocks.view.viewmodel.b bVar, f fVar) {
        e eVar;
        Object[] objArr = {bVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa70a4e15a3f66189b53393809590768", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa70a4e15a3f66189b53393809590768")).booleanValue();
        }
        if (bVar.o == null || fVar.q().size() == 0 || bVar.o.size() != fVar.q().size()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (e eVar2 : bVar.o) {
            arrayList.add(eVar2.s.n);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<com.meituan.android.cube.pga.block.a> it = fVar.q().iterator();
        while (it.hasNext()) {
            com.meituan.android.cube.pga.block.a next = it.next();
            if ((next instanceof com.sankuai.waimai.rocks.view.block.a) && (eVar = (e) ((com.sankuai.waimai.rocks.view.block.a) next).G()) != null && eVar.s != null) {
                arrayList2.add(eVar.s.n);
            }
        }
        return arrayList.equals(arrayList2);
    }

    private List<com.meituan.android.cube.pga.block.a> a(com.sankuai.waimai.rocks.view.viewmodel.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e803602bd199b3c7e7f3a9ada308c04", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e803602bd199b3c7e7f3a9ada308c04");
        }
        List<e> list = bVar.o;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (e eVar : bVar.o) {
            arrayList.add(a(eVar.u, list));
        }
        return arrayList;
    }

    private com.sankuai.waimai.rocks.view.block.a a(int i, List<e> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c239e38d41e4065d689e21f8917204ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c239e38d41e4065d689e21f8917204ad");
        }
        if (i == 0) {
            return new com.sankuai.waimai.rocks.view.block.e(this.c, this.h.F(), this.l, this.k);
        }
        return new g(b(i, list));
    }

    private com.sankuai.waimai.rocks.view.block.a a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f35b57536a1eb3e9c293785f635f850c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.rocks.view.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f35b57536a1eb3e9c293785f635f850c");
        }
        if (i == 0 || i == -3) {
            com.sankuai.waimai.rocks.view.block.d dVar = new com.sankuai.waimai.rocks.view.block.d(this.c, this.h.F(), this.l, this.k);
            com.meituan.android.cube.pga.block.a.a(viewGroup, this.h, dVar);
            return dVar;
        }
        com.meituan.android.cube.pga.block.a a2 = a(i);
        if (a2 instanceof com.sankuai.waimai.rocks.view.block.b) {
            ((com.sankuai.waimai.rocks.view.block.b) a2).b(viewGroup);
        }
        f fVar = new f(a2);
        com.meituan.android.cube.pga.block.a.a(viewGroup, this.h, a2);
        return fVar;
    }

    private com.meituan.android.cube.pga.block.a b(int i, List<e> list) {
        com.meituan.android.cube.pga.dynamic.d a2;
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c1a7f4c6b58f2a2d9b99a16b37d3a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c1a7f4c6b58f2a2d9b99a16b37d3a7");
        }
        if (list == null || list.isEmpty()) {
            return new C1135a(this.j);
        }
        for (e eVar : list) {
            if (eVar.u == i && (a2 = com.sankuai.waimai.rocks.utils.a.a(eVar.s.c)) != null) {
                com.sankuai.waimai.rocks.view.block.c F = this.h.F();
                F.r = this.i;
                return (com.meituan.android.cube.pga.block.a) a2.a((com.meituan.android.cube.pga.type.a) F);
            }
        }
        return new C1135a(this.j);
    }

    private com.meituan.android.cube.pga.block.a a(int i) {
        com.meituan.android.cube.pga.dynamic.d a2;
        com.meituan.android.cube.pga.dynamic.d a3;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b138be82fc54f6f2245b01f68d3803b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b138be82fc54f6f2245b01f68d3803b");
        }
        for (e eVar : this.b) {
            if (eVar.u == i && (a3 = com.sankuai.waimai.rocks.utils.a.a(eVar.s.c)) != null) {
                com.sankuai.waimai.rocks.view.block.c F = this.h.F();
                F.r = this.i;
                return (com.meituan.android.cube.pga.block.a) a3.a((com.meituan.android.cube.pga.type.a) F);
            }
        }
        for (e eVar2 : this.g) {
            if (eVar2.u == i && (a2 = com.sankuai.waimai.rocks.utils.a.a(eVar2.s.c)) != null) {
                com.sankuai.waimai.rocks.view.block.c F2 = this.h.F();
                F2.r = this.i;
                return (com.meituan.android.cube.pga.block.a) a2.a((com.meituan.android.cube.pga.type.a) F2);
            }
        }
        return new C1135a(this.j);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        com.meituan.android.cube.pga.block.a b;

        private b(View view) {
            super(view);
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f4846f960a0878123ea3c9e133ef645", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f4846f960a0878123ea3c9e133ef645");
            }
        }

        public static b a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4842440c35bf552164565d42d2d4daef", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4842440c35bf552164565d42d2d4daef");
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new b(frameLayout);
        }

        public final void a(com.meituan.android.cube.pga.block.a aVar) {
            View i;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa1647e92a589b1517a4adf9ec50bd3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa1647e92a589b1517a4adf9ec50bd3");
                return;
            }
            this.b = aVar;
            if (this.b == null || (i = this.b.i()) == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = i.getLayoutParams();
            if (layoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            } else {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
            }
            i.setLayoutParams(marginLayoutParams);
            if (i.getParent() instanceof ViewGroup) {
                ((ViewGroup) i.getParent()).removeView(i);
            }
            ((ViewGroup) this.itemView).removeAllViews();
            ((ViewGroup) this.itemView).addView(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public com.sankuai.waimai.rocks.view.block.a b;
        public e c;

        public c(com.sankuai.waimai.rocks.view.block.a aVar) {
            super(aVar.i());
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ff40361096697719b0356dbd159f96", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ff40361096697719b0356dbd159f96");
            } else {
                this.b = aVar;
            }
        }

        public final void a(c cVar, e eVar, int i) {
            Object[] objArr = {cVar, eVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73c4d3325522f670ebbbf995979ec2a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73c4d3325522f670ebbbf995979ec2a2");
                return;
            }
            eVar.w = i;
            cVar.c = eVar;
            this.b.a((com.sankuai.waimai.rocks.view.block.a) eVar);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.rocks.view.recyclerview.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1135a extends com.sankuai.waimai.rocks.view.block.b<String> {
        public static ChangeQuickRedirect r;

        @Override // com.sankuai.waimai.rocks.view.block.b
        public final /* bridge */ /* synthetic */ void d(String str) {
        }

        public C1135a(com.meituan.android.cube.pga.type.a aVar) {
            super(aVar);
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7b2edf5f9d803997b11c1bc96323e4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7b2edf5f9d803997b11c1bc96323e4d");
            }
        }

        @Override // com.sankuai.waimai.rocks.view.block.b, com.meituan.android.cube.pga.block.a
        public final View a(ViewGroup viewGroup) {
            Object[] objArr = {viewGroup};
            ChangeQuickRedirect changeQuickRedirect = r;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee862650b999d78879b1e78c4d6082d0", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee862650b999d78879b1e78c4d6082d0");
            }
            View view = new View(viewGroup.getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
            return view;
        }
    }

    public final boolean d() {
        return this.f != null;
    }

    public final void a(@Nullable com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b41b2ff21058ce2c295289832442a86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b41b2ff21058ce2c295289832442a86");
        } else if (aVar != null) {
            this.m = aVar;
        } else if (this.m != null) {
            this.m = null;
            notifyItemRemoved(getItemCount() - 1);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewRecycled(@NonNull RecyclerView.s sVar) {
        com.sankuai.waimai.rocks.view.block.a aVar;
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fb536a2b2164ff251a959dc1643dba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fb536a2b2164ff251a959dc1643dba");
            return;
        }
        super.onViewRecycled(sVar);
        if (!(sVar instanceof c) || (aVar = ((c) sVar).b) == null) {
            return;
        }
        aVar.O();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f10cf0a5a41934be9482cd92f88928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f10cf0a5a41934be9482cd92f88928");
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.rocks.view.recyclerview.a.2
                public static ChangeQuickRedirect b;

                @Override // android.support.v7.widget.GridLayoutManager.c
                public final int a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2730d1b4ec399fa7f0849460158c3d2", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2730d1b4ec399fa7f0849460158c3d2")).intValue();
                    }
                    if (a.this.getItemViewType(i) == -2 || a.this.getItemViewType(i) == -1) {
                        return gridLayoutManager.b;
                    }
                    return 1;
                }
            };
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final void onViewAttachedToWindow(@NonNull RecyclerView.s sVar) {
        Object[] objArr = {sVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1738b6cb630d2afa8952de4f92ec3254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1738b6cb630d2afa8952de4f92ec3254");
            return;
        }
        super.onViewAttachedToWindow(sVar);
        if (sVar instanceof b) {
            ViewGroup.LayoutParams layoutParams = sVar.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.b) {
                ((StaggeredGridLayoutManager.b) layoutParams).b = true;
            }
        } else if (sVar instanceof c) {
            ViewGroup.LayoutParams layoutParams2 = sVar.itemView.getLayoutParams();
            e eVar = ((c) sVar).c;
            if (layoutParams2 instanceof StaggeredGridLayoutManager.b) {
                StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams2;
                eVar.x = bVar.b();
                eVar.y = 2;
                if (this.d) {
                    bVar.b = eVar.z;
                }
            } else if (layoutParams2 instanceof GridLayoutManager.b) {
                eVar.x = ((GridLayoutManager.b) layoutParams2).a;
                eVar.y = 2;
            } else {
                eVar.x = 0;
                eVar.y = 1;
            }
            eVar.p();
        }
    }
}
