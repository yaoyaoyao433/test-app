package com.meituan.android.ptcommonim.video.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PicPreviewBottomView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private Context b;
    private a c;
    private int d;
    private int e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    interface a {
    }

    public static /* synthetic */ void a(PicPreviewBottomView picPreviewBottomView, int i, View view) {
        Object[] objArr = {picPreviewBottomView, Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9521c818b993bb1c5db5cc3f5c037227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9521c818b993bb1c5db5cc3f5c037227");
        }
    }

    public PicPreviewBottomView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85adcca7f86fa5ae405c14d7e1079651", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85adcca7f86fa5ae405c14d7e1079651");
            return;
        }
        this.d = 0;
        a(context);
    }

    public PicPreviewBottomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b3503a838d42955cccc10e7db2ca9b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b3503a838d42955cccc10e7db2ca9b7");
            return;
        }
        this.d = 0;
        a(context);
    }

    public PicPreviewBottomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a773b9dbbf22991602c21007b404146e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a773b9dbbf22991602c21007b404146e");
            return;
        }
        this.d = 0;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05c3497787825b1705c8f154cc60f299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05c3497787825b1705c8f154cc60f299");
            return;
        }
        this.b = context;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
    }

    public void setPicNumber(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdec8b5ce2845d39dcc837fcc4cd3797", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdec8b5ce2845d39dcc837fcc4cd3797");
            return;
        }
        this.e = i;
        for (int i2 = 0; i2 < i; i2++) {
            LinearLayout linearLayout = new LinearLayout(this.b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, com.meituan.android.ptcommonim.base.util.a.a(4));
            layoutParams.leftMargin = com.meituan.android.ptcommonim.base.util.a.a(12);
            layoutParams.weight = 1.0f;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setBackgroundResource(R.drawable.ptim_commonbus_pic_changed_index_check_cancel_bg);
            linearLayout.setOnClickListener(com.meituan.android.ptcommonim.video.widget.a.a(this, i2));
            addView(linearLayout);
        }
    }

    public void setOnItemListener(a aVar) {
        this.c = aVar;
    }

    public void setCheckIndex(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3f5ac14ce3a5f98326a982e26e01482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3f5ac14ce3a5f98326a982e26e01482");
            return;
        }
        if (i < this.e) {
            for (int i2 = 0; i2 < this.e; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && i2 <= i) {
                    childAt.setBackgroundResource(R.drawable.ptim_commonbus_pic_changed_index_check_bg);
                } else if (childAt != null) {
                    childAt.setBackgroundResource(R.drawable.ptim_commonbus_pic_changed_index_check_cancel_bg);
                }
            }
        }
        this.d = i;
    }
}
