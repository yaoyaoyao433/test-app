package com.sankuai.waimai.rocks.page.tablist.rocklist;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.meituan.android.cube.pga.view.a<FrameLayout> {
    public static ChangeQuickRedirect d;
    NestedRecyclerView e;
    View f;
    FrameLayout g;

    @Override // com.meituan.android.cube.pga.view.a
    @Nullable
    public final /* synthetic */ FrameLayout c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788602f5a842003734883129d868e92b", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788602f5a842003734883129d868e92b");
        }
        this.e = new NestedRecyclerView(this.c);
        this.g = new FrameLayout(this.c);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g.addView(this.e);
        return this.g;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8faf098cef4201e5b8ff7fda18563b10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8faf098cef4201e5b8ff7fda18563b10");
        }
    }
}
