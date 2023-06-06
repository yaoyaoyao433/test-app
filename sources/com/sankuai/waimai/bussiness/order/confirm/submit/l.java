package com.sankuai.waimai.bussiness.order.confirm.submit;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public JSONObject b;
    public String c;
    Context d;

    public l(JSONObject jSONObject, Context context) {
        Object[] objArr = {jSONObject, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "930511ad95d742f563b95ca3110d6c3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "930511ad95d742f563b95ca3110d6c3f");
            return;
        }
        this.b = jSONObject;
        this.d = context;
    }
}
