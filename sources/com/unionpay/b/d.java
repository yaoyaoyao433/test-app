package com.unionpay.b;

import android.util.Log;
import com.unionpay.UPSEInfoResp;
import com.unionpay.tsmservice.UPTsmAddon;
import com.unionpay.utils.j;
/* loaded from: classes6.dex */
public final class d implements UPTsmAddon.UPTsmConnectionListener {
    final /* synthetic */ b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(b bVar) {
        this.a = bVar;
    }

    @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmConnected() {
        j.b("uppay", "TsmService connected.");
        this.a.b();
    }

    @Override // com.unionpay.tsmservice.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmDisconnected() {
        String str;
        String str2;
        Log.e("uppay", "TsmService disconnected.");
        b bVar = this.a;
        str = this.a.d;
        str2 = this.a.e;
        bVar.a(str, str2, UPSEInfoResp.ERROR_NONE, "Tsm service disconnect");
    }
}
