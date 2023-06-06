package com.unionpay.mobile.android.pboctransaction.samsung;

import android.util.Log;
import com.unionpay.mobile.android.utils.k;
import com.unionpay.tsmservice.UPTsmAddon;
/* loaded from: classes6.dex */
public final class h implements UPTsmAddon.UPTsmConnectionListener {
    final /* synthetic */ f a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(f fVar) {
        this.a = fVar;
    }

    @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmConnected() {
        k.c("uppay", "TsmService connected.");
        this.a.f();
    }

    @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmDisconnected() {
        Log.e("uppay", "TsmService disconnected.");
        this.a.a(false);
    }
}
