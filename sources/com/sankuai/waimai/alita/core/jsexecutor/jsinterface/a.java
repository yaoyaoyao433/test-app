package com.sankuai.waimai.alita.core.jsexecutor.jsinterface;

import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.h;
import com.sankuai.waimai.alita.core.utils.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends JavaScriptInterface {
    public static ChangeQuickRedirect a;
    private h b;
    private String c;

    public a(String str, h hVar) {
        Object[] objArr = {str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4121e4e5535171844959125b43121867", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4121e4e5535171844959125b43121867");
            return;
        }
        this.c = str;
        this.b = hVar;
    }

    @Override // com.dianping.jscore.JavaScriptInterface
    public final Value exec(Value[] valueArr) {
        String string;
        String string2;
        String string3;
        String string4;
        Object[] objArr = {valueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37096a63314699dcbfc390d9b13eef7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37096a63314699dcbfc390d9b13eef7");
        }
        if (valueArr == null || valueArr.length < 4) {
            c.a(this.c + " | onInvokeNativeBridge: invalid param");
            return null;
        }
        try {
            string = valueArr[0].isNULL() ? null : valueArr[0].string();
            string2 = valueArr[1].isNULL() ? null : valueArr[1].string();
            string3 = valueArr[2].isNULL() ? null : valueArr[2].string();
            string4 = valueArr[3].isNULL() ? null : valueArr[3].string();
        } catch (Exception e) {
            c.a(this.c + " | onInvokeNativeBridge: " + e.getMessage());
        }
        if (string != null && string2 != null) {
            if (this.b != null) {
                c.a("alita_js", this.c + "| NativeBridgeJSInterface | onInvokeNativeBridge: " + string2 + " - " + string3 + " - " + string4 + " | Thread: " + Thread.currentThread());
                this.b.a(this.c, string, string2, string3, string4);
            }
            return null;
        }
        c.a(this.c + " | onInvokeNativeBridge: method|modele is null");
        return null;
    }
}
