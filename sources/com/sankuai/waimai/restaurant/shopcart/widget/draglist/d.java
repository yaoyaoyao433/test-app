package com.sankuai.waimai.restaurant.shopcart.widget.draglist;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.support.constraint.R;
import android.support.v4.view.InputDeviceCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d implements DragSortListView.i {
    public static ChangeQuickRedirect h;
    private Bitmap a;
    private ImageView b;
    private ListView c;
    int i;

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public void a(View view, Point point, Point point2) {
    }

    public d(ListView listView) {
        Object[] objArr = {listView};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1176bb555ca7797eae9770ab3da911", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1176bb555ca7797eae9770ab3da911");
            return;
        }
        this.i = InputDeviceCompat.SOURCE_ANY;
        this.c = listView;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12923d3f43b571e41e25605bc2f08267", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12923d3f43b571e41e25605bc2f08267");
        }
        ListView listView = this.c;
        View childAt = listView.getChildAt((i + listView.getHeaderViewsCount()) - this.c.getFirstVisiblePosition());
        if (childAt == null || f.a(childAt.getContext()) || childAt.findViewById(R.id.layout_food_item) == null) {
            return null;
        }
        childAt.setPressed(false);
        TextView textView = (TextView) childAt.findViewById(R.id.txt_foodCount_number);
        TextView textView2 = (TextView) childAt.findViewById(R.id.txt_food_original_price);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        String charSequence = textView.getText().toString();
        textView.setText("1");
        childAt.findViewById(R.id.txt_food_price).setVisibility(8);
        int visibility = childAt.findViewById(R.id.txt_food_attrs).getVisibility();
        childAt.findViewById(R.id.txt_food_attrs).setVisibility(4);
        try {
            childAt.setDrawingCacheEnabled(true);
            this.a = Bitmap.createBitmap(childAt.getDrawingCache());
            childAt.setDrawingCacheEnabled(false);
            textView.setText(charSequence);
            childAt.findViewById(R.id.txt_food_price).setVisibility(0);
            childAt.findViewById(R.id.txt_food_attrs).setVisibility(visibility);
            if (this.b == null) {
                this.b = new ImageView(this.c.getContext());
            }
            this.b.setBackgroundResource(R.drawable.wm_shopcart_bg_food_float_view);
            this.b.setPadding(0, 0, 0, 0);
            this.b.setImageBitmap(this.a);
            this.b.setLayoutParams(new ViewGroup.LayoutParams(childAt.getWidth(), childAt.getHeight()));
        } catch (Throwable unused) {
            if (this.b == null) {
                this.b = new ImageView(this.c.getContext());
            }
        }
        return this.b;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.widget.draglist.DragSortListView.i
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83431c3447f67883826b5f2bb7dccaf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83431c3447f67883826b5f2bb7dccaf5");
            return;
        }
        ((ImageView) view).setImageDrawable(null);
        if (this.a != null) {
            this.a.recycle();
            this.a = null;
        }
    }
}
