package com.sankuai.waimai.store.drug.newwidgets.indicator;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCPageFragmentAdapter extends FragmentPagerAdapter {
    public static ChangeQuickRedirect a;
    public final List<a> b;

    public SCPageFragmentAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a847b32de34db9ba8f7dc77cd4217ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a847b32de34db9ba8f7dc77cd4217ff");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public Fragment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d550bed0098f966122f3f57684378dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d550bed0098f966122f3f57684378dcf");
        }
        a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (aVar == null) {
            return null;
        }
        return aVar.b;
    }

    @Override // android.support.v4.app.FragmentPagerAdapter
    public long getItemId(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8c30acf40fabfb5dd57e726c76c9cb8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8c30acf40fabfb5dd57e726c76c9cb8")).longValue();
        }
        a aVar = (a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        return (aVar == null || aVar.b == null) ? i : aVar.b.hashCode();
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e91830759ce7eef027ca07301d629ed", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e91830759ce7eef027ca07301d629ed")).intValue() : this.b.size();
    }
}
