package com.sankuai.waimai.ugc.creator.widgets;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooImageView;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.widgets.round.RoundCornerView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class RecordButton extends FrameLayout {
    public static ChangeQuickRedirect a;
    public int b;
    public RooImageView c;
    private final int d;
    private final int e;
    private final int f;
    private RoundCornerView g;
    private CircularProgressBar h;
    private DynamicBall i;
    private int j;
    private GestureDetector k;
    private a l;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    public static /* synthetic */ void b(RecordButton recordButton) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, recordButton, changeQuickRedirect, false, "b1a863cca5232529945a0fb3f3285fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, recordButton, changeQuickRedirect, false, "b1a863cca5232529945a0fb3f3285fdf");
        } else if (recordButton.l == null || !recordButton.l.a()) {
        } else {
            recordButton.b = 2;
            final DynamicBall dynamicBall = recordButton.i;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = DynamicBall.a;
            if (PatchProxy.isSupport(objArr2, dynamicBall, changeQuickRedirect2, false, "246e6f36fe761428e12243f2280fd5a1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dynamicBall, changeQuickRedirect2, false, "246e6f36fe761428e12243f2280fd5a1");
            } else {
                dynamicBall.a();
                dynamicBall.b.setFloatValues(dynamicBall.c, dynamicBall.d);
                dynamicBall.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.DynamicBall.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "daa8eb80d1e2762ee65695a17926d24a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "daa8eb80d1e2762ee65695a17926d24a");
                            return;
                        }
                        dynamicBall.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        dynamicBall.invalidate();
                    }
                });
                dynamicBall.b.start();
            }
            recordButton.c.setImageResourceByResName("ugccreator_ugc_media_record_pause_icon");
        }
    }

    public RecordButton(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "396cd0628b18883159be02f3b696c02c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "396cd0628b18883159be02f3b696c02c");
        }
    }

    public RecordButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f4d38db8c76a2a92936e08a9b918048", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f4d38db8c76a2a92936e08a9b918048");
        }
    }

    public RecordButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c78320a0a4f80a96ca6824166511abf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c78320a0a4f80a96ca6824166511abf");
            return;
        }
        this.d = 1;
        this.e = 2;
        this.f = 4;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a74a5ae8fe93b60c155eee3df8ef6bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a74a5ae8fe93b60c155eee3df8ef6bf");
            return;
        }
        this.b = 1;
        this.j = g.a(context, 90.0f);
        ah.b(this, this.j, this.j);
        this.g = new RoundCornerView(context);
        this.g.setBackgroundColor(Color.parseColor("#80222426"));
        this.g.setCornerRadius(this.j / 2.0f);
        addView(this.g, this.j, this.j);
        this.h = new CircularProgressBar(context);
        addView(this.h, this.j, this.j);
        this.i = new DynamicBall(context);
        DynamicBall dynamicBall = this.i;
        float f = this.j / 3.0f;
        float f2 = this.j * 0.4f;
        Object[] objArr3 = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect3 = DynamicBall.a;
        if (PatchProxy.isSupport(objArr3, dynamicBall, changeQuickRedirect3, false, "9a7e4cb86923f72f0b4ce318ee6a2838", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dynamicBall, changeQuickRedirect3, false, "9a7e4cb86923f72f0b4ce318ee6a2838");
        } else {
            dynamicBall.c = f;
            dynamicBall.d = f2;
            dynamicBall.a();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.j, this.j);
        layoutParams.gravity = 17;
        addView(this.i, layoutParams);
        try {
            this.c = new RooImageView(context);
            this.c.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.c.setImageResourceByResName("ugccreator_ugc_media_record_begin_icon");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((this.j * 16) / 45, (this.j * 16) / 45);
            layoutParams2.gravity = 17;
            addView(this.c, layoutParams2);
        } catch (Exception unused) {
        }
        this.k = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.RecordButton.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f4) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr4 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6990446e9959c1df1be37ac71b25864", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6990446e9959c1df1be37ac71b25864")).booleanValue();
                }
                if (RecordButton.this.isEnabled()) {
                    switch (RecordButton.this.b) {
                        case 1:
                            RecordButton.b(RecordButton.this);
                            break;
                        case 2:
                            RecordButton.this.b();
                            break;
                    }
                    return true;
                }
                return true;
            }
        });
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715ad1820a7a13250a220810de900ea5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715ad1820a7a13250a220810de900ea5")).booleanValue();
        }
        if (isEnabled()) {
            this.k.onTouchEvent(motionEvent);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e17b0306c907dcc2395a4d24b6c269e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e17b0306c907dcc2395a4d24b6c269e");
        } else if (this.l == null || !this.l.b()) {
        } else {
            this.b = 4;
            this.c.setImageResourceByResName("ugccreator_ugc_media_record_complete_icon");
            a();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4707dbcb192f1022b5e37beff665d932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4707dbcb192f1022b5e37beff665d932");
            return;
        }
        this.i.a();
        this.h.setProgress(0.0f);
    }

    public void setProgress(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1487b0f1e07eafae24fa21ba845626c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1487b0f1e07eafae24fa21ba845626c5");
            return;
        }
        this.h.setProgress(Math.min(f, 360.0f));
        if (f >= 360.0f) {
            b();
        }
    }

    public void setRecordButtonStateListener(a aVar) {
        this.l = aVar;
    }
}
