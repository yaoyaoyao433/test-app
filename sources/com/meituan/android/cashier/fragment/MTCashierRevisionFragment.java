package com.meituan.android.cashier.fragment;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.NativeStandardCashierAdapter;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.base.view.revision.CashierOrderInfoView;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.dialog.q;
import com.meituan.android.cashier.dialog.r;
import com.meituan.android.cashier.dialog.s;
import com.meituan.android.cashier.dialogfragment.CardPayFunctionGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.CardPayRedEnvelopeGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.CreditPayGuideDialogFragment;
import com.meituan.android.cashier.dialogfragment.DCEPDialogFragment;
import com.meituan.android.cashier.dialogfragment.PromotionSignedGuideFragment;
import com.meituan.android.cashier.dialogfragment.RiskDialogFragment;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.CashierPayment;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PayResult;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.cashier.model.bean.PopUp;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.cashier.widget.CashierMarketingGuideFloatView;
import com.meituan.android.cashier.widget.MTCashierScrollView;
import com.meituan.android.cashier.widget.NativeStandardCashierAreaView;
import com.meituan.android.common.aidata.error.ErrorCode;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.payment.utils.a;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.LabelAbTest;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.pay.common.promotion.bean.PromotionRefreshment;
import com.meituan.android.pay.common.promotion.bean.ReduceInfo;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.desk.pack.e;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.desk.payment.bean.standarddesk.RefreshInstallment;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.z;
import com.meituan.android.paybase.widgets.ProgressButton;
import com.meituan.android.paybase.widgets.notice.NoticeView;
import com.meituan.android.paycommon.lib.config.e;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTCashierRevisionFragment extends PayBaseFragment implements ViewTreeObserver.OnGlobalLayoutListener, q, r, s, SelectBankDialog.b, com.meituan.android.pay.desk.pack.b, e.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private CashierMarketingGuideFloatView A;
    @MTPayNeedToPersist
    private boolean B;
    @MTPayNeedToPersist
    private boolean C;
    private TranslateAnimation D;
    private TranslateAnimation E;
    private Animation.AnimationListener F;
    private TranslateAnimation G;
    private TranslateAnimation H;
    private Animation.AnimationListener I;
    private NativeStandardCashierAreaView J;
    private final com.meituan.android.cashier.utils.b K;
    private Cashier L;
    @MTPayNeedToPersist
    private boolean M;
    private ViewTreeObserver.OnScrollChangedListener N;
    @MTPayNeedToPersist
    public boolean b;
    @MTPayNeedToPersist
    private MTPayment c;
    private int d;
    private com.meituan.android.cashier.base.view.revision.i<com.meituan.android.cashier.base.view.revision.g> e;
    @Nullable
    private NativeStandardCashierAdapter f;
    private com.meituan.android.pay.common.payment.data.d g;
    @MTPayNeedToPersist
    private String h;
    @MTPayNeedToPersist
    private String i;
    @MTPayNeedToPersist
    private boolean j;
    private String k;
    private String l;
    @MTPayNeedToPersist
    private int m;
    @MTPayNeedToPersist
    private int n;
    @MTPayNeedToPersist
    private int o;
    private ProgressButton p;
    private PayParams q;
    @MTPayNeedToPersist
    private PayParams r;
    private int s;
    private MTCashierScrollView t;
    private Map<String, Object> u;
    @MTPayNeedToPersist
    private boolean v;
    private com.meituan.android.cashier.widget.a z;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final boolean E_() {
        return true;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_PJmoK";
    }

    public MTCashierRevisionFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e0352f67c7fcaebd2eca6af8ebb67f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e0352f67c7fcaebd2eca6af8ebb67f3");
            return;
        }
        this.d = 0;
        this.j = false;
        this.b = false;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.v = true;
        this.B = true;
        this.K = new com.meituan.android.cashier.utils.b();
        this.M = false;
    }

    public static /* synthetic */ String a(MTCashierRevisionFragment mTCashierRevisionFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "a6b9e87e9badf64fae5f1b71075c16c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "a6b9e87e9badf64fae5f1b71075c16c9");
        }
        String str = "";
        if (i == 333) {
            str = "standardPayCashierSwitchCard";
        } else if (i == 555) {
            str = "standardPayCashierMarketing";
        } else if (i == 888) {
            str = "standardPayCashierIndex";
        }
        return mTCashierRevisionFragment.b(str);
    }

    public static /* synthetic */ void a(MTCashierRevisionFragment mTCashierRevisionFragment, com.meituan.android.pay.common.payment.data.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "8cbd7e86bf8a12ce29233c6c941a6632", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "8cbd7e86bf8a12ce29233c6c941a6632");
        } else if (mTCashierRevisionFragment.f != null) {
            if (mTCashierRevisionFragment.f.d) {
                com.meituan.android.paybase.common.analyse.a.e(mTCashierRevisionFragment.getString(R.string.cashier__mge_cid_homepage), mTCashierRevisionFragment.getString(R.string.cashier__mge_act_confirm_pay), null);
                if (dVar == null) {
                    com.meituan.android.paybase.dialog.e.a((Activity) mTCashierRevisionFragment.getActivity(), (Object) Integer.valueOf((int) R.string.cashier__choose_pay_type));
                    return;
                }
                if (dVar instanceof MTPayment) {
                    MTPayment mTPayment = (MTPayment) dVar;
                    if (com.meituan.android.pay.utils.g.d(mTPayment)) {
                        mTCashierRevisionFragment.K.b(dVar, str, mTCashierRevisionFragment.r());
                        mTCashierRevisionFragment.c = mTPayment;
                        HalfPageFragment.a aVar = new HalfPageFragment.a("credit_half_page", mTCashierRevisionFragment.b("standardPayCashierIndex"), mTPayment.getCreditPayOpenInfo().getData(), 888);
                        aVar.j = HalfPageFragment.a((MTCashierActivity) mTCashierRevisionFragment.getActivity());
                        HalfPageFragment.a(mTCashierRevisionFragment, aVar);
                        com.meituan.android.cashier.common.q.b("b_pay_credit_open_leave_cashier_sc", new a.c().a("url", mTCashierRevisionFragment.b("standardPayCashierIndex")).a(KnbConstants.PARAMS_SCENE, 8).b, mTCashierRevisionFragment.r());
                        return;
                    }
                }
                if (com.meituan.android.pay.common.payment.utils.c.e(dVar.getPayType()) && mTCashierRevisionFragment.z != null && mTCashierRevisionFragment.z.a()) {
                    com.meituan.android.cashier.widget.a aVar2 = mTCashierRevisionFragment.z;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.cashier.widget.a.a;
                    if (!(PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "5b32153f3141b555dc6b2b98b1ed9bfd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "5b32153f3141b555dc6b2b98b1ed9bfd")).booleanValue() : aVar2.b.isChecked())) {
                        com.meituan.android.paybase.dialog.e.a((Activity) mTCashierRevisionFragment.getActivity(), (Object) mTCashierRevisionFragment.z.getBrandAgreement().getUnCheckedTip());
                        return;
                    }
                }
                mTCashierRevisionFragment.a(dVar, str);
                return;
            }
            mTCashierRevisionFragment.f.a(mTCashierRevisionFragment.getActivity());
        }
    }

    public static /* synthetic */ void a(MTCashierRevisionFragment mTCashierRevisionFragment, String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "64ef7dbc79f68b45f14d88803fb49335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "64ef7dbc79f68b45f14d88803fb49335");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                int i2 = new JSONObject(str).getInt("fd_maidan_opened_status");
                if (i != 333) {
                    if (i != 555) {
                        if (i != 888) {
                            return;
                        }
                        mTCashierRevisionFragment.a(i2, "standardPayCashierIndex");
                        return;
                    }
                    Object[] objArr2 = {Integer.valueOf(i2), "standardPayCashierMarketing"};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, mTCashierRevisionFragment, changeQuickRedirect2, false, "75c482bb50eb3454ee613a2c2188e123", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, mTCashierRevisionFragment, changeQuickRedirect2, false, "75c482bb50eb3454ee613a2c2188e123");
                        return;
                    } else {
                        mTCashierRevisionFragment.a(i2, "standardPayCashierMarketing");
                        return;
                    }
                }
                Object[] objArr3 = {Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, mTCashierRevisionFragment, changeQuickRedirect3, false, "af3333c9edbbc4fabb65bc48cf0f34bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mTCashierRevisionFragment, changeQuickRedirect3, false, "af3333c9edbbc4fabb65bc48cf0f34bc");
                } else if (i2 == 3) {
                    LocalBroadcastManager.getInstance(mTCashierRevisionFragment.getContext()).sendBroadcast(new Intent("com.meituan.android.cashier.standardCashier.refresh"));
                    com.meituan.android.pay.utils.g.b();
                    mTCashierRevisionFragment.a(mTCashierRevisionFragment.c, (com.meituan.android.pay.common.payment.data.a) null, mTCashierRevisionFragment.d);
                } else if (i2 == 2) {
                    com.meituan.android.paybase.dialog.e.a((Activity) mTCashierRevisionFragment.getActivity(), (Object) mTCashierRevisionFragment.getString(R.string.mpay__open_credit_pay_fail));
                }
            } catch (JSONException e) {
                com.meituan.android.paybase.common.analyse.a.a(e, "dealCreditPayOpenResult", new a.c().a("message", e.getMessage()).b);
            }
        }
    }

    public static /* synthetic */ int b(MTCashierRevisionFragment mTCashierRevisionFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "7e96a5e4c7e04ebd46b8c6d3f2586836", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "7e96a5e4c7e04ebd46b8c6d3f2586836")).intValue();
        }
        if (i == 888) {
            return 8;
        }
        if (i == 555) {
            return 5;
        }
        return i == 333 ? 3 : -1;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbdc7664197682f2ecaaf064fdd97fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbdc7664197682f2ecaaf064fdd97fc8");
            return;
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onCreate");
        com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onCreate");
        a.c cVar = new a.c();
        com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onCreate").b, r());
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fdcd6a83787c6262af66e6d3a9b09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fdcd6a83787c6262af66e6d3a9b09d");
            return;
        }
        super.onAttach(context);
        g();
    }

    private Cashier f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c46330b653ee6517ba2270f3eda50f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cashier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c46330b653ee6517ba2270f3eda50f");
        }
        if (this.L != null) {
            return this.L;
        }
        g();
        if (this.f != null) {
            NativeStandardCashierAdapter nativeStandardCashierAdapter = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = NativeStandardCashierAdapter.a;
            this.L = PatchProxy.isSupport(objArr2, nativeStandardCashierAdapter, changeQuickRedirect2, false, "58fd96f84334c37a911885966c110548", RobustBitConfig.DEFAULT_VALUE) ? (Cashier) PatchProxy.accessDispatch(objArr2, nativeStandardCashierAdapter, changeQuickRedirect2, false, "58fd96f84334c37a911885966c110548") : nativeStandardCashierAdapter.a(nativeStandardCashierAdapter.i);
        }
        return this.L;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db3ecf9aae6549c195bc1d29e89fe7e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db3ecf9aae6549c195bc1d29e89fe7e6");
        } else if (this.f == null && (getActivity() instanceof MTCashierActivity)) {
            ICashier iCashier = ((MTCashierActivity) getActivity()).e;
            if (iCashier instanceof NativeStandardCashierAdapter) {
                this.f = (NativeStandardCashierAdapter) iCashier;
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "578b1e96041b6e11359fc37b658f4319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "578b1e96041b6e11359fc37b658f4319");
            return;
        }
        super.onViewStateRestored(bundle);
        g();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ccaff026946b3cd88ebc2da72d965f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ccaff026946b3cd88ebc2da72d965f");
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onCreateView");
        com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onCreateView");
        a.c cVar = new a.c();
        com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onCreateView").b, r());
        return layoutInflater.inflate(R.layout.cashier__fragment_revision, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec91e162d324875d3d359e03b130bfff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec91e162d324875d3d359e03b130bfff");
            return;
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onViewCreated");
        com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onViewCreated");
        a.c cVar = new a.c();
        com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onViewCreated").b, r());
        super.onViewCreated(view, bundle);
        a(this.h, this.i, f(), j(), i(), null, this.C);
    }

    private String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1af246d4d42e1188aa7e59c9394296", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1af246d4d42e1188aa7e59c9394296");
        }
        if (TextUtils.isEmpty(this.l)) {
            g();
            if (this.f != null) {
                this.l = this.f.h;
            }
        }
        return this.l;
    }

    private String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "900144bab8e9f092e357d8c9dfca054f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "900144bab8e9f092e357d8c9dfca054f");
        }
        if (TextUtils.isEmpty(this.k)) {
            g();
            if (this.f != null) {
                this.k = this.f.b;
            }
        }
        return this.k;
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5c577e49b9c4d94b75c6e5c6702957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5c577e49b9c4d94b75c6e5c6702957");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e5e50f9b3322e6ebd8fea194c92c0383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e5e50f9b3322e6ebd8fea194c92c0383");
        } else {
            Cashier f = f();
            if (f != null) {
                List<CashierPayment> paymentDataList = f.getPaymentDataList();
                if (!com.meituan.android.paybase.utils.i.a((Collection) paymentDataList)) {
                    for (int i = 0; i < paymentDataList.size(); i++) {
                        CashierPayment cashierPayment = paymentDataList.get(i);
                        if (cashierPayment == this.g) {
                            this.m = i;
                        } else if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                            List<MTPayment> recommendPayment = cashierPayment.getRecommendPayment();
                            if (!com.meituan.android.paybase.utils.i.a((Collection) recommendPayment)) {
                                for (int i2 = 0; i2 < recommendPayment.size(); i2++) {
                                    if (recommendPayment.get(i2) == this.g) {
                                        this.m = i;
                                        this.n = i2;
                                    }
                                }
                            }
                        }
                    }
                }
                List<FinanceServiceBean> financeDataList = f.getFinanceDataList();
                if (!com.meituan.android.paybase.utils.i.a((Collection) financeDataList)) {
                    for (int i3 = 0; i3 < financeDataList.size(); i3++) {
                        if (financeDataList.get(i3) == this.g) {
                            this.o = i3;
                        }
                    }
                }
            }
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b70c57e7c2f2a6f3fcbdfe210fd36a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b70c57e7c2f2a6f3fcbdfe210fd36a3");
            return;
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onStart");
        com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onStart");
        a.c cVar = new a.c();
        com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onStart").b, r());
        super.onStart();
        K();
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_SsoHH", "POP", null, r());
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15efaf26b7c6c05b3b772a955c98ba4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15efaf26b7c6c05b3b772a955c98ba4b");
            return;
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " onResume");
        com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " onResume");
        a.c cVar = new a.c();
        com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " onResume").b, r());
        if (!M()) {
            this.j = true;
        }
        if ((this.g instanceof MTPayment) && !this.B && (com.meituan.android.pay.common.payment.utils.e.a((com.meituan.android.pay.common.payment.data.d) ((MTPayment) this.g)) || com.meituan.android.pay.common.payment.utils.c.e(this.g.getPayType()))) {
            b(k());
        }
        if (this.f != null) {
            NativeStandardCashierAdapter nativeStandardCashierAdapter = this.f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = NativeStandardCashierAdapter.a;
            if (PatchProxy.isSupport(objArr2, nativeStandardCashierAdapter, changeQuickRedirect2, false, "1a5a4578a9e0db01447a98f657f666e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, nativeStandardCashierAdapter, changeQuickRedirect2, false, "1a5a4578a9e0db01447a98f657f666e7");
            } else if (nativeStandardCashierAdapter.e) {
                nativeStandardCashierAdapter.e = false;
                if (nativeStandardCashierAdapter.l != null) {
                    nativeStandardCashierAdapter.l.a("第三方支付结果", nativeStandardCashierAdapter.b());
                }
            }
        }
        super.onResume();
    }

    private HashMap<String, String> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13073bbaa4ae43933cc798f7e6a726ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13073bbaa4ae43933cc798f7e6a726ac");
        }
        g();
        if (this.f != null) {
            return this.f.b();
        }
        return new HashMap<>();
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992683c3e5b7580cccc0b78310429680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992683c3e5b7580cccc0b78310429680");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(this.x, "c_PJmoK");
        com.meituan.android.paybase.common.analyse.a.a(this.x, "c_PJmoK", e());
    }

    public final void a(String str, String str2, Cashier cashier, String str3, String str4, CashierPopWindowBean cashierPopWindowBean, boolean z) {
        int i;
        Object[] objArr = {str, str2, cashier, str3, str4, cashierPopWindowBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5896c2bff6e9bd2ce53132f6b0a15d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5896c2bff6e9bd2ce53132f6b0a15d7");
            return;
        }
        this.C = z;
        g();
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " init_start");
        if (!TextUtils.isEmpty(str3)) {
            this.k = str3;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || cashier == null) {
            if (getView() != null) {
                getView().setVisibility(4);
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("cashierShowError", getString(R.string.cashier__show_error));
            }
            u();
        } else {
            this.K.c = cashier;
            this.K.b = str3;
            this.h = str;
            this.i = str2;
            this.L = cashier;
            this.l = str4;
            if (getActivity() instanceof PayBaseActivity) {
                ((PayBaseActivity) getActivity()).hideProgress();
                PayBaseActivity.o();
            }
            if (getView() != null) {
                q();
                this.p = (ProgressButton) getView().findViewById(R.id.btn_cashier_pay_confirm);
                com.meituan.android.paybase.metrics.a.c("tti_cashier_view", getClass().getName() + " init_start");
                a.c cVar = new a.c();
                com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", cVar.a("recordStep", getClass().getName() + " init_start").b, r());
                if (this.v) {
                    this.v = false;
                    if (this.f != null) {
                        this.f.a(true, (Map<String, Object>) null);
                        if (!z) {
                            com.meituan.android.cashier.common.q.a("native_standcashier_start_succ", (Map<String, Object>) null, (List<Float>) null, r());
                            com.meituan.android.cashier.util.c.a(getActivity() instanceof MTCashierActivity ? ((MTCashierActivity) getActivity()).k() : "unknown", r());
                        }
                    }
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 200);
                    if (this.j) {
                        this.j = false;
                        l();
                    }
                    i = 0;
                    if (a(cashierPopWindowBean, CashierPopWindowBean.BEFORE_PAY_SCENE) && this.f != null) {
                        this.f.a(cashierPopWindowBean, getChildFragmentManager());
                    }
                } else {
                    i = 0;
                }
                getView().setVisibility(i);
                getView().getViewTreeObserver().addOnGlobalLayoutListener(this);
                v();
                new Handler().post(com.meituan.android.cashier.fragment.a.a(this));
                w();
                z();
                Q();
                K();
                com.meituan.android.paybase.metrics.a.c("tti_cashier_view", "end");
                com.meituan.android.paybase.metrics.a.b("tti_cashier_view");
                com.meituan.android.cashier.common.q.a("b_pay_cashier_tti_record_mv", new a.c().a("recordStep", "end").b, r());
                m();
                n();
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("cashierShowError", com.meituan.android.paycommon.lib.config.a.a().a.getString(R.string.cashier__show_error));
            }
        }
        com.meituan.android.paybase.metrics.a.c("MTCashier_launch_time", getClass().getName() + " init_end");
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df6cb7de27c8edcadb78cefad03f7a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df6cb7de27c8edcadb78cefad03f7a0");
        } else if (this.t == null || this.M || this.J == null || this.J.getFirstCheckedBox() == null) {
        } else {
            this.J.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "894b50335470b5fa7c78a0cbc5c503f1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "894b50335470b5fa7c78a0cbc5c503f1");
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        MTCashierRevisionFragment.this.J.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        MTCashierRevisionFragment.this.J.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    int[] iArr = new int[2];
                    MTCashierRevisionFragment.this.J.getFirstCheckedBox().getLocationOnScreen(iArr);
                    int height = (iArr[1] - ((MTCashierRevisionFragment.this.t.getHeight() * 2) / 3)) - ((MTCashierRevisionFragment.this.getView() == null || MTCashierRevisionFragment.this.getView().findViewById(R.id.layout_cashier_head) == null) ? 0 : MTCashierRevisionFragment.this.getView().findViewById(R.id.layout_cashier_head).getHeight());
                    if (height <= 0) {
                        return;
                    }
                    int height2 = height + (MTCashierRevisionFragment.this.t.getHeight() / 3);
                    int height3 = MTCashierRevisionFragment.this.J.getHeight() - MTCashierRevisionFragment.this.t.getHeight();
                    if (height2 > height3) {
                        height2 = height3;
                    }
                    MTCashierScrollView mTCashierScrollView = MTCashierRevisionFragment.this.t;
                    Object[] objArr3 = {Integer.valueOf(height2)};
                    ChangeQuickRedirect changeQuickRedirect3 = MTCashierScrollView.a;
                    if (PatchProxy.isSupport(objArr3, mTCashierScrollView, changeQuickRedirect3, false, "363ecc1b1d8dd7577637b26bfc6921e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, mTCashierScrollView, changeQuickRedirect3, false, "363ecc1b1d8dd7577637b26bfc6921e7");
                        return;
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(mTCashierScrollView.getScrollY(), height2 + mTCashierScrollView.getScrollY());
                    ofInt.setInterpolator(new LinearInterpolator());
                    ofInt.addUpdateListener(com.meituan.android.cashier.widget.g.a(mTCashierScrollView, ofInt));
                    ofInt.setDuration(height2 / 3);
                    ofInt.start();
                }
            });
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c8aea03fb8e9dfc7c36bc57d4832819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c8aea03fb8e9dfc7c36bc57d4832819");
        } else if (this.t == null || this.t.getViewTreeObserver() == null || this.J == null || this.J.getFinanceAreaView() == null) {
        } else {
            this.N = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faa4f19973ae2776a02679295c82c832", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faa4f19973ae2776a02679295c82c832");
                        return;
                    }
                    if (MTCashierRevisionFragment.this.J.getFinanceAreaView().getLocalVisibleRect(new Rect())) {
                        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_0w8ylr65_mv", "金融服务区域曝光", new a.c().a("page_style", "1").a("utm_source", "-999").b, MTCashierRevisionFragment.this.r());
                        MTCashierRevisionFragment.this.t.getViewTreeObserver().removeOnScrollChangedListener(MTCashierRevisionFragment.this.N);
                    }
                }
            };
            this.t.getViewTreeObserver().addOnScrollChangedListener(this.N);
        }
    }

    public static boolean a(CashierPopWindowBean cashierPopWindowBean, String str) {
        boolean z = false;
        Object[] objArr = {cashierPopWindowBean, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bacfa5f424b339663eb223dcff9d2fc5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bacfa5f424b339663eb223dcff9d2fc5")).booleanValue();
        }
        if (cashierPopWindowBean == null || cashierPopWindowBean.getPopDetailInfo() == null || !TextUtils.equals(str, cashierPopWindowBean.getPopScene())) {
            return false;
        }
        PopDetailInfo popDetailInfo = cashierPopWindowBean.getPopDetailInfo();
        switch (cashierPopWindowBean.getType()) {
            case 3:
            case 4:
            case 5:
            case 6:
                if (!TextUtils.isEmpty(popDetailInfo.getTitle()) && !TextUtils.isEmpty(popDetailInfo.getGuideButton()) && !TextUtils.isEmpty(popDetailInfo.getStyle()) && popDetailInfo.getGuidePayTypeInfo() != null) {
                    z = true;
                }
                if (!z) {
                    a(cashierPopWindowBean);
                }
                return z;
            default:
                return false;
        }
    }

    private static void a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c154b4b36eab52c28ecb786f285ad228", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c154b4b36eab52c28ecb786f285ad228");
            return;
        }
        String str = "收银台引导弹窗数据异常";
        if (cashierPopWindowBean.getType() == 3) {
            str = "收银台引导弹窗数据异常，异常类型为拉新绑卡";
        } else if (cashierPopWindowBean.getType() == 4) {
            str = "收银台引导弹窗数据异常，异常类型为拉新月付";
        } else if (cashierPopWindowBean.getType() == 5) {
            str = "收银台引导弹窗数据异常，异常类型为促活美团支付（A类）";
        } else if (cashierPopWindowBean.getType() == 6) {
            str = "收银台引导弹窗数据异常，异常类型为促活绑多卡（B类）";
        }
        if (TextUtils.equals(cashierPopWindowBean.getPopScene(), CashierPopWindowBean.BEFORE_PAY_SCENE)) {
            str = str + "，场景为支付前";
        } else if (TextUtils.equals(cashierPopWindowBean.getPopScene(), CashierPopWindowBean.INTERRUPT_PAY_SCENE)) {
            str = str + "，场景为三方中断";
        }
        com.meituan.android.paybase.common.analyse.cat.a.a("bindCardGuideInfoError", str);
    }

    @Nullable
    private com.meituan.android.pay.common.payment.data.d o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d0def67485054a03e4d29d50904a05", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d0def67485054a03e4d29d50904a05");
        }
        Cashier f = f();
        List<CashierPayment> paymentDataList = f.getPaymentDataList();
        if (!com.meituan.android.paybase.utils.i.a((Collection) paymentDataList)) {
            for (int i = 0; i < paymentDataList.size(); i++) {
                CashierPayment cashierPayment = paymentDataList.get(i);
                if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType()) && cashierPayment.isSelected()) {
                    com.meituan.android.pay.common.payment.data.d a2 = u.a().a(cashierPayment);
                    if (a2 != null) {
                        return a2;
                    }
                } else if (cashierPayment.isSelected()) {
                    return cashierPayment;
                }
            }
        }
        List<FinanceServiceBean> financeDataList = f.getFinanceDataList();
        if (com.meituan.android.paybase.utils.i.a((Collection) financeDataList)) {
            return null;
        }
        for (int i2 = 0; i2 < financeDataList.size(); i2++) {
            FinanceServiceBean financeServiceBean = financeDataList.get(i2);
            if (financeServiceBean.isSelected()) {
                return financeServiceBean;
            }
        }
        return null;
    }

    @Nullable
    private com.meituan.android.pay.common.payment.data.d p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63bd75aa99b5efada2907a17b7842d16", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63bd75aa99b5efada2907a17b7842d16");
        }
        Cashier f = f();
        List<CashierPayment> paymentDataList = f.getPaymentDataList();
        if (!com.meituan.android.paybase.utils.i.a((Collection) paymentDataList) && this.m >= 0 && this.m < paymentDataList.size()) {
            CashierPayment cashierPayment = paymentDataList.get(this.m);
            if (!com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                return cashierPayment;
            }
            List<MTPayment> recommendPayment = cashierPayment.getRecommendPayment();
            if (!com.meituan.android.paybase.utils.i.a((Collection) recommendPayment) && this.n >= 0 && this.n < recommendPayment.size()) {
                return recommendPayment.get(this.n);
            }
        }
        List<FinanceServiceBean> financeDataList = f.getFinanceDataList();
        if (com.meituan.android.paybase.utils.i.a((Collection) financeDataList) || this.o < 0 || this.o >= financeDataList.size()) {
            return null;
        }
        return financeDataList.get(this.o);
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366089812c329398969aa6099e8f42fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366089812c329398969aa6099e8f42fb");
            return;
        }
        Cashier f = f();
        this.g = p();
        com.meituan.android.pay.common.payment.data.d a2 = a(f);
        if (this.g != null) {
            if (this.g == a2) {
                this.g = t();
            }
        } else if (a2 != null && a2.isSelected()) {
            this.g = t();
        } else {
            this.g = o();
        }
        if (this.g != null && !s()) {
            this.g = t();
        }
        if (this.g == null) {
            this.g = t();
            com.meituan.android.paybase.common.analyse.a.a((Map<String, Object>) new a.c().a("init_payment_data", "no_default_payment").b);
            com.meituan.android.paybase.common.analyse.cat.a.a("noDefaultPayType", getString(R.string.cashier__no_default_pay_type));
            com.meituan.android.cashier.common.q.a("paybiz_cashier_no_selected_payment", (Map<String, Object>) null, (List<Float>) null, r());
        }
        if (this.g != null) {
            String payType = this.g.getPayType();
            if (this.f != null) {
                this.f.c = payType;
            }
            HashMap<String, Object> hashMap = new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.h).a("merchant_no", j()).a("default_pay_type", payType).b;
            com.meituan.android.cashier.common.q.a("b_pay_ddse35tm_mv", hashMap, r());
            com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_6wu70o9w_mv", "收银台默选的支付方式上报", hashMap, ae.a.VIEW, r());
        }
        com.meituan.android.cashier.base.utils.a.a(getContext(), f);
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7f3a8a03be57f11ce46434ef155e189", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7f3a8a03be57f11ce46434ef155e189")).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        int status = this.g.getStatus();
        return status == 0 || status == 2;
    }

    private com.meituan.android.pay.common.payment.data.d t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e3fa7b0666b12da4758a3af5f8808b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e3fa7b0666b12da4758a3af5f8808b");
        }
        Cashier f = f();
        this.M = true;
        List<CashierPayment> paymentDataList = f.getPaymentDataList();
        if (com.meituan.android.paybase.utils.i.a((Collection) paymentDataList)) {
            return null;
        }
        for (int i = 0; i < paymentDataList.size(); i++) {
            CashierPayment cashierPayment = paymentDataList.get(i);
            if (!com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                return cashierPayment;
            }
            com.meituan.android.pay.common.payment.data.d b = u.a().b(cashierPayment);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    private void u() {
        ActionBar supportActionBar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64cd4f72db16c612d48e93d15956266a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64cd4f72db16c612d48e93d15956266a");
        } else if (getActivity() == null || (supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar()) == null) {
        } else {
            supportActionBar.c();
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1d1c67463cd6dced9504293e14f67ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1d1c67463cd6dced9504293e14f67ce");
        } else if (getActivity() == null) {
        } else {
            ActionBar supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.b();
            }
            Cashier f = f();
            if (TextUtils.isEmpty(f.getOrderTxt())) {
                ((MTCashierActivity) getActivity()).b(R.string.cashier__payinfo_title);
            } else {
                ((MTCashierActivity) getActivity()).b(f.getOrderTxt());
            }
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ffa0c3df1fee707068287fb19f4970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ffa0c3df1fee707068287fb19f4970");
            return;
        }
        Cashier f = f();
        a(f.getHeadNotice());
        a(f.getExpireTime(), f.getCurrentTime());
        x();
    }

    private void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4dab2ad21ab69e9aa9aa954deaaa7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4dab2ad21ab69e9aa9aa954deaaa7e0");
        } else if (map == null || getView() == null) {
        } else {
            NoticeView noticeView = (NoticeView) getView().findViewById(R.id.notice_layout);
            noticeView.setStyle(NoticeView.a.ROUND_ORANGE);
            String valueOf = map.get("content") != null ? String.valueOf(map.get("content")) : "";
            String valueOf2 = map.get("url") != null ? String.valueOf(map.get("url")) : "";
            if (TextUtils.isEmpty(valueOf)) {
                noticeView.setVisibility(8);
                return;
            }
            HashMap<String, Object> hashMap = new a.c().a(KnbConstants.PARAMS_SCENE, "收银台首页小黄条").a(RegionLinkDao.TABLENAME, valueOf).b;
            com.meituan.android.paybase.common.analyse.a.a("b_aZuNd", "显示协议", hashMap, a.EnumC0329a.VIEW, -1);
            noticeView.setText(valueOf);
            noticeView.setVisibility(0);
            if (!TextUtils.isEmpty(valueOf2)) {
                noticeView.setOnClickListener(b.a(this, hashMap, valueOf2));
            }
            com.meituan.android.paybase.common.analyse.a.a("MTCashierRevisionFragment", "initErrorTip", "", "");
        }
    }

    public static /* synthetic */ void a(MTCashierRevisionFragment mTCashierRevisionFragment, HashMap hashMap, String str, View view) {
        Object[] objArr = {mTCashierRevisionFragment, hashMap, str, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "785db85c7967aecbffc3dbb4532ba1b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "785db85c7967aecbffc3dbb4532ba1b1");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_hxOEn", "点击协议", hashMap, a.EnumC0329a.CLICK, -1);
        al.a(mTCashierRevisionFragment.getActivity(), str);
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48691526be2f3e59c006622abe67957", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48691526be2f3e59c006622abe67957");
        } else if (getView() == null) {
        } else {
            LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.layout_cashier_remaining_time);
            if (i <= 0) {
                linearLayout.setVisibility(8);
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("MTCashierRevisionFragment", "showRemainingTime", com.meituan.android.paybase.common.analyse.a.a("expireTime:" + i, "currentTime:" + i2), "");
            com.meituan.android.cashier.base.view.revision.e eVar = new com.meituan.android.cashier.base.view.revision.e(getContext(), f().getRemainTxt());
            linearLayout.addView(eVar);
            if (this.e == null) {
                long j = i - i2;
                if (j <= 0) {
                    if (this.f != null) {
                        this.f.d();
                        return;
                    }
                    return;
                }
                this.e = new com.meituan.android.cashier.base.view.revision.i<>(eVar, j * 1000, 1000L, c.a(this));
                this.e.start();
            }
        }
    }

    public static /* synthetic */ void a(MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = {mTCashierRevisionFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7307c7f50e4b2906750e81c06b2981f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7307c7f50e4b2906750e81c06b2981f0");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, mTCashierRevisionFragment, changeQuickRedirect2, false, "ba31b97f4c319e25a488ff7bc16e02d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTCashierRevisionFragment, changeQuickRedirect2, false, "ba31b97f4c319e25a488ff7bc16e02d8");
        } else {
            Fragment findFragmentByTag = mTCashierRevisionFragment.getChildFragmentManager().findFragmentByTag("CardPayRedEnvelopeGuideDialogFragment");
            if (findFragmentByTag instanceof CardPayRedEnvelopeGuideDialogFragment) {
                ((CardPayRedEnvelopeGuideDialogFragment) findFragmentByTag).dismissAllowingStateLoss();
            }
            Fragment findFragmentByTag2 = mTCashierRevisionFragment.getChildFragmentManager().findFragmentByTag("CardPayFunctionGuideDialogFragment");
            if (findFragmentByTag2 instanceof CardPayFunctionGuideDialogFragment) {
                ((CardPayFunctionGuideDialogFragment) findFragmentByTag2).dismissAllowingStateLoss();
            }
            Fragment findFragmentByTag3 = mTCashierRevisionFragment.getChildFragmentManager().findFragmentByTag("CreditPayGuideDialogFragment");
            if (findFragmentByTag3 instanceof CreditPayGuideDialogFragment) {
                ((CreditPayGuideDialogFragment) findFragmentByTag3).dismissAllowingStateLoss();
            }
            Fragment findFragmentByTag4 = mTCashierRevisionFragment.getChildFragmentManager().findFragmentByTag("PromotionSignedGuideFragment");
            if (findFragmentByTag4 instanceof PromotionSignedGuideFragment) {
                ((PromotionSignedGuideFragment) findFragmentByTag4).dismissAllowingStateLoss();
            }
            Fragment findFragmentByTag5 = mTCashierRevisionFragment.getChildFragmentManager().findFragmentByTag("DCEPDialogFragment");
            if (findFragmentByTag5 instanceof DCEPDialogFragment) {
                ((DCEPDialogFragment) findFragmentByTag5).dismissAllowingStateLoss();
            }
        }
        mTCashierRevisionFragment.e.cancel();
        mTCashierRevisionFragment.e = null;
        if (mTCashierRevisionFragment.f != null) {
            mTCashierRevisionFragment.f.d();
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a69d3a65e9624808540d29595e8aa02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a69d3a65e9624808540d29595e8aa02");
        } else if (getView() == null) {
        } else {
            com.meituan.android.paybase.common.analyse.a.a("MTCashierRevisionFragment", "showOrderInfo", "", "");
            CashierOrderInfoView cashierOrderInfoView = new CashierOrderInfoView(getContext());
            cashierOrderInfoView.a(f());
            cashierOrderInfoView.a(c(this.g).floatValue());
            ((LinearLayout) getView().findViewById(R.id.layout_business_info)).addView(cashierOrderInfoView);
            a((LinearLayout) getView().findViewById(R.id.cashier__discount_view), this.g);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ff  */
    /* JADX WARN: Type inference failed for: r0v30, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v49, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v11, types: [android.widget.LinearLayout] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void y() {
        /*
            Method dump skipped, instructions count: 2057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.y():void");
    }

    private void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da5db3e780f04b3c6e4cc78f8887c605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da5db3e780f04b3c6e4cc78f8887c605");
        } else if (getView() == null) {
        } else {
            this.t = (MTCashierScrollView) getView().findViewById(R.id.cashier_scroll_layout);
            this.t.setScrollable(true);
            com.meituan.android.paybase.common.analyse.a.e("MTCashierRevisionFragment", "initPayment", null);
            y();
        }
    }

    private BigDecimal c(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad53e44a2e54cf81ea2311a8c3dd042c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BigDecimal) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad53e44a2e54cf81ea2311a8c3dd042c");
        }
        Cashier f = f();
        BigDecimal b = com.meituan.android.paybase.utils.d.b(BigDecimal.valueOf(f != null ? f.getTotalFee() : 0.0d), a(dVar, V()));
        return com.meituan.android.paybase.utils.d.c((Number) b, (Number) 0) <= 0 ? BigDecimal.valueOf(0.01d) : b;
    }

    private BigDecimal a(com.meituan.android.pay.common.payment.data.d dVar, boolean z) {
        Object[] objArr = {dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aedae506a7072d4f0d23e86f050d83b", RobustBitConfig.DEFAULT_VALUE) ? (BigDecimal) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aedae506a7072d4f0d23e86f050d83b") : com.meituan.android.pay.desk.payment.discount.a.a(com.meituan.android.cashier.retrofit.a.a(f()), dVar, z);
    }

    private int d(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85138c99f8ff9f831c41a8a24d0e963b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85138c99f8ff9f831c41a8a24d0e963b")).intValue();
        }
        WalletPayment a2 = com.meituan.android.cashier.retrofit.a.a(f());
        Object[] objArr2 = {a2, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.payment.discount.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "468bda1e4ae3c760363605e077a6de32", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "468bda1e4ae3c760363605e077a6de32")).intValue();
        }
        FloatingLayer b = com.meituan.android.pay.desk.payment.discount.a.b(dVar);
        if (b == null || !b.hasRewardData() || !(dVar instanceof MTPayment) || a2 == null) {
            return 0;
        }
        return com.meituan.android.pay.common.promotion.utils.a.f(com.meituan.android.pay.desk.payment.discount.a.c(dVar));
    }

    @Override // com.meituan.android.pay.desk.pack.e.a
    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d608a6d7274b7fef753fcf5fbb12405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d608a6d7274b7fef753fcf5fbb12405");
        } else {
            e(dVar);
        }
    }

    private void a(com.meituan.android.pay.common.payment.data.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb7cfc871c91054be8ba5821205022d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb7cfc871c91054be8ba5821205022d7");
            return;
        }
        String payType = dVar.getPayType();
        com.meituan.android.cashier.common.q.a("b_5l4Io", new a.b().a().a("pay_type", payType).a("entrance", "clickbutton").b, r());
        u.a().f = str;
        this.K.b(dVar, str, r());
        a(payType);
        u.a().e = "cashier_button";
        b(dVar);
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ae307a6cf7711eb4a74c40a787bd8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ae307a6cf7711eb4a74c40a787bd8d");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().a("pay_type", str).b;
        com.meituan.android.cashier.common.q.b("b_pay_standard_cashier_mt_pay_confirm_sc", hashMap, r());
        com.meituan.android.cashier.common.q.a("standard_cashier_mt_pay_confirm", hashMap, (List<Float>) null, r());
    }

    private void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d44c720315f119486ce64e6ee14a61b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d44c720315f119486ce64e6ee14a61b");
            return;
        }
        com.meituan.android.paybase.metrics.a.a().a("tti_verify_password_pay_view");
        com.meituan.android.paybase.metrics.a.a().a("tti_card_bin_view");
        com.meituan.android.paybase.metrics.a.a().a("tti_card_ocr_view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MTPaySuppressFBWarnings({"SIC_INNER_SHOULD_BE_STATIC_ANON"})
    public void e(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b544ce7715c15ab4c8f8b2a64ad7b8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b544ce7715c15ab4c8f8b2a64ad7b8a");
        } else if (dVar == null) {
        } else {
            Map<String, Object> a2 = com.meituan.android.cashier.base.utils.a.a(dVar);
            a2.put("creditPay_status", Integer.valueOf(com.meituan.android.cashier.base.utils.a.a(f())));
            a2.put("merchant_no", j());
            com.meituan.android.paybase.common.analyse.a.a("b_6u1yatb7", getString(R.string.cashier__mge_act_click_pay_type), a2, a.EnumC0329a.CLICK, -1);
            com.meituan.android.pay.desk.payment.report.a.a(dVar);
            if (dVar != this.g) {
                b(dVar, "standardPayCashierIndex");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.meituan.android.pay.common.payment.data.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb675d1a2cd278240c95b6964ea103a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb675d1a2cd278240c95b6964ea103a");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("MTCashierRevisionFragment", "onClick_切换支付方式", com.meituan.android.paybase.common.analyse.a.a("payType:" + dVar.getName(), "status:" + dVar.getStatus(), "statusInfo:" + dVar.getStatusInfo()), "");
        this.K.a(dVar, str, r());
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_0G11Q", "切换支付方式", new a.b().a().a("merchant_no", j()).a("pay_type", dVar.getPayType()).a("status", String.valueOf(dVar.getStatus())).b, ae.a.CLICK, r());
        if (this.f != null) {
            this.f.c = dVar.getPayType();
        }
        this.g = dVar;
        U();
        i(this.g);
        K();
    }

    @MTPaySuppressFBWarnings({"NP_NULL_ON_SOME_PATH"})
    private CashierPayment B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0c22eb057c46a16f66e1bad564ec56", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0c22eb057c46a16f66e1bad564ec56");
        }
        Cashier f = f();
        if (com.meituan.android.paybase.utils.i.a((Collection) f.getPaymentDataList())) {
            return null;
        }
        for (CashierPayment cashierPayment : f.getPaymentDataList()) {
            if (com.meituan.android.pay.common.payment.utils.c.b(cashierPayment.getPayType())) {
                return cashierPayment;
            }
        }
        return null;
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78f85d4858ba24cd9115d267ee3cd42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78f85d4858ba24cd9115d267ee3cd42");
            return;
        }
        this.r = new PayParams();
        if (!TextUtils.isEmpty(str)) {
            this.r.verifyPayType = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.r.verifyPayOrderId = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            this.r.verifyType = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            this.r.verifyResult = str4;
        }
        if (TextUtils.isEmpty(str5)) {
            return;
        }
        this.r.verifyToken = str5;
    }

    private PayParams f(com.meituan.android.pay.common.payment.data.d dVar) {
        ReduceInfo noBalanceReduceInfo;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae360424a27fbb2130fd327d9d204849", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae360424a27fbb2130fd327d9d204849");
        }
        Cashier f = f();
        com.meituan.android.paybase.common.analyse.a.a("MTCashierRevisionFragment", "genPayParams", "", "");
        this.q = com.meituan.android.cashier.retrofit.a.a(f, this.h, this.i);
        if (dVar != null) {
            if (com.meituan.android.pay.common.payment.data.g.i.contains(dVar.getPayType())) {
                this.q = c();
            }
            if (com.meituan.android.cashier.retrofit.a.a(B(), dVar)) {
                this.q.walletPayParams = u.a().a(getActivity(), com.meituan.android.cashier.retrofit.a.a(f), dVar, "cashier_params");
                b(this.q.walletPayParams);
                a(this.q);
            } else {
                PaymentReduce paymentReduce = dVar.getPaymentReduce();
                Object[] objArr2 = {paymentReduce};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "201e45d5d967fe183f61f46757f946ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "201e45d5d967fe183f61f46757f946ab");
                } else if (paymentReduce != null && this.q != null && (noBalanceReduceInfo = paymentReduce.getNoBalanceReduceInfo()) != null) {
                    this.q.campaignId = noBalanceReduceInfo.getCampaignId();
                    this.q.couponCode = noBalanceReduceInfo.getCashTicketId();
                }
                this.q.payType = dVar.getPayType();
            }
            if (TextUtils.equals("upsepay", this.q.payType)) {
                String e = com.meituan.android.paymentchannel.utils.b.e();
                if (!TextUtils.isEmpty(e)) {
                    this.q.upsepayType = e;
                }
            }
        }
        return this.q;
    }

    private void a(PayParams payParams) {
        Object[] objArr = {payParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb42989f5fad0e87d64dbb3c3359bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb42989f5fad0e87d64dbb3c3359bd5");
        } else {
            com.meituan.android.cashier.retrofit.a.b(payParams, C());
        }
    }

    private String C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3d3372bdd5323e55e834576f452a62", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3d3372bdd5323e55e834576f452a62") : this.f != null ? this.f.j : "";
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(final int i, int i2, Intent intent) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f021543b611c2b298e4a85013652bc36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f021543b611c2b298e4a85013652bc36");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if ((i == 888 || i == 555 || i == 333) ? true : true) {
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr2 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82bd876e6657b8b3ba230f3dae428419", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82bd876e6657b8b3ba230f3dae428419");
                    } else {
                        com.meituan.android.cashier.common.q.b("b_pay_credit_open_back_to_cashier_sc", new a.c().a("errorCode", Integer.valueOf(i3)).a("errorMessage", str).a(KnbConstants.PARAMS_SCENE, Integer.valueOf(MTCashierRevisionFragment.b(MTCashierRevisionFragment.this, i))).a("url", MTCashierRevisionFragment.a(MTCashierRevisionFragment.this, i)).b, MTCashierRevisionFragment.this.r());
                    }
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b860ed9e00b824d9c488b7eafa0e4c05", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b860ed9e00b824d9c488b7eafa0e4c05");
                        return;
                    }
                    MTCashierRevisionFragment.a(MTCashierRevisionFragment.this, str, i);
                    com.meituan.android.cashier.common.q.b("b_pay_credit_open_back_to_cashier_sc", new a.c().a("result", str).a(KnbConstants.PARAMS_SCENE, Integer.valueOf(MTCashierRevisionFragment.b(MTCashierRevisionFragment.this, i))).a("url", MTCashierRevisionFragment.a(MTCashierRevisionFragment.this, i)).b, MTCashierRevisionFragment.this.r());
                }
            });
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be05f28d2aeb9ec1c12b013f8ea5db85", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be05f28d2aeb9ec1c12b013f8ea5db85") : com.meituan.android.pay.utils.g.a(getActivity(), this.c.getCreditPayOpenInfo().getUrl(), str, "");
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c763b7451f5709f1622c1c6377f872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c763b7451f5709f1622c1c6377f872");
        } else if (i == 3) {
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(new Intent("com.meituan.android.cashier.standardCashier.refresh"));
            com.meituan.android.pay.utils.g.b();
            a(this.c, str);
        } else if (i == 2) {
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) getString(R.string.mpay__open_credit_pay_fail));
        }
    }

    public final void b(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df6b11538ddb65aa34bbd201c43bb20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df6b11538ddb65aa34bbd201c43bb20");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("MTCashierRevisionFragment", "payOrder", "", "");
        boolean a2 = com.meituan.android.cashier.retrofit.a.a(B(), dVar);
        if (a2) {
            A();
            com.meituan.android.paybase.metrics.a.b("tti_verify_password_pay_view", "start");
            com.meituan.android.paybase.metrics.a.b("tti_card_bin_view", "start");
            com.meituan.android.paybase.metrics.a.b("tti_card_ocr_view", "start");
        }
        this.q = f(dVar);
        if (this.f != null) {
            this.f.c = dVar.getPayType();
        }
        this.q.moneyChanged = 0;
        if (a2) {
            com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " gohellopay_request_start");
            com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " gohellopay_request_start");
            com.meituan.android.paybase.metrics.a.c("tti_card_ocr_view", getClass().getName() + " gohellopay_request_start");
            com.meituan.android.cashier.common.q.a("b_pay_2qmi5hr1_mv", new a.b().b, r());
            HashMap<String, String> a3 = com.meituan.android.cashier.retrofit.a.a(this.q);
            m.a((MTCashierActivity) getActivity(), a3);
            u.a(a3, u.a().f);
            ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 3)).goHelloPay(a3);
            L();
        } else if (TextUtils.equals("dcep", dVar.getPayType())) {
            if (dVar instanceof CashierPayment) {
                CashierPayment cashierPayment = (CashierPayment) dVar;
                if (cashierPayment.getBankListPage() != null && !com.meituan.android.paybase.utils.i.a((Collection) cashierPayment.getBankListPage().getPaymentList())) {
                    this.q.uniqueId = r();
                    DCEPDialogFragment.a(this.h, cashierPayment.getBankListPage(), this.q.m7clone(), i() == null ? "" : i(), O(), E(), D(), k()).a(getChildFragmentManager());
                    return;
                }
                com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_data_error));
                return;
            }
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_data_error));
        } else {
            PayParams payParams = this.q;
            getActivity();
            a(com.meituan.android.cashier.retrofit.a.a(payParams, ""));
        }
    }

    private String D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae59bd97f8c63d9ba75d32764641c8fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae59bd97f8c63d9ba75d32764641c8fb");
        }
        g();
        return this.f != null ? this.f.g : "";
    }

    private String E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8796597a86db7280b33fc424adc4738a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8796597a86db7280b33fc424adc4738a");
        }
        g();
        return this.f != null ? this.f.n : "";
    }

    private void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed24876edffba7b4c3919e3398004aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed24876edffba7b4c3919e3398004aa");
            return;
        }
        this.q.verifyPayType = "";
        this.q.verifyPayOrderId = "";
        this.q.verifyType = "";
        this.q.verifyResult = "";
        this.q.verifyToken = "";
    }

    public final void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "811f6973376c8e41880a034479f1eb06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "811f6973376c8e41880a034479f1eb06");
        } else if (com.meituan.android.paybase.utils.i.a(hashMap)) {
        } else {
            if (!com.meituan.android.pay.common.payment.data.g.i.contains(hashMap.get("pay_type"))) {
                F();
            }
            ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 1)).startDirectPay(hashMap, com.meituan.android.paycommon.lib.config.a.a().o(), i() == null ? "" : i(), H(), C(), "", D(), G(), k());
        }
    }

    private String G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9f56fcc74e9ee09709285f02ee8895", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9f56fcc74e9ee09709285f02ee8895");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", E());
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierRevisionFragment_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004b -> B:28:0x0053). Please submit an issue!!! */
    private String H() {
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "503676c7772f60484a5279fce993e1a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "503676c7772f60484a5279fce993e1a3");
        }
        if (this.f == null) {
            return "";
        }
        String c = this.f.c();
        if (TextUtils.isEmpty(c)) {
            return O();
        }
        String O = O();
        try {
            if (TextUtils.isEmpty(O)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(O);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("guideRequestNo", c);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47bb645f7d2c0bccaefc5b91983985b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47bb645f7d2c0bccaefc5b91983985b2");
            return;
        }
        if (i == 1 && (obj instanceof PayResult)) {
            PayResult payResult = (PayResult) obj;
            Object[] objArr2 = {payResult};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bf246f5010cfb0f206833ce01fcdfff", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bf246f5010cfb0f206833ce01fcdfff")).booleanValue();
            } else if (payResult != null && !TextUtils.isEmpty(payResult.getPayType()) && payResult.getPopUp() != null) {
                PopUp popUp = payResult.getPopUp();
                if (!TextUtils.isEmpty(popUp.getType()) && !TextUtils.isEmpty(popUp.getSubtype()) && !TextUtils.isEmpty(popUp.getTitle()) && !TextUtils.isEmpty(popUp.getBody()) && !TextUtils.isEmpty(popUp.getConfirmButton()) && !TextUtils.isEmpty(popUp.getCancelButton()) && !TextUtils.isEmpty(popUp.getOrderId()) && (!TextUtils.equals(popUp.getType(), "riskVerify") || !TextUtils.isEmpty(popUp.getUrl()))) {
                    z = true;
                }
            }
            if (z) {
                RiskDialogFragment.a(payResult).a(getChildFragmentManager());
                return;
            }
        }
        if (i == 562) {
            if (obj instanceof RefreshInstallment) {
                this.B = true;
                RefreshInstallment refreshInstallment = (RefreshInstallment) obj;
                if (this.g instanceof MTPayment) {
                    u.a().a(refreshInstallment, com.meituan.android.cashier.retrofit.a.a(f()), (MTPayment) this.g);
                }
                K();
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_cashier_refresh_installment", 200);
                com.meituan.android.paybase.common.analyse.a.a("b_pay_d3xt3vs4_mv", new a.c().a("is_support_period", Integer.valueOf(refreshInstallment.getIsSupportInstallment())).b);
                return;
            }
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) getString(R.string.mpay__installment_network_error));
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_cashier_refresh_installment", 1110001);
            com.meituan.android.paybase.common.analyse.cat.a.a("installmentRequestSuccessRefreshFail", getString(R.string.mpay__installment_refresh_fail));
            com.meituan.android.paybase.common.analyse.a.a("b_pay_x3wmmjai_mv", new a.c().a("message", getString(R.string.mpay__installment_refresh_fail)).b);
        } else if (this.f != null) {
            this.f.onRequestSucc(i, obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b6b20f4607f15334dfcd61db2113174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b6b20f4607f15334dfcd61db2113174");
        } else if (i == 562) {
            if (exc instanceof PayException) {
                com.meituan.android.paycommon.lib.utils.d.a(getActivity(), exc, null);
                PayException payException = (PayException) exc;
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_cashier_refresh_installment", payException.getCode());
                com.meituan.android.paybase.common.analyse.a.a("b_pay_x3wmmjai_mv", new a.c().a("message", payException.getMessage()).a("code", Integer.valueOf(payException.getCode())).a("level", Integer.valueOf(payException.getLevel())).b);
                return;
            }
            com.meituan.android.paybase.dialog.e.a((Activity) getActivity(), (Object) getString(R.string.mpay__installment_network_error));
            com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_cashier_refresh_installment", (int) ErrorCode.JSExecute.AI_BUNDLE_IS_NULL_FEATURE);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_x3wmmjai_mv", new a.c().a("message", exc.getMessage()).b);
        } else if (this.f != null) {
            this.f.onRequestException(i, exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e1cb0394aaa8d8432dd84295067492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e1cb0394aaa8d8432dd84295067492");
            return;
        }
        if (this.p.b) {
            this.p.b();
        }
        hideProgress();
        if (this.g != null && this.f != null) {
            this.f.c = this.g.getPayType();
        }
        if (i == 562) {
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5ejlvgw8_mc", new a.c().a("consume_time", Long.valueOf(System.currentTimeMillis() - u.a().d)).b);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153b77d825daac89d1738c87f4d3ae95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153b77d825daac89d1738c87f4d3ae95");
        } else if (1 != i && 3 != i) {
            if (562 == i) {
                b(true);
                if (getActivity() == null || ((PayBaseActivity) getActivity()).n() == null) {
                    return;
                }
                ((PayBaseActivity) getActivity()).n().setCancelable(false);
                return;
            }
            b(com.meituan.android.paybase.common.utils.b.a());
        } else {
            if (getActivity() != null) {
                ((MTCashierActivity) getActivity()).c = null;
            }
            if (getActivity() == null || getActivity().isFinishing() || this.p == null) {
                return;
            }
            com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
            if (z.a() && cVar != null && cVar.h) {
                return;
            }
            this.p.a();
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    @MTPaySuppressFBWarnings({"FE_FLOATING_POINT_EQUALITY"})
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        MTPayment mTPayment;
        int i = 0;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920ee2ed0b07c4b32912bc17eabf75d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920ee2ed0b07c4b32912bc17eabf75d8");
        } else if (!isAdded() || isDetached() || this.g == null || com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
        } else {
            if ((aVar instanceof Payment) && (this.g instanceof MTPayment)) {
                mTPayment = (MTPayment) this.g;
            } else if (aVar instanceof MTPayment) {
                mTPayment = (MTPayment) aVar;
                if (Math.abs(com.meituan.android.paybase.utils.d.b(c((com.meituan.android.pay.common.payment.data.d) mTPayment), c(this.g)).floatValue()) > 1.0E-4d) {
                    i = 1;
                }
            } else {
                mTPayment = null;
            }
            if (mTPayment != null) {
                A();
                com.meituan.android.paybase.metrics.a.b("tti_verify_password_pay_view", "start");
                com.meituan.android.paybase.metrics.a.b("tti_card_bin_view", "start");
                com.meituan.android.paybase.metrics.a.b("tti_card_ocr_view", "start");
                if (aVar instanceof MTPayment) {
                    if (com.meituan.android.pay.utils.g.d(mTPayment)) {
                        this.K.b((MTPayment) aVar, "standardPayCashierSwitchCard", r());
                        this.c = mTPayment;
                        this.d = i;
                        HalfPageFragment.a aVar2 = new HalfPageFragment.a("credit_half_page", b("standardPayCashierSwitchCard"), mTPayment.getCreditPayOpenInfo().getData(), 333);
                        aVar2.j = HalfPageFragment.a((MTCashierActivity) getActivity());
                        HalfPageFragment.a(this, aVar2);
                        com.meituan.android.cashier.common.q.b("b_pay_credit_open_leave_cashier_sc", new a.c().a("url", b("standardPayCashierSwitchCard")).a(KnbConstants.PARAMS_SCENE, 3).b, r());
                        return;
                    }
                    a(mTPayment, (com.meituan.android.pay.common.payment.data.a) null, i);
                    return;
                }
                a(mTPayment, aVar, i);
            }
        }
    }

    private void a(com.meituan.android.pay.common.payment.data.d dVar, com.meituan.android.pay.common.payment.data.a aVar, int i) {
        Object[] objArr = {dVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61ec9907a918b84b4e0a9543230cda9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61ec9907a918b84b4e0a9543230cda9");
            return;
        }
        Cashier f = f();
        PayParams a2 = com.meituan.android.cashier.retrofit.a.a(f, this.h, this.i);
        if (dVar != null && this.f != null) {
            this.f.c = dVar.getPayType();
        }
        u.a().e = "cashier_change_paytype";
        if (dVar != null) {
            a2.walletPayParams = u.a().a(getActivity(), com.meituan.android.cashier.retrofit.a.a(f), dVar, "cashier_select_bank_dialog_params");
            b(a2.walletPayParams);
            a(a2);
        }
        if (aVar != null) {
            u.a().a(getActivity(), dVar, aVar, a2.walletPayParams);
        }
        a2.moneyChanged = i;
        a2.fromSelectBankCard = 1;
        String payType = dVar != null ? dVar.getPayType() : "";
        com.meituan.android.cashier.common.q.a("b_5l4Io", new a.b().a().a("pay_type", payType).a("entrance", "bankcardview").b, r());
        com.meituan.android.cashier.common.q.a("b_pay_2qmi5hr1_mv", new a.b().b, r());
        u.a().f = "standardPayCashierSwitchCard";
        this.K.b(dVar, "standardPayCashierSwitchCard", r());
        a(payType);
        com.meituan.android.paybase.metrics.a.c("tti_verify_password_pay_view", getClass().getName() + " gohellopay_request_start");
        com.meituan.android.paybase.metrics.a.c("tti_card_bin_view", getClass().getName() + " gohellopay_request_start");
        com.meituan.android.paybase.metrics.a.c("tti_card_ocr_view", getClass().getName() + " gohellopay_request_start");
        HashMap<String, String> a3 = com.meituan.android.cashier.retrofit.a.a(a2);
        m.a((MTCashierActivity) getActivity(), a3);
        u.a(a3, "standardPayCashierSwitchCard");
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 3)).goHelloPay(a3);
        L();
        com.meituan.android.pay.desk.component.analyse.a.a("paybiz_gohellopay_start", "1");
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a39ece20e941f20b1993b2dc79dd756f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a39ece20e941f20b1993b2dc79dd756f");
        } else if (!isAdded() || isDetached()) {
        } else {
            com.meituan.android.paybase.common.analyse.a.a("b_2c5n632e", "点击关闭切卡弹窗", (Map<String, Object>) null, a.EnumC0329a.CLICK, -1);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bfac3b95ebb319c9f17db31562f0960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bfac3b95ebb319c9f17db31562f0960");
        } else if (getView() != null) {
            this.t.setOnTouchListener(new a());
            if (Build.VERSION.SDK_INT >= 16) {
                getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        }
    }

    public final void c(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "112ff4d013149deb757650d91cb4e684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "112ff4d013149deb757650d91cb4e684");
            return;
        }
        g();
        if (this.f != null) {
            this.f.m = true;
        }
        a(mTPayment);
    }

    @Override // com.meituan.android.cashier.dialog.r
    public final void a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1c598ac02d81db59489988da4369a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1c598ac02d81db59489988da4369a4");
        } else if (mTPayment != null) {
            u.a().e = "cashier_promo_guide";
            b((com.meituan.android.pay.common.payment.data.d) mTPayment);
        }
    }

    @Override // com.meituan.android.cashier.dialog.s
    public final void b(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95058fd1645bdf362ca5c59c4ee94043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95058fd1645bdf362ca5c59c4ee94043");
        } else if (mTPayment != null) {
            b((com.meituan.android.pay.common.payment.data.d) mTPayment);
        }
    }

    @Override // com.meituan.android.cashier.dialog.q
    public final void a(MTPayment mTPayment, CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {mTPayment, cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be91617a63a6c0919357fb5b23a9391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be91617a63a6c0919357fb5b23a9391");
        } else if (mTPayment == null || cashierPopWindowBean == null) {
        } else {
            int type = cashierPopWindowBean.getType();
            if (type == 3 || type == 4 || type == 6) {
                u.a().e = "cashier_promo_guide";
            }
            b((com.meituan.android.pay.common.payment.data.d) mTPayment);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements View.OnTouchListener {
        public static ChangeQuickRedirect a;
        public int b;
        public boolean c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fd8cb71758cf18e618202c0c65a208", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fd8cb71758cf18e618202c0c65a208");
                return;
            }
            this.b = 0;
            this.c = false;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "839bbdb60a10634f17f39ee3997fabc1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "839bbdb60a10634f17f39ee3997fabc1")).booleanValue();
            }
            if (view instanceof ScrollView) {
                ((MTCashierScrollView) view).setScrollable(false);
                switch (motionEvent.getAction()) {
                    case 0:
                        this.b = view.getScrollY();
                        break;
                    case 1:
                        if (this.c) {
                            com.meituan.android.paybase.common.analyse.a.a("b_bWJBC", "滑动展示支付方式", new a.c().a("IS_BOTTOM", "TRUE").b, a.EnumC0329a.VIEW, -1);
                            this.c = false;
                            Metrics.getInstance().stopCustomFPS(MTCashierRevisionFragment.class.getName());
                            break;
                        }
                        break;
                    case 2:
                        if (!this.c && view.getScrollY() != this.b) {
                            this.c = true;
                            Metrics.getInstance().startCustomFPS(MTCashierRevisionFragment.class.getName());
                            break;
                        }
                        break;
                }
            }
            return false;
        }
    }

    private void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b568444ab92a7877511fcb3570ed1746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b568444ab92a7877511fcb3570ed1746");
        } else if (isAdded() && getView() != null && this.J != null) {
            Cashier f = f();
            NativeStandardCashierAreaView nativeStandardCashierAreaView = this.J;
            com.meituan.android.pay.common.payment.data.d dVar = this.g;
            Object[] objArr2 = {dVar, f};
            ChangeQuickRedirect changeQuickRedirect2 = NativeStandardCashierAreaView.a;
            if (PatchProxy.isSupport(objArr2, nativeStandardCashierAreaView, changeQuickRedirect2, false, "923b8f6a5a25c902b2ca97ef1a0eda60", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, nativeStandardCashierAreaView, changeQuickRedirect2, false, "923b8f6a5a25c902b2ca97ef1a0eda60");
                return;
            }
            for (int i = 0; i < nativeStandardCashierAreaView.getChildCount(); i++) {
                nativeStandardCashierAreaView.a(dVar, (ViewGroup) nativeStandardCashierAreaView.getChildAt(i), f);
            }
        }
    }

    private void J() {
        byte b;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4135ecee2147d1150fe0dff82ac605a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4135ecee2147d1150fe0dff82ac605a7");
        } else if (getView() == null) {
        } else {
            Button button = (Button) getView().findViewById(R.id.btn_cashier_pay_confirm);
            button.setEnabled((this.g == null || com.meituan.android.pay.common.payment.utils.d.a(this.g.getStatus())) ? false : true);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6d05983a5dc5c48d4aa47ce83a0873a", RobustBitConfig.DEFAULT_VALUE)) {
                b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6d05983a5dc5c48d4aa47ce83a0873a")).booleanValue();
            } else {
                if (this.g instanceof MTPayment) {
                    MTPayment mTPayment = (MTPayment) this.g;
                    if (com.meituan.android.pay.common.payment.utils.c.e(mTPayment.getPayType()) && mTPayment.getUpdateAgreement() != null && mTPayment.getUpdateAgreement().isChecked()) {
                        b = 1;
                    }
                }
                b = 0;
            }
            Object[] objArr3 = {Byte.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "244e1912812a6235ca0bda49b7417669", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "244e1912812a6235ca0bda49b7417669");
            } else {
                str = "";
                if (this.g instanceof MTPayment) {
                    if (b != 0) {
                        str = ((MTPayment) this.g).getCreditPayNoPwdButonText();
                    } else {
                        str = ((MTPayment) this.g).getPayButonText();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = getString(R.string.cashier__pay_confirm);
                }
            }
            button.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011e, code lost:
        if (com.meituan.android.paybase.utils.d.c((java.lang.Number) a(r21, false), (java.lang.Number) 0) > 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g(com.meituan.android.pay.common.payment.data.d r21) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.g(com.meituan.android.pay.common.payment.data.d):void");
    }

    private void K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f26ec14e64a84bd13f605c838da700ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f26ec14e64a84bd13f605c838da700ec");
            return;
        }
        I();
        J();
        g(this.g);
    }

    private void L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ec36d8bb8b26325712540d254b9ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ec36d8bb8b26325712540d254b9ce3");
            return;
        }
        HashMap<String, Object> hashMap = new a.c().b;
        hashMap.put("change_tab_times", Integer.valueOf(this.s));
        if (this.g != null) {
            hashMap.put("cc_pay_type", this.g.getPayType());
        }
        com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_zhwml51d", "收银台首页点击切卡", hashMap, a.EnumC0329a.CLICK, -1);
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84ef6c3cb81802a5dfa52bc08ddb27ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84ef6c3cb81802a5dfa52bc08ddb27ff");
            return;
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_Zdp0X", "CLOSE", null, r());
        super.onStop();
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74c9cdae952c912af181245792c2257", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74c9cdae952c912af181245792c2257");
            return;
        }
        if (this.e != null) {
            this.e.cancel();
            this.e = null;
        }
        this.s = 0;
        this.f = null;
        this.r = null;
        u.a().b();
        if (this.t != null && this.t.getViewTreeObserver() != null) {
            this.t.getViewTreeObserver().removeOnScrollChangedListener(this.N);
        }
        super.onDetach();
    }

    private boolean M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a51d841f4392737e6fcf346468e1c57", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a51d841f4392737e6fcf346468e1c57")).booleanValue() : f() != null;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16a0bf564c3841c18eaa8198e0fb622", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16a0bf564c3841c18eaa8198e0fb622");
        }
        HashMap<String, Object> e = super.e();
        if (M()) {
            if (this.u == null) {
                this.u = this.K.a(this.g);
            }
            if (!com.meituan.android.paybase.utils.i.a(this.u)) {
                e.putAll(this.u);
            }
            return e;
        }
        return e;
    }

    private com.meituan.android.pay.common.payment.data.d a(Cashier cashier) {
        List<CashierPayment> paymentDataList;
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a559a6616a3c16ba90b65c99ff687a10", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a559a6616a3c16ba90b65c99ff687a10");
        }
        CashierPayment cashierPayment = null;
        if (cashier == null || (paymentDataList = cashier.getPaymentDataList()) == null) {
            return null;
        }
        Iterator<CashierPayment> it = paymentDataList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            CashierPayment next = it.next();
            if (TextUtils.equals(next.getPayType(), "upsepay")) {
                if (N()) {
                    paymentDataList.remove(next);
                    cashierPayment = next;
                }
                com.meituan.android.cashier.base.utils.e.a(r());
                com.meituan.android.paymentchannel.utils.b.b();
            }
        }
        return cashierPayment;
    }

    private boolean N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31f280947ba4d722c02796ae09fc870", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31f280947ba4d722c02796ae09fc870")).booleanValue();
        }
        if (TextUtils.equals("a", com.meituan.android.paybase.downgrading.a.a().a("android_pay_show_category"))) {
            return com.meituan.android.paymentchannel.utils.b.c();
        }
        return com.meituan.android.paymentchannel.utils.b.c() || com.meituan.android.paymentchannel.utils.b.d();
    }

    private String O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f3c2b375b41db490fb24878bb35bc06", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f3c2b375b41db490fb24878bb35bc06") : this.f == null ? "" : this.f.k;
    }

    private void b(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe3e325c8df2e312d070fbfe12fa104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe3e325c8df2e312d070fbfe12fa104");
        } else {
            com.meituan.android.cashier.retrofit.a.a(map, P(), O());
        }
    }

    private String P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6709fcb01970cbc9276a93fa660ee27a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6709fcb01970cbc9276a93fa660ee27a") : this.f != null ? this.f.c() : "";
    }

    @Override // com.meituan.android.pay.desk.pack.b
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5b992a814376faa67e5a4920d1308a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5b992a814376faa67e5a4920d1308a");
            return;
        }
        this.s++;
        Cashier f = f();
        if (f == null || TextUtils.isEmpty(f.getTradeNo())) {
            return;
        }
        com.meituan.android.pay.common.payment.utils.a.a(a.EnumC0321a.TRADE_ID, f.getTradeNo());
    }

    @Override // com.meituan.android.pay.desk.pack.b
    public final void a(View view, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {view, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "017ca39a6c7f11232cdbeb1b23a3c89d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "017ca39a6c7f11232cdbeb1b23a3c89d");
        } else {
            J();
        }
    }

    @Override // com.meituan.android.pay.desk.pack.b
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a60f9252e5dcefa3f579228a800b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a60f9252e5dcefa3f579228a800b15");
            return;
        }
        this.s++;
        Cashier f = f();
        if (f != null && !TextUtils.isEmpty(f.getTradeNo())) {
            com.meituan.android.pay.common.payment.utils.a.a(a.EnumC0321a.TRADE_ID, f.getTradeNo());
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_bvs8nppu_mc", (Map<String, Object>) null);
        J();
    }

    @Override // com.meituan.android.pay.desk.pack.b
    public final void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e01e09390702b0e7206c67550e21103b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e01e09390702b0e7206c67550e21103b");
            return;
        }
        this.s++;
        Cashier f = f();
        if (f == null || TextUtils.isEmpty(f.getTradeNo())) {
            return;
        }
        com.meituan.android.pay.common.payment.utils.a.a(a.EnumC0321a.TRADE_ID, f.getTradeNo());
    }

    @Override // com.meituan.android.pay.desk.pack.b
    public final void b(View view, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {view, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bcb01c613c244b27145bdb0ae6bd76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bcb01c613c244b27145bdb0ae6bd76");
            return;
        }
        WalletPayment a2 = com.meituan.android.cashier.retrofit.a.a(f());
        if (a2 == null || a2.getBalanceCombineDeduct() == null) {
            return;
        }
        if ((this.g instanceof MTPayment) && com.meituan.android.pay.common.payment.utils.d.a(this.g)) {
            a2.getBalanceCombineDeduct().setSwitchOn(z);
        }
        K();
    }

    @Override // com.meituan.android.pay.desk.pack.b
    public final void d(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28554fc5b3dd847d83afc223e16a40c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28554fc5b3dd847d83afc223e16a40c3");
        } else if (mTPayment != null) {
            b(mTPayment, "standardPayCashierIndex");
        }
    }

    private void Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c40a4d1245ed4af3cc51a4950a1e6f90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c40a4d1245ed4af3cc51a4950a1e6f90");
            return;
        }
        T();
        if (this.g != null) {
            R();
            i(this.g);
            U();
        }
    }

    private void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9f9a5b298e234f7df24534c2e8fecf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9f9a5b298e234f7df24534c2e8fecf8");
            return;
        }
        this.G = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.G.setDuration(150L);
        this.H = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.H.setDuration(150L);
        this.I = new Animation.AnimationListener() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.6
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccd1ec67e9520b2be2a7df700448f070", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccd1ec67e9520b2be2a7df700448f070");
                } else if (MTCashierRevisionFragment.this.A != null) {
                    MTCashierRevisionFragment.this.A.setVisibility(8);
                }
            }
        };
        this.H.setAnimationListener(this.I);
    }

    private void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e7bde77bcb1b205bffaf6c3a17ff8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e7bde77bcb1b205bffaf6c3a17ff8a");
            return;
        }
        Agreement agreement = null;
        String str = "";
        if (this.g instanceof MTPayment) {
            MTPayment mTPayment = (MTPayment) this.g;
            if (!com.meituan.android.pay.utils.g.d(mTPayment)) {
                agreement = mTPayment.getAgreement();
                str = mTPayment.getBrandText();
            }
        }
        if (this.z != null) {
            com.meituan.android.cashier.widget.a aVar = this.z;
            aVar.c = agreement;
            aVar.d = str;
        }
    }

    private void T() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747e4bb01cbdd9a00bf4aff5853dea82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747e4bb01cbdd9a00bf4aff5853dea82");
            return;
        }
        if (this.z == null) {
            this.z = new com.meituan.android.cashier.widget.a(getActivity());
            this.z.setActivity(getActivity());
        }
        this.z.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.remind_layout);
        linearLayout.removeAllViews();
        linearLayout.addView(this.z);
    }

    private void U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283d62f1a81860ec4bbb6ba6abe61736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283d62f1a81860ec4bbb6ba6abe61736");
            return;
        }
        S();
        if (this.z != null) {
            this.z.b();
        }
    }

    private void a(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {linearLayout, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818f1ff235e97b9410160b7d0d90d10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818f1ff235e97b9410160b7d0d90d10f");
        } else if (h(dVar)) {
            a(linearLayout);
        } else {
            b(linearLayout);
        }
    }

    private boolean h(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffeec7a1eb3d1c3046b1ef2d7e96ffcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffeec7a1eb3d1c3046b1ef2d7e96ffcf")).booleanValue();
        }
        return (dVar instanceof MTPayment) && com.meituan.android.pay.desk.payment.discount.a.a(com.meituan.android.cashier.retrofit.a.a(f()));
    }

    private void a(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e136336dbfddbaf504816fc082260804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e136336dbfddbaf504816fc082260804");
            return;
        }
        com.meituan.android.cashier.widget.m mVar = new com.meituan.android.cashier.widget.m(getContext());
        mVar.a(this.g);
        mVar.a(this.g, a(this.g, V()).floatValue());
        mVar.setId(R.id.mpay__save_money_view);
        mVar.setOnClickDiscountDetail(f.a(this));
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            linearLayout.addView(mVar);
            X();
            if (this.g != null) {
                com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_kfk8cezg_mv", "营销浮层", new a.c().a("tradeNo", f().getTradeNo()).a("pay_type", this.g.getPayType()).b, r());
            }
        }
    }

    private void b(LinearLayout linearLayout) {
        Object[] objArr = {linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa9a77957401004b5bbf041b120d3c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa9a77957401004b5bbf041b120d3c9");
            return;
        }
        com.meituan.android.pay.desk.payment.view.g gVar = new com.meituan.android.pay.desk.payment.view.g(getContext());
        gVar.a(com.meituan.android.pay.desk.payment.discount.a.b(this.g));
        gVar.setId(R.id.mpay__discount_view);
        gVar.setOnClickDiscountDetail(g.a(this));
        gVar.a(a(this.g, V()).floatValue(), d(this.g));
        if (!com.meituan.android.cashier.retrofit.a.a(B(), this.g)) {
            gVar.a();
        }
        gVar.a(0, aj.a(getContext(), 10.0f), 0, 0);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            linearLayout.addView(gVar);
            X();
            if (this.g != null) {
                com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_kfk8cezg_mv", "营销浮层", new a.c().a("tradeNo", f().getTradeNo()).a("pay_type", this.g.getPayType()).b, r());
            }
        }
    }

    private boolean V() {
        WalletPaymentListPage walletPaymentListPage;
        LabelAbTest labelAbTest;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a95df3a0d7e45b685bb71f8c9e067113", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a95df3a0d7e45b685bb71f8c9e067113")).booleanValue();
        }
        if (com.meituan.android.cashier.retrofit.a.a(this.L) == null || (walletPaymentListPage = com.meituan.android.cashier.retrofit.a.a(this.L).getWalletPaymentListPage()) == null || (labelAbTest = walletPaymentListPage.getLabelAbTest()) == null) {
            return false;
        }
        return labelAbTest.isShiftMultiCoupon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.W():void");
    }

    public static /* synthetic */ void a(MTCashierRevisionFragment mTCashierRevisionFragment, BigDecimal bigDecimal, ArrayList arrayList) {
        Object[] objArr = {mTCashierRevisionFragment, bigDecimal, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        BigDecimal bigDecimal2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0e5996ad62ffe84dac5cf56dbd152d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0e5996ad62ffe84dac5cf56dbd152d4");
            return;
        }
        com.meituan.android.pay.common.payment.data.d dVar = mTCashierRevisionFragment.g;
        Object[] objArr2 = {dVar, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.payment.discount.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c7ff991ec2773d13385e0ecd2a09d997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c7ff991ec2773d13385e0ecd2a09d997");
        } else if (dVar != null && !com.meituan.android.paybase.utils.i.a((Collection) dVar.getBottomLabels()) && !com.meituan.android.paybase.utils.i.a((Collection) arrayList)) {
            for (CombineLabel combineLabel : dVar.getBottomLabels()) {
                if (!com.meituan.android.paybase.utils.i.a((Collection) combineLabel.getChildrenLabel())) {
                    List<PayLabel> childrenLabel = combineLabel.getChildrenLabel();
                    Object[] objArr3 = {childrenLabel, arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.pay.desk.payment.discount.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8826a34b6d3fb8f38361fe517613489d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8826a34b6d3fb8f38361fe517613489d");
                    } else if (!com.meituan.android.paybase.utils.i.a((Collection) childrenLabel) && !com.meituan.android.paybase.utils.i.a((Collection) arrayList)) {
                        for (PayLabel payLabel : childrenLabel) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    PayLabel payLabel2 = (PayLabel) it.next();
                                    if (TextUtils.equals(payLabel.getLabelCode(), payLabel2.getLabelCode())) {
                                        if (payLabel.getLabelSwitch() != null && payLabel2.getLabelSwitch() != null) {
                                            payLabel.getLabelSwitch().setCheck(payLabel2.getLabelSwitch().getCheck());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        mTCashierRevisionFragment.K();
        if (com.meituan.android.pay.common.payment.utils.c.e(mTCashierRevisionFragment.g.getPayType()) || com.meituan.android.pay.common.payment.utils.e.a(mTCashierRevisionFragment.g)) {
            bigDecimal2 = mTCashierRevisionFragment.a(mTCashierRevisionFragment.g, false);
        }
        if (com.meituan.android.pay.common.payment.utils.e.a(mTCashierRevisionFragment.g, bigDecimal, bigDecimal2)) {
            mTCashierRevisionFragment.b(mTCashierRevisionFragment.k());
        }
    }

    private void X() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146c2213907c1345fc8c46e9cd20fbc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146c2213907c1345fc8c46e9cd20fbc2");
            return;
        }
        this.D = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.D.setDuration(150L);
        this.E = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.E.setDuration(150L);
        this.F = new Animation.AnimationListener() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.7
            public static ChangeQuickRedirect a;

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                LinearLayout linearLayout;
                Object[] objArr2 = {animation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d9e07fed24bdb899189d84fbf1db441", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d9e07fed24bdb899189d84fbf1db441");
                } else if (MTCashierRevisionFragment.this.getView() == null || (linearLayout = (LinearLayout) MTCashierRevisionFragment.this.getView().findViewById(R.id.cashier__discount_view)) == null) {
                } else {
                    linearLayout.setVisibility(8);
                }
            }
        };
        this.E.setAnimationListener(this.F);
    }

    private CashierMarketingGuideFloatView Y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5255570bb57d838a03b452a276390e", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierMarketingGuideFloatView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5255570bb57d838a03b452a276390e");
        }
        if (getView() == null) {
            return null;
        }
        if (this.A != null) {
            return this.A;
        }
        CashierMarketingGuideFloatView cashierMarketingGuideFloatView = (CashierMarketingGuideFloatView) getView().findViewById(R.id.cashier_discount_guide);
        Cashier f = f();
        CashierMarketingGuideFloatView.a aVar = new CashierMarketingGuideFloatView.a() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cashier.widget.CashierMarketingGuideFloatView.a
            public final void a(MTPayment mTPayment) {
                Object[] objArr2 = {mTPayment};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "469b23749510afeddff9848d2189b9c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "469b23749510afeddff9848d2189b9c3");
                } else if (com.meituan.android.pay.utils.g.d(mTPayment)) {
                    MTCashierRevisionFragment.this.c = mTPayment;
                    HalfPageFragment.a aVar2 = new HalfPageFragment.a("credit_half_page", MTCashierRevisionFragment.this.b("standardPayCashierMarketing"), mTPayment.getCreditPayOpenInfo().getData(), 555);
                    aVar2.j = HalfPageFragment.a((MTCashierActivity) MTCashierRevisionFragment.this.getActivity());
                    HalfPageFragment.a(MTCashierRevisionFragment.this, aVar2);
                    com.meituan.android.cashier.common.q.b("b_pay_credit_open_leave_cashier_sc", new a.c().a("url", MTCashierRevisionFragment.this.b("standardPayCashierMarketing")).a(KnbConstants.PARAMS_SCENE, 5).b, MTCashierRevisionFragment.this.r());
                } else {
                    MTCashierRevisionFragment.this.b(mTPayment, "standardPayCashierMarketing");
                    if (com.meituan.android.pay.common.payment.utils.c.g(mTPayment.getPayType()) || com.meituan.android.pay.common.payment.utils.c.i(mTPayment.getPayType())) {
                        MTCashierRevisionFragment.this.b((com.meituan.android.pay.common.payment.data.d) mTPayment);
                    }
                }
            }

            @Override // com.meituan.android.cashier.widget.CashierMarketingGuideFloatView.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11cb92e64e736aa210845ee3c41ecda1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11cb92e64e736aa210845ee3c41ecda1");
                } else if (MTCashierRevisionFragment.this.getView() == null || MTCashierRevisionFragment.this.A == null) {
                } else {
                    CashierMarketingGuideFloatView cashierMarketingGuideFloatView2 = MTCashierRevisionFragment.this.A;
                    if (z) {
                        LinearLayout linearLayout = (LinearLayout) MTCashierRevisionFragment.this.getView().findViewById(R.id.cashier__discount_view);
                        if (linearLayout.getVisibility() == 0) {
                            linearLayout.setVisibility(8);
                            linearLayout.clearAnimation();
                        } else if (cashierMarketingGuideFloatView2.getVisibility() == 0) {
                            if (cashierMarketingGuideFloatView2.getAnimation() != null) {
                                cashierMarketingGuideFloatView2.getAnimation().setAnimationListener(null);
                                cashierMarketingGuideFloatView2.clearAnimation();
                            }
                        } else if (cashierMarketingGuideFloatView2.getVisibility() == 8 && MTCashierRevisionFragment.this.G != null) {
                            cashierMarketingGuideFloatView2.startAnimation(MTCashierRevisionFragment.this.G);
                        }
                        cashierMarketingGuideFloatView2.setVisibility(0);
                    } else if (cashierMarketingGuideFloatView2.getVisibility() == 0) {
                        if (MTCashierRevisionFragment.this.H != null) {
                            MTCashierRevisionFragment.this.H.setAnimationListener(MTCashierRevisionFragment.this.I);
                            cashierMarketingGuideFloatView2.startAnimation(MTCashierRevisionFragment.this.H);
                            return;
                        }
                        cashierMarketingGuideFloatView2.setVisibility(8);
                    }
                }
            }
        };
        cashierMarketingGuideFloatView.c = f;
        cashierMarketingGuideFloatView.b = aVar;
        this.A = cashierMarketingGuideFloatView;
        return cashierMarketingGuideFloatView;
    }

    private void i(com.meituan.android.pay.common.payment.data.d dVar) {
        CashierMarketingGuideFloatView Y;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b8415a6c65a2ba452494cdfdad7f996", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b8415a6c65a2ba452494cdfdad7f996");
        } else if (getView() == null || (Y = Y()) == null) {
        } else {
            Y.a(dVar);
        }
    }

    private void b(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd5204a3cdf2e9c5bf1b7a5f8ee03d19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd5204a3cdf2e9c5bf1b7a5f8ee03d19");
            return;
        }
        u.a().a(getActivity(), this, this.h, this.i, this.g, false, D(), G(), hashMap);
        this.B = false;
    }

    public final PayParams c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a69bbf2f4ad79725f08dad59ee57ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a69bbf2f4ad79725f08dad59ee57ee");
        }
        if (this.r != null) {
            PayParams payParams = this.r;
            this.q.verifyPayType = payParams.verifyPayType;
            this.q.verifyPayOrderId = payParams.verifyPayOrderId;
            this.q.verifyType = payParams.verifyType;
            this.q.verifyResult = payParams.verifyResult;
            this.q.verifyToken = payParams.verifyToken;
        }
        return this.q;
    }

    public static /* synthetic */ void a(MTCashierRevisionFragment mTCashierRevisionFragment, BigDecimal bigDecimal, PromotionRefreshment promotionRefreshment, ArrayList arrayList, boolean z) {
        RefreshInstallment refreshInstallment;
        Object[] objArr = {mTCashierRevisionFragment, bigDecimal, promotionRefreshment, arrayList, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a52cfce211e99e10682c32f84259bde8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a52cfce211e99e10682c32f84259bde8");
            return;
        }
        mTCashierRevisionFragment.b = z;
        BigDecimal a2 = mTCashierRevisionFragment.a(mTCashierRevisionFragment.g, true);
        if (promotionRefreshment != null && (mTCashierRevisionFragment.g instanceof MTPayment) && com.meituan.android.pay.common.payment.utils.e.a(mTCashierRevisionFragment.g, bigDecimal, a2)) {
            com.meituan.android.pay.common.payment.data.d dVar = mTCashierRevisionFragment.g;
            Object[] objArr2 = {promotionRefreshment, dVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, mTCashierRevisionFragment, changeQuickRedirect2, false, "b8a0eca29568f2c20814ca421b2d92a7", RobustBitConfig.DEFAULT_VALUE)) {
                refreshInstallment = (RefreshInstallment) PatchProxy.accessDispatch(objArr2, mTCashierRevisionFragment, changeQuickRedirect2, false, "b8a0eca29568f2c20814ca421b2d92a7");
            } else if (promotionRefreshment != null) {
                refreshInstallment = new RefreshInstallment();
                refreshInstallment.setPayType(promotionRefreshment.getPayType());
                refreshInstallment.setIsSupportInstallment(promotionRefreshment.getIsSupportInstallment());
                refreshInstallment.setUnsupportedInstallmentReason(promotionRefreshment.getUnsupportedInstallmentReason());
                refreshInstallment.setInstallment(promotionRefreshment.getInstallmentInfo());
                refreshInstallment.setInstallmentRateDescBean(promotionRefreshment.getInstallmentRateDescBean());
                refreshInstallment.setCommonAgreement(promotionRefreshment.getCommonAgreement());
                refreshInstallment.setLabels(dVar.getBottomLabels());
            } else {
                refreshInstallment = null;
            }
            u.a().a(refreshInstallment, com.meituan.android.cashier.retrofit.a.a(mTCashierRevisionFragment.L), (MTPayment) mTCashierRevisionFragment.g);
        }
        mTCashierRevisionFragment.K();
    }

    public static /* synthetic */ void j(MTCashierRevisionFragment mTCashierRevisionFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "820b5fd230d8994ee52cfb5d4c7b5ed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTCashierRevisionFragment, changeQuickRedirect, false, "820b5fd230d8994ee52cfb5d4c7b5ed3");
        } else if (mTCashierRevisionFragment.getView() != null) {
            mTCashierRevisionFragment.p = (ProgressButton) mTCashierRevisionFragment.getView().findViewById(R.id.btn_cashier_pay_confirm);
            if (!com.meituan.android.cashier.retrofit.a.a(mTCashierRevisionFragment.B(), mTCashierRevisionFragment.g) && !TextUtils.isEmpty(mTCashierRevisionFragment.f().getPayButtonText())) {
                mTCashierRevisionFragment.p.setText(mTCashierRevisionFragment.f().getPayButtonText());
            }
            mTCashierRevisionFragment.p.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.widgets.g
                public final void a(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1746b0126f38ecc7c664fb73394b3cb3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1746b0126f38ecc7c664fb73394b3cb3");
                    } else {
                        MTCashierRevisionFragment.a(MTCashierRevisionFragment.this, MTCashierRevisionFragment.this.g, "standardPayCashierIndex");
                    }
                }
            }.a(1000L));
            mTCashierRevisionFragment.getView().findViewById(R.id.view_bottom_blank).setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.cashier.fragment.MTCashierRevisionFragment.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.widgets.g
                public final void a(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d27a179f55b987629535ac5b06acb465", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d27a179f55b987629535ac5b06acb465");
                    } else {
                        MTCashierRevisionFragment.a(MTCashierRevisionFragment.this, MTCashierRevisionFragment.this.g, "standardPayCashierIndex");
                    }
                }
            }.a(1000L));
            int a2 = com.meituan.android.paycommon.lib.utils.u.a(e.a.CASHIER__SUBBTN_BG);
            if (a2 >= 0) {
                mTCashierRevisionFragment.p.setBackgroundResource(a2);
            }
            int a3 = com.meituan.android.paycommon.lib.utils.u.a(e.a.CASHIER__SUBBTN_TEXT_COLOR);
            if (a3 >= 0) {
                mTCashierRevisionFragment.p.setTextColor(mTCashierRevisionFragment.getResources().getColor(a3));
            }
        }
    }
}
