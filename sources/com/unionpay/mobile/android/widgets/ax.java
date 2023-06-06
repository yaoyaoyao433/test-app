package com.unionpay.mobile.android.widgets;

import android.view.View;
/* loaded from: classes6.dex */
public final class ax implements View.OnClickListener {
    final /* synthetic */ UPWidget a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ax(UPWidget uPWidget) {
        this.a = uPWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j;
        String str;
        long j2;
        int id = view.getId();
        int i = this.a.c;
        if (id == 10) {
            com.unionpay.mobile.android.utils.k.c("kb", " [ FIN ]");
            UPWidget.b(this.a);
        } else if (id == 20) {
            com.unionpay.mobile.android.utils.k.c("kb", " [ DEL ]");
            if (i > 0) {
                UPWidget uPWidget = this.a;
                j2 = this.a.p;
                uPWidget.deleteOnce(j2);
                UPWidget uPWidget2 = this.a;
                uPWidget2.c--;
                String substring = this.a.b.b().toString().substring(0, i - 1);
                this.a.b.c(substring);
                this.a.b.b(substring.length());
            }
        } else if (this.a.c == 6) {
            com.unionpay.mobile.android.utils.k.c("kb", " [ FIN ]");
        } else {
            UPWidget uPWidget3 = this.a;
            j = this.a.p;
            uPWidget3.appendOnce(j, Integer.toString(id));
            if (i == 0) {
                str = "*";
            } else {
                str = this.a.b.b() + "*";
            }
            this.a.b.c(str);
            this.a.b.b(str.length());
            this.a.c++;
        }
    }
}
