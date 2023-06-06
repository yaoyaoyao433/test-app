package com.sankuai.waimai.ugc.creator.ability.camera;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.framework.BaseFragment;
import com.sankuai.waimai.ugc.creator.judas.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PhotoCameraFragment extends BaseFragment {
    public static ChangeQuickRedirect a;

    public static PhotoCameraFragment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67ae61d41dc05a3c16c9d84eaa6177b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PhotoCameraFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67ae61d41dc05a3c16c9d84eaa6177b1");
        }
        Bundle bundle = new Bundle();
        PhotoCameraFragment photoCameraFragment = new PhotoCameraFragment();
        photoCameraFragment.setArguments(bundle);
        return photoCameraFragment;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment
    public final com.sankuai.waimai.ugc.creator.framework.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9b8a357238d5ad77371ddb0e0fcd14", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.creator.framework.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9b8a357238d5ad77371ddb0e0fcd14") : new a(this);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e9bf9460bc51e3ad17e088cdbe9cb89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e9bf9460bc51e3ad17e088cdbe9cb89");
            return;
        }
        super.onResume();
        e.a().b(this);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9053bad386e02d4ff2e18622ea62a76d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9053bad386e02d4ff2e18622ea62a76d");
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        e.a().b(this);
    }
}
