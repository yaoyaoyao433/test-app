package com.sankuai.meituan.mapsdk.mapcore.report;

import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public a b;
    public String c;
    public String d;
    public String e;
    public Map<String, Object> f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        Type_MV,
        Type_MC;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca9bdf472de405ec0c24075a06a6aea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca9bdf472de405ec0c24075a06a6aea");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6da0a294647f8d551ebdc9fcd80576b7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6da0a294647f8d551ebdc9fcd80576b7") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "974000c6e066abb77a03e1afe2c96630", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "974000c6e066abb77a03e1afe2c96630") : (a[]) values().clone();
        }
    }

    public d(a aVar, String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ab1d1e94b37d43445f6fea200ac417", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ab1d1e94b37d43445f6fea200ac417");
            return;
        }
        this.b = a.Type_MV;
        this.b = aVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = map;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e71299a1bd004539732340fb8835ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e71299a1bd004539732340fb8835ba");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(RemoteMessageConst.Notification.CHANNEL_ID, this.c);
            jSONObject.put("pageId", this.d);
            jSONObject.put("eventId", this.e);
            if (this.f != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Object> entry : this.f.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put(GetAppInfoJsHandler.EXTRA_EXTRAS, jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
