package com.sankuai.xm.im.bridge.business.proto.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar, IMMessage iMMessage) {
        Object[] objArr = {aVar, iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "526c24baa05033edcba0f8943e717e5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "526c24baa05033edcba0f8943e717e5a");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject a2 = c.a(iMMessage);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(a2);
            jSONObject.put("messages", jSONArray);
            aVar.a(jSONObject);
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("publishMessageStatusChange exception:" + th, new Object[0]);
        }
    }

    public static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar, Map<String, Object> map) {
        Object[] objArr = {aVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "23a21137394e070c869ba455d013bd06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "23a21137394e070c869ba455d013bd06");
            return;
        }
        try {
            if (map.size() <= 0) {
                return;
            }
            aVar.a(new JSONObject(map));
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("publish exception:" + th, new Object[0]);
        }
    }

    public static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar, List<com.sankuai.xm.im.session.entry.a> list, boolean z) {
        Object[] objArr = {aVar, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a858ddfa134cbd2005415024343eca81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a858ddfa134cbd2005415024343eca81");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sessions", c.c(list));
            jSONObject.put("isDeleted", z);
            aVar.a(jSONObject);
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("onSessionChangedEvent exception:" + th, new Object[0]);
        }
    }

    static void a(com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a aVar, List<IMMessage> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d9a7fb46c16f3868ea3942e3080cdab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d9a7fb46c16f3868ea3942e3080cdab");
            return;
        }
        try {
            if (com.sankuai.xm.base.util.b.a(list)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("messages", c.a((List<IMMessage>) new ArrayList(list)));
            aVar.a(jSONObject);
        } catch (Throwable th) {
            com.sankuai.xm.im.bridge.base.util.a.c("onReceiveMessages exception:" + th, new Object[0]);
        }
    }
}
