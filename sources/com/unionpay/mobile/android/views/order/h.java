package com.unionpay.mobile.android.views.order;

import android.view.View;
import com.unionpay.mobile.android.views.order.CViewMethods;
/* loaded from: classes6.dex */
public final class h implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ CViewMethods b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(CViewMethods cViewMethods, int i) {
        this.b = cViewMethods;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CViewMethods.a aVar;
        CViewMethods.a aVar2;
        com.unionpay.mobile.android.utils.k.c("uppay", " touched " + this.a);
        aVar = this.b.j;
        if (aVar != null) {
            aVar2 = this.b.j;
            aVar2.c(this.a);
        }
    }
}
