package com.sankuai.waimai.machpro.component.list;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPRecycleView extends RecyclerView implements com.sankuai.waimai.machpro.view.a {
    public static ChangeQuickRedirect a;
    private int b;
    private com.sankuai.waimai.machpro.component.scroll.c c;
    private int d;
    private boolean e;

    public MPRecycleView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d065133985657a9bb8604fce55056c02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d065133985657a9bb8604fce55056c02");
        } else {
            this.b = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b14f62f1839887b7f8053f023763edd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b14f62f1839887b7f8053f023763edd")).booleanValue();
        }
        if (this.b == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "27f29b999de6e8b98f78c4a2d278baeb", RobustBitConfig.DEFAULT_VALUE)) {
                ViewParent parent = getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent instanceof com.sankuai.waimai.machpro.component.scroll.c) {
                        this.c = (com.sankuai.waimai.machpro.component.scroll.c) parent;
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "27f29b999de6e8b98f78c4a2d278baeb")).booleanValue();
            }
            this.b = z ? 1 : 2;
        }
        if (this.b == 1 && this.c != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.e = false;
                this.c.a(true);
                this.d = (int) motionEvent.getY();
                if (((LinearLayoutManager) getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                    this.e = true;
                }
            } else if (actionMasked == 2) {
                if (motionEvent.getY() > this.d && this.e) {
                    this.c.a(false);
                } else if (((LinearLayoutManager) getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0 && motionEvent.getY() > this.d && !this.e) {
                    this.c.a(false);
                    this.c.b = true;
                    motionEvent.setAction(3);
                }
                this.d = (int) motionEvent.getY();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
