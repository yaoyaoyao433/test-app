package com.unionpay.mobile.android.hce;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import com.unionpay.mobile.android.hce.service.b;
import com.vivo.push.PushClientConstants;
/* loaded from: classes6.dex */
public final class b extends b.a {
    private int a;
    private String b;
    private Handler c;

    public b(int i, String str, Handler handler) {
        this.a = i;
        this.b = str;
        this.c = handler;
    }

    @Override // com.unionpay.mobile.android.hce.service.b
    public final void a(String str) throws RemoteException {
        switch (this.a) {
            case 2003:
                Bundle bundle = new Bundle();
                bundle.putString(PushClientConstants.TAG_PKG_NAME, this.b);
                bundle.putBoolean("success", false);
                bundle.putString("errCode", str);
                this.c.sendMessage(Message.obtain(this.c, 2003, bundle));
                return;
            case 2004:
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("success", false);
                bundle2.putString("errCode", str);
                this.c.sendMessage(Message.obtain(this.c, 2004, bundle2));
                return;
            default:
                return;
        }
    }

    @Override // com.unionpay.mobile.android.hce.service.b
    public final void a(String str, String str2) throws RemoteException {
        switch (this.a) {
            case 2003:
                Bundle bundle = new Bundle();
                bundle.putString(PushClientConstants.TAG_PKG_NAME, this.b);
                bundle.putBoolean("success", true);
                bundle.putString("result", str);
                bundle.putString("reserved", str2);
                this.c.sendMessage(Message.obtain(this.c, 2003, bundle));
                return;
            case 2004:
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("success", true);
                bundle2.putString("result", str);
                bundle2.putString("reserved", str2);
                this.c.sendMessage(Message.obtain(this.c, 2004, bundle2));
                return;
            default:
                return;
        }
    }
}
