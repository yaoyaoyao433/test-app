package com.sankuai.waimai.mach.js;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.jsv8.a;
import com.sankuai.waimai.mach.model.net.MachResponse;
import com.sankuai.waimai.mach.utils.b;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public abstract class HttpJSNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface JSRequest {
        @POST
        @FormUrlEncoded
        d<ap> get(@Url String str, @FieldMap Map<String, String> map);
    }

    public abstract void httpRequest(String str, Map<String, String> map, j<ap> jVar);

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String module() {
        return "wmapi";
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec3db3f611ffffdc77bd1157b5029b87", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec3db3f611ffffdc77bd1157b5029b87") : new String[]{SocialConstants.TYPE_REQUEST, "requestWx"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public void invoke(String str, String str2, final String str3, final a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd1ed0181c3855b47dc9ac2695e7b97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd1ed0181c3855b47dc9ac2695e7b97b");
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            Request request = (Request) b.a().fromJson(str2, (Class<Object>) Request.class);
            String str4 = "";
            if (SocialConstants.TYPE_REQUEST.equals(str)) {
                if (TextUtils.isEmpty(request.path)) {
                    return;
                }
                str4 = request.path;
            } else if ("requestWx".equals(str)) {
                if (TextUtils.isEmpty(request.url)) {
                    return;
                }
                str4 = request.url;
                com.sankuai.waimai.mach.common.b bVar = i.a().g;
                if (bVar != null) {
                    if (request.parameters == null) {
                        request.parameters = new HashMap();
                    }
                    request.parameters.put(FingerprintManager.TAG, bVar.a());
                }
            }
            httpRequest(str4, request.parameters, new j<ap>() { // from class: com.sankuai.waimai.mach.js.HttpJSNativeMethod.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.e
                public void onCompleted() {
                }

                @Override // rx.e
                public void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37459dde8835c2214a61d6d8d21a91b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37459dde8835c2214a61d6d8d21a91b9");
                    } else {
                        aVar.a(str3, "{\"status\":\"-1\",\"data\":null}");
                    }
                }

                @Override // rx.e
                public void onNext(ap apVar) {
                    Object[] objArr2 = {apVar};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "df4b2e329d4099d52133cc938f62a4fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "df4b2e329d4099d52133cc938f62a4fd");
                        return;
                    }
                    String string = apVar.string();
                    if (TextUtils.isEmpty(string)) {
                        aVar.a(str3, "{\"status\":\"-1\",\"data\":null}");
                    } else {
                        aVar.a(str3, b.a().toJson(new ResponseWrapper(0, (MachResponse) new Gson().fromJson(string, (Class<Object>) MachResponse.class))));
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class Request {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map<String, String> parameters;
        public String path;
        public String url;

        public Request() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class ResponseWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public MachResponse data;
        public int status;

        public ResponseWrapper(int i, MachResponse machResponse) {
            this.status = i;
            this.data = machResponse;
        }
    }
}
