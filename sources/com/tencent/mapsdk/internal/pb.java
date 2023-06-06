package com.tencent.mapsdk.internal;

import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.JsonParser;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngDeserializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class pb extends JsonComposer {
    @Json(name = GearsLocator.DETAIL)
    public d a;

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("AoiInfo{");
        stringBuffer.append("poiDetail=");
        stringBuffer.append(this.a);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class d extends JsonComposer {
        @Json(ignore = true)
        public int a = -1;
        @Json(name = "uid")
        String b;
        @Json(name = "name")
        String c;
        @Json(name = "alias")
        String d;
        @Json(name = "type")
        String e;
        @Json(name = "styles")
        List<e> f;
        @Json(name = "shinei_id")
        String g;
        @Json(deserializer = LatLngDeserializer.class, name = "location")
        LatLng h;
        @Json(name = "aoi_info")
        a i;
        @Json(name = "sub_pois")
        public List<d> j;

        public final String a() {
            if (!TextUtils.isEmpty(this.d)) {
                return this.d;
            }
            return this.c;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("PoiDetail{");
            stringBuffer.append("displayId=");
            stringBuffer.append(this.a);
            stringBuffer.append(", poiId='");
            stringBuffer.append(this.b);
            stringBuffer.append('\'');
            stringBuffer.append(", name='");
            stringBuffer.append(this.c);
            stringBuffer.append('\'');
            stringBuffer.append(", alias='");
            stringBuffer.append(this.d);
            stringBuffer.append('\'');
            stringBuffer.append(", type='");
            stringBuffer.append(this.e);
            stringBuffer.append('\'');
            stringBuffer.append(", poiStyles=");
            stringBuffer.append(this.f);
            stringBuffer.append(", indoorId='");
            stringBuffer.append(this.g);
            stringBuffer.append('\'');
            stringBuffer.append(", point=");
            stringBuffer.append(this.h);
            stringBuffer.append(", poiArea=");
            stringBuffer.append(this.i);
            stringBuffer.append(", subPois=");
            stringBuffer.append(this.j);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class e extends JsonComposer {
        @Json(ignore = true)
        BitmapDescriptor a;
        @Json(ignore = true)
        BitmapDescriptor b;
        @Json(name = "style_class")
        int c;
        @Json(name = "icon_url")
        String d;
        @Json(name = "icon_type")
        int e;
        @Json(name = "font_color")
        String f;
        @Json(name = "font_size")
        int g;
        @Json(name = "font_stroke_color")
        String h;
        @Json(name = "font_stroke_width")
        int i;
        @Json(name = "level")
        int j;
        @Json(name = "zindex")
        int k;
        @Json(name = "aoi")
        c l;

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("PoiStyle{");
            stringBuffer.append("icon=");
            stringBuffer.append(this.a);
            stringBuffer.append(", type=");
            stringBuffer.append(this.c);
            stringBuffer.append(", iconUrl='");
            stringBuffer.append(this.d);
            stringBuffer.append('\'');
            stringBuffer.append(", iconDisplayType=");
            stringBuffer.append(this.e);
            stringBuffer.append(", fontColor='");
            stringBuffer.append(this.f);
            stringBuffer.append('\'');
            stringBuffer.append(", fontSize=");
            stringBuffer.append(this.g);
            stringBuffer.append(", fontStrokeColor='");
            stringBuffer.append(this.h);
            stringBuffer.append('\'');
            stringBuffer.append(", fontStrokeWidth=");
            stringBuffer.append(this.i);
            stringBuffer.append(", level=");
            stringBuffer.append(this.j);
            stringBuffer.append(", zindex=");
            stringBuffer.append(this.k);
            stringBuffer.append(", aoiStyle=");
            stringBuffer.append(this.l);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c extends JsonComposer {
        @Json(name = "fill_color")
        String a;
        @Json(name = "stroke_color")
        String b;
        @Json(name = "stroke_width")
        int c;

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("AoiStyle{");
            stringBuffer.append("fillColor='");
            stringBuffer.append(this.a);
            stringBuffer.append('\'');
            stringBuffer.append(", strokeColor='");
            stringBuffer.append(this.b);
            stringBuffer.append('\'');
            stringBuffer.append(", strokeWidth=");
            stringBuffer.append(this.c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a extends JsonComposer {
        @Json(name = "aoi_latitude")
        String a;
        @Json(name = "aoi_longitude")
        String b;
        @Json(name = "area")
        b c;

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer("PoiArea{");
            stringBuffer.append("latitude=");
            stringBuffer.append(this.a);
            stringBuffer.append(", longitude=");
            stringBuffer.append(this.b);
            stringBuffer.append(", area=");
            stringBuffer.append(this.c);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b extends JsonComposer implements JsonParser.Deserializer<List<List<LatLng>>> {
        @Json(name = "type")
        String a;
        @Json(deserializer = b.class, name = "coordinates")
        List<List<LatLng>> b;

        public final String toString() {
            int[] iArr;
            int i;
            if (this.b != null) {
                i = this.b.size();
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = this.b.get(i2).size();
                }
            } else {
                iArr = null;
                i = 0;
            }
            StringBuffer stringBuffer = new StringBuffer("AreaData{");
            stringBuffer.append("type='");
            stringBuffer.append(this.a);
            stringBuffer.append('\'');
            stringBuffer.append(", coordinates=");
            stringBuffer.append(i);
            stringBuffer.append("#");
            stringBuffer.append(Arrays.toString(iArr));
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        private static List<List<LatLng>> a(Object obj) throws JSONException {
            if (obj != null && (obj instanceof JSONArray)) {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    Object obj2 = jSONArray.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    if (obj2 instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj2;
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            Object obj3 = jSONArray2.get(i2);
                            if (obj3 instanceof JSONArray) {
                                JSONArray jSONArray3 = (JSONArray) obj3;
                                if (jSONArray3.length() == 2) {
                                    arrayList2.add(new LatLng(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                                }
                            }
                        }
                        if (arrayList2.size() != length2) {
                            kj.c("coordinates's data deserialize error!!");
                        }
                    }
                    arrayList.add(arrayList2);
                }
                if (arrayList.size() != length) {
                    kj.c("coordinates's area deserialize error!!");
                }
                return arrayList;
            }
            return null;
        }

        @Override // com.tencent.map.tools.json.JsonParser.Deserializer
        public final /* synthetic */ List<List<LatLng>> deserialize(Object obj, String str, Object obj2) throws JSONException {
            if (obj2 == null || !(obj2 instanceof JSONArray)) {
                return null;
            }
            JSONArray jSONArray = (JSONArray) obj2;
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj3 = jSONArray.get(i);
                ArrayList arrayList2 = new ArrayList();
                if (obj3 instanceof JSONArray) {
                    JSONArray jSONArray2 = (JSONArray) obj3;
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object obj4 = jSONArray2.get(i2);
                        if (obj4 instanceof JSONArray) {
                            JSONArray jSONArray3 = (JSONArray) obj4;
                            if (jSONArray3.length() == 2) {
                                arrayList2.add(new LatLng(jSONArray3.optDouble(1), jSONArray3.optDouble(0)));
                            }
                        }
                    }
                    if (arrayList2.size() != length2) {
                        kj.c("coordinates's data deserialize error!!");
                    }
                }
                arrayList.add(arrayList2);
            }
            if (arrayList.size() != length) {
                kj.c("coordinates's area deserialize error!!");
            }
            return arrayList;
        }
    }
}
