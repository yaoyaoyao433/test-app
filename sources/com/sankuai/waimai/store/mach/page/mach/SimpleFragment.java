package com.sankuai.waimai.store.mach.page.mach;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"ValidFragment"})
/* loaded from: classes5.dex */
public class SimpleFragment extends Fragment {
    public static ChangeQuickRedirect a;

    public static SimpleFragment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71b9cc5128a423449b1ed568adf4137a", RobustBitConfig.DEFAULT_VALUE) ? (SimpleFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71b9cc5128a423449b1ed568adf4137a") : new SimpleFragment();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2591339338c9e924782105b739bddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2591339338c9e924782105b739bddc");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcee0abf513aaf0e5caaa26db3f86862", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcee0abf513aaf0e5caaa26db3f86862") : new TextView(viewGroup.getContext());
    }
}
