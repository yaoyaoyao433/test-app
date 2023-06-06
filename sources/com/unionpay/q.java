package com.unionpay;

import android.content.Context;
/* loaded from: classes6.dex */
public final class q implements ac {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.unionpay.ac
    public final void a(String str, ad adVar) {
        String b;
        String a = UPPayAssistEx.a((Context) this.a, true);
        if (adVar != null) {
            b = UPPayWapActivity.b("0", "success", a);
            adVar.a(b);
        }
    }
}
