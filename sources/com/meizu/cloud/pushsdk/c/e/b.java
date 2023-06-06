package com.meizu.cloud.pushsdk.c.e;

import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.g.f;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class b extends j {
    final j a;
    d b;
    private com.meizu.cloud.pushsdk.c.g.c c;

    public b(j jVar, com.meizu.cloud.pushsdk.c.d.a aVar) {
        this.a = jVar;
        if (aVar != null) {
            this.b = new d(aVar);
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final g a() {
        return this.a.a();
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final long b() throws IOException {
        return this.a.b();
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public final void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException {
        if (this.c == null) {
            this.c = com.meizu.cloud.pushsdk.c.g.g.a(new f(cVar) { // from class: com.meizu.cloud.pushsdk.c.e.b.1
                long a = 0;
                long b = 0;

                @Override // com.meizu.cloud.pushsdk.c.g.f, com.meizu.cloud.pushsdk.c.g.l
                public final void a(com.meizu.cloud.pushsdk.c.g.b bVar, long j) throws IOException {
                    super.a(bVar, j);
                    if (this.b == 0) {
                        this.b = b.this.a.b();
                    }
                    this.a += j;
                    if (b.this.b != null) {
                        b.this.b.obtainMessage(1, new com.meizu.cloud.pushsdk.c.f.a(this.a, this.b)).sendToTarget();
                    }
                }
            });
        }
        this.a.a(this.c);
        this.c.flush();
    }
}
