package com.sankuai.waimai.reactnative;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.component.map.c;
import com.meituan.android.mrn.component.map.d;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.modules.CATMetricService;
import com.sankuai.waimai.reactnative.modules.PreloadManagerModule;
import com.sankuai.waimai.reactnative.modules.ScrollViewScrollModule;
import com.sankuai.waimai.reactnative.modules.WMAddrSdkModule;
import com.sankuai.waimai.reactnative.modules.WMCrashMockModule;
import com.sankuai.waimai.reactnative.modules.WMGroupChatModule;
import com.sankuai.waimai.reactnative.modules.WMMRNADChargeReporter;
import com.sankuai.waimai.reactnative.modules.WMMRNNetworkModule;
import com.sankuai.waimai.reactnative.modules.WMMRNShareManager;
import com.sankuai.waimai.reactnative.modules.WMNetMonitorModule;
import com.sankuai.waimai.reactnative.modules.WMPlatformBaseTool;
import com.sankuai.waimai.reactnative.modules.WMPoiIDMixUpHelperModule;
import com.sankuai.waimai.reactnative.modules.WMRNAbTestModule;
import com.sankuai.waimai.reactnative.modules.WMRNCommonParameterModule;
import com.sankuai.waimai.reactnative.modules.WMRNCustomeRecommendModule;
import com.sankuai.waimai.reactnative.modules.WMRNDynamicTagModule;
import com.sankuai.waimai.reactnative.modules.WMRNIDGenerator;
import com.sankuai.waimai.reactnative.modules.WMRNLocationManager;
import com.sankuai.waimai.reactnative.modules.WMRNLogger;
import com.sankuai.waimai.reactnative.modules.WMRNMTPayJumpModule;
import com.sankuai.waimai.reactnative.modules.WMRNNetworkDiagnosisModule;
import com.sankuai.waimai.reactnative.modules.WMRNPOIModule;
import com.sankuai.waimai.reactnative.modules.WMRNPackageListManager;
import com.sankuai.waimai.reactnative.modules.WMRNRouterJumpModule;
import com.sankuai.waimai.reactnative.modules.WMScreenShotModule;
import com.sankuai.waimai.reactnative.modules.WMSharePreferenceModule;
import com.sankuai.waimai.reactnative.modules.WmChooseMediaModule;
import com.sankuai.waimai.reactnative.modules.WmSaveToAlbumModule;
import com.sankuai.waimai.reactnative.modules.WmUploadFileModule;
import com.sankuai.waimai.reactnative.networkdiagnose.WMNetworkDiagnoseModule;
import com.sankuai.waimai.reactnative.pullrefresh.WMPullRefreshManager;
import com.sankuai.waimai.reactnative.tag.WMRNDynamicTagViewManager;
import com.sankuai.waimai.reactnative.utils.EnvInfo;
import com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNCommonConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return "waimai";
    }

    public static /* synthetic */ List a(WMRNCommonConfigProvider wMRNCommonConfigProvider, ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, wMRNCommonConfigProvider, changeQuickRedirect, false, "f5cc78dfc858b813557a0b37903e1b64", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, wMRNCommonConfigProvider, changeQuickRedirect, false, "f5cc78dfc858b813557a0b37903e1b64") : Arrays.asList(new EnvInfo(reactApplicationContext), new CATMetricService(reactApplicationContext), new WMMRNNetworkModule(reactApplicationContext), new WMSharePreferenceModule(reactApplicationContext), new WMPoiIDMixUpHelperModule(reactApplicationContext), new WMRNPOIModule(reactApplicationContext), new WMMRNADChargeReporter(reactApplicationContext), new WMRNAbTestModule(reactApplicationContext), new WMRNIDGenerator(reactApplicationContext), new WMRNMTPayJumpModule(reactApplicationContext), new WMAddrSdkModule(reactApplicationContext), new WMRNPackageListManager(reactApplicationContext), new WMRNLocationManager(reactApplicationContext), new WMRNCommonParameterModule(reactApplicationContext), new WMMRNShareManager(reactApplicationContext), new WMRNRouterJumpModule(reactApplicationContext), new WMRNDynamicTagModule(reactApplicationContext), new WMRNNetworkDiagnosisModule(reactApplicationContext), new WMPlatformBaseTool(reactApplicationContext), new WMRNLogger(reactApplicationContext), new ScrollViewScrollModule(reactApplicationContext), new WmChooseMediaModule(reactApplicationContext), new WmUploadFileModule(reactApplicationContext), new WmSaveToAlbumModule(reactApplicationContext), new WMGroupChatModule(reactApplicationContext), new WMNetMonitorModule(reactApplicationContext), new PreloadManagerModule(reactApplicationContext), new WMScreenShotModule(reactApplicationContext));
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getBusinessReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "795ba4f76e2b0d11a477f5b1bd9ede5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "795ba4f76e2b0d11a477f5b1bd9ede5b");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.reactnative.WMRNCommonConfigProvider.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2704e283ccfa92ce8303186c0f6976d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2704e283ccfa92ce8303186c0f6976d");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(WMRNCommonConfigProvider.a(WMRNCommonConfigProvider.this, reactApplicationContext));
                Object[] objArr3 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                arrayList2.addAll(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e6bb2b8b60f16456b0b9e5fafa7cb79c", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e6bb2b8b60f16456b0b9e5fafa7cb79c") : Arrays.asList(new WMNetworkDiagnoseModule(reactApplicationContext), new WMCrashMockModule(reactApplicationContext), new WMRNCustomeRecommendModule(reactApplicationContext)));
                return arrayList2;
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb0852cd26d42e3ae0f90934d40272ea", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb0852cd26d42e3ae0f90934d40272ea") : Arrays.asList(new WMPullRefreshManager(), new RTXMRNVideoPlayViewManager("WMMRNVideoPlayView"), new WMRNDynamicTagViewManager());
            }
        });
        arrayList.add(new d((c) new com.sankuai.waimai.reactnative.maplocation.a()));
        arrayList.add(new com.sankuai.waimai.reactnative.lottie.b());
        return arrayList;
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getGlobalReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4cdb107a13befb2ca31003b57babffa", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4cdb107a13befb2ca31003b57babffa") : Arrays.asList(new com.reactnativecommunity.viewpager.d());
    }
}
