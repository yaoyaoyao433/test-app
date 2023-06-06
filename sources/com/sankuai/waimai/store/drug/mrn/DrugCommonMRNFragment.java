package com.sankuai.waimai.store.drug.mrn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.drug.newwidgets.DrugNetInfoLoadView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugCommonMRNFragment extends SGCommonRNFragment {
    public static ChangeQuickRedirect q;

    public boolean s() {
        return true;
    }

    public static DrugCommonMRNFragment d(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3942aa456b934cf3574794a3a96d6ce4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugCommonMRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3942aa456b934cf3574794a3a96d6ce4");
        }
        DrugCommonMRNFragment drugCommonMRNFragment = new DrugCommonMRNFragment();
        drugCommonMRNFragment.setArguments(b(str));
        return drugCommonMRNFragment;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accaa1f6c1a52753b3899ff987b65e97", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accaa1f6c1a52753b3899ff987b65e97");
        }
        DrugNetInfoLoadView drugNetInfoLoadView = new DrugNetInfoLoadView(context, null, 0, s());
        drugNetInfoLoadView.a();
        return drugNetInfoLoadView;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66311ab0505b907e4213a90eee983534", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66311ab0505b907e4213a90eee983534");
        }
        DrugNetInfoLoadView drugNetInfoLoadView = new DrugNetInfoLoadView(context, null, 0, s());
        drugNetInfoLoadView.setReloadClickListener(a.a(this));
        drugNetInfoLoadView.setReloadButtonText(R.string.wm_sc_order_base_i_know_1);
        drugNetInfoLoadView.b(null, null);
        return drugNetInfoLoadView;
    }

    public static /* synthetic */ void a(DrugCommonMRNFragment drugCommonMRNFragment, View view) {
        Object[] objArr = {drugCommonMRNFragment, view};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f09bdae24749b23c970993aa5056bf7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f09bdae24749b23c970993aa5056bf7a");
        } else {
            drugCommonMRNFragment.getActivity().finish();
        }
    }
}
