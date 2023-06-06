package com.meituan.android.neohybrid.framework.neo;

import android.view.View;
import android.widget.ImageView;
import com.dianping.titans.widget.DefaultTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.meituan.android.neohybrid.framework.webcompat.element.a {
    public static ChangeQuickRedirect a;
    private DefaultTitleBar b;
    private ImageView c;

    public a(DefaultTitleBar defaultTitleBar, ImageView imageView) {
        Object[] objArr = {defaultTitleBar, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d89fc87d8b18a54e8eac7b32531787", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d89fc87d8b18a54e8eac7b32531787");
            return;
        }
        this.b = defaultTitleBar;
        this.c = imageView;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final View a() {
        return this.b;
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a20042b6baa85b6fc7b4100c1d83f4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a20042b6baa85b6fc7b4100c1d83f4b");
            return;
        }
        this.b.showTitleBar(false);
        this.c.setVisibility(8);
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1059ca4e2eca332454828e694290e769", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1059ca4e2eca332454828e694290e769");
            return;
        }
        this.b.showTitleBar(true);
        this.c.setVisibility(0);
    }

    @Override // com.meituan.android.neohybrid.framework.webcompat.element.a
    public final void a(int i) {
        Object[] objArr = {-1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77f467edd849637620c76829f8ce1bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77f467edd849637620c76829f8ce1bd5");
        } else {
            this.b.setBackgroundColor(-1);
        }
    }
}
