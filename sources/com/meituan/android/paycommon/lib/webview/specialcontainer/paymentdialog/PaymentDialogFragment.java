package com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.moduleinterface.picasso.coupondialog.DynamicLayout;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ab;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paycommon.lib.retrofit.PayCommonRequestService;
import com.meituan.android.paycommon.lib.utils.d;
import com.meituan.android.paycommon.lib.utils.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.TitansXWebView;
import com.sankuai.meituan.android.knb.listener.OnWebClientListener;
import java.util.HashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PaymentDialogFragment extends PayBaseFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a = null;
    private static int d = 378;
    private static double f = 4.0d;
    private String b;
    private double c;
    private com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void a(String str);

        void a(String str, String str2);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        return true;
    }

    public PaymentDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4afb45ec68b764a98663badde63510a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4afb45ec68b764a98663badde63510a");
            return;
        }
        this.b = null;
        this.c = 0.0d;
    }

    public static /* synthetic */ HashMap a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8adbc04075f984320a843800510ff17b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8adbc04075f984320a843800510ff17b");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (HashMap) new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() { // from class: com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.4
        }.getType());
    }

    public static /* synthetic */ void a(FragmentActivity fragmentActivity, String str, String str2, String str3, double d2, int i) {
        PaymentDialogFragment paymentDialogFragment;
        Object[] objArr = {fragmentActivity, str, str2, str3, Double.valueOf(d2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0220d1b8ddc4cf4537e912776f44ac5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0220d1b8ddc4cf4537e912776f44ac5c");
            return;
        }
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Object[] objArr2 = {null, str3, str2, str, Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c8540e067382e06cd0c5fd3908432756", RobustBitConfig.DEFAULT_VALUE)) {
            paymentDialogFragment = (PaymentDialogFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c8540e067382e06cd0c5fd3908432756");
        } else {
            paymentDialogFragment = new PaymentDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("hybridUrl", str);
            bundle.putDouble("loadingTime", d2);
            paymentDialogFragment.setArguments(bundle);
        }
        beginTransaction.replace(i, paymentDialogFragment);
        beginTransaction.commitAllowingStateLoss();
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d8e7fe6c3e529ef22211f4d70543a45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d8e7fe6c3e529ef22211f4d70543a45");
            return;
        }
        super.onAttach(activity);
        if (getTargetFragment() instanceof com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) {
            this.e = (com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) getTargetFragment();
        } else if (activity instanceof com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) {
            this.e = (com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) activity;
        } else {
            try {
                this.e = (com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a) activity.getClass().getMethod("getConfirmCallBack", new Class[0]).invoke(activity, new Object[0]);
            } catch (Exception e) {
                com.meituan.android.paybase.common.analyse.a.a(e);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acb2757aa66b0af2cc00becbb0ee3efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acb2757aa66b0af2cc00becbb0ee3efc");
        } else {
            super.onDetach();
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4350245ad7e63da0efee2e3da5affa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4350245ad7e63da0efee2e3da5affa9");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = getArguments().getString("hybridUrl");
            this.c = getArguments().getDouble("loadingTime");
        }
        r.a("b_pay_9nitscw4_mv");
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "549f9317e21e144f0f0f59e1a339b13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "549f9317e21e144f0f0f59e1a339b13b");
            return;
        }
        c a2 = c.a();
        FragmentActivity activity = getActivity();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "dad6d859257da2c7958f7342357ce836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "dad6d859257da2c7958f7342357ce836");
        } else {
            TitansXWebView titansXWebView = a2.e.get(activity);
            if (titansXWebView != null) {
                titansXWebView.destroy();
            }
            a2.e.remove(activity);
            a2.f.remove(activity);
            a2.g.remove(activity);
        }
        super.onDestroy();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c25f44347220c0ce58b21a86d61f686", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c25f44347220c0ce58b21a86d61f686");
        }
        View inflate = layoutInflater.inflate(R.layout.paycommon__payment_dialog, viewGroup, false);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dynamic_coupon_content);
        c a2 = c.a();
        FragmentActivity activity = getActivity();
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        TitansXWebView titansXWebView = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "e61bce0716967a511b5fb25f29ecd952", RobustBitConfig.DEFAULT_VALUE) ? (TitansXWebView) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "e61bce0716967a511b5fb25f29ecd952") : a2.e.get(activity);
        if (titansXWebView == null) {
            c.a().a(getActivity(), a(getActivity(), this.b, this.c, this.e));
        } else {
            int width = (int) (getActivity().getWindowManager().getDefaultDisplay().getWidth() * c.a().c);
            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
            layoutParams.height = (int) (width / c.a().d);
            layoutParams.width = width;
            relativeLayout.setLayoutParams(layoutParams);
            titansXWebView.setVisibility(0);
            if (titansXWebView.getParent() != null) {
                ((ViewGroup) titansXWebView.getParent()).removeView(titansXWebView);
            }
            relativeLayout.addView(titansXWebView);
        }
        return inflate;
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16c02b92daa2de480e2bad14fc1441c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16c02b92daa2de480e2bad14fc1441c");
            return;
        }
        super.onViewCreated(view, bundle);
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_popup", 1180003);
        com.meituan.android.paybase.metrics.a.c("tti_payment_dialog", "payment_dialog_show_end");
        com.meituan.android.paybase.metrics.a.b("tti_payment_dialog");
        c a2 = c.a();
        FragmentActivity activity = getActivity();
        a aVar = new a() { // from class: com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06e7eb7112d99462b911d50f6bf2c005", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06e7eb7112d99462b911d50f6bf2c005");
                } else {
                    PaymentDialogFragment.this.c();
                }
            }

            @Override // com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7df221800be4d270ce678d6b88dc462", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7df221800be4d270ce678d6b88dc462");
                } else {
                    al.a(PaymentDialogFragment.this.getActivity(), str);
                }
            }

            @Override // com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.a
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc714fb67a9fe08c3b04e6d1b4485d93", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc714fb67a9fe08c3b04e6d1b4485d93");
                } else {
                    ((PayCommonRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayCommonRequestService.class, PaymentDialogFragment.this, PaymentDialogFragment.d)).startCouponRequest(str, PaymentDialogFragment.a(str2));
                }
            }
        };
        Object[] objArr2 = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "430fb92b5ca0d2d977007dfa81ca8a90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "430fb92b5ca0d2d977007dfa81ca8a90");
        } else {
            a2.g.put(activity, aVar);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        ActionBar supportActionBar;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c775eb39aa6540b68a82409e104691fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c775eb39aa6540b68a82409e104691fd");
            return;
        }
        super.onActivityCreated(bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d03e71c5f69aea3daf067da3e6f8954f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d03e71c5f69aea3daf067da3e6f8954f");
        } else if (getActivity() == null || (supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar()) == null) {
        } else {
            supportActionBar.e(false);
            supportActionBar.c();
        }
    }

    private static String a(Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf42c30e107012941d9fcbebc4b31af8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf42c30e107012941d9fcbebc4b31af8");
        }
        try {
            String json = new GsonBuilder().create().toJson(obj);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("trans_id", str);
            jSONObject3.put("tradeno", str2);
            jSONObject2.put("modalInfo", new JSONObject(json));
            jSONObject2.put("extraInfo", jSONObject3);
            jSONObject.put("result", jSONObject2.toString());
            return jSONObject.toString();
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CouponPromotionFragment_getJsonData").a("message", e.getMessage()).b);
            return null;
        }
    }

    private static TitansXWebView a(@NonNull FragmentActivity fragmentActivity, final String str, double d2, final com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a aVar) {
        Object[] objArr = {fragmentActivity, str, Double.valueOf(d2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c4cbacfc81222b6922f0cadf64f366c", RobustBitConfig.DEFAULT_VALUE)) {
            return (TitansXWebView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c4cbacfc81222b6922f0cadf64f366c");
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_popup", 1180001);
        TitansXWebView titansXWebView = new TitansXWebView(fragmentActivity);
        titansXWebView.loadUrl(str);
        titansXWebView.setVisibility(4);
        Display defaultDisplay = fragmentActivity.getWindowManager().getDefaultDisplay();
        titansXWebView.measure(View.MeasureSpec.makeMeasureSpec(defaultDisplay.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(defaultDisplay.getHeight(), Integer.MIN_VALUE));
        titansXWebView.layout(0, 0, 0, 0);
        titansXWebView.setOnWebViewClientListener(new OnWebClientListener() { // from class: com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
            public final void onPageFinished(String str2) {
            }

            @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
            public final boolean shouldOverrideUrlLoading(String str2) {
                return false;
            }

            @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
            public final void onPageStarted(String str2, Bitmap bitmap) {
                Object[] objArr2 = {str2, bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0594ef11866c1bd6cf56bb302d1c5586", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0594ef11866c1bd6cf56bb302d1c5586");
                } else if (!TextUtils.equals(str2, str) || aVar == null) {
                } else {
                    aVar.showProgress();
                }
            }

            @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
            public final void onReceivedError(int i, String str2, String str3) {
                Object[] objArr2 = {Integer.valueOf(i), str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2454bf806e705baf3c5fc0b3dfeffab4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2454bf806e705baf3c5fc0b3dfeffab4");
                    return;
                }
                com.meituan.android.paybase.common.analyse.cat.a.a("urlOpenError", "WebView页面打开异常_failingUrl:" + str3 + "_error:" + i + "_description:" + str2);
                StringBuilder sb = new StringBuilder("onReceivedError errorCode: ");
                sb.append(i);
                r.a("b_pay_dm1vy5s8_mv", sb.toString());
            }

            @Override // com.sankuai.meituan.android.knb.listener.OnWebClientListener
            public final void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
                Object[] objArr2 = {sslErrorHandler, sslError};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e47f59c11a8512fe77e088ebd64ea1f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e47f59c11a8512fe77e088ebd64ea1f5");
                    return;
                }
                com.meituan.android.paybase.common.analyse.cat.a.a("urlOpenError", "WebView页面打开异常_url:" + str);
                r.a("b_pay_dm1vy5s8_mv", "onReceivedSslError");
            }
        });
        return titansXWebView;
    }

    public static void a(@NonNull final FragmentActivity fragmentActivity, DynamicLayout dynamicLayout, final String str, final String str2, final String str3, final double d2, final com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a aVar, @IdRes final int i) {
        Object[] objArr = {fragmentActivity, dynamicLayout, str, str2, str3, Double.valueOf(d2), aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa17e2d32e93cdb088f9fc45f3f9e1ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa17e2d32e93cdb088f9fc45f3f9e1ca");
            return;
        }
        Object[] objArr2 = {str, str3, Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = r.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d3264213d5d54315424cb9f532274818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d3264213d5d54315424cb9f532274818");
        } else {
            try {
                HashMap hashMap = new HashMap(3);
                hashMap.put("tradeNo", str);
                hashMap.put("hybridUrl", str3);
                hashMap.put("loadingTime", Double.valueOf(d2));
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = r.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "6586a11b58b4a2958ec82b79c9d4d71d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "6586a11b58b4a2958ec82b79c9d4d71d");
                } else {
                    ae.a("com.meituan.android.paycommon.lib.utils.PaymentDialogStatisticsUtilsUtil");
                }
                ae.a("com.meituan.android.paycommon.lib.utils.PaymentDialogStatisticsUtilsUtil", (HashMap<String, Object>) hashMap);
            } catch (Exception unused) {
                com.meituan.android.paybase.common.analyse.cat.a.a("PaymentDialogStatisticsUtilsUtil", "registerCommonBusinessParams");
            }
        }
        r.a("b_pay_img9sxmf_mv");
        if (dynamicLayout == null || TextUtils.isEmpty(str3)) {
            com.meituan.android.paybase.common.analyse.cat.a.a("serverDataError", "后端下发的数据异常");
            if (aVar != null) {
                aVar.onClickCouponDialogConfirm();
            }
        }
        String a2 = a(dynamicLayout, str2, str);
        if (TextUtils.isEmpty(a2) && aVar != null) {
            aVar.onClickCouponDialogConfirm();
        }
        c.a().b = a2;
        com.meituan.android.paybase.metrics.a.b("tti_payment_dialog", "payment_dialog_show_start");
        final boolean[] zArr = {false};
        new Handler().postDelayed(b.a(zArr, fragmentActivity, aVar), d2 > 0.0d ? ((long) d2) * 1000 : (long) (f * 1000.0d));
        final TitansXWebView a3 = a(fragmentActivity, str3, d2, aVar);
        com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.a aVar2 = new com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.a() { // from class: com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.PaymentDialogFragment.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.webview.specialcontainer.paymentdialog.a
            public final void a(double d3, double d4) {
                Object[] objArr4 = {Double.valueOf(d3), Double.valueOf(d4)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "68aac70ba111e148e378941e5747fb33", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "68aac70ba111e148e378941e5747fb33");
                    return;
                }
                zArr[0] = true;
                if (aVar != null) {
                    aVar.hideProgress();
                }
                c.a().a(fragmentActivity, a3);
                PaymentDialogFragment.a(fragmentActivity, str3, str2, str, d2, i);
            }
        };
        c a4 = c.a();
        Object[] objArr4 = {fragmentActivity, aVar2};
        ChangeQuickRedirect changeQuickRedirect4 = c.a;
        if (PatchProxy.isSupport(objArr4, a4, changeQuickRedirect4, false, "75b6d56d3c7ebc3c7546a8912af2a169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a4, changeQuickRedirect4, false, "75b6d56d3c7ebc3c7546a8912af2a169");
        } else {
            a4.f.put(fragmentActivity, aVar2);
        }
    }

    public static /* synthetic */ void a(boolean[] zArr, FragmentActivity fragmentActivity, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a aVar) {
        Object[] objArr = {zArr, fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60a1422d009fedbe3e3ea4637acb6bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60a1422d009fedbe3e3ea4637acb6bd1");
        } else if (zArr[0] || fragmentActivity == null) {
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("timeOut", "加载H5超时处理");
            r.a("b_pay_1v17h1sb_mv", "加载H5超时处理");
            if (aVar != null) {
                aVar.onClickCouponDialogConfirm();
            }
        }
    }

    public static void a(@NonNull FragmentActivity fragmentActivity, DynamicLayout dynamicLayout, String str, String str2, String str3, double d2, com.meituan.android.paybase.moduleinterface.picasso.coupondialog.a aVar) {
        Object[] objArr = {fragmentActivity, dynamicLayout, str, str2, str3, Double.valueOf(d2), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "050e23aa87fc2aa24ffc6951c1133951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "050e23aa87fc2aa24ffc6951c1133951");
            return;
        }
        ab.a((Activity) fragmentActivity);
        a(fragmentActivity, dynamicLayout, str, str2, str3, d2, aVar, R.id.content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aab178ff6fef30ae128cfa6e234cfbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aab178ff6fef30ae128cfa6e234cfbb");
        } else if (this.e != null) {
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_hybrid_popup", 1180004);
            this.e.onClickCouponDialogConfirm();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f92c32a4c1d9d0d7e6f4d048d91ae2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f92c32a4c1d9d0d7e6f4d048d91ae2b");
        } else if (i == d) {
            if (obj instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) obj;
                if (jsonObject.get("message") != null) {
                    e.a((Activity) getActivity(), (Object) jsonObject.get("message").getAsString());
                }
            }
            c();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2872a932fff91bafacfdeb8eef49612f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2872a932fff91bafacfdeb8eef49612f");
        } else if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            if (payException.getLevel() != 2 || payException.getLevel() != 3) {
                c();
            }
            d.a(getActivity(), exc, null);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ebced74ca6d59404115366772bf5c68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ebced74ca6d59404115366772bf5c68");
        } else {
            hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af14086378cda18128961f38382a1a8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af14086378cda18128961f38382a1a8c");
        } else {
            showProgress();
        }
    }
}
