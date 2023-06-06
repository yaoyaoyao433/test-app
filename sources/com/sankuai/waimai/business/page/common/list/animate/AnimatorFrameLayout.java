package com.sankuai.waimai.business.page.common.list.animate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.animator.b;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.domain.core.poi.bean.AnimatorPicInfoBean;
import com.sankuai.waimai.platform.domain.core.poi.bean.AnimatorProductBean;
import com.sankuai.waimai.platform.domain.core.poi.bean.AnimatorTypeBean;
import com.sankuai.waimai.platform.domain.core.poi.bean.AnimatorUpDownBean;
import com.squareup.picasso.PicassoGifDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AnimatorFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    public static ArrayMap<b, List<ValueAnimator>> b = new ArrayMap<>();
    private static int m = 5;
    public Map<b, ValueAnimator> c;
    protected Handler d;
    public int e;
    public int f;
    public AnimatorZoomCircleImageView g;
    public ImageView h;
    public a i;
    public Random j;
    public AnimatorSet k;
    private boolean l;
    private View n;
    private View o;
    private View p;
    private int q;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LoadStatus {
    }

    public static /* synthetic */ void a(AnimatorFrameLayout animatorFrameLayout) {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, animatorFrameLayout, changeQuickRedirect, false, "3e620449f2056688fed7416909c9e8fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, animatorFrameLayout, changeQuickRedirect, false, "3e620449f2056688fed7416909c9e8fa");
            return;
        }
        if (animatorFrameLayout.h.getDrawable() instanceof PicassoGifDrawable) {
            j = 0;
            for (int i = 0; i < ((PicassoGifDrawable) animatorFrameLayout.h.getDrawable()).c(); i++) {
                j += ((PicassoGifDrawable) animatorFrameLayout.h.getDrawable()).b(i);
            }
        } else {
            j = 0;
        }
        if (j <= 1500.0d) {
            j = 1500;
        } else if (j > MetricsAnrManager.ANR_THRESHOLD) {
            j = 5000;
        }
        b c = b.a.a().c();
        c.b = new long[]{0, 200, 300, j - 400, j - 200, j};
        b a2 = c.a(j + ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
        a2.f = "alpha";
        a2.c = new float[]{0.0f, 0.0f, 100.0f, 100.0f, 90.0f, 0.0f};
        ValueAnimator a3 = animatorFrameLayout.a(a2);
        if (a3 != null) {
            a3.setTarget(animatorFrameLayout.n);
            a3.removeAllListeners();
            a3.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.business.page.common.list.animate.AnimatorFrameLayout.4
                public static ChangeQuickRedirect a;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1dce7c5f8c2fff9c59f3539f6c66454", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1dce7c5f8c2fff9c59f3539f6c66454");
                        return;
                    }
                    super.onAnimationRepeat(animator);
                    if (AnimatorFrameLayout.this.h.getDrawable() instanceof PicassoGifDrawable) {
                        ((PicassoGifDrawable) AnimatorFrameLayout.this.h.getDrawable()).d();
                    }
                }
            });
        }
        animatorFrameLayout.i();
    }

    public AnimatorFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff6e197c85c16f37d858ca2c05d58d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff6e197c85c16f37d858ca2c05d58d6");
            return;
        }
        this.l = false;
        this.c = new HashMap();
        this.d = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.f = 0;
        this.j = new Random();
        this.q = -1;
        a(context);
    }

    public AnimatorFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cffa0c435cff3b32a3867f945d5e3539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cffa0c435cff3b32a3867f945d5e3539");
            return;
        }
        this.l = false;
        this.c = new HashMap();
        this.d = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.f = 0;
        this.j = new Random();
        this.q = -1;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac368626e409e4de6b1c213b06fd6f3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac368626e409e4de6b1c213b06fd6f3d");
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.wm_page_common_foot_pic_animation, (ViewGroup) this, true);
        this.g = (AnimatorZoomCircleImageView) inflate.findViewById(R.id.pic_animate_bottom);
        this.h = (ImageView) inflate.findViewById(R.id.pic_animate_top);
        this.o = inflate.findViewById(R.id.expose_white);
        this.p = inflate.findViewById(R.id.expose_black);
        this.n = inflate.findViewById(R.id.pic_animate_top_fl);
    }

    public final String a(a aVar, int i) {
        List<AnimatorProductBean> list;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e5977afe7a3ce21c76064bf51c14af", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e5977afe7a3ce21c76064bf51c14af") : (aVar == null || (list = aVar.e) == null || list.isEmpty() || i < 0 || i >= list.size()) ? "" : list.get(i).picture;
    }

    public void a(final ImageView imageView, String str, final boolean z) {
        Object[] objArr = {imageView, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b458f1a8cc783eabf9240f4fb7ecd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b458f1a8cc783eabf9240f4fb7ecd2");
        } else if (imageView == null) {
        } else {
            imageView.setVisibility(0);
            a(imageView, str, new b.d() { // from class: com.sankuai.waimai.business.page.common.list.animate.AnimatorFrameLayout.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54f4a23b291c8c67677d1dda56fed647", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54f4a23b291c8c67677d1dda56fed647");
                        return;
                    }
                    if (z) {
                        AnimatorFrameLayout.this.e = 1;
                    } else {
                        AnimatorFrameLayout.this.f = 1;
                    }
                    AnimatorFrameLayout.this.b();
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f735709c9c2bdba88dc2693b0569bd3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f735709c9c2bdba88dc2693b0569bd3");
                        return;
                    }
                    imageView.setVisibility(8);
                    if (z) {
                        AnimatorFrameLayout.this.e = 2;
                    } else {
                        AnimatorFrameLayout.this.f = 2;
                    }
                    AnimatorFrameLayout.this.a();
                }
            });
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dac83dfb4b5cabe1ce06f2870c40667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dac83dfb4b5cabe1ce06f2870c40667");
        } else if (this.i == null) {
        } else {
            if (this.i.b == 4 && this.e == 2) {
                if (this.h != null) {
                    this.h.setVisibility(0);
                }
                a(this.h, this.i.d, (b.d) null);
            } else if (this.i.b == 6 && this.e == 2 && this.f == 2) {
                if (this.h != null) {
                    this.h.setVisibility(0);
                }
                a(this.h, this.i.d, (b.d) null);
            } else if (this.i.b == 7 && this.e == 2 && this.f == 2) {
                if (this.h != null) {
                    this.h.setVisibility(0);
                }
            } else if (this.i.b == 8 && (this.e == 2 || this.f == 2)) {
                a(this.h, this.i.d, (b.d) null);
            }
            j();
            c();
        }
    }

    private void a(ImageView imageView, String str, final b.d dVar) {
        Object[] objArr = {imageView, str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf211336eb60f7745407e26a90c8f182", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf211336eb60f7745407e26a90c8f182");
        } else if (TextUtils.isEmpty(str)) {
            if (dVar != null) {
                dVar.a(0, new Exception("url is empty"));
            }
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = getContext();
            a2.d = R.drawable.wm_common_good_img_default;
            a2.a(imageView);
        } else {
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = getContext();
            a3.c = str;
            a3.i = R.drawable.wm_common_poi_list_poi_icon;
            a3.j = R.drawable.wm_common_good_img_default;
            a3.a(com.meituan.roodesign.widgets.internal.a.a(getContext(), 108.0f)).a(new b.d() { // from class: com.sankuai.waimai.business.page.common.list.animate.AnimatorFrameLayout.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d553cbdeaa266d8ea4a6f22a33598cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d553cbdeaa266d8ea4a6f22a33598cb");
                    } else if (dVar != null) {
                        dVar.a();
                    }
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.d
                public final void a(int i, Exception exc) {
                    Object[] objArr2 = {Integer.valueOf(i), exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3195cae80e66cbaa9cb2ae3b14e32b73", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3195cae80e66cbaa9cb2ae3b14e32b73");
                    } else if (dVar != null) {
                        dVar.a(i, exc);
                    }
                }
            }).a(imageView);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dd59d0acc63a109ebcb9f4ec0866f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dd59d0acc63a109ebcb9f4ec0866f2");
            return;
        }
        super.onWindowVisibilityChanged(i);
        this.l = i == 0;
        if (this.l) {
            b();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2074a96918b47a28ec00a059976640b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2074a96918b47a28ec00a059976640b1");
            return;
        }
        j();
        c();
        if (this.l && this.i != null) {
            try {
                if (this.i.b == 4 && this.e == 1) {
                    d();
                } else if (this.i.b == 6 && this.e == 1 && this.f == 1) {
                    if (this.i.c == 5) {
                        e();
                    } else if (this.i.c == 3) {
                        f();
                    } else if (this.j.nextBoolean()) {
                        e();
                    } else {
                        f();
                    }
                } else if (this.i.b == 7 && this.e == 1 && this.f == 1) {
                    if (this.i.c == 4) {
                        g();
                    } else if (this.i.c == 6) {
                        h();
                    } else if (this.j.nextBoolean()) {
                        g();
                    } else {
                        h();
                    }
                } else if (this.i.b == 8 && this.e == 1 && this.f == 1 && this.i.c == 7) {
                    this.d.post(new Runnable() { // from class: com.sankuai.waimai.business.page.common.list.animate.AnimatorFrameLayout.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04c9ae29febc20157ef8cfe92cb42489", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04c9ae29febc20157ef8cfe92cb42489");
                            } else {
                                AnimatorFrameLayout.a(AnimatorFrameLayout.this);
                            }
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f445d691817f62021a65d6f278b579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f445d691817f62021a65d6f278b579");
            return;
        }
        c(this.h);
        c(this.g);
        b(this.h);
        b(this.g);
        this.n.setAlpha(1.0f);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        if (a(this.g, this.q)) {
            this.q = -1;
        }
        this.g.setAllowAnimator(false);
    }

    private boolean a(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83ef26ec5f991fafad365c791c05e91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83ef26ec5f991fafad365c791c05e91")).booleanValue();
        }
        if (view == null || i == -1 || !(view.getParent() instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (i > viewGroup.getChildCount()) {
            return false;
        }
        if (viewGroup.indexOfChild(view) != i) {
            viewGroup.removeView(view);
            viewGroup.addView(view, i);
        }
        return true;
    }

    private int a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d317d8c5d5d6b5c2caadbe1a9ce86b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d317d8c5d5d6b5c2caadbe1a9ce86b7")).intValue();
        }
        if (view == null) {
            return -1;
        }
        int indexOfChild = view.getParent() instanceof ViewGroup ? ((ViewGroup) view.getParent()).indexOfChild(view) : -1;
        view.bringToFront();
        return indexOfChild;
    }

    private void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a58a0c626fa2dc838a529496d4f6572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a58a0c626fa2dc838a529496d4f6572");
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    private void c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ef99a9cab68574c43f9f9d277ad576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ef99a9cab68574c43f9f9d277ad576");
            return;
        }
        int a2 = com.meituan.roodesign.widgets.internal.a.a(getContext(), 108.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = a2;
        layoutParams.height = a2;
        view.setLayoutParams(layoutParams);
        float f = a2 / 2;
        view.setPivotX(f);
        view.setPivotY(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
        if (java.lang.Math.abs(r0) > r14) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
        if (java.lang.Math.abs(r0) > r14) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float[] a(android.widget.ImageView r21, int[] r22, int[] r23, int[] r24, float[] r25) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.common.list.animate.AnimatorFrameLayout.a(android.widget.ImageView, int[], int[], int[], float[]):float[]");
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f618f687ebb859a17546a211481e935", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f618f687ebb859a17546a211481e935");
            return;
        }
        AnimatorProductBean animatorProductBean = this.i.e.get(0);
        AnimatorPicInfoBean parsePicInfo = animatorProductBean.parsePicInfo();
        AnimatorTypeBean animatorTypeBean = animatorProductBean.parseAnimateConf().animType;
        long[] jArr = animatorTypeBean.scaleType.time;
        long[] jArr2 = animatorTypeBean.transType.time;
        long a2 = com.meituan.roodesign.widgets.animator.a.a(jArr, jArr2);
        int[] iArr = parsePicInfo.picResolution;
        int[] iArr2 = parsePicInfo.dishesCenter;
        float[] fArr = animatorTypeBean.scaleType.prop;
        float[] a3 = a(this.h, new int[]{0, 1}, iArr, iArr2, fArr);
        if (a3 == null) {
            return;
        }
        com.meituan.roodesign.widgets.animator.b c = b.a.a().c();
        c.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c.a(a2);
        a4.f = RecceAnimUtils.SCALE_X;
        a4.c = fArr;
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a5 = c2.a(a2);
        a5.f = RecceAnimUtils.SCALE_Y;
        a5.c = fArr;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a6 = c3.a(a2);
        a6.f = RecceAnimUtils.TRANSLATION_X;
        a6.c = new float[]{a3[2], a3[0]};
        a6.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a7 = c4.a(a2);
        a7.f = RecceAnimUtils.TRANSLATION_Y;
        a7.c = new float[]{a3[3], a3[1]};
        a7.d = 1.0f;
        ValueAnimator a8 = a(a4);
        ValueAnimator a9 = a(a5);
        ValueAnimator a10 = a(a6);
        ValueAnimator a11 = a(a7);
        if (a8 != null) {
            a8.setTarget(this.h);
        }
        if (a9 != null) {
            a9.setTarget(this.h);
        }
        if (a10 != null) {
            a10.setTarget(this.h);
        }
        if (a11 != null) {
            a11.setTarget(this.h);
        }
        i();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86479c3596431741707f3b1c45e31f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86479c3596431741707f3b1c45e31f4");
            return;
        }
        AnimatorUpDownBean animatorUpDownBean = this.i.e.get(0).parseAnimateConf().fadingInandOut;
        long[] jArr = animatorUpDownBean.upAnim.scaleType.time;
        long[] jArr2 = animatorUpDownBean.upAnim.alphaType.time;
        long[] jArr3 = animatorUpDownBean.downAnim.scaleType.time;
        long a2 = com.meituan.roodesign.widgets.animator.a.a(jArr, jArr2, jArr3);
        float[] fArr = animatorUpDownBean.upAnim.scaleType.prop;
        float[] fArr2 = animatorUpDownBean.upAnim.alphaType.prop;
        float[] fArr3 = animatorUpDownBean.downAnim.scaleType.prop;
        com.meituan.roodesign.widgets.animator.b c = b.a.a().c();
        c.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c.a(a2);
        a3.f = RecceAnimUtils.SCALE_X;
        a3.c = fArr;
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c2.a(a2);
        a4.f = RecceAnimUtils.SCALE_Y;
        a4.c = fArr;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a5 = c3.a(a2);
        a5.f = "alpha";
        a5.c = fArr2;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr3;
        com.meituan.roodesign.widgets.animator.b a6 = c4.a(a2);
        a6.f = RecceAnimUtils.SCALE_X;
        a6.c = fArr3;
        com.meituan.roodesign.widgets.animator.b c5 = b.a.a().c();
        c5.b = jArr3;
        com.meituan.roodesign.widgets.animator.b a7 = c5.a(a2);
        a7.f = RecceAnimUtils.SCALE_Y;
        a7.c = fArr3;
        ValueAnimator a8 = a(a3);
        ValueAnimator a9 = a(a4);
        ValueAnimator a10 = a(a5);
        ValueAnimator a11 = a(a6);
        ValueAnimator a12 = a(a7);
        if (a8 != null) {
            a8.setTarget(this.h);
        }
        if (a9 != null) {
            a9.setTarget(this.h);
        }
        if (a10 != null) {
            a10.setTarget(this.h);
        }
        if (a11 != null) {
            a11.setTarget(this.g);
        }
        if (a12 != null) {
            a12.setTarget(this.g);
        }
        i();
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b53b81a9fa9cf3d98ef806203133e7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b53b81a9fa9cf3d98ef806203133e7f");
            return;
        }
        AnimatorProductBean animatorProductBean = this.i.e.get(0);
        AnimatorPicInfoBean parsePicInfo = animatorProductBean.parsePicInfo();
        AnimatorUpDownBean animatorUpDownBean = animatorProductBean.parseAnimateConf().fadingIn;
        long[] jArr = animatorUpDownBean.upAnim.scaleType.time;
        long[] jArr2 = animatorUpDownBean.upAnim.alphaType.time;
        long[] jArr3 = animatorUpDownBean.downAnim.scaleType.time;
        long[] jArr4 = animatorUpDownBean.downAnim.transType.time;
        long a2 = com.meituan.roodesign.widgets.animator.a.a(jArr, jArr2, jArr3, jArr4);
        int[] iArr = parsePicInfo.picResolution;
        int[] iArr2 = parsePicInfo.dishesCenter;
        float[] fArr = animatorUpDownBean.upAnim.scaleType.prop;
        float[] fArr2 = animatorUpDownBean.upAnim.alphaType.prop;
        float[] fArr3 = animatorUpDownBean.downAnim.scaleType.prop;
        float[] a3 = a(this.g, new int[]{1, 0}, iArr, iArr2, fArr3);
        com.meituan.roodesign.widgets.animator.b c = b.a.a().c();
        c.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c.a(a2);
        a4.f = RecceAnimUtils.SCALE_X;
        a4.c = fArr;
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a5 = c2.a(a2);
        a5.f = RecceAnimUtils.SCALE_Y;
        a5.c = fArr;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a6 = c3.a(a2);
        a6.f = "alpha";
        a6.c = fArr2;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr3;
        com.meituan.roodesign.widgets.animator.b a7 = c4.a(a2);
        a7.f = RecceAnimUtils.SCALE_X;
        a7.c = fArr3;
        com.meituan.roodesign.widgets.animator.b c5 = b.a.a().c();
        c5.b = jArr3;
        com.meituan.roodesign.widgets.animator.b a8 = c5.a(a2);
        a8.f = RecceAnimUtils.SCALE_Y;
        a8.c = fArr3;
        com.meituan.roodesign.widgets.animator.b c6 = b.a.a().c();
        c6.b = jArr4;
        com.meituan.roodesign.widgets.animator.b a9 = c6.a(a2);
        a9.f = RecceAnimUtils.TRANSLATION_X;
        a9.c = new float[]{a3[2], a3[0], a3[0]};
        a9.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c7 = b.a.a().c();
        c7.b = jArr4;
        com.meituan.roodesign.widgets.animator.b a10 = c7.a(a2);
        a10.f = RecceAnimUtils.TRANSLATION_Y;
        a10.c = new float[]{a3[3], a3[1], a3[1]};
        a10.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c8 = b.a.a().c();
        c8.b = new long[]{800, 805, 1400};
        com.meituan.roodesign.widgets.animator.b a11 = c8.a(a2);
        a11.f = "alpha";
        a11.c = new float[]{0.0f, 60.0f, 0.0f};
        ValueAnimator a12 = a(a4);
        ValueAnimator a13 = a(a5);
        ValueAnimator a14 = a(a6);
        ValueAnimator a15 = a(a7);
        ValueAnimator a16 = a(a8);
        ValueAnimator a17 = a(a9);
        ValueAnimator a18 = a(a10);
        ValueAnimator a19 = a(a11);
        if (a12 != null) {
            a12.setTarget(this.h);
        }
        if (a13 != null) {
            a13.setTarget(this.h);
        }
        if (a14 != null) {
            a14.setTarget(this.h);
        }
        if (a15 != null) {
            a15.setTarget(this.g);
        }
        if (a16 != null) {
            a16.setTarget(this.g);
        }
        if (a17 != null) {
            a17.setTarget(this.g);
        }
        if (a18 != null) {
            a18.setTarget(this.g);
        }
        this.p.setVisibility(0);
        if (a19 != null) {
            a19.setTarget(this.p);
        }
        i();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c7a22b50a540fe2dedb139db284c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c7a22b50a540fe2dedb139db284c97");
            return;
        }
        AnimatorUpDownBean animatorUpDownBean = this.i.e.get(0).parseAnimateConf().fadingOut;
        long[] jArr = animatorUpDownBean.upAnim.scaleType.time;
        long[] jArr2 = animatorUpDownBean.upAnim.alphaType.time;
        long[] jArr3 = {800, 1200, 1600};
        long a2 = com.meituan.roodesign.widgets.animator.a.a(jArr, jArr2, jArr3);
        float[] fArr = animatorUpDownBean.upAnim.scaleType.prop;
        float[] fArr2 = animatorUpDownBean.upAnim.alphaType.prop;
        com.meituan.roodesign.widgets.animator.b c = b.a.a().c();
        c.b = jArr;
        com.meituan.roodesign.widgets.animator.b a3 = c.a(a2);
        a3.f = RecceAnimUtils.SCALE_X;
        a3.c = fArr;
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr;
        com.meituan.roodesign.widgets.animator.b a4 = c2.a(a2);
        a4.f = RecceAnimUtils.SCALE_Y;
        a4.c = fArr;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a5 = c3.a(a2);
        a5.f = "alpha";
        a5.c = fArr2;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr3;
        com.meituan.roodesign.widgets.animator.b a6 = c4.a(a2);
        a6.f = "alpha";
        a6.c = new float[]{0.0f, 90.0f, 100.0f};
        ValueAnimator a7 = a(a3);
        ValueAnimator a8 = a(a4);
        ValueAnimator a9 = a(a5);
        ValueAnimator a10 = a(a6);
        if (a7 != null) {
            a7.setTarget(this.h);
        }
        if (a8 != null) {
            a8.setTarget(this.h);
        }
        if (a9 != null) {
            a9.setTarget(this.n);
        }
        this.o.setVisibility(0);
        if (a10 != null) {
            a10.setTarget(this.o);
        }
        i();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb788713f1ebe6ab5a4eb434bf7bd3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb788713f1ebe6ab5a4eb434bf7bd3e");
            return;
        }
        AnimatorProductBean animatorProductBean = this.i.e.get(0);
        AnimatorPicInfoBean parsePicInfo = animatorProductBean.parsePicInfo();
        AnimatorUpDownBean animatorUpDownBean = animatorProductBean.parseAnimateConf().lightWipe;
        long[] jArr = animatorUpDownBean.upAnim.transType.time;
        long[] jArr2 = animatorUpDownBean.upAnim.scaleType.time;
        long[] jArr3 = animatorUpDownBean.upAnim.alphaType.time;
        long[] jArr4 = animatorUpDownBean.downAnim.scaleType.time;
        long[] jArr5 = {800, 1120, 2300};
        long a2 = com.meituan.roodesign.widgets.animator.a.a(jArr, jArr2, jArr3, jArr4, jArr5);
        int[] iArr = parsePicInfo.picResolution;
        int[] iArr2 = parsePicInfo.dishesCenter;
        float[] fArr = animatorUpDownBean.upAnim.scaleType.prop;
        float[] fArr2 = animatorUpDownBean.upAnim.alphaType.prop;
        float[] fArr3 = animatorUpDownBean.downAnim.scaleType.prop;
        float[] a3 = a(this.h, new int[]{1, 0}, iArr, iArr2, fArr);
        com.meituan.roodesign.widgets.animator.b c = b.a.a().c();
        c.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a4 = c.a(a2);
        a4.f = RecceAnimUtils.SCALE_X;
        a4.c = fArr;
        com.meituan.roodesign.widgets.animator.b c2 = b.a.a().c();
        c2.b = jArr2;
        com.meituan.roodesign.widgets.animator.b a5 = c2.a(a2);
        a5.f = RecceAnimUtils.SCALE_Y;
        a5.c = fArr;
        com.meituan.roodesign.widgets.animator.b c3 = b.a.a().c();
        c3.b = jArr3;
        com.meituan.roodesign.widgets.animator.b a6 = c3.a(a2);
        a6.f = "alpha";
        a6.c = fArr2;
        com.meituan.roodesign.widgets.animator.b c4 = b.a.a().c();
        c4.b = jArr;
        com.meituan.roodesign.widgets.animator.b a7 = c4.a(a2);
        a7.f = RecceAnimUtils.TRANSLATION_X;
        a7.c = new float[]{a3[2], a3[0], a3[0]};
        a7.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c5 = b.a.a().c();
        c5.b = jArr;
        com.meituan.roodesign.widgets.animator.b a8 = c5.a(a2);
        a8.f = RecceAnimUtils.TRANSLATION_Y;
        a8.c = new float[]{a3[3], a3[1], a3[1]};
        a8.d = 1.0f;
        com.meituan.roodesign.widgets.animator.b c6 = b.a.a().c();
        c6.b = jArr4;
        com.meituan.roodesign.widgets.animator.b a9 = c6.a(a2);
        a9.f = RecceAnimUtils.SCALE_X;
        a9.c = fArr3;
        com.meituan.roodesign.widgets.animator.b c7 = b.a.a().c();
        c7.b = jArr4;
        com.meituan.roodesign.widgets.animator.b a10 = c7.a(a2);
        a10.f = RecceAnimUtils.SCALE_Y;
        a10.c = fArr3;
        com.meituan.roodesign.widgets.animator.b c8 = b.a.a().c();
        c8.b = jArr5;
        com.meituan.roodesign.widgets.animator.b a11 = c8.a(a2);
        a11.f = "radius";
        a11.c = new float[]{0.0f, 100.0f, 100.0f};
        ValueAnimator a12 = a(a4);
        ValueAnimator a13 = a(a5);
        ValueAnimator a14 = a(a6);
        ValueAnimator a15 = a(a7);
        ValueAnimator a16 = a(a8);
        ValueAnimator a17 = a(a9);
        ValueAnimator a18 = a(a10);
        ValueAnimator a19 = a(a11);
        if (a12 != null) {
            a12.setTarget(this.h);
        }
        if (a13 != null) {
            a13.setTarget(this.h);
        }
        if (a14 != null) {
            a14.setTarget(this.h);
        }
        if (a15 != null) {
            a15.setTarget(this.h);
        }
        if (a16 != null) {
            a16.setTarget(this.h);
        }
        this.q = a(this.g);
        this.g.setAllowAnimator(true);
        if (a17 != null) {
            a17.setTarget(this.g);
        }
        if (a18 != null) {
            a18.setTarget(this.g);
        }
        if (a19 != null) {
            a19.setTarget(this.g);
        }
        i();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c6609fe98a1acd5596376806a20314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c6609fe98a1acd5596376806a20314");
        } else if (this.c.isEmpty()) {
        } else {
            if (this.k == null) {
                this.k = new AnimatorSet();
            } else {
                this.k.cancel();
            }
            a(this.k, this.c.values());
            this.k.start();
        }
    }

    private <T extends Animator> void a(AnimatorSet animatorSet, Collection<T> collection) {
        Object[] objArr = {animatorSet, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf376ec8ce259152c72f51b193890db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf376ec8ce259152c72f51b193890db");
            return;
        }
        if (collection != null && collection.size() > 0) {
            AnimatorSet.Builder builder = null;
            for (T t : collection) {
                if (builder == null) {
                    builder = animatorSet.play(t);
                } else {
                    builder.with(t);
                }
            }
        }
        animatorSet.start();
    }

    private ValueAnimator a(com.meituan.roodesign.widgets.animator.b bVar) {
        List<ValueAnimator> list;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e33dad27b0f3c05e7ed3d12be22e5d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ValueAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e33dad27b0f3c05e7ed3d12be22e5d7");
        }
        if (bVar == null) {
            return null;
        }
        ValueAnimator remove = (!b.containsKey(bVar) || (list = b.get(bVar)) == null || list.isEmpty()) ? null : list.remove(list.size() - 1);
        if (remove == null) {
            remove = com.meituan.roodesign.widgets.animator.a.a().a(bVar);
        }
        if (remove == null) {
            return null;
        }
        remove.setRepeatCount(-1);
        this.c.put(bVar, remove);
        return remove;
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16fb9616a7cbcbd2b699529adc33fcf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16fb9616a7cbcbd2b699529adc33fcf5");
        } else if (!this.c.isEmpty()) {
            for (Map.Entry<com.meituan.roodesign.widgets.animator.b, ValueAnimator> entry : this.c.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    a(entry.getKey(), entry.getValue());
                }
            }
            this.c.clear();
        }
    }

    private void a(com.meituan.roodesign.widgets.animator.b bVar, ValueAnimator valueAnimator) {
        Object[] objArr = {bVar, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14374468a76ef1fac6acd3ebd2cf0eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14374468a76ef1fac6acd3ebd2cf0eb");
        } else if (bVar == null || valueAnimator == null) {
        } else {
            valueAnimator.cancel();
            if (m <= 0) {
                return;
            }
            List<ValueAnimator> list = b.get(bVar);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(valueAnimator);
                b.put(bVar, arrayList);
            } else if (list.size() < m) {
                list.add(valueAnimator);
            }
        }
    }
}
