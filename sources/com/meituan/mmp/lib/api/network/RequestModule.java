package com.meituan.mmp.lib.api.network;

import android.text.TextUtils;
import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.mmp.lib.devtools.e;
import com.meituan.mmp.lib.utils.ao;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ad;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.m;
import com.sankuai.meituan.retrofit2.q;
import com.tencent.open.SocialConstants;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RequestModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private ad h;
    private Interceptor i;
    private Map<Integer, m> j;

    public RequestModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e697e74e7c2809198c7dc32f6ab609cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e697e74e7c2809198c7dc32f6ab609cc");
        } else {
            this.j = new ConcurrentHashMap();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c070f6aaed2a18bff8040a7831d92c6", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c070f6aaed2a18bff8040a7831d92c6") : new String[]{SocialConstants.TYPE_REQUEST, "abortRequest"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "344c26d87dd0f2951683f22f58b8fb08", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "344c26d87dd0f2951683f22f58b8fb08") : new String[]{SocialConstants.TYPE_REQUEST, "abortRequest", "onRequestHeadersReceived.onHeaderReceived"};
    }

    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd17c43c234cf2a95281899e7630c4d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd17c43c234cf2a95281899e7630c4d2");
        }
        HashMap hashMap = new HashMap();
        try {
            return !TextUtils.isEmpty(str) ? ao.a(new JSONObject(str)) : hashMap;
        } catch (JSONException unused) {
            return hashMap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: Exception -> 0x0308, TryCatch #1 {Exception -> 0x0308, blocks: (B:7:0x002e, B:19:0x0053, B:21:0x0058, B:23:0x0071, B:24:0x0076, B:26:0x008b, B:27:0x00a2, B:28:0x00a7, B:29:0x00ad, B:31:0x00b6, B:32:0x00d4, B:34:0x00ed, B:35:0x00f2, B:37:0x00ff, B:40:0x0107, B:42:0x0123, B:43:0x013b, B:45:0x0141, B:47:0x0147, B:49:0x0155, B:52:0x017b, B:56:0x01a1, B:58:0x01d4, B:79:0x0254, B:83:0x027f, B:87:0x0297, B:89:0x02a1, B:90:0x02a8, B:92:0x02ae, B:93:0x02c4, B:82:0x027a, B:59:0x01de, B:61:0x01e4, B:63:0x01f2, B:65:0x01fa, B:66:0x020b, B:68:0x0211, B:69:0x0227, B:70:0x022c, B:71:0x0237, B:73:0x023d, B:75:0x0241, B:76:0x0249, B:78:0x0250, B:77:0x024c, B:55:0x0198, B:94:0x02ef, B:12:0x003d, B:15:0x0048), top: B:101:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4 A[Catch: Exception -> 0x0308, TryCatch #1 {Exception -> 0x0308, blocks: (B:7:0x002e, B:19:0x0053, B:21:0x0058, B:23:0x0071, B:24:0x0076, B:26:0x008b, B:27:0x00a2, B:28:0x00a7, B:29:0x00ad, B:31:0x00b6, B:32:0x00d4, B:34:0x00ed, B:35:0x00f2, B:37:0x00ff, B:40:0x0107, B:42:0x0123, B:43:0x013b, B:45:0x0141, B:47:0x0147, B:49:0x0155, B:52:0x017b, B:56:0x01a1, B:58:0x01d4, B:79:0x0254, B:83:0x027f, B:87:0x0297, B:89:0x02a1, B:90:0x02a8, B:92:0x02ae, B:93:0x02c4, B:82:0x027a, B:59:0x01de, B:61:0x01e4, B:63:0x01f2, B:65:0x01fa, B:66:0x020b, B:68:0x0211, B:69:0x0227, B:70:0x022c, B:71:0x0237, B:73:0x023d, B:75:0x0241, B:76:0x0249, B:78:0x0250, B:77:0x024c, B:55:0x0198, B:94:0x02ef, B:12:0x003d, B:15:0x0048), top: B:101:0x002e, inners: #0 }] */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r19, org.json.JSONObject r20, final com.meituan.mmp.main.IApiCallback r21) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.network.RequestModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    private Interceptor j() {
        e devTools;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a65f9eaadd3ecd1e4f5c81b551801b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Interceptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a65f9eaadd3ecd1e4f5c81b551801b");
        }
        if (this.i == null && (devTools = getDevTools()) != null) {
            this.i = devTools.a(getContext());
        }
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject a(Response<ap> response, int i) {
        Object[] objArr = {response, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4508bc86edd574c8a0d2faab92373efc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4508bc86edd574c8a0d2faab92373efc");
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        List<q> d = response.d();
        ArrayList arrayList = new ArrayList();
        try {
            for (q qVar : d) {
                if ("Set-Cookie".equalsIgnoreCase(qVar.a())) {
                    arrayList.add(qVar.b());
                } else {
                    jSONObject2.put(qVar.a(), qVar.b());
                }
            }
            jSONObject2.put("Set-Cookie", TextUtils.join(CommonConstant.Symbol.COMMA, arrayList));
            jSONObject.put(ResponseWithInnerData.TASK_ID, i);
            jSONObject.put("cookies", new JSONArray(arrayList.toArray()));
            jSONObject.put(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, jSONObject2);
            a("onRequestHeadersReceived", jSONObject.toString(), 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5a0eeae4f7899468e8f4f3b5c76d0637", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5a0eeae4f7899468e8f4f3b5c76d0637");
        }
        if (th != null) {
            if (th.getCause() != null) {
                String message = th.getCause().getMessage();
                if (!TextUtils.isEmpty(message)) {
                    return "message :" + message + "\nstackTrace :" + com.meituan.mmp.lib.trace.b.b(th);
                }
            }
            return "message :" + th.getMessage() + "\nstackTrace :" + com.meituan.mmp.lib.trace.b.b(th);
        }
        return "";
    }
}
