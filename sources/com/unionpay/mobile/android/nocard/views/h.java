package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import com.unionpay.mobile.android.upviews.a;
/* loaded from: classes6.dex */
public final class h implements View.OnClickListener {
    final /* synthetic */ g a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(g gVar) {
        this.a = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upviews.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        boolean z;
        com.unionpay.mobile.android.upwidget.a aVar4;
        com.unionpay.mobile.android.upwidget.a aVar5;
        if (this.a.n()) {
            return;
        }
        aVar = this.a.v;
        aVar.d();
        aVar2 = this.a.v;
        a.C1512a b = aVar2.b();
        if (!b.a()) {
            this.a.a(b.b);
            return;
        }
        aVar3 = this.a.t;
        if (aVar3 != null) {
            aVar4 = this.a.t;
            if (!aVar4.e()) {
                g gVar = this.a;
                aVar5 = this.a.t;
                gVar.a(aVar5.b());
                return;
            }
        }
        this.a.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.q);
        sb.append("_open_apply");
        z = this.a.w;
        if (z) {
            this.a.s();
            this.a.s = 104;
            return;
        }
        this.a.e.c(com.unionpay.mobile.android.utils.j.a(this.a.a.C, "action"), b.b);
        this.a.s = 102;
    }
}
