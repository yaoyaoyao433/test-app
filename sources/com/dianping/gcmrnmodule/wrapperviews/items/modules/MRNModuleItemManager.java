package com.dianping.gcmrnmodule.wrapperviews.items.modules;

import android.text.TextUtils;
import com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager;
import com.dianping.gcmrnmodule.wrapperviews.shadow.MRNModuleWrapperHostWrapperShadowView;
import com.dianping.shield.dynamic.model.module.ModuleInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001:B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0014H\u0007J\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0014H\u0007J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0014H\u0007J\u0018\u0010&\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0014H\u0007J\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0014H\u0007J\u0018\u0010*\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u001aH\u0007J\u001a\u0010,\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010.H\u0007J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001a\u00101\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010.H\u0007J\u001f\u00103\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00104\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001bJ\u001a\u00105\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u000107H\u0007J\u001a\u00108\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u00109\u001a\u0004\u0018\u000107H\u0007¨\u0006;"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModuleItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/base/MRNModuleBaseViewGroupManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModuleItemWrapperView;", "()V", "createMRNModuleShadowNode", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "setEmptyMessage", "", Constants.EventType.VIEW, DMKeys.KEY_EMPTY_MESSAGE, "setEnableOnScreenNotice", DMKeys.KEY_ENABLE_ON_SCREEN_NOTICE, "", "setIsEmpty", DMKeys.KEY_IS_EMPTY, "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModuleItemWrapperView;Ljava/lang/Boolean;)V", "setLinkType", "linkType", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModuleItemWrapperView;Ljava/lang/Integer;)V", "setLoadingMoreStatus", DMKeys.KEY_LOADING_MORE_STATUS, "setLoadingStatus", "loadingStatus", "setOnMomentumScrollEnd", DMKeys.KEY_ON_MOMENTUM_SCROLL_END, "setOnMomentumScrollbegin", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN, "setOnScroll", "onScroll", "setOnScrollBeginDrag", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG, "setOnScrollEndDrag", DMKeys.KEY_ON_SCROLL_END_DRAG, "setScrollEventThrottle", "throttle", "setSectionFooterBackgroundColor", DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR, "Lcom/facebook/react/bridge/Dynamic;", "setSectionFooterHeight", "sectionFooterHeight", "setSectionHeaderBackgroundColor", DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR, "setSectionHeaderHeight", "sectionHeaderHeight", "setSkeletonInfo", "skeletonInfo", "Lcom/facebook/react/bridge/ReadableMap;", "setViewMgeInfo", DMKeys.KEY_VIEW_MGE_INFO, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleItemManager extends MRNModuleBaseViewGroupManager<c> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final c createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b76aedb57d5c583ef6cc8278c5339c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b76aedb57d5c583ef6cc8278c5339c6");
        }
        kotlin.jvm.internal.h.b(aoVar, "context");
        return new c(aoVar);
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.base.MRNModuleBaseViewGroupManager
    @NotNull
    public final LayoutShadowNode createMRNModuleShadowNode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b48f6cad16d97647025900e117c03052", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b48f6cad16d97647025900e117c03052") : new MRNModuleWrapperHostWrapperShadowView();
    }

    @ReactProp(name = "sectionHeaderHeight")
    public final void setSectionHeaderHeight(@NotNull c cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "407bd31d1d8a5e532131d50bc86189ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "407bd31d1d8a5e532131d50bc86189ff");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setSectionHeaderHeight(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "sectionFooterHeight")
    public final void setSectionFooterHeight(@NotNull c cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bc67ef186ee3240b5b0852c6bfe1627", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bc67ef186ee3240b5b0852c6bfe1627");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setSectionFooterHeight(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "linkType")
    public final void setLinkType(@NotNull c cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7182c0054a01f80477b799ef5dd32d6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7182c0054a01f80477b799ef5dd32d6d");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setLinkType(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "loadingStatus")
    public final void setLoadingStatus(@NotNull c cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45f1e7316aa4ee94b5b713d10d9ba68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45f1e7316aa4ee94b5b713d10d9ba68c");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setLoadingStatus(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_LOADING_MORE_STATUS)
    public final void setLoadingMoreStatus(@NotNull c cVar, @Nullable Integer num) {
        Object[] objArr = {cVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "886906bb6fb18b4021ebb163f12cc72d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "886906bb6fb18b4021ebb163f12cc72d");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setLoadingMoreStatus(num);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_IS_EMPTY)
    public final void setIsEmpty(@NotNull c cVar, @Nullable Boolean bool) {
        Object[] objArr = {cVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "630d93747654d0ff98124514900824ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "630d93747654d0ff98124514900824ff");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setEmpty(bool);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_EMPTY_MESSAGE)
    public final void setEmptyMessage(@NotNull c cVar, @Nullable String str) {
        Object[] objArr = {cVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e91f6ea32dfc2af4822109585b587e0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e91f6ea32dfc2af4822109585b587e0e");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setEmptyMessage(str);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_VIEW_MGE_INFO)
    public final void setViewMgeInfo(@NotNull c cVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {cVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57b17a395db000902e660343ba5875ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57b17a395db000902e660343ba5875ed");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setViewMgeInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.f(readableMap) : null);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_HEADER_BACKGROUND_COLOR)
    public final void setSectionHeaderBackgroundColor(@NotNull c cVar, @Nullable Dynamic dynamic) {
        Object[] objArr = {cVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bea13369286a61cf6cac146ca194daa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bea13369286a61cf6cac146ca194daa2");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setSectionHeaderBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SECTION_FOOTER_BACKGROUND_COLOR)
    public final void setSectionFooterBackgroundColor(@NotNull c cVar, @Nullable Dynamic dynamic) {
        Object[] objArr = {cVar, dynamic};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d1cab5ec5494b618fde50271884f265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d1cab5ec5494b618fde50271884f265");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setSectionFooterBackgroundColor(dynamic != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(dynamic) : null);
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ENABLE_ON_SCREEN_NOTICE)
    public final void setEnableOnScreenNotice(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81400ba8b28ba0aa4bf322291be3a71d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81400ba8b28ba0aa4bf322291be3a71d");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setEnableOnScreenNotice(Boolean.valueOf(z));
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "skeletonInfo")
    public final void setSkeletonInfo(@NotNull c cVar, @Nullable ReadableMap readableMap) {
        com.dianping.gcmrnmodule.skeleton.b bVar;
        Object[] objArr = {cVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81dfaf9f3d8d6abbc58032b1acbd64b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81dfaf9f3d8d6abbc58032b1acbd64b0");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setSkeletonInfo(readableMap != null ? readableMap.toHashMap() : null);
        HashMap<String, Object> hashMap = readableMap != null ? readableMap.toHashMap() : null;
        Object[] objArr2 = {hashMap};
        ChangeQuickRedirect changeQuickRedirect3 = c.g;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "fac576ac9fc9a59eedaad36551b17cb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "fac576ac9fc9a59eedaad36551b17cb4");
        } else {
            com.dianping.gcmrnmodule.skeleton.a skeletonReusePool = cVar.getSkeletonReusePool();
            Object[] objArr3 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect4 = com.dianping.gcmrnmodule.skeleton.a.a;
            if (PatchProxy.isSupport(objArr3, skeletonReusePool, changeQuickRedirect4, false, "7efeb591713ed9cb656c7b5bbc2d836d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, skeletonReusePool, changeQuickRedirect4, false, "7efeb591713ed9cb656c7b5bbc2d836d");
            } else if (hashMap == null) {
                skeletonReusePool.b.clear();
            } else {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    Object value = entry.getValue();
                    if (!(value instanceof String)) {
                        value = null;
                    }
                    String str = (String) value;
                    if (str != null) {
                        String key = entry.getKey();
                        Object[] objArr4 = {key, str};
                        ChangeQuickRedirect changeQuickRedirect5 = com.dianping.gcmrnmodule.skeleton.a.a;
                        if (PatchProxy.isSupport(objArr4, skeletonReusePool, changeQuickRedirect5, false, "b7e083ff73cd8932c511b586135aaaea", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, skeletonReusePool, changeQuickRedirect5, false, "b7e083ff73cd8932c511b586135aaaea");
                        } else {
                            String str2 = key;
                            if (!(str2 == null || str2.length() == 0)) {
                                String str3 = str;
                                if (!(str3 == null || str3.length() == 0) && ((bVar = skeletonReusePool.b.get(key)) == null || !TextUtils.equals(bVar.b, str3))) {
                                    skeletonReusePool.b.put(key, new com.dianping.gcmrnmodule.skeleton.b(str, new ArrayList()));
                                }
                            }
                        }
                    }
                }
            }
        }
        com.dianping.gcmrnmodule.b.a().a(cVar.getHostWrapperView());
    }

    @ReactProp(name = "onScroll")
    public final void setOnScroll(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8880de66e1cd40a9337c1083ed87a6b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8880de66e1cd40a9337c1083ed87a6b0");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        cVar.setNeedScroll(z);
    }

    @ReactProp(name = DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)
    public final void setOnMomentumScrollbegin(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d306ebcf7b61b0890a81914536f3802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d306ebcf7b61b0890a81914536f3802");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        cVar.setNeedMomentumScrollBegin(z);
    }

    @ReactProp(name = DMKeys.KEY_ON_MOMENTUM_SCROLL_END)
    public final void setOnMomentumScrollEnd(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c164c063a31ac038d2ac0f6af7a14a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c164c063a31ac038d2ac0f6af7a14a14");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        cVar.setNeedMomentumScrollEnd(z);
    }

    @ReactProp(name = DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)
    public final void setOnScrollBeginDrag(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bade19875c5289f34812afbcef96ce3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bade19875c5289f34812afbcef96ce3");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        cVar.setNeedBeginDrag(z);
    }

    @ReactProp(name = DMKeys.KEY_ON_SCROLL_END_DRAG)
    public final void setOnScrollEndDrag(@NotNull c cVar, boolean z) {
        Object[] objArr = {cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9869e96eee2bc066ffbcdb5a5ee6dd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9869e96eee2bc066ffbcdb5a5ee6dd3f");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        cVar.setNeedEndDrag(z);
    }

    @ReactProp(name = DMKeys.KEY_THROTTLE)
    public final void setScrollEventThrottle(@NotNull c cVar, int i) {
        Object[] objArr = {cVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c2edb7e8a4c25970922c8218770782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c2edb7e8a4c25970922c8218770782");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, Constants.EventType.VIEW);
        ((ModuleInfo) cVar.getInfo()).setScrollEventThrottle(Integer.valueOf(i));
        cVar.setScrollEventThrottle(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public final Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76c5a2d268a5d33f565586cf949acf3b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76c5a2d268a5d33f565586cf949acf3b") : com.facebook.react.common.c.b().a("onNeedLoadMore", com.facebook.react.common.c.a("registrationName", "onNeedLoadMore")).a("onRetryForLoadingFail", com.facebook.react.common.c.a("registrationName", "onRetryForLoadingFail")).a(com.alipay.sdk.widget.d.p, com.facebook.react.common.c.a("registrationName", com.alipay.sdk.widget.d.p)).a("onAppear", com.facebook.react.common.c.a("registrationName", "onAppear")).a("onDisappear", com.facebook.react.common.c.a("registrationName", "onDisappear")).a("onPageAppear", com.facebook.react.common.c.a("registrationName", "onPageAppear")).a("onPageDisappear", com.facebook.react.common.c.a("registrationName", "onPageDisappear")).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.SCROLL), com.facebook.react.common.c.a("registrationName", "onScroll")).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_BEGIN), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_BEGIN)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.MOMENTUM_END), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_MOMENTUM_SCROLL_END)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.BEGIN_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_BEGIN_DRAG)).a(com.facebook.react.views.scroll.i.a(com.facebook.react.views.scroll.i.END_DRAG), com.facebook.react.common.c.a("registrationName", DMKeys.KEY_ON_SCROLL_END_DRAG)).a();
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/modules/MRNModuleItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
