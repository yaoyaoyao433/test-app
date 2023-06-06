package com.sankuai.waimai.business.page.kingkong.view.actionbar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    public b e;

    public a(FragmentActivity fragmentActivity, ViewStub viewStub) {
        super((Context) fragmentActivity, viewStub);
        Object[] objArr = {fragmentActivity, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0413e51ede5d278e6ac4bf4b3c267f73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0413e51ede5d278e6ac4bf4b3c267f73");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    @Nullable
    public final View c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec9aa6644e6f019f784d7a675032759f", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec9aa6644e6f019f784d7a675032759f");
        }
        this.e = new b((KingKongActivity) this.c);
        return this.e.a((ViewGroup) null);
    }
}
