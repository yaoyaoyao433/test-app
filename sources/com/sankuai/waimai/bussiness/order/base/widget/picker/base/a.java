package com.sankuai.waimai.bussiness.order.base.widget.picker.base;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.bussiness.order.base.widget.picker.base.b
    public final void a(RecyclerWheelPicker recyclerWheelPicker, Canvas canvas, Rect rect, Paint paint) {
        Object[] objArr = {recyclerWheelPicker, canvas, rect, paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec9eb836c0fef4831f513f55fd828ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec9eb836c0fef4831f513f55fd828ea");
        } else {
            canvas.drawRect(rect, paint);
        }
    }
}
