package com.sankuai.mesh.util;

import android.support.annotation.NonNull;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Throwable th, @NonNull String str, Map<String, Object> map) {
        Object[] objArr = {th, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e129125e7a0049953918a5e2be14a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e129125e7a0049953918a5e2be14a04");
            return;
        }
        map.put("_scene", str);
        map.put("_message", th.getMessage());
        a("b_pay_mesh_exception_sc", map);
    }

    public static void a(@NonNull String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a12699cad56e25dc96afd0ee5910ba09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a12699cad56e25dc96afd0ee5910ba09");
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("technology_log_version", com.sankuai.mesh.core.d.a().getPayVersion());
        map.put("priority", "normal");
        Statistics.getChannel(Constants.EventType.PAY).writeSystemCheck(null, str, map, "c_pay_mesh_sdk");
    }
}
