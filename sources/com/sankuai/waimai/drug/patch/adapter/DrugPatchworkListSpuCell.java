package com.sankuai.waimai.drug.patch.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualtag.g;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.i;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DrugPatchworkListSpuCell extends InnerCellView {
    public static ChangeQuickRedirect a;
    private TagCanvasView ar;

    @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public int getLayoutId() {
        return R.layout.wm_drug_shopcart_patchwork_list_item;
    }

    public DrugPatchworkListSpuCell(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2ca3f12367d45fffac43bdcde9713d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2ca3f12367d45fffac43bdcde9713d");
        }
    }

    public DrugPatchworkListSpuCell(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451724d9463be0ca3c77ce9a11f24385", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451724d9463be0ca3c77ce9a11f24385");
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf266c21f5df8237220ce1aeb5a2ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf266c21f5df8237220ce1aeb5a2ed9");
        } else if (p.a(this.ae, this.C)) {
            super.a();
        } else if (!p.a(this.ae.mPriceOptAB) && !t.a(this.ae.mPriceOptAB.priceExpInfo)) {
            switch (this.ae.getStatus()) {
                case 1:
                case 2:
                    this.C.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_999999));
                    if (!p.a(this.B)) {
                        this.B.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_sg_color_999999));
                        break;
                    }
                    break;
                default:
                    this.C.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_FF4A26));
                    if (!p.a(this.B)) {
                        this.B.setTextColor(ContextCompat.getColor(getContext(), R.color.wm_st_common_FF4A26));
                        break;
                    }
                    break;
            }
            this.C.setText(p.a(this.ae.standardPrice) ? "" : this.ae.standardPrice);
            u.a(this.C);
        } else {
            super.a();
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6879d2130ca094b9e11c843cda33be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6879d2130ca094b9e11c843cda33be9");
        } else if (p.a(this.ae, this.D) || t.a(this.ae.underlinePrice)) {
            u.c(this.D);
        } else if (!p.a(this.ae.mPriceOptAB) && !t.a(this.ae.mPriceOptAB.priceExpInfo)) {
            this.D.setText(getContext().getString(R.string.wm_sc_common_price, this.ae.underlinePrice));
            u.a(this.D);
        } else {
            super.b();
        }
    }

    @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6cf1864492c94802e36e7196464a8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6cf1864492c94802e36e7196464a8da");
            return;
        }
        super.c();
        findViewById(R.id.root_food_count_view).setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.drug.patch.adapter.DrugPatchworkListSpuCell.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });
        this.ar = (TagCanvasView) findViewById(R.id.kano_tag);
        TextView textView = this.w;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        textView.setBackground(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a173a0a831674167cc147ef86556e0f", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a173a0a831674167cc147ef86556e0f") : new e.a().a(h.a(getContext(), 4.0f)).a(com.sankuai.waimai.store.util.b.b(getContext(), R.color.wm_sg_color_F44B3A)).b(2).a());
    }

    @Override // com.sankuai.waimai.store.cell.view.InnerCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c85b542fce63340ec46f1eb25beb54c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c85b542fce63340ec46f1eb25beb54c");
            return;
        }
        super.d();
        this.r.setVisibility(8);
        this.w.setVisibility(8);
        setActivityDescKanoTag(this.ae);
    }

    private void setActivityDescKanoTag(GoodsSpu goodsSpu) {
        List list;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8999e5be850328c22b1323df15dfa0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8999e5be850328c22b1323df15dfa0");
        } else if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.hotSaleActivityLabel)) {
            u.c(this.ar);
        } else {
            List<String> list2 = goodsSpu.hotSaleActivityLabel;
            Object[] objArr2 = {list2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0cfee936b3ce9e5e1e2edc72f3ef055b", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0cfee936b3ce9e5e1e2edc72f3ef055b");
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list2.size(); i++) {
                    String str = list2.get(i);
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add((d) i.a(str, d.class));
                    }
                }
                list = arrayList;
            }
            if (com.sankuai.shangou.stone.util.a.b(list)) {
                u.c(this.ar);
                return;
            }
            u.a(this.ar);
            if (this.ar.getAdapter() == null) {
                this.ar.setAdapter(new g(this.n.getContext(), null));
            }
            ((g) this.ar.getAdapter()).b(com.sankuai.waimai.platform.widget.tag.util.a.a(this.ar.getContext(), list));
            this.ar.getAdapter().notifyChanged();
        }
    }
}
