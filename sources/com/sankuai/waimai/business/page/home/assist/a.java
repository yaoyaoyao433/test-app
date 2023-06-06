package com.sankuai.waimai.business.page.home.assist;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.l;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.WMHomePageFragment;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends c {
    public static ChangeQuickRedirect v;
    private WMHomePageFragment C;
    public HomePageViewModel w;

    public static /* synthetic */ void a(a aVar, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f6d0bedfd5b1714e8656455637660c01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f6d0bedfd5b1714e8656455637660c01");
            return;
        }
        aVar.w.W = false;
        if (activity == null || f.a(activity) || activity.getIntent() == null) {
            return;
        }
        Intent intent = activity.getIntent();
        aVar.w.W = com.sankuai.waimai.platform.utils.f.a(intent, "arg_need_open_smart_assistant", false);
        intent.putExtra("arg_need_open_smart_assistant", false);
        activity.setIntent(intent);
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "b435cbe242ca5cf1c9f6ce3559f37fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "b435cbe242ca5cf1c9f6ce3559f37fd1");
        } else if (aVar.A != null) {
            if (z) {
                aVar.A.setVisibility(8);
            } else {
                aVar.A.setVisibility(0);
            }
        }
    }

    public static /* synthetic */ void b(a aVar, Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d8e52047cbf0cbebfeb4458aa9020ce8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d8e52047cbf0cbebfeb4458aa9020ce8");
        } else if (f.a(activity)) {
        } else {
            String a = activity.getIntent() != null ? com.sankuai.waimai.platform.utils.f.a(activity.getIntent(), "arg_smart_assistant_label") : "";
            Bundle bundle = new Bundle();
            if (a == null) {
                a = "";
            }
            bundle.putString("mSASceneLabel", a);
            aVar.a(activity, bundle);
        }
    }

    @Override // com.sankuai.waimai.business.page.home.assist.c
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6c3016ab4f9d447f032727541ef14d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6c3016ab4f9d447f032727541ef14d");
            return;
        }
        super.b(view);
        a((PageFragment) this.C);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "793916cc297c63e2f0f7733899a40cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "793916cc297c63e2f0f7733899a40cfe");
        } else if (this.w == null) {
        } else {
            this.w.n.a(this.C, new l<b.a>() { // from class: com.sankuai.waimai.business.page.home.assist.a.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable b.a aVar) {
                    b.a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "124f05b197d5ec1201b5a5b5172a8499", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "124f05b197d5ec1201b5a5b5172a8499");
                    } else if (aVar2 == null || aVar2 != b.a.LOGOUT) {
                    } else {
                        a.a(a.this, false);
                    }
                }
            });
            this.w.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.assist.a.2
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable d.a aVar) {
                    d.a aVar2 = aVar;
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0fa49190f230cbfd1cc5c63690bb9773", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0fa49190f230cbfd1cc5c63690bb9773");
                    } else if (aVar2 == null || aVar2 != d.a.ON_CREATE) {
                    } else {
                        a.a(a.this, a.this.y);
                    }
                }
            });
            this.w.A.a(this.C, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.assist.a.3
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa791e9b6ba2a36ba3075bc30df2f518", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa791e9b6ba2a36ba3075bc30df2f518");
                    } else if (bool2 != null) {
                        a.b(a.this, a.this.y);
                    }
                }
            });
            this.w.B.a(this.C, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.assist.a.4
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "10f71a94f049ee4ddb1c125e4924a53d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "10f71a94f049ee4ddb1c125e4924a53d");
                    } else if (bool2 != null) {
                        a.a(a.this, bool2.booleanValue());
                    }
                }
            });
        }
    }
}
