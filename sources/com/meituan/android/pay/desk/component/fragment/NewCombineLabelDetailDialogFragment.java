package com.meituan.android.pay.desk.component.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.promotion.bean.Material;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.pay.common.promotion.bean.PromotionInfo;
import com.meituan.android.pay.common.promotion.bean.PromotionRefreshment;
import com.meituan.android.pay.desk.component.bean.standardcomponent.BalanceCombinePayment;
import com.meituan.android.pay.desk.retrofit.PayDeskRequestService;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NewCombineLabelDetailDialogFragment extends MTPayBaseDialogFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    ArrayList<PayLabel> d;
    com.meituan.android.pay.common.payment.data.a e;
    HashMap<String, String> f;
    public h g;
    private PromotionRefreshment k;
    private boolean l;
    private String m;
    private Handler n;
    private f o;
    private Material p;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "NewCombineLabelDetailDialogFragment";
    }

    public static /* synthetic */ int a(NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment, PayLabel payLabel) {
        Object[] objArr = {payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, newCombineLabelDetailDialogFragment, changeQuickRedirect, false, "add087535cb6b527fc8bc57a9940d46d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, newCombineLabelDetailDialogFragment, changeQuickRedirect, false, "add087535cb6b527fc8bc57a9940d46d")).intValue() : (payLabel == null || payLabel.getLabelSwitch() == null || payLabel.getLabelSwitch().getCheck() == 3) ? 0 : 1;
    }

    public static /* synthetic */ String b(NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, newCombineLabelDetailDialogFragment, changeQuickRedirect, false, "0891b940cbd4de70e33a143613fc4a1f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, newCombineLabelDetailDialogFragment, changeQuickRedirect, false, "0891b940cbd4de70e33a143613fc4a1f") : TextUtils.equals(newCombineLabelDetailDialogFragment.m, "收银台首页") ? "c_PJmoK" : "c_sjk32ngz";
    }

    public static NewCombineLabelDetailDialogFragment a(String str, String str2, ArrayList<PayLabel> arrayList, com.meituan.android.pay.common.payment.data.a aVar, boolean z, String str3, HashMap<String, String> hashMap, Material material) {
        Object[] objArr = {str, str2, arrayList, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, hashMap, material};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f591615325a29178bf345b329375f378", RobustBitConfig.DEFAULT_VALUE)) {
            return (NewCombineLabelDetailDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f591615325a29178bf345b329375f378");
        }
        NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment = new NewCombineLabelDetailDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("trans_id", str);
        bundle.putString("cashier_type", str2);
        bundle.putSerializable("pay_labels", arrayList);
        bundle.putSerializable("checked_payment", aVar);
        bundle.putBoolean("show_more", z);
        bundle.putString(KnbConstants.PARAMS_SCENE, str3);
        bundle.putSerializable("extend_transmission_params", hashMap);
        bundle.putSerializable("material", material);
        newCombineLabelDetailDialogFragment.setArguments(bundle);
        return newCombineLabelDetailDialogFragment;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onAttach(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dccda756eecbf12001b78e416d70ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dccda756eecbf12001b78e416d70ac7");
        } else {
            super.onAttach(context);
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "258a98560ebe7b3d838adde16044ce40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "258a98560ebe7b3d838adde16044ce40");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = getArguments().getString("trans_id");
            this.c = getArguments().getString("cashier_type");
            this.d = (ArrayList) com.sankuai.waimai.platform.utils.f.a(getArguments(), "pay_labels");
            this.e = (com.meituan.android.pay.common.payment.data.a) com.sankuai.waimai.platform.utils.f.a(getArguments(), "checked_payment");
            this.l = getArguments().getBoolean("show_more");
            this.f = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "extend_transmission_params");
            this.m = getArguments().getString(KnbConstants.PARAMS_SCENE);
            this.p = (Material) com.sankuai.waimai.platform.utils.f.a(getArguments(), "material");
            this.o = new f() { // from class: com.meituan.android.pay.desk.component.fragment.NewCombineLabelDetailDialogFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.pay.desk.component.fragment.f
                public final void a(ArrayList<PayLabel> arrayList, PayLabel payLabel) {
                    Object[] objArr2 = {arrayList, payLabel};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f5d5c593b842e340fed9e6a0ff9ed144", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f5d5c593b842e340fed9e6a0ff9ed144");
                        return;
                    }
                    NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment = NewCombineLabelDetailDialogFragment.this;
                    Object[] objArr3 = {payLabel};
                    ChangeQuickRedirect changeQuickRedirect3 = NewCombineLabelDetailDialogFragment.a;
                    if (PatchProxy.isSupport(objArr3, newCombineLabelDetailDialogFragment, changeQuickRedirect3, false, "6d722e1861e8feb6162eacd0f84784bb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, newCombineLabelDetailDialogFragment, changeQuickRedirect3, false, "6d722e1861e8feb6162eacd0f84784bb");
                    } else {
                        HashMap<String, Object> hashMap = new HashMap<>();
                        String str = "";
                        if (newCombineLabelDetailDialogFragment.e != null) {
                            String payType = newCombineLabelDetailDialogFragment.e.getPayType();
                            if (com.meituan.android.pay.common.payment.utils.c.f(payType) && newCombineLabelDetailDialogFragment.e.getCardInfo() != null) {
                                hashMap.put("bank_card", newCombineLabelDetailDialogFragment.e.getCardInfo().getBankCard());
                                if (!TextUtils.isEmpty(newCombineLabelDetailDialogFragment.e.getBankTypeId())) {
                                    hashMap.put("bank_type_id", Integer.valueOf(newCombineLabelDetailDialogFragment.e.getBankTypeId()));
                                }
                            }
                            try {
                                if (newCombineLabelDetailDialogFragment.e instanceof MTPayment) {
                                    MTPayment mTPayment = (MTPayment) newCombineLabelDetailDialogFragment.e;
                                    if (com.meituan.android.pay.common.payment.utils.c.d(payType)) {
                                        hashMap.put("privilege_id", mTPayment.getPrivilegeId());
                                    }
                                    if (com.meituan.android.pay.common.payment.utils.e.a((com.meituan.android.pay.common.payment.data.d) mTPayment) || com.meituan.android.pay.common.payment.utils.c.e(mTPayment.getPayType())) {
                                        JSONObject jSONObject = new JSONObject();
                                        Installment installment = mTPayment.getInstallment();
                                        jSONObject.put("installment_available_flag", mTPayment.getIsSupportInstallment());
                                        if (installment != null) {
                                            jSONObject.put("installment_periods", installment.getAllPeriods());
                                            int c = com.meituan.android.pay.common.payment.utils.e.c(mTPayment);
                                            if (c >= 0) {
                                                jSONObject.put("installment_selected_period", c);
                                            }
                                        }
                                        if (com.meituan.android.pay.common.payment.utils.e.a((com.meituan.android.pay.common.payment.data.d) mTPayment) && mTPayment.getCardInfo() != null && !TextUtils.isEmpty(mTPayment.getCardInfo().getBankCard())) {
                                            jSONObject.put("bankcard", mTPayment.getCardInfo().getBankCard());
                                        }
                                        hashMap.put("installment_info", jSONObject.toString());
                                    }
                                }
                                if (newCombineLabelDetailDialogFragment.e instanceof BalanceCombinePayment) {
                                    BalanceCombinePayment balanceCombinePayment = (BalanceCombinePayment) newCombineLabelDetailDialogFragment.e;
                                    if (com.meituan.android.pay.common.payment.utils.c.d(payType)) {
                                        hashMap.put("privilege_id", balanceCombinePayment.getPrivilegeId());
                                    }
                                }
                            } catch (Exception e) {
                                com.meituan.android.paybase.common.analyse.a.a(e, "NewCombineLabelDetailDialogFragment_promotionCalculateRequest", (Map<String, Object>) null);
                            }
                            str = payType;
                        }
                        if (TextUtils.isEmpty(str)) {
                            str = com.meituan.android.pay.common.payment.utils.b.b(newCombineLabelDetailDialogFragment.getActivity(), "pay_type");
                        }
                        if (TextUtils.isEmpty(newCombineLabelDetailDialogFragment.c)) {
                            newCombineLabelDetailDialogFragment.c = "wallet";
                        }
                        hashMap.put("pay_type_promo_info", newCombineLabelDetailDialogFragment.a(newCombineLabelDetailDialogFragment.d, payLabel).toString());
                        if (!i.a(newCombineLabelDetailDialogFragment.f)) {
                            hashMap.putAll(newCombineLabelDetailDialogFragment.f);
                        }
                        ((PayDeskRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayDeskRequestService.class, newCombineLabelDetailDialogFragment, 533534)).promotionCalculate(str, newCombineLabelDetailDialogFragment.c, newCombineLabelDetailDialogFragment.b, hashMap);
                    }
                    if (payLabel != null) {
                        com.meituan.android.pay.common.analyse.b.b(NewCombineLabelDetailDialogFragment.b(NewCombineLabelDetailDialogFragment.this), "b_pay_i1gwzzwr_mc", "新营销权益页点击权益卡片", new a.c().a("entry_page", NewCombineLabelDetailDialogFragment.this.m).a(Constants.Business.KEY_PROMOT_ID, payLabel.getPromoId()).a("promo_type", payLabel.getPromoType()).a("show_type", Integer.valueOf(NewCombineLabelDetailDialogFragment.a(NewCombineLabelDetailDialogFragment.this, payLabel))).b, NewCombineLabelDetailDialogFragment.this.e());
                    }
                }
            };
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "337445c495f0893e668c38cc8ffff8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "337445c495f0893e668c38cc8ffff8e5");
        } else {
            super.onCancel(dialogInterface);
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984752aa36e076054ff436221a3e4232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984752aa36e076054ff436221a3e4232");
            return;
        }
        super.onDetach();
        if (this.n != null) {
            this.n.removeCallbacksAndMessages(null);
            this.n = null;
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6edc22ff176668e096e5e8a8c4e8a006", RobustBitConfig.DEFAULT_VALUE) ? (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6edc22ff176668e096e5e8a8c4e8a006") : new NewCombineDetailDialog(getActivity());
    }

    ArrayList<String> a(ArrayList<PayLabel> arrayList, PayLabel payLabel) {
        int check;
        String str;
        int i;
        int i2 = 2;
        char c = 1;
        Object[] objArr = {arrayList, payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "465528daa485480a2fdf705d7c4e72d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "465528daa485480a2fdf705d7c4e72d0");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        try {
            Iterator<PayLabel> it = arrayList.iterator();
            while (it.hasNext()) {
                PayLabel next = it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.Business.KEY_PROMOT_ID, next.getPromoId());
                jSONObject.put("cashticket_code", next.getCashTicketCode());
                jSONObject.put("real_discount", com.meituan.android.paybase.utils.d.a(Float.valueOf(next.getRealDiscount())));
                jSONObject.put("promo_type", next.getPromoType());
                jSONObject.put(PayLabel.ITEM_TYPE_DISCOUNT, com.meituan.android.paybase.utils.d.a(Float.valueOf(next.getDiscount())));
                if (next.getLabelSwitch() != null) {
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = next;
                    objArr2[c] = payLabel;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62354461853bd645de361f03386f1652", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62354461853bd645de361f03386f1652")).intValue();
                        str = PayLabelConstants.KEY_LABEL_CHECK;
                    } else {
                        if (next == payLabel) {
                            check = next.getLabelSwitch().getCheck() ^ 1;
                        } else if (com.meituan.android.pay.common.promotion.utils.a.c(payLabel) && com.meituan.android.pay.common.promotion.utils.a.c(next)) {
                            str = PayLabelConstants.KEY_LABEL_CHECK;
                            i = 0;
                        } else {
                            check = next.getLabelSwitch().getCheck();
                        }
                        i = check;
                        str = PayLabelConstants.KEY_LABEL_CHECK;
                    }
                    jSONObject.put(str, i);
                }
                arrayList2.add(jSONObject.toString());
                i2 = 2;
                c = 1;
            }
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "NewCombineLabelDetailDialogFragment_getRequestPromoList", (Map<String, Object>) null);
        }
        return arrayList2;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef4f99d26a52860f3a8a60d1f9d09bf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef4f99d26a52860f3a8a60d1f9d09bf1");
            return;
        }
        if (this.n != null) {
            this.n.removeCallbacksAndMessages(null);
        }
        if (obj instanceof PromotionRefreshment) {
            PromotionRefreshment promotionRefreshment = (PromotionRefreshment) obj;
            this.k = promotionRefreshment;
            NewCombineDetailDialog.a((NewCombineDetailDialog) getDialog(), promotionRefreshment);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030218ef834aaac9adbf645e65c7acfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030218ef834aaac9adbf645e65c7acfc");
            return;
        }
        if (this.n != null) {
            this.n.removeCallbacksAndMessages(null);
        }
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            if (payException.getLevel() == 2 || payException.getLevel() == 3) {
                com.meituan.android.paycommon.lib.utils.d.a(getActivity(), payException, null);
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("b_dfqxkh81", new a.c().a("code", Integer.valueOf(payException.getCode())).a("level", Integer.valueOf(payException.getLevel())).a("message", payException.getMessage()).b);
            com.meituan.android.paybase.dialog.e.a(getDialog(), payException.getMessage(), payException.getErrorCodeStr(), e.a.TOAST_TYPE_COMMON, false);
            return;
        }
        com.meituan.android.paybase.dialog.e.a(getDialog(), "网络异常，请以实际支付金额为准～", "", e.a.TOAST_TYPE_COMMON, false);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fabe3005dd2350b31fe179854f11680", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fabe3005dd2350b31fe179854f11680");
            return;
        }
        if (this.n != null) {
            this.n.removeCallbacksAndMessages(null);
        }
        if (getActivity() != null) {
            ((PayBaseActivity) getActivity()).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "946fb69861680230ae46b990a709d30f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "946fb69861680230ae46b990a709d30f");
            return;
        }
        if (this.n == null) {
            this.n = new Handler();
        }
        this.n.postDelayed(b.a(this), 500L);
    }

    public static /* synthetic */ void a(NewCombineLabelDetailDialogFragment newCombineLabelDetailDialogFragment) {
        Object[] objArr = {newCombineLabelDetailDialogFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4757d4b34d2ae8a3254a220f739e9bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4757d4b34d2ae8a3254a220f739e9bf");
        } else if (newCombineLabelDetailDialogFragment.getActivity() != null) {
            ((PayBaseActivity) newCombineLabelDetailDialogFragment.getActivity()).showProgress();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class NewCombineDetailDialog extends BaseDialog {
        public static ChangeQuickRedirect a;

        public static /* synthetic */ void a(NewCombineDetailDialog newCombineDetailDialog, PromotionRefreshment promotionRefreshment) {
            Object[] objArr = {promotionRefreshment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, newCombineDetailDialog, changeQuickRedirect, false, "7173b7149aad9e64a928d5c0b4394724", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, newCombineDetailDialog, changeQuickRedirect, false, "7173b7149aad9e64a928d5c0b4394724");
                return;
            }
            com.meituan.android.pay.desk.payment.fragment.f fVar = (com.meituan.android.pay.desk.payment.fragment.f) ((ListView) newCombineDetailDialog.findViewById(R.id.mpay__discount_list)).getAdapter();
            ArrayList<PromotionInfo> calculatePromotionInfo = promotionRefreshment.getCalculatePromotionInfo();
            Object[] objArr2 = {calculatePromotionInfo};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, newCombineDetailDialog, changeQuickRedirect2, false, "df76b26eafdf7bcf41be729c2fccef64", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, newCombineDetailDialog, changeQuickRedirect2, false, "df76b26eafdf7bcf41be729c2fccef64");
            } else if (!i.a((Collection) calculatePromotionInfo) && !i.a((Collection) NewCombineLabelDetailDialogFragment.this.d)) {
                Iterator it = NewCombineLabelDetailDialogFragment.this.d.iterator();
                while (it.hasNext()) {
                    PayLabel payLabel = (PayLabel) it.next();
                    Iterator<PromotionInfo> it2 = calculatePromotionInfo.iterator();
                    while (it2.hasNext()) {
                        PromotionInfo next = it2.next();
                        boolean z = !TextUtils.isEmpty(payLabel.getCashTicketCode()) && TextUtils.equals(payLabel.getCashTicketCode(), next.getCashTicketCode());
                        boolean z2 = !TextUtils.isEmpty(payLabel.getPromoId()) && TextUtils.equals(payLabel.getPromoId(), next.getPromoId());
                        if (!z) {
                            if (z2) {
                            }
                        }
                        payLabel.getLabelSwitch().setCheck(next.getCheck());
                        payLabel.setDiscount(next.getDiscount());
                        payLabel.setRealDiscount(next.getRealDiscount());
                    }
                }
            }
            newCombineDetailDialog.a(fVar);
            newCombineDetailDialog.a();
            fVar.notifyDataSetChanged();
        }

        public NewCombineDetailDialog(Context context) {
            super(context);
            Object[] objArr = {NewCombineLabelDetailDialogFragment.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c31532007a4c03ea877d241c7fdae1b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c31532007a4c03ea877d241c7fdae1b");
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499fbdd3633c3fc9134adbee1e47b3db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499fbdd3633c3fc9134adbee1e47b3db");
                return;
            }
            super.onCreate(bundle);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00c1f949ec644808590bc0fc5420d316", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00c1f949ec644808590bc0fc5420d316");
            } else {
                requestWindowFeature(1);
                setCanceledOnTouchOutside(true);
                setContentView(R.layout.mpay__dialog_disconunt_detail_new);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cdc911514c61c5868b22ae0b042b78c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cdc911514c61c5868b22ae0b042b78c");
                } else {
                    setOnCancelListener(c.a(this));
                    findViewById(R.id.mpay__dialog_cancel).setOnClickListener(d.a(this));
                    findViewById(R.id.btn_dialog_discount_confirm).setOnClickListener(e.a(this));
                }
                Object[] objArr4 = {Integer.valueOf((int) R.string.mpay__discount_title_new)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d31088de21bc21c36c45037c67b3e363", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d31088de21bc21c36c45037c67b3e363");
                } else {
                    TextView textView = (TextView) findViewById(R.id.mpay_dialog_title);
                    if (NewCombineLabelDetailDialogFragment.this.p != null && !TextUtils.isEmpty(NewCombineLabelDetailDialogFragment.this.p.getCombineTitle())) {
                        textView.setText(NewCombineLabelDetailDialogFragment.this.p.getCombineTitle());
                    } else {
                        textView.setText(R.string.mpay__discount_title_new);
                    }
                }
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4450eb3d1b8304b110a977d861467078", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4450eb3d1b8304b110a977d861467078");
                } else {
                    com.meituan.android.pay.desk.payment.fragment.f fVar = new com.meituan.android.pay.desk.payment.fragment.f(getContext(), NewCombineLabelDetailDialogFragment.this.d);
                    a(fVar);
                    fVar.e = NewCombineLabelDetailDialogFragment.this.l;
                    fVar.f = NewCombineLabelDetailDialogFragment.this.m;
                    fVar.g = b();
                    fVar.d = NewCombineLabelDetailDialogFragment.this.o;
                    ((ListView) findViewById(R.id.mpay__discount_list)).setAdapter((ListAdapter) fVar);
                }
                a();
                d();
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "29b909bea0bcd581a922a6180f1dbd7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "29b909bea0bcd581a922a6180f1dbd7a");
                return;
            }
            getWindow().setBackgroundDrawableResource(17170445);
            Display defaultDisplay = NewCombineLabelDetailDialogFragment.this.getActivity().getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            Point point = new Point();
            defaultDisplay.getSize(point);
            attributes.width = point.x;
            attributes.height = (point.y * 7) / 10;
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            getWindow().setWindowAnimations(R.style.paycommon__window_bottom_popup);
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
        }

        public static /* synthetic */ void a(NewCombineDetailDialog newCombineDetailDialog, DialogInterface dialogInterface) {
            Object[] objArr = {newCombineDetailDialog, dialogInterface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "293c12b7de9c904d70e5788762c12c8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "293c12b7de9c904d70e5788762c12c8c");
                return;
            }
            boolean z = ((com.meituan.android.pay.desk.payment.fragment.f) ((ListView) newCombineDetailDialog.findViewById(R.id.mpay__discount_list)).getAdapter()).e;
            if (NewCombineLabelDetailDialogFragment.this.g != null) {
                NewCombineLabelDetailDialogFragment.this.g.a(NewCombineLabelDetailDialogFragment.this.k, NewCombineLabelDetailDialogFragment.this.d, z);
            }
        }

        public static /* synthetic */ void b(NewCombineDetailDialog newCombineDetailDialog, View view) {
            Object[] objArr = {newCombineDetailDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d99d9f250361e309df6e1acf9574414b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d99d9f250361e309df6e1acf9574414b");
            } else {
                newCombineDetailDialog.cancel();
            }
        }

        public static /* synthetic */ void a(NewCombineDetailDialog newCombineDetailDialog, View view) {
            Object[] objArr = {newCombineDetailDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1839aefb4b760e14f2458f8a66477396", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1839aefb4b760e14f2458f8a66477396");
                return;
            }
            com.meituan.android.pay.common.analyse.b.b(NewCombineLabelDetailDialogFragment.b(NewCombineLabelDetailDialogFragment.this), "b_pay_ic1veb3g_mc", "新权益聚合页点击确认按钮", new a.c().a("entry_page", NewCombineLabelDetailDialogFragment.this.m).b, newCombineDetailDialog.b());
            newCombineDetailDialog.cancel();
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490b0d99461cb4b8f926aa12a173955b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490b0d99461cb4b8f926aa12a173955b");
                return;
            }
            float floatValue = com.meituan.android.pay.common.promotion.utils.a.e(NewCombineLabelDetailDialogFragment.this.d).floatValue();
            ((TextView) findViewById(R.id.mpay_reduce)).setText(getContext().getString(R.string.mpay__money_prefix) + ag.a(floatValue));
            ((TextView) findViewById(R.id.mpay_reduce_prefix)).setVisibility(c() ? 0 : 8);
        }

        private boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3db8c95a1aa622b2f3c6501820415e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3db8c95a1aa622b2f3c6501820415e")).booleanValue();
            }
            if (i.a((Collection) NewCombineLabelDetailDialogFragment.this.d)) {
                return false;
            }
            Iterator it = NewCombineLabelDetailDialogFragment.this.d.iterator();
            while (it.hasNext()) {
                if (com.meituan.android.paybase.utils.d.c(Float.valueOf(((PayLabel) it.next()).getRealDiscount()), Double.valueOf(0.0d)) <= 0) {
                    return true;
                }
            }
            return false;
        }

        private void a(com.meituan.android.pay.desk.payment.fragment.f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6574def7e20459870d7f7ede2ea792a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6574def7e20459870d7f7ede2ea792a");
            } else if (i.a((Collection) NewCombineLabelDetailDialogFragment.this.d)) {
            } else {
                ArrayList<PayLabel> arrayList = new ArrayList<>();
                ArrayList<PayLabel> arrayList2 = new ArrayList<>();
                Iterator it = NewCombineLabelDetailDialogFragment.this.d.iterator();
                while (it.hasNext()) {
                    PayLabel payLabel = (PayLabel) it.next();
                    if (payLabel != null && !com.meituan.android.pay.common.promotion.utils.a.b(payLabel)) {
                        if (com.meituan.android.pay.common.promotion.utils.a.c(payLabel)) {
                            arrayList.add(payLabel);
                        } else {
                            arrayList2.add(payLabel);
                        }
                    }
                }
                if (arrayList.size() > 20) {
                    arrayList = new ArrayList<>(arrayList.subList(0, 20));
                }
                fVar.b = arrayList;
                fVar.c = arrayList2;
                NewCombineLabelDetailDialogFragment.this.d = new ArrayList(arrayList);
                NewCombineLabelDetailDialogFragment.this.d.addAll(arrayList2);
                fVar.a(NewCombineLabelDetailDialogFragment.this.d);
            }
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "131d6fc4888ed15915a6ed9315a65e02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "131d6fc4888ed15915a6ed9315a65e02");
            } else if (i.a((Collection) NewCombineLabelDetailDialogFragment.this.d)) {
            } else {
                Iterator it = NewCombineLabelDetailDialogFragment.this.d.iterator();
                while (it.hasNext()) {
                    PayLabel payLabel = (PayLabel) it.next();
                    com.meituan.android.pay.common.analyse.b.a(NewCombineLabelDetailDialogFragment.b(NewCombineLabelDetailDialogFragment.this), "b_pay_i1gwzzwr_mv", "新营销权益页权益卡片曝光", new a.c().a("entry_page", NewCombineLabelDetailDialogFragment.this.m).a(Constants.Business.KEY_PROMOT_ID, payLabel.getPromoId()).a("promo_type", payLabel.getPromoType()).a("show_type", Integer.valueOf(NewCombineLabelDetailDialogFragment.a(NewCombineLabelDetailDialogFragment.this, payLabel))).b, b());
                }
            }
        }
    }
}
