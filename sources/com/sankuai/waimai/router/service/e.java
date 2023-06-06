package com.sankuai.waimai.router.service;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dianping.live.live.mrn.MLivePlayerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager;
import com.sankuai.waimai.business.order.api.pay.IPaymentManager;
import com.sankuai.waimai.business.order.api.store.IDrugShopCartNotifyService;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.drug.vessel.DrugPrepareVesselService;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService;
import com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService;
import com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService;
import com.sankuai.waimai.foundation.core.service.order.IAgainOrderService;
import com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService;
import com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService;
import com.sankuai.waimai.foundation.core.service.user.IUserManagerService;
import com.sankuai.waimai.imbase.knb.IChatInfo;
import com.sankuai.waimai.imbase.knb.ISessionsInfo;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider;
import com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager;
import com.sankuai.waimai.platform.machpro.module.ICommonParameter;
import com.sankuai.waimai.platform.net.main.IMainActivityLoadedPlatform;
import com.sankuai.waimai.platform.utils.Mode3CheckPermissionI;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.utils.g;
import com.sankuai.waimai.store.i.poi.PoiDrugService;
import com.sankuai.waimai.store.i.poi.PoiFlashBuyService;
import com.sankuai.waimai.store.mach.IMachHttpNativeMethod;
import com.sankuai.waimai.store.manager.judas.JudasMonitorService;
import com.sankuai.waimai.store.mrn.shopcartbridge.DrugShopcartVesselService;
import com.sankuai.waimai.store.mrn.shopcartbridge.IPoiTabMrnService;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider;
import com.sankuai.waimai.store.shopping.cart.ShopCartBaseBlockFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e<I> {
    public static ChangeQuickRedirect a;
    private static final Map<String, e> b = new HashMap();
    private static final com.sankuai.waimai.router.utils.c c = new com.sankuai.waimai.router.utils.c("ServiceLoader") { // from class: com.sankuai.waimai.router.service.e.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.router.utils.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e04602cdec04ef09786e094e918e4d4f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e04602cdec04ef09786e094e918e4d4f");
                return;
            }
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.router.generated.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5eeccfbad2b21cf4e3f1078e60227cdb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5eeccfbad2b21cf4e3f1078e60227cdb");
                } else {
                    e.a("com.sankuai.waimai.store.i.poi.PoiFlashBuyService", PoiFlashBuyService.KEY_SG, "com.sankuai.waimai.store.v2.other.PoiFlashBuyServiceImpl", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_a34b23316f0db012320a20769007047b", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_a34b23316f0db012320a20769007047b", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_7161ac31f0398db85218efda652989b", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_7161ac31f0398db85218efda652989b", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_e17e433b6d12bd1b698be82976ca3720", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_e17e433b6d12bd1b698be82976ca3720", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_9b1746aab3c4d227e11482315ae21e84", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_9b1746aab3c4d227e11482315ae21e84", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_330d531674493ce6932ab698c94966c5", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_330d531674493ce6932ab698c94966c5", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_c2575bf4125c48180b149dd52c80f839", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_c2575bf4125c48180b149dd52c80f839", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_181e8d2c135b95f2003d3b85338ddfe6", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_181e8d2c135b95f2003d3b85338ddfe6", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_c7648c77673a761e28f967c1180c31a8", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_c7648c77673a761e28f967c1180c31a8", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_f4e7efd94d4aee5567e8b5f27a1ab09d", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_f4e7efd94d4aee5567e8b5f27a1ab09d", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_38b8dfefa30a590423348ad69c334338", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_38b8dfefa30a590423348ad69c334338", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_982747dc688e21f4a4335b8fd682f344", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_982747dc688e21f4a4335b8fd682f344", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_9b0b72e0f6ac9d37c6e7c38cff13d5d8", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_9b0b72e0f6ac9d37c6e7c38cff13d5d8", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_fe8ae569de45dcc42826190ce9e3bb47", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_fe8ae569de45dcc42826190ce9e3bb47", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_b5733d0194399271725699b6f6f98481", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_b5733d0194399271725699b6f6f98481", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_a45109437dc5470d8add48c85de6de88", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_a45109437dc5470d8add48c85de6de88", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_3cff37c5b98f7597778a85483e6396e3", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_3cff37c5b98f7597778a85483e6396e3", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_73683689400daa450bd26ff4af85599b", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_73683689400daa450bd26ff4af85599b", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_7c19cc82a85f01892fe78ea5e6993e8c", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_7c19cc82a85f01892fe78ea5e6993e8c", false);
                    e.a("com.sankuai.waimai.router.common.IUriAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_8b65d0b728bdd1256c5336f68a7955ae", "com.sankuai.waimai.router.generated.UriRouter_RouterUri_8b65d0b728bdd1256c5336f68a7955ae", false);
                    e.a("com.sankuai.waimai.business.order.api.pay.IPaymentManager", IPaymentManager.KEY, "com.sankuai.waimai.bussiness.order.base.pay.payment.PaymentManager", true);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "im", "com.sankuai.waimai.business.im.config.ImRemoteConfig", false);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "waimai_shell", "com.sankuai.meituan.takeoutnew.app.config.WaimaiRemoteConfig", false);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "restaurant", "com.sankuai.waimai.business.restaurant.base.RestaurantRemoteConfig", false);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "page", "com.sankuai.waimai.business.page.common.config.PageRemoteConfig", false);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "platform", "com.sankuai.waimai.platform.config.horn.PlatformRemoteConfig", false);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "launcher", "com.sankuai.waimai.launcher.config.LauncherRemoteConfig", false);
                    e.a("com.sankuai.waimai.platform.config.horn.RemoteConfigCallback", "mrn_net_preload", "com.sankuai.waimai.reactnative.preload.MRNPreloadConfig", true);
                    e.a("com.meituan.roodesign.resfetcher.plugin.RooResourceProvider", "com.meituan.roodesign.generate.RooResourcesMap_waimai_c", "com.meituan.roodesign.generate.RooResourcesMap_waimai_c", false);
                    e.a("com.meituan.roodesign.resfetcher.plugin.RooResourceProvider", "com.meituan.roodesign.generate.RooResourcesMap_ugccreator", "com.meituan.roodesign.generate.RooResourcesMap_ugccreator", false);
                    e.a("com.sankuai.waimai.store.mrn.shopcartbridge.IPoiTabMrnService", IPoiTabMrnService.DRUG_POI_MRN, "com.sankuai.waimai.store.goods.list.utils.DrugPoiTabMrnServiceImpl", false);
                    e.a("com.sankuai.waimai.foundation.core.base.net.WMHostChangeListener", "legwork", "com.meituan.android.legwork.common.hostInfo.HostChangeListenerImpl", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/takeout/content", "com.sankuai.waimai.business.page.home.list.feed.ContentFeedPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/content", "com.sankuai.waimai.business.page.home.list.feed.ContentFeedPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/takeout/mrn", "com.sankuai.waimai.reactnative.preload.MRNNetPreLoader", true);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/menu", "com.sankuai.waimai.business.restaurant.base.repository.preload.RestMenuNetWorkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/goodsdetail", "com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/restrictrestaurant", "com.sankuai.waimai.business.restaurant.base.repository.preload.RestMenuNetWorkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/mrn", "com.sankuai.waimai.reactnative.preload.MRNNetPreLoader", true);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/pickme", "com.sankuai.waimai.business.ugc.pickme.PickMePreloadRunnable", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/searchglobal", "com.sankuai.waimai.business.search.preload.GlobalSearchNetworkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/poifilter", "com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/takeout/pickme", "com.sankuai.waimai.business.ugc.pickme.PickMePreloadRunnable", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/takeout/secondpage", "com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/order", "com.sankuai.waimai.bussiness.order.detailnew.preload.OrderDetailNetworkPreLoader", false);
                    e.a("com.sankuai.waimai.platform.preload.PreloadRunnable", "/restaurant", "com.sankuai.waimai.business.restaurant.base.repository.preload.RestMenuNetWorkPreLoader", false);
                    e.a("com.sankuai.waimai.imbase.knb.IChatInfo", IChatInfo.WM_KEY, "com.sankuai.waimai.business.im.group.init.WmGroupSessionConfig", true);
                    e.a("com.sankuai.waimai.imbase.knb.IChatInfo", IChatInfo.WM_FOOD_SAFETY_KEY, "com.sankuai.waimai.business.im.group.init.WmFoodSafetySessionConfig", true);
                    e.a("com.sankuai.waimai.imbase.knb.IChatInfo", IChatInfo.WM_USER_KEY, "com.sankuai.waimai.business.im.group.init.WMImUserGroupSessionConfig", true);
                    e.a("com.sankuai.waimai.imbase.knb.IChatInfo", IChatInfo.SG_KEY, "com.sankuai.waimai.store.im.group.init.SGGroupSessionConfig", true);
                    e.a("com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService", IGoodDetailPlayerService.KEY, "com.sankuai.waimai.business.restaurant.goodsdetail.videoview.GoodDetailPlayerService", true);
                    e.a("com.sankuai.waimai.store.mach.IMachHttpNativeMethod", IMachHttpNativeMethod.DRUG_HTTP, "com.sankuai.waimai.store.drug.base.mach.DrugHttpJSNativeMethod", false);
                    e.a("com.sankuai.waimai.foundation.core.service.bizInfo.IBizInfoService", IBizInfoService.KEY, "com.sankuai.waimai.platform.utils.sharedpreference.BizInfoServiceImpl", true);
                    e.a("com.sankuai.waimai.foundation.core.service.globalcart.IGlobalCartManagerService", IGlobalCartManagerService.KEY, "com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager", true);
                    e.a("com.sankuai.waimai.foundation.core.service.user.IUserManagerService", IUserManagerService.KEY, "com.sankuai.waimai.platform.domain.manager.user.UserManagerServiceImpl", true);
                    e.a("com.sankuai.waimai.mach.ITagProcessor", MLivePlayerModule.REACT_CLASS, "com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerTagProcessor", false);
                    e.a("com.sankuai.waimai.mach.ITagProcessor", "wm-search-slide-cover", "com.sankuai.waimai.business.search.ui.result.mach.component.CommonSlideCoverProcessor", false);
                    e.a("com.sankuai.waimai.mach.ITagProcessor", "nestscroller", "com.sankuai.waimai.store.drug.search.mach.component.nestscroller.NestedScrollerTagProcessor", false);
                    e.a("com.sankuai.waimai.mach.ITagProcessor", "wm-search-gallery-card", "com.sankuai.waimai.business.search.ui.result.mach.component.gallery.GalleryCardTagProcessor", false);
                    e.a("com.sankuai.waimai.bussiness.order.detailnew.controller.orderpopup.IPushPopupWindowController", "push_popup_window_controller", "com.sankuai.waimai.bussiness.order.detailnew.controller.PushPopupWindowController", false);
                    e.a("com.sankuai.waimai.foundation.core.service.collect.ICollectPoiManagerService", ICollectPoiManagerService.KEY, "com.sankuai.waimai.platform.domain.manager.poi.collect.CollectPoiManager", false);
                    e.a("com.sankuai.waimai.business.knb.api.IKNBProvider", "wm_knb", "com.sankuai.waimai.business.knb.KNBProviderImpl", false);
                    e.a("com.sankuai.waimai.search.common.mach.provider.IMachProvider", "sg", "com.sankuai.waimai.store.search.isomorphism.StoreSearchIsomorphismProvider", true);
                    e.a("com.sankuai.waimai.search.common.mach.provider.IMachProvider", "wm", "com.sankuai.waimai.business.search.ui.result.mach.provider.WMMachProviderImpl", true);
                    e.a("com.sankuai.waimai.foundation.core.service.abtest.IABTestService", IABTestService.KEY, "com.sankuai.waimai.platform.capacity.abtest.ABTestManager", true);
                    e.a("com.sankuai.meituan.retrofit2.Interceptor", "interceptor_business", "com.sankuai.waimai.platform.capacity.network.interceptor.BusinessInterceptor", false);
                    e.a("com.sankuai.meituan.retrofit2.Interceptor", "interceptor_crawler", "com.sankuai.waimai.platform.capacity.network.interceptor.CrawlerInterceptor", false);
                    e.a("com.sankuai.waimai.platform.restaurant.membercoupon.IExchangeCouponDialogNew", "/showexchangecoupondialog_new", "com.sankuai.waimai.bussiness.order.confirm.coupon.controller.ExchangeCouponDialog", false);
                    e.a("com.sankuai.waimai.business.order.api.pay.IOrderPayResultManager", IOrderPayResultManager.KEY, "com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager", true);
                    e.a("com.sankuai.waimai.platform.net.main.IMainActivityLoadedPlatform", IMainActivityLoadedPlatform.MAIN_ACTIVITY_LOADED, "com.sankuai.waimai.business.page.home.preload.PreloadDataModel", true);
                    e.a("com.sankuai.waimai.store.mrn.shopcartbridge.DrugShopcartVesselService", DrugShopcartVesselService.KEY_NAME, "com.sankuai.waimai.drug.mrn.DrugShopcartVesselImpl", false);
                    e.a("com.sankuai.waimai.business.order.api.store.IDrugShopCartNotifyService", IDrugShopCartNotifyService.DRUG_SHOP_CART_NOTIFY_SERVICE, "com.sankuai.waimai.drug.DrugShopCartNotifyServiceImpl", false);
                    e.a("com.sankuai.waimai.business.restaurant.poicontainer.IRestaurantInit", "restaurant_init", "com.sankuai.waimai.business.restaurant.poicontainer.machpro.init.RestaurantInit", false);
                    e.a("com.sankuai.waimai.platform.net.diagnose.IDiagnoseProvider", "wm_network_diagnose", "com.sankuai.waimai.platform.net.networkdiagnose.DiagnoseProviderImpl", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "SystemCallCache", "com.sankuai.meituan.takeoutnew.util.aop.SystemCallCache", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "GlobalCartLifecycle", "com.sankuai.waimai.globalcart.GlobalCartLifecycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "NetMonitoredLifeCycle", "com.sankuai.waimai.platform.net.NetMonitoredLifeCycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "MainActivityLifeCycle", "com.sankuai.meituan.takeoutnew.ui.page.boot.MainActivityLifecycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "WeatherLifecycle", "com.sankuai.waimai.business.page.home.init.WeatherLifecycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "WelcomeSplashLifecycle", "com.sankuai.waimai.launcher.init.lifecycle.business.page.WelcomeSplashLifecycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "ExternalJumpLifeCycle", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.ExternalJumpLifeCycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "AILifecycle", "com.sankuai.waimai.ai.AILifecycle", false);
                    e.a("com.sankuai.waimai.foundation.core.lifecycle.Lifecycle", "AlitaLifeCycle", "com.sankuai.waimai.alita.AlitaLifeCycle", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "WMMMPInit", "com.sankuai.waimai.mmp.WMMMPInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "NetMonitorInit", "com.sankuai.waimai.platform.net.NetMonitorInit", true);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "BootAPICatMonitor", "com.sankuai.meituan.takeoutnew.util.aop.BootAPICatMonitor", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "OrderInit", "com.sankuai.waimai.bussiness.order.init.OrderInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "WmImInit", "com.sankuai.waimai.business.im.prepare.init.WmImInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "AIInit", "com.sankuai.waimai.launcher.init.secondary.AIInit", true);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "SearchInit", "com.sankuai.waimai.business.search.common.SearchInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "PersonalRecommendInit", "com.sankuai.waimai.platform.settings.init.PersonalRecommendInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "RestaurantInit", "com.sankuai.waimai.business.restaurant.base.RestaurantInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "PageInit", "com.sankuai.waimai.business.page.home.init.PageInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "ScreenShotInit", "com.sankuai.meituan.takeoutnew.app.init.ScreenShotInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "BubbleInit", "com.sankuai.waimai.business.page.home.init.BubbleInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "StoreInit", "com.sankuai.waimai.store.StoreInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "LoadAddressInit", "com.sankuai.waimai.launcher.init.secondary.business.address.LoadAddressInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "DrugInit", "com.sankuai.waimai.store.drug.init.DrugInit", false);
                    e.a("com.sankuai.waimai.foundation.core.init.AbsInit", "KNBInit", "com.sankuai.waimai.business.knb.KNBInit", false);
                    e.a("com.sankuai.waimai.business.order.api.store.IOrderBusinessService", IOrderBusinessService.KEY_STORE_BUSINESS, "com.sankuai.waimai.store.order.detail.OrderBusinessProxyImpl", false);
                    e.a("com.sankuai.waimai.imbase.knb.ISessionsInfo", ISessionsInfo.MED_B2C_IM, "com.sankuai.waimai.drug.im.b2c.MedWmMsgCenterAllSessionImpl", false);
                    e.a("com.sankuai.waimai.drug.vessel.DrugPrepareVesselService", DrugPrepareVesselService.KEY_NAME_IMLIGHT, "com.sankuai.waimai.drug.im.vessel.DrugIMLightChatPrepareVesselImpl", false);
                    e.a("com.sankuai.waimai.store.im.base.i.ISGIMChatPageDelegateCreator", "user_group", "com.sankuai.waimai.store.im.group.SGIMUserGroupChatPageDelegateCreator", false);
                    e.a("com.sankuai.waimai.platform.machpro.module.ICommonParameter", ICommonParameter.COMMON_PARAMETER_KEY, "com.sankuai.waimai.platform.machpro.utils.CommonParameter", true);
                    e.a("com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor", "v9/poi/food", "com.sankuai.waimai.store.goods.list.sniffer.SGRestaurantV9FoodLogMonitor", true);
                    e.a("com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor", "v8/poi/food", "com.sankuai.waimai.store.goods.list.sniffer.SGGoodListSnifferV8FoodLogMonitor", true);
                    e.a("com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor", "v7/poi/sputag/products", "com.sankuai.waimai.store.goods.list.sniffer.SGGoodListSnifferProductsLogMonitor", true);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_main_project", "com.sankuai.meituan.takeoutnew.net.WmGsonBuilder", false);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_user", "com.sankuai.waimai.business.user.UserGsonBuilder", false);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_order", "com.sankuai.waimai.bussiness.order.base.net.OrderGsonBuilder", false);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_rest", "com.sankuai.waimai.business.restaurant.base.net.RestGsonBuilder", false);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_home", "com.sankuai.waimai.business.page.home.utils.HomeGsonBuilder", false);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_platform", "com.sankuai.waimai.platform.capacity.network.gsonbuilder.PlatformGsonBuilder", false);
                    e.a("com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder", "wm_page", "com.sankuai.waimai.business.page.homepage.PageGsonBuilder", false);
                    e.a("com.sankuai.waimai.store.im.medical.doctor.SGIMUploadImageService", "1", "com.sankuai.waimai.store.mrn.IMUploadImageModule", false);
                    e.a("com.sankuai.waimai.business.im.IWmChannelInitService", "1", "com.sankuai.waimai.business.im.WmChannelWmInitServiceImpl", false);
                    e.a("com.sankuai.waimai.business.im.IWmChannelInitService", "2", "com.sankuai.waimai.store.im.poi.WmChannelSGInitServiceImpl", false);
                    e.a("com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod", "wm_mach_http", "com.sankuai.waimai.search.common.mach.nativemethod.WMMachNativeMethod", false);
                    e.a("com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod", "sg_mach_http", "com.sankuai.waimai.store.search.ui.result.mach.nativemethod.SGSearchMachHttpNativeMethod", false);
                    e.a("com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod", "search_mach_utils", "com.sankuai.waimai.business.search.ui.result.mach.bridge.SearchMachUtils", true);
                    e.a("com.sankuai.waimai.imbase.monitor.IMessageVerificationService", "1029", "com.sankuai.waimai.store.im.monitor.SGIMUserGroupMessageVerificationImpl", true);
                    e.a("com.sankuai.waimai.imbase.monitor.IMessageVerificationService", "1025", "com.sankuai.waimai.business.im.group.WmGroupMessageVerificationImpl", true);
                    e.a("com.sankuai.waimai.imbase.monitor.IMessageVerificationService", "1024", "com.sankuai.waimai.store.im.monitor.SGIMMedicalMessageVerificationImpl", true);
                    e.a("com.sankuai.waimai.imbase.monitor.IMessageVerificationService", ErrorCode.ERROR_CODE_OKHTTP_EXCEPTION, "com.sankuai.waimai.business.im.prepare.WmImMessageVerifiactionImpl", true);
                    e.a("com.sankuai.waimai.imbase.monitor.IMessageVerificationService", "1031", "com.sankuai.waimai.store.im.monitor.SGIMInquiryMessageVerificationImpl", true);
                    e.a("com.sankuai.waimai.store.i.poi.PoiDrugService", PoiDrugService.KEY_DRUG, "com.sankuai.waimai.store.drug.home.PoiDrugServiceImpl", false);
                    e.a("com.sankuai.waimai.search.common.mach.component.IBuildMachTagProcessor", "wm-search-slide-cover", "com.sankuai.waimai.business.search.ui.result.mach.component.SlideCoverComponentService", false);
                    e.a("com.sankuai.waimai.search.common.mach.component.IBuildMachTagProcessor", "wm-search-gallery-card", "com.sankuai.waimai.business.search.ui.result.mach.component.gallery.GalleryCardComponentService", false);
                    e.a("com.sankuai.waimai.store.im.entrance.drug.search.IJumpDrugImService", "search", "com.sankuai.waimai.store.im.entrance.drug.search.SchemeJumpDrugIMContractImpl", false);
                    e.a("com.sankuai.waimai.platform.domain.manager.ugc.IWMLivePreloadManager", IWMLivePreloadManager.LIVE_PRELOAD_SERVICE_KEY, "com.sankuai.waimai.business.ugc.live.WMLivePreloadManager", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_8490fcab209f585c2e0bf32d714bb0bd", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_8490fcab209f585c2e0bf32d714bb0bd", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_d0ce61e28e2e40150eb2910905de73ac", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_d0ce61e28e2e40150eb2910905de73ac", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_9db3001fb1330cb3ee77452efc335a0e", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_9db3001fb1330cb3ee77452efc335a0e", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_585d3bb03f06d22f528159131ce7e992", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_585d3bb03f06d22f528159131ce7e992", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_f3cdf72945e96c77a825a1e4ede2f201", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_f3cdf72945e96c77a825a1e4ede2f201", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_708538a8f9fdafa7548699fb03e4fd4", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_708538a8f9fdafa7548699fb03e4fd4", false);
                    e.a("com.meituan.android.cube.pga.dynamic.IDynamicInit", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_7bc60dd32a58ede866686156edded8cb", "com.meituan.android.cube.pga.dynamic.generated.DynamicInit_7bc60dd32a58ede866686156edded8cb", false);
                    e.a("com.sankuai.waimai.router.method.Func7", "/scpoiexchangecouponhelperbridge", "com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.SCPoiExchangeCouponBridge", false);
                    e.a("com.sankuai.waimai.platform.config.ILoadConfig", "PageLoadConfig", "com.sankuai.waimai.business.page.common.config.PageLoadConfig", false);
                    e.a("com.sankuai.waimai.platform.config.ILoadConfig", "OrderLoadConfig", "com.sankuai.waimai.bussiness.order.base.config.OrderLoadConfig", false);
                    e.a("com.sankuai.waimai.platform.config.ILoadConfig", "SearchLoadConfig", "com.sankuai.waimai.business.search.global.filterbar.SearchLoadConfig", false);
                    e.a("com.sankuai.waimai.platform.config.ILoadConfig", "RestaurantLoadConfig", "com.sankuai.waimai.business.restaurant.base.config.RestaurantLoadConfig", false);
                    e.a("com.sankuai.waimai.router.method.Func4", "drug_call_rx_inquiry_request", "com.sankuai.waimai.store.drug.order.OrderRXInquiryRequestProxy", true);
                    e.a("com.sankuai.waimai.platform.utils.Mode3CheckPermissionI", Mode3CheckPermissionI.KEY, "com.sankuai.waimai.business.page.common.bridge.Mode3CheckPermissionImpl", true);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/0", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/4001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/3", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/2", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/551", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/1001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/7", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/302", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/302", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/551", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/0", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/2", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/3", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/5", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/301", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/4001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/2003", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/2002", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/2020", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/301", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/103", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/301", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/102", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/401", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/104", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/302", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/101", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/5", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/107", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1050/1001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/2001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/1001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/401", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/5", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/0", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/2", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1025/3", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/1001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/2001", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/125", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/5", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/127", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/302", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/126", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/0", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/129", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/2", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1001/128", "com.sankuai.waimai.store.im.poi.SGIMGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/301", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.business.im.api.IGeneralMsgDigest", "1036/3", "com.sankuai.waimai.business.im.common.message.WmGeneralMsgDigest", false);
                    e.a("com.sankuai.waimai.platform.domain.manager.home.AgainstCheatingProvider", "wm_page", "com.sankuai.waimai.business.page.home.againstcheating.AgainstCheatingProviderImpl", false);
                    e.a("com.sankuai.waimai.router.method.Func0", "mtguard_lazy_init", "com.sankuai.meituan.takeoutnew.util.aop.MTGuardLazyInit", false);
                    e.a("com.sankuai.waimai.router.method.Func0", "clear_main_splash_cover", "com.sankuai.waimai.business.page.homepage.CurrentHomepageHolder", true);
                    e.a("com.sankuai.waimai.router.method.Func2", "kingkong_sa_entrance_block_init", "com.sankuai.waimai.business.page.home.assist.KingKongSABlockInit", false);
                    e.a("com.sankuai.waimai.business.page.homepage.HomePageProvider", "wm_main", "com.sankuai.meituan.takeoutnew.ui.page.main.MainPageProvider", false);
                    e.a("com.sankuai.waimai.router.method.Func1", "wm_startup_from_welcome", "com.sankuai.waimai.launcher.model.AppInfo", false);
                    e.a("com.sankuai.waimai.router.method.Func1", "/page/resource_controller_get_show_drawable", "com.sankuai.waimai.business.page.home.helper.ResourceHelper", false);
                    e.a("com.sankuai.waimai.business.order.api.orderlist.IOrderListProvider", "wm_order", "com.sankuai.waimai.bussiness.order.list.OrderListProviderImpl", true);
                    e.a("com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler", "WMScheme", "com.sankuai.meituan.takeoutnew.scan.common.WMSchemeHandler", false);
                    e.a("com.sankuai.meituan.takeoutnew.scan.handler.ScanResultHandler", "http", "com.sankuai.meituan.takeoutnew.scan.common.HttpSchemeHandler", false);
                    e.a("com.sankuai.waimai.store.shopping.cart.ShopCartBaseBlockFactory", ShopCartBaseBlockFactory.DRUG_SHOP_CART_KEY, "com.sankuai.waimai.drug.ShopCartBaseBlockFactoryImpl", true);
                    e.a("com.sankuai.waimai.platform.restaurant.membercoupon.IMagicCouponDialog", "/showMagicCouponDialog", "com.sankuai.waimai.business.restaurant.poicontainer.magiccoupon.MagicCouponDialog", false);
                    e.a("com.sankuai.waimai.store.manager.judas.JudasMonitorService", JudasMonitorService.KEY, "com.sankuai.waimai.store.drug.monitor.poiid.DrugJudasMonitor", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.store.im.SGIMBadCommentInitService", "com.sankuai.waimai.store.im.SGIMBadCommentInitService", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.business.im.group.init.WmImGroupInitService", "com.sankuai.waimai.business.im.group.init.WmImGroupInitService", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.store.im.SGIMInquirySDKInitService", "com.sankuai.waimai.store.im.SGIMInquirySDKInitService", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.meituan.android.ptcommonim.wminit.PTIMInitWM", "com.meituan.android.ptcommonim.wminit.PTIMInitWM", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.meituan.android.legwork.LegworkIMSdkInitImple", "com.meituan.android.legwork.LegworkIMSdkInitImple", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", ISessionsInfo.MED_B2C_IM, "com.sankuai.waimai.drug.im.b2c.MedB2CImSdkinitImpl", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.business.im.prepare.WMImSdkInitService", "com.sankuai.waimai.business.im.prepare.WMImSdkInitService", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.business.im.group.init.WmImUserGroupInitService", "com.sankuai.waimai.business.im.group.init.WmImUserGroupInitService", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.store.im.SGIMUserGroupSDKInitService", "com.sankuai.waimai.store.im.SGIMUserGroupSDKInitService", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.store.im.SGIMSdkInitImpl", "com.sankuai.waimai.store.im.SGIMSdkInitImpl", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.drug.im.imlight.MedicineIMLightSDKInitImpl", "com.sankuai.waimai.drug.im.imlight.MedicineIMLightSDKInitImpl", false);
                    e.a("com.sankuai.waimai.imbase.init.IMSdkInitService", "com.sankuai.waimai.business.im.group.init.WmImFoodSafetyInitService", "com.sankuai.waimai.business.im.group.init.WmImFoodSafetyInitService", false);
                    e.a("com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider", IContentFeedListProvider.CONTENT_PICK_ME_KEY, "com.sankuai.waimai.business.ugc.pickme.ContentPageProviderImpl", true);
                    e.a("com.sankuai.waimai.platform.domain.manager.ugc.IContentFeedListProvider", IContentFeedListProvider.CONTENT_ROUTER_KEY, "com.sankuai.waimai.business.page.home.list.feed.ContentFeedListProviderImpl", true);
                    e.a("com.sankuai.waimai.business.order.api.submit.ISubmitOrderManager", "IOrderSubmitService", "com.sankuai.waimai.business.order.submit.SubmitOrderManager", true);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", "sc_store_search", "com.sankuai.waimai.store.search.service.NoxMtGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", "wm_im", "com.sankuai.waimai.business.im.api.WMIMMTGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", "wm_user", "com.sankuai.waimai.business.user.UserMtGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", "wm_order", "com.sankuai.waimai.bussiness.order.base.provider.OrderMtGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", DefaultHeaderService.KEY_STORE, "com.sankuai.waimai.store.base.net.sg.StoreGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", "wm_page", "com.sankuai.waimai.business.page.common.provider.PageMtGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.MtGuardAndEncryptProvider", DefaultHeaderService.KEY_DRUG, "com.sankuai.waimai.store.drug.base.net.DrugMtGuardAndEncryptProvider", false);
                    e.a("com.sankuai.waimai.foundation.core.service.poi.IPoiManagerService", IPoiManagerService.KEY, "com.sankuai.waimai.platform.domain.manager.poi.PoiManagerServiceImpl", true);
                    e.a("com.sankuai.waimai.router.regex.IRegexAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterRegex_33ec9a679ba145f4cde6c2b14a766c3", "com.sankuai.waimai.router.generated.UriRouter_RouterRegex_33ec9a679ba145f4cde6c2b14a766c3", false);
                    e.a("com.sankuai.waimai.router.regex.IRegexAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterRegex_a73f7ee6692d528b681d624fe617456", "com.sankuai.waimai.router.generated.UriRouter_RouterRegex_a73f7ee6692d528b681d624fe617456", false);
                    e.a("com.sankuai.waimai.platform.provider.AccountEventProvider", "legwork", "com.meituan.android.legwork.LegworkAccountEventProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.AccountEventProvider", "wm_search_account_provider", "com.sankuai.waimai.business.search.routerservice.SearchAccountEventProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.AccountEventProvider", "wm_ugc_account_event_provider", "com.sankuai.waimai.business.ugc.routerservice.WMUGCAccountEventProvider", false);
                    e.a("com.sankuai.waimai.platform.provider.AccountEventProvider", "wm_im_account_provider", "com.sankuai.waimai.business.im.IMAccountEventProvider", false);
                    e.a("com.sankuai.waimai.platform.machpro.container.IMPActivityDelegate", "WMMachProActivityDelegate", "com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate", false);
                    e.a("com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService", DefaultHeaderService.KEY_STORE, "com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderImpl", false);
                    e.a("com.sankuai.waimai.foundation.core.service.order.IOrderSubmitService", "IOrderSubmitService", "com.sankuai.waimai.business.order.submit.SubmitOrderManager", true);
                    e.a("com.sankuai.waimai.mach.js.JSInvokeNativeMethod", "liveplayer", "com.sankuai.waimai.business.ugc.mach.live.MachLivePlayerNativeMethod", false);
                    e.a("com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider", ISearchTemplateProvider.ROUTER_SERVICE_KEY_STORE_SEARCH, "com.sankuai.waimai.store.search.StoreSearchTemplateProvider", false);
                    e.a("com.sankuai.waimai.store.search.ui.result.ISearchTemplateProvider", ISearchTemplateProvider.ROUTER_SERVICE_KEY_DRUG_SEARCH, "com.sankuai.waimai.store.drug.search.DrugSearchTemplateProvider", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_3f57832ff5c0cbe200c9b32406c45619", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_3f57832ff5c0cbe200c9b32406c45619", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_c2575bf4125c48180b149dd52c80f839", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_c2575bf4125c48180b149dd52c80f839", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_b5733d0194399271725699b6f6f98481", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_b5733d0194399271725699b6f6f98481", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_982747dc688e21f4a4335b8fd682f344", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_982747dc688e21f4a4335b8fd682f344", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_1de90016423f7355c93f94eaf4c38624", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_1de90016423f7355c93f94eaf4c38624", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_e17e433b6d12bd1b698be82976ca3720", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_e17e433b6d12bd1b698be82976ca3720", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_8e2b98145d33dd2e0ee023bd1b7c0dc9", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_8e2b98145d33dd2e0ee023bd1b7c0dc9", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_73683689400daa450bd26ff4af85599b", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_73683689400daa450bd26ff4af85599b", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_3cff37c5b98f7597778a85483e6396e3", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_3cff37c5b98f7597778a85483e6396e3", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_9b0b72e0f6ac9d37c6e7c38cff13d5d8", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_9b0b72e0f6ac9d37c6e7c38cff13d5d8", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_330d531674493ce6932ab698c94966c5", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_330d531674493ce6932ab698c94966c5", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_a212a282d75a14c433c25f5da65717a2", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_a212a282d75a14c433c25f5da65717a2", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_4e7fa537e4bf58dcf2530671eec15e7a", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_4e7fa537e4bf58dcf2530671eec15e7a", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_a34b23316f0db012320a20769007047b", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_a34b23316f0db012320a20769007047b", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_7161ac31f0398db85218efda652989b", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_7161ac31f0398db85218efda652989b", false);
                    e.a("com.sankuai.waimai.router.common.IPageAnnotationInit", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_181e8d2c135b95f2003d3b85338ddfe6", "com.sankuai.waimai.router.generated.UriRouter_RouterPage_181e8d2c135b95f2003d3b85338ddfe6", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.business.restaurant.rn.schemereplace.PoiAddressMapSchemeRule", "com.sankuai.waimai.business.restaurant.rn.schemereplace.PoiAddressMapSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.store.newuser.outlink.SGNewUserLandSchemeRule", "com.sankuai.waimai.store.newuser.outlink.SGNewUserLandSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.MyCouponSchemeRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.MyCouponSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.business.address.msi.LocateUriReplaceRule", "com.sankuai.waimai.business.address.msi.LocateUriReplaceRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.WMMMPSchemeRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.WMMMPSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.business.restaurant.rn.schemereplace.ProductSetSchemeRule", "com.sankuai.waimai.business.restaurant.rn.schemereplace.ProductSetSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.MineAddressListSchemeRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.MineAddressListSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.business.page.common.mrn.SelfDeliverySchemeRule", "com.sankuai.waimai.business.page.common.mrn.SelfDeliverySchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.UselessPoiCouponSchemeRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.UselessPoiCouponSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.UselessCouponSchemeRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.UselessCouponSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.business.page.common.mrn.TodayRecommendSchemeRule", "com.sankuai.waimai.business.page.common.mrn.TodayRecommendSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.OrderConfirmSelectCouponSchemeRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.OrderConfirmSelectCouponSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.MyPoiCouponSchemeRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.MyPoiCouponSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.OrderConfirmSelectRedPakageSchemeRule", "com.sankuai.waimai.bussiness.order.confirm.coupon.rn.OrderConfirmSelectRedPakageSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.business.address.rn.ModifyAddressSchemeRule", "com.sankuai.waimai.business.address.rn.ModifyAddressSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.FoodSecuritySchemeRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.FoodSecuritySchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.waimai.bussiness.order.base.mrn.OrderSearchSchemeRule", "com.sankuai.waimai.bussiness.order.base.mrn.OrderSearchSchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.AllCategorySchemeRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.AllCategorySchemeRule", false);
                    e.a("com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.GlobalCartSchemeRule", "com.sankuai.meituan.takeoutnew.provider.scheme.interceptor.GlobalCartSchemeRule", false);
                    e.a("com.sankuai.waimai.business.im.api.msgcenter.IMsgCenterManager", "IMsgCenterManager", "com.sankuai.waimai.business.im.msgcenter.MsgCenterManagerImpl", true);
                    e.a("com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider", "wm_restaurant", "com.sankuai.waimai.business.restaurant.ShopDevelopEnvironment", false);
                    e.a("com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider", "sc_store", "com.sankuai.waimai.store.config.dev.StoreNodeManager", false);
                    e.a("com.sankuai.waimai.platform.config.serviceloader.BusinessNodeProvider", "wm_page", "com.sankuai.waimai.business.page.common.config.NodeManagerImpl", false);
                    e.a("com.sankuai.waimai.foundation.core.service.order.IAgainOrderService", IAgainOrderService.KEY, "com.sankuai.waimai.business.order.api.again.AgainManager", true);
                    e.a("com.sankuai.waimai.platform.domain.manager.order.ISubmitOrderManagerPlatform", "IOrderSubmitService", "com.sankuai.waimai.business.order.submit.SubmitOrderManager", true);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "version_update", "com.sankuai.waimai.popup.WMUpdatePopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "guide_pop_high", "com.sankuai.waimai.guidepop.hign.WMGuidePopHighPopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "ugc_feed_guide", "com.sankuai.waimai.popup.ugc.WMUGCFeedGuidePopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "privacy_alert", "com.sankuai.waimai.popup.WMPrivacyPopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "share_password", "com.sankuai.waimai.popup.WMSharePasswordPopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "launch_screen", "com.sankuai.waimai.popup.WMStartUpPopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "zim_intelligent_gpt_guide", "com.sankuai.waimai.popup.intelligent.IntelligentGuidePopup", false);
                    e.a("com.sankuai.waimai.platform.popup.WMBasePopup", "heaven_fall", "com.sankuai.waimai.popup.WMSkyFallPopup", false);
                    e.a("com.sankuai.waimai.store.monitor.ApiMonitorProxy", "drug_api_monitor_service", "com.sankuai.waimai.store.drug.monitor.poiid.DrugApiMonitor", false);
                    e.a("com.sankuai.waimai.foundation.location.v2.ILocationCacheStrategy", "LocationCacheStrategyProvider", "com.sankuai.waimai.business.page.common.abtest.LocationCacheStrategyProvider", false);
                    e.a("com.sankuai.waimai.business.knb.api.IVIPCardFragmentDelegate", "wm_knb_vip_card", "com.sankuai.waimai.business.knb.VIPCardFragmentDelegateImpl", false);
                }
                com.sankuai.waimai.router.core.d.a("[ServiceLoader] init class invoked", new Object[0]);
            } catch (Exception e) {
                com.sankuai.waimai.router.core.d.b(e);
            } catch (NoClassDefFoundError unused) {
                com.sankuai.waimai.router.core.d.b("[ServiceLoader] init class not found", new Object[0]);
            }
        }
    };
    private ConcurrentHashMap<String, d> d;
    private final String e;

    public static void a(String str, String str2, String str3, boolean z) {
        Object[] objArr = {str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee5c64401408e0dbbc8f72f787683232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee5c64401408e0dbbc8f72f787683232");
            return;
        }
        e eVar = b.get(str);
        if (eVar == null) {
            eVar = new e(str);
            b.put(str, eVar);
        }
        Object[] objArr2 = {str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "16e94ef468d1eb2fcc485b52acb9562f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "16e94ef468d1eb2fcc485b52acb9562f");
        } else if (str2 == null || str3 == null) {
        } else {
            eVar.d.put(str2, new d(str2, str3, z));
        }
    }

    public static <T> e<T> a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2fbc66baed52ca743b223fa5572516a", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2fbc66baed52ca743b223fa5572516a");
        }
        c.b();
        if (cls == null) {
            com.sankuai.waimai.router.core.d.b(new NullPointerException("ServiceLoader.load的class参数不应为空"));
            return a.c;
        }
        String name = cls.getName();
        e eVar = b.get(name);
        if (eVar == null) {
            synchronized (b) {
                eVar = b.get(name);
                if (eVar == null) {
                    eVar = new e<>(name);
                    eVar.b();
                    b.put(name, eVar);
                }
            }
        }
        return eVar;
    }

    private e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58eb26973a67afe7300fb32b3f315d86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58eb26973a67afe7300fb32b3f315d86");
            return;
        }
        this.d = new ConcurrentHashMap<>();
        if (str == null) {
            this.e = "";
        } else {
            this.e = str;
        }
    }

    public final <T extends I> T a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66728c1d69cdd3f604c8118307743723", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66728c1d69cdd3f604c8118307743723") : (T) a(this.d.get(str), (c) null);
    }

    public final <T extends I> T a(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef50045fa947f8d994da0d7627db9d65", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef50045fa947f8d994da0d7627db9d65") : (T) a(this.d.get(str), new com.sankuai.waimai.router.service.a(context));
    }

    @NonNull
    public <T extends I> List<T> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74afc28a4444d847559d4bdcbc1fe3b1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74afc28a4444d847559d4bdcbc1fe3b1") : a((c) null);
    }

    @NonNull
    public <T extends I> List<T> a(c cVar) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "296aeeffcd3398ab764b66d499629004", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "296aeeffcd3398ab764b66d499629004");
        }
        Collection<d> values = this.d.values();
        if (values.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(values.size());
        for (d dVar : values) {
            Object a2 = a(dVar, (c) null);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058 A[Catch: all -> 0x0043, IOException -> 0x0048, TRY_LEAVE, TryCatch #4 {IOException -> 0x0048, blocks: (B:10:0x0025, B:24:0x0058, B:18:0x004c, B:20:0x0051), top: B:112:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5 A[Catch: all -> 0x01cc, IOException -> 0x01cf, TryCatch #8 {IOException -> 0x01cf, all -> 0x01cc, blocks: (B:25:0x0062, B:27:0x0068, B:29:0x0080, B:64:0x0122, B:66:0x014d, B:83:0x01bb, B:69:0x015b, B:71:0x0183, B:80:0x01a2, B:74:0x0196, B:30:0x0088, B:33:0x0091, B:35:0x0099, B:36:0x009d, B:39:0x00a8, B:42:0x00b2, B:44:0x00b5, B:51:0x00df, B:53:0x00e5, B:55:0x0100, B:62:0x011a, B:56:0x010d, B:45:0x00be, B:47:0x00cd), top: B:119:0x0062 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.router.service.e.b():void");
    }

    @Nullable
    private <T extends I> T a(@Nullable d dVar, @Nullable c cVar) {
        Object[] objArr = {dVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def6a4d5a81a06e7ded62cfd259b3574", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def6a4d5a81a06e7ded62cfd259b3574");
        }
        if (dVar == null) {
            return null;
        }
        Class a2 = com.sankuai.waimai.router.utils.b.a(dVar);
        if (dVar.e) {
            try {
                return (T) g.a(a2, cVar);
            } catch (Exception e) {
                com.sankuai.waimai.router.core.d.b(e);
            }
        } else {
            if (cVar == null) {
                try {
                    cVar = h.a();
                } catch (Exception e2) {
                    com.sankuai.waimai.router.core.d.b(e2);
                }
            }
            T t = (T) cVar.a(a2);
            com.sankuai.waimai.router.core.d.a("[ServiceLoader] create instance: %s, result = %s", a2, t);
            return t;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends e {
        public static ChangeQuickRedirect b;
        public static final e c = new a();

        public a() {
            super();
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c3798d3f0ee57aa90ae746822c472b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c3798d3f0ee57aa90ae746822c472b");
            }
        }

        @Override // com.sankuai.waimai.router.service.e
        @NonNull
        public final List a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab5f32acfc2e999dfd007132839d2a77", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab5f32acfc2e999dfd007132839d2a77") : Collections.emptyList();
        }

        @Override // com.sankuai.waimai.router.service.e
        @NonNull
        public final List a(c cVar) {
            Object[] objArr = {null};
            ChangeQuickRedirect changeQuickRedirect = b;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a32004b73d359b8ce0ad9e1168c45639", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a32004b73d359b8ce0ad9e1168c45639") : Collections.emptyList();
        }
    }
}
