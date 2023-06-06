package com.sankuai.waimai.ugc.creator.widgets.round;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RoundCornerTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private final a b;

    public RoundCornerTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3279cf45cc4928de96349ac1f81f49e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3279cf45cc4928de96349ac1f81f49e");
            return;
        }
        this.b = new a(this);
        a(context, null);
    }

    public RoundCornerTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e929b166d61704d3556ac84fd36bce6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e929b166d61704d3556ac84fd36bce6c");
            return;
        }
        this.b = new a(this);
        a(context, attributeSet);
    }

    public RoundCornerTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbdb59d21332104d8d6df0d4554074d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbdb59d21332104d8d6df0d4554074d");
            return;
        }
        this.b = new a(this);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437508df9e83d150adb7e6aee30e4d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437508df9e83d150adb7e6aee30e4d3f");
        } else {
            this.b.a(context, attributeSet);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13f895041925ad6d8fc49f31d7eba720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13f895041925ad6d8fc49f31d7eba720");
            return;
        }
        super.draw(canvas);
        this.b.a(canvas);
    }

    public void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b8ee9b9a040243be4850eb10d38b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b8ee9b9a040243be4850eb10d38b86");
        } else {
            this.b.b(i);
        }
    }
}
