package org.apache.flink.cep.mlink;

import com.meituan.android.common.aidata.utils.LogUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.flink.cep.mlink.bean.BaseEvent;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class a<IN extends BaseEvent> {
    public String a;
    public String b;
    private c d;
    private final org.apache.flink.cep.nfa.aftermatch.a f;
    private org.apache.flink.cep.nfa.c h;
    private d i;
    private e j;
    public int c = -1;
    private AtomicInteger k = new AtomicInteger(0);
    private transient org.apache.flink.cep.time.a e = new C1535a();
    private transient org.apache.flink.cep.nfa.sharedbuffer.d<IN> g = new org.apache.flink.cep.nfa.sharedbuffer.d<>();

    public a(Collection<org.apache.flink.cep.nfa.d> collection, long j, boolean z, org.apache.flink.cep.nfa.aftermatch.a aVar, d dVar, e eVar) {
        this.d = new c(this, collection, j, true);
        this.h = this.d.a();
        this.f = aVar;
        this.i = dVar;
        this.j = eVar;
    }

    public final void a(IN in) {
        if (this.c == -1 || this.k.get() < this.c) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                a(this.h, currentTimeMillis);
                a(this.d.a((org.apache.flink.cep.nfa.sharedbuffer.e<org.apache.flink.cep.nfa.c>) this.g.a(), this.h, (org.apache.flink.cep.nfa.c) in, currentTimeMillis, this.f, this.e), currentTimeMillis);
                b();
            } catch (Exception e) {
                if (LogUtil.isLogEnabled()) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void b() {
        if (this.h.c) {
            this.h.c = false;
        }
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        Queue<org.apache.flink.cep.nfa.a> queue = this.h.a;
        org.apache.flink.cep.nfa.sharedbuffer.e<IN> a = this.g.a();
        for (org.apache.flink.cep.nfa.a aVar : queue) {
            if (aVar.e != null) {
                try {
                    a.b(aVar.d);
                } catch (Exception e) {
                    if (LogUtil.isLogEnabled()) {
                        e.printStackTrace();
                    }
                }
                arrayList.add(aVar);
            }
        }
        queue.removeAll(arrayList);
    }

    private void a(Iterable<Map<String, List<IN>>> iterable, long j) throws Exception {
        if (this.i != null) {
            for (Map<String, List<IN>> map : iterable) {
                if (d()) {
                    c();
                    this.i.flatSelect(map, this.k.get());
                }
            }
        }
    }

    private void a(Collection<org.apache.flink.cep.common.tuple.b<Map<String, List<IN>>, Long>> collection) throws Exception {
        if (this.j != null) {
            for (org.apache.flink.cep.common.tuple.b<Map<String, List<IN>>, Long> bVar : collection) {
                this.j.timeout(bVar.a);
            }
        }
    }

    private void a(org.apache.flink.cep.nfa.c cVar, long j) throws Exception {
        org.apache.flink.cep.nfa.sharedbuffer.e<IN> a = this.g.a();
        try {
            Collection<org.apache.flink.cep.common.tuple.b<Map<String, List<IN>>, Long>> a2 = this.d.a(a, cVar, j);
            if (!a2.isEmpty()) {
                a(a2);
            }
            a.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (th != null) {
                    try {
                        a.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                } else {
                    a.close();
                }
                throw th2;
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: org.apache.flink.cep.mlink.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    class C1535a implements org.apache.flink.cep.time.a {
        private C1535a() {
        }
    }

    private void c() {
        this.k.getAndIncrement();
        StringBuilder sb = new StringBuilder("Identifier=");
        sb.append(this.a);
        sb.append(", current match times: ");
        sb.append(this.k.get());
    }

    private boolean d() {
        return this.c == -1 || this.k.get() < this.c;
    }
}
