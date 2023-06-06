package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist;

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
        if (PatchProxy.isSupport(objArr, shopContentRecyclerView, changeQuickRedirect, false, "631d66e5e36b596926c362cc86b7d7f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, shopContentRecyclerView, changeQuickRedirect, false, "631d66e5e36b596926c362cc86b7d7f5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20cd7e8648c2838f94aed4513b050ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20cd7e8648c2838f94aed4513b050ac");
        }
    }

    public ShopContentRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dee65992e425fb1f40dab01752b197b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dee65992e425fb1f40dab01752b197b");
        }
    }

    public ShopContentRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cac53bc658c68d84def81f280002a321", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cac53bc658c68d84def81f280002a321");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65e34169e431e4208ed8368c7b00b186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65e34169e431e4208ed8368c7b00b186");
            return;
        }
        this.c.setScrollStopListener(this);
        this.c.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.ShopContentRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "64096d11b29b2bbe06ec3f46ccb520f4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "64096d11b29b2bbe06ec3f46ccb520f4");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a7d55ab4f5029509c181a0a02beafc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a7d55ab4f5029509c181a0a02beafc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a480843e7a0444f8c77d9b4fb1dd93b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (InnerCellView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a480843e7a0444f8c77d9b4fb1dd93b2");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44fcb2bcac7c2a56724b32e1fe14ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44fcb2bcac7c2a56724b32e1fe14ca3");
        } else {
            d();
        }
    }
}
