package com.meituan.mmp.lib.api.video;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class e extends FrameLayout implements View.OnTouchListener {
    public static ChangeQuickRedirect a;
    protected c b;
    private Context c;
    private ScheduledExecutorService d;
    private Runnable e;
    private ScheduledFuture<?> f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;
    private boolean k;
    private long l;
    private float m;
    private int n;
    private long o;

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(long j, int i);

    public abstract void a(String str, JSONObject jSONObject);

    public abstract void a(boolean z);

    public abstract void b(int i);

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void setFullScreenDirection(int i);

    public abstract void setImage(@DrawableRes int i);

    public abstract void setLenght(long j);

    public abstract void setTitle(String str);

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b0880470225e44cb77edc72cf3ca64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b0880470225e44cb77edc72cf3ca64");
            return;
        }
        this.c = context;
        setOnTouchListener(this);
    }

    public void setVideoPlayer(c cVar) {
        this.b = cVar;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "952e8a1e64e1aff9d9f117d43149a01c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "952e8a1e64e1aff9d9f117d43149a01c");
            return;
        }
        c();
        if (this.d == null) {
            this.d = com.sankuai.android.jarvis.c.c("MMP-VideoPlayerController");
        }
        if (this.e == null) {
            this.e = new Runnable() { // from class: com.meituan.mmp.lib.api.video.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "daaa6ed4f37c7ea2b2f8782f2c3cdfb8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "daaa6ed4f37c7ea2b2f8782f2c3cdfb8");
                    } else if (e.this.b.j()) {
                        e.this.post(new Runnable() { // from class: com.meituan.mmp.lib.api.video.e.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "13a7156ae9927d356b30ba5c47f2d875", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "13a7156ae9927d356b30ba5c47f2d875");
                                } else {
                                    e.this.d();
                                }
                            }
                        });
                    }
                }
            };
        }
        this.f = this.d.scheduleAtFixedRate(this.e, 0L, 1000L, TimeUnit.MILLISECONDS);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "758ca91b83d0bc9a099533bce652ab56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "758ca91b83d0bc9a099533bce652ab56");
        } else if (this.f != null) {
            this.f.cancel(false);
            this.f = null;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0386cac715efe4eb644dd4cac5348f07", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0386cac715efe4eb644dd4cac5348f07")).booleanValue();
        }
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if (!this.b.o()) {
            if (motionEvent.getAction() == 0) {
                e();
            }
            return true;
        } else if (this.b.e() || this.b.m() || this.b.f() || this.b.g() || this.b.n()) {
            f();
            return false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (motionEvent.getAction()) {
                case 0:
                    this.g = x;
                    this.h = y;
                    this.i = false;
                    this.j = false;
                    this.k = false;
                    break;
                case 1:
                case 3:
                    if (this.i) {
                        this.b.a(this.o);
                        f();
                        b();
                        return true;
                    } else if (this.k || this.j) {
                        return true;
                    }
                    break;
                case 2:
                    float f = x - this.g;
                    float f2 = y - this.h;
                    float abs = Math.abs(f);
                    float abs2 = Math.abs(f2);
                    if (!this.i && !this.j && !this.k) {
                        if (abs >= 80.0f) {
                            c();
                            this.i = true;
                            this.l = this.b.getCurrentPosition();
                        } else if (abs2 >= 80.0f) {
                            if (this.g < getWidth() * 0.5f) {
                                this.k = true;
                                this.m = ((Activity) this.c).getWindow().getAttributes().screenBrightness;
                            } else {
                                this.j = true;
                                this.n = this.b.getVolume();
                            }
                        }
                    }
                    if (this.i) {
                        long duration = this.b.getDuration();
                        float f3 = (float) duration;
                        this.o = Math.max(0L, Math.min(duration, ((float) this.l) + ((f * f3) / getWidth())));
                        a(duration, (int) ((((float) this.o) * 100.0f) / f3));
                    }
                    if (this.k) {
                        f2 = -f2;
                        float max = Math.max(0.0f, Math.min(this.m + ((f2 * 3.0f) / getHeight()), 1.0f));
                        WindowManager.LayoutParams attributes = ((Activity) this.c).getWindow().getAttributes();
                        attributes.screenBrightness = max;
                        ((Activity) this.c).getWindow().setAttributes(attributes);
                    }
                    if (this.j) {
                        float f4 = -f2;
                        int maxVolume = this.b.getMaxVolume();
                        this.b.setVolume(Math.max(0, Math.min(maxVolume, this.n + ((int) (((maxVolume * f4) * 3.0f) / getHeight())))));
                        break;
                    }
                    break;
            }
            if (this.b.o()) {
                if (motionEvent.getAction() == 0) {
                    e();
                }
                return true;
            }
            return false;
        }
    }
}
