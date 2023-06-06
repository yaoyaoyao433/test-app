package com.vivo.push.ups;

import com.vivo.push.IPushActionListener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements IPushActionListener {
    final /* synthetic */ UPSRegisterCallback a;
    final /* synthetic */ VUpsManager b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(VUpsManager vUpsManager, UPSRegisterCallback uPSRegisterCallback) {
        this.b = vUpsManager;
        this.a = uPSRegisterCallback;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        this.a.onResult(new TokenResult(i, ""));
    }
}
