package com.sankuai.waimai.store.search.ui.result.item.sortFilter;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    LinearLayout b;
    TextView c;
    TextView d;
    ImageView e;
    f f;
    private final int g;
    private final int h;
    private RecyclerView i;
    private b.d j;
    private SearchShareData k;

    public c(@NonNull Context context, b.d dVar, SearchShareData searchShareData) {
        super(context);
        Object[] objArr = {context, dVar, searchShareData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5fcaeb5c9fdd3379698598e7e74c632", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5fcaeb5c9fdd3379698598e7e74c632");
            return;
        }
        this.g = 2;
        this.h = 3;
        this.j = dVar;
        this.k = searchShareData;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8caf14421c7a9a6ee80cd83f27e99b29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8caf14421c7a9a6ee80cd83f27e99b29");
            return;
        }
        this.b = (LinearLayout) findView(R.id.search_filter_layer_group_header);
        this.c = (TextView) findView(R.id.search_filter_layer_group_selected_items);
        this.d = (TextView) findView(R.id.search_filter_layer_group_title);
        this.e = (ImageView) findView(R.id.search_filter_layer_group_arrow);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee25594d641ea501e782094f458b28e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee25594d641ea501e782094f458b28e0");
            return;
        }
        this.i = (RecyclerView) findView(R.id.search_filter_layer_group_filter_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 3);
        this.f = new f(this.j, this.k);
        this.i.setLayoutManager(gridLayoutManager);
        this.i.setAdapter(this.f);
        this.i.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.search.ui.result.item.sortFilter.c.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                Object[] objArr3 = {rect, view, recyclerView, state};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b128bacd021224eab1e118aea3d61c0e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b128bacd021224eab1e118aea3d61c0e");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (recyclerView.getChildAdapterPosition(view) >= 3) {
                    rect.top = c.this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
                }
                rect.left = c.this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4);
                rect.right = c.this.mContext.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_2);
            }
        });
    }
}
