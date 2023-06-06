package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.paycommon.lib.model.bean.CommonGuide;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    LinearLayout b;
    private com.meituan.android.pay.common.payment.data.c c;

    public h(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {linearLayout, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082068ce9f066fa2a7eff9abfb2ac55c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082068ce9f066fa2a7eff9abfb2ac55c");
            return;
        }
        this.b = linearLayout;
        this.c = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c62bc135cf695dc25114881d4ab16bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c62bc135cf695dc25114881d4ab16bf")).booleanValue() : com.meituan.android.pay.desk.component.data.a.b(this.c) != null;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5433d535761529fc88a8473bace9cdb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5433d535761529fc88a8473bace9cdb3");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_common_guide_view), (int) R.layout.paycommon__guide_info_container);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91a2a529994eef4ac4e4abe38e126f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91a2a529994eef4ac4e4abe38e126f4");
            return;
        }
        CommonGuide b = com.meituan.android.pay.desk.component.data.a.b(this.c);
        if (this.b == null || this.b.getContext() == null || b == null) {
            return;
        }
        ((TextView) this.b.findViewById(R.id.guide_info_text)).setText(b.getTitle());
        if (!TextUtils.isEmpty(b.getProtocolText())) {
            TextView textView = (TextView) this.b.findViewById(R.id.guide_agreement_text);
            textView.setText(b.getProtocolText());
            String protocolUrl = b.getProtocolUrl();
            if (!TextUtils.isEmpty(protocolUrl)) {
                textView.setOnClickListener(i.a(this, protocolUrl));
            } else {
                com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", "通用引导中协议链接为空");
            }
        } else {
            this.b.findViewById(R.id.guide_agreement_container).setVisibility(8);
        }
        CheckBox checkBox = (CheckBox) this.b.findViewById(R.id.guide_checkbox);
        u.a(checkBox);
        checkBox.setChecked(b.isChecked());
        com.meituan.android.paycommon.lib.utils.p.a(checkBox, b);
        this.b.findViewById(R.id.guide_divider).setVisibility(0);
        this.b.findViewById(R.id.guide_info_container).setVisibility(0);
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487c67701eac4beddac24b1bad26a0ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487c67701eac4beddac24b1bad26a0ee");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_common_guide_view));
        }
    }
}
