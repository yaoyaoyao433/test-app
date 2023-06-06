package com.unionpay;

import com.unionpay.utils.UPUtils;
/* loaded from: classes6.dex */
public final class s implements ac {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.unionpay.ac
    public final void a(String str, ad adVar) {
        String b;
        String a = UPUtils.a(this.a, str);
        if (adVar != null) {
            b = UPPayWapActivity.b("0", "success", a);
            adVar.a(b);
        }
    }
}
