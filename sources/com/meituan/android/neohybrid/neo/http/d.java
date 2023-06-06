package com.meituan.android.neohybrid.neo.http;

import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f229be2c82b59d0fcf43ef8e0d20064", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f229be2c82b59d0fcf43ef8e0d20064")).booleanValue() : ajVar != null && a(ajVar.i());
    }

    public static boolean a(ak akVar) {
        String contentType;
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "658d9f766b5a56e291e799f667deafae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "658d9f766b5a56e291e799f667deafae")).booleanValue() : (akVar == null || (contentType = akVar.contentType()) == null || !contentType.contains(DaBaiDao.JSON_DATA)) ? false : true;
    }
}
