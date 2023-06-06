package com.sankuai.titans.offline.titans.adapter.plugin.debug;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineBaseDialog extends Dialog {
    public static ChangeQuickRedirect changeQuickRedirect;

    public OfflineBaseDialog(@NonNull Context context) {
        this(context, R.style.OfflineDialogTheme);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e82154174593c971051298ff8841370", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e82154174593c971051298ff8841370");
        }
    }

    public OfflineBaseDialog(@NonNull Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc0613cc10dca5ac8c8843561f80df4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc0613cc10dca5ac8c8843561f80df4c");
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f4b283c5f05350e95d1483e97ffcaeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f4b283c5f05350e95d1483e97ffcaeb");
            return;
        }
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            window.setAttributes(attributes);
        }
    }
}
