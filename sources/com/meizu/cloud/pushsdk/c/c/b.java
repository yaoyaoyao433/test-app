package com.meizu.cloud.pushsdk.c.c;

import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class b extends j {
    private static final g a = g.a(PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
    private final List<String> b;
    private final List<String> c;

    /* loaded from: classes3.dex */
    public static final class a {
        public final List<String> a = new ArrayList();
        public final List<String> b = new ArrayList();
    }

    private b(List<String> list, List<String> list2) {
        this.b = m.a(list);
        this.c = m.a(list2);
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final g a() {
        return a;
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final void a(com.meizu.cloud.pushsdk.c.g.c cVar) {
        a(cVar, false);
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final long b() {
        return a((com.meizu.cloud.pushsdk.c.g.c) null, true);
    }

    private long a(com.meizu.cloud.pushsdk.c.g.c cVar, boolean z) {
        com.meizu.cloud.pushsdk.c.g.b bVar = z ? new com.meizu.cloud.pushsdk.c.g.b() : cVar.a();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                bVar.b(38);
            }
            bVar.b(this.b.get(i));
            bVar.b(61);
            bVar.b(this.c.get(i));
        }
        if (z) {
            long j = bVar.b;
            bVar.g();
            return j;
        }
        return 0L;
    }
}
