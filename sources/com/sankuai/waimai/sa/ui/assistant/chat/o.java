package com.sankuai.waimai.sa.ui.assistant.chat;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.listforscrollview.LinearLayoutForList;
import com.sankuai.waimai.sa.model.Product;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class o extends com.sankuai.waimai.platform.base.b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.sa.ui.assistant.a b;
    LinearLayoutForList c;
    TextView d;
    TextView e;
    TextView f;
    TextView g;
    View h;
    com.sankuai.waimai.sa.model.c i;
    private View j;
    private TextView k;
    private TextView l;
    private TextView m;
    private Button n;

    public o(Context context, com.sankuai.waimai.sa.ui.assistant.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d01f28fdccabd00e49b967979adea4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d01f28fdccabd00e49b967979adea4");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b663b72625f82140455aea949ea480a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b663b72625f82140455aea949ea480a4");
        }
        this.j = layoutInflater.inflate(R.layout.wm_smart_assistant_chat_recommend_package_layout, viewGroup, false);
        View view = this.j;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c009aa613f356fb358242279958fe730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c009aa613f356fb358242279958fe730");
        } else {
            this.c = (LinearLayoutForList) view.findViewById(R.id.food_list_container);
            this.d = (TextView) view.findViewById(R.id.txt_total_count);
            this.e = (TextView) this.j.findViewById(R.id.txt_package_name);
            this.f = (TextView) this.j.findViewById(R.id.wm_smart_assistant_multi_person_merchant_on_sale);
            this.g = (TextView) this.j.findViewById(R.id.txt_hint);
            this.k = (TextView) this.j.findViewById(R.id.txt_box_price);
            this.l = (TextView) this.j.findViewById(R.id.wm_smart_assistant_multi_person_merchant_actual_price);
            this.m = (TextView) this.j.findViewById(R.id.wm_smart_assistant_multi_person_merchant_original_price);
            this.n = (Button) this.j.findViewById(R.id.btn_buy);
            this.h = this.j.findViewById(R.id.divider_line_total);
        }
        return this.j;
    }

    public final void a(com.sankuai.waimai.sa.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "599ba4e638fd4d1737a8d98cd14b3873", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "599ba4e638fd4d1737a8d98cd14b3873");
            return;
        }
        this.k.setText(this.y.getString(R.string.wm_smart_assistant_pick_price, com.sankuai.waimai.foundation.utils.h.a(cVar.e())));
        this.l.setText(this.y.getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(cVar.f())));
        if (com.sankuai.waimai.foundation.utils.h.a(Double.valueOf(cVar.f()), Double.valueOf(cVar.g()))) {
            this.m.setVisibility(8);
        } else {
            this.m.setVisibility(0);
            this.m.setText(String.format("¥%s", com.sankuai.waimai.foundation.utils.h.a(cVar.g())));
            this.m.getPaint().setFlags(16);
        }
        this.n.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.chat.o.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d169da466191761c00ea98a3677a08c", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d169da466191761c00ea98a3677a08c");
                    return;
                }
                List<Product> a2 = o.this.i.a();
                if (a2 == null || a2.size() == 0) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Product product : a2) {
                    arrayList.add(product.convert2OrderFood());
                }
                o.this.b.a(o.this.y, arrayList, o.this.i.h());
                if (o.this.i instanceof com.sankuai.waimai.sa.model.m) {
                    JudasManualManager.a("b_q0jxo4kc").a("c_6tg6wz4r").a("result_id", ((com.sankuai.waimai.sa.model.m) o.this.i).k).a("package_snapshot_id", ((com.sankuai.waimai.sa.model.m) o.this.i).a).a("poi_id", o.this.i.h()).a();
                }
            }
        });
    }
}
