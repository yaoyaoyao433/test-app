package com.sankuai.waimai.platform.widget;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FragmentsPagerAdapter extends FragmentPagerAdapter {
    public static ChangeQuickRedirect a;
    private Fragment[] b;
    private String[] c;

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        return -2;
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4f6b45e59be58f18594ebfc2c8f318", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4f6b45e59be58f18594ebfc2c8f318");
        }
        com.sankuai.waimai.foundation.utils.log.a.b("FragmentsPagerAdapter", "getItem: %d", Integer.valueOf(i));
        return (Fragment) com.sankuai.waimai.foundation.utils.b.a(this.b, i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ad4c4a77acc2b6eedbd8a9ac0b4088", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ad4c4a77acc2b6eedbd8a9ac0b4088")).intValue() : com.sankuai.waimai.foundation.utils.b.b(this.b);
    }

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3660abbb1adab48b8e36e6d402cd149", RobustBitConfig.DEFAULT_VALUE) ? (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3660abbb1adab48b8e36e6d402cd149") : (CharSequence) com.sankuai.waimai.foundation.utils.b.a(this.c, i);
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbd15cddc3a0d211f9b0a90761fc228d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbd15cddc3a0d211f9b0a90761fc228d")).longValue();
        }
        Fragment item = getItem(i);
        if (item != null) {
            return item.hashCode();
        }
        return super.getItemId(i);
    }
}
