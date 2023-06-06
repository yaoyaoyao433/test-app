package com.unionpay.mobile.android.nocard.views;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes6.dex */
public final class bj implements View.OnTouchListener {
    final /* synthetic */ bi a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bj(bi biVar) {
        this.a = biVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
            case 1:
                if (view.hasFocus()) {
                    return false;
                }
                view.requestFocus();
                return false;
            default:
                return false;
        }
    }
}
