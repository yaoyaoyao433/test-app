package com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule;

import android.annotation.SuppressLint;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.objects.d;
import com.dianping.gcmrnmodule.protocols.i;
import com.dianping.shield.components.scrolltab.PageComposeInterface;
import com.dianping.shield.dynamic.model.module.TabModuleConfigInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\b\u0010\u0018\u001a\u00020\u0016H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabModulesContainerWrapperView;", "Lcom/dianping/gcmrnmodule/wrapperviews/MRNModuleBaseWrapperView;", "Lcom/dianping/shield/dynamic/model/module/TabModuleConfigInfo;", "Lcom/dianping/gcmrnmodule/protocols/MRNModuleContainerProtocol;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "(Lcom/facebook/react/bridge/ReactContext;)V", DMKeys.KEY_TAB_EXTRA_MODULE_KEYS, "Lcom/dianping/gcmrnmodule/objects/ModuleKeys;", "index", "", "getIndex", "()I", "setIndex", "(I)V", DMKeys.KEY_MODULE_KEYS, "createInfoInstance", "getHostInterface", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getWhiteboard", "Lcom/dianping/agentsdk/framework/WhiteBoard;", "setExtraModuleKeys", "", "setModuleKeys", "updateInfo", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class a extends com.dianping.gcmrnmodule.wrapperviews.b<TabModuleConfigInfo> implements i {
    public static ChangeQuickRedirect a;
    private d g;
    private d h;
    private int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ReactContext reactContext) {
        super(reactContext);
        h.b(reactContext, "reactContext");
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17cbe0dab5515ff9b78df74fe9fb649", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17cbe0dab5515ff9b78df74fe9fb649");
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final /* synthetic */ TabModuleConfigInfo g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3731600f03190b2195da33e62c568ee7", RobustBitConfig.DEFAULT_VALUE) ? (TabModuleConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3731600f03190b2195da33e62c568ee7") : new TabModuleConfigInfo();
    }

    public final int getIndex() {
        return this.i;
    }

    public final void setIndex(int i) {
        this.i = i;
    }

    public final void setModuleKeys(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75663df8a0a4fb1d2064a3c8482998a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75663df8a0a4fb1d2064a3c8482998a8");
        } else if (dVar != null) {
            this.g = dVar;
            getInfo().setModuleKeys(dVar.b);
        } else {
            this.g = null;
            getInfo().setModuleKeys(null);
        }
    }

    public final void setExtraModuleKeys(@Nullable d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d337a2bd4e475657d41cb35dc4982c7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d337a2bd4e475657d41cb35dc4982c7d");
        } else if (dVar != null) {
            this.h = dVar;
            getInfo().setExtraModuleKeys(dVar.b);
        } else {
            this.h = null;
            getInfo().setExtraModuleKeys(null);
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.b
    public final void h() {
        com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a aVar;
        String moduleKey;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d92428e7a809f93c59bab44abdf532e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d92428e7a809f93c59bab44abdf532e");
            return;
        }
        super.h();
        Iterator<T> it = getChildWrapperViewList().iterator();
        while (it.hasNext()) {
            com.dianping.gcmrnmodule.wrapperviews.b bVar = (com.dianping.gcmrnmodule.wrapperviews.b) it.next();
            if ((bVar instanceof com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) && (moduleKey = (aVar = (com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.a) bVar).getModuleKey()) != null) {
                d dVar = this.g;
                if (dVar != null) {
                    dVar.a(moduleKey, aVar.getInfo());
                }
                d dVar2 = this.h;
                if (dVar2 != null) {
                    dVar2.a(moduleKey, aVar.getInfo());
                }
            }
        }
    }

    @Override // com.dianping.gcmrnmodule.protocols.i
    @Nullable
    public final com.dianping.gcmrnmodule.hostwrapper.a getHostInterface() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a0199a8056589c8a22007c8287b1302", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.hostwrapper.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a0199a8056589c8a22007c8287b1302");
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> hostWrapperView = getHostWrapperView();
        if (hostWrapperView != null) {
            return hostWrapperView.getHostInterface();
        }
        return null;
    }

    @Nullable
    public final ar getWhiteboard() {
        v subFeatureBridgeInterface;
        com.dianping.gcmrnmodule.hostwrapper.a hostInterface;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b20812a49e381512e02691ec0346819", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b20812a49e381512e02691ec0346819");
        }
        com.dianping.gcmrnmodule.wrapperviews.a<?> hostWrapperView = getHostWrapperView();
        DynamicChassisInterface dynamicChassis = (hostWrapperView == null || (hostInterface = hostWrapperView.getHostInterface()) == null) ? null : hostInterface.getDynamicChassis();
        if (!(dynamicChassis instanceof PageComposeInterface)) {
            dynamicChassis = null;
        }
        PageComposeInterface pageComposeInterface = (PageComposeInterface) dynamicChassis;
        if (pageComposeInterface == null || (subFeatureBridgeInterface = pageComposeInterface.getSubFeatureBridgeInterface(this.i)) == null) {
            return null;
        }
        return subFeatureBridgeInterface.getWhiteBoard();
    }
}
