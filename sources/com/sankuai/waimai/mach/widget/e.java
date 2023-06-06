package com.sankuai.waimai.mach.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public final class e extends TextView {
    public static ChangeQuickRedirect a;
    private f b;
    private com.sankuai.waimai.mach.widget.decorations.d c;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82afef8ff7ee95d7ef0a736520b64ce4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82afef8ff7ee95d7ef0a736520b64ce4");
            return;
        }
        this.b = new f(this);
        this.c = new com.sankuai.waimai.mach.widget.decorations.d(this);
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                getClass().getSuperclass().getDeclaredMethod("setFallbackLineSpacing", Boolean.TYPE).invoke(this, Boolean.FALSE);
            }
        } catch (Throwable th) {
            setFallbackLineSpacingException(th);
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fd0fc85f8cbb8b5b3d27e0ab27c4c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fd0fc85f8cbb8b5b3d27e0ab27c4c7");
            return;
        }
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            this.b.a(dVar);
            this.c.a(dVar);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d39337d4ac6baa8199f223ddc357728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d39337d4ac6baa8199f223ddc357728");
            return;
        }
        this.c.b(canvas);
        super.draw(canvas);
        this.c.c(canvas);
    }

    private void setFallbackLineSpacingException(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27cb99fec60601754bd38cb4b5203837", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27cb99fec60601754bd38cb4b5203837");
            return;
        }
        com.sankuai.waimai.mach.e e = i.a().e();
        if (e != null) {
            e.a("mach_text", LogMonitor.EXCEPTION_TAG, th.getMessage(), null);
        }
    }
}
