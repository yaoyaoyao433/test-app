package com.dianping.shield.env;

import android.app.Application;
import com.dianping.shield.bridge.ShieldDataStorage;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.config.HornFallbackSwitch;
import com.dianping.shield.monitor.ShieldDefaultMonitor;
import com.dianping.shield.monitor.ShieldMonitorInterface;
import com.dianping.shield.runtime.ShieldDefaultRuntime;
import com.dianping.shield.runtime.ShieldRuntimeInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.a;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u00109\u001a\u0002052\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020(@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u0006:"}, d2 = {"Lcom/dianping/shield/env/ShieldEnvironment;", "", "()V", "dataStorage", "Lcom/dianping/shield/bridge/ShieldDataStorage;", "getDataStorage", "()Lcom/dianping/shield/bridge/ShieldDataStorage;", "setDataStorage", "(Lcom/dianping/shield/bridge/ShieldDataStorage;)V", "isDebug", "", "()Z", "setDebug", "(Z)V", "monitorInterfaceImpl", "Lcom/dianping/shield/monitor/ShieldMonitorInterface;", "monitorInterfaceImpl$annotations", "getMonitorInterfaceImpl", "()Lcom/dianping/shield/monitor/ShieldMonitorInterface;", "setMonitorInterfaceImpl", "(Lcom/dianping/shield/monitor/ShieldMonitorInterface;)V", "needBounds", "getNeedBounds", "()Ljava/lang/Boolean;", "setNeedBounds", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "needPerformance", "getNeedPerformance", "setNeedPerformance", "pageHeight", "", "getPageHeight", "()I", "setPageHeight", "(I)V", "pageWidth", "getPageWidth", "setPageWidth", "value", "Lcom/dianping/shield/bridge/ShieldLogger;", "shieldLogger", "getShieldLogger", "()Lcom/dianping/shield/bridge/ShieldLogger;", "setShieldLogger", "(Lcom/dianping/shield/bridge/ShieldLogger;)V", "shieldRuntimeImpl", "Lcom/dianping/shield/runtime/ShieldRuntimeInterface;", "getShieldRuntimeImpl", "()Lcom/dianping/shield/runtime/ShieldRuntimeInterface;", "setShieldRuntimeImpl", "(Lcom/dianping/shield/runtime/ShieldRuntimeInterface;)V", "init", "", "application", "Landroid/app/Application;", "appId", "initPageFrame", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldEnvironment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean isDebug;
    @Nullable
    private static Boolean needBounds;
    @Nullable
    private static Boolean needPerformance;
    @Nullable
    private static ShieldRuntimeInterface shieldRuntimeImpl;
    public static final ShieldEnvironment INSTANCE = new ShieldEnvironment();
    private static int pageWidth = -1;
    private static int pageHeight = -1;
    @Nullable
    private static ShieldDataStorage dataStorage = new ShieldDataStorage();
    @NotNull
    private static ShieldMonitorInterface monitorInterfaceImpl = new ShieldDefaultMonitor();
    @NotNull
    private static ShieldLogger shieldLogger = new ShieldLogger();

    @Deprecated(level = a.WARNING, message = "Use shieldRuntimeImpl instead.", replaceWith = @ReplaceWith(expression = "shieldRuntimeImpl", imports = {}))
    public static /* synthetic */ void monitorInterfaceImpl$annotations() {
    }

    public final boolean isDebug() {
        return isDebug;
    }

    public final void setDebug(boolean z) {
        isDebug = z;
    }

    public final int getPageWidth() {
        return pageWidth;
    }

    public final void setPageWidth(int i) {
        pageWidth = i;
    }

    public final int getPageHeight() {
        return pageHeight;
    }

    public final void setPageHeight(int i) {
        pageHeight = i;
    }

    @Nullable
    public final ShieldDataStorage getDataStorage() {
        return dataStorage;
    }

    public final void setDataStorage(@Nullable ShieldDataStorage shieldDataStorage) {
        dataStorage = shieldDataStorage;
    }

    @NotNull
    public final ShieldMonitorInterface getMonitorInterfaceImpl() {
        return monitorInterfaceImpl;
    }

    public final void setMonitorInterfaceImpl(@NotNull ShieldMonitorInterface shieldMonitorInterface) {
        Object[] objArr = {shieldMonitorInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd463eb211b6799e8c6904951765c0a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd463eb211b6799e8c6904951765c0a0");
            return;
        }
        h.b(shieldMonitorInterface, "<set-?>");
        monitorInterfaceImpl = shieldMonitorInterface;
    }

    @Nullable
    public final Boolean getNeedBounds() {
        return needBounds;
    }

    public final void setNeedBounds(@Nullable Boolean bool) {
        needBounds = bool;
    }

    @Nullable
    public final Boolean getNeedPerformance() {
        return needPerformance;
    }

    public final void setNeedPerformance(@Nullable Boolean bool) {
        needPerformance = bool;
    }

    @Nullable
    public final ShieldRuntimeInterface getShieldRuntimeImpl() {
        return shieldRuntimeImpl;
    }

    public final void setShieldRuntimeImpl(@Nullable ShieldRuntimeInterface shieldRuntimeInterface) {
        shieldRuntimeImpl = shieldRuntimeInterface;
    }

    @NotNull
    public final ShieldLogger getShieldLogger() {
        return shieldLogger;
    }

    public final void setShieldLogger(@NotNull ShieldLogger shieldLogger2) {
        Object[] objArr = {shieldLogger2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae9f58986d67cf4b866d13eaf2319549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae9f58986d67cf4b866d13eaf2319549");
            return;
        }
        h.b(shieldLogger2, "value");
        shieldLogger = shieldLogger2;
        if (isDebug) {
            shieldLogger.setLevel(ShieldLogger.Companion.getINFO());
        } else {
            shieldLogger.setLevel(Integer.MAX_VALUE);
        }
    }

    public final void init(@NotNull Application application, int i, boolean z) {
        Object[] objArr = {application, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "830a542c97694029bbca538a2ce2e4f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "830a542c97694029bbca538a2ce2e4f5");
            return;
        }
        h.b(application, "application");
        if (shieldRuntimeImpl == null) {
            shieldRuntimeImpl = new ShieldDefaultRuntime(application, i);
        }
        isDebug = z;
        if (z) {
            shieldLogger.setLevel(ShieldLogger.Companion.getINFO());
        } else {
            shieldLogger.setLevel(Integer.MAX_VALUE);
        }
        HornFallbackSwitch.getInstance().init(application);
    }

    public final void initPageFrame(int i, int i2) {
        pageWidth = i;
        pageHeight = i2;
    }
}
