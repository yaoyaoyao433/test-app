package com.meituan.android.common.locate.platform.sniffer;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.loader.BaseLocationStrategy;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.common.locate.provider.l;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.SnifferConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import java.util.HashMap;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c {
    private static Context a;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* loaded from: classes2.dex */
    public static class a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String a;
        public String b;
        public String c;
        public String d;
        public long e;
        public HashMap<String, String> f;

        public a(String str, String str2) {
            this(str, str2, "", "", 1L, null);
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "feb9dd19826e426afa46e50c45c021ed", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "feb9dd19826e426afa46e50c45c021ed");
            }
        }

        public a(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, 1L, null);
            Object[] objArr = {str, str2, str3, str4};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4408867a923465400c85c167c84573f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4408867a923465400c85c167c84573f2");
            }
        }

        public a(String str, String str2, String str3, String str4, long j, HashMap<String, String> hashMap) {
            Object[] objArr = {str, str2, str3, str4, new Long(j), hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb7a7a3b46c776ca6af335216431789c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb7a7a3b46c776ca6af335216431789c");
                return;
            }
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = j;
            this.f = hashMap;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ddaa420261bc84b2e61d06eda16b8d3d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ddaa420261bc84b2e61d06eda16b8d3d");
            }
            return "SnifferModel{module='" + this.a + "', type='" + this.b + "', describe='" + this.c + "'}";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r8 = com.meituan.android.common.locate.platform.sniffer.c.changeQuickRedirect
            java.lang.String r9 = "e80380bba3fd2f25cb52f25abe5ae3e0"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r3 = r8
            r5 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            r2 = 1
            if (r1 == 0) goto L1d
            r1 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r8, r2, r9)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L1d:
            android.content.Context r0 = com.meituan.android.common.locate.platform.sniffer.c.a
            if (r0 == 0) goto L2c
            android.content.Context r0 = com.meituan.android.common.locate.platform.sniffer.c.a     // Catch: java.lang.Throwable -> L2c
            com.meituan.android.common.locate.provider.s r0 = com.meituan.android.common.locate.provider.s.a(r0)     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L2c
            goto L2d
        L2c:
            r0 = 1
        L2d:
            if (r0 == 0) goto L33
            java.lang.String r0 = "mt_locate_sdk"
            return r0
        L33:
            java.lang.String r0 = "sub_locate_sdk"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.locate.platform.sniffer.c.a():java.lang.String");
    }

    private static String a(LocationStrategy locationStrategy) {
        Object[] objArr = {locationStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "727251aff00dca65d92d2ed0b9b75ceb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "727251aff00dca65d92d2ed0b9b75ceb") : (locationStrategy == null || !(locationStrategy instanceof BaseLocationStrategy)) ? "" : locationStrategy.toString();
    }

    public static void a(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a9d231b6c0bd57a993e36302c5154fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a9d231b6c0bd57a993e36302c5154fe8");
        } else if (context == null) {
        } else {
            a = context;
            Sniffer.init(context, new SnifferConfig() { // from class: com.meituan.android.common.locate.platform.sniffer.c.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.meituan.android.common.sniffer.SnifferConfig
                public final String getApkHash() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb6638497382104c2d4f2a9c1a436e89", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb6638497382104c2d4f2a9c1a436e89") : super.getApkHash();
                }

                @Override // com.meituan.android.common.sniffer.SnifferConfig
                public final String getCityId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "09699136c5e159cd7893fcab2b748485", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "09699136c5e159cd7893fcab2b748485") : super.getCityId();
                }

                @Override // com.meituan.android.common.sniffer.SnifferConfig
                @NonNull
                public final String getUserId() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dfb8fdc5aa54f7dca855e962e386017e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dfb8fdc5aa54f7dca855e962e386017e") : com.meituan.android.common.locate.provider.a.c();
                }
            });
            b.a = (f.b() == null || f.b().getInt("indicator_horn_switch", 0) != 1) ? false : false;
        }
    }

    public static void a(MtLocation mtLocation, LocationStrategy locationStrategy) {
        Object[] objArr = {mtLocation, locationStrategy};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c921ed9072dcab3efad31bb5afa778fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c921ed9072dcab3efad31bb5afa778fd");
        } else if (LocationUtils.a(mtLocation)) {
            HashMap hashMap = new HashMap();
            hashMap.put("provider", mtLocation.getProvider());
            hashMap.put("from", mtLocation.getExtras() == null ? StringUtil.NULL : mtLocation.getExtras().getString("from"));
            a(new a("locate_deliver", "success", null, null, 1L, hashMap));
        } else if (com.meituan.android.common.locate.platform.sniffer.a.e()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                LocationUtils.b(jSONObject2);
                com.meituan.android.common.locate.platform.sniffer.a.b(jSONObject);
                jSONObject.put("finger", jSONObject2);
                jSONObject.put("sdkver", l.a().c());
                jSONObject.put("extra", a(locationStrategy));
                b(new a("locate_deliver", com.meituan.android.common.locate.platform.sniffer.a.a(), com.meituan.android.common.locate.platform.sniffer.a.c(), jSONObject.toString()));
                com.meituan.android.common.locate.platform.sniffer.a.d();
                com.meituan.android.common.locate.platform.sniffer.a.b();
                LogUtils.a("SnifferReporter sniffer upload error info is : " + jSONObject.toString());
            } catch (Exception e) {
                LogUtils.a(e);
            }
        }
    }

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17bea04ac3550afe0345a9c2d3ec70fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17bea04ac3550afe0345a9c2d3ec70fe");
        } else {
            Sniffer.normal(a(), aVar.a, aVar.b, aVar.d, aVar.e, aVar.f);
        }
    }

    public static void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fff8b1779ad8f8da673ae9bf5657e031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fff8b1779ad8f8da673ae9bf5657e031");
        } else {
            a(str, z, "");
        }
    }

    public static void a(String str, boolean z, String str2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5fcd3327a0cb994ca18e3875cb6dda05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5fcd3327a0cb994ca18e3875cb6dda05");
            return;
        }
        String a2 = a();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(CommonConstant.Symbol.UNDERLINE);
        sb.append(z ? MarketingModel.TYPE_ENTER_DIALOG : "close");
        Sniffer.smell(a2, "sniffer_mt_switch_state", sb.toString(), "", str2);
    }

    public static void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "65d5b69d0529272fb686b6ee22664131", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "65d5b69d0529272fb686b6ee22664131");
        } else {
            Sniffer.smell(a(), aVar.a, aVar.b, aVar.c, aVar.d);
        }
    }
}
