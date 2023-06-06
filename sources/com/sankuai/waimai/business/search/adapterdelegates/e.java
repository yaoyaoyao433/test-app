package com.sankuai.waimai.business.search.adapterdelegates;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class e extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    public boolean b;
    public ArrayList<a> c;
    public ArrayList<a> d;

    public abstract RecyclerView.s a(ViewGroup viewGroup, int i);

    public abstract void a(RecyclerView.s sVar, int i);

    public abstract int b();

    public abstract int c(int i);

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0577e4b32ef5bb045fd43903aa1d824d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0577e4b32ef5bb045fd43903aa1d824d");
            return;
        }
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a {
        public View a;
        public int b;

        public a() {
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85349d8aa34eb6f787520d524fe95381", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85349d8aa34eb6f787520d524fe95381")).intValue() : this.d.size();
    }

    boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c455745f06f181418ea4e5d9af5f0a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c455745f06f181418ea4e5d9af5f0a")).booleanValue() : i < this.c.size();
    }

    boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1de0f36f349859558c8e91485d0e8dd9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1de0f36f349859558c8e91485d0e8dd9")).booleanValue() : i >= this.c.size() + b();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd2288210989b2b786891c6a7e4d0a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd2288210989b2b786891c6a7e4d0a2");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b182cbe78341a2df339f49653feaf78", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b182cbe78341a2df339f49653feaf78")).booleanValue();
        } else {
            z = i >= -1024 && i < this.c.size() + (-1024);
        }
        if (z) {
            return a(this.c.get(Math.abs(i - (-1024))).a);
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34c4b16e6155e3bb5070e6f9a9aa4fa3", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34c4b16e6155e3bb5070e6f9a9aa4fa3")).booleanValue();
        } else if (i >= -2048 && i < this.d.size() - 2048) {
            z2 = true;
        }
        if (z2) {
            return a(this.d.get(Math.abs(i - (-2048))).a);
        }
        return a(viewGroup, i);
    }

    private RecyclerView.s a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1824f313bf9178c32260c11bcb043c2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1824f313bf9178c32260c11bcb043c2f");
        }
        if (this.b) {
            StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(-1, -2);
            bVar.b = true;
            view.setLayoutParams(bVar);
        }
        return new RecyclerView.s(view) { // from class: com.sankuai.waimai.business.search.adapterdelegates.e.2
        };
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "906c9abce882092f543200376af744ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "906c9abce882092f543200376af744ea");
        } else if (i < this.c.size() || i >= this.c.size() + b()) {
        } else {
            a(sVar, i - this.c.size());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d272d58c4aeda523263797f6a2bda5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d272d58c4aeda523263797f6a2bda5")).intValue() : this.c.size() + b() + this.d.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b87a2681333b9fec5786e54a1208be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b87a2681333b9fec5786e54a1208be")).intValue();
        }
        if (a(i)) {
            return this.c.get(i).b;
        }
        if (b(i)) {
            return this.d.get((i - this.c.size()) - b()).b;
        }
        return c(i - this.c.size());
    }
}
