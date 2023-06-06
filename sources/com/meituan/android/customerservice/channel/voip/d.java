package com.meituan.android.customerservice.channel.voip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Context b;
    HashMap<String, String> c;
    boolean d;
    public BroadcastReceiver e;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a0e91442d906b378f6edb3c953d7780", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a0e91442d906b378f6edb3c953d7780");
        } else {
            this.e = new BroadcastReceiver() { // from class: com.meituan.android.customerservice.channel.voip.VoIPManager$1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:13:0x0050, B:15:0x0063, B:17:0x0095, B:20:0x00a2, B:22:0x00b3, B:24:0x00bd, B:27:0x00ca, B:29:0x00d6, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:35:0x0109, B:30:0x00de, B:31:0x00e8, B:21:0x00ac), top: B:42:0x0050 }] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00de A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:13:0x0050, B:15:0x0063, B:17:0x0095, B:20:0x00a2, B:22:0x00b3, B:24:0x00bd, B:27:0x00ca, B:29:0x00d6, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:35:0x0109, B:30:0x00de, B:31:0x00e8, B:21:0x00ac), top: B:42:0x0050 }] */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:13:0x0050, B:15:0x0063, B:17:0x0095, B:20:0x00a2, B:22:0x00b3, B:24:0x00bd, B:27:0x00ca, B:29:0x00d6, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:35:0x0109, B:30:0x00de, B:31:0x00e8, B:21:0x00ac), top: B:42:0x0050 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0109 A[Catch: Exception -> 0x0135, TryCatch #0 {Exception -> 0x0135, blocks: (B:13:0x0050, B:15:0x0063, B:17:0x0095, B:20:0x00a2, B:22:0x00b3, B:24:0x00bd, B:27:0x00ca, B:29:0x00d6, B:32:0x00ef, B:34:0x00f5, B:36:0x0111, B:35:0x0109, B:30:0x00de, B:31:0x00e8, B:21:0x00ac), top: B:42:0x0050 }] */
                @Override // android.content.BroadcastReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onReceive(android.content.Context r12, android.content.Intent r13) {
                    /*
                        Method dump skipped, instructions count: 337
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.channel.voip.VoIPManager$1.onReceive(android.content.Context, android.content.Intent):void");
                }
            };
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        private static d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c562d041ba35bfbf948a6480b9efe8c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c562d041ba35bfbf948a6480b9efe8c") : a.a;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13b8a52967c6ccd6cd2f6019816f040", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13b8a52967c6ccd6cd2f6019816f040");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(b());
        hashMap.put("logType", str);
        hashMap.put("operationName", str2);
        hashMap.put("operationTime", Long.valueOf(System.currentTimeMillis()));
        com.meituan.android.customerservice.retrofit.a.a(hashMap);
    }

    public final HashMap<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07cc6491d9c57e8605dca3335d9c1308", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07cc6491d9c57e8605dca3335d9c1308");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("pageName", "VOIP通话页");
        hashMap.put("appName", String.valueOf(com.meituan.android.customerservice.channel.voip.utils.b.e()));
        hashMap.put("phoneModel", Build.MANUFACTURER);
        hashMap.put("sysName", "android");
        hashMap.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("appVersion", com.meituan.android.customerservice.channel.voip.utils.b.d());
        hashMap.put("source", "MT_APP");
        hashMap.put("phoneNum", com.meituan.android.customerservice.channel.voip.utils.b.b());
        hashMap.put(DeviceInfo.USER_ID, Long.valueOf(com.meituan.android.customerservice.channel.voip.utils.b.a()));
        com.meituan.android.customerservice.callbase.base.c h = com.meituan.android.customerservice.cscallsdk.d.j().h();
        short c = h != null ? h.c() : (short) 0;
        hashMap.put("thirdTypeId", Integer.valueOf(c));
        String str = "";
        switch (c) {
            case 3019:
                str = "到综IM";
                break;
            case 3020:
                str = "服务体验平台";
                break;
            case 3022:
                str = "境外酒店";
                break;
        }
        hashMap.put("thirdTypeName", str);
        if (this.c != null) {
            hashMap.put(Constants.EventConstants.KEY_ORDER_ID, this.c.get(Constants.EventConstants.KEY_ORDER_ID));
            hashMap.put("orderStatus", this.c.get("orderStatus"));
            hashMap.put("visitId", this.c.get("visitId"));
            hashMap.put("questionId", this.c.get("questionId"));
            hashMap.put("orderType", this.c.get("orderType"));
            hashMap.put("question", this.c.get("question"));
        } else {
            hashMap.put(Constants.EventConstants.KEY_ORDER_ID, "");
            hashMap.put("orderStatus", "");
            hashMap.put("visitId", "");
            hashMap.put("questionId", "");
            hashMap.put("orderType", "");
            hashMap.put("question", "");
        }
        return hashMap;
    }
}
