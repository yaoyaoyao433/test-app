package com.sankuai.waimai.platform.utils.sharedpreference;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Set<String> b;
    private static Set<String> c;
    private static Set<String> e;
    private static Set<String> g;
    private static final e<PlatformSPKeys> d = new e<>("waimai_platform");
    private static int f = -1;

    public static e a() {
        return d;
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6360f2a5bcf62b9baabe2fa483ea7d35", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6360f2a5bcf62b9baabe2fa483ea7d35")).booleanValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.WM_SKYFALL_COUPON_DIALOG, false);
    }

    public static void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c64004c6e16e7e04d4078384bab10099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c64004c6e16e7e04d4078384bab10099");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.SHARK_FAILOVER_PATHS, set);
        }
    }

    public static Set<String> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae3b20db1a812d6c1b27688a441a4b0b", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae3b20db1a812d6c1b27688a441a4b0b") : d.b((e<PlatformSPKeys>) PlatformSPKeys.SHARK_FAILOVER_PATHS, (Set<String>) null);
    }

    public static int a(long j, int i) {
        Object[] objArr = {new Long(j), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d21f4676913bc1da60df46ecb42c25a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d21f4676913bc1da60df46ecb42c25a8")).intValue();
        }
        try {
            JSONArray jSONArray = new JSONArray(d.b((e<PlatformSPKeys>) PlatformSPKeys.WM_ORDER_CONFIRM_LABEL_COUNT, "[{addressId:0,closeCount:0}]"));
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.optLong("addressId") == j) {
                    return jSONObject.optInt("closeCount");
                }
            }
            return 0;
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
            return 0;
        }
    }

    public static void a(long j, int i, int i2) {
        int i3 = 0;
        Object[] objArr = {new Long(j), Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e63fec095e1fee56cdbeba8223143ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e63fec095e1fee56cdbeba8223143ee");
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(d.b((e<PlatformSPKeys>) PlatformSPKeys.WM_ORDER_CONFIRM_LABEL_COUNT, "[{addressId:0,closeCount:0}]"));
            int length = jSONArray.length();
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                } else if (jSONArray.getJSONObject(i3).optInt("addressId") == j) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("addressId", j);
                jSONObject.put("closeCount", i);
                jSONArray.put(jSONObject);
            } else {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                jSONObject2.put("addressId", j);
                jSONObject2.put("closeCount", i);
                jSONArray.put(i3, jSONObject2);
            }
            d.a((e<PlatformSPKeys>) PlatformSPKeys.WM_ORDER_CONFIRM_LABEL_COUNT, jSONArray.toString());
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
    }

    @NonNull
    public static String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38a4eb897641f19b44be2408306cdb29", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38a4eb897641f19b44be2408306cdb29") : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_CACHED_WEB_VIEW_UA, "");
    }

    public static void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bb94fd422e6d22cf28940710e9f4041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bb94fd422e6d22cf28940710e9f4041");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_CACHED_WEB_VIEW_UA, str);
        }
    }

    public static boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4952739a88f7b834342718ae4f65ee11", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4952739a88f7b834342718ae4f65ee11")).booleanValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_IS_USE_FAKE_UA, false);
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9c48c87de3b32a80c6dbaed2ffe87ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9c48c87de3b32a80c6dbaed2ffe87ac");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_IS_USE_FAKE_UA, z);
        }
    }

    public static String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aed17553f73118251eac2cd8ee49b2ed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aed17553f73118251eac2cd8ee49b2ed") : d.b((e<PlatformSPKeys>) PlatformSPKeys.MACH_DOWN_V2_CHECK_INTERVAL, "");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd9bf61190ca0af2de7329ad821250cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd9bf61190ca0af2de7329ad821250cb");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_DOWN_V2_CHECK_INTERVAL, str);
        }
    }

    public static String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfb860c11c9dc7c76703ecea1ac73376", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfb860c11c9dc7c76703ecea1ac73376") : d.b((e<PlatformSPKeys>) PlatformSPKeys.MACH_DOWN_V2_CUSTOM, "");
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37a17692594b3547280d3a3f8f2e26c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37a17692594b3547280d3a3f8f2e26c4");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_DOWN_V2_CUSTOM, str);
        }
    }

    public static boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84134c2c2944deda96c67ceb555a545d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84134c2c2944deda96c67ceb555a545d")).booleanValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.MACH_USE_V8JSE, false);
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4d7e361d336533f401cfc87cde07248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4d7e361d336533f401cfc87cde07248");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_TEXT_FACE, z);
        }
    }

    public static void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea49c3a81d0b44b9a8e1923921e03c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea49c3a81d0b44b9a8e1923921e03c10");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_CODE_CACHE, z);
        }
    }

    public static void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "132730f45b8524fc2515c40db0f036c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "132730f45b8524fc2515c40db0f036c5");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_THREAD_OPT, z);
        }
    }

    public static void e(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e5240efd3ffa10aad93b3868e17cce9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e5240efd3ffa10aad93b3868e17cce9");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_YOGA_INPUT_STYLE, z);
        }
    }

    public static void f(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bc18cb2a0b01674762b93d424f30264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bc18cb2a0b01674762b93d424f30264");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_PRE_RENDER_THREAD_COUNT_OPT, z);
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7f58de7feac6361ce54ee8528295c3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7f58de7feac6361ce54ee8528295c3b");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_PRE_RENDER_THREAD_POOL_COUNT, i);
        }
    }

    public static void g(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd9dd07e95347d66c046ef38eb2953d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd9dd07e95347d66c046ef38eb2953d7");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_EXTRACT_DOWNLOAD_HOMEPAGE_TEMPLATE, z);
        }
    }

    public static void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4310ec76ded8666d398dc53b5ae128b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4310ec76ded8666d398dc53b5ae128b1");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_MOVE_BUNDLE_FAIL_TIME_LIMIT, i);
        }
    }

    public static void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf427028f7fa5046c74e85cf74476d09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf427028f7fa5046c74e85cf74476d09");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_MOVE_BUNDLE_FAIL_REBOOT_TIME_LIMIT, i);
        }
    }

    public static void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02936b19ec029504972fd00c767d8cc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02936b19ec029504972fd00c767d8cc2");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.MACH_CODELOG_SAMPLING_RATE, i);
        }
    }

    public static void h(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ab48bd2ac0b2c1d35fc070711d5fcee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ab48bd2ac0b2c1d35fc070711d5fcee");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_POILIST_ANIMATION, z);
        }
    }

    public static void b(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae6145511aa8b311b7a8a2c7c2afcc37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae6145511aa8b311b7a8a2c7c2afcc37");
        } else if (set == null) {
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.REUSE_FINGERPRINT_URLS, set);
        }
    }

    public static Set<String> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9194cf238259764837a22e168f23893", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9194cf238259764837a22e168f23893") : d.b((e<PlatformSPKeys>) PlatformSPKeys.REUSE_FINGERPRINT_URLS, Collections.emptySet());
    }

    public static void c(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47903586e134468c673499d1904981a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47903586e134468c673499d1904981a1");
        } else if (set == null) {
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_ENABLE_PRELOAD, set);
        }
    }

    public static Set<String> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a482b986ff3ec39160232bc0c4c07edf", RobustBitConfig.DEFAULT_VALUE) ? (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a482b986ff3ec39160232bc0c4c07edf") : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_ENABLE_PRELOAD, (Set<String>) null);
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "31aef94337c6f8e86ad485cbb72e651e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "31aef94337c6f8e86ad485cbb72e651e");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_MRN_PRELOAD_BUNDLES, str);
        }
    }

    public static String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbe73e63b81035c2aceee21acad4c201", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbe73e63b81035c2aceee21acad4c201") : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_MRN_PRELOAD_BUNDLES, (String) null);
    }

    public static int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28c3335748f45480088d82c6a94467bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28c3335748f45480088d82c6a94467bd")).intValue();
        }
        if (f < 0) {
            f = d.b((e<PlatformSPKeys>) PlatformSPKeys.APP_STARTUP_COUNT, 0);
            d.a((e<PlatformSPKeys>) PlatformSPKeys.APP_STARTUP_COUNT, f + 1);
        }
        return f;
    }

    public static int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58c1ef7710f0a2bcd39b4fc5809bb93c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58c1ef7710f0a2bcd39b4fc5809bb93c")).intValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.USER_SUBMIT_ORDER_COUNT, 0);
    }

    public static void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2ffd4d3c89f0594be2a188246842bb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2ffd4d3c89f0594be2a188246842bb1");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.USER_SUBMIT_ORDER_COUNT, m() + 1);
        }
    }

    public static int o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bd8c4a0cd188ac4ecf42b04a83dbbb3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bd8c4a0cd188ac4ecf42b04a83dbbb3")).intValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.USER_PAY_SUCCESS_COUNT, 0);
    }

    public static void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f1ad8c21ae80129f4ff3fa23a857f06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f1ad8c21ae80129f4ff3fa23a857f06");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.USER_PAY_SUCCESS_COUNT, o() + 1);
        }
    }

    public static void d(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ccfc8b167861c0c444f18c3ad70ed2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ccfc8b167861c0c444f18c3ad70ed2c");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_RECORD_ROUTER_PATHS, set);
        }
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f828cbd7164487404c03f07dc34f249b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f828cbd7164487404c03f07dc34f249b");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_ALITA_LAST_DATA_DOWNLOAD_TIMESTAMP, j);
        }
    }

    public static long q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f9ecdcc8c744ca93b4270547f20e9dc", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f9ecdcc8c744ca93b4270547f20e9dc")).longValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_ALITA_LAST_DATA_DOWNLOAD_TIMESTAMP, 0L);
    }

    public static boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58566a6f80b0ac158f4671b504d20a3c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58566a6f80b0ac158f4671b504d20a3c")).booleanValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_ENABLE_JSON_CACHE_FACTORY, true);
    }

    public static void i(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6061360ddcf818197e340c7b1596c971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6061360ddcf818197e340c7b1596c971");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_ENABLE_JSON_CACHE_FACTORY, z);
        }
    }

    public static int s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac2488ee1c3b6c3af207936ea129a192", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac2488ee1c3b6c3af207936ea129a192")).intValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_APP_MODEL, 0);
    }

    public static void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f20e2ed7ddc76faf105a63ffbff78870", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f20e2ed7ddc76faf105a63ffbff78870");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_APP_MODEL, i);
        }
    }

    public static boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "27baab808fe3d751417dc9e1448f7218", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "27baab808fe3d751417dc9e1448f7218")).booleanValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_DISABLE_REMOVE_VIEW_HIERARCHY_STATE, false);
    }

    public static void j(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22a1b5bf761a32a4e46a02aee05c25c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22a1b5bf761a32a4e46a02aee05c25c1");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_DISABLE_REMOVE_VIEW_HIERARCHY_STATE, z);
        }
    }

    public static void e(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a0e0b35d4f3a815b62aa5a5c1380f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a0e0b35d4f3a815b62aa5a5c1380f64");
        } else if (set == null) {
        } else {
            b = set;
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_NETWORK_STRIP_LOCATION_INFO_BLACK_LIST, set);
        }
    }

    public static Set<String> u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4a913950f6018725de529156511ddd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4a913950f6018725de529156511ddd0");
        }
        if (b == null) {
            return d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_NETWORK_STRIP_LOCATION_INFO_BLACK_LIST, (Set<String>) new HashSet(Arrays.asList("/mtwmadlog", "v6/appconfig/update", "/v7/loadInfo", "/v6/exp/strategy", "/v6/im/chatinfos")));
        }
        return b;
    }

    public static void f(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a44a2c921bdd5ec4394c840f30d198fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a44a2c921bdd5ec4394c840f30d198fe");
        } else if (set == null) {
        } else {
            c = set;
            d.a((e<PlatformSPKeys>) PlatformSPKeys.KEY_NETWORK_STRIP_WM_DID_INFO_BLACK_LIST, set);
        }
    }

    public static Set<String> v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b331c03d1c63fc79dc7f2a2d934db0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b331c03d1c63fc79dc7f2a2d934db0a");
        }
        if (c == null) {
            return d.b((e<PlatformSPKeys>) PlatformSPKeys.KEY_NETWORK_STRIP_WM_DID_INFO_BLACK_LIST, (Set<String>) new HashSet(Arrays.asList("/mtwmadlog", "/v6/appconfig/update", "/v7/loadInfo", "/v6/appconfig/update", "/v6/order/lastorderstatus", "/v6/exp/strategy", "/v7/user/address/getaddr", "/v6/home/dynamic/tabs", "/v6/intellirecommend", "/v6/popupmenu/getmenu", "/v6/marketinginfo/upload", "/v8/order/getuserorders", "/v6/order/recenteat", "/v6/im/chatinfos", "/v11/search/globalpage", "/poi/activity_groups", "/v7/poi/search/home/hotlabelandhistory", "/v6/task/mvpcoupon/valid", "/v8/user/coupons/list")));
        }
        return c;
    }

    public static void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4ea85e27a83126465f7e05414d80d56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4ea85e27a83126465f7e05414d80d56");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.DOVEMON_TIMEOUT_MS, i);
        }
    }

    public static void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d70f2591a706891887eeefc7323028a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d70f2591a706891887eeefc7323028a6");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.LOCATE_TIMEOUT_BACKUP_MS, i);
        }
    }

    public static int w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dc52b63f193a0ee91022c0424296dd7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dc52b63f193a0ee91022c0424296dd7")).intValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.LOCATE_TIMEOUT_BACKUP_MS, 0);
    }

    public static int x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e688d7d66855f10c3d126a7943ddbc58", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e688d7d66855f10c3d126a7943ddbc58")).intValue() : d.b((e<PlatformSPKeys>) PlatformSPKeys.DOVEMON_TIMEOUT_MS, 5000);
    }

    public static void g(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b26d97b99020c9eb73afa45d31f45d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b26d97b99020c9eb73afa45d31f45d7");
        } else if (set == null) {
        } else {
            e = set;
            d.a((e<PlatformSPKeys>) PlatformSPKeys.DOVEMON_PAGE_LIST, set);
        }
    }

    public static Set<String> y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88ae02ff272242268180e9bd807f8902", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88ae02ff272242268180e9bd807f8902");
        }
        if (e != null) {
            return e;
        }
        Set<String> b2 = d.b((e<PlatformSPKeys>) PlatformSPKeys.DOVEMON_PAGE_LIST, Collections.emptySet());
        e = b2;
        return b2;
    }

    public static void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fa179e894e86e4758af8bc47b3f337b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fa179e894e86e4758af8bc47b3f337b");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.WM_PRIVACY_CONFIG, str);
        }
    }

    public static String z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60d37a02361f52068d7f1d4eb500dc27", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60d37a02361f52068d7f1d4eb500dc27") : d.b((e<PlatformSPKeys>) PlatformSPKeys.WM_PRIVACY_CONFIG, "");
    }

    public static void h(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1ff151cd167b239147e54afdb27e18b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1ff151cd167b239147e54afdb27e18b");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.WM_PRIVACY_API_WHITE_LIST_SWITCH, i);
        }
    }

    public static void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "426b4575ad3a953e948b1e149a2e4317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "426b4575ad3a953e948b1e149a2e4317");
        } else {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.WM_RISK_API_WHITE_LIST_SWITCH, str);
        }
    }

    public static String A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a671747aed6d4753b25a90d1dce29850", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a671747aed6d4753b25a90d1dce29850") : d.b((e<PlatformSPKeys>) PlatformSPKeys.WM_RISK_API_WHITE_LIST_SWITCH, "");
    }

    public static boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30e9fe6a62b4933bbb33c86b04531b9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30e9fe6a62b4933bbb33c86b04531b9d")).booleanValue();
        }
        if (g == null) {
            g = d.b((e<PlatformSPKeys>) PlatformSPKeys.ENABLE_DEEPLINK_BIZ, Collections.emptySet());
        }
        return g.contains(str);
    }

    public static void h(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00512a9795abfef098f5b1b48360f413", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00512a9795abfef098f5b1b48360f413");
        } else if (set != null) {
            d.a((e<PlatformSPKeys>) PlatformSPKeys.ENABLE_DEEPLINK_BIZ, set);
        }
    }
}
