package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.reactnative.modules.CATMetricService;
import com.sankuai.waimai.reactnative.modules.WMAddrSdkModule;
import com.sankuai.waimai.reactnative.modules.WMMRNADChargeReporter;
import com.sankuai.waimai.reactnative.modules.WMMRNNetworkModule;
import com.sankuai.waimai.reactnative.modules.WMRNAbTestModule;
import com.sankuai.waimai.reactnative.modules.WMSharePreferenceModule;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.sankuai.waimai.reactnative.modules.WmUploadFileModule;
import com.sankuai.waimai.reactnative.pullrefresh.WMPullRefreshManager;
import com.sankuai.waimai.reactnative.tag.WMRNDynamicTagViewManager;
import com.sankuai.waimai.store.mrn.marketing.SGMarketingModule;
import com.sankuai.waimai.store.mrn.preload.SGMRNNetworkModule;
import com.sankuai.waimai.store.mrn.shopcartbridge.SGMRNShopCartBridge;
import com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartModule;
import com.sankuai.waimai.store.mrn.shopcartbridge.SMMRNShopCartView;
import com.sankuai.waimai.store.mrn.viewmanager.SGMRNGrayImageViewManager;
import com.sankuai.waimai.store.mrn.viewmanager.redpacket.SGMRNRedPacketViewManager;
import com.sankuai.waimai.store.mrn.viewmanager.textinput.SGOrderTextInputManager;
import com.sankuai.waimai.store.search.ui.mrn.SearchGuideNativeModule;
import com.sankuai.waimai.store.search.ui.mrn.SearchKeyboardNativeModule;
import com.sankuai.waimai.store.search.ui.mrn.SearchSuggestNativeModule;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import com.sankuai.waimai.store.util.v;
import com.sankuai.waimai.store.view.price.mrn.SCPriceViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNCommonConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return "supermarket";
    }

    public static /* synthetic */ List a(SGMRNCommonConfigProvider sGMRNCommonConfigProvider, final ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGMRNCommonConfigProvider, changeQuickRedirect, false, "262a512d91876e62ed7259cc93af3592", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, sGMRNCommonConfigProvider, changeQuickRedirect, false, "262a512d91876e62ed7259cc93af3592");
        }
        Object[] objArr2 = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, sGMRNCommonConfigProvider, changeQuickRedirect2, false, "3eaf76e7768a291186bbda6f52e44e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, sGMRNCommonConfigProvider, changeQuickRedirect2, false, "3eaf76e7768a291186bbda6f52e44e77");
        } else if (!v.b) {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.mrn.SGMRNCommonConfigProvider.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "10629dc33c6cf3ee40bbb56393613fa5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "10629dc33c6cf3ee40bbb56393613fa5");
                        return;
                    }
                    try {
                        if (reactApplicationContext != null && reactApplicationContext.getCurrentActivity() != null && !reactApplicationContext.getCurrentActivity().isFinishing()) {
                            reactApplicationContext.getCurrentActivity().getApplication();
                        } else {
                            ah.a(StoreException.MrnBridgeException, "wm initial fail in mrn module");
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                }
            });
        }
        return Arrays.asList(new SGShoppingCartModule(reactApplicationContext), new SGLocationModule(reactApplicationContext), new SGApiEnvModule(reactApplicationContext), new NewCustomerModule(reactApplicationContext), new SGMemberCardModule(reactApplicationContext), new SGRedirectModule(reactApplicationContext), new SGUtilsModule(reactApplicationContext), new SGMRNIMModule(reactApplicationContext), new SGMRNContainerStatistics(reactApplicationContext), new SGCalculatePriceModule(reactApplicationContext), new WMRNAbTestModule(reactApplicationContext), new SGMRNLogin(reactApplicationContext), new WMSharePreferenceModule(reactApplicationContext), new SMMRNShopCartModule(reactApplicationContext), new SGMRNShopCartBridge(reactApplicationContext), new CATMetricService(reactApplicationContext), new SGABTestModule(reactApplicationContext), new SGMRNNetworkModule(reactApplicationContext), new SGGroupbModule(reactApplicationContext), new SGConfigModule(reactApplicationContext), new SGMRNStatistics(reactApplicationContext), new SearchSuggestNativeModule(reactApplicationContext), new SearchGuideNativeModule(reactApplicationContext), new SearchKeyboardNativeModule(reactApplicationContext), new SGMarketingModule(reactApplicationContext), new SGMRNMachDialogModule(reactApplicationContext), new SGIMTTReceiveModule(reactApplicationContext), new SGIMDataMessageReceiveModule(reactApplicationContext), new SGShareCommentJumpModule(reactApplicationContext), new WMMRNNetworkModule(reactApplicationContext), new WmChooseMediaModule(reactApplicationContext), new WmUploadFileModule(reactApplicationContext), new SGFeedbackStrategyModule(reactApplicationContext), new SGMonitorUtilsModule(reactApplicationContext), new SGCouponDialogModule(reactApplicationContext), new SGIMLogcenterReportModule(reactApplicationContext), new WMAddrSdkModule(reactApplicationContext), new WMMRNADChargeReporter(reactApplicationContext), new SMMRNPrecisitionTesting(reactApplicationContext), new SMMRNCouponsDataModule(reactApplicationContext));
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getBusinessReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "009325584b0db28a528db056bef314da", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "009325584b0db28a528db056bef314da");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.store.mrn.SGMRNCommonConfigProvider.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99eb8522ef2735913411f5a1b3afc195", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99eb8522ef2735913411f5a1b3afc195");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(SGMRNCommonConfigProvider.a(SGMRNCommonConfigProvider.this, reactApplicationContext));
                return arrayList2;
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d1892be165742c30b777da45c9e565e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d1892be165742c30b777da45c9e565e") : Arrays.asList(new WMPullRefreshManager(), new SGMRNGrayImageViewManager(), new SMMRNShopCartView(), new WMRNDynamicTagViewManager(), new SGOrderTextInputManager(), new SGMRNRedPacketViewManager(reactApplicationContext), new SCPriceViewManager());
            }
        });
        arrayList.add(new com.sankuai.rn.component.lottie.c());
        arrayList.add(new com.sankuai.waimai.reactnative.lottie.b());
        arrayList.add(new com.dianping.live.live.mrn.c());
        return arrayList;
    }
}
