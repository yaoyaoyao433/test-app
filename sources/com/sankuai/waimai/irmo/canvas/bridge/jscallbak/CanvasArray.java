package com.sankuai.waimai.irmo.canvas.bridge.jscallbak;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.data.b;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CanvasArray extends b {
    private static final String TAG = "INFCanvasArray";
    public static ChangeQuickRedirect changeQuickRedirect;

    public void pushObject(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "432c9446939bc322c299af9a9b3677b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "432c9446939bc322c299af9a9b3677b1");
        } else {
            this.mObjects.add(i, obj);
        }
    }

    public Object[] toArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e552a0823634c2395a145700255869c", RobustBitConfig.DEFAULT_VALUE) ? (Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e552a0823634c2395a145700255869c") : this.mObjects.toArray();
    }
}
