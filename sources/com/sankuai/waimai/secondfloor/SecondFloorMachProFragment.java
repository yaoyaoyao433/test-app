package com.sankuai.waimai.secondfloor;

import android.app.Dialog;
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
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SecondFloorMachProFragment extends MPBaseFragment {
    public static ChangeQuickRedirect a;
    boolean b;
    private d c;
    private final h d;

    public SecondFloorMachProFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a30d49d2acbda3083dc8d86245b492a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a30d49d2acbda3083dc8d86245b492a3");
        } else {
            this.d = new h() { // from class: com.sankuai.waimai.secondfloor.SecondFloorMachProFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.h
                public final void a(String str, MachMap machMap) {
                    Object[] objArr2 = {str, machMap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "829b9c78bb5e66237aa4737e3b8e9b3a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "829b9c78bb5e66237aa4737e3b8e9b3a");
                    } else if ("changeStatusBarColorEvent".equalsIgnoreCase(str)) {
                        com.sankuai.waimai.platform.capacity.immersed.a.c(SecondFloorMachProFragment.this.getActivity(), b.d(machMap.get("isDark")));
                    } else if ("handleOnBackPressedEvent".equals(str)) {
                        SecondFloorMachProFragment.this.b = b.d(machMap.get("shouldHandle"));
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final MachMap a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac94d7069ea2626d619cc87666f08bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac94d7069ea2626d619cc87666f08bf");
        }
        try {
            return b.a(new JSONObject(getArguments().getString(WMMachProActivityDelegate.MP_EXTRA_DATA)));
        } catch (Exception e) {
            e.printStackTrace();
            return new MachMap();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5896a63e7a9a5913eb05a02b3d12eb82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5896a63e7a9a5913eb05a02b3d12eb82");
            return;
        }
        super.onCreate(bundle);
        h hVar = this.d;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52128fd5be888f2872a64c3f42899650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52128fd5be888f2872a64c3f42899650");
        } else {
            com.sankuai.waimai.machpro.container.a aVar = this.g;
            if (aVar != null) {
                aVar.a(hVar);
            }
        }
        this.g.a(new com.sankuai.waimai.machpro.adapter.b() { // from class: com.sankuai.waimai.secondfloor.SecondFloorMachProFragment.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.machpro.adapter.b
            public final void a(Dialog dialog) {
                Object[] objArr3 = {dialog};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b44b6a007a3a4b391525128c2cdb45fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b44b6a007a3a4b391525128c2cdb45fe");
                } else if (dialog != null) {
                    ae.a(dialog.getWindow());
                }
            }

            @Override // com.sankuai.waimai.machpro.adapter.b
            public final void b(Dialog dialog) {
                Object[] objArr3 = {dialog};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3c05a62e3f016deca158c46671b4fe98", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3c05a62e3f016deca158c46671b4fe98");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46f6f282857db553cdd943cd10c0205e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46f6f282857db553cdd943cd10c0205e");
            return;
        }
        super.onDestroy();
        h hVar = this.d;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba2a731e1d673ca837229b2f75015c55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba2a731e1d673ca837229b2f75015c55");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.g;
        if (aVar != null) {
            aVar.b(hVar);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb3c1f6371bb2ad6671f7c67dbaf643", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb3c1f6371bb2ad6671f7c67dbaf643");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.c = new d(getActivity().getLayoutInflater(), (ViewGroup) null);
        this.c.a().findViewById(R.id.layout_info).setBackground(null);
        ay_().addView(this.c.a(), new FrameLayout.LayoutParams(-1, -1));
        return onCreateView;
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7dfeb0a83df277cdcbd4d65d6096ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7dfeb0a83df277cdcbd4d65d6096ef");
        } else if (this.c != null) {
            this.c.d();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db870d7eedfa38c79e53248f95100cd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db870d7eedfa38c79e53248f95100cd5");
        } else if (this.c == null || !this.c.j()) {
        } else {
            this.c.h();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f901a3f5f2f9e47d3d88b5556c506bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f901a3f5f2f9e47d3d88b5556c506bbd");
        } else if (this.c != null) {
            this.c.b(new View.OnClickListener() { // from class: com.sankuai.waimai.secondfloor.SecondFloorMachProFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c21533623e1ec556c828fa80543db903", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c21533623e1ec556c828fa80543db903");
                    } else if (SecondFloorMachProFragment.this.g != null) {
                        SecondFloorMachProFragment.this.g.b();
                    }
                }
            });
            this.c.d("M_");
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a6ddc78be037f111b97174f6db457a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a6ddc78be037f111b97174f6db457a5");
        } else if (this.c == null || !this.c.j()) {
        } else {
            this.c.h();
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868117202b3b4d89b2a18e41ec8fc791", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868117202b3b4d89b2a18e41ec8fc791") : this.c.a();
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ca91cbc9b8fba6920e3106bcdb607b9", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ca91cbc9b8fba6920e3106bcdb607b9") : this.c.a();
    }
}
