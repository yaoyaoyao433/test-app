package com.sankuai.waimai.platform.restaurant.dialog;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.d;
import com.sankuai.waimai.platform.widget.RoundedCornerImageView;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.a<C1078a> {
    public static ChangeQuickRedirect a;
    List<d> b;

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(@NonNull C1078a c1078a, int i) {
        d dVar;
        C1078a c1078a2 = c1078a;
        Object[] objArr = {c1078a2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da92ba5327e26fda3a826f837b8e404", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da92ba5327e26fda3a826f837b8e404");
        } else if (c1078a2 == null || com.sankuai.waimai.foundation.utils.d.a(this.b) || (dVar = this.b.get(i)) == null) {
        } else {
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.c = dVar.a();
            a2.i = R.drawable.wm_restaurant_pic_goods_default;
            a2.j = R.drawable.wm_restaurant_pic_goods_default;
            a2.a((ImageView) c1078a2.a);
            if (TextUtils.isEmpty(dVar.b())) {
                c1078a2.b.setVisibility(8);
            } else {
                c1078a2.b.setVisibility(0);
                c1078a2.b.setText(dVar.b());
            }
            String f = dVar.f();
            if (TextUtils.isEmpty(f)) {
                f = a(dVar.e());
            }
            if (TextUtils.isEmpty(f)) {
                c1078a2.c.setVisibility(8);
            } else {
                c1078a2.c.setText(f);
                c1078a2.c.setVisibility(0);
            }
            if (dVar.c() > 0) {
                c1078a2.d.setVisibility(0);
                TextView textView = c1078a2.d;
                textView.setText("X" + dVar.c());
            } else {
                c1078a2.d.setVisibility(8);
            }
            if (TextUtils.isEmpty(dVar.d())) {
                c1078a2.e.setVisibility(8);
                return;
            }
            c1078a2.e.setVisibility(0);
            c1078a2.e.setText(dVar.d());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    @NonNull
    public final /* synthetic */ C1078a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "359e7ded749b9b81976c40423dafa69b", RobustBitConfig.DEFAULT_VALUE) ? (C1078a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "359e7ded749b9b81976c40423dafa69b") : new C1078a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wm_restaurant_sold_out_dialog_item_new, viewGroup, false));
    }

    private String a(List<GoodsAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f348427c9c01c75b34d6bff9a2aa14f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f348427c9c01c75b34d6bff9a2aa14f0");
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            GoodsAttr goodsAttr = list.get(i);
            if (goodsAttr != null && goodsAttr.count > 0 && !goodsAttr.isHidden && !TextUtils.isEmpty(goodsAttr.value)) {
                sb.append(goodsAttr.value);
                if (goodsAttr.isRepeatableChoice) {
                    sb.append(goodsAttr.count);
                    if (!TextUtils.isEmpty(goodsAttr.unit)) {
                        sb.append(goodsAttr.unit);
                    }
                }
                if (i != list.size() - 1) {
                    sb.append("、");
                }
            }
        }
        return sb.toString();
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5505a046428b7f0aa70287911252807c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5505a046428b7f0aa70287911252807c")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        return this.b.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.restaurant.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1078a extends RecyclerView.s {
        public RoundedCornerImageView a;
        public TextView b;
        public TextView c;
        public TextView d;
        public TextView e;

        public C1078a(@NonNull View view) {
            super(view);
            this.a = (RoundedCornerImageView) view.findViewById(R.id.iv_soldout);
            this.b = (TextView) view.findViewById(R.id.tv_name);
            this.c = (TextView) view.findViewById(R.id.tv_des);
            this.d = (TextView) view.findViewById(R.id.tv_count);
            this.e = (TextView) view.findViewById(R.id.tv_reason);
        }
    }
}
