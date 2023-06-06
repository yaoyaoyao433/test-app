package com.sankuai.waimai.store.newwidgets.pullrefresh;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class PullRefreshLogic {
    public static ChangeQuickRedirect a;
    final Context b;
    final com.sankuai.waimai.store.newwidgets.pullrefresh.b c;
    @NonNull
    c d;
    d e;
    @NonNull
    final b f;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface State {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        int a(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i);

        int b(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i);
    }

    public PullRefreshLogic(Context context, com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f9226c632eedb08ec8ed1b87217955", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f9226c632eedb08ec8ed1b87217955");
            return;
        }
        this.d = new a();
        this.f = new b();
        this.b = context;
        this.c = bVar;
    }

    public final void a(com.sankuai.waimai.store.newwidgets.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8495aab601da9f12ec6ee537f33ad6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8495aab601da9f12ec6ee537f33ad6");
            return;
        }
        b bVar = this.f;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "dcd5def19345ecb99683c753d2f9efa3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "dcd5def19345ecb99683c753d2f9efa3");
        } else if (aVar != null) {
            bVar.b.add(aVar);
        }
    }

    public final void b(com.sankuai.waimai.store.newwidgets.pullrefresh.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6154d6b66f9e5e1f5c184bb2882912", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6154d6b66f9e5e1f5c184bb2882912");
            return;
        }
        b bVar = this.f;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2f062f95c7d162342ef30e6384a6ba1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2f062f95c7d162342ef30e6384a6ba1d");
        } else if (aVar != null) {
            bVar.b.remove(aVar);
        }
    }

    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a40980cbe15e7785561199b1067a6bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a40980cbe15e7785561199b1067a6bb")).intValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71021143fd57af8da86a5c3161df46d9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71021143fd57af8da86a5c3161df46d9")).intValue();
        }
        if (i == 0) {
            return 0;
        }
        int c2 = this.c.c();
        int a2 = this.c.a();
        int b2 = n.b(i + c2, 0, this.c.b());
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ade57ba49af5faaced1ac9d5a1bf42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ade57ba49af5faaced1ac9d5a1bf42");
        } else if (c() != 3) {
        } else {
            this.f.a(this.c, 5);
            this.c.a(false);
            a(this.c.c(), 0, new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.pullrefresh.PullRefreshLogic.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd7432b40cc06a5f4962556dc9dea8fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd7432b40cc06a5f4962556dc9dea8fc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75cc9bd1f5a22841b0850b0ca934c4b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75cc9bd1f5a22841b0850b0ca934c4b9");
            return;
        }
        switch (c()) {
            case 1:
            case 2:
                int c2 = this.c.c();
                int a2 = this.c.a();
                if (c2 >= a2) {
                    a(c2, a2, new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.pullrefresh.PullRefreshLogic.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aae19f6ad0856689a0c708eb4fc4818e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aae19f6ad0856689a0c708eb4fc4818e");
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
                a(c2, 0, new Runnable() { // from class: com.sankuai.waimai.store.newwidgets.pullrefresh.PullRefreshLogic.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0b5a2579963b0bd77cdc795f6d22199c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0b5a2579963b0bd77cdc795f6d22199c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5ec352308d8788745027da4eae3ae5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5ec352308d8788745027da4eae3ae5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dd580a53e0253248cb22cf027a8612f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dd580a53e0253248cb22cf027a8612f");
            return;
        }
        this.c.a(i);
        this.f.b(this.c, i, i2);
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff228f953f7a3687484ca10659e0d875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff228f953f7a3687484ca10659e0d875");
        } else if (this.e != null) {
            this.e.cancel();
            this.e = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements c {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullRefreshLogic.c
        public final int a(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfa6fca6e6512b727ac7943928bb1387", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfa6fca6e6512b727ac7943928bb1387")).intValue();
            }
            int a2 = bVar.a();
            int i2 = i / 2;
            return i2 <= a2 ? i2 : a2 + ((i - (a2 * 2)) / 5);
        }

        @Override // com.sankuai.waimai.store.newwidgets.pullrefresh.PullRefreshLogic.c
        public final int b(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c3c3692a57794f8eb96142138006a2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c3c3692a57794f8eb96142138006a2")).intValue();
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28aaa49e76790e96eb26df3a3464608b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28aaa49e76790e96eb26df3a3464608b");
                return;
            }
            setIntValues(i, i2);
            setDuration(h.b(PullRefreshLogic.this.b, Math.abs(i - i2)) * 3);
            this.c = runnable;
            addListener(this);
            addUpdateListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14282a06a414755aaaf83e0e1cc1c9eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14282a06a414755aaaf83e0e1cc1c9eb");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4675cf79a5dfb968f6c40424c51197d9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4675cf79a5dfb968f6c40424c51197d9");
                return;
            }
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            PullRefreshLogic pullRefreshLogic = PullRefreshLogic.this;
            pullRefreshLogic.a(intValue, pullRefreshLogic.c.a());
        }
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158d86ecf505780fe536400b95853eb5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158d86ecf505780fe536400b95853eb5")).intValue() : this.f.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        Set<com.sankuai.waimai.store.newwidgets.pullrefresh.a> b;
        int c;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af86737850925025ad9c98536a4ae561", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af86737850925025ad9c98536a4ae561");
                return;
            }
            this.b = new HashSet();
            this.c = 0;
        }

        public final void a(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8777abcf549244457cb85366a898bf45", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8777abcf549244457cb85366a898bf45");
            } else if (i != this.c) {
                int i2 = this.c;
                this.c = i;
                a(bVar, i, i2);
            }
        }

        private void a(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i, int i2) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f0392637a1aaff1c44554f936a51b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f0392637a1aaff1c44554f936a51b4");
                return;
            }
            for (com.sankuai.waimai.store.newwidgets.pullrefresh.a aVar : this.b) {
                aVar.a(bVar, i, i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(@NonNull com.sankuai.waimai.store.newwidgets.pullrefresh.b bVar, int i, int i2) {
            Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f2aee1f5f3cd997a806c7850e7adb26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f2aee1f5f3cd997a806c7850e7adb26");
                return;
            }
            int i3 = this.c;
            for (com.sankuai.waimai.store.newwidgets.pullrefresh.a aVar : this.b) {
                aVar.a(bVar, i, i2, i3);
            }
        }
    }
}
