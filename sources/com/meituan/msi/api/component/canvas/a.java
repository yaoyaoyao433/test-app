package com.meituan.msi.api.component.canvas;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.meituan.msi.api.component.canvas.imp.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    public JsonArray c;
    public f d;
    b e;
    public e f;

    public a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90bdb3fca44559cfd16b214402f7928", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90bdb3fca44559cfd16b214402f7928");
            return;
        }
        this.f = eVar;
        this.d = new f();
        this.e = new b();
    }

    public final boolean a(Canvas canvas) {
        ak akVar;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6183ac46e7c1569c1a91bece54467cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6183ac46e7c1569c1a91bece54467cc")).booleanValue();
        }
        this.b = false;
        if (this.c == null || this.c.size() == 0) {
            return false;
        }
        Matrix matrix = canvas.getMatrix();
        matrix.reset();
        canvas.setMatrix(matrix);
        this.d.d.clear();
        this.d.e.clear();
        this.d.b.reset();
        this.d.c.reset();
        this.d.b.setStyle(Paint.Style.STROKE);
        this.d.c.setStyle(Paint.Style.FILL);
        this.d.b.setAntiAlias(true);
        this.d.c.setAntiAlias(true);
        this.d.b.setStrokeWidth(com.meituan.msi.util.f.c(1));
        this.d.c.setStrokeWidth(com.meituan.msi.util.f.c(1));
        for (int i = 0; i < this.c.size(); i++) {
            JsonObject asJsonObject = this.c.get(i).getAsJsonObject();
            if (asJsonObject != null) {
                try {
                    String asString = asJsonObject.get("method").getAsString();
                    JsonArray asJsonArray = asJsonObject.get("data").getAsJsonArray();
                    if (asJsonArray != null && (akVar = this.e.b.get(asString)) != null) {
                        akVar.a(this.d, canvas, asJsonArray);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }
}
