package com.meituan.android.pay.fragment;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.meituan.android.paybase.widgets.keyboard.CustomKeyboardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements ViewTreeObserver.OnGlobalLayoutListener {
    public static ChangeQuickRedirect a;
    private final CustomKeyboardView b;
    private final LinearLayout c;

    private u(CustomKeyboardView customKeyboardView, LinearLayout linearLayout) {
        this.b = customKeyboardView;
        this.c = linearLayout;
    }

    public static ViewTreeObserver.OnGlobalLayoutListener a(CustomKeyboardView customKeyboardView, LinearLayout linearLayout) {
        Object[] objArr = {customKeyboardView, linearLayout};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cc8705c05bccaa2b5473e79f2edca3a", RobustBitConfig.DEFAULT_VALUE) ? (ViewTreeObserver.OnGlobalLayoutListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cc8705c05bccaa2b5473e79f2edca3a") : new u(customKeyboardView, linearLayout);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9c1470c0c90d100f517b6e7febad00c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9c1470c0c90d100f517b6e7febad00c");
        } else {
            VerifyBankInfoFragment.a(this.b, this.c);
        }
    }
}
