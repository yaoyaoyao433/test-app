package com.sankuai.waimai.ad.view.mach.gifimage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    boolean b;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "116581d92932f4fcd288fc6006a28b74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "116581d92932f4fcd288fc6006a28b74");
        } else {
            this.b = false;
        }
    }

    @Override // com.sankuai.waimai.mach.widget.c, android.widget.ImageView
    public final void setImageDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48925517b716e72ffc6cab3f925054ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48925517b716e72ffc6cab3f925054ca");
            return;
        }
        setImageDrawableWithoutStartAnim(drawable);
        if (!this.b || drawable == null) {
            return;
        }
        b();
    }

    public final boolean getGifPlayState() {
        return this.b;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb645e0883f876a1f4554cf1526b384", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb645e0883f876a1f4554cf1526b384");
            return;
        }
        this.b = false;
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76c7d2b0dc2a10ad5fc76b153702819d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76c7d2b0dc2a10ad5fc76b153702819d");
            return;
        }
        a();
        super.onDetachedFromWindow();
    }
}
