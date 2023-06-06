package com.meituan.android.neohybrid.v2.container;

import android.content.Context;
import android.view.View;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoBaseActivity extends PayBaseActivity implements com.meituan.android.neohybrid.core.listener.a {
    public static ChangeQuickRedirect b;

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
    public Context g() {
        return this;
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
}
