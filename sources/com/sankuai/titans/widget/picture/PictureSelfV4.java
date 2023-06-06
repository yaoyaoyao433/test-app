package com.sankuai.titans.widget.picture;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.v4.GetResultV4;
import com.sankuai.titans.widget.MediaWidget;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PictureSelfV4 extends GetResultV4<PictureSelfFragmentV4> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PictureSelfV4(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Object[] objArr = {fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85129c3f99bad39b16531388b68f7260", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85129c3f99bad39b16531388b68f7260");
        }
    }

    @Override // com.sankuai.titans.result.v4.GetResultV4
    public PictureSelfFragmentV4 newFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1fcd4f69df47aee8a63ce8af4d3f6ac", RobustBitConfig.DEFAULT_VALUE) ? (PictureSelfFragmentV4) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1fcd4f69df47aee8a63ce8af4d3f6ac") : new PictureSelfFragmentV4();
    }

    public void getPicture(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5d405da81013ae64d90b6361fede83a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5d405da81013ae64d90b6361fede83a");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(this.mActivity.getPackageName());
        intent.setAction(MediaWidget.ACTION_PICKER);
        intent.putExtras(bundle);
        getFragment().startActivityForResult(intent, i);
    }
}
