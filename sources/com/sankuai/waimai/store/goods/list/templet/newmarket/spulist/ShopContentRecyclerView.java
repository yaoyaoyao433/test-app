package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.cell.view.InnerCellView;
import com.sankuai.waimai.store.newwidgets.list.SCPinnedRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ShopContentRecyclerView extends SCPinnedRecyclerView implements com.sankuai.waimai.store.widgets.smoothnestedscroll.base.b {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ void a(ShopContentRecyclerView shopContentRecyclerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, shopContentRecyclerView, changeQuickRedirect, false, "8100364a3b81651c814dcc9152f56f2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shopContentRecyclerView, changeQuickRedirect, false, "8100364a3b81651c814dcc9152f56f2b");
            return;
        }
        int childCount = shopContentRecyclerView.c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            InnerCellView b = shopContentRecyclerView.b(shopContentRecyclerView.c.getChildAt(i));
            if (b != null) {
                b.o();
            }
        }
    }

    public ShopContentRecyclerView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbd716042d229af2423e166bc08dfe4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbd716042d229af2423e166bc08dfe4");
        }
    }

    public ShopContentRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2ce1ac77947c3064c098090bbcf827", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2ce1ac77947c3064c098090bbcf827");
        }
    }

    public ShopContentRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4aefe84d51d068aa4f2d9211d538860", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4aefe84d51d068aa4f2d9211d538860");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b5afc7e820fff46290f3bacd9632970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b5afc7e820fff46290f3bacd9632970");
            return;
        }
        this.c.setScrollStopListener(this);
        this.c.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.ShopContentRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7d8b89c2db9e50cea3ec19d1920cb8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7d8b89c2db9e50cea3ec19d1920cb8e");
                } else if (i2 == 1) {
                    ShopContentRecyclerView.a(ShopContentRecyclerView.this);
                } else if (i2 == 0) {
                    ShopContentRecyclerView.this.d();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf81e15455c40c92e2fc52dd3c1440c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf81e15455c40c92e2fc52dd3c1440c9");
            return;
        }
        int childCount = this.c.getChildCount();
        for (int i = 0; i < childCount; i++) {
            InnerCellView b = b(this.c.getChildAt(i));
            if (b != null) {
                b.p();
            }
        }
    }

    private InnerCellView b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fceb5ec234205630dc30dde5354c7cfd", RobustBitConfig.DEFAULT_VALUE)) {
            return (InnerCellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fceb5ec234205630dc30dde5354c7cfd");
        }
        if (view instanceof InnerCellView) {
            return (InnerCellView) view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                InnerCellView b = b(viewGroup.getChildAt(i));
                if (b != null) {
                    return b;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c7124ed6c0b35bb46f6b18243c6b13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c7124ed6c0b35bb46f6b18243c6b13");
        } else {
            d();
        }
    }
}
