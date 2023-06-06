package com.meituan.android.neohybrid.v2.neo.bridge.handler;

import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a implements b {
    public static ChangeQuickRedirect a;
    public static final String c = null;
    public com.meituan.android.neohybrid.v2.neo.bridge.presenter.b b;

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    public void a(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    @Nullable
    public final String b(com.meituan.android.neohybrid.neo.bridge.a aVar, String str) {
        return c;
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.handler.b
    public final void a(com.meituan.android.neohybrid.v2.neo.bridge.presenter.b bVar) {
        this.b = bVar;
    }

    public final void a(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ed656d70b21d04bede364292deac4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ed656d70b21d04bede364292deac4a");
        } else if (this.b == null || jsonObject == null) {
        } else {
            this.b.a(jsonObject);
        }
    }

    public final void a(int i, String str, JsonObject jsonObject) {
        Object[] objArr = {-2, str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67fd638458407cb921fdcf7cfa88aa9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67fd638458407cb921fdcf7cfa88aa9b");
        } else if (this.b != null) {
            this.b.a(-2, str, jsonObject);
        }
    }
}
