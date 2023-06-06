package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.d.c;
import com.heytap.mcssdk.f.d;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import java.util.List;
/* loaded from: classes2.dex */
public final class a {
    public static void a(final Context context, final Intent intent, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (context == null) {
            com.heytap.mcssdk.f.b.b("context is null , please check param of parseIntent()");
        } else if (intent == null) {
            com.heytap.mcssdk.f.b.b("intent is null , please check param of parseIntent()");
        } else {
            d.a(new Runnable() { // from class: com.heytap.mcssdk.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    List<BaseMode> a = c.a(context, intent);
                    if (a == null) {
                        return;
                    }
                    for (BaseMode baseMode : a) {
                        if (baseMode != null) {
                            for (com.heytap.mcssdk.e.c cVar : b.a().b) {
                                if (cVar != null) {
                                    cVar.a(context, baseMode, iDataMessageCallBackService);
                                }
                            }
                        }
                    }
                }
            });
        }
    }
}
