package com.meituan.android.pay.dialogfragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.pay.common.payment.bean.Contracts;
import com.meituan.android.pay.common.payment.bean.DelayPayOpenInfoBean;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.pay.retrofit.PayRequestService;
import com.meituan.android.pay.utils.s;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.widgets.bankcard.RoundImageView;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DelayPayGuideDialogFragment extends MTPayBaseDialogFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    String e;
    @MTPayNeedToPersist
    private DelayPayOpenInfoBean f;
    private MTPayment g;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "DelayPayGuideDialogFragment";
    }

    public static DelayPayGuideDialogFragment a(MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ce981e9d8b2a751e7280f9e57cc0d54", RobustBitConfig.DEFAULT_VALUE)) {
            return (DelayPayGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ce981e9d8b2a751e7280f9e57cc0d54");
        }
        DelayPayGuideDialogFragment delayPayGuideDialogFragment = new DelayPayGuideDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("MTPayment", mTPayment);
        delayPayGuideDialogFragment.setArguments(bundle);
        return delayPayGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5b78cfba4a4af79cb99d691ebd27c3", RobustBitConfig.DEFAULT_VALUE) ? (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5b78cfba4a4af79cb99d691ebd27c3") : new DelayPayGuideDialog(getContext(), this.f);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc94a1ee3aa0b5a6e998b558a82bd69b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc94a1ee3aa0b5a6e998b558a82bd69b");
        } else {
            super.onDetach();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfcc665aaeda2e022e86187cf1a128f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfcc665aaeda2e022e86187cf1a128f8");
        } else {
            super.onDestroy();
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08a97e169141c69a5b2b79e61a5909c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08a97e169141c69a5b2b79e61a5909c");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.g = (MTPayment) com.sankuai.waimai.platform.utils.f.a(getArguments(), "MTPayment");
        }
        if (this.g != null) {
            this.f = this.g.getDelayPayOpenInfo();
            this.b = this.g.getSubmitUrl();
            this.c = this.g.getPayType();
            this.d = this.g.getPayTypeUniqueKey();
            this.e = this.g.getTransparentAttributes();
        }
        setCancelable(false);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31b4406e046d6673484ee031c5707c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31b4406e046d6673484ee031c5707c10");
        } else if (i == 211 && (obj instanceof BankInfo)) {
            com.meituan.android.pay.process.f.a((Activity) getActivity()).c(getActivity(), (BankInfo) obj);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc24cb27771c79af040f75939393d0f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc24cb27771c79af040f75939393d0f0");
        } else if (i == 211) {
            s.b(getActivity(), exc, 3);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d6fb82d635d589dbb3dc33fd72707c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d6fb82d635d589dbb3dc33fd72707c");
        } else if (getActivity() instanceof PayActivity) {
            ((PayActivity) getActivity()).hideProgress();
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20af23e2ce019228836da402c149627e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20af23e2ce019228836da402c149627e");
        } else if (getActivity() instanceof PayActivity) {
            ((PayActivity) getActivity()).b(com.meituan.android.paybase.common.utils.b.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class DelayPayGuideDialog extends BaseDialog {
        public static ChangeQuickRedirect a;
        private final DelayPayOpenInfoBean e;
        private boolean f;
        private CheckBox g;
        private TextView h;
        private Runnable i;

        @SuppressLint({"InflateParams"})
        public DelayPayGuideDialog(Context context, DelayPayOpenInfoBean delayPayOpenInfoBean) {
            super(context, R.style.mpay__transparent_dialog);
            Object[] objArr = {DelayPayGuideDialogFragment.this, context, delayPayOpenInfoBean};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a29198f46defdacb4d2fbe1e50e9fe50", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a29198f46defdacb4d2fbe1e50e9fe50");
                return;
            }
            this.f = false;
            this.e = delayPayOpenInfoBean;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ab225e1533c3e00b49ee6d96cf4cad9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ab225e1533c3e00b49ee6d96cf4cad9");
                return;
            }
            setCanceledOnTouchOutside(false);
            setContentView(R.layout.mpay__delay_pay_guide_dialog);
            ((TextView) findViewById(R.id.delay_pay_guide_dialog_title)).setText(this.e.getMainTitle());
            ((TextView) findViewById(R.id.delay_pay_guide_dialog_subtitle)).setText(this.e.getSubtitle());
            RoundImageView roundImageView = (RoundImageView) findViewById(R.id.delay_pay_guide_img);
            w.a(this.e.getImgUrl(), roundImageView, R.color.white, R.color.white);
            float applyDimension = TypedValue.applyDimension(1, 6.0f, getContext().getResources().getDisplayMetrics());
            roundImageView.a(applyDimension, applyDimension, applyDimension, applyDimension);
            this.h = (TextView) findViewById(R.id.delay_pay_guide_dialog_toast_ensure);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f57a71172370983221dcd525d6de124f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f57a71172370983221dcd525d6de124f");
            } else {
                this.g = (CheckBox) findViewById(R.id.delay_pay_guide_dialog_contract_checkbox);
                this.g.setOnClickListener(e.a(this));
                List<Contracts> contracts = this.e.getContracts();
                if (!com.meituan.android.paybase.utils.i.a((Collection) contracts)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.e.getContractPrefix());
                    for (final Contracts contracts2 : contracts) {
                        spannableStringBuilder.append((CharSequence) contracts2.getContractTitle());
                        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.meituan.android.pay.dialogfragment.DelayPayGuideDialogFragment.DelayPayGuideDialog.1
                            public static ChangeQuickRedirect a;

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(@NonNull View view) {
                                Object[] objArr4 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "65e590343c76c7e6beabf4a383e159e1", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "65e590343c76c7e6beabf4a383e159e1");
                                } else {
                                    al.a(DelayPayGuideDialog.this.getContext(), contracts2.getContractUrl());
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(@NonNull TextPaint textPaint) {
                                Object[] objArr4 = {textPaint};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "24dab091bf4933e295a8b92e99b5e705", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "24dab091bf4933e295a8b92e99b5e705");
                                    return;
                                }
                                super.updateDrawState(textPaint);
                                textPaint.setUnderlineText(false);
                            }
                        }, spannableStringBuilder.length() - contracts2.getContractTitle().length(), spannableStringBuilder.length(), 17);
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.mpay__delay_pay_guide_dialog_contract_prefix)), 0, this.e.getContractPrefix().length(), 17);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.mpay__delay_pay_guide_dialog_contract_name)), this.e.getContractPrefix().length(), spannableStringBuilder.length(), 17);
                    TextView textView = (TextView) findViewById(R.id.delay_pay_guide_dialog_contract_content);
                    textView.setText(spannableStringBuilder);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setHighlightColor(getContext().getResources().getColor(17170445));
                }
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4612180ead95f9f1fec829d791a46833", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4612180ead95f9f1fec829d791a46833");
            } else {
                TextView textView2 = (TextView) findViewById(R.id.delay_pay_guide_dialog_confirm_button);
                textView2.setText(this.e.getConfirmButtonName());
                textView2.setOnClickListener(f.a(this));
                TextView textView3 = (TextView) findViewById(R.id.delay_pay_guide_dialog_cancel_button);
                textView3.setText(this.e.getCancelButtonName());
                textView3.setOnClickListener(g.a(this));
            }
            com.meituan.android.pay.common.analyse.b.a("c_pay_lpq0tqlz", "b_pay_i3id2pir_mv", "", c(), b());
        }

        public static /* synthetic */ void c(DelayPayGuideDialog delayPayGuideDialog, View view) {
            Object[] objArr = {delayPayGuideDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "267b0b6c3c9bfcda694687fb8acddbd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "267b0b6c3c9bfcda694687fb8acddbd6");
                return;
            }
            delayPayGuideDialog.f = !delayPayGuideDialog.f;
            delayPayGuideDialog.g.setChecked(delayPayGuideDialog.f);
            if (delayPayGuideDialog.f) {
                delayPayGuideDialog.h.setVisibility(8);
            }
        }

        public static /* synthetic */ void b(DelayPayGuideDialog delayPayGuideDialog, View view) {
            Object[] objArr = {delayPayGuideDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e905873f63171702f3ab0375c6eb700", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e905873f63171702f3ab0375c6eb700");
                return;
            }
            HashMap<String, Object> c = delayPayGuideDialog.c();
            if (!delayPayGuideDialog.f) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, delayPayGuideDialog, changeQuickRedirect2, false, "446b5bea947c3b8ba2df84ae1ec50a94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, delayPayGuideDialog, changeQuickRedirect2, false, "446b5bea947c3b8ba2df84ae1ec50a94");
                } else {
                    if (delayPayGuideDialog.h.getVisibility() == 8) {
                        delayPayGuideDialog.h.setVisibility(0);
                    }
                    delayPayGuideDialog.i = h.a(delayPayGuideDialog);
                    delayPayGuideDialog.h.postDelayed(delayPayGuideDialog.i, PayTask.j);
                }
            } else {
                if (delayPayGuideDialog.h != null) {
                    delayPayGuideDialog.h.setVisibility(8);
                }
                delayPayGuideDialog.a();
                DelayPayGuideDialogFragment.this.d();
                DelayPayGuideDialogFragment delayPayGuideDialogFragment = DelayPayGuideDialogFragment.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = DelayPayGuideDialogFragment.a;
                if (PatchProxy.isSupport(objArr3, delayPayGuideDialogFragment, changeQuickRedirect3, false, "bdd792f920e0244fee0f70a0793b594a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, delayPayGuideDialogFragment, changeQuickRedirect3, false, "bdd792f920e0244fee0f70a0793b594a");
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pay_type", delayPayGuideDialogFragment.c);
                    hashMap.put("pay_type_unique_key", delayPayGuideDialogFragment.d);
                    hashMap.put("pay_transparent_attributes", delayPayGuideDialogFragment.e);
                    com.meituan.android.pay.common.payment.utils.b.c(delayPayGuideDialogFragment.getActivity(), "bank_card");
                    com.meituan.android.pay.common.payment.utils.b.a(delayPayGuideDialogFragment.getActivity(), hashMap);
                    ((PayRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(PayRequestService.class, delayPayGuideDialogFragment, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM)).startMTPayRequest(delayPayGuideDialogFragment.b, com.meituan.android.pay.common.payment.utils.b.c(delayPayGuideDialogFragment.getActivity()), null, com.meituan.android.paybase.fingerprint.util.c.c(), null, !TextUtils.isEmpty(com.meituan.android.pay.common.payment.utils.b.a(delayPayGuideDialogFragment.getActivity())) ? com.meituan.android.pay.common.payment.utils.b.a(delayPayGuideDialogFragment.getActivity()) : com.meituan.android.pay.common.payment.utils.b.b(delayPayGuideDialogFragment.getActivity(), "nb_source"), com.meituan.android.paycommon.lib.config.a.a().o());
                }
            }
            c.put("is_select", delayPayGuideDialog.f ? "1" : "0");
            com.meituan.android.pay.common.analyse.b.b("c_pay_lpq0tqlz", "b_pay_01x97ggf_mc", "", c, delayPayGuideDialog.b());
        }

        public static /* synthetic */ void a(DelayPayGuideDialog delayPayGuideDialog, View view) {
            Object[] objArr = {delayPayGuideDialog, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbea82155e2476c6c8bba97904d20f6d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbea82155e2476c6c8bba97904d20f6d");
                return;
            }
            com.meituan.android.pay.common.analyse.b.b("c_pay_lpq0tqlz", "b_pay_qxlixzfx_mc", "", delayPayGuideDialog.c(), delayPayGuideDialog.b());
            delayPayGuideDialog.dismiss();
        }

        public static /* synthetic */ void a(DelayPayGuideDialog delayPayGuideDialog) {
            Object[] objArr = {delayPayGuideDialog};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1c9c0311a81d5662b7f3768d93dcb8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1c9c0311a81d5662b7f3768d93dcb8e");
            } else if (delayPayGuideDialog.h != null) {
                delayPayGuideDialog.h.setVisibility(8);
            }
        }

        private void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0da52c3dc6c6ed7ddd0874b948fa6c2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0da52c3dc6c6ed7ddd0874b948fa6c2");
            } else if (this.h == null || this.i == null) {
            } else {
                this.h.removeCallbacks(this.i);
            }
        }

        @Override // android.app.Dialog
        public void onStop() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1ec6dbcd8abbcf394f796dfae310cb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1ec6dbcd8abbcf394f796dfae310cb2");
                return;
            }
            super.onStop();
            a();
            this.i = null;
        }

        private HashMap<String, Object> c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c784a0bc297668aa97d2894f14942bf", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c784a0bc297668aa97d2894f14942bf") : new a.c().a("scene_code", "1").a("utm_source", "-999").b;
        }
    }
}
