package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.MRNModuleBaseSectionItemManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleBaseWrapperShadowView;
import com.dianping.shield.dynamic.model.section.GridSectionInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
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
@ReactModule(name = MRNModuleGridSectionItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0007J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0016J\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0016¨\u0006!"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/grid/MRNModuleGridSectionItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/grid/MRNModuleGridSectionWrapperView;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setAutoMargin", "", Constants.EventType.VIEW, DMKeys.KEY_AUTO_MARGIN, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/grid/MRNModuleGridSectionWrapperView;Ljava/lang/Boolean;)V", "setColCount", DMKeys.KEY_COLCOUNT, "", "setGridBackgroundColor", "backgroundColor", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/grid/MRNModuleGridSectionWrapperView;Ljava/lang/Integer;)V", "setMarginInfo", DMKeys.KEY_MARGIN_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setSelectionStyle", DMKeys.KEY_SELECTION_STYLE, "setXGap", DMKeys.KEY_XGAP, "setYGap", DMKeys.KEY_YGAP, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleGridSectionItemManager extends MRNModuleBaseSectionItemManager<com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleGridSectionItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62c9db140fa8ee7941e044d01c2d4343", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62c9db140fa8ee7941e044d01c2d4343");
        }
        h.b(aoVar, "reactContext");
        return new com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.MRNModuleBaseSectionItemManager, com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public final LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75108749b016b2557002c32a46d66d48", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75108749b016b2557002c32a46d66d48") : new MRNModuleBaseWrapperShadowView();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/grid/MRNModuleGridSectionItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @ReactProp(name = DMKeys.KEY_COLCOUNT)
    public final void setColCount(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eca621d8a08ad639447e1bca94039bc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eca621d8a08ad639447e1bca94039bc4");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setColCount(i);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_XGAP)
    public final void setXGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d16bd81becd8a08a646dd768e4d20ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d16bd81becd8a08a646dd768e4d20ba");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setXGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_YGAP)
    public final void setYGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a83411abc039f8ca9ce2649a22901fc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a83411abc039f8ca9ce2649a22901fc2");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setYGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "backgroundColor")
    public final void setGridBackgroundColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3ae268707e3ba006ab48928b967e46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3ae268707e3ba006ab48928b967e46");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setBackgroundColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_AUTO_MARGIN)
    public final void setAutoMargin(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ce0a484f25a8210b350cf3da34087c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ce0a484f25a8210b350cf3da34087c6");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setAutoMargin(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MARGIN_INFO)
    public final void setMarginInfo(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32e77ff6a28d52865e2a34ba61a841f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32e77ff6a28d52865e2a34ba61a841f4");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SELECTION_STYLE)
    public final void setSelectionStyle(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "208e8f482526cc2005c6a251ccaba8d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "208e8f482526cc2005c6a251ccaba8d2");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((GridSectionInfo) aVar.getInfo()).setSelectionStyle(num);
        b.a().a(aVar.getHostWrapperView());
    }
}
