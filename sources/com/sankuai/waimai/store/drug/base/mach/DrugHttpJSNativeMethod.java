package com.sankuai.waimai.store.drug.base.mach;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.jsv8.a;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.mach.IMachHttpNativeMethod;
import com.sankuai.waimai.store.mach.b;
import com.sankuai.waimai.store.util.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugHttpJSNativeMethod implements IMachHttpNativeMethod {
    private static final String METHOD_REQUEST = "request";
    private static final String MODULE_DRUG_API = "drugapi";
    private static final String REQUEST_KEY_HUD_LEVEL = "hud_level";
    private static final int SHOW_NATIVE_LOADING = 1;
    private static final int STATE_ERROR_OTHER = -10002;
    private static final int STATE_ERROR_PATH = -10001;
    private static final int STATE_FAIL = 1;
    private static final int STATE_SUCCESS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private b mCallback;
    private String mRequestTag;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Request {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Map<String, String> parameters;
        public String path;
        @SerializedName("show_hud")
        public int showHud;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String module() {
        return MODULE_DRUG_API;
    }

    public DrugHttpJSNativeMethod() {
    }

    public DrugHttpJSNativeMethod(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f08cfb0dd351be5d6a90778d86ff2ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f08cfb0dd351be5d6a90778d86ff2ef");
        } else {
            this.mRequestTag = str;
        }
    }

    @Override // com.sankuai.waimai.store.mach.IMachHttpNativeMethod
    public void initParam(String str) {
        this.mRequestTag = str;
    }

    @Override // com.sankuai.waimai.store.mach.IMachHttpNativeMethod
    public void bindLoading(b bVar) {
        this.mCallback = bVar;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4adcec17aa968b7a4c72b3f1c4056521", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4adcec17aa968b7a4c72b3f1c4056521") : new String[]{"request"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public void invoke(String str, String str2, final String str3, final a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3880cd5f3609351d234d6c69ec947c5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3880cd5f3609351d234d6c69ec947c5d");
            return;
        }
        Request request = !TextUtils.isEmpty(str2) ? (Request) i.a(str2, Request.class) : null;
        if (request == null) {
            if (aVar != null) {
                aVar.a(str3, buildResponse(STATE_ERROR_OTHER, null));
            }
        } else if (TextUtils.isEmpty(request.path)) {
            if (aVar != null) {
                aVar.a(str3, buildResponse(STATE_ERROR_PATH, null));
            }
        } else {
            final boolean z = 1 == request.showHud;
            if (z) {
                showLoadingIfNecessary();
            }
            com.sankuai.waimai.store.drug.base.net.b.a(this.mRequestTag).a(request.path, request.parameters, new j<Object>() { // from class: com.sankuai.waimai.store.drug.base.mach.DrugHttpJSNativeMethod.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "80f062116f1ed97d8fd9ba3ccddfbae8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "80f062116f1ed97d8fd9ba3ccddfbae8");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(Object obj) {
                    Object[] objArr2 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "86f94499789b5467a3fd3e1007357ac6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "86f94499789b5467a3fd3e1007357ac6");
                        return;
                    }
                    if (z) {
                        DrugHttpJSNativeMethod.this.dismissLoading();
                    }
                    if (aVar != null) {
                        BaseResponse baseResponse = new BaseResponse();
                        baseResponse.code = 0;
                        baseResponse.msg = "";
                        baseResponse.data = obj;
                        String buildResponse = DrugHttpJSNativeMethod.this.buildResponse(0, baseResponse);
                        if (TextUtils.isEmpty(buildResponse)) {
                            aVar.a(str3, DrugHttpJSNativeMethod.this.buildResponse(1, null));
                        } else {
                            aVar.a(str3, buildResponse);
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v2, types: [D, java.lang.Object] */
                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    int i = 1;
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f39819007bb6f8bf9f4760f69d25f52f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f39819007bb6f8bf9f4760f69d25f52f");
                        return;
                    }
                    if (z) {
                        DrugHttpJSNativeMethod.this.dismissLoading();
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
                        aVar.a(str3, DrugHttpJSNativeMethod.this.buildResponse(i, baseResponse));
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dbde393884cb95b747c20563a8ca8e16", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dbde393884cb95b747c20563a8ca8e16");
                    } else if (z) {
                        DrugHttpJSNativeMethod.this.dismissLoading();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String buildResponse(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281a5f91e673e8b78fdedeebbb75b872", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281a5f91e673e8b78fdedeebbb75b872") : i.a(new ResponseWrapper(i, obj));
    }

    private void showLoadingIfNecessary() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04769ba3ddaf20e2ae1a929a22f10591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04769ba3ddaf20e2ae1a929a22f10591");
        } else if (this.mCallback != null) {
            this.mCallback.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e61efb8b2bbe19207adc76ea28a2022f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e61efb8b2bbe19207adc76ea28a2022f");
        } else if (this.mCallback != null) {
            this.mCallback.b();
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ResponseWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Object data;
        public int status;

        public ResponseWrapper(int i, Object obj) {
            this.status = i;
            this.data = obj;
        }
    }
}
