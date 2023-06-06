package com.sankuai.waimai.store.search.adapterdelegates;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    public ArrayList<C1296a> b;
    private boolean c;
    private ArrayList<C1296a> d;

    public abstract int a(int i);

    public abstract RecyclerView.s a(ViewGroup viewGroup, int i);

    public abstract void a();

    public abstract void a(long j, int i);

    public abstract void a(RecyclerView.s sVar, int i);

    public abstract void a(boolean z);

    public abstract int b();

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a058f3430ab965afb8dae1f3e73031d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a058f3430ab965afb8dae1f3e73031d");
            return;
        }
        this.d = new ArrayList<>();
        this.b = new ArrayList<>();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.adapterdelegates.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1296a {
        public View a;
        public int b;

        public C1296a() {
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488be24c1bd2fa95bd6851cc7a5c1f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488be24c1bd2fa95bd6851cc7a5c1f2e");
            return;
        }
        Object[] objArr2 = {view, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eeae9dfd6f43b0931619be0b7239ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eeae9dfd6f43b0931619be0b7239ad8");
        } else if (view == null) {
            throw new IllegalArgumentException("the view to add must not be null!");
        } else {
            C1296a c1296a = new C1296a();
            c1296a.a = view;
            c1296a.b = this.b.size() - 2048;
            this.b.add(c1296a);
            notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public RecyclerView.s onCreateViewHolder(ViewGroup viewGroup, int i) {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ca7e4ee1caf7b7201d9bc40cfaea57", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ca7e4ee1caf7b7201d9bc40cfaea57");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca9a162454caa720e7f7b4fb8de7fce0", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca9a162454caa720e7f7b4fb8de7fce0")).booleanValue();
        } else {
            z = i >= -1024 && i < this.d.size() + (-1024);
        }
        if (z) {
            return b(this.d.get(Math.abs(i - (-1024))).a);
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1775479e0c9beb10d928b444dc4e2b63", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1775479e0c9beb10d928b444dc4e2b63")).booleanValue();
        } else if (i >= -2048 && i < this.b.size() - 2048) {
            z2 = true;
        }
        if (z2) {
            return b(this.b.get(Math.abs(i - (-2048))).a);
        }
        return a(viewGroup, i);
    }

    private RecyclerView.s b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e099b1a5d1df1dc3508eb8aa08bb24", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.s) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e099b1a5d1df1dc3508eb8aa08bb24");
        }
        if (this.c) {
            StaggeredGridLayoutManager.b bVar = new StaggeredGridLayoutManager.b(-1, -2);
            bVar.b = true;
            view.setLayoutParams(bVar);
        }
        return new RecyclerView.s(view) { // from class: com.sankuai.waimai.store.search.adapterdelegates.a.1
        };
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590d7323bdbdc73b65d1f61db3a0800e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590d7323bdbdc73b65d1f61db3a0800e");
        } else if (i < this.d.size() || i >= this.d.size() + b()) {
        } else {
            a(sVar, i - this.d.size());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9473f0ac16b8630a7fa9a8b6a84f18", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9473f0ac16b8630a7fa9a8b6a84f18")).intValue() : this.d.size() + b() + this.b.size();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d8857227097bd82d9263ab55fff0ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d8857227097bd82d9263ab55fff0ff")).intValue();
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77d97d5a4b4b92faecfd53368ce3b12a", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77d97d5a4b4b92faecfd53368ce3b12a")).booleanValue();
        } else {
            z = i < this.d.size();
        }
        if (z) {
            return this.d.get(i).b;
        }
        Object[] objArr3 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d85d518cd38f696acedded9a31c7a15", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d85d518cd38f696acedded9a31c7a15")).booleanValue();
        } else if (i < this.d.size() + b()) {
            z2 = false;
        }
        if (z2) {
            return this.b.get((i - this.d.size()) - b()).b;
        }
        return a(i - this.d.size());
    }
}
