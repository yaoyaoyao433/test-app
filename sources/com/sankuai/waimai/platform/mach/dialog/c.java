package com.sankuai.waimai.platform.mach.dialog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.mach.dialog.DynamicDialog;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DynamicDialog.d dialogContext;

    public c(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fba7aacf774bf91c122ad1cdf03b220e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fba7aacf774bf91c122ad1cdf03b220e");
        } else {
            this.dialogContext = DynamicDialog.d.d;
        }
    }

    public c(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7468d80678e30063cea1cd36f23c4eb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7468d80678e30063cea1cd36f23c4eb2");
        } else {
            this.dialogContext = DynamicDialog.d.d;
        }
    }

    public void attachDialogContext(@NonNull DynamicDialog.d dVar) {
        this.dialogContext = dVar;
    }

    @NonNull
    public DynamicDialog.d getDialogContext() {
        return this.dialogContext;
    }
}
