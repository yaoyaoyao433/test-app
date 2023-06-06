package com.dianping.live.report;

import com.dianping.live.live.mrn.list.e;
import com.dianping.live.live.utils.i;
import com.google.gson.JsonObject;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static d b = new d();
    public ScheduledFuture<?> c;
    public Map<String, Map<String, String>> d;
    public String e;
    public String f;
    public e.a g;
    private final String h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed4c4a62643b741986333a9ac8e4943", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed4c4a62643b741986333a9ac8e4943");
            return;
        }
        this.d = new HashMap();
        this.h = "dzu_live_pike";
        this.e = StringUtil.NULL;
    }

    public final void a(String str, String str2, String str3, String str4, String str5, int i, e.a aVar) {
        Object[] objArr = {str, str2, str3, str4, str5, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7ec39ce421a55e6556deee61540875f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7ec39ce421a55e6556deee61540875f");
            return;
        }
        if (!str5.isEmpty()) {
            this.e = str5;
        }
        this.g = aVar;
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("liveId", str);
        hashMap.put("mQuality", str2);
        hashMap.put("mStreamId", str3);
        hashMap.put("mBuId", str4);
        hashMap.put("playStatus", String.valueOf(i));
        this.d.put(str, hashMap);
    }

    public final void a(String str, String str2, double d, Map<String, Object> map) {
        Object[] objArr = {str, str2, Double.valueOf(d), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb1b402721407de381a263bedaf32da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb1b402721407de381a263bedaf32da");
            return;
        }
        String str3 = str == null ? this.f : str;
        if (str3 == null || !this.d.containsKey(str3)) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Double.valueOf(d));
        a(str3, hashMap, map);
    }

    public final void a(String str, Map<String, Double> map, Map<String, Object> map2) {
        Map<String, String> map3;
        Object[] objArr = {str, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694cf8780a41fa427cbe7d03a894ad00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694cf8780a41fa427cbe7d03a894ad00");
            return;
        }
        if (str == null) {
            str = this.f;
        }
        if (this.d == null || !this.d.containsKey(str) || (map3 = this.d.get(str)) == null) {
            return;
        }
        if (!map3.get("playStatus").equals("2")) {
            String str2 = i.e;
            i.a(str2, str + "非直播中状态，丢弃Metrics指标上报");
            return;
        }
        String aVar = this.g != null ? this.g.toString() : "";
        String str3 = map3.get("mStreamId");
        String str4 = map3.get("mQuality");
        String str5 = map3.get("mBuId");
        com.meituan.android.mrn.config.e a2 = com.meituan.android.mrn.config.c.a();
        HashMap hashMap = new HashMap();
        hashMap.put("appID", a2 != null ? String.valueOf(a2.f()) : StringUtil.NULL);
        hashMap.put("MTLIVE_UUID", this.e);
        hashMap.put("MTLIVE_STREAM_ID", str3);
        hashMap.put("MTLIVE_VIDEO_QUALITY", str4);
        hashMap.put("MLIVE_LIVEID", str);
        hashMap.put("MLIVE_BUID", str5);
        hashMap.put("MLIVE_PLATFORM", "Android");
        hashMap.put("MLIVE_PAGE_TYPE", "mrn");
        hashMap.put("MLIVE_CHANNEL_TYPE", aVar);
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            jsonObject.addProperty(entry.getKey(), entry.getValue());
        }
        Babel.logRT(new Log.Builder("").reportChannel("prism-report-mtlive").tag("MLIVE_DATA").value(0L).details(jsonObject.toString()).optional(hashMap).build());
        String str6 = i.e;
        i.a(str6, "details:" + jsonObject.toString() + "\noptional:" + a(hashMap));
    }

    private String a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "834f6c4c92e7efd4514c357524f93634", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "834f6c4c92e7efd4514c357524f93634");
        }
        if (map.size() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("{\n");
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append(':');
                sb.append(entry.getValue() != null ? entry.getValue().toString() : StringUtil.NULL);
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            return sb.toString();
        }
        return "";
    }
}
