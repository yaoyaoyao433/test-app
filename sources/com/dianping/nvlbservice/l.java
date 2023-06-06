package com.dianping.nvlbservice;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import dianping.com.nvlinker.NVLinker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static HashMap<String, List<h>> b = a("{\n\t\"11\": {\n\t\t\"广州\": [\"119.29.126.181\"],\n\t\t\"北京\": [\"103.37.153.12\"]\n\t},\n\t\"1\": {\n\t\t\"广州\": [\"119.29.126.137\"],\n\t\t\"香港\": [\"101.32.16.204\"],\n\t\t\"上海\": [\"203.76.217.244\", \"103.202.146.44\"]\n\t},\n\t\"45\": {\n\t\t\"北京\": [\"103.37.142.150\"],\n\t\t\"上海\": [\"103.202.146.42\", \"203.76.217.242\"]\n\t},\n\t\"default\": {\n\t\t\"广州\": [\"119.29.48.215\"],\n\t\t\"上海\": [\"203.76.217.241\", \"203.76.217.243\"],\n\t\t\"北京\": [\"103.37.153.5\"]\n\t},\n\t\"15\": {\n\t\t\"广州\": [\"119.29.126.181\"],\n\t\t\"北京\": [\"103.37.153.12\"]\n\t},\n\t\"16\": {\n\t\t\"广州\": [\"119.29.126.218\"],\n\t\t\"北京\": [\"103.37.153.11\"],\n\t\t\"上海\": [\"203.76.217.196\"]\n\t},\n\t\"17\": {\n\t\t\"广州\": [\"119.29.126.218\"],\n\t\t\"北京\": [\"103.37.153.11\"],\n\t\t\"上海\": [\"203.76.217.196\"]\n\t},\n\t\"75\": {\n\t\t\"北京\": [\"103.37.142.150\"],\n\t\t\"上海\": [\"103.202.146.42\", \"203.76.217.242\"]\n\t},\n\t\"76\": {\n\t\t\"北京\": [\"103.37.142.150\"],\n\t\t\"上海\": [\"103.202.146.42\", \"203.76.217.242\"]\n\t},\n\t\"10\": {\n\t\t\"北京\": [\"103.37.153.2\", \"101.236.13.9\"],\n\t\t\"广州\": [\"119.29.126.219\"],\n\t\t\"香港\": [\"119.28.229.25\"],\n\t\t\"上海\": [\"203.76.217.195\", \"103.202.146.43\"]\n\t}\n}", m.SHARK.g);
    private static HashMap<String, List<h>> c = a("{\n\t\"16\": {\n\t\t\"广州\": [\"42.193.128.49\", \"42.193.128.197\"],\n\t\t\"上海\": [\"203.76.217.7\", \"103.202.146.51\"],\n\t\t\"北京\": [\"101.236.65.42\", \"101.236.9.151\"]\n\t},\n\t\"1\": {\n\t\t\"广州\": [\"42.193.128.87\", \"42.193.128.37\"],\n\t\t\"上海\": [\"203.76.217.53\", \"103.202.146.49\"],\n\t\t\"北京\": [\"101.236.65.52\", \"103.37.155.120\"]\n\t},\n\t\"default\": {\n\t\t\"广州\": [\"42.193.128.160\"],\n\t\t\"上海\": [\"103.202.146.30\", \"203.76.217.51\"],\n\t\t\"北京\": [\"103.37.155.77\", \"101.236.65.85\"]\n\t}\n}", m.QUIC.g);

    private static HashMap<String, List<h>> a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cce55f6526d7ae90c8774404516011f", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cce55f6526d7ae90c8774404516011f");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(String.valueOf(NVLinker.getAppID()));
            if (optJSONObject == null) {
                optJSONObject = jSONObject.getJSONObject("default");
            }
            HashMap<String, List<h>> hashMap = new HashMap<>();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = optJSONObject.getJSONArray(next);
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(new h(jSONArray.getString(i2), 443, i));
                }
                hashMap.put(next, arrayList);
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    public static List<h> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b77cce5e46832408d1e53adf14129a2f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b77cce5e46832408d1e53adf14129a2f") : b.containsKey(str) ? b.get(str) : new ArrayList(0);
    }

    public static List<h> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77d085a7b2c8ff7c54b161a15c058ff5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77d085a7b2c8ff7c54b161a15c058ff5") : c.containsKey(str) ? c.get(str) : new ArrayList(0);
    }

    public static List<h> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a12b50dabd84e5f45d3d4676379c8e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a12b50dabd84e5f45d3d4676379c8e9");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h("103.37.142.137", 443, m.SHARK_WHALE.g));
        arrayList.add(new h("203.76.217.247", 443, m.SHARK_WHALE.g));
        return arrayList;
    }

    public static List<h> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f451bdfe42f25ea22e00359f15d390c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f451bdfe42f25ea22e00359f15d390c");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h("101.236.65.52", 443, m.QUIC.g));
        arrayList.add(new h("203.76.217.53", 443, m.QUIC.g));
        arrayList.add(new h("42.193.128.87", 443, m.QUIC.g));
        return arrayList;
    }

    public static List<h> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32ebfcdf5f1ea53381cfa7e86651ef36", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32ebfcdf5f1ea53381cfa7e86651ef36");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h("103.202.146.20", 443, m.PIKE.g));
        arrayList.add(new h("103.37.142.230", 443, m.PIKE.g));
        return arrayList;
    }
}
