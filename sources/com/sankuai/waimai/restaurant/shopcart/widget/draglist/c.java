package com.sankuai.waimai.restaurant.shopcart.widget.draglist;

import android.graphics.Point;
import android.support.constraint.R;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends a {
    public static ChangeQuickRedirect f;
    public DragSortListView g;
    private com.sankuai.waimai.restaurant.shopcart.adapter.a j;

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.d, com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public final void a(View view) {
    }

    public c(DragSortListView dragSortListView, com.sankuai.waimai.restaurant.shopcart.adapter.a aVar) {
        super(dragSortListView, R.id.layout_food_item, 0, 0);
        Object[] objArr = {dragSortListView, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47151672e692aa59b746c0468ec982ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47151672e692aa59b746c0468ec982ae");
            return;
        }
        this.e = false;
        this.g = dragSortListView;
        this.j = aVar;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.a
    public final int a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878bf4f1211b0065b5d0f42bf1414010", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878bf4f1211b0065b5d0f42bf1414010")).intValue();
        }
        int b = super.b(motionEvent);
        if (b <= 0 || this.j.getCount() <= b || this.j.getItem(b) == null || this.j.getItem(b).i) {
            return b;
        }
        return -1;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.d, com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public final View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd246f5dbbb9f16ea12b34ce028cbbe4", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd246f5dbbb9f16ea12b34ce028cbbe4") : super.a(i);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.a, com.sankuai.waimai.restaurant.shopcart.widget.draglist.d, com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public final void a(View view, Point point, Point point2) {
        int bottom;
        Object[] objArr = {view, point, point2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "280256da052ee767bd73c3248a1aaa06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "280256da052ee767bd73c3248a1aaa06");
            return;
        }
        int dividerHeight = this.g.getDividerHeight();
        View childAt = this.g.getChildAt(0);
        if (childAt == null || point.y >= (bottom = childAt.getBottom() + dividerHeight)) {
            return;
        }
        point.y = bottom;
    }
}
