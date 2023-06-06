package com.sankuai.mads.internal;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010<\u001a\u00020=2\u0006\u0010\u0016\u001a\u00020\u00042\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?J\u000e\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020CR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0016\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R.\u0010\u0019\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u001b\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0011\u0010,\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010\u000fR\u001a\u0010.\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\"\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR*\u00103\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r04j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r`5X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00106\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b7\u0010\u000fR\u001d\u00108\u001a\u0004\u0018\u00010\r8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0015\u001a\u0004\b9\u0010\u000fR\u000e\u0010;\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/sankuai/mads/internal/InternalMads;", "", "()V", "_application", "Landroid/app/Application;", "_application$annotations", "appId", "", "getAppId", "()I", "setAppId", "(I)V", PackageManageUtil.c, "", "getAppPackage", "()Ljava/lang/String;", "setAppPackage", "(Ljava/lang/String;)V", "appVersion", "getAppVersion", "appVersion$delegate", "Lkotlin/Lazy;", "application", "getApplication", "()Landroid/app/Application;", "cityInfos", "Lcom/sankuai/mads/internal/cache/TimeDataCache;", "", "getCityInfos", "()Lcom/sankuai/mads/internal/cache/TimeDataCache;", "setCityInfos", "(Lcom/sankuai/mads/internal/cache/TimeDataCache;)V", "defaultReporter", "Lcom/sankuai/mads/MadsReporter;", "getDefaultReporter", "()Lcom/sankuai/mads/MadsReporter;", "setDefaultReporter", "(Lcom/sankuai/mads/MadsReporter;)V", "enableLog", "", "getEnableLog", "()Z", "setEnableLog", "(Z)V", "host", "getHost", "isDevelop", "setDevelop", "networkType", "getNetworkType", "setNetworkType", "reportHostMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "reportUrl", "getReportUrl", "uuid", "getUuid", "uuid$delegate", "version", "install", "", "madsConfig", "Lkotlin/Function0;", "Lcom/sankuai/mads/Mads$MadsConfig;", "report", "event", "Lcom/sankuai/mads/Event;", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static Application c;
    public static boolean d;
    @Nullable
    public static com.sankuai.mads.d f;
    @Nullable
    public static com.sankuai.mads.internal.cache.b<Map<String, String>> g;
    @Nullable
    public static com.sankuai.mads.internal.cache.b<String> h;
    public static boolean i;
    public static final /* synthetic */ i[] b = {u.a(new s(u.a(c.class), "uuid", "getUuid()Ljava/lang/String;")), u.a(new s(u.a(c.class), "appVersion", "getAppVersion()Ljava/lang/String;"))};
    public static final c l = new c();
    public static int e = 404;
    @Nullable
    public static final kotlin.d j = kotlin.e.a(e.b);
    @Nullable
    private static final kotlin.d m = kotlin.e.a(a.b);
    @NotNull
    public static String k = "";
    private static final HashMap<String, String> n = new HashMap<>();

    @Nullable
    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return (String) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0ba224b5d3dbeafde61ce49c5e28e9", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0ba224b5d3dbeafde61ce49c5e28e9") : m.a());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends g implements kotlin.jvm.functions.a<Map<String, ? extends String>> {
        public static ChangeQuickRedirect a;

        public b(com.sankuai.mads.a aVar) {
            super(0, aVar);
        }

        @Override // kotlin.jvm.internal.b, kotlin.reflect.b
        public final String getName() {
            return "getCityInfo";
        }

        @Override // kotlin.jvm.internal.b
        public final kotlin.reflect.d getOwner() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ab21a8b744e0764dc24c950a83ebda", RobustBitConfig.DEFAULT_VALUE) ? (kotlin.reflect.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ab21a8b744e0764dc24c950a83ebda") : u.a(com.sankuai.mads.a.class);
        }

        @Override // kotlin.jvm.internal.b
        public final String getSignature() {
            return "getCityInfo()Ljava/util/Map;";
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ Map<String, ? extends String> invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "087f6627f9541091b61a97281bf043ba", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "087f6627f9541091b61a97281bf043ba") : ((com.sankuai.mads.a) this.receiver).a();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.sankuai.mads.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C0574c extends g implements kotlin.jvm.functions.a<Boolean> {
        public static ChangeQuickRedirect a;

        public C0574c(com.sankuai.mads.a aVar) {
            super(0, aVar);
        }

        @Override // kotlin.jvm.internal.b, kotlin.reflect.b
        public final String getName() {
            return "logEnable";
        }

        @Override // kotlin.jvm.internal.b
        public final kotlin.reflect.d getOwner() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b33c3cce219c0deb0fa964dbb2c2a5", RobustBitConfig.DEFAULT_VALUE) ? (kotlin.reflect.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b33c3cce219c0deb0fa964dbb2c2a5") : u.a(com.sankuai.mads.a.class);
        }

        @Override // kotlin.jvm.internal.b
        public final String getSignature() {
            return "logEnable()Z";
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ Boolean invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return Boolean.valueOf(PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d144a3288fd0a910d9dc6a085993f3a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d144a3288fd0a910d9dc6a085993f3a9")).booleanValue() : ((com.sankuai.mads.a) this.receiver).b());
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<String> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ Application b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Application application) {
            super(0);
            this.b = application;
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ String invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04950932a66ffe6deb9741a1b7e52367", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04950932a66ffe6deb9741a1b7e52367") : com.sankuai.mads.internal.utils.c.a(this.b);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<String> {
        public static ChangeQuickRedirect a;
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ String invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b5d036e390fa7f04f6b15508792096", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b5d036e390fa7f04f6b15508792096") : GetUUID.getInstance().getUUID(c.l.a());
        }
    }

    public static final /* synthetic */ Application a(c cVar) {
        return c;
    }

    @NotNull
    public final Application a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4695ca1ea3ad4372d2475cfc5ce922fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Application) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4695ca1ea3ad4372d2475cfc5ce922fd");
        }
        if (!(c != null)) {
            throw new IllegalStateException("Mads not installed".toString());
        }
        Application application = c;
        if (application == null) {
            h.a();
        }
        return application;
    }

    public static int b() {
        return e;
    }

    @Nullable
    public static com.sankuai.mads.internal.cache.b<Map<String, String>> c() {
        return g;
    }

    @Nullable
    public static com.sankuai.mads.internal.cache.b<String> d() {
        return h;
    }

    public static boolean e() {
        return i;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<String> {
        public static ChangeQuickRedirect a;
        public static final a b = new a();

        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.jvm.functions.a
        @Nullable
        /* renamed from: a */
        public String invoke() {
            PackageInfo packageInfo;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad75abe1a92c27073f18f09f3ec4c9e3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad75abe1a92c27073f18f09f3ec4c9e3");
            }
            Application a2 = c.a(c.l);
            if (a2 != null) {
                try {
                    PackageManager packageManager = a2.getPackageManager();
                    if (packageManager == null || (packageInfo = packageManager.getPackageInfo(a2.getPackageName(), 0)) == null) {
                        return null;
                    }
                    return packageInfo.versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            }
            return null;
        }
    }

    @NotNull
    public static String g() {
        return k;
    }

    @NotNull
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff01e05fcfdd7af124e1eaa088f51309", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff01e05fcfdd7af124e1eaa088f51309");
        }
        com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
        String a2 = com.sankuai.mads.internal.horn.a.a().a();
        String str = n.get(a2);
        if (str == null) {
            str = com.sankuai.meituan.switchtestenv.a.a(a(), a2);
            if (h.a((Object) a2, (Object) str)) {
                Uri parse = Uri.parse(com.sankuai.meituan.switchtestenv.a.a(a(), a2 + "/mtwmadlog"));
                str = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).build().toString();
            }
            if (str != null) {
                n.put(a2, str);
            } else {
                str = a2;
            }
        }
        return str + "/mtwmadlog";
    }

    @NotNull
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae3ada7ac55a0ff64beea88204303664", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae3ada7ac55a0ff64beea88204303664");
        }
        com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
        return com.sankuai.mads.internal.horn.a.a().a();
    }
}
