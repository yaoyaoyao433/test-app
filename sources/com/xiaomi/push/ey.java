package com.xiaomi.push;

import com.xiaomi.push.an;
import com.xiaomi.push.jc;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;
/* loaded from: classes6.dex */
public final class ey {
    public boolean a = false;
    int b;
    long c;
    private String d;
    private ex e;
    private an f;

    /* loaded from: classes6.dex */
    public static class a {
        public static final ey a = new ey();
    }

    public static ex a() {
        ex exVar;
        synchronized (a.a) {
            exVar = a.a.e;
        }
        return exVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(er erVar) {
        this.f.a(erVar);
    }

    public final synchronized void a(XMPushService xMPushService) {
        this.e = new ex(xMPushService);
        this.d = "";
        com.xiaomi.push.service.av.a().a(new ez(this));
    }

    public ey() {
        an anVar;
        anVar = an.a.d;
        this.f = anVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized es b() {
        es esVar;
        esVar = null;
        boolean z = false;
        if (this.a && System.currentTimeMillis() - this.c > this.b) {
            this.a = false;
            this.c = 0L;
        }
        if (this.a && this.f.a() > 0) {
            z = true;
        }
        if (z) {
            esVar = a(al.d(this.e.a) ? 750 : 375);
        }
        return esVar;
    }

    private es a(int i) {
        ArrayList arrayList = new ArrayList();
        es esVar = new es(this.d, arrayList);
        if (!al.d(this.e.a)) {
            esVar.b = hf.h(this.e.a);
        }
        je jeVar = new je(i);
        iw a2 = new jc.a().a(jeVar);
        try {
            esVar.b(a2);
        } catch (iq unused) {
        }
        LinkedList<an.a> b = this.f.b();
        while (b.size() > 0) {
            try {
                an.a last = b.getLast();
                er erVar = null;
                if (last.a != 0) {
                    erVar = c();
                    erVar.a(eq.CHANNEL_STATS_COUNTER.af);
                    erVar.c(last.a);
                    erVar.g = last.b;
                } else if (last.c instanceof er) {
                    erVar = (er) last.c;
                }
                if (erVar != null) {
                    erVar.b(a2);
                }
                if (jeVar.a.size() > i) {
                    break;
                }
                if (erVar != null) {
                    arrayList.add(erVar);
                }
                b.removeLast();
            } catch (iq | NoSuchElementException unused2) {
            }
        }
        return esVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized er c() {
        er erVar;
        erVar = new er();
        erVar.d = al.i(this.e.a);
        erVar.a = (byte) 0;
        erVar.c = 1;
        erVar.d((int) (System.currentTimeMillis() / 1000));
        return erVar;
    }
}
