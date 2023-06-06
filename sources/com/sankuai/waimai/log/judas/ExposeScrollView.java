package com.sankuai.waimai.log.judas;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ExposeScrollView extends ScrollView {
    public static ChangeQuickRedirect a;
    private a b;
    private b c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
    }

    public ExposeScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81598bab7e3f7d43a8dff2ee223281f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81598bab7e3f7d43a8dff2ee223281f2");
        }
    }

    public ExposeScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b9c35271230533313f31f084f78665", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b9c35271230533313f31f084f78665");
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29a103b32361efb42b51747db9263d2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29a103b32361efb42b51747db9263d2a");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void setOnExposeListener(a aVar) {
        this.b = aVar;
    }

    public void setOnScrollListener(b bVar) {
        this.c = bVar;
    }
}
