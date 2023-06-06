package com.meituan.mmp.lib.api.coverview;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    boolean b;
    private String c;
    private int d;
    private com.meituan.mmp.lib.interfaces.c e;
    private c f;
    private Runnable g;
    private volatile boolean h;

    public d(String str, int i, com.meituan.mmp.lib.interfaces.c cVar, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), cVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309146dca9737d64cc11523468e57bd1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309146dca9737d64cc11523468e57bd1");
            return;
        }
        this.b = true;
        this.g = new Runnable() { // from class: com.meituan.mmp.lib.api.coverview.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject jSONObject;
                JSONException e;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47a06236fb7c6de8d5357401a94692bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47a06236fb7c6de8d5357401a94692bf");
                } else if (d.this.h) {
                    try {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", d.this.c);
                        } catch (JSONException e2) {
                            e = e2;
                            e.printStackTrace();
                            d.this.e.a("onLongPress", jSONObject, d.this.d);
                        }
                    } catch (JSONException e3) {
                        jSONObject = null;
                        e = e3;
                    }
                    d.this.e.a("onLongPress", jSONObject, d.this.d);
                }
            }
        };
        this.h = false;
        this.c = str;
        this.d = i;
        this.e = cVar;
        this.f = new c(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.coverview.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
