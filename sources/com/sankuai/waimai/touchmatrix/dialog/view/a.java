package com.sankuai.waimai.touchmatrix.dialog.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.touchmatrix.rebuild.DynamicDialogNew;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends FrameLayout {
    public static ChangeQuickRedirect b;
    private DynamicDialogNew.e a;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d307f7305e5d495ffad87798f8342e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d307f7305e5d495ffad87798f8342e5");
        } else {
            this.a = DynamicDialogNew.e.c;
        }
    }

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db422f3873c94bf79e0aef984a32e246", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db422f3873c94bf79e0aef984a32e246");
        } else {
            this.a = DynamicDialogNew.e.c;
        }
    }

    public void a(@NonNull DynamicDialogNew.e eVar) {
        this.a = eVar;
    }

    @NonNull
    public DynamicDialogNew.e getDialogContext() {
        return this.a;
    }
}
