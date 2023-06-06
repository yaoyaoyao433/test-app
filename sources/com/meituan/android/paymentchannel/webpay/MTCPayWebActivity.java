package com.meituan.android.paymentchannel.webpay;

import android.support.v4.app.Fragment;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.android.paybase.webview.WebViewActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTCPayWebActivity extends WebViewActivity {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.android.paybase.webview.WebViewActivity
    public final PayBaseWebViewWithTitansFragment g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de447e824de34740f4650369cc4bb9bf", RobustBitConfig.DEFAULT_VALUE) ? (PayBaseWebViewWithTitansFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de447e824de34740f4650369cc4bb9bf") : (MTCPayWebFragment) Fragment.instantiate(this, MTCPayWebFragment.class.getName(), i());
    }
}
