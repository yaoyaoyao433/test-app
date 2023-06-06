package com.sankuai.waimai.platform.widget.pullrefresh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.o;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PullRefreshLogic {
    public static ChangeQuickRedirect a;
    final Context b;
    final com.sankuai.waimai.platform.widget.pullrefresh.b c;
    @NonNull
    c d;
    d e;
    @NonNull
    final b f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface State {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        int a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i);

        int b(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i);
    }

    public PullRefreshLogic(Context context, com.sankuai.waimai.platform.widget.pullrefresh.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ddc160894b59e232de35eeccba712f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ddc160894b59e232de35eeccba712f");
            return;
        }
        this.d = new a();
        this.f = new b();
        this.b = context;
        this.c = bVar;
    }

    public final void a(com.sankuai.waimai.platform.widget.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a68862f4fabdc9891b6a143bbb1bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a68862f4fabdc9891b6a143bbb1bff");
        } else {
            this.f.a(aVar);
        }
    }

    public final void b(com.sankuai.waimai.platform.widget.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4793be5748163e96334fa27ce118a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4793be5748163e96334fa27ce118a8");
        } else {
            this.f.b(aVar);
        }
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c581df9e78d8e6d949ca8a1d05b84e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c581df9e78d8e6d949ca8a1d05b84e6")).intValue();
        }
        switch (c()) {
            case 0:
            case 1:
            case 2:
                return b(this.d.a(this.c, i) - this.c.c());
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03bd6005f1d4269dd605859a042a414e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03bd6005f1d4269dd605859a042a414e")).intValue();
        }
        if (i == 0) {
            return 0;
        }
        int c2 = this.c.c();
        int a2 = this.c.a();
        int b2 = o.b(i + c2, 0, this.c.b());
        if (b2 == c2) {
            return 0;
        }
        a(b2, a2);
        this.f.a(this.c, b2 >= a2 ? 2 : 1);
        return b2 - c2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92d017f521277ea7738b0a1d2ecd85f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92d017f521277ea7738b0a1d2ecd85f3");
        } else if (c() != 3) {
        } else {
            this.f.a(this.c, 5);
            this.c.a(false);
            a(this.c.c(), 0, new Runnable() { // from class: com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1d343060e25876dfd37e6bb20058340", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1d343060e25876dfd37e6bb20058340");
                        return;
                    }
                    PullRefreshLogic.this.c.a(true);
                    PullRefreshLogic.this.f.a(PullRefreshLogic.this.c, 0);
                }
            });
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8cc76a0ba73b7e998a1903166984c24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8cc76a0ba73b7e998a1903166984c24");
            return;
        }
        switch (c()) {
            case 1:
            case 2:
                int c2 = this.c.c();
                int a2 = this.c.a();
                if (c2 >= a2) {
                    a(c2, a2, new Runnable() { // from class: com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f48b59fd3b7b617d2fb47720915fa52c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f48b59fd3b7b617d2fb47720915fa52c");
                                return;
                            }
                            PullRefreshLogic.this.c.a(false);
                            PullRefreshLogic.this.f.a(PullRefreshLogic.this.c, 3);
                        }
                    });
                    return;
                }
                this.f.a(this.c, 4);
                this.c.a(false);
                a(c2, 0, new Runnable() { // from class: com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbfc7ae10f12c288cb1f7bff21a0b1ba", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbfc7ae10f12c288cb1f7bff21a0b1ba");
                            return;
                        }
                        PullRefreshLogic.this.c.a(true);
                        PullRefreshLogic.this.f.a(PullRefreshLogic.this.c, 0);
                    }
                });
                return;
            default:
                return;
        }
    }

    private void a(int i, int i2, @Nullable Runnable runnable) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca2df9724b63f25c17b51453130d89b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca2df9724b63f25c17b51453130d89b");
            return;
        }
        d();
        if (i == i2) {
            runnable.run();
            return;
        }
        this.e = new d(i, i2, runnable);
        this.e.start();
    }

    void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e06c42358c707d7cb681e0bb1c4cd3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e06c42358c707d7cb681e0bb1c4cd3c");
            return;
        }
        this.c.a(i);
        this.f.b(this.c, i, i2);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624a7d3bc21f58eb00474e9a837e7624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624a7d3bc21f58eb00474e9a837e7624");
        } else if (this.e != null) {
            this.e.cancel();
            this.e = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements c {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic.c
        public final int a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffe25640d6a4d1a9f24416c25dfd38a3", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffe25640d6a4d1a9f24416c25dfd38a3")).intValue();
            }
            int a2 = bVar.a();
            int i2 = i / 2;
            return i2 <= a2 ? i2 : a2 + ((i - (a2 * 2)) / 5);
        }

        @Override // com.sankuai.waimai.platform.widget.pullrefresh.PullRefreshLogic.c
        public final int b(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c05efd8f2766e2e337f9e4168fec379", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c05efd8f2766e2e337f9e4168fec379")).intValue();
            }
            int a2 = bVar.a();
            return i <= a2 ? i * 2 : ((i - a2) * 5) + (a2 * 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        @Nullable
        private final Runnable c;

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        public d(int i, int i2, @Nullable Runnable runnable) {
            Object[] objArr = {PullRefreshLogic.this, Integer.valueOf(i), Integer.valueOf(i2), runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff94bb519acc32622dcf3164b4fed813", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff94bb519acc32622dcf3164b4fed813");
                return;
            }
            setIntValues(i, i2);
            setDuration(g.c(PullRefreshLogic.this.b, Math.abs(i - i2)) * 3);
            this.c = runnable;
            addListener(this);
            addUpdateListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797e3762c90b1d469b4c20044467d838", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797e3762c90b1d469b4c20044467d838");
                return;
            }
            PullRefreshLogic.this.e = null;
            if (this.c != null) {
                this.c.run();
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c7d38b2d46df9041057283bc12755bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c7d38b2d46df9041057283bc12755bf");
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PullRefreshLogic pullRefreshLogic = PullRefreshLogic.this;
            pullRefreshLogic.a(intValue, pullRefreshLogic.c.a());
        }
    }

    @State
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e953605a2ae59dd24f00161c78a56b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e953605a2ae59dd24f00161c78a56b")).intValue() : this.f.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        @State
        int b;
        private Set<com.sankuai.waimai.platform.widget.pullrefresh.a> c;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316b5289e4bb9419fb4714505697f81e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316b5289e4bb9419fb4714505697f81e");
                return;
            }
            this.c = new HashSet();
            this.b = 0;
        }

        public final void a(com.sankuai.waimai.platform.widget.pullrefresh.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43172240289053f4d0ec78daaa0a8d38", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43172240289053f4d0ec78daaa0a8d38");
            } else if (aVar != null) {
                this.c.add(aVar);
            }
        }

        public final void b(com.sankuai.waimai.platform.widget.pullrefresh.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac77608f5d1d7cb5f2241e7bab71840d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac77608f5d1d7cb5f2241e7bab71840d");
            } else if (aVar != null) {
                this.c.remove(aVar);
            }
        }

        public final void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, @State int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adee1f96ba3f73f57b3b3f278a05599", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adee1f96ba3f73f57b3b3f278a05599");
            } else if (i != this.b) {
                int i2 = this.b;
                this.b = i;
                a(bVar, i, i2);
            }
        }

        private void a(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, @State int i, @State int i2) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b72da163cbc9079aa29133ac28f53050", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b72da163cbc9079aa29133ac28f53050");
                return;
            }
            for (com.sankuai.waimai.platform.widget.pullrefresh.a aVar : this.c) {
                aVar.a(bVar, i, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(@NonNull com.sankuai.waimai.platform.widget.pullrefresh.b bVar, int i, int i2) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38267635e6571ff02617457fbefc9a46", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38267635e6571ff02617457fbefc9a46");
                return;
            }
            int i3 = this.b;
            for (com.sankuai.waimai.platform.widget.pullrefresh.a aVar : this.c) {
                aVar.a(bVar, i, i2, i3);
            }
        }
    }
}
