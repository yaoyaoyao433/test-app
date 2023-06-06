package com.meituan.mmp.lib.api;

import android.os.SystemClock;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.lib.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l extends i {
    public static ChangeQuickRedirect e;
    public com.meituan.mmp.lib.trace.h f;
    private long g;
    private String h;
    private boolean i;

    public l(Event event, com.meituan.mmp.lib.interfaces.a aVar, com.meituan.mmp.lib.trace.h hVar) {
        super(event, aVar);
        Object[] objArr = {event, aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2422d5eb6e141dab22324b9a277772", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2422d5eb6e141dab22324b9a277772");
            return;
        }
        this.g = SystemClock.elapsedRealtime();
        this.f = hVar;
        this.h = event.b.substring(6);
        JSONObject a = event.a();
        if (hVar == null || a == null || !a.optBoolean("preferEmbed")) {
            return;
        }
        hVar.b("mmp.embed.component.render", (Map<String, Object>) v.a("component", this.h));
        if (a.optBoolean("mpView_embed_render")) {
            this.i = true;
            hVar.b("mmp.embed.render", (Map<String, Object>) v.a("component", this.h));
        }
    }

    @Override // com.meituan.mmp.lib.api.j, com.meituan.mmp.main.IApiCallback
    public final void onSuccess(JSONObject jSONObject) {
        boolean z = true;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693c2073c821033e7ce1b6009eb16b96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693c2073c821033e7ce1b6009eb16b96");
            return;
        }
        super.onSuccess(jSONObject);
        if (!this.i || this.f == null) {
            return;
        }
        Object[] objArr2 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.embeddedwidget.h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e0a51dd143e68195f8d1183676f8813f", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e0a51dd143e68195f8d1183676f8813f")).booleanValue();
        } else if (jSONObject == null || !jSONObject.has("sameLayerCode")) {
            z = false;
        }
        if (z) {
            this.f.a("mmp.embed.render.error", SystemClock.elapsedRealtime() - this.g, v.a("component", this.h, "errMsg", jSONObject.opt("errMsg")));
        } else {
            this.f.a("mmp.embed.render.success", SystemClock.elapsedRealtime() - this.g, v.a("component", this.h));
        }
    }

    @Override // com.meituan.mmp.lib.api.j, com.meituan.mmp.main.IApiCallback
    public final void onFail(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23ee0bb49bc726bc04ad62edc8ee3b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23ee0bb49bc726bc04ad62edc8ee3b0");
            return;
        }
        super.onFail(jSONObject);
        if (!this.i || this.f == null) {
            return;
        }
        this.f.a("mmp.embed.render.error", SystemClock.elapsedRealtime() - this.g, v.a("component", this.h, "errMsg", jSONObject == null ? "" : jSONObject.opt("errMsg")));
    }
}
