package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.base.view.revision.CashierOrderInfoView;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.bean.BankListPage;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.DCEPPayment;
import com.meituan.android.cashier.model.bean.PayResult;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.pay.common.promotion.bean.ReduceInfo;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.widgets.ProgressButton;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
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
public class DCEPDialogFragment extends MTPayBaseDialogFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private BankListPage b;
    private PayParams c;
    private PayParams d;
    private String e;
    private String f;
    private String g;
    private String k;
    private String l;
    private HashMap<String, String> m;
    private com.meituan.android.paybase.retrofit.b n;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "DCEPDialogFragment";
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final String b() {
        return "c_pay_h7g2fc35";
    }

    public static DCEPDialogFragment a(String str, BankListPage bankListPage, PayParams payParams, String str2, String str3, String str4, String str5, HashMap<String, String> hashMap) {
        Object[] objArr = {str, bankListPage, payParams, str2, str3, str4, str5, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c028af6096092a2b90ae64acdc4e115c", RobustBitConfig.DEFAULT_VALUE)) {
            return (DCEPDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c028af6096092a2b90ae64acdc4e115c");
        }
        DCEPDialogFragment dCEPDialogFragment = new DCEPDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("tradeNo", str);
        bundle.putSerializable("bank_list_page", bankListPage);
        bundle.putSerializable("pay_params", payParams);
        bundle.putString("app_id", str2);
        bundle.putString("ext_param", str3);
        bundle.putString("ext_data", str5);
        bundle.putString("ext_statics", str4);
        bundle.putSerializable("extend_transmission_params", hashMap);
        dCEPDialogFragment.setArguments(bundle);
        return dCEPDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d3c14900407fe3044e4e179deb1974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d3c14900407fe3044e4e179deb1974");
            return;
        }
        super.onAttach(activity);
        if (getParentFragment() == null || !(getParentFragment() instanceof com.meituan.android.paybase.retrofit.b)) {
            return;
        }
        this.n = (com.meituan.android.paybase.retrofit.b) getParentFragment();
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ddb0adcae7e52cac194bd44c7edec16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ddb0adcae7e52cac194bd44c7edec16");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.g = arguments.getString("tradeNo");
            this.b = (BankListPage) com.sankuai.waimai.platform.utils.f.a(arguments, "bank_list_page");
            this.c = (PayParams) com.sankuai.waimai.platform.utils.f.a(arguments, "pay_params");
            this.e = arguments.getString("app_id");
            this.f = arguments.getString("ext_param");
            this.k = arguments.getString("ext_data");
            this.l = arguments.getString("ext_statics");
            this.m = (HashMap) com.sankuai.waimai.platform.utils.f.a(arguments, "extend_transmission_params");
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14ef624e6776700e51a606eab8ec3842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14ef624e6776700e51a606eab8ec3842");
            return;
        }
        super.onResume();
        q.a("b_pay_0m5b4vo6_sc", (Map<String, Object>) null, e());
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d11455a53856b237f4d0ecc7d75ebbb", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d11455a53856b237f4d0ecc7d75ebbb");
        }
        setCancelable(false);
        return new DCEPDialog(getContext(), this.b);
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4423865e4c9116a9db3ab1c96822609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4423865e4c9116a9db3ab1c96822609");
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || dialog.getWindow() == null || getActivity() == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
        attributes.gravity = 80;
        attributes.width = displayMetrics.widthPixels;
        attributes.height = (int) (displayMetrics.heightPixels * 0.7d);
        attributes.windowAnimations = R.style.paycommon__window_bottom_popup;
        dialog.getWindow().setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DCEPPayment dCEPPayment, String str, HashMap<String, String> hashMap) {
        PayParams payParams;
        ReduceInfo noBalanceReduceInfo;
        Object[] objArr = {dCEPPayment, str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d982dcb7a3be4795b60bd6c0c3ad32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d982dcb7a3be4795b60bd6c0c3ad32");
            return;
        }
        if (dCEPPayment != null) {
            Object[] objArr2 = {dCEPPayment};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f836ae951923ada3d97effca463748b9", RobustBitConfig.DEFAULT_VALUE)) {
                payParams = (PayParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f836ae951923ada3d97effca463748b9");
            } else {
                payParams = this.c == null ? new PayParams() : this.c.m7clone();
                if (dCEPPayment != null) {
                    if (dCEPPayment.getCardInfo() != null && !TextUtils.isEmpty(dCEPPayment.getCardInfo().getTokenId())) {
                        payParams.tokenId = dCEPPayment.getCardInfo().getTokenId();
                    }
                    if (dCEPPayment.getPaymentReduce() != null && (noBalanceReduceInfo = dCEPPayment.getPaymentReduce().getNoBalanceReduceInfo()) != null) {
                        payParams.campaignId = noBalanceReduceInfo.getCampaignId();
                        payParams.couponCode = noBalanceReduceInfo.getCashTicketId();
                    }
                }
            }
            this.d = payParams;
        }
        PayParams payParams2 = this.d;
        getActivity();
        HashMap<String, String> a2 = com.meituan.android.cashier.retrofit.a.a(payParams2, "");
        if (!TextUtils.isEmpty(str)) {
            a2.put("verify_token", str);
        }
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, this, 1)).startDirectPay(a2, com.meituan.android.paycommon.lib.config.a.a().o(), this.e, this.f, "", "", this.k, f(), hashMap);
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b838af201a84d55a7f0674c2e27a8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b838af201a84d55a7f0674c2e27a8f");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("outer_business_statics", this.l);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "DCEPDialogFragment_getExtDimStat", (Map<String, Object>) null);
        }
        return jSONObject.toString();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e7762e2ad3acd0b7f83312d2983045d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e7762e2ad3acd0b7f83312d2983045d");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        if (i == 66) {
            if (i2 == 10 && intent != null) {
                try {
                    String string = new JSONObject(com.sankuai.waimai.platform.utils.f.a(intent, "resultData")).getString("payToken");
                    if (TextUtils.isEmpty(string)) {
                        com.meituan.android.paybase.dialog.e.a((Context) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_pay_error));
                        q.a("b_pay_9ovxih44_sc", (Map<String, Object>) null, e());
                    } else {
                        a(null, string, this.m);
                        q.a("b_pay_bfjxm2bl_sc", (Map<String, Object>) null, e());
                    }
                } catch (JSONException e) {
                    com.meituan.android.paybase.dialog.e.a((Context) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_pay_error));
                    com.meituan.android.paybase.common.analyse.a.a(e, "DCEPDialogFragment_onActivityResult", (Map<String, Object>) null);
                }
            } else if (i2 == 0) {
                q.a("b_pay_zpvcbxrf_sc", (Map<String, Object>) null, e());
            } else {
                com.meituan.android.paybase.dialog.e.a((Context) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_pay_error));
            }
        }
        com.meituan.android.privacy.aop.a.f();
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b98bb0c9e64c8f15c714aa49d0d573", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b98bb0c9e64c8f15c714aa49d0d573");
        } else if (i == 1) {
            PayResult payResult = (PayResult) obj;
            if (TextUtils.equals("verify", payResult.getAction())) {
                if (!TextUtils.isEmpty(payResult.getVerifyUrl())) {
                    al.a(this, payResult.getVerifyUrl(), 66);
                    com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", 200);
                    return;
                }
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", -9753);
                com.meituan.android.paybase.dialog.e.a((Context) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_pay_error));
            } else if (TextUtils.equals("success", payResult.getAction())) {
                if (this.n != null) {
                    if (getDialog() instanceof DCEPDialog) {
                        DCEPDialog.a((DCEPDialog) getDialog());
                    }
                    dismissAllowingStateLoss();
                    this.n.onRequestSucc(i, obj);
                }
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("paybiz_response_directpay", -9753);
                com.meituan.android.paybase.dialog.e.a((Context) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_pay_error));
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        int level;
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e4e1adfc16e8b8ee352020121f7021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e4e1adfc16e8b8ee352020121f7021");
        } else if (i != 1 || this.n == null) {
        } else {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                int code = payException.getCode();
                if (code != 118021 && code != 117003 && (level = payException.getLevel()) != 2 && level != 3) {
                    FragmentActivity activity = getActivity();
                    String message = payException.getMessage();
                    String errorCodeStr = payException.getErrorCodeStr();
                    Object[] objArr2 = {activity, message, errorCodeStr};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.dialog.e.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d595374004de08456cdbe40959450b6a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d595374004de08456cdbe40959450b6a");
                    } else {
                        com.meituan.android.paybase.dialog.e.a((Context) activity, (Object) message, errorCodeStr, e.a.TOAST_TYPE_COMMON, false);
                    }
                }
            } else {
                com.meituan.android.paybase.dialog.e.a((Context) getActivity(), (Object) Integer.valueOf((int) R.string.cashier__error_msg_pay_later));
            }
            this.n.onRequestException(i, exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a7bfef05f350f0505abec2d0f7e81d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a7bfef05f350f0505abec2d0f7e81d0");
        } else if (i == 1) {
            if (this.n != null) {
                this.n.onRequestFinal(i);
            }
            if (getDialog() instanceof DCEPDialog) {
                DCEPDialog.a((DCEPDialog) getDialog());
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4278f01fa4f232e034cf7f40a0bf8a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4278f01fa4f232e034cf7f40a0bf8a3");
        } else if (i == 1) {
            if (getActivity() != null) {
                ((MTCashierActivity) getActivity()).c = null;
            }
            if (getDialog() instanceof DCEPDialog) {
                DCEPDialog.b((DCEPDialog) getDialog());
            }
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final HashMap<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa3600c23f42a46c593127aa1ee0f36", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa3600c23f42a46c593127aa1ee0f36");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("tradeNo", this.g);
        hashMap.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class DCEPDialog extends BaseDialog {
        public static ChangeQuickRedirect a;
        private BankListPage e;
        private ArrayList<DCEPPayment> f;
        private DCEPPayment g;
        private ProgressButton h;
        private CashierOrderInfoView i;

        @Override // android.app.Dialog
        public void onBackPressed() {
        }

        public static /* synthetic */ void a(DCEPDialog dCEPDialog) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, dCEPDialog, changeQuickRedirect, false, "50760cdc376ed1886cdce00c4d5adaab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, dCEPDialog, changeQuickRedirect, false, "50760cdc376ed1886cdce00c4d5adaab");
            } else if (dCEPDialog.h == null || !dCEPDialog.h.b) {
            } else {
                dCEPDialog.h.b();
            }
        }

        public static /* synthetic */ void b(DCEPDialog dCEPDialog) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, dCEPDialog, changeQuickRedirect, false, "fe9da5eec03e357bf1cd9a2f80e937fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, dCEPDialog, changeQuickRedirect, false, "fe9da5eec03e357bf1cd9a2f80e937fe");
            } else if (dCEPDialog.h != null) {
                dCEPDialog.h.a();
            }
        }

        public DCEPDialog(Context context, BankListPage bankListPage) {
            super(context, R.style.cashier__dcep_transparent_dialog);
            Object[] objArr = {DCEPDialogFragment.this, context, bankListPage};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36635189acee43260d447bade95b1fd7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36635189acee43260d447bade95b1fd7");
                return;
            }
            this.e = bankListPage;
            if (this.e != null && !i.a((Collection) this.e.getPaymentList())) {
                this.f = new ArrayList<>(this.e.getPaymentList());
                this.g = a(this.f);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "751450ad0de8e3720a8c3cede0613f32", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "751450ad0de8e3720a8c3cede0613f32");
                return;
            }
            setCanceledOnTouchOutside(false);
            setContentView(R.layout.cashier__dialog_dcep_pay);
            if (this.e != null) {
                Cashier cashier = new Cashier();
                cashier.setTotalFee(this.e.getTotalFee());
                this.i = (CashierOrderInfoView) findViewById(R.id.dcep_money);
                this.i.a(cashier);
                FrameLayout orderPriceAndInfoLayout = this.i.getOrderPriceAndInfoLayout();
                Object[] objArr3 = {orderPriceAndInfoLayout};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99a2324f717d6ff58ef0c75a67c0163a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99a2324f717d6ff58ef0c75a67c0163a");
                } else if (orderPriceAndInfoLayout != null) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) orderPriceAndInfoLayout.getLayoutParams();
                    layoutParams.height = aj.a(getContext(), 15.0f);
                    orderPriceAndInfoLayout.setLayoutParams(layoutParams);
                }
                a(com.meituan.android.pay.desk.payment.discount.a.a(this.e.getTotalFee(), a()).floatValue());
                ((TextView) findViewById(R.id.dcep_title)).setText(this.e.getPageTitle());
                this.h = (ProgressButton) findViewById(R.id.dcep_confirm_btn);
                if (!TextUtils.isEmpty(this.e.getPayButton())) {
                    this.h.setText(this.e.getPayButton());
                }
                this.h.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.cashier.dialogfragment.DCEPDialogFragment.DCEPDialog.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paycommon.lib.widgets.g
                    public final void a(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "929a413c458dee2fb0fdbf9319cceb45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "929a413c458dee2fb0fdbf9319cceb45");
                            return;
                        }
                        HashMap<String, Object> a2 = q.a();
                        a2.put("bank_name", DCEPDialog.this.g != null ? DCEPDialog.this.g.getName() : "");
                        q.a("c_pay_h7g2fc35", "b_pay_h4ezb2s6_mc", "DCEP选择半弹窗-立即付款", a2, ae.a.CLICK, DCEPDialog.this.b());
                        if (DCEPDialog.this.g != null && DCEPDialog.this.g.getCardInfo() != null) {
                            DCEPDialogFragment.this.a(DCEPDialog.this.g, null, DCEPDialogFragment.this.m);
                        } else {
                            com.meituan.android.paybase.dialog.e.a((Context) DCEPDialogFragment.this.getActivity(), (Object) Integer.valueOf((int) R.string.cashier__dcep_pay_error));
                        }
                    }
                });
                findViewById(R.id.dcep_close).setOnClickListener(com.meituan.android.cashier.dialogfragment.a.a(this));
                if (i.a((Collection) this.f)) {
                    return;
                }
                ListView listView = (ListView) findViewById(R.id.dcep_bank_list);
                listView.setAdapter((ListAdapter) new a(getContext(), this.f));
                listView.setOnItemClickListener(b.a(this, listView));
            }
        }

        private DCEPPayment a(List<DCEPPayment> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64f93ade433a6cd713f7a2a21cbc745", RobustBitConfig.DEFAULT_VALUE)) {
                return (DCEPPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64f93ade433a6cd713f7a2a21cbc745");
            }
            DCEPPayment dCEPPayment = null;
            for (DCEPPayment dCEPPayment2 : list) {
                if (dCEPPayment2.isSelected()) {
                    if (dCEPPayment == null) {
                        dCEPPayment = dCEPPayment2;
                    } else {
                        dCEPPayment2.setSelected(false);
                    }
                }
            }
            if (dCEPPayment == null) {
                DCEPPayment dCEPPayment3 = list.get(0);
                dCEPPayment3.setSelected(true);
                return dCEPPayment3;
            }
            return dCEPPayment;
        }

        public static /* synthetic */ void a(DCEPDialog dCEPDialog, View view) {
            Object[] objArr = {dCEPDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2188854e9c0635d3acc41d6da8714c50", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2188854e9c0635d3acc41d6da8714c50");
                return;
            }
            q.a("c_pay_h7g2fc35", "b_pay_vkfjg7dc_mc", "DCEP选择半弹窗-关闭", q.a(), ae.a.CLICK, dCEPDialog.b());
            dCEPDialog.cancel();
        }

        public static /* synthetic */ void a(DCEPDialog dCEPDialog, ListView listView, AdapterView adapterView, View view, int i, long j) {
            Object[] objArr = {dCEPDialog, listView, adapterView, view, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d2694bf80bed4bd0a9635d9c9c3e31a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d2694bf80bed4bd0a9635d9c9c3e31a");
            } else if (dCEPDialog.g != dCEPDialog.f.get(i)) {
                dCEPDialog.g = dCEPDialog.f.get(i);
                for (int i2 = 0; i2 < dCEPDialog.f.size(); i2++) {
                    DCEPPayment dCEPPayment = dCEPDialog.f.get(i2);
                    if (i2 == i) {
                        dCEPPayment.setSelected(true);
                        dCEPDialog.a(com.meituan.android.pay.desk.payment.discount.a.a(dCEPDialog.e.getTotalFee(), dCEPPayment.getPaymentReduce()).floatValue());
                    } else {
                        dCEPPayment.setSelected(false);
                    }
                }
                ((com.meituan.android.paycommon.lib.assist.a) listView.getAdapter()).notifyDataSetChanged();
                HashMap<String, Object> a2 = q.a();
                a2.put("bank_name", dCEPDialog.g != null ? dCEPDialog.g.getName() : "");
                q.a("c_pay_h7g2fc35", "b_pay_0twy1fj8_mc", "DCEP银行列表", a2, ae.a.CLICK, dCEPDialog.b());
            }
        }

        private void a(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dab69e6cff09e3dcfd24a5c5390fd5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dab69e6cff09e3dcfd24a5c5390fd5e");
            } else {
                this.i.a(f);
            }
        }

        private PaymentReduce a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38dec5dca0a764de7166c80db9ef52b", RobustBitConfig.DEFAULT_VALUE)) {
                return (PaymentReduce) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38dec5dca0a764de7166c80db9ef52b");
            }
            if (i.a((Collection) this.f)) {
                return null;
            }
            Iterator<DCEPPayment> it = this.f.iterator();
            while (it.hasNext()) {
                DCEPPayment next = it.next();
                if (next.isSelected()) {
                    return next.getPaymentReduce();
                }
            }
            return this.f.get(0).getPaymentReduce();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends com.meituan.android.paycommon.lib.assist.a<DCEPPayment> {
        public static ChangeQuickRedirect a;

        /* compiled from: ProGuard */
        /* renamed from: com.meituan.android.cashier.dialogfragment.DCEPDialogFragment$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0188a {
            public ImageView a;
            public TextView b;
            public TextView c;
            public ImageView d;
            public PayLabelContainer e;
        }

        public a(Context context, ArrayList<DCEPPayment> arrayList) {
            super(context, arrayList);
            Object[] objArr = {context, arrayList};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39cb1fb10e894929e831e40ec5db7307", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39cb1fb10e894929e831e40ec5db7307");
            }
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            C0188a c0188a;
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "890ea76ef849fed017702856ef686fe2", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "890ea76ef849fed017702856ef686fe2");
            }
            if (view == null) {
                view = LayoutInflater.from(this.i).inflate(R.layout.cashier__dcep_bank_item, viewGroup, false);
                c0188a = new C0188a();
                c0188a.a = (ImageView) view.findViewById(R.id.dcep_icon);
                c0188a.b = (TextView) view.findViewById(R.id.dcep_name);
                c0188a.c = (TextView) view.findViewById(R.id.dcep_name_ext);
                c0188a.d = (ImageView) view.findViewById(R.id.dcep_selected);
                c0188a.e = (PayLabelContainer) view.findViewById(R.id.dcep_label_layout);
                view.setTag(c0188a);
            } else {
                c0188a = (C0188a) view.getTag();
            }
            DCEPPayment item = getItem(i);
            c0188a.b.setText(item.getName());
            if (item.getCardInfo() != null) {
                c0188a.c.setText(item.getCardInfo().getNameExt());
            } else {
                c0188a.c.setText("");
            }
            if (item.getIcon() != null) {
                w.a(item.getIcon().getEnable(), c0188a.a, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
            } else {
                c0188a.a.setImageResource(R.drawable.mpay__payment_default_pic);
            }
            if (item.isSelected()) {
                c0188a.d.setImageResource(R.drawable.mtpaysdk__payment_checkbox_selected);
            } else {
                c0188a.d.setImageResource(R.drawable.mtpaysdk__payment_checkbox_unselected);
            }
            if (!i.a((Collection) item.getBottomLabels())) {
                c0188a.e.b(item.getBottomLabels(), 3);
                c0188a.e.setVisibility(0);
            } else {
                c0188a.e.setVisibility(8);
            }
            return view;
        }
    }
}
