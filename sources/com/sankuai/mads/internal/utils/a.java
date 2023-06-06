package com.sankuai.mads.internal.utils;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u;
import kotlin.r;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\f\u001a\u00020\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010H\u0000\"\u0014\u0010\u0000\u001a\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0002\"\u001b\u0010\u0003\u001a\u00020\u00048@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0011"}, d2 = {"isMainThread", "", "()Z", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "mainHandler$delegate", "Lkotlin/Lazy;", "isDebuggableBuild", "Landroid/app/Application;", "(Landroid/app/Application;)Z", "postToMainThread", "", "", "post", "Lkotlin/Function0;", "sdk_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] b = {u.a(new q(u.a(a.class, "sdk_release"), "mainHandler", "getMainHandler()Landroid/os/Handler;"))};
    @NotNull
    private static final kotlin.d c = e.a(C0578a.b);

    public static final boolean a(@NotNull Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3f964abe66f18163ed3c3da7931794d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3f964abe66f18163ed3c3da7931794d")).booleanValue();
        }
        h.b(application, "$this$isDebuggableBuild");
        return (application.getApplicationInfo().flags & 2) != 0;
    }

    public static final void a(@NotNull Object obj, @NotNull kotlin.jvm.functions.a<r> aVar) {
        boolean z;
        Object[] objArr = {obj, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "954817f866c34e4ff3b9f4d74764e870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "954817f866c34e4ff3b9f4d74764e870");
            return;
        }
        h.b(obj, "$this$postToMainThread");
        h.b(aVar, "post");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aa7c6e14bd0381d9d8fb338fc5274883", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aa7c6e14bd0381d9d8fb338fc5274883")).booleanValue();
        } else {
            Looper mainLooper = Looper.getMainLooper();
            h.a((Object) mainLooper, "Looper.getMainLooper()");
            z = mainLooper.getThread() == Thread.currentThread();
        }
        if (z) {
            aVar.invoke();
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        ((Handler) (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "49df6d06f59d405903c0fba8cd4cf2c2", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "49df6d06f59d405903c0fba8cd4cf2c2") : c.a())).post(new b(aVar));
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/sankuai/mads/internal/utils/ExtensionsKt$postToMainThread$1$1"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ kotlin.jvm.functions.a b;

        public b(kotlin.jvm.functions.a aVar) {
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa925215b064d178392f1d020bc16dd7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa925215b064d178392f1d020bc16dd7");
            } else {
                this.b.invoke();
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.sankuai.mads.internal.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0578a extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<Handler> {
        public static ChangeQuickRedirect a;
        public static final C0578a b = new C0578a();

        public C0578a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ Handler invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a6bd51ffc255b9cccbb7f7d2cfa7a43", RobustBitConfig.DEFAULT_VALUE) ? (Handler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a6bd51ffc255b9cccbb7f7d2cfa7a43") : new Handler(Looper.getMainLooper());
        }
    }
}
