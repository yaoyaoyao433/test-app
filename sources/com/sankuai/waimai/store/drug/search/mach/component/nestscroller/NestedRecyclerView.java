package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NestedRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.mach.component.scroller.recyclerview.c b;
    private RecyclerView.f c;
    private int d;
    private int e;
    private int f;

    public NestedRecyclerView(Context context) {
        super(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b20e50ecb7c7020719660bf93a9439b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b20e50ecb7c7020719660bf93a9439b");
        }
    }

    public NestedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ddc665ead4ded89d9fbb555606ca153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ddc665ead4ded89d9fbb555606ca153");
            return;
        }
        this.b = new com.sankuai.waimai.mach.component.scroller.recyclerview.c();
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b3bd1b6e13a75b516706201e5506a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b3bd1b6e13a75b516706201e5506a11");
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
                    com.sankuai.shangou.stone.util.log.a.a("NestedScrollerRecyclerView", "illegalAccessException:" + e.getMessage(), new Object[0]);
                } catch (InvocationTargetException e2) {
                    com.sankuai.shangou.stone.util.log.a.a("NestedScrollerRecyclerView", "InvocationTargetException:" + e2.getMessage(), new Object[0]);
                }
            } catch (NoSuchMethodException e3) {
                com.sankuai.shangou.stone.util.log.a.a("NestedScrollerRecyclerView", "NoSuchMethodException:" + e3.getMessage(), new Object[0]);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void addItemDecoration(RecyclerView.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cda90ec0552acc6db48f383f23b71401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cda90ec0552acc6db48f383f23b71401");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1710f73a7001adce5091f8ef5fad76ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1710f73a7001adce5091f8ef5fad76ce");
            return;
        }
        super.setLayoutManager(layoutManager);
        if (this.b != null) {
            this.b.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e921f37fe9c97eb44f7f7cf1ce76a665", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e921f37fe9c97eb44f7f7cf1ce76a665")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.d = (int) motionEvent.getX();
                this.e = (int) motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
                break;
            case 1:
            case 3:
                getParent().requestDisallowInterceptTouchEvent(false);
                break;
            case 2:
                int x = (int) motionEvent.getX();
                int abs = Math.abs(x - this.d);
                int abs2 = Math.abs(((int) motionEvent.getY()) - this.e);
                if (canScrollHorizontally(this.d - x) && abs > abs2) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    break;
                }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
