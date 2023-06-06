package com.sankuai.xm.im.message;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.j;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    private static com.sankuai.xm.login.net.taskqueue.f c;
    protected volatile long b;
    private final Object d;
    private Map<String, C1389a> e;

    public abstract void b(C1389a c1389a);

    public static /* synthetic */ void a(a aVar, String str, C1389a c1389a) {
        C1389a c1389a2;
        Object[] objArr = {str, c1389a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "31f281df6ec058586038faf66b746ce3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "31f281df6ec058586038faf66b746ce3");
        } else if (c1389a == null || TextUtils.isEmpty(str)) {
        } else {
            synchronized (aVar.d) {
                c1389a2 = aVar.e.get(str);
            }
            if (c1389a2 == null) {
                com.sankuai.xm.im.utils.a.d("BaseRetryController::onTimer:info = null,key: " + str, new Object[0]);
                if (c1389a.f != -1) {
                    c.a(c1389a.f);
                    return;
                }
                return;
            }
            aVar.b(c1389a2);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb4f29681da4a7ee733ca8f4a1ff4f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb4f29681da4a7ee733ca8f4a1ff4f0");
            return;
        }
        this.d = new Object();
        this.e = new HashMap();
        this.b = 0L;
    }

    public final void a(final C1389a c1389a) {
        Object[] objArr = {c1389a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480acbb1a60df44ce35ea5026b435223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480acbb1a60df44ce35ea5026b435223");
            return;
        }
        e();
        if (TextUtils.isEmpty(c1389a.b)) {
            return;
        }
        com.sankuai.xm.im.utils.a.b("BaseRetryController::addTimer:key:%s", c1389a.b);
        synchronized (this.d) {
            if (this.e.containsKey(c1389a.b)) {
                return;
            }
            long a2 = c.a(new com.sankuai.xm.login.net.taskqueue.base.b() { // from class: com.sankuai.xm.im.message.a.1
                public static ChangeQuickRedirect a;
                private com.sankuai.xm.base.trace.g d = j.a();

                @Override // com.sankuai.xm.login.net.taskqueue.base.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c99a2e68c28631efc8f1348e0667bb66", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c99a2e68c28631efc8f1348e0667bb66");
                        return;
                    }
                    try {
                        j.a(this.d);
                        a.a(a.this, c1389a.b, c1389a);
                        j.c(this.d);
                    } catch (Throwable th) {
                        j.a(this.d, th);
                        throw th;
                    }
                }
            }, c1389a.d, true);
            if (a2 != -1) {
                c1389a.f = a2;
                c1389a.h = j.a();
                this.e.put(c1389a.b, c1389a);
            }
        }
    }

    public final void a(String str) {
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a619650f3b3f09a529cc0f8444c294f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a619650f3b3f09a529cc0f8444c294f6");
            return;
        }
        e();
        synchronized (this.d) {
            j = this.e.containsKey(str) ? this.e.get(str).f : -1L;
            this.e.remove(str);
        }
        com.sankuai.xm.im.utils.a.b("BaseRetryController::removeTimer:key:%s,%s", str, Long.valueOf(j));
        if (j != -1) {
            c.a(j);
        }
    }

    public final Map<String, C1389a> a() {
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af647ef0757c11ac1e06ad2bb4ba1e12", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af647ef0757c11ac1e06ad2bb4ba1e12");
        }
        e();
        synchronized (this.d) {
            hashMap = this.e.isEmpty() ? null : new HashMap(this.e);
        }
        return hashMap;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4fb752b947a176ec1bda36b887152f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4fb752b947a176ec1bda36b887152f");
            return;
        }
        com.sankuai.xm.im.utils.a.b("BaseRetryController::release", new Object[0]);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44c426f9ff853245e04745113cc3262f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44c426f9ff853245e04745113cc3262f");
            return;
        }
        e();
        synchronized (this.d) {
            if (this.e.isEmpty()) {
                return;
            }
            for (Map.Entry<String, C1389a> entry : this.e.entrySet()) {
                if (entry.getValue().f != -1) {
                    c.a(entry.getValue().f);
                }
            }
            this.e.clear();
        }
    }

    public static synchronized void c() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cba11e25d705d6371293aa9798368355", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cba11e25d705d6371293aa9798368355");
            } else if (c == null) {
            } else {
                c.e();
            }
        }
    }

    public static com.sankuai.xm.login.net.taskqueue.f d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3be411c92f6d158779437e8f2560a01", 6917529027641081856L)) {
            return (com.sankuai.xm.login.net.taskqueue.f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3be411c92f6d158779437e8f2560a01");
        }
        e();
        return c;
    }

    private static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e919d0fb7afd1c75e5666017b821c090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e919d0fb7afd1c75e5666017b821c090");
        } else if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    com.sankuai.xm.login.net.taskqueue.f fVar = new com.sankuai.xm.login.net.taskqueue.f();
                    c = fVar;
                    fVar.d();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.im.message.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1389a {
        public static ChangeQuickRedirect a;
        public String b;
        public Object c;
        public long d;
        public int e;
        long f;
        public long g;
        public com.sankuai.xm.base.trace.g h;

        public C1389a() {
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f577e4cc4dccb8983d2f775cb5c6834", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f577e4cc4dccb8983d2f775cb5c6834");
            }
            return "RetryInfo{key='" + this.b + "', obj=" + this.c + ", interval=" + this.d + ", totalRetries=" + this.e + ", taskId=" + this.f + ", lastRetryTime=" + this.g + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        UNKNOWN,
        NORMAL,
        CANCEL,
        SYNC;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95cca20c880adf54f24db464187dbeed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95cca20c880adf54f24db464187dbeed");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ce6eac0c2e256abbcd8eaf868807631", 6917529027641081856L) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ce6eac0c2e256abbcd8eaf868807631") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b70feb4a7cd3d2f47cfdfa6ec1039af5", 6917529027641081856L) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b70feb4a7cd3d2f47cfdfa6ec1039af5") : (b[]) values().clone();
        }
    }
}
