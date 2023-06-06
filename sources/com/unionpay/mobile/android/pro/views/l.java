package com.unionpay.mobile.android.pro.views;

import android.content.Context;
import android.view.View;
import com.unionpay.mobile.android.upviews.a;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class l implements View.OnClickListener {
    final /* synthetic */ k a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(k kVar) {
        this.a = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean n;
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upwidget.a aVar2;
        com.unionpay.mobile.android.upwidget.a aVar3;
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.upviews.a aVar4;
        String str;
        com.unionpay.mobile.android.widgets.m mVar;
        com.unionpay.mobile.android.upviews.a aVar5;
        HashMap t;
        com.unionpay.mobile.android.upwidget.a aVar6;
        com.unionpay.mobile.android.upwidget.a aVar7;
        com.unionpay.mobile.android.upwidget.a aVar8;
        com.unionpay.mobile.android.upwidget.a aVar9;
        Context unused;
        n = this.a.n();
        if (n) {
            return;
        }
        aVar = this.a.y;
        aVar.d();
        aVar2 = this.a.L;
        if (aVar2 != null) {
            aVar8 = this.a.L;
            if (!aVar8.e()) {
                k kVar = this.a;
                aVar9 = this.a.L;
                kVar.a(aVar9.b());
                return;
            }
        }
        aVar3 = this.a.K;
        if (aVar3 != null) {
            aVar6 = this.a.K;
            if (!aVar6.e()) {
                k kVar2 = this.a;
                aVar7 = this.a.K;
                kVar2.a(aVar7.b());
                return;
            }
        }
        bVar = this.a.a;
        if (bVar.p != null) {
            aVar4 = this.a.y;
            a.C1512a a = aVar4.a();
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
            k.i(this.a);
            k kVar3 = this.a;
            aVar5 = this.a.y;
            String str2 = aVar5.a().b;
            t = this.a.t();
            kVar3.b(str2, t);
        }
    }
}
