package com.dianping.shield.preload;

import android.app.Application;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.j;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\r\u0010\u0017\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e@BX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/dianping/shield/preload/ShieldPreloadUnit;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "value", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "Landroid/view/ViewGroup;", "cellManager", "getCellManager", "()Lcom/dianping/agentsdk/framework/CellManagerInterface;", "setCellManager", "(Lcom/dianping/agentsdk/framework/CellManagerInterface;)V", "next", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "pageContainer", "getPageContainer", "()Lcom/dianping/agentsdk/framework/PageContainerInterface;", "setPageContainer", "(Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", LaunchMode.LAUNCH_MODE_PRELOAD, "", "preload$shield_release", "recycle", "recycle$shield_release", "Companion", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldPreloadUnit {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ShieldPreloadUnit sPool;
    private static int sPoolSize;
    private final Application application;
    @Nullable
    private j<? extends ViewGroup> cellManager;
    private ShieldPreloadUnit next;
    @Nullable
    private ab<ViewGroup> pageContainer;
    public static final Companion Companion = new Companion(null);
    private static final Object syncObject = new Object();
    private static int MAX_POOL_SIZE = 5;

    @JvmStatic
    public static final void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c75f105b7680943de2c00c3a33d1a1c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c75f105b7680943de2c00c3a33d1a1c5");
        } else {
            Companion.clear();
        }
    }

    @JvmStatic
    @Nullable
    public static final ShieldPreloadUnit get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1642af9d7ccff2c5c6eb231ad158b32c", RobustBitConfig.DEFAULT_VALUE) ? (ShieldPreloadUnit) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1642af9d7ccff2c5c6eb231ad158b32c") : Companion.get();
    }

    @JvmStatic
    public static final void put(@NotNull ShieldPreloadUnit shieldPreloadUnit) {
        Object[] objArr = {shieldPreloadUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e6aaec41e875df1dbe80ad85b624621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e6aaec41e875df1dbe80ad85b624621");
        } else {
            Companion.put(shieldPreloadUnit);
        }
    }

    public ShieldPreloadUnit(@NotNull Application application) {
        h.b(application, "application");
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "921c3f13019b1a31e4557bf3671968c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "921c3f13019b1a31e4557bf3671968c2");
        } else {
            this.application = application;
        }
    }

    @Nullable
    public final ab<ViewGroup> getPageContainer() {
        return this.pageContainer;
    }

    private final void setPageContainer(ab<ViewGroup> abVar) {
        this.pageContainer = abVar;
    }

    @Nullable
    public final j<ViewGroup> getCellManager() {
        return this.cellManager;
    }

    private final void setCellManager(j<? extends ViewGroup> jVar) {
        this.cellManager = jVar;
    }

    public final void preload$shield_release() {
        setPageContainer(new CommonPageContainer(this.application));
        if (this.pageContainer instanceof ShieldPreloadInterface) {
            ab<ViewGroup> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.preload.ShieldPreloadInterface");
            }
            ((ShieldPreloadInterface) abVar).shieldPreload();
        }
        setCellManager(new ShieldNodeCellManager(this.application));
        if (this.cellManager instanceof ShieldPreloadInterface) {
            j<? extends ViewGroup> jVar = this.cellManager;
            if (jVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.preload.ShieldPreloadInterface");
            }
            ((ShieldPreloadInterface) jVar).shieldPreload();
        }
    }

    public final void recycle$shield_release() {
        if (this.pageContainer instanceof ShieldPreloadInterface) {
            ab<ViewGroup> abVar = this.pageContainer;
            if (abVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.preload.ShieldPreloadInterface");
            }
            ((ShieldPreloadInterface) abVar).shieldRecycle();
        }
        if (this.cellManager instanceof ShieldPreloadInterface) {
            j<? extends ViewGroup> jVar = this.cellManager;
            if (jVar == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.preload.ShieldPreloadInterface");
            }
            ((ShieldPreloadInterface) jVar).shieldRecycle();
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/dianping/shield/preload/ShieldPreloadUnit$Companion;", "", "()V", "MAX_POOL_SIZE", "", "sPool", "Lcom/dianping/shield/preload/ShieldPreloadUnit;", "sPoolSize", "getSPoolSize$shield_release", "()I", "setSPoolSize$shield_release", "(I)V", "syncObject", KNBConfig.CONFIG_CLEAR_CACHE, "", "get", "put", "shieldPreloadUnit", "shield_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        public Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final int getSPoolSize$shield_release() {
            return ShieldPreloadUnit.sPoolSize;
        }

        public final void setSPoolSize$shield_release(int i) {
            ShieldPreloadUnit.sPoolSize = i;
        }

        @JvmStatic
        @Nullable
        public final ShieldPreloadUnit get() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "333ca68ea02fb415fd00a03626152701", RobustBitConfig.DEFAULT_VALUE)) {
                return (ShieldPreloadUnit) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "333ca68ea02fb415fd00a03626152701");
            }
            synchronized (ShieldPreloadUnit.syncObject) {
                ShieldPreloadUnit shieldPreloadUnit = ShieldPreloadUnit.sPool;
                if (shieldPreloadUnit != null) {
                    ShieldPreloadUnit.sPool = shieldPreloadUnit.next;
                    shieldPreloadUnit.next = null;
                    Companion companion = ShieldPreloadUnit.Companion;
                    companion.setSPoolSize$shield_release(companion.getSPoolSize$shield_release() - 1);
                    return shieldPreloadUnit;
                }
                return null;
            }
        }

        @JvmStatic
        public final void put(@NotNull ShieldPreloadUnit shieldPreloadUnit) {
            Object[] objArr = {shieldPreloadUnit};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a944feba754d74ac4b4dea540512016", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a944feba754d74ac4b4dea540512016");
                return;
            }
            h.b(shieldPreloadUnit, "shieldPreloadUnit");
            synchronized (ShieldPreloadUnit.syncObject) {
                if (ShieldPreloadUnit.Companion.getSPoolSize$shield_release() < ShieldPreloadUnit.MAX_POOL_SIZE) {
                    shieldPreloadUnit.next = ShieldPreloadUnit.sPool;
                    ShieldPreloadUnit.sPool = shieldPreloadUnit;
                    Companion companion = ShieldPreloadUnit.Companion;
                    companion.setSPoolSize$shield_release(companion.getSPoolSize$shield_release() + 1);
                }
                r rVar = r.a;
            }
        }

        @JvmStatic
        public final void clear() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ad0242787d9617fe128d7ffbf031c33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ad0242787d9617fe128d7ffbf031c33");
                return;
            }
            synchronized (ShieldPreloadUnit.syncObject) {
                ShieldPreloadUnit.sPool = null;
                ShieldPreloadUnit.Companion.setSPoolSize$shield_release(0);
                r rVar = r.a;
            }
        }
    }
}
