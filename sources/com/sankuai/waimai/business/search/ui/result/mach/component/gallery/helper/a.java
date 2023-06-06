package com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.aj;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.c;
import com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.GalleryCardLayoutManager;
import com.sankuai.waimai.foundation.utils.g;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public RecyclerView b;
    FooterView c;
    public Context d;
    public GalleryCardLayoutManager e;
    public GalleryCardLayoutManager.a f;
    int g;
    boolean h;
    int i;
    int j;
    int k;
    View l;
    int m;
    boolean n;
    int o;
    public aj p;
    public RecyclerView.k q;
    private c r;
    private float s;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ce5f9dbef4759b218fd0133314a11200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ce5f9dbef4759b218fd0133314a11200");
        } else if (aVar.b == null || aVar.b.getChildCount() == 0) {
        } else {
            RecyclerView.LayoutManager layoutManager = aVar.b.getLayoutManager();
            View a2 = aVar.p.a(layoutManager);
            int childAdapterPosition = aVar.b.getChildAdapterPosition(a2);
            View findViewByPosition = layoutManager.findViewByPosition(childAdapterPosition - 1);
            View findViewByPosition2 = layoutManager.findViewByPosition(childAdapterPosition + 1);
            float a3 = aVar.a(aVar.b, findViewByPosition);
            float a4 = aVar.a(aVar.b, findViewByPosition2);
            float a5 = aVar.a(aVar.b, a2);
            if (a2 != null) {
                a2.setScaleY(a5);
            }
            if (findViewByPosition != null) {
                findViewByPosition.setScaleY(a3);
            }
            if (findViewByPosition2 != null) {
                findViewByPosition2.setScaleY(a4);
            }
            if (a2 == null || a5 < 1.0f || aVar.f == null) {
                return;
            }
            aVar.f.a(childAdapterPosition);
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb7c30c78ea87598773f347b46d703fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb7c30c78ea87598773f347b46d703fc");
            return;
        }
        this.n = false;
        this.o = 0;
        this.p = new aj();
        this.q = new RecyclerView.k() { // from class: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fc152ed952229265fdbcdac3aaf582f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fc152ed952229265fdbcdac3aaf582f");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && a.this.h && i == 0 && a.this.b() > 1 && a.this.k == a.this.b() - 1 && a.this.n && a.this.o == 1) {
                    a.this.o = 0;
                    a.this.a();
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                int i4;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c3357c9ce87b37b9664f3052eb4a787", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c3357c9ce87b37b9664f3052eb4a787");
                } else if (i != 0) {
                    a.a(a.this);
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c989347e7140dd806eed7dabecc47a90", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c989347e7140dd806eed7dabecc47a90");
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager = aVar.b.getLayoutManager();
                    if (layoutManager instanceof GalleryCardLayoutManager) {
                        aVar.k = ((GalleryCardLayoutManager) layoutManager).findLastVisibleItemPosition();
                    }
                    if (aVar.h && aVar.b() > 1 && aVar.k == aVar.b() - 1) {
                        aVar.l = ((GalleryCardLayoutManager) layoutManager).findViewByPosition(aVar.k);
                        Context context = aVar.b.getContext();
                        Object[] objArr4 = {context};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "3989797d1d5645e0398806a4c6594b9a", RobustBitConfig.DEFAULT_VALUE)) {
                            i3 = ((Integer) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "3989797d1d5645e0398806a4c6594b9a")).intValue();
                        } else {
                            WindowManager windowManager = (WindowManager) context.getSystemService("window");
                            Point point = new Point();
                            if (Build.VERSION.SDK_INT >= 17) {
                                windowManager.getDefaultDisplay().getRealSize(point);
                            } else {
                                windowManager.getDefaultDisplay().getSize(point);
                            }
                            i3 = point.x;
                        }
                        View view = aVar.l;
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "1f0bc842a7f51d43dfe6cb2879af607a", RobustBitConfig.DEFAULT_VALUE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "1f0bc842a7f51d43dfe6cb2879af607a")).intValue();
                        } else {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            i4 = iArr[0];
                        }
                        aVar.m = i3 - i4;
                        if (aVar.m >= g.a(aVar.b.getContext(), aVar.j) && aVar.o == 1) {
                            aVar.o = 0;
                            aVar.a();
                        } else if (aVar.m >= g.a(aVar.b.getContext(), aVar.i)) {
                            if (!aVar.n) {
                                aVar.n = true;
                                aVar.o = 1;
                            }
                        } else if (aVar.n) {
                            aVar.n = false;
                        }
                        if (aVar.c != null) {
                            aVar.c.setIsPullStatus(!aVar.n);
                        }
                    }
                }
            }
        };
    }

    public a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfae655cdfcef06be88887d288ed1a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfae655cdfcef06be88887d288ed1a7");
            return;
        }
        this.n = false;
        this.o = 0;
        this.p = new aj();
        this.q = new RecyclerView.k() { // from class: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8fc152ed952229265fdbcdac3aaf582f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8fc152ed952229265fdbcdac3aaf582f");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && a.this.h && i == 0 && a.this.b() > 1 && a.this.k == a.this.b() - 1 && a.this.n && a.this.o == 1) {
                    a.this.o = 0;
                    a.this.a();
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                int i4;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c3357c9ce87b37b9664f3052eb4a787", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c3357c9ce87b37b9664f3052eb4a787");
                } else if (i != 0) {
                    a.a(a.this);
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c989347e7140dd806eed7dabecc47a90", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c989347e7140dd806eed7dabecc47a90");
                        return;
                    }
                    RecyclerView.LayoutManager layoutManager = aVar.b.getLayoutManager();
                    if (layoutManager instanceof GalleryCardLayoutManager) {
                        aVar.k = ((GalleryCardLayoutManager) layoutManager).findLastVisibleItemPosition();
                    }
                    if (aVar.h && aVar.b() > 1 && aVar.k == aVar.b() - 1) {
                        aVar.l = ((GalleryCardLayoutManager) layoutManager).findViewByPosition(aVar.k);
                        Context context = aVar.b.getContext();
                        Object[] objArr4 = {context};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "3989797d1d5645e0398806a4c6594b9a", RobustBitConfig.DEFAULT_VALUE)) {
                            i3 = ((Integer) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "3989797d1d5645e0398806a4c6594b9a")).intValue();
                        } else {
                            WindowManager windowManager = (WindowManager) context.getSystemService("window");
                            Point point = new Point();
                            if (Build.VERSION.SDK_INT >= 17) {
                                windowManager.getDefaultDisplay().getRealSize(point);
                            } else {
                                windowManager.getDefaultDisplay().getSize(point);
                            }
                            i3 = point.x;
                        }
                        View view = aVar.l;
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "1f0bc842a7f51d43dfe6cb2879af607a", RobustBitConfig.DEFAULT_VALUE)) {
                            i4 = ((Integer) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "1f0bc842a7f51d43dfe6cb2879af607a")).intValue();
                        } else {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            i4 = iArr[0];
                        }
                        aVar.m = i3 - i4;
                        if (aVar.m >= g.a(aVar.b.getContext(), aVar.j) && aVar.o == 1) {
                            aVar.o = 0;
                            aVar.a();
                        } else if (aVar.m >= g.a(aVar.b.getContext(), aVar.i)) {
                            if (!aVar.n) {
                                aVar.n = true;
                                aVar.o = 1;
                            }
                        } else if (aVar.n) {
                            aVar.n = false;
                        }
                        if (aVar.c != null) {
                            aVar.c.setIsPullStatus(!aVar.n);
                        }
                    }
                }
            }
        };
        this.r = cVar;
        this.g = cVar.b;
        this.s = cVar.c;
        this.h = cVar.d;
        this.i = cVar.e;
        this.j = cVar.f;
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6857f236dee4f2b0829bb8b6bc353cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6857f236dee4f2b0829bb8b6bc353cdb");
            return;
        }
        if (this.r != null && this.r.g != null && this.r.k != null) {
            this.r.k.asyncCallJSMethod(this.r.g.b, new LinkedList());
        }
        this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "722b35eb387055231d7948fa164fb12c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "722b35eb387055231d7948fa164fb12c");
                } else {
                    a.this.b.smoothScrollToPosition(a.this.b() - 2);
                }
            }
        }, 800L);
    }

    int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0217b0e3f29ed3ea423360ffad6476", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0217b0e3f29ed3ea423360ffad6476")).intValue();
        }
        if (this.b == null || this.b.getLayoutManager() == null) {
            return 0;
        }
        return ((LinearLayoutManager) this.b.getLayoutManager()).getItemCount();
    }

    private float a(RecyclerView recyclerView, View view) {
        Object[] objArr = {recyclerView, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d793317e22167e279e187cb0040e12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d793317e22167e279e187cb0040e12")).floatValue();
        }
        if (view == null) {
            return -1.0f;
        }
        boolean canScrollVertically = recyclerView.getLayoutManager().canScrollVertically();
        int top = canScrollVertically ? view.getTop() : view.getLeft();
        int bottom = canScrollVertically ? view.getBottom() : view.getRight();
        int height = (canScrollVertically ? recyclerView.getHeight() : recyclerView.getWidth()) / 2;
        int abs = Math.abs(((top + bottom) / 2) - height);
        return abs > height ? this.s : ((1.0f - this.s) * (1.0f - (abs / height))) + this.s;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.mach.component.gallery.helper.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0870a extends RecyclerView.f {
        public static ChangeQuickRedirect a;

        private C0870a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ac14360512e3d60b74191f6f534b43c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ac14360512e3d60b74191f6f534b43c");
            }
        }

        @Override // android.support.v7.widget.RecyclerView.f
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int i2;
            Object[] objArr = {rect, view, recyclerView, state};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39aa8b5eae503c66663d736926d11072", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39aa8b5eae503c66663d736926d11072");
                return;
            }
            RecyclerView.s childViewHolder = recyclerView.getChildViewHolder(view);
            int oldPosition = childViewHolder.getAdapterPosition() == -1 ? childViewHolder.getOldPosition() : childViewHolder.getAdapterPosition();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            int itemCount = layoutManager.getItemCount();
            if (oldPosition != 0 && oldPosition != itemCount - 1) {
                rect.set(g.a(a.this.b.getContext(), a.this.g) / 2, 0, g.a(a.this.b.getContext(), a.this.g) / 2, 0);
                return;
            }
            Object[] objArr2 = {recyclerView, view};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0ec133863ca1517650433ed9f6f069ed", RobustBitConfig.DEFAULT_VALUE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0ec133863ca1517650433ed9f6f069ed")).intValue();
                i = itemCount;
            } else {
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                boolean canScrollVertically = layoutManager2.canScrollVertically();
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                int measuredWidth = recyclerView.getMeasuredWidth();
                int measuredHeight = recyclerView.getMeasuredHeight();
                if (measuredWidth == 0) {
                    measuredWidth = recyclerView.getWidth();
                }
                if (measuredHeight == 0) {
                    measuredHeight = recyclerView.getHeight();
                }
                int i3 = canScrollVertically ? measuredHeight : measuredWidth;
                int i4 = i3 / 2;
                int measuredHeight2 = canScrollVertically ? view.getMeasuredHeight() : view.getMeasuredWidth();
                if (measuredHeight2 == 0) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    i = itemCount;
                    view.measure(RecyclerView.LayoutManager.getChildMeasureSpec(measuredWidth, layoutManager2.getWidthMode(), recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), layoutParams.width, layoutManager2.canScrollHorizontally()), RecyclerView.LayoutManager.getChildMeasureSpec(measuredHeight, layoutManager2.getHeightMode(), recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), layoutParams.height, layoutManager2.canScrollVertically()));
                    measuredHeight2 = canScrollVertically ? view.getMeasuredHeight() : view.getMeasuredWidth();
                } else {
                    i = itemCount;
                }
                i2 = i4 - (measuredHeight2 / 2);
                int i5 = i3 - (i2 + measuredHeight2);
                if (childAdapterPosition != 0) {
                    i2 = i5;
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (oldPosition == 0) {
                    rect.set(0, i2, 0, 0);
                } else if (oldPosition == i - 1) {
                    rect.set(0, 0, 0, i2);
                } else {
                    rect.set(0, 0, 0, 0);
                }
            } else if (oldPosition == 0) {
                rect.set(i2, 0, g.a(a.this.b.getContext(), a.this.g) / 2, 0);
            } else if (oldPosition != i - 1) {
                rect.set(0, 0, 0, 0);
            } else if (a.this.h) {
                rect.set(g.a(a.this.b.getContext(), a.this.g) / 2, 0, 0, 0);
            } else {
                rect.set(g.a(a.this.b.getContext(), a.this.g) / 2, 0, i2, 0);
            }
        }
    }
}
