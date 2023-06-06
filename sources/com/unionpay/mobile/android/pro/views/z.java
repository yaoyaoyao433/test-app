package com.unionpay.mobile.android.pro.views;

import android.view.View;
import com.unionpay.mobile.android.upviews.a;
import java.util.List;
/* loaded from: classes6.dex */
public final class z implements View.OnClickListener {
    final /* synthetic */ y a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(y yVar) {
        this.a = yVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean n;
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upviews.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        com.unionpay.mobile.android.upwidget.a aVar4;
        com.unionpay.mobile.android.widgets.m mVar;
        String str;
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.model.b bVar2;
        com.unionpay.mobile.android.model.b bVar3;
        com.unionpay.mobile.android.upviews.a aVar5;
        com.unionpay.mobile.android.model.b bVar4;
        com.unionpay.mobile.android.upviews.a aVar6;
        com.unionpay.mobile.android.upwidget.a aVar7;
        com.unionpay.mobile.android.upwidget.a aVar8;
        com.unionpay.mobile.android.upwidget.a aVar9;
        com.unionpay.mobile.android.upwidget.a aVar10;
        n = this.a.n();
        if (n) {
            return;
        }
        aVar = this.a.A;
        aVar.d();
        aVar2 = this.a.A;
        a.C1512a a = aVar2.a();
        if (!a.a()) {
            this.a.a(a.b);
            return;
        }
        aVar3 = this.a.x;
        if (aVar3 != null) {
            aVar9 = this.a.x;
            if (!aVar9.e()) {
                y yVar = this.a;
                aVar10 = this.a.x;
                yVar.a(aVar10.b());
                return;
            }
        }
        aVar4 = this.a.w;
        if (aVar4 != null) {
            aVar7 = this.a.w;
            if (!aVar7.e()) {
                y yVar2 = this.a;
                aVar8 = this.a.w;
                yVar2.a(aVar8.b());
                return;
            }
        }
        mVar = this.a.b;
        mVar.a(com.unionpay.mobile.android.languages.c.bD.U);
        StringBuilder sb = new StringBuilder();
        str = this.a.q;
        sb.append(str);
        sb.append("_apply");
        bVar = this.a.a;
        if (bVar.br) {
            y yVar3 = this.a;
            bVar4 = this.a.a;
            com.unionpay.mobile.android.model.c cVar = bVar4.bs;
            aVar6 = this.a.A;
            y.a(yVar3, cVar, aVar6.a().b, y.i(this.a));
            return;
        }
        y yVar4 = this.a;
        bVar2 = this.a.a;
        List<com.unionpay.mobile.android.model.c> list = bVar2.q;
        bVar3 = this.a.a;
        aVar5 = this.a.A;
        y.a(yVar4, list.get(bVar3.N), aVar5.a().b, y.i(this.a));
    }
}
