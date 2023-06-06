package com.sankuai.waimai.business.restaurant.framework.viewpager.design;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.pga.block.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.b;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PGABlockPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;
    public final List<a> b;
    public String[] c;
    private a d;

    public PGABlockPagerAdapter(List<a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae2926b57ce5dece6da39a03b4c8a684", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae2926b57ce5dece6da39a03b4c8a684");
            return;
        }
        this.d = null;
        this.b = list;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d2b74412e7b7a69366c028c3699ecbb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d2b74412e7b7a69366c028c3699ecbb")).intValue() : b.c(this.b);
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ad4bd4c98b60b01104f56cdbf0dc36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ad4bd4c98b60b01104f56cdbf0dc36")).booleanValue() : view == ((a) obj).r().a();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bce02749bdb259a4ec09db25ca001be0", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bce02749bdb259a4ec09db25ca001be0");
        }
        a aVar = (a) b.a(this.b, i);
        if (aVar == null) {
            return null;
        }
        viewGroup.addView(aVar.i());
        if (aVar != this.d) {
            a(aVar, false);
        }
        return aVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efa0b383f3a721943f5bc152afe893de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efa0b383f3a721943f5bc152afe893de");
        } else {
            viewGroup.removeView(((a) obj).r().a());
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ec156445cfb490d2585ec13f318bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ec156445cfb490d2585ec13f318bdd");
            return;
        }
        a aVar = (a) obj;
        if (aVar != this.d) {
            a(this.d, false);
            StringBuilder sb = new StringBuilder("MachPro_TAG_PGABlockPagerAdapter_setPrimaryItem adapterId:");
            sb.append(hashCode());
            sb.append(" blockId:");
            sb.append(aVar == null ? StringUtil.NULL : Integer.valueOf(aVar.hashCode()));
            com.sankuai.waimai.business.restaurant.poicontainer.machpro.a.a(sb.toString());
            a(aVar, true);
            this.d = aVar;
        }
    }

    private void a(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d3cc3bd620ee57aabfa84ac088176e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d3cc3bd620ee57aabfa84ac088176e1");
        } else if (aVar instanceof com.sankuai.waimai.business.restaurant.framework.viewpager.a) {
            ((com.sankuai.waimai.business.restaurant.framework.viewpager.a) aVar).a(z);
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25a4b5571a443a04d7249a7b0748f8f9", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25a4b5571a443a04d7249a7b0748f8f9") : (CharSequence) b.a(this.c, i);
    }
}
