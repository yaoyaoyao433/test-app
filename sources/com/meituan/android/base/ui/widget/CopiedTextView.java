package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CopiedTextView extends TextView {
    public static ChangeQuickRedirect a;
    private boolean b;

    public CopiedTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d19d9ff0da83aaaa634b796a3764d44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d19d9ff0da83aaaa634b796a3764d44");
        } else {
            this.b = false;
        }
    }

    public CopiedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3cea0e20253c40d930b562c32d4ebf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3cea0e20253c40d930b562c32d4ebf8");
        } else {
            this.b = false;
        }
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9af87eee4ab53010d246466d5dd11a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9af87eee4ab53010d246466d5dd11a7");
            return;
        }
        super.onSelectionChanged(i, i2);
        boolean z = i != i2;
        if (!this.b && z) {
            Selection.selectAll((Spannable) getText());
        }
        this.b = z;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4569bfb17be6773f019af3d6533959ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4569bfb17be6773f019af3d6533959ad")).booleanValue();
        }
        requestFocus();
        return super.onTouchEvent(motionEvent);
    }
}
