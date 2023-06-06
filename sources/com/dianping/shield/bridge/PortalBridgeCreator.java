package com.dianping.shield.bridge;

import com.dianping.portal.feature.a;
import com.dianping.portal.feature.c;
import com.dianping.portal.feature.d;
import com.dianping.portal.feature.e;
import com.dianping.portal.feature.h;
import com.dianping.portal.feature.i;
import com.dianping.portal.feature.j;
import com.dianping.shield.manager.PortalBridge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/dianping/shield/bridge/PortalBridgeCreator;", "", "()V", "createBindCaptureProvider", "Lcom/dianping/portal/feature/BindCaptureProviderInterface;", "createConfigPropertyProvider", "Lcom/dianping/portal/feature/ConfigPropertyProviderInterface;", "createEnvironmentParamsProvider", "Lcom/dianping/portal/feature/EnvironmentParamsInterface;", "createLoginProvider", "Lcom/dianping/portal/feature/LoginProviderInterface;", "createPortalBridge", "Lcom/dianping/shield/manager/PortalBridge;", "createServiceProvider", "Lcom/dianping/portal/feature/ServiceProviderInterface;", "createTitleBarProvider", "Lcom/dianping/portal/feature/TitleBarProviderInterface;", "createUTMProvider", "Lcom/dianping/portal/feature/UTMInterface;", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class PortalBridgeCreator {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public PortalBridge createPortalBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cebc025afb08055cbed13c1ea64d91c5", RobustBitConfig.DEFAULT_VALUE) ? (PortalBridge) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cebc025afb08055cbed13c1ea64d91c5") : new PortalBridge();
    }

    @NotNull
    public h createServiceProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f80eac9d592e36454c87f8870c70c27", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f80eac9d592e36454c87f8870c70c27") : new PortalBridge();
    }

    @NotNull
    public e createLoginProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3eb44cee4f282c2157075845c610fc6a", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3eb44cee4f282c2157075845c610fc6a") : new PortalBridge();
    }

    @NotNull
    public d createEnvironmentParamsProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e48e48bdb841c979fbdaf99f4838057b", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e48e48bdb841c979fbdaf99f4838057b") : new PortalBridge();
    }

    @NotNull
    public j createUTMProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "841d720d8d94eb3876d5c5e1e17afbbb", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "841d720d8d94eb3876d5c5e1e17afbbb") : new PortalBridge();
    }

    @NotNull
    public i createTitleBarProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeef8478adb153f8ab2fcbbbe94aea60", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeef8478adb153f8ab2fcbbbe94aea60") : new PortalBridge();
    }

    @NotNull
    public a createBindCaptureProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a10483f1514321177c0d0fcdccd6636e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a10483f1514321177c0d0fcdccd6636e") : new PortalBridge();
    }

    @NotNull
    public c createConfigPropertyProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27de0493655b883a3727f544013ac01e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27de0493655b883a3727f544013ac01e") : new PortalBridge();
    }
}
