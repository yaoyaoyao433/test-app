package com.meituan.android.legwork.ui.dialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.legwork.bean.PayTypeBean;
import com.meituan.android.legwork.ui.base.BaseDialogFragment;
import com.meituan.android.legwork.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayTypeFragment extends BaseDialogFragment {
    public static ChangeQuickRedirect b;
    public int c;
    public PayTypeBean d;
    public int e;
    public View f;
    public TextView g;
    public a h;
    private int i;
    private int j;
    private int k;
    private int l;
    private ImageView m;
    private View n;
    private TextView o;
    private TextView p;
    private View q;
    private View r;
    private TextView s;
    private TextView t;
    private ImageView u;
    private ImageView v;
    private TextView w;
    private boolean x;
    private boolean y;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i);

        void a(PayTypeBean payTypeBean);

        void a(boolean z, String str, int i);
    }

    public static PayTypeFragment a(int i, int i2, PayTypeBean payTypeBean, int i3, int i4, int i5, int i6) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), payTypeBean, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be53b86a6795d7819928294ed5f3ee2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayTypeFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be53b86a6795d7819928294ed5f3ee2f");
        }
        PayTypeFragment payTypeFragment = new PayTypeFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("pay_type_from", i);
        bundle.putInt("pay_type_action", i2);
        bundle.putSerializable("pay_type_bean", payTypeBean);
        bundle.putInt("balance_btn_status", i3);
        bundle.putInt(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, i4);
        bundle.putInt(Constants.PRIVACY.KEY_LONGITUDE, i5);
        bundle.putInt(Constants.PRIVACY.KEY_LATITUDE, i6);
        payTypeFragment.setArguments(bundle);
        return payTypeFragment;
    }

    @Override // com.meituan.android.legwork.ui.base.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548ab5bb1c324c0634a067b30eaf8e09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548ab5bb1c324c0634a067b30eaf8e09");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() == null) {
            dismiss();
            return;
        }
        a();
        Bundle arguments = getArguments();
        this.i = arguments.getInt("pay_type_from");
        this.c = arguments.getInt("pay_type_action");
        this.d = (PayTypeBean) com.sankuai.waimai.platform.utils.f.a(arguments, "pay_type_bean");
        this.e = arguments.getInt("balance_btn_status");
        this.j = arguments.getInt(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE);
        this.k = arguments.getInt(Constants.PRIVACY.KEY_LONGITUDE);
        this.l = arguments.getInt(Constants.PRIVACY.KEY_LATITUDE);
        if (this.d == null) {
            dismiss();
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32db488f2bb84043f2f08c7dedc2ac82", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32db488f2bb84043f2f08c7dedc2ac82");
        }
        this.f = layoutInflater.inflate(R.layout.legwork_fragment_pay_mode, viewGroup, false);
        this.m = (ImageView) this.f.findViewById(R.id.legwork_pay_mode_close);
        this.s = (TextView) this.f.findViewById(R.id.pay_mode_description);
        this.w = (TextView) this.f.findViewById(R.id.pay_mode_tips);
        this.q = this.f.findViewById(R.id.legwork_balance_container);
        this.r = this.f.findViewById(R.id.pay_mode_online_container);
        this.u = (ImageView) this.f.findViewById(R.id.pay_mode_online_checkbox);
        this.v = (ImageView) this.f.findViewById(R.id.pay_mode_balance_checkbox);
        this.g = (TextView) this.f.findViewById(R.id.pay_mode_balance_title);
        this.n = this.f.findViewById(R.id.pay_mode_balance_charge_container);
        this.o = (TextView) this.f.findViewById(R.id.pay_mode_balance_charge_description);
        this.p = (TextView) this.f.findViewById(R.id.pay_mode_charge_entrance);
        this.t = (TextView) this.f.findViewById(R.id.legwork_pay_mode_btn);
        b();
        return this.f;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626948f670e4a014960d939eebf5dac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626948f670e4a014960d939eebf5dac2");
            return;
        }
        this.m.setOnClickListener(o.a(this));
        if (this.c == 2) {
            this.s.setText(getString(R.string.legwork_pay_mode_dialog_sub_title_tipfee, com.meituan.android.legwork.utils.f.a(this.d.orderTotal)));
        } else if (this.c == 5) {
            this.s.setText(getString(R.string.legwork_pay_mode_dialog_sub_title_change_order, com.meituan.android.legwork.utils.f.a(this.d.orderTotal)));
        } else if (this.c != 4) {
            this.s.setText(getString(R.string.legwork_pay_mode_dialog_sub_title, com.meituan.android.legwork.utils.f.a(this.d.orderTotal)));
        }
        if (this.j == 16002 && !this.d.isBalanceDegrade() && !this.u.isSelected() && !this.d.isBalanceSufficient(this.d.orderTotal)) {
            this.w.setVisibility(0);
        } else {
            this.w.setVisibility(8);
        }
        if (this.j == 16010 && !TextUtils.isEmpty(this.d.getAmountErrorText)) {
            ab.a(this.f, this.d.getAmountErrorText);
        }
        switch (this.e) {
            case 1:
                b(0);
                a(false);
                this.v.setEnabled(false);
                this.v.setSelected(true);
                break;
            case 2:
                b(0);
                a(false);
                this.v.setEnabled(false);
                this.v.setClickable(false);
                break;
            case 3:
                b(0);
                a(true);
                this.v.setEnabled(true);
                this.v.setSelected(false);
                break;
            case 4:
                b(0);
                a(true);
                this.v.setEnabled(true);
                this.v.setSelected(true);
                break;
            case 5:
                b(8);
                break;
        }
        this.u.setSelected(this.d.orderPayType == 1);
        if (!this.v.isEnabled() && this.d.isChargeShow() && !this.d.isBalanceDegrade()) {
            if (!TextUtils.isEmpty(this.d.payTypePopText)) {
                this.n.setVisibility(0);
                this.n.setOnClickListener(p.a(this));
                this.o.setText(this.d.payTypePopText);
                this.p.setVisibility(8);
            } else {
                this.p.setVisibility(0);
                this.p.setOnClickListener(q.a(this));
                this.n.setVisibility(8);
            }
            a(false, "b_banma_qxl6rkzd_mv", c());
        } else {
            this.n.setVisibility(8);
            this.p.setVisibility(8);
        }
        e();
        this.q.setOnClickListener(r.a(this));
        this.r.setOnClickListener(s.a(this));
        this.t.setOnClickListener(t.a(this));
        a(false, "b_banma_hiwynxmi_mv", this.d.getPayType());
    }

    public static /* synthetic */ void f(PayTypeFragment payTypeFragment, View view) {
        Object[] objArr = {payTypeFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4af1ac5bedfa583669ed8ebcbaf0583f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4af1ac5bedfa583669ed8ebcbaf0583f");
            return;
        }
        payTypeFragment.a(true, "b_banma_6f9g4n0w_mc", payTypeFragment.c());
        payTypeFragment.dismiss();
    }

    public static /* synthetic */ void e(PayTypeFragment payTypeFragment, View view) {
        Object[] objArr = {payTypeFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae53448fb347e590b207458a43edf737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae53448fb347e590b207458a43edf737");
        } else {
            payTypeFragment.d();
        }
    }

    public static /* synthetic */ void d(PayTypeFragment payTypeFragment, View view) {
        Object[] objArr = {payTypeFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a58566d41e2892e05812a247d31adf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a58566d41e2892e05812a247d31adf1");
        } else {
            payTypeFragment.d();
        }
    }

    public static /* synthetic */ void c(PayTypeFragment payTypeFragment, View view) {
        Object[] objArr = {payTypeFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fe75283f9c5a85b4a285c0eb912bd28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fe75283f9c5a85b4a285c0eb912bd28");
            return;
        }
        payTypeFragment.a(true, "b_banma_2jrn0mui_mc", 3);
        if (!payTypeFragment.v.isEnabled() || payTypeFragment.v.isSelected()) {
            return;
        }
        boolean z = !payTypeFragment.v.isSelected();
        payTypeFragment.v.setSelected(z);
        if (z) {
            payTypeFragment.u.setSelected(false);
            payTypeFragment.e = 4;
            com.meituan.android.legwork.utils.y.a().a(3);
        } else {
            payTypeFragment.e = 3;
        }
        payTypeFragment.e();
    }

    public static /* synthetic */ void b(PayTypeFragment payTypeFragment, View view) {
        Object[] objArr = {payTypeFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f07b7ed6a183f262b4bf0bebeb27f52e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f07b7ed6a183f262b4bf0bebeb27f52e");
            return;
        }
        payTypeFragment.a(true, "b_banma_2jrn0mui_mc", 1);
        if (payTypeFragment.u.isSelected()) {
            return;
        }
        boolean z = !payTypeFragment.u.isSelected();
        payTypeFragment.u.setSelected(z);
        if (z) {
            if (!payTypeFragment.v.isEnabled() && payTypeFragment.v.isSelected()) {
                payTypeFragment.v.setSelected(false);
                payTypeFragment.e = 2;
            } else if (payTypeFragment.v.isEnabled() && payTypeFragment.v.isSelected()) {
                payTypeFragment.v.setSelected(false);
                payTypeFragment.e = 3;
            }
            payTypeFragment.w.setVisibility(8);
            com.meituan.android.legwork.utils.y.a().a(1);
        }
        payTypeFragment.e();
    }

    public static /* synthetic */ void a(PayTypeFragment payTypeFragment, View view) {
        int i = 0;
        Object[] objArr = {payTypeFragment, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a067c5c0d2d7be1fb8f49007572edc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a067c5c0d2d7be1fb8f49007572edc4");
        } else if (payTypeFragment.h != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, payTypeFragment, changeQuickRedirect2, false, "857ec12d9174640bd369c2b7dbc31105", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, payTypeFragment, changeQuickRedirect2, false, "857ec12d9174640bd369c2b7dbc31105")).intValue();
            } else if (payTypeFragment.v == null) {
                i = payTypeFragment.e;
            } else if (payTypeFragment.v.isEnabled() && payTypeFragment.v.isSelected()) {
                i = 3;
            } else if (payTypeFragment.u.isSelected()) {
                i = 1;
            }
            payTypeFragment.h.a(i);
            payTypeFragment.a(true, "b_banma_44dy2qx5_mc", i);
            payTypeFragment.y = true;
            payTypeFragment.dismiss();
        }
    }

    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8e7d3e00566de61a131282db52db2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8e7d3e00566de61a131282db52db2f");
            return;
        }
        this.q.setVisibility(i);
        this.f.findViewById(R.id.legwork_pay_mode_balance_line_top).setVisibility(i);
    }

    @Override // com.meituan.android.legwork.ui.base.BaseDialogFragment, android.support.v4.app.DialogFragment
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af716ddd10a097c943b33a9c791b0202", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af716ddd10a097c943b33a9c791b0202");
            return;
        }
        super.dismiss();
        if (!this.y && this.h != null) {
            this.h.a();
        }
        this.y = false;
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5aa78713adf75757ff149b652679c124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5aa78713adf75757ff149b652679c124");
            return;
        }
        super.onCancel(dialogInterface);
        if (this.h != null) {
            this.h.a();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043cd7b60a33bc1dad785092bcd5723a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043cd7b60a33bc1dad785092bcd5723a");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourceViewType", 2);
        if (this.k > 0 || this.l > 0) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(Constants.PRIVACY.KEY_LONGITUDE, Integer.valueOf(this.k));
            jsonObject.addProperty(Constants.PRIVACY.KEY_LATITUDE, Integer.valueOf(this.l));
            hashMap.put("jsonParam", jsonObject.toString());
        }
        com.meituan.android.legwork.mrn.b.a().a(getActivity(), "legwork", "legwork-rechargelist", hashMap);
        this.x = true;
        a(true, "b_banma_qxl6rkzd_mc", c());
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d131673efb56d3624b06f31aab661d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d131673efb56d3624b06f31aab661d9");
            return;
        }
        super.onResume();
        if (this.x) {
            this.x = false;
            if (this.h != null) {
                this.h.a(this.d);
            }
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef51bda7f9bc2759cca999de196b3b77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef51bda7f9bc2759cca999de196b3b77");
        } else if (z) {
            this.g.setEnabled(true);
            this.g.setText(getString(R.string.legwork_pay_mode_balance_amount, com.meituan.android.legwork.utils.f.a(this.d.balanceAmount)));
        } else {
            this.g.setEnabled(false);
            this.g.setText(getString(R.string.legwork_pay_mode_balance_amount_insufficient, com.meituan.android.legwork.utils.f.a(this.d.balanceAmount)));
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0596ad493a99cf00cfd3b5250b68a50c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0596ad493a99cf00cfd3b5250b68a50c");
        } else if ((this.v.isEnabled() && this.v.isSelected()) || this.u.isSelected()) {
            this.t.setEnabled(true);
        } else {
            this.t.setEnabled(false);
        }
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e104d2f54d2f3c85b9f389d98324d72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e104d2f54d2f3c85b9f389d98324d72")).intValue();
        }
        if (this.v == null) {
            return 0;
        }
        if (this.v.isSelected()) {
            return 3;
        }
        return this.u.isSelected() ? 1 : 0;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5123edffe699a2fb04096de8ccdcccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5123edffe699a2fb04096de8ccdcccb");
        } else {
            super.onDestroy();
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb1958385c211f1e357faed7b9521d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb1958385c211f1e357faed7b9521d6");
            return;
        }
        super.onStart();
        a(R.color.legwork_common_bg_color_transparent);
    }

    private void a(boolean z, String str, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcb4f6cd7a48b84baec2df9e644b9b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcb4f6cd7a48b84baec2df9e644b9b75");
        } else if (this.h == null) {
        } else {
            this.h.a(z, str, i);
        }
    }
}
