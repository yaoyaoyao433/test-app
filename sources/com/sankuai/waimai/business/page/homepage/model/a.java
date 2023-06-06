package com.sankuai.waimai.business.page.homepage.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public ArrayList<C0796a> d;
    public ArrayList<C0796a> e;
    private long f;
    private long g;
    private String h;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.homepage.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0796a {
        public static ChangeQuickRedirect a;
        public long b;
        public long c;

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f06ac056b1e4ad4a44c546a098350ec8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f06ac056b1e4ad4a44c546a098350ec8");
            } else if (jSONObject != null) {
                this.b = jSONObject.optLong("startTime");
                this.c = jSONObject.optLong("endTime");
            }
        }

        public final JSONObject a() throws JSONException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8d14719e41008c2ca11d2a4d4865401", RobustBitConfig.DEFAULT_VALUE)) {
                return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8d14719e41008c2ca11d2a4d4865401");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startTime", this.b);
            jSONObject.put("endTime", this.c);
            return jSONObject;
        }
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121ee510c4ca2182cb7e23d7ff64359b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121ee510c4ca2182cb7e23d7ff64359b");
        } else if (jSONObject != null) {
            this.id = jSONObject.optLong("id");
            this.activityId = jSONObject.optInt("activity_id");
            this.f = jSONObject.optLong("stime");
            this.g = jSONObject.optLong("etime");
            this.h = jSONObject.optString("pic_url");
            this.screenType = jSONObject.optInt("screen_type");
            this.b = jSONObject.optInt("pic_width");
            this.c = jSONObject.optInt("pic_height");
            this.topColor = jSONObject.optString("top_color");
            this.bottomColor = jSONObject.optString("bottom_color");
            this.textColor = jSONObject.optString("text_color");
            this.btnText = jSONObject.optString("btn_text");
            this.clickImageUrl = jSONObject.optString("click_image_url");
            this.opacity = jSONObject.optDouble("opacity");
            this.matUrl = jSONObject.optString("mat_url");
            this.dspLogo = jSONObject.optString("dsp_logo");
            this.matHeight = jSONObject.optInt("mat_height");
            this.matWidth = jSONObject.optInt("mat_width");
            this.matType = jSONObject.optInt("mat_type");
            this.isAd = jSONObject.optInt("is_ad");
            this.showMode = jSONObject.optInt("show_mode");
            this.yyActivityType = jSONObject.optInt("activity_type");
            this.landingPageUrl = jSONObject.optString("landing_page_url");
            JSONArray optJSONArray = jSONObject.optJSONArray("cycle_time");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                this.e = new ArrayList<>(length);
                for (int i = 0; i < length; i++) {
                    C0796a c0796a = new C0796a();
                    c0796a.a(optJSONArray.optJSONObject(i));
                    this.e.add(c0796a);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("daily_time");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                return;
            }
            int length2 = optJSONArray2.length();
            this.d = new ArrayList<>(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                C0796a c0796a2 = new C0796a();
                c0796a2.a(optJSONArray2.optJSONObject(i2));
                this.d.add(c0796a2);
            }
        }
    }

    public final JSONObject a() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8934a201484fcb623581b263f32afc3f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8934a201484fcb623581b263f32afc3f");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.id);
        jSONObject.put("activity_id", this.activityId);
        jSONObject.put("stime", this.f);
        jSONObject.put("etime", this.g);
        jSONObject.put("pic_url", this.h);
        jSONObject.put("pic_width", this.b);
        jSONObject.put("pic_height", this.c);
        jSONObject.put("screen_type", this.screenType);
        jSONObject.put("mat_url", this.matUrl);
        jSONObject.put("dsp_logo", this.dspLogo);
        jSONObject.put("mat_height", this.matHeight);
        jSONObject.put("mat_width", this.matWidth);
        jSONObject.put("mat_type", this.matType);
        jSONObject.put("landing_page_url", this.landingPageUrl);
        jSONObject.put("is_ad", this.isAd);
        jSONObject.put("show_mode", this.showMode);
        jSONObject.put("activity_type", this.yyActivityType);
        jSONObject.put("top_color", this.topColor);
        jSONObject.put("bottom_color", this.bottomColor);
        jSONObject.put("text_color", this.textColor);
        jSONObject.put("btn_text", this.btnText);
        jSONObject.put("click_image_url", this.clickImageUrl);
        jSONObject.put("opacity", this.opacity);
        if (this.e != null && this.e.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator<C0796a> it = this.e.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().a());
            }
            jSONObject.put("cycle_time", jSONArray);
        }
        if (this.d != null && this.d.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<C0796a> it2 = this.d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(it2.next().a());
            }
            jSONObject.put("daily_time", jSONArray2);
        }
        return jSONObject;
    }
}
