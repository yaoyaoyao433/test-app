package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes6.dex */
public final class aj extends ContentObserver {
    final /* synthetic */ ag a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(ag agVar, Handler handler) {
        super(handler);
        this.a = agVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        Context context;
        Integer num;
        Context context2;
        Context context3;
        ag agVar = this.a;
        context = this.a.a;
        agVar.l = Integer.valueOf(com.xiaomi.push.service.an.a(context).a());
        num = this.a.l;
        if (num.intValue() != 0) {
            context2 = this.a.a;
            context2.getContentResolver().unregisterContentObserver(this);
            context3 = this.a.a;
            if (com.xiaomi.push.al.a(context3)) {
                this.a.d();
            }
        }
    }
}
