package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
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
@ReactModule(name = MRNModuleHoverViewItemManager.REACT_CLASS)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/hover/MRNModuleHoverViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/MRNModuleFixedMarginViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/hover/MRNModuleHoverViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setDismissAnimationType", "", Constants.EventType.VIEW, DMKeys.KEY_POP_VIEW_INFO_DISMISS_ANIMATION_TYPE, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/hover/MRNModuleHoverViewItemWrapperView;Ljava/lang/Integer;)V", "setShowAnimationType", DMKeys.KEY_POP_VIEW_INFO_SHOW_ANIMATION_TYPE, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleHoverViewItemManager extends MRNModuleFixedMarginViewItemManager<HoverViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String REACT_CLASS = "MRNModuleHoverViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return REACT_CLASS;
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50662d46ff9e84661cdf8cd7bbdb735f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50662d46ff9e84661cdf8cd7bbdb735f");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_POP_VIEW_INFO_SHOW_ANIMATION_TYPE)
    public final void setShowAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a7c497b5b8188865a4cacca4184f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a7c497b5b8188865a4cacca4184f72");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverViewInfo) aVar.getInfo()).setShowAnimationType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_POP_VIEW_INFO_DISMISS_ANIMATION_TYPE)
    public final void setDismissAnimationType(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de390d0091cc9a338645ec268fe415f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de390d0091cc9a338645ec268fe415f9");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((HoverViewInfo) aVar.getInfo()).setDismissAnimationType(num);
        b.a().a(aVar.getHostWrapperView());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/hover/MRNModuleHoverViewItemManager$Companion;", "", "()V", "REACT_CLASS", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }
}
