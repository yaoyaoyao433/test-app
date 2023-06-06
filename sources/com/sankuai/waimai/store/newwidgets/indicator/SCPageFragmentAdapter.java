package com.sankuai.waimai.store.newwidgets.indicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPageFragmentAdapter extends FragmentPagerAdapter {
    public static ChangeQuickRedirect a;
    private final List<TabInfo> b;

    @Override // android.support.v4.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e844d77011736f6ab10441474cba34ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e844d77011736f6ab10441474cba34ce");
        }
        TabInfo tabInfo = (TabInfo) a.a((List<Object>) this.b, i);
        if (tabInfo == null) {
            return null;
        }
        return tabInfo.b;
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b234ac305274e9255da4d42076f33299", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b234ac305274e9255da4d42076f33299")).longValue();
        }
        TabInfo tabInfo = (TabInfo) a.a((List<Object>) this.b, i);
        return (tabInfo == null || tabInfo.b == null) ? i : tabInfo.b.hashCode();
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2aa0c1bf5376339fc1f5abaf42728c4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2aa0c1bf5376339fc1f5abaf42728c4")).intValue() : this.b.size();
    }
}
