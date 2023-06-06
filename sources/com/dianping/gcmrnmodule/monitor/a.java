package com.dianping.gcmrnmodule.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.android.mrn.config.c;
import com.meituan.android.mrn.config.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor;", "", "context", "Landroid/content/Context;", "host", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "(Landroid/content/Context;Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;)V", "getContext", "()Landroid/content/Context;", "currentReuseId", "", "getHost", "()Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "listName", "normalCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "service", "Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor$DefaultMonitorService;", "whiteScreenCounter", "whiteScreenTimeTotal", "", "reset", "", "reuseId", "ridBindToInput", "ridSendToJs", "sendContainerNormal", "sendContainerWhiteScreen", "whiteTime", "sendWhiteReport", "start", "Companion", "DefaultMonitorService", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final C0067a i = new C0067a(null);
    public b b;
    public String c;
    public String d;
    public AtomicInteger e;
    public AtomicInteger f;
    public long g;
    @NotNull
    public final com.dianping.gcmrnmodule.hostwrapper.a h;
    @NotNull
    private final Context j;

    public a(@NotNull Context context, @NotNull com.dianping.gcmrnmodule.hostwrapper.a aVar) {
        h.b(context, "context");
        h.b(aVar, "host");
        boolean z = true;
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1165bb5a576eef61ae9384172aa64f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1165bb5a576eef61ae9384172aa64f");
            return;
        }
        this.j = context;
        this.h = aVar;
        this.c = "mrnmodule.stat/list";
        this.d = "INVALID_REUSEID";
        this.e = new AtomicInteger();
        this.f = new AtomicInteger();
        e a2 = c.a();
        com.facebook.infer.annotation.a.a((a2 == null || a2.f() <= 0) ? false : false, "请初始化AppProvider");
        Context applicationContext = this.j.getApplicationContext();
        h.a((Object) applicationContext, "context.applicationContext");
        h.a((Object) a2, "appProvider");
        this.b = new b(applicationContext, a2.f());
        com.dianping.monitor.impl.c.a(false);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor$Companion;", "", "()V", "CAT_MONITOR_TAG", "", "INVALID_REUSEID", "RID_APPEAR", "", "RID_BINDED", "RID_SENDED", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.dianping.gcmrnmodule.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0067a {
        public C0067a() {
        }

        public /* synthetic */ C0067a(f fVar) {
            this();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/dianping/gcmrnmodule/monitor/MRNPerformanceMonitor$DefaultMonitorService;", "Lcom/dianping/monitor/impl/BaseMonitorService;", "context", "Landroid/content/Context;", "appId", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "mUnionId", "", "getMUnionId", "()Ljava/lang/String;", "setMUnionId", "(Ljava/lang/String;)V", "getUnionid", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class b extends com.dianping.monitor.impl.a {
        public static ChangeQuickRedirect a;
        @Nullable
        private String b;
        @NotNull
        private Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Context context, int i) {
            super(context, i);
            h.b(context, "context");
            Object[] objArr = {context, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f27d0aa561449d26be0c11ea01a9b0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f27d0aa561449d26be0c11ea01a9b0");
                return;
            }
            this.c = context;
            this.b = "";
        }

        @Override // com.dianping.monitor.impl.a
        @Nullable
        public final String getUnionid() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a43d8fcf3d1f39c1d30ed0f548f00eb8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a43d8fcf3d1f39c1d30ed0f548f00eb8");
            }
            if (TextUtils.isEmpty(this.b)) {
                OneIdHandler oneIdHandler = OneIdHandler.getInstance(this.c);
                oneIdHandler.init();
                this.b = oneIdHandler.getLocalOneId();
            }
            String str = this.b;
            return str == null ? "" : str;
        }
    }

    public final void a(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4eacf8a165edf61dac38a0c8e91d24c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4eacf8a165edf61dac38a0c8e91d24c");
            return;
        }
        h.b(str, "reuseId");
        if (h.a((Object) this.d, (Object) "INVALID_REUSEID")) {
            this.d = str;
            b bVar = this.b;
            if (bVar != null) {
                bVar.startEvent(this.c);
            }
            b bVar2 = this.b;
            if (bVar2 != null) {
                bVar2.addEvent(this.c, 1);
            }
        }
    }

    public final void b(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46cc2a6f7b70f288696d7fe9d02cfd1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46cc2a6f7b70f288696d7fe9d02cfd1c");
            return;
        }
        h.b(str, "reuseId");
        if (this.d.equals(str)) {
            this.d = "INVALID_REUSEID";
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df98b081513cf72d9b6de7429f87ddc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df98b081513cf72d9b6de7429f87ddc6");
        } else {
            this.e.incrementAndGet();
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49bbcefa32fcc692dffeb07a2dc1dba9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49bbcefa32fcc692dffeb07a2dc1dba9");
            return;
        }
        if (j > 0) {
            this.g += j;
        }
        this.f.incrementAndGet();
    }
}
