package com.sankuai.waimai.store.mach.dynamic_tag;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends TagCanvasView {
    public static ChangeQuickRedirect a;
    private int d;
    private int e;

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1511c4fb537a24e548f3cfd2a102261", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1511c4fb537a24e548f3cfd2a102261");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588483b1f25ae3997e848275f328ed4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588483b1f25ae3997e848275f328ed4a");
        } else {
            super.onMeasure(this.d, this.e);
        }
    }
}
