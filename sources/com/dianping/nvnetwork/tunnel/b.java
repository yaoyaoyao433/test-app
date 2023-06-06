package com.dianping.nvnetwork.tunnel;

import com.dianping.nvnetwork.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "{\"11\":{\"广州\":[\"119.29.126.181\"],\"北京\":[\"103.37.153.12\"]},\"1\":{\"广州\":[\"119.29.126.137\"],\"香港\":[\"101.32.16.204\"],\"上海\":[\"203.76.217.244\",\"103.202.146.44\"]},\"45\":{\"北京\":[\"103.37.142.150\"],\"上海\":[\"103.202.146.42\",\"203.76.217.242\"]},\"default\":{\"广州\":[\"119.29.48.215\"],\"上海\":[\"203.76.217.241\",\"203.76.217.243\"],\"北京\":[\"103.37.153.5\"]},\"15\":{\"广州\":[\"119.29.126.181\"],\"北京\":[\"103.37.153.12\"]},\"16\":{\"广州\":[\"119.29.126.218\"],\"北京\":[\"103.37.153.11\"],\"上海\":[\"203.76.217.196\"]},\"17\":{\"广州\":[\"119.29.126.218\"],\"北京\":[\"103.37.153.11\"],\"上海\":[\"203.76.217.196\"]},\"75\":{\"北京\":[\"103.37.142.150\"],\"上海\":[\"103.202.146.42\",\"203.76.217.242\"]},\"76\":{\"北京\":[\"103.37.142.150\"],\"上海\":[\"103.202.146.42\",\"203.76.217.242\"]},\"10\":{\"北京\":[\"103.37.153.2\",\"101.236.13.9\"],\"广州\":[\"119.29.126.219\"],\"香港\":[\"119.28.229.25\"],\"上海\":[\"203.76.217.195\",\"103.202.146.43\"]}}";
    public static HashMap<String, ArrayList<SocketAddress>> c = new HashMap<>();
    private static boolean d = false;

    public static synchronized void a() {
        synchronized (b.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49be8987dc3b8c0cb020e45b78ad6009", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49be8987dc3b8c0cb020e45b78ad6009");
            } else if (!d) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    JSONObject optJSONObject = jSONObject.optJSONObject(String.valueOf(g.a()));
                    if (optJSONObject == null) {
                        optJSONObject = jSONObject.getJSONObject("default");
                    }
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONArray jSONArray = optJSONObject.getJSONArray(next);
                        ArrayList<SocketAddress> arrayList = new ArrayList<>();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            arrayList.add(new InetSocketAddress(jSONArray.getString(i), 443));
                        }
                        c.put(next, arrayList);
                    }
                    d = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ArrayList<SocketAddress> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04a7bf4a7a4c574d05e183cf877db966", 6917529027641081856L)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04a7bf4a7a4c574d05e183cf877db966");
        }
        if (!d) {
            a();
        }
        return c.containsKey(str) ? c.get(str) : new ArrayList<>(0);
    }
}
