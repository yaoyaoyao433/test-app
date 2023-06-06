package com.unionpay.b;

import android.util.Log;
import com.unionpay.UPSEInfoResp;
import com.unionpay.tsmservice.mi.UPTsmAddon;
import com.unionpay.utils.j;
/* loaded from: classes6.dex */
public final class g implements UPTsmAddon.UPTsmConnectionListener {
    final /* synthetic */ e a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(e eVar) {
        this.a = eVar;
    }

    @Override // com.unionpay.tsmservice.mi.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmConnected() {
        j.b("uppay", "mi TsmService connected.");
        this.a.b();
    }

    @Override // com.unionpay.tsmservice.mi.UPTsmAddon.UPTsmConnectionListener
    public final void onTsmDisconnected() {
        String str;
        String str2;
        Log.e("uppay", "mi TsmService disconnected.");
        e eVar = this.a;
        str = this.a.d;
        str2 = this.a.e;
        eVar.a(str, str2, UPSEInfoResp.ERROR_NONE, "Tsm service disconnect");
    }
}
