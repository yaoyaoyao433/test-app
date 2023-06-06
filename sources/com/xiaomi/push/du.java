package com.xiaomi.push;

import android.content.Context;
/* loaded from: classes6.dex */
public final class du {
    public static int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dz a(Context context) {
        int a2 = com.xiaomi.push.service.z.a(context).a(hg.HeartbeatPolicyInt.by, 0);
        if (!jj.a()) {
            a2 = 1;
        }
        a = a2;
        switch (a2) {
            case 0:
                return new eg(context);
            case 1:
                return new ee(context);
            case 2:
                return new eh(context);
            default:
                return new eg(context);
        }
    }
}
