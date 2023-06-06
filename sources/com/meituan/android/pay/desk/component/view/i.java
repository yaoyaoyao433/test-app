package com.meituan.android.pay.desk.component.view;

import android.view.View;
import com.meituan.android.paybase.utils.al;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final h b;
    private final String c;

    private i(h hVar, String str) {
        this.b = hVar;
        this.c = str;
    }

    public static View.OnClickListener a(h hVar, String str) {
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9015741114a8dd04fc3591d4c420005", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9015741114a8dd04fc3591d4c420005") : new i(hVar, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8014a5be15786877f99938dd9e89e22", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8014a5be15786877f99938dd9e89e22");
            return;
        }
        h hVar = this.b;
        String str = this.c;
        Object[] objArr2 = {hVar, str, view};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6effd1a62aa566759c6e614cd68d3e77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6effd1a62aa566759c6e614cd68d3e77");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_zba4mhdz", (Map<String, Object>) null);
        al.a(hVar.b.getContext(), str);
    }
}
