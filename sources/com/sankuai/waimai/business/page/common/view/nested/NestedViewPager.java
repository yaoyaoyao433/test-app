package com.sankuai.waimai.business.page.common.view.nested;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedViewPager extends ViewPager implements c {
    public static ChangeQuickRedirect a;
    private int b;
    private boolean c;

    public NestedViewPager(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c913d314a3b622c887ea19b2b4f3e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c913d314a3b622c887ea19b2b4f3e4");
            return;
        }
        this.b = 0;
        this.c = true;
    }

    public NestedViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e09e1e7c0029091f16c7713a86d84e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e09e1e7c0029091f16c7713a86d84e");
            return;
        }
        this.b = 0;
        this.c = true;
    }

    @Override // android.support.v4.view.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d91e0e7098eb70858879537a2e1a21", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d91e0e7098eb70858879537a2e1a21")).booleanValue() : this.c && super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v4.view.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9c78c265b7e2a55b7608bcf8946622", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9c78c265b7e2a55b7608bcf8946622")).booleanValue() : this.c && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.c
    public boolean a() {
        int count;
        Fragment item;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e07b28112fe1dfa44f96a9ca64ca770", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e07b28112fe1dfa44f96a9ca64ca770")).booleanValue();
        }
        int currentItem = getCurrentItem();
        View view = null;
        if (getAdapter() instanceof FragmentStatePagerAdapter) {
            FragmentStatePagerAdapter fragmentStatePagerAdapter = (FragmentStatePagerAdapter) getAdapter();
            if (fragmentStatePagerAdapter == null || (count = fragmentStatePagerAdapter.getCount()) == 0 || count < currentItem || currentItem < 0 || (item = fragmentStatePagerAdapter.getItem(currentItem)) == null) {
                return false;
            }
            view = item.getView();
        } else if (getAdapter() instanceof e) {
            com.sankuai.waimai.business.page.common.arch.a a2 = ((e) getAdapter()).a(currentItem);
            if (a2 == null) {
                return false;
            }
            view = a2.i();
        }
        if (view == null) {
            return false;
        }
        if (view instanceof ViewGroup) {
            RecyclerView a3 = a((ViewGroup) view);
            return a3 != null && a3.getVisibility() == 0;
        }
        return true;
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.c
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8ffbb22fcafda9945a893229082128a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8ffbb22fcafda9945a893229082128a")).intValue() : getTop() + this.b;
    }

    public void setEventPointExcludeHeight(int i) {
        this.b = i;
    }

    private RecyclerView a(ViewGroup viewGroup) {
        RecyclerView a2;
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20a4feff468c424f82346c856d19002", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20a4feff468c424f82346c856d19002");
        }
        if (viewGroup instanceof RecyclerView) {
            return (RecyclerView) viewGroup;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (a2 = a((ViewGroup) childAt)) != null) {
                return a2;
            }
        }
        return null;
    }

    public void setCanScrollHorizontal(boolean z) {
        this.c = z;
    }
}
