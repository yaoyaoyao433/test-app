package com.meituan.android.pay.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements TextView.OnEditorActionListener {
    public static ChangeQuickRedirect a;
    private final EditTextWithClearAndHelpButton b;

    private a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        this.b = editTextWithClearAndHelpButton;
    }

    public static TextView.OnEditorActionListener a(EditTextWithClearAndHelpButton editTextWithClearAndHelpButton) {
        Object[] objArr = {editTextWithClearAndHelpButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65b9c69ce65d2c1a6f33cbb545f72874", RobustBitConfig.DEFAULT_VALUE) ? (TextView.OnEditorActionListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65b9c69ce65d2c1a6f33cbb545f72874") : new a(editTextWithClearAndHelpButton);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object[] objArr = {textView, Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add1cb4fdd61a64dd406e87eca2f583f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add1cb4fdd61a64dd406e87eca2f583f")).booleanValue() : EditTextWithClearAndHelpButton.a(this.b, textView, i, keyEvent);
    }
}
