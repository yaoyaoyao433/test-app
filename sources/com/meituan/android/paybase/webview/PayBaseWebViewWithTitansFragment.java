package com.meituan.android.paybase.webview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import com.dianping.titans.ui.TitansUIManager;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.config.b;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.v;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.ehcore.util.d;
import com.sankuai.meituan.android.knb.KNBWebCompactFactory;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayBaseWebViewWithTitansFragment extends PayBaseFragment implements OnAnalyzeParamsListener, OnWebClientListener {
    public static ChangeQuickRedirect c;
    protected TitansUIManager d;
    protected KNBWebCompat e;

    public boolean shouldOverrideUrlLoading(String str) {
        return false;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z = false;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43442c1ac24e5ec83e12e24150a6e432", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43442c1ac24e5ec83e12e24150a6e432");
            return;
        }
        super.onCreate(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        this.e = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbaec94d1c2e8dce0f6f36c2f76a103f", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbaec94d1c2e8dce0f6f36c2f76a103f") : KNBWebCompactFactory.getKNBCompact(1);
        this.e.onCreate((Activity) getActivity(), getArguments());
        b();
        this.e.getWebSettings().setUIManager(this.d);
        this.e.setOnWebViewClientListener(this);
        this.e.setOnAnalyzeParamsListener(this);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2855fa1231bc4ed8c4852e446cd07932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2855fa1231bc4ed8c4852e446cd07932");
            return;
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url");
            try {
                if (!TextUtils.isEmpty(string)) {
                    string = URLDecoder.decode(string, "UTF-8");
                    if (string.startsWith(AbsApiFactory.HTTPS) || string.startsWith(AbsApiFactory.HTTP)) {
                        z = true;
                    }
                }
                if (z) {
                    return;
                }
                a.a("b_hr4umpoc", new a.c().a("url", string).b);
                com.meituan.android.paybase.common.analyse.cat.a.a("UrlFormatError", getString(R.string.paybase__url_format_error) + "_url:" + string);
            } catch (UnsupportedEncodingException e) {
                a.a(e, "PayBaseWebViewWithTitansFragment_traceIsUrlLegal", (Map<String, Object>) null);
            }
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "449fd9fdf79e22db4b1ea1c589fff722", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "449fd9fdf79e22db4b1ea1c589fff722");
            return;
        }
        this.d = new TitansUIManager();
        this.d.setBackIconId(R.drawable.paybase_ic_home_as_up_indicator);
        this.d.setCustomBackIconId(R.drawable.paybase_ic_web_back_text);
        this.d.setCloseIconId(R.drawable.paybase_ic_web_close);
        this.d.setShareIconId(R.drawable.paybase__share_icon);
        this.d.setProgressDrawableResId(R.drawable.paybase__horizontal_progress);
        this.d.setMaskLayoutResId(R.layout.paybase__network_error);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String decode;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4611e39be2c42e11b2cdfb763da491", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4611e39be2c42e11b2cdfb763da491");
        }
        View onCreateView = this.e.onCreateView(layoutInflater, viewGroup);
        try {
            FragmentActivity activity = getActivity();
            KNBWebCompat kNBWebCompat = this.e;
            String string = getArguments() != null ? getArguments().getString("url") : "";
            Object[] objArr2 = {string};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fd77ef5e1e031d4fb539425eb0ddd107", RobustBitConfig.DEFAULT_VALUE)) {
                decode = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fd77ef5e1e031d4fb539425eb0ddd107");
            } else {
                decode = TextUtils.isEmpty(string) ? "" : URLDecoder.decode(string);
            }
            return com.sankuai.ehcore.a.a(activity, onCreateView, kNBWebCompat, decode);
        } catch (Exception unused) {
            return onCreateView;
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d3a23af69f96b9db46d7e1e631711b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d3a23af69f96b9db46d7e1e631711b");
            return;
        }
        super.onStart();
        this.e.onStart();
        a.c("b_nBqtx", "POP", null);
        a.a("b_l9ytqxu7", (Map<String, Object>) null);
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e43e4757d9fea780a51e9e22703a4a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e43e4757d9fea780a51e9e22703a4a4");
            return;
        }
        super.onResume();
        this.e.onResume();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb40f56db4efa31d7147c76103128b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb40f56db4efa31d7147c76103128b4");
            return;
        }
        super.onPause();
        this.e.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7e607081c8632989524475e89f2650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7e607081c8632989524475e89f2650");
            return;
        }
        Object[] objArr2 = {"c_pqy85t9", "b_LdoX8", "CLOSE", null};
        ChangeQuickRedirect changeQuickRedirect2 = v.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d1bdd4e39e9a8371a3f9f8cf0b26eaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d1bdd4e39e9a8371a3f9f8cf0b26eaee");
        } else {
            ae.a("c_pqy85t9", "b_LdoX8", "CLOSE", null, ae.a.VIEW, 0, "com.meituan.android.paybase.utils.PayBaseStatisticsUtils", true);
        }
        a.a("b_a69d6gn9", (Map<String, Object>) null);
        super.onStop();
        this.e.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26a1ac5152a61cb07b89c873f16dd61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26a1ac5152a61cb07b89c873f16dd61");
            return;
        }
        super.onDestroy();
        this.e.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd97b3d4caa55a9d07605c4a823bac4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd97b3d4caa55a9d07605c4a823bac4");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        this.e.onActivityResult(i, i2, intent);
        com.meituan.android.privacy.aop.a.f();
    }

    private KNBWebCompat.WebHandler c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17e60d3725beb83dd749fc8c339185cf", RobustBitConfig.DEFAULT_VALUE) ? (KNBWebCompat.WebHandler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17e60d3725beb83dd749fc8c339185cf") : this.e.getWebHandler();
    }

    @Override // android.support.v4.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c65373c4088a9734326a8d93c4d7f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c65373c4088a9734326a8d93c4d7f0");
        } else if (f.a(this, i, strArr, iArr).b) {
            this.e.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767783837ad0fe871a0c643c8b339b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767783837ad0fe871a0c643c8b339b59");
            return;
        }
        super.onActivityCreated(bundle);
        this.e.onActivityCreated(bundle);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04eb045f714f88d3e1fda0166ed8b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04eb045f714f88d3e1fda0166ed8b5f")).booleanValue();
        }
        this.e.onBackPressed();
        return true;
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onPageStarted(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed734a511caa0df192288bf1e47a5899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed734a511caa0df192288bf1e47a5899");
        } else {
            com.sankuai.ehcore.a.a(getActivity(), this.e);
        }
    }

    public void onPageFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38a11f8bf37722321b10469e1a4ad46d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38a11f8bf37722321b10469e1a4ad46d");
        } else {
            com.sankuai.ehcore.a.a(getActivity());
        }
    }

    public void onReceivedError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16820d0840625465d43a767dc7fe5a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16820d0840625465d43a767dc7fe5a1");
            return;
        }
        a.a("b_8jsovuev", new a.c().a("url", str2).b);
        com.meituan.android.paybase.common.analyse.cat.a.a("urlOpenError", getString(R.string.paybase__url_open_error) + "_failingUrl:" + str2 + "_error:" + i + "_description:" + str);
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        Object[] objArr = {sslErrorHandler, sslError};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97609db82b3cff6566397ea1dd581d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97609db82b3cff6566397ea1dd581d96");
            return;
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("urlOpenError", getString(R.string.paybase__url_open_error) + "_url:" + f());
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3476351f7237d70b3563bea134ec0d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3476351f7237d70b3563bea134ec0d0");
        }
        KNBWebCompat.WebHandler c2 = c();
        return c2 != null ? c2.getUrl() : "";
    }

    @Override // com.sankuai.meituan.android.knb.listener.OnAnalyzeParamsListener
    public String appendAnalyzeParams(String str) {
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "911a5a80611fb3d6222308c097dc79ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "911a5a80611fb3d6222308c097dc79ec");
        }
        b d = com.meituan.android.paybase.config.a.d();
        Uri parse = Uri.parse(str);
        Uri.Builder buildUpon = parse.buildUpon();
        if (TextUtils.isEmpty(parse.getQueryParameter("ci"))) {
            try {
                j = Long.parseLong(d.g());
            } catch (NumberFormatException e) {
                a.a(e, "PayBaseWebViewWithTitansFragment_appendAnalyzeParams", (Map<String, Object>) null);
                j = 0;
            }
            buildUpon.appendQueryParameter("ci", j <= 0 ? "" : String.valueOf(j));
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("uuid"))) {
            buildUpon.appendQueryParameter("uuid", d.j());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("version_name"))) {
            buildUpon.appendQueryParameter("version_name", d.l());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_term"))) {
            buildUpon.appendQueryParameter("utm_term", String.valueOf(d.m()));
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_campaign"))) {
            buildUpon.appendQueryParameter("utm_campaign", d.n());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_medium"))) {
            buildUpon.appendQueryParameter("utm_medium", d.d());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_content"))) {
            buildUpon.appendQueryParameter("utm_content", d.j());
        }
        if (TextUtils.isEmpty(parse.getQueryParameter("utm_source"))) {
            buildUpon.appendQueryParameter("utm_source", d.c());
        }
        return buildUpon.toString();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0e54e2289609caa9c59cb09544af8ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0e54e2289609caa9c59cb09544af8ae");
        }
        HashMap<String, Object> e = super.e();
        String f = f();
        if (!TextUtils.isEmpty(f)) {
            e.put("URL", f);
        }
        e.put("nb_container", "browser");
        return e;
    }
}
