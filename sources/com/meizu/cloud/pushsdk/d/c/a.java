package com.meizu.cloud.pushsdk.d.c;

import com.meizu.cloud.pushsdk.d.f.d;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes3.dex */
public class a {
    public final List<com.meizu.cloud.pushsdk.d.a.b> a;
    final long b;
    final String c;

    /* renamed from: com.meizu.cloud.pushsdk.d.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0528a<T extends AbstractC0528a<T>> {
        List<com.meizu.cloud.pushsdk.d.a.b> a = new LinkedList();
        long b = System.currentTimeMillis();
        String c = e.b();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract T a();

        public final T a(long j) {
            this.b = j;
            return a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(AbstractC0528a<?> abstractC0528a) {
        d.a(abstractC0528a.a);
        d.a(abstractC0528a.c);
        d.a(!abstractC0528a.c.isEmpty(), "eventId cannot be empty");
        this.a = abstractC0528a.a;
        this.b = abstractC0528a.b;
        this.c = abstractC0528a.c;
    }
}
