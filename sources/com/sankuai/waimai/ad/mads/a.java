package com.sankuai.waimai.ad.mads;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.mads.c;
import com.sankuai.mads.d;
import com.sankuai.mads.g;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.platform.utils.o;
import com.sankuai.waimai.pouch.monitor.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.h;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final OkHttpClient b = new OkHttpClient();
    private static Executor c = o.a();

    public static void a(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42912ed1101b7636d040aaa402922058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42912ed1101b7636d040aaa402922058");
        } else {
            c.a(application, new kotlin.jvm.functions.a<c.a>() { // from class: com.sankuai.waimai.ad.mads.a.1
                public static ChangeQuickRedirect a;

                @Override // kotlin.jvm.functions.a
                public final /* synthetic */ c.a invoke() {
                    d.a aVar;
                    d.a aVar2;
                    d.a aVar3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b0944b668da32a399d7a851b92303369", RobustBitConfig.DEFAULT_VALUE)) {
                        return (c.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b0944b668da32a399d7a851b92303369");
                    }
                    d.a aVar4 = new d.a();
                    Object[] objArr3 = {null};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar4, changeQuickRedirect3, false, "b3ca4161af62c2a48448a83b35933810", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (d.a) PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "b3ca4161af62c2a48448a83b35933810");
                    } else {
                        aVar = aVar4;
                        aVar.d = null;
                    }
                    a.InterfaceC0637a a2 = i.a("oknv");
                    Object[] objArr4 = {a2};
                    ChangeQuickRedirect changeQuickRedirect4 = d.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "c770571b46d8fc1722bbd86243e79d4c", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar2 = (d.a) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "c770571b46d8fc1722bbd86243e79d4c");
                    } else {
                        h.b(a2, "rawCallFactory");
                        aVar2 = aVar;
                        aVar2.c = a2;
                    }
                    com.sankuai.mads.h hVar = new com.sankuai.mads.h() { // from class: com.sankuai.waimai.ad.mads.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.mads.h
                        public final void a(@NotNull g gVar) {
                            Object[] objArr5 = {gVar};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1e52a2c1a72460ae55d56b23c369aa58", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1e52a2c1a72460ae55d56b23c369aa58");
                            } else {
                                com.sankuai.waimai.platform.capacity.ad.a.a(gVar.b.f == 1 ? "DEFER" : "DIRECT", gVar.c);
                            }
                        }
                    };
                    Object[] objArr5 = {hVar};
                    ChangeQuickRedirect changeQuickRedirect5 = d.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "645d24a98a8bbf4f892e381767923c7b", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar3 = (d.a) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "645d24a98a8bbf4f892e381767923c7b");
                    } else {
                        h.b(hVar, "reportListener");
                        aVar3 = aVar2;
                        aVar3.e = hVar;
                    }
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = d.a.a;
                    c.a aVar5 = new c.a(PatchProxy.isSupport(objArr6, aVar3, changeQuickRedirect6, false, "a772e67b4429ad2afe756e8a3bc960d0", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr6, aVar3, changeQuickRedirect6, false, "a772e67b4429ad2afe756e8a3bc960d0") : new d(aVar3, null));
                    aVar5.b = Integer.valueOf(com.sankuai.waimai.config.a.a().d());
                    aVar5.c = new com.sankuai.mads.a() { // from class: com.sankuai.waimai.ad.mads.a.1.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.mads.a
                        public final boolean b() {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0c68c613e622d6186b67bb6dc20a5fc4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0c68c613e622d6186b67bb6dc20a5fc4")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) application, "upload_mach_ad_event", false);
                        }

                        @Override // com.sankuai.mads.a
                        @NotNull
                        public final Map<String, String> a() {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7da6c1dd1d3e667031ccdae97c7e6838", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Map) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7da6c1dd1d3e667031ccdae97c7e6838");
                            }
                            HashMap hashMap = new HashMap();
                            List<MtBackCityInfo> s = com.sankuai.waimai.foundation.location.v2.h.s();
                            if (s != null && !s.isEmpty()) {
                                for (MtBackCityInfo mtBackCityInfo : s) {
                                    if (mtBackCityInfo.level == 1) {
                                        hashMap.put("c1", mtBackCityInfo.id);
                                    } else if (mtBackCityInfo.level == 2) {
                                        hashMap.put("c2", mtBackCityInfo.id);
                                    } else if (mtBackCityInfo.level == 3) {
                                        hashMap.put("c3", mtBackCityInfo.id);
                                    }
                                }
                            }
                            return hashMap;
                        }
                    };
                    return aVar5;
                }
            });
        }
    }

    public static void a(int i, b.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65c8ce233ce598c588da6ca36f3bdedb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65c8ce233ce598c588da6ca36f3bdedb");
            return;
        }
        if (i <= 0) {
            e.a(new com.sankuai.waimai.ad.monitor.a().a("ad_report").b("report_error_adType_zero").c("adType_zero").d(a(i, aVar.c, aVar.b)).b(), (Map<String, String>) null);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
        c.a(PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d8ea819c85ebdb459a3a33b68a5e1ba4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d8ea819c85ebdb459a3a33b68a5e1ba4") : new b(aVar, null));
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07332b5657cd7ec53b3a4a345bc5b4f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07332b5657cd7ec53b3a4a345bc5b4f0");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            final HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", com.sankuai.waimai.platform.b.A().J());
            final List<String> b2 = b(str);
            Object[] objArr2 = {b2, hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "02b134e99008a057425aa625e9000954", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "02b134e99008a057425aa625e9000954");
                return;
            }
            com.sankuai.waimai.platform.capacity.ad.a.a(b2);
            com.sankuai.waimai.launcher.util.aop.b.a(c, new Runnable() { // from class: com.sankuai.waimai.ad.mads.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2ee32897b502e785bc0b45b887ecee4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2ee32897b502e785bc0b45b887ecee4c");
                    } else if (!com.sankuai.waimai.foundation.utils.b.b(b2)) {
                        for (String str2 : b2) {
                            try {
                                if (!TextUtils.isEmpty(str2)) {
                                    Request.Builder builder = new Request.Builder();
                                    builder.url(str2);
                                    try {
                                        if (hashMap != null && !hashMap.isEmpty()) {
                                            for (Map.Entry entry : hashMap.entrySet()) {
                                                builder.addHeader((String) entry.getKey(), (String) entry.getValue());
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                    a.b.newCall(builder.build()).execute();
                                }
                            } catch (Exception e) {
                                com.sankuai.waimai.foundation.utils.log.a.b("ThirdPartUpload", e.getMessage(), new Object[0]);
                            }
                        }
                    }
                }
            });
        }
    }

    private static List<String> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e98364607f263a62b3de49d3b362f50d", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e98364607f263a62b3de49d3b362f50d");
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add((String) jSONArray.get(i));
            }
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        return arrayList.size() > 5 ? arrayList.subList(0, 5) : arrayList;
    }

    private static String a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7924353bd9b3eaf526d1319eb2cf79f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7924353bd9b3eaf526d1319eb2cf79f7");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adType", i);
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            jSONObject.put("event_id", str2);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
