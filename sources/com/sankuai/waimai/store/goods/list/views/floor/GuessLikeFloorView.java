package com.sankuai.waimai.store.goods.list.views.floor;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.expose.v2.entity.b;
import com.sankuai.waimai.store.goods.list.delegate.d;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GuessLikeFloorView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.cell.core.a b;
    public com.sankuai.waimai.store.cell.core.a c;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    public b e;
    public b f;
    private LinearLayout g;
    private com.sankuai.waimai.store.cell.core.impl.a h;
    private d i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.cell.core.b {
    }

    public GuessLikeFloorView(@NonNull d dVar) {
        super(dVar.k());
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ffce34f96c70b11f7f05418e31527d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ffce34f96c70b11f7f05418e31527d");
            return;
        }
        this.h = new com.sankuai.waimai.store.cell.core.impl.a();
        this.d = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.i = dVar;
        this.i.m().b("updateOrderGood", Boolean.class).c(new rx.functions.b<Boolean>() { // from class: com.sankuai.waimai.store.goods.list.views.floor.GuessLikeFloorView.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Boolean bool) {
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e77f06c6832dab9362dc840aabb69fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e77f06c6832dab9362dc840aabb69fb");
                    return;
                }
                GuessLikeFloorView.this.b.ba_();
                GuessLikeFloorView.this.c.ba_();
            }
        });
        a();
    }

    public GuessLikeFloorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a862d5cdebb22d0f52c6d10801aa6ab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a862d5cdebb22d0f52c6d10801aa6ab5");
            return;
        }
        this.h = new com.sankuai.waimai.store.cell.core.impl.a();
        this.d = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        a();
    }

    public void setPoiHelper(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        if (aVar != null) {
            this.d = aVar;
        }
    }

    public void setCallback(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8889588a3a46be26d1850cde9e748be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8889588a3a46be26d1850cde9e748be");
        } else {
            this.h.b = aVar;
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e4ed47319b7c8e75e3ddd2de8429cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e4ed47319b7c8e75e3ddd2de8429cc");
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_view_two_column_floor, (ViewGroup) this, false);
        addView(inflate, new FrameLayout.LayoutParams(-1, -2));
        this.g = (LinearLayout) inflate.findViewById(R.id.wm_sc_ll_floor_container);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83b86a4d9a951b64fc2e34ece40c635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83b86a4d9a951b64fc2e34ece40c635");
            return;
        }
        com.sankuai.waimai.store.goods.list.views.cell.creator.a aVar = new com.sankuai.waimai.store.goods.list.views.cell.creator.a();
        this.b = aVar.a(getContext());
        this.c = aVar.a(getContext());
        this.e = new b("b_6x10dzxp", this.b.getView());
        this.f = new b("b_6x10dzxp", this.c.getView());
        com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) getContext(), this.e);
        com.sankuai.waimai.store.expose.v2.b.a().a((SCBaseActivity) getContext(), this.f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        this.g.addView(this.b.getView(), layoutParams);
        this.g.addView(new Space(getContext()), new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6), 1));
        this.g.addView(this.c.getView(), layoutParams);
        this.b.setActionCallback(this.h);
        this.c.setActionCallback(this.h);
    }
}
