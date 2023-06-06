package com.meituan.android.paybase.common.analyse;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.Channel;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.android.pay.jshandler.HybridSignPayJSHandler;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static String b;

    public static void a(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd0d9bbd08a82aa340fe6408f9f177dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd0d9bbd08a82aa340fe6408f9f177dc");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
        if (!TextUtils.isEmpty(b) && !map.containsKey("tradeNo")) {
            map.put("tradeNo", b);
        }
        map.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        map.put("nb_platform", "android");
        map.put("is_debug", com.meituan.android.paybase.utils.b.b() ? "1" : "0");
        String str3 = map.containsKey("nb_container") ? map.get("nb_container") : "";
        if (!(str3 instanceof String) || TextUtils.isEmpty((String) str3)) {
            map.put("nb_container", "native");
        }
        map.put("priority", "normal");
        map.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        String str4 = b;
        if (!TextUtils.isEmpty(str4)) {
            map.put(HybridSignPayJSHandler.ARG_TRADE_NO, str4);
        }
        HashMap hashMap = new HashMap(1);
        if (map != null && map.size() > 0) {
            hashMap.put("custom", map);
        }
        a().writePageView(str, str2, hashMap);
    }

    public static void b(String str, @NonNull String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5c95031787ec8aabc03c561d10504eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5c95031787ec8aabc03c561d10504eb");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
        if (!TextUtils.isEmpty(b) && !map.containsKey("tradeNo")) {
            map.put("tradeNo", b);
        }
        HashMap hashMap = new HashMap(1);
        if (map != null && map.size() > 0) {
            hashMap.put("custom", map);
        }
        a().writePageDisappear(str, str2, hashMap);
    }

    public static void a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fb04cbd57149f6b95397c7a84a233056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fb04cbd57149f6b95397c7a84a233056");
        } else {
            Statistics.addPageInfo(str, str2);
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b98a56a05102fed62825559a79b99c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b98a56a05102fed62825559a79b99c0");
        } else {
            Statistics.resetPageName(str, str2);
        }
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84a7664358c94bb35e17606502bce8de", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84a7664358c94bb35e17606502bce8de") : AppUtil.generatePageInfoKey(obj);
    }

    public static void c(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8123445e23f9ecbddf0405b4154a2f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8123445e23f9ecbddf0405b4154a2f43");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
        a().writeEvent((String) null, f(str, str2, map));
    }

    public static void a(String str, String str2, Map<String, Object> map, EnumC0329a enumC0329a, int i) {
        Object[] objArr = {str, str2, map, enumC0329a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86dc427249c3c19e53b4401fdaa618d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86dc427249c3c19e53b4401fdaa618d2");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
        if (enumC0329a == EnumC0329a.VIEW) {
            a().writeModelView((String) null, str, b(map), i);
        } else if (enumC0329a == EnumC0329a.CLICK) {
            a().writeModelClick((String) null, str, b(map), i);
        } else {
            EventInfo f = f(str, str2, map);
            f.index = String.valueOf(i);
            if (enumC0329a == EnumC0329a.SLIDE) {
                f.event_type = Constants.EventType.SLIDE;
            }
            a().writeEvent((String) null, f);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, EnumC0329a enumC0329a) {
        Object[] objArr = {str, str2, map, enumC0329a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18a3154be318f1d78de2b2f3e6b95319", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18a3154be318f1d78de2b2f3e6b95319");
        } else {
            a(str, str2, map, enumC0329a, -1);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map, EnumC0329a enumC0329a, int i) {
        Object[] objArr = {str, str2, str3, map, enumC0329a, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a674801591eb4342e59e359244ee6901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a674801591eb4342e59e359244ee6901");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
        if (enumC0329a == EnumC0329a.VIEW) {
            a().writeModelView((String) null, str2, map, str);
        } else if (enumC0329a == EnumC0329a.CLICK) {
            a().writeModelClick((String) null, str2, map, str);
        } else {
            EventInfo f = f(str2, str3, map);
            f.index = "-1";
            f.val_cid = str;
            if (enumC0329a == EnumC0329a.SLIDE) {
                f.event_type = Constants.EventType.SLIDE;
            }
            a().writeEvent((String) null, f);
        }
    }

    @Deprecated
    public static void a(String str, String str2, String str3, Map<String, Object> map, String str4) {
        Object[] objArr = {str, str2, str3, null, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f874e0618226c525ef8dab4937b52f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f874e0618226c525ef8dab4937b52f0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("an_sdk_version", com.meituan.android.paybase.config.a.d().q());
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = str;
        if (!TextUtils.isEmpty(str2)) {
            eventInfo.val_cid = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            eventInfo.val_act = str3;
        }
        if (hashMap.size() > 0) {
            eventInfo.val_lab = hashMap;
        }
        if (!TextUtils.isEmpty(str4)) {
            eventInfo.event_type = str4;
        }
        a().writeEvent((String) null, eventInfo);
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b513fb9553e710fe46b19ef975359db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b513fb9553e710fe46b19ef975359db");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        map.put("priority", d.NORMAL.toString());
        if (!TextUtils.isEmpty(b) && !map.containsKey("tradeNo")) {
            map.put("tradeNo", b);
        }
        a().writeSystemCheck(null, str, map);
    }

    public static void d(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "255c4c799f37e41ad1178758f1055cee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "255c4c799f37e41ad1178758f1055cee");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(KnbConstants.PARAMS_SCENE, str2);
        map.put("message", str);
        v.a("b_an74lgy8", map);
    }

    public static void a(Throwable th, String str, Map<String, Object> map) {
        Object[] objArr = {th, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e708199e4653f4740aab727ce4185bbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e708199e4653f4740aab727ce4185bbe");
        } else if (th != null) {
            d(th.getMessage(), str, map);
        } else {
            d("", str, map);
        }
    }

    private static Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00c29dac94bb0395a7eebf3c7036df83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00c29dac94bb0395a7eebf3c7036df83");
        }
        HashMap<String, Object> hashMap = new b().a("tradeNo", b).b;
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    @Deprecated
    public static void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "543cea552f6c4267f88493e4b370dc3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "543cea552f6c4267f88493e4b370dc3c");
        } else {
            a().writeBizPay((String) null, str, b(map));
        }
    }

    @Deprecated
    public static void a(String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b631fc4df7df4e9a8a33c7e0c3fe9214", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b631fc4df7df4e9a8a33c7e0c3fe9214");
            return;
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = str;
        HashMap hashMap = new HashMap();
        if (map != null && map.size() > 0) {
            hashMap.putAll(map);
        }
        hashMap.put("priority", d.NORMAL.toString());
        hashMap.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        eventInfo.val_lab = b(hashMap);
        if (!TextUtils.isEmpty(str2)) {
            eventInfo.val_cid = str2;
        }
        if (!TextUtils.isEmpty(str3)) {
            eventInfo.val_act = str3;
        }
        a().writeEvent((String) null, eventInfo);
    }

    @Deprecated
    public static void e(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44b417c8d58320b808af083a0991a0f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44b417c8d58320b808af083a0991a0f3");
        } else {
            a("b_zaxog", str, str2, map);
        }
    }

    @Deprecated
    public static void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8338cd500dc074f9c9d10cea4fb08f53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8338cd500dc074f9c9d10cea4fb08f53");
        } else {
            e(null, null, map);
        }
    }

    @Deprecated
    public static void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "306a56fd93d62b9ac5576ca13079b650", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "306a56fd93d62b9ac5576ca13079b650");
            return;
        }
        b bVar = new b();
        bVar.a("priority", d.NORMAL.toString());
        if (!TextUtils.isEmpty(str3)) {
            bVar.a("lab", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            bVar.a(Constants.TagConstants.TAG_VALUE, str4);
        }
        e(str, str2, bVar.b);
    }

    @Deprecated
    public static void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "baccdb53e9e5d5d13f07729b09e6b008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "baccdb53e9e5d5d13f07729b09e6b008");
            return;
        }
        b bVar = new b();
        bVar.a("priority", d.NORMAL.toString());
        if (!TextUtils.isEmpty(str4)) {
            bVar.a("lab", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            bVar.a(Constants.TagConstants.TAG_VALUE, str5);
        }
        a(str, str2, str3, bVar.b);
    }

    public static void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6db34a8e51bea25d38b3521fe56bd07b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6db34a8e51bea25d38b3521fe56bd07b");
            return;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        eventInfo.val_bid = "b_zaxog";
        eventInfo.val_lab = new HashMap();
        eventInfo.val_lab.put(LogMonitor.EXCEPTION_TAG, exc.getClass().toString());
        eventInfo.val_lab.put(GearsLocator.DETAIL, stringWriter.toString());
        eventInfo.level = EventLevel.NORMAL;
        a().writeEvent((String) null, eventInfo);
    }

    public static String a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12f91fc15787254564257d4add3dec25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12f91fc15787254564257d4add3dec25");
        }
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.UNDERLINE);
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public HashMap<String, Object> b;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9747400ae039e8e8035074e57b11017e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9747400ae039e8e8035074e57b11017e");
                return;
            }
            this.b = new HashMap<>();
            this.b.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
        }

        public final b a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8475aebda52917d9fe24960bc0d7b1d", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8475aebda52917d9fe24960bc0d7b1d");
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                this.b.put(str, str2);
            }
            return this;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40fed82b63c5119cdd1a48ba901cfccb", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40fed82b63c5119cdd1a48ba901cfccb");
            }
            String str = a.b;
            if (!TextUtils.isEmpty(str)) {
                this.b.put("trans_id", str);
            }
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public HashMap<String, Object> b;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd3eb3e9cf64abf83235df281545378", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd3eb3e9cf64abf83235df281545378");
            } else {
                this.b = new HashMap<>();
            }
        }

        public final c a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160292f745af2a0218cc8198daa881ff", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160292f745af2a0218cc8198daa881ff");
            }
            if (!TextUtils.isEmpty(str) && obj != null) {
                this.b.put(str, obj);
            }
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.common.analyse.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0329a {
        VIEW,
        CLICK,
        SLIDE;
        
        public static ChangeQuickRedirect a;

        EnumC0329a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9a5b3a684cdfdec475de5c79f78e14c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9a5b3a684cdfdec475de5c79f78e14c");
            }
        }

        public static EnumC0329a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa89380353855d536f7edc21a8709a25", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0329a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa89380353855d536f7edc21a8709a25") : (EnumC0329a) Enum.valueOf(EnumC0329a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0329a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7187eb2670880edac6b2d97abc416002", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0329a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7187eb2670880edac6b2d97abc416002") : (EnumC0329a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum d {
        IMMEDIATE(0),
        URGENT(1),
        HIGH(2),
        NORMAL(3);
        
        public static ChangeQuickRedirect a;
        private int f;

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ae75d3535a5a02d76ca2949521eb71f", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ae75d3535a5a02d76ca2949521eb71f") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d4f356cc0df29df62cd6dd2ed004d27", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d4f356cc0df29df62cd6dd2ed004d27") : (d[]) values().clone();
        }

        d(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48937bcecbd2040cf3d0deed636a9234", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48937bcecbd2040cf3d0deed636a9234");
            } else {
                this.f = i;
            }
        }

        @Override // java.lang.Enum
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc22a6b9a60902434e3bff737d2a6726", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc22a6b9a60902434e3bff737d2a6726") : String.valueOf(this.f);
        }
    }

    private static EventInfo f(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "475940ab56eb6dbfbdddf009b69f8ca0", RobustBitConfig.DEFAULT_VALUE)) {
            return (EventInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "475940ab56eb6dbfbdddf009b69f8ca0");
        }
        EventInfo eventInfo = new EventInfo();
        eventInfo.nm = EventName.MGE;
        if (!TextUtils.isEmpty(str)) {
            eventInfo.val_bid = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            eventInfo.val_act = str2;
        }
        eventInfo.val_lab = b(map);
        return eventInfo;
    }

    public static Channel a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f9f997a005a1268bf721bc591d349e1", RobustBitConfig.DEFAULT_VALUE) ? (Channel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f9f997a005a1268bf721bc591d349e1") : Statistics.getChannel(Constants.EventType.PAY);
    }
}
