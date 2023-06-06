package com.xiaomi.push.service;

import com.xiaomi.push.service.ax;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes6.dex */
public final class ay implements Runnable {
    final /* synthetic */ ax a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ay(ax axVar) {
        this.a = axVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap;
        try {
            concurrentHashMap = this.a.e;
            for (ax.a aVar : concurrentHashMap.values()) {
                aVar.run();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a("Sync job exception :" + e.getMessage());
        }
        ax.a(this.a, false);
    }
}
