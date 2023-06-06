package com.sankuai.waimai.store.view.price;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.style.ImageSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends ImageSpan {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final int c;
    private final double d;

    public a(@NonNull Context context, int i, int i2) {
        super(context, i, 1);
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36899858b3e511b5e1302ef3612d6087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36899858b3e511b5e1302ef3612d6087");
            return;
        }
        this.b = context;
        this.c = i;
        this.d = h.a(context, i2);
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        Drawable drawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e0ccb3f8f68439ff370752f777953f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e0ccb3f8f68439ff370752f777953f");
        }
        try {
            drawable = this.b.getDrawable(this.c);
        } catch (Exception e) {
            e = e;
            drawable = null;
        }
        try {
            drawable.setBounds(0, 0, (int) this.d, (int) ((this.d / drawable.getIntrinsicWidth()) * drawable.getIntrinsicHeight()));
        } catch (Exception e2) {
            e = e2;
            com.sankuai.waimai.store.base.log.a.a(e);
            return drawable;
        }
        return drawable;
    }
}
