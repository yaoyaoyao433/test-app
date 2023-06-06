package com.sankuai.titans.widget.picture;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.result.app.GetResultFragment;
import com.sankuai.titans.widget.MediaWidget;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PictureSelfFragment extends GetResultFragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.result.app.GetResultFragment
    public void handleActivityResult(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f53b79a160fe2d7a166d29e79ae9c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f53b79a160fe2d7a166d29e79ae9c9d");
        } else if (intent != null) {
            MediaWidget.getInstance().raisePickerCallback(intent.getExtras());
        } else {
            MediaWidget.getInstance().raisePickerCallback(null);
        }
    }

    @Override // com.sankuai.titans.result.app.GetResultFragment
    public void handleActivityCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "147b17e57fe1f6c2e390622a003f5e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "147b17e57fe1f6c2e390622a003f5e06");
        } else {
            MediaWidget.getInstance().raisePickerCallback(null);
        }
    }
}
