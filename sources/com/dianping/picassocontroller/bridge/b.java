package com.dianping.picassocontroller.bridge;

import com.dianping.jscore.Value;
import com.dianping.picassocontroller.vc.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final String b;
    private final String c;

    public b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4f955ac95d0c8e329fe8351a994179", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4f955ac95d0c8e329fe8351a994179");
            return;
        }
        this.c = str;
        this.b = str2;
    }

    public final void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee60b44dc0e2f0d8e4f7fe1f6883c2a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee60b44dc0e2f0d8e4f7fe1f6883c2a3");
            return;
        }
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8c0f6fd2aba943b1aec658c2c057537", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8c0f6fd2aba943b1aec658c2c057537");
        } else {
            a(jSONObject, "success_complete");
        }
    }

    public final void b(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1a13f35a3e2469fb55ed835d23e90f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1a13f35a3e2469fb55ed835d23e90f");
        } else {
            a(jSONObject, "fail");
        }
    }

    public final void c(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae78ee40f01d778d3156f973ec0a2833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae78ee40f01d778d3156f973ec0a2833");
        } else {
            a(jSONObject, "action");
        }
    }

    private void a(JSONObject jSONObject, String str) {
        Object[] objArr = {jSONObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9f06bc549828906d78455c1f189021", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9f06bc549828906d78455c1f189021");
            return;
        }
        com.dianping.picassocontroller.vc.b a2 = c.a(this.c);
        if (a2 == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.dianping.picassocontroller.jse.b.a(a2, this.b, new Value(jSONObject), str);
    }
}
