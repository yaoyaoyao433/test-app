package com.sankuai.waimai.store.mach.kingkongscroller;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ad;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class KingKongScrollerContainer extends MachBaseViewContainer {
    public static ChangeQuickRedirect a;
    KingKongScrollerRecyclerView b;
    KingKongScrollerLayoutManager c;
    b d;
    com.sankuai.waimai.mach.parser.d e;
    com.sankuai.waimai.mach.parser.d f;
    com.sankuai.waimai.mach.parser.d g;
    String h;
    private KingKongScrollBarView l;
    private int m;
    private List<Integer> n;

    public KingKongScrollerContainer(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d1c4c28a9630fc34754672ab2000986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d1c4c28a9630fc34754672ab2000986");
        }
    }

    private KingKongScrollerContainer(Context context, AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480e06ebe5a09e94d95a6214da62c301", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480e06ebe5a09e94d95a6214da62c301");
        }
    }

    public KingKongScrollerContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff350e1adb4bef130981430e0fbfa11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff350e1adb4bef130981430e0fbfa11");
            return;
        }
        this.m = -1;
        this.n = new ArrayList();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eedae3ccda3cd7c168a953f615b7997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eedae3ccda3cd7c168a953f615b7997");
            return;
        }
        this.b = new KingKongScrollerRecyclerView(getContext());
        this.b.setNestedScrollingEnabled(false);
        this.b.setClipToPadding(false);
        this.b.setClipChildren(false);
        addView(this.b);
    }

    public int getCurrIndex() {
        return this.m;
    }

    public List<Integer> getDisplayList() {
        return this.n;
    }

    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ba743703e70c7567862bd489d6a040", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ba743703e70c7567862bd489d6a040")).intValue();
        }
        if (this.d != null) {
            return this.d.getItemCount();
        }
        return 0;
    }

    public void setKingKongScrollBar(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6610c8416f6e8fd8a418eb8fc8d9a192", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6610c8416f6e8fd8a418eb8fc8d9a192");
            return;
        }
        boolean z = dVar.h;
        final float a2 = h.a(getContext(), dVar.i);
        if (z && a2 > 0.0f && this.l == null) {
            this.l = new KingKongScrollBarView(getContext());
            final int a3 = h.a(getContext(), dVar.n);
            final int a4 = h.a(getContext(), dVar.o);
            int a5 = h.a(getContext(), dVar.k);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a5, h.a(getContext(), dVar.l) + h.a(getContext(), 2.0f));
            layoutParams.bottomMargin = h.a(getContext(), dVar.m);
            layoutParams.gravity = 81;
            this.l.setLayoutParams(layoutParams);
            final int a6 = h.a(getContext());
            KingKongScrollBarView kingKongScrollBarView = this.l;
            int i = a5 / 2;
            int i2 = dVar.j;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = KingKongScrollBarView.a;
            if (PatchProxy.isSupport(objArr2, kingKongScrollBarView, changeQuickRedirect2, false, "0a13c8dd94c57f825602cf5bd1a870bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kingKongScrollBarView, changeQuickRedirect2, false, "0a13c8dd94c57f825602cf5bd1a870bc");
            } else {
                kingKongScrollBarView.b = i;
                kingKongScrollBarView.d = i2;
                kingKongScrollBarView.invalidate();
            }
            addView(this.l, layoutParams);
            this.b.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerContainer.3
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    int findFirstVisibleItemPosition;
                    View findViewByPosition;
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90ebdf9522ce0789e33b67f0eb7687a1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90ebdf9522ce0789e33b67f0eb7687a1");
                        return;
                    }
                    super.onScrolled(recyclerView, i3, i4);
                    LinearLayoutManager h = q.h(recyclerView);
                    if (h == null || (findViewByPosition = h.findViewByPosition((findFirstVisibleItemPosition = h.findFirstVisibleItemPosition()))) == null) {
                        return;
                    }
                    int i5 = (-findViewByPosition.getLeft()) + a3;
                    if (findFirstVisibleItemPosition > 0) {
                        int i6 = a6 - (a3 + a4);
                        i5 = (i6 - findViewByPosition.getLeft()) + (findFirstVisibleItemPosition > 1 ? (findFirstVisibleItemPosition - 1) * (i6 / 5) : 0);
                    }
                    float min = Math.min(1.0f, (i5 * 1.0f) / (a2 - a6));
                    KingKongScrollBarView kingKongScrollBarView2 = KingKongScrollerContainer.this.l;
                    Object[] objArr4 = {Float.valueOf(min)};
                    ChangeQuickRedirect changeQuickRedirect4 = KingKongScrollBarView.a;
                    if (PatchProxy.isSupport(objArr4, kingKongScrollBarView2, changeQuickRedirect4, false, "3e4fefb7fec35bcbf541ab19887dd7eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, kingKongScrollBarView2, changeQuickRedirect4, false, "3e4fefb7fec35bcbf541ab19887dd7eb");
                        return;
                    }
                    kingKongScrollBarView2.c = (int) (min * (kingKongScrollBarView2.getWidth() - kingKongScrollBarView2.b));
                    int i7 = kingKongScrollBarView2.c;
                    Object[] objArr5 = {Integer.valueOf(i7)};
                    ChangeQuickRedirect changeQuickRedirect5 = KingKongScrollBarView.a;
                    if (PatchProxy.isSupport(objArr5, kingKongScrollBarView2, changeQuickRedirect5, false, "f5d9c739976590740bf8e93842500258", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, kingKongScrollBarView2, changeQuickRedirect5, false, "f5d9c739976590740bf8e93842500258");
                        return;
                    }
                    kingKongScrollBarView2.c = i7;
                    kingKongScrollBarView2.invalidate();
                }
            });
            if (dVar.s && ab.b().b(this.b.getContext(), "SHOW_USER_SCROLL", true)) {
                final ad adVar = new ad(this.b.getContext()) { // from class: com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerContainer.4
                    @Override // android.support.v7.widget.ad
                    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                        return 900.0f / displayMetrics.densityDpi;
                    }
                };
                this.b.smoothScrollBy(TbsListener.ErrorCode.ROM_NOT_ENOUGH, 0);
                ab.b().a(this.b.getContext(), "SHOW_USER_SCROLL", false);
                al.a(new Runnable() { // from class: com.sankuai.waimai.store.mach.kingkongscroller.KingKongScrollerContainer.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2d55d994c1be840dcfa11ce7ec32af4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2d55d994c1be840dcfa11ce7ec32af4");
                            return;
                        }
                        adVar.setTargetPosition(0);
                        KingKongScrollerContainer.this.b.getLayoutManager().startSmoothScroll(adVar);
                    }
                }, 2500, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(com.sankuai.waimai.mach.node.a aVar) {
        while (true) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db7869602878a1bb08adef8bb00e61b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db7869602878a1bb08adef8bb00e61b")).booleanValue();
            }
            if (aVar == null) {
                return false;
            }
            if (aVar.e != null && (aVar.e.h instanceof com.sankuai.waimai.mach.component.swiper.b)) {
                return true;
            }
            aVar = aVar.e;
        }
    }
}
