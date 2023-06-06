package com.meituan.android.paybase.widgets.agreement;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.screen.AutoFitLinearLayout;
import com.meituan.android.paybase.utils.al;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AgreementView extends AutoFitLinearLayout {
    public static ChangeQuickRedirect a;

    public AgreementView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34d987f8c14f1bafe7ca9c4ba3029dab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34d987f8c14f1bafe7ca9c4ba3029dab");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe9a15b6e5f8f7a57738f86dd6072477", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe9a15b6e5f8f7a57738f86dd6072477");
            return;
        }
        setOrientation(0);
        inflate(getContext(), R.layout.paybase__agreement_layout, this);
        setVisibility(8);
    }

    public void setAgreement(AgreementBean agreementBean) {
        Object[] objArr = {agreementBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10813e39b33f32602dd2edeb1ac63c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10813e39b33f32602dd2edeb1ac63c40");
        } else if (agreementBean == null) {
        } else {
            setVisibility(0);
            if (!TextUtils.isEmpty(agreementBean.getAgreementPrefix())) {
                getAgreementPrefixTextView().setText(agreementBean.getAgreementPrefix());
            }
            if (!TextUtils.isEmpty(agreementBean.getName())) {
                getAgreementNameTextView().setText(agreementBean.getName());
                if (!TextUtils.isEmpty(agreementBean.getUrl())) {
                    getAgreementNameTextView().setOnClickListener(a.a(this, agreementBean));
                }
            }
            if (agreementBean.canCheck()) {
                getCheckBox().setVisibility(0);
                getCheckBox().setChecked(agreementBean.isChecked());
            } else {
                getCheckBox().setVisibility(8);
            }
            if (agreementBean.getTextSize() > 0.0f) {
                getAgreementPrefixTextView().setTextSize(agreementBean.getTextSize());
                getAgreementNameTextView().setTextSize(agreementBean.getTextSize());
            }
            if (!TextUtils.isEmpty(agreementBean.getTextColor())) {
                try {
                    getAgreementPrefixTextView().setTextColor(Color.parseColor(agreementBean.getTextColor()));
                } catch (Exception e) {
                    v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "AgreementView_setAgreement").a("message", e.getMessage()).b);
                }
            }
            if (TextUtils.isEmpty(agreementBean.getAgreementColor())) {
                return;
            }
            try {
                getAgreementNameTextView().setTextColor(Color.parseColor(agreementBean.getAgreementColor()));
            } catch (Exception e2) {
                v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "AgreementView_setAgreement").a("message", e2.getMessage()).b);
            }
        }
    }

    public static /* synthetic */ void a(AgreementView agreementView, AgreementBean agreementBean, View view) {
        Object[] objArr = {agreementView, agreementBean, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b342788a0e642abcc457401ca876636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b342788a0e642abcc457401ca876636");
        } else {
            al.a(agreementView.getContext(), agreementBean.getUrl());
        }
    }

    public TextView getAgreementNameTextView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6a43295970d31bd883e6e8fadf38103", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6a43295970d31bd883e6e8fadf38103") : (TextView) findViewById(R.id.agreement_name);
    }

    public TextView getAgreementPrefixTextView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96413932f1470c3f633ce6e3c3e81f3a", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96413932f1470c3f633ce6e3c3e81f3a") : (TextView) findViewById(R.id.agreement_prefix);
    }

    public CheckBox getCheckBox() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "218c6695681a9d8b2e04b727627d607d", RobustBitConfig.DEFAULT_VALUE) ? (CheckBox) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "218c6695681a9d8b2e04b727627d607d") : (CheckBox) findViewById(R.id.checkbox);
    }

    public boolean getChecked() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eaf4ba8e835bf6bb426bd8349cd862c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eaf4ba8e835bf6bb426bd8349cd862c")).booleanValue() : getCheckBox().getVisibility() == 0 && getCheckBox().isChecked();
    }
}
