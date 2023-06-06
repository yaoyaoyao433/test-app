package com.sankuai.waimai.store.goods.list.viewblocks.header.widget;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.GridView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ViewPagerOfGridViewAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    private List<GridView> b;

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public ViewPagerOfGridViewAdapter(@NonNull List<GridView> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94a335ab01d582ca7afa869809a9def2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94a335ab01d582ca7afa869809a9def2");
        } else {
            this.b = list;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(View view, int i, Object obj) {
        Object[] objArr = {view, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42ff452b382841af2da81cf096e1b2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42ff452b382841af2da81cf096e1b2d");
        } else {
            ((ViewPager) view).removeView(this.b.get(i));
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf78cb51ddede8df2493fbd79a78629", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf78cb51ddede8df2493fbd79a78629")).intValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            return 0;
        }
        return this.b.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c503ca9735d155338f47becb6583b1", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c503ca9735d155338f47becb6583b1");
        }
        GridView gridView = this.b.get(i);
        if (gridView != null && gridView.getParent() == null && (view instanceof ViewPager)) {
            ((ViewPager) view).addView(gridView, 0);
            return gridView;
        }
        return null;
    }
}
