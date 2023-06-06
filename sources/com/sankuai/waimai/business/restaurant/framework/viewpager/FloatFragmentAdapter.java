package com.sankuai.waimai.business.restaurant.framework.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FloatFragmentAdapter extends FragmentPagerAdapter {
    public static ChangeQuickRedirect a;
    public String[] b;
    private final b[] c;

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa3b5bd6e34cf4ad453d6222a1ef9c9f", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa3b5bd6e34cf4ad453d6222a1ef9c9f") : (CharSequence) com.sankuai.waimai.foundation.utils.b.a(this.b, i);
    }

    public FloatFragmentAdapter(FragmentManager fragmentManager, b[] bVarArr) {
        super(fragmentManager);
        Object[] objArr = {fragmentManager, bVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c78b0662589c2f12cffc3f779a59fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c78b0662589c2f12cffc3f779a59fc");
        } else {
            this.c = bVarArr;
        }
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b30c967a74a7810f639ec6d17d08247e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b30c967a74a7810f639ec6d17d08247e");
        }
        b bVar = (b) com.sankuai.waimai.foundation.utils.b.a(this.c, i);
        if (bVar == null) {
            return null;
        }
        return bVar.h();
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b2b683258e8f0be381165a1b207f65f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b2b683258e8f0be381165a1b207f65f")).intValue() : com.sankuai.waimai.foundation.utils.b.b(this.c);
    }
}
