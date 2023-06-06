package com.meituan.android.legwork.net.encrypt;

import android.net.Uri;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.common.util.g;
import com.meituan.android.legwork.net.util.a;
import com.meituan.android.legwork.net.util.b;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class LegworkEncryptUtil {
    private static final String ENCRYPT_PARAM_KEY = "_janus_en_token";
    private static final String TAG = "LegworkEncryptUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static aj handleEncrypt(aj ajVar) {
        EncryptUrlConfig encryptUrlConfig;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e8005da8c72c93916e589ee6391db8b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e8005da8c72c93916e589ee6391db8b8");
        }
        if (!g.a().i || isGetMethod(ajVar) || !(ajVar.i() instanceof o) || !requestNeedEncrypt(ajVar) || (encryptUrlConfig = g.a().f.get(getPath(ajVar.b()))) == null || ((encryptUrlConfig.query == null || encryptUrlConfig.query.size() == 0) && (encryptUrlConfig.body == null || encryptUrlConfig.body.size() == 0))) {
            return ajVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            String b = ajVar.b();
            x.c(TAG, "开始query参数加密");
            String encryptQueryParams = encryptQueryParams(b, encryptUrlConfig.query, arrayList);
            x.c(TAG, "开始body参数加密");
            o.a aVar = new o.a();
            encryptBodyParams((o) ajVar.i(), encryptUrlConfig.body, arrayList, aVar);
            x.c(TAG, "开始隐私参数加密");
            String encrypt = encrypt(arrayList);
            if (TextUtils.isEmpty(encrypt)) {
                return ajVar;
            }
            aVar.a(ENCRYPT_PARAM_KEY, encrypt);
            return ajVar.a().b(encryptQueryParams).a(aVar.a()).a();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            try {
                if (encryptUrlConfig.query != null && encryptUrlConfig.query.size() > 0) {
                    sb.append("\n[encryptUrlConfig.query]:");
                    sb.append(b.a().toJson(encryptUrlConfig.query));
                }
                if (arrayList.size() > 0) {
                    sb.append("\n[encryptDataList]:");
                    sb.append(b.a().toJson(arrayList));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                x.e(TAG, "GsonGenerator.generate().toJson error", e2);
                x.a(e2);
            }
            x.e(TAG, "parse error！url:" + ajVar.b() + ",exception:", e);
            x.a(e);
            reportEncryptError("跑腿网络请求隐私参数长期方案加密异常 [url：" + ajVar.b() + "], [msg:" + e.toString() + "], [stackTrace:" + stackTrace(e) + "][data:" + sb.toString() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return ajVar;
        }
    }

    private static void reportEncryptError(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "059eed923e9dc64765a80e5cafbce275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "059eed923e9dc64765a80e5cafbce275");
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("msg", str);
        }
        q.a("legwork_encrypt_url_error", 8, hashMap);
    }

    private static boolean isGetMethod(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a60d8bc9d749c980e9bcfda466b6369", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a60d8bc9d749c980e9bcfda466b6369")).booleanValue() : "GET".equalsIgnoreCase(ajVar.c());
    }

    private static boolean requestNeedEncrypt(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e31fbefaea5c53af0df4706e94a3561", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e31fbefaea5c53af0df4706e94a3561")).booleanValue() : g.a().f.containsKey(getPath(ajVar.b()));
    }

    public static String getPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d88afc2f99a626fe4f5a05b41602c91a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d88afc2f99a626fe4f5a05b41602c91a");
        }
        try {
            Uri parse = Uri.parse(str);
            String path = parse.getPath();
            StringBuilder sb = new StringBuilder();
            sb.append((String) PmUtil.a(new PmUtil.a<String>() { // from class: com.meituan.android.legwork.net.encrypt.LegworkEncryptUtil.1
                @Override // com.meituan.android.legwork.common.util.PmUtil.a
                public final /* bridge */ /* synthetic */ String a() {
                    return "mt/";
                }

                @Override // com.meituan.android.legwork.common.util.PmUtil.a
                public final /* bridge */ /* synthetic */ String b() {
                    return "wm/";
                }

                @Override // com.meituan.android.legwork.common.util.PmUtil.a
                public final /* bridge */ /* synthetic */ String c() {
                    return "dp/";
                }

                @Override // com.meituan.android.legwork.common.util.PmUtil.a
                public final /* bridge */ /* synthetic */ String d() {
                    return "unknown/";
                }
            }));
            sb.append("v");
            return (path == null || !path.contains(sb.toString())) ? path : a.c(parse);
        } catch (Exception unused) {
            return str;
        }
    }

    private static String encryptQueryParams(String str, List<EncryptConfigBean> list, List<EncryptBean> list2) {
        Map<String, String> urlQuery;
        Object[] objArr = {str, list, list2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "61455535b67a04b96fefc3a455886728", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "61455535b67a04b96fefc3a455886728");
        }
        if (list == null || list.size() == 0 || (urlQuery = getUrlQuery(str)) == null || urlQuery.size() == 0 || !str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, str.indexOf(CommonConstant.Symbol.QUESTION_MARK) + 1));
        HashMap hashMap = new HashMap();
        for (EncryptConfigBean encryptConfigBean : list) {
            hashMap.put(encryptConfigBean.rootName, encryptConfigBean);
        }
        for (Map.Entry<String, String> entry : urlQuery.entrySet()) {
            EncryptConfigBean encryptConfigBean2 = (EncryptConfigBean) hashMap.get(entry.getKey());
            if (encryptConfigBean2 != null && urlQuery.containsKey(encryptConfigBean2.rootName)) {
                list2.add(new EncryptBean(encryptConfigBean2.rootName, urlQuery.get(encryptConfigBean2.rootName), null));
            } else {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append("&");
            }
        }
        return sb.substring(0, sb.toString().length() - 1);
    }

    public static Map<String, String> getUrlQuery(String str) {
        Uri parse;
        Set<String> queryParameterNames;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "129c2b212a2570a5cc43b0cc83b97290", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "129c2b212a2570a5cc43b0cc83b97290");
        }
        if (TextUtils.isEmpty(str) || (queryParameterNames = (parse = Uri.parse(str)).getQueryParameterNames()) == null || queryParameterNames.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : queryParameterNames) {
            hashMap.put(str2, parse.getQueryParameter(str2));
        }
        return hashMap;
    }

    private static void encryptBodyParams(o oVar, List<EncryptConfigBean> list, List<EncryptBean> list2, o.a aVar) {
        boolean z;
        Object[] objArr = {oVar, list, list2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a78e1692304cbeba714b5f6008e8455c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a78e1692304cbeba714b5f6008e8455c");
        } else if (list == null || list.size() == 0 || oVar == null || oVar.a() == 0) {
            if (oVar == null || oVar.a() <= 0) {
                return;
            }
            for (int i = 0; i < oVar.a(); i++) {
                aVar.a(oVar.b(i), oVar.d(i));
            }
        } else {
            for (int i2 = 0; i2 < oVar.a(); i2++) {
                String b = oVar.b(i2);
                String d = oVar.d(i2);
                for (EncryptConfigBean encryptConfigBean : list) {
                    String[] positionList = getPositionList(encryptConfigBean.position);
                    if (encryptConfigBean.rootName.equals(b)) {
                        if (positionList == null || positionList.length == 0 || encryptConfigBean.position.equals("[*]") || isEndAllStar(positionList, 0)) {
                            list2.add(new EncryptBean(oVar.b(i2), oVar.d(i2)));
                            z = true;
                            break;
                        }
                        d = encryptBodyValueWithPosition(b, d, positionList, list2);
                    }
                }
                z = false;
                if (!z) {
                    aVar.a(b, d);
                }
            }
        }
    }

    private static String[] getPositionList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d47474ee78fb68b148ec40251b9f83cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d47474ee78fb68b148ec40251b9f83cb");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.replaceAll("]\\[", "].[").split("\\.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.meituan.robust.ChangeQuickRedirect] */
    /* JADX WARN: Type inference failed for: r12v1 */
    private static String encryptBodyValueWithPosition(String str, String str2, String[] strArr, List<EncryptBean> list) {
        int i;
        JsonElement jsonElement;
        Object[] objArr = {str, str2, strArr, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        int i2 = changeQuickRedirect2;
        if (PatchProxy.isSupport(objArr, null, i2, true, "b800f5e90a0100e78c66ae7c7e09d71b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b800f5e90a0100e78c66ae7c7e09d71b");
        }
        if (strArr == null || strArr.length == 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
        } catch (Exception e) {
            e = e;
            i2 = 1;
        }
        try {
            if (strArr[0].equals("[*]")) {
                JsonArray asJsonArray = new JsonParser().parse(str2).getAsJsonArray();
                if (asJsonArray != null && asJsonArray.size() > 0) {
                    for (int i3 = 0; i3 < asJsonArray.size(); i3++) {
                        try {
                            jsonElement = asJsonArray.get(i3);
                            i = 1;
                        } catch (Exception e2) {
                            e = e2;
                            i = 1;
                        }
                        try {
                            recursionEncrypt(str, jsonElement, list, strArr, "[" + i3 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT, 1);
                        } catch (Exception e3) {
                            e = e3;
                            Object[] objArr2 = new Object[i];
                            objArr2[0] = e + "rootName:" + str + "positions:" + strArr[0] + "i:" + i3;
                            x.e(TAG, objArr2);
                        }
                    }
                }
                return asJsonArray.toString();
            }
            JsonElement parse = new JsonParser().parse(str2);
            recursionEncrypt(str, parse, list, strArr, "", 0);
            return parse.toString();
        } catch (Exception e4) {
            e = e4;
            Object[] objArr3 = new Object[i2];
            objArr3[0] = e + "加密错误：rootName:" + str;
            x.e(TAG, objArr3);
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void recursionEncrypt(java.lang.String r21, com.google.gson.JsonElement r22, java.util.List<com.meituan.android.legwork.net.encrypt.EncryptBean> r23, java.lang.String[] r24, java.lang.String r25, int r26) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.net.encrypt.LegworkEncryptUtil.recursionEncrypt(java.lang.String, com.google.gson.JsonElement, java.util.List, java.lang.String[], java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String encrypt(java.util.List<com.meituan.android.legwork.net.encrypt.EncryptBean> r13) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.legwork.net.encrypt.LegworkEncryptUtil.changeQuickRedirect
            java.lang.String r11 = "8b79c602ef7c40c70b44218bcc593dfe"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r13 = 0
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r13, r10, r0, r11)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L1f:
            java.lang.String r1 = ""
            if (r13 == 0) goto L68
            int r2 = r13.size()
            if (r2 <= 0) goto L68
            java.lang.String r2 = ""
            com.google.gson.Gson r3 = com.meituan.android.legwork.net.util.b.a()     // Catch: java.lang.Exception -> L4d
            java.lang.String r13 = r3.toJson(r13)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "LegworkEncryptUtil"
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L4b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4b
            java.lang.String r5 = "encrypt data:"
            r4.<init>(r5)     // Catch: java.lang.Exception -> L4b
            r4.append(r13)     // Catch: java.lang.Exception -> L4b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L4b
            r3[r9] = r4     // Catch: java.lang.Exception -> L4b
            com.meituan.android.legwork.utils.x.e(r2, r3)     // Catch: java.lang.Exception -> L4b
            goto L5a
        L4b:
            r2 = move-exception
            goto L51
        L4d:
            r13 = move-exception
            r12 = r2
            r2 = r13
            r13 = r12
        L51:
            java.lang.String r3 = "LegworkEncryptUtil"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r9] = r2
            com.meituan.android.legwork.utils.x.e(r3, r0)
        L5a:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L68
            com.sankuai.waimai.platform.encrypt.c r0 = com.sankuai.waimai.platform.encrypt.c.a()
            java.lang.String r1 = r0.a(r13)
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.net.encrypt.LegworkEncryptUtil.encrypt(java.util.List):java.lang.String");
    }

    private static boolean isEndAllStar(String[] strArr, int i) {
        Object[] objArr = {strArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e6037868694497d998e6b5845e229976", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e6037868694497d998e6b5845e229976")).booleanValue();
        }
        if (strArr == null || i > strArr.length - 1) {
            return true;
        }
        while (i < strArr.length) {
            if (!strArr[i].equals("[*]")) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static String stackTrace(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c97776e5829bfd617b49bbde496dc7f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c97776e5829bfd617b49bbde496dc7f7");
        }
        if (exc == null) {
            return "";
        }
        try {
            return Log.getStackTraceString(exc);
        } catch (Exception e) {
            x.e(TAG, "msg:" + e.toString());
            return "";
        }
    }
}
