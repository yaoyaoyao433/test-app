package com.meituan.android.neohybrid.v2.core;

import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements a.InterfaceC0311a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final JSONObject c;

    public i(String str, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject;
    }

    @Override // com.meituan.android.neohybrid.v2.core.a.InterfaceC0311a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec2a61bf0f1f275dec205f662f4ced4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec2a61bf0f1f275dec205f662f4ced4")).booleanValue() : a.b(this.b, this.c, aVar);
    }
}
