package com.sankuai.waimai.store.assembler.component;

import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class BaseCard implements android.arch.lifecycle.e {
    public static ChangeQuickRedirect a;
    public ViewGroup b;
    public d c;
    public android.arch.lifecycle.f d;
    public FragmentActivity e;
    @Nullable
    public j f;
    boolean g;
    private PageEventHandler h;

    @NonNull
    public abstract View a(ViewGroup viewGroup);

    public e a() {
        return null;
    }

    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7e9dbebb8dc2dccf02409b4083471a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7e9dbebb8dc2dccf02409b4083471a");
        }
    }

    public int b() {
        return 0;
    }

    @OnLifecycleEvent(d.a.ON_DESTROY)
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dbe96e60b4fec417679d314b23a8a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dbe96e60b4fec417679d314b23a8a5d");
        }
    }

    @OnLifecycleEvent(d.a.ON_PAUSE)
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8d0fdc2c5d30a6cc2111994c5d078da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8d0fdc2c5d30a6cc2111994c5d078da");
        }
    }

    @OnLifecycleEvent(d.a.ON_RESUME)
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93674bef2f6f3f8b274ea1d9693923ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93674bef2f6f3f8b274ea1d9693923ff");
        }
    }

    @OnLifecycleEvent(d.a.ON_START)
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae349bdc6cfdc3be9ee165a252ee6412", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae349bdc6cfdc3be9ee165a252ee6412");
        }
    }

    @OnLifecycleEvent(d.a.ON_STOP)
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2878e711484ed1ccd0f4a24f44e4f21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2878e711484ed1ccd0f4a24f44e4f21");
        }
    }

    public BaseCard(android.arch.lifecycle.f fVar, FragmentActivity fragmentActivity) {
        Object[] objArr = {fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93db76958ad91b369eedcc09134cf10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93db76958ad91b369eedcc09134cf10");
            return;
        }
        this.c = new d();
        this.g = false;
        this.d = fVar;
        this.e = fragmentActivity;
        this.b = new FrameLayout(this.e);
        this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.h = (PageEventHandler) android.arch.lifecycle.q.a(this.e).a(PageEventHandler.class);
    }

    @Nullable
    public final <T extends View> T a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e00c764bc513f35e457effd8348f7a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e00c764bc513f35e457effd8348f7a") : (T) this.b.findViewById(i);
    }

    public final <T> void b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a44d2471753dc8313ad069cf3e94a711", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a44d2471753dc8313ad069cf3e94a711");
        } else {
            this.h.a((PageEventHandler) t);
        }
    }

    public final <T> void a(Class<T> cls, android.arch.lifecycle.l<T> lVar) {
        Object[] objArr = {cls, lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9171af22c7f84b02a7403c41aa2ccbd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9171af22c7f84b02a7403c41aa2ccbd8");
        } else {
            this.h.a(this.d, cls, lVar);
        }
    }
}
