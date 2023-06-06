package com.unionpay.mobile.android.utils;

import android.os.Handler;
/* loaded from: classes6.dex */
public final class l {
    private static org.simalliance.openmobileapi.c a;
    private com.unionpay.mobile.android.nocard.views.b b;
    private Handler.Callback c = new m(this);
    private Handler d = new Handler(this.c);

    public static org.simalliance.openmobileapi.c a() {
        return a;
    }

    public final void serviceConnected(org.simalliance.openmobileapi.c cVar) {
        k.c("uppay", "se service connected");
        k.c("uppay", "mSEService:" + a);
        k.c("uppay", "mSEService.isConnected:" + a.a());
        this.d.sendEmptyMessage(1);
    }
}
