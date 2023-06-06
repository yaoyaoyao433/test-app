package com.meituan.android.elderly.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.q;
import com.meituan.android.elderly.bean.Cashier;
import com.meituan.android.elderly.bean.CashierPayment;
import com.meituan.android.elderly.elderly.ElderlyCashier;
import com.meituan.android.elderly.params.PayParams;
import com.meituan.android.elderly.retrofit.CashierRequestService;
import com.meituan.android.elderly.view.ElderlyCashierPaymentAreaView;
import com.meituan.android.elderly.view.ElderlyCashierScrollView;
import com.meituan.android.elderly.view.revision.h;
import com.meituan.android.elderly.view.revision.i;
import com.meituan.android.pay.common.payment.data.d;
import com.meituan.android.paybase.activity.BaseActivity;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.z;
import com.meituan.android.paybase.widgets.ProgressButton;
import com.meituan.android.paycommon.lib.config.e;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.android.paycommon.lib.widgets.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MTElderlyCashierFragment extends PayBaseFragment implements ViewTreeObserver.OnGlobalLayoutListener, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private i<h> b;
    @Nullable
    private ElderlyCashier c;
    @MTPayNeedToPersist
    private d d;
    @MTPayNeedToPersist
    private Cashier e;
    @MTPayNeedToPersist
    private String f;
    @MTPayNeedToPersist
    private String g;
    @MTPayNeedToPersist
    private boolean h;
    @MTPayNeedToPersist
    private String i;
    @MTPayNeedToPersist
    private String j;
    @MTPayNeedToPersist
    private int k;
    private ProgressButton l;
    private PayParams m;
    private Map<String, Object> n;
    @MTPayNeedToPersist
    private boolean o;
    private ElderlyCashierPaymentAreaView p;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final boolean E_() {
        return true;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_PJmoK";
    }

    public MTElderlyCashierFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6def68518c58c2929c2986f8c2a3ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6def68518c58c2929c2986f8c2a3ee");
            return;
        }
        this.h = false;
        this.k = -1;
        this.o = true;
    }

    public static /* synthetic */ void a(MTElderlyCashierFragment mTElderlyCashierFragment, d dVar) {
        String str;
        PayParams payParams;
        PayParams payParams2;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTElderlyCashierFragment, changeQuickRedirect, false, "30c605b18e34842569c1b83f784527a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTElderlyCashierFragment, changeQuickRedirect, false, "30c605b18e34842569c1b83f784527a6");
        } else if (mTElderlyCashierFragment.c != null) {
            if (!mTElderlyCashierFragment.c.f) {
                mTElderlyCashierFragment.c.a(mTElderlyCashierFragment.getActivity());
            } else if (dVar == null) {
                e.a((Activity) mTElderlyCashierFragment.getActivity(), (Object) Integer.valueOf((int) R.string.cashierelderly__choose_pay_type));
            } else {
                String payType = dVar.getPayType();
                q.a("b_5l4Io", new a.b().a().a("pay_type", payType).a("entrance", "clickbutton").a("sub_type", "1").b, mTElderlyCashierFragment.r());
                com.meituan.android.paybase.common.analyse.a.a("b_xgald577", mTElderlyCashierFragment.getString(R.string.cashierelderly__mge_act_click_pay), new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("pay_type", payType).a("tradeNo", mTElderlyCashierFragment.e.getTradeNo()).a("merchant_no", mTElderlyCashierFragment.i).a("sub_type", "1").b, a.EnumC0329a.CLICK, -1);
                Object[] objArr2 = {payType};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                HashMap<String, String> hashMap = null;
                if (PatchProxy.isSupport(objArr2, mTElderlyCashierFragment, changeQuickRedirect2, false, "41b0eebca31625465f50a41c2281203c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mTElderlyCashierFragment, changeQuickRedirect2, false, "41b0eebca31625465f50a41c2281203c");
                } else {
                    HashMap<String, Object> hashMap2 = new a.c().a("pay_type", payType).b;
                    q.b("b_pay_elderly_cashier_mt_pay_confirm_sc", hashMap2, mTElderlyCashierFragment.r());
                    q.a("elderly_cashier_mt_pay_confirm", hashMap2, (List<Float>) null, mTElderlyCashierFragment.r());
                }
                Object[] objArr3 = {dVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, mTElderlyCashierFragment, changeQuickRedirect3, false, "91aab3f8fe5ac88498b3f6652c8443d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, mTElderlyCashierFragment, changeQuickRedirect3, false, "91aab3f8fe5ac88498b3f6652c8443d3");
                    return;
                }
                Object[] objArr4 = {dVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, mTElderlyCashierFragment, changeQuickRedirect4, false, "d7b957bb5c46175ac2e94f5a6a512a0b", RobustBitConfig.DEFAULT_VALUE)) {
                    payParams2 = (PayParams) PatchProxy.accessDispatch(objArr4, mTElderlyCashierFragment, changeQuickRedirect4, false, "d7b957bb5c46175ac2e94f5a6a512a0b");
                } else {
                    Cashier cashier = mTElderlyCashierFragment.e;
                    String str2 = mTElderlyCashierFragment.f;
                    String str3 = mTElderlyCashierFragment.g;
                    Object[] objArr5 = {cashier, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.elderly.retrofit.a.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "b2595d52abf8e884c9fcfb1d16d7932c", RobustBitConfig.DEFAULT_VALUE)) {
                        payParams = (PayParams) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "b2595d52abf8e884c9fcfb1d16d7932c");
                    } else {
                        PayParams payParams3 = new PayParams();
                        payParams3.tradeNo = str2;
                        payParams3.payToken = str3;
                        Object[] objArr6 = {cashier};
                        ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.elderly.retrofit.a.a;
                        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "0f7832adb30f6acc7eafcb03ecb63771", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "0f7832adb30f6acc7eafcb03ecb63771");
                        } else {
                            List<CashierPayment> paymentDataList = cashier.getPaymentDataList();
                            if (!com.meituan.android.paybase.utils.i.a((Collection) paymentDataList)) {
                                for (int i = 0; i < paymentDataList.size(); i++) {
                                    if (com.meituan.android.pay.common.payment.utils.c.b(paymentDataList.get(i).getPayType())) {
                                        str = "wallet";
                                        break;
                                    }
                                }
                            }
                            str = "common";
                        }
                        payParams3.cashierType = str;
                        payParams = payParams3;
                    }
                    mTElderlyCashierFragment.m = payParams;
                    mTElderlyCashierFragment.m.uniqueId = mTElderlyCashierFragment.r();
                    if (dVar != null) {
                        mTElderlyCashierFragment.m.payType = dVar.getPayType();
                    }
                    payParams2 = mTElderlyCashierFragment.m;
                }
                mTElderlyCashierFragment.m = payParams2;
                mTElderlyCashierFragment.m.uniqueId = mTElderlyCashierFragment.r();
                mTElderlyCashierFragment.m.moneyChanged = 0;
                PayParams payParams4 = mTElderlyCashierFragment.m;
                mTElderlyCashierFragment.getActivity();
                Object[] objArr7 = {payParams4, ""};
                ChangeQuickRedirect changeQuickRedirect7 = com.meituan.android.elderly.retrofit.a.a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "9560f8f5d08340b354d1d7267c838f6c", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (HashMap) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "9560f8f5d08340b354d1d7267c838f6c");
                } else if (payParams4 != null) {
                    hashMap = new HashMap<>();
                    hashMap.put("tradeno", payParams4.tradeNo);
                    hashMap.put("pay_token", payParams4.payToken);
                    hashMap.put("pay_type", payParams4.payType);
                    if (!TextUtils.isEmpty(payParams4.campaignId)) {
                        hashMap.put("campaign_id", payParams4.campaignId);
                    }
                    if (!TextUtils.isEmpty(payParams4.couponCode)) {
                        hashMap.put("cashticket_code", payParams4.couponCode);
                    }
                    if (!TextUtils.isEmpty(payParams4.upsepayType)) {
                        hashMap.put("upsepay_type", payParams4.upsepayType);
                    }
                    if (!TextUtils.isEmpty(payParams4.tokenId)) {
                        hashMap.put("token_id", payParams4.tokenId);
                    }
                }
                mTElderlyCashierFragment.a(hashMap);
            }
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "204f9d4ab67c898540ba6d92f2a78c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "204f9d4ab67c898540ba6d92f2a78c0e");
            return;
        }
        com.meituan.android.elderly.utils.a.a(getClass().getName(), " onCreate", r());
        super.onCreate(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667bba0f6859819a37ca3be5e6d0eded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667bba0f6859819a37ca3be5e6d0eded");
            return;
        }
        super.onAttach(context);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f41a006421cbbbc944f3f187f3485b6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f41a006421cbbbc944f3f187f3485b6b");
        } else if (this.c == null && (getActivity() instanceof MTCashierActivity)) {
            ICashier iCashier = ((MTCashierActivity) getActivity()).e;
            if (iCashier instanceof ElderlyCashier) {
                this.c = (ElderlyCashier) iCashier;
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e621e1ef113c1a41b812df310e992e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e621e1ef113c1a41b812df310e992e");
            return;
        }
        super.onViewStateRestored(bundle);
        b();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b4a969ca9dd1702172c62f6075d32aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b4a969ca9dd1702172c62f6075d32aa");
        }
        com.meituan.android.elderly.utils.a.a(getClass().getName(), " onCreateView", r());
        return layoutInflater.inflate(R.layout.cashier_elderly__fragment, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d408588e99d4175cf01fbb64df00dda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d408588e99d4175cf01fbb64df00dda");
            return;
        }
        com.meituan.android.elderly.utils.a.a(getClass().getName(), " onViewCreated", r());
        super.onViewCreated(view, bundle);
        a(this.f, this.g, this.e, this.i, this.j);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c205eabb9293fc6c86c813da260ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c205eabb9293fc6c86c813da260ef3");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95d02a49d73e9209c6ee9269a1f32976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95d02a49d73e9209c6ee9269a1f32976");
        } else if (this.e != null) {
            List<CashierPayment> paymentDataList = this.e.getPaymentDataList();
            if (!com.meituan.android.paybase.utils.i.a((Collection) paymentDataList)) {
                for (int i = 0; i < paymentDataList.size(); i++) {
                    if (paymentDataList.get(i) == this.d) {
                        this.k = i;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ccc16638ad06f0cdba1c00c74121518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ccc16638ad06f0cdba1c00c74121518");
            return;
        }
        com.meituan.android.elderly.utils.a.a(getClass().getName(), " onStart", r());
        super.onStart();
        x();
        q.a("c_PJmoK", "b_SsoHH", "POP", null, r());
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b05ff212516af9cfa22aabaa4f198be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b05ff212516af9cfa22aabaa4f198be");
            return;
        }
        com.meituan.android.elderly.utils.a.a(getClass().getName(), " onResume", r());
        if (!y()) {
            this.h = true;
        }
        if (this.c != null) {
            ElderlyCashier elderlyCashier = this.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = ElderlyCashier.a;
            if (PatchProxy.isSupport(objArr2, elderlyCashier, changeQuickRedirect2, false, "d31ec2196e131f08644564452bd397e2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, elderlyCashier, changeQuickRedirect2, false, "d31ec2196e131f08644564452bd397e2");
            } else if (elderlyCashier.g) {
                elderlyCashier.g = false;
                if (elderlyCashier.e != null) {
                    elderlyCashier.e.a(elderlyCashier.c.getString(R.string.cashierelderly__third_pay_result), elderlyCashier.j);
                }
            }
        }
        super.onResume();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1cdb61cd3ed06a6f3061658328d355d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1cdb61cd3ed06a6f3061658328d355d");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a(this.x, "c_PJmoK");
        com.meituan.android.paybase.common.analyse.a.a(this.x, "c_PJmoK", e());
    }

    public final void a(String str, String str2, Cashier cashier, String str3, String str4) {
        Object[] objArr = {str, str2, cashier, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7145cf79b3d3bdbcea9e95ef281f397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7145cf79b3d3bdbcea9e95ef281f397");
            return;
        }
        b();
        if (!TextUtils.isEmpty(str3)) {
            this.i = str3;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && cashier != null) {
            this.f = str;
            this.g = str2;
            this.e = cashier;
            this.j = str4;
            if (getActivity() instanceof PayBaseActivity) {
                ((PayBaseActivity) getActivity()).hideProgress();
                PayBaseActivity.o();
            }
            if (getView() != null) {
                i();
                com.meituan.android.elderly.utils.a.a(getClass().getName(), " init_start", r());
                this.l = (ProgressButton) getView().findViewById(R.id.btn_cashier_elderly_pay_confirm);
                if (this.o) {
                    this.o = false;
                    if (this.c != null) {
                        this.c.a(true, (Map<String, Object>) null);
                        com.meituan.android.elderly.utils.a.a(r(), this.c.i);
                        com.meituan.android.elderly.utils.a.c(r());
                    }
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_dispatch_cashier", 200);
                    if (this.h) {
                        this.h = false;
                        c();
                    }
                }
                getView().setVisibility(0);
                getView().getViewTreeObserver().addOnGlobalLayoutListener(this);
                l();
                new Handler().post(com.meituan.android.elderly.fragment.a.a(this));
                m();
                o();
                x();
                com.meituan.android.elderly.utils.a.a("", "end", r());
                return;
            }
            com.meituan.android.paybase.common.analyse.cat.a.a("elderlyCashierShowError", com.meituan.android.paycommon.lib.config.a.a().a.getString(R.string.cashierelderly__show_error));
            return;
        }
        if (getView() != null) {
            getView().setVisibility(4);
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("elderlyCashierShowError", getString(R.string.cashierelderly__show_error));
        }
        k();
    }

    public static /* synthetic */ void b(MTElderlyCashierFragment mTElderlyCashierFragment) {
        Object[] objArr = {mTElderlyCashierFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a80b670416a67cb2b747506022f304e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a80b670416a67cb2b747506022f304e");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, mTElderlyCashierFragment, changeQuickRedirect2, false, "ed096d3888c0367441e92a9940600db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mTElderlyCashierFragment, changeQuickRedirect2, false, "ed096d3888c0367441e92a9940600db0");
        } else if (mTElderlyCashierFragment.getView() != null) {
            mTElderlyCashierFragment.l = (ProgressButton) mTElderlyCashierFragment.getView().findViewById(R.id.btn_cashier_elderly_pay_confirm);
            mTElderlyCashierFragment.l.setOnClickListener(new g() { // from class: com.meituan.android.elderly.fragment.MTElderlyCashierFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.widgets.g
                public final void a(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e8a53d88ad6fce410e604000d20a033", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e8a53d88ad6fce410e604000d20a033");
                    } else {
                        MTElderlyCashierFragment.a(MTElderlyCashierFragment.this, MTElderlyCashierFragment.this.d);
                    }
                }
            }.a(1000L));
            mTElderlyCashierFragment.getView().findViewById(R.id.view_bottom_blank).setOnClickListener(new g() { // from class: com.meituan.android.elderly.fragment.MTElderlyCashierFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.widgets.g
                public final void a(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e51e4394d6041739c63fe8c43437982c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e51e4394d6041739c63fe8c43437982c");
                    } else {
                        MTElderlyCashierFragment.a(MTElderlyCashierFragment.this, MTElderlyCashierFragment.this.d);
                    }
                }
            }.a(1000L));
            int a2 = u.a(e.a.CASHIER__SUBBTN_BG);
            if (a2 >= 0) {
                mTElderlyCashierFragment.l.setBackgroundResource(a2);
            }
            int a3 = u.a(e.a.CASHIER__SUBBTN_TEXT_COLOR);
            if (a3 >= 0) {
                mTElderlyCashierFragment.l.setTextColor(mTElderlyCashierFragment.getResources().getColor(a3));
            }
        }
    }

    @Nullable
    private d f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533dfd635c4994bdce499f4e28596566", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533dfd635c4994bdce499f4e28596566");
        }
        List<CashierPayment> paymentDataList = this.e.getPaymentDataList();
        if (com.meituan.android.paybase.utils.i.a((Collection) paymentDataList)) {
            return null;
        }
        for (int i = 0; i < paymentDataList.size(); i++) {
            CashierPayment cashierPayment = paymentDataList.get(i);
            if (cashierPayment.isSelected()) {
                d a2 = com.meituan.android.pay.desk.pack.u.a().a(cashierPayment);
                if (a2 != null) {
                    return a2;
                }
            } else if (cashierPayment.isSelected()) {
                return cashierPayment;
            }
        }
        return null;
    }

    @Nullable
    private d g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fb7ff74f66bf457143c3949c24f0370", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fb7ff74f66bf457143c3949c24f0370");
        }
        if (this.e != null) {
            List<CashierPayment> paymentDataList = this.e.getPaymentDataList();
            if (com.meituan.android.paybase.utils.i.a((Collection) paymentDataList) || this.k < 0 || this.k >= paymentDataList.size()) {
                return null;
            }
            return paymentDataList.get(this.k);
        }
        return null;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98165312cc1216b393fd2e15abbf1a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98165312cc1216b393fd2e15abbf1a89");
            return;
        }
        this.d = g();
        if (this.d == null) {
            this.d = f();
        }
        if (this.d == null) {
            com.meituan.android.paybase.common.analyse.cat.a.a("noDefaultPayType", getString(R.string.cashierelderly__no_default_pay_type));
            q.a("paybiz_elderly_cashier_no_selected_payment", (Map<String, Object>) null, (List<Float>) null, r());
            this.d = j();
        }
        if (this.d != null) {
            HashMap<String, Object> hashMap = new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", this.f).a("merchant_no", this.i).a("default_pay_type", this.d.getPayType()).a("sub_type", "1").b;
            q.a("b_pay_ddse35tm_mv", hashMap, r());
            q.a("c_PJmoK", "b_pay_6wu70o9w_mv", "收银台默选的支付方式上报", hashMap, ae.a.VIEW, r());
        }
    }

    private d j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c60f8c154368326bcb150eb90561010", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c60f8c154368326bcb150eb90561010");
        }
        List<CashierPayment> paymentDataList = this.e.getPaymentDataList();
        if (com.meituan.android.paybase.utils.i.a((Collection) paymentDataList) || paymentDataList.size() <= 0) {
            return null;
        }
        return paymentDataList.get(0);
    }

    private void k() {
        ActionBar supportActionBar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d56683c604a357005b9d01190489f9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d56683c604a357005b9d01190489f9c");
        } else if (getActivity() == null || (supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar()) == null) {
        } else {
            supportActionBar.c();
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed4b80dfcb9d1691f7e584678f49b1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed4b80dfcb9d1691f7e584678f49b1c");
        } else if (getActivity() == null) {
        } else {
            ActionBar supportActionBar = ((BaseActivity) getActivity()).getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.b();
            }
            ((MTCashierActivity) getActivity()).b(R.string.cashiercommon__payinfo_title);
            ((MTCashierActivity) getActivity()).a(17.0f);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dce6ba150eaacf125ab5d32d582c54c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dce6ba150eaacf125ab5d32d582c54c");
            return;
        }
        a(this.e.getExpireTime(), this.e.getCurrentTime());
        n();
    }

    private void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab338d778fd877e99add9d61a39a8a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab338d778fd877e99add9d61a39a8a9");
        } else if (getView() == null) {
        } else {
            FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.layout_cashier_elderly_remaining_time);
            if (i <= 0) {
                frameLayout.setVisibility(8);
                return;
            }
            com.meituan.android.elderly.view.revision.e eVar = new com.meituan.android.elderly.view.revision.e(getContext());
            frameLayout.addView(eVar);
            if (this.b == null) {
                long j = i - i2;
                if (j <= 0) {
                    if (this.c != null) {
                        this.c.a();
                        return;
                    }
                    return;
                }
                this.b = new i<>(eVar, 1000 * j, 1000L, b.a(this));
                this.b.start();
            }
        }
    }

    public static /* synthetic */ void a(MTElderlyCashierFragment mTElderlyCashierFragment) {
        Object[] objArr = {mTElderlyCashierFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "312594bfcb5e667cd5fa37ff04b08d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "312594bfcb5e667cd5fa37ff04b08d5e");
            return;
        }
        mTElderlyCashierFragment.b.cancel();
        mTElderlyCashierFragment.b = null;
        if (mTElderlyCashierFragment.c != null) {
            mTElderlyCashierFragment.c.a();
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a1bccb3ceeae9f7ee714f3d3b3d181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a1bccb3ceeae9f7ee714f3d3b3d181");
        } else if (getView() == null) {
        } else {
            com.meituan.android.elderly.view.revision.a aVar = new com.meituan.android.elderly.view.revision.a(getContext());
            aVar.a(this.e);
            ((LinearLayout) getView().findViewById(R.id.layout_cashier_elderly_business_info)).addView(aVar);
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddff1ec2d6d6317e6760b44bd99be150", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddff1ec2d6d6317e6760b44bd99be150");
        } else if (getView() == null) {
        } else {
            ((ElderlyCashierScrollView) getView().findViewById(R.id.cashier_scroll_layout)).setScrollable(true);
            p();
        }
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f4cf20f87695a1dc0f46371780df8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f4cf20f87695a1dc0f46371780df8c");
        } else if (getView() == null || this.e == null) {
        } else {
            if (this.p == null) {
                this.p = (ElderlyCashierPaymentAreaView) getView().findViewById(R.id.cashier__pay_type);
                this.p.setOnThirdPaymentClickListener(c.a(this));
            }
            this.p.a(this.e.getPaymentDataList());
        }
    }

    public final void a(HashMap<String, String> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b6e179dda1b132fb5256f3899ef7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b6e179dda1b132fb5256f3899ef7b8");
        } else {
            ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 1)).startDirectPay(hashMap, com.meituan.android.paycommon.lib.config.a.a().o(), this.j == null ? "" : this.j, t(), "", "", "1", z(), s(), q());
        }
    }

    private HashMap<String, String> q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5aaccb91a305e3f851c967c185f717a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5aaccb91a305e3f851c967c185f717a");
        }
        b();
        if (this.c == null) {
            return new HashMap<>();
        }
        return this.c.j;
    }

    private String s() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "597f8759cf7603afd142bb5ca4a6f7a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "597f8759cf7603afd142bb5ca4a6f7a6");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccd5e510917f25b2adec35ad4d1365af", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccd5e510917f25b2adec35ad4d1365af");
            } else {
                b();
                str = this.c != null ? this.c.h : "";
            }
            jSONObject.put("outer_business_statics", str);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTElderlyCashierFragment_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    private String t() {
        String str;
        JSONObject jSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "146c215294653b1320de0f0ebb38aeca", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "146c215294653b1320de0f0ebb38aeca");
        }
        if (this.c == null) {
            return "";
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7857f83a7ccdae0e8335e1bc429ee24", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7857f83a7ccdae0e8335e1bc429ee24");
        } else {
            str = this.c == null ? "" : this.c.d;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61861b56428830946a495bb5cd0519dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61861b56428830946a495bb5cd0519dd");
        } else if (this.c != null) {
            this.c.onRequestSucc(i, obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "273262569bfd28a3ac53f28231edeae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "273262569bfd28a3ac53f28231edeae6");
        } else if (this.c != null) {
            this.c.onRequestException(i, exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0283b0d916b9449b5bcaa5840542d7c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0283b0d916b9449b5bcaa5840542d7c4");
            return;
        }
        if (this.l.b) {
            this.l.b();
        }
        hideProgress();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4211ef5a3dcbf30d296762cb8b5a306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4211ef5a3dcbf30d296762cb8b5a306");
        } else if (1 == i) {
            if (getActivity() != null) {
                ((MTCashierActivity) getActivity()).c = null;
            }
            if (getActivity() == null || getActivity().isFinishing()) {
                return;
            }
            com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
            if ((z.a() && cVar != null && cVar.h) || this.l == null) {
                return;
            }
            this.l.a();
        } else {
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c28e8bb01924d3aa40a9bb33c7e1f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c28e8bb01924d3aa40a9bb33c7e1f8c");
        } else if (getView() != null) {
            ((ScrollView) getView().findViewById(R.id.cashier_scroll_layout)).setOnTouchListener(new a());
            if (Build.VERSION.SDK_INT >= 16) {
                getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            } else {
                getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a75c6d5e0c3fab7e77dccaf48cb2360", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a75c6d5e0c3fab7e77dccaf48cb2360");
                return;
            }
            this.b = 0;
            this.c = false;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object[] objArr = {view, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa62d7ad7cc7a007ff9a6547c48fee8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa62d7ad7cc7a007ff9a6547c48fee8")).booleanValue();
            }
            if (view instanceof ScrollView) {
                switch (motionEvent.getAction()) {
                    case 0:
                        this.b = view.getScrollY();
                        break;
                    case 1:
                        if (this.c) {
                            com.meituan.android.paybase.common.analyse.a.a("b_bWJBC", "滑动展示支付方式", new a.c().a("IS_BOTTOM", "TRUE").b, a.EnumC0329a.VIEW, -1);
                            this.c = false;
                            break;
                        }
                        break;
                    case 2:
                        if (!this.c && view.getScrollY() != this.b) {
                            this.c = true;
                            break;
                        }
                        break;
                }
            }
            return false;
        }
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1063de00c31f748249aa07337af4f44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1063de00c31f748249aa07337af4f44e");
        } else if (isAdded() && getView() != null && this.p != null) {
            ElderlyCashierPaymentAreaView elderlyCashierPaymentAreaView = this.p;
            d dVar = this.d;
            Cashier cashier = this.e;
            Object[] objArr2 = {dVar, cashier};
            ChangeQuickRedirect changeQuickRedirect2 = ElderlyCashierPaymentAreaView.a;
            if (PatchProxy.isSupport(objArr2, elderlyCashierPaymentAreaView, changeQuickRedirect2, false, "530d8f35ce5e887626a2e37435349042", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, elderlyCashierPaymentAreaView, changeQuickRedirect2, false, "530d8f35ce5e887626a2e37435349042");
                return;
            }
            for (int i = 0; i < elderlyCashierPaymentAreaView.getChildCount(); i++) {
                elderlyCashierPaymentAreaView.a(dVar, (ViewGroup) elderlyCashierPaymentAreaView.getChildAt(i), cashier);
            }
        }
    }

    private void v() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4125d69437ffe12a9746a19d2a844bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4125d69437ffe12a9746a19d2a844bcc");
        } else if (getView() == null) {
        } else {
            Button button = (Button) getView().findViewById(R.id.btn_cashier_elderly_pay_confirm);
            if (this.d != null && !com.meituan.android.pay.common.payment.utils.d.a(this.d.getStatus())) {
                z = true;
            }
            button.setEnabled(z);
            button.setText(getString(R.string.cashierelderly__pay_confirm));
        }
    }

    private void w() {
        BigDecimal valueOf;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799b1932e5183d58e859088f24b40e13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799b1932e5183d58e859088f24b40e13");
        } else if (isAdded() && getView() != null) {
            LinearLayout linearLayout = (LinearLayout) getView().findViewById(R.id.layout_cashier_elderly_business_info);
            for (int i = 0; i < linearLayout.getChildCount(); i++) {
                if (linearLayout.getChildAt(i) instanceof com.meituan.android.elderly.view.revision.g) {
                    com.meituan.android.elderly.view.revision.g gVar = (com.meituan.android.elderly.view.revision.g) linearLayout.getChildAt(i);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f89d7c7850fe159b0b769c1b2a07543c", RobustBitConfig.DEFAULT_VALUE)) {
                        valueOf = (BigDecimal) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f89d7c7850fe159b0b769c1b2a07543c");
                    } else {
                        valueOf = BigDecimal.valueOf(this.e != null ? this.e.getTotalFee() : 0.0d);
                        if (com.meituan.android.paybase.utils.d.c((Number) valueOf, (Number) 0) <= 0) {
                            valueOf = BigDecimal.valueOf(0.01d);
                        }
                    }
                    gVar.a(valueOf.floatValue());
                }
            }
        }
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efef377c315256a004f158e38272ac1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efef377c315256a004f158e38272ac1a");
            return;
        }
        u();
        v();
        w();
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "067124df6352d2059cbed79c3f367243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "067124df6352d2059cbed79c3f367243");
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb0090a9a038fbe7120fdc16909685d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb0090a9a038fbe7120fdc16909685d");
            return;
        }
        if (this.b != null) {
            this.b.cancel();
            this.b = null;
        }
        this.c = null;
        com.meituan.android.pay.desk.pack.u.a().b();
        super.onDetach();
    }

    private boolean y() {
        return this.e != null;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb1f07b6bd32e9a81a2aec077eb39fa", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb1f07b6bd32e9a81a2aec077eb39fa");
        }
        HashMap<String, Object> e = super.e();
        if (y()) {
            if (this.n == null) {
                this.n = new HashMap();
                this.n.put("platform", "android");
                this.n.put("nb_version", com.meituan.android.paybase.config.a.d().q());
                if (!TextUtils.isEmpty(this.e.getTradeNo())) {
                    this.n.put("tradeNo", this.e.getTradeNo());
                }
                if (!TextUtils.isEmpty(this.i)) {
                    this.n.put("merchant_no", this.i);
                }
                this.n.put("sub_type", "1");
                if (this.d != null) {
                    this.n.put("payType", this.d.getPayType());
                    this.n.put("default_sub_pay_type", this.d.getPayType());
                    if (!com.meituan.android.paybase.utils.i.a((Collection) this.d.getRightLabels()) && this.d.getRightLabels().get(0) != null) {
                        this.n.put("recommendStyle", Integer.valueOf(this.d.getRightLabels().get(0).getStyle()));
                    }
                    if (!com.meituan.android.paybase.utils.i.a((Collection) this.d.getBottomLabels())) {
                        this.n.put("mtBottomLabel", Boolean.TRUE);
                    } else {
                        this.n.put("mtBottomLabel", Boolean.FALSE);
                    }
                } else {
                    this.n.put("payType", "");
                }
            }
            e.putAll(this.n);
            return e;
        }
        return e;
    }

    private String z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbf280a276c546e5614aed0b971bd66d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbf280a276c546e5614aed0b971bd66d");
        }
        b();
        return this.c != null ? this.c.b : "";
    }

    public static /* synthetic */ void b(MTElderlyCashierFragment mTElderlyCashierFragment, d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mTElderlyCashierFragment, changeQuickRedirect, false, "17566f9d1a630d9098c081bb2ffe8815", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mTElderlyCashierFragment, changeQuickRedirect, false, "17566f9d1a630d9098c081bb2ffe8815");
        } else if (dVar != null) {
            Map<String, Object> a2 = com.meituan.android.elderly.utils.a.a(dVar);
            a2.put("merchant_no", mTElderlyCashierFragment.i);
            com.meituan.android.paybase.common.analyse.a.a("b_6u1yatb7", mTElderlyCashierFragment.getString(R.string.cashierelderly__mge_act_click_pay_type), a2, a.EnumC0329a.CLICK, -1);
            if (dVar != mTElderlyCashierFragment.d) {
                Object[] objArr2 = {dVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, mTElderlyCashierFragment, changeQuickRedirect2, false, "616f0355abe22d55f7a9b93788152641", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mTElderlyCashierFragment, changeQuickRedirect2, false, "616f0355abe22d55f7a9b93788152641");
                    return;
                }
                q.a("c_PJmoK", "b_0G11Q", "切换支付方式", new a.b().a().a("merchant_no", mTElderlyCashierFragment.i).a("pay_type", dVar.getPayType()).a("sub_type", "1").a("status", String.valueOf(dVar.getStatus())).b, ae.a.CLICK, mTElderlyCashierFragment.r());
                mTElderlyCashierFragment.d = dVar;
                mTElderlyCashierFragment.x();
            }
        }
    }
}
