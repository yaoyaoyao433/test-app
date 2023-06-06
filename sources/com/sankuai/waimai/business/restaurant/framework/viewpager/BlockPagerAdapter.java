package com.sankuai.waimai.business.restaurant.framework.viewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BlockPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.business.restaurant.framework.a[] b;
    private com.sankuai.waimai.business.restaurant.framework.a c;
    private String[] d;

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c418d42126d45815922f194c5756efbb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c418d42126d45815922f194c5756efbb")).intValue() : b.b(this.b);
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7007a931b958acfa890b5e4e8b41367", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7007a931b958acfa890b5e4e8b41367")).booleanValue() : view == ((com.sankuai.waimai.business.restaurant.framework.a) obj).a();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560ec799ea732a94fe4364fed9cac599", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560ec799ea732a94fe4364fed9cac599");
        }
        com.sankuai.waimai.business.restaurant.framework.a aVar = (com.sankuai.waimai.business.restaurant.framework.a) b.a(this.b, i);
        if (aVar == null) {
            return null;
        }
        viewGroup.addView(aVar.a(viewGroup));
        if (aVar != this.c) {
            a(aVar, false);
        }
        return aVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a767e2c3bfc1226b617b71b230a373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a767e2c3bfc1226b617b71b230a373");
        } else {
            viewGroup.removeView(((com.sankuai.waimai.business.restaurant.framework.a) obj).a());
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86a912110a6acc42045b8c84508be401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86a912110a6acc42045b8c84508be401");
            return;
        }
        com.sankuai.waimai.business.restaurant.framework.a aVar = (com.sankuai.waimai.business.restaurant.framework.a) obj;
        if (aVar != this.c) {
            a(this.c, false);
            a(aVar, true);
            this.c = aVar;
        }
    }

    private void a(com.sankuai.waimai.business.restaurant.framework.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "004080b9fa4345fa9eff3960b6b2679a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "004080b9fa4345fa9eff3960b6b2679a");
        } else if (aVar instanceof a) {
            ((a) aVar).a(z);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3023d91b5cf620c7d4cc8f4bbe33e81", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3023d91b5cf620c7d4cc8f4bbe33e81") : (CharSequence) b.a(this.d, i);
    }
}
