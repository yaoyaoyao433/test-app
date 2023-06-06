package com.meituan.android.paybase.widgets;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.meituan.android.paybase.common.utils.anim.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProgressButton extends AppCompatButton {
    public static ChangeQuickRedirect a;
    public boolean b;
    private CharSequence c;
    private f d;
    private f e;
    private f f;
    private Path g;
    private ValueAnimator h;
    private Canvas i;
    private Bitmap j;
    private Dialog k;
    private Paint l;
    private int m;
    private Paint n;
    private Rect o;
    private float p;
    private float q;
    private a r;

    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4a1f2a8a507602a3004397e7030ede", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4a1f2a8a507602a3004397e7030ede");
            return;
        }
        this.r = null;
        this.r = new a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d216db025ff587093ed86041ccdd55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d216db025ff587093ed86041ccdd55");
            return;
        }
        super.onAttachedToWindow();
        this.h = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h.setRepeatCount(-1);
        this.h.addUpdateListener(com.meituan.android.paybase.widgets.a.a(this));
        this.m = com.meituan.android.paybase.screen.b.a().a(4);
        this.l = new Paint();
        this.l.setAntiAlias(true);
        this.n = new Paint();
        this.n.setAntiAlias(true);
        this.n.setStyle(Paint.Style.FILL);
        this.n.setColor(getResources().getColor(R.color.paybase__transparent));
        this.n.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static /* synthetic */ void a(ProgressButton progressButton, ValueAnimator valueAnimator) {
        Object[] objArr = {progressButton, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eec5bfd7687902a2c12e6eb6edbe71d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eec5bfd7687902a2c12e6eb6edbe71d2");
        } else {
            progressButton.invalidate();
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c6f0f747a4813844438297c6254a8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c6f0f747a4813844438297c6254a8da");
        } else {
            a(true);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0cab6c86e6f8da33c075c567c631c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0cab6c86e6f8da33c075c567c631c4");
        } else if (this.b) {
        } else {
            this.c = getText();
            setText("");
            setEnabled(true);
            b(true);
            this.b = true;
            if (this.d != null) {
                this.d.d();
            }
            if (this.h != null) {
                this.h.start();
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "429ef303e25349d4e236139ccef654ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "429ef303e25349d4e236139ccef654ad");
            return;
        }
        this.b = false;
        if (this.h != null) {
            this.h.cancel();
        }
        c();
        setText(this.c);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55cdb44299eb895d6bfdfbbcbed9b81a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55cdb44299eb895d6bfdfbbcbed9b81a");
            return;
        }
        super.onDetachedFromWindow();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18e563d9adfd4076b1b97c3ae2c25b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18e563d9adfd4076b1b97c3ae2c25b25");
            return;
        }
        if (this.i != null) {
            this.i = null;
        }
        if (this.j == null || this.j.isRecycled()) {
            return;
        }
        this.j.recycle();
        this.j = null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51043e2d79177500a5ce7298f041a845", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51043e2d79177500a5ce7298f041a845");
            return;
        }
        super.onDraw(canvas);
        if (this.b) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb9ba1f22231e5f5d27f316a2d553c72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb9ba1f22231e5f5d27f316a2d553c72");
            } else if (this.j == null) {
                this.j = Bitmap.createBitmap(getHeight(), getHeight(), Bitmap.Config.ARGB_8888);
                this.o = new Rect();
                this.o.set(0, 0, this.j.getWidth(), this.j.getHeight());
                this.i = new Canvas();
                this.i.setBitmap(this.j);
                this.g = new Path();
                this.g.addCircle(this.j.getWidth() / 2.0f, this.j.getHeight() / 2.0f, (((this.j.getHeight() / 2.0f) * 30.0f) / 50.0f) - 4.0f, Path.Direction.CW);
                this.d = new f(this.g) { // from class: com.meituan.android.paybase.widgets.ProgressButton.1
                    public static ChangeQuickRedirect l;

                    @Override // com.meituan.android.paybase.common.utils.anim.f
                    public final int b() {
                        return 120;
                    }

                    @Override // com.meituan.android.paybase.common.utils.anim.f
                    public final void c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = l;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86a566a97ac20653c8fee8697b08b4a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86a566a97ac20653c8fee8697b08b4a5");
                            return;
                        }
                        a().setColor(-1);
                        a().setStrokeWidth(ProgressButton.this.m);
                        e().b = new int[]{0, 120};
                        e().a(0.35f, 0.45f);
                    }
                };
                this.d.a(1);
                this.d.d();
                this.e = new f(this.g) { // from class: com.meituan.android.paybase.widgets.ProgressButton.2
                    public static ChangeQuickRedirect l;

                    @Override // com.meituan.android.paybase.common.utils.anim.f
                    public final int b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = l;
                        return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "af84a7cb5f1b59b86fb844e770cc2446", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "af84a7cb5f1b59b86fb844e770cc2446")).intValue() : f().b()[f().b().length - 1];
                    }

                    @Override // com.meituan.android.paybase.common.utils.anim.f
                    public final void c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = l;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0e9ef31743e01187402ebded1de4c2e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0e9ef31743e01187402ebded1de4c2e");
                            return;
                        }
                        a().setColor(-1);
                        a().setStrokeWidth(ProgressButton.this.m);
                        e().b = new int[]{0};
                        e().a(0.45f);
                        f().b = new int[]{0, 630};
                        f().a(0.0f, 360.0f);
                    }
                };
                this.e.a(-1);
                this.e.k = 120;
                this.e.d();
                this.f = new f(this.g) { // from class: com.meituan.android.paybase.widgets.ProgressButton.3
                    public static ChangeQuickRedirect l;

                    @Override // com.meituan.android.paybase.common.utils.anim.f
                    public final int b() {
                        return -1;
                    }

                    @Override // com.meituan.android.paybase.common.utils.anim.f
                    public final void c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = l;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9988b349b379fc5efa77e07cb44703b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9988b349b379fc5efa77e07cb44703b1");
                            return;
                        }
                        a().setColor(-1);
                        a().setAlpha(25);
                        a().setStrokeWidth(ProgressButton.this.m);
                        e().b = new int[]{0};
                        e().a(0.0f);
                        e().b = new int[]{0};
                        e().a(1.0f);
                    }
                };
                this.p = (getWidth() - this.j.getWidth()) / 2.0f;
                this.q = (getHeight() - this.j.getHeight()) / 2.0f;
            }
            this.i.drawRect(this.o, this.n);
            this.i.save();
            this.d.a(this.i);
            this.e.a(this.i);
            this.f.a(this.i);
            this.i.restore();
            canvas.drawBitmap(this.j, this.p, this.q, (Paint) null);
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65f5cd73ccf8f6b41b601ff9b55048c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65f5cd73ccf8f6b41b601ff9b55048c");
            return;
        }
        this.k = new Dialog(getContext(), R.style.paybase__translucent_dialog);
        this.k.setCanceledOnTouchOutside(false);
        this.k.setCancelable(z);
        this.k.setOnCancelListener(b.a(this));
        this.k.show();
    }

    public static /* synthetic */ void a(ProgressButton progressButton, DialogInterface dialogInterface) {
        Object[] objArr = {progressButton, dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbe585080385513e16e4402e3c4e4a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbe585080385513e16e4402e3c4e4a46");
        } else {
            progressButton.b();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9852b71f476be0f294a894865b605059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9852b71f476be0f294a894865b605059");
        } else if (this.k == null || !this.k.isShowing()) {
        } else {
            this.k.dismiss();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e660049905b9ce64733f817f64867be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e660049905b9ce64733f817f64867be")).booleanValue();
        }
        if (this.r != null && isClickable()) {
            this.r.sendEmptyMessage(1);
            this.r.sendEmptyMessageDelayed(2, 1000L);
        }
        return super.performClick();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a extends Handler {
        public static ChangeQuickRedirect a;
        private WeakReference<ProgressButton> b;

        public a(ProgressButton progressButton) {
            Object[] objArr = {progressButton};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc8a0fd5cb16dad65d73c5e92beeb4e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc8a0fd5cb16dad65d73c5e92beeb4e");
            } else {
                this.b = new WeakReference<>(progressButton);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "432dbf1ac85a9e3d410d87b66a2cdbad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "432dbf1ac85a9e3d410d87b66a2cdbad");
            } else if (this.b.get() != null) {
                ProgressButton progressButton = this.b.get();
                if (message.what == 2) {
                    progressButton.setClickable(true);
                } else if (message.what == 1) {
                    progressButton.setClickable(false);
                }
            }
        }
    }
}
