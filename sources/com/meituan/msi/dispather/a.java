package com.meituan.msi.dispather;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.EventType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;
    private e b;
    private String c;
    private String d;

    public a(e eVar, JsonObject jsonObject) {
        Object[] objArr = {eVar, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c101c518ec4ec19f898ed6f36269b7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c101c518ec4ec19f898ed6f36269b7d");
            return;
        }
        this.b = null;
        this.b = eVar;
        if (jsonObject != null) {
            this.c = a(jsonObject, "pageId");
            this.d = a(jsonObject, "viewId");
        }
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdedf6d95c6eef5a075c61cff1c8a5d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdedf6d95c6eef5a075c61cff1c8a5d3");
        } else {
            a(null, str, obj);
        }
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20d8e18f6832df6e0d9cbdcb6a34fc97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20d8e18f6832df6e0d9cbdcb6a34fc97");
        } else {
            a(new BroadcastEvent(str2, str, obj));
        }
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(BroadcastEvent broadcastEvent) {
        Object[] objArr = {broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986625a775b4096c02d987ff09c265fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986625a775b4096c02d987ff09c265fe");
        } else if (broadcastEvent == null) {
        } else {
            if (!TextUtils.isEmpty(this.d)) {
                broadcastEvent.addUiData("viewId", this.d);
            }
            if (!TextUtils.isEmpty(this.c)) {
                broadcastEvent.addUiData("pageId", this.c);
            }
            broadcastEvent.setEventType(EventType.VIEW_EVENT);
            if (this.b != null) {
                this.b.a(broadcastEvent);
            }
        }
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84aa07d2074bf3021a1c07c39a1b91ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84aa07d2074bf3021a1c07c39a1b91ae");
        } else if (this.b != null) {
            this.b.a(str, str2);
        }
    }

    private String a(JsonObject jsonObject, String str) {
        Object[] objArr = {jsonObject, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160587cc1f3e9f3bbc7498f98662cf56", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160587cc1f3e9f3bbc7498f98662cf56") : jsonObject.has(str) ? jsonObject.get(str).getAsString() : "";
    }
}
