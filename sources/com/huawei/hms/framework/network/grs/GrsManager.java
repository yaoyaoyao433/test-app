package com.huawei.hms.framework.network.grs;

import android.annotation.SuppressLint;
import android.content.Context;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.BasePlugin;
import com.huawei.hms.framework.network.restclient.hwhttp.plugin.PluginInterceptor;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GrsManager implements BasePlugin {
    private static final int GRS_KEY_INDEX = 1;
    private static final int GRS_PATH_INDEX = 2;
    private static final String GRS_SCHEMA = "grs://";
    private static final int GRS_SERVICE_INDEX = 0;
    private static final int MAX_GRS_SPLIT = 3;
    private static final String SEPARATOR = "/";
    private static final String TAG = "GrsManager";
    @SuppressLint({"StaticFieldLeak"})
    private static volatile GrsManager instance;
    private GrsConfig grsConfig;
    private f grsInterceptor;

    private GrsManager() {
    }

    public static GrsManager getInstance() {
        if (instance == null) {
            synchronized (GrsManager.class) {
                if (instance == null) {
                    instance = new GrsManager();
                }
            }
        }
        return instance;
    }

    private String getServiceNameUrl(String str, String str2) {
        return GrsApi.synGetGrsUrl(str, str2);
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith(GRS_SCHEMA);
    }

    private String[] parseGRSSchema(String str) {
        return StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf(GRS_SCHEMA) + 6).split("/", 3);
    }

    public PluginInterceptor getInterceptor() {
        if (this.grsInterceptor == null) {
            this.grsInterceptor = new f();
        }
        return this.grsInterceptor;
    }

    public boolean initGrs(Context context, GrsConfig grsConfig) {
        GrsConfig grsConfig2 = this.grsConfig;
        if (grsConfig2 == null || !grsConfig2.equal(grsConfig)) {
            this.grsConfig = grsConfig;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            GrsConfig grsConfig3 = this.grsConfig;
            GrsApi.grsSdkInit(applicationContext, grsConfig3 != null ? grsConfig3.getGrsBaseInfo(applicationContext) : null);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String parseGrs(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "/"
            boolean r0 = r6.endsWith(r0)
            r1 = 1
            if (r0 == 0) goto L19
            java.lang.String r0 = "grs://"
            int r0 = r6.indexOf(r0)
            int r2 = r6.length()
            int r2 = r2 - r1
            java.lang.String r6 = com.huawei.hms.framework.common.StringUtils.substring(r6, r0, r2)
        L19:
            java.lang.String[] r6 = r5.parseGRSSchema(r6)
            java.lang.String r0 = ""
            int r2 = r6.length
            r3 = 0
            r4 = 2
            if (r2 != r1) goto L2d
            r0 = r6[r3]
            java.lang.String r1 = "ROOT"
        L28:
            java.lang.String r0 = r5.getServiceNameUrl(r0, r1)
            goto L3d
        L2d:
            int r2 = r6.length
            if (r2 < r4) goto L35
            r0 = r6[r3]
            r1 = r6[r1]
            goto L28
        L35:
            java.lang.String r1 = "GrsManager"
            java.lang.String r2 = "parseGrs params.length<1."
            com.huawei.hms.framework.common.Logger.i(r1, r2)
        L3d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L71
            int r1 = r6.length
            if (r1 <= r4) goto L70
            java.lang.String r1 = "/"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r6 = r6[r4]
        L58:
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L70
        L60:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r6 = r6[r4]
            goto L58
        L70:
            return r0
        L71:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "can not get url, do grsUrl(serviceName or key) error?"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.GrsManager.parseGrs(java.lang.String):java.lang.String");
    }
}
