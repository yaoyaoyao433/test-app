package com.meituan.android.cashier.dialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.Space;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.cashier.model.bean.PayLaterAgreementBean;
import com.meituan.android.cashier.model.bean.PayLaterPopDetailInfoBean;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayLaterGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    @Nullable
    public a b;
    private boolean e;
    private CheckBox f;
    private Runnable g;
    @SuppressLint({"InflateParams"})
    private View h;
    @SuppressLint({"InflateParams"})
    private final ViewGroup i;
    @NonNull
    private final PayLaterPopDetailInfoBean j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    @SuppressLint({"InflateParams"})
    public PayLaterGuideDialog(Context context, @NonNull PayLaterPopDetailInfoBean payLaterPopDetailInfoBean, @Nullable a aVar) {
        super(context, R.style.mpay__TransparentDialog);
        boolean z;
        boolean z2;
        Object[] objArr = {context, payLaterPopDetailInfoBean, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d362b3bb54a34c7e6a0d70a2c2a11c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d362b3bb54a34c7e6a0d70a2c2a11c8");
            return;
        }
        this.e = false;
        this.j = payLaterPopDetailInfoBean;
        this.b = aVar;
        this.i = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.cashier__paylater_guide_dialog, (ViewGroup) null);
        ViewGroup viewGroup = (ViewGroup) this.i.findViewById(R.id.dialog_root);
        ViewGroup viewGroup2 = this.i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        setContentView(viewGroup2, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aa1b31684e1520f0332a296138ac9f7", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aa1b31684e1520f0332a296138ac9f7") : new ViewGroup.LayoutParams(a(), -2));
        Object[] objArr3 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2451c528bbf354b16f84906435b1c744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2451c528bbf354b16f84906435b1c744");
            return;
        }
        setCanceledOnTouchOutside(false);
        Object[] objArr4 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "13ee7dda37e8a49f40908cffe33f5c9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "13ee7dda37e8a49f40908cffe33f5c9c");
        } else {
            TextView textView = (TextView) viewGroup.findViewById(R.id.title);
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.business_logo);
            if (!TextUtils.isEmpty(this.j.getTitle())) {
                textView.setText(this.j.getTitle());
            }
            View findViewById = viewGroup.findViewById(R.id.score_container);
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.score);
            TextView textView3 = (TextView) viewGroup.findViewById(R.id.score_name);
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "66a5ca10cb15438e940891a065d9203b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "66a5ca10cb15438e940891a065d9203b")).booleanValue();
            } else {
                z = this.j.getScore() > 0;
            }
            if (z) {
                findViewById.setVisibility(0);
                textView2.setText(String.valueOf(this.j.getScore()));
                textView3.setText(this.j.getScoreName());
                imageView.setVisibility(8);
            } else {
                findViewById.setVisibility(8);
                imageView.setVisibility(0);
                com.meituan.android.paycommon.lib.utils.w.a(this.j.getBelieveScoreBizLogo(), imageView);
            }
        }
        Object[] objArr6 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "538630251769657f583bb49088ccfad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "538630251769657f583bb49088ccfad7");
        } else {
            TextView textView4 = (TextView) viewGroup.findViewById(R.id.desc);
            if (!TextUtils.isEmpty(this.j.getDetail())) {
                textView4.setText(Html.fromHtml(this.j.getDetail()));
            }
        }
        Object[] objArr7 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2cecad5e3dae84ba823bfe3a1d5ea123", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2cecad5e3dae84ba823bfe3a1d5ea123");
        } else {
            ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.guide_picture);
            Space space = (Space) viewGroup.findViewById(R.id.guide_picture_placeholder);
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.height = (int) (((a() - (getContext().getResources().getDimensionPixelSize(R.dimen.cashier__paylater_guide_dialog_horizontal_padding) * 2)) * 8) / 31.0f);
            imageView2.setLayoutParams(layoutParams);
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "25e7b680bf41bb7dfe254fe3e0450762", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "25e7b680bf41bb7dfe254fe3e0450762")).booleanValue();
            } else {
                z2 = !TextUtils.isEmpty(this.j.getGuidePicture());
            }
            if (z2) {
                imageView2.setVisibility(0);
                space.setVisibility(8);
                com.meituan.android.paycommon.lib.utils.w.a(this.j.getGuidePicture(), imageView2);
            } else {
                imageView2.setVisibility(8);
                space.setVisibility(0);
            }
        }
        if (viewGroup instanceof ViewGroup) {
            if (c()) {
                ViewGroup viewGroup3 = viewGroup;
                b(viewGroup3);
                a(viewGroup3);
                return;
            }
            ViewGroup viewGroup4 = viewGroup;
            a(viewGroup4);
            b(viewGroup4);
        }
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba79136039ccd5e09d26758ba77f27a9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba79136039ccd5e09d26758ba77f27a9")).intValue() : (int) (((WindowManager) com.meituan.android.paycommon.lib.config.a.a().a.getSystemService("window")).getDefaultDisplay().getWidth() * 0.827f);
    }

    private void a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9ee39247c5e9db52733dae726c7ada8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9ee39247c5e9db52733dae726c7ada8");
            return;
        }
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.cashier__paylater_guide_dialog_button_view, viewGroup).findViewById(R.id.cancel);
        textView.setText(this.j.getLbtn());
        textView.setOnClickListener(t.a(this));
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.ensure);
        textView2.setText(this.j.getRbtn());
        textView2.setOnClickListener(u.a(this));
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.discount_icon);
        textView3.setMaxWidth((int) ((a() / 2.0d) - getContext().getResources().getDimensionPixelSize(R.dimen.cashier__paylater_guide_dialog_horizontal_padding)));
        if (TextUtils.isEmpty(this.j.getPromoBubble())) {
            textView3.setVisibility(8);
            return;
        }
        textView3.setVisibility(0);
        textView3.setText(this.j.getPromoBubble());
    }

    public static /* synthetic */ void c(PayLaterGuideDialog payLaterGuideDialog, View view) {
        Object[] objArr = {payLaterGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59d1a544bf5084cc86e91a5cc219e17e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59d1a544bf5084cc86e91a5cc219e17e");
            return;
        }
        if (payLaterGuideDialog.c()) {
            payLaterGuideDialog.d();
        }
        if (payLaterGuideDialog.b != null) {
            payLaterGuideDialog.b.b();
        }
    }

    public static /* synthetic */ void b(PayLaterGuideDialog payLaterGuideDialog, View view) {
        Object[] objArr = {payLaterGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ae0cd9cd37ec0ae0c7bf8795def3887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ae0cd9cd37ec0ae0c7bf8795def3887");
        } else if (payLaterGuideDialog.c() && !payLaterGuideDialog.e) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, payLaterGuideDialog, changeQuickRedirect2, false, "a17f7fe088be160204feb84dd09db53a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, payLaterGuideDialog, changeQuickRedirect2, false, "a17f7fe088be160204feb84dd09db53a");
                return;
            }
            if (payLaterGuideDialog.h != null) {
                if (payLaterGuideDialog.h.getVisibility() == 8) {
                    payLaterGuideDialog.h.setVisibility(0);
                }
                payLaterGuideDialog.d();
            } else {
                int[] iArr = new int[2];
                payLaterGuideDialog.f.getLocationInWindow(iArr);
                payLaterGuideDialog.h = LayoutInflater.from(payLaterGuideDialog.getContext()).inflate(R.layout.cashier__paylater_guide_dialog_toast, (ViewGroup) null);
                payLaterGuideDialog.h.setY(iArr[1] - payLaterGuideDialog.getContext().getResources().getDimensionPixelSize(R.dimen.cashier__paylater_guide_dialog_toast_height));
                payLaterGuideDialog.i.addView(payLaterGuideDialog.h, -1);
                payLaterGuideDialog.g = w.a(payLaterGuideDialog);
            }
            if (payLaterGuideDialog.h == null || payLaterGuideDialog.g == null) {
                return;
            }
            payLaterGuideDialog.h.postDelayed(payLaterGuideDialog.g, PayTask.j);
        } else {
            payLaterGuideDialog.d();
            if (payLaterGuideDialog.b != null) {
                payLaterGuideDialog.b.a();
            }
        }
    }

    private void b(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502b7c8df16094de5e16fb437fa88165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502b7c8df16094de5e16fb437fa88165");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.cashier__paylater_guide_dialog_agreement_view, viewGroup);
        TextView textView = (TextView) inflate.findViewById(R.id.agreement);
        String string = getContext().getResources().getString(R.string.cashier__paylater_agreement_desc);
        if (c()) {
            string = getContext().getResources().getString(R.string.cashier__paylater_agreement_desc_with_check_box);
            ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.cashier__paylater_guide_dialog_agreement_checkbox);
            this.f = (CheckBox) inflate.findViewById(R.id.cashier__paylater_guide_dialog_agreement_checkbox_view);
            viewGroup2.setVisibility(0);
            this.f.setVisibility(0);
            viewGroup2.setOnClickListener(v.a(this));
        }
        List<PayLaterAgreementBean> agreementList = this.j.getAgreementList();
        if (com.meituan.android.paybase.utils.i.a((Collection) agreementList)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        for (final PayLaterAgreementBean payLaterAgreementBean : agreementList) {
            spannableStringBuilder.append((CharSequence) payLaterAgreementBean.getAgreementName());
            spannableStringBuilder.setSpan(new ClickableSpan() { // from class: com.meituan.android.cashier.dialog.PayLaterGuideDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.text.style.ClickableSpan
                public final void onClick(@NonNull View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97db6d5f6dbaca68a0a9b645a21e9250", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97db6d5f6dbaca68a0a9b645a21e9250");
                    } else {
                        al.a(PayLaterGuideDialog.this.getContext(), payLaterAgreementBean.getAgreementLink());
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(@NonNull TextPaint textPaint) {
                    Object[] objArr2 = {textPaint};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23fbbd5116fce2fadc98609e813d7dd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23fbbd5116fce2fadc98609e813d7dd2");
                        return;
                    }
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, spannableStringBuilder.length() - payLaterAgreementBean.getAgreementName().length(), spannableStringBuilder.length(), 17);
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.cashier__bg_paylater_guide_dialog_lint_color)), string.length(), spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.cashier__bg_paylater_guide_agreement_desc_color)), 0, string.length(), 17);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(getContext().getResources().getColor(17170445));
    }

    public static /* synthetic */ void a(PayLaterGuideDialog payLaterGuideDialog, View view) {
        Object[] objArr = {payLaterGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c64af61020e697217f5268a827d95fed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c64af61020e697217f5268a827d95fed");
            return;
        }
        payLaterGuideDialog.e = !payLaterGuideDialog.e;
        payLaterGuideDialog.f.setChecked(payLaterGuideDialog.e);
        if (payLaterGuideDialog.e) {
            payLaterGuideDialog.d();
            if (payLaterGuideDialog.h != null) {
                payLaterGuideDialog.h.setVisibility(8);
            }
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "873512345ac474c9f3b2805ceb3527fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "873512345ac474c9f3b2805ceb3527fc")).booleanValue() : this.j.isNeedUserCheck();
    }

    public static /* synthetic */ void a(PayLaterGuideDialog payLaterGuideDialog) {
        Object[] objArr = {payLaterGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c25eb3eba82b299d92c2595bbf47a995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c25eb3eba82b299d92c2595bbf47a995");
        } else if (payLaterGuideDialog.h != null) {
            payLaterGuideDialog.h.setVisibility(8);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c0013c5d6e93250ab8628f28fff115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c0013c5d6e93250ab8628f28fff115");
        } else if (this.h == null || this.g == null) {
        } else {
            this.h.removeCallbacks(this.g);
        }
    }

    @Override // android.app.Dialog
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335174c4de2f678068195ab34064b3a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335174c4de2f678068195ab34064b3a4");
            return;
        }
        super.onStop();
        d();
        this.g = null;
    }
}
