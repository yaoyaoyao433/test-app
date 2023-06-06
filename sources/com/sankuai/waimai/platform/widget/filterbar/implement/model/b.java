package com.sankuai.waimai.platform.widget.filterbar.implement.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public ArrayList<a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public long b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public int h;
        public BubbleInfoBean i;
        public int j;
        public String k;
        public String l;
    }

    public static b a(JSONArray jSONArray) {
        a aVar;
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c0d1f436b8c7fed27f36c1e86694f595", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c0d1f436b8c7fed27f36c1e86694f595");
        }
        if (jSONArray == null) {
            return null;
        }
        b bVar = new b();
        bVar.b = new ArrayList<>();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            Object[] objArr2 = {optJSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "52da2470a12a9dc04ae0b552817053b6", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "52da2470a12a9dc04ae0b552817053b6");
            } else if (optJSONObject == null) {
                aVar = null;
            } else {
                a aVar2 = new a();
                aVar2.b = optJSONObject.optLong("code");
                aVar2.c = optJSONObject.optString("name");
                aVar2.d = optJSONObject.optString("short_name");
                aVar2.e = optJSONObject.optString("icon_url");
                aVar2.f = optJSONObject.optString("icon_url_click");
                aVar2.g = optJSONObject.optString("icon_url_reverse");
                aVar2.h = optJSONObject.optInt("position");
                aVar2.i = BubbleInfoBean.fromJson(optJSONObject.optJSONObject("bubble_info"));
                aVar2.j = optJSONObject.optInt("reverse_code");
                aVar2.k = optJSONObject.optString("text_click");
                aVar2.l = optJSONObject.optString("text_reverse");
                aVar = aVar2;
            }
            if (aVar != null) {
                bVar.b.add(aVar);
            }
        }
        return bVar;
    }
}
