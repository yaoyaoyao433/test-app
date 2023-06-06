package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import com.unionpay.mobile.android.nocard.views.bd;
/* loaded from: classes6.dex */
public final class bg implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ bd.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bg(bd.a aVar, int i, String str, String str2) {
        this.d = aVar;
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String[] strArr = com.unionpay.mobile.android.utils.o.i;
        Object[] objArr = {Integer.valueOf(this.a), this.b};
        bd.this.a("", this.c);
    }
}
