package com.meituan.android.cashier;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.activity.MTCashierWrapperActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.u;
import com.meituan.android.cashier.dialog.AutomaticPayGuideDialog;
import com.meituan.android.cashier.dialogfragment.AutomaticPayGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.CardPayFunctionGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.CardPayRedEnvelopeGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.CommonGuideFragment;
import com.meituan.android.cashier.dialogfragment.CreditPayGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.PayLaterGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.PromotionSignedGuideFragment;
import com.meituan.android.cashier.fragment.MTCashierRevisionFragment;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.MTPaymentURL;
import com.meituan.android.cashier.model.bean.OrderResult;
import com.meituan.android.cashier.model.bean.OverLoadInfo;
import com.meituan.android.cashier.model.bean.PayLaterPopDetailInfoBean;
import com.meituan.android.cashier.model.bean.PayResult;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.cashier.model.bean.RetainWindow;
import com.meituan.android.cashier.model.bean.RouteInfo;
import com.meituan.android.cashier.model.bean.SubmitData;
import com.meituan.android.cashier.payresult.a;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.hybridcashier.cashier.HybridCashierSetting;
import com.meituan.android.hybridcashier.config.bean.HybridCashierConfig;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.aa;
import com.meituan.android.paybase.utils.ac;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.ah;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.f;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paybase.utils.r;
import com.meituan.android.paycommon.lib.abtest.CommonABTestManager;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class NativeStandardCashierAdapter extends u implements AutomaticPayGuideDialog.a, PayActionListener, com.meituan.android.paybase.moduleinterface.payment.a {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private boolean C;
    private FragmentActivity D;
    private com.meituan.android.paybase.retrofit.b E;
    private String F;
    private String G;
    private Uri H;
    @MTPayNeedToPersist
    private String I;
    private final int J;
    private Dialog K;
    @MTPayNeedToPersist
    private boolean L;
    @MTPayNeedToPersist
    private int M;
    private CashierPopWindowBean N;
    private com.meituan.android.cashier.payresult.a O;
    private RefreshBroadCastReceiver P;
    @MTPayNeedToPersist
    private boolean Q;
    private CashierParams R;
    private com.meituan.android.neohybrid.neo.http.a S;
    public String b;
    @MTPayNeedToPersist
    public String c;
    public boolean d;
    @MTPayNeedToPersist
    public boolean e;
    public com.meituan.android.cashier.common.i f;
    public String g;
    public String h;
    @MTPayNeedToPersist
    public RouteInfo i;
    public String j;
    public String k;
    public com.meituan.android.cashier.payresult.d l;
    public boolean m;
    public String n;
    private String q;
    private boolean r;
    private boolean s;
    private OverLoadInfo t;
    private String u;
    private boolean v;
    @MTPayNeedToPersist
    private boolean w;
    private a x;
    private Boolean y;
    private boolean z;

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void b(String str) {
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f018769eccc52b9582d2ca668985bd05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f018769eccc52b9582d2ca668985bd05");
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final String i() {
        return "native_standard_cashier";
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
    }

    public NativeStandardCashierAdapter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b998163b7bfb2b334aef553f1c8ce34b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b998163b7bfb2b334aef553f1c8ce34b");
            return;
        }
        this.d = true;
        this.v = false;
        this.w = false;
        this.e = false;
        this.J = R.id.content;
        this.j = "";
        this.Q = false;
    }

    public static /* synthetic */ boolean a(NativeStandardCashierAdapter nativeStandardCashierAdapter, boolean z) {
        nativeStandardCashierAdapter.d = true;
        return true;
    }

    public static /* synthetic */ boolean j(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, nativeStandardCashierAdapter, changeQuickRedirect, false, "dfa85df95b51344688107dbbe3013f6e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, nativeStandardCashierAdapter, changeQuickRedirect, false, "dfa85df95b51344688107dbbe3013f6e")).booleanValue() : nativeStandardCashierAdapter.D.isFinishing();
    }

    @Override // com.meituan.android.cashier.common.ICashier
    public final <T extends FragmentActivity & com.meituan.android.cashier.common.i & com.meituan.android.paybase.retrofit.b> ICashier.a a(T t, CashierParams cashierParams) {
        Object[] objArr = {t, cashierParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d8bfbdb6bf54059d2938fa9a33e72e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d8bfbdb6bf54059d2938fa9a33e72e");
        }
        this.R = cashierParams;
        this.H = cashierParams.getUri();
        this.q = cashierParams.getCallbackUrl();
        this.F = cashierParams.getTradeNo();
        this.G = cashierParams.getPayToken();
        this.D = t;
        this.g = cashierParams.getExtraData();
        this.n = cashierParams.getExtraStatics();
        this.k = cashierParams.getDowngradeInfo();
        this.f = t;
        this.E = t;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        this.O = new com.meituan.android.cashier.payresult.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "17b5c619ddd6d6b4a3c6f2ae94330e01", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0190a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "17b5c619ddd6d6b4a3c6f2ae94330e01") : new b(this), this, (MTCashierActivity) this.D, this.f, this.F);
        this.Q = false;
        this.l = new com.meituan.android.cashier.payresult.d(this.f, (MTCashierActivity) this.D, this.F, this.G, this.g, this.n);
        this.l.d = this;
        return new ICashier.a(true);
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, OverLoadInfo overLoadInfo) {
        Object[] objArr = {nativeStandardCashierAdapter, overLoadInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "642ccc73cbea7a105b1c1382ad1f2688", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "642ccc73cbea7a105b1c1382ad1f2688");
            return;
        }
        nativeStandardCashierAdapter.t = overLoadInfo;
        nativeStandardCashierAdapter.a(nativeStandardCashierAdapter.D);
    }

    public final void a() {
        Cashier a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8d8a63cbb8070fd570538e37aa3f621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8d8a63cbb8070fd570538e37aa3f621");
        } else if (!this.Q && !this.s && this.i != null && this.i.getCashierPopWindowBean() != null && TextUtils.equals(CashierPopWindowBean.INTERRUPT_PAY_SCENE, this.i.getCashierPopWindowBean().getPopScene()) && this.i.getCashierInfo() != null && (a2 = a(this.i)) != null && !com.meituan.android.paybase.utils.i.a((Collection) a2.getPaymentDataList())) {
            String str = this.c;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            for (CashierPayment cashierPayment : a2.getPaymentDataList()) {
                if (cashierPayment != null && cashierPayment.getPayType() != null && TextUtils.equals(cashierPayment.getPayType(), str) && cashierPayment.isSupportInterrupt()) {
                    if (this.i.getCashierPopWindowBean().getPopDetailInfo() == null || this.D == null || this.D.getSupportFragmentManager() == null) {
                        return;
                    }
                    Fragment findFragmentById = this.D.getSupportFragmentManager().findFragmentById(this.J);
                    if ((findFragmentById instanceof MTCashierRevisionFragment) && MTCashierRevisionFragment.a(this.i.getCashierPopWindowBean(), CashierPopWindowBean.INTERRUPT_PAY_SCENE)) {
                        this.Q = a(this.i.getCashierPopWindowBean(), findFragmentById.getChildFragmentManager());
                    }
                }
            }
        }
    }

    public final boolean a(CashierPopWindowBean cashierPopWindowBean, FragmentManager fragmentManager) {
        boolean z = false;
        boolean z2 = true;
        Object[] objArr = {cashierPopWindowBean, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f55b95c82df24c965e93e01b72fb7ada", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f55b95c82df24c965e93e01b72fb7ada")).booleanValue();
        }
        if (this.s || cashierPopWindowBean == null || cashierPopWindowBean.getPopDetailInfo() == null || fragmentManager == null) {
            return false;
        }
        PopDetailInfo popDetailInfo = cashierPopWindowBean.getPopDetailInfo();
        popDetailInfo.setPopScene(cashierPopWindowBean.getPopScene());
        String style = popDetailInfo.getStyle();
        if (TextUtils.equals(PopDetailInfo.RED_ENVELOPE_STYLE, style) && a(popDetailInfo)) {
            CardPayRedEnvelopeGuideDialogFragment.a(cashierPopWindowBean).a(fragmentManager);
        } else if (TextUtils.equals(PopDetailInfo.FUNCTION_STYLE, style) && a(popDetailInfo)) {
            CardPayFunctionGuideDialogFragment.a(cashierPopWindowBean).a(fragmentManager);
        } else if (TextUtils.equals(PopDetailInfo.CREDITPAY_STYLE, style) && a(popDetailInfo)) {
            CreditPayGuideDialogFragment.a(cashierPopWindowBean.getPopScene(), popDetailInfo).a(fragmentManager);
        } else if (TextUtils.equals(PopDetailInfo.FUNCTION_SINGED_STYLE, style)) {
            PromotionSignedGuideFragment a2 = PromotionSignedGuideFragment.a(cashierPopWindowBean);
            if (a2.a(popDetailInfo)) {
                a2.a(fragmentManager);
                z = true;
            }
            z2 = z;
        } else if (TextUtils.equals(PopDetailInfo.COMMON_STYLE, style) && CommonGuideFragment.a(popDetailInfo)) {
            CommonGuideFragment.a(cashierPopWindowBean).a(fragmentManager);
        } else {
            z2 = false;
        }
        a(cashierPopWindowBean);
        return z2;
    }

    private boolean a(PopDetailInfo popDetailInfo) {
        Object[] objArr = {popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4d86e3af5a0007ba2b01d0146cec5ce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4d86e3af5a0007ba2b01d0146cec5ce")).booleanValue() : (popDetailInfo == null || TextUtils.isEmpty(popDetailInfo.getSubtitle())) ? false : true;
    }

    private void a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6e9d163328649b7f15cda9735a8b4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6e9d163328649b7f15cda9735a8b4c");
        } else if (this.s || cashierPopWindowBean == null || cashierPopWindowBean.getPopDetailInfo() == null) {
        } else {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("cashierType", RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
            hashMap.put("action", "popup");
            hashMap.put("tradeno", this.F);
            hashMap.put("nb_platform", "android");
            hashMap.put("halfScreenType", Integer.valueOf(cashierPopWindowBean.getType()));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("popupType", cashierPopWindowBean.getPopDetailInfo().getPopupType());
            jsonObject.addProperty("popupScene", cashierPopWindowBean.getPopScene());
            hashMap.put("userActionInfo", jsonObject.toString());
            com.meituan.android.paycommon.lib.utils.m.b((MTCashierActivity) this.D, hashMap);
            if (!com.meituan.android.paybase.utils.i.a(b())) {
                hashMap.putAll(b());
            }
            ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 10001)).saveActionInfo(hashMap);
        }
    }

    private RefreshBroadCastReceiver k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58151088e9f788819329e651787f6d75", RobustBitConfig.DEFAULT_VALUE)) {
            return (RefreshBroadCastReceiver) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58151088e9f788819329e651787f6d75");
        }
        if (this.P == null) {
            this.P = new RefreshBroadCastReceiver(this.D, this);
        }
        return this.P;
    }

    public final HashMap<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f8a0b1497fe8ff6b9be6e84996314f", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f8a0b1497fe8ff6b9be6e84996314f") : this.R.getExtendTransmissionParams();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class RefreshBroadCastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        private final WeakReference<NativeStandardCashierAdapter> b;
        private final WeakReference<Activity> c;

        public RefreshBroadCastReceiver(Activity activity, NativeStandardCashierAdapter nativeStandardCashierAdapter) {
            Object[] objArr = {activity, nativeStandardCashierAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e208c0359b58a3a30998f3326dd5c565", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e208c0359b58a3a30998f3326dd5c565");
                return;
            }
            this.b = new WeakReference<>(nativeStandardCashierAdapter);
            this.c = new WeakReference<>(activity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NativeStandardCashierAdapter nativeStandardCashierAdapter;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d594195b3ba36225968760e5064e7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d594195b3ba36225968760e5064e7a");
            } else if (this.c.get() == null || !r.a(this.c.get(), "com.meituan.android.cashier.standardCashier.refresh", intent) || (nativeStandardCashierAdapter = this.b.get()) == null) {
            } else {
                nativeStandardCashierAdapter.m = true;
            }
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e940f1aebf0df585bd9b016921fab8d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e940f1aebf0df585bd9b016921fab8d7");
            return;
        }
        if (this.H != null) {
            this.b = this.H.getQueryParameter("merchant_no");
        }
        if (!TextUtils.isEmpty(this.g)) {
            try {
                JSONObject jSONObject = new JSONObject(this.g);
                this.h = jSONObject.optString("app_id");
                this.j = jSONObject.optString("guide_plan_infos");
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "StandardCashier_start_parseJson", (Map<String, Object>) null);
            }
        }
        this.x = new a(this);
        com.meituan.android.paymentchannel.b.a().a(this.D, this);
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6aaff1077e90df73d588635dbe4a6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6aaff1077e90df73d588635dbe4a6d");
            return;
        }
        Fragment findFragmentById = this.D.getSupportFragmentManager().findFragmentById(this.J);
        if (findFragmentById instanceof MTCashierRevisionFragment) {
            ((MTCashierRevisionFragment) findFragmentById).a(null, null, null, this.b, null, null, this.C);
        } else {
            n();
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff1406fb8b1c78209392afff88b7cf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff1406fb8b1c78209392afff88b7cf2");
            return;
        }
        this.D.getSupportFragmentManager().beginTransaction().replace(this.J, new MTCashierRevisionFragment()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de0cc7c1ad436157faac87ce72a2533a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de0cc7c1ad436157faac87ce72a2533a");
        }
        if (TextUtils.isEmpty(this.n)) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.n);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "standardcashier_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    private boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1726a92a12b07a459d7aa9f30b38dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1726a92a12b07a459d7aa9f30b38dc")).booleanValue();
        }
        if (this.y == null) {
            this.y = Boolean.valueOf(TextUtils.equals("1", ac.b(this.D).b("is_root", "-1")));
        }
        return this.y.booleanValue();
    }

    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    private void a(final String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6984fd1295464f79154ed62878ba4050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6984fd1295464f79154ed62878ba4050");
            return;
        }
        q.b("b_eJyo9", new a.b().a().b, this.p);
        this.C = z;
        final com.meituan.android.cipstorage.q b = ac.b(this.D);
        final int b2 = b.b("installed_apps", -1);
        final String b3 = b.b("is_root", "-1");
        final String b4 = com.meituan.android.paymentchannel.utils.b.b(this.D.getApplicationContext());
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " REQ_TAG_ROUTE_start");
        com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " request_start");
        a.c cVar = new a.c();
        q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " request_start").b, this.p);
        if (b2 != -1 && !TextUtils.equals("-1", b3)) {
            if (!b(str, z)) {
                CashierRequestService cashierRequestService = (CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.E, 1370);
                String str2 = this.F;
                String str3 = this.G;
                StringBuilder sb = new StringBuilder();
                sb.append(b2);
                cashierRequestService.startRouting(str2, str3, b3, sb.toString(), this.q, str, com.meituan.android.paycommon.lib.config.a.a().o(), b4, this.k, this.j, this.g, o(), b());
            }
            this.y = Boolean.valueOf(TextUtils.equals("1", b3));
        }
        new com.meituan.android.paybase.asynctask.a<String, Integer, Integer>() { // from class: com.meituan.android.cashier.NativeStandardCashierAdapter.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paybase.asynctask.b
            public final /* synthetic */ Object a(Object[] objArr2) {
                Object[] objArr3 = {(String[]) objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "3c932daa178a87ba64351cec481d57b9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "3c932daa178a87ba64351cec481d57b9");
                }
                b.a("is_root", ah.a() ? "1" : "0");
                int a2 = com.meituan.android.paymentchannel.utils.a.a(NativeStandardCashierAdapter.this.D.getApplicationContext());
                b.a("installed_apps", a2);
                return Integer.valueOf(a2);
            }

            @Override // com.meituan.android.paybase.asynctask.b
            public final /* synthetic */ void a(Object obj) {
                Integer num = (Integer) obj;
                Object[] objArr2 = {num};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fe1d2ae0f886e37d894327d52d93e78", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fe1d2ae0f886e37d894327d52d93e78");
                } else if (b2 == -1 || TextUtils.equals("-1", b3)) {
                    String b5 = b.b("is_root", "-1");
                    if (!NativeStandardCashierAdapter.this.b(str, z)) {
                        CashierRequestService cashierRequestService2 = (CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, NativeStandardCashierAdapter.this.E, 1370);
                        String str4 = NativeStandardCashierAdapter.this.F;
                        String str5 = NativeStandardCashierAdapter.this.G;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(num);
                        cashierRequestService2.startRouting(str4, str5, b5, sb2.toString(), NativeStandardCashierAdapter.this.q, str, com.meituan.android.paycommon.lib.config.a.a().o(), b4, NativeStandardCashierAdapter.this.k, NativeStandardCashierAdapter.this.j, NativeStandardCashierAdapter.this.g, NativeStandardCashierAdapter.this.o(), NativeStandardCashierAdapter.this.b());
                    }
                    NativeStandardCashierAdapter.this.y = Boolean.valueOf(TextUtils.equals("1", b5));
                }
            }
        }.b(new String[0]);
        q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a34cb1b52e8d31aadf78133889d1ad0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a34cb1b52e8d31aadf78133889d1ad0")).booleanValue();
        }
        if (((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).isEnableUseHybridDispatcher() && str == null && !z) {
            HybridCashierConfig hybridCashierConfig = null;
            try {
                hybridCashierConfig = (HybridCashierConfig) com.meituan.android.neohybrid.util.gson.b.b().fromJson(this.R.getPreDispatcherCashierConfig("hybrid_standard_cashier"), (Class<Object>) HybridCashierConfig.class);
            } catch (Exception unused) {
                com.meituan.android.paybase.common.analyse.cat.a.a("NativeStandardCashierAdapter", "startHybridRequest_error");
            }
            if (hybridCashierConfig == null) {
                return false;
            }
            com.meituan.android.neohybrid.init.a.b();
            if (this.S == null) {
                this.S = new com.meituan.android.neohybrid.neo.http.a<String>() { // from class: com.meituan.android.cashier.NativeStandardCashierAdapter.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.neohybrid.neo.http.a
                    public final /* synthetic */ void onRequestSucc(int i, String str2) {
                        String str3 = str2;
                        Object[] objArr2 = {Integer.valueOf(i), str3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac4c8a267d1db59b8e302fceff3d0fcf", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac4c8a267d1db59b8e302fceff3d0fcf");
                            return;
                        }
                        JsonElement jsonElement = (JsonElement) n.a().fromJson(str3, (Class<Object>) JsonElement.class);
                        if (!jsonElement.isJsonObject()) {
                            onRequestFail(i, new IOException("return data is not JsonObject"));
                            return;
                        }
                        JsonObject jsonObject = (JsonObject) jsonElement;
                        if (jsonObject.has("data")) {
                            JsonElement jsonElement2 = jsonObject.get("data");
                            if (!jsonElement2.isJsonObject()) {
                                onRequestFail(i, new IOException("return data is not JsonObject"));
                                return;
                            }
                            NativeStandardCashierAdapter.this.E.onRequestSucc(i, (RouteInfo) n.a().fromJson(jsonElement2, (Class<Object>) RouteInfo.class));
                            NativeStandardCashierAdapter.this.E.onRequestFinal(1370);
                        } else if (jsonObject.has("error")) {
                            onRequestFail(i, new PayException(jsonObject.get("error")));
                        } else {
                            onRequestFail(i, new IOException("return content error"));
                        }
                    }

                    @Override // com.meituan.android.neohybrid.neo.http.a
                    public final void onRequestFail(int i, Exception exc) {
                        Object[] objArr2 = {Integer.valueOf(i), exc};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce8de827c9649ad8089da9e28b28fb06", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce8de827c9649ad8089da9e28b28fb06");
                            return;
                        }
                        NativeStandardCashierAdapter.this.E.onRequestException(i, exc);
                        NativeStandardCashierAdapter.this.E.onRequestFinal(1370);
                    }
                };
            }
            HybridCashierSetting a2 = com.meituan.android.hybridcashier.config.a.a(hybridCashierConfig);
            a2.initFromUri(this.H);
            com.meituan.android.neohybrid.neo.http.c.a(this.S).b("/cashier/dispatcher").b(a2.genDispatcherParams(false)).a(1370).a();
            this.E.onRequestStart(1370);
            return true;
        }
        return false;
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943b2b35734498807b5045503d0abce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943b2b35734498807b5045503d0abce3");
        } else if (com.meituan.android.paymentchannel.utils.b.d()) {
            com.meituan.android.paymentchannel.utils.b.a(com.meituan.android.paybase.config.a.d().a());
        }
    }

    public final String c() {
        CashierPopWindowBean cashierPopWindowBean;
        PayLaterPopDetailInfoBean payLaterPopDetailInfoBean;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9421c41717875eba13f0d0472c966966", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9421c41717875eba13f0d0472c966966") : (this.i == null || (cashierPopWindowBean = this.i.getCashierPopWindowBean()) == null || (payLaterPopDetailInfoBean = cashierPopWindowBean.getPayLaterPopDetailInfoBean()) == null) ? "" : payLaterPopDetailInfoBean.getGuideRequestNo();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;
        public WeakReference<NativeStandardCashierAdapter> b;

        public a(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
            Object[] objArr = {nativeStandardCashierAdapter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528f9f8b7888a2ebe0650bbe1a7fa867", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528f9f8b7888a2ebe0650bbe1a7fa867");
            } else {
                this.b = new WeakReference<>(nativeStandardCashierAdapter);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            NativeStandardCashierAdapter nativeStandardCashierAdapter;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45baccbb094c6ab91b3b6ab3710221d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45baccbb094c6ab91b3b6ab3710221d7");
                return;
            }
            super.handleMessage(message);
            if (message.what != 2 || (nativeStandardCashierAdapter = this.b.get()) == null || NativeStandardCashierAdapter.j(nativeStandardCashierAdapter)) {
                return;
            }
            NativeStandardCashierAdapter.a(nativeStandardCashierAdapter, true);
            removeMessages(2);
        }
    }

    @Override // com.meituan.android.cashier.dialog.AutomaticPayGuideDialog.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5440ac8bc4e09b4adf3444ed6c3a537d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5440ac8bc4e09b4adf3444ed6c3a537d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                HashMap<String, String> c = c(new String(com.meituan.android.paybase.utils.c.a(str)));
                String str2 = c.get("launch_url");
                if (TextUtils.isEmpty(str2)) {
                    str2 = "/cashier/gohellopay";
                }
                com.meituan.android.paycommon.lib.utils.m.a((MTCashierActivity) this.D, c);
                ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.E, 4)).goHelloPay(str2, c, com.meituan.android.paycommon.lib.config.a.a().o());
            } catch (IOException e) {
                q.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "MTCashierActivity_onClickGuideOpen").a("message", e.getMessage()).b, this.p);
            }
        }
    }

    private HashMap<String, String> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7dddf96b74215ea932dc6b6d9c04221", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7dddf96b74215ea932dc6b6d9c04221");
        }
        JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
        HashMap<String, String> hashMap = new HashMap<>();
        if (asJsonObject != null) {
            for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                if (entry.getValue().isJsonArray()) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                } else if (entry.getValue().isJsonObject()) {
                    hashMap.put(entry.getKey(), entry.getValue().toString());
                } else if (entry.getValue().isJsonPrimitive()) {
                    hashMap.put(entry.getKey(), entry.getValue().getAsString());
                }
            }
        }
        return hashMap;
    }

    @Override // com.meituan.android.cashier.dialog.AutomaticPayGuideDialog.a
    public final void a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "857ac09910011822661762ed8e12835d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "857ac09910011822661762ed8e12835d");
        } else {
            b(cashier);
        }
    }

    private void b(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee3e2ec4fa1b1e4c1a5c18c5b0594e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee3e2ec4fa1b1e4c1a5c18c5b0594e3");
            return;
        }
        this.f.e("new_group_cashier");
        Fragment findFragmentById = this.D.getSupportFragmentManager().findFragmentById(this.J);
        if (findFragmentById instanceof MTCashierRevisionFragment) {
            if (this.C) {
                this.C = false;
                com.meituan.android.cashier.base.utils.a.a("total", this.p);
                r();
                MTCashierRevisionFragment mTCashierRevisionFragment = new MTCashierRevisionFragment();
                mTCashierRevisionFragment.a(this.F, this.G, cashier, this.b, this.h, null, true);
                this.D.getSupportFragmentManager().beginTransaction().replace(this.J, mTCashierRevisionFragment).commitAllowingStateLoss();
            } else {
                ((MTCashierRevisionFragment) findFragmentById).a(this.F, this.G, cashier, this.b, this.h, this.N, false);
            }
        }
        com.meituan.android.cashier.alita.a.a(c(cashier));
    }

    private JSONObject c(Cashier cashier) {
        int i = 1;
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2006b4b7f71acdb2a6923b4512d9f99d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2006b4b7f71acdb2a6923b4512d9f99d");
        }
        JSONObject a2 = com.meituan.android.cashier.alita.b.a(this.D, cashier);
        try {
            if (t() != null) {
                a2.put("retain_type", t().getRetainType());
            }
            if (this.N == null) {
                i = 0;
            }
            a2.put("has_attract_new_user_dialog", i);
        } catch (JSONException e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "StandardCashier_appendRetainDialogParams", (Map<String, Object>) null);
        }
        return a2;
    }

    private void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b0c097a7ef6828557f1f3d03fd3b86d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b0c097a7ef6828557f1f3d03fd3b86d");
        } else {
            ((MTCashierActivity) this.D).u_();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41f38def6c7b179401965076b4c9316d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41f38def6c7b179401965076b4c9316d");
            return;
        }
        this.r = true;
        if (this.D.hasWindowFocus()) {
            s();
        }
        v();
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "781243e2bd3a34e6636b87bff22de6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "781243e2bd3a34e6636b87bff22de6d7");
            return;
        }
        this.r = false;
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this.E, 63)).queryOrder(this.F, this.G, "1", this.g, o(), b());
        com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_cashier_overtime", 200);
    }

    public static /* synthetic */ void d(NativeStandardCashierAdapter nativeStandardCashierAdapter, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "628b4fe2bc21bca4a5dfae8f15d8888c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "628b4fe2bc21bca4a5dfae8f15d8888c");
        } else {
            ((MTCashierActivity) nativeStandardCashierAdapter.D).a(1);
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3e896ca0e3257094d3f52e835517b63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3e896ca0e3257094d3f52e835517b63");
        } else if (i == 1) {
            com.meituan.android.cashier.payresult.a aVar = this.O;
            Object[] objArr2 = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.cashier.payresult.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a935b0bff1b0f2c2c2e7c80fe3f552a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a935b0bff1b0f2c2c2e7c80fe3f552a7");
                return;
            }
            boolean z = exc instanceof PayException;
            if (z) {
                PayException payException = (PayException) exc;
                i3 = payException.getCode();
                i2 = payException.getLevel();
                if (i3 == 118021) {
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_vqzyehjz_mv", (Map<String, Object>) null);
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            a.c cVar = new a.c();
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            a.c a2 = cVar.a("code", sb.toString()).a("message", exc.getMessage());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i2);
            com.meituan.android.paybase.common.analyse.a.a("b_21iwgx7m", a2.a("level", sb2.toString()).b);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", i3);
            Object[] objArr3 = {exc};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cashier.payresult.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e51b854999ba34239992c126019e1e8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e51b854999ba34239992c126019e1e8b");
            } else if (z) {
                PayException payException2 = (PayException) exc;
                Object[] objArr4 = {payException2};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cashier.payresult.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "a5a2528a55a05c2fdfddfc685c791e7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "a5a2528a55a05c2fdfddfc685c791e7b");
                    return;
                }
                int code = payException2.getCode();
                String message = payException2.getMessage();
                com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "dealPayException", com.meituan.android.paybase.common.analyse.a.a("errorCode:" + code, "errorMsg:" + message), "");
                if (code == 117003) {
                    BasePayDialog.b d = new PayDialog.a(aVar.c).c(payException2.getMessage()).d(payException2.getErrorCodeStr());
                    Object[] objArr5 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.cashier.payresult.b.a;
                    d.b("知道了", PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "04e6c869678a93cb14a4a0b10f4b3fcf", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "04e6c869678a93cb14a4a0b10f4b3fcf") : new com.meituan.android.cashier.payresult.b(aVar)).a().show();
                } else if (code == 118021) {
                    com.meituan.android.paybase.dialog.e.a((Activity) aVar.c, (Object) Integer.valueOf((int) R.string.cashier__error_msg_pay_later));
                } else if (com.meituan.android.cashier.util.a.a().b()) {
                    com.meituan.android.paycommon.lib.utils.d.a(aVar.c, payException2, MTCashierActivity.class);
                } else {
                    com.meituan.android.paycommon.lib.utils.d.a(aVar.c, payException2, MTCashierWrapperActivity.class);
                }
            } else {
                com.meituan.android.paybase.dialog.e.a((Activity) aVar.c, (Object) Integer.valueOf((int) R.string.cashier__error_msg_pay_later));
                com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "onGotPayException", aVar.c.getString(R.string.cashier__error_msg_pay_later), "");
            }
        } else if (i == 63) {
            v();
            com.meituan.android.paybase.common.analyse.a.a("b_pay_v3zwwi9x_mv", (Map<String, Object>) null);
            q.b("b_bbmRU", new a.b().a().b, this.p);
            BasePayDialog.b c = new PayDialog.a(this.D).c(this.D.getString(R.string.cashier__pay_timeout_content));
            String string2 = this.D.getString(R.string.cashier__pay_timeout_btn);
            Object[] objArr6 = {this};
            ChangeQuickRedirect changeQuickRedirect6 = f.a;
            c.a(string2, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "34efa3ea51a3531370c2365840a5b62f", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "34efa3ea51a3531370c2365840a5b62f") : new f(this)).a().show();
        } else if (i == 1370) {
            if (this.A && !(exc instanceof PayException)) {
                this.A = false;
                this.B = true;
                com.meituan.android.paybase.common.analyse.a.a("b_pay_w0yqzlx3_mv", (Map<String, Object>) null);
                a((String) null, false);
                return;
            }
            this.B = false;
            this.z = false;
            r();
            boolean z2 = exc instanceof PayException;
            if (z2) {
                PayException payException3 = (PayException) exc;
                i5 = payException3.getCode();
                i4 = payException3.getLevel();
            } else {
                i4 = 0;
                i5 = 0;
            }
            a.b a3 = new a.b().a().a("code", String.valueOf(i5)).a("message", exc.getMessage());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i4);
            q.b("b_aAh3p", a3.a("level", sb3.toString()).b, this.p);
            String str = "0";
            if (i5 == 117003 && "oneclickpay".equals(this.I)) {
                str = "1";
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i5);
            String sb5 = sb4.toString();
            a(sb5, "degrade is " + str);
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", i5 == 0 ? -9753 : i5);
            com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "Request cashier/dispatcher fail", com.meituan.android.paybase.common.analyse.a.a("接口访问时长:" + (System.currentTimeMillis() - ((MTCashierActivity) this.D).b) + "毫秒", "message:" + exc.getMessage(), "errorCode:" + String.valueOf(i5)), "");
            String message2 = z2 ? exc.getMessage() : this.D.getString(R.string.paycommon__error_msg_load_later);
            ((MTCashierActivity) this.D).f = "fail";
            if (i5 == 117003) {
                BasePayDialog.b d2 = new PayDialog.a(this.D).c(exc.getMessage()).d(((PayException) exc).getErrorCodeStr());
                Object[] objArr7 = {this};
                ChangeQuickRedirect changeQuickRedirect7 = e.a;
                d2.b("知道了", PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "babc47957d128175d5170810955afd53", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "babc47957d128175d5170810955afd53") : new e(this)).a().show();
            } else if (z2) {
                if (com.meituan.android.cashier.util.a.a().b()) {
                    com.meituan.android.paycommon.lib.utils.d.a(this.D, message2, ((PayException) exc).getErrorCodeStr(), MTCashierActivity.class);
                } else {
                    com.meituan.android.paycommon.lib.utils.d.a(this.D, message2, ((PayException) exc).getErrorCodeStr(), MTCashierWrapperActivity.class);
                }
            } else {
                if (com.meituan.android.cashier.util.a.a().b()) {
                    com.meituan.android.paycommon.lib.utils.d.a(this.D, message2, "", MTCashierActivity.class);
                } else {
                    com.meituan.android.paycommon.lib.utils.d.a(this.D, message2, "", MTCashierWrapperActivity.class);
                }
                a.c cVar2 = new a.c();
                com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", cVar2.a(KnbConstants.PARAMS_SCENE, this.D.getLocalClassName() + "_onRequestException").a("message", exc.getMessage()).b);
            }
        } else {
            switch (i) {
                case 3:
                    MTCashierActivity mTCashierActivity = (MTCashierActivity) this.D;
                    Object[] objArr8 = {mTCashierActivity, exc};
                    ChangeQuickRedirect changeQuickRedirect8 = com.meituan.android.cashier.exception.c.e;
                    if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "34ab9a363449f9ffd7a0b2a18b0fd74e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "34ab9a363449f9ffd7a0b2a18b0fd74e");
                        return;
                    } else {
                        new com.meituan.android.cashier.exception.c(mTCashierActivity).a(exc);
                        return;
                    }
                case 4:
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_lfo8h91o_mv", (Map<String, Object>) null);
                    if ((exc instanceof PayException) && !TextUtils.isEmpty(exc.getMessage())) {
                        string = exc.getMessage();
                    } else {
                        string = this.D.getString(R.string.cashier__pay_error_msg_try_later);
                    }
                    if (com.meituan.android.cashier.util.a.a().b()) {
                        com.meituan.android.paycommon.lib.utils.d.a(this.D, string, (String) null, MTCashierActivity.class);
                        return;
                    } else {
                        com.meituan.android.paycommon.lib.utils.d.a(this.D, string, (String) null, MTCashierWrapperActivity.class);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public static /* synthetic */ void c(NativeStandardCashierAdapter nativeStandardCashierAdapter, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8547b795581e610defc2ed72edf39a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8547b795581e610defc2ed72edf39a98");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "dealTimeUp", nativeStandardCashierAdapter.D.getString(R.string.cashier__pay_timeout_message), "");
        nativeStandardCashierAdapter.f.j();
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        this.A = false;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaa4955bbf2c87e86eeb7eee98f63c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaa4955bbf2c87e86eeb7eee98f63c60");
            return;
        }
        v();
        this.K = null;
        this.s = true;
        if (this.x != null) {
            this.x.removeMessages(2);
        }
        com.meituan.android.paymentchannel.b.a().b(this.D);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92c45e55949aa518b4220059fee1f0b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92c45e55949aa518b4220059fee1f0b9");
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cashier.alita.a.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "70007935378f82ae8ea2c3dbcbf75f78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "70007935378f82ae8ea2c3dbcbf75f78");
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cashier.alita.a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ff4464ad26ab4cb8f49bd68db7d2c8bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ff4464ad26ab4cb8f49bd68db7d2c8bc");
                } else if (com.meituan.android.paycommon.lib.config.a.a() != null) {
                    com.meituan.android.paycommon.lib.config.a.a();
                }
                if (com.meituan.android.paycommon.lib.config.a.a() != null) {
                    com.meituan.android.paycommon.lib.config.a.a();
                }
            }
        }
        com.meituan.android.cashier.payresult.a aVar = this.O;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.cashier.payresult.a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "d9ec7f4126c97d27660071adc7b8effb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "d9ec7f4126c97d27660071adc7b8effb");
        } else if (aVar.e != null) {
            aVar.e.cancel();
            aVar.e = null;
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c9ed47088329aadb7670626acb6ffac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c9ed47088329aadb7670626acb6ffac1");
        } else {
            LocalBroadcastManager.getInstance(this.D).unregisterReceiver(k());
        }
        if (z) {
            Fragment findFragmentById = this.D.getSupportFragmentManager().findFragmentById(this.J);
            if (findFragmentById instanceof MTCashierRevisionFragment) {
                this.D.getSupportFragmentManager().beginTransaction().remove(findFragmentById).commitNowAllowingStateLoss();
            }
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da12ef02e3ba6141f811bee975683836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da12ef02e3ba6141f811bee975683836");
        } else if (com.meituan.android.paymentchannel.b.a().a(this.D, i, i2, intent)) {
            com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "consumeActivityResult", "requestCode:" + i, "");
        }
    }

    private void a(Promotion promotion) {
        Object[] objArr = {promotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cfd173dbe25c2bb98261d05ddef9a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cfd173dbe25c2bb98261d05ddef9a20");
            return;
        }
        FragmentActivity fragmentActivity = this.D;
        Object[] objArr2 = {this, promotion};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        com.meituan.android.paybase.utils.f.a(fragmentActivity, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ac87a91daa7998d969201f39a97d1d62", RobustBitConfig.DEFAULT_VALUE) ? (f.InterfaceC0337f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ac87a91daa7998d969201f39a97d1d62") : new g(this, promotion));
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, Promotion promotion, boolean z) {
        Object[] objArr = {nativeStandardCashierAdapter, promotion, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2c3459dddb5b200e5406237670b50f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2c3459dddb5b200e5406237670b50f1");
            return;
        }
        Fragment findFragmentById = nativeStandardCashierAdapter.D.getSupportFragmentManager().findFragmentById(nativeStandardCashierAdapter.J);
        if (findFragmentById != null) {
            nativeStandardCashierAdapter.D.getSupportFragmentManager().beginTransaction().remove(findFragmentById).commitNowAllowingStateLoss();
        }
        if (nativeStandardCashierAdapter.f != null) {
            nativeStandardCashierAdapter.f.a(promotion);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.meituan.android.cashier.payresult.a$1] */
    @Override // com.meituan.android.cashier.common.u, com.meituan.android.paybase.retrofit.b
    @MTPaySuppressFBWarnings({"SF_SWITCH_FALLTHROUGH"})
    public void onRequestSucc(int i, Object obj) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c8648acff04b70830f95e8792c285ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c8648acff04b70830f95e8792c285ee");
        } else if (obj == null || this.s) {
            if (obj == null) {
                a.c a2 = new a.c().a(KnbConstants.PARAMS_SCENE, "o == null");
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a2.a("tag", sb.toString()).b);
                return;
            }
            a.c a3 = new a.c().a(KnbConstants.PARAMS_SCENE, "isDestroyed");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a3.a("tag", sb2.toString()).b);
        } else if (i == 1) {
            com.meituan.android.cashier.payresult.a aVar = this.O;
            Object[] objArr2 = {Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.cashier.payresult.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "13f4fac56d79d4b9bd120df456cd4a99", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "13f4fac56d79d4b9bd120df456cd4a99");
                return;
            }
            if (obj != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cashier.payresult.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "104853e9378e3746ef4746fc28aa3ae1", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "104853e9378e3746ef4746fc28aa3ae1")).booleanValue();
                } else {
                    z = aVar.c.isFinishing() || aVar.c.m();
                }
                if (!z) {
                    PayResult payResult = (PayResult) obj;
                    Promotion promotion = payResult.getPromotion();
                    if (promotion != null) {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_dn9s8rnr_mv", (Map<String, Object>) null);
                    }
                    q.a("b_5jx1qb72", (Map<String, Object>) null, aVar.a());
                    long windowTimeout = promotion != null ? promotion.getWindowTimeout() * 1000 : 0L;
                    if (!(aVar.c instanceof MTCashierActivity)) {
                        if (aVar.c instanceof PayActivity) {
                            ((PayActivity) aVar.c).b = promotion;
                        }
                    } else {
                        ((MTCashierActivity) aVar.c).c = promotion;
                    }
                    if (aVar.e != null) {
                        aVar.e.cancel();
                    }
                    aVar.e = new CountDownTimer(windowTimeout, 1000L) { // from class: com.meituan.android.cashier.payresult.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.os.CountDownTimer
                        public final void onTick(long j) {
                        }

                        @Override // android.os.CountDownTimer
                        public final void onFinish() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ba97aee8f1e1d33ec70f66379ab27864", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ba97aee8f1e1d33ec70f66379ab27864");
                                return;
                            }
                            if (!(a.this.c instanceof MTCashierActivity)) {
                                if (a.this.c instanceof PayActivity) {
                                    ((PayActivity) a.this.c).c = true;
                                }
                            } else {
                                ((MTCashierActivity) a.this.c).d = true;
                            }
                            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_promotionalert_overtime", 200);
                        }
                    }.start();
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", 200);
                    Object[] objArr4 = {payResult};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.cashier.payresult.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e537243bd3f6032d88fee07b5f3bdc3f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e537243bd3f6032d88fee07b5f3bdc3f");
                        return;
                    } else if (payResult.getOverLoadInfo() != null && payResult.getOverLoadInfo().isStatus()) {
                        com.meituan.android.paybase.common.analyse.a.a("b_pay_2bqf1335_mv", (Map<String, Object>) null);
                        aVar.f.a(payResult.getOverLoadInfo());
                        return;
                    } else {
                        Object[] objArr5 = {payResult};
                        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.cashier.payresult.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "162b0b8f7887537b7b5efd7e9ddce757", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "162b0b8f7887537b7b5efd7e9ddce757");
                            return;
                        }
                        String payType = payResult.getPayType();
                        com.meituan.android.paymentchannel.b.a().a(aVar.c, payType, payResult.getUrl(), aVar.g, aVar.b);
                        if (TextUtils.equals(payType, "upsepay")) {
                            com.meituan.android.cashier.base.utils.e.b(aVar.a());
                            return;
                        }
                        return;
                    }
                }
            }
            if (obj == null) {
                a.c a4 = new a.c().a(KnbConstants.PARAMS_SCENE, "o == null");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a4.a("tag", sb3.toString()).b);
                return;
            }
            a.c a5 = new a.c().a(KnbConstants.PARAMS_SCENE, "isDestroyed");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_pfjic30w_mv", a5.a("tag", sb4.toString()).b);
        } else if (i == 63) {
            v();
            com.meituan.android.paybase.common.analyse.a.a("b_ruzoirdm", new a.c().a(KnbConstants.PARAMS_SCENE, "订单超时").b);
            if (((OrderResult) obj).isResult()) {
                a((Promotion) null);
                return;
            }
            q.b("b_bbmRU", new a.b().a().b, this.p);
            BasePayDialog.b c = new PayDialog.a(this.D).c(this.D.getString(R.string.cashier__pay_timeout_content));
            String string = this.D.getString(R.string.cashier__pay_timeout_btn);
            Object[] objArr6 = {this};
            ChangeQuickRedirect changeQuickRedirect6 = h.a;
            c.a(string, PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "0a60a038207a5a39c54f868fa3b605ce", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "0a60a038207a5a39c54f868fa3b605ce") : new h(this)).a().show();
        } else if (i == 1370) {
            if (this.B) {
                this.B = false;
                com.meituan.android.paybase.common.analyse.a.a("b_pay_4km995m2_mv", (Map<String, Object>) null);
            }
            this.z = false;
            ((MTCashierActivity) this.D).i();
            com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " request_success");
            a.c cVar = new a.c();
            q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " request_success").b, this.p);
            q.b("b_BQKWU", null, this.p);
            com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "Request cashier/dispatcher success", "接口访问时长:" + (System.currentTimeMillis() - ((MTCashierActivity) this.D).b) + "毫秒", "");
            RouteInfo routeInfo = (RouteInfo) obj;
            this.i = routeInfo;
            this.N = null;
            this.w = false;
            if (routeInfo.getCashierPopWindowBean() != null) {
                switch (routeInfo.getCashierPopWindowBean().getType()) {
                    case 1:
                        if (!this.C) {
                            q.a("native_standcashier_start_succ", (Map<String, Object>) null, (List<Float>) null, this.p);
                            com.meituan.android.cashier.util.c.a(this.D instanceof MTCashierActivity ? ((MTCashierActivity) this.D).k() : "unknown", this.p);
                        }
                        PopDetailInfo popDetailInfo = routeInfo.getCashierPopWindowBean().getPopDetailInfo();
                        Object[] objArr7 = {popDetailInfo};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "59bd0cb47dd95af592b07e01671e054d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "59bd0cb47dd95af592b07e01671e054d");
                        } else {
                            BasePayDialog.b b = new PayDialog.a(this.D).c(popDetailInfo.getDetail()).a(false).b(false);
                            String leftBtn = popDetailInfo.getLeftBtn();
                            Object[] objArr8 = {this};
                            ChangeQuickRedirect changeQuickRedirect8 = j.a;
                            BasePayDialog.b a6 = b.a(leftBtn, PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "6660a57c50c09e3b6df325b099a0258f", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "6660a57c50c09e3b6df325b099a0258f") : new j(this));
                            String rightBtn = popDetailInfo.getRightBtn();
                            Object[] objArr9 = {this, popDetailInfo};
                            ChangeQuickRedirect changeQuickRedirect9 = k.a;
                            a6.b(rightBtn, PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "931354822e700a3d9d2bd43209c81a4c", RobustBitConfig.DEFAULT_VALUE) ? (BasePayDialog.c) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "931354822e700a3d9d2bd43209c81a4c") : new k(this, popDetailInfo)).a().show();
                            com.meituan.android.paybase.common.analyse.a.a("StandardCashier", "c_pay_jjckzxmj", new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.F).b);
                        }
                        a("1120025", "block window");
                        return;
                    case 2:
                        CashierPopWindowBean cashierPopWindowBean = routeInfo.getCashierPopWindowBean();
                        Object[] objArr10 = {cashierPopWindowBean};
                        ChangeQuickRedirect changeQuickRedirect10 = a;
                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "72986fac0a356c9191db41edddd81a22", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "72986fac0a356c9191db41edddd81a22");
                            return;
                        }
                        PayLaterPopDetailInfoBean payLaterPopDetailInfoBean = cashierPopWindowBean.getPayLaterPopDetailInfoBean();
                        if (payLaterPopDetailInfoBean == null) {
                            b(this.i);
                            return;
                        }
                        this.w = true;
                        r();
                        this.f.e("paylater_cashier");
                        PayLaterGuideDialogFragment.a(this.j, this.F, this.G, payLaterPopDetailInfoBean, a(this.i)).a(this.D.getSupportFragmentManager());
                        a(true, (Map<String, Object>) null);
                        return;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.N = routeInfo.getCashierPopWindowBean();
                        break;
                }
            }
            b(routeInfo);
        } else {
            switch (i) {
                case 3:
                    break;
                default:
                    return;
                case 4:
                    com.meituan.android.paybase.common.analyse.a.a("b_pay_sk31olhm_mv", (Map<String, Object>) null);
                    this.v = true;
                    break;
            }
            q.a("b_271k132t", new a.c().a("pay_type", this.c).b, this.p);
            com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " gohellopay_request_success");
            com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " gohellopay_request_success");
            com.meituan.android.paybase.metrics.a.c("tti_card_ocr_view", getClass().getName() + " gohellopay_request_success");
            MTPaymentURL mTPaymentURL = (MTPaymentURL) obj;
            Object[] objArr11 = {mTPaymentURL};
            ChangeQuickRedirect changeQuickRedirect11 = a;
            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "443d19dc6df466f4060804ba9624378b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "443d19dc6df466f4060804ba9624378b");
            } else if (mTPaymentURL != null) {
                if (mTPaymentURL.getOverLoadInfo() != null && mTPaymentURL.getOverLoadInfo().isStatus()) {
                    q.a("b_pay_6f1taqcl_mv", new a.b().a("type", mTPaymentURL.getPayType()).b, this.p);
                    this.t = mTPaymentURL.getOverLoadInfo();
                    a(this.D);
                    return;
                }
                com.meituan.android.cashier.utils.a.a(mTPaymentURL, "native", this.p);
                com.meituan.android.paymentchannel.b.a().a(this.D, "quickbank", mTPaymentURL.getUrl(), this.F, this);
            }
        }
    }

    public static /* synthetic */ void b(NativeStandardCashierAdapter nativeStandardCashierAdapter, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23c1b230349ab02bae827eb87fdea7b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23c1b230349ab02bae827eb87fdea7b7");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "dealTimeUp", nativeStandardCashierAdapter.D.getString(R.string.cashier__pay_timeout_message), "");
        nativeStandardCashierAdapter.f.j();
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f6509383bbcc1909b85215ee35c1d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f6509383bbcc1909b85215ee35c1d3");
            return;
        }
        if (this.D != null) {
            q.a("pop_cashier_cancel", (Map<String, Object>) null, (List<Float>) null, this.p);
            q.b("b_pay_pop_cashier_cancel_sc", null, this.p);
        }
        this.w = false;
        if (this.i == null) {
            r();
            a((String) null, false);
        } else if (this.D != null) {
            ((MTCashierActivity) this.D).a(true, PayBaseActivity.a.CASHIER, (String) null);
            new Handler().postDelayed(i.a(this), 200L);
        }
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter) {
        Object[] objArr = {nativeStandardCashierAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5445b6b42c08ab1a4ca910880df3dfef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5445b6b42c08ab1a4ca910880df3dfef");
        } else if (nativeStandardCashierAdapter.D != null) {
            ((MTCashierActivity) nativeStandardCashierAdapter.D).hideProgress();
            nativeStandardCashierAdapter.b(nativeStandardCashierAdapter.i);
        }
    }

    private RetainWindow t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d93a2357f327a03a56cedce2fc39bc4", RobustBitConfig.DEFAULT_VALUE)) {
            return (RetainWindow) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d93a2357f327a03a56cedce2fc39bc4");
        }
        if (this.i == null) {
            return null;
        }
        return this.i.getRetainWindow();
    }

    private void b(RouteInfo routeInfo) {
        Object[] objArr = {routeInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86e3940c22d2c612e31a5c4071040a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86e3940c22d2c612e31a5c4071040a08");
            return;
        }
        if (!TextUtils.isEmpty(routeInfo.getRootDesc()) && p()) {
            com.meituan.android.paybase.dialog.e.a((Activity) this.D, (Object) routeInfo.getRootDesc(), true);
        }
        CommonABTestManager.a(routeInfo.getAbTestGroup());
        if (!TextUtils.isEmpty(routeInfo.getUrl())) {
            r();
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 200);
            this.R.setWebCashierUrl(routeInfo.getUrl());
            this.f.a("native_standard_cashier", "web_cashier", routeInfo.getUrl());
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_degrade_i", 200);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_hga93ht6_mv", (Map<String, Object>) null);
            return;
        }
        if (routeInfo.getCashierInfo() != null) {
            d(a(routeInfo));
        } else {
            r();
            a((String) null, false);
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " REQ_TAG_ROUTE_end");
    }

    public final Cashier a(RouteInfo routeInfo) {
        Object[] objArr = {routeInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d8fe438e97c796105f13b7be3b2a55", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cashier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d8fe438e97c796105f13b7be3b2a55");
        }
        if (routeInfo == null || routeInfo.getCashierInfo() == null) {
            return null;
        }
        if (TextUtils.equals("common", routeInfo.getCashierType())) {
            return routeInfo.getCashierInfo().getCommon();
        }
        return routeInfo.getCashierInfo().getWallet();
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "808405355a410eae65cafa8761418c58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "808405355a410eae65cafa8761418c58");
            return;
        }
        q.a("c_pay_jjckzxmj", "b_pay_v5l55ue3_mc", "解止付申诉弹窗-终止支付", null, ae.a.CLICK, nativeStandardCashierAdapter.p);
        dialog.cancel();
        nativeStandardCashierAdapter.f.c("");
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, PopDetailInfo popDetailInfo, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, popDetailInfo, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a207d99fdbb7371d7e5d1647702d63f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a207d99fdbb7371d7e5d1647702d63f2");
            return;
        }
        q.a("c_pay_jjckzxmj", "b_pay_2royud7a_mc", "解止付申诉弹窗-申请解除限制", null, ae.a.CLICK, nativeStandardCashierAdapter.p);
        dialog.cancel();
        nativeStandardCashierAdapter.f.c("");
        al.a((Context) nativeStandardCashierAdapter.D, popDetailInfo.getRedirectUrl(), false);
    }

    private void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54b10919988e71a532bc69f8d17bd656", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54b10919988e71a532bc69f8d17bd656");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", str);
        hashMap.put("message", str2);
        a(false, (Map<String, Object>) hashMap);
    }

    private void d(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b19a850171294a7f34d3ed15309b15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b19a850171294a7f34d3ed15309b15c");
        } else if (cashier == null) {
            a("1120018", "");
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 1120018);
            com.meituan.android.paybase.common.analyse.cat.a.a("cashierStartError", this.D.getString(R.string.cashier__start_error));
        } else if (cashier.getNoPswGuide() != null && !TextUtils.isEmpty(cashier.getNoPswGuide().getSubmitUrl())) {
            this.f.e("withholding_cashier");
            r();
            AutomaticPayGuideDialogFragment.a(cashier).a(this.D.getSupportFragmentManager());
            a(true, (Map<String, Object>) null);
            com.meituan.android.paybase.common.analyse.cat.a.a("cashierStartError", this.D.getString(R.string.cashier__start_error));
            com.meituan.android.paybase.common.analyse.a.a("b_pay_t25yp8xz_mv", (Map<String, Object>) null);
        } else {
            b(cashier);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02cd, code lost:
        if (r27.equals("wxpay") != false) goto L147;
     */
    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r27, int r28, com.meituan.android.paybase.moduleinterface.payment.PayFailInfo r29) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.NativeStandardCashierAdapter.a(java.lang.String, int, com.meituan.android.paybase.moduleinterface.payment.PayFailInfo):void");
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.v
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b6f49d540d9b6a16cce219317dcddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b6f49d540d9b6a16cce219317dcddd");
        } else if (z && this.r) {
            s();
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85ae9696cedf4d29c4510920f9baa0c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85ae9696cedf4d29c4510920f9baa0c1");
            return;
        }
        this.d = false;
        if (this.t != null) {
            this.u = this.t.getMessage();
            if (this.t.getTimeout() > 0) {
                this.x.sendEmptyMessageDelayed(2, this.t.getTimeout());
            }
        }
        new PayDialog.a(activity).c(this.u).a(this.D.getString(R.string.cashier__I_have_known), (BasePayDialog.c) null).a().show();
        com.meituan.android.paybase.common.analyse.a.a("MTCashierActivity", "processSuspendPaying", "tipsForSuspendPaying:" + this.u, "");
    }

    @Override // com.meituan.android.cashier.common.h
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87937bedaef742ac3c561abcab1e8b7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87937bedaef742ac3c561abcab1e8b7e");
        } else {
            aa.a(this, getClass(), bundle);
        }
    }

    @Override // com.meituan.android.cashier.common.h
    public final void b(Bundle bundle) {
        boolean z = true;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e170edeb24b1e4ab37d871f5d2d8b83c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e170edeb24b1e4ab37d871f5d2d8b83c");
            return;
        }
        aa.b(this, getClass(), bundle);
        l();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6363b21d4a6ff144bcc822f7658ca8f9", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6363b21d4a6ff144bcc822f7658ca8f9")).booleanValue();
        } else if (!StringUtil.NULL.equalsIgnoreCase(this.F) && !TextUtils.isEmpty(this.F) && !TextUtils.isEmpty(this.G) && !StringUtil.NULL.equalsIgnoreCase(this.G)) {
            z = false;
        }
        if (z) {
            ((MTCashierActivity) this.D).a("onRestoreInstanceState_standardcashier", "native_standard_cashier");
        } else {
            m();
        }
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.h
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c696480a96df11e52741dbb0572630", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c696480a96df11e52741dbb0572630")).booleanValue();
        }
        if (this.z) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_bsmbner4_mc", (Map<String, Object>) null);
            this.z = false;
        }
        if (this.D.getSupportFragmentManager().findFragmentById(this.J) instanceof MTCashierRevisionFragment) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_32l25h89_mc", new a.c().a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("payType", this.c).b);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa726b463a33c5889d9c88eaae916fbc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa726b463a33c5889d9c88eaae916fbc")).booleanValue();
            }
            RetainWindow t = t();
            if (t != null) {
                if (u()) {
                    return a(com.meituan.android.cashier.alita.b.a());
                }
                if (!t.isDefaultRetainType()) {
                    if (t.isAlipayRetainType() || t.isBankselectpayRetainType() || t.isCardpayRetainType()) {
                        return a(t);
                    }
                    return false;
                }
                Object[] objArr3 = {t};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1dc98bc54d3c4da26945d43e74441dc9", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1dc98bc54d3c4da26945d43e74441dc9")).booleanValue();
                }
                if (TextUtils.equals(CommonABTestManager.a(), "b")) {
                    if (!this.L && b(t)) {
                        this.L = true;
                        a(t, "single");
                        return true;
                    }
                    this.f.j();
                    return false;
                }
                this.f.j();
                return false;
            }
            return false;
        }
        return false;
    }

    private boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef90f9acb116fc864c1650a332991c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef90f9acb116fc864c1650a332991c7")).booleanValue();
        }
        RetainWindow t = t();
        return t != null && t.isDefaultRetainType() && TextUtils.equals(CommonABTestManager.a(), "b") && com.meituan.android.cashier.alita.b.a() != null;
    }

    private boolean a(RetainWindow retainWindow) {
        Object[] objArr = {retainWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f59a298f1b8001cf5ec9e0a3869c208", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f59a298f1b8001cf5ec9e0a3869c208")).booleanValue();
        }
        if (!b(retainWindow) || this.L) {
            return false;
        }
        a(retainWindow, "");
        this.L = true;
        return true;
    }

    private boolean b(RetainWindow retainWindow) {
        Object[] objArr = {retainWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04728f751bbe8ee402654280caf90c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04728f751bbe8ee402654280caf90c9")).booleanValue() : (retainWindow == null || TextUtils.isEmpty(retainWindow.getTitle()) || TextUtils.isEmpty(retainWindow.getDetail()) || TextUtils.isEmpty(retainWindow.getLeftButton()) || TextUtils.isEmpty(retainWindow.getRightButton())) ? false : true;
    }

    private void a(RetainWindow retainWindow, String str) {
        Object[] objArr = {retainWindow, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad908e5f9ada446d8784bd5ba4ee323", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad908e5f9ada446d8784bd5ba4ee323");
            return;
        }
        this.M++;
        if (this.K == null) {
            String str2 = "";
            String str3 = "";
            if (com.meituan.android.cashier.alita.b.b() && u()) {
                str2 = "【端智能】";
                str3 = "\n" + (com.meituan.android.cashier.alita.a.a() != null ? com.meituan.android.cashier.alita.a.a().toString() : "");
            }
            BasePayDialog.b b = new PayDialog.a(this.D).b(str2 + retainWindow.getTitle()).c(retainWindow.getDetail() + str3).a(retainWindow.getLeftButton(), l.a(this, str, retainWindow)).b(retainWindow.getRightButton(), c.a(this, retainWindow, str)).b(ContextCompat.getColor(this.D, R.color.cashier__color));
            if (retainWindow.isAlipayRetainType() || retainWindow.isCardpayRetainType() || retainWindow.isBankselectpayRetainType()) {
                b.a(true, d.a(this, retainWindow));
            }
            this.K = b.a();
        }
        this.K.show();
        HashMap<String, Object> hashMap = new a.c().a("times", String.valueOf(this.M)).a("user_class", str).a("type", retainWindow.getStaticsRetainType()).a("ai_type", u() ? AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS : "normal").b;
        q.a("c_PJmoK", "b_pay_n7gadotk_mv", "离开收银台挽留弹窗", hashMap, ae.a.VIEW, this.p);
        q.b("b_pay_849q03f1_mv", hashMap, this.p);
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, String str, RetainWindow retainWindow, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, str, retainWindow, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "698854a14ba7c97e53ea90f2f6c67694", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "698854a14ba7c97e53ea90f2f6c67694");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("times", String.valueOf(nativeStandardCashierAdapter.M)).a("user_class", str).a("type", retainWindow.getStaticsRetainType()).a("button_name", retainWindow.getLeftButton()).a("ai_type", nativeStandardCashierAdapter.u() ? AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS : "normal").b;
        q.a("c_PJmoK", "b_pay_26e34k6d_mc", "离开收银台挽留弹窗-点击确认离开", hashMap, ae.a.CLICK, nativeStandardCashierAdapter.p);
        q.b("b_pay_zgza8o6s_mc", hashMap, nativeStandardCashierAdapter.p);
        nativeStandardCashierAdapter.f.j();
        nativeStandardCashierAdapter.v();
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, RetainWindow retainWindow, String str, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, retainWindow, str, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ca45353f5e55957ba19d845b0dfc4ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ca45353f5e55957ba19d845b0dfc4ec");
            return;
        }
        com.meituan.android.pay.desk.pack.u.a().e = "cashier_retain";
        if (retainWindow.isAlipayRetainType() && retainWindow.getSubmitData() != null) {
            String payType = retainWindow.getSubmitData().getPayType();
            Object[] objArr2 = {payType};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, nativeStandardCashierAdapter, changeQuickRedirect2, false, "390c06f446ce55c9be7ca44052bc796d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, nativeStandardCashierAdapter, changeQuickRedirect2, false, "390c06f446ce55c9be7ca44052bc796d");
            } else {
                MTCashierRevisionFragment w = nativeStandardCashierAdapter.w();
                if (w != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("tradeno", nativeStandardCashierAdapter.F);
                    hashMap.put("pay_token", nativeStandardCashierAdapter.G);
                    hashMap.put("pay_type", payType);
                    w.a(hashMap);
                }
            }
        }
        if ((retainWindow.isCardpayRetainType() || retainWindow.isBankselectpayRetainType()) && retainWindow.getSubmitData() != null) {
            com.meituan.android.pay.common.payment.data.a a2 = nativeStandardCashierAdapter.a(retainWindow.getSubmitData());
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, nativeStandardCashierAdapter, changeQuickRedirect3, false, "f9d284f67563d0c0113bb4a3c19cb922", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, nativeStandardCashierAdapter, changeQuickRedirect3, false, "f9d284f67563d0c0113bb4a3c19cb922");
            } else {
                MTCashierRevisionFragment w2 = nativeStandardCashierAdapter.w();
                if (w2 != null && (a2 instanceof MTPayment)) {
                    w2.b((com.meituan.android.pay.common.payment.data.d) a2);
                }
            }
        }
        HashMap<String, Object> hashMap2 = new a.c().a("times", String.valueOf(nativeStandardCashierAdapter.M)).a("user_class", str).a("type", retainWindow.getStaticsRetainType()).a("button_name", retainWindow.getRightButton()).a("ai_type", nativeStandardCashierAdapter.u() ? AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS : "normal").b;
        q.b("b_pay_7nugc1pd_mc", hashMap2, nativeStandardCashierAdapter.p);
        q.a("c_PJmoK", "b_pay_n3c198vr_mc", "离开收银台挽留弹窗-点击继续支付", hashMap2, ae.a.CLICK, nativeStandardCashierAdapter.p);
        nativeStandardCashierAdapter.c(retainWindow);
        nativeStandardCashierAdapter.v();
    }

    public static /* synthetic */ void a(NativeStandardCashierAdapter nativeStandardCashierAdapter, RetainWindow retainWindow, Dialog dialog) {
        Object[] objArr = {nativeStandardCashierAdapter, retainWindow, dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8f82e7c4ac7cd455c9405249ada0383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8f82e7c4ac7cd455c9405249ada0383");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("type", retainWindow.getStaticsRetainType()).a("ai_type", nativeStandardCashierAdapter.u() ? AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS : "normal").b;
        q.b("b_pay_9uefqi3m_mc", hashMap, nativeStandardCashierAdapter.p);
        q.a("c_PJmoK", "b_pay_b92ieqdb_mc", "离开收银台挽留弹窗-关闭", hashMap, ae.a.CLICK, nativeStandardCashierAdapter.p);
    }

    private void c(RetainWindow retainWindow) {
        com.meituan.android.pay.common.payment.data.a a2;
        Object[] objArr = {retainWindow};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1e5beb0418a617d8497f3475fbf118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1e5beb0418a617d8497f3475fbf118");
        } else if (retainWindow == null || retainWindow.getSubmitData() == null || (a2 = a(retainWindow.getSubmitData())) == null || TextUtils.isEmpty(a2.getPayType())) {
        } else {
            q.b("b_pay_n3c198vr_mc", new a.c().a("pay_type", a2.getPayType()).b, this.p);
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb85914c8e7bd0a222a9db6580b4cd99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb85914c8e7bd0a222a9db6580b4cd99");
        } else if (this.K != null) {
            this.K.dismiss();
            this.K = null;
        }
    }

    private com.meituan.android.pay.common.payment.data.a a(SubmitData submitData) {
        CashierPayment cashierPayment;
        Object[] objArr = {submitData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c452a3a34046447e6cadd3727c21db", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c452a3a34046447e6cadd3727c21db");
        }
        Cashier a2 = a(this.i);
        if (a2 != null && !com.meituan.android.paybase.utils.i.a((Collection) a2.getPaymentDataList())) {
            Iterator<CashierPayment> it = a2.getPaymentDataList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    cashierPayment = null;
                    break;
                }
                cashierPayment = it.next();
                if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                    break;
                }
            }
            if (cashierPayment != null && cashierPayment.getWalletPaymentListPage() != null && !com.meituan.android.paybase.utils.i.a((Collection) cashierPayment.getWalletPaymentListPage().getMtPaymentList())) {
                for (com.meituan.android.pay.common.payment.data.a aVar : cashierPayment.getWalletPaymentListPage().getMtPaymentList()) {
                    if (submitData == null) {
                        break;
                    } else if ((com.meituan.android.pay.common.payment.utils.c.g(submitData.getPayType()) && TextUtils.equals(submitData.getPayType(), aVar.getPayType())) || (com.meituan.android.pay.common.payment.utils.c.i(submitData.getPayType()) && TextUtils.equals(submitData.getPayType(), aVar.getPayType()) && TextUtils.equals(submitData.getBankType(), aVar.getBankType()))) {
                        return aVar;
                    }
                }
            }
        }
        return null;
    }

    private MTCashierRevisionFragment w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c754fb0ed7b0447fbe5677dff375a46e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTCashierRevisionFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c754fb0ed7b0447fbe5677dff375a46e");
        }
        Fragment findFragmentById = this.D.getSupportFragmentManager().findFragmentById(this.J);
        if (findFragmentById instanceof MTCashierRevisionFragment) {
            return (MTCashierRevisionFragment) findFragmentById;
        }
        return null;
    }

    @Override // com.meituan.android.cashier.common.u, com.meituan.android.cashier.common.ICashier
    public final PayBaseActivity.a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2820981b1b1d123287584420643364e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayBaseActivity.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2820981b1b1d123287584420643364e8");
        }
        if (i != 4) {
            if (this.C) {
                return PayBaseActivity.a.DEFAULT;
            }
            return PayBaseActivity.a.CASHIER;
        }
        return null;
    }

    @Override // com.meituan.android.cashier.common.u
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03e5bec6d78f5a1c2cbd6199175e912f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03e5bec6d78f5a1c2cbd6199175e912f");
            return;
        }
        q.a("native_standcashier_start", (Map<String, Object>) null, (List<Float>) null, this.p);
        com.meituan.android.cashier.util.c.a(System.currentTimeMillis());
        q.a("c_PJmoK", "b_pay_p3cw2gqv_mv", "", null, this.p);
        if (!((MTCashierActivity) this.D).a(true)) {
            a("1120019", "tradeNo or token is null");
            return;
        }
        this.I = str;
        l();
        q.b("b_9zryj3uy", new a.c().a("uri:", this.H != null ? this.H.toString() : "").b, this.p);
        this.z = true;
        this.A = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93146603debc0d1e30b926271eeebbfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93146603debc0d1e30b926271eeebbfb");
        } else {
            a((String) null, false);
            com.meituan.android.paybase.downgrading.a.a().a(this.D);
            m();
        }
        Object[] objArr3 = {this.D};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.cashier.alita.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a55106bb2338f5f027e64b52cf2964b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a55106bb2338f5f027e64b52cf2964b5");
        } else if (com.meituan.android.paycommon.lib.config.a.a() != null) {
            com.meituan.android.paycommon.lib.config.a.a();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "57148bf76dd8cfc6e3f20775f09f8e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "57148bf76dd8cfc6e3f20775f09f8e06");
        } else {
            r.a(this.D, "com.meituan.android.cashier.standardCashier.refresh", k());
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.a
    public final void x_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2aeca8010d8c8b2e57a6110f61f92e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2aeca8010d8c8b2e57a6110f61f92e0");
        } else {
            this.e = true;
        }
    }
}
