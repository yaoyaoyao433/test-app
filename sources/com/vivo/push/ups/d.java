package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements IPushActionListener {
    final /* synthetic */ UPSTurnCallback a;
    final /* synthetic */ VUpsManager b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(VUpsManager vUpsManager, UPSTurnCallback uPSTurnCallback) {
        this.b = vUpsManager;
        this.a = uPSTurnCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.a.onResult(new CodeResult(i));
    }
}
