package com.meituan.mmp.lib.api.canvas;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    public JSONArray c;
    public i d;
    b e;
    public h f;

    public a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2244e002c96112a75c4f30ac6147a3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2244e002c96112a75c4f30ac6147a3a");
            return;
        }
        this.f = hVar;
        this.d = new i(this);
        this.e = new b();
    }

    public final boolean a(Canvas canvas) {
        e eVar;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f62f523125aa21df7c6d8698b99680b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f62f523125aa21df7c6d8698b99680b")).booleanValue();
        }
        this.b = false;
        if (this.c == null || this.c.length() == 0) {
            return false;
        }
        Matrix matrix = canvas.getMatrix();
        matrix.reset();
        canvas.setMatrix(matrix);
        this.d.e.clear();
        this.d.f.clear();
        this.d.c.reset();
        this.d.d.reset();
        this.d.c.setStyle(Paint.Style.STROKE);
        this.d.d.setStyle(Paint.Style.FILL);
        this.d.c.setAntiAlias(true);
        this.d.d.setAntiAlias(true);
        this.d.c.setStrokeWidth(p.a(1));
        this.d.d.setStrokeWidth(p.a(1));
        for (int i = 0; i < this.c.length(); i++) {
            JSONObject optJSONObject = this.c.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    String optString = optJSONObject.optString("method");
                    JSONArray optJSONArray = optJSONObject.optJSONArray("data");
                    if (optJSONArray != null && (eVar = this.e.b.get(optString)) != null) {
                        eVar.a(this.d, canvas, optJSONArray);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public final void a(final JSONArray jSONArray, final d dVar) {
        Object[] objArr = {jSONArray, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70bd2f4775a0bc912db0f98545bc1421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70bd2f4775a0bc912db0f98545bc1421");
        } else {
            this.f.a(new Runnable() { // from class: com.meituan.mmp.lib.api.canvas.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8df11b7cf528da0f2e4f715c3c6bf6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8df11b7cf528da0f2e4f715c3c6bf6d");
                        return;
                    }
                    a.this.c = jSONArray;
                    a.this.b = true;
                    dVar.a();
                }
            });
        }
    }

    public final void b(final JSONArray jSONArray, final d dVar) {
        Object[] objArr = {jSONArray, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a4a263884ebe4da7d13a28d54901353", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a4a263884ebe4da7d13a28d54901353");
        } else if (jSONArray == null || jSONArray.length() == 0) {
        } else {
            this.f.a(new Runnable() { // from class: com.meituan.mmp.lib.api.canvas.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7055518886b84c35483f26f2861e636", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7055518886b84c35483f26f2861e636");
                        return;
                    }
                    if (a.this.c == null) {
                        a.this.c = jSONArray;
                    } else {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            a.this.c.put(jSONArray.opt(i));
                        }
                    }
                    a.this.b = true;
                    if (dVar != null) {
                        dVar.a();
                    }
                }
            });
        }
    }
}
