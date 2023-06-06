package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OtherConfirmButton extends BaseButton {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.android.yoda.widget.view.BaseButton, com.meituan.android.yoda.model.b.InterfaceC0379b
    public String getBid() {
        return "b_xrl5o12c";
    }

    public OtherConfirmButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39829d757759a8af8b47508d20c3dbd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39829d757759a8af8b47508d20c3dbd0");
        }
    }

    public OtherConfirmButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2131559332);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "955e37dedc8f13a4d5191519f68951d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "955e37dedc8f13a4d5191519f68951d9");
        }
    }

    public OtherConfirmButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd305bebbc5ae78444b5a3b11922ac5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd305bebbc5ae78444b5a3b11922ac5a");
        }
    }

    @Override // com.meituan.android.yoda.widget.view.BaseButton
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bce804dd88f7a0b27085e36e01cb869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bce804dd88f7a0b27085e36e01cb869");
            return;
        }
        c("b_xrl5o12c");
        com.meituan.android.yoda.model.b a = com.meituan.android.yoda.model.b.a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.yoda.model.b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "0bdd66152c86dcb6e86287f3dbd71600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "0bdd66152c86dcb6e86287f3dbd71600");
        } else if (a.d && a.c) {
            com.meituan.android.yoda.model.b.c();
            com.meituan.android.yoda.model.b.b.execute(com.meituan.android.yoda.model.c.a(a));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "930455876830f547fc3b1ef19959ff54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "930455876830f547fc3b1ef19959ff54");
        } else {
            super.onDraw(canvas);
        }
    }
}
