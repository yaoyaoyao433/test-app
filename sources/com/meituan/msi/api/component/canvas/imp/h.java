package com.meituan.msi.api.component.canvas.imp;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements ak {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final String a() {
        return "drawImage";
    }

    @Override // com.meituan.msi.api.component.canvas.imp.ak
    public final boolean a(com.meituan.msi.api.component.canvas.f fVar, Canvas canvas, JsonArray jsonArray) {
        Object[] objArr = {fVar, canvas, jsonArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f26981d50dedf101076207961568c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f26981d50dedf101076207961568c1")).booleanValue();
        }
        int size = jsonArray.size();
        if (size < 3) {
            return false;
        }
        String asString = jsonArray.get(0).getAsString();
        if (TextUtils.isEmpty(asString)) {
            return false;
        }
        float a2 = com.meituan.msi.util.f.a(jsonArray, 1);
        float a3 = com.meituan.msi.util.f.a(jsonArray, 2);
        if (size == 3) {
            Bitmap a4 = fVar.h.a(fVar.a, asString);
            if (a4 != null) {
                canvas.drawBitmap(a4, new Rect(0, 0, a4.getWidth(), a4.getHeight()), new RectF(a2, a3, com.meituan.msi.util.f.d(a4.getWidth()) + a2, com.meituan.msi.util.f.d(a4.getHeight()) + a3), fVar.c);
                a4.recycle();
            } else {
                com.meituan.msi.log.a.a("drawImage" + String.format("image %s not found", asString));
                return false;
            }
        } else if (size == 5 || size == 9) {
            Bitmap a5 = fVar.h.a(fVar.a, asString);
            if (a5 == null) {
                com.meituan.msi.log.a.a("drawImage" + String.format("image %s not found", asString));
                return false;
            }
            float a6 = com.meituan.msi.util.f.a(jsonArray, 3);
            float a7 = com.meituan.msi.util.f.a(jsonArray, 4);
            if (a6 == 0.0f || a7 == 0.0f) {
                return true;
            }
            if (a6 < 0.0f) {
                a6 = -a6;
            }
            if (a7 < 0.0f) {
                a7 = -a7;
            }
            RectF rectF = new RectF(a2, a3, a6 + a2, a7 + a3);
            Rect rect = new Rect(0, 0, a5.getWidth(), a5.getHeight());
            if (size == 9) {
                int d = com.meituan.msi.util.f.d(jsonArray.get(5).getAsInt());
                int d2 = com.meituan.msi.util.f.d(jsonArray.get(6).getAsInt());
                rect = new Rect(d, d2, com.meituan.msi.util.f.d(jsonArray.get(7).getAsInt()) + d, com.meituan.msi.util.f.d(jsonArray.get(8).getAsInt()) + d2);
            }
            if (a5 == null) {
                com.meituan.msi.log.a.a("drawImage" + String.format("image %s not found", asString));
                return false;
            }
            canvas.drawBitmap(a5, rect, rectF, fVar.c);
            a5.recycle();
        }
        return true;
    }
}
