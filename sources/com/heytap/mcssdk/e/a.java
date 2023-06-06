package com.heytap.mcssdk.e;

import android.content.Context;
import com.heytap.mcssdk.f.d;
import com.heytap.mcssdk.f.e;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
/* loaded from: classes2.dex */
public final class a implements c {
    @Override // com.heytap.mcssdk.e.c
    public final void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4105) {
            final com.heytap.mcssdk.c.a aVar = (com.heytap.mcssdk.c.a) baseMode;
            com.heytap.mcssdk.f.b.a("mcssdk-CallBackResultProcessor:" + aVar.toString());
            d.b(new Runnable() { // from class: com.heytap.mcssdk.e.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar2 = a.this;
                    com.heytap.mcssdk.c.a aVar3 = aVar;
                    com.heytap.mcssdk.b a = com.heytap.mcssdk.b.a();
                    if (aVar3 == null) {
                        com.heytap.mcssdk.f.b.b("message is null , please check param of parseCommandMessage(2)");
                    } else if (a == null) {
                        com.heytap.mcssdk.f.b.b("pushService is null , please check param of parseCommandMessage(2)");
                    } else if (a.g == null) {
                        com.heytap.mcssdk.f.b.b("pushService.getPushCallback() is null , please check param of parseCommandMessage(2)");
                    } else {
                        int i = aVar3.c;
                        if (i == 12298) {
                            a.g.onSetPushTime(aVar3.e, aVar3.d);
                        } else if (i == 12306) {
                            a.g.onGetPushStatus(aVar3.e, e.a(aVar3.d));
                        } else if (i == 12309) {
                            a.g.onGetNotificationStatus(aVar3.e, e.a(aVar3.d));
                        } else {
                            switch (i) {
                                case 12289:
                                    if (aVar3.e == 0) {
                                        a.f = aVar3.d;
                                    }
                                    a.g.onRegister(aVar3.e, aVar3.d);
                                    return;
                                case 12290:
                                    a.g.onUnRegister(aVar3.e);
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }
            });
        }
    }
}
