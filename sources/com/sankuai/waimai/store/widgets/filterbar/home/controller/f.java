package com.sankuai.waimai.store.widgets.filterbar.home.controller;

import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements b {
    public static ChangeQuickRedirect a;
    private final Object b;
    private final String c;
    private final String d;

    public f(String str, Object obj, String str2) {
        Object[] objArr = {str, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8ab1384a24dd7ca9556e791dbdd0fb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8ab1384a24dd7ca9556e791dbdd0fb4");
            return;
        }
        this.c = str;
        this.b = obj;
        this.d = str2;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(com.sankuai.waimai.store.expose.v2.a aVar, View view, long j, String str) {
        Object[] objArr = {aVar, view, new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784c2d82d1d053752b0dbed5460916d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784c2d82d1d053752b0dbed5460916d7");
            return;
        }
        com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(this.c, "b_fsa9hdiz", view);
        bVar.a("category_code", Long.valueOf(j));
        bVar.a("sec_cate_id", str);
        bVar.a("stid", this.d);
        com.sankuai.waimai.store.expose.v2.b.a().a(aVar, bVar);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad16c53cd331d5e20338d2a3bec5301e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad16c53cd331d5e20338d2a3bec5301e");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.c, "b_tqwt7evg").a("category_code", Long.valueOf(j)).a("sec_cate_id", str).a("stid", this.d).a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str, boolean z) {
        Object[] objArr = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f95f1fb48486bbfc8ba3667273a12b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f95f1fb48486bbfc8ba3667273a12b4");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, "b_5d0qagyk").a(AppUtil.generatePageInfoKey(this.b)).a("category_code", Long.valueOf(j)).a("sec_cate_id", str).a("is_show", Integer.valueOf(z ? 1 : 0)).a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str, String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c76feffc213e21ccecdb1f0d376787c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c76feffc213e21ccecdb1f0d376787c");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, "b_7v5b2enz").a(AppUtil.generatePageInfoKey(this.b)).a("category_code", Long.valueOf(j)).a("sec_cate_id", str).a("codes", str2).a("stid", this.d).a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(com.sankuai.waimai.store.expose.v2.a aVar, View view, long j, String str, String str2, boolean z) {
        Object[] objArr = {aVar, view, new Long(j), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0360dc284a935794d33a4049efdb51af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0360dc284a935794d33a4049efdb51af");
        } else if (z) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(this.c, "b_syk15u77", view);
            bVar.a("category_code", Long.valueOf(j));
            bVar.a("sec_cate_id", str);
            bVar.a("codes", str2);
            bVar.a("status", 0);
            com.sankuai.waimai.store.expose.v2.b.a().a(aVar, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(long j, String str, String str2, boolean z, boolean z2) {
        Object[] objArr = {new Long(j), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7057ad1261092e0ce0882c09fa127e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7057ad1261092e0ce0882c09fa127e");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, "b_htw0yu4w").a(AppUtil.generatePageInfoKey(this.b)).a("category_code", Long.valueOf(j)).a("sec_cate_id", str).a("codes", str2).a("status", Integer.valueOf(z ? 1 : 0)).a("click_status", Integer.valueOf(z2 ? 1 : 0)).a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "037573bd44224e54acc2a1944faa651f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "037573bd44224e54acc2a1944faa651f");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(this.c, "b_ge94y").a("category_code", Long.valueOf(j)).a("sec_cate_id", str2).a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.b
    public final void a(String str, long j, String str2, String str3) {
        Object[] objArr = {str, new Long(j), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2effc1c193464d1c6b3458a6452130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2effc1c193464d1c6b3458a6452130");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.c, "b_U7ZI3").a(AppUtil.generatePageInfoKey(this.b)).a("category_code", Long.valueOf(j)).a("sec_cate_id", str2).a("codes", str3).a();
        }
    }
}
