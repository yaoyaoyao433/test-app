package com.unionpay.mobile.android.widgets;

import android.view.View;
import com.unionpay.mobile.android.widgets.ah;
/* loaded from: classes6.dex */
public final class ai implements View.OnClickListener {
    final /* synthetic */ ah a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ai(ah ahVar) {
        this.a = ahVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ah.a aVar;
        ah.a aVar2;
        String str;
        aVar = this.a.c;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.s());
            sb.append("_change_phoneNO");
            aVar2 = this.a.c;
            str = this.a.p;
            aVar2.e(str);
        }
    }
}
