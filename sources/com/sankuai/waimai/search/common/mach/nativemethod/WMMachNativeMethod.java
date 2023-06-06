package com.sankuai.waimai.search.common.mach.nativemethod;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.mach.js.HttpJSNativeMethod;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMachNativeMethod implements IBuildMachNativeMethod {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.search.common.mach.nativemethod.IBuildMachNativeMethod
    public JSInvokeNativeMethod getMachHttpMethod(Activity activity, final String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a5f303b207339858ff835cd93fbd383b", RobustBitConfig.DEFAULT_VALUE) ? (JSInvokeNativeMethod) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a5f303b207339858ff835cd93fbd383b") : new HttpJSNativeMethod() { // from class: com.sankuai.waimai.search.common.mach.nativemethod.WMMachNativeMethod.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.js.HttpJSNativeMethod
            public final void httpRequest(String str2, Map<String, String> map, j<ap> jVar) {
                Object[] objArr2 = {str2, map, jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c500d0e0692da426c7b7702fd33508ec", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c500d0e0692da426c7b7702fd33508ec");
                } else {
                    b.a(((HttpJSNativeMethod.JSRequest) b.a((Class<Object>) HttpJSNativeMethod.JSRequest.class)).get(str2, map), jVar, str);
                }
            }
        };
    }
}
