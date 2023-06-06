package com.sankuai.waimai.store.newwidgets.list;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.b;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T, Contract extends b> extends BaseAdapter {
    public static ChangeQuickRedirect a;
    @NonNull
    protected Contract b;
    @NonNull
    private final List<T> c;
    private List<g> d;

    public abstract g a(int i);

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public a(@NonNull Contract contract) {
        Object[] objArr = {contract};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83cb534396b22625581b8ac36d7437ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83cb534396b22625581b8ac36d7437ab");
            return;
        }
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.b = contract;
    }

    public final void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57ac0da2d8ccce40747d5674a3874ad3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57ac0da2d8ccce40747d5674a3874ad3");
            return;
        }
        this.c.clear();
        this.d.clear();
        if (list != null) {
            this.c.addAll(list);
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64fe8fdf94ebc9ecad14e1de083ce9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64fe8fdf94ebc9ecad14e1de083ce9d");
            return;
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i).b(getItem(i), i);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcca8427f93d6b84becc7f34df3c97d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcca8427f93d6b84becc7f34df3c97d")).intValue() : this.c.size();
    }

    @Override // android.widget.Adapter
    public T getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07e1948e8c1e7f5163a59c18557d327", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07e1948e8c1e7f5163a59c18557d327");
        }
        if (i < 0 || i >= this.c.size()) {
            return null;
        }
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        g gVar;
        Object[] objArr = {Integer.valueOf(i), view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cbf2a1be33f5bb9caa0d206e509888d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cbf2a1be33f5bb9caa0d206e509888d");
        }
        if (view == null) {
            gVar = a(getItemViewType(i));
            gVar.a((g) this.b);
            view2 = gVar.c(viewGroup);
            view2.setTag(gVar);
            this.d.add(i, gVar);
        } else {
            view2 = view;
            gVar = (g) view.getTag();
        }
        gVar.b(getItem(i), i);
        return view2;
    }
}
