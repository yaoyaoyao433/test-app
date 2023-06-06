package com.meituan.android.cashier.oneclick.hybrid;

import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneClickNeoFragment extends HalfPageFragment {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment, com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(NeoConfig neoConfig) {
        Intent intent;
        Uri data;
        Object[] objArr = {neoConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344c49dd120ecd380b5cebc298a76bd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344c49dd120ecd380b5cebc298a76bd5")).booleanValue();
        }
        super.a(neoConfig);
        HashMap hashMap = new HashMap();
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("tradeno");
            if (!TextUtils.isEmpty(queryParameter)) {
                hashMap.put(HybridSignPayJSHandler.ARG_TRADE_NO, queryParameter);
            }
        }
        d.a(this.d, hashMap);
        if (neoConfig == null) {
            a("neo config error");
            return false;
        }
        long d = a.b() ? a.d() : 12000L;
        neoConfig.loadingConfig().setLoadingEnabled(true);
        neoConfig.loadingConfig().setLoadingLayoutId(R.layout.cashieroneclick__fragment);
        neoConfig.loadingConfig().setLoadingDuration(d);
        neoConfig.downgradeConfig().setLoadingTimeout(true);
        neoConfig.uiConfig().setModal(true);
        if (a.c()) {
            neoConfig.downgradeConfig().setNoResponseTime(a.e());
        }
        com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclickpay_offline_status_sc", com.meituan.android.neohybrid.neo.report.a.c("exist_offline_package", neoConfig.getUrl()).a("is_offline", com.meituan.android.neohybrid.neo.offline.b.a(neoConfig.getUrl()) ? "1" : "0").b);
        q.a("cashier_oneclickpaydispatcher_start", n());
        return false;
    }

    private String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c6854d11808fa13240c4e5e48404ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c6854d11808fa13240c4e5e48404ed");
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) activity;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c51f094051a4ad0b96534be79ba3f5f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c51f094051a4ad0b96534be79ba3f5f4");
            return;
        }
        super.a(view);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(R.id.cashier_lottie_view);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setAnimation("oneclickpay_loading.json");
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.b(true);
        lottieAnimationView.a();
        ((TextView) view.findViewById(R.id.cashier_tv_toast_info)).setText(getActivity().getText(R.string.cashieroneclick__toast_default_content));
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final void a(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658500d398acf4608e5c3b68ed4b5ae3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658500d398acf4608e5c3b68ed4b5ae3");
            return;
        }
        super.a(view, z, z2);
        view.setVisibility(8);
    }

    @Override // com.meituan.android.neohybrid.container.NeoBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb645465f4f50b124d8ef19e120dd4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb645465f4f50b124d8ef19e120dd4c");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment, com.meituan.android.neohybrid.container.NeoBaseFragment, com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "847d321081a4fc0bcfe0d936a8bf2a5f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "847d321081a4fc0bcfe0d936a8bf2a5f")).booleanValue();
        }
        com.meituan.android.cashier.oneclick.util.a.a("b_pay_oneclick_pay_downgrade_to_standard_cashier_sc", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 10).b);
        q.c("oneclick_pay_downgrade_to_standard_cashier", com.meituan.android.neohybrid.neo.report.a.c(KnbConstants.PARAMS_SCENE, 10).b, n());
        com.meituan.android.cashier.oneclick.util.b.c(1100031);
        com.meituan.android.cashier.oneclick.presenter.a.a().a(getActivity(), str);
        return true;
    }
}
