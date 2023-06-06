package com.meituan.msc.modules.api.msi;

import com.google.gson.JsonObject;
import com.meituan.msc.modules.engine.h;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public final int b;
    public final String c;
    public final com.meituan.msi.dispather.e d;
    public final h e;
    public final com.meituan.msi.dispather.a f;

    public e(MsiContext msiContext, h hVar, JsonObject jsonObject) {
        String asString;
        Object[] objArr = {msiContext, hVar, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad1629c73c37382aa940afa62ec27d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad1629c73c37382aa940afa62ec27d3");
            return;
        }
        this.d = msiContext.getEventDispatcher();
        this.e = hVar;
        this.b = msiContext.getPageId();
        Object[] objArr2 = {jsonObject, "viewId"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d64785058f7684339d0f7cb9986eaba", RobustBitConfig.DEFAULT_VALUE)) {
            asString = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d64785058f7684339d0f7cb9986eaba");
        } else {
            asString = jsonObject.has("viewId") ? jsonObject.get("viewId").getAsString() : "";
        }
        this.c = asString;
        this.f = new com.meituan.msi.dispather.a(this.d, jsonObject);
    }

    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d741eaa9d4d01a2bc4e37bf0ac83db3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d741eaa9d4d01a2bc4e37bf0ac83db3f");
        } else {
            this.f.a(str, obj);
        }
    }
}
