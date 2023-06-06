package com.sankuai.titans.widget.picture;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.v4.GetResultFragmentV4;
import com.sankuai.titans.widget.MediaWidget;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PictureSelfFragmentV4 extends GetResultFragmentV4 {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.result.v4.GetResultFragmentV4
    public void handleActivityResult(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16a77d5953fee82db6c1fd582cebcb26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16a77d5953fee82db6c1fd582cebcb26");
        } else if (intent != null) {
            MediaWidget.getInstance().raisePickerCallback(intent.getExtras());
        } else {
            MediaWidget.getInstance().raisePickerCallback(null);
        }
    }

    @Override // com.sankuai.titans.result.v4.GetResultFragmentV4
    public void handleActivityCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "496165a42fb1dab987a53051def0efaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "496165a42fb1dab987a53051def0efaa");
        } else {
            MediaWidget.getInstance().raisePickerCallback(null);
        }
    }
}
