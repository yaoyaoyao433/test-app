package com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleViewHostWrapperShadowView;
import com.dianping.shield.dynamic.model.cell.NormalCellInfo;
import com.dianping.shield.dynamic.model.extra.ActionsConfigurationInfo;
import com.dianping.shield.dynamic.model.extra.ContextualAction;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.v;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleNormalCellItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J\u0016\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\u0010\u0014J\u001a\u0010!\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0007J\u001a\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010%H\u0007J\u0018\u0010&\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0007J\u001a\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u000bH\u0007J\u001f\u0010*\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0002\u0010\u001cJ\u001a\u0010,\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010%H\u0007¨\u0006/"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/normal/MRNModuleNormalCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/MRNModuleCellItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/normal/MRNModuleNormalCellItemWrapperView;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getExportedViewConstants", "getName", "setArrowOffset", "", Constants.EventType.VIEW, DMKeys.KEY_ARROW_OFFSET, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/normal/MRNModuleNormalCellItemWrapperView;Ljava/lang/Integer;)V", "setArrowPositionType", DMKeys.KEY_ARROW_POSITION_TYPE, "setArrowTintColor", DMKeys.KEY_ARROW_TINT_COLOR, "setClipToBounds", DMKeys.KEY_VIEW_CLIP_TO_BOUNDS, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/normal/MRNModuleNormalCellItemWrapperView;Ljava/lang/Boolean;)V", "setEstimateHeight", DMKeys.KEY_ESTIMATED_HEIGHT, "setGdmReuseId", "reuseId", "setJumpUrl", DMKeys.KEY_JUMP_URL, "setLeadingActionsConfiguration", DMKeys.KEY_LEADING_ACITONS_CONFIGURATION, "Lcom/facebook/react/bridge/ReadableMap;", "setOnSelect", "onSelect", "setReuseIdentifier", DMKeys.KEY_REUSE_IDENTIFIER, "setShowArrow", DMKeys.KEY_SHOW_ARROW, "setTrailingActionsConfiguration", DMKeys.KEY_TRAILING_ACITONS_CONFIGURATION, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleNormalCellItemManager extends MRNModuleCellItemManager<com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleNormalCellItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f9870bb3ec6eeee25ab9cfd27bca3a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f9870bb3ec6eeee25ab9cfd27bca3a2");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public final LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "053297547e5688e231f3551ddd4e8b08", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "053297547e5688e231f3551ddd4e8b08") : new MRNModuleViewHostWrapperShadowView();
    }

    @ReactProp(name = DMKeys.KEY_JUMP_URL)
    public final void setJumpUrl(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cda30ff215be58b1eee838eb878dcb59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cda30ff215be58b1eee838eb878dcb59");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setJumpUrl(str);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SHOW_ARROW)
    public final void setShowArrow(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b8f80cc5c9c3e82f3228f4c413fecc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b8f80cc5c9c3e82f3228f4c413fecc3");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setShowArrow(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ARROW_POSITION_TYPE)
    public final void setArrowPositionType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40b6febe85fc10cf5be1682a04b8e6d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40b6febe85fc10cf5be1682a04b8e6d0");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setArrowPositionType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ARROW_OFFSET)
    public final void setArrowOffset(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6970ec831a91d051846a899c4407d3b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6970ec831a91d051846a899c4407d3b5");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setArrowOffset(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ARROW_TINT_COLOR)
    public final void setArrowTintColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70f413bcf177f4d1ff0d825e11a8fe70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70f413bcf177f4d1ff0d825e11a8fe70");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setArrowTintColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_LEADING_ACITONS_CONFIGURATION)
    public final void setLeadingActionsConfiguration(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable ReadableMap readableMap) {
        ArrayList<ContextualAction> actions;
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95f8e066dfc11f86ea1e5450added0d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95f8e066dfc11f86ea1e5450added0d0");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setLeadingActionsConfiguration(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.j(readableMap) : null);
        ActionsConfigurationInfo leadingActionsConfiguration = ((NormalCellInfo) aVar.getInfo()).getLeadingActionsConfiguration();
        if (leadingActionsConfiguration != null && (actions = leadingActionsConfiguration.getActions()) != null) {
            ArrayList<ContextualAction> arrayList = actions;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.h.a((Iterable) arrayList, 10));
            for (ContextualAction contextualAction : arrayList) {
                w wVar = w.a;
                String format = String.format("gdm_contextualActionCallBack:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
                h.a((Object) format, "java.lang.String.format(format, *args)");
                contextualAction.setOnAction(format);
                arrayList2.add(r.a);
            }
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_TRAILING_ACITONS_CONFIGURATION)
    public final void setTrailingActionsConfiguration(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable ReadableMap readableMap) {
        ArrayList<ContextualAction> actions;
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34a7f4956ac1fb0832c00cadeb26803d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34a7f4956ac1fb0832c00cadeb26803d");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setTrailingActionsConfiguration(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.j(readableMap) : null);
        ActionsConfigurationInfo trailingActionsConfiguration = ((NormalCellInfo) aVar.getInfo()).getTrailingActionsConfiguration();
        if (trailingActionsConfiguration != null && (actions = trailingActionsConfiguration.getActions()) != null) {
            ArrayList<ContextualAction> arrayList = actions;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.h.a((Iterable) arrayList, 10));
            for (ContextualAction contextualAction : arrayList) {
                w wVar = w.a;
                String format = String.format("gdm_contextualActionCallBack:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
                h.a((Object) format, "java.lang.String.format(format, *args)");
                contextualAction.setOnAction(format);
                arrayList2.add(r.a);
            }
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "onSelect")
    public final void setOnSelect(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b079ccc16255fb13ec8da62e9d06af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b079ccc16255fb13ec8da62e9d06af3");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (z) {
            w wVar = w.a;
            String format = String.format("gdm_didSelectCallback:%s", Arrays.copyOf(new Object[]{Integer.valueOf(aVar.getId())}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((NormalCellInfo) aVar.getInfo()).setDidSelectCallback(format);
        } else {
            ((NormalCellInfo) aVar.getInfo()).setDidSelectCallback(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ESTIMATED_HEIGHT)
    public final void setEstimateHeight(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "887c2a3e225f779aa618c58037ef8caf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "887c2a3e225f779aa618c58037ef8caf");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setEstimatedHeight(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_REUSE_IDENTIFIER)
    public final void setReuseIdentifier(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22ec1ca7cc8477dafb50de267b45ddc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22ec1ca7cc8477dafb50de267b45ddc9");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setReuseIdentifier(str);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(defaultBoolean = true, name = DMKeys.KEY_VIEW_CLIP_TO_BOUNDS)
    public final void setClipToBounds(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a61d3d8c386e09b2587233ab4c5d0b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a61d3d8c386e09b2587233ab4c5d0b1");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setClipToBounds(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GDM_REUSEID)
    public final void setGdmReuseId(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95265e7d47480d99ca3de56b34d9cbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95265e7d47480d99ca3de56b34d9cbb");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((NormalCellInfo) aVar.getInfo()).setReuseid(num != null ? String.valueOf(num.intValue()) : null);
        if (num != null && num.intValue() > 0) {
            w wVar = w.a;
            String format = String.format("gdm_willDisplayCallback:%s", Arrays.copyOf(new Object[]{num}, 1));
            h.a((Object) format, "java.lang.String.format(format, *args)");
            ((NormalCellInfo) aVar.getInfo()).setWillDisplayCallback(format);
            w wVar2 = w.a;
            String format2 = String.format("gdm_didEndDisplayingCallback:%s", Arrays.copyOf(new Object[]{num}, 1));
            h.a((Object) format2, "java.lang.String.format(format, *args)");
            ((NormalCellInfo) aVar.getInfo()).setDidEndDisplayingCallback(format2);
        } else {
            ((NormalCellInfo) aVar.getInfo()).setWillDisplayCallback(null);
            ((NormalCellInfo) aVar.getInfo()).setDidEndDisplayingCallback(null);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.cellitems.MRNModuleCellItemManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c4ad39c07ed373b947f28d1b4e544a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c4ad39c07ed373b947f28d1b4e544a9");
        }
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        Map a2 = c.b().a("onSelect", c.a("registrationName", "onSelect")).a("onContextualActionEvent", c.a("registrationName", "onContextualAction")).a();
        h.a((Object) a2, "MapBuilder.builder<Strin…\n                .build()");
        Map<String, Object> b = v.b(a2);
        if (exportedCustomDirectEventTypeConstants != null) {
            b.putAll(exportedCustomDirectEventTypeConstants);
        }
        return b;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedViewConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7782d4211c5a59e3623d63385391023", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7782d4211c5a59e3623d63385391023");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ArrowDefaultRightMargin", 7);
        hashMap.put("ArrowExtraRightMargin", 7);
        return hashMap;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/cellitems/normal/MRNModuleNormalCellItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
