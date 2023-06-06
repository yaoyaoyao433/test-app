package com.sankuai.waimai.mach.jsv8.debug;

import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSArray;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSValue;
import com.meituan.v8jse.JavaCallback;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.js.debug.IMachConsole;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements JavaCallback {
    public static ChangeQuickRedirect a;

    public static String a() {
        return SnifferDBHelper.COLUMN_LOG;
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "4ec22c2c495cfeadc599d27e3d243b05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "4ec22c2c495cfeadc599d27e3d243b05");
            return;
        }
        for (IMachConsole iMachConsole : i.a().f.a()) {
            iMachConsole.log(str);
        }
    }

    @Override // com.meituan.v8jse.JavaCallback
    public final JSValue invoke(JSObject jSObject, JSArray jSArray) {
        JSValue jSValue;
        final String jSValue2;
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03b02f3f94c7cf5b4eabe073c91f0e62", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03b02f3f94c7cf5b4eabe073c91f0e62");
        }
        if (i.a().h() && jSArray != null && jSArray.length() > 0 && (jSValue = jSArray.get(0)) != null) {
            if (jSValue instanceof JSObject) {
                jSValue2 = ((JSObject) jSValue).toJson();
            } else {
                jSValue2 = jSValue.toString();
            }
            jSValue.close();
            Mach.getMainHandler().post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.debug.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02da62a4f3d38cc3f8a2264a08e19a07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02da62a4f3d38cc3f8a2264a08e19a07");
                    } else {
                        a.a(a.this, jSValue2);
                    }
                }
            });
        }
        return null;
    }
}
