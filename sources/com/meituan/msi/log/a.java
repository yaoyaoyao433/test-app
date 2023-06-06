package com.meituan.msi.log;

import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.context.c;
import com.meituan.msi.context.h;
import com.meituan.msi.util.ae;
import com.meituan.msi.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.connect.common.Constants;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Random b = new Random();

    public static void a(ApiResponse<?> apiResponse) {
        Object[] objArr = {apiResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10d9b4933a3be986518a52ef045c3a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10d9b4933a3be986518a52ef045c3a98");
        } else if (TextUtils.equals(apiResponse.getApiScope(), PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE) && TextUtils.equals(apiResponse.getApiName(), "reportMSIMetrics")) {
        } else {
            Map<String, Object> c = c(apiResponse);
            if (b.nextInt(10000) >= apiResponse.getSampleRate()) {
                return;
            }
            c apiReporter = apiResponse.getApiReporter();
            if (apiReporter instanceof com.meituan.msi.defaultcontext.a) {
                com.meituan.msi.defaultcontext.a aVar = (com.meituan.msi.defaultcontext.a) apiReporter;
                String apiScope = apiResponse.getApiScope();
                String apiName = apiResponse.getApiName();
                Object[] objArr2 = {apiScope, apiName};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msi.defaultcontext.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "5ae004ba88c5a2c48ef1e5cd9cf55638", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "5ae004ba88c5a2c48ef1e5cd9cf55638");
                } else {
                    String b2 = com.meituan.msi.defaultcontext.a.b(apiScope, apiName);
                    Integer num = aVar.c.get(b2);
                    if (aVar.a() && num != null && num.intValue() >= 0 && num.intValue() < aVar.d.length - 1) {
                        aVar.c.put(b2, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            if (c != null) {
                float sampleRate = apiResponse.getSampleRate() / 10000.0f;
                a("the sampleRate is " + sampleRate);
                c.put("$sr", Float.valueOf(sampleRate));
            }
            Babel.logRT(new Log.Builder("").tag("msi.api.duration").value(apiResponse.getMsiDuration()).reportChannel("prism-report-knb").optional(c).build());
        }
    }

    public static void b(ApiResponse<?> apiResponse) {
        String message;
        String str;
        String stringWriter;
        Object[] objArr = {apiResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17bb64bf55580345689111fe0edbd9f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17bb64bf55580345689111fe0edbd9f8");
            return;
        }
        Map<String, Object> c = c(apiResponse);
        if (apiResponse.getStatusCode() == ApiResponse.API_EXCEPTION && apiResponse.getApiThrowable() != null) {
            StringBuilder sb = new StringBuilder();
            if (apiResponse != null) {
                str = apiResponse.getApiName() + ":fail ";
            } else {
                str = StringUtil.SPACE;
            }
            sb.append(str);
            Throwable apiThrowable = apiResponse.getApiThrowable();
            Object[] objArr2 = {apiThrowable};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6bba7e8b1954769cebe4c816ae27fe9f", RobustBitConfig.DEFAULT_VALUE)) {
                stringWriter = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6bba7e8b1954769cebe4c816ae27fe9f");
            } else if (apiThrowable == null) {
                stringWriter = "";
            } else {
                StringWriter stringWriter2 = new StringWriter();
                apiThrowable.printStackTrace(new PrintWriter(stringWriter2));
                stringWriter = stringWriter2.toString();
            }
            sb.append(stringWriter);
            c.put("message", sb.toString());
        } else {
            c.put("message", apiResponse.getStatusMsg());
        }
        Babel.logRT(new Log.Builder("").tag("msi.api.exception").reportChannel("prism-report-knb").optional(c).build());
        if (!com.meituan.msi.a.i() || apiResponse == null || apiResponse.getStatusCode() != ApiResponse.API_EXCEPTION || apiResponse.getApiThrowable() == null) {
            return;
        }
        Throwable a2 = ae.a(apiResponse.getApiThrowable());
        if (!(a2 instanceof RuntimeException) || (message = a2.getMessage()) == null || message.contains("errorCode < 500")) {
            return;
        }
        final RuntimeException runtimeException = (RuntimeException) a2;
        m.a(new Runnable() { // from class: com.meituan.msi.log.a.1
            @Override // java.lang.Runnable
            public final void run() {
                throw runtimeException;
            }
        });
    }

    public static void a(Object obj, ApiRequest apiRequest) {
        Object[] objArr = {obj, apiRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a29fd6625b8108d3eab3b9155779eb5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a29fd6625b8108d3eab3b9155779eb5e");
        } else {
            a(obj, apiRequest, "msi.api.detail");
        }
    }

    public static void a(Object obj, String str, String str2) {
        Object[] objArr = {obj, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75f4e9b8dbc38fedb97b5f7563033bab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75f4e9b8dbc38fedb97b5f7563033bab");
            return;
        }
        Object[] objArr2 = {obj, str, str2, "msi.api.detail"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "54100e39cbfc1089e70582702b4bc547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "54100e39cbfc1089e70582702b4bc547");
        } else if (TextUtils.isEmpty(str) || obj == null) {
        } else {
            String str3 = TextUtils.isEmpty(str2) ? "default" : str2;
            HashMap hashMap = new HashMap();
            hashMap.put("reportType", "native");
            hashMap.put("name", str);
            hashMap.put(Constants.PARAM_SCOPE, str3);
            if (obj != null) {
                hashMap.put("result", obj);
            }
            a(hashMap, "msi.api.detail", 0);
        }
    }

    public static void b(Object obj, ApiRequest apiRequest) {
        Object[] objArr = {obj, apiRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c48a72bad7957db94f97af484369cc00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c48a72bad7957db94f97af484369cc00");
        } else {
            a(obj, apiRequest, "msi.api.value");
        }
    }

    public static void a(Map<String, Object> map, ApiRequest apiRequest, String str, int i, float f) {
        Object[] objArr = {map, apiRequest, str, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92be56142ecc5461013ddd25ab969008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92be56142ecc5461013ddd25ab969008");
        } else if (apiRequest != null && map != null) {
            Map<String, Object> a2 = a(apiRequest);
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    a2.put(entry.getKey(), entry.getValue());
                }
            }
            a2.put("$sr", Float.valueOf(f));
            if (f < 1.0f) {
                if (b.nextInt(10000) <= f * 10000.0f) {
                    a(a2, str, i);
                    return;
                }
                return;
            }
            a(a2, str, i);
        }
    }

    private static void a(Object obj, ApiRequest apiRequest, String str) {
        Object[] objArr = {obj, apiRequest, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "767c82e9d3a6a02cbdee653d8fb79664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "767c82e9d3a6a02cbdee653d8fb79664");
        } else if (apiRequest == null || obj == null) {
        } else {
            Map<String, Object> a2 = a(apiRequest);
            if (obj != null) {
                a2.put("result", obj);
            }
            a(a2, str, 0);
        }
    }

    private static void a(Map<String, Object> map, String str, int i) {
        Object[] objArr = {map, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c4ea9581f22b57c3cdf73e84d41fe4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c4ea9581f22b57c3cdf73e84d41fe4b");
        } else if (map == null) {
        } else {
            if (com.meituan.msi.a.i()) {
                PrintStream printStream = System.out;
                printStream.println("MsiEvent " + map.toString());
            }
            Babel.logRT(new Log.Builder("").tag(str).value(i).reportChannel("prism-report-knb").optional(map).build());
        }
    }

    private static Map<String, Object> c(ApiResponse<?> apiResponse) {
        Object[] objArr = {apiResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55ee2495f1f2c433071c903a9c0bf9d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55ee2495f1f2c433071c903a9c0bf9d6");
        }
        HashMap hashMap = new HashMap();
        String apiName = apiResponse.getApiName();
        int statusCode = apiResponse.getStatusCode();
        String env = apiResponse.getEnv();
        String refer = apiResponse.getRefer();
        long msiDuration = apiResponse.getMsiDuration();
        String apiScope = apiResponse.getApiScope();
        hashMap.put("bundle_name", refer);
        if (apiResponse.getPagePath() != null) {
            hashMap.put("path", apiResponse.getPagePath());
        }
        hashMap.put("env", env);
        hashMap.put("reportType", "native");
        hashMap.put("duration", Long.valueOf(msiDuration));
        hashMap.put("statusCode", Integer.valueOf(statusCode));
        hashMap.put("name", apiName);
        hashMap.put(Constants.PARAM_SCOPE, apiScope);
        hashMap.put("new_api", Integer.valueOf(apiResponse.isNewApi() ? 1 : 0));
        a(apiResponse, apiName, statusCode, env, refer, msiDuration);
        return hashMap;
    }

    private static Map<String, Object> a(ApiRequest apiRequest) {
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "19de34375e658645f030d1d8c882ea3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "19de34375e658645f030d1d8c882ea3a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reportType", "native");
        if (apiRequest != null) {
            hashMap.put("name", apiRequest.getName());
            hashMap.put(Constants.PARAM_SCOPE, apiRequest.getScope());
            hashMap.put("bundle_name", apiRequest.getReferrer());
            hashMap.put("env", apiRequest.getSource());
            h hVar = apiRequest.getContainerContext().h;
            if (hVar != null) {
                hashMap.put("path", hVar.b());
            }
        }
        return hashMap;
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0bf5a5fcad3629cfe4e72603fa0b4f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0bf5a5fcad3629cfe4e72603fa0b4f6");
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("message:");
        sb.append(str);
        sb.append(",invokeType");
        sb.append(str2);
        a(sb.toString());
    }

    private static void a(ApiResponse<?> apiResponse, String str, int i, String str2, String str3, long j) {
        Object[] objArr = {apiResponse, str, Integer.valueOf(i), str2, str3, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f9938f057f839362b6ca351fa84c521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f9938f057f839362b6ca351fa84c521");
            return;
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("name:");
        sb.append(str);
        sb.append(",statusCode:");
        sb.append(i);
        sb.append(",env:");
        sb.append(str2);
        sb.append(",page:");
        sb.append(str3);
        sb.append(",duration:");
        sb.append(j);
        sb.append(",newApi:");
        sb.append(apiResponse.isNewApi());
        sb.append(",sampleRate:");
        sb.append(apiResponse.getSampleRate());
        if (apiResponse.getPagePath() != null) {
            sb.append(",path:");
            sb.append(apiResponse.getPagePath());
        }
        if (i != ApiResponse.OK) {
            sb.append(apiResponse.getStatusMsg());
        }
        sb.append(apiResponse.getCallbackId());
        a(sb.toString());
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f081f28adbee217382f044a116d6b42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f081f28adbee217382f044a116d6b42");
            return;
        }
        if (com.meituan.msi.a.i() && !TextUtils.isEmpty(str)) {
            PrintStream printStream = System.out;
            printStream.println("MSILog " + str);
        }
        com.dianping.networklog.c.a(str, 32, new String[]{"MSI"});
    }
}
