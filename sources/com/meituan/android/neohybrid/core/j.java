package com.meituan.android.neohybrid.core;

import com.meituan.android.neohybrid.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final JSONObject c;

    public j(String str, JSONObject jSONObject) {
        this.b = str;
        this.c = jSONObject;
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf257c08153062ff6d5d577da5078ca", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf257c08153062ff6d5d577da5078ca")).booleanValue() : a.a(this.b, this.c, aVar);
    }
}
