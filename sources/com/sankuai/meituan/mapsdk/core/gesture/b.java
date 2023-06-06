package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.UiThread;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class b extends com.sankuai.meituan.mapsdk.core.gesture.a<a> {
    public static ChangeQuickRedirect h;
    boolean i;
    private MotionEvent j;
    private Handler k;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(int i, int i2, int i3);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.a
    public final /* bridge */ /* synthetic */ AndroidGesturesManager a() {
        return super.a();
    }

    public b(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01cb504110a97a56c917e5afa2399a80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01cb504110a97a56c917e5afa2399a80");
            return;
        }
        this.i = false;
        this.k = new Handler(new Handler.Callback() { // from class: com.sankuai.meituan.mapsdk.core.gesture.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                MotionEvent motionEvent;
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "522b6bab0464d15d98d9ba9f04dd6e8d", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "522b6bab0464d15d98d9ba9f04dd6e8d")).booleanValue();
                }
                if (b.this.g == 0 || (motionEvent = b.this.d) == null) {
                    return false;
                }
                b.this.i = true;
                ((a) b.this.g).a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
                return false;
            }
        });
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96ce3c43c3fd3d378c8447ac2c9ff01f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96ce3c43c3fd3d378c8447ac2c9ff01f")).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 5) {
            switch (actionMasked) {
                case 0:
                    if (motionEvent.getPointerCount() <= 1) {
                        if (this.j != null) {
                            this.j.recycle();
                            this.j = null;
                        }
                        this.j = MotionEvent.obtain(motionEvent);
                        this.k.sendEmptyMessageDelayed(0, 500L);
                        break;
                    }
                    break;
                case 1:
                    this.i = false;
                    this.k.removeMessages(0);
                    if (this.g != 0) {
                        ((a) this.g).a((int) this.d.getX(), (int) this.d.getY(), 2);
                    }
                    if (this.j != null) {
                        this.j.recycle();
                        this.j = null;
                        break;
                    }
                    break;
                case 2:
                    if (this.j == null) {
                        this.j = MotionEvent.obtain(motionEvent);
                    }
                    int x = ((int) motionEvent.getX()) - ((int) this.j.getX());
                    int y = ((int) motionEvent.getY()) - ((int) this.j.getY());
                    double sqrt = Math.sqrt((x * x) + (y * y));
                    if (!this.k.hasMessages(0) || sqrt >= 10.0d) {
                        if (this.k.hasMessages(0) || !this.i) {
                            this.k.removeMessages(0);
                            this.i = false;
                            break;
                        } else if (this.g != 0) {
                            ((a) this.g).a((int) this.d.getX(), (int) this.d.getY(), 1);
                            break;
                        }
                    }
                    break;
                case 3:
                    this.i = false;
                    this.k.removeMessages(0);
                    if (this.g != 0) {
                        ((a) this.g).a((int) this.d.getX(), (int) this.d.getY(), 2);
                        break;
                    }
                    break;
            }
        } else {
            this.i = false;
            this.k.removeMessages(0);
        }
        return false;
    }
}
