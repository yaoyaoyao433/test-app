package com.xiaomi.mipush.sdk;

import com.xiaomi.push.hg;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class az {
    private static HashMap<as, a> a = new HashMap<>();

    /* loaded from: classes6.dex */
    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    static {
        a(as.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        a(as.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        a(as.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        a(as.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static a a(as asVar) {
        return a.get(asVar);
    }

    private static void a(as asVar, a aVar) {
        a.put(asVar, aVar);
    }

    public static hg b(as asVar) {
        return hg.AggregatePushSwitch;
    }

    public static am c(as asVar) {
        switch (asVar) {
            case ASSEMBLE_PUSH_HUAWEI:
                return am.UPLOAD_HUAWEI_TOKEN;
            case ASSEMBLE_PUSH_FCM:
                return am.UPLOAD_FCM_TOKEN;
            case ASSEMBLE_PUSH_COS:
                return am.UPLOAD_COS_TOKEN;
            case ASSEMBLE_PUSH_FTOS:
                return am.UPLOAD_FTOS_TOKEN;
            default:
                return null;
        }
    }
}
