package com.sankuai.waimai.store.drug.coupons;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.restaurant.membercoupon.MemberCouponListOutput;
import com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.d;
import com.sankuai.waimai.platform.restaurant.membercoupon.f;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.util.am;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugMRNRedPacketViewManager extends SimpleViewManager<DrugCouponView> {
    private static final int COMMAND_CREATE = 1;
    private static final int COMMAND_REMOVE = 2;
    private static final int COUPON_TYPE_MEMBERS = 9;
    private static final String REACT_CLASS = "MEDMRNRedPacketView";
    public static ChangeQuickRedirect changeQuickRedirect;
    public ReactApplicationContext reactContext;
    private RNFloatCouponMemberFragment rnFloatCouponMemberFragment;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return REACT_CLASS;
    }

    public DrugMRNRedPacketViewManager(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee3234ad4e7486d5823ff221c881ac63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee3234ad4e7486d5823ff221c881ac63");
        } else {
            this.reactContext = reactApplicationContext;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public DrugCouponView createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed27799ed4a65d2bed0de62d3e0c8ae7", RobustBitConfig.DEFAULT_VALUE)) {
            return (DrugCouponView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed27799ed4a65d2bed0de62d3e0c8ae7");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        DrugCouponView drugCouponView = new DrugCouponView(aoVar);
        drugCouponView.setLayoutParams(layoutParams);
        return drugCouponView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7899e3d0c233674111a7280effce068", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7899e3d0c233674111a7280effce068") : c.a("create", 1, "remove", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull DrugCouponView drugCouponView, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {drugCouponView, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8b7303934dd20bf63793abda5c010f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8b7303934dd20bf63793abda5c010f3");
            return;
        }
        super.receiveCommand((DrugMRNRedPacketViewManager) drugCouponView, str, readableArray);
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1352294148) {
            if (hashCode == -934610812 && str.equals("remove")) {
                c = 1;
            }
        } else if (str.equals("create")) {
            c = 0;
        }
        switch (c) {
            case 0:
                if (readableArray != null) {
                    createFragment(drugCouponView, readableArray.getInt(0));
                    return;
                }
                return;
            case 1:
                removeFragment();
                return;
            default:
                return;
        }
    }

    private void removeFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c4da483bc25b65b949614ef29945f41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c4da483bc25b65b949614ef29945f41");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null || this.rnFloatCouponMemberFragment == null) {
            return;
        }
        ((CouponsBaseDialogFragment) ((FragmentActivity) currentActivity).getSupportFragmentManager().findFragmentByTag("drug_coupons")).getChildFragmentManager().beginTransaction().remove(this.rnFloatCouponMemberFragment).commitAllowingStateLoss();
        this.rnFloatCouponMemberFragment = null;
    }

    private void createFragment(FrameLayout frameLayout, int i) {
        Object[] objArr = {frameLayout, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecafb5fbd5dae3e0e573a2d8eb60eee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecafb5fbd5dae3e0e573a2d8eb60eee3");
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Object[] objArr2 = {currentActivity};
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar = null;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "781d6e23af71e9305608f85f888ded87", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "781d6e23af71e9305608f85f888ded87");
        } else {
            CouponsBaseDialogFragment couponsBaseDialogFragment = (CouponsBaseDialogFragment) ((SCBaseActivity) currentActivity).getSupportFragmentManager().findFragmentByTag("drug_coupons");
            if (couponsBaseDialogFragment != null) {
                aVar = couponsBaseDialogFragment.a();
            }
        }
        if (aVar == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poi_id", aVar.b.getLongPoiId());
        this.rnFloatCouponMemberFragment = new RNFloatCouponMemberFragment();
        this.rnFloatCouponMemberFragment.setArguments(bundle);
        d dVar = new d();
        dVar.a = aVar.g();
        dVar.b = aVar.h();
        dVar.c = getVolleyTAG();
        dVar.d = com.sankuai.waimai.store.manager.judas.b.a((Context) currentActivity);
        dVar.f = 1;
        dVar.e = 0;
        this.rnFloatCouponMemberFragment.a(dVar);
        this.rnFloatCouponMemberFragment.g = new RNFloatCouponMemberFragment.a() { // from class: com.sankuai.waimai.store.drug.coupons.DrugMRNRedPacketViewManager.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.a
            public final void a(String str) {
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "78e823eb92f57aaa2cd8b1f3657fd19b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "78e823eb92f57aaa2cd8b1f3657fd19b");
                    return;
                }
                Activity currentActivity2 = DrugMRNRedPacketViewManager.this.reactContext.getCurrentActivity();
                if (com.sankuai.waimai.store.util.b.a(currentActivity2)) {
                    return;
                }
                try {
                    am.a(b.a(currentActivity2, aVar.d()), str, currentActivity2);
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        };
        final CouponsBaseDialogFragment couponsBaseDialogFragment2 = (CouponsBaseDialogFragment) ((FragmentActivity) currentActivity).getSupportFragmentManager().findFragmentByTag("drug_coupons");
        try {
            this.rnFloatCouponMemberFragment.h = new f() { // from class: com.sankuai.waimai.store.drug.coupons.DrugMRNRedPacketViewManager.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                public final void a(@NonNull MemberCouponListOutput memberCouponListOutput) {
                }

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                public final void b(String str) {
                }

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                public final void h() {
                }

                @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
                public final void i() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "f7dd305b182926bc9007f9689eed55da", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "f7dd305b182926bc9007f9689eed55da");
                    } else if (couponsBaseDialogFragment2 != null) {
                        couponsBaseDialogFragment2.dismissAllowingStateLoss();
                    }
                }
            };
            couponsBaseDialogFragment2.getChildFragmentManager().beginTransaction().replace(i, this.rnFloatCouponMemberFragment, String.valueOf(i)).commitAllowingStateLoss();
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    public String getVolleyTAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0c976d2bdd98bbed8964a7b66364739", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0c976d2bdd98bbed8964a7b66364739");
        }
        if (this.reactContext != null && (this.reactContext.getCurrentActivity() instanceof SCBaseActivity)) {
            return ((SCBaseActivity) this.reactContext.getCurrentActivity()).w();
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }
}
