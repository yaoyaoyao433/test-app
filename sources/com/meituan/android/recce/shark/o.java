package com.meituan.android.recce.shark;

import com.meituan.android.legwork.monitor.report.channel.dao.DaBaiDao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ak;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static boolean a(ak akVar) {
        String contentType;
        Object[] objArr = {akVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b600717d73826f66f1f47a49e628fc4f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b600717d73826f66f1f47a49e628fc4f")).booleanValue() : (akVar == null || (contentType = akVar.contentType()) == null || !contentType.contains(DaBaiDao.JSON_DATA)) ? false : true;
    }
}
