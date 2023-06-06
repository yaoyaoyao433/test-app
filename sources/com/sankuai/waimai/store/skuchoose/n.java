package com.sankuai.waimai.store.skuchoose;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.newwidgets.HorizontalFlowLayout;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodAttrValue;
import com.sankuai.waimai.store.platform.domain.core.goods.SGGoodSpuAttr;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.am;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class n extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    @NonNull
    final j b;
    SCBaseDialog c;
    private LinearLayout d;

    public n(@NonNull Context context, @NonNull j jVar, SCBaseDialog sCBaseDialog) {
        super(context);
        Object[] objArr = {context, jVar, sCBaseDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19bdb6ca520c91ba681727b3aca9292c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19bdb6ca520c91ba681727b3aca9292c");
            return;
        }
        this.b = jVar;
        this.c = sCBaseDialog;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa19b415660009c0934cae83d836cc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa19b415660009c0934cae83d836cc8");
            return;
        }
        super.onViewCreated();
        this.d = (LinearLayout) findView(R.id.layout_sku_and_attr_holder);
        this.d.removeAllViews();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79f3c550711e34a2ec95db62121b0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79f3c550711e34a2ec95db62121b0a7");
        } else if (this.d.getChildCount() <= 0) {
            if (this.b.a() != null) {
                a(this.b.a().spuAttrsList);
            }
            b();
        }
    }

    private void a(@NonNull List<SGGoodSpuAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b7b2b2465bf6ae461eb1fc1fab62b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b7b2b2465bf6ae461eb1fc1fab62b81");
            return;
        }
        int c = com.sankuai.shangou.stone.util.a.c(list);
        for (int i = 0; i < c; i++) {
            SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (sGGoodSpuAttr != null) {
                this.d.addView(a(sGGoodSpuAttr, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "355a2588483c26aee3b03472e3e85eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "355a2588483c26aee3b03472e3e85eca");
            return;
        }
        GoodsSpu a2 = this.b.a();
        List<SGGoodSpuAttr> list = a2 != null ? a2.spuAttrsList : null;
        int[] d = this.b.d();
        for (int i = 0; i < this.d.getChildCount(); i++) {
            SGGoodSpuAttr sGGoodSpuAttr = (SGGoodSpuAttr) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            View childAt = this.d.getChildAt(i);
            if (childAt != null && sGGoodSpuAttr != null) {
                TextView textView = (TextView) childAt.findViewById(R.id.tv_sku_tips);
                if (this.b.a(i)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(this.mContext.getString(R.string.wm_sc_please_choose, sGGoodSpuAttr.name));
                }
                a((HorizontalFlowLayout) childAt.findViewById(R.id.layout_attribute_container), d);
            }
        }
    }

    private View a(SGGoodSpuAttr sGGoodSpuAttr, int i) {
        Object[] objArr = {sGGoodSpuAttr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87af4da47c46baf4d8f958d2a5d364e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87af4da47c46baf4d8f958d2a5d364e4");
        }
        View inflate = View.inflate(getContext(), R.layout.wm_sc_layout_optimized_good_sku_with_attrs, null);
        ((TextView) inflate.findViewById(R.id.tv_sku_name)).setText(sGGoodSpuAttr.name);
        HorizontalFlowLayout horizontalFlowLayout = (HorizontalFlowLayout) inflate.findViewById(R.id.layout_attribute_container);
        List<SGGoodAttrValue> list = sGGoodSpuAttr.valueList;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
            for (SGGoodAttrValue sGGoodAttrValue : list) {
                horizontalFlowLayout.addView(a(horizontalFlowLayout, sGGoodAttrValue, i));
            }
        }
        return inflate;
    }

    private View a(@NonNull final HorizontalFlowLayout horizontalFlowLayout, @NonNull final SGGoodAttrValue sGGoodAttrValue, final int i) {
        Object[] objArr = {horizontalFlowLayout, sGGoodAttrValue, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d76cb143b4c7cea53f27aaa6990e87", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d76cb143b4c7cea53f27aaa6990e87");
        }
        final View inflate = View.inflate(getContext(), R.layout.wm_sc_tv_sku_attr_item, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_enabled_label);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_disabled_label);
        textView.setText(sGGoodAttrValue.value);
        textView.setTag(sGGoodAttrValue);
        textView2.setText(sGGoodAttrValue.value);
        if (sGGoodAttrValue.isNonSaleAttr() || sGGoodAttrValue.isSoldableSpu()) {
            u.a(textView);
            u.c(textView2);
            SGGoodAttrValue b = this.b.b(i);
            if (b != null && b.id == sGGoodAttrValue.id) {
                textView.setSelected(true);
            }
        } else {
            u.a(textView2);
            u.c(textView);
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.n.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d43e5ef6524b5720fee784696723fadf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d43e5ef6524b5720fee784696723fadf");
                } else if (n.this.getContext() instanceof Activity) {
                    am.a(n.this.c, n.this.getContext().getString(R.string.wm_sc_goods_choose_toast_sold_out), (Activity) n.this.getContext());
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.skuchoose.n.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextView textView3;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94ea0aa385c68493d3e0c86669458bde", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94ea0aa385c68493d3e0c86669458bde");
                    return;
                }
                boolean isSelected = view.isSelected();
                n nVar = n.this;
                HorizontalFlowLayout horizontalFlowLayout2 = horizontalFlowLayout;
                Object[] objArr3 = {horizontalFlowLayout2};
                ChangeQuickRedirect changeQuickRedirect3 = n.a;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "5f5878f0e614a8af6df426874fc3cf53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "5f5878f0e614a8af6df426874fc3cf53");
                } else {
                    for (int i2 = 0; i2 < horizontalFlowLayout2.getChildCount(); i2++) {
                        View childAt = horizontalFlowLayout2.getChildAt(i2);
                        if (childAt != null && (textView3 = (TextView) childAt.findViewById(R.id.tv_enabled_label)) != null && textView3.isEnabled()) {
                            textView3.setSelected(false);
                        }
                    }
                }
                view.setSelected(!isSelected);
                n nVar2 = n.this;
                View view2 = inflate;
                int i3 = i;
                SGGoodAttrValue sGGoodAttrValue2 = isSelected ? null : sGGoodAttrValue;
                Object[] objArr4 = {view2, Integer.valueOf(i3), sGGoodAttrValue2};
                ChangeQuickRedirect changeQuickRedirect4 = n.a;
                if (PatchProxy.isSupport(objArr4, nVar2, changeQuickRedirect4, false, "94836817a5524530e5f7b9da37a4d317", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, nVar2, changeQuickRedirect4, false, "94836817a5524530e5f7b9da37a4d317");
                } else {
                    nVar2.b.a(i3, sGGoodAttrValue2);
                    nVar2.b.ba_();
                    nVar2.b.a(view2, sGGoodAttrValue2);
                }
                n.this.b();
            }
        });
        return inflate;
    }

    private void a(@Nullable HorizontalFlowLayout horizontalFlowLayout, @NonNull int[] iArr) {
        Object[] objArr = {horizontalFlowLayout, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "942e0d839be84ffad67593a77612e78f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "942e0d839be84ffad67593a77612e78f");
        } else if (horizontalFlowLayout != null) {
            for (int i = 0; i < horizontalFlowLayout.getChildCount(); i++) {
                View childAt = horizontalFlowLayout.getChildAt(i);
                if (childAt != null) {
                    TextView textView = (TextView) childAt.findViewById(R.id.tv_enabled_label);
                    TextView textView2 = (TextView) childAt.findViewById(R.id.tv_disabled_label);
                    if (textView != null && textView2 != null) {
                        int a2 = this.b.a((SGGoodAttrValue) textView.getTag());
                        if (((a2 < 0 || a2 >= iArr.length) ? 0 : iArr[a2]) <= 0) {
                            u.a(textView2);
                            u.c(textView);
                        } else {
                            u.a(textView);
                            u.c(textView2);
                        }
                    }
                }
            }
        }
    }
}
