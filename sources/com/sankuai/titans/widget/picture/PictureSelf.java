package com.sankuai.titans.widget.picture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.app.GetResult;
import com.sankuai.titans.widget.MediaWidget;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PictureSelf extends GetResult<PictureSelfFragment> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PictureSelf(Activity activity) {
        super(activity);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c44ca3848e6183c63a89b787438bcd9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c44ca3848e6183c63a89b787438bcd9d");
        }
    }

    @Override // com.sankuai.titans.result.app.GetResult
    public PictureSelfFragment newFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79dcfe3143291845945b61402f3caa5a", RobustBitConfig.DEFAULT_VALUE) ? (PictureSelfFragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79dcfe3143291845945b61402f3caa5a") : new PictureSelfFragment();
    }

    public void getPicture(int i, Bundle bundle) {
        Object[] objArr = {Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2858f14176e3fe45e61f7c013beac383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2858f14176e3fe45e61f7c013beac383");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(this.mActivity.getPackageName());
        intent.setAction(MediaWidget.ACTION_PICKER);
        intent.putExtras(bundle);
        getFragment().startActivityForResult(intent, i);
    }
}
