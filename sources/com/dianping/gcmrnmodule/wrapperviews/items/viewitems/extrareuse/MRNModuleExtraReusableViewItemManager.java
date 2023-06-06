package com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse;

import com.dianping.gcmrnmodule.b;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.MRNModuleExtraViewItemManager;
import com.dianping.shield.dynamic.model.view.ExtraReusableViewInfo;
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
@ReactModule(name = MRNModuleExtraReusableViewItemManager.NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0015"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extrareuse/MRNModuleExtraReusableViewItemManager;", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extra/MRNModuleExtraViewItemManager;", "Lcom/dianping/shield/dynamic/model/view/ExtraReusableViewInfo;", "()V", "createViewInstance", "Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extrareuse/MRNModuleExtraReusableViewItemWrapperView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getName", "", "setEstimateHeight", "", Constants.EventType.VIEW, DMKeys.KEY_ESTIMATED_HEIGHT, "", "(Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extrareuse/MRNModuleExtraReusableViewItemWrapperView;Ljava/lang/Integer;)V", "setReuseId", "reuseId", "setReuseIdentifier", DMKeys.KEY_REUSE_IDENTIFIER, "Companion", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNModuleExtraReusableViewItemManager extends MRNModuleExtraViewItemManager<ExtraReusableViewInfo> {
    public static final a Companion = new a(null);
    @NotNull
    public static final String NAME = "MRNModuleExtraReusableViewItemWrapper";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.MRNModuleExtraViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public final String getName() {
        return NAME;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dianping/gcmrnmodule/wrapperviews/items/viewitems/extrareuse/MRNModuleExtraReusableViewItemManager$Companion;", "", "()V", "NAME", "", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @Override // com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.MRNModuleExtraViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager, com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public final com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.a createViewInstance(@NotNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef05d67ed127439ee921450fa014e114", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef05d67ed127439ee921450fa014e114");
        }
        h.b(aoVar, "context");
        return new com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.a(aoVar);
    }

    @ReactProp(name = DMKeys.KEY_REUSE_IDENTIFIER)
    public final void setReuseIdentifier(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.a aVar, @Nullable String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69f0a403146040c9c31f402c8ef764b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69f0a403146040c9c31f402c8ef764b8");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ExtraReusableViewInfo) aVar.getInfo()).setReuseIdentifier(str);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_ESTIMATED_HEIGHT)
    public final void setEstimateHeight(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "482b3f36c54dac39bd0b787c6bacce6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "482b3f36c54dac39bd0b787c6bacce6b");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ExtraReusableViewInfo) aVar.getInfo()).setEstimatedHeight(num);
        b.a().a(aVar.getHostWrapperView());
    }

    @ReactProp(name = DMKeys.KEY_GDM_REUSEID)
    public final void setReuseId(@NotNull com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.a aVar, @Nullable Integer num) {
        Object[] objArr = {aVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cdbac43b1bae8740fcb3eba360ca7c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cdbac43b1bae8740fcb3eba360ca7c5");
            return;
        }
        h.b(aVar, Constants.EventType.VIEW);
        ((ExtraReusableViewInfo) aVar.getInfo()).setReuseid(num != null ? String.valueOf(num.intValue()) : null);
        b.a().a(aVar.getHostWrapperView());
    }
}
