package com.unionpay.mobile.android.nocard.views;

import android.view.View;
import com.meituan.robust.common.CommonConstant;
import com.unionpay.mobile.android.upviews.a;
/* loaded from: classes6.dex */
public final class au implements View.OnClickListener {
    final /* synthetic */ at a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(at atVar) {
        this.a = atVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.upviews.a aVar2;
        com.unionpay.mobile.android.upviews.a aVar3;
        com.unionpay.mobile.android.upwidget.a aVar4;
        com.unionpay.mobile.android.upwidget.a aVar5;
        boolean z;
        com.unionpay.mobile.android.upwidget.a aVar6;
        com.unionpay.mobile.android.upwidget.a aVar7;
        com.unionpay.mobile.android.upwidget.a aVar8;
        com.unionpay.mobile.android.upwidget.a aVar9;
        com.unionpay.mobile.android.upviews.a aVar10;
        com.unionpay.mobile.android.upviews.a aVar11;
        if (this.a.n()) {
            return;
        }
        String str = "";
        aVar = this.a.A;
        if (aVar != null) {
            aVar10 = this.a.A;
            aVar10.d();
            aVar11 = this.a.A;
            a.C1512a b = aVar11.b();
            if (!b.a()) {
                this.a.a(b.b);
                return;
            }
            str = b.b;
        }
        aVar2 = this.a.B;
        aVar2.d();
        aVar3 = this.a.B;
        a.C1512a b2 = aVar3.b();
        if (!b2.a()) {
            this.a.a(b2.b);
            return;
        }
        aVar4 = this.a.y;
        if (aVar4 != null) {
            aVar8 = this.a.y;
            if (!aVar8.e()) {
                at atVar = this.a;
                aVar9 = this.a.y;
                atVar.a(aVar9.b());
                return;
            }
        }
        aVar5 = this.a.x;
        if (aVar5 != null) {
            aVar6 = this.a.x;
            if (!aVar6.e()) {
                at atVar2 = this.a;
                aVar7 = this.a.x;
                atVar2.a(aVar7.b());
                return;
            }
        }
        String str2 = b2.b;
        if (at.b(str)) {
            str2 = str2 + CommonConstant.Symbol.COMMA + str;
        }
        this.a.b.a(com.unionpay.mobile.android.languages.c.bD.U);
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.q);
        sb.append("_apply");
        if (this.a.a.E == null || this.a.a.E.length() <= 0) {
            this.a.e(str2);
            return;
        }
        at atVar3 = this.a;
        z = this.a.C;
        at.a(atVar3, z, str2);
    }
}
