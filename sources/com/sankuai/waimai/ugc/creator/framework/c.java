package com.sankuai.waimai.ugc.creator.framework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.framework.event.f;
import com.sankuai.waimai.ugc.creator.framework.event.g;
import com.sankuai.waimai.ugc.creator.framework.event.h;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class c {
    public static ChangeQuickRedirect d;
    e e;
    protected b f;

    public abstract b a();

    public abstract e b(Activity activity, Bundle bundle);

    public final void c(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16fef0d5e5ab64ac89f945ec476df7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16fef0d5e5ab64ac89f945ec476df7fb");
        } else {
            this.e = b(activity, bundle);
        }
    }

    public void a(@NonNull Activity activity, @Nullable Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45441c3380b885dde0126be96ac335ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45441c3380b885dde0126be96ac335ea");
            return;
        }
        this.f = a();
        if (this.f != null) {
            this.f.a(this.e, 2);
        }
    }

    public View b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83116b520e81d5cc7860d2c5f5e4a34", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83116b520e81d5cc7860d2c5f5e4a34") : this.f.s;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f79eee542b3046160480b68fa8ffad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f79eee542b3046160480b68fa8ffad7");
        } else if (this.f != null) {
            this.f.a(this.e, 3);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba6561a4a393d77dd9a5d9af3a1d180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba6561a4a393d77dd9a5d9af3a1d180");
        } else if (this.f != null) {
            this.f.a(this.e, 4);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0cbd7293a05d462c8fced3913e7e0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0cbd7293a05d462c8fced3913e7e0a");
        } else if (this.f != null) {
            this.f.a(this.e, 3);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fae90d6193c9418839990e1da4988aaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fae90d6193c9418839990e1da4988aaa");
        } else if (this.f != null) {
            this.f.a(this.e, 2);
        }
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf5b032abb97d399a3e18ccd5176f73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf5b032abb97d399a3e18ccd5176f73");
            return;
        }
        if (this.f != null) {
            this.f.a(this.e, 0);
            this.f = null;
        }
        this.e = null;
    }

    public final void a(final Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "104a233a3bd78235fbbd0b31f7d7b09c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "104a233a3bd78235fbbd0b31f7d7b09c");
        } else {
            this.f.b(f.class).a(new com.sankuai.waimai.ugc.creator.framework.event.c<f>() { // from class: com.sankuai.waimai.ugc.creator.framework.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.framework.event.c
                public final /* synthetic */ void a(f fVar) {
                    Object[] objArr2 = {fVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca3af494dbd12eb4de2d5490f0470683", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca3af494dbd12eb4de2d5490f0470683");
                    }
                }
            });
        }
    }

    public final void a(final Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04ebe75dd0aff01d9398514e66d6a315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04ebe75dd0aff01d9398514e66d6a315");
        } else {
            this.f.b(h.class).a(new com.sankuai.waimai.ugc.creator.framework.event.c<h>() { // from class: com.sankuai.waimai.ugc.creator.framework.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.framework.event.c
                public final /* synthetic */ void a(h hVar) {
                    Object[] objArr2 = {hVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23666ef4547abad860b7d9effe8aef8e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23666ef4547abad860b7d9effe8aef8e");
                    }
                }
            });
        }
    }

    public final void b(final Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0891bff450184013916f8302523a0a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0891bff450184013916f8302523a0a80");
        } else {
            this.f.b(g.class).a(new com.sankuai.waimai.ugc.creator.framework.event.c<g>() { // from class: com.sankuai.waimai.ugc.creator.framework.c.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.framework.event.c
                public final /* synthetic */ void a(g gVar) {
                    Object[] objArr2 = {gVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82be87070acfb4206f5723ea7708b4c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82be87070acfb4206f5723ea7708b4c");
                    }
                }
            });
        }
    }

    public final boolean a(com.sankuai.waimai.ugc.creator.framework.event.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e1aa057e2bfc3f87da734de5494698", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e1aa057e2bfc3f87da734de5494698")).booleanValue() : this.f.a(bVar);
    }
}
