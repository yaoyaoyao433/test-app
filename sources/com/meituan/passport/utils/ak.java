package com.meituan.passport.utils;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements Runnable {
    public static ChangeQuickRedirect a;
    private final InputMethodManager b;
    private final EditText c;

    private ak(InputMethodManager inputMethodManager, EditText editText) {
        this.b = inputMethodManager;
        this.c = editText;
    }

    public static Runnable a(InputMethodManager inputMethodManager, EditText editText) {
        Object[] objArr = {inputMethodManager, editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f5828eda04f9b6fca6df9488c787be1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f5828eda04f9b6fca6df9488c787be1") : new ak(inputMethodManager, editText);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2739e97f6c1a49751ffb2fca9b0835ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2739e97f6c1a49751ffb2fca9b0835ec");
            return;
        }
        InputMethodManager inputMethodManager = this.b;
        EditText editText = this.c;
        Object[] objArr2 = {inputMethodManager, editText};
        ChangeQuickRedirect changeQuickRedirect2 = Utils.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3583e9b80f520713720ad968251f1e62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3583e9b80f520713720ad968251f1e62");
            return;
        }
        Object[] objArr3 = {inputMethodManager, editText};
        ChangeQuickRedirect changeQuickRedirect3 = Utils.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "178cc6e4bf0b41aefb365b312b0b909d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "178cc6e4bf0b41aefb365b312b0b909d");
        } else {
            inputMethodManager.showSoftInput(editText, 2);
        }
    }
}
