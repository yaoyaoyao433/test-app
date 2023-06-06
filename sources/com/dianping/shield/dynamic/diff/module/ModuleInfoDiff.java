package com.dianping.shield.dynamic.diff.module;

import com.dianping.shield.component.extensions.common.BaseScrollableRowItem;
import com.dianping.shield.component.utils.ComponentScrollEventHelper;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.diff.ScrollEventDiff;
import com.dianping.shield.dynamic.model.extra.ScrollEvent;
import com.dianping.shield.dynamic.model.module.ModuleInfo;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.entity.ExposeScope;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.entity.ViewExtraInfo;
import com.dianping.shield.node.cellnode.NodePath;
import com.dianping.shield.node.itemcallbacks.MoveStatusCallback;
import com.dianping.shield.node.useritem.ShieldSectionCellItem;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/dianping/shield/dynamic/diff/module/ModuleInfoDiff;", "Lcom/dianping/shield/dynamic/diff/module/BaseModuleInfoDiff;", "Lcom/dianping/shield/dynamic/model/module/ModuleInfo;", "Lcom/dianping/shield/node/useritem/ShieldSectionCellItem;", "Lcom/dianping/shield/dynamic/diff/ScrollEventDiff;", "hostAgent", "Lcom/dianping/shield/dynamic/agent/DynamicAgent;", "(Lcom/dianping/shield/dynamic/agent/DynamicAgent;)V", "getHostAgent", "()Lcom/dianping/shield/dynamic/agent/DynamicAgent;", "updateProps", "", "info", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ModuleInfoDiff extends BaseModuleInfoDiff<ModuleInfo, ShieldSectionCellItem> implements ScrollEventDiff {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final DynamicAgent hostAgent;

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    @Nullable
    public final ComponentScrollEventHelper.IEventDispatcherProvider createScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @Nullable ComponentScrollEventHelper.IEventDispatcherProvider iEventDispatcherProvider) {
        Object[] objArr = {scrollEvent, iEventDispatcherProvider};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dea0d810e36441b0b9d423b42e11a222", RobustBitConfig.DEFAULT_VALUE)) {
            return (ComponentScrollEventHelper.IEventDispatcherProvider) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dea0d810e36441b0b9d423b42e11a222");
        }
        h.b(scrollEvent, "scrollEvent");
        return ScrollEventDiff.DefaultImpls.createScrollEventDispatcher(this, scrollEvent, iEventDispatcherProvider);
    }

    @NotNull
    public final DynamicAgent getHostAgent() {
        return this.hostAgent;
    }

    @Override // com.dianping.shield.dynamic.diff.ScrollEventDiff
    public final void setScrollEventDispatcher(@NotNull ScrollEvent scrollEvent, @NotNull BaseScrollableRowItem baseScrollableRowItem) {
        Object[] objArr = {scrollEvent, baseScrollableRowItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7fe3d8e8bdf178d4b71ad9bcef49db8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7fe3d8e8bdf178d4b71ad9bcef49db8");
            return;
        }
        h.b(scrollEvent, "scrollEvent");
        h.b(baseScrollableRowItem, "baseScrollableRowItem");
        ScrollEventDiff.DefaultImpls.setScrollEventDispatcher(this, scrollEvent, baseScrollableRowItem);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleInfoDiff(@NotNull DynamicAgent dynamicAgent) {
        super(dynamicAgent);
        h.b(dynamicAgent, "hostAgent");
        Object[] objArr = {dynamicAgent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f729292992fcbf81b92c7b7e8fc821f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f729292992fcbf81b92c7b7e8fc821f");
        } else {
            this.hostAgent = dynamicAgent;
        }
    }

    @Override // com.dianping.shield.dynamic.diff.module.BaseModuleInfoDiff
    public final void updateProps(@NotNull ModuleInfo moduleInfo) {
        Object[] objArr = {moduleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2a4013e803e36fd3d6d9ca48222590b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2a4013e803e36fd3d6d9ca48222590b");
            return;
        }
        h.b(moduleInfo, "info");
        super.updateProps((ModuleInfoDiff) moduleInfo);
        Boolean enableOnScreenNotice = moduleInfo.getEnableOnScreenNotice();
        if (enableOnScreenNotice == null || !enableOnScreenNotice.booleanValue()) {
            return;
        }
        getDynamicModuleItem().moveStatusCallback = new MoveStatusCallback() { // from class: com.dianping.shield.dynamic.diff.module.ModuleInfoDiff$updateProps$$inlined$let$lambda$1
            public static ChangeQuickRedirect changeQuickRedirect;
            private ScrollDirection lastDisappearDirection = ScrollDirection.STATIC;

            @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
            public final void onAppear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0fa93532e137908d85e45442cc2a84a7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0fa93532e137908d85e45442cc2a84a7");
                    return;
                }
                h.b(exposeScope, Constants.PARAM_SCOPE);
                h.b(scrollDirection, "direction");
                if (exposeScope == ExposeScope.PX) {
                    if (this.lastDisappearDirection == ScrollDirection.RESIGN_ACTIVE) {
                        ModuleInfoDiff.this.getHostAgent().callHostOnAppear(DMConstant.ModuleOnAppearType.BecomeActive);
                        return;
                    }
                    DynamicAgent hostAgent = ModuleInfoDiff.this.getHostAgent();
                    DMConstant.ModuleOnAppearType appearTypeByScrollDirection = DMUtils.getAppearTypeByScrollDirection(scrollDirection);
                    h.a((Object) appearTypeByScrollDirection, "DMUtils.getAppearTypeByScrollDirection(direction)");
                    hostAgent.callHostOnAppear(appearTypeByScrollDirection);
                }
            }

            @Override // com.dianping.shield.node.itemcallbacks.MoveStatusCallback
            public final void onDisappear(@NotNull ExposeScope exposeScope, @NotNull ScrollDirection scrollDirection, @Nullable Object obj, @Nullable NodePath nodePath, @Nullable ViewExtraInfo viewExtraInfo) {
                Object[] objArr2 = {exposeScope, scrollDirection, obj, nodePath, viewExtraInfo};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b841092230e4dfdceecfa6b226782223", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b841092230e4dfdceecfa6b226782223");
                    return;
                }
                h.b(exposeScope, Constants.PARAM_SCOPE);
                h.b(scrollDirection, "direction");
                if (exposeScope == ExposeScope.COMPLETE) {
                    this.lastDisappearDirection = scrollDirection;
                    DynamicAgent hostAgent = ModuleInfoDiff.this.getHostAgent();
                    DMConstant.ModuleOnDisappearType disappearTypeByScrollDirection = DMUtils.getDisappearTypeByScrollDirection(scrollDirection);
                    h.a((Object) disappearTypeByScrollDirection, "DMUtils.getDisappearType…crollDirection(direction)");
                    hostAgent.callHostOnDisappear(disappearTypeByScrollDirection);
                }
            }
        };
    }
}
