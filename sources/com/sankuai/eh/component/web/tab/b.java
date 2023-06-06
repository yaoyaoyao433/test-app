package com.sankuai.eh.component.web.tab;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.eh.component.web.tab.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final Gson b;
    private final JsonObject c;

    public b(Gson gson, JsonObject jsonObject) {
        this.b = gson;
        this.c = jsonObject;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fce912a9950a470dc7215f4f28819de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fce912a9950a470dc7215f4f28819de9");
            return;
        }
        Gson gson = this.b;
        JsonObject jsonObject = this.c;
        Object[] objArr2 = {gson, jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = a.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c497f1fd1f2f41bbfe553f1f161d4d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c497f1fd1f2f41bbfe553f1f161d4d1e");
        } else {
            com.sankuai.eh.component.service.database.a.a().a("fup_bottom_tab", gson.toJson((JsonElement) jsonObject));
        }
    }
}
