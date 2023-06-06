package com.sankuai.mads.internal.utils;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.text.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0086\bJ\u001f\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0086\bJ\u0017\u0010\u0016\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0086\bJ\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0086\bJ\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sankuai/mads/internal/utils/MadsLog;", "", "()V", "TAG", "", "loganExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getLoganExecutor", "()Ljava/util/concurrent/ExecutorService;", "logger", "Lcom/sankuai/mads/internal/utils/MadsLog$Logger;", "getLogger", "()Lcom/sankuai/mads/internal/utils/MadsLog$Logger;", "setLogger", "(Lcom/sankuai/mads/internal/utils/MadsLog$Logger;)V", "e", "", "message", "Lkotlin/Function0;", "throwable", "", "i", "logan", "Logcat", "Logger", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    @Nullable
    private static volatile InterfaceC0580b e;
    public static final b b = new b();
    private static final String c = c;
    private static final String c = c;
    private static final ExecutorService d = com.sankuai.android.jarvis.c.a("mads-logan");

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/sankuai/mads/internal/utils/MadsLog$Logger;", "", "e", "", "message", "", "i", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.sankuai.mads.internal.utils.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0580b {
        void a(@NotNull String str);

        void b(@NotNull String str);
    }

    public static final /* synthetic */ String a(b bVar) {
        return c;
    }

    public static final /* synthetic */ void a(b bVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "e70957adae6a9c43eb8ee4e41f62179d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "e70957adae6a9c43eb8ee4e41f62179d");
        } else {
            d.execute(new c(str));
        }
    }

    @Nullable
    public static InterfaceC0580b a() {
        return e;
    }

    public static void a(@Nullable InterfaceC0580b interfaceC0580b) {
        e = interfaceC0580b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ce132c1ec578b38fe94f7605ced1e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ce132c1ec578b38fe94f7605ced1e3");
                return;
            }
            com.dianping.networklog.c.a(b.a(b.b) + ':' + this.b, 3);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Lcom/sankuai/mads/internal/utils/MadsLog$Logcat;", "Lcom/sankuai/mads/internal/utils/MadsLog$Logger;", "()V", "e", "", "message", "", "i", "Companion", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a implements InterfaceC0580b {
        public static ChangeQuickRedirect a;
        public static final C0579a b = new C0579a(null);

        @Override // com.sankuai.mads.internal.utils.b.InterfaceC0580b
        public final void a(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07d53b8b01a70196d9b3aa78529a95e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07d53b8b01a70196d9b3aa78529a95e0");
                return;
            }
            h.b(str, "message");
            b("Normal:" + str);
        }

        @Override // com.sankuai.mads.internal.utils.b.InterfaceC0580b
        public final void b(@NotNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b7e1a97c45280faba0c6a44a3a7a7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b7e1a97c45280faba0c6a44a3a7a7b");
                return;
            }
            h.b(str, "message");
            if (str.length() < 4000) {
                Log.e(b.a(b.b), str);
                return;
            }
            for (String str2 : g.e(str)) {
                Log.e(b.a(b.b), str2);
            }
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/sankuai/mads/internal/utils/MadsLog$Logcat$Companion;", "", "()V", "install", "", "sdk_release"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.sankuai.mads.internal.utils.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0579a {
            public static ChangeQuickRedirect a;

            public C0579a() {
            }

            public /* synthetic */ C0579a(f fVar) {
                this();
            }
        }
    }
}
