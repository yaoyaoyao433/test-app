package com.meituan.msc.modules.api.msi;

import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.view.MsiNativeViewApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MSCNativeViewApi<T extends View, S> extends MsiNativeViewApi<T, S> implements a {
    public static ChangeQuickRedirect a;
    protected h b;

    @Override // com.meituan.msc.modules.api.msi.a
    public final void a(h hVar) {
        this.b = hVar;
    }

    public final void a(b bVar, MsiContext msiContext, JsonObject jsonObject) {
        Object[] objArr = {bVar, msiContext, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85853c27f8a91956786bb63b40ce953f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85853c27f8a91956786bb63b40ce953f");
        } else {
            bVar.setViewContext(new e(msiContext, this.b, jsonObject));
        }
    }
}
