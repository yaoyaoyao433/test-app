package com.meituan.passport.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.RestrictTo;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.ExploreByTouchHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.meituan.passport.utils.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class QuickAlphabeticBar extends View {
    public static ChangeQuickRedirect a;
    private b b;
    private String[] c;
    private boolean d;
    private float e;
    private float f;
    private int g;
    private final List<a> h;
    private Paint i;
    private Paint j;
    private int k;
    private c l;
    private boolean m;
    private int n;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
    }

    public static /* synthetic */ int a(QuickAlphabeticBar quickAlphabeticBar, float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, quickAlphabeticBar, changeQuickRedirect, false, "56ccd3b177adc3294f37cc81c8881d1c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, quickAlphabeticBar, changeQuickRedirect, false, "56ccd3b177adc3294f37cc81c8881d1c")).intValue() : (int) ((f2 / quickAlphabeticBar.getHeight()) * quickAlphabeticBar.c.length);
    }

    public static /* synthetic */ boolean b(QuickAlphabeticBar quickAlphabeticBar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, quickAlphabeticBar, changeQuickRedirect, false, "fdcb5378ce3db9ff76b1d554b3bf25f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, quickAlphabeticBar, changeQuickRedirect, false, "fdcb5378ce3db9ff76b1d554b3bf25f5")).booleanValue();
        }
        if (quickAlphabeticBar.a(i) == null) {
            return false;
        }
        if (quickAlphabeticBar.l != null) {
            quickAlphabeticBar.l.invalidateVirtualView(i);
            quickAlphabeticBar.l.sendEventForVirtualView(i, 1);
        }
        return true;
    }

    public QuickAlphabeticBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62584ebc8c8d29f700e625598055d549", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62584ebc8c8d29f700e625598055d549");
            return;
        }
        this.d = true;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 26;
        this.h = new ArrayList();
        this.k = 7;
        a();
    }

    public QuickAlphabeticBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e909a8ea8912e15d9930c45742041e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e909a8ea8912e15d9930c45742041e2");
            return;
        }
        this.d = true;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 26;
        this.h = new ArrayList();
        this.k = 7;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b482681b9afd9fcd7a0f9706e103f05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b482681b9afd9fcd7a0f9706e103f05f");
            return;
        }
        this.i = new Paint();
        this.i.setColor(Color.rgb(119, 119, 119));
        this.i.setAntiAlias(true);
        this.m = Utils.c();
        if (this.m) {
            this.j = new Paint();
            this.j.setColor(-1);
            this.j.setStyle(Paint.Style.STROKE);
            this.l = new c(this);
            ViewCompat.setAccessibilityDelegate(this, this.l);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feac0ed86d6b8689de39fb1488353018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feac0ed86d6b8689de39fb1488353018");
            return;
        }
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        float length = this.c.length > 0 ? (this.n - (this.f * this.c.length)) / this.c.length : 0.0f;
        int width = getWidth();
        int i = this.k;
        int i2 = ((int) this.f) + this.k;
        int i3 = width;
        int i4 = i;
        int i5 = 0;
        while (i5 < this.c.length) {
            int i6 = i5 + 1;
            canvas.drawText(this.c[i5], (width / 2.0f) - (this.i.measureText(this.c[i5]) / 2.0f), ((this.f * i6) + (i5 * length)) - (this.f * 0.1f), this.i);
            if (this.m) {
                canvas.drawRect(new Rect(0, i4, i3, i2), this.j);
                i4 += (int) this.f;
                i3 += (int) this.f;
            }
            i5 = i6;
        }
        if (this.m) {
            canvas.drawRect(new Rect(0, i4, i3, i2), this.j);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b553f39231568c7ae7f58e3bb24dd92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b553f39231568c7ae7f58e3bb24dd92");
            return;
        }
        super.onMeasure(i, i2);
        if (this.c == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        this.n = getMeasuredHeight();
        if (this.f <= 0.0f) {
            this.f = this.n / this.g;
        }
        if (this.e <= 0.0f) {
            this.e = this.f * 0.8f;
        }
        this.i.setTextSize(this.e);
        for (int i3 = 0; i3 < this.c.length; i3++) {
            int measureText = (int) this.i.measureText(this.c[i3]);
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
        }
        setMeasuredDimension(measuredWidth, this.n);
    }

    @Override // android.view.View
    @TargetApi(14)
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943031beb5e07e032ee713a076adc241", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943031beb5e07e032ee713a076adc241")).booleanValue();
        }
        if (this.l != null && this.m && this.l.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d35671d956c84e55f8a6c2fd308447d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d35671d956c84e55f8a6c2fd308447d")).booleanValue();
        }
        if (this.c == null) {
            return true;
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        b bVar = this.b;
        int height = (int) ((y / getHeight()) * this.c.length);
        switch (action) {
            case 0:
                if (bVar != null && this.d && height >= 0) {
                    int length = this.c.length;
                    break;
                }
                break;
            case 1:
                performClick();
                break;
            case 2:
                if (bVar != null && this.d && height >= 0) {
                    int length2 = this.c.length;
                    break;
                }
                break;
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b56af8e9e785765efb5ba05ee8c3276a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b56af8e9e785765efb5ba05ee8c3276a")).booleanValue();
        }
        super.performClick();
        return true;
    }

    public final void setAlphas(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c853e19888821204e9a35cde8dfc6b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c853e19888821204e9a35cde8dfc6b6");
        } else if (strArr != null) {
            this.c = (String[]) Arrays.copyOf(strArr, strArr.length);
            if (this.m) {
                for (String str : this.c) {
                    this.h.add(new a(str));
                }
            }
            invalidate();
            requestLayout();
        }
    }

    public final void setOnTouchingLetterChangedListener(b bVar) {
        this.b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c extends ExploreByTouchHelper {
        public static ChangeQuickRedirect a;

        public c(View view) {
            super(view);
            Object[] objArr = {QuickAlphabeticBar.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a346516b749e60646a2a26a23fd62188", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a346516b749e60646a2a26a23fd62188");
            }
        }

        @Override // android.support.v4.widget.ExploreByTouchHelper
        public final int getVirtualViewAt(float f, float f2) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09faea526ec071e50e940dcd0986fe4b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09faea526ec071e50e940dcd0986fe4b")).intValue();
            }
            int a2 = QuickAlphabeticBar.a(QuickAlphabeticBar.this, f, f2);
            if (a2 == -1) {
                return Integer.MIN_VALUE;
            }
            return a2;
        }

        @Override // android.support.v4.widget.ExploreByTouchHelper
        public final void getVisibleVirtualViews(List<Integer> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66ae1a55b68b65aa98bd3ec4d9553155", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66ae1a55b68b65aa98bd3ec4d9553155");
            } else if (QuickAlphabeticBar.this.c != null) {
                int length = QuickAlphabeticBar.this.c.length;
                for (int i = 0; i < length; i++) {
                    list.add(Integer.valueOf(i));
                }
            }
        }

        @Override // android.support.v4.widget.ExploreByTouchHelper
        public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
            Object[] objArr = {Integer.valueOf(i), accessibilityEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00ad9d98a0960fc7e0a922b11bba6301", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00ad9d98a0960fc7e0a922b11bba6301");
            } else if (accessibilityEvent == null) {
            } else {
                a a2 = QuickAlphabeticBar.this.a(i);
                if (a2 == null) {
                    throw new IllegalArgumentException("Invalid virtual view id");
                }
                accessibilityEvent.getText().add(a2.b);
                if (accessibilityEvent.getEventType() != 1 || QuickAlphabeticBar.this.b == null) {
                    return;
                }
                b unused = QuickAlphabeticBar.this.b;
            }
        }

        @Override // android.support.v4.widget.ExploreByTouchHelper
        public final void onPopulateNodeForVirtualView(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Object[] objArr = {Integer.valueOf(i), accessibilityNodeInfoCompat};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1338e5926ca5382ff6f95ed1120cdbfc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1338e5926ca5382ff6f95ed1120cdbfc");
            } else if (accessibilityNodeInfoCompat == null) {
            } else {
                a a2 = QuickAlphabeticBar.this.a(i);
                if (a2 == null) {
                    throw new IllegalArgumentException("Invalid virtual view id");
                }
                accessibilityNodeInfoCompat.setText(a2.b);
                accessibilityNodeInfoCompat.setBoundsInParent(new Rect(0, QuickAlphabeticBar.this.k + (((int) QuickAlphabeticBar.this.f) * i), QuickAlphabeticBar.this.getWidth(), QuickAlphabeticBar.this.k + (((int) QuickAlphabeticBar.this.f) * (i + 1))));
                accessibilityNodeInfoCompat.addAction(16);
                accessibilityNodeInfoCompat.setClickable(true);
            }
        }

        @Override // android.support.v4.widget.ExploreByTouchHelper
        public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0024aa5b4eb5f791da27efa1f13512eb", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0024aa5b4eb5f791da27efa1f13512eb")).booleanValue();
            }
            if (i2 != 16) {
                return false;
            }
            return QuickAlphabeticBar.b(QuickAlphabeticBar.this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8263933efb53e2484f54c13f4e8bbb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8263933efb53e2484f54c13f4e8bbb0");
        }
        if (i < 0 || i >= this.h.size()) {
            return null;
        }
        return this.h.get(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        String b;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e2e1efb71c43a0527e35c44b07eccd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e2e1efb71c43a0527e35c44b07eccd");
            } else {
                this.b = str;
            }
        }
    }
}
