package com.sankuai.waimai.store.newwidgets;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff2bd08074989a451b28ae175f39088", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff2bd08074989a451b28ae175f39088");
            return;
        }
        this.e.removeMessages(1);
        this.e.sendEmptyMessageDelayed(1, 80L);
    }

    public ObservableSmoothScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f79501a9d9b9e7e38bdd49958eea8465", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f79501a9d9b9e7e38bdd49958eea8465");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.store.newwidgets.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48179839f68d6d64a0428f192bf62695", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48179839f68d6d64a0428f192bf62695")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9c00c1ac062692e9fb1294c2886c94e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9c00c1ac062692e9fb1294c2886c94e");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.store.newwidgets.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "48179839f68d6d64a0428f192bf62695", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "48179839f68d6d64a0428f192bf62695")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e3560cef7731172cf8bd56dae39ca0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e3560cef7731172cf8bd56dae39ca0")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c43d95d5997b448e329841378451b5ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c43d95d5997b448e329841378451b5ff");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "923973b16c419e43d22306a760afdf7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "923973b16c419e43d22306a760afdf7e")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c7d7186478976af3122d7ee8a9629b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c7d7186478976af3122d7ee8a9629b6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44246ef7e6c15399a36fa65a74653a1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44246ef7e6c15399a36fa65a74653a1f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6762895fd744dd251a7ecdf7d55096e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6762895fd744dd251a7ecdf7d55096e6");
        } else if (this.c != i) {
            Object[] objArr2 = {Integer.valueOf(this.c), Integer.valueOf(i)};
            this.c = i;
        }
    }
}
