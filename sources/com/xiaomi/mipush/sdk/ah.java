package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class ah extends Handler {
    final /* synthetic */ ag a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(ag agVar, Looper looper) {
        super(looper);
        this.a = agVar;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        ag agVar;
        am amVar;
        Context context5;
        HashMap<String, String> b;
        Context context6;
        Context context7;
        Context context8;
        Context context9;
        Context context10;
        Context context11;
        Context context12;
        ag agVar2;
        am amVar2;
        Context context13;
        Context context14;
        if (message.what != 19) {
            return;
        }
        String str = (String) message.obj;
        int i = message.arg1;
        synchronized (x.class) {
            context = this.a.a;
            if (x.a(context).e(str)) {
                context2 = this.a.a;
                if (x.a(context2).c(str) < 10) {
                    if (am.DISABLE_PUSH.ordinal() == i) {
                        context14 = this.a.a;
                        if ("syncing".equals(x.a(context14).a(am.DISABLE_PUSH))) {
                            agVar2 = this.a;
                            amVar2 = am.DISABLE_PUSH;
                            agVar2.a(str, amVar2, true, (HashMap<String, String>) null);
                            context13 = this.a.a;
                            x.a(context13).b(str);
                        }
                    }
                    if (am.ENABLE_PUSH.ordinal() == i) {
                        context12 = this.a.a;
                        if ("syncing".equals(x.a(context12).a(am.ENABLE_PUSH))) {
                            agVar2 = this.a;
                            amVar2 = am.ENABLE_PUSH;
                            agVar2.a(str, amVar2, true, (HashMap<String, String>) null);
                            context13 = this.a.a;
                            x.a(context13).b(str);
                        }
                    }
                    if (am.UPLOAD_HUAWEI_TOKEN.ordinal() == i) {
                        context10 = this.a.a;
                        if ("syncing".equals(x.a(context10).a(am.UPLOAD_HUAWEI_TOKEN))) {
                            agVar = this.a;
                            amVar = am.UPLOAD_HUAWEI_TOKEN;
                            context11 = this.a.a;
                            b = aw.b(context11, as.ASSEMBLE_PUSH_HUAWEI);
                            agVar.a(str, amVar, false, b);
                            context13 = this.a.a;
                            x.a(context13).b(str);
                        }
                    }
                    if (am.UPLOAD_FCM_TOKEN.ordinal() == i) {
                        context8 = this.a.a;
                        if ("syncing".equals(x.a(context8).a(am.UPLOAD_FCM_TOKEN))) {
                            agVar = this.a;
                            amVar = am.UPLOAD_FCM_TOKEN;
                            context9 = this.a.a;
                            b = aw.b(context9, as.ASSEMBLE_PUSH_FCM);
                            agVar.a(str, amVar, false, b);
                            context13 = this.a.a;
                            x.a(context13).b(str);
                        }
                    }
                    if (am.UPLOAD_COS_TOKEN.ordinal() == i) {
                        context6 = this.a.a;
                        if ("syncing".equals(x.a(context6).a(am.UPLOAD_COS_TOKEN))) {
                            agVar = this.a;
                            amVar = am.UPLOAD_COS_TOKEN;
                            context7 = this.a.a;
                            b = aw.b(context7, as.ASSEMBLE_PUSH_COS);
                            agVar.a(str, amVar, false, b);
                            context13 = this.a.a;
                            x.a(context13).b(str);
                        }
                    }
                    if (am.UPLOAD_FTOS_TOKEN.ordinal() == i) {
                        context4 = this.a.a;
                        if ("syncing".equals(x.a(context4).a(am.UPLOAD_FTOS_TOKEN))) {
                            agVar = this.a;
                            amVar = am.UPLOAD_FTOS_TOKEN;
                            context5 = this.a.a;
                            b = aw.b(context5, as.ASSEMBLE_PUSH_FTOS);
                            agVar.a(str, amVar, false, b);
                        }
                    }
                    context13 = this.a.a;
                    x.a(context13).b(str);
                } else {
                    context3 = this.a.a;
                    x.a(context3).d(str);
                }
            }
        }
    }
}
