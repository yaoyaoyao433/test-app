package com.sankuai.waimai.business.knb;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.ui.TitansUIManager;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.util.HashMap;
/* compiled from: ProGuard */
@SuppressLint({"LogUsage"})
/* loaded from: classes4.dex */
public class VIPCardKNBFragment extends KNBFragment implements com.sankuai.waimai.foundation.core.service.user.b {
    public static ChangeQuickRedirect k;
    private LinearLayout l;
    private View m;
    private View n;
    private long o;
    private com.meituan.android.preload.a p;
    private boolean q;
    private boolean r;
    private boolean s;
    private TextView t;

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
    }

    public VIPCardKNBFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01820fbf74622a242296d2c8b6d79d56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01820fbf74622a242296d2c8b6d79d56");
            return;
        }
        this.q = false;
        this.r = false;
        this.s = false;
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b668006e2b838fd96b0c7f2fda254975", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b668006e2b838fd96b0c7f2fda254975");
            return;
        }
        com.sankuai.waimai.business.knb.utils.b.a("membership", i());
        this.o = System.currentTimeMillis();
        this.q = com.meituan.android.preload.c.a(getActivity(), "waimaiapp", i());
        f.a(this.q);
        super.onCreate(bundle);
        d();
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172cafb379bbc53998b01ee4ddbf574e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172cafb379bbc53998b01ee4ddbf574e");
        } else {
            b(str);
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf60f13ef70cac9994cd1a905bdf82ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf60f13ef70cac9994cd1a905bdf82ec");
            return;
        }
        super.onActivityCreated(bundle);
        com.sankuai.waimai.foundation.utils.log.a.b("VIPCardKNBFragment", "onActivityCreated: ", new Object[0]);
        if (this.q) {
            return;
        }
        this.c.onActivityCreated(bundle);
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661eb0b5da2f7abe9aa382a67b3ec7f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661eb0b5da2f7abe9aa382a67b3ec7f4");
        } else if (this.q) {
            this.p = com.meituan.android.preload.c.a(getActivity());
            this.c = this.p.getKnbWebCompat();
            this.c.putExtraArguments(getArguments());
            this.c.setActivity(getActivity());
        } else {
            super.a();
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c10f07f724f4cc4f3434c8a9a9a4d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c10f07f724f4cc4f3434c8a9a9a4d3");
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        if (this.m != null && (viewGroup2 = (ViewGroup) this.m.findViewById(R.id.lay_web_parent)) != null) {
            viewGroup2.removeViewAt(0);
        }
        if (this.q) {
            this.m = this.p;
        } else {
            this.m = super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        if (this.m != null) {
            this.l = (LinearLayout) this.m.findViewById(R.id.lay_web_parent);
            this.n = LayoutInflater.from(this.F).inflate(R.layout.wm_knb_vip_card_need_login, (ViewGroup) this.l, false);
            this.n.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.knb.VIPCardKNBFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82dbe97133d11900eef2f6d4f57e0f82", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82dbe97133d11900eef2f6d4f57e0f82");
                    } else if (VIPCardKNBFragment.this.F != null) {
                        com.sankuai.waimai.platform.domain.manager.user.a.a((Context) VIPCardKNBFragment.this.F);
                    }
                }
            });
            s();
        }
        return this.m;
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "025ed1c5dfc5d4a606fb7a6cbe502073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "025ed1c5dfc5d4a606fb7a6cbe502073");
        } else if (this.m != null) {
            TextView textView = (TextView) this.m.findViewById(R.id.btn_reload);
            this.i = (TextView) this.m.findViewById(R.id.text_error);
            this.t = (TextView) this.m.findViewById(R.id.txt_sub_info);
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.knb.VIPCardKNBFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb786e44c135934acd6737ec7cb24461", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb786e44c135934acd6737ec7cb24461");
                        } else {
                            VIPCardKNBFragment.this.c.getWebHandler().reload();
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d1653c987cad94a25c6b9d0c464d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d1653c987cad94a25c6b9d0c464d1e");
            return;
        }
        if (this.i == null) {
            e();
        }
        if (this.i == null) {
            return;
        }
        String a = com.sankuai.waimai.business.knb.webview.a.a(i);
        if (TextUtils.isEmpty(a)) {
            this.i.setText("");
            this.i.setVisibility(8);
        } else {
            this.i.setText(a);
            this.i.setVisibility(0);
        }
        if (this.t != null) {
            ErrorCode errorCode = com.sankuai.waimai.monitor.a.a(String.valueOf(i)).b("10326").b;
            String buildErrorCodeStr = errorCode.buildErrorCodeStr();
            this.t.setText(buildErrorCodeStr);
            com.sankuai.waimai.platform.bizdiagnosis.a.a(getActivity());
            com.sankuai.waimai.business.knb.util.c.a(this.d, buildErrorCodeStr, errorCode.getRandomPageId());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e64f349e0e49dd4feda9e99e4761785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e64f349e0e49dd4feda9e99e4761785");
        } else {
            super.onHiddenChanged(z);
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9040da41a7680e61089d97d282ea763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9040da41a7680e61089d97d282ea763");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        super.onDestroy();
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d06e1abb140bcb830626ab07b27f77f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d06e1abb140bcb830626ab07b27f77f");
            return;
        }
        if (aVar == b.a.LOGIN) {
            this.r = false;
            this.s = false;
        }
        s();
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d452e9fc1b1a39bc6dc7d3be472990", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d452e9fc1b1a39bc6dc7d3be472990");
            return;
        }
        super.onStart();
        a_(false);
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "274a85659efbc9a48629e36edd9e8302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "274a85659efbc9a48629e36edd9e8302");
        } else if (this.c == null || !UserCenter.getInstance(this.F.getApplicationContext()).isLogin()) {
        } else {
            if (this.q) {
                e(str);
                return;
            }
            String str2 = (str + "&timestamp=" + this.o) + "&is_member_tab=1";
            if (this.r || this.s) {
                return;
            }
            this.c.loadUrl(str2);
        }
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec97a9c803402a62cc88b5136945c0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec97a9c803402a62cc88b5136945c0f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DeviceInfo.TM, String.valueOf(this.o));
        hashMap.put("is_member_tab", "1");
        this.c.getWebHandler().loadJs(com.meituan.android.preload.c.a(hashMap, str, this.o, this.p, "waimaiapp"));
        this.c.getTitleBarHost().showProgressBar(false);
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e0150a9faa12f4abd483ec7fcb2c8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e0150a9faa12f4abd483ec7fcb2c8b");
            return;
        }
        this.b = str;
        if (this.e != null) {
            this.e.setCustomTitleText(this.b);
        }
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41da2ac575f15e5890620d1548ac8884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41da2ac575f15e5890620d1548ac8884");
        } else if (this.l == null || this.m == null) {
        } else {
            this.l.removeView(this.n);
            View findViewById = this.m.findViewById(R.id.mask);
            if (!UserCenter.getInstance(this.F.getApplicationContext()).isLogin()) {
                this.m.findViewById(R.id.mil_container).setVisibility(8);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
                this.l.addView(this.n, 1);
                return;
            }
            this.m.findViewById(R.id.mil_container).setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f1b513a1cc1922b85d763b3e51b67d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f1b513a1cc1922b85d763b3e51b67d");
            return;
        }
        if (this.q && this.p != null && this.p.getUIManager() != null) {
            this.f = this.p.getUIManager();
            this.c.getTitleBarHost().showProgressBar(false);
        } else {
            this.f = new TitansUIManager();
            this.c.getWebSettings().setUIManager(this.f);
            this.f.setProgressDrawableResId(R.drawable.wm_common_progress_horizontal);
        }
        if (this.q && this.p != null && this.p.getTitleBar() != null) {
            this.e = (g) this.p.getTitleBar();
        } else {
            this.e = new g(this.F);
            this.f.setDefaultTitleBar(this.e);
        }
        this.e.setIsAutoSetTitle(false);
        this.e.findViewById(R.id.web_title_bar).setBackgroundColor(Color.parseColor("#FCFCFC"));
        this.e.findViewById(R.id.title_bar_left_view_container).setVisibility(8);
        TextView textView = (TextView) this.e.findViewById(R.id.knb_title_text);
        textView.setTextSize(17.0f);
        if (com.sankuai.waimai.platform.capacity.immersed.a.a(this.F)) {
            this.f.setTitleHeight(com.sankuai.waimai.foundation.utils.g.a(this.F, 73.0f));
            this.f.setTitlePadding(0, 40, 0, 0);
            textView.setPadding(0, 40, 0, 0);
        }
        this.f.setMaskLayoutResId(R.layout.wm_knb_layout_vip_card_err);
        this.e.setCustomTitleText(this.b);
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15afa8a9e45a22beaaa659518504e705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15afa8a9e45a22beaaa659518504e705");
            return;
        }
        t();
        if (this.q) {
            return;
        }
        this.s = true;
    }

    @Override // com.sankuai.waimai.business.knb.KNBFragment
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f8ac9d0957435cd577fdcfa4172cad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f8ac9d0957435cd577fdcfa4172cad4");
            return;
        }
        t();
        if (this.q) {
            return;
        }
        if (this.g) {
            this.r = false;
        } else {
            this.r = true;
        }
        this.g = false;
        this.s = false;
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c533bdeedb0e3e21cf2033ae310e5e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c533bdeedb0e3e21cf2033ae310e5e7");
        } else if (this.q) {
            Bundle arguments = getArguments();
            a(arguments != null ? arguments.getString("url") : "");
            this.c.getTitleBarHost().showProgressBar(false);
            this.f.setBackIconId(R.drawable.wm_ic_home_as_up_indicator);
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c6a9fa5f8a5bbd8f2af9442969ca5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c6a9fa5f8a5bbd8f2af9442969ca5d");
        } else if (this.c == null || !UserCenter.getInstance(this.F.getApplicationContext()).isLogin() || this.c.getWebHandler() == null || TextUtils.isEmpty(this.c.getWebHandler().getUrl())) {
        } else {
            this.c.getWebHandler().reload();
        }
    }
}
