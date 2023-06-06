package com.meituan.android.pay.dialogfragment;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.model.bean.AdjustNoPasswordCredit;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AdjustCreditDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private AdjustNoPasswordCredit b;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "AdjustCreditDialogFragment";
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81aceffeaba52988c4ffb17631c52117", RobustBitConfig.DEFAULT_VALUE) ? (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81aceffeaba52988c4ffb17631c52117") : new AdjustCreditDialog(getActivity(), this.b);
    }

    public static AdjustCreditDialogFragment a(AdjustNoPasswordCredit adjustNoPasswordCredit) {
        Object[] objArr = {adjustNoPasswordCredit};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "25b83bdf57280a09772654c5153725b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (AdjustCreditDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "25b83bdf57280a09772654c5153725b3");
        }
        AdjustCreditDialogFragment adjustCreditDialogFragment = new AdjustCreditDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("credit", adjustNoPasswordCredit);
        adjustCreditDialogFragment.setArguments(bundle);
        return adjustCreditDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d55e8178e7df876b6cb2563ee88f353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d55e8178e7df876b6cb2563ee88f353");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (AdjustNoPasswordCredit) com.sankuai.waimai.platform.utils.f.a(getArguments(), "credit");
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6afb33b5a1eb9dd580562c0a8ed08d77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6afb33b5a1eb9dd580562c0a8ed08d77");
        } else {
            super.onDetach();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class AdjustCreditDialog extends BaseDialog implements View.OnClickListener, com.meituan.android.paybase.retrofit.b {
        public static ChangeQuickRedirect a;
        private AdjustNoPasswordCredit b;
        private View e;
        private LinearLayout f;
        private Integer g;
        private int[] h;
        private Activity i;
        private HashMap<String, String> j;

        public AdjustCreditDialog(Activity activity, AdjustNoPasswordCredit adjustNoPasswordCredit) {
            super(activity, R.style.mpay__transparent_dialog);
            int i;
            Object[] objArr = {activity, adjustNoPasswordCredit};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0018831950cced26df19f8b169b10273", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0018831950cced26df19f8b169b10273");
                return;
            }
            this.j = new HashMap<>();
            this.i = activity;
            this.b = adjustNoPasswordCredit;
            this.g = Integer.valueOf(adjustNoPasswordCredit.getCreditDefault());
            this.h = this.b.getCreditOpt();
            this.e = View.inflate(getContext(), R.layout.mpay_adjust_credit_dialog, null);
            setContentView(this.e, new ViewGroup.LayoutParams((int) (activity.getWindowManager().getDefaultDisplay().getWidth() * 0.833d), -2));
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f88766395dd059764801ce54d2fb8e2c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f88766395dd059764801ce54d2fb8e2c");
            } else {
                if (this.h != null && this.h.length > 1 && this.h.length <= 3) {
                    if (!TextUtils.isEmpty(this.b.getTip())) {
                        ((TextView) this.e.findViewById(R.id.description)).setText(this.b.getTip());
                    }
                    this.f = (LinearLayout) this.e.findViewById(R.id.credit_container);
                    f();
                } else {
                    findViewById(R.id.credit_container).setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (TextUtils.isEmpty(this.b.getTip())) {
                        i = 0;
                    } else {
                        i = this.b.getTip().length();
                        spannableStringBuilder.append((CharSequence) this.b.getTip());
                    }
                    String str = this.g + getContext().getResources().getString(R.string.mpay__yuan_mei_bi);
                    int length = str.length();
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.mpay__adjust_credit_dialog_text_number)), i, length + i, 33);
                    ((TextView) this.e.findViewById(R.id.description)).setText(spannableStringBuilder);
                }
                if (!TextUtils.isEmpty(this.b.getTitle())) {
                    ((TextView) this.e.findViewById(R.id.title)).setText(this.b.getTitle());
                }
                if (!TextUtils.isEmpty(this.b.getTip()) && this.h != null && this.h.length > 1) {
                    ((TextView) this.e.findViewById(R.id.description)).setText(this.b.getTip());
                }
                if (!TextUtils.isEmpty(this.b.getCancelButton())) {
                    ((TextView) this.e.findViewById(R.id.cancel)).setText(this.b.getCancelButton());
                }
                if (!TextUtils.isEmpty(this.b.getAdjustButton())) {
                    ((TextView) this.e.findViewById(R.id.confirm)).setText(e());
                }
                findViewById(R.id.cancel).setOnClickListener(this);
                TextView textView = (TextView) findViewById(R.id.confirm);
                u.a(getContext(), textView);
                textView.setOnClickListener(this);
                findViewById(R.id.credit_text1).setOnClickListener(this);
                findViewById(R.id.credit_text2).setOnClickListener(this);
                findViewById(R.id.credit_text3).setOnClickListener(this);
            }
            setCanceledOnTouchOutside(false);
        }

        private void a(TextView textView, Drawable drawable) {
            Object[] objArr = {textView, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "259e38abae5e4f237c97a8ce548ddac2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "259e38abae5e4f237c97a8ce548ddac2");
            } else if (Build.VERSION.SDK_INT >= 16) {
                textView.setBackground(drawable);
            } else {
                textView.setBackgroundDrawable(drawable);
            }
        }

        private Drawable a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed3bbf249fe99bc515318c82f1f7786", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed3bbf249fe99bc515318c82f1f7786") : getContext().getResources().getDrawable(R.drawable.mpay_adjust_credit_text_background_selected);
        }

        private Drawable c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56c79b66b9466d954d47fdaae13dd01", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56c79b66b9466d954d47fdaae13dd01") : getContext().getResources().getDrawable(R.drawable.mpay_adjust_credit_text_background_default);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a84dcdc14ad4353c804c4db0c2a84ce", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a84dcdc14ad4353c804c4db0c2a84ce");
                return;
            }
            int id = view.getId();
            if (id == R.id.cancel) {
                d();
                com.meituan.android.paybase.common.analyse.a.a("b_268mub93", (Map<String, Object>) null);
            } else if (id != R.id.confirm) {
                if (id == R.id.credit_text1 || id == R.id.credit_text2 || id == R.id.credit_text3) {
                    this.g = Integer.valueOf(((TextView) view).getText().toString());
                    f();
                }
            } else {
                dismiss();
                if (!TextUtils.isEmpty(this.b.getSubmitUrl())) {
                    HashMap<String, String> hashMap = this.j;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.g);
                    hashMap.put("nopasswordpay_credit_new", sb.toString());
                    PayActivity.a(this.i, this.b.getSubmitUrl(), this.j, (HashMap<String, String>) null, 9, this);
                }
                com.meituan.android.paybase.common.analyse.a.a("b_df80om0h", new a.c().a("credit", this.g).b);
            }
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9df299ee817be1bc0e60b7c881f934f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9df299ee817be1bc0e60b7c881f934f9");
                return;
            }
            d();
            super.onBackPressed();
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56cb37889395d4334efa58a8dfc1f110", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56cb37889395d4334efa58a8dfc1f110");
                return;
            }
            if (isShowing()) {
                dismiss();
            }
            PayActivity.a(this.i);
        }

        private String e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79964975bcba1d942834151339a60b7f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79964975bcba1d942834151339a60b7f");
            }
            return this.b.getAdjustButton() + this.g + getContext().getResources().getString(R.string.mpay__yuan_mei_bi);
        }

        private void f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e32aac924ffbf629a3ddd7fa25229c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e32aac924ffbf629a3ddd7fa25229c");
                return;
            }
            for (int i = 0; i < this.h.length; i++) {
                TextView textView = (TextView) this.f.getChildAt(i);
                StringBuilder sb = new StringBuilder();
                sb.append(this.h[i]);
                textView.setText(sb.toString());
                if (this.g.intValue() == this.h[i]) {
                    textView.setTextColor(getContext().getResources().getColor(R.color.mpay__adjust_credit_dialog_text_number));
                    a(textView, a());
                } else {
                    textView.setTextColor(getContext().getResources().getColor(R.color.paybase__text_color_3));
                    a(textView, c());
                }
            }
            if (this.h.length == 2) {
                findViewById(R.id.credit_text3).setVisibility(8);
            }
            ((TextView) this.e.findViewById(R.id.confirm)).setText(e());
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestSucc(int i, Object obj) {
            Object[] objArr = {Integer.valueOf(i), obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c350c901daf8d4d371ea5cdfb2296f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c350c901daf8d4d371ea5cdfb2296f3");
                return;
            }
            BankInfo bankInfo = (BankInfo) obj;
            String pageMessage = bankInfo.getPageMessage();
            if (!TextUtils.isEmpty(pageMessage)) {
                if (bankInfo.isAdjustNoPasswordPaySuccess()) {
                    com.meituan.android.paybase.common.analyse.a.a("b_1dmwavv5", (Map<String, Object>) null);
                    com.meituan.android.paybase.dialog.e.a((Dialog) this, pageMessage, (String) null, e.a.TOAST_TYPE_SUCCESS, false);
                } else {
                    com.meituan.android.paybase.common.analyse.a.a("b_kej4bfq4", (Map<String, Object>) null);
                    com.meituan.android.paybase.dialog.e.a((Dialog) this, pageMessage, (String) null, e.a.TOAST_TYPE_EXCEPTION, false);
                }
                bankInfo.setPageMessage("");
            }
            if (this.i instanceof PayActivity) {
                com.meituan.android.pay.process.f.a((Activity) ((PayActivity) this.i)).c((PayActivity) this.i, bankInfo);
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestException(int i, Exception exc) {
            Object[] objArr = {Integer.valueOf(i), exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbfb22b591811e51bd764ffb9a8ed9a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbfb22b591811e51bd764ffb9a8ed9a3");
            } else if (this.i instanceof PayActivity) {
                s.a((PayActivity) this.i, exc, 3);
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestFinal(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829ca324a1cceec27e39e2204a05f832", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829ca324a1cceec27e39e2204a05f832");
            } else if (this.i instanceof PayActivity) {
                ((PayActivity) this.i).hideProgress();
            }
        }

        @Override // com.meituan.android.paybase.retrofit.b
        public void onRequestStart(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71cfad86c53f7ec8e0f105786e4443ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71cfad86c53f7ec8e0f105786e4443ed");
            } else if (this.i instanceof PayActivity) {
                ((PayActivity) this.i).b(com.meituan.android.paybase.common.utils.b.a());
            }
        }
    }
}
