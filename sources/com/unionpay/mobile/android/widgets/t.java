package com.unionpay.mobile.android.widgets;

import android.app.AlertDialog;
import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes6.dex */
public final class t implements AdapterView.OnItemClickListener {
    final /* synthetic */ p a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(p pVar) {
        this.a = pVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertDialog alertDialog;
        this.a.a(i);
        alertDialog = this.a.p;
        alertDialog.dismiss();
    }
}
