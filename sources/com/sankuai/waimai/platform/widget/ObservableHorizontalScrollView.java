package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ObservableHorizontalScrollView extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private int c;
    private a d;
    private final Handler e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(ObservableHorizontalScrollView observableHorizontalScrollView, boolean z, int i, int i2, int i3, int i4);
    }

    public static /* synthetic */ void a(ObservableHorizontalScrollView observableHorizontalScrollView, String str, Object[] objArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddcf40bf2d83427d80051d7613c6fd7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddcf40bf2d83427d80051d7613c6fd7e");
            return;
        }
        this.e.removeMessages(1);
        this.e.sendEmptyMessageDelayed(1, 80L);
    }

    public ObservableHorizontalScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79b20e278c8824e1e8ab14e850fae0e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79b20e278c8824e1e8ab14e850fae0e7");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abcba0f43a4663489b82e60bf7fe514c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abcba0f43a4663489b82e60bf7fe514c")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollX = ObservableHorizontalScrollView.this.getScrollX();
                    ObservableHorizontalScrollView observableHorizontalScrollView = ObservableHorizontalScrollView.this;
                    ObservableHorizontalScrollView.a(observableHorizontalScrollView, "handleMessage, lastX = " + this.c + ", y = " + scrollX, new Object[0]);
                    if (!ObservableHorizontalScrollView.this.b && this.c == scrollX) {
                        this.c = Integer.MIN_VALUE;
                        ObservableHorizontalScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollX;
                        ObservableHorizontalScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e7ce72927329b22bf92a3467e4be35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e7ce72927329b22bf92a3467e4be35");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abcba0f43a4663489b82e60bf7fe514c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abcba0f43a4663489b82e60bf7fe514c")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollX = ObservableHorizontalScrollView.this.getScrollX();
                    ObservableHorizontalScrollView observableHorizontalScrollView = ObservableHorizontalScrollView.this;
                    ObservableHorizontalScrollView.a(observableHorizontalScrollView, "handleMessage, lastX = " + this.c + ", y = " + scrollX, new Object[0]);
                    if (!ObservableHorizontalScrollView.this.b && this.c == scrollX) {
                        this.c = Integer.MIN_VALUE;
                        ObservableHorizontalScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollX;
                        ObservableHorizontalScrollView.this.a();
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public ObservableHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4734e2e71e4b1a08b42aae738354d27d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4734e2e71e4b1a08b42aae738354d27d");
            return;
        }
        this.b = false;
        this.c = 0;
        this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.waimai.platform.widget.ObservableHorizontalScrollView.1
            public static ChangeQuickRedirect a;
            private int c = Integer.MIN_VALUE;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abcba0f43a4663489b82e60bf7fe514c", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abcba0f43a4663489b82e60bf7fe514c")).booleanValue();
                }
                if (message.what == 1) {
                    int scrollX = ObservableHorizontalScrollView.this.getScrollX();
                    ObservableHorizontalScrollView observableHorizontalScrollView = ObservableHorizontalScrollView.this;
                    ObservableHorizontalScrollView.a(observableHorizontalScrollView, "handleMessage, lastX = " + this.c + ", y = " + scrollX, new Object[0]);
                    if (!ObservableHorizontalScrollView.this.b && this.c == scrollX) {
                        this.c = Integer.MIN_VALUE;
                        ObservableHorizontalScrollView.this.setScrollState(0);
                    } else {
                        this.c = scrollX;
                        ObservableHorizontalScrollView.this.a();
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84fdcdbc268e6e81c129cab98813100", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84fdcdbc268e6e81c129cab98813100")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3792b07d606bcde654d6076faa06116f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3792b07d606bcde654d6076faa06116f");
        } else if (motionEvent.getAction() == 0) {
            new StringBuilder("handleEvent, action = ").append(motionEvent.getAction());
            this.b = true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08aaf9838e231a4d5476f752f4e017f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08aaf9838e231a4d5476f752f4e017f")).booleanValue();
        }
        Object[] objArr2 = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de80e86a77361631fc1cc9209977ee2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de80e86a77361631fc1cc9209977ee2f");
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

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "befad8d267b2270b2a6c662002ee3b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "befad8d267b2270b2a6c662002ee3b60");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        Object[] objArr2 = {Boolean.valueOf(this.b), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2)};
        if (this.b) {
            setScrollState(1);
        } else {
            setScrollState(2);
            a();
        }
        if (this.d != null) {
            this.d.a(this, this.b, i, i2, i3, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741431bbd822fa7aacb44d4fffe139fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741431bbd822fa7aacb44d4fffe139fe");
        } else if (this.c != i) {
            Object[] objArr2 = {Integer.valueOf(this.c), Integer.valueOf(i)};
            this.c = i;
        }
    }
}
