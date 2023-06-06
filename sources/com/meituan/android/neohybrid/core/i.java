package com.meituan.android.neohybrid.core;

import com.meituan.android.neohybrid.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final JSONObject c;

    private i(String str, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject;
    }

    public static a.InterfaceC0302a a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c573102196c942093c8ae2c4928f49d0", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0302a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c573102196c942093c8ae2c4928f49d0") : new i(str, jSONObject);
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8160132d9670c9c8b50300f30cad19f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8160132d9670c9c8b50300f30cad19f2")).booleanValue() : a.b(this.b, this.c, aVar);
    }
}
