package com.unionpay;
/* loaded from: classes6.dex */
public final class u implements ac {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.unionpay.ac
    public final void a(String str, ad adVar) {
        String b;
        Boolean.parseBoolean(str);
        this.a.a.setVisibility(r1 ? 0 : 8);
        if (adVar != null) {
            b = UPPayWapActivity.b("0", "success", null);
            adVar.a(b);
        }
    }
}
