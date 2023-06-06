package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class FloatVoucherMRNBlock extends b implements c {
    public static ChangeQuickRedirect b;
    public int c;
    public long d;
    public String e;
    public boolean j;
    public Fragment k;

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    @Deprecated
    public final boolean e() {
        return false;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    @Deprecated
    public final void g() {
    }

    public FloatVoucherMRNBlock(long j, String str, int i, Fragment fragment) {
        super(fragment);
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), fragment};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75e5a2df2c68be1a541e48eb749f442f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75e5a2df2c68be1a541e48eb749f442f");
            return;
        }
        this.d = j;
        this.e = str;
        this.c = i;
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.a
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78d708c043c9f3b6e8aa9a1f6011115b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78d708c043c9f3b6e8aa9a1f6011115b");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_float_voucher_mrn_layout, viewGroup, false);
        try {
            this.k = FloatVoucherMRNFragment.a(this.d, this.e, this.c);
            Activity c = c();
            if (c instanceof FragmentActivity) {
                ((FragmentActivity) c).getSupportFragmentManager().beginTransaction().replace(R.id.float_voucher_fragment_container, this.k).commitAllowingStateLoss();
            }
        } catch (Exception unused) {
        }
        return inflate;
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.c
    public final void f() {
        this.j = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class FloatCouponContainerFragment extends Fragment {
        public static ChangeQuickRedirect a;
        b b;

        @Override // android.support.v4.app.Fragment
        @Nullable
        public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            Object[] objArr = {layoutInflater, viewGroup, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa14a8205de0b033656fbc279708df17", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa14a8205de0b033656fbc279708df17") : this.b.a(viewGroup);
        }
    }
}
