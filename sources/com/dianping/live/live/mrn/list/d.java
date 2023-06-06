package com.dianping.live.live.mrn.list;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.dianping.live.live.mrn.list.e;
import com.dianping.live.live.mrn.list.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends f {
    public static ChangeQuickRedirect a;
    public ArrayList<com.dianping.live.live.mrn.list.model.a> b;
    private boolean n;

    @Override // android.support.v7.widget.RecyclerView.a
    public final long getItemId(int i) {
        return i;
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ b a(ViewGroup viewGroup, int i) {
        return super.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ c a(a aVar, int i, int i2) {
        return super.a(aVar, i, i2);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void a(b bVar) {
        super.onViewRecycled(bVar);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void a(b bVar, int i) {
        super.a(bVar, i);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void a(f.a aVar) {
        super.a(aVar);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void b(b bVar) {
        super.onViewDetachedFromWindow(bVar);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void b(b bVar, int i) {
        super.onBindViewHolder(bVar, i);
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final /* bridge */ /* synthetic */ void c(b bVar) {
        super.onViewAttachedToWindow(bVar);
    }

    public d(FragmentManager fragmentManager, ArrayList<com.dianping.live.live.mrn.list.model.a> arrayList, Context context) {
        super(fragmentManager, context);
        Object[] objArr = {fragmentManager, arrayList, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b296d8989de7aea164b461f9f9d0ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b296d8989de7aea164b461f9f9d0ca");
            return;
        }
        this.b = new ArrayList<>();
        this.n = true;
        this.b = arrayList;
    }

    @Override // com.dianping.live.live.mrn.list.f
    public final c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f1efd595cc2d236b5bfd6c346d2aa1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f1efd595cc2d236b5bfd6c346d2aa1");
        }
        c cVar = new c(this.h, this.b.get(i), this.n, i, e.a.multiple);
        this.n = false;
        return cVar;
    }

    @Override // com.dianping.live.live.mrn.list.f, android.support.v7.widget.RecyclerView.a
    public final int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4d6c5e4ce4539fc4acd796c1492b71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4d6c5e4ce4539fc4acd796c1492b71")).intValue();
        }
        if (this.b.get(i).d == -1) {
            return -1;
        }
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c4a0cd8608351225d640a1111819f72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c4a0cd8608351225d640a1111819f72")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    public final void a(ArrayList<com.dianping.live.live.mrn.list.model.a> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a689a6a509e0287b710ce090f5d84987", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a689a6a509e0287b710ce090f5d84987");
            return;
        }
        if (getItemCount() == 0) {
            this.l = System.currentTimeMillis();
            this.g = 0;
        }
        if (this.b == null) {
            this.b = new ArrayList<>();
        }
        this.b.addAll(arrayList);
        notifyItemRangeChanged(getItemCount(), arrayList.size());
    }

    public final Long b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "695136ffdc2c1b84908f2ad0b0c1ac56", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "695136ffdc2c1b84908f2ad0b0c1ac56");
        }
        if (i >= 0 && i < getItemCount() - 1) {
            return Long.valueOf(this.b.get(i).c);
        }
        return 0L;
    }

    public final void a(MLiveListRecyclerView mLiveListRecyclerView) {
        Object[] objArr = {mLiveListRecyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a034d9c46bf2ee2ef0fa25baf58367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a034d9c46bf2ee2ef0fa25baf58367");
            return;
        }
        if (this.d != null) {
            this.d.e();
            this.d = null;
        }
        if (this.e != null) {
            for (c cVar : this.e) {
                cVar.e();
            }
        }
        if (this.b != null) {
            int size = this.b.size();
            this.b.clear();
            this.b = null;
            notifyItemRangeRemoved(0, size);
        }
        this.g = 0;
        this.n = true;
    }
}
