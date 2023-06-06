package com.meituan.android.pay.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PinnedHeaderListView extends ListView {
    public static ChangeQuickRedirect a;
    private View b;
    private int c;
    private float d;
    private boolean e;
    private int f;
    private int g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        int a(int i);

        View a(int i, View view, ViewGroup viewGroup);

        int getCount();
    }

    public PinnedHeaderListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eff55d385e42c958129976d971d2679", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eff55d385e42c958129976d971d2679");
            return;
        }
        this.c = 0;
        this.e = true;
        this.f = 0;
    }

    public PinnedHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7551cccfef2859d4194f994edf5b03a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7551cccfef2859d4194f994edf5b03a0");
            return;
        }
        this.c = 0;
        this.e = true;
        this.f = 0;
    }

    public PinnedHeaderListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee55fb659fb8b3a6fb635b46b3bb22db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee55fb659fb8b3a6fb635b46b3bb22db");
            return;
        }
        this.c = 0;
        this.e = true;
        this.f = 0;
    }

    public void setPinHeaders(boolean z) {
        this.e = z;
    }

    private void a(View view) {
        int makeMeasureSpec;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c688872b861b44273bc57dd2da14ce4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c688872b861b44273bc57dd2da14ce4c");
        } else if (view != null && view.isLayoutRequested()) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), this.g);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(makeMeasureSpec2, makeMeasureSpec);
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3184452a3138f267f18a579092a4d0df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3184452a3138f267f18a579092a4d0df");
            return;
        }
        super.dispatchDraw(canvas);
        if (!this.e || this.b == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(0.0f, this.d);
        canvas.clipRect(0, 0, getWidth(), this.b.getMeasuredHeight());
        this.b.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97535ef70dfaddf1366db3cd34697a8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97535ef70dfaddf1366db3cd34697a8a");
            return;
        }
        super.onMeasure(i, i2);
        this.g = View.MeasureSpec.getMode(i);
    }

    public final void a(AbsListView absListView, a aVar, int i, int i2, int i3) {
        View a2;
        Object[] objArr = {absListView, aVar, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ead93f8be8ea32e8590c39ccb62d02db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ead93f8be8ea32e8590c39ccb62d02db");
            return;
        }
        if (aVar != null && aVar.getCount() != 0 && this.e) {
            ListView listView = (ListView) absListView;
            if (i >= listView.getHeaderViewsCount()) {
                int a3 = aVar.a(i - listView.getHeaderViewsCount());
                if (a3 >= 0) {
                    View view = this.c == 0 ? this.b : null;
                    Object[] objArr2 = {Integer.valueOf(a3), view, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd513d4884670420cb922f344e54b814", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd513d4884670420cb922f344e54b814");
                    } else {
                        boolean z = a3 != this.f || view == null;
                        a2 = aVar.a(a3, view, this);
                        if (z) {
                            a(a2);
                            this.f = a3;
                        }
                    }
                    this.b = a2;
                    a(this.b);
                    this.c = 0;
                } else {
                    this.b = null;
                }
                this.d = 0.0f;
                invalidate();
                return;
            }
        }
        this.b = null;
        this.d = 0.0f;
        for (int i4 = i; i4 < i + i2; i4++) {
            View childAt = absListView.getChildAt(i4);
            if (childAt != null) {
                childAt.setVisibility(0);
            }
        }
        invalidate();
    }
}
