package com.unionpay.mobile.android.widgets;

import android.view.View;
import com.unionpay.mobile.android.widgets.ap;
/* loaded from: classes6.dex */
public final class aq implements View.OnClickListener {
    final /* synthetic */ ap a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aq(ap apVar) {
        this.a = apVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ap.a aVar;
        ap.a aVar2;
        aVar = this.a.c;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a.s());
            sb.append("_click_get_msg");
            aVar2 = this.a.c;
            aVar2.a(this.a);
        }
    }
}
