package com.sankuai.waimai.business.restaurant.poicontainer.machpro;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import com.meituan.android.common.weaver.interfaces.Weaver;
import com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener;
import com.meituan.metrics.MetricsNameProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.utils.e;
import com.sankuai.waimai.platform.machpro.container.IMPActivityDelegate;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMachProActivityDelegate extends IMPActivityDelegate implements MetricsNameProvider {
    public static final String MP_BIZ = "mp_biz";
    public static final String MP_COMPONENT = "mp_component";
    public static final String MP_ENTRY = "mp_entry";
    public static final String MP_EXTRA_DATA = "mp_extra_data";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mBundleName;
    private final FFPReportListener mFFPReportListener;
    protected String mLinkIdentifierInfo;
    private WMMachProCustomFragment wmMachProCustomFragment;

    public WMMachProActivityDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6012db2c7b89cd69b95a7c33e80edcfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6012db2c7b89cd69b95a7c33e80edcfe");
        } else {
            this.mFFPReportListener = new FFPReportListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPReportListener
                public final void onFFPReport(@NonNull FFPReportListener.IReportEvent iReportEvent) {
                    Object[] objArr2 = {iReportEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37780f0ff3dee3e05a3d3ccdb3d83fdc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37780f0ff3dee3e05a3d3ccdb3d83fdc");
                    } else if (WMMachProActivityDelegate.this.wmMachProCustomFragment != null) {
                        WMMachProActivityDelegate.this.wmMachProCustomFragment.g.a(iReportEvent);
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.container.IMPActivityDelegate
    public void onCreate(FragmentActivity fragmentActivity, @Nullable Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95d230190e755d0364e4180462768004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95d230190e755d0364e4180462768004");
            return;
        }
        super.onCreate(fragmentActivity, bundle);
        Weaver.getWeaver().registerListener(this.mFFPReportListener, FFPReportListener.class);
        fragmentActivity.setContentView(R.layout.wm_mach_pro_activity);
        initImmersed();
        init();
        this.mLinkIdentifierInfo = e.a(fragmentActivity.getIntent());
    }

    private void initImmersed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cfa14113ef11b6cd2a472d91d868f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cfa14113ef11b6cd2a472d91d868f39");
            return;
        }
        com.sankuai.waimai.platform.capacity.immersed.a.b(getActivity(), false);
        com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) getActivity(), true);
    }

    public void init() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b0d6e8bc93c8c30216b3faec35dbc09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b0d6e8bc93c8c30216b3faec35dbc09");
            return;
        }
        FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        Uri data = getActivity().getIntent().getData();
        if (data == null) {
            getActivity().finish();
            return;
        }
        String queryParameter = data.getQueryParameter(MP_BIZ);
        String queryParameter2 = data.getQueryParameter(MP_ENTRY);
        String queryParameter3 = data.getQueryParameter(MP_COMPONENT);
        String queryParameter4 = data.getQueryParameter(MP_EXTRA_DATA);
        this.mBundleName = queryParameter2;
        this.wmMachProCustomFragment = WMMachProCustomFragment.a(queryParameter, queryParameter2, queryParameter3, queryParameter4);
        beginTransaction.replace(R.id.mach_pro_root, this.wmMachProCustomFragment);
        beginTransaction.commitNowAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.platform.machpro.container.IMPActivityDelegate
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c4a7cec22a005430658fd3a13f55e4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c4a7cec22a005430658fd3a13f55e4c");
        } else if (this.wmMachProCustomFragment.aD_()) {
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.sankuai.waimai.platform.machpro.container.IMPActivityDelegate
    public void onDestroy(FragmentActivity fragmentActivity) {
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c08493465bf2a38ceb794afc912cefa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c08493465bf2a38ceb794afc912cefa");
            return;
        }
        super.onDestroy(fragmentActivity);
        Weaver.getWeaver().unregisterListener(this.mFFPReportListener, FFPReportListener.class);
    }

    @Override // com.meituan.metrics.MetricsNameProvider
    public String getName() {
        return this.mBundleName;
    }

    @Override // com.sankuai.waimai.platform.machpro.container.IMPActivityDelegate
    public void finish() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e56271837c2b04c7aad3808749c2edb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e56271837c2b04c7aad3808749c2edb8");
        } else {
            super.finish();
        }
    }
}
