package com.sankuai.waimai.store.order.detail.adapter;

import android.support.constraint.R;
import android.support.v4.internal.view.SupportMenu;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.model.OrderDeliverPackInfo;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.widgets.recycler.a<a> {
    public static ChangeQuickRedirect a;
    public List<OrderDeliverPackInfo> b;
    public String c;
    public String d;

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        return 1;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final /* synthetic */ void a(a aVar, int i) {
        byte b;
        final a aVar2 = aVar;
        Object[] objArr = {aVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59cb428eefd73789b3cd1103be1c4f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59cb428eefd73789b3cd1103be1c4f9");
            return;
        }
        OrderDeliverPackInfo orderDeliverPackInfo = (OrderDeliverPackInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b9ef05b273d7750e5e90acefeeba53f", RobustBitConfig.DEFAULT_VALUE)) {
            b = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b9ef05b273d7750e5e90acefeeba53f")).booleanValue();
        } else {
            b = com.sankuai.shangou.stone.util.a.c(this.b) > 1 ? (byte) 1 : (byte) 0;
        }
        Object[] objArr3 = {orderDeliverPackInfo, Integer.valueOf(i), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "2a92718fb5c63b2012f24d7177d14fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "2a92718fb5c63b2012f24d7177d14fe6");
        } else if (orderDeliverPackInfo != null) {
            String str = orderDeliverPackInfo.lastPackTrackContent;
            aVar2.d = orderDeliverPackInfo.packSchemaUrl;
            if (!aa.a(str)) {
                boolean z = !TextUtils.isEmpty(aVar2.d) ? 1 : 0;
                Object[] objArr4 = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "99ed051cce0203b737fd93df4a31f13e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "99ed051cce0203b737fd93df4a31f13e");
                } else {
                    aVar2.f = com.sankuai.waimai.store.order.detail.manager.a.a(str, "((\\+?\\d{4}|\\d{3})?-?(\\d{7,8})(-\\d{1,2})?(\\d{1,2})?)|((\\d{4}|\\d{3})-(\\d{4}|\\d{3})-(\\d{4}|\\d{3}))");
                    SpannableString a2 = com.sankuai.waimai.store.order.detail.manager.a.a(str, aVar2.f, ColorUtils.a("#FF8000", (int) SupportMenu.CATEGORY_MASK), new View.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.adapter.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr5 = {view};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c197162c8124925ef54858dc26c2f086", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c197162c8124925ef54858dc26c2f086");
                            } else {
                                aVar2.e = true;
                            }
                        }
                    });
                    aVar2.c.setMovementMethod(LinkMovementMethod.getInstance());
                    aVar2.c.setFocusable(false);
                    if (z) {
                        aVar2.c.setSingleLine(true);
                        aVar2.c.setEllipsize(TextUtils.TruncateAt.END);
                    } else {
                        aVar2.c.setMaxLines(2);
                    }
                    aVar2.c.setText(a2);
                }
            }
            if (aa.a(aVar2.d)) {
                aVar2.b.setVisibility(8);
                aVar2.itemView.setOnClickListener(null);
                aVar2.c.setOnClickListener(null);
            } else {
                aVar2.b.setVisibility(0);
                aVar2.itemView.setOnClickListener(aVar2);
                aVar2.c.setOnClickListener(aVar2);
            }
            aVar2.g.setText(orderDeliverPackInfo.spNameDesc);
            if (b != 0) {
                u.a(aVar2.g);
            } else {
                u.c(aVar2.g);
            }
        }
        String str2 = this.c;
        String str3 = this.d;
        aVar2.h = str2;
        aVar2.i = str3;
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9227522c17da1e90c80fc83cf7c7e1b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9227522c17da1e90c80fc83cf7c7e1b1")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d8d2eb4c40dae95d4f184284ed5a34", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d8d2eb4c40dae95d4f184284ed5a34") : new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_sc_order_detail_express_info_item, viewGroup, false));
    }
}
