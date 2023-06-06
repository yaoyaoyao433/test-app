package com.alipay.sdk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.sys.a;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.im.cache.bean.DBSession;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AlipayResultActivity extends Activity {
    public static final ConcurrentHashMap<String, a> a = new ConcurrentHashMap<>();

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, String str, String str2);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        com.alipay.sdk.sys.a aVar;
        String a2;
        Bundle bundleExtra;
        String a3;
        Throwable th;
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            try {
                a2 = com.sankuai.waimai.platform.utils.f.a(intent, DBSession.TABLE_NAME);
                bundleExtra = intent.getBundleExtra("result");
                a3 = com.sankuai.waimai.platform.utils.f.a(intent, KnbConstants.PARAMS_SCENE);
                aVar = a.C0029a.a(a2);
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
            }
            try {
                if (aVar == null) {
                    finish();
                    return;
                }
                com.alipay.sdk.app.statistic.a.b(aVar, "biz", "BSPSession", a2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + SystemClock.elapsedRealtime());
                if (!TextUtils.equals("mqpSchemePay", a3)) {
                    if ((TextUtils.isEmpty(a2) || bundleExtra == null) && intent.getData() != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
                            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                            String string = jSONObject.getString(DBSession.TABLE_NAME);
                            try {
                                com.alipay.sdk.app.statistic.a.b(aVar, "biz", "BSPUriSession", string);
                                Bundle bundle2 = new Bundle();
                                try {
                                    Iterator<String> keys = jSONObject2.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        bundle2.putString(next, jSONObject2.getString(next));
                                    }
                                    bundleExtra = bundle2;
                                    a2 = string;
                                } catch (Throwable th3) {
                                    th = th3;
                                    bundleExtra = bundle2;
                                    a2 = string;
                                    com.alipay.sdk.app.statistic.a.a(aVar, "biz", "BSPResEx", th);
                                    com.alipay.sdk.app.statistic.a.a(aVar, "biz", "ParseSchemeQueryError", th);
                                    if (TextUtils.isEmpty(a2)) {
                                    }
                                    com.alipay.sdk.app.statistic.a.b(this, aVar, "", aVar.d);
                                    finish();
                                    return;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    if (TextUtils.isEmpty(a2) && bundleExtra != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(SystemClock.elapsedRealtime());
                        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgReturn", sb.toString());
                        com.alipay.sdk.app.statistic.a.b(aVar, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1) + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + bundleExtra.getString("memo", CommonConstant.Symbol.MINUS));
                        b.a(a2, ConnectionResult.NETWORK_ERROR, "OK", bundleExtra);
                        com.alipay.sdk.app.statistic.a.b(this, aVar, "", aVar.d);
                        finish();
                        return;
                    }
                    com.alipay.sdk.app.statistic.a.b(this, aVar, "", aVar.d);
                    finish();
                    return;
                }
                a remove = a.remove(a2);
                if (remove == null) {
                    finish();
                    return;
                }
                remove.a(bundleExtra.getInt("endCode"), bundleExtra.getString("memo"), bundleExtra.getString("result"));
                finish();
            } catch (Throwable th6) {
                th = th6;
                com.alipay.sdk.app.statistic.a.a(aVar, "biz", "BSPSerError", th);
                com.alipay.sdk.app.statistic.a.a(aVar, "biz", "ParseBundleSerializableError", th);
                finish();
            }
        } catch (Throwable unused) {
            finish();
        }
    }
}
