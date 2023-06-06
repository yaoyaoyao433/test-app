package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.view.View;
import com.unionpay.mobile.android.upviews.a;
/* loaded from: classes6.dex */
public final class f implements View.OnClickListener {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean n;
        com.unionpay.mobile.android.upviews.a aVar;
        boolean z;
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.upviews.a aVar2;
        String str;
        com.unionpay.mobile.android.widgets.m mVar;
        com.unionpay.mobile.android.model.b bVar2;
        Context unused;
        n = this.a.n();
        if (n) {
            return;
        }
        aVar = this.a.x;
        aVar.d();
        z = this.a.F;
        if (z) {
            a.p(this.a);
            return;
        }
        bVar = this.a.a;
        if (bVar.p != null) {
            aVar2 = this.a.x;
            a.C1512a a = aVar2.a();
            if (!a.a()) {
                this.a.a(a.b);
                return;
            }
            unused = this.a.d;
            StringBuilder sb = new StringBuilder();
            str = this.a.q;
            sb.append(str);
            sb.append("_apply");
            mVar = this.a.b;
            mVar.a(com.unionpay.mobile.android.languages.c.bD.U);
            a.u(this.a);
            a aVar3 = this.a;
            bVar2 = this.a.a;
            aVar3.a(bVar2.p);
        }
    }
}
