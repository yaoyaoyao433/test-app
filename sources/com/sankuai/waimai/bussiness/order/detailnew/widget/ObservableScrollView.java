package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ObservableScrollView extends ScrollView {
    public static ChangeQuickRedirect a;
    private a b;
    private boolean c;
    private int d;
    private b e;
    private final Handler f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(ObservableScrollView observableScrollView, int i);

        void a(ObservableScrollView observableScrollView, boolean z, int i, int i2, int i3, int i4);
    }

    public static /* synthetic */ void a(ObservableScrollView observableScrollView, String str) {
    }

    public void setOnExposeListener(a aVar) {
        this.b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd41681826bed457d099d1780651fa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd41681826bed457d099d1780651fa2");
            return;
        }
        this.f.removeMessages(1);
        this.f.sendEmptyMessageDelayed(1, 80L);
    }

    public ObservableScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1e6ad589790800ccb58b7cec756a5aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1e6ad589790800ccb58b7cec756a5aa");
            return;
        }
        this.c = false;
        this.d = 0;
        this.f = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableScrollView.this.getScrollY();
                    ObservableScrollView observableScrollView = ObservableScrollView.this;
                    ObservableScrollView.a(observableScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY);
                    if (!ObservableScrollView.this.c && this.c == scrollY) {
                        this.c = Integer.MIN_VALUE;
                        ObservableScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollY;
                        ObservableScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0657f54217f1d297e47f7fe65594f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0657f54217f1d297e47f7fe65594f0");
            return;
        }
        this.c = false;
        this.d = 0;
        this.f = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableScrollView.this.getScrollY();
                    ObservableScrollView observableScrollView = ObservableScrollView.this;
                    ObservableScrollView.a(observableScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY);
                    if (!ObservableScrollView.this.c && this.c == scrollY) {
                        this.c = Integer.MIN_VALUE;
                        ObservableScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollY;
                        ObservableScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc955779d3340e01c2ee2582ff88d725", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc955779d3340e01c2ee2582ff88d725");
            return;
        }
        this.c = false;
        this.d = 0;
        this.f = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableScrollView.this.getScrollY();
                    ObservableScrollView observableScrollView = ObservableScrollView.this;
                    ObservableScrollView.a(observableScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY);
                    if (!ObservableScrollView.this.c && this.c == scrollY) {
                        this.c = Integer.MIN_VALUE;
                        ObservableScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollY;
                        ObservableScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    @TargetApi(21)
    public ObservableScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940b53de3b8f5fb927c0752067afe3c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940b53de3b8f5fb927c0752067afe3c4");
            return;
        }
        this.c = false;
        this.d = 0;
        this.f = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.ObservableScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c0603714b1ef57fd1467d258ffe4061")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableScrollView.this.getScrollY();
                    ObservableScrollView observableScrollView = ObservableScrollView.this;
                    ObservableScrollView.a(observableScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY);
                    if (!ObservableScrollView.this.c && this.c == scrollY) {
                        this.c = Integer.MIN_VALUE;
                        ObservableScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollY;
                        ObservableScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public void setOnScrollListener(b bVar) {
        this.e = bVar;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4462b658827220eaa659f159a8df05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4462b658827220eaa659f159a8df05")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1866be0be04abddc28d6fc76119361da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1866be0be04abddc28d6fc76119361da");
        } else if (motionEvent.getAction() == 0) {
            new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
            this.c = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b82f3757eae8738b9043bd21528ae5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b82f3757eae8738b9043bd21528ae5")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "249dd5fc3f842e984d010f69f1209e08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "249dd5fc3f842e984d010f69f1209e08");
        } else {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
                this.c = false;
                a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    @SuppressLint({"DefaultLocale"})
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0c16ea35197a44dec7cbb0baeff17d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0c16ea35197a44dec7cbb0baeff17d");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        String.format("onScrollChanged, isTouched = %s, l: %d --> %d, t: %d --> %d", Boolean.valueOf(this.c), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2));
        if (this.c) {
            setScrollState(1);
        } else {
            setScrollState(2);
            a();
        }
        if (this.e != null) {
            this.e.a(this, this.c, i, i2, i3, i4);
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DefaultLocale"})
    public void setScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0795f205eafdbed36a0449e0017da42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0795f205eafdbed36a0449e0017da42");
        } else if (this.d != i) {
            String.format("---- onScrollStateChanged, state: %d --> %d", Integer.valueOf(this.d), Integer.valueOf(i));
            this.d = i;
            if (this.e != null) {
                this.e.a(this, i);
            }
        }
    }
}
