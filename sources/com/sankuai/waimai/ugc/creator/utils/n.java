package com.sankuai.waimai.ugc.creator.utils;

import android.text.TextUtils;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9d7d16596d42bae5faf96a502922c37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9d7d16596d42bae5faf96a502922c37");
        } else {
            a(str, "info");
        }
    }

    public static void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e44e9df7962dc5f77f9634ac848a21e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e44e9df7962dc5f77f9634ac848a21e");
        } else {
            com.sankuai.waimai.ugc.creator.utils.task.b.a(new Runnable() { // from class: com.sankuai.waimai.ugc.creator.utils.n.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "802792c4ddb8ad5b149c2c4172cb8b4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "802792c4ddb8ad5b149c2c4172cb8b4c");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("level", str2);
                        jSONObject.put(ShieldMonitorKey.TAG_BUSINESS, "waimai_android_ugc");
                        jSONObject.put("category", "android_ugc_creator");
                        jSONObject.put("type", "operation");
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put(SnifferDBHelper.COLUMN_LOG, str);
                        } else {
                            jSONObject.put(SnifferDBHelper.COLUMN_LOG, "android_ugc_creator");
                        }
                        com.dianping.networklog.c.a(jSONObject.toString(), 3);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
