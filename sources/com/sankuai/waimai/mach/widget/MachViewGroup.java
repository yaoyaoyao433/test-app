package com.sankuai.waimai.mach.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MachViewGroup extends FrameLayout {
    public static ChangeQuickRedirect k;
    private f a;
    private com.sankuai.waimai.mach.widget.decorations.d b;

    public MachViewGroup(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4f707003089e5e996786c79f6d995c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4f707003089e5e996786c79f6d995c");
        }
    }

    public MachViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5911f97ba78971688705ebcd6f5f4aff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5911f97ba78971688705ebcd6f5f4aff");
        }
    }

    public MachViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a5c3888d6e6143b9b7fd679d2e4766", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a5c3888d6e6143b9b7fd679d2e4766");
            return;
        }
        this.a = new f(this);
        this.b = new com.sankuai.waimai.mach.widget.decorations.d(this);
        setClipChildren(false);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3ffb2f6b66981ac4ba99875213ab828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3ffb2f6b66981ac4ba99875213ab828");
            return;
        }
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            this.a.a(dVar);
            this.b.a(dVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab1fe068ec1cf023cf173e76d4b7b75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab1fe068ec1cf023cf173e76d4b7b75");
            return;
        }
        canvas.save();
        this.b.a(canvas);
        super.dispatchDraw(canvas);
        canvas.restore();
        this.b.c(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = k;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec93114bdb8ebafed686dcc110c76621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec93114bdb8ebafed686dcc110c76621");
            return;
        }
        this.b.b(canvas);
        super.draw(canvas);
    }
}
