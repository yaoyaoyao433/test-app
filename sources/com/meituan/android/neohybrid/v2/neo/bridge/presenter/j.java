package com.meituan.android.neohybrid.v2.neo.bridge.presenter;

import android.support.constraint.R;
import android.view.View;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class j extends b {
    public static ChangeQuickRedirect a = null;
    public static final String o = "j";

    public j(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, String str3, com.meituan.android.neohybrid.protocol.kernel.a aVar2) {
        Object[] objArr = {aVar, str, str2, str3, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97ca1133f72d2b5a8cb7e4930c41b271", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97ca1133f72d2b5a8cb7e4930c41b271");
        } else {
            a(aVar, str, str2, str3, aVar2);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String b() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c142fcb59491418d12c0ed8ecf480b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c142fcb59491418d12c0ed8ecf480b0f");
        }
        if ("closePage".equals(this.c)) {
            a(k.a(this));
            return h();
        } else if ("setLLButton".equals(this.c)) {
            a(l.a(this));
            return i();
        } else {
            return d();
        }
    }

    public static /* synthetic */ void b(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f00ef92ba5f95d8057cd0edf1da7fc46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f00ef92ba5f95d8057cd0edf1da7fc46");
        } else {
            jVar.h.i();
        }
    }

    public static /* synthetic */ void a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f9788b073444b31271175f8283ba60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f9788b073444b31271175f8283ba60c");
            return;
        }
        com.meituan.android.neohybrid.v2.core.a aVar = jVar.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
        (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "53ad0a54cdb9cba372523d85cc03e9b9", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.framework.webcompat.element.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "53ad0a54cdb9cba372523d85cc03e9b9") : aVar.c.d.h()).a().findViewById(R.id.button_ll).setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.neohybrid.v2.neo.bridge.presenter.j.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88de416f111a4f24d37e58cef707000f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88de416f111a4f24d37e58cef707000f");
                } else {
                    j.this.a(new JsonObject());
                }
            }
        });
    }

    @Override // com.meituan.android.neohybrid.v2.neo.bridge.presenter.b
    public final String j() {
        return o;
    }
}
