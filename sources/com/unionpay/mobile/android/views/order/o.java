package com.unionpay.mobile.android.views.order;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import com.unionpay.mobile.android.views.order.AbstractMethod;
import com.unionpay.mobile.android.views.order.CViewMethods;
import com.unionpay.mobile.android.views.order.b;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class o extends LinearLayout {
    private Context a;
    private int b;
    private int c;
    private JSONObject d;
    private JSONObject e;
    private JSONObject f;
    private Drawable g;
    private JSONArray h;
    private List<Map<String, Object>> i;
    private String j;
    private AbstractMethod k;
    private CViewMethods l;
    private Drawable m;
    private boolean n;

    /* loaded from: classes6.dex */
    public interface a extends AbstractMethod.a, AbstractMethod.b, CViewMethods.a, b.InterfaceC1514b {
    }

    private o(Context context) {
        super(context);
        this.b = l.a.intValue();
        this.c = l.a.intValue();
        this.a = context;
        setOrientation(1);
    }

    public static o a(Context context, Drawable drawable) {
        o oVar = new o(context);
        oVar.g = drawable;
        return oVar;
    }

    public static o a(Context context, Drawable drawable, Drawable drawable2) {
        o oVar = new o(context);
        oVar.m = drawable2;
        oVar.b = l.c.intValue();
        oVar.c = l.c.intValue();
        oVar.g = drawable;
        oVar.c();
        return oVar;
    }

    public static o a(Context context, JSONArray jSONArray, List<Map<String, Object>> list, Drawable drawable, Drawable drawable2, String str) {
        o oVar = new o(context);
        oVar.m = drawable2;
        oVar.b = l.b.intValue();
        oVar.c = l.b.intValue();
        oVar.g = drawable;
        oVar.h = jSONArray;
        oVar.i = list;
        oVar.j = str;
        oVar.c();
        return oVar;
    }

    public static o b(Context context, JSONArray jSONArray, List<Map<String, Object>> list, Drawable drawable, Drawable drawable2, String str) {
        o oVar = new o(context);
        oVar.m = drawable2;
        oVar.b = l.e.intValue();
        oVar.c = l.e.intValue();
        oVar.g = drawable;
        oVar.h = jSONArray;
        oVar.i = list;
        oVar.j = str;
        oVar.c();
        return oVar;
    }

    public final int a() {
        return this.b;
    }

    public final o a(int i) {
        this.c = i;
        return this;
    }

    public final o a(Drawable drawable) {
        this.m = drawable;
        return this;
    }

    public final o a(a aVar) {
        if (this.k != null) {
            this.k.a((AbstractMethod.b) aVar);
            this.k.a((AbstractMethod.a) aVar);
            if (this.k instanceof b) {
                ((b) this.k).a((b.InterfaceC1514b) aVar);
            }
        }
        if (this.l != null) {
            this.l.a(aVar);
        }
        return this;
    }

    public final o a(String str) {
        this.j = str;
        return this;
    }

    public final o a(List<Map<String, Object>> list) {
        this.i = list;
        return this;
    }

    public final o a(JSONArray jSONArray) {
        this.h = jSONArray;
        return this;
    }

    public final o a(JSONObject jSONObject) {
        this.d = jSONObject;
        if (this.k != null && (this.k instanceof b)) {
            ((b) this.k).a(this.d);
        }
        return this;
    }

    public final o a(boolean z) {
        this.n = z;
        return this;
    }

    public final o b(int i) {
        this.b = i;
        return this;
    }

    public final o b(Drawable drawable) {
        if (this.k != null) {
            this.k.a(drawable);
        }
        return this;
    }

    public final o b(JSONObject jSONObject) {
        this.e = jSONObject;
        if (this.k != null && (this.k instanceof i)) {
            ((i) this.k).a(this.e);
        }
        return this;
    }

    public final String b() {
        if (this.k == null || !(this.k instanceof i)) {
            return null;
        }
        return ((i) this.k).h();
    }

    public final void b(String str) {
        ((b) this.k).b(str);
    }

    public final o c(JSONObject jSONObject) {
        this.f = jSONObject;
        if (this.k != null && (this.k instanceof i)) {
            ((i) this.k).b(this.f);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.views.order.o.c():void");
    }

    public final void c(int i) {
        if (this.k == null || !(this.k instanceof b)) {
            return;
        }
        ((b) this.k).a(i);
    }
}
