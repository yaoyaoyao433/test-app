package com.sankuai.waimai.platform.widget.emptylayout;

import android.os.SystemClock;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j implements com.sankuai.waimai.foundation.core.service.screenshot.observer.a {
    public static ChangeQuickRedirect a;
    private static volatile j c;
    private final LinkedHashMap<String, a> b;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3683639fd3276313822b444bed578ec7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3683639fd3276313822b444bed578ec7");
        } else {
            this.b = new LinkedHashMap<>();
        }
    }

    public static /* synthetic */ void a(j jVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "8b6adbe05aa844392fdaea5e7f287edf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "8b6adbe05aa844392fdaea5e7f287edf");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (jVar.b) {
            if (jVar.b.size() > 0) {
                for (Map.Entry<String, a> entry : jVar.b.entrySet()) {
                    final a value = entry.getValue();
                    if (value != null && elapsedRealtime - value.e <= 10000) {
                        l.b(new l.a() { // from class: com.sankuai.waimai.platform.widget.emptylayout.j.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.utils.l.a
                            public final void a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d5f700abeeb373646a76ee30cd0d8ad", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d5f700abeeb373646a76ee30cd0d8ad");
                                } else {
                                    j.a(value.a, value.b, value.c, value.d);
                                }
                            }
                        }, (String) null);
                    }
                }
                jVar.b.clear();
            }
        }
    }

    public static /* synthetic */ void a(j jVar, String str, String str2, String str3, b bVar) {
        int i = 0;
        Object[] objArr = {str, str2, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "cd52824b937d78a51cec7b92fabff073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "cd52824b937d78a51cec7b92fabff073");
        } else if (!TextUtils.isEmpty(str2)) {
            a aVar = new a();
            aVar.a = str;
            aVar.b = str2;
            aVar.c = str3;
            aVar.d = bVar;
            aVar.e = SystemClock.elapsedRealtime();
            synchronized (jVar.b) {
                jVar.b.remove(str2);
                jVar.b.put(str2, aVar);
                int size = jVar.b.size() > 20 ? jVar.b.size() - 20 : 0;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, a> entry : jVar.b.entrySet()) {
                    String key = entry.getKey();
                    a value = entry.getValue();
                    if (i < size || value == null || elapsedRealtime - value.e > 10000) {
                        arrayList.add(key);
                    }
                    i++;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jVar.b.remove((String) it.next());
                }
            }
        }
    }

    public static /* synthetic */ void a(String str, String str2, String str3, b bVar) {
        Object[] objArr = {str, str2, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a2595f3b4af46dcc70a5469d9a71eaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a2595f3b4af46dcc70a5469d9a71eaf");
            return;
        }
        if (bVar == null) {
            bVar = new b(true);
        }
        com.sankuai.waimai.platform.capacity.log.e eVar = bVar.b;
        if (bVar.b == null) {
            String b = TextUtils.isEmpty(str2) ? c.b(bVar.a) : str2;
            if (!TextUtils.isEmpty(b)) {
                eVar = com.sankuai.waimai.platform.capacity.log.f.a().a(b);
            }
        }
        if (bVar.c) {
            String a2 = c.a(eVar, str2);
            if (TextUtils.isEmpty(str)) {
                str = "ToastError";
            }
            i iVar = new i();
            com.sankuai.waimai.platform.capacity.log.i.d(iVar.a(str + "_toast_error").b(str3).d(a2).a(true).b());
        }
    }

    public static j a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "393f8ef200c29e85d6ffdb951af48341", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "393f8ef200c29e85d6ffdb951af48341");
        }
        if (c == null) {
            synchronized (j.class) {
                if (c == null) {
                    c = new j();
                    com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(c);
                }
            }
        }
        return c;
    }

    @UiThread
    public final void a(final String str, final String str2, final Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a90e05fa37f2f948cedee465c58227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a90e05fa37f2f948cedee465c58227");
            return;
        }
        final String b = c.b(th);
        if (TextUtils.isEmpty(b)) {
            return;
        }
        final boolean a2 = com.sankuai.waimai.platform.capacity.log.d.a().a(b, true);
        l.b(new l.a() { // from class: com.sankuai.waimai.platform.widget.emptylayout.j.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.utils.l.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "55c2177eae066546f579ffc1d7317d4d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "55c2177eae066546f579ffc1d7317d4d");
                } else if (a2) {
                    j.a(str, b, str2, new b(th, true));
                } else {
                    j.a(j.this, str, b, str2, new b(th, true));
                }
            }
        }, (String) null);
    }

    @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed532e79305eb6fa68fad4798b1d573d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed532e79305eb6fa68fad4798b1d573d");
        } else {
            l.a(new Runnable() { // from class: com.sankuai.waimai.platform.widget.emptylayout.j.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f16146dcfb3c4df53903009d126ccb65", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f16146dcfb3c4df53903009d126ccb65");
                    } else {
                        j.a(j.this);
                    }
                }
            }, (String) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a {
        public String a;
        public String b;
        public String c;
        public b d;
        public long e;

        private a() {
        }
    }
}
