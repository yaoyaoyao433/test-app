package com.sankuai.waimai.platform.mach.tag;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends TagCanvasView {
    public static ChangeQuickRedirect a;
    private int d;
    private int e;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfb79d12e48fefb67b37eaf1ab1c89d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfb79d12e48fefb67b37eaf1ab1c89d4");
        }
    }

    public final void a(int i, int i2) {
        this.d = i;
        this.e = i2;
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView, com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef738bb97afab3375e40ca5f03e68a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef738bb97afab3375e40ca5f03e68a9");
        } else {
            super.onMeasure(this.d, this.e);
        }
    }
}
