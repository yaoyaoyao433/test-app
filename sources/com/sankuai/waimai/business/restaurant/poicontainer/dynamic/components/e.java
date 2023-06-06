package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends a<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.b> {
    public static ChangeQuickRedirect i;
    public int j;
    private String k;
    private double l;
    private double m;
    private JSONObject n;
    private g o;
    private g p;
    private g q;
    private g r;
    private int s;
    private int t;
    private int u;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a44a4ecf41ad4354ebd00da50cd9ea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a44a4ecf41ad4354ebd00da50cd9ea8");
            return;
        }
        this.j = -1;
        this.b = new com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.b(this.c);
        this.o = new g(this.c, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.b) this.b).getPrice_text());
        this.p = new g(this.c, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.b) this.b).getPrice_hint_text());
        this.q = new g(this.c, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.b) this.b).getPrice_origin_text());
        this.r = new g(this.c, ((com.sankuai.waimai.business.restaurant.poicontainer.dynamic.view.b) this.b).getPrice_trail_text());
        this.s = 11;
        this.t = this.c.getResources().getColor(R.color.wm_common_text_money);
        this.u = this.c.getResources().getColor(R.color.ceres_all_9);
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daad8e90ebc1ef363a8692b7d12f67dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daad8e90ebc1ef363a8692b7d12f67dd");
            return;
        }
        super.a(jSONObject);
        if (jSONObject == null || this.b == 0) {
            return;
        }
        this.u = ColorUtils.a(jSONObject.optString("price_disabled_color"), this.c.getResources().getColor(R.color.ceres_all_9));
        this.s = (int) jSONObject.optDouble("price_unit_size", 11.0d);
        this.n = jSONObject.optJSONObject("tag_style");
        this.o.a(jSONObject.optJSONObject("price_style"));
        this.p.a(jSONObject.optJSONObject("price_hint_style"));
        this.q.a(jSONObject.optJSONObject("price_origin_style"));
        this.r.a(jSONObject.optJSONObject("price_tail_style"));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0343  */
    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(org.json.JSONObject r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.e.b(org.json.JSONObject):void");
    }
}
