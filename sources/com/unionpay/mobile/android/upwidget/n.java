package com.unionpay.mobile.android.upwidget;

import android.view.View;
import android.widget.TextView;
import com.unionpay.mobile.android.widgets.ad;
/* loaded from: classes6.dex */
public final class n implements View.OnClickListener {
    final /* synthetic */ j a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(j jVar) {
        this.a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TextView textView;
        TextView textView2;
        ad adVar;
        textView = this.a.m;
        textView.setEnabled(false);
        textView2 = this.a.l;
        textView2.setVisibility(8);
        adVar = this.a.k;
        adVar.setVisibility(0);
    }
}
