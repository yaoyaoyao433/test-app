package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.hg;
import com.xiaomi.push.service.z;
/* loaded from: classes6.dex */
public final class au extends z.a {
    final /* synthetic */ at a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(at atVar, int i, String str) {
        super(101, str);
        this.a = atVar;
    }

    @Override // com.xiaomi.push.service.z.a
    public final void a() {
        Context context;
        boolean z;
        Context context2;
        context = this.a.a;
        boolean a = com.xiaomi.push.service.z.a(context).a(hg.AggregatePushSwitch.by, true);
        z = this.a.c;
        if (z != a) {
            this.a.c = a;
            context2 = this.a.a;
            aw.b(context2);
        }
    }
}
