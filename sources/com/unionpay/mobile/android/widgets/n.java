package com.unionpay.mobile.android.widgets;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
/* loaded from: classes6.dex */
public final class n extends Dialog {
    final /* synthetic */ m a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, Context context) {
        super(context);
        this.a = mVar;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
