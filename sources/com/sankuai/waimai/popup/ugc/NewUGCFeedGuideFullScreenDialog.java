package com.sankuai.waimai.popup.ugc;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.meituan.mtimageloader.loader.a;
import com.sankuai.waimai.business.page.home.model.c;
import com.sankuai.waimai.business.page.home.widget.HollowView;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NewUGCFeedGuideFullScreenDialog extends UGCFeedGuideFullScreenDialog {
    public static ChangeQuickRedirect a;
    private HollowView e;
    private float f;
    private float g;
    private float h;
    private float i;
    private final int j;
    private final int k;
    private View l;
    private View m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    public NewUGCFeedGuideFullScreenDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7d2974b260a5e40419e8e39d52c21b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7d2974b260a5e40419e8e39d52c21b");
            return;
        }
        this.n = g.d(context);
        this.o = g.a(context);
        this.j = g.a(context, 301.0f);
        this.k = g.a(context, 257.5f);
        this.p = g.a(context, 20.0f);
        this.q = g.a(context, 16.8f);
        this.r = g.a(context, 12.0f);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3625d90aaf30eed2b4b56edad7bfc770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3625d90aaf30eed2b4b56edad7bfc770");
        } else if (getWindow() != null) {
            getWindow().addFlags(512);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 0;
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            setCancelable(false);
        }
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3cddefb0b74ad8e29a799f957c6027b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3cddefb0b74ad8e29a799f957c6027b7");
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = new HollowView(context);
        this.e.setBackgroundColor(-1308622848);
        this.e.setClickThroughPoiCircle(true);
        frameLayout.addView(this.e, -1, -1);
        this.l = LayoutInflater.from(context).inflate(R.layout.wm_page_home_tab_ugc_feed_guide_new, (ViewGroup) frameLayout, false);
        this.m = this.l.findViewById(R.id.iv_guide_triangle);
        frameLayout.addView(this.l);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.popup.ugc.NewUGCFeedGuideFullScreenDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr4 = {view};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f31fd436857339b8277828fa43944972", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f31fd436857339b8277828fa43944972");
                } else {
                    NewUGCFeedGuideFullScreenDialog.this.dismiss();
                }
            }
        });
        setContentView(frameLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05260e01565f7a1882c8d5761039bc8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05260e01565f7a1882c8d5761039bc8a")).booleanValue();
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        Object[] objArr2 = {Float.valueOf(x), Float.valueOf(y)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b594525c2fdeb59139b369e52efccb85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b594525c2fdeb59139b369e52efccb85")).booleanValue() : this.e.getHollowRegion().contains(x, y)) {
            if (action == 1) {
                a(true);
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog
    public final void a(float f, float f2, float f3, float f4, @ColorInt int i) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), -13236};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5361f90030e4efba5ff7b1ff95ef2b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5361f90030e4efba5ff7b1ff95ef2b02");
            return;
        }
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.e.a(f, f2, f3, f4, -13236);
        final HollowView hollowView = this.e;
        Object[] objArr2 = {Float.valueOf(f4), -13236};
        ChangeQuickRedirect changeQuickRedirect2 = HollowView.a;
        if (PatchProxy.isSupport(objArr2, hollowView, changeQuickRedirect2, false, "c13b789e00b9a5570db5c3c73705fdc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hollowView, changeQuickRedirect2, false, "c13b789e00b9a5570db5c3c73705fdc5");
        } else {
            hollowView.g = new Paint();
            hollowView.c = hollowView.b;
            hollowView.d = f4;
            hollowView.e = -13236;
            hollowView.f = 255;
            hollowView.h = ValueAnimator.ofFloat(0.0f, 0.0f, 0.25f, 0.5f, 0.75f, 1.0f);
            hollowView.h.setDuration(1000L);
            hollowView.h.setRepeatCount(-1);
            hollowView.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.page.home.widget.HollowView.1
                public static ChangeQuickRedirect a;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Object[] objArr3 = {valueAnimator};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2fe92d58bab8d2827eb2b6ed8402c163", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2fe92d58bab8d2827eb2b6ed8402c163");
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    hollowView.c = hollowView.b * ((0.4f * floatValue) + 1.0f);
                    hollowView.f = (int) ((1.0f - floatValue) * 255.0f);
                    hollowView.invalidate();
                }
            });
            hollowView.h.start();
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.m.getLayoutParams();
        float f5 = this.j / 2.0f;
        layoutParams.bottomMargin = (int) ((this.n - f2) + this.h + f4 + this.q);
        if (this.p + f5 >= f) {
            layoutParams.gravity = 83;
            layoutParams.leftMargin = this.p;
            layoutParams.rightMargin = 0;
            layoutParams2.gravity = 3;
            layoutParams2.leftMargin = (int) ((f - this.p) - (this.r * 0.5f));
            layoutParams2.rightMargin = 0;
        } else if (this.p + f5 >= this.o - f) {
            layoutParams.gravity = 85;
            layoutParams.rightMargin = this.p;
            layoutParams.leftMargin = 0;
            layoutParams2.gravity = 5;
            layoutParams2.rightMargin = (int) (((this.o - f) - this.p) - (this.r * 0.5f));
            layoutParams2.leftMargin = 0;
        } else {
            layoutParams.gravity = 83;
            layoutParams.leftMargin = (int) (f - f5);
            layoutParams.rightMargin = 0;
            layoutParams2.gravity = 3;
            layoutParams2.leftMargin = (int) (f5 - (this.r * 0.5f));
            layoutParams2.rightMargin = 0;
        }
        this.l.setLayoutParams(layoutParams);
        this.m.setLayoutParams(layoutParams2);
    }

    @Override // com.sankuai.waimai.popup.ugc.UGCFeedGuideFullScreenDialog
    public final void a(Activity activity, c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d53e38980a959ac624ecc044f75fd1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d53e38980a959ac624ecc044f75fd1d");
        } else if (cVar == null) {
        } else {
            final ImageView imageView = (ImageView) this.l.findViewById(R.id.iv_guide_pic);
            String str = cVar.c;
            if (!cVar.g) {
                str = cVar.f;
            }
            b.C0608b c = a.c();
            c.b = activity;
            c.c = str;
            c.b(this.k).a(new b.d() { // from class: com.sankuai.waimai.popup.ugc.NewUGCFeedGuideFullScreenDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdf9de77e702740e7dffa4a2762f2609", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdf9de77e702740e7dffa4a2762f2609");
                        return;
                    }
                    imageView.setVisibility(0);
                    NewUGCFeedGuideFullScreenDialog.this.m.setVisibility(0);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e9c42010b173a147b6bbe83eefdad05", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e9c42010b173a147b6bbe83eefdad05");
                        return;
                    }
                    imageView.setVisibility(8);
                    NewUGCFeedGuideFullScreenDialog.this.m.setVisibility(8);
                }
            }).a(imageView);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.popup.ugc.NewUGCFeedGuideFullScreenDialog.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5efd7f18e1d38ccae19b67f47d9043fb", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5efd7f18e1d38ccae19b67f47d9043fb");
                    } else {
                        NewUGCFeedGuideFullScreenDialog.this.a(false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b6debf262aa33411e3b3007d119a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b6debf262aa33411e3b3007d119a0d");
            return;
        }
        dismiss();
        if (this.d != null) {
            this.d.a(z);
        }
    }
}
