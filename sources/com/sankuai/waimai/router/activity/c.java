package com.sankuai.waimai.router.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends a {
    public static ChangeQuickRedirect c;
    @NonNull
    protected final Class<? extends Activity> d;

    public c(@NonNull Class<? extends Activity> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5df3794b45eb094357c07d9570d26be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5df3794b45eb094357c07d9570d26be");
        } else {
            this.d = cls;
        }
    }

    @Override // com.sankuai.waimai.router.activity.a
    @NonNull
    public Intent b(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096fa52d98815fb77a8d328a80102e9e", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096fa52d98815fb77a8d328a80102e9e") : new Intent(jVar.c, this.d);
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bde64e3ff76cb1b58dc17fc5a93bdd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bde64e3ff76cb1b58dc17fc5a93bdd4");
        }
        return "ActivityHandler (" + this.d.getSimpleName() + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}
