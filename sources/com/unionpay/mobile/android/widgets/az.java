package com.unionpay.mobile.android.widgets;

import android.view.View;
import com.unionpay.mobile.android.widgets.ay;
/* loaded from: classes6.dex */
public final class az implements View.OnClickListener {
    final /* synthetic */ ay a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public az(ay ayVar) {
        this.a = ayVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ay.a aVar;
        ay.a aVar2;
        aVar = this.a.k;
        if (aVar != null) {
            aVar2 = this.a.k;
            aVar2.l();
        }
    }
}
