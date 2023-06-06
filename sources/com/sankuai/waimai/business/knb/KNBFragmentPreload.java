package com.sankuai.waimai.business.knb;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
import com.sankuai.waimai.business.knb.f;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"LogUsage"})
/* loaded from: classes4.dex */
public class KNBFragmentPreload extends KNBFragment {
    public static ChangeQuickRedirect k;
    private long l;
    private com.meituan.android.preload.a m;
    private int n;

    public KNBFragmentPreload() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a948bca930c6bcd6b9bd4deab9a45e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a948bca930c6bcd6b9bd4deab9a45e2");
        } else {
            this.n = 2;
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5ecefbdbecd6dc4c03b6f2f775b8dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5ecefbdbecd6dc4c03b6f2f775b8dd");
            return;
        }
        this.l = System.currentTimeMillis();
        super.onCreate(bundle);
        if (com.sankuai.waimai.business.knb.util.b.a(i())) {
            return;
        }
        a(this.c);
        d();
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void a() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1600f30a2d997a657a53a2a805602acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1600f30a2d997a657a53a2a805602acf");
            return;
        }
        if (com.sankuai.waimai.foundation.core.a.b()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84799560773e5ea9678fb5ad2309e214", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84799560773e5ea9678fb5ad2309e214");
            } else {
                String i = i();
                if (TextUtils.isEmpty(i) || !i.contains("-sl-")) {
                    str = null;
                } else {
                    Uri parse = Uri.parse(i);
                    str = parse.getScheme() + "://" + parse.getHost() + "/node/opt/index-test.html" + (i.indexOf("#") > 0 ? i.substring(i.indexOf("#")) : "");
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.m = new com.meituan.android.preload.a(getActivity(), 1, new f.a());
                this.m.a(str);
                this.m.getKnbWebCompat().setAutoInflateTitleBar(true);
            } else {
                this.m = com.meituan.android.preload.c.a(getActivity());
            }
        } else {
            this.m = com.meituan.android.preload.c.a(getActivity());
        }
        this.c = this.m.getKnbWebCompat();
        this.f = this.m.getUIManager();
        this.c.putExtraArguments(getArguments());
        this.c.setActivity(getActivity());
        String str2 = com.sankuai.waimai.foundation.router.interfaces.b.a + "/" + com.sankuai.waimai.business.knb.services.a.c() + StringUtil.SPACE + com.sankuai.waimai.foundation.router.interfaces.b.a + "-c/" + com.sankuai.waimai.business.knb.services.a.c();
        WebView webView = this.c.getWebView();
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (userAgentString.contains(str2)) {
                return;
            }
            settings.setUserAgentString(userAgentString + StringUtil.SPACE + str2);
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6258e335697f2656c8f9f81ad310f9e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6258e335697f2656c8f9f81ad310f9e0");
            return;
        }
        this.b = h();
        if (this.m.getTitleBar() != null) {
            this.e = (g) this.m.getTitleBar();
        } else {
            this.e = new g(this.F);
            this.f.setDefaultTitleBar(this.e);
        }
        this.e.setWebTitle(this.b);
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.m;
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void a(KNBWebCompat kNBWebCompat) {
        Object[] objArr = {kNBWebCompat};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820f6340d13d0913eadd88a2a248239a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820f6340d13d0913eadd88a2a248239a");
            return;
        }
        this.f.setCloseIconId(R.drawable.wm_titans_web_close);
        this.f.setCustomBackIconId(R.drawable.wm_ic_home_as_up_indicator);
        kNBWebCompat.getTitleBarHost().showProgressBar(false);
        this.f.setProgressDrawableResId(R.drawable.wm_common_progress_horizontal);
        this.f.setSearchIconId(R.drawable.wm_ic_action_search);
        this.f.setShareIconId(R.drawable.wm_knb_share_app);
        this.f.setMaskLayoutResId(R.layout.wm_knb_layout_err);
        f();
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb00b6ed4666119b238ecc1473862076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb00b6ed4666119b238ecc1473862076");
        } else {
            m();
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1037490d95e55595c2192d7b46d688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1037490d95e55595c2192d7b46d688");
        } else {
            m();
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71afaa217fde1ecf7a01db554f7d9b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71afaa217fde1ecf7a01db554f7d9b87");
            return;
        }
        Bundle arguments = getArguments();
        a(arguments != null ? arguments.getString("url") : "");
        this.c.getTitleBarHost().showProgressBar(false);
        this.f.setBackIconId(R.drawable.wm_ic_home_as_up_indicator);
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8858b686758883220ba9e532038560ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8858b686758883220ba9e532038560ab");
            return;
        }
        if (com.meituan.android.preload.config.b.a("waimaiapp") != null) {
            com.sankuai.waimai.business.knb.utils.b.a("webview", "preloadUrl = " + com.meituan.android.preload.config.b.a("waimaiapp").c + " url = " + str);
        }
        b(str);
        String a = com.meituan.android.preload.c.a((Map<String, String>) null, str, this.l, this.m, "waimaiapp");
        com.sankuai.waimai.foundation.utils.log.a.b("knbfragment", "jscode: " + a, new Object[0]);
        this.c.getWebHandler().loadJs(a);
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9095bc88ea99ea04cd12e2807aabda0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9095bc88ea99ea04cd12e2807aabda0");
        } else if (this.c.getTitleBarHost() == null) {
        } else {
            Uri parse = Uri.parse(str);
            if ("1".equals(parse.getQueryParameter("notitlebar"))) {
                this.c.getTitleBarHost().showTitleBar(false);
            }
            if (com.sankuai.waimai.business.knb.util.b.a(com.sankuai.waimai.business.knb.util.b.a((Object) parse.getQueryParameter("future")), this.n)) {
                com.sankuai.waimai.platform.capacity.immersed.a.b(this.F, true);
            }
            Bundle arguments = getArguments();
            if (arguments == null || !"1".equals(arguments.getString("notitlebar"))) {
                return;
            }
            this.c.getTitleBarHost().showTitleBar(false);
        }
    }
}
