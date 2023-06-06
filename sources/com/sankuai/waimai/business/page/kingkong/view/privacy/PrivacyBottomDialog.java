package com.sankuai.waimai.business.page.kingkong.view.privacy;

import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PrivacyBottomDialog extends BottomSheetDialog {
    public static ChangeQuickRedirect d;

    @Override // android.support.design.widget.BottomSheetDialog, android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b8ac74651d3a8a18c7514dcc436fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b8ac74651d3a8a18c7514dcc436fa1");
        } else {
            super.onCreate(bundle);
        }
    }
}
