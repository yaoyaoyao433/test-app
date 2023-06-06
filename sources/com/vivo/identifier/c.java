package com.vivo.identifier;

import android.database.ContentObserver;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends ContentObserver {
    private String a;
    private int b;
    private b c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar, int i, String str) {
        super(null);
        this.c = bVar;
        this.b = i;
        this.a = str;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.c != null) {
            b.c(this.b, this.a);
        } else {
            Log.e("VMS_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
