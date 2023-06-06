package com.meituan.android.paycommon.lib.webview.specialcontainer.dialogclose;

import android.os.Bundle;
import android.support.constraint.R;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WebViewDialogCloseFragment extends PayBaseWebViewWithTitansFragment {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9cb540fcf53097a8563e9c28ed7313f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9cb540fcf53097a8563e9c28ed7313f");
            return;
        }
        super.onCreate(bundle);
        this.d.setTitleHeight(0);
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37721c59246f606978b87d0dee7a5c72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37721c59246f606978b87d0dee7a5c72");
            return;
        }
        super.b();
        this.d.setMaskLayoutResId(R.layout.paybase__network_error_round_conner);
    }
}
