package com.sankuai.waimai.business.restaurant.poicontainer.machpro;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.WMCustomMachProFragment;
import com.sankuai.waimai.business.restaurant.poicontainer.utils.MachProJsonUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.util.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMMachProCustomFragment extends WMCustomMachProFragment {
    public static ChangeQuickRedirect a;
    private boolean d;
    private final h e;

    public WMMachProCustomFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92cced562272eb85d9bafc2e2c6642df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92cced562272eb85d9bafc2e2c6642df");
        } else {
            this.e = new h() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProCustomFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.h
                public final void a(String str, MachMap machMap) {
                    Object[] objArr2 = {str, machMap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90b050b6c88ab7955a048810d69f4f4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90b050b6c88ab7955a048810d69f4f4f");
                    } else if ("changeStatusBarColorEvent".equalsIgnoreCase(str)) {
                        com.sankuai.waimai.platform.capacity.immersed.a.c(WMMachProCustomFragment.this.getActivity(), b.d(machMap.get("isDark")));
                    } else if ("handleOnBackPressedEvent".equals(str)) {
                        WMMachProCustomFragment.this.d = b.d(machMap.get("shouldHandle"));
                    }
                }
            };
        }
    }

    public static WMMachProCustomFragment a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "773ec826a333144c8f77c3803e6ed464", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMMachProCustomFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "773ec826a333144c8f77c3803e6ed464");
        }
        WMMachProCustomFragment wMMachProCustomFragment = new WMMachProCustomFragment();
        Bundle bundle = new Bundle();
        bundle.putString("bundle_name", str2);
        bundle.putString("biz", str);
        bundle.putString(WMMachProActivityDelegate.MP_EXTRA_DATA, str4);
        wMMachProCustomFragment.setArguments(bundle);
        return wMMachProCustomFragment;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "880188a54755619640aa5005d554bcfb", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "880188a54755619640aa5005d554bcfb");
        }
        try {
            return MachProJsonUtil.a(getArguments().getString(WMMachProActivityDelegate.MP_EXTRA_DATA));
        } catch (Exception e) {
            e.printStackTrace();
            return new MachMap();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1486e4d279c61306c3ca4a9ee26b8007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1486e4d279c61306c3ca4a9ee26b8007");
            return;
        }
        super.onCreate(bundle);
        a(this.e);
        this.g.a(new com.sankuai.waimai.machpro.adapter.b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProCustomFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.adapter.b
            public final void a(Dialog dialog) {
                Object[] objArr2 = {dialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c99f9506808a2e3556d89ad9a4178265", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c99f9506808a2e3556d89ad9a4178265");
                } else if (dialog != null) {
                    ae.a(dialog.getWindow());
                }
            }

            @Override // com.sankuai.waimai.machpro.adapter.b
            public final void b(Dialog dialog) {
                Object[] objArr2 = {dialog};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12af770f2f35fd36fd0a343800c511fa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12af770f2f35fd36fd0a343800c511fa");
                } else {
                    ae.a();
                }
            }
        });
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20507180902cb6860e7bcc5697f246ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20507180902cb6860e7bcc5697f246ad");
            return;
        }
        super.onDestroy();
        b(this.e);
    }

    public final boolean aD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3fbc536095f3b80cecd596e897488b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3fbc536095f3b80cecd596e897488b6")).booleanValue();
        }
        if (this.d) {
            b("onBackPressed", null);
        }
        return this.d;
    }
}
