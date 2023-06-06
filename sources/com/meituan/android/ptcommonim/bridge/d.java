package com.meituan.android.ptcommonim.bridge;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.ptcommonim.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.JsonHelper;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect a;
    private final Context b;

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String module() {
        return "ptimstatistics";
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2da46bff51bb54b557bb0965a7e93a35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2da46bff51bb54b557bb0965a7e93a35");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5db38664f94fd6b7634c9bb7bf0961", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5db38664f94fd6b7634c9bb7bf0961") : new String[]{"viewlx", "clicklx"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public final void invoke(String str, String str2, String str3, com.sankuai.waimai.mach.jsv8.a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d792d18a5c2b9386b7b146b4e0746515", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d792d18a5c2b9386b7b146b4e0746515");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            try {
                JsonObject jsonObject = (JsonObject) JsonHelper.fromJsonString(str2, JsonObject.class);
                String string = JsonHelper.getString(jsonObject, "bid");
                String string2 = JsonHelper.getString(jsonObject, "cid");
                String string3 = JsonHelper.getString(jsonObject, "lab");
                Map map = !TextUtils.isEmpty(string3) ? (Map) JsonHelper.fromJsonString(string3, Map.class) : null;
                if ("viewlx".equalsIgnoreCase(str)) {
                    f.a(this.b, string, string2, map);
                } else if ("clicklx".equalsIgnoreCase(str)) {
                    String string4 = JsonHelper.getString(jsonObject, "tag");
                    f.a(this.b, string, string2, map, TextUtils.isEmpty(string4) ? null : (Map) JsonHelper.fromJsonString(string4, Map.class));
                }
            } catch (Throwable unused) {
            }
        }
    }
}
