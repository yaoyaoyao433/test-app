package com.sankuai.waimai.alita.core.event.autorunner;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.autorunner.d;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaAutoRunManager {
    public static ChangeQuickRedirect a;
    final String b;
    final a c;
    final Map<String, d> d;
    public final ConcurrentHashMap<String, com.sankuai.waimai.alita.core.event.autorunner.d> e;
    @Deprecated
    private final e f;
    private final ConcurrentHashMap<String, e> g;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        Map<String, ?> a(com.sankuai.waimai.alita.core.event.a aVar);
    }

    public static /* synthetic */ void a(AlitaAutoRunManager alitaAutoRunManager, AutoRunStateObserverArg autoRunStateObserverArg) {
        Object[] objArr = {autoRunStateObserverArg};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, alitaAutoRunManager, changeQuickRedirect, false, "43f049b1eb796497d678b546ccec029d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, alitaAutoRunManager, changeQuickRedirect, false, "43f049b1eb796497d678b546ccec029d");
            return;
        }
        alitaAutoRunManager.f.setChanged();
        alitaAutoRunManager.f.notifyObservers(autoRunStateObserverArg);
        e c2 = alitaAutoRunManager.c(autoRunStateObserverArg.b);
        if (c2 != null) {
            c2.setChanged();
            c2.notifyObservers(autoRunStateObserverArg);
        }
    }

    public AlitaAutoRunManager(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a11123b854326024e993044bb9d8800", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a11123b854326024e993044bb9d8800");
            return;
        }
        this.b = str;
        this.c = new a();
        this.f = new e();
        this.g = new ConcurrentHashMap<>();
        this.d = new HashMap();
        this.e = new ConcurrentHashMap<>();
        AlitaRealTimeEventCenter.getInstance().addEventListener(this.b, new com.sankuai.waimai.alita.core.event.c() { // from class: com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.event.c
            public final void a(com.sankuai.waimai.alita.core.event.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5755a4893558f502f979b27e33c40ad2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5755a4893558f502f979b27e33c40ad2");
                } else if (AlitaBizConfigUtil.b(3, AlitaAutoRunManager.this.b) || aVar == null) {
                } else {
                    AlitaAutoRunManager alitaAutoRunManager = AlitaAutoRunManager.this;
                    Object[] objArr3 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = AlitaAutoRunManager.a;
                    if (PatchProxy.isSupport(objArr3, alitaAutoRunManager, changeQuickRedirect3, false, "af05fd0f217682c8e6f400780de9aa1f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, alitaAutoRunManager, changeQuickRedirect3, false, "af05fd0f217682c8e6f400780de9aa1f");
                        return;
                    }
                    a aVar2 = alitaAutoRunManager.c;
                    Object[] objArr4 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect4 = a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "a6668d6ce6788d2366ad494aa91d7a63", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "a6668d6ce6788d2366ad494aa91d7a63");
                        return;
                    }
                    aVar2.setChanged();
                    aVar2.notifyObservers(aVar);
                }
            }
        });
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd5e21ca1e959b6095357225ce84936", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd5e21ca1e959b6095357225ce84936");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "603f17d205e9dfd5150e827b39ffdb31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "603f17d205e9dfd5150e827b39ffdb31");
            return;
        }
        if (this.e.containsKey(str)) {
            this.e.remove(str).a();
        }
    }

    @Deprecated
    public final synchronized void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1a087b24ff0fd7ff0aaf8fed40416c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1a087b24ff0fd7ff0aaf8fed40416c");
        } else {
            this.f.addObserver(bVar);
        }
    }

    @Deprecated
    public final synchronized void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b7750d9763ccd794f3a7c19fba910f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b7750d9763ccd794f3a7c19fba910f");
            return;
        }
        if (bVar != null) {
            this.f.deleteObserver(bVar);
        }
    }

    public final synchronized void a(String str, b bVar) {
        e eVar;
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998ad07bee696edb04a8d6a164088a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998ad07bee696edb04a8d6a164088a16");
            return;
        }
        if (bVar != null) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "484fdba8d3000917097d17efe60e966b", RobustBitConfig.DEFAULT_VALUE)) {
                eVar = (e) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "484fdba8d3000917097d17efe60e966b");
            } else {
                e eVar2 = null;
                if (!TextUtils.isEmpty(str) && (eVar2 = c(str)) == null) {
                    eVar2 = new e();
                    this.g.put(str, eVar2);
                }
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar.addObserver(bVar);
            }
        }
    }

    public final synchronized void b(String str, b bVar) {
        e c2;
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80aeffcddb1df3de7f64a687b1684add", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80aeffcddb1df3de7f64a687b1684add");
            return;
        }
        if (bVar != null && (c2 = c(str)) != null) {
            c2.deleteObserver(bVar);
        }
    }

    public final void a(String str, @Nullable d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5600523abc0235f62b73ea2af21581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5600523abc0235f62b73ea2af21581");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            synchronized (this.d) {
                try {
                    if (dVar != null) {
                        this.d.put(str, dVar);
                    } else {
                        this.d.remove(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0979080381c33fd394fa6525c264e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0979080381c33fd394fa6525c264e6");
        } else {
            a(str, (d) null);
        }
    }

    @Nullable
    private e c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c7e8f5660129d988728cef721313e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c7e8f5660129d988728cef721313e3");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.g.get(str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e extends Observable {
        public static ChangeQuickRedirect b;

        @Override // java.util.Observable
        public synchronized void setChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e2564b26de958b8db351007cb205435", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e2564b26de958b8db351007cb205435");
            } else {
                super.setChanged();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends e {
        public static ChangeQuickRedirect a;

        public a() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Observer {
        public static ChangeQuickRedirect a;
        private static Handler b = new Handler(Looper.getMainLooper());
        private Handler c;

        public void a(@NonNull String str) {
        }

        public void a(@NonNull String str, @Nullable Exception exc) {
        }

        public void a(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
        }

        public void b(@NonNull String str) {
        }

        public void b(@NonNull String str, @Nullable Exception exc) {
        }

        public void b(@NonNull String str, @Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
        }

        public b() {
            this(null);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c768de07bfe0bc8dad890af95ba6fe6e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c768de07bfe0bc8dad890af95ba6fe6e");
            }
        }

        private b(@Nullable Handler handler) {
            Object[] objArr = {null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b1dd8b87680ba05cf37200aaf9853a4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b1dd8b87680ba05cf37200aaf9853a4");
            } else {
                this.c = null;
            }
        }

        @Override // java.util.Observer
        public final void update(Observable observable, final Object obj) {
            Object[] objArr = {observable, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff53661b13b35d9458cedff72dc98586", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff53661b13b35d9458cedff72dc98586");
            } else if (obj instanceof AutoRunStateObserverArg) {
                (this.c != null ? this.c : b).post(new Runnable() { // from class: com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d70233e11c6644e69288bd3e3c8afe8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d70233e11c6644e69288bd3e3c8afe8");
                            return;
                        }
                        AutoRunStateObserverArg autoRunStateObserverArg = (AutoRunStateObserverArg) obj;
                        switch (autoRunStateObserverArg.a) {
                            case 0:
                                b.this.a(autoRunStateObserverArg.b, autoRunStateObserverArg.c, autoRunStateObserverArg.d);
                                return;
                            case 1:
                                b.this.a(autoRunStateObserverArg.b, autoRunStateObserverArg.e);
                                return;
                            case 2:
                                b.this.b(autoRunStateObserverArg.b, autoRunStateObserverArg.c, autoRunStateObserverArg.d);
                                return;
                            case 3:
                                b.this.b(autoRunStateObserverArg.b, autoRunStateObserverArg.e);
                                return;
                            case 4:
                                b.this.a(autoRunStateObserverArg.b);
                                return;
                            case 5:
                                b.this.b(autoRunStateObserverArg.b);
                                return;
                            default:
                                return;
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class AutoRunStateObserverArg {
        public int a;
        public String b;
        public String c;
        public AlitaJSValue d;
        public Exception e;

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes4.dex */
        public @interface StateType {
            public static final int ON_DEAD = 5;
            public static final int ON_RUN_FAILED = 3;
            public static final int ON_RUN_SUCCESS = 2;
            public static final int ON_SLEEP = 4;
            public static final int ON_START_FAILED = 1;
            public static final int ON_START_SUCCESS = 0;
        }

        public AutoRunStateObserverArg() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class c implements d.b {
        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public Map<String, ?> a(com.sankuai.waimai.alita.core.event.a aVar) {
            return null;
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public void a() {
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public void a(@Nullable Exception exc) {
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public void b() {
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public void b(@Nullable Exception exc) {
        }

        @Override // com.sankuai.waimai.alita.core.event.autorunner.d.b
        public void b(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
        }

        public c() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[Catch: all -> 0x0140, TryCatch #0 {, blocks: (B:5:0x0006, B:7:0x001d, B:12:0x002f, B:14:0x0035, B:15:0x0039, B:17:0x0041, B:19:0x0045, B:24:0x0051, B:27:0x005b, B:29:0x006d, B:31:0x008e, B:32:0x0094, B:33:0x00b0, B:35:0x00ce, B:39:0x00e6, B:41:0x00ed, B:44:0x00fd, B:45:0x0117, B:36:0x00d2, B:38:0x00e1), top: B:51:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0006, B:7:0x001d, B:12:0x002f, B:14:0x0035, B:15:0x0039, B:17:0x0041, B:19:0x0045, B:24:0x0051, B:27:0x005b, B:29:0x006d, B:31:0x008e, B:32:0x0094, B:33:0x00b0, B:35:0x00ce, B:39:0x00e6, B:41:0x00ed, B:44:0x00fd, B:45:0x0117, B:36:0x00d2, B:38:0x00e1), top: B:51:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a(com.sankuai.waimai.alita.bundle.model.a r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager.a(com.sankuai.waimai.alita.bundle.model.a):boolean");
    }
}
