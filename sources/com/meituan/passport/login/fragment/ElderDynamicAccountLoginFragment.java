package com.meituan.passport.login.fragment;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.view.TextButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ElderDynamicAccountLoginFragment extends DynamicAccountLoginFragment {
    public static ChangeQuickRedirect n;

    @Override // com.meituan.passport.login.fragment.DynamicAccountLoginFragment, com.meituan.passport.BasePassportFragment
    public final int W_() {
        return R.layout.passport_fragment_elder_dynamiclogin;
    }

    @Override // com.meituan.passport.login.fragment.DynamicAccountLoginFragment
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cad56aaf8917b41bb703c883b648548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cad56aaf8917b41bb703c883b648548");
        } else if (this.k == null) {
        } else {
            switch (i) {
                case 0:
                    if (this.m.k == 3) {
                        a(getString(R.string.passport_auto_sign_up_tips));
                        this.k.setTextColor(Utils.c(getContext(), R.color.passport_black3));
                        return;
                    }
                    a("");
                    return;
                case 1:
                    a(getString(R.string.passport_elder_sms_send_too_frequently));
                    this.k.setTextColor(Color.parseColor("#FFFF352B"));
                    return;
                case 2:
                    a(getString(i2 == 121008 ? R.string.passport_sms_code_error : R.string.passport_sms_code_timeout));
                    this.k.setTextColor(Color.parseColor("#FFFF352B"));
                    return;
                default:
                    if (this.m.k == 3) {
                        a(getString(R.string.passport_auto_sign_up_tips));
                        this.k.setTextColor(Utils.c(getContext(), R.color.passport_black3));
                        return;
                    }
                    a("");
                    return;
            }
        }
    }

    @Override // com.meituan.passport.login.fragment.DynamicAccountLoginFragment
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060bd3470ca719da3e1c8016e804ae0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060bd3470ca719da3e1c8016e804ae0b");
            return;
        }
        super.b(i);
        if (i != 21 || this.l == 32) {
            return;
        }
        this.i.setText(getContext().getResources().getString(R.string.passport_elder_sms_will_send_to_mobile, d()));
    }

    @Override // com.meituan.passport.login.fragment.DynamicAccountLoginFragment
    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "045a2ddbb2efcea781c5674c12cb7be7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "045a2ddbb2efcea781c5674c12cb7be7");
            return;
        }
        super.b(i, i2);
        if (isAdded() && this.j != null && i == 14) {
            this.j.setTextColor(Color.parseColor("#FF767676"));
        }
    }

    @Override // com.meituan.passport.login.fragment.DynamicAccountLoginFragment
    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfcce4355b7b59a7483e2ea1f6ea483f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfcce4355b7b59a7483e2ea1f6ea483f");
            return;
        }
        super.c(i);
        if (!isAdded() || this.j == null) {
            return;
        }
        TextButton textButton = this.j;
        Context context = getContext();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = Utils.a;
        textButton.setTextColor(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7069344e5aab72b25091a61a38d09003", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7069344e5aab72b25091a61a38d09003")).intValue() : Utils.d(context, R.attr.passportElderCommonTextColor));
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c82e09cbf8c3731bf93c50b368d407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c82e09cbf8c3731bf93c50b368d407");
        } else if (this.k == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                this.k.setVisibility(8);
                return;
            }
            this.k.setVisibility(0);
            this.k.setText(str);
        }
    }
}
