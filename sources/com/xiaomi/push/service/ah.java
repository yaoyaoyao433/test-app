package com.xiaomi.push.service;

import com.meituan.android.common.locate.loader.LocationStrategy;
import com.xiaomi.push.service.ag;
/* loaded from: classes6.dex */
public final class ah implements ag.b.a {
    final /* synthetic */ ag.b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(ag.b bVar) {
        this.a = bVar;
    }

    @Override // com.xiaomi.push.service.ag.b.a
    public final void a(ag.c cVar, ag.c cVar2, int i) {
        if (cVar2 == ag.c.binding) {
            this.a.p.a(this.a.t, LocationStrategy.LOCATION_TIMEOUT);
        } else {
            this.a.p.a(this.a.t);
        }
    }
}
