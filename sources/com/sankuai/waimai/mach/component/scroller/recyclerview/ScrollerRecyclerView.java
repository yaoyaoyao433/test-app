package com.sankuai.waimai.mach.component.scroller.recyclerview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ScrollerRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private c b;
    private RecyclerView.f c;
    private boolean d;

    public ScrollerRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a64ac8cf6a51b891de9267431687a50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a64ac8cf6a51b891de9267431687a50");
        }
    }

    private ScrollerRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab9911127f3f850c1de7a36ccec62d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab9911127f3f850c1de7a36ccec62d0");
        }
    }

    public ScrollerRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033a450831cd04e79f0e4584b6e0a9b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033a450831cd04e79f0e4584b6e0a9b4");
        } else {
            this.b = new c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82239d703426a27779dfbe2bdff707a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82239d703426a27779dfbe2bdff707a7")).booleanValue();
        }
        if (motionEvent.getAction() == 0 && this.d) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setParentHasSwiper(boolean z) {
        this.d = z;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a294982e59ecdc8d1aa5c017d1c2ae10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a294982e59ecdc8d1aa5c017d1c2ae10");
        } else if (z) {
            if (((LinearLayoutManager) getLayoutManager()).getOrientation() == 0) {
                setHorizontalScrollBarEnabled(true);
            } else {
                setVerticalScrollBarEnabled(true);
            }
            setScrollBarStyle(33554432);
            try {
                Method declaredMethod = View.class.getDeclaredMethod("initializeScrollbars", TypedArray.class);
                try {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this, null);
                } catch (IllegalAccessException e) {
                    com.sankuai.waimai.mach.log.b.b("ScrollerRecyclerView", "illegalAccessException:" + e.getMessage(), new Object[0]);
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    com.sankuai.waimai.mach.log.b.b("ScrollerRecyclerView", "InvocationTargetException:" + e2.getMessage(), new Object[0]);
                    e2.printStackTrace();
                }
            } catch (NoSuchMethodException e3) {
                com.sankuai.waimai.mach.log.b.b("ScrollerRecyclerView", "NoSuchMethodException:" + e3.getMessage(), new Object[0]);
                e3.printStackTrace();
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addItemDecoration(RecyclerView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0219ab18807c5b1fc9497a0ea4a55736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0219ab18807c5b1fc9497a0ea4a55736");
            return;
        }
        if (this.c != null) {
            super.removeItemDecoration(this.c);
        }
        super.addItemDecoration(fVar);
        this.c = fVar;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6783a2aedf324277de1f9dbc6a3da7a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6783a2aedf324277de1f9dbc6a3da7a8");
            return;
        }
        super.setLayoutManager(layoutManager);
        if (this.b != null) {
            this.b.a(this);
        }
    }
}
