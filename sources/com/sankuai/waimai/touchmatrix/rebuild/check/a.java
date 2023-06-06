package com.sankuai.waimai.touchmatrix.rebuild.check;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.touchmatrix.monitor.j;
import com.sankuai.waimai.touchmatrix.rebuild.utils.c;
import com.sankuai.waimai.touchmatrix.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.touchmatrix.rebuild.check.b
    public final boolean a(com.sankuai.waimai.touchmatrix.data.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6cec0dd8296ad8063bd50c1e06a9ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6cec0dd8296ad8063bd50c1e06a9ab")).booleanValue();
        }
        if (!com.sankuai.waimai.touchmatrix.rebuild.utils.b.a(aVar)) {
            c.e("DefaultShowStrategy  msg 无效 ", new Object[0]);
            a(aVar, 3);
            return false;
        } else if (!com.sankuai.waimai.touchmatrix.rebuild.biz.a.a(aVar)) {
            c.e("DefaultShowStrategy  业务BIZ 和页面不匹配 展示失败 ", new Object[0]);
            a(aVar, 7);
            return false;
        } else if (com.sankuai.waimai.touchmatrix.views.b.a().b()) {
            c.e("DefaultShowStrategy  Native弹窗在展示,设置屏蔽 ", new Object[0]);
            a(aVar, 6);
            return false;
        } else if (com.sankuai.waimai.touchmatrix.rebuild.message.a.d(aVar)) {
            c.e("DefaultShowStrategy  应用在后台 ", new Object[0]);
            a(aVar, 9);
            return false;
        } else if (com.sankuai.waimai.touchmatrix.rebuild.message.a.a(aVar)) {
            return true;
        } else {
            c.e("DefaultShowStrategy  黑白名单校验不通过 ", new Object[0]);
            a(aVar, 7);
            return false;
        }
    }

    private void a(com.sankuai.waimai.touchmatrix.data.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "545095ab4d222b148a3e70eea2602d49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "545095ab4d222b148a3e70eea2602d49");
        } else if (aVar == null || aVar.k == null || g.a(aVar.k.bizId)) {
        } else {
            com.sankuai.waimai.touchmatrix.a.a().b(aVar.k.bizId);
            Activity c = com.sankuai.waimai.touchmatrix.rebuild.message.a.c(aVar);
            j.a().a(false, aVar.k.bizId, c != null ? c.getClass().getSimpleName() : "");
        }
    }
}
