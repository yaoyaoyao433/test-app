package com.sankuai.waimai.ugc.creator.ability.album;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.framework.BaseFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AlbumFragment extends BaseFragment {
    public static ChangeQuickRedirect a;

    public static AlbumFragment a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c33517dba6cc35507d1c355a90c1b0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlbumFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c33517dba6cc35507d1c355a90c1b0e");
        }
        Bundle bundle = new Bundle();
        AlbumFragment albumFragment = new AlbumFragment();
        albumFragment.setArguments(bundle);
        return albumFragment;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFragment
    public final com.sankuai.waimai.ugc.creator.framework.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3db59574dbd9d636e21f15efabf5874", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.creator.framework.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3db59574dbd9d636e21f15efabf5874") : new a(this);
    }
}
