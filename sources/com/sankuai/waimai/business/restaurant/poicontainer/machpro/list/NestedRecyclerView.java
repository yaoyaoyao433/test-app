package com.sankuai.waimai.business.restaurant.poicontainer.machpro.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.a;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedRecyclerView extends RecyclerView implements com.sankuai.waimai.machpro.view.a, e {
    public static ChangeQuickRedirect a;
    protected final c b;
    public Set<RecyclerView.k> c;
    private boolean d;

    public static /* synthetic */ void a(NestedRecyclerView nestedRecyclerView) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nestedRecyclerView, changeQuickRedirect, false, "da2565f0652567578595e2d4ed8d5d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, nestedRecyclerView, changeQuickRedirect, false, "da2565f0652567578595e2d4ed8d5d3d");
        } else if (!nestedRecyclerView.c.isEmpty()) {
            for (RecyclerView.k kVar : nestedRecyclerView.c) {
                kVar.onScrollStateChanged(nestedRecyclerView, 0);
            }
            nestedRecyclerView.c.clear();
        }
    }

    public NestedRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6fadb69de7954053751f87d911d6784", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6fadb69de7954053751f87d911d6784");
            return;
        }
        this.b = new c(this);
        this.d = true;
        this.c = new HashSet();
    }

    public NestedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9992fd078555591e2bc0fd3e9e22b94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9992fd078555591e2bc0fd3e9e22b94");
            return;
        }
        this.b = new c(this);
        this.d = true;
        this.c = new HashSet();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4faf3180e06efdfe0b7ebacb031cb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4faf3180e06efdfe0b7ebacb031cb3");
            return;
        }
        this.b.a();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e24282a69792dfc20c4249811101aeb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e24282a69792dfc20c4249811101aeb6");
            return;
        }
        this.b.a();
        super.onStartTemporaryDetach();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828d06c9fc4181266bfa396c0e5bfdcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828d06c9fc4181266bfa396c0e5bfdcf")).booleanValue();
        }
        try {
            c cVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c3f20db72e77b1057113a796f4a54807", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c3f20db72e77b1057113a796f4a54807")).booleanValue();
            } else {
                z = cVar.d != null && cVar.d.a();
            }
            if (z) {
                return true;
            }
            this.b.a();
            return super.onInterceptTouchEvent(motionEvent);
        } finally {
            this.b.a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View, android.support.v4.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdd69b6bdf446927bd0c6d0042babfb7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdd69b6bdf446927bd0c6d0042babfb7")).booleanValue();
        }
        b(this, 0, (int) f, 0, (int) f2, new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.NestedRecyclerView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
            public final void a(View view, final int i, final int i2, int i3, int i4) {
                Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "114f57229778d6ded10c47398da47d43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "114f57229778d6ded10c47398da47d43");
                    return;
                }
                final c cVar = NestedRecyclerView.this.b;
                final com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar2 = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.NestedRecyclerView.1.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                    public final void a(View view2, int i5, int i6, int i7, int i8) {
                        Object[] objArr3 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "814490fc3c2751bd0e76f22734c90b30", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "814490fc3c2751bd0e76f22734c90b30");
                            return;
                        }
                        NestedRecyclerView.this.a(view2, i5, i6, i7, i8);
                        NestedRecyclerView.a(NestedRecyclerView.this);
                    }
                };
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar2};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "fff32279b4e45ee385e896010fd3c785", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "fff32279b4e45ee385e896010fd3c785");
                    return;
                }
                final View view2 = cVar.b;
                Object[] objArr4 = {view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar2};
                ChangeQuickRedirect changeQuickRedirect4 = c.a;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "1406a13faa2e2e16c23532f6170b92bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "1406a13faa2e2e16c23532f6170b92bd");
                    return;
                }
                a aVar = cVar.d;
                Context context = cVar.c;
                a.d dVar = new a.d(view2) { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.c.1
                    public static ChangeQuickRedirect c;

                    @Override // com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.a.b
                    public final void a(@NonNull a aVar2, int i5, int i6) {
                        Object[] objArr5 = {aVar2, Integer.valueOf(i5), Integer.valueOf(i6)};
                        ChangeQuickRedirect changeQuickRedirect5 = c;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "83d5a3cc4752a5c7153ab3ec734d75da", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "83d5a3cc4752a5c7153ab3ec734d75da");
                        } else {
                            cVar2.a(view2, i, i2, i5, i6);
                        }
                    }
                };
                Object[] objArr5 = {context, dVar, Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect5 = a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "a61bb80674b8ea14251d113ecb3ada37", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "a61bb80674b8ea14251d113ecb3ada37")).booleanValue();
                } else if (context != null) {
                    if (i3 == 0 && i4 == 0) {
                        return;
                    }
                    aVar.cancel();
                    com.sankuai.waimai.foundation.utils.log.a.b("Flinger", "fling start: remainedPixels = %d, v = %d, scroller = %s", Integer.valueOf(i3), Integer.valueOf(i4), dVar);
                    aVar.b = new a.RunnableC0844a(context, aVar, dVar, i3, i4);
                }
            }
        });
        return true;
    }

    private void b(View view, int i, int i2, int i3, int i4, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f1b372f0907237ba2dee9de26b13887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f1b372f0907237ba2dee9de26b13887");
        } else {
            this.b.a(view, i, i2, i3, i4, cVar);
        }
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fceb04d4a1f3f1654d32354896dc649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fceb04d4a1f3f1654d32354896dc649");
        } else {
            this.b.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d952ebab0df270d36a14a37c95693bbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d952ebab0df270d36a14a37c95693bbc");
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "779e3b1e70f09b95601fff9a7fa30eae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "779e3b1e70f09b95601fff9a7fa30eae");
        } else {
            a(view, i, i2, i3, i4);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e3e4d707236e78b856369d4973157b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e3e4d707236e78b856369d4973157b")).booleanValue();
        }
        this.d = false;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        this.d = true;
        return onTouchEvent;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addOnScrollListener(final RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17cc6210650899b1258cc8e72011dd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17cc6210650899b1258cc8e72011dd3f");
        } else {
            super.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.machpro.list.NestedRecyclerView.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "544d8778153b2f11e59935e7819bac59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "544d8778153b2f11e59935e7819bac59");
                    } else if (!NestedRecyclerView.this.d && i == 0) {
                        NestedRecyclerView.this.c.add(kVar);
                    } else {
                        kVar.onScrollStateChanged(recyclerView, i);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3631c288a30c043c745a0f44be893bfc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3631c288a30c043c745a0f44be893bfc");
                    } else {
                        kVar.onScrolled(recyclerView, i, i2);
                    }
                }
            });
        }
    }
}
