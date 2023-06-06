package com.meituan.android.mrn.component.list;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    private ReadableMap d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public e(ReadableMap readableMap, int i, int i2) {
        Object[] objArr = {readableMap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81ba47010d60fb96d51862f232569956", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81ba47010d60fb96d51862f232569956");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        Object[] objArr2 = {readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5482508265038583e220313d11c48cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5482508265038583e220313d11c48cb8");
        } else {
            this.d = readableMap;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1f2708bf9f65eb53c0cff102e9e536ae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1f2708bf9f65eb53c0cff102e9e536ae");
            } else if (this.d == null) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0b969e1b114b96181d84b3ae72ee116a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0b969e1b114b96181d84b3ae72ee116a");
                } else {
                    this.i = 0;
                    this.h = 0;
                    this.f = 0;
                    this.e = 0;
                }
            } else {
                this.e = a("paddingLeft");
                this.f = a("paddingRight");
                this.h = a("paddingTop");
                this.i = a("paddingBottom");
                this.g = a("rowPadding");
            }
        }
        this.b = i;
        this.c = i2;
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89c68f3d5ff48afb88d51d21b3014f90", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89c68f3d5ff48afb88d51d21b3014f90")).intValue();
        }
        if (this.d.hasKey(str)) {
            ReadableType type = this.d.getType(str);
            if (type == ReadableType.Number) {
                return this.d.getInt(str);
            }
            if (type == ReadableType.String) {
                return Integer.parseInt(this.d.getString(str));
            }
        }
        return 0;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        boolean z;
        int i;
        int i2;
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c6bf16ad8fd6f08ca3faaf9fd591675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c6bf16ad8fd6f08ca3faaf9fd591675");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int c = state.c();
        Object[] objArr2 = {Integer.valueOf(childAdapterPosition), Integer.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6c5b7e368277d9a057c16f670b2d55e", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6c5b7e368277d9a057c16f670b2d55e")).booleanValue();
        } else {
            z = childAdapterPosition < this.b || c - childAdapterPosition < this.c;
        }
        if (z) {
            return;
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (adapter == null || layoutManager == null) {
            return;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            i2 = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
            i = ((StaggeredGridLayoutManager.b) view.getLayoutParams()).b();
        } else {
            i = 0;
            i2 = 0;
        }
        int itemCount = adapter.getItemCount();
        int childCount = layoutManager.getChildCount();
        com.facebook.common.logging.a.a("StaggeredItemDecoration", "SpaceViewItemLine--count--" + itemCount + "-----" + childCount + "---索引--" + childAdapterPosition + "---" + i);
        if (childAdapterPosition >= itemCount || i2 != 2) {
            return;
        }
        if (i != -1) {
            if (i % 2 == 0) {
                rect.left = this.e;
                rect.right = this.g / 2;
            } else {
                rect.left = this.g / 2;
                rect.right = this.f;
            }
        }
        if (childAdapterPosition - this.b < 2) {
            rect.top = this.h;
        }
        if ((state.c() - childAdapterPosition) - this.c < 2) {
            rect.bottom = this.i;
        }
    }
}
