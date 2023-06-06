package com.sankuai.waimai.store.goods.list.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.SGCachePagerAdapter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class GoodsListCachePagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.base.b b;
    private Map<String, com.sankuai.waimai.store.base.b> c;
    private SGCachePagerAdapter.a d;

    public abstract int a(int i);

    public abstract com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i);

    public GoodsListCachePagerAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180116b23b8cb2b85882b5b70b650757", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180116b23b8cb2b85882b5b70b650757");
        } else {
            this.c = new HashMap();
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46c39793146cdf53c709aad012c4ad83", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46c39793146cdf53c709aad012c4ad83")).booleanValue() : view == ((com.sankuai.waimai.store.base.b) obj).getView();
    }

    @Override // android.support.v4.view.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ebc051ba715efc2efafa02d2a5118e4", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ebc051ba715efc2efafa02d2a5118e4");
        }
        Object[] objArr2 = {Integer.valueOf(i), viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d01ba3607ab86929a720d1de9fa4d72a", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d01ba3607ab86929a720d1de9fa4d72a");
        } else {
            str = "CubeBlock:ViewPager:" + viewGroup.getId() + a(i) + CommonConstant.Symbol.COLON + i;
        }
        com.sankuai.waimai.store.base.b bVar = this.c.get(str);
        if (bVar == null) {
            bVar = a(viewGroup, i);
            this.c.put(str, bVar);
            bVar.createView(viewGroup);
            if (this.d != null) {
                this.d.a(i, bVar);
            }
        }
        viewGroup.addView(bVar.getView());
        return bVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "012ed5c3197d9e37c84ba325e29f84cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "012ed5c3197d9e37c84ba325e29f84cc");
        } else {
            viewGroup.removeView(((com.sankuai.waimai.store.base.b) obj).getView());
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4057a058d9d451dc3b15f2fc47dfa55f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4057a058d9d451dc3b15f2fc47dfa55f");
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        if (this.b != obj) {
            if (this.b instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) this.b).a(false);
            }
            if (obj instanceof com.meituan.android.cube.core.pager.a) {
                ((com.meituan.android.cube.core.pager.a) obj).a(true);
            }
            this.b = (com.sankuai.waimai.store.base.b) obj;
        }
    }
}
