package com.dianping.live.knb;

import android.content.Intent;
import com.dianping.codelog.b;
import com.dianping.live.live.livefloat.MLiveFloatPlayerService;
import com.dianping.live.live.utils.j;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.util.exception.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DismissMLiveFloatJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "UjUsWpexSXjnWLus1eh5Xat+wmnCHUdoZvl2oCM8OFqghKj1SYy9orNUILVhDgU7HY0pF2/w5aRxCyxjudzuVw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "879f2523af347e66b2fbc3c754e86f99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "879f2523af347e66b2fbc3c754e86f99");
            return;
        }
        try {
            j.a("DismissMLiveFloatJsHandler called");
            Intent intent = new Intent(b.b(), MLiveFloatPlayerService.class);
            intent.putExtra("floatplayeraction", "floatplayerhide");
            intent.putExtra("needmute", true);
            b.b().startService(intent);
        } catch (Exception e) {
            e.printStackTrace();
            j.a("DismissMLiveFloatJsHandler exception" + a.a(e));
        }
    }
}
