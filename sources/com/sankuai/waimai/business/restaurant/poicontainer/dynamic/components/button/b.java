package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.button;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.g;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.d;
import com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview.e;
import com.sankuai.waimai.platform.widget.RoundRectImageView;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a<ConstraintLayout> {
    public static ChangeQuickRedirect i;
    private g j;
    private g k;
    private g l;
    private com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c m;
    private com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c n;
    private com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c o;
    private a p;
    private LinearLayout q;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        LEFT,
        RIGHT,
        NONE,
        BOTH;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d16c216164ea1f777dcfc47bda62a12f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d16c216164ea1f777dcfc47bda62a12f");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c343b38a89baa3936b727d7fc1b28ea", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c343b38a89baa3936b727d7fc1b28ea") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a3916f08561307431b5db2183afd8cbc", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a3916f08561307431b5db2183afd8cbc") : (a[]) values().clone();
        }
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c11d779026596f94892455ae39691d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c11d779026596f94892455ae39691d8");
            return;
        }
        this.p = a.NONE;
        if (d.a(context)) {
            this.b = (ConstraintLayout) e.a(context, R.layout.wm_restaurant_dy_composite_btn);
        } else {
            this.b = (ConstraintLayout) LayoutInflater.from(context).inflate(R.layout.wm_restaurant_dy_composite_btn, (ViewGroup) null);
        }
        this.q = (LinearLayout) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_foreground);
        this.j = new g(context, (TextView) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_soldout_text));
        this.k = new g(context, (TextView) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_text));
        this.l = new g(context, (TextView) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_dot));
        this.m = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c(context, (RoundRectImageView) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_bg));
        this.n = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c(context, (RoundRectImageView) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_icon_left));
        this.o = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.c(context, (RoundRectImageView) ((ConstraintLayout) this.b).findViewById(R.id.dy_composite_btn_icon_right));
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7953b13b0e5ad9167710921129ea2062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7953b13b0e5ad9167710921129ea2062");
            return;
        }
        super.a(jSONObject);
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("background_img");
        if (optJSONObject != null) {
            try {
                if (!optJSONObject.has("width")) {
                    optJSONObject.put("width", 0);
                }
                if (!optJSONObject.has("height")) {
                    optJSONObject.put("height", 0);
                }
            } catch (JSONException unused) {
            }
        }
        this.m.a(optJSONObject);
        if (optJSONObject != null) {
            this.m.a(0);
        } else {
            this.m.a(8);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("left_icon_img");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("right_icon_img");
        if (optJSONObject2 != null && optJSONObject3 != null) {
            this.p = a.BOTH;
        } else if (optJSONObject2 == null && optJSONObject3 == null) {
            this.p = a.NONE;
        } else if (optJSONObject2 == null) {
            this.p = a.RIGHT;
        } else {
            this.p = a.LEFT;
        }
        this.n.a(optJSONObject2);
        this.o.a(optJSONObject3);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa8549c370ceb3b8b28b00a014ed1a07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa8549c370ceb3b8b28b00a014ed1a07");
        } else if (this.p == a.LEFT) {
            this.o.a(8);
            this.n.a(0);
        } else if (this.p == a.RIGHT) {
            this.n.a(8);
            this.o.a(0);
        } else if (this.p == a.NONE) {
            this.o.a(8);
            this.n.a(8);
        }
        this.l.a(jSONObject.optJSONObject("choose_text"));
        this.k.a(jSONObject.optJSONObject("text"));
        if (jSONObject.has("soldout_text")) {
            this.j.a(jSONObject.optJSONObject("soldout_text"));
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfa603466b2b092563b659110663d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfa603466b2b092563b659110663d1e");
            return;
        }
        super.b(jSONObject);
        if (jSONObject == null) {
            a(8);
            return;
        }
        int optInt = jSONObject.optInt("num_in_dot");
        if (optInt > 0) {
            String valueOf = String.valueOf(optInt);
            if (optInt >= 100) {
                valueOf = "...";
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("text", valueOf);
            this.l.a().setContentDescription("已添加" + valueOf + "份");
            this.l.b(jSONObject2);
        } else {
            this.l.a(8);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pre_text");
        if (optJSONObject != null) {
            this.j.b(optJSONObject);
        }
        this.k.b(jSONObject);
        a(0);
    }
}
