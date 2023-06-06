package com.dianping.shield.framework;

import android.app.Application;
import com.dianping.shield.bridge.CommonShieldLogger;
import com.dianping.shield.bridge.PortalBridgeCreator;
import com.dianping.shield.component.utils.PageContainerThemeCreator;
import com.dianping.shield.component.utils.PageContainerThemeManager;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.lifecycle.AppObserver;
import com.dianping.shield.monitor.ShieldMonitorInterface;
import com.dianping.shield.runtime.ShieldRuntimeInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$J\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/dianping/shield/framework/ShieldPlatformCustomization;", "", "()V", "appID", "", "getAppID", "()I", "setAppID", "(I)V", "pageHeight", "getPageHeight", "setPageHeight", "pageWidth", "getPageWidth", "setPageWidth", "portalBridgeCreator", "Lcom/dianping/shield/bridge/PortalBridgeCreator;", "getPortalBridgeCreator", "()Lcom/dianping/shield/bridge/PortalBridgeCreator;", "setPortalBridgeCreator", "(Lcom/dianping/shield/bridge/PortalBridgeCreator;)V", "init", "", "application", "Landroid/app/Application;", "isDebug", "", "initPageContainerTheme", "pageContainerThemeCreator", "Lcom/dianping/shield/component/utils/PageContainerThemeCreator;", "initPageFrame", "initShieldMonitor", "shieldMonitorInterface", "Lcom/dianping/shield/monitor/ShieldMonitorInterface;", "initShieldRunTimeImpl", "shieldRuntimeInterface", "Lcom/dianping/shield/runtime/ShieldRuntimeInterface;", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldPlatformCustomization {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ShieldPlatformCustomization INSTANCE = new ShieldPlatformCustomization();
    private static int appID = -1;
    private static int pageWidth = -1;
    private static int pageHeight = -1;
    @NotNull
    private static PortalBridgeCreator portalBridgeCreator = new PortalBridgeCreator();

    public final int getAppID() {
        return appID;
    }

    public final void setAppID(int i) {
        appID = i;
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

    @NotNull
    public final PortalBridgeCreator getPortalBridgeCreator() {
        return portalBridgeCreator;
    }

    public final void setPortalBridgeCreator(@NotNull PortalBridgeCreator portalBridgeCreator2) {
        Object[] objArr = {portalBridgeCreator2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec3274392728c8ca4fec0af4074a036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec3274392728c8ca4fec0af4074a036");
            return;
        }
        h.b(portalBridgeCreator2, "<set-?>");
        portalBridgeCreator = portalBridgeCreator2;
    }

    public final void init(@NotNull Application application, int i, boolean z) {
        Object[] objArr = {application, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab957e90720bf179c7bcab93303f7da9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab957e90720bf179c7bcab93303f7da9");
            return;
        }
        h.b(application, "application");
        appID = i;
        ShieldEnvironment.INSTANCE.init(application, i, z);
        ShieldEnvironment.INSTANCE.setShieldLogger(new CommonShieldLogger());
        AppObserver.INSTANCE.init(application);
    }

    public final boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "767182d8f59856a42390a1462a993084", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "767182d8f59856a42390a1462a993084")).booleanValue() : ShieldEnvironment.INSTANCE.isDebug();
    }

    public final void initPageContainerTheme(@NotNull PageContainerThemeCreator pageContainerThemeCreator) {
        Object[] objArr = {pageContainerThemeCreator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d13c6462598acac7c112a118e3970a09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d13c6462598acac7c112a118e3970a09");
            return;
        }
        h.b(pageContainerThemeCreator, "pageContainerThemeCreator");
        PageContainerThemeManager.INSTANCE.init(pageContainerThemeCreator);
    }

    public final void initPageFrame(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3a48504549cfb8cc6823caff9cd25a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3a48504549cfb8cc6823caff9cd25a9");
            return;
        }
        pageWidth = i;
        pageHeight = i2;
        ShieldEnvironment.INSTANCE.initPageFrame(i, i2);
    }

    @Deprecated(level = a.WARNING, message = "Use initShieldRunTimeImpl instead.")
    public final void initShieldMonitor(@NotNull ShieldMonitorInterface shieldMonitorInterface) {
        Object[] objArr = {shieldMonitorInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c7aefadb4f69bfe49bfe4b2c110f0df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c7aefadb4f69bfe49bfe4b2c110f0df");
            return;
        }
        h.b(shieldMonitorInterface, "shieldMonitorInterface");
        ShieldEnvironment.INSTANCE.setMonitorInterfaceImpl(shieldMonitorInterface);
    }

    public final void initShieldRunTimeImpl(@NotNull ShieldRuntimeInterface shieldRuntimeInterface) {
        Object[] objArr = {shieldRuntimeInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e3122cc0c6c2d34b3e5c5c768cdb0c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e3122cc0c6c2d34b3e5c5c768cdb0c4");
            return;
        }
        h.b(shieldRuntimeInterface, "shieldRuntimeInterface");
        ShieldEnvironment.INSTANCE.setShieldRuntimeImpl(shieldRuntimeInterface);
    }
}
