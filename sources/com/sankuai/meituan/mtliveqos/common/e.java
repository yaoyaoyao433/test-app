package com.sankuai.meituan.mtliveqos.common;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.privacy.locate.f;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.meituan.mtliveqos.common.c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static Map<String, String> c;
    private static a f;
    private static final Executor b = com.sankuai.android.jarvis.c.a("MTliveQos");
    private static final Map<String, String> d = new HashMap();
    private static final Map<String, String> e = new HashMap();

    public static /* synthetic */ boolean a() {
        return e();
    }

    public static /* synthetic */ void c(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map map, Map map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b6b7842b0769e1059376111e4f464ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b6b7842b0769e1059376111e4f464ab");
            return;
        }
        if (map != null) {
            map.put("MTLIVE_CURRENT_DURATION", Float.valueOf((float) bVar.o));
            map.put("MTLIVE_LOCAL_TIMESTAMP", Float.valueOf((float) (bVar.p / 1000)));
            map.put("MTLIVE_MEMORY_USAGE", Float.valueOf(com.sankuai.meituan.mtliveqos.utils.e.c(context)));
        }
        if (map2 != null) {
            map2.putAll(e(context));
            map2.putAll(c(context));
            map2.putAll(b(context, bVar));
        }
    }

    public static /* synthetic */ void d(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map map, Map map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "807fc1d69ca9052da21605eb3efc6a18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "807fc1d69ca9052da21605eb3efc6a18");
            return;
        }
        a d2 = d();
        f = d2;
        if (d2 == null) {
            a(context, bVar, b("mLiveReport == null", "sendToBabel"), map2);
            return;
        }
        try {
            HashMap hashMap = new HashMap(map);
            HashMap hashMap2 = new HashMap(map2);
            if (hashMap.containsKey("MTLIVE_IS_FROZEN")) {
                Float f2 = (Float) hashMap.get("MTLIVE_IS_FROZEN");
                hashMap2.put("MTLIVE_IS_FROZEN_STATUS", (f2 == null || f2.floatValue() <= 0.0f) ? "0" : "1");
                hashMap.put("MTLIVE_IS_FROZEN", Float.valueOf(1.0f));
            }
            f.sendToBabel(bVar.f, hashMap, hashMap2);
        } catch (Exception e2) {
            if (e()) {
                Log.e("LiveMetricMonitor", "sendToBabel: ", e2);
            }
            a(context, bVar, b(e2.getMessage(), "sendToBabel"), map2);
        }
    }

    public static /* synthetic */ void e(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, Map map, Map map2) {
        int c2;
        int i;
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f35be9081b244cd8dff553579b2ec5bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f35be9081b244cd8dff553579b2ec5bb");
            return;
        }
        a d2 = d();
        f = d2;
        if (d2 == null) {
            a(context, bVar, b("mLiveReport == null", "sendToLiveMonitoringBackground"), map2);
            return;
        }
        try {
            HashMap hashMap = new HashMap(map);
            HashMap hashMap2 = new HashMap(map2);
            a aVar = f;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "17137d9a6cc855f712329ec80dc53722", RobustBitConfig.DEFAULT_VALUE)) {
                c2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "17137d9a6cc855f712329ec80dc53722")).intValue();
            } else {
                b b2 = com.sankuai.meituan.mtliveqos.b.b();
                if (b2 == null) {
                    i = 0;
                    aVar.sendToLiveMonitoringBackground(context, i, bVar.f, hashMap, hashMap2);
                }
                c2 = b2.c();
            }
            i = c2;
            aVar.sendToLiveMonitoringBackground(context, i, bVar.f, hashMap, hashMap2);
        } catch (Exception e2) {
            if (e()) {
                Log.e("LiveMetricMonitor", "sendToLiveMonitoringBackground: ", e2);
            }
            a(context, bVar, b(e2.getMessage(), "sendToLiveMonitoringBackground"), map2);
        }
    }

    public static void a(@NonNull final Context context, @NonNull final com.sankuai.meituan.mtliveqos.statistic.b bVar, @NonNull final com.sankuai.meituan.mtliveqos.statistic.c cVar, @NonNull final Map<String, String> map) {
        Object[] objArr = {context, bVar, cVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "746dc9696e7abd01102dd86cf97296aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "746dc9696e7abd01102dd86cf97296aa");
        } else if (bVar == null || cVar == null) {
        } else {
            a d2 = d();
            f = d2;
            if (d2 == null) {
                return;
            }
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.mtliveqos.common.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e37ae45fa9fd731ee74f5f2aaa7cd2fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e37ae45fa9fd731ee74f5f2aaa7cd2fd");
                        return;
                    }
                    Map map2 = map;
                    map2.put(SnifferDBHelper.COLUMN_LOG, cVar.b + CommonConstant.Symbol.MINUS + cVar.c + CommonConstant.Symbol.MINUS + cVar.d);
                    map.putAll(e.e(context));
                    map.putAll(e.c(context));
                    map.putAll(e.b(context, bVar));
                    map.put("MTLIVE_LOCAL_TIMESTAMP", String.valueOf(bVar.p));
                    map.put("MTLIVE_STREAM_URL", String.valueOf(bVar.i));
                    map.put("MTLIVE_MEMORY_USAGE", String.valueOf(com.sankuai.meituan.mtliveqos.utils.e.c(context)));
                    try {
                        if (e.a()) {
                            new StringBuilder("Logan: log  = ").append(map.toString());
                        }
                        a aVar = e.f;
                        Map<String, String> map3 = map;
                        aVar.log(map3, new String[]{bVar.e.h + CommonConstant.Symbol.UNDERLINE + bVar.d});
                    } catch (Exception e2) {
                        if (e.a()) {
                            Log.e("LiveMetricMonitor", "log: ", e2);
                        }
                    }
                }
            });
        }
    }

    public static void a(@NonNull final Context context, @NonNull final Map<String, String> map, final String str) {
        Object[] objArr = {context, map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ae0a27370b8728af70950ca6a6460b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ae0a27370b8728af70950ca6a6460b1");
            return;
        }
        a d2 = d();
        f = d2;
        if (d2 == null) {
            return;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.mtliveqos.common.e.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79ac18ec737c98b51fa64d26d7f86e96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79ac18ec737c98b51fa64d26d7f86e96");
                    return;
                }
                map.putAll(e.e(context));
                map.putAll(e.c(context));
                try {
                    if (e.a()) {
                        new StringBuilder("Logan: log  = ").append(map.toString());
                    }
                    e.f.log(map, new String[]{str});
                } catch (Exception e2) {
                    if (e.a()) {
                        Log.e("LiveMetricMonitor", "log: ", e2);
                    }
                }
            }
        });
    }

    public static void a(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "370d1d12b8fba0a0beb9bc05b4cfceea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "370d1d12b8fba0a0beb9bc05b4cfceea");
            return;
        }
        a d2 = d();
        f = d2;
        if (d2 != null) {
            f.register(str, dVar);
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ae36e588bd023b09523321f91855fc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ae36e588bd023b09523321f91855fc5");
        }
        a d2 = d();
        f = d2;
        if (d2 != null) {
            return f.accessCache(str);
        }
        return null;
    }

    public static void a(@NonNull final Context context, @NonNull final com.sankuai.meituan.mtliveqos.statistic.b bVar, Map<String, Float> map, @NonNull final Map<String, String> map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be97b0189488ac4643a9498d2602467d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be97b0189488ac4643a9498d2602467d");
        } else if (bVar == null) {
        } else {
            final HashMap hashMap = map == null ? new HashMap() : map;
            if (hashMap.isEmpty()) {
                hashMap.put("none", Float.valueOf(1.0f));
            }
            final boolean z = false;
            Object[] objArr2 = {context, bVar, hashMap, map2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3dd719a7b6c679508b1073c8edfbbddb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3dd719a7b6c679508b1073c8edfbbddb");
            } else if (bVar == null || hashMap == null || map2 == null) {
            } else {
                z = (c.g.RIVER_RUN == bVar.e || c.g.MLVB == bVar.e) ? true : true;
                com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.mtliveqos.common.e.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b904b58f51744477ae3629111db3220a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b904b58f51744477ae3629111db3220a");
                        } else if (z) {
                            e.c(context, bVar, hashMap, map2);
                            boolean a2 = com.sankuai.meituan.mtliveqos.utils.d.a(map2);
                            if (!a2) {
                                String str = (String) map2.get("MTLIVE_STREAM_URL");
                                e.a(context, bVar, e.b("解析url失败 = " + str, "sendToBabel"), map2);
                                new StringBuilder("splitStreamUrl failed : ").append(str);
                            }
                            if (e.a()) {
                                HashMap hashMap2 = new HashMap();
                                hashMap2.put("指标", hashMap);
                                hashMap2.put("维度", map2);
                                hashMap2.put("splitStreamUrl isSuccess", Boolean.valueOf(a2));
                                new StringBuilder("sendKVs:  指标及维度= ").append(new JSONObject(hashMap2).toString());
                            }
                            e.d(context, bVar, hashMap, map2);
                            e.e(context, bVar, hashMap, map2);
                        }
                    }
                });
            }
        }
    }

    public static void b(@NonNull final Context context, @NonNull final com.sankuai.meituan.mtliveqos.statistic.b bVar, @NonNull final Map<String, Float> map, @NonNull final Map<String, String> map2) {
        Object[] objArr = {context, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c63d43b97c86c5a17248d0e4b3ffe41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c63d43b97c86c5a17248d0e4b3ffe41");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(b, new Runnable() { // from class: com.sankuai.meituan.mtliveqos.common.e.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44334be714943150ab100825869ffecb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44334be714943150ab100825869ffecb");
                        return;
                    }
                    e.c(context, bVar, map, map2);
                    e.d(context, bVar, map, map2);
                }
            });
        }
    }

    public static void a(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull com.sankuai.meituan.mtliveqos.statistic.b bVar, @NonNull Map<String, Float> map, @NonNull Map<String, String> map2) {
        Object[] objArr = {context, str, str2, bVar, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98c38e387e1b910baa932ce9f2fc4a3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98c38e387e1b910baa932ce9f2fc4a3e");
            return;
        }
        bVar.f = true;
        map2.put(c.b.MTLIVE_ADD_MATRIX_EVENT_VALUE.C, str2);
        map2.put(c.b.MTLIVE_ADD_MATRIX_EVENT_NAME.C, str);
        b(context, bVar, map, map2);
    }

    @Deprecated
    public static void a(@NonNull Context context, @NonNull com.sankuai.meituan.mtliveqos.statistic.b bVar, @NonNull c.b bVar2, @NonNull long j, @NonNull Map<String, String> map) {
        Object[] objArr = {context, bVar, bVar2, new Long(j), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "192a844c22c8c3b6a93a37cadd8f8d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "192a844c22c8c3b6a93a37cadd8f8d62");
        } else if (bVar2 == null) {
            a(context, bVar, b("事件名称为null", "sendEvent"), map);
        } else {
            a(context, bVar, bVar2.C, String.valueOf(j), map);
        }
    }

    public static void a(@NonNull Context context, @NonNull com.sankuai.meituan.mtliveqos.statistic.b bVar, @NonNull String str, @NonNull String str2, @NonNull Map<String, String> map) {
        Object[] objArr = {context, bVar, str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb4ab40d210f57e00a153bb29b2a3282", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb4ab40d210f57e00a153bb29b2a3282");
        } else {
            a(context, bVar, str, str2, (Map<String, Float>) null, map);
        }
    }

    public static void a(@NonNull Context context, @NonNull com.sankuai.meituan.mtliveqos.statistic.b bVar, @NonNull String str, @NonNull String str2, Map<String, Float> map, @NonNull Map<String, String> map2) {
        Object[] objArr = {context, bVar, str, str2, map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc498e93cc441f0b76f6ba7faa9a5c42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc498e93cc441f0b76f6ba7faa9a5c42");
            return;
        }
        bVar.f = true;
        map2.put(c.b.MTLIVE_ADD_EXTRA_EVENT_TIMESTAMP.C, str2);
        map2.put(c.b.MTLIVE_ADD_EXTRA_EVENT_NAME.C, str);
        map2.put(c.b.MTLIVE_ADD_MATRIX_EVENT_VALUE.C, str2);
        map2.put(c.b.MTLIVE_ADD_MATRIX_EVENT_NAME.C, str);
        a(context, bVar, map, map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> b(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df8f15fd978078dccdef9942f42f72b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df8f15fd978078dccdef9942f42f72b4");
        }
        c.put("MTLIVE_SDK_VERSION", bVar.h);
        d.put("MTLIVE_NET", String.valueOf(com.sankuai.meituan.mtliveqos.utils.c.a(context, com.sankuai.meituan.mtliveqos.utils.c.a() * 8.0f)));
        e.put("MTLIVE_PROJECTID", bVar.c);
        e.put("MTLIVE_STREAM_URL", bVar.i);
        e.put("MTLIVE_RESOLUTION", bVar.b);
        e.put("MTLIVE_TRANSPORT_PROTOCOL", String.valueOf(bVar.j ? 1 : 0));
        e.put("MTLIVE_ENCODE_TYPE", bVar.n == null ? "" : String.valueOf(bVar.n.e));
        e.put("MTLIVE_DECODE_TYPE", bVar.m == null ? "" : String.valueOf(bVar.m.e));
        e.put("MTLIVE_ROOM_ID", bVar.g);
        e.put("MTLIVE_CDN_SID", bVar.s);
        e.put("MTLIVE_DYNAMIC_BUFFER_IS_OPEN", String.valueOf(bVar.t));
        if (c.EnumC0620c.HARDWARE == bVar.m) {
            e.put("MTLIVE_DECODER_NAME", "MediaCodec");
        } else if (c.EnumC0620c.SOFTWARE == bVar.m) {
            e.put("MTLIVE_DECODER_NAME", "AVCodec");
        }
        if (bVar.d == c.f.PLAY) {
            e.put("MTLIVE_DECODE_FORMAT", bVar.q);
        }
        if (bVar.d == c.f.PUSH) {
            e.put("MTLIVE_ENCODE_FORMAT", bVar.r);
        }
        if (!TextUtils.isEmpty(bVar.k)) {
            bVar.k = bVar.k.replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE);
        }
        if (!TextUtils.isEmpty(bVar.l)) {
            bVar.l = bVar.l.replace(CommonConstant.Symbol.COLON, CommonConstant.Symbol.UNDERLINE);
        }
        e.put("MTLIVE_SERVER_IP", bVar.k);
        e.put("MTLIVE_LOCAL_IP", bVar.l);
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89b06da4cb45b82d1704c258fe6c637c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89b06da4cb45b82d1704c258fe6c637c");
        }
        d.put("MTLIVE_BUILD_TYPE", e() ? GetAppInfoJsHandler.PACKAGE_TYPE_DEV : "prod");
        d.put("MTLIVE_USERID", f());
        d.put("MTLIVE_NETWORK_TYPE", com.sankuai.meituan.mtliveqos.utils.d.a(com.sankuai.meituan.mtliveqos.utils.c.a(context)));
        String f2 = f(context);
        String uuid = GetUUID.getInstance().getUUID(context);
        Map<String, String> map = d;
        if (TextUtils.isEmpty(f2)) {
            f2 = uuid;
        }
        map.put("MTLIVE_UNIONID", f2);
        d.put("MTLIVE_UUID", uuid);
        d.put("MTLIVE_REGION", g());
        d.put("MTLIVE_DEVICE_LEVEL", d(context));
        d.put("MTLIVE_PROVINCE", c());
        return d;
    }

    private static String c() {
        Bundle extras;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca94c921048bdddc579ec4bd2c2bc664", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca94c921048bdddc579ec4bd2c2bc664");
        }
        MtLocation a2 = f.a().a("MTLiveQosLibrary");
        if (a2 == null || (extras = a2.getExtras()) == null) {
            return "";
        }
        String string = extras.getString("province");
        return TextUtils.isEmpty(string) ? "" : string;
    }

    private static String d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ca2067a4775dbc1d6d0d4c46f6d8ab6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ca2067a4775dbc1d6d0d4c46f6d8ab6");
        }
        try {
            DeviceUtil.LEVEL deviceLevel = DeviceUtil.getDeviceLevel(context);
            return deviceLevel == DeviceUtil.LEVEL.HIGH ? "HIGH" : deviceLevel == DeviceUtil.LEVEL.MIDDLE ? "MIDDLE" : deviceLevel == DeviceUtil.LEVEL.LOW ? "LOW" : "UN_KNOW";
        } catch (Exception e2) {
            Log.e("LiveMetricMonitor", "getLevelString: ", e2);
            return "UN_KNOW";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> e(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2a6dec560c9143041455e39a122a47f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2a6dec560c9143041455e39a122a47f");
        }
        if (c != null) {
            return c;
        }
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("MTLIVE_MODEL", Build.MODEL);
        c.put("MTLIVE_OS_VERSION", Build.VERSION.RELEASE);
        c.put("MTLIVE_APP_VERSION", com.sankuai.meituan.mtliveqos.utils.e.a(context));
        c.put("MTLIVE_PLATFORM", "Android");
        c.put("MTLIVE_BUNDLE_ID", com.sankuai.meituan.mtliveqos.utils.e.b(context));
        return c;
    }

    private static a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ba662c28a67dc6a0b258a9030d3139f", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ba662c28a67dc6a0b258a9030d3139f");
        }
        if (f == null) {
            try {
                f = new LiveReportImpl();
            } catch (Exception e2) {
                Log.e("LiveMetricMonitor", "getLiveMetricUtilsClass: ", e2);
            }
        }
        return f;
    }

    private static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e4d7609b8cae227dc650d1df9e41f74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e4d7609b8cae227dc650d1df9e41f74")).booleanValue();
        }
        b b2 = com.sankuai.meituan.mtliveqos.b.b();
        if (b2 == null) {
            return false;
        }
        return b2.e();
    }

    private static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "784892ce6f80a2511b5431a81e2f04d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "784892ce6f80a2511b5431a81e2f04d4");
        }
        b b2 = com.sankuai.meituan.mtliveqos.b.b();
        if (b2 == null) {
            return "";
        }
        String d2 = b2.d();
        return !TextUtils.isEmpty(d2) ? d2 : "";
    }

    private static String f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b64858b01e04f91af4c2d713211dffb5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b64858b01e04f91af4c2d713211dffb5");
        }
        b b2 = com.sankuai.meituan.mtliveqos.b.b();
        if (b2 == null) {
            return "";
        }
        String a2 = b2.a();
        return !TextUtils.isEmpty(a2) ? a2 : "";
    }

    private static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bd6d9b1243c24f693570260a656f623", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bd6d9b1243c24f693570260a656f623");
        }
        b b2 = com.sankuai.meituan.mtliveqos.b.b();
        if (b2 == null) {
            return "";
        }
        String b3 = b2.b();
        return !TextUtils.isEmpty(b3) ? b3 : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.sankuai.meituan.mtliveqos.statistic.c b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f5b298f825909ab1916c1ec6ca77eef", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.mtliveqos.statistic.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f5b298f825909ab1916c1ec6ca77eef");
        }
        com.sankuai.meituan.mtliveqos.statistic.c cVar = new com.sankuai.meituan.mtliveqos.statistic.c();
        cVar.b = "LiveMetricMonitor";
        cVar.d = str;
        cVar.c = str2;
        return cVar;
    }
}
