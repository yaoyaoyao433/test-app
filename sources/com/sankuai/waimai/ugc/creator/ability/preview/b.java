package com.sankuai.waimai.ugc.creator.ability.preview;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.judas.e;
import com.sankuai.waimai.ugc.creator.widgets.round.RoundCornerImageView;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;
    private final ImageData c;
    private RoundCornerImageView d;

    public b(ImageData imageData) {
        Object[] objArr = {imageData};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e9ecd8d72b3b521e3fe87075830049", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e9ecd8d72b3b521e3fe87075830049");
            return;
        }
        this.c = imageData;
        this.m = false;
    }

    @Override // com.sankuai.waimai.ugc.creator.ability.preview.a, com.sankuai.waimai.ugc.creator.base.a
    public final void b(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c761590324cb81f10ffb45e9c7fd5f8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c761590324cb81f10ffb45e9c7fd5f8a");
            return;
        }
        this.d = new RoundCornerImageView(A());
        this.d.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.d.setCornerRadius(g.a(A(), 12.0f));
        this.d.setRatio(0.75f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 16;
        ((FrameLayout) b(R.id.fl_preview_container)).addView(this.d, layoutParams);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f45ce7e21c9e24a3755e7e36f5d8b2a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f45ce7e21c9e24a3755e7e36f5d8b2a1");
            return;
        }
        u();
        b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
        c.b = A();
        c.c = this.c.h;
        c.a(new b.d() { // from class: com.sankuai.waimai.ugc.creator.ability.preview.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.d
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "faefadda0f06bb4f3b3d617c72625c57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "faefadda0f06bb4f3b3d617c72625c57");
                } else {
                    b.this.v();
                }
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.d
            public final void a(int i, Exception exc) {
                Object[] objArr2 = {Integer.valueOf(i), exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "63ab7689365ec611e2bfa35603822315", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "63ab7689365ec611e2bfa35603822315");
                } else {
                    b.this.v();
                }
            }
        }).a((ImageView) this.d);
    }

    @Override // com.sankuai.waimai.ugc.creator.base.a
    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a20a35d351fd681be57f6c60418187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a20a35d351fd681be57f6c60418187");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c);
        a(arrayList);
    }

    @Override // com.sankuai.waimai.ugc.creator.framework.Lifecycle
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "783a730f1baf83360fc3e06f8ad97bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "783a730f1baf83360fc3e06f8ad97bb3");
            return;
        }
        e.a().a(B());
        super.a();
    }
}
