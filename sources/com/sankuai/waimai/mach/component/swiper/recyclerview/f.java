package com.sankuai.waimai.mach.component.swiper.recyclerview;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.recyclerview.ViewPagerLayoutManager;
import com.sankuai.waimai.mach.utils.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends d {
    public static ChangeQuickRedirect f;
    int g;
    int h;
    private Handler i;
    private int j;
    private int k;
    private boolean l;
    private int m;
    private ViewPagerLayoutManager n;
    private boolean o;
    private boolean p;

    public static /* synthetic */ void a(f fVar) {
        int i;
        boolean z;
        ViewPagerLayoutManager.a aVar;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "7f2ab153cc388432931dbaab6b3d7986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "7f2ab153cc388432931dbaab6b3d7986");
        } else if (fVar.b == null || !fVar.p) {
        } else {
            RecyclerView recyclerView = fVar.b;
            Object[] objArr2 = {recyclerView};
            ChangeQuickRedirect changeQuickRedirect2 = j.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a62ce9882106472fe22c562619cc15a7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a62ce9882106472fe22c562619cc15a7")).booleanValue();
            } else {
                Object[] objArr3 = {recyclerView};
                ChangeQuickRedirect changeQuickRedirect3 = j.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fd5d9a0ec7b1962b5645b5b23fdcd85b", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fd5d9a0ec7b1962b5645b5b23fdcd85b")).intValue();
                } else {
                    Rect rect = new Rect();
                    if (recyclerView.getLocalVisibleRect(rect)) {
                        i = (rect.width() == recyclerView.getMeasuredWidth() && rect.height() == recyclerView.getMeasuredHeight()) ? 1 : 2;
                    } else {
                        i = 0;
                    }
                }
                z = i != 0;
            }
            if (z) {
                int g = fVar.n.g() * (fVar.n.getReverseLayout() ? -1 : 1);
                if (fVar.n.n || g != fVar.n.getItemCount() - 1) {
                    i2 = fVar.d(g);
                }
                if (!fVar.o && (aVar = fVar.n.m) != null) {
                    aVar.a(fVar.n.f());
                }
                e.a(fVar.b, fVar.n, i2);
                if (!fVar.o) {
                    fVar.i.sendEmptyMessage(fVar.g);
                    fVar.o = true;
                } else {
                    fVar.i.sendEmptyMessageDelayed(fVar.g, fVar.j);
                }
                if (fVar.i.hasMessages(fVar.h)) {
                    fVar.i.removeMessages(fVar.h);
                    return;
                }
                return;
            }
            fVar.o = false;
            fVar.i.sendEmptyMessageDelayed(fVar.h, fVar.j);
        }
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d5ccd79e5082eb9582e7fd9f5b879d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d5ccd79e5082eb9582e7fd9f5b879d");
            return;
        }
        this.g = 1000;
        this.h = this.g + 1;
        this.j = 2000;
        this.m = 2;
        this.i = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.mach.component.swiper.recyclerview.f.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e2dd50b768bd7e347aea0cbe8d9ab63", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e2dd50b768bd7e347aea0cbe8d9ab63")).booleanValue();
                }
                if (message.what == f.this.g) {
                    f.a(f.this);
                } else if (message.what == f.this.h) {
                    f.a(f.this);
                }
                return false;
            }
        });
    }

    private int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73d7d693351c19ddb012e11d772dbde8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73d7d693351c19ddb012e11d772dbde8")).intValue() : !this.o ? i : this.m == 2 ? i + 1 : i - 1;
    }

    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.a
    public final void a(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ea6af522fbfd57abbce40a112e59c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ea6af522fbfd57abbce40a112e59c8");
        } else if (this.b == recyclerView) {
        } else {
            if (this.b != null) {
                b();
            }
            this.b = recyclerView;
            if (this.b != null) {
                RecyclerView.LayoutManager layoutManager = this.b.getLayoutManager();
                if (layoutManager instanceof ViewPagerLayoutManager) {
                    this.n = (ViewPagerLayoutManager) layoutManager;
                    a();
                    this.c = new Scroller(this.b.getContext(), new DecelerateInterpolator());
                    a(this.n, this.n.m);
                    if (this.p) {
                        this.i.sendEmptyMessageDelayed(this.g, this.k);
                    }
                    this.l = true;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.swiper.recyclerview.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608892a19545d420b699211dc43f8ec4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608892a19545d420b699211dc43f8ec4");
            return;
        }
        super.b();
        if (this.l) {
            this.i.removeCallbacksAndMessages(null);
            this.l = false;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04816c6c822e49a630ad004a3405a571", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04816c6c822e49a630ad004a3405a571");
        } else if (this.l) {
            this.i.removeCallbacksAndMessages(null);
            this.l = false;
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58989312c56efc1d92905df4485e09c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58989312c56efc1d92905df4485e09c2");
        } else if (this.l) {
        } else {
            this.i.sendEmptyMessageDelayed(this.g, z ? this.k : this.j);
            this.l = true;
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "444b03a61654c922c550ed6d05ca08f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "444b03a61654c922c550ed6d05ca08f0");
            return;
        }
        e(i);
        this.j = i;
    }

    public final void b(int i) {
        if (i < 0) {
            i = 0;
        }
        this.k = i;
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb982c0736315f4c3aa339562777e3af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb982c0736315f4c3aa339562777e3af");
        } else if (i <= 0) {
            throw new IllegalArgumentException("time interval should greater than 0");
        }
    }

    public final void b(boolean z) {
        this.p = z;
        this.o = z;
    }

    public final void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971ca8072c2fff0c1410690488faf3f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971ca8072c2fff0c1410690488faf3f2");
            return;
        }
        int g = this.n.g();
        int itemCount = this.n.getItemCount() - 1;
        if (!this.n.n) {
            if (i == 1 && g == 0) {
                return;
            }
            if (i == 2 && g == itemCount) {
                return;
            }
        }
        e.a(this.b, this.n, i == 2 ? g + 1 : g - 1);
    }
}
