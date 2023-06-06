package com.sankuai.waimai.store.base.statistic;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b implements c {
    public static ChangeQuickRedirect a;
    protected final SCBaseActivity b;

    public abstract String b();

    public abstract String c();

    public b(@NonNull SCBaseActivity sCBaseActivity) {
        Object[] objArr = {sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f48c28bbe353c203dc98bd0757d744ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f48c28bbe353c203dc98bd0757d744ba");
        } else {
            this.b = sCBaseActivity;
        }
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4554f6cb63569bd16b6b5fe5f0b37fed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4554f6cb63569bd16b6b5fe5f0b37fed") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.base.statistic.a
    @NonNull
    public final com.sankuai.waimai.store.expose.v2.entity.b a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e242da4c8aa5251a5827eef7c5662c3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.expose.v2.entity.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e242da4c8aa5251a5827eef7c5662c3") : new com.sankuai.waimai.store.expose.v2.entity.b(a(), b(), view);
    }

    @Override // com.sankuai.waimai.store.base.statistic.a
    public void a(@Nullable com.sankuai.waimai.store.expose.v2.entity.b bVar, int i, Map<String, Object> map) {
        Object[] objArr = {bVar, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ef00cee195cf6a1aa0a0eee93291113", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ef00cee195cf6a1aa0a0eee93291113");
        } else if (bVar == null) {
        } else {
            String a2 = a(bVar, i);
            if (!TextUtils.isEmpty(a2)) {
                bVar.e = a2;
            }
            bVar.b(b(map));
            com.sankuai.waimai.store.expose.v2.b.a().a(this.b, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.base.statistic.a
    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a609530231bfb903cd2a36d1d9c22b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a609530231bfb903cd2a36d1d9c22b9");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(a(), c()).b(b(map)).a();
        }
    }

    @NonNull
    public Map<String, Object> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6714a4d028386a051aad98db30e7bd65", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6714a4d028386a051aad98db30e7bd65") : map == null ? new HashMap() : map;
    }

    public String a(@NonNull com.sankuai.waimai.store.expose.v2.entity.b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "105abbe8e3b28d370e3465fb35272d11", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "105abbe8e3b28d370e3465fb35272d11");
        }
        return this.b.hashCode() + CommonConstant.Symbol.MINUS + b() + CommonConstant.Symbol.MINUS + i + CommonConstant.Symbol.MINUS + bVar.c();
    }
}
