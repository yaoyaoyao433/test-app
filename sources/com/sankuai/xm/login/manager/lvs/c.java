package com.sankuai.xm.login.manager.lvs;

import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final int b;
    private long c;

    public c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e1512dcba985165895a0f7fcd4a5c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e1512dcba985165895a0f7fcd4a5c5");
            return;
        }
        this.c = DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME;
        this.b = i;
    }

    public final e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fa03b7fc6bf8c0687c644c44d3b126", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fa03b7fc6bf8c0687c644c44d3b126");
        }
        com.sankuai.xm.network.setting.e e = com.sankuai.xm.network.setting.f.a().b().e();
        com.sankuai.xm.base.service.f b = m.b();
        String b2 = b(e);
        String a2 = a(e);
        long j = b.getLong(b2, 0L);
        String string = b.getString(a2, "{}");
        if (System.currentTimeMillis() - j > this.c || ac.a(string)) {
            com.sankuai.xm.login.d.a("IPStore::loadLocalData:: cache invalidate");
            return null;
        }
        return b(string);
    }

    public final List<a> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245b66b0684f6d807b118c6ef36732a0", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245b66b0684f6d807b118c6ef36732a0");
        }
        String a2 = com.sankuai.xm.network.setting.f.a().b().a(this.b);
        if (ac.a(a2)) {
            return null;
        }
        return c(m.b().getString(a(a2), "{}"));
    }

    public final void a(boolean z, int i, List<a> list) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e29b522f32fa141e4a7e6d9ba8e13c0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e29b522f32fa141e4a7e6d9ba8e13c0b");
            return;
        }
        String a2 = a(i, list);
        com.sankuai.xm.base.service.f b = m.b();
        com.sankuai.xm.network.setting.e e = com.sankuai.xm.network.setting.f.a().b().e();
        b.a(a(e), a2);
        if (z) {
            b.a(b(e), System.currentTimeMillis());
        }
    }

    public final void a(List<a> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd5832fce1c37586cdd5f63fc3d65827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd5832fce1c37586cdd5f63fc3d65827");
        } else {
            m.b().a(a(str), a(list));
        }
    }

    private String a(com.sankuai.xm.network.setting.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebb5183dbf28ba586d97e8770c0fe06", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebb5183dbf28ba586d97e8770c0fe06");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b == 1 ? "CR_" : "");
        sb.append("ELEPHANT_SDK_ADDRESS_KEY_V2_");
        sb.append(eVar);
        return sb.toString();
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0912824d8937f39650529133d125541d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0912824d8937f39650529133d125541d");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b == 1 ? "CR_" : "");
        sb.append("ELEPHANT_SDK_FALLBACK_ADDRESS_KEY_V2_");
        sb.append(str);
        return sb.toString();
    }

    private String b(com.sankuai.xm.network.setting.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af05a6f84bf551275e26c3e86b8b31a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af05a6f84bf551275e26c3e86b8b31a");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.b == 1 ? "CR_" : "");
        sb.append("ELEPHANT_SDK_ADDRESS_TIME_V2_");
        sb.append(eVar);
        return sb.toString();
    }

    private String a(int i, List<a> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9879a4ec407930743354b3b808862de5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9879a4ec407930743354b3b808862de5");
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", 2);
            jSONObject.put("lvs_max_rank", i);
            JSONArray jSONArray = new JSONArray();
            for (a aVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                aVar.a(jSONObject2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("data", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private String a(List<a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7c326102d8aec2368b1879117c6c164", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7c326102d8aec2368b1879117c6c164");
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (a aVar : list) {
                JSONObject jSONObject2 = new JSONObject();
                aVar.a(jSONObject2);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("data", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private e b(String str) {
        e eVar;
        JSONObject jSONObject;
        ArrayList arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ca177c56e9ed9a22c1ed62e8f1bbf3", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ca177c56e9ed9a22c1ed62e8f1bbf3");
        }
        try {
            jSONObject = new JSONObject(str);
            arrayList = new ArrayList();
        } catch (Exception e) {
            e = e;
            eVar = null;
        }
        if (jSONObject.optInt("version") != 2) {
            com.sankuai.xm.login.d.a("IPStore::getJsonAddress:: lvs not in version 2");
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("data");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            a a2 = a.a();
            a2.b(jSONObject2);
            if (a2.b()) {
                arrayList.add(a2);
            }
        }
        eVar = new e();
        try {
            eVar.b = arrayList;
            eVar.a = jSONObject.optInt("lvs_max_rank");
        } catch (Exception e2) {
            e = e2;
            com.sankuai.xm.login.d.a(e, "IPStore::getJsonAddress:: lvs exception", new Object[0]);
            return eVar;
        }
        return eVar;
    }

    private List<a> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e71f6e9d7fe8c410700c32a786d65b38", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e71f6e9d7fe8c410700c32a786d65b38");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                a a2 = a.a();
                a2.b(jSONObject2);
                if (a2.b()) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.sankuai.xm.login.d.a(e, "IPStore::getJsonAddress:: lvs exception", new Object[0]);
            return null;
        }
    }
}
