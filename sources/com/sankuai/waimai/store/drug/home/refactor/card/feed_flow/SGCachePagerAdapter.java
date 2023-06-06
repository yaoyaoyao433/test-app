package com.sankuai.waimai.store.drug.home.refactor.card.feed_flow;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SGCachePagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect g;
    private com.sankuai.waimai.store.base.b a;
    private Map<String, com.sankuai.waimai.store.base.b> b;

    public abstract int a(int i);

    public abstract com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i);

    public SGCachePagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d605433fc00b7f3b877580b439324cac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d605433fc00b7f3b877580b439324cac");
        } else {
            this.b = new HashMap();
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e70f583ed417627733b1e6daede5f7c2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e70f583ed417627733b1e6daede5f7c2")).booleanValue() : view == ((com.sankuai.waimai.store.base.b) obj).getView();
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "619c53e21ddfb16f9c7215e55046bdf2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "619c53e21ddfb16f9c7215e55046bdf2");
        }
        Object[] objArr2 = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f260fd4eca34c2f9300acd587af9f45", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f260fd4eca34c2f9300acd587af9f45");
        } else {
            str = "CubeBlock:ViewPager:" + viewGroup.getId() + a(i) + CommonConstant.Symbol.COLON + i;
        }
        com.sankuai.waimai.store.base.b bVar = this.b.get(str);
        if (bVar == null) {
            bVar = a(viewGroup, i);
            this.b.put(str, bVar);
            bVar.createView(viewGroup);
        }
        viewGroup.addView(bVar.getView());
        return bVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b84501f116d0466e6bdc8740819ec972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b84501f116d0466e6bdc8740819ec972");
        } else {
            viewGroup.removeView(((com.sankuai.waimai.store.base.b) obj).getView());
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf4356af2324e3c93704a246b9de1e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf4356af2324e3c93704a246b9de1e5");
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        if (this.a != obj) {
            if (this.a instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) this.a).a(false);
            }
            if (obj instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) obj).a(true);
            }
            this.a = (com.sankuai.waimai.store.base.b) obj;
        }
    }
}
