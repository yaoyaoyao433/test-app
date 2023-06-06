package com.xiaomi.push.service;

import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class m extends m.a {
    final /* synthetic */ String a;
    final /* synthetic */ w b;
    final /* synthetic */ int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(String str, w wVar, int i) {
        this.a = str;
        this.b = wVar;
        this.c = i;
    }

    @Override // com.xiaomi.push.m.a
    public final String a() {
        return this.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a(this.c);
    }
}
