package com.sankuai.waimai.business.im;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.imui.session.entity.b;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a(b bVar) {
        M m;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e14fcf34ac87bc90d09f5020000ae0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e14fcf34ac87bc90d09f5020000ae0f");
        }
        if (bVar == null || (m = bVar.b) == 0) {
            return "unknown";
        }
        String extension = m.getExtension();
        if (TextUtils.isEmpty(extension)) {
            return "unknown";
        }
        try {
            int optInt = new JSONObject(extension).optInt("after_sales_msg_type_c");
            return optInt == 1 ? "saleReplyReject" : optInt == 3 ? "evaluateReject" : optInt == 4 ? "groupInviteReject" : "unknown";
        } catch (JSONException e) {
            e.printStackTrace();
            return "unknown";
        }
    }
}
