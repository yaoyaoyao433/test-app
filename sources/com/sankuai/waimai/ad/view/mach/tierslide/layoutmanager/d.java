package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ar;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends ar implements View.OnTouchListener {
    public static ChangeQuickRedirect b;
    public i c;
    public h d;
    public boolean e;
    private int f;
    private int g;
    private boolean h;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38c8c19975102bc9b697c6445c3025c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38c8c19975102bc9b697c6445c3025c");
            return;
        }
        this.h = false;
        this.e = true;
    }

    @Override // android.support.v7.widget.ar
    public final void a(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        Object[] objArr = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e728757b217d878bc5b918f40ee1b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e728757b217d878bc5b918f40ee1b3");
            return;
        }
        super.a(recyclerView);
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(this);
        }
    }

    @Override // android.support.v7.widget.ar
    public final int[] a(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        Object[] objArr = {layoutManager, view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff725dbe8f30bf1c93ea2c005ba01df", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff725dbe8f30bf1c93ea2c005ba01df");
        }
        int i = this.f;
        int i2 = this.g;
        this.f = 0;
        this.g = 0;
        if (layoutManager instanceof CardLayoutManager) {
            CardLayoutManager cardLayoutManager = (CardLayoutManager) layoutManager;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = CardLayoutManager.a;
            if (PatchProxy.isSupport(objArr2, cardLayoutManager, changeQuickRedirect2, false, "33886ea7655f7689ddb56dfe188db938", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cardLayoutManager, changeQuickRedirect2, false, "33886ea7655f7689ddb56dfe188db938");
            } else {
                int i3 = cardLayoutManager.c;
                if (cardLayoutManager.findViewByPosition(i3) != null) {
                    c cVar = new c(cardLayoutManager.g, cardLayoutManager);
                    Object[] objArr3 = {Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), cardLayoutManager};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "b3e1fc8d4c121e126477bfc72b600ed7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "b3e1fc8d4c121e126477bfc72b600ed7");
                    } else {
                        cVar.setTargetPosition(i3);
                        cVar.b = i;
                        cVar.c = i2;
                        cVar.d = -1;
                        cVar.e = cardLayoutManager;
                    }
                    cardLayoutManager.startSmoothScroll(cVar);
                }
            }
        }
        return new int[2];
    }

    @Override // android.support.v7.widget.ar
    public final int a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        Object[] objArr = {layoutManager, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a234d61f5761f7c10055133f19b3810f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a234d61f5761f7c10055133f19b3810f")).intValue();
        }
        if (layoutManager instanceof CardLayoutManager) {
            this.f = i;
            this.g = i2;
            return ((CardLayoutManager) layoutManager).c;
        }
        return -1;
    }

    @Override // android.support.v7.widget.ar
    public final View a(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08df3d58ed428d43347b64c0ea993246", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08df3d58ed428d43347b64c0ea993246");
        }
        if (layoutManager instanceof CardLayoutManager) {
            CardLayoutManager cardLayoutManager = (CardLayoutManager) layoutManager;
            View findViewByPosition = cardLayoutManager.findViewByPosition(cardLayoutManager.c);
            if (findViewByPosition != null) {
                int translationX = (int) findViewByPosition.getTranslationX();
                int translationY = (int) findViewByPosition.getTranslationY();
                int width = layoutManager.getWidth();
                int height = layoutManager.getHeight();
                if (translationX > width || translationY > height || (translationX == 0 && translationY == 0)) {
                    return null;
                }
                return findViewByPosition;
            }
        }
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d4a80bf471df4d5a0289fe4e379dd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d4a80bf471df4d5a0289fe4e379dd6")).booleanValue();
        }
        if ((motionEvent.getAction() == 0 || !this.h) && this.e) {
            this.h = true;
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() instanceof CardLayoutManager) {
                CardLayoutManager cardLayoutManager = (CardLayoutManager) recyclerView.getLayoutManager();
                cardLayoutManager.a(view, (int) motionEvent.getX(), (int) motionEvent.getY());
                cardLayoutManager.d = -1;
            }
            if (this.d != null) {
                this.d.c();
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h = false;
            if (this.d != null) {
                this.d.d();
            }
            if (this.c != null) {
                this.c.d();
            }
        }
        return false;
    }
}
