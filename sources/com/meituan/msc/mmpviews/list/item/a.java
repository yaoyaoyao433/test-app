package com.meituan.msc.mmpviews.list.item;

import android.content.Context;
import android.view.View;
import com.meituan.msc.mmpviews.view.MPViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends MPViewGroup {
    public static ChangeQuickRedirect a;
    public boolean b;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885451b98fe31a3deb3554a34b0ed02b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885451b98fe31a3deb3554a34b0ed02b");
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f21efe9ef5f6a3d42772168c60808dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f21efe9ef5f6a3d42772168c60808dc");
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    public final void setFullSpan(boolean z) {
        this.b = z;
    }
}
