package com.unionpay.mobile.android.pro.views;

import java.util.ArrayList;
/* loaded from: classes6.dex */
public final class i implements com.unionpay.mobile.android.pro.pboc.engine.a {
    final /* synthetic */ h a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(h hVar) {
        this.a = hVar;
    }

    @Override // com.unionpay.mobile.android.pro.pboc.engine.a
    public final void a(ArrayList<com.unionpay.mobile.android.model.c> arrayList) {
        com.unionpay.mobile.android.utils.k.a("uppay", "deviceReady +++");
        if (arrayList != null && arrayList.size() > 0) {
            if (this.a.s == null) {
                this.a.s = new ArrayList(arrayList.size());
            }
            this.a.s.addAll(arrayList);
        }
        this.a.w();
        com.unionpay.mobile.android.utils.k.a("uppay", "deviceReady ---");
    }
}
