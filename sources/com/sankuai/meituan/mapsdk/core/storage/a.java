package com.sankuai.meituan.mapsdk.core.storage;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.storage.c;
import com.sankuai.meituan.mapsdk.core.render.b;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import java.io.File;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.meituan.mapfoundation.storage.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void a(String str, c cVar, long j, long j2) {
        Object[] objArr = {str, cVar, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908309064ea061b68a2aba1dd131dd1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908309064ea061b68a2aba1dd131dd1f");
            return;
        }
        a(str, cVar, "onConfigExceed");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, j);
            jSONObject.put("exceed", j2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(str, "onConfigExceed", jSONObject);
    }

    private void a(String str, c cVar, String str2) {
        Object[] objArr = {str, cVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8e9cea36ca9ea07a948c19d82d9ee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8e9cea36ca9ea07a948c19d82d9ee6");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("bID", str);
            jSONObject.put("configs", a(cVar.c));
            jSONObject.put("datas", a(cVar.d));
            jSONObject.put("caches", a(cVar.e));
            jSONObject.put("enableClearData", cVar.f);
            jSONObject.put("enableClearCache", cVar.g);
        } catch (Exception e) {
            e.printStackTrace();
        }
        f.a(null, 3, "no_key", getClass(), str2, 600, jSONObject.toString());
    }

    private String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0602ca067d062105b9a88665b5a48505", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0602ca067d062105b9a88665b5a48505");
        }
        if (strArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (String str : strArr) {
            if (str != null) {
                String[] split = str.split("/");
                if (split.length > 0) {
                    sb.append(split[split.length - 1]);
                    sb.append(',');
                }
            }
        }
        if (sb.length() > 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(']');
        return sb.toString();
    }

    private void a(String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d1c0a1fcf112e3d7ed5d4510e5432b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d1c0a1fcf112e3d7ed5d4510e5432b");
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("bID", str);
            jSONObject.put("action", str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        f.a(null, 3, "no_key", getClass(), str2, 601, jSONObject.toString());
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void a(String str, c cVar, long j) {
        Object[] objArr = {str, cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb13a65dfa77e8d2fcdd375e8903757", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb13a65dfa77e8d2fcdd375e8903757");
        } else if (cVar == null) {
        } else {
            File i = b.i();
            boolean a2 = i.exists() ? b.a(i.getAbsolutePath(), cVar.b) : false;
            a(str, cVar, "onStorageExceed");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, cVar.b);
                jSONObject.put("exceed", j);
                jSONObject.put("clearStatus", a2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            a(str, "onStorageExceed", jSONObject);
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void b(String str, c cVar, long j) {
        Object[] objArr = {str, cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90be201a16d4216e929e5a9de1e60bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90be201a16d4216e929e5a9de1e60bc");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("maxTTL", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(str, "onCleanExpiredCacheStart", jSONObject);
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void c(String str, c cVar, long j) {
        Object[] objArr = {str, cVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb29c59f75f8a3ee7064201325feea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb29c59f75f8a3ee7064201325feea0");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("expired", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        a(str, "onCleanExpiredCacheOver", jSONObject);
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void a(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e72761e4588884039670579e25d46f1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e72761e4588884039670579e25d46f1b");
        } else {
            a(str, "onClearCacheStart", (JSONObject) null);
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void b(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3781b827d60446ed63fb4fa893a882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3781b827d60446ed63fb4fa893a882");
        } else {
            a(str, "onClearCacheOver", (JSONObject) null);
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void c(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee88baf48fe45ec1321335128266ce1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee88baf48fe45ec1321335128266ce1e");
        } else {
            a(str, "onClearDataStart", (JSONObject) null);
        }
    }

    @Override // com.sankuai.meituan.mapfoundation.storage.a
    public final void d(String str, c cVar) {
        Object[] objArr = {str, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf524cf8f38d7721cf37dc12e628580b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf524cf8f38d7721cf37dc12e628580b");
        } else {
            a(str, "onClearDataOver", (JSONObject) null);
        }
    }
}
