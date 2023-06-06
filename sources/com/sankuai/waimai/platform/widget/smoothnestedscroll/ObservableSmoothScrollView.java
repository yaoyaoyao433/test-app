package com.sankuai.waimai.platform.widget.smoothnestedscroll;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ObservableSmoothScrollView extends SmoothNestedScrollView {
    public static ChangeQuickRedirect a;
    private boolean d;
    private int e;
    private a f;
    private final Handler g;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd91453ad8306b00f171b2247ed2a32e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd91453ad8306b00f171b2247ed2a32e");
            return;
        }
        this.g.removeMessages(1);
        this.g.sendEmptyMessageDelayed(1, 80L);
    }

    public ObservableSmoothScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d078256fbf1700280f3f85d03bc9b9e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d078256fbf1700280f3f85d03bc9b9e6");
            return;
        }
        this.d = false;
        this.e = 0;
        this.g = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a4f2c030ee71f4fe2a0cd6046d602fe", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a4f2c030ee71f4fe2a0cd6046d602fe")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableSmoothScrollView.this.getScrollY();
                    ObservableSmoothScrollView observableSmoothScrollView = ObservableSmoothScrollView.this;
                    ObservableSmoothScrollView.a(observableSmoothScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY, new Object[0]);
                    if (!ObservableSmoothScrollView.this.d && this.c == scrollY) {
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

    public ObservableSmoothScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72151bb25767d6afa4cde43fbf5c77dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72151bb25767d6afa4cde43fbf5c77dc");
            return;
        }
        this.d = false;
        this.e = 0;
        this.g = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a4f2c030ee71f4fe2a0cd6046d602fe", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a4f2c030ee71f4fe2a0cd6046d602fe")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableSmoothScrollView.this.getScrollY();
                    ObservableSmoothScrollView observableSmoothScrollView = ObservableSmoothScrollView.this;
                    ObservableSmoothScrollView.a(observableSmoothScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY, new Object[0]);
                    if (!ObservableSmoothScrollView.this.d && this.c == scrollY) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6732799f3dc0f478a2bb543e6fd8a04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6732799f3dc0f478a2bb543e6fd8a04");
            return;
        }
        this.d = false;
        this.e = 0;
        this.g = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.ObservableSmoothScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a4f2c030ee71f4fe2a0cd6046d602fe", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a4f2c030ee71f4fe2a0cd6046d602fe")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollY = ObservableSmoothScrollView.this.getScrollY();
                    ObservableSmoothScrollView observableSmoothScrollView = ObservableSmoothScrollView.this;
                    ObservableSmoothScrollView.a(observableSmoothScrollView, "handleMessage, lastY = " + this.c + ", y = " + scrollY, new Object[0]);
                    if (!ObservableSmoothScrollView.this.d && this.c == scrollY) {
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
        this.f = aVar;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2df067f07f3eed27bb0c14adaf9104", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2df067f07f3eed27bb0c14adaf9104")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dfacdce9e45f5b4db20892b8f6fe646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dfacdce9e45f5b4db20892b8f6fe646");
        } else if (motionEvent.getAction() == 0) {
            new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
            this.d = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView, android.support.v4.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f119f4ea3aa9ca54eb38336ea2c54423", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f119f4ea3aa9ca54eb38336ea2c54423")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a2b3bb814b65ad1357a162554efbe26d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a2b3bb814b65ad1357a162554efbe26d");
        } else {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
                this.d = false;
                a();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beb8b1b9666087a595d6d0c6d5805887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beb8b1b9666087a595d6d0c6d5805887");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        Object[] objArr2 = {Boolean.valueOf(this.d), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2)};
        if (this.d) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff7067d43ea7337c2f367a2e3199a27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff7067d43ea7337c2f367a2e3199a27");
        } else if (this.e != i) {
            Object[] objArr2 = {Integer.valueOf(this.e), Integer.valueOf(i)};
            this.e = i;
        }
    }
}
