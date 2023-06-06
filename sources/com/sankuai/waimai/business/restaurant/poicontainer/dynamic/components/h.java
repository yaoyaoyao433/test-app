package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends a<View> {
    public static ChangeQuickRedirect i;

    /* JADX WARN: Type inference failed for: r0v2, types: [T extends android.view.View, android.view.View] */
    public h(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df424e3fee433f324e30b653d7ad07ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df424e3fee433f324e30b653d7ad07ab");
        } else {
            this.b = new View(context);
        }
    }

    public h(Context context, View view) {
        super(context);
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c290f117661fcca0a0a284bb5ba9b64e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c290f117661fcca0a0a284bb5ba9b64e");
        } else {
            this.b = view;
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.poicontainer.dynamic.components.a
    public final void b(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36328fb00a16ede5c23cf55d417629ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36328fb00a16ede5c23cf55d417629ae");
        } else {
            super.b(jSONObject);
        }
    }
}
