package com.sankuai.waimai.store.drug.mrn.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.config.IMRNConfigProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.drug.mrn.DrugMRNShopCartModule;
import com.sankuai.waimai.drug.mrn.DrugMRNShopCartView;
import com.sankuai.waimai.drug.mrn.DrugShoppingCartModule;
import com.sankuai.waimai.store.drug.coupons.DrugMRNRedPacketViewManager;
import com.sankuai.waimai.store.drug.mrn.DrugMRNHHModule;
import com.sankuai.waimai.store.drug.mrn.PrescriptionMedicineModule;
import com.sankuai.waimai.store.drug.mrn.module.MEDMRNImageModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMRNCommonConfigProvider extends IMRNConfigProvider {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public String getBizName() {
        return "supermarket";
    }

    public static /* synthetic */ List a(DrugMRNCommonConfigProvider drugMRNCommonConfigProvider, ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, drugMRNCommonConfigProvider, changeQuickRedirect, false, "cdc44686f36b15c5ad6bc8128d972243", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, drugMRNCommonConfigProvider, changeQuickRedirect, false, "cdc44686f36b15c5ad6bc8128d972243") : Arrays.asList(new DrugMRNHHModule(reactApplicationContext), new PrescriptionMedicineModule(reactApplicationContext), new MEDMRNImageModule(reactApplicationContext), new DrugMRNCouponsDataModule(reactApplicationContext), new DrugMRNShopCartModule(reactApplicationContext), new DrugShoppingCartModule(reactApplicationContext), new DrugMRNADChargeReporter(reactApplicationContext), new MEDMRNUtils(reactApplicationContext));
    }

    @Override // com.meituan.android.mrn.config.IMRNConfigProvider
    public List<i> getBusinessReactPackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1a5fa47d28b5da98c5149a7b899432", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1a5fa47d28b5da98c5149a7b899432");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i() { // from class: com.sankuai.waimai.store.drug.mrn.bridge.DrugMRNCommonConfigProvider.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90eff5050c83be973c4f5cf6901e9881", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90eff5050c83be973c4f5cf6901e9881");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(DrugMRNCommonConfigProvider.a(DrugMRNCommonConfigProvider.this, reactApplicationContext));
                return arrayList2;
            }

            @Override // com.facebook.react.i
            public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d54a3b4217044f83adfc67a147fdfa1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d54a3b4217044f83adfc67a147fdfa1") : Arrays.asList(new DrugMRNRedPacketViewManager(reactApplicationContext), new DrugMRNShopCartView());
            }
        });
        return arrayList;
    }
}
