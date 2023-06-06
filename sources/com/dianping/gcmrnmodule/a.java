package com.dianping.gcmrnmodule;

import com.dianping.gcmrnmodule.components.horizontalScrollBarrier.MRNModuleScrollBarrierManager;
import com.dianping.gcmrnmodule.components.imageview.GCMRNImageViewManager;
import com.dianping.gcmrnmodule.components.textview.MRNModuleTextViewManager;
import com.dianping.gcmrnmodule.components.touchBarrier.MRNModuleTouchBarrierManager;
import com.dianping.gcmrnmodule.components.touchbackground.MRNModuleTouchViewManager;
import com.dianping.gcmrnmodule.managers.MRNModuleAnchorManager;
import com.dianping.gcmrnmodule.managers.MRNModuleEventsManager;
import com.dianping.gcmrnmodule.managers.MRNModuleMarginManager;
import com.dianping.gcmrnmodule.managers.MRNModuleNavigationManager;
import com.dianping.gcmrnmodule.managers.MRNModuleRefreshManager;
import com.dianping.gcmrnmodule.managers.MRNModuleWhiteBoardManager;
import com.dianping.gcmrnmodule.managers.MRNModulesPageManager;
import com.dianping.gcmrnmodule.wrapperviews.MRNModuleViewManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.module.MRNModuleHoverViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.module.MRNModulePopViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.module.MRNModuleSectionsContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.modulecontainer.MRNModuleModuleContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.scrollcell.MRNModuleScrollCellAttachViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.MRNModuleCellsContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.MRNModuleFooterCellContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.MRNModuleHeaderCellContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.MRNModuleSectionFooterViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.section.MRNModuleSectionHeaderViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.tab.MRNModuleTabSlideBarContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.MRNTabModuleTabModulesContainerWrapperManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.MRNTabModuleTabViewContainerWrapperManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.MRNTabModuleTabsModulesContainerWrapperManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleBackgroundViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleDragRefreshViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleEmptyViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleLoadingFailViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleLoadingMoreFailViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleLoadingMoreViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleLoadingViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleMaskViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModulePageBackgroundViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModulePageMaskViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.containers.viewscontainer.MRNModuleViewsContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.grid.MRNModuleGridCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.hover.MRNModuleHoverCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.normal.MRNModuleNormalCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.scroll.MRNModuleScrollCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.cellitems.tab.MRNModuleTabCellItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNContainerModuleItemWrapperManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNModuleItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNModulesVCItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNModulesVCPageManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNScrollTabModuleItemWrapperManager;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.MRNTabModuleItemWrapperManager;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.grid.MRNModuleGridSectionItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.normal.MRNModuleSectionItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.sectionitems.waterfall.MRNModuleWaterfallSectionItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleFixedMarginViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleReusableViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.MRNModuleViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.attach.MRNModuleScrollCellAttachViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.dragrefresh.MRNModuleDragRefreshViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extra.MRNModuleExtraViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.extrareuse.MRNModuleExtraReusableViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.griditem.MRNModuleGridItemViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.headerfooter.MRNModuleHeaderFooterViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.hover.MRNModuleHoverViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.pop.MRNModulePopViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.items.viewitems.tab.MRNModuleTabViewItemManager;
import com.dianping.gcmrnmodule.wrapperviews.modulevc.MRNModulesVCExtraViewsContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.reuse.MRNModuleReuseViewContainerManager;
import com.dianping.gcmrnmodule.wrapperviews.reuse.MRNModuleReuseViewsContainerManager;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3101f932f11ea259c6d6c8c3d480ff4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3101f932f11ea259c6d6c8c3d480ff4e");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MRNModuleMarginManager());
        arrayList.add(new MRNModuleWhiteBoardManager(reactApplicationContext));
        arrayList.add(new MRNModulesPageManager(reactApplicationContext));
        arrayList.add(new MRNModuleNavigationManager(reactApplicationContext));
        arrayList.add(new MRNModuleEventsManager(reactApplicationContext));
        arrayList.add(new MRNModuleRefreshManager(reactApplicationContext));
        arrayList.add(new MRNModuleAnchorManager(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea290c13b7e98658bdf3286df532e06", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea290c13b7e98658bdf3286df532e06");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MRNModuleItemManager());
        arrayList.add(new MRNModuleHeaderFooterViewItemManager());
        arrayList.add(new MRNModuleSectionItemManager());
        arrayList.add(new MRNModuleWaterfallSectionItemManager());
        arrayList.add(new MRNModuleSectionsContainerManager());
        arrayList.add(new MRNModuleViewItemManager());
        arrayList.add(new MRNModuleViewManager());
        arrayList.add(new MRNModuleNormalCellItemManager());
        arrayList.add(new MRNModuleCellsContainerManager());
        arrayList.add(new MRNModuleBackgroundViewContainerManager());
        arrayList.add(new MRNModuleEmptyViewContainerManager());
        arrayList.add(new MRNModuleLoadingFailViewContainerManager());
        arrayList.add(new MRNModuleLoadingMoreFailViewContainerManager());
        arrayList.add(new MRNModuleLoadingMoreViewContainerManager());
        arrayList.add(new MRNModuleLoadingViewContainerManager());
        arrayList.add(new MRNModulePageBackgroundViewContainerManager());
        arrayList.add(new MRNModulePageMaskViewContainerManager());
        arrayList.add(new MRNModuleMaskViewContainerManager());
        arrayList.add(new MRNModuleScrollCellAttachViewContainerManager());
        arrayList.add(new MRNModuleScrollCellItemManager());
        arrayList.add(new MRNModuleGridCellItemManager());
        arrayList.add(new MRNModuleViewContainerManager());
        arrayList.add(new MRNModuleViewsContainerManager());
        arrayList.add(new MRNModuleScrollCellAttachViewItemManager());
        arrayList.add(new MRNModuleGridItemViewItemManager());
        arrayList.add(new MRNModuleModuleContainerManager());
        arrayList.add(new MRNModulesVCItemManager());
        arrayList.add(new MRNModuleFooterCellContainerManager());
        arrayList.add(new MRNModuleHeaderCellContainerManager());
        arrayList.add(new MRNModuleSectionFooterViewContainerManager());
        arrayList.add(new MRNModuleSectionHeaderViewContainerManager());
        arrayList.add(new MRNModuleTabSlideBarContainerManager());
        arrayList.add(new MRNModuleFixedMarginViewItemManager());
        arrayList.add(new MRNModuleExtraViewItemManager());
        arrayList.add(new MRNModuleHoverViewContainerManager());
        arrayList.add(new MRNModulePopViewContainerManager());
        arrayList.add(new MRNModuleHoverViewItemManager());
        arrayList.add(new MRNModulePopViewItemManager());
        arrayList.add(new MRNModuleHoverCellItemManager());
        arrayList.add(new MRNModuleTabCellItemManager());
        arrayList.add(new MRNModuleTabViewItemManager());
        arrayList.add(new MRNModulesVCExtraViewsContainerManager());
        arrayList.add(new MRNModuleGridSectionItemManager());
        arrayList.add(new MRNModuleReusableViewItemManager());
        arrayList.add(new MRNModuleExtraReusableViewItemManager());
        arrayList.add(new MRNTabModuleItemWrapperManager());
        arrayList.add(new MRNTabModuleTabModulesContainerWrapperManager());
        arrayList.add(new MRNTabModuleTabsModulesContainerWrapperManager());
        arrayList.add(new MRNTabModuleTabViewContainerWrapperManager());
        arrayList.add(new MRNContainerModuleItemWrapperManager());
        arrayList.add(new MRNScrollTabModuleItemWrapperManager());
        arrayList.add(new MRNModulesVCPageManager());
        arrayList.add(new MRNModuleReuseViewContainerManager());
        arrayList.add(new MRNModuleReuseViewsContainerManager());
        arrayList.add(new MRNModuleTextViewManager());
        arrayList.add(new MRNModuleTouchViewManager());
        arrayList.add(new MRNModuleTouchBarrierManager());
        arrayList.add(new MRNModuleScrollBarrierManager());
        arrayList.add(new GCMRNImageViewManager());
        arrayList.add(new MRNModuleDragRefreshViewItemManager());
        arrayList.add(new MRNModuleDragRefreshViewContainerManager());
        return arrayList;
    }
}
