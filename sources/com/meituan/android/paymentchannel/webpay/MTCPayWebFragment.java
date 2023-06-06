package com.meituan.android.paymentchannel.webpay;

import android.net.Uri;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MTCPayWebFragment extends PayBaseWebViewWithTitansFragment {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener
    public String appendAnalyzeParams(String str) {
        return str;
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public boolean shouldOverrideUrlLoading(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad0744e53af2936192ed87224c1a32d1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad0744e53af2936192ed87224c1a32d1")).booleanValue();
        }
        Uri parse = Uri.parse(str);
        if (getActivity() == null || getActivity().isFinishing() || !(str.contains("mpay.meituan.com/payreturn/alipaywap") || str.contains("mpay.meituan.com/payreturn/tenpaywap") || str.contains("mpay.meituan.com/payreturn/yeepaywap") || str.contains("mpay.meituan.com/payreturn/ccbcodepay") || str.indexOf("http://mpay.meituan.com/payreturn/biztpay") == 0 || str.indexOf("https://mpay.meituan.com/payreturn/biztpay") == 0)) {
            return parse.getScheme().equals("cmbnetpay");
        }
        getActivity().setResult(-1);
        getActivity().finish();
        return true;
    }
}
