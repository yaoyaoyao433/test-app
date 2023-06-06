package com.dianping.live.status;

import com.dianping.live.live.utils.j;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public d e;
    public ArrayList<C0090c> f;
    public b g;
    public String h;
    public String i;
    public long j;

    public c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee41c5f79f865e518d9443bd113decdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee41c5f79f865e518d9443bd113decdf");
            return;
        }
        try {
            this.b = jSONObject.optString("businessFigure");
            this.c = jSONObject.optString("businessId");
            this.d = jSONObject.optString("pageSource");
            JSONObject optJSONObject = jSONObject.optJSONObject("style");
            if (optJSONObject != null) {
                this.e = new d(optJSONObject);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("picsInfo");
            if (optJSONArray != null) {
                this.f = new ArrayList<>();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f.add(new C0090c(optJSONArray.getJSONObject(i)));
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("moveScope");
            if (optJSONObject2 != null) {
                this.g = new b(optJSONObject2);
            }
        } catch (Exception e) {
            e.printStackTrace();
            j.a("MLiveStatusWidgetModel create exception" + com.dianping.util.exception.a.a(e));
        }
    }

    public final Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a13311adb9164a4e924357240ccf8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a13311adb9164a4e924357240ccf8a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("businessFigure", this.b);
        hashMap.put("businessId", this.c);
        hashMap.put("pageSource", this.d);
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d {
        public float a;
        public float b;
        public float c;
        public float d;
        public a e;

        public d(JSONObject jSONObject) {
            try {
                this.a = (float) jSONObject.optDouble(Constants.GestureMoveEvent.KEY_X, 0.0d);
                this.b = (float) jSONObject.optDouble(Constants.GestureMoveEvent.KEY_Y, 0.0d);
                this.c = (float) jSONObject.optDouble("h", 0.0d);
                this.d = (float) jSONObject.optDouble("w", 0.0d);
                JSONObject optJSONObject = jSONObject.optJSONObject("corner");
                if (optJSONObject != null) {
                    this.e = new a(optJSONObject);
                }
            } catch (Exception e) {
                e.printStackTrace();
                j.a("MLiveStatusWidget create exception" + com.dianping.util.exception.a.a(e));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public float a;
        public float b;
        public float c;
        public float d;

        public a(JSONObject jSONObject) {
            try {
                this.a = (float) jSONObject.optDouble("leftTop", 0.0d);
                this.b = (float) jSONObject.optDouble("rightTop", 0.0d);
                this.c = (float) jSONObject.optDouble("rightBottom", 0.0d);
                this.d = (float) jSONObject.optDouble("leftBottom", 0.0d);
            } catch (Exception e) {
                e.printStackTrace();
                j.a("MLiveStatusWidgetCorner create exception" + com.dianping.util.exception.a.a(e));
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.live.status.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0090c {
        public float a;
        public float b;
        public float c;
        public float d;
        public String e;

        public C0090c(JSONObject jSONObject) {
            try {
                this.a = (float) jSONObject.optDouble(Constants.GestureMoveEvent.KEY_X, 0.0d);
                this.b = (float) jSONObject.optDouble(Constants.GestureMoveEvent.KEY_Y, 0.0d);
                this.d = (float) jSONObject.optDouble("h", 0.0d);
                this.c = (float) jSONObject.optDouble("w", 0.0d);
                this.e = jSONObject.optString(RaptorUploaderImpl.SRC);
            } catch (Exception e) {
                e.printStackTrace();
                j.a("MLiveStatusWidgetPicInfo create exception" + com.dianping.util.exception.a.a(e));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        public float a;
        public float b;
        public float c;
        public float d;

        public b(JSONObject jSONObject) {
            try {
                this.a = (float) jSONObject.optDouble("left", 0.0d);
                this.b = (float) jSONObject.optDouble("right", 0.0d);
                this.c = (float) jSONObject.optDouble("top", 0.0d);
                this.d = (float) jSONObject.optDouble("bottom", 0.0d);
            } catch (Exception e) {
                e.printStackTrace();
                j.a("MLiveStatusWidgetMoveScope create exception" + com.dianping.util.exception.a.a(e));
            }
        }
    }
}
