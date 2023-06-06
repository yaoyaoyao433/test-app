package com.sankuai.waimai.store.mach;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.g;
import com.sankuai.waimai.store.util.i;
import com.tencent.open.SocialConstants;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGHttpJSNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    public b b;
    private final String c;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "wmsmapi";
    }

    public static /* synthetic */ void a(SGHttpJSNativeMethod sGHttpJSNativeMethod) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, sGHttpJSNativeMethod, changeQuickRedirect, false, "44b85b791706d7a6478c6635956720f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGHttpJSNativeMethod, changeQuickRedirect, false, "44b85b791706d7a6478c6635956720f0");
        } else if (sGHttpJSNativeMethod.b != null) {
            sGHttpJSNativeMethod.b.b();
        }
    }

    public SGHttpJSNativeMethod(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91c972b9b20778caad53cd4309af33b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91c972b9b20778caad53cd4309af33b3");
        } else {
            this.c = str;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a1d58143b46c28c5f3679e8b990d07", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a1d58143b46c28c5f3679e8b990d07") : new String[]{SocialConstants.TYPE_REQUEST};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, final String str3, final com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397cb5b8a913060a335c196339ed4dc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397cb5b8a913060a335c196339ed4dc2");
            return;
        }
        Request request = !TextUtils.isEmpty(str2) ? (Request) i.a(str2, Request.class) : null;
        if (request == null) {
            return;
        }
        if (TextUtils.isEmpty(request.path)) {
            if (aVar != null) {
                aVar.a(str3, a(-10001, null));
                return;
            }
            return;
        }
        final boolean z = 1 == request.showHud;
        if (z) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39685753a1abc5c707d9e2e157e8424e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39685753a1abc5c707d9e2e157e8424e");
            } else if (this.b != null) {
                this.b.a();
            }
        }
        g.a(this.c).a(request.path, request.parameters, new j<Object>() { // from class: com.sankuai.waimai.store.mach.SGHttpJSNativeMethod.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4af74573559f75d7a08db400ad45b8f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4af74573559f75d7a08db400ad45b8f0");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(Object obj) {
                Object[] objArr3 = {obj};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1ccac4d74b279144611ff916bdfacf7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1ccac4d74b279144611ff916bdfacf7");
                    return;
                }
                if (z) {
                    SGHttpJSNativeMethod.a(SGHttpJSNativeMethod.this);
                }
                if (aVar != null) {
                    BaseResponse baseResponse = new BaseResponse();
                    baseResponse.code = 0;
                    baseResponse.msg = "";
                    baseResponse.data = obj;
                    String a2 = SGHttpJSNativeMethod.this.a(0, baseResponse);
                    if (TextUtils.isEmpty(a2)) {
                        aVar.a(str3, SGHttpJSNativeMethod.this.a(1, null));
                    } else {
                        aVar.a(str3, a2);
                    }
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v2, types: [D, java.lang.Object] */
            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                int i = 1;
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c6415d3cf58abf491f351948ebe6afb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c6415d3cf58abf491f351948ebe6afb");
                    return;
                }
                if (z) {
                    SGHttpJSNativeMethod.a(SGHttpJSNativeMethod.this);
                }
                if (aVar != null) {
                    BaseResponse baseResponse = null;
                    if (bVar != null) {
                        baseResponse = new BaseResponse();
                        baseResponse.code = bVar.c;
                        baseResponse.msg = bVar.b;
                        baseResponse.data = bVar.e;
                        i = TextUtils.isEmpty(baseResponse.msg);
                    }
                    aVar.a(str3, SGHttpJSNativeMethod.this.a(i, baseResponse));
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0bee1baee8877503172df377f9010fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0bee1baee8877503172df377f9010fe");
                } else if (z) {
                    SGHttpJSNativeMethod.a(SGHttpJSNativeMethod.this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caab17ebc1ec53940dcd61a3e843f204", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caab17ebc1ec53940dcd61a3e843f204") : i.a(new ResponseWrapper(i, obj));
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class Request {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map<String, String> parameters;
        public String path;
        @SerializedName("show_hud")
        public int showHud;

        public Request() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public class ResponseWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Object data;
        public int status;

        public ResponseWrapper(int i, Object obj) {
            this.status = i;
            this.data = obj;
        }
    }
}
