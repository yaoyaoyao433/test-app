package com.dianping.eunomia;

import android.content.res.Resources;
import android.os.Parcelable;
import com.dianping.archive.DPObject;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.controller.group.bean.GroupAnnouncement;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.t;
import org.jetbrains.annotations.Nullable;
import rx.d;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\b\u0010 \u001a\u0004\u0018\u00010!J\n\u0010\"\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010#\u001a\u0004\u0018\u00010$J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001fJ\u0010\u0010'\u001a\u00020(2\u0006\u0010&\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006)"}, d2 = {"Lcom/dianping/eunomia/ModuleStore;", "", "()V", "MODULE_CONFIG_ASSET", "", "MODULE_CONFIG_FILE", "PREFIX", "cache", "Lcom/dianping/eunomia/ModuleConfigCache;", "getCache$eunomia_release", "()Lcom/dianping/eunomia/ModuleConfigCache;", "setCache$eunomia_release", "(Lcom/dianping/eunomia/ModuleConfigCache;)V", "resources", "Landroid/content/res/Resources;", "threadExecutor", "Ljava/util/concurrent/ExecutorService;", "version", "", "getVersion$eunomia_release", "()I", "setVersion$eunomia_release", "(I)V", "clearFile", "", "init", "context", "Landroid/content/Context;", "loadCache", "Lrx/Observable;", GroupAnnouncement.GROUP_ANNOUNCEMENT_READ, "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "readAsset", "Lcom/dianping/eunomia/ModulesConfig;", "readByIO", "readFile", "Lcom/dianping/eunomia/ModuleConfigPersist;", "write", "data", "writeFile", "", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class m {
    public static ChangeQuickRedirect a;
    static int b;
    @Nullable
    static com.dianping.eunomia.b c;
    public static final m d = new m();
    private static Resources e;
    private static final ExecutorService f;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<no name provided>", "Lcom/dianping/eunomia/ModuleConfigCache;", com.huawei.hms.opendevice.c.a, "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b<T, R> implements rx.functions.g<T, R> {
        public static ChangeQuickRedirect a;
        public static final b b = new b();

        @Override // rx.functions.g
        public final /* synthetic */ Object call(Object obj) {
            com.dianping.eunomia.b bVar = (com.dianping.eunomia.b) obj;
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37372d736cb0a6d101f36557bdc9b525", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.dianping.eunomia.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37372d736cb0a6d101f36557bdc9b525");
            }
            kotlin.jvm.internal.h.b(bVar, com.huawei.hms.opendevice.c.a);
            m mVar = m.d;
            m.a(bVar);
            return bVar;
        }
    }

    static {
        ExecutorService a2 = com.sankuai.android.jarvis.c.a("module_manager_dpcache");
        kotlin.jvm.internal.h.a((Object) a2, "Jarvis.newSingleThreadEx…\"module_manager_dpcache\")");
        f = a2;
    }

    @Nullable
    public static com.dianping.eunomia.b a() {
        return c;
    }

    public static void a(@Nullable com.dianping.eunomia.b bVar) {
        c = bVar;
    }

    @Nullable
    public final ModuleConfigPersist b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed27ae7e698f58efb5c065ac760c4a42", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModuleConfigPersist) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed27ae7e698f58efb5c065ac760c4a42");
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        t.b bVar = new t.b();
        bVar.a = null;
        f.execute(new c(bVar, countDownLatch));
        try {
            countDownLatch.await(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            h hVar = h.b;
            Class<?> cls = d.getClass();
            String message = e2.getMessage();
            if (message == null) {
                message = "readFile:timeout";
            }
            hVar.a(cls, message);
        }
        ModuleConfigPersist moduleConfigPersist = (ModuleConfigPersist) bVar.a;
        if (moduleConfigPersist != null) {
            if (b != 0 && moduleConfigPersist.appVersion != 0 && b == moduleConfigPersist.appVersion) {
                return moduleConfigPersist;
            }
            d.d();
        }
        return null;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ t.b b;
        public final /* synthetic */ CountDownLatch c;

        public c(t.b bVar, CountDownLatch countDownLatch) {
            this.b = bVar;
            this.c = countDownLatch;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [T, com.dianping.eunomia.ModuleConfigPersist] */
        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71340377324924bee7ec1c1c706daf2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71340377324924bee7ec1c1c706daf2e");
                return;
            }
            try {
                this.b.a = (ModuleConfigPersist) com.dianping.cache.a.a().a("eunomia_moduleconfigfile", (String) null, 31539600000L, false, (Parcelable.Creator<Object>) ModuleConfigPersist.CREATOR);
            } catch (Exception e) {
                h hVar = h.b;
                Class<?> cls = m.d.getClass();
                String message = e.getMessage();
                if (message == null) {
                    message = "readFile:failed";
                }
                hVar.a(cls, message);
            }
            this.c.countDown();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lcom/dianping/eunomia/ModuleConfigCache;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class a<T> implements d.a<com.dianping.eunomia.b> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            rx.j jVar = (rx.j) obj;
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b02258a423b20d3a4b9f49e98198b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b02258a423b20d3a4b9f49e98198b6");
                return;
            }
            com.dianping.eunomia.b f = m.d.f();
            if (f != null) {
                jVar.onNext(f);
                jVar.onCompleted();
                return;
            }
            jVar.onError(new Exception("loadCache failed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.dianping.eunomia.b f() {
        ModuleConfigResponse moduleConfigResponse;
        ModuleConfigResponse moduleConfigResponse2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04810d95965232cc3198490c3e4a33cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.eunomia.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04810d95965232cc3198490c3e4a33cd");
        }
        ModuleConfigPersist b2 = b();
        if (b2 != null && (moduleConfigResponse2 = b2.moduleConfigResponse) != null) {
            return new com.dianping.eunomia.b(false, moduleConfigResponse2);
        }
        ModulesConfig e2 = e();
        if (e2 != null && (moduleConfigResponse = e2.moduleConfigRes) != null) {
            return new com.dianping.eunomia.b(true, moduleConfigResponse);
        }
        h.b.a(d.getClass(), "readByIO:failed");
        return null;
    }

    @Nullable
    public final ModuleConfigResponse c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "736d2bfc5bad3e12004339ad58d7f2dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModuleConfigResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "736d2bfc5bad3e12004339ad58d7f2dd");
        }
        if (c != null) {
            com.dianping.eunomia.b bVar = c;
            if (bVar == null) {
                kotlin.jvm.internal.h.a();
            }
            return bVar.c;
        }
        com.dianping.eunomia.b f2 = f();
        if (f2 != null) {
            return f2.c;
        }
        return null;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef13b4219be94054dc523d170bcbe198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef13b4219be94054dc523d170bcbe198");
        } else {
            com.dianping.cache.a.a().a("eunomia_moduleconfigfile", (String) null);
        }
    }

    @Nullable
    public final ModulesConfig e() {
        DPObject dPObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03947fc1a8740109dc8fe43e7de24af4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ModulesConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03947fc1a8740109dc8fe43e7de24af4");
        }
        if (e == null) {
            return null;
        }
        try {
            Resources resources = e;
            if (resources == null) {
                kotlin.jvm.internal.h.a("resources");
            }
            InputStream open = resources.getAssets().open("eunomia_moduleconfigasset");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            dPObject = new com.dianping.archive.e(bArr).e();
        } catch (Exception unused) {
            dPObject = null;
        }
        if (dPObject != null) {
            try {
                return (ModulesConfig) dPObject.a(ModulesConfig.DECODER);
            } catch (Exception unused2) {
            }
        }
        return null;
    }
}
