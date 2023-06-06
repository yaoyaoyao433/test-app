package com.sankuai.waimai.business.address.widget.stickyheaderlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.AbsListView;
import android.widget.HeaderViewListAdapter;
import com.dianping.widget.view.NovaListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends NovaListView {
    public static ChangeQuickRedirect c;
    List<View> d;
    private a e;
    private int f;
    private Rect g;
    private Field h;
    private boolean i;
    private boolean j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(Canvas canvas);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1468c092515a97637ede0d95da821e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1468c092515a97637ede0d95da821e");
            return;
        }
        this.g = new Rect();
        this.i = true;
        this.j = false;
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mSelectorRect");
            declaredField.setAccessible(true);
            this.g = (Rect) declaredField.get(this);
            if (Build.VERSION.SDK_INT >= 14) {
                this.h = AbsListView.class.getDeclaredField("mSelectorPosition");
                this.h.setAccessible(true);
            }
        } catch (IllegalAccessException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        } catch (IllegalArgumentException e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        } catch (NoSuchFieldException e3) {
            com.sankuai.waimai.foundation.utils.log.a.a(e3);
        }
    }

    @Override // com.dianping.widget.view.NovaListView, android.widget.AbsListView, android.widget.AdapterView
    public final boolean performItemClick(View view, int i, long j) {
        Object[] objArr = {view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caba33678be586e438d2f7670f6c6c95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caba33678be586e438d2f7670f6c6c95")).booleanValue();
        }
        if (view instanceof c) {
            view = ((c) view).b;
        }
        return super.performItemClick(view, i, j);
    }

    private int getSelectorPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27024ff175f939717dd3145b34d942cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27024ff175f939717dd3145b34d942cb")).intValue();
        }
        if (this.h == null) {
            for (int i = 0; i < getChildCount(); i++) {
                if (getChildAt(i).getBottom() == this.g.bottom) {
                    return i + getFixedFirstVisibleItem();
                }
            }
            return -1;
        }
        try {
            return this.h.getInt(this);
        } catch (IllegalAccessException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return -1;
        } catch (IllegalArgumentException e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
            return -1;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int selectorPosition;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709f6c393da36e12783f150dbcae18ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709f6c393da36e12783f150dbcae18ba");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a785643d911ae084897b33da6ad65098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a785643d911ae084897b33da6ad65098");
        } else if (!this.g.isEmpty() && (selectorPosition = getSelectorPosition()) >= 0) {
            View childAt = getChildAt(selectorPosition - getFixedFirstVisibleItem());
            if (childAt instanceof c) {
                c cVar = (c) childAt;
                this.g.top = cVar.getTop() + cVar.f;
            }
        }
        if (this.f != 0) {
            canvas.save();
            Rect clipBounds = canvas.getClipBounds();
            clipBounds.top = this.f;
            canvas.clipRect(clipBounds);
            super.dispatchDraw(canvas);
            canvas.restore();
        } else {
            super.dispatchDraw(canvas);
        }
        this.e.a(canvas);
    }

    public final void setLifeCycleListener(a aVar) {
        this.e = aVar;
    }

    @Override // android.widget.ListView
    public final void addFooterView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59607828e29e3f726715e3cc2e41212b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59607828e29e3f726715e3cc2e41212b");
            return;
        }
        super.addFooterView(view);
        a(view);
    }

    @Override // android.widget.ListView
    public final void addFooterView(View view, Object obj, boolean z) {
        Object[] objArr = {view, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4623d640b055fc3e45e70821c723c581", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4623d640b055fc3e45e70821c723c581");
            return;
        }
        super.addFooterView(view, obj, z);
        a(view);
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "278599f3783e2b4b099ce1f0b1bd72d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "278599f3783e2b4b099ce1f0b1bd72d6");
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(view);
    }

    @Override // android.widget.ListView
    public final boolean removeFooterView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcb0c64775137af0aa71bf4ae2d888b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcb0c64775137af0aa71bf4ae2d888b0")).booleanValue();
        }
        if ((getAdapter() instanceof HeaderViewListAdapter) && super.removeFooterView(view)) {
            this.d.remove(view);
            return true;
        }
        return false;
    }

    public final void setTopClippingLength(int i) {
        this.f = i;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public final int getFixedFirstVisibleItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dc5b7c63e521d62986e11590d7eddf6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dc5b7c63e521d62986e11590d7eddf6")).intValue();
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        if (Build.VERSION.SDK_INT >= 11) {
            return firstVisiblePosition;
        }
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            } else if (getChildAt(i).getBottom() >= 0) {
                firstVisiblePosition += i;
                break;
            } else {
                i++;
            }
        }
        return (this.i || getPaddingTop() <= 0 || firstVisiblePosition <= 0 || getChildAt(0).getTop() <= 0) ? firstVisiblePosition : firstVisiblePosition - 1;
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ba0d5e251bd2af14d728cd3fe902e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ba0d5e251bd2af14d728cd3fe902e0");
            return;
        }
        this.i = z;
        super.setClipToPadding(z);
    }

    public final void setBlockLayoutChildren(boolean z) {
        this.j = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public final void layoutChildren() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9cb02bd651b1b7ceff746d7f884de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9cb02bd651b1b7ceff746d7f884de4");
        } else if (this.j) {
        } else {
            super.layoutChildren();
        }
    }
}
