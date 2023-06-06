package com.sankuai.waimai.store.mrn.viewmanager.redpacket;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.platform.restaurant.membercoupon.MPFloatCouponMemberFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.MemberCouponListOutput;
import com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment;
import com.sankuai.waimai.platform.restaurant.membercoupon.d;
import com.sankuai.waimai.platform.restaurant.membercoupon.e;
import com.sankuai.waimai.platform.restaurant.membercoupon.f;
import com.sankuai.waimai.store.base.BaseMemberActivity;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.coupons.dialog.CouponView;
import com.sankuai.waimai.store.event.HeaderMemberCouponRefreshSuccessEvent;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.Map;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNRedPacketViewManager extends SimpleViewManager<CouponView> implements CouponView.a {
    private static final int COMMAND_CREATE = 1;
    private static final int COMMAND_REMOVE = 2;
    private static final int COUPON_TYPE_MEMBERS = 9;
    private static final String REACT_CLASS = "SMMRNRedPacketView";
    public static ChangeQuickRedirect changeQuickRedirect;
    private e floatMemberCouponBlock;
    private String mCID;
    private String mPoiID;
    private String mPoiIdStr;
    public ReactApplicationContext reactContext;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return REACT_CLASS;
    }

    public SGMRNRedPacketViewManager(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00637e0470e1276cc616629030c8643e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00637e0470e1276cc616629030c8643e");
        } else {
            this.reactContext = reactApplicationContext;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public CouponView createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5003dd17f6e1e4e1a47f8d70cb2b57b", RobustBitConfig.DEFAULT_VALUE)) {
            return (CouponView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5003dd17f6e1e4e1a47f8d70cb2b57b");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        CouponView couponView = new CouponView(aoVar);
        couponView.setLayoutParams(layoutParams);
        couponView.setOnAttachEvent(this);
        return couponView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f9b02991686d4a7c324f18add0a101d", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f9b02991686d4a7c324f18add0a101d") : c.a("create", 1, "remove", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public synchronized void receiveCommand(@NonNull CouponView couponView, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {couponView, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40992001214f77a2e9cd2c230a7e0c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40992001214f77a2e9cd2c230a7e0c4a");
        } else {
            super.receiveCommand((SGMRNRedPacketViewManager) couponView, str, readableArray);
        }
    }

    @ReactProp(name = "poiID")
    public void setPoiID(CouponView couponView, String str) {
        this.mPoiID = str;
    }

    @ReactProp(name = "poiIDStr")
    public void setPoiIdStr(CouponView couponView, String str) {
        this.mPoiIdStr = str;
    }

    @ReactProp(name = "cid")
    public void setCID(CouponView couponView, String str) {
        this.mCID = str;
    }

    @Override // com.sankuai.waimai.store.coupons.dialog.CouponView.a
    public void onAttach(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "712307fbe7a33c4a3f416c62fa0316ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "712307fbe7a33c4a3f416c62fa0316ec");
            return;
        }
        try {
            createFragment(i, this.mPoiID);
        } catch (Exception e) {
            removeFragment();
            com.meituan.crashreporter.c.a(e, 1, MetricsActivityLifecycleManager.currentActivity, true);
        }
    }

    @Override // com.sankuai.waimai.store.coupons.dialog.CouponView.a
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1232094339faa758317f10f16bbcc95c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1232094339faa758317f10f16bbcc95c");
        } else {
            removeFragment();
        }
    }

    private void removeFragment() {
        FragmentManager supportFragmentManager;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f65bd7de7a6c745035f9984801e1c2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f65bd7de7a6c745035f9984801e1c2b");
            return;
        }
        try {
            Activity currentActivity = this.reactContext.getCurrentActivity();
            if (currentActivity == null || this.floatMemberCouponBlock == null || (supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager()) == null) {
                return;
            }
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.sankuai.waimai.store.mrn.dialog.c.class.getSimpleName());
            if (findFragmentByTag == null) {
                findFragmentByTag = supportFragmentManager.findFragmentByTag("coupons");
            }
            if (findFragmentByTag == null) {
                return;
            }
            findFragmentByTag.getChildFragmentManager().beginTransaction().remove(this.floatMemberCouponBlock.b).commitNowAllowingStateLoss();
            this.floatMemberCouponBlock.a(null);
            this.floatMemberCouponBlock = null;
        } catch (Exception e) {
            com.meituan.crashreporter.c.a(e, 1, MetricsActivityLifecycleManager.currentActivity, true);
        }
    }

    private void createFragment(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d7c6f5fa2fbd15030c24e61749ee519", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d7c6f5fa2fbd15030c24e61749ee519");
            return;
        }
        final Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        long j = 0;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException e) {
            a.a(e);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poi_id", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, this.mPoiIdStr);
        Poi.PoiCouponItem poiCouponItem = com.sankuai.waimai.store.coupons.a.a().b;
        if (!isFromDetail(currentActivity) && poiCouponItem != null && poiCouponItem.couponShowType == 13) {
            bundle.putInt("coupon_type", 9);
        }
        this.floatMemberCouponBlock = new e();
        e eVar = this.floatMemberCouponBlock;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "d2dcd7e73eb64a12ffae18c2209eee50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "d2dcd7e73eb64a12ffae18c2209eee50");
        } else {
            eVar.b.setArguments(bundle);
            if (eVar.b instanceof MPFloatCouponMemberFragment) {
                bundle.putString("bundle_name", "mach_pro_waimai_restaurant_membership_float_layer_style_0");
            }
        }
        d dVar = new d();
        dVar.a = j;
        dVar.b = this.mPoiIdStr;
        dVar.c = getVolleyTAG();
        dVar.d = this.mCID == null ? b.a((Context) currentActivity) : this.mCID;
        dVar.f = 1;
        dVar.e = 0;
        e eVar2 = this.floatMemberCouponBlock;
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect4 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect4, false, "4853beb2ede8c6b8a01ad338fb201c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect4, false, "4853beb2ede8c6b8a01ad338fb201c74");
        } else if (eVar2.b instanceof RNFloatCouponMemberFragment) {
            ((RNFloatCouponMemberFragment) eVar2.b).a(dVar);
        } else if (eVar2.b instanceof MPFloatCouponMemberFragment) {
            ((MPFloatCouponMemberFragment) eVar2.b).l = dVar;
        }
        this.floatMemberCouponBlock.a(new f() { // from class: com.sankuai.waimai.store.mrn.viewmanager.redpacket.SGMRNRedPacketViewManager.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
            public final void a(@NonNull MemberCouponListOutput memberCouponListOutput) {
            }

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
            public final void b(String str2) {
            }

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
            public final void h() {
            }

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.f
            public final void i() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "ab0adcd303764d8ec6ce36223fed25ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "ab0adcd303764d8ec6ce36223fed25ba");
                    return;
                }
                try {
                    if (com.sankuai.waimai.store.util.b.a(currentActivity)) {
                        return;
                    }
                    currentActivity.finish();
                } catch (Exception e2) {
                    com.meituan.crashreporter.c.a(e2, 1, MetricsActivityLifecycleManager.currentActivity, true);
                }
            }
        });
        e eVar3 = this.floatMemberCouponBlock;
        RNFloatCouponMemberFragment.a aVar = new RNFloatCouponMemberFragment.a() { // from class: com.sankuai.waimai.store.mrn.viewmanager.redpacket.SGMRNRedPacketViewManager.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.RNFloatCouponMemberFragment.a
            public final void a(String str2) {
                com.sankuai.waimai.store.mrn.dialog.c cVar;
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect5, false, "3404aaa655eba7481d9436076d966374", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect5, false, "3404aaa655eba7481d9436076d966374");
                    return;
                }
                Activity currentActivity2 = SGMRNRedPacketViewManager.this.reactContext.getCurrentActivity();
                if (currentActivity2 == null || currentActivity2.isFinishing()) {
                    return;
                }
                try {
                    if (currentActivity2 instanceof BaseMemberActivity) {
                        BaseMemberActivity baseMemberActivity = (BaseMemberActivity) currentActivity2;
                        if (!(baseMemberActivity.b instanceof com.sankuai.waimai.store.mrn.dialog.c) || (cVar = (com.sankuai.waimai.store.mrn.dialog.c) baseMemberActivity.b) == null) {
                            return;
                        }
                        cVar.a(str2);
                    }
                } catch (Exception e2) {
                    a.a(e2);
                }
            }
        };
        Object[] objArr4 = {aVar};
        ChangeQuickRedirect changeQuickRedirect5 = e.a;
        if (PatchProxy.isSupport(objArr4, eVar3, changeQuickRedirect5, false, "88b8c9578825f8ac74aa80196d5022a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, eVar3, changeQuickRedirect5, false, "88b8c9578825f8ac74aa80196d5022a5");
        } else if (!(eVar3.b instanceof RNFloatCouponMemberFragment)) {
            if (eVar3.b instanceof MPFloatCouponMemberFragment) {
                ((MPFloatCouponMemberFragment) eVar3.b).n = aVar;
            }
        } else {
            ((RNFloatCouponMemberFragment) eVar3.b).g = aVar;
        }
        e eVar4 = this.floatMemberCouponBlock;
        com.sankuai.waimai.platform.restaurant.membercoupon.c cVar = new com.sankuai.waimai.platform.restaurant.membercoupon.c() { // from class: com.sankuai.waimai.store.mrn.viewmanager.redpacket.SGMRNRedPacketViewManager.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.c
            public final boolean a(long j2, String str2, int i2, String str3) {
                Object[] objArr5 = {new Long(j2), str2, Integer.valueOf(i2), str3};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "bf95aa79d1a45270fe0df502321b875f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "bf95aa79d1a45270fe0df502321b875f")).booleanValue();
                }
                com.sankuai.waimai.store.manager.coupon.a.a().a(j2, str2, i2, str3);
                com.meituan.android.bus.a.a().c(new HeaderMemberCouponRefreshSuccessEvent(1));
                return true;
            }

            @Override // com.sankuai.waimai.platform.restaurant.membercoupon.c
            public final boolean a(long j2, String str2) {
                Object[] objArr5 = {new Long(j2), str2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect6, false, "3f8a805a0e0fe640ad14eadbccee7be5", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect6, false, "3f8a805a0e0fe640ad14eadbccee7be5")).booleanValue();
                }
                com.sankuai.waimai.store.manager.coupon.a.a().a(j2, str2);
                com.meituan.android.bus.a.a().c(new HeaderMemberCouponRefreshSuccessEvent(0));
                return true;
            }
        };
        Object[] objArr5 = {cVar};
        ChangeQuickRedirect changeQuickRedirect6 = e.a;
        if (PatchProxy.isSupport(objArr5, eVar4, changeQuickRedirect6, false, "93671878f8555c14afab534513b1ceaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, eVar4, changeQuickRedirect6, false, "93671878f8555c14afab534513b1ceaa");
        } else if (!(eVar4.b instanceof RNFloatCouponMemberFragment)) {
            if (eVar4.b instanceof MPFloatCouponMemberFragment) {
                ((MPFloatCouponMemberFragment) eVar4.b).o = cVar;
            }
        } else {
            ((RNFloatCouponMemberFragment) eVar4.b).i = cVar;
        }
        FragmentManager supportFragmentManager = ((FragmentActivity) currentActivity).getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(com.sankuai.waimai.store.mrn.dialog.c.class.getSimpleName());
        if (findFragmentByTag == null) {
            findFragmentByTag = supportFragmentManager.findFragmentByTag("coupons");
        }
        if (findFragmentByTag == null) {
            return;
        }
        findFragmentByTag.getChildFragmentManager().beginTransaction().add(i, this.floatMemberCouponBlock.b).commitNowAllowingStateLoss();
    }

    private boolean isFromDetail(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d9931e2b1578aef0d1141088de25eb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d9931e2b1578aef0d1141088de25eb1")).booleanValue();
        }
        if (context == null || t.a(context.getClass().getName())) {
            return false;
        }
        return context.getClass().getName().contains("SGNewGoodDetailActivity");
    }

    public String getVolleyTAG() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c92eb4c8bf3929455c11f2713d9156cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c92eb4c8bf3929455c11f2713d9156cd");
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NonNull CouponView couponView) {
        Object[] objArr = {couponView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8cc7a00142de1f59eef2f3328ebc917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8cc7a00142de1f59eef2f3328ebc917");
            return;
        }
        couponView.b = null;
        this.mCID = null;
        super.onDropViewInstance((SGMRNRedPacketViewManager) couponView);
    }
}
