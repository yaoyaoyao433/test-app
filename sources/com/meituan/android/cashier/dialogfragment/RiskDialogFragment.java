package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.fragment.MTCashierRevisionFragment;
import com.meituan.android.cashier.model.bean.PayResult;
import com.meituan.android.cashier.model.bean.PopUp;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RiskDialogFragment extends MTPayBaseDialogFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    public HashMap<String, Object> b;
    public HashMap<String, Object> c;
    private PayResult d;
    private PopUp e;
    private String f;
    private com.meituan.android.paybase.retrofit.b g;
    private MTCashierRevisionFragment k;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return null;
    }

    public static /* synthetic */ void a(RiskDialogFragment riskDialogFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, riskDialogFragment, changeQuickRedirect, false, "1748653725849fc058b1ecc67c2163f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, riskDialogFragment, changeQuickRedirect, false, "1748653725849fc058b1ecc67c2163f4");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, riskDialogFragment, changeQuickRedirect2, false, "0ff914fd89c009e0fd2f36b5a361f928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, riskDialogFragment, changeQuickRedirect2, false, "0ff914fd89c009e0fd2f36b5a361f928");
        } else {
            q.a("thirdpay_riskverify_start", riskDialogFragment.c, (List<Float>) null, riskDialogFragment.e());
        }
        al.a(riskDialogFragment, riskDialogFragment.e.getUrl(), i);
    }

    public static RiskDialogFragment a(PayResult payResult) {
        Object[] objArr = {payResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce04bec98e9e8632aec197570f048acf", RobustBitConfig.DEFAULT_VALUE)) {
            return (RiskDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce04bec98e9e8632aec197570f048acf");
        }
        RiskDialogFragment riskDialogFragment = new RiskDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("pay_result_bean", payResult);
        riskDialogFragment.setArguments(bundle);
        return riskDialogFragment;
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2c663b972c3891ceb62539f7d00ff2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2c663b972c3891ceb62539f7d00ff2d");
            return;
        }
        super.onAttach(activity);
        if (this.k != null) {
            this.g = this.k;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df98f9fd0be09757ae275135827e2a52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df98f9fd0be09757ae275135827e2a52");
        } else {
            super.onDetach();
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054e5df280778c296ea59c6a1dce4798", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054e5df280778c296ea59c6a1dce4798");
        }
        setCancelable(false);
        return new RiskDialog(getContext(), this.e, this.f);
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc79c9cbb52960d782b834fb0ef664ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc79c9cbb52960d782b834fb0ef664ed");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.d = (PayResult) com.sankuai.waimai.platform.utils.f.a(getArguments(), "pay_result_bean");
            if (this.d != null) {
                this.e = this.d.getPopUp();
                this.f = this.d.getPayType();
            }
        }
        this.k = (MTCashierRevisionFragment) getParentFragment();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bca8820f1fe9dc2083ab526306913ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bca8820f1fe9dc2083ab526306913ed");
            return;
        }
        this.b = q.a();
        this.c = new HashMap<>();
        if (!TextUtils.isEmpty(this.e.getOrderId())) {
            this.b.put("pay_order_id", this.e.getOrderId());
        }
        if (TextUtils.isEmpty(g())) {
            return;
        }
        this.b.put("pop_scene", g());
        this.c.put("pop_scene", g());
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108ff1e70033f66bf57b0e60262dfa1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108ff1e70033f66bf57b0e60262dfa1e");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        dismiss();
        if (i == 66) {
            if (i2 == 10 && intent != null) {
                try {
                    String string = new JSONObject(com.sankuai.waimai.platform.utils.f.a(intent, "resultData")).getString("payToken");
                    if (TextUtils.isEmpty(string)) {
                        b(this.f, this.e.getOrderId(), "1");
                    } else {
                        b(this.f, this.e.getOrderId(), "1", string);
                    }
                } catch (JSONException e) {
                    b(this.f, this.e.getOrderId(), "1");
                    com.meituan.android.paybase.common.analyse.a.a(e, "RiskDialogFragment_resultDataJson", (Map<String, Object>) null);
                }
            } else {
                b(this.f, this.e.getOrderId(), "1");
            }
        } else if (i != 88) {
            b(this.f, this.e.getOrderId(), "2");
        } else if (i2 == 10) {
            b(this.f, this.e.getOrderId(), "2", null);
        } else {
            b(this.f, this.e.getOrderId(), "2");
        }
        com.meituan.android.privacy.aop.a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bbbfcd17332d16b13ed0d81e674ee25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bbbfcd17332d16b13ed0d81e674ee25");
        } else if (this.k != null) {
            PayParams c = this.k.c();
            getActivity();
            this.k.a(com.meituan.android.cashier.retrofit.a.a(c, ""));
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82857a9bf0d42974576de27291bf7e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82857a9bf0d42974576de27291bf7e25");
        } else {
            this.k.a(str, str2, str3, "2", (String) null);
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9e23d43f012883d5356c9c6a84ee460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9e23d43f012883d5356c9c6a84ee460");
        } else {
            this.k.a(str, str2, str3, "1", str4);
        }
    }

    private void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f42bdf9fcd802216e42aac69c9376b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f42bdf9fcd802216e42aac69c9376b4");
            return;
        }
        a(str, str2, str3);
        i();
    }

    private void b(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a966e1afc80e26bc9fea7b8914948887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a966e1afc80e26bc9fea7b8914948887");
            return;
        }
        a(str, str2, str3, str4);
        h();
        f();
    }

    private String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03398b0089a5b1e7b972c77b542068af", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03398b0089a5b1e7b972c77b542068af");
        }
        if (TextUtils.isEmpty(this.e.getType()) || TextUtils.isEmpty(this.e.getSubtype())) {
            return "";
        }
        return this.e.getType() + CommonConstant.Symbol.UNDERLINE + this.e.getSubtype();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf4fdc0d2fbc6d153ac261c1c6161c41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf4fdc0d2fbc6d153ac261c1c6161c41");
            return;
        }
        q.b("b_pay_risk_check_success_sc", this.b, e());
        q.a("thirdpay_riskverify_success", this.c, (List<Float>) null, e());
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac726f9f9bfd4f2c96aaf79a6dd37c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac726f9f9bfd4f2c96aaf79a6dd37c3b");
        } else {
            q.a("thirdpay_riskverify_fail", this.c, (List<Float>) null, e());
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54eca0c8b615cb0c4e316ce4cd1c0ea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54eca0c8b615cb0c4e316ce4cd1c0ea0");
        } else if (i != 1 || this.g == null) {
        } else {
            this.g.onRequestSucc(i, obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667a4a7b6434d0f5afc124ade154f5d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667a4a7b6434d0f5afc124ade154f5d1");
        } else if (i != 1 || this.g == null) {
        } else {
            this.g.onRequestException(i, exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64101288098781903c69092bd61c053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64101288098781903c69092bd61c053");
        } else if (i != 1 || this.g == null) {
        } else {
            this.g.onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6492c92b1b85ccc3b7fe26c9b6d1df3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6492c92b1b85ccc3b7fe26c9b6d1df3");
        } else if (i != 1 || this.g == null) {
        } else {
            this.g.onRequestStart(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class RiskDialog extends BaseDialog {
        public static ChangeQuickRedirect a;
        private PopUp e;
        private String f;

        public RiskDialog(Context context, PopUp popUp, String str) {
            super(context, R.style.mpay__transparent_dialog);
            Object[] objArr = {RiskDialogFragment.this, context, popUp, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6204bbadb92bbe12c08704889f4afcd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6204bbadb92bbe12c08704889f4afcd");
                return;
            }
            this.e = popUp;
            this.f = str;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df06702e3496715c44c566a5d0076ffa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df06702e3496715c44c566a5d0076ffa");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "09fdae8b9b900f08436bcf0c5f737df4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "09fdae8b9b900f08436bcf0c5f737df4");
            } else {
                q.a("c_PJmoK", "b_pay_htzirx3b_mv", "收银台首页-风险弹窗", RiskDialogFragment.this.b, ae.a.VIEW, b());
            }
            setContentView(R.layout.cashier__risk_dialog);
            ((TextView) findViewById(R.id.risk_dialog_title)).setText(this.e.getTitle());
            ((TextView) findViewById(R.id.risk_dialog_body)).setText(this.e.getBody());
            if (TextUtils.equals(this.e.getType(), "riskHint") && TextUtils.equals(this.e.getSubtype(), "origin")) {
                TextView textView = (TextView) findViewById(R.id.risk_dialog_left_button);
                textView.setText(this.e.getConfirmButton());
                TextView textView2 = (TextView) findViewById(R.id.risk_dialog_right_button);
                textView2.setText(this.e.getCancelButton());
                textView.setOnClickListener(c.a(this));
                textView2.setOnClickListener(d.a(this));
            } else if (TextUtils.equals(this.e.getType(), "riskVerify")) {
                TextView textView3 = (TextView) findViewById(R.id.risk_dialog_left_button);
                textView3.setText(this.e.getCancelButton());
                TextView textView4 = (TextView) findViewById(R.id.risk_dialog_right_button);
                textView4.setText(this.e.getConfirmButton());
                textView3.setOnClickListener(e.a(this));
                textView4.setOnClickListener(f.a(this));
            }
        }

        public static /* synthetic */ void d(RiskDialog riskDialog, View view) {
            Object[] objArr = {riskDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a7ac75f66336b5cfa6119533da58870", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a7ac75f66336b5cfa6119533da58870");
                return;
            }
            riskDialog.a();
            RiskDialogFragment.this.a(riskDialog.f, riskDialog.e.getOrderId(), "0", null);
            riskDialog.dismiss();
            RiskDialogFragment.this.f();
        }

        public static /* synthetic */ void c(RiskDialog riskDialog, View view) {
            Object[] objArr = {riskDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf2f7fc405b98af6de734b6e3e5a3cb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf2f7fc405b98af6de734b6e3e5a3cb6");
                return;
            }
            RiskDialogFragment.this.a(riskDialog.f, riskDialog.e.getOrderId(), "0");
            riskDialog.dismiss();
        }

        public static /* synthetic */ void b(RiskDialog riskDialog, View view) {
            Object[] objArr = {riskDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c77fe43a34e603650a003d59062784f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c77fe43a34e603650a003d59062784f");
                return;
            }
            if (TextUtils.equals(riskDialog.e.getSubtype(), "verifyCenter")) {
                RiskDialogFragment.this.a(riskDialog.f, riskDialog.e.getOrderId(), "1");
            } else if (TextUtils.equals(riskDialog.e.getSubtype(), "question")) {
                RiskDialogFragment.this.a(riskDialog.f, riskDialog.e.getOrderId(), "2");
            }
            riskDialog.dismiss();
        }

        public static /* synthetic */ void a(RiskDialog riskDialog, View view) {
            Object[] objArr = {riskDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd8ab050e20b6f7700f0be6d3cb2a3a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd8ab050e20b6f7700f0be6d3cb2a3a8");
                return;
            }
            riskDialog.a();
            if (TextUtils.equals(riskDialog.e.getSubtype(), "verifyCenter")) {
                RiskDialogFragment.a(RiskDialogFragment.this, 66);
            } else if (TextUtils.equals(riskDialog.e.getSubtype(), "question")) {
                RiskDialogFragment.a(RiskDialogFragment.this, 88);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, riskDialog, changeQuickRedirect2, false, "14e9ae2135438d9b523c7432284da8e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, riskDialog, changeQuickRedirect2, false, "14e9ae2135438d9b523c7432284da8e4");
                return;
            }
            riskDialog.findViewById(R.id.risk_dialog_content).setVisibility(8);
            if (riskDialog.getWindow() != null) {
                riskDialog.getWindow().setDimAmount(0.0f);
            }
            new Handler().post(g.a(riskDialog));
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8c37e0a68a789795af378907fee5f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8c37e0a68a789795af378907fee5f7");
                return;
            }
            RiskDialogFragment.this.b.put("button_name", this.e.getConfirmButton());
            q.a("c_PJmoK", "b_pay_htzirx3b_mc", "收银台首页-风险弹窗点击继续支付或申请解除限制按钮", RiskDialogFragment.this.b, ae.a.CLICK, b());
        }

        public static /* synthetic */ void a(RiskDialog riskDialog) {
            Object[] objArr = {riskDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28af0226576b4a76015c5cddfb5cf243", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28af0226576b4a76015c5cddfb5cf243");
            } else {
                riskDialog.d.d();
            }
        }
    }
}
