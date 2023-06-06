package com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule;

import com.alipay.sdk.widget.d;
import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
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
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNTabModuleTabModulesContainerWrapperManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u001d"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabModulesContainerWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabModulesContainerWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setConfigKey", "", Constants.EventType.VIEW, DMKeys.KEY_CONFIG_KEY, "setExtraConfigkey", DMKeys.KEY_TAB_EXTRA_CONFIG_KEY, "setExtraModuleKeys", DMKeys.KEY_TAB_EXTRA_MODULE_KEYS, "Lcom/facebook/react/bridge/ReadableArray;", "setIndependentWhiteboard", "independentWhiteboard", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabModulesContainerWrapperView;Ljava/lang/Boolean;)V", "setModuleKeys", DMKeys.KEY_MODULE_KEYS, "setTabKey", "key", d.o, "title", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNTabModuleTabModulesContainerWrapperManager extends MRNModuleBaseViewGroupManager<com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNTabModuleTabModulesContainerWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "781e9355bdd0cb221e6ce0afba94f71c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "781e9355bdd0cb221e6ce0afba94f71c");
        }
        h.b(aoVar, "reactContext");
        return new com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a(aoVar);
    }

    @ReactProp(name = "title")
    public final void setTitle(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae124f11255e96835f5f7dd9704f2455", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae124f11255e96835f5f7dd9704f2455");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.getInfo().setTitle(str);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "tabKey")
    public final void setTabKey(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce4bc9c1db4fb7a12dccfbf240bab63d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce4bc9c1db4fb7a12dccfbf240bab63d");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.getInfo().setTabKey(str);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_CONFIG_KEY)
    public final void setConfigKey(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e6a5b1d02eb8ceb3da7d495d680f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e6a5b1d02eb8ceb3da7d495d680f39");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.getInfo().setConfigKey(str);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MODULE_KEYS)
    public final void setModuleKeys(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e693c83bb6659fc560c2d0061ce87a35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e693c83bb6659fc560c2d0061ce87a35");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.setModuleKeys(readableArray != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableArray) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "independentWhiteboard")
    public final void setIndependentWhiteboard(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d2b2ff1dc978a66d41c8cfdee51d2dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d2b2ff1dc978a66d41c8cfdee51d2dd");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.getInfo().setIndependentWhiteboard(bool);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_EXTRA_CONFIG_KEY)
    public final void setExtraConfigkey(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fbeea92e040eb6da213698b0bfb76ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fbeea92e040eb6da213698b0bfb76ee");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.getInfo().setExtraConfigKey(str);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_EXTRA_MODULE_KEYS)
    public final void setExtraModuleKeys(@NotNull com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.a aVar, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64a75bf3828d8e8c0913ae31f6196804", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64a75bf3828d8e8c0913ae31f6196804");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        aVar.setExtraModuleKeys(readableArray != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(readableArray) : null);
        com.dianping.gcmrnmodule.b.a().a(aVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/containers/tabmodule/MRNTabModuleTabModulesContainerWrapperManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
