package com.meituan.msi.dispather;

import com.meituan.msi.ApiPortal;
import com.meituan.msi.bean.BroadcastEvent;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.EventType;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements e {
    public static ChangeQuickRedirect a;
    private final d b;
    private final ApiPortal.b c;
    private String d;
    private String e;
    private boolean f;

    public b(d dVar, ApiPortal.b bVar) {
        Object[] objArr = {dVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f1e2444bd7bec21fee2cd7d8a15eedb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f1e2444bd7bec21fee2cd7d8a15eedb");
            return;
        }
        this.b = dVar;
        this.c = bVar;
    }

    public b(d dVar, ApiPortal.b bVar, String str, String str2) {
        Object[] objArr = {dVar, bVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "013730cde2d3f9084a0a39b3d282cca1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "013730cde2d3f9084a0a39b3d282cca1");
            return;
        }
        this.b = dVar;
        this.c = bVar;
        this.e = str2;
        this.d = str;
        this.f = true;
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e42a23934879d21e4aa464d2deef381", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e42a23934879d21e4aa464d2deef381");
        } else {
            a(null, str, obj);
        }
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(BroadcastEvent broadcastEvent) {
        JSONObject jSONObject;
        Map hashMap;
        ContainerInfo a2;
        Object[] objArr = {broadcastEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42a5e78edfd95808ddd433b97fb9d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42a5e78edfd95808ddd433b97fb9d6e");
            return;
        }
        String str = null;
        if (this.c != null && this.c.d != null && (a2 = this.c.d.a()) != null) {
            str = a2.name;
        }
        EventType eventType = broadcastEvent.getEventType();
        if (eventType == null) {
            eventType = com.meituan.msi.api.e.a(broadcastEvent.getScope(), broadcastEvent.getName(), str);
        }
        EventType eventType2 = eventType;
        if (this.b != null) {
            if (!this.f && broadcastEvent.getData() != null && (broadcastEvent.getData() instanceof JSONObject) && (jSONObject = (JSONObject) broadcastEvent.getData()) != null) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e19219fae94abc51aeb74b12f43c337", RobustBitConfig.DEFAULT_VALUE)) {
                    hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e19219fae94abc51aeb74b12f43c337");
                } else {
                    hashMap = new HashMap();
                    if (jSONObject != null) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, jSONObject.opt(next));
                        }
                    }
                }
                broadcastEvent.setData(hashMap);
            }
            String a3 = w.a(broadcastEvent);
            this.b.a(eventType2, broadcastEvent.getName(), a3, broadcastEvent);
            com.meituan.msi.log.a.a("MSIEvent " + a3);
        }
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac9a5bc2e0a6f40cf4d5e2bdba1fc67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac9a5bc2e0a6f40cf4d5e2bdba1fc67");
            return;
        }
        BroadcastEvent broadcastEvent = new BroadcastEvent(str2, str, obj);
        if (this.d != null) {
            broadcastEvent.addUiData("viewId", this.d);
        }
        if (this.e != null) {
            broadcastEvent.addUiData("pageId", this.e);
        }
        a(broadcastEvent);
    }

    @Override // com.meituan.msi.dispather.e
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418f4d7d8322c6d04f606815a3d86bb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418f4d7d8322c6d04f606815a3d86bb0");
        } else if (this.b != null) {
            this.b.a(str, str2);
        }
    }
}
