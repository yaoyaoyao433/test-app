package com.sankuai.waimai.business.restaurant.framework.backpress;

import android.annotation.SuppressLint;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.d;
import android.arch.lifecycle.f;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class OnBackPressedDispatcher {
    public static ChangeQuickRedirect a;
    @Nullable
    public final Runnable b;
    public final ArrayDeque<com.sankuai.waimai.business.restaurant.framework.backpress.a> c;

    public OnBackPressedDispatcher() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e61456bf5071dce6b87fe88b350e8fce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e61456bf5071dce6b87fe88b350e8fce");
        }
    }

    public OnBackPressedDispatcher(@Nullable Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98900da87d4ae698a394405631b4f11c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98900da87d4ae698a394405631b4f11c");
            return;
        }
        this.c = new ArrayDeque<>();
        this.b = runnable;
    }

    @SuppressLint({"LambdaLast"})
    @MainThread
    public final void a(@NonNull f fVar, @NonNull com.sankuai.waimai.business.restaurant.framework.backpress.a aVar) {
        Object[] objArr = {fVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cfa062f3b95791d4e2bf7602eec98d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cfa062f3b95791d4e2bf7602eec98d7");
            return;
        }
        d lifecycle = fVar.getLifecycle();
        if (lifecycle.a() == d.b.DESTROYED) {
            return;
        }
        aVar.a(new LifecycleOnBackPressedCancellable(lifecycle, aVar));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a implements com.airbnb.lottie.a {
        public static ChangeQuickRedirect a;
        private final com.sankuai.waimai.business.restaurant.framework.backpress.a c;

        public a(com.sankuai.waimai.business.restaurant.framework.backpress.a aVar) {
            Object[] objArr = {OnBackPressedDispatcher.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fc88b5935448a7fd246868c2dc63f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fc88b5935448a7fd246868c2dc63f5");
            } else {
                this.c = aVar;
            }
        }

        @Override // com.airbnb.lottie.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "431d2dbef05667254cf1ec0d46864712", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "431d2dbef05667254cf1ec0d46864712");
                return;
            }
            OnBackPressedDispatcher.this.c.remove(this.c);
            this.c.b(this);
        }
    }

    /* compiled from: ProGuard */
    @SuppressLint({"RestrictedApi"})
    /* loaded from: classes4.dex */
    public class LifecycleOnBackPressedCancellable implements GenericLifecycleObserver, com.airbnb.lottie.a {
        public static ChangeQuickRedirect a;
        private final d c;
        private final com.sankuai.waimai.business.restaurant.framework.backpress.a d;
        @Nullable
        private com.airbnb.lottie.a e;

        public LifecycleOnBackPressedCancellable(@NonNull d dVar, @NonNull com.sankuai.waimai.business.restaurant.framework.backpress.a aVar) {
            Object[] objArr = {OnBackPressedDispatcher.this, dVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a3bc3f23ca6c054b2523190f2a0a986", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a3bc3f23ca6c054b2523190f2a0a986");
                return;
            }
            this.c = dVar;
            this.d = aVar;
            dVar.a(this);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        public final void a(@NonNull f fVar, @NonNull d.a aVar) {
            com.airbnb.lottie.a aVar2;
            Object[] objArr = {fVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20f68899a9efa9f4b183dbdf766566c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20f68899a9efa9f4b183dbdf766566c4");
            } else if (aVar == d.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                com.sankuai.waimai.business.restaurant.framework.backpress.a aVar3 = this.d;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = OnBackPressedDispatcher.a;
                if (PatchProxy.isSupport(objArr2, onBackPressedDispatcher, changeQuickRedirect2, false, "b98512988141348d8ae24188a61d3aeb", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar2 = (com.airbnb.lottie.a) PatchProxy.accessDispatch(objArr2, onBackPressedDispatcher, changeQuickRedirect2, false, "b98512988141348d8ae24188a61d3aeb");
                } else {
                    onBackPressedDispatcher.c.add(aVar3);
                    aVar2 = new a(aVar3);
                    aVar3.a(aVar2);
                }
                this.e = aVar2;
            } else if (aVar == d.a.ON_STOP) {
                if (this.e != null) {
                    this.e.cancel();
                }
            } else if (aVar == d.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // com.airbnb.lottie.a
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d181cc6d064c3d5b05e8ea0713055f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d181cc6d064c3d5b05e8ea0713055f");
                return;
            }
            this.c.b(this);
            this.d.b(this);
            if (this.e != null) {
                this.e.cancel();
                this.e = null;
            }
        }
    }
}
