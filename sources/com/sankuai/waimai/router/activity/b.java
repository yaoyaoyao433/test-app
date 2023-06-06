package com.sankuai.waimai.router.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect a;
    @NonNull
    private final String c;

    public b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6c2c0713d2c93da662c428114071669", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6c2c0713d2c93da662c428114071669");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.sankuai.waimai.router.core.d.b(new NullPointerException("className不应该为空"));
        }
        this.c = str;
    }

    @Override // com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a56c4edd8d37e362d7b58f7d946bf345", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a56c4edd8d37e362d7b58f7d946bf345") : new Intent().setClassName(jVar.c, this.c);
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1688b0805e601239f98377280891830", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1688b0805e601239f98377280891830");
        }
        return "ActivityHandler (" + this.c + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
