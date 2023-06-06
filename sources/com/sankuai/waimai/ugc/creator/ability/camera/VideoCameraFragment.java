package com.sankuai.waimai.ugc.creator.ability.camera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.framework.BaseFragment;
import com.sankuai.waimai.ugc.creator.judas.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class VideoCameraFragment extends BaseFragment {
    public static ChangeQuickRedirect a;
    private String b;

    public VideoCameraFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced74cf01c6100c7e4fd1999cb841f0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced74cf01c6100c7e4fd1999cb841f0f");
        } else {
            this.b = "VideoCameraFragment";
        }
    }

    public static VideoCameraFragment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13833e48d641d948d156ca3ae8881589", RobustBitConfig.DEFAULT_VALUE)) {
            return (VideoCameraFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13833e48d641d948d156ca3ae8881589");
        }
        Bundle bundle = new Bundle();
        VideoCameraFragment videoCameraFragment = new VideoCameraFragment();
        videoCameraFragment.setArguments(bundle);
        return videoCameraFragment;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment
    public final com.sankuai.waimai.ugc.creator.framework.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b4d5da0a74b4b63f3c84103114f5c6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.creator.framework.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b4d5da0a74b4b63f3c84103114f5c6") : new b(this);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84dda1b718fa76d5f6d2a04af7553fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84dda1b718fa76d5f6d2a04af7553fe7");
            return;
        }
        super.onResume();
        e.a().a((Fragment) this);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a468e03571cf96b091037802a4ee474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a468e03571cf96b091037802a4ee474");
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        e.a().a((Fragment) this);
    }
}
