package com.sankuai.waimai.store.poi.list.refactor.cat;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.poi.list.refactor.cat.CardMonitorMessage;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(long j, @NonNull String str, Exception exc) {
        Object[] objArr = {new Long(j), str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "216b0dd28d46c4b9ed4719f4a551ff54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "216b0dd28d46c4b9ed4719f4a551ff54");
            return;
        }
        b.b(new CardMonitorMessage.a().a(str).c(String.valueOf(j)).a(CardRender.Fail).b(exc.toString()).b);
        com.sankuai.waimai.store.base.log.a.a(exc);
    }

    public static void a(long j, @NonNull String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd14b73c9e7c27b612bdb619939b52a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd14b73c9e7c27b612bdb619939b52a0");
        } else {
            b.a(new CardMonitorMessage.a().a(str).c(String.valueOf(j)).a(CardRender.Normal).b);
        }
    }
}
