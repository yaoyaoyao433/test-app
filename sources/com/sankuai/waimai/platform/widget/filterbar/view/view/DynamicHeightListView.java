package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DynamicHeightListView extends ListView {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public DynamicHeightListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee7c2ea81b357b6c51bf0a0a51b72b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee7c2ea81b357b6c51bf0a0a51b72b2");
            return;
        }
        this.b = 0;
        this.c = 0;
        a(context);
    }

    public DynamicHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0654f372953511174684781ace0a5a2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0654f372953511174684781ace0a5a2e");
            return;
        }
        this.b = 0;
        this.c = 0;
        a(context);
    }

    public DynamicHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d34b35436731a76662da00ab91a1ff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d34b35436731a76662da00ab91a1ff6");
            return;
        }
        this.b = 0;
        this.c = 0;
        a(context);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b1c447b3815fd7b5cf98d34a19fd318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b1c447b3815fd7b5cf98d34a19fd318");
            return;
        }
        super.onMeasure(i, i2);
        int min = Math.min(getMeasuredHeight(), this.b);
        if (min < this.c) {
            min = this.c;
        }
        setMeasuredDimension(i, min | Integer.MIN_VALUE);
    }

    public void setMaxHeight(int i) {
        this.b = i;
    }

    public void setMinHeight(int i) {
        this.c = i;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9787f7934a0184953d37baebd3294340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9787f7934a0184953d37baebd3294340");
            return;
        }
        try {
            if (context instanceof Activity) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                this.b = (int) (displayMetrics.heightPixels * 0.55d);
            }
        } catch (Exception unused) {
        }
    }
}
