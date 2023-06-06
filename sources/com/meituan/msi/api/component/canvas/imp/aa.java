package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aa implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "__setPixels";
    }

    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        ?? r14;
        boolean z;
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ab27d307f373327475c8e8213e3697d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ab27d307f373327475c8e8213e3697d")).booleanValue();
        }
        int b = com.meituan.msi.util.f.b(jsonArray, 0);
        int b2 = com.meituan.msi.util.f.b(jsonArray, 1);
        int a2 = com.meituan.msi.util.f.a((float) jsonArray.get(2).getAsDouble());
        int a3 = com.meituan.msi.util.f.a((float) jsonArray.get(3).getAsDouble());
        if (canvas.isHardwareAccelerated()) {
            if (canvas instanceof com.meituan.msi.api.component.canvas.view.a) {
                ((com.meituan.msi.api.component.canvas.view.a) canvas).a(b, b2, b + a2, b2 + a3);
            } else if (fVar.g != null) {
                z = true;
                r14 = 0;
                canvas.drawRect(b, b2, b + a2, b2 + a3, fVar.g);
            }
            r14 = 0;
            z = true;
        } else {
            r14 = 0;
            r14 = 0;
            z = true;
            if (fVar.g != null) {
                canvas.drawRect(b, b2, b + a2, b2 + a3, fVar.g);
            } else {
                canvas.drawRect(b, b2, b + a2, b2 + a3, fVar.f);
            }
        }
        try {
            Bitmap bitmap = (Bitmap) new Gson().fromJson(jsonArray.get(4), (Class<Object>) Bitmap.class);
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(bitmap, new Rect(r14, r14, bitmap.getWidth(), bitmap.getHeight()), new RectF(b, b2, b + a2, b2 + a3), fVar.b);
                return z;
            }
            return r14;
        } catch (Throwable unused) {
            return r14;
        }
    }
}
