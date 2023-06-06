package com.sankuai.waimai.store.goods.detail.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGDetailAttrLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private Paint b;

    public SGDetailAttrLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9118f631eeb0c5a168f6967d020780", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9118f631eeb0c5a168f6967d020780");
        }
    }

    private SGDetailAttrLayout(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40178ea7ee5bad16c4e12be5092d836b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40178ea7ee5bad16c4e12be5092d836b");
        }
    }

    public SGDetailAttrLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daa018a255c5feff66203b624ded7c79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daa018a255c5feff66203b624ded7c79");
        } else {
            setWillNotDraw(false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acd59f61d8ca6f6d4a8238d87975f1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acd59f61d8ca6f6d4a8238d87975f1c2");
            return;
        }
        if (this.b == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd2fc3535bf45759f1f9693a5117abc9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd2fc3535bf45759f1f9693a5117abc9");
            } else {
                this.b = new Paint();
                this.b.setStrokeWidth(1.0f);
                this.b.setColor(b.b(getContext(), R.color.wm_st_common_e0e0e0));
            }
        }
        float width = getWidth() / 2;
        canvas.drawLine(width, getPaddingTop(), width, getHeight() - getPaddingBottom(), this.b);
        super.onDraw(canvas);
    }
}
