package com.meituan.android.recce.views.textinput;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class RecceTextInputManager$$Lambda$1 implements View.OnFocusChangeListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final RecceTextInputManager arg$1;
    private final RecceEditText arg$2;

    public RecceTextInputManager$$Lambda$1(RecceTextInputManager recceTextInputManager, RecceEditText recceEditText) {
        this.arg$1 = recceTextInputManager;
        this.arg$2 = recceEditText;
    }

    public static View.OnFocusChangeListener lambdaFactory$(RecceTextInputManager recceTextInputManager, RecceEditText recceEditText) {
        Object[] objArr = {recceTextInputManager, recceEditText};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8a35c210136e2c1e2342cfe93572f73c", RobustBitConfig.DEFAULT_VALUE) ? (View.OnFocusChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8a35c210136e2c1e2342cfe93572f73c") : new RecceTextInputManager$$Lambda$1(recceTextInputManager, recceEditText);
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5ecb6a792f564ac66829cbc871b7771", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5ecb6a792f564ac66829cbc871b7771");
        } else {
            RecceTextInputManager.lambda$handleFocusChange$0(this.arg$1, this.arg$2, view, z);
        }
    }
}
