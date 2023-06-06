package com.meituan.crashreporter.crash;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.Internal;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.metricx.utils.ProcessUtil;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.crashreporter.h;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.meituan.snare.a {
    public static ChangeQuickRedirect a;
    public Context b;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e670cd4d10a7bd6f203250efbc60323", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e670cd4d10a7bd6f203250efbc60323");
        } else {
            this.b = context;
        }
    }

    @Override // com.meituan.snare.a
    public final void a(String str, boolean z, boolean z2) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "167253e991f7faa134edea25d44bff33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "167253e991f7faa134edea25d44bff33");
            return;
        }
        PrintStream printStream = System.out;
        printStream.println("Crash handle log" + str);
    }

    @Override // com.meituan.snare.a
    public final Map<String, String> a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c2c810620859b8856265087c8688ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c2c810620859b8856265087c8688ff");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("lastPageTrack", UserActionsProvider.getInstance().getActions(false) + UserActionsProvider.getInstance().getLastResumeActivityName());
        if (com.meituan.crashreporter.c.b() != null) {
            hashMap.put("apkHash", Internal.getAppEnvironment().getApkHash());
            hashMap.put("deviceId", Internal.getAppEnvironment().getUuid());
            hashMap.put("appVersion", Internal.getAppEnvironment().getAppVersion());
            hashMap.put(NetLogConstants.Environment.BUILD_VERSION, Internal.getAppEnvironment().getBuildVersion());
            hashMap.put(DeviceInfo.USER_ID, Internal.getAppEnvironment().getUserId());
        }
        return hashMap;
    }

    public final void a(String str, h hVar, String str2, boolean z, boolean z2) {
        Object[] objArr = {str, hVar, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90c5999c51cc5a79d0b0f1f264a1b943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90c5999c51cc5a79d0b0f1f264a1b943");
        } else {
            a(str, hVar, str2, (String) null, z, z2);
        }
    }

    private void a(String str, h hVar, String str2, String str3, boolean z, boolean z2) {
        Object[] objArr = {str, hVar, str2, null, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa6fa56f3792fa7e9ecba4418db0ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa6fa56f3792fa7e9ecba4418db0ade");
        } else {
            a("", null, null, str, hVar, str2, null, z, "", -1, z2 ? 1 : 0);
        }
    }

    private void a(String str, String str2, String str3, String str4, h hVar, String str5, String str6, boolean z, String str7, int i, int i2) {
        Object[] objArr = {str, null, null, str4, hVar, str5, str6, Byte.valueOf(z ? (byte) 1 : (byte) 0), str7, -1, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be79e3f57e5b332d1b487b3f0064e7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be79e3f57e5b332d1b487b3f0064e7a");
        } else if (hVar == null) {
        } else {
            com.meituan.crashreporter.crash.a a2 = a(str, str4, hVar, str5, str6, z, str7, -1, i2);
            switch (i2) {
                case 0:
                case 1:
                    a(str, (String) null, (String) null, a2, "catchexception", "c15");
                    return;
                case 2:
                    a(str, (String) null, (String) null, a2, "leak", "c14");
                    return;
                default:
                    return;
            }
        }
    }

    private com.meituan.crashreporter.crash.a a(String str, String str2, h hVar, String str3, String str4, boolean z, String str5, int i, int i2) {
        Object[] objArr = {str, str2, hVar, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), str5, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b558bc68ad013abb7b49d23906b905be", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.crashreporter.crash.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b558bc68ad013abb7b49d23906b905be");
        }
        com.meituan.crashreporter.crash.a aVar = new com.meituan.crashreporter.crash.a();
        long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
        Object[] objArr2 = {new Long(currentTimeMillisSNTP)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.crashreporter.crash.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3bf65d8555d90d76670e6679d1b3a125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3bf65d8555d90d76670e6679d1b3a125");
        } else {
            aVar.b = currentTimeMillisSNTP;
        }
        aVar.c = str2;
        aVar.f = TextUtils.isEmpty(str4) ? UUID.randomUUID().toString() : str4;
        aVar.e = Internal.getAppEnvironment().getAppVersion();
        aVar.h = Internal.getAppEnvironment().getUuid();
        StringBuilder sb = new StringBuilder();
        sb.append(UserActionsProvider.getInstance().getActions(false));
        sb.append(TextUtils.isEmpty(str3) ? UserActionsProvider.getInstance().getLastResumeActivityName() : str3);
        aVar.d = sb.toString();
        String apkHash = Internal.getAppEnvironment().getApkHash();
        String appVersion = Internal.getAppEnvironment().getAppVersion();
        String buildVersion = Internal.getAppEnvironment().getBuildVersion();
        JSONObject d = hVar.d();
        try {
            if (!TextUtils.isEmpty(apkHash)) {
                d.put("apkHash", apkHash);
            }
            if (!TextUtils.isEmpty(appVersion)) {
                d.put("appVersion", appVersion);
            }
            if (!TextUtils.isEmpty(buildVersion)) {
                d.put(NetLogConstants.Environment.BUILD_VERSION, buildVersion);
            }
            d.put("fdCount", ProcessUtil.getFdCount());
            d.put("from", "sql");
            d.put("active_thread_count", ProcessUtil.getThreadCount());
        } catch (Throwable unused) {
        }
        try {
            if (!TextUtils.isEmpty(str5)) {
                d.put("tem_thread_name", str5);
            }
            if (i != -1) {
                d.put("tem_signo", i);
            }
        } catch (Throwable unused2) {
        }
        aVar.g = d.toString();
        aVar.i = Internal.getAppEnvironment().getChannel();
        long cityId = Internal.getAppEnvironment().getCityId();
        Object[] objArr3 = {new Long(cityId)};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.crashreporter.crash.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "50289f015219cbe62b470c28ebe4208c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "50289f015219cbe62b470c28ebe4208c");
        } else {
            aVar.j = cityId;
        }
        aVar.k = hVar.e;
        aVar.l = hVar.c();
        return aVar;
    }

    private void a(String str, String str2, String str3, com.meituan.crashreporter.crash.a aVar, String str4, String str5) {
        h b;
        Object[] objArr = {str, str2, str3, aVar, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "654253777b173d9b9cfad139318987dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "654253777b173d9b9cfad139318987dd");
        } else if (aVar == null || (b = com.meituan.crashreporter.c.b()) == null) {
        } else {
            Log.Builder builder = new Log.Builder(aVar.c);
            builder.tag(str4);
            builder.lv4LocalStatus(true);
            builder.ts(aVar.b);
            builder.reportChannel(str5);
            HashMap hashMap = new HashMap();
            hashMap.put("guid", aVar.f);
            hashMap.put("c_activity_name", aVar.d);
            hashMap.put("crashVersion", aVar.e);
            hashMap.put(Constants.Environment.KEY_CH, aVar.i);
            hashMap.put(Constants.Environment.KEY_CITYID, Long.valueOf(aVar.j));
            hashMap.put("net", aVar.l);
            hashMap.put("option", aVar.g);
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("message", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("lastPage", str2);
            }
            if (!TextUtils.isEmpty(b.b())) {
                hashMap.put(NetLogConstants.Environment.BUILD_VERSION, b.b());
            }
            if (str3 != null) {
                hashMap.put("leakType", str3);
            }
            builder.token(Internal.getAppEnvironment().getToken());
            builder.optional(hashMap);
            Babel.init(this.b);
            Babel.log(builder.build());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.snare.a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.snare.a
        public final void a(String str, boolean z, boolean z2) {
        }

        public a() {
        }

        @Override // com.meituan.snare.a
        public final Map<String, String> a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ab92a9d525ffea957de942529e453b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ab92a9d525ffea957de942529e453b4");
            }
            try {
                HashMap hashMap = new HashMap();
                JSONObject d = com.meituan.crashreporter.c.b().d();
                Iterator<String> keys = d.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, d.getString(next));
                }
                JSONObject a2 = com.meituan.crashreporter.c.b().a(str, z);
                Iterator<String> keys2 = a2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    hashMap.put(next2, a2.getString(next2));
                }
                return hashMap;
            } catch (Throwable unused) {
                return super.a(str, z);
            }
        }
    }
}
