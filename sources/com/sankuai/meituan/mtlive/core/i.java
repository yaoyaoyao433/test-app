package com.sankuai.meituan.mtlive.core;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public e b;
    e c;

    public final e a() {
        return this.b;
    }

    public static boolean a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cff8e3e9d8e34216b6d657cfdb98ea5f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cff8e3e9d8e34216b6d657cfdb98ea5f")).booleanValue() : (eVar == null || TextUtils.isEmpty(eVar.b()) || TextUtils.isEmpty(eVar.a())) ? false : true;
    }

    public final e b() {
        return this.c;
    }
}
