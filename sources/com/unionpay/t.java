package com.unionpay;

import com.unionpay.utils.UPUtils;
/* loaded from: classes6.dex */
public final class t implements ac {
    final /* synthetic */ UPPayWapActivity a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(UPPayWapActivity uPPayWapActivity) {
        this.a = uPPayWapActivity;
    }

    @Override // com.unionpay.ac
    public final void a(String str, ad adVar) {
        String b;
        UPUtils.b(this.a, str);
        if (adVar != null) {
            b = UPPayWapActivity.b("0", "success", null);
            adVar.a(b);
        }
    }
}
