package com.sankuai.waimai.store.goods.list.views.cell.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.goods.list.delegate.impl.c;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class SupportSCPhysicalMainCellView extends SupportMainCellView {
    public static ChangeQuickRedirect i;
    private Drawable a;
    private Drawable b;
    private int j;
    private int k;
    private int l;

    public SupportSCPhysicalMainCellView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a222587edd7cf3e0c35a91c08cc92b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a222587edd7cf3e0c35a91c08cc92b7");
            return;
        }
        this.k = 0;
        this.l = 6;
    }

    public SupportSCPhysicalMainCellView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d60129edfa802846d67e8213806434f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d60129edfa802846d67e8213806434f");
            return;
        }
        this.k = 0;
        this.l = 6;
    }

    public SupportSCPhysicalMainCellView(@NonNull c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6317321f9b5159771790d7ae0df71817", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6317321f9b5159771790d7ae0df71817");
            return;
        }
        this.k = 0;
        this.l = 6;
    }

    @Override // com.sankuai.waimai.store.goods.list.views.cell.view.SupportMainCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2eb3dc3461416153edaf414c68804f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2eb3dc3461416153edaf414c68804f2");
            return;
        }
        super.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b6b0969ac3a1d6fb16f9045d3d0b635b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b6b0969ac3a1d6fb16f9045d3d0b635b");
        } else if (this.a == null) {
            this.a = new e.a().a(h.a(getContext(), 4.0f), 0.0f, 0.0f, h.a(getContext(), 4.0f)).c(getContext().getResources().getColor(R.color.white)).a();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4145e46bb8ae9d83815f2f0527f4938", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4145e46bb8ae9d83815f2f0527f4938");
        } else if (this.b == null) {
            this.b = new e.a().a(0.0f, h.a(getContext(), 4.0f), h.a(getContext(), 4.0f), 0.0f).c(getContext().getResources().getColor(R.color.white)).a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.views.cell.view.SupportMainCellView, com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public void setSpuSelectedStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92be5843f6f32163c47e31a145b9aa57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92be5843f6f32163c47e31a145b9aa57");
        } else if (z) {
            this.n.setBackgroundResource(R.drawable.wm_st_spu_base_round_left_select_bg);
        } else {
            setViewBackground(this.n);
        }
    }

    private void setViewBackground(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b45f86acb4823a4474eab9e8d1fcf117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b45f86acb4823a4474eab9e8d1fcf117");
        } else if (view == null || this.al == null) {
        } else {
            if (this.al.e == 1) {
                view.setBackgroundResource(R.drawable.wm_st_spu_base_round_bg);
            } else if (this.al.e == 2) {
                if (this.a != null) {
                    view.setBackground(this.a);
                } else {
                    view.setBackgroundResource(R.drawable.wm_st_spu_base_round_left_bg);
                }
            } else if (this.al.e == 3) {
                if (this.b != null) {
                    view.setBackground(this.b);
                } else {
                    view.setBackgroundResource(R.drawable.wm_st_spu_base_round_left_bg);
                }
            } else {
                view.setBackgroundResource(R.drawable.wm_st_spu_base_round_left_bg);
            }
        }
    }

    public final void a(@NonNull GoodsSpu goodsSpu, int i2, int i3) {
        Object[] objArr = {goodsSpu, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91212c304f6dd0de545a3674c6acd5c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91212c304f6dd0de545a3674c6acd5c0");
            return;
        }
        this.j = i3;
        if (i3 == 1) {
            setLayoutParams(new ViewGroup.LayoutParams(h.a(getContext()) - h.a(getContext(), 24.0f), -2));
        } else if (i3 == 2) {
            setLayoutParams(new ViewGroup.LayoutParams(h.a(getContext(), 295.0f), -2));
        } else if (i3 == 3) {
            a(this.l, this.k);
            int a = (h.a(getContext()) - h.a(getContext(), 64.0f)) / 3;
            ViewGroup.LayoutParams layoutParams = this.u != null ? this.u.getLayoutParams() : null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null;
            if (layoutParams == null) {
                layoutParams = new ViewGroup.MarginLayoutParams(a, a);
            }
            marginLayoutParams.width = a;
            marginLayoutParams.height = a;
            this.u.setLayoutParams(layoutParams);
            if (this.s != null) {
                this.s.setLayoutParams(layoutParams);
            }
            if (this.t != null) {
                this.t.setLayoutParams(layoutParams);
            }
            int a2 = a + h.a(getContext(), 8.0f);
            ViewGroup.LayoutParams layoutParams2 = this.n.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new ViewGroup.LayoutParams(a2, -2);
            }
            layoutParams2.width = a2;
            this.n.setLayoutParams(layoutParams2);
            View findViewById = this.n.findViewById(R.id.add_good_root_layout);
            ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(a2, -2);
            }
            layoutParams3.width = a2;
            findViewById.setLayoutParams(layoutParams3);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(a2, -2);
            if (i2 == 0) {
                marginLayoutParams2.leftMargin = h.a(getContext(), 8.0f);
            } else if (i2 == 2) {
                marginLayoutParams2.rightMargin = h.a(getContext(), 8.0f);
            }
            setLayoutParams(marginLayoutParams2);
        } else {
            a(this.l, this.k);
            if (i2 == 0) {
                ViewGroup.LayoutParams layoutParams4 = this.n.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(layoutParams4.width, layoutParams4.height);
                marginLayoutParams3.leftMargin = h.a(getContext(), 8.0f);
                setLayoutParams(marginLayoutParams3);
            }
        }
        super.a(goodsSpu, i2);
    }

    @Override // com.sankuai.waimai.store.cell.view.SpuBaseCellView
    public final void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "387452cafe38ddab83d289d6864d5c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "387452cafe38ddab83d289d6864d5c9d");
            return;
        }
        super.G();
        if (this.d == null || this.d.t()) {
            return;
        }
        if (this.j >= 3 && (this.L == null || this.L.getVisibility() == 8)) {
            if (this.e != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.e.getLayoutParams();
                marginLayoutParams.topMargin = h.a(getContext().getApplicationContext(), this.l);
                this.e.setLayoutParams(marginLayoutParams);
            }
            if (this.g != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
                marginLayoutParams2.topMargin = h.a(getContext().getApplicationContext(), this.k);
                this.g.setLayoutParams(marginLayoutParams2);
                return;
            }
            return;
        }
        if (this.e != null) {
            this.e.setLayoutParams(this.f);
        }
        if (this.g != null) {
            this.g.setLayoutParams(this.h);
        }
    }
}
