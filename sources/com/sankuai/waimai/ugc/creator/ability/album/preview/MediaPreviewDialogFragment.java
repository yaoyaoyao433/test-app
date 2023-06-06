package com.sankuai.waimai.ugc.creator.ability.album.preview;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.framework.BaseFullScreenDialogFragment;
import com.sankuai.waimai.ugc.creator.framework.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MediaPreviewDialogFragment extends BaseFullScreenDialogFragment {
    public static ChangeQuickRedirect a;

    public static MediaPreviewDialogFragment a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b19953058f73e1a4186523ab65043385", RobustBitConfig.DEFAULT_VALUE)) {
            return (MediaPreviewDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b19953058f73e1a4186523ab65043385");
        }
        MediaPreviewDialogFragment mediaPreviewDialogFragment = new MediaPreviewDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("first_media_index", i);
        mediaPreviewDialogFragment.setArguments(bundle);
        return mediaPreviewDialogFragment;
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.BaseFullScreenDialogFragment
    public final b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d272c457ba9e4bd600227629eebd93", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d272c457ba9e4bd600227629eebd93") : new a(this);
    }

    public final void a(FragmentManager fragmentManager) {
        Object[] objArr = {fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f3ff43b68547af1b283090ba240710a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f3ff43b68547af1b283090ba240710a");
        } else {
            super.show(fragmentManager, this.c);
        }
    }
}
