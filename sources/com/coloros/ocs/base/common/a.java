package com.coloros.ocs.base.common;

import android.app.PendingIntent;
/* loaded from: classes.dex */
public final class a {
    private PendingIntent a;
    private int b;

    public a(int i) {
        this(i, null);
    }

    private a(int i, PendingIntent pendingIntent) {
        this.b = i;
        this.a = null;
    }

    public final String toString() {
        return com.coloros.ocs.base.a.c.a(this).a("statusCode", com.coloros.ocs.base.common.constant.a.a(this.b)).toString();
    }
}
