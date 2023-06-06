package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.utils.a;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.pay.model.PayErrorCode;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paybase.fingerprint.bean.PasswordVerify;
import com.meituan.android.paycommon.lib.DetainmentDialogInfo;
import com.meituan.android.paycommon.lib.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HelloPayVerifyFragment extends PayBaseFragment implements SelectBankDialog.b, com.meituan.android.pay.desk.pack.a, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private FrameLayout b;
    private HashMap<String, String> c;
    private int d;
    private com.meituan.android.pay.desk.pack.c e;
    private DeskData f;
    private String g;
    private HashMap<String, String> h;

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final String d() {
        return "c_3qbde89q";
    }

    public HelloPayVerifyFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "791c3478aec7fd99e06314f95faf7d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "791c3478aec7fd99e06314f95faf7d34");
        } else {
            this.c = new HashMap<>();
        }
    }

    public static HelloPayVerifyFragment a(DeskData deskData, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        Object[] objArr = {deskData, hashMap, hashMap2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "90ebd3c9c92a1cbf6a10a635b2d0ee08", RobustBitConfig.DEFAULT_VALUE)) {
            return (HelloPayVerifyFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "90ebd3c9c92a1cbf6a10a635b2d0ee08");
        }
        HelloPayVerifyFragment helloPayVerifyFragment = new HelloPayVerifyFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("cashdesk", deskData);
        bundle.putSerializable("extend_transmission_params", hashMap2);
        if (hashMap != null) {
            bundle.putSerializable("extra_params", hashMap);
        }
        helloPayVerifyFragment.setArguments(bundle);
        return helloPayVerifyFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3b9dee72a36dd01be6f6d7850b314cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3b9dee72a36dd01be6f6d7850b314cf");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f = (DeskData) com.sankuai.waimai.platform.utils.f.a(getArguments(), "cashdesk");
            Serializable a2 = com.sankuai.waimai.platform.utils.f.a(getArguments(), "extend_transmission_params");
            if (a2 instanceof HashMap) {
                this.h = (HashMap) a2;
            }
            HashMap hashMap = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "extra_params");
            if (hashMap != null) {
                this.c.putAll(hashMap);
            }
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430f62a2c5669b99df5a983daadedcab", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430f62a2c5669b99df5a983daadedcab") : layoutInflater.inflate(R.layout.mpay__hellopay_verify_dialog, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        String pageTitle;
        boolean z;
        String string;
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845a2f42b617f12d2d6523c1ad5853c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845a2f42b617f12d2d6523c1ad5853c0");
            return;
        }
        super.onViewCreated(view, bundle);
        int i = com.meituan.android.pay.desk.component.data.a.i(k());
        com.meituan.android.pay.desk.component.analyse.a.a(getActivity(), i, r());
        view.findViewById(R.id.dialog_close).setOnClickListener(c.a(this, i));
        this.b = (FrameLayout) view.findViewById(R.id.hellopay_verify_layout);
        this.e = new com.meituan.android.pay.desk.pack.c();
        this.e.b = this;
        ((LinearLayout) view.findViewById(R.id.desk_core_view)).addView(this.e.a(this, this.f, this.h));
        if (this.c == null) {
            this.c = new HashMap<>();
        }
        if (k() != null) {
            a("b_pay_bp74ya6f_mc");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f83f4e152c588c6646a46b4b70119775", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f83f4e152c588c6646a46b4b70119775");
            } else if (getView() != null && k() != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "60375c5f09411c01094e7a878f781b55", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "60375c5f09411c01094e7a878f781b55");
                } else if (getView() != null) {
                    com.meituan.android.pay.common.payment.data.c k = k();
                    Object[] objArr4 = {k};
                    ChangeQuickRedirect changeQuickRedirect4 = com.meituan.android.pay.desk.component.data.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ef80b857ffe57d8e6a1992c3a78c5902", RobustBitConfig.DEFAULT_VALUE)) {
                        pageTitle = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ef80b857ffe57d8e6a1992c3a78c5902");
                    } else {
                        pageTitle = k instanceof CashDesk ? ((CashDesk) k).getPageTitle() : "";
                    }
                    if (!TextUtils.isEmpty(pageTitle)) {
                        ((TextView) getView().findViewById(R.id.dialog_title)).setText(pageTitle);
                    }
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "cfc9241ee6e85d5f0cd379a0f5c55534", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "cfc9241ee6e85d5f0cd379a0f5c55534");
                } else if (getView() != null && k() != null) {
                    int i2 = com.meituan.android.pay.desk.component.data.a.i(k());
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cbd64dac3e27f9f4e293d649c6556568", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cbd64dac3e27f9f4e293d649c6556568")).booleanValue();
                    } else {
                        if (k() != null) {
                            int i3 = com.meituan.android.pay.desk.component.data.a.i(k());
                            PasswordVerify h = com.meituan.android.pay.desk.component.data.a.h(k());
                            if (i3 == 2 && h != null && !TextUtils.isEmpty(h.getEntryText())) {
                                z = true;
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "949a1b8d40cfb7b0e989e0efd54da1f0", RobustBitConfig.DEFAULT_VALUE)) {
                            string = (String) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "949a1b8d40cfb7b0e989e0efd54da1f0");
                        } else {
                            PasswordVerify h2 = com.meituan.android.pay.desk.component.data.a.h(k());
                            if (h2 != null) {
                                string = h2.getEntryText();
                            } else {
                                string = getString(R.string.mpay__use_psw);
                            }
                        }
                        ((TextView) getView().findViewById(R.id.use_psw)).setText(string);
                        getView().findViewById(R.id.use_psw).setVisibility(0);
                        getView().findViewById(R.id.use_psw).setOnClickListener(d.a(this, i2));
                    }
                }
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "07f0f5e7ef70e0ed3700d68c7e26e37f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "07f0f5e7ef70e0ed3700d68c7e26e37f");
                } else if (getView() != null && (k() != null || l() != null)) {
                    Button button = (Button) getView().findViewById(R.id.submit_button);
                    com.meituan.android.paycommon.lib.utils.u.a(getContext(), button);
                    button.setText(com.meituan.android.pay.desk.component.data.a.k(k()));
                    button.setOnClickListener(e.a(this));
                }
            }
            a(this.f);
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_gj0fnvl5_mc", (Map<String, Object>) null);
    }

    public static /* synthetic */ void b(HelloPayVerifyFragment helloPayVerifyFragment, int i, View view) {
        Object[] objArr = {helloPayVerifyFragment, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff535b744d3f5b04fe1ffae435b616d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff535b744d3f5b04fe1ffae435b616d5");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_59mweqfg", helloPayVerifyFragment.getString(R.string.mpay__click_close_btn), helloPayVerifyFragment.a(new a.c().b), a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_b1kv2eu4", (Map<String, Object>) null);
        if (helloPayVerifyFragment.k() != null) {
            a.c cVar = new a.c();
            if (i == 0) {
                i = -999;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_pay_ph29n29t_mc", cVar.a("verify_type", Integer.valueOf(i)).b);
        }
        if (helloPayVerifyFragment.j()) {
            return;
        }
        PayActivity.b(helloPayVerifyFragment.getActivity(), helloPayVerifyFragment.getString(R.string.mpay__cancel_msg4), PayErrorCode.HELLO_PAY_DIALOG_CANCEL);
        helloPayVerifyFragment.i();
    }

    private HashMap<String, Object> a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b519d1d4697f52916df026aed7ed424", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b519d1d4697f52916df026aed7ed424");
        }
        hashMap.put("cc_pay_type", com.meituan.android.pay.desk.component.analyse.a.a(getActivity()));
        hashMap.put("cc_verify_type", Integer.valueOf(com.meituan.android.pay.desk.component.data.a.i(k())));
        return hashMap;
    }

    public static /* synthetic */ void a(HelloPayVerifyFragment helloPayVerifyFragment, int i, View view) {
        Object[] objArr = {helloPayVerifyFragment, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad87ea65ca31610a1ee91986156d9889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad87ea65ca31610a1ee91986156d9889");
            return;
        }
        helloPayVerifyFragment.a(helloPayVerifyFragment.k(), helloPayVerifyFragment.l());
        com.meituan.android.pay.common.payment.utils.b.a(helloPayVerifyFragment.getActivity(), "verify_type", "1");
        com.meituan.android.pay.desk.component.data.a.g(helloPayVerifyFragment.k());
        com.meituan.android.paybase.common.analyse.a.a("b_meuu0ldq", (Map<String, Object>) null);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_y1azohzx_mc", new a.c().a("verify_type", Integer.valueOf(i)).b);
        helloPayVerifyFragment.c();
        helloPayVerifyFragment.i();
    }

    public static /* synthetic */ void a(HelloPayVerifyFragment helloPayVerifyFragment, View view) {
        String string;
        boolean z = false;
        Object[] objArr = {helloPayVerifyFragment, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2397514e54700d90d81470f175ca2f7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2397514e54700d90d81470f175ca2f7c");
            return;
        }
        com.meituan.android.pay.common.selectdialog.b f = com.meituan.android.pay.desk.component.data.a.f(helloPayVerifyFragment.k());
        if (f != null && com.meituan.android.pay.common.payment.utils.d.c(f)) {
            com.meituan.android.pay.common.payment.data.a e = com.meituan.android.pay.common.payment.utils.d.e(f);
            if (e != null && !TextUtils.isEmpty(e.getSubmitUrl())) {
                helloPayVerifyFragment.b(e);
                str = helloPayVerifyFragment.getString(R.string.mpay__verify_type_new_card);
            }
        } else {
            helloPayVerifyFragment.a(helloPayVerifyFragment.k(), helloPayVerifyFragment.l());
            helloPayVerifyFragment.c();
            helloPayVerifyFragment.i();
            if (2 == com.meituan.android.pay.desk.component.data.a.i(helloPayVerifyFragment.k())) {
                string = helloPayVerifyFragment.getString(R.string.mpay__verify_type_fingerprint);
            } else {
                com.meituan.android.pay.common.payment.data.c k = helloPayVerifyFragment.k();
                Object[] objArr2 = {k};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.pay.desk.component.data.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e2a3c6c3139f0d22f671c5708f4c59e2", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e2a3c6c3139f0d22f671c5708f4c59e2")).booleanValue();
                } else if (k instanceof CashDesk) {
                    z = ((CashDesk) k).isCanUseNoPwdPay();
                }
                if (z) {
                    string = helloPayVerifyFragment.getString(R.string.mpay__verify_type_no_password);
                } else {
                    string = helloPayVerifyFragment.getString(R.string.mpay__verify_type_password);
                }
            }
            str = string;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_x4al482f", helloPayVerifyFragment.getString(R.string.mpay__click_confirm_btn), helloPayVerifyFragment.a(new a.c().b), a.EnumC0329a.CLICK, -1);
        com.meituan.android.paybase.common.analyse.a.a("b_3moc2t0t", new a.c().a("verify_type", str).b);
    }

    private void b(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bc5c730fcc8c0c411ba6bb87c92caa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bc5c730fcc8c0c411ba6bb87c92caa1");
            return;
        }
        com.meituan.android.pay.common.payment.utils.b.a(getActivity(), "verify_type", "0");
        a(k(), aVar);
        this.g = aVar.getSubmitUrl();
        com.meituan.android.pay.analyse.a.a(this.g, (Map<String, Object>) null, r());
        if (com.meituan.android.pay.process.g.e(getActivity()) != null) {
            com.meituan.android.pay.process.g.a(getActivity(), 1180101);
        } else {
            PayActivity.a(getActivity(), aVar.getSubmitUrl(), this.c, (HashMap<String, String>) null, 999, this);
        }
        com.meituan.android.paybase.common.analyse.a.a("b_kx2q9bxa", new a.c().a(KnbConstants.PARAMS_SCENE, getString(R.string.mpay__request_scene_hello_pay)).b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93987aa58b8c16ccfd7b05811d72babe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93987aa58b8c16ccfd7b05811d72babe");
        } else if (getView() != null) {
            getView().setVisibility(4);
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ede0836a1fec7f5155e52fdc171d56f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ede0836a1fec7f5155e52fdc171d56f");
            return;
        }
        com.meituan.android.pay.process.ntv.pay.m.a().b = com.meituan.android.pay.process.ntv.pay.l.a(getActivity(), this.f);
        com.meituan.android.pay.process.ntv.pay.m.a().b();
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        DetainmentDialogInfo m;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07e4379d2113ae787dd519e0a2aad42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07e4379d2113ae787dd519e0a2aad42");
        } else if (isAdded()) {
            if (com.meituan.android.pay.common.payment.utils.c.h(aVar.getPayType()) && !com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                if (TextUtils.isEmpty(aVar.getSubmitUrl())) {
                    com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "支付组件选择银行卡弹窗外卡支付链接为空");
                } else {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ead47b2b29fa2b58885ceb28a96f8b79", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ead47b2b29fa2b58885ceb28a96f8b79");
                    } else if (aVar != null && !TextUtils.isEmpty(aVar.getSubmitUrl())) {
                        com.meituan.android.pay.utils.e.a(getActivity(), k(), aVar);
                        com.meituan.android.pay.process.g.a(getActivity(), aVar.getSubmitUrl());
                    }
                }
                f();
            } else if ((TextUtils.equals("cardpay", aVar.getPayType()) || TextUtils.equals("bankselectpay", aVar.getPayType()) || TextUtils.equals("signedunbindpay", aVar.getPayType())) && !com.meituan.android.pay.common.payment.utils.d.a(aVar)) {
                b(aVar);
                f();
            } else {
                if (com.meituan.android.pay.common.payment.utils.c.k(aVar.getPayType()) && (m = m()) != null) {
                    if (aVar.getLabels() != null) {
                        m.setMarketingPayment(aVar.getLabels().size() > 0);
                    } else {
                        m.setMarketingPayment(false);
                    }
                }
                c(aVar);
                a("b_pay_ral89561_mc");
                g();
                SelectBankDialogFragment.a(this.x, "c_3qbde89q", (Map<String, Object>) e(), true);
            }
        }
    }

    private void a(com.meituan.android.pay.common.payment.data.c cVar, com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {cVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77710091148e6b0dc4ed137caed16c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77710091148e6b0dc4ed137caed16c7");
        } else if (cVar != null) {
            com.meituan.android.pay.utils.e.a(getActivity(), cVar);
            if (!com.meituan.android.paybase.utils.i.a((Collection) com.meituan.android.pay.desk.component.data.a.c(cVar))) {
                com.meituan.android.pay.utils.e.a(getActivity(), cVar, com.meituan.android.pay.desk.component.discount.a.a(cVar));
            } else {
                com.meituan.android.pay.utils.e.a(getActivity(), cVar, aVar);
            }
        }
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7be95880a86da3892cc9338e8ec0dfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7be95880a86da3892cc9338e8ec0dfd");
            return;
        }
        a("b_pay_v35xyp4w_mc");
        c(l());
        g();
        SelectBankDialogFragment.a(this.x, "c_3qbde89q", (Map<String, Object>) e(), true);
    }

    private void c(com.meituan.android.pay.common.payment.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0a7da6a1e675e06ae42fc0f06b1419", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0a7da6a1e675e06ae42fc0f06b1419");
        } else if (this.e == null || this.f == null) {
        } else {
            this.f.setSelectPayment(aVar);
            this.e.a(this, this.f, this.h);
            a(this.f);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a50205ba740cc1d5d1e31aacf7eec0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a50205ba740cc1d5d1e31aacf7eec0c");
        } else {
            super.onDetach();
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee33e412b642d96ea63d0cba9b15c951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee33e412b642d96ea63d0cba9b15c951");
        } else if (getView() != null) {
            getView().findViewById(R.id.hellopay_verify_container).setVisibility(4);
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60771ffa7076ac8146dae52b2c97f745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60771ffa7076ac8146dae52b2c97f745");
        } else if (getView() != null) {
            getView().findViewById(R.id.hellopay_verify_container).setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5208eb51e03b4aebf5bff1c8f671a194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5208eb51e03b4aebf5bff1c8f671a194");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a((String) null, "c_3qbde89q", a(super.e()));
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8723d3ab9454ddfd549c559b17487ead", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8723d3ab9454ddfd549c559b17487ead");
        } else {
            HashMap<String, Object> hashMap = new a.c().b;
            hashMap.put("change_tab_times", Integer.valueOf(this.d));
            if (l() != null) {
                hashMap.put("cc_pay_type", l().getPayType());
            }
            com.meituan.android.paybase.common.analyse.a.a("b_oxe4mbnz", getString(R.string.mpay__hello_pay_select_bank_dialog), hashMap, a.EnumC0329a.CLICK, -1);
        }
        com.meituan.android.paycommon.lib.utils.h.b(getActivity(), this);
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff78fbaa4916ce2a3a18034c16d19760", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff78fbaa4916ce2a3a18034c16d19760");
        }
        HashMap<String, Object> e = super.e();
        if (!TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b)) {
            e.put("transid", com.meituan.android.paybase.common.analyse.b.b);
        }
        e.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
        e.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        e.put("pay_type", com.meituan.android.pay.desk.component.analyse.a.a(getActivity()));
        e.put("verify_type", Integer.valueOf(com.meituan.android.pay.desk.component.data.a.i(k())));
        e.put("userid", com.meituan.android.paybase.config.a.d().i());
        return e;
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f89ce54aa2e45cc158fadfe9811bad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f89ce54aa2e45cc158fadfe9811bad")).booleanValue();
        }
        com.meituan.android.paybase.common.analyse.a.a("b_b1kv2eu4", (Map<String, Object>) null);
        if (j()) {
            return true;
        }
        return super.h();
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c86ce1cd10e5da05521cd6f43e2aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c86ce1cd10e5da05521cd6f43e2aa6");
            return;
        }
        com.meituan.android.pay.common.payment.data.c k = k();
        com.meituan.android.pay.common.payment.data.a l = l();
        if (k != null) {
            int i = com.meituan.android.pay.desk.component.data.a.i(k);
            com.meituan.android.paybase.common.analyse.a.a(str, new a.c().a("verify_type", i != 0 ? String.valueOf(i) : "-999").a("bankcardID", (l == null || l.getCardInfo() == null || l.getCardInfo().getBankCard() == null) ? "-999" : l.getCardInfo().getBankCard()).a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type") : "-999").a(KnbConstants.PARAMS_SCENE, "HelloPayVerifyFragment").b);
        }
    }

    private boolean j() {
        Dialog a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cddf148dcf8f88221040a33cb1c17cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cddf148dcf8f88221040a33cb1c17cb")).booleanValue();
        }
        if (!isAdded() || isDetached() || getActivity() == null || (a2 = new com.meituan.android.paycommon.lib.a().a(m(), getActivity(), this.b, new a.InterfaceC0339a() { // from class: com.meituan.android.pay.fragment.HelloPayVerifyFragment.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.paycommon.lib.a.InterfaceC0339a
            public final void b() {
            }

            @Override // com.meituan.android.paycommon.lib.a.InterfaceC0339a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9827347745567d78f39322d1e5b60133", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9827347745567d78f39322d1e5b60133");
                    return;
                }
                HelloPayVerifyFragment.this.i();
                PayActivity.b(HelloPayVerifyFragment.this.getActivity(), "退出HelloPay弹窗", PayErrorCode.HELLO_PAY_DIALOG_CANCEL);
            }
        })) == null) {
            return false;
        }
        a2.show();
        return true;
    }

    private void a(DeskData deskData) {
        Object[] objArr = {deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcbb9c72b5211ce9e86ed897453a5f2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcbb9c72b5211ce9e86ed897453a5f2f");
        } else if (com.meituan.android.pay.desk.component.data.a.e(deskData)) {
            com.meituan.android.paybase.common.analyse.a.a("c_3qbde89q", "b_pay_mwcvzjrt_mv", "支付弹窗组件-查看规则明细", new a.c().a("transid", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999").a("pay_type", !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type")) ? com.meituan.android.pay.common.payment.utils.b.b(getActivity(), "pay_type") : "-999").b, a.EnumC0329a.VIEW, -1);
        }
    }

    private com.meituan.android.pay.common.payment.data.c k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458b8041da2d6b7a0b36c81b806ec43d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458b8041da2d6b7a0b36c81b806ec43d");
        }
        if (this.f != null) {
            return this.f.getDesk();
        }
        return null;
    }

    private com.meituan.android.pay.common.payment.data.a l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "223798752e14705a3256ed81f2843dc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.pay.common.payment.data.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "223798752e14705a3256ed81f2843dc2");
        }
        if (this.f != null) {
            return this.f.getSelectPayment();
        }
        return null;
    }

    private DetainmentDialogInfo m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1c5679b6df8dbd7c36cee76ef4651d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (DetainmentDialogInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1c5679b6df8dbd7c36cee76ef4651d2");
        }
        if (this.f != null) {
            return this.f.getDetainmentDialogInfo();
        }
        return null;
    }

    @Override // com.meituan.android.pay.desk.pack.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7bf9aad20395f5ae601179fc65f47b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7bf9aad20395f5ae601179fc65f47b3");
            return;
        }
        this.d++;
        com.meituan.android.pay.common.payment.utils.a.a(a.EnumC0321a.TRANS_ID, com.meituan.android.paybase.common.analyse.b.b);
        f();
        SelectBankDialogFragment.a(this.x, "c_3qbde89q", e());
        com.meituan.android.paybase.common.analyse.a.a("b_iu5cfuch", (Map<String, Object>) null);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71ad3c075a6692ebe7c4cb1a9e89a913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71ad3c075a6692ebe7c4cb1a9e89a913");
        } else if (i == 999) {
            com.meituan.android.pay.analyse.a.a(this.g, i, obj, null, r());
            com.meituan.android.pay.process.f.a((Activity) getActivity()).c(getActivity(), (BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8275f6e6afe1eda423b613f65e8b4ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8275f6e6afe1eda423b613f65e8b4ae");
            return;
        }
        com.meituan.android.pay.analyse.a.a(this.g, i, exc, r());
        com.meituan.android.pay.utils.s.b(getActivity(), exc, 3);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb61d83848537fbaf47c4575b5ec4ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb61d83848537fbaf47c4575b5ec4ef");
        } else {
            hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b31f1068c2fa9b7b4a79e7103483d78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b31f1068c2fa9b7b4a79e7103483d78");
        } else {
            b(com.meituan.android.paybase.common.utils.b.a());
        }
    }
}
