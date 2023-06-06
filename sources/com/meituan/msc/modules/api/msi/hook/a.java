package com.meituan.msc.modules.api.msi.hook;

import android.view.View;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.msc.modules.container.q;
import com.meituan.msc.modules.page.e;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.metrics.base.FspRecordParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.meituan.msc.modules.api.msi.c<Object> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msi.interceptor.a
    public final Object a(ApiRequest<?> apiRequest, Object obj) {
        return obj;
    }

    @Override // com.meituan.msc.modules.api.msi.c
    public final String a() {
        return "fspRecord";
    }

    @Override // com.meituan.msi.interceptor.a
    public final void a(ApiRequest<?> apiRequest) {
        int asInt;
        JsonElement jsonElement;
        e b;
        q b2;
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d510d8eb2aad9600617f64100fa433", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d510d8eb2aad9600617f64100fa433");
            return;
        }
        Object[] objArr2 = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72f731e4fc7914d67b9ea88cf89b5926", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72f731e4fc7914d67b9ea88cf89b5926");
            return;
        }
        T t = apiRequest.bodyData().b;
        if (t instanceof FspRecordParam) {
            Object[] objArr3 = {apiRequest};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            Map<String, Object> map = null;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3b3c048b651a6d45c4a034f35edf627f", RobustBitConfig.DEFAULT_VALUE)) {
                map = (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3b3c048b651a6d45c4a034f35edf627f");
            } else {
                Object[] objArr4 = {apiRequest};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.api.msi.c.a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f26bd1f3fa2ad1d2e88bf314c63e5d1", RobustBitConfig.DEFAULT_VALUE)) {
                    b = (e) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f26bd1f3fa2ad1d2e88bf314c63e5d1");
                } else {
                    Object[] objArr5 = {apiRequest};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.api.msi.c.a;
                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "083e930e3d869583f116c3f041774c6b", RobustBitConfig.DEFAULT_VALUE)) {
                        asInt = ((Integer) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "083e930e3d869583f116c3f041774c6b")).intValue();
                    } else {
                        JsonObject uIArgs = apiRequest.getUIArgs();
                        asInt = (uIArgs == null || (jsonElement = uIArgs.get("pageId")) == null) ? -1 : jsonElement.getAsInt();
                    }
                    b = (asInt < 0 || this.b == null || (b2 = this.b.b()) == null) ? null : b2.b(asInt);
                }
                if (b != null) {
                    View b3 = b.b();
                    if (b3 instanceof FFPTags) {
                        map = ((FFPTags) b3).ffpTags();
                    }
                }
            }
            if (map != null) {
                FspRecordParam fspRecordParam = (FspRecordParam) t;
                if (fspRecordParam.tags == null) {
                    fspRecordParam.tags = new HashMap();
                }
                if (fspRecordParam.tags instanceof Map) {
                    ((Map) fspRecordParam.tags).putAll(map);
                }
            }
        }
    }
}
