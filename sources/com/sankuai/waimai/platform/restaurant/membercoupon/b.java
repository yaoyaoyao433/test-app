package com.sankuai.waimai.platform.restaurant.membercoupon;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.facebook.react.i {
    public static ChangeQuickRedirect a;
    private WeakReference<RNFloatCouponMemberFragment> b;

    public b(RNFloatCouponMemberFragment rNFloatCouponMemberFragment) {
        Object[] objArr = {rNFloatCouponMemberFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4ffda8fb13206808584b0a4bd82274", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4ffda8fb13206808584b0a4bd82274");
        } else {
            this.b = new WeakReference<>(rNFloatCouponMemberFragment);
        }
    }

    @Override // com.facebook.react.i
    @NonNull
    public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3771b89386aa575aa9cf0be0d5464efa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3771b89386aa575aa9cf0be0d5464efa");
        }
        RNFloatCouponMemberFragment rNFloatCouponMemberFragment = this.b.get();
        if (rNFloatCouponMemberFragment != null) {
            Object[] objArr2 = {reactApplicationContext};
            ChangeQuickRedirect changeQuickRedirect2 = RNFloatCouponMemberFragment.a;
            if (PatchProxy.isSupport(objArr2, rNFloatCouponMemberFragment, changeQuickRedirect2, false, "89c10300672cd27e9f2f9a07fcca0eb7", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr2, rNFloatCouponMemberFragment, changeQuickRedirect2, false, "89c10300672cd27e9f2f9a07fcca0eb7");
            }
            com.sankuai.waimai.foundation.utils.log.a.b("MRN_MEMBER_FLOAT", "RNFloatCouponMemberFragment, getNativeModuleList()", new Object[0]);
            ArrayList arrayList = new ArrayList();
            if (RNFloatCouponMemberFragment.j == null) {
                RNFloatCouponMemberFragment.j = new WMRNFloatingRedpacketModule(reactApplicationContext);
            }
            RNFloatCouponMemberFragment.j.setModuleEventListener(rNFloatCouponMemberFragment);
            arrayList.add(RNFloatCouponMemberFragment.j);
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.react.i
    @NonNull
    public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d9eeababa1b7b97761fc112759ae73", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d9eeababa1b7b97761fc112759ae73") : Collections.emptyList();
    }
}
