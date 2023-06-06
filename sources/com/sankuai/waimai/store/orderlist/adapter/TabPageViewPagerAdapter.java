package com.sankuai.waimai.store.orderlist.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TabPageViewPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    private final ArrayList<View> b;

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public TabPageViewPagerAdapter(ArrayList<View> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc60e31b9c374b41fd7bd7460afabc7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc60e31b9c374b41fd7bd7460afabc7d");
            return;
        }
        this.b = new ArrayList<>();
        if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
            return;
        }
        this.b.addAll(arrayList);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470f8e5c198841ac9cc5e7a950b17b15", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470f8e5c198841ac9cc5e7a950b17b15")).intValue() : this.b.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2942d1ed2eefcfd1efedc6aeb6c5fba2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2942d1ed2eefcfd1efedc6aeb6c5fba2");
        }
        if (i >= this.b.size()) {
            i = 0;
        }
        View view = this.b.get(i);
        viewGroup.addView(view);
        return view;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77880092cbfcecf623febeeb04fd24b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77880092cbfcecf623febeeb04fd24b8");
        } else {
            viewGroup.removeView((View) obj);
        }
    }
}
