package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aa implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "__setPixels";
    }

    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        ?? r14;
        boolean z;
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3da4cd1483ea8adce5e598ee7e1adb8c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3da4cd1483ea8adce5e598ee7e1adb8c")).booleanValue();
        }
        int b = com.meituan.mmp.lib.utils.p.b(jSONArray, 0);
        int b2 = com.meituan.mmp.lib.utils.p.b(jSONArray, 1);
        int c = com.meituan.mmp.lib.utils.p.c((float) jSONArray.optDouble(2));
        int c2 = com.meituan.mmp.lib.utils.p.c((float) jSONArray.optDouble(3));
        if (canvas.isHardwareAccelerated()) {
            if (canvas instanceof com.meituan.mmp.lib.api.canvas.g) {
                ((com.meituan.mmp.lib.api.canvas.g) canvas).a(b, b2, b + c, b2 + c2);
            } else if (iVar.h != null) {
                z = true;
                r14 = 0;
                canvas.drawRect(b, b2, b + c, b2 + c2, iVar.h);
            }
            r14 = 0;
            z = true;
        } else {
            r14 = 0;
            r14 = 0;
            z = true;
            if (iVar.h != null) {
                canvas.drawRect(b, b2, b + c, b2 + c2, iVar.h);
            } else {
                canvas.drawRect(b, b2, b + c, b2 + c2, iVar.g);
            }
        }
        try {
            Bitmap bitmap = (Bitmap) jSONArray.get(4);
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(bitmap, new Rect(r14, r14, bitmap.getWidth(), bitmap.getHeight()), new RectF(b, b2, b + c, b2 + c2), iVar.c);
                return z;
            }
            return r14;
        } catch (Throwable unused) {
            return r14;
        }
    }
}
