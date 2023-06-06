package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.graphics.Color;
import com.dianping.shield.dynamic.model.module.ScrollTabModuleInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNScrollTabModuleItemWrapperManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011J\u001a\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u001f\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0011¨\u0006'"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNScrollTabModuleItemWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNBaseTabModuleItemWrapperManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNScrollTabModuleItemWrapperView;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setBottomOffset", "", Constants.EventType.VIEW, "bottomOffset", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNScrollTabModuleItemWrapperView;Ljava/lang/Integer;)V", "setContentBackgroundColor", DMKeys.KEY_TAB_CONTENT_BACKGROUND_COLOR, "setDisableHorizontalScroll", DMKeys.KEY_TAB_DISABLE_HORIZONTAL_SCROLL, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNScrollTabModuleItemWrapperView;Ljava/lang/Boolean;)V", "setIndependentWhiteboard", "inDependentWhiteboard", "setLazyload", DMKeys.KEY_TAB_LAZY_LOAD, "setMaxLoadedTabCount", DMKeys.KEY_TAB_MAX_LOADED_TAB_COUNT, "setSectionFooterBackgroundColor", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "Lcom/facebook/react/bridge/Dynamic;", "setSectionFooterHeight", "sectionFooterHeight", "setSectionHeaderBackgroundColor", "setSectionHeaderHeight", "sectionHeaderHeight", "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNScrollTabModuleItemWrapperManager extends MRNBaseTabModuleItemWrapperManager<f> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNScrollTabModuleItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final f createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc375606d8edf8958970f074ad4abeb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc375606d8edf8958970f074ad4abeb8");
        }
        kotlin.jvm.internal.h.b(aoVar, "reactContext");
        return new f(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_TAB_LAZY_LOAD)
    public final void setLazyload(@NotNull f fVar, @Nullable Boolean bool) {
        Object[] objArr = {fVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b723f7d5d3e31b266e8e354bc1f183a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b723f7d5d3e31b266e8e354bc1f183a7");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setLazyLoad(bool);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_INDEPENDENT_WHITEBOARD)
    public final void setIndependentWhiteboard(@NotNull f fVar, @Nullable Boolean bool) {
        Object[] objArr = {fVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04e1f167cdb04fa59b5505e1defb1715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04e1f167cdb04fa59b5505e1defb1715");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setIndependentWhiteBoard(bool);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = "bottomOffset")
    public final void setBottomOffset(@NotNull f fVar, @Nullable Integer num) {
        Object[] objArr = {fVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46d02c208fd99601f4b04d7b9ae038a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46d02c208fd99601f4b04d7b9ae038a9");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setBottomOffset(num);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = "sectionHeaderHeight")
    public final void setSectionHeaderHeight(@NotNull f fVar, @Nullable Integer num) {
        Object[] objArr = {fVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c25af5b0de7a5e25f921204721a5124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c25af5b0de7a5e25f921204721a5124");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setSectionHeaderHeight(num);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = "sectionFooterHeight")
    public final void setSectionFooterHeight(@NotNull f fVar, @Nullable Integer num) {
        Object[] objArr = {fVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01554726d3988c76c03abcafa120d6f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01554726d3988c76c03abcafa120d6f6");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setSectionFooterHeight(num);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_MAX_LOADED_TAB_COUNT)
    public final void setMaxLoadedTabCount(@NotNull f fVar, @Nullable Integer num) {
        Object[] objArr = {fVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e603ca641392551a6119e88831594d68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e603ca641392551a6119e88831594d68");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setMaxLoadedTabCount(num);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_DISABLE_HORIZONTAL_SCROLL)
    public final void setDisableHorizontalScroll(@NotNull f fVar, @Nullable Boolean bool) {
        Object[] objArr = {fVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9f6ebf1ca48999efcc89985c932444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9f6ebf1ca48999efcc89985c932444");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setDisableHorizontalScroll(bool);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR)
    public final void setSectionHeaderBackgroundColor(@NotNull f fVar, @Nullable Dynamic dynamic) {
        Object[] objArr = {fVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b189fde478f80840c573ed5b69ce2412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b189fde478f80840c573ed5b69ce2412");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setSectionHeaderBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TAB_CONTENT_BACKGROUND_COLOR)
    public final void setContentBackgroundColor(@NotNull f fVar, @Nullable Integer num) {
        Object[] objArr = {fVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00d2e0c018a3e578da50754e87b272ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00d2e0c018a3e578da50754e87b272ab");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setContentBackgroundColor(Integer.valueOf(num != null ? num.intValue() : Color.parseColor("#00FFFFFF")));
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR)
    public final void setSectionFooterBackgroundColor(@NotNull f fVar, @Nullable Dynamic dynamic) {
        Object[] objArr = {fVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "618d76fe0e9b9ca218d843f22454a520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "618d76fe0e9b9ca218d843f22454a520");
            return;
        }
        kotlin.jvm.internal.h.b(fVar, Constants.EventType.VIEW);
        ((ScrollTabModuleInfo) fVar.getInfo()).setSectionFooterBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        com.dianping.gcmrnmodule.b.a().a(fVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNBaseTabModuleItemWrapperManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ace3ff75118cc254ee5715185d07c4b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ace3ff75118cc254ee5715185d07c4b");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a2 = com.facebook.react.common.c.b().a("onLoadedPagesChanged", com.facebook.react.common.c.a("registrationName", "onLoadedPagesChanged")).a();
        kotlin.jvm.internal.h.a((Object) a2, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a2);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNScrollTabModuleItemWrapperManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
