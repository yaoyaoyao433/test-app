package com.xiaomi.push;

import com.xiaomi.push.m;
import java.util.Map;
/* loaded from: classes6.dex */
public final class o extends m.b {
    final /* synthetic */ m b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, m.a aVar) {
        super(aVar);
        this.b = mVar;
    }

    @Override // com.xiaomi.push.m.b
    final void a() {
        Object obj;
        Map map;
        obj = this.b.d;
        synchronized (obj) {
            map = this.b.c;
            map.remove(this.a.a());
        }
    }
}
