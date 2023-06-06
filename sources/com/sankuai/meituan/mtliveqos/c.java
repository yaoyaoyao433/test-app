package com.sankuai.meituan.mtliveqos;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, String str, String str2) {
        Object[] objArr = {context, bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ef77d141ae5238627ee618a94f89725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ef77d141ae5238627ee618a94f89725");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("PERSONAL_CASE_EVENT_TYPE", "PERSONAL_CASE_PIPELINE_TYPE");
        a(context, bVar, str, str2, null, hashMap);
    }

    public static void b(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, String str, String str2) {
        Object[] objArr = {context, bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcd9164825bd707c2fde3ec9aac2af3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcd9164825bd707c2fde3ec9aac2af3d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("PERSONAL_CASE_EVENT_TYPE", "PERSONAL_CASE_ERROR_TYPE");
        a(context, bVar, str, str2, null, hashMap);
    }

    private static void a(Context context, com.sankuai.meituan.mtliveqos.statistic.b bVar, String str, String str2, Map<String, Float> map, Map<String, String> map2) {
        Object[] objArr = {context, bVar, str, str2, null, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b04b18d55d4cfc50b4944253b66b6b47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b04b18d55d4cfc50b4944253b66b6b47");
            return;
        }
        com.sankuai.meituan.mtliveqos.statistic.b bVar2 = bVar == null ? new com.sankuai.meituan.mtliveqos.statistic.b() : bVar;
        bVar2.f = true;
        a.a(context, str, str2, bVar2, null, map2);
    }
}
