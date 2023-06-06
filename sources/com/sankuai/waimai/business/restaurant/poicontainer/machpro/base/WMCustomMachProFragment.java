package com.sankuai.waimai.business.restaurant.poicontainer.machpro.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.machpro.container.a;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.widget.emptylayout.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMCustomMachProFragment extends MPBaseFragment {
    public static ChangeQuickRedirect b = null;
    public static String c = "custom_mach_pro_height";
    private d a;

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f17bacc47a96c56d9d310476da2e22", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f17bacc47a96c56d9d310476da2e22");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.a = new d(getActivity().getLayoutInflater(), (ViewGroup) null);
        this.a.a().findViewById(R.id.layout_info).setBackground(null);
        ay_().addView(this.a.a(), new FrameLayout.LayoutParams(-1, -1));
        return onCreateView;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c13c1b47390191c3b16d73c4a7a03844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c13c1b47390191c3b16d73c4a7a03844");
        } else if (this.a != null) {
            this.a.d();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9751a4a63a06e1aa9b6efe633ceebf3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9751a4a63a06e1aa9b6efe633ceebf3b");
        } else if (this.a == null || !this.a.j()) {
        } else {
            this.a.h();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e3c4e0535b119b52256b5cdd267cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e3c4e0535b119b52256b5cdd267cb5");
            return;
        }
        if (this.a != null) {
            this.a.b(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.base.WMCustomMachProFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba7dbd15804919b2f67bf06c6040c8fc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba7dbd15804919b2f67bf06c6040c8fc");
                    } else if (WMCustomMachProFragment.this.g != null) {
                        WMCustomMachProFragment.this.g.b();
                    }
                }
            });
            this.a.d("M_");
        }
        DovePageMonitor.a(getActivity(), 20005);
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead9f3569f2fc9c476c2212b9a44cd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead9f3569f2fc9c476c2212b9a44cd22");
        } else if (this.a == null || !this.a.j()) {
        } else {
            this.a.h();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "764a397e00c3f041a29c502a2b8da8fa", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "764a397e00c3f041a29c502a2b8da8fa") : this.a.a();
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5605a048efddc955862b0e9fa9692c29", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5605a048efddc955862b0e9fa9692c29") : this.a.a();
    }

    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbcc4f49953c6f1f0ab4fbe71e66674d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbcc4f49953c6f1f0ab4fbe71e66674d");
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    public final void b(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d290ba09d708fe7d5486b4e9450da62c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d290ba09d708fe7d5486b4e9450da62c");
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.b(hVar);
        }
    }

    public final void b(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e4b4ea71e1af7c838c3ba068d625a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e4b4ea71e1af7c838c3ba068d625a2");
            return;
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(str, machMap);
        }
    }
}
