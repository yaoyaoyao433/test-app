package com.sankuai.waimai.mach.jsv8.jsinterface;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSArray;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSValue;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.q;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect b;

    public static /* synthetic */ void a(d dVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "374fdb7a9617fad90b27524bb87bbccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "374fdb7a9617fad90b27524bb87bbccd");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("success", z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            com.sankuai.waimai.mach.jsv8.b b2 = dVar.b();
            if (b2 != null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(jSONObject.toString());
                b2.a(str, linkedList);
            }
        }
    }

    public d(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3822ba0b2a6e9526197220ad8a10d538", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3822ba0b2a6e9526197220ad8a10d538");
        }
    }

    @Override // com.meituan.v8jse.JavaCallback
    public final JSValue invoke(JSObject jSObject, JSArray jSArray) {
        final Map<String, Object> map;
        final Map<String, Object> map2;
        final String str;
        JSValue jSValue;
        JSValue jSValue2;
        JSValue jSValue3;
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b68d2584f8e580516b91de6b26876b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b68d2584f8e580516b91de6b26876b");
        }
        if (jSArray == null) {
            return null;
        }
        try {
            if (jSArray.length() <= 0 || (jSValue3 = jSArray.get(0)) == null) {
                map = null;
            } else {
                if (jSValue3.isString()) {
                    map = com.sankuai.waimai.mach.utils.b.a(jSValue3.stringValue());
                } else {
                    map = jSValue3.isObject() ? (Map) jSValue3.getValue() : null;
                }
                jSValue3.close();
            }
        } catch (Exception e) {
            com.sankuai.waimai.mach.log.b.b("MachJS_V8", "RenderJSInterface执行异常 | " + e.getMessage());
        }
        if (map == null) {
            return null;
        }
        if (jSArray.length() < 2 || (jSValue2 = jSArray.get(1)) == null) {
            map2 = null;
        } else {
            if (jSValue2.isString()) {
                map2 = com.sankuai.waimai.mach.utils.b.a(jSValue2.stringValue());
            } else {
                map2 = jSValue2.isObject() ? (Map) jSValue2.getValue() : null;
            }
            jSValue2.close();
        }
        str = "";
        if (jSArray.length() >= 3 && (jSValue = jSArray.get(2)) != null) {
            str = jSValue.isString() ? jSValue.stringValue() : "";
            jSValue.close();
        }
        Mach a = a();
        if (a == null || a.getMachBundle() == null || a.getASTTemplateById(a.getMachBundle().j) == null) {
            return null;
        }
        Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7418d88f7026877fbdd6be3e9aaac8b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7418d88f7026877fbdd6be3e9aaac8b4");
                    return;
                }
                final Mach a2 = d.this.a();
                if (a2 == null || a2.getContainer() == null) {
                    d.a(d.this, str, false);
                    return;
                }
                a2.addRenderListener(new q() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.d.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.q, com.sankuai.waimai.mach.g
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b12c1c1cd49b1cc4e7ca7b0ce8eb891", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b12c1c1cd49b1cc4e7ca7b0ce8eb891");
                            return;
                        }
                        a2.removeRenderListener(this);
                        if (a2.getReRenderListener() != null) {
                            a2.getReRenderListener().a();
                        }
                        d.a(d.this, str, true);
                    }

                    @Override // com.sankuai.waimai.mach.q, com.sankuai.waimai.mach.g
                    public final void a(int i, Throwable th) {
                        Object[] objArr3 = {Integer.valueOf(i), th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cdfe07db29c66b7f6d08b34a070abd1c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cdfe07db29c66b7f6d08b34a070abd1c");
                            return;
                        }
                        a2.removeRenderListener(this);
                        d.a(d.this, str, false);
                    }
                });
                a2.reRenderNativeUI(map, map2);
            }
        });
        return null;
    }
}
