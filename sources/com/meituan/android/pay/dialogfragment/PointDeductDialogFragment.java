package com.meituan.android.pay.dialogfragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.model.bean.PointDeductAlert;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PointDeductDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private BankInfo b;
    private HashMap<String, String> c;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "PointDeductDialogFragment";
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final String b() {
        return "c_pay_7j0walkm";
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "365630c0ffca9755cc9751010671c159", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "365630c0ffca9755cc9751010671c159");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (BankInfo) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bankInfo");
            this.c = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "extraData");
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0417087d3ea05eb207573be4d79aae2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0417087d3ea05eb207573be4d79aae2f");
        } else {
            super.onDestroy();
        }
    }

    public static void a(@NonNull FragmentActivity fragmentActivity, BankInfo bankInfo, HashMap<String, String> hashMap) {
        PointDeductDialogFragment pointDeductDialogFragment;
        Object[] objArr = {fragmentActivity, bankInfo, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa0d9a78a4a41ed2c9e28cca66d9f684", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa0d9a78a4a41ed2c9e28cca66d9f684");
            return;
        }
        Object[] objArr2 = {bankInfo, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5998e14fb6882bd93562f6ae3aa5fb5f", RobustBitConfig.DEFAULT_VALUE)) {
            pointDeductDialogFragment = (PointDeductDialogFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5998e14fb6882bd93562f6ae3aa5fb5f");
        } else {
            PointDeductDialogFragment pointDeductDialogFragment2 = new PointDeductDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("bankInfo", bankInfo);
            bundle.putSerializable("extraData", hashMap);
            pointDeductDialogFragment2.setArguments(bundle);
            pointDeductDialogFragment = pointDeductDialogFragment2;
        }
        pointDeductDialogFragment.a(fragmentActivity.getSupportFragmentManager());
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9de3e49f27619b7c30e3e00292565d86", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9de3e49f27619b7c30e3e00292565d86");
        }
        setCancelable(false);
        return new PointDeductDialog(getActivity(), this.b, this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class PointDeductDialog extends BaseDialog implements com.meituan.android.paybase.retrofit.b {
        public static ChangeQuickRedirect a;
        private BankInfo e;
        private HashMap<String, String> f;
        private Context g;

        public PointDeductDialog(Context context, BankInfo bankInfo, HashMap<String, String> hashMap) {
            super(context, R.style.mpay__transparent_dialog);
            Object[] objArr = {PointDeductDialogFragment.this, context, bankInfo, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c4ec0ac7612b0bf89d3b4ef0dc8b2b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c4ec0ac7612b0bf89d3b4ef0dc8b2b");
                return;
            }
            this.e = bankInfo;
            this.f = hashMap;
            this.g = context;
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0019c9a25721852a1df528e354b29bd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0019c9a25721852a1df528e354b29bd9");
                return;
            }
            super.onCreate(bundle);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "315a70ad459be3d4dce49355fbcc2ef2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "315a70ad459be3d4dce49355fbcc2ef2");
                return;
            }
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__deduct_dialog, (ViewGroup) null);
            PointDeductAlert pointDeductAlert = this.e.getPointDeductAlert();
            if (inflate == null || pointDeductAlert == null) {
                return;
            }
            ((TextView) inflate.findViewById(R.id.deduct_title)).setText(pointDeductAlert.getTitle());
            ((TextView) inflate.findViewById(R.id.deduct_content)).setText(pointDeductAlert.getContent());
            ((TextView) inflate.findViewById(R.id.deduct_rule_prename)).setText(pointDeductAlert.getRulePreName());
            TextView textView = (TextView) inflate.findViewById(R.id.deduct_rule_sufname);
            textView.setText(pointDeductAlert.getRuleSufName());
            if (!TextUtils.isEmpty(pointDeductAlert.getRuleContentUrl())) {
                textView.setOnClickListener(l.a(this, pointDeductAlert));
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "积分抵扣弹窗中协议链接为空");
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.discard_deduct);
            textView2.setText(pointDeductAlert.getLeftButton());
            textView2.setOnClickListener(m.a(this));
            TextView textView3 = (TextView) inflate.findViewById(R.id.use_deduct);
            textView3.setText(pointDeductAlert.getRightButton());
            textView3.setOnClickListener(n.a(this));
            setContentView(inflate, new ViewGroup.LayoutParams((int) (PointDeductDialogFragment.this.getActivity().getWindowManager().getDefaultDisplay().getWidth() * 0.833d), -2));
        }

        public static /* synthetic */ void a(PointDeductDialog pointDeductDialog, PointDeductAlert pointDeductAlert, View view) {
            Object[] objArr = {pointDeductDialog, pointDeductAlert, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa70f1fbb91b47f0bf9ae75a3192c7a6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa70f1fbb91b47f0bf9ae75a3192c7a6");
            } else {
                al.a(pointDeductDialog.getContext(), pointDeductAlert.getRuleContentUrl());
            }
        }

        public static /* synthetic */ void b(PointDeductDialog pointDeductDialog, View view) {
            Object[] objArr = {pointDeductDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03e6ead1daf6528bb451919061ba112a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03e6ead1daf6528bb451919061ba112a");
                return;
            }
            pointDeductDialog.dismiss();
            pointDeductDialog.a(false);
            com.meituan.android.paybase.common.analyse.a.a("pay_oz8cxjna", "签约支付-积分抵现弹窗-点击“不使用”", (Map<String, Object>) null, a.EnumC0329a.CLICK);
        }

        public static /* synthetic */ void a(PointDeductDialog pointDeductDialog, View view) {
            Object[] objArr = {pointDeductDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "393855c62fbf3a210f568d528084c6b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "393855c62fbf3a210f568d528084c6b0");
                return;
            }
            pointDeductDialog.dismiss();
            pointDeductDialog.a(true);
            com.meituan.android.paybase.common.analyse.a.a("pay_kooq1rzm", "签约支付-积分抵现弹窗-点击“使用”", (Map<String, Object>) null, a.EnumC0329a.CLICK);
        }

        private void a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a77a7c723813526b5bdbe0458269f6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a77a7c723813526b5bdbe0458269f6");
                return;
            }
            String str = z ? "1" : "0";
            HashMap hashMap = new HashMap();
            hashMap.put("bonus_points_switch", str);
            PayActivity.a(PointDeductDialogFragment.this.getActivity(), this.e.getSubmitUrl(), hashMap, this.f, 286, this);
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestSucc(int i, Object obj) {
            Object[] objArr = {Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca52079e6dd1e1e068b7d2fb65b8c061", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca52079e6dd1e1e068b7d2fb65b8c061");
            } else if (i == 286 && (obj instanceof BankInfo) && (this.g instanceof PayBaseActivity)) {
                if (com.meituan.android.pay.desk.component.data.a.b(PointDeductDialogFragment.this.getActivity())) {
                    com.meituan.android.pay.process.f.b((FragmentActivity) this.g, obj);
                } else {
                    com.meituan.android.pay.process.f.a((Activity) ((FragmentActivity) this.g)).c((PayBaseActivity) this.g, obj);
                }
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestException(int i, Exception exc) {
            Object[] objArr = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c9f985ec28ad83747bac445004ae48", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c9f985ec28ad83747bac445004ae48");
            } else if (this.g instanceof PayBaseActivity) {
                if (com.meituan.android.pay.desk.component.data.a.a((FragmentActivity) this.g)) {
                    com.meituan.android.pay.common.payment.utils.b.a((FragmentActivity) this.g, "degrade_campaign_url", com.meituan.android.pay.common.payment.utils.b.b((FragmentActivity) this.g, "current_url"));
                    com.meituan.android.pay.process.f.b((FragmentActivity) this.g, exc);
                    return;
                }
                s.a((PayBaseActivity) this.g, exc, 3);
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestFinal(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a00f9e04f7b74e190aaed98a3ad015", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a00f9e04f7b74e190aaed98a3ad015");
            } else if (this.g instanceof PayBaseActivity) {
                ((PayBaseActivity) this.g).hideProgress();
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestStart(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01ff64ade09a49b39a63221b5ae69551", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01ff64ade09a49b39a63221b5ae69551");
            } else if (this.g instanceof PayBaseActivity) {
                ((PayBaseActivity) this.g).b(com.meituan.android.paybase.common.utils.b.a());
            }
        }
    }
}
