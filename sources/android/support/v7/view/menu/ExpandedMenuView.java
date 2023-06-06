package android.support.v7.view.menu;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements MenuBuilder.b, k, AdapterView.OnItemClickListener {
    private static final int[] a = {16842964, 16843049};
    private MenuBuilder b;
    private int c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        aw a2 = aw.a(context, attributeSet, a, i, 0);
        if (a2.f(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.f(1)) {
            setDivider(a2.a(1));
        }
        a2.a.recycle();
    }

    @Override // android.support.v7.view.menu.k
    public final void a(MenuBuilder menuBuilder) {
        this.b = menuBuilder;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.v7.view.menu.MenuBuilder.b
    public final boolean a(MenuItemImpl menuItemImpl) {
        return this.b.a(menuItemImpl, (j) null, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((MenuItemImpl) getAdapter().getItem(i));
    }

    public final int getWindowAnimations() {
        return this.c;
    }
}
