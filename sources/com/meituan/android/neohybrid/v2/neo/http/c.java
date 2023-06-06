package com.meituan.android.neohybrid.v2.neo.http;

import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "703eea35601bce8f61612620a111ac36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "703eea35601bce8f61612620a111ac36")).booleanValue() : ajVar != null && a(ajVar.i());
    }

    public static boolean a(ak akVar) {
        String contentType;
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26e2f190580d1e4140f9fb641ef02ace", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26e2f190580d1e4140f9fb641ef02ace")).booleanValue() : (akVar == null || (contentType = akVar.contentType()) == null || !contentType.contains(DaBaiDao.JSON_DATA)) ? false : true;
    }
}
