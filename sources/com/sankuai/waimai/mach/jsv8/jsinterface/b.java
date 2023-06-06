package com.sankuai.waimai.mach.jsv8.jsinterface;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSArray;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSValue;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;

    public b(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262d6e3565c9b390cc04277e75a369c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262d6e3565c9b390cc04277e75a369c6");
        }
    }

    @Override // com.meituan.v8jse.JavaCallback
    public final JSValue invoke(JSObject jSObject, JSArray jSArray) {
        final String str;
        final String str2;
        String str3;
        String str4;
        Mach a;
        Map<String, JSInvokeNativeMethod> map;
        JSInvokeNativeMethod jSInvokeNativeMethod;
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0d83e679ecdf273eba40db180a43ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0d83e679ecdf273eba40db180a43ee");
        }
        if (jSArray != null) {
            try {
            } catch (Exception e) {
                com.sankuai.waimai.mach.log.b.b("MachJS_V8", "BridgeJSInterface执行异常 | " + e.getMessage());
            }
            if (jSArray.length() >= 4) {
                JSValue jSValue = jSArray.get(0);
                if (jSValue != null) {
                    str = jSValue.isString() ? jSValue.stringValue() : null;
                    jSValue.close();
                } else {
                    str = null;
                }
                JSValue jSValue2 = jSArray.get(1);
                if (jSValue2 != null) {
                    str2 = jSValue2.isString() ? jSValue2.stringValue() : null;
                    jSValue2.close();
                } else {
                    str2 = null;
                }
                JSValue jSValue3 = jSArray.get(2);
                if (jSValue3 != null) {
                    if (jSValue3.isString()) {
                        str3 = jSValue3.stringValue();
                    } else {
                        str3 = jSValue3 instanceof JSObject ? ((JSObject) jSValue3).toJson() : null;
                    }
                    jSValue3.close();
                } else {
                    str3 = null;
                }
                JSValue jSValue4 = jSArray.get(3);
                if (jSValue4 != null) {
                    str4 = jSValue4.isString() ? jSValue4.stringValue() : null;
                    jSValue4.close();
                } else {
                    str4 = null;
                }
                com.sankuai.waimai.mach.log.b.a("MachJS_V8", "js knb call method:" + str2, "params:" + str3);
                if (str == null || str2 == null || str4 == null || (a = a()) == null || a.getInvokeNativeMethodMap() == null || (map = a.getInvokeNativeMethodMap().get(str)) == null || (jSInvokeNativeMethod = map.get(str2)) == null) {
                    return null;
                }
                final String a2 = a(str3);
                jSInvokeNativeMethod.invoke(str2, a2, str4, new com.sankuai.waimai.mach.jsv8.a() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.jsv8.a
                    public final void a(String str5, String str6) {
                        Object[] objArr2 = {str5, str6};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f2aaff69c105691c3b393d6973b8019", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f2aaff69c105691c3b393d6973b8019");
                            return;
                        }
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(str5);
                        linkedList.add(str6);
                        com.sankuai.waimai.mach.jsv8.b b2 = b.this.b();
                        if (b2 != null) {
                            if (b2.f()) {
                                b2.b("nativeModuleCallback", linkedList);
                            } else {
                                b2.a("nativeModuleCallback", linkedList);
                            }
                        }
                        com.sankuai.waimai.mach.log.b.a("MachJS_V8", "js native module call module:" + str, "js knb call method:" + str2, "params:" + a2);
                    }
                });
                return null;
            }
        }
        return null;
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3416de993f5ef6c02c20503153b1ab63", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3416de993f5ef6c02c20503153b1ab63");
        }
        if (a() == null || a().getMachBundle() == null || TextUtils.isEmpty(str) || "{}".equals(str.trim())) {
            return str;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.sankuai.waimai.mach.manager.cache.e machBundle = a().getMachBundle();
            if (machBundle.j != null) {
                jSONObject.put("machTemplateId", machBundle.j);
            }
            if (machBundle.a() != null) {
                jSONObject.put("machBundleVersion", machBundle.a());
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return str;
        }
    }
}
