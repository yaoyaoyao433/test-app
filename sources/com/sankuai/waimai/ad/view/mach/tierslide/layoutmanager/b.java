package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect c;

    public b(int i) {
        super(0);
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533a93ddbf9294e25e0dcad3cd898adf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533a93ddbf9294e25e0dcad3cd898adf");
        }
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.e
    public final f a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "381289f845dc4b88e725447f910c573b", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "381289f845dc4b88e725447f910c573b") : c();
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.e
    public final f a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce0d8962d8feddec71c936d2ba124cc7", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce0d8962d8feddec71c936d2ba124cc7") : c();
    }

    @Override // com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.e
    public final int[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33dbb8ce105e078f35d2c8431499c1ea", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33dbb8ce105e078f35d2c8431499c1ea") : new int[]{-1, -1};
    }

    private f c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc11df89946e8d83b540d9d5cd32c7c3", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc11df89946e8d83b540d9d5cd32c7c3") : new f(-this.d, 0, 500, new LinearInterpolator(), 1);
    }
}
