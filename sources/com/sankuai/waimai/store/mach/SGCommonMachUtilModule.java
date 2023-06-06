package com.sankuai.waimai.store.mach;

import android.graphics.Bitmap;
import android.support.annotation.Keep;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.store.util.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGCommonMachUtilModule implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class Parameter {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String url;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "sg_mach_common_util";
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ec885d4d313c8bf62f5785f14c32eba", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ec885d4d313c8bf62f5785f14c32eba") : new String[]{"getImageAspectRatio"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, final String str3, final com.sankuai.waimai.mach.jsv8.a aVar) {
        final Parameter parameter;
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e320437baedb1cb299c5da5d6077303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e320437baedb1cb299c5da5d6077303");
        } else if (!"getImageAspectRatio".equals(str) || t.a(str2) || (parameter = (Parameter) i.a(str2, new TypeToken<Parameter>() { // from class: com.sankuai.waimai.store.mach.SGCommonMachUtilModule.1
        }.getType())) == null || aVar == null || t.a(parameter.url)) {
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.store.mach.SGCommonMachUtilModule.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ca70f21b621dcc26a6f6f4ddfeb9cdd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ca70f21b621dcc26a6f6f4ddfeb9cdd");
                        return;
                    }
                    b.C0608b a2 = com.sankuai.waimai.store.imageloader.a.a(parameter.url);
                    a2.c = parameter.url;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.store.mach.SGCommonMachUtilModule.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr3 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e967ccd27977c07806de6c5c9b53b292", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e967ccd27977c07806de6c5c9b53b292");
                            } else if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
                            } else {
                                CallbackInfo callbackInfo = new CallbackInfo();
                                callbackInfo.ratio = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                                Response response = new Response();
                                response.data = callbackInfo;
                                aVar.a(str3, i.a(response));
                            }
                        }
                    }, 1);
                }
            });
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class CallbackInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public float ratio;

        public CallbackInfo() {
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    static final class Response {
        public static ChangeQuickRedirect changeQuickRedirect;
        public CallbackInfo data;
        public int status;

        public Response() {
            this.status = 0;
        }
    }
}
