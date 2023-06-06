package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ObservableSmoothScrollView extends SmoothNestedScrollView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;
    private a d;
    private final Handler e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public static /* synthetic */ void a(ObservableSmoothScrollView observableSmoothScrollView, String str, Object[] objArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9535dc398a1576e625b8ce54e7d7d35f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9535dc398a1576e625b8ce54e7d7d35f");
            return;
        }
        this.e.removeMessages(1);
        this.e.sendEmptyMessageDelayed(1, 80L);
    }

    public ObservableSmoothScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68a6a31a28870910253bb36994c08225", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68a6a31a28870910253bb36994c08225");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.store.drug.newwidgets.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "079b5a9e9560ed082d08bd1b6728fed0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "079b5a9e9560ed082d08bd1b6728fed0")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableSmoothScrollView.this.getScrollY();
                    ObservableSmoothScrollView observableSmoothScrollView = ObservableSmoothScrollView.this;
                    ObservableSmoothScrollView.a(observableSmoothScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY, new Object[0]);
                    if (!ObservableSmoothScrollView.this.b && this.c == scrollY) {
                        this.c = Integer.MIN_VALUE;
                        ObservableSmoothScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollY;
                        ObservableSmoothScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public ObservableSmoothScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be147a41a99b67bd524ef3ff07af24a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be147a41a99b67bd524ef3ff07af24a1");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.store.drug.newwidgets.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "079b5a9e9560ed082d08bd1b6728fed0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "079b5a9e9560ed082d08bd1b6728fed0")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableSmoothScrollView.this.getScrollY();
                    ObservableSmoothScrollView observableSmoothScrollView = ObservableSmoothScrollView.this;
                    ObservableSmoothScrollView.a(observableSmoothScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY, new Object[0]);
                    if (!ObservableSmoothScrollView.this.b && this.c == scrollY) {
                        this.c = Integer.MIN_VALUE;
                        ObservableSmoothScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollY;
                        ObservableSmoothScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public void setOnScrollListener(a aVar) {
        this.d = aVar;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98ab388915178b7d497719d2f8e3a19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98ab388915178b7d497719d2f8e3a19")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7d4c2d9279efc737f60ee45a22473681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7d4c2d9279efc737f60ee45a22473681");
        } else if (motionEvent.getAction() == 0) {
            new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
            this.b = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9af28b07c4f2f63a0db653b4f15a6ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9af28b07c4f2f63a0db653b4f15a6ea")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1f5498e2a8e75950c59a0f5696e0f86d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1f5498e2a8e75950c59a0f5696e0f86d");
        } else {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
                this.b = false;
                a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.sankuai.waimai.store.widgets.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "905f4ab78dbf14c645233cb88a6e0ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "905f4ab78dbf14c645233cb88a6e0ba7");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        Object[] objArr2 = {Boolean.valueOf(this.b), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2)};
        if (this.b) {
            setScrollState(1);
            return;
        }
        setScrollState(2);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6636fa26195d7bbfc05f7e1725bfbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6636fa26195d7bbfc05f7e1725bfbe");
        } else if (this.c != i) {
            Object[] objArr2 = {Integer.valueOf(this.c), Integer.valueOf(i)};
            this.c = i;
        }
    }
}
