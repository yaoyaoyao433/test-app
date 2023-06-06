package com.sankuai.waimai.store.widgets;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BasePagerAdapter<T> extends PagerAdapter {
    public static ChangeQuickRedirect e;
    protected final List<T> f;
    protected final SparseArray<View> g;

    public abstract View a(int i, ViewGroup viewGroup);

    public abstract void a(@NonNull View view, int i);

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public BasePagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a8b494be2db1773ba78512ef44eca77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a8b494be2db1773ba78512ef44eca77");
            return;
        }
        this.f = new ArrayList();
        this.g = new SparseArray<>();
    }

    public final void b(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "918808df70d32c8a2b33a81e38b6d535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "918808df70d32c8a2b33a81e38b6d535");
            return;
        }
        this.f.clear();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            this.f.addAll(list);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a142a2e1fd22f45d63072cac6227e802", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a142a2e1fd22f45d63072cac6227e802")).intValue() : this.f.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    @NonNull
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9760591a94601bfcab355104f965668", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9760591a94601bfcab355104f965668");
        }
        View view = this.g.get(i);
        if (view == null) {
            view = a(i, viewGroup);
            this.g.put(i, view);
        }
        if (view == null) {
            return super.instantiateItem(viewGroup, i);
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        a(view, i);
        viewGroup.addView(view);
        return view;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i, @NonNull Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e428a209de4d440f191b5219f3c173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e428a209de4d440f191b5219f3c173");
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    public void a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed04b185ae3dda4bab62784ec174e4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed04b185ae3dda4bab62784ec174e4fc");
        } else if (com.sankuai.shangou.stone.util.a.b(list)) {
        } else {
            this.f.clear();
            this.f.addAll(list);
            notifyDataSetChanged();
        }
    }

    @Nullable
    public final T b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9340491529b9584b3e7a828d3c55cc5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9340491529b9584b3e7a828d3c55cc5d");
        }
        if (i < 0 || i >= this.f.size()) {
            return null;
        }
        return this.f.get(i);
    }

    public final View c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d538de6d15890dc2105811e5e68365", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d538de6d15890dc2105811e5e68365") : this.g.get(i);
    }
}
