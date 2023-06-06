package com.sankuai.waimai.business.ugc.mach.container;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.android.mtplayer.video.h;
import com.meituan.android.mtplayer.video.l;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.platform.machpro.video.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMPCouponPackageActivity extends BaseActivity implements MetricsNameProvider, a {
    public static ChangeQuickRedirect a;
    private MPBaseFragment b;
    private h c;
    private final FFPReportListener d;

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        return "mach_pro_waimai_coupon_package_sell";
    }

    public WMMPCouponPackageActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc5a92ff9a475333a4da540017d43b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc5a92ff9a475333a4da540017d43b9");
        } else {
            this.d = new FFPReportListener() { // from class: com.sankuai.waimai.business.ugc.mach.container.WMMPCouponPackageActivity.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener
                public final void onFFPReport(@NonNull FFPReportListener.IReportEvent iReportEvent) {
                    Object[] objArr2 = {iReportEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7bcf9027f2ae214687f9bdcca5f6547", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7bcf9027f2ae214687f9bdcca5f6547");
                    } else if (WMMPCouponPackageActivity.this.b != null) {
                        WMMPCouponPackageActivity.this.b.g.a(iReportEvent);
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f27a2bb69f116b0ffa758012afeade3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f27a2bb69f116b0ffa758012afeade3");
            return;
        }
        super.onCreate(bundle);
        Weaver.getWeaver().registerListener(this.d, FFPReportListener.class);
        setContentView(R.layout.mp_coupon_package_activity);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d9fb30a9f79ebc69ea6cf7e67d28953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d9fb30a9f79ebc69ea6cf7e67d28953");
        } else {
            com.sankuai.waimai.platform.capacity.immersed.a.b(this, true);
            com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this, true);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4fa684e8dbafd2764d159f89712b547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4fa684e8dbafd2764d159f89712b547");
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Uri data = getIntent().getData();
        if (data == null) {
            finish();
            return;
        }
        Uri.Builder buildUpon = data.buildUpon();
        buildUpon.appendQueryParameter("mach_bundle_name", "mach_pro_waimai_coupon_package_sell");
        buildUpon.appendQueryParameter("useCache", "1");
        getIntent().setData(buildUpon.build());
        this.b = new WMMPCouponPackageFragment();
        beginTransaction.replace(R.id.mach_pro_coupon_package_root, this.b);
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b09ebc9303d0c75eb618a4ed4ff81bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b09ebc9303d0c75eb618a4ed4ff81bb");
            return;
        }
        super.onDestroy();
        Weaver.getWeaver().unregisterListener(this.d, FFPReportListener.class);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20066249c2df2411140f515238e0aa42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20066249c2df2411140f515238e0aa42");
        } else if (this.c != null) {
            this.c.a();
            this.c = null;
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final h b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d9c0d2246e95cf10854574d2477410f", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d9c0d2246e95cf10854574d2477410f");
        }
        if (this.c == null) {
            this.c = new h();
        }
        return this.c;
    }

    @Override // com.sankuai.waimai.platform.machpro.video.a
    public final l d() {
        return l.TYPE_ANDROID;
    }
}
