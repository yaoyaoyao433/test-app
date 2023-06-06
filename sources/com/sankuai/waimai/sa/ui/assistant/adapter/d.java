package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.sa.model.Product;
import com.sankuai.waimai.sa.model.Sku;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends com.sankuai.waimai.platform.widget.listforscrollview.a {
    public static ChangeQuickRedirect a;
    private Context b;

    public int b() {
        return R.layout.wm_smart_assistant_chat_food_item;
    }

    public d(Context context, List<Product> list) {
        super(context, list);
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc9779a4ce7883210872d24d7d46e771", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc9779a4ce7883210872d24d7d46e771");
        } else {
            this.b = context;
        }
    }

    @Override // com.sankuai.waimai.platform.widget.listforscrollview.a
    public final View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2274ab5346ef2a70598d7421773210", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2274ab5346ef2a70598d7421773210");
        }
        a aVar = new a();
        View inflate = a().inflate(b(), (ViewGroup) null);
        aVar.a = (ImageView) inflate.findViewById(R.id.img_food_icon);
        aVar.b = (TextView) inflate.findViewById(R.id.txt_food_name);
        aVar.c = (TextView) inflate.findViewById(R.id.txt_food_price);
        aVar.d = (TextView) inflate.findViewById(R.id.txt_food_count);
        aVar.e = (TextView) inflate.findViewById(R.id.txt_food_spec);
        inflate.setTag(aVar);
        Product product = (Product) b(i);
        Object[] objArr2 = {aVar, product};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3ab372dbba32b01799b9956ba04189a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3ab372dbba32b01799b9956ba04189a");
        } else if (product != null) {
            aVar.b.setText(product.name);
            Sku sku = product.sku;
            if (sku != null) {
                aVar.c.setText(this.b.getString(R.string.wm_sa_price_string, com.sankuai.waimai.foundation.utils.h.a(sku.originPrice)));
                aVar.d.setText(String.format("x%d", Integer.valueOf(sku.count)));
                aVar.e.setText(sku.specAttrs);
            }
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = this.b;
            c.c = product.picture;
            c.i = R.drawable.wm_smart_assistant_food_ic_default;
            c.k = 4;
            c.a(aVar.a);
        }
        return inflate;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a {
        public ImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;

        public a() {
        }
    }
}
