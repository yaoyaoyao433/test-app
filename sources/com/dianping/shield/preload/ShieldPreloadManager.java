package com.dianping.shield.preload;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.dianping.shield.preload.ShieldPreloadManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.meituan.android.knb.KNBConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001f B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0002J\u000e\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0015J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/dianping/shield/preload/ShieldPreloadManager;", "", "()V", "application", "Landroid/app/Application;", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "executorService", "Ljava/util/concurrent/ThreadPoolExecutor;", "kotlin.jvm.PlatformType", "mainHandler", "Landroid/os/Handler;", KNBConfig.CONFIG_CLEAR_CACHE, "", "generateUnitAsync", "generateUnitSync", "getUnit", "Lcom/dianping/shield/preload/ShieldPreloadUnit;", "initManager", "isInit", "isOnUiThread", "isReady", "recycleUnit", "shieldPreloadUnit", "runOnUiThread", "runnable", "Ljava/lang/Runnable;", "PutRunnable", "RecycleRunnable", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldPreloadManager {
    private static volatile Application application;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ShieldPreloadManager INSTANCE = new ShieldPreloadManager();
    private static final ThreadPoolExecutor executorService = c.a("ShieldPreloadManager", 0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    private static volatile boolean enable = true;

    public static final /* synthetic */ Application access$getApplication$p(ShieldPreloadManager shieldPreloadManager) {
        Application application2 = application;
        if (application2 == null) {
            h.a("application");
        }
        return application2;
    }

    public final boolean getEnable() {
        return enable;
    }

    public final void setEnable(boolean z) {
        enable = z;
    }

    public final void initManager(@NotNull Application application2) {
        Object[] objArr = {application2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29cc5fb3af371079cb04c9a7acd2fd75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29cc5fb3af371079cb04c9a7acd2fd75");
            return;
        }
        h.b(application2, "application");
        if (isInit()) {
            return;
        }
        application = application2;
    }

    public final void generateUnitAsync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1dabae4954914a8134aae6e17607532", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1dabae4954914a8134aae6e17607532");
        } else if (isReady()) {
            executorService.execute(new Runnable() { // from class: com.dianping.shield.preload.ShieldPreloadManager$generateUnitAsync$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a344548fffd58316f6c21f69cf861404", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a344548fffd58316f6c21f69cf861404");
                        return;
                    }
                    ShieldPreloadUnit shieldPreloadUnit = new ShieldPreloadUnit(ShieldPreloadManager.access$getApplication$p(ShieldPreloadManager.INSTANCE));
                    shieldPreloadUnit.preload$shield_release();
                    ShieldPreloadManager.INSTANCE.runOnUiThread(new ShieldPreloadManager.PutRunnable(shieldPreloadUnit));
                }
            });
        }
    }

    public final void generateUnitSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ccf8f070df600098064ad9f46046376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ccf8f070df600098064ad9f46046376");
        } else if (isReady()) {
            Application application2 = application;
            if (application2 == null) {
                h.a("application");
            }
            ShieldPreloadUnit shieldPreloadUnit = new ShieldPreloadUnit(application2);
            shieldPreloadUnit.preload$shield_release();
            ShieldPreloadUnit.Companion.put(shieldPreloadUnit);
        }
    }

    @Nullable
    public final ShieldPreloadUnit getUnit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "543fe5e692949cbfa62a1da4c6534ae3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldPreloadUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "543fe5e692949cbfa62a1da4c6534ae3");
        }
        if (isReady()) {
            if (ShieldPreloadUnit.Companion.getSPoolSize$shield_release() <= 1) {
                generateUnitAsync();
            }
            return ShieldPreloadUnit.Companion.get();
        }
        return null;
    }

    public final void recycleUnit(@NotNull ShieldPreloadUnit shieldPreloadUnit) {
        Object[] objArr = {shieldPreloadUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ed061027c799df0f31b737754469304", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ed061027c799df0f31b737754469304");
            return;
        }
        h.b(shieldPreloadUnit, "shieldPreloadUnit");
        if (isReady()) {
            runOnUiThread(new RecycleRunnable(shieldPreloadUnit));
        }
    }

    public final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e73a1f3be6595eabc18bf178fead1a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e73a1f3be6595eabc18bf178fead1a7");
        } else if (isReady()) {
            ShieldPreloadUnit.Companion.clear();
        }
    }

    private final boolean isInit() {
        return application != null;
    }

    private final boolean isReady() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a515896575a814f092f8816d87a6c8ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a515896575a814f092f8816d87a6c8ef")).booleanValue() : isInit() && enable;
    }

    private final boolean isOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eadb67152307da98d3d722d97b1006e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eadb67152307da98d3d722d97b1006e")).booleanValue();
        }
        Looper mainLooper = Looper.getMainLooper();
        h.a((Object) mainLooper, "Looper.getMainLooper()");
        return mainLooper.getThread() == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnUiThread(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dcccc27a51a1d7bc01b8b9d4c8cc828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dcccc27a51a1d7bc01b8b9d4c8cc828");
        } else if (isOnUiThread()) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dianping/shield/preload/ShieldPreloadManager$RecycleRunnable;", "Ljava/lang/Runnable;", "shieldPreloadUnit", "Lcom/dianping/shield/preload/ShieldPreloadUnit;", "(Lcom/dianping/shield/preload/ShieldPreloadUnit;)V", "getShieldPreloadUnit", "()Lcom/dianping/shield/preload/ShieldPreloadUnit;", "run", "", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    static final class RecycleRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final ShieldPreloadUnit shieldPreloadUnit;

        public RecycleRunnable(@NotNull ShieldPreloadUnit shieldPreloadUnit) {
            h.b(shieldPreloadUnit, "shieldPreloadUnit");
            Object[] objArr = {shieldPreloadUnit};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a09b7b5b4b27d81ffe1745e9d92b96bf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a09b7b5b4b27d81ffe1745e9d92b96bf");
            } else {
                this.shieldPreloadUnit = shieldPreloadUnit;
            }
        }

        @NotNull
        public final ShieldPreloadUnit getShieldPreloadUnit() {
            return this.shieldPreloadUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7bdbbda1ae555ba21fcbb1addc7c8cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7bdbbda1ae555ba21fcbb1addc7c8cd");
                return;
            }
            this.shieldPreloadUnit.recycle$shield_release();
            ShieldPreloadUnit.Companion.put(this.shieldPreloadUnit);
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dianping/shield/preload/ShieldPreloadManager$PutRunnable;", "Ljava/lang/Runnable;", "shieldPreloadUnit", "Lcom/dianping/shield/preload/ShieldPreloadUnit;", "(Lcom/dianping/shield/preload/ShieldPreloadUnit;)V", "getShieldPreloadUnit", "()Lcom/dianping/shield/preload/ShieldPreloadUnit;", "run", "", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class PutRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @NotNull
        private final ShieldPreloadUnit shieldPreloadUnit;

        public PutRunnable(@NotNull ShieldPreloadUnit shieldPreloadUnit) {
            h.b(shieldPreloadUnit, "shieldPreloadUnit");
            Object[] objArr = {shieldPreloadUnit};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35b2eb2f8da553e1d02d190e7aab5da8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35b2eb2f8da553e1d02d190e7aab5da8");
            } else {
                this.shieldPreloadUnit = shieldPreloadUnit;
            }
        }

        @NotNull
        public final ShieldPreloadUnit getShieldPreloadUnit() {
            return this.shieldPreloadUnit;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ff951e07d44fd39653cd27caaa7b3b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ff951e07d44fd39653cd27caaa7b3b9");
            } else {
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.dianping.shield.preload.ShieldPreloadManager$PutRunnable$run$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f5064d1490a99b6521237b1c64e63935", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f5064d1490a99b6521237b1c64e63935")).booleanValue();
                        }
                        ShieldPreloadUnit.Companion.put(ShieldPreloadManager.PutRunnable.this.getShieldPreloadUnit());
                        return false;
                    }
                });
            }
        }
    }
}
