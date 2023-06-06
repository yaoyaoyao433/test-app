package com.xiaomi.push.service;

import com.xiaomi.push.fa;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public final class p implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b;
        boolean b2;
        b = o.b("www.baidu.com:80");
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (!b) {
                b2 = o.b(str);
                if (!b2) {
                    b = false;
                    if (!b && !this.b) {
                        break;
                    }
                }
            }
            b = true;
            if (!b) {
            }
        }
        fa.a(b ? 1 : 2);
    }
}
