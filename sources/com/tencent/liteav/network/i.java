package com.tencent.liteav.network;

import com.dianping.titans.js.JsBridgeResult;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class i {
    protected JSONObject a;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public String a;
        public String b;
        public List<Integer> c;
    }

    public i(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public String a() {
        if (e() != null) {
            return e().a;
        }
        if (c().size() != 0) {
            List<Integer> j = j();
            if (j != null) {
                for (j jVar : c()) {
                    if (j.contains(Integer.valueOf(jVar.a()))) {
                        return jVar.a;
                    }
                }
            }
            return c().get(0).a;
        } else if (d() != null) {
            return d().a;
        } else {
            return null;
        }
    }

    public String b() {
        try {
            JSONObject jSONObject = this.a.getJSONObject("coverInfo");
            if (jSONObject != null) {
                return jSONObject.getString("coverUrl");
            }
            return null;
        } catch (JSONException e) {
            TXCLog.e("TXPlayInfoResponse", "get cover url failed.", e);
            return null;
        }
    }

    public List<j> c() {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = this.a.getJSONObject("videoInfo").getJSONArray("transcodeList");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    j jVar = new j();
                    jVar.a = jSONObject.getString("url");
                    jVar.e = jSONObject.getInt("duration");
                    jVar.c = jSONObject.getInt("width");
                    jVar.b = jSONObject.getInt("height");
                    jVar.d = Math.max(jSONObject.getInt("totalSize"), jSONObject.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE));
                    jVar.f = jSONObject.getInt("bitrate");
                    jVar.i = jSONObject.getInt("definition");
                    jVar.g = jSONObject.getString("container");
                    jVar.h = jSONObject.getString("templateName");
                    arrayList.add(jVar);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public j d() {
        try {
            JSONObject jSONObject = this.a.getJSONObject("videoInfo").getJSONObject("sourceVideo");
            j jVar = new j();
            jVar.a = jSONObject.getString("url");
            jVar.e = jSONObject.getInt("duration");
            jVar.c = jSONObject.getInt("width");
            jVar.b = jSONObject.getInt("height");
            jVar.d = Math.max(jSONObject.getInt(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE), jSONObject.getInt("totalSize"));
            jVar.f = jSONObject.getInt("bitrate");
            return jVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public j e() {
        try {
            JSONObject jSONObject = this.a.getJSONObject("videoInfo").getJSONObject("masterPlayList");
            j jVar = new j();
            jVar.a = jSONObject.getString("url");
            return jVar;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String f() {
        try {
            JSONObject jSONObject = this.a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("name");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String g() {
        try {
            JSONObject jSONObject = this.a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("description");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String h() {
        try {
            return this.a.getJSONObject("playerInfo").getString("defaultVideoClassification");
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<a> i() {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = this.a.getJSONObject("playerInfo").getJSONArray("videoClassification");
            for (int i = 0; i < jSONArray.length(); i++) {
                a aVar = new a();
                aVar.a = jSONArray.getJSONObject(i).getString("id");
                aVar.b = jSONArray.getJSONObject(i).getString("name");
                aVar.c = new ArrayList();
                JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray("definitionList");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    aVar.c.add(Integer.valueOf(jSONArray2.getInt(i2)));
                }
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<Integer> j() {
        List<a> i = i();
        String h = h();
        if (h == null || i == null) {
            return null;
        }
        for (a aVar : i) {
            if (aVar.a.equals(h)) {
                return aVar.c;
            }
        }
        return null;
    }

    public j a(String str, String str2) {
        List<Integer> list;
        List<a> i = i();
        if (str != null && i != null) {
            for (a aVar : i) {
                if (aVar.a.equals(str)) {
                    list = aVar.c;
                    break;
                }
            }
        }
        list = null;
        if (list != null) {
            Iterator<j> it = c().iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (list.contains(Integer.valueOf(next.i)) && (next.e() == null || next.e().contains(str2))) {
                    return next;
                }
            }
        }
        return null;
    }

    public j b(String str, String str2) {
        if (str == null) {
            return null;
        }
        Iterator<j> it = c().iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (str.equals(next.f()) && (next.e() == null || next.e().contains(str2))) {
                return next;
            }
        }
        return null;
    }
}
