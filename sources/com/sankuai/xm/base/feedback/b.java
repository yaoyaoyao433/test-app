package com.sankuai.xm.base.feedback;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.component.d;
import com.sankuai.xm.base.component.e;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.service.a implements com.sankuai.xm.base.component.a, d, com.sankuai.xm.base.feedback.a {
    public static ChangeQuickRedirect a;
    private e b;
    private volatile a c;
    private volatile C1371b d;
    private volatile boolean e;
    private final ConcurrentHashMap<String, Object> f;
    private final Object j;

    private e b() {
        if (this.b == null) {
            synchronized (this.j) {
                if (this.b == null) {
                    this.b = new e(l.class, "mListenerService", this);
                }
            }
        }
        return this.b;
    }

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "485b3a87d555e85f83d35c9c0805c66a", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "485b3a87d555e85f83d35c9c0805c66a");
        }
        if (cls.isInstance(null)) {
            return cls.cast(null);
        }
        return null;
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92750d44cd24cbd8dcce32e6bbd7dfa6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92750d44cd24cbd8dcce32e6bbd7dfa6");
        } else if (bVar != null) {
            b().a(bVar);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3543cfc2c490f450bcb2a1c1656e9ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3543cfc2c490f450bcb2a1c1656e9ad");
            return;
        }
        this.f = new ConcurrentHashMap<>();
        this.j = new Object();
        this.b = null;
    }

    public static /* synthetic */ String a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "74354cd48eb2a204dc18f5c92944a999", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "74354cd48eb2a204dc18f5c92944a999");
        }
        return "feedback_config_" + str + CommonConstant.Symbol.UNDERLINE + f.m().b();
    }

    public static /* synthetic */ l d(b bVar) {
        return (l) bVar.b().a();
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69243d37f42454caadb1c9daf6195d16", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69243d37f42454caadb1c9daf6195d16")).intValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a73411264a5fda21c0963a17030a8215", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a73411264a5fda21c0963a17030a8215");
        } else {
            String a2 = com.sankuai.xm.base.hornconfig.a.a().a("feedback_config");
            com.sankuai.xm.log.a.b("FeedbackServiceImpl::loadConfig, %s", a2);
            this.c = new a(this, null);
            try {
                if (!ac.a(a2)) {
                    JSONObject jSONObject = new JSONObject(a2);
                    this.c.a = jSONObject.optBoolean(MarketingModel.TYPE_ENTER_DIALOG);
                    if (this.c.a) {
                        this.c.b = jSONObject.optInt("record_count_daily");
                        this.c.c = jSONObject.optInt("report_count_daily");
                        this.c.d = jSONObject.optBoolean("wifi", true);
                    }
                }
            } catch (JSONException e) {
                com.sankuai.xm.log.a.a(e, "FeedbackServiceImpl::loadConfig, %s", a2);
            }
        }
        return super.a();
    }

    @Override // com.sankuai.xm.base.service.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13c52346eac56cec7d304f554b923d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13c52346eac56cec7d304f554b923d5");
            return;
        }
        super.a(j);
        if (j != 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01b5661d31d8a8599a148311b197a330", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01b5661d31d8a8599a148311b197a330");
            } else {
                a(new Runnable() { // from class: com.sankuai.xm.base.feedback.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "76ce3ee9396e6a57126b2a09c6c394d5", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "76ce3ee9396e6a57126b2a09c6c394d5");
                            return;
                        }
                        b.this.d = new C1371b(b.this, null);
                        com.sankuai.xm.log.a.b("FeedbackServiceImpl::loadExeInfo, record:%d, report:%d", b.this.d.b.a(), b.this.d.a.a());
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.feedback.b$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public class AnonymousClass1 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ b c;

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad40dbff8cd19ffe7fc65d153cffe098", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad40dbff8cd19ffe7fc65d153cffe098");
                return;
            }
            if (this.b || !this.c.e) {
                final b bVar = this.c;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "de0b1adedca35832a4351da60104ec8a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "de0b1adedca35832a4351da60104ec8a");
                } else {
                    bVar.a(new Runnable() { // from class: com.sankuai.xm.base.feedback.b.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8270e113b2fd301e07f390a43cf32131", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8270e113b2fd301e07f390a43cf32131");
                                return;
                            }
                            int intValue = b.this.d.b.a().intValue() + 1;
                            if (intValue <= b.this.c.b) {
                                b.this.d.b.a(Integer.valueOf(intValue));
                                b.d(b.this).b(c.class).c().a(new b.a<c>() { // from class: com.sankuai.xm.base.feedback.b.2.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.xm.base.util.b.a
                                    public final /* synthetic */ boolean a(c cVar) {
                                        c cVar2 = cVar;
                                        Object[] objArr4 = {cVar2};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b17188bd7f1897a03d92f91df23d081", 6917529027641081856L)) {
                                            return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b17188bd7f1897a03d92f91df23d081")).booleanValue();
                                        }
                                        cVar2.a();
                                        return false;
                                    }
                                });
                            } else {
                                com.sankuai.xm.log.a.c("FeedbackServiceImpl::feedback record reach %d", Integer.valueOf(b.this.c.b));
                            }
                            b.this.e = true;
                        }
                    });
                }
            }
            this.c.e = false;
            int intValue = this.c.d.a.a().intValue() + 1;
            if (intValue > this.c.c.c || (this.c.c.d && !com.sankuai.xm.base.util.net.d.e(f.m().g()))) {
                com.sankuai.xm.log.a.c("FeedbackServiceImpl::feedback report no reach conditions: max count=%d, check wifi=%s", Integer.valueOf(this.c.c.c), Boolean.valueOf(this.c.c.d));
                return;
            }
            this.c.d.a.a(Integer.valueOf(intValue));
            com.sankuai.xm.log.c.a(f.m().l(), new Date());
            m.d().a();
        }
    }

    void a(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57b9821c04d2d6081b3e3ea89e7c729", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57b9821c04d2d6081b3e3ea89e7c729");
        } else if (com.sankuai.xm.threadpool.scheduler.a.b().a(Thread.currentThread().getName(), 22)) {
            runnable.run();
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(22, runnable);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a {
        public boolean a;
        public int b;
        public int c;
        public boolean d;

        private a() {
            this.d = true;
        }

        public /* synthetic */ a(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.feedback.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class C1371b {
        public volatile com.sankuai.xm.base.util.f<Integer> a;
        public volatile com.sankuai.xm.base.util.f<Integer> b;

        private C1371b() {
            this.a = new com.sankuai.xm.base.util.f<>(com.sankuai.xm.base.e.a(), b.a(b.this, "report"), 0);
            this.b = new com.sankuai.xm.base.util.f<>(com.sankuai.xm.base.e.a(), b.a(b.this, "record"), 0);
        }

        public /* synthetic */ C1371b(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
