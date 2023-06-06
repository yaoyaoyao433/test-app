package com.sankuai.waimai.sa.ui.assistant.chat.multiperson;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.sa.model.l;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Context context, l lVar, com.sankuai.waimai.sa.ui.assistant.a aVar, String str, int i, String str2, int i2, int i3) {
        Object[] objArr = {context, lVar, aVar, str, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b8384374e04b89ff9227fe9118b5514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b8384374e04b89ff9227fe9118b5514");
            return;
        }
        Object[] objArr2 = {context, aVar, str, Integer.valueOf(i), lVar, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "97308979a3028e86ab63a8c6f0bb450c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "97308979a3028e86ab63a8c6f0bb450c");
            return;
        }
        aVar.a(context, lVar.i(), lVar.c);
        if (1 == i2) {
            JudasManualManager.a("b_nqd3tw5w").a("c_6tg6wz4r").a("result_id", str).a("package_key_sku", lVar.p).a("poi_id", lVar.c).a("index", i).a();
        } else {
            JudasManualManager.a("b_fyomstyv").a("c_6tg6wz4r").a("result_id", str).a("package_key_sku", lVar.p).a("poi_id", lVar.c).a("index", i).a("layout_type", i3).a();
        }
    }
}
