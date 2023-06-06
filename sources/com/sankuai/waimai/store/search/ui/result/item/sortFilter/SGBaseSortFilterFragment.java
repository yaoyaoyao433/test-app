package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGBaseSortFilterFragment extends SCBaseFragment implements com.sankuai.waimai.store.search.ui.result.a {
    public static ChangeQuickRedirect m;

    public final void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f61f211e71d318ec333fbaebb46b62b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f61f211e71d318ec333fbaebb46b62b");
        } else if (getFragmentManager() == null) {
        } else {
            getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.a
    public final boolean bf_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea258eb5492285e42570207f4c13c198", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea258eb5492285e42570207f4c13c198")).booleanValue();
        }
        u();
        return false;
    }
}
