package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager;
import com.dianping.shield.dynamic.model.view.ScrollCellAttachViewInfo;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleScrollCellAttachViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0013"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/attach/MRNModuleScrollCellAttachViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/ScrollCellAttachViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/attach/MRNModuleScrollCellAttachViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setOnAttachStatusChanged", "", Constants.EventType.VIEW, "onAttachStatusChanged", "", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleScrollCellAttachViewItemManager extends MRNModuleViewItemManager<ScrollCellAttachViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleScrollCellAttachViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88e13491ee987ce8ec757f99f703dfa1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88e13491ee987ce8ec757f99f703dfa1");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a(aoVar);
    }

    @ReactProp(name = "onAttachStatusChanged")
    public final void setOnAttachStatusChanged(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa1eadd600315d9c1ac765e62009b868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa1eadd600315d9c1ac765e62009b868");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_attachStatusChangedCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((ScrollCellAttachViewInfo) aVar.getInfo()).setOnAttachStatusChanged(format);
        } else {
            ((ScrollCellAttachViewInfo) aVar.getInfo()).setOnAttachStatusChanged(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c61aff9ba2cfbfb7defd4fa5ec8ba09e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c61aff9ba2cfbfb7defd4fa5ec8ba09e") : c.b().a("onAttachStatusChanged", c.a("registrationName", "onAttachStatusChanged")).a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/attach/MRNModuleScrollCellAttachViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
