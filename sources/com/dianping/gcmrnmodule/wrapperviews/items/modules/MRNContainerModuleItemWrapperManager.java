package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.shield.dynamic.model.module.ContainerModuleInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNContainerModuleItemWrapperManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNContainerModuleItemWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNContainerModuleItemWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setConfigKey", "", Constants.EventType.VIEW, DMKeys.KEY_CONFIG_KEY, "setModuleKeys", DMKeys.KEY_MODULE_KEYS, "Lcom/facebook/react/bridge/ReadableArray;", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNContainerModuleItemWrapperManager extends MRNModuleBaseViewGroupManager<b> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNContainerModuleItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final b createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c846f0de96d70a0bd66c3b30f45e0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c846f0de96d70a0bd66c3b30f45e0b");
        }
        kotlin.jvm.internal.h.b(aoVar, "reactContext");
        return new b(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_CONFIG_KEY)
    public final void setConfigKey(@NotNull b bVar, @Nullable String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "241589c97ed0309fe3415fca3621d098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "241589c97ed0309fe3415fca3621d098");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        ((ContainerModuleInfo) bVar.getInfo()).setConfigKey(str);
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MODULE_KEYS)
    public final void setModuleKeys(@NotNull b bVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {bVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9195d2551133156952568f7d28064ffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9195d2551133156952568f7d28064ffd");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, Constants.EventType.VIEW);
        bVar.setModuleKeys(readableArray != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableArray) : null);
        com.dianping.gcmrnmodule.b.a().a(bVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNContainerModuleItemWrapperManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
