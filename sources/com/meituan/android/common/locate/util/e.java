package com.meituan.android.common.locate.util;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.cache.bean.DBSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(com.meituan.android.common.locate.model.b bVar, JSONObject jSONObject) throws Exception {
        Object[] objArr = {bVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef24e64f0de176ff8e070def0d12039a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef24e64f0de176ff8e070def0d12039a");
            return;
        }
        jSONObject.put("id", bVar.a);
        jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, bVar.c);
        jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, bVar.b);
        jSONObject.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, bVar.d);
        if (com.meituan.android.common.locate.reporter.n.a().f.booleanValue() && bVar.f.equals("gps")) {
            jSONObject.put("height", bVar.h);
        }
        jSONObject.put("type", bVar.e);
        jSONObject.put("source", bVar.f);
        jSONObject.put(DBSession.TABLE_NAME, bVar.g);
    }

    public static void a(ArrayList<com.meituan.android.common.locate.model.b> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee1c23acf5368b43f8e4adfb492b5338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee1c23acf5368b43f8e4adfb492b5338");
        } else {
            Collections.sort(arrayList, new Comparator<com.meituan.android.common.locate.model.b>() { // from class: com.meituan.android.common.locate.util.e.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                /* renamed from: a */
                public final int compare(com.meituan.android.common.locate.model.b bVar, com.meituan.android.common.locate.model.b bVar2) {
                    Object[] objArr2 = {bVar, bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8202a30e5b0680993c67d39140d00ca6", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8202a30e5b0680993c67d39140d00ca6")).intValue();
                    }
                    if (bVar.a > bVar2.a) {
                        return 1;
                    }
                    return bVar.a < bVar2.a ? -1 : 0;
                }
            });
        }
    }

    public static boolean a(com.meituan.android.common.locate.model.b bVar, com.meituan.android.common.locate.model.b bVar2) {
        Object[] objArr = {bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd6850ae6a8fc42307d15a10aefb4659", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd6850ae6a8fc42307d15a10aefb4659")).booleanValue();
        }
        if (bVar2 == null || bVar == null) {
            return false;
        }
        return (bVar.c == bVar2.c && bVar.b == bVar2.b) ? false : true;
    }
}
