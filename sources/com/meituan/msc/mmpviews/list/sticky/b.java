package com.meituan.msc.mmpviews.list.sticky;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.meituan.msc.mmpviews.list.sticky.StickyLinearLayoutManager;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final RecyclerView b;
    View c;
    int d;
    boolean e;
    boolean f;
    int g;
    float h;
    int i;
    @Nullable
    StickyLinearLayoutManager.a j;
    private RecyclerView.s k;
    private final boolean l;
    private final ViewTreeObserver.OnGlobalLayoutListener m;
    private final com.meituan.msc.mmpviews.list.sticky.a n;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public View b;
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67682f448f7afeb5166e34a2b695672c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67682f448f7afeb5166e34a2b695672c");
        }
    }

    public b(RecyclerView recyclerView, com.meituan.msc.mmpviews.list.sticky.a aVar) {
        boolean z = false;
        Object[] objArr = {recyclerView, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a76ab6bcc59feb61319864cc7f3e9d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a76ab6bcc59feb61319864cc7f3e9d5");
            return;
        }
        this.g = -1;
        this.h = -1.0f;
        this.i = -1;
        this.m = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.msc.mmpviews.list.sticky.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d67c5b295d53a507c5d3f2b3119d3358", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d67c5b295d53a507c5d3f2b3119d3358");
                    return;
                }
                int visibility = b.this.b.getVisibility();
                if (b.this.c != null) {
                    b.this.c.setVisibility(visibility);
                }
            }
        };
        this.b = recyclerView;
        this.f = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "288241f841520bc24e05ded7b27334bd", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "288241f841520bc24e05ded7b27334bd")).booleanValue();
        } else if (this.b.getPaddingLeft() > 0 || this.b.getPaddingRight() > 0 || this.b.getPaddingTop() > 0) {
            z = true;
        }
        this.l = z;
        this.n = aVar;
    }

    private Map<Integer, c> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3ba8ddc571992548431c940d955124", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3ba8ddc571992548431c940d955124");
        }
        Map<Integer, c> a2 = this.n.a();
        return a2 == null ? new TreeMap() : a2;
    }

    private int c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e3f0f028e5567c0cc2f7e91ee7e81a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e3f0f028e5567c0cc2f7e91ee7e81a1")).intValue();
        }
        c cVar = c().get(Integer.valueOf(i));
        if (cVar == null) {
            return 0;
        }
        return cVar.b;
    }

    private View a(List<a> list, int i) {
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ea8bb48ea52fb03b5672dce8ae5717a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ea8bb48ea52fb03b5672dce8ae5717a");
        }
        for (a aVar : list) {
            if (i == aVar.a) {
                return aVar.b;
            }
        }
        return null;
    }

    public final void a(int i, List<a> list, d dVar) {
        RecyclerView.s sVar;
        Object[] objArr = {Integer.valueOf(i), list, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b72dba7d2d524492e464142f8d44f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b72dba7d2d524492e464142f8d44f5");
            return;
        }
        int a2 = a(i, list);
        View a3 = a(list, a2);
        if (a2 != this.g) {
            if (a2 == -1 || (this.l && a(a3))) {
                this.e = true;
                d();
                this.g = -1;
            } else {
                this.g = a2;
                Object[] objArr2 = {Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect2 = d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "3aab540942f4dfda8af7ae0c351d2f7e", RobustBitConfig.DEFAULT_VALUE)) {
                    sVar = (RecyclerView.s) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "3aab540942f4dfda8af7ae0c351d2f7e");
                } else {
                    if (dVar.d != dVar.b.getAdapter().getItemViewType(a2)) {
                        dVar.d = dVar.b.getAdapter().getItemViewType(a2);
                        dVar.c = dVar.b.getAdapter().createViewHolder((ViewGroup) dVar.b.getParent(), dVar.d);
                    }
                    sVar = dVar.c;
                }
                RecyclerView.s sVar2 = sVar;
                Object[] objArr3 = {sVar2, Integer.valueOf(a2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "756c9e499458b7cabcdeccc9ca79e704", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "756c9e499458b7cabcdeccc9ca79e704");
                } else if (this.f) {
                    g.d("[StickyHeaderHandler@attachHeader]", "detached, viewHolder: ", sVar2, ",position: ", Integer.valueOf(a2));
                } else {
                    b(this.g);
                    this.k = sVar2;
                    this.b.getAdapter().onBindViewHolder(this.k, a2);
                    this.c = this.k.itemView;
                    Object[] objArr4 = {Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b073a111eba22c5fdc9f6fcf5baf7551", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b073a111eba22c5fdc9f6fcf5baf7551");
                    }
                    Context context = this.c.getContext();
                    Object[] objArr5 = {context};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "330ed57238e32ca459da9c6364300f2b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "330ed57238e32ca459da9c6364300f2b");
                    } else if (this.i != -1 && this.h == -1.0f) {
                        int i2 = this.i;
                        Object[] objArr6 = {context, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        this.h = PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "2efefc9bfa0acdae95c443fd3c627607", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "2efefc9bfa0acdae95c443fd3c627607")).floatValue() : context.getResources().getDisplayMetrics().density * i2;
                    }
                    this.c.setVisibility(4);
                    this.b.getViewTreeObserver().addOnGlobalLayoutListener(this.m);
                    b().addView(this.c);
                    this.c.layout(this.b.getLeft(), this.b.getTop() + c(a2), this.b.getLeft() + this.c.getMeasuredWidth(), this.b.getTop() + c(a2) + this.c.getMeasuredHeight());
                    if (this.l) {
                        View view = this.c;
                        Object[] objArr7 = {view};
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "df33c3794646d231e60c0d1a26d7d2e7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "df33c3794646d231e60c0d1a26d7d2e7");
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                            Object[] objArr8 = {marginLayoutParams};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "11f0e1a2760f853971cda4b883bed269", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "11f0e1a2760f853971cda4b883bed269");
                            } else {
                                marginLayoutParams.setMargins(this.d == 1 ? this.b.getPaddingLeft() : 0, this.d == 1 ? 0 : this.b.getPaddingTop(), this.d == 1 ? this.b.getPaddingRight() : 0, 0);
                            }
                        }
                    }
                    this.e = false;
                }
            }
        } else if (this.l && a(a3)) {
            b(this.g);
            this.g = -1;
        }
        a(list);
        this.b.post(new Runnable() { // from class: com.meituan.msc.mmpviews.list.sticky.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "fad55493893a867f99746100bc10ceff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "fad55493893a867f99746100bc10ceff");
                    return;
                }
                b bVar = b.this;
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = b.a;
                if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "1a01656db7227a54d97eeefd1f4e04da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "1a01656db7227a54d97eeefd1f4e04da");
                } else if (bVar.h == -1.0f || bVar.c == null) {
                } else {
                    if ((bVar.d == 1 && bVar.c.getTranslationY() == 0.0f) || (bVar.d == 0 && bVar.c.getTranslationX() == 0.0f)) {
                        Object[] objArr11 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect11 = b.a;
                        if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "486648d02ad311fda3b58492796851d3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "486648d02ad311fda3b58492796851d3");
                            return;
                        } else if (Build.VERSION.SDK_INT < 21 || bVar.c.getTag() != null) {
                            return;
                        } else {
                            bVar.c.setTag(Boolean.TRUE);
                            bVar.c.animate().z(bVar.h);
                            return;
                        }
                    }
                    Object[] objArr12 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect12 = b.a;
                    if (PatchProxy.isSupport(objArr12, bVar, changeQuickRedirect12, false, "b20f0a030c11fc6ff86722fd1cc075d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, bVar, changeQuickRedirect12, false, "b20f0a030c11fc6ff86722fd1cc075d8");
                    } else if (Build.VERSION.SDK_INT < 21 || bVar.c.getTag() == null) {
                    } else {
                        bVar.c.setTag(null);
                        bVar.c.animate().z(0.0f);
                    }
                }
            }
        });
    }

    void a(final List<a> list) {
        boolean z;
        boolean z2;
        float f;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed7a3b1a16849958bda12af5ee175421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed7a3b1a16849958bda12af5ee175421");
        } else if (this.c == null) {
        } else {
            if (this.c.getHeight() == 0) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e2e8036294ff51b8e6612d0f9d5d7b5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e2e8036294ff51b8e6612d0f9d5d7b5");
                } else if (this.f) {
                    g.d("[StickyHeaderHandler@waitForLayoutAndRetry]", "detached, visibleHeaders: ", list);
                } else {
                    final View view = this.c;
                    if (view != null) {
                        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.msc.mmpviews.list.sticky.b.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                            public final void onGlobalLayout() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "63cf2ce0fd0a1353351ab9cda451c700", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "63cf2ce0fd0a1353351ab9cda451c700");
                                } else if (b.this.f) {
                                    g.d("[StickyHeaderHandler@onGlobalLayout]", "detached, view: ", view);
                                } else {
                                    if (Build.VERSION.SDK_INT >= 16) {
                                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                    } else {
                                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                                    }
                                    if (b.this.c == null) {
                                        return;
                                    }
                                    b.this.b().requestLayout();
                                    b.this.a(list);
                                }
                            }
                        });
                    }
                }
            } else if (this.g < 0) {
            } else {
                Iterator<a> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.a > this.g) {
                        View view2 = next.b;
                        int c = c(this.g);
                        Object[] objArr3 = {Integer.valueOf(c), view2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "434402cff4bb1d4312ddc20baf9874fa", RobustBitConfig.DEFAULT_VALUE)) {
                            f = ((Float) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "434402cff4bb1d4312ddc20baf9874fa")).floatValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(c), view2};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8f21c10fca351f8bbab4fd1795e585f3", RobustBitConfig.DEFAULT_VALUE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8f21c10fca351f8bbab4fd1795e585f3")).booleanValue();
                            } else {
                                z2 = this.d != 1 ? view2.getX() < ((float) (this.c.getWidth() + c)) : view2.getY() < ((float) (this.c.getHeight() + c));
                            }
                            if (!z2) {
                                f = -1.0f;
                            } else if (this.d == 1) {
                                f = -((c + this.c.getHeight()) - view2.getY());
                                this.c.setTranslationY(f);
                            } else {
                                f = -((c + this.c.getWidth()) - view2.getX());
                                this.c.setTranslationX(f);
                            }
                        }
                        if (f != -1.0f) {
                            z = false;
                        }
                    }
                }
                z = true;
                if (z) {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "140190c82e41576026ba57e563fa0991", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "140190c82e41576026ba57e563fa0991");
                    } else if (this.d == 1) {
                        this.c.setTranslationY(0.0f);
                    } else {
                        this.c.setTranslationX(0.0f);
                    }
                }
                this.c.setVisibility(0);
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "500add24a85e06aaa02539111ef39629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "500add24a85e06aaa02539111ef39629");
            return;
        }
        this.d = i;
        this.g = -1;
        this.e = true;
        d();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0c48e222ad6cc0b9c5c02f71d30216", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0c48e222ad6cc0b9c5c02f71d30216");
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
        } else {
            this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this.m);
        }
    }

    private int a(int i, List<a> list) {
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12b810d1e8a1e0a15dc1b55204d9c7a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12b810d1e8a1e0a15dc1b55204d9c7a7")).intValue();
        }
        int i2 = -1;
        a aVar = (list == null || list.size() <= 0) ? null : list.get(0);
        if (aVar == null || (aVar.b != null && aVar.b.getY() >= c(aVar.a))) {
            for (Map.Entry<Integer, c> entry : c().entrySet()) {
                if (entry.getKey().intValue() > i) {
                    break;
                }
                i2 = entry.getKey().intValue();
            }
            return i2;
        }
        return aVar.a;
    }

    private boolean a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e318e0c3eb1556ca1fd8b5683e4bea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e318e0c3eb1556ca1fd8b5683e4bea")).booleanValue() : view != null && (this.d != 1 ? view.getX() > 0.0f : view.getY() > 0.0f);
    }

    ViewGroup b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409aedf4f4de11a0493f131a0c3c8f25", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409aedf4f4de11a0493f131a0c3c8f25") : (ViewGroup) this.b.getParent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0f6c8909650d3efef2b4e5c2dbdb85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0f6c8909650d3efef2b4e5c2dbdb85");
        } else if (this.f) {
            g.d("[StickyHeaderHandler@detachHeader]", "detached, position: ", Integer.valueOf(i));
        } else if (this.c != null) {
            b().removeView(this.c);
            d(i);
            a();
            this.c = null;
            this.k = null;
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f178af4abb1989993e979a1dc70bb09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f178af4abb1989993e979a1dc70bb09d");
        } else if (this.f) {
            g.d("[StickyHeaderHandler@safeDetachHeader]", Boolean.valueOf(this.f));
        } else {
            final int i = this.g;
            b().post(new Runnable() { // from class: com.meituan.msc.mmpviews.list.sticky.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48b154e26278fce99e1b052b923bea41", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48b154e26278fce99e1b052b923bea41");
                    } else if (b.this.e) {
                        b.this.b(i);
                    }
                }
            });
        }
    }
}
