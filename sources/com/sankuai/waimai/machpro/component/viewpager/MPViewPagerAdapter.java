package com.sankuai.waimai.machpro.component.viewpager;

import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPViewPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    a b;
    ViewGroup c;
    final SparseArray<FrameLayout> d;
    private final int e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str, MachArray machArray);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public MPViewPagerAdapter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a42047f70d5eae78aeaf923d62d45ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a42047f70d5eae78aeaf923d62d45ca");
            return;
        }
        this.e = i;
        this.d = new SparseArray<>();
    }

    public final void a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888cd5c9390cc77a02ef83e4d181d360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888cd5c9390cc77a02ef83e4d181d360");
        } else if (viewGroup == null || viewGroup.getChildCount() != 0) {
        } else {
            MachArray machArray = new MachArray();
            machArray.add(Integer.valueOf(i));
            this.b.a("createPage", machArray);
            com.sankuai.waimai.machpro.component.viewpager.a b = com.sankuai.waimai.machpro.component.viewpager.a.b();
            if (b != null) {
                viewGroup.addView(b.getView());
            }
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6237232109953ad855dccdc49380fe29", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6237232109953ad855dccdc49380fe29");
        }
        this.c = viewGroup;
        FrameLayout frameLayout = this.d.get(i);
        if (frameLayout == null) {
            FrameLayout frameLayout2 = new FrameLayout(this.c.getContext());
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.d.put(i, frameLayout2);
            viewGroup.addView(frameLayout2);
            return frameLayout2;
        }
        return frameLayout;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        return this.e;
    }
}
