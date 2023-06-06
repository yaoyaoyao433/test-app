package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    private DeskData b;
    private LinearLayout c;

    public p(LinearLayout linearLayout, DeskData deskData) {
        Object[] objArr = {linearLayout, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "134599848950ba7ee35220ee83cfbd79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "134599848950ba7ee35220ee83cfbd79");
            return;
        }
        this.c = linearLayout;
        this.b = deskData;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e04f3e65c6b0980a8a32a0441868c2e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e04f3e65c6b0980a8a32a0441868c2e")).booleanValue() : !TextUtils.isEmpty(com.meituan.android.pay.desk.component.data.a.a(this.c.getContext(), this.b));
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc805be15da3e1de22f70508922ab18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc805be15da3e1de22f70508922ab18");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_tip), (int) R.layout.paycommon__password_page_tip);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8815ecca30e4b75bd8f0e86fd204aa82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8815ecca30e4b75bd8f0e86fd204aa82");
        } else if (this.c == null) {
        } else {
            String a2 = com.meituan.android.pay.desk.component.data.a.a(this.c.getContext(), this.b);
            TextView textView = (TextView) this.c.findViewById(R.id.page_tip);
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            textView.setText(a2);
            textView.setVisibility(0);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff3d38230dd8ce993c2bb0db788d84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff3d38230dd8ce993c2bb0db788d84a");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_tip));
        }
    }
}
