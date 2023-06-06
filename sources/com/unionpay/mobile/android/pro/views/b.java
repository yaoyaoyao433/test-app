package com.unionpay.mobile.android.pro.views;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class b implements Handler.Callback {
    final /* synthetic */ a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Handler handler;
        com.unionpay.mobile.android.model.b bVar;
        com.unionpay.mobile.android.hce.c cVar;
        com.unionpay.mobile.android.model.b bVar2;
        com.unionpay.mobile.android.upviews.a aVar;
        com.unionpay.mobile.android.model.b bVar3;
        com.unionpay.mobile.android.model.b bVar4;
        int i = message.what;
        if (i != 2004) {
            if (i != 2006) {
                return true;
            }
            a aVar2 = this.a;
            bVar4 = this.a.a;
            aVar2.a(bVar4.ap, false);
            return true;
        }
        handler = this.a.H;
        handler.removeMessages(2006);
        Bundle bundle = (Bundle) message.obj;
        if (bundle != null) {
            if (!bundle.getBoolean("success")) {
                a aVar3 = this.a;
                bVar = this.a.a;
                aVar3.a(bVar.ap, false);
                return true;
            }
            String string = bundle.getString("result");
            cVar = this.a.C;
            try {
                if (a.d(new JSONObject(com.unionpay.mobile.android.hce.a.a(string, cVar.f())))) {
                    a aVar4 = this.a;
                    aVar = this.a.x;
                    a.a(aVar4, aVar.a().b, a.f(this.a));
                    return true;
                }
                a aVar5 = this.a;
                bVar3 = this.a.a;
                aVar5.a(bVar3.ap, false);
                return false;
            } catch (Exception e) {
                a aVar6 = this.a;
                bVar2 = this.a.a;
                aVar6.a(bVar2.ap, false);
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }
}
