package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundedCornerRelativeLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    private b b;

    public RoundedCornerRelativeLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffefe400c876de1f1d2651f5ace6e09b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffefe400c876de1f1d2651f5ace6e09b");
            return;
        }
        this.b = new b(this);
        a(context, null, 0);
    }

    public RoundedCornerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48403aaa2bb4fef877eed57d50e08ab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48403aaa2bb4fef877eed57d50e08ab5");
            return;
        }
        this.b = new b(this);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce298058180faa92d0b0633529a25313", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce298058180faa92d0b0633529a25313");
        } else {
            this.b.a(context, attributeSet, i);
        }
    }

    public b getDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7ba7f503ac31dbf9a41f064a191b602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7ba7f503ac31dbf9a41f064a191b602");
            return;
        }
        this.b.a(canvas);
        super.draw(canvas);
        this.b.b(canvas);
    }
}
