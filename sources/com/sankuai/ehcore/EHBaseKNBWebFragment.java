package com.sankuai.ehcore;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.KNBWebFragment;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHBaseKNBWebFragment extends KNBWebFragment implements OnWebClientListener {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onPageStarted(String str, Bitmap bitmap) {
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedError(int i, String str, String str2) {
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public boolean shouldOverrideUrlLoading(String str) {
        return false;
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e329d3bd73e4aba8ced792f8f6b5a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e329d3bd73e4aba8ced792f8f6b5a44");
            return;
        }
        super.onCreate(bundle);
        this.knbWebCompat.setOnWebViewClientListener(this);
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a03d14d17e7fc886ad9ff5d00d1d92", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a03d14d17e7fc886ad9ff5d00d1d92") : a.a(getActivity(), super.onCreateView(layoutInflater, viewGroup, bundle), this.knbWebCompat, getArguments().getString("url"));
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebFragment
    public KNBWebCompat createCompat() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ce44340d70e931024983e633c54de7", RobustBitConfig.DEFAULT_VALUE)) {
            return (KNBWebCompat) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ce44340d70e931024983e633c54de7");
        }
        getArguments().putString("progresscolor", "#00000000");
        return super.createCompat();
    }

    @Override // com.sankuai.meituan.android.knb.KNBWebFragment, android.support.v4.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "583ae55b91dbb5c7f5f0bc9cd8fd96f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "583ae55b91dbb5c7f5f0bc9cd8fd96f8");
            return;
        }
        super.onActivityCreated(bundle);
        this.knbWebCompat.onActivityCreated(bundle);
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onPageFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1750101417481619f2b5289e8a7403b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1750101417481619f2b5289e8a7403b2");
        } else {
            a.a(getActivity());
        }
    }
}
