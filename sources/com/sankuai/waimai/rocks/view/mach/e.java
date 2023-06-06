package com.sankuai.waimai.rocks.view.mach;

import android.content.Context;
import android.graphics.Outline;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.meituan.android.cube.pga.view.a<FrameLayout> {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.cube.pga.view.a
    @Nullable
    public final /* synthetic */ FrameLayout c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d1e765da21f87a9d4dae4f67cef6fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (FrameLayout) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d1e765da21f87a9d4dae4f67cef6fe");
        }
        FrameLayout frameLayout = new FrameLayout(this.c);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return frameLayout;
    }

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "924d9a9f302b1acb319e2a143b22c42b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "924d9a9f302b1acb319e2a143b22c42b");
        }
    }

    public e(Context context, @Nullable ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39228a9cdbe60b3ef3dacee52e444b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39228a9cdbe60b3ef3dacee52e444b4");
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a528022a580a9d26771c9246445991b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a528022a580a9d26771c9246445991b3");
        } else if (this.b == 0 || i <= 0) {
        } else {
            final int a = com.sankuai.waimai.foundation.utils.g.a(this.c, i);
            ((FrameLayout) this.b).setOutlineProvider(new ViewOutlineProvider() { // from class: com.sankuai.waimai.rocks.view.mach.e.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr2 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16030305cae07af8211ea396bb66fde0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16030305cae07af8211ea396bb66fde0");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), a);
                    }
                }
            });
            ((FrameLayout) this.b).setClipToOutline(true);
        }
    }
}
