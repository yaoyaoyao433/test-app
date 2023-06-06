package com.meituan.mmp.lib.api.canvas.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements com.meituan.mmp.lib.api.canvas.e {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final String a() {
        return "drawImage";
    }

    @Override // com.meituan.mmp.lib.api.canvas.e
    public final boolean a(com.meituan.mmp.lib.api.canvas.i iVar, Canvas canvas, JSONArray jSONArray) {
        Object[] objArr = {iVar, canvas, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af2850284d57ce80a09e78db7f6168fb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af2850284d57ce80a09e78db7f6168fb")).booleanValue();
        }
        int length = jSONArray.length();
        if (length < 3) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if (TextUtils.isEmpty(optString)) {
            return false;
        }
        float a2 = com.meituan.mmp.lib.utils.p.a(jSONArray, 1);
        float a3 = com.meituan.mmp.lib.utils.p.a(jSONArray, 2);
        if (length == 3) {
            Bitmap a4 = iVar.i.a(iVar.b, optString);
            if (a4 == null) {
                com.meituan.mmp.lib.trace.b.d("drawImage", String.format("image %s not found", optString));
                return false;
            }
            canvas.drawBitmap(a4, new Rect(0, 0, a4.getWidth(), a4.getHeight()), new RectF(a2, a3, com.meituan.mmp.lib.utils.p.a(a4.getWidth()) + a2, com.meituan.mmp.lib.utils.p.a(a4.getHeight()) + a3), iVar.d);
            a4.recycle();
        } else if (length == 5 || length == 9) {
            Bitmap a5 = iVar.i.a(iVar.b, optString);
            if (a5 == null) {
                com.meituan.mmp.lib.trace.b.d("drawImage", String.format("image %s not found", optString));
                return false;
            }
            float a6 = com.meituan.mmp.lib.utils.p.a(jSONArray, 3);
            float a7 = com.meituan.mmp.lib.utils.p.a(jSONArray, 4);
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
            if (length == 9) {
                int a8 = com.meituan.mmp.lib.utils.p.a(jSONArray.optInt(5));
                int a9 = com.meituan.mmp.lib.utils.p.a(jSONArray.optInt(6));
                rect = new Rect(a8, a9, com.meituan.mmp.lib.utils.p.a(jSONArray.optInt(7)) + a8, com.meituan.mmp.lib.utils.p.a(jSONArray.optInt(8)) + a9);
            }
            if (a5 == null) {
                com.meituan.mmp.lib.trace.b.d("drawImage", String.format("image %s not found", optString));
                return false;
            }
            canvas.drawBitmap(a5, rect, rectF, iVar.d);
            a5.recycle();
        }
        return true;
    }
}
