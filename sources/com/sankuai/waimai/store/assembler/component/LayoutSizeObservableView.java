package com.sankuai.waimai.store.assembler.component;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class LayoutSizeObservableView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public LayoutSizeObservableView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f17c13b78b53db63df3d06eede203457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f17c13b78b53db63df3d06eede203457");
        }
    }

    public LayoutSizeObservableView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86aa5f47fe302ae3d98f6f6db9917c42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86aa5f47fe302ae3d98f6f6db9917c42");
        }
    }

    public void setListener(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd02d44d559b801b9a7049c5ee29f012", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd02d44d559b801b9a7049c5ee29f012");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.b != null) {
            if (i == i3 && i2 == i4) {
                return;
            }
            this.b.a(i, i2, i3, i4);
        }
    }
}
