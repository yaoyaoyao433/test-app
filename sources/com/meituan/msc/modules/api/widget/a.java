package com.meituan.msc.modules.api.widget;

import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.modules.container.p;
import com.meituan.msc.modules.container.r;
import com.meituan.msc.modules.container.z;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.n;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "WidgetEventModule")
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @MSCMethod
    public void triggerWidgetEvent(String str, JSONObject jSONObject, int i) {
        Object[] objArr = {str, jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998429ddb95ac03a191e9771c585d0d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998429ddb95ac03a191e9771c585d0d7");
            return;
        }
        p e = U_().b().e(i);
        if (e == null) {
            g.a("WidgetEventModule", "triggerWidgetEvent but container not found");
        } else if (!e.A()) {
            g.a("WidgetEventModule", "triggerWidgetEvent but current container is not widget");
        } else {
            r G = e.G();
            if (G instanceof z) {
                ((z) G).a(str, ab.a(jSONObject));
            }
        }
    }

    @MSCMethod
    public void getGlobalPosition(int i, n nVar) {
        View g;
        Object[] objArr = {Integer.valueOf(i), nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a588500d10eb72934860bbea1955c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a588500d10eb72934860bbea1955c7");
        } else if (nVar == null) {
        } else {
            p e = U_().b().e(i);
            if (e == null) {
                g.a("WidgetEventModule", "triggerWidgetEvent but container not found");
                nVar.a(ab.a(t.a(Constants.GestureMoveEvent.KEY_X, 0, Constants.GestureMoveEvent.KEY_Y, 0)));
                return;
            }
            r G = e.G();
            if (G != null && (g = G.g()) != null && g.isAttachedToWindow()) {
                int[] iArr = new int[2];
                g.getLocationInWindow(iArr);
                nVar.a(ab.a(t.a(Constants.GestureMoveEvent.KEY_X, Float.valueOf(com.meituan.msc.common.utils.n.d(iArr[0])), Constants.GestureMoveEvent.KEY_Y, Float.valueOf(com.meituan.msc.common.utils.n.d(iArr[1])))));
                return;
            }
            nVar.a(t.a(Constants.GestureMoveEvent.KEY_X, 0, Constants.GestureMoveEvent.KEY_Y, 0));
        }
    }
}
