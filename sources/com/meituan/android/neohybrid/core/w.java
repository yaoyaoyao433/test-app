package com.meituan.android.neohybrid.core;

import android.content.Context;
import android.view.View;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w implements com.meituan.android.neohybrid.core.listener.a {
    public static ChangeQuickRedirect a;
    private Context b;
    private a c;

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final void a(View view) {
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final void a(View view, boolean z, boolean z2) {
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final boolean a(NeoConfig neoConfig) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final boolean a(String str, JSONObject jSONObject) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final boolean b(String str) {
        return false;
    }

    @Override // com.meituan.android.neohybrid.core.listener.a
    public final com.meituan.android.neohybrid.core.listener.a i() {
        return null;
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final void y_() {
    }

    @Override // com.meituan.android.neohybrid.core.listener.c
    public final void z_() {
    }

    @Override // com.meituan.android.neohybrid.core.listener.a
    public final Context g() {
        return this.b;
    }

    public static com.meituan.android.neohybrid.core.listener.a a(Context context, a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96e8e74a074c581dab1a79ce104a6824", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.core.listener.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96e8e74a074c581dab1a79ce104a6824");
        }
        w wVar = new w();
        wVar.b = context;
        wVar.c = aVar;
        return wVar;
    }
}
