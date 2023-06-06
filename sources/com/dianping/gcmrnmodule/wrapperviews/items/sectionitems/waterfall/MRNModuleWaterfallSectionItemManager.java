package com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.MRNModuleBaseSectionItemManager;
import com.dianping.shield.dynamic.model.section.WaterfallSectionInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.node.adapter.animator.AnimationType;
import com.facebook.react.bridge.ReadableMap;
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
@ReactModule(name = MRNModuleWaterfallSectionItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0011H\u0007J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\u0010\u000eJ\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012¨\u0006$"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/waterfall/MRNModuleWaterfallSectionItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/MRNModuleBaseSectionItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/waterfall/MRNModuleWaterfallSectionItemWrapperView;", "()V", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setAutoMargin", "", Constants.EventType.VIEW, DMKeys.KEY_AUTO_MARGIN, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/waterfall/MRNModuleWaterfallSectionItemWrapperView;Ljava/lang/Boolean;)V", "setBackgroundColor", "backgroundColor", "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/waterfall/MRNModuleWaterfallSectionItemWrapperView;Ljava/lang/Integer;)V", "setColCount", DMKeys.KEY_COLCOUNT, "setDeleteAnimationType", "type", "setEnableLayoutAnimation", "enableLayoutAnimation", "setInsertAnimationType", "setMarginInfo", DMKeys.KEY_MARGIN_INFO, "Lcom/facebook/react/bridge/ReadableMap;", "setSelectionStyle", DMKeys.KEY_SELECTION_STYLE, "setXGap", DMKeys.KEY_XGAP, "setYGap", DMKeys.KEY_YGAP, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleWaterfallSectionItemManager extends MRNModuleBaseSectionItemManager<com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleWaterfallSectionItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7b82fb5e5ba810e3a4fff1385d6f8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7b82fb5e5ba810e3a4fff1385d6f8cd");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_COLCOUNT)
    public final void setColCount(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f79a24d8de2d8ddf7f3b12a6ad8e6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f79a24d8de2d8ddf7f3b12a6ad8e6eb");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setColCount(i);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_XGAP)
    public final void setXGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c33fcb8ac117b5d015b26d30c0929922", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c33fcb8ac117b5d015b26d30c0929922");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setXGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_YGAP)
    public final void setYGap(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0f8d420b5b7c68afce7028d0b6ab139", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0f8d420b5b7c68afce7028d0b6ab139");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setYGap(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "backgroundColor")
    public final void setBackgroundColor(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de428a7a48faeb2409b9f9f6c896c21d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de428a7a48faeb2409b9f9f6c896c21d");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setBackgroundColor(num != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.a(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_MARGIN_INFO)
    public final void setMarginInfo(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd1cf2a0c2d096dd1c5fe07678bd11e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd1cf2a0c2d096dd1c5fe07678bd11e8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setMarginInfo(readableMap != null ? com.dianping.gcmrnmodule.wrapperviews.base.a.g(readableMap) : null);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_SELECTION_STYLE)
    public final void setSelectionStyle(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7aba734cad5dcc7f447f69853ba3a0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7aba734cad5dcc7f447f69853ba3a0f9");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setSelectionStyle(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_AUTO_MARGIN)
    public final void setAutoMargin(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f05a6a6dbf8c31731db04261fdc03bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f05a6a6dbf8c31731db04261fdc03bf8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setAutoMargin(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "enableLayoutAnimation")
    public final void setEnableLayoutAnimation(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Boolean bool) {
        Object[] objArr = {aVar, bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b7744c293402d4c4e380fbde6e84c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b7744c293402d4c4e380fbde6e84c3");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((WaterfallSectionInfo) aVar.getInfo()).setEnableLayoutAnimation(bool);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "insertAnimationType")
    public final void setInsertAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0347a01829e21cf367658cfbc19069f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0347a01829e21cf367658cfbc19069f");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (num != null) {
            ((WaterfallSectionInfo) aVar.getInfo()).setInsertAnimationType(AnimationType.fromType(num.intValue()));
        } else {
            ((WaterfallSectionInfo) aVar.getInfo()).setInsertAnimationType(AnimationType.NONE);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = "deleteAnimationType")
    public final void setDeleteAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2643f79f3b76ac1941ad41e8bb107acf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2643f79f3b76ac1941ad41e8bb107acf");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        if (num != null) {
            ((WaterfallSectionInfo) aVar.getInfo()).setDeleteAnimationType(AnimationType.fromType(num.intValue()));
        } else {
            ((WaterfallSectionInfo) aVar.getInfo()).setDeleteAnimationType(AnimationType.NONE);
        }
        b.a().a(aVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/sectionitems/waterfall/MRNModuleWaterfallSectionItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
