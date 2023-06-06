package com.meituan.android.legwork.ui.abfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.legwork.common.widget.CommonLoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MarginBottomMrnFragment extends LegworkMRNBaseFragment {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.android.legwork.ui.abfragment.LegworkMRNBaseFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d569fc4d2134ee1f1a2f5f383472c97", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d569fc4d2134ee1f1a2f5f383472c97");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.legwork_main_tab_height);
        if (onCreateView != null) {
            onCreateView.setPadding(onCreateView.getPaddingLeft(), onCreateView.getPaddingTop(), onCreateView.getPaddingRight(), onCreateView.getPaddingBottom() + dimensionPixelSize);
        }
        CommonLoadingView commonLoadingView = ((LegworkMRNBaseFragment) this).b;
        if (commonLoadingView != null) {
            commonLoadingView.setLoadingContainerPaddingTop(dimensionPixelSize);
        }
        return onCreateView;
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc1bbb1eba832e65607298b493f184f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc1bbb1eba832e65607298b493f184f");
        } else {
            super.onViewCreated(view, bundle);
        }
    }
}
