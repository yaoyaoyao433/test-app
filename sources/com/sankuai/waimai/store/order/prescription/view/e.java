package com.sankuai.waimai.store.order.prescription.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.store.order.prescription.model.InquiryTemplateModel;
import com.sankuai.waimai.store.order.prescription.model.OrderFoodInfo;
import com.sankuai.waimai.store.view.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public boolean e;
    public TextView f;
    public TextView g;
    public TextView h;
    public String i;
    public List<OrderFoodInfo> j;
    public Long k;
    public InquiryTemplateModel l;
    public String m;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_prescription_drug_inquiry_template_view;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977a2b9e275f74bbba536f6444d0a67e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977a2b9e275f74bbba536f6444d0a67e");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a771269988e699c89554a7f8092d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a771269988e699c89554a7f8092d2f");
            return;
        }
        super.b();
        this.f = (TextView) this.b.findViewById(R.id.inquiry_info_title);
        this.g = (TextView) this.b.findViewById(R.id.inquiry_info_text);
        this.h = (TextView) this.b.findViewById(R.id.inquiry_info_status);
        com.sankuai.waimai.store.view.a a = com.sankuai.waimai.store.view.a.a(this.c, R.dimen.wm_sc_common_dimen_7, R.dimen.wm_sc_common_dimen_12, R.color.wm_sg_color_BCBCBC, R.dimen.wm_sc_common_dimen_1_half, a.EnumC1338a.RIGHT);
        this.h.setCompoundDrawablePadding(h.a(this.c, 7.0f));
        this.h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
    }

    private String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f1f12833288dec27505f7d7fc8add7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f1f12833288dec27505f7d7fc8add7");
        }
        List<OrderFoodInfo> g = g();
        Object[] objArr2 = {g};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2d834a0333ca6c0432b2c32c9c968f18", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2d834a0333ca6c0432b2c32c9c968f18");
        }
        JSONArray jSONArray = new JSONArray();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) g)) {
            for (OrderFoodInfo orderFoodInfo : g) {
                if (orderFoodInfo != null) {
                    if (com.sankuai.shangou.stone.util.a.a((Collection<?>) orderFoodInfo.comboProducts)) {
                        for (OrderFoodInfo.ComboProduct comboProduct : orderFoodInfo.comboProducts) {
                            if (comboProduct != null && comboProduct.isRx) {
                                jSONArray.put(d.a(orderFoodInfo.count, comboProduct));
                            }
                        }
                    } else {
                        jSONArray.put(d.a(orderFoodInfo));
                    }
                }
            }
        }
        return jSONArray.toString();
    }

    public String a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a6a4545cf116655548114b910276092", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a6a4545cf116655548114b910276092");
        }
        Uri a = af.a(af.a(af.a(af.a(Uri.parse(str), "medicines", f()), "inquiry_id", this.i), "poi_id", Long.toString(this.k.longValue())), "stid", this.m);
        return a == null ? "" : a.toString();
    }

    private List<OrderFoodInfo> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bf94599116897790f83f3c9aed30ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bf94599116897790f83f3c9aed30ac");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.j)) {
            for (OrderFoodInfo orderFoodInfo : this.j) {
                if (orderFoodInfo != null && orderFoodInfo.isRx) {
                    arrayList.add(orderFoodInfo);
                }
            }
        }
        return arrayList;
    }

    public String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f4a94cf6c0752c1fc8fbe89be22cd4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f4a94cf6c0752c1fc8fbe89be22cd4");
        }
        List<OrderFoodInfo> g = g();
        if (com.sankuai.shangou.stone.util.a.b(g)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Long.toString(g.get(0).spuId));
        int size = g.size();
        for (int i = 1; i < size; i++) {
            OrderFoodInfo orderFoodInfo = g.get(i);
            if (orderFoodInfo.isRx) {
                sb.append(CommonConstant.Symbol.COMMA);
                sb.append(orderFoodInfo.spuId);
            }
        }
        return sb.toString();
    }

    public final void a(com.sankuai.waimai.store.callback.a aVar, String str, Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee306b08332049357bc55f615d71398f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee306b08332049357bc55f615d71398f");
            return;
        }
        if (aVar == null) {
            aVar = com.sankuai.waimai.store.manager.judas.b.b("c_ykhs39e", str);
        }
        aVar.a("poi_id", this.k);
        aVar.a("spu_id", e());
        aVar.a("stid", this.m);
        aVar.a("template_type", 1);
        if (map != null) {
            aVar.b(map);
        }
        aVar.a();
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f465a4f408e937dd52af06d56b1e742e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f465a4f408e937dd52af06d56b1e742e");
        } else {
            this.m = this.c.getString(R.string.wm_sc_prescription_exp_name, str);
        }
    }
}
