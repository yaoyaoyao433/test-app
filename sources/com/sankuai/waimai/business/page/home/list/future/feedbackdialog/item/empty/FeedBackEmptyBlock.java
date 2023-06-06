package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.empty;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeedBackEmptyBlock extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, a, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a> {
    public static ChangeQuickRedirect r;

    @Keep
    public FeedBackEmptyBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96929e6c849021e42e6cf8bd79363511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96929e6c849021e42e6cf8bd79363511");
        }
    }

    @Keep
    public FeedBackEmptyBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a442cd5297e28eacb681aaffc5680afe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a442cd5297e28eacb681aaffc5680afe");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d5d19eadcac0192f1f896bb4223e5b", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d5d19eadcac0192f1f896bb4223e5b") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.empty.FeedBackEmptyBlock.1
            public static ChangeQuickRedirect d;

            @Override // com.meituan.android.cube.pga.view.a
            @Nullable
            public final View c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31950e952544de8da4f290e88da27db2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31950e952544de8da4f290e88da27db2");
                }
                FrameLayout frameLayout = new FrameLayout(FeedBackEmptyBlock.this.m());
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, g.a(b.a, 80.0f)));
                return frameLayout;
            }
        };
    }
}
