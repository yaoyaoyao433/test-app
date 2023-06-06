package com.sankuai.waimai.ad.superexpose;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static List<RocksServerModel> b;
    public static String c;

    public static String a() {
        String str;
        Exception e;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec1a8a5dc6745f1d153ca0f187f86768", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec1a8a5dc6745f1d153ca0f187f86768");
        }
        try {
            str = a(b);
        } catch (Exception e2) {
            str = "";
            e = e2;
        }
        try {
            c = new JSONObject(str).optString("linkPoi", "");
        } catch (Exception e3) {
            e = e3;
            Log.wtf("SuperExposeManager", e.getMessage());
            return str;
        }
        return str;
    }

    private static String a(List<RocksServerModel> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fff17a0b1562f4d9c2d49a2514ce544", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fff17a0b1562f4d9c2d49a2514ce544");
        }
        if (list == null) {
            return "";
        }
        for (RocksServerModel rocksServerModel : list) {
            if (rocksServerModel != null) {
                try {
                    if ("wm_home_list_platinum_rocks_mach".equals(rocksServerModel.templateId)) {
                        return new JSONObject(rocksServerModel.stringData).optString("extra_param", "");
                    }
                    if ("wm_home_list_platinum_rocks_mach".equals(rocksServerModel.templateId)) {
                        JSONObject jSONObject = new JSONObject(rocksServerModel.stringData);
                        if ("home_platinum".equals(jSONObject.optString("business_name", ""))) {
                            return jSONObject.optString("extra_param", "");
                        }
                    } else {
                        continue;
                    }
                } catch (Exception e) {
                    Log.wtf("SuperExposeManager", e.getMessage());
                }
            }
        }
        return "";
    }
}
