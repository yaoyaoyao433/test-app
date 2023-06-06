package com.unionpay.mobile.android.pro.views;

import android.nfc.NfcAdapter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.unionpay.mobile.android.widgets.ay;
/* loaded from: classes6.dex */
public final class m implements View.OnClickListener {
    final /* synthetic */ boolean a;
    final /* synthetic */ k b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(k kVar, boolean z) {
        this.b = kVar;
        this.a = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FrameLayout frameLayout;
        LinearLayout linearLayout;
        ay ayVar;
        ay ayVar2;
        NfcAdapter nfcAdapter;
        this.b.i();
        if (this.a) {
            this.b.j();
            return;
        }
        k.B(this.b);
        frameLayout = this.b.S;
        frameLayout.removeAllViews();
        linearLayout = this.b.A;
        linearLayout.removeAllViews();
        ayVar = this.b.F;
        ayVar.setBackgroundColor(-16686660);
        ayVar2 = this.b.F;
        ayVar2.a(0);
        this.b.c();
        k kVar = this.b;
        nfcAdapter = this.b.R;
        kVar.a(nfcAdapter);
    }
}
