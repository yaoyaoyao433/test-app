package com.sankuai.waimai.store.mach;

import android.content.Context;
import android.support.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.i;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class SGPoiLiveJSNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"show", "close"};
    private final Context c;
    private final String d;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "SMMachPoiLiveModule";
    }

    public SGPoiLiveJSNativeMethod(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ecc2cdfdd28ae9ea10d4d6ea1e3e00d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ecc2cdfdd28ae9ea10d4d6ea1e3e00d");
            return;
        }
        this.c = context;
        this.d = com.sankuai.waimai.store.manager.user.a.a().c() + "-kWMSMMachPoiLiveModuleDismissTimeStamp";
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        return b;
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3de1678d9add8d23586b5fb6c9b19a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3de1678d9add8d23586b5fb6c9b19a");
        } else if (t.a(str)) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3529469) {
                if (hashCode == 94756344 && str.equals("close")) {
                    c = 1;
                }
            } else if (str.equals("show")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    Object[] objArr2 = {str3, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bc29f03318d94b50c973ddc359c3b960", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bc29f03318d94b50c973ddc359c3b960");
                        return;
                    }
                    boolean z = System.currentTimeMillis() - ab.b().b(this.c, this.d, 0L) > TimeUnit.DAYS.toMillis(1L);
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("show", Boolean.valueOf(z));
                    aVar.a(str3, i.a(new ResponseWrapper(0, jsonObject)));
                    return;
                case 1:
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5eed440b76575edcda29288855d2fe33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5eed440b76575edcda29288855d2fe33");
                        return;
                    } else {
                        ab.b().a(this.c, this.d, System.currentTimeMillis());
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ResponseWrapper {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("data")
        public final Object data;
        @SerializedName("status")
        public final int status;

        public ResponseWrapper(int i, Object obj) {
            this.status = i;
            this.data = obj;
        }
    }
}
