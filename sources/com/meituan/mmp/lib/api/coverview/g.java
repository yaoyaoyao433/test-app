package com.meituan.mmp.lib.api.coverview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public final class g extends ImageView implements e {
    public static ChangeQuickRedirect a;
    public b b;
    public boolean c;

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7badc8e13fd6d4d13c8b3944b093b9e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7badc8e13fd6d4d13c8b3944b093b9e9");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d49d8b7f106d3a39986dcdba649efa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d49d8b7f106d3a39986dcdba649efa4");
            return;
        }
        super.onDetachedFromWindow();
        setOnClickListener(null);
        setOnTouchListener(null);
    }

    public final b getCoverUpdateObserver() {
        return this.b;
    }

    @Override // com.meituan.mmp.lib.api.coverview.e
    public final void a(b bVar) {
        this.b = bVar;
    }

    @Override // com.meituan.mmp.lib.api.coverview.e
    public final void setIsCustomCallOutView(boolean z) {
        this.c = z;
    }
}
