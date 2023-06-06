package com.meituan.mmp.lib.api;

import com.meituan.mmp.lib.model.Event;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class i extends j {
    public static ChangeQuickRedirect a;
    private com.meituan.mmp.lib.interfaces.a e;

    public i(Event event, com.meituan.mmp.lib.interfaces.a aVar) {
        super(event);
        Object[] objArr = {event, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b708b489c63fbf95ec17752bbaf2515", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b708b489c63fbf95ec17752bbaf2515");
        } else {
            this.e = aVar;
        }
    }

    @Override // com.meituan.mmp.lib.api.j
    public final void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "521c1ba69bd8d22fe4eca964d712a99a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "521c1ba69bd8d22fe4eca964d712a99a");
            return;
        }
        super.a(str, jSONObject);
        if (this.e != null) {
            this.e.a(a(), this.d.d, this.c);
        }
    }
}
