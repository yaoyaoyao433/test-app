package com.sankuai.waimai.business.ugc.machpro.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.mtplayer.video.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.capacity.immersed.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPCustomBaseFragment extends MPBaseFragment {
    public static ChangeQuickRedirect b;
    private final h a;
    public boolean c;

    public MPCustomBaseFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4ad20378dd4dfef543e527ef32e69f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4ad20378dd4dfef543e527ef32e69f");
        } else {
            this.a = new h() { // from class: com.sankuai.waimai.business.ugc.machpro.base.MPCustomBaseFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.h
                public final void a(String str, MachMap machMap) {
                    Object[] objArr2 = {str, machMap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fe242695f28a110f2c268dfbc1e59cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fe242695f28a110f2c268dfbc1e59cf");
                    } else if ("changeStatusBarColorEvent".equalsIgnoreCase(str)) {
                        a.d(MPCustomBaseFragment.this.getActivity(), b.d(machMap.get("isDark")));
                    } else if ("handleOnBackPressedEvent".equals(str)) {
                        MPCustomBaseFragment.this.c = b.d(machMap.get("shouldHandle"));
                    }
                }
            };
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf99e7382d7152aa99b05e6a0d1fd469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf99e7382d7152aa99b05e6a0d1fd469");
            return;
        }
        super.onCreate(bundle);
        h hVar = this.a;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50f1f75740aaf8da2a7d77556ceb76a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50f1f75740aaf8da2a7d77556ceb76a7");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.g;
        if (aVar != null) {
            aVar.a(hVar);
        }
    }

    @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a4036f6955e5e5638c228bd9d98ba74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a4036f6955e5e5638c228bd9d98ba74");
            return;
        }
        super.onDestroy();
        h hVar = this.a;
        Object[] objArr2 = {hVar};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b15f23b2afb366e70845d691ba50af9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b15f23b2afb366e70845d691ba50af9");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.g;
        if (aVar != null) {
            aVar.b(hVar);
        }
    }

    public static l e() {
        return l.TYPE_XPLAYER;
    }

    public final void a(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54f5fefb664f38fae0757b436cebe538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54f5fefb664f38fae0757b436cebe538");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.g;
        if (aVar != null) {
            aVar.a(machMap);
        }
    }

    public final void a(String str, MachMap machMap) {
        Object[] objArr = {str, machMap};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9695450c94db624ead8c7efbace7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9695450c94db624ead8c7efbace7aa");
            return;
        }
        com.sankuai.waimai.machpro.container.a aVar = this.g;
        if (aVar != null) {
            aVar.a(str, machMap);
        }
    }
}
