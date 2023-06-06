package com.sankuai.waimai.guidepop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.GravityCompat;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.guidepop.GuidePopInfo;
import com.sankuai.waimai.guidepop.widget.GuideFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    int e;
    public b f;
    public GuideFrameLayout g;
    public ImageView h;
    public FrameLayout i;
    public ImageView j;
    public ImageView k;
    public ImageView l;
    public ImageView m;
    public ImageView n;
    public View o;
    FrameLayout p;
    boolean q;
    float r;
    float s;
    GuidePopInfo.GuidePopData t;
    private boolean u;

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.u = true;
        return true;
    }

    public a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba5ebac3bc2a8a993193ab34682643a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba5ebac3bc2a8a993193ab34682643a5");
        } else {
            this.f = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bde3c823ad429c0fdf9483cb8a02675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bde3c823ad429c0fdf9483cb8a02675");
        } else if (this.s <= 0.0f || this.r <= 0.0f) {
        } else {
            GuideFrameLayout guideFrameLayout = this.g;
            int i = (int) (this.r - (this.b / 2.0f));
            int i2 = (int) (this.s - (this.b / 2.0f));
            int i3 = this.b;
            int i4 = this.b;
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = GuideFrameLayout.a;
            if (PatchProxy.isSupport(objArr2, guideFrameLayout, changeQuickRedirect2, false, "4e7611d383c785a344595570e790dcae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, guideFrameLayout, changeQuickRedirect2, false, "4e7611d383c785a344595570e790dcae");
            } else {
                guideFrameLayout.setBackground(new com.sankuai.waimai.guidepop.widget.a(new ColorDrawable(guideFrameLayout.b), i, i2, i + i3, i2 + i4));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f281ca66b7d69a42ef69a7ab1bf21f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f281ca66b7d69a42ef69a7ab1bf21f");
        } else if (view == this.l) {
            this.f.d();
        } else if (view == this.j) {
            Context context = this.j.getContext();
            String str = this.t.linkUrl;
            Object[] objArr2 = {context, str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.guidepop.utils.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e0cf9d26ee46144ad3150fd66c9c3450", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e0cf9d26ee46144ad3150fd66c9c3450");
            } else {
                com.sankuai.waimai.guidepop.utils.b.a("[pageJump] linkUrl:" + str);
                if (!TextUtils.isEmpty(str)) {
                    com.sankuai.waimai.foundation.router.a.a(context, str);
                }
            }
            this.f.e();
            if (this.f.b.c != null) {
                this.f.b.c.a(this.f);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416eb087a360af2b05e87e454e02fe24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416eb087a360af2b05e87e454e02fe24");
            return;
        }
        com.sankuai.waimai.guidepop.utils.b.b("[refreshLayout]");
        int height = this.g.getHeight();
        int width = this.g.getWidth();
        if (height == 0 || width == 0) {
            com.sankuai.waimai.guidepop.utils.b.a("[refreshLayout]  mActivityRootView.getHeight()：" + this.p.getHeight());
            com.sankuai.waimai.guidepop.utils.b.a("[refreshLayout]  screenHeight：" + height + "，screenWidth：" + width);
        } else if (!this.o.isAttachedToWindow()) {
            com.sankuai.waimai.guidepop.utils.b.a("[refreshLayout] mAnchorView.isAttachedToWindow() == false");
            c();
        } else {
            int[] iArr = new int[2];
            this.o.getLocationOnScreen(iArr);
            if (iArr[0] == 0 && iArr[1] == 0) {
                com.sankuai.waimai.guidepop.utils.b.a("[refreshLayout] mAnchorView.getLocationOnScreen X、Y == 0");
                c();
            } else if (!this.o.isShown()) {
                com.sankuai.waimai.guidepop.utils.b.a("[refreshLayout] mAnchorView.isShown() == false");
                c();
            } else {
                float width2 = iArr[0] + (this.o.getWidth() / 2.0f);
                float height2 = iArr[1] + (this.o.getHeight() / 2.0f);
                com.sankuai.waimai.guidepop.utils.b.b("[refreshLayout] centerX:" + width2 + ", centerY:" + height2);
                if (width2 <= 0.0f || height2 <= 0.0f) {
                    com.sankuai.waimai.guidepop.utils.b.a("[refreshLayout] error！ View is not in screen.");
                    this.f.e();
                } else if (this.r == width2 && this.s == height2) {
                    com.sankuai.waimai.guidepop.utils.b.b("[refreshLayout] location no change.");
                } else {
                    this.r = width2;
                    this.s = height2;
                    if (this.u) {
                        b();
                    }
                    if (height2 > height / 2.0f) {
                        this.q = true;
                        this.i.setY(((height2 - (this.c / 2.0f)) - this.d) - this.i.getHeight());
                        this.m.setY(((height2 - (this.c / 2.0f)) - this.e) - this.m.getHeight());
                        this.n.setY(this.i.getY());
                        this.m.setRotationX(180.0f);
                        this.k.setVisibility(this.i.getY() < 0.0f ? 8 : 0);
                    } else {
                        this.q = false;
                        this.i.setY((this.c / 2.0f) + height2);
                        this.m.setY((this.c / 2.0f) + height2 + this.e);
                        this.n.setY((this.i.getY() + this.i.getHeight()) - this.n.getLayoutParams().height);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.k.getLayoutParams();
                        if (width2 > width / 2.0f) {
                            layoutParams.gravity = GravityCompat.START;
                        } else {
                            layoutParams.gravity = GravityCompat.END;
                        }
                    }
                    this.n.setX((this.g.getWidth() / 2.0f) - (this.n.getLayoutParams().width / 2.0f));
                    this.h.setY(height2 - (this.b / 2.0f));
                    this.h.setX(width2 - (this.b / 2.0f));
                    this.m.setX(width2 - (this.m.getWidth() / 2.0f));
                }
            }
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef155078e38775c73226b79fd724e30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef155078e38775c73226b79fd724e30");
            return;
        }
        View a2 = com.sankuai.waimai.guidepop.utils.c.a(this.p, this.t.locationArea, this.t.locationFlag);
        com.sankuai.waimai.guidepop.utils.b.b("[refreshLayout-onViewStateChanged] error！ mAnchorView:" + this.o);
        com.sankuai.waimai.guidepop.utils.b.b("[refreshLayout-onViewStateChanged] error！ newAV:" + a2);
        if (a2 != null && a2 != this.o) {
            this.o = a2;
            this.f.c = this.o;
            return;
        }
        this.f.e();
    }

    public final void a(final AnimatorListenerAdapter animatorListenerAdapter) {
        Object[] objArr = {animatorListenerAdapter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635ad79148cc484d484078471ad287b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635ad79148cc484d484078471ad287b8");
            return;
        }
        FrameLayout frameLayout = this.i;
        boolean z = this.q;
        AnimatorListenerAdapter animatorListenerAdapter2 = new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.guidepop.a.3
            public static ChangeQuickRedirect a;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                float y;
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "501747c3caff90f0d814fbb4caad8dc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "501747c3caff90f0d814fbb4caad8dc3");
                } else if (a.this.g != null && a.this.g.getParent() != null) {
                    a.this.g.setBackgroundColor(0);
                    int childCount = a.this.g.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        a.this.g.getChildAt(i).setVisibility(8);
                    }
                    a aVar = a.this;
                    AnimatorListenerAdapter animatorListenerAdapter3 = animatorListenerAdapter;
                    Object[] objArr3 = {animatorListenerAdapter3};
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e1e866770a652063e15e000d887e6450", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e1e866770a652063e15e000d887e6450");
                        return;
                    }
                    aVar.n.setVisibility(0);
                    float f = aVar.r;
                    float width = aVar.g.getWidth() / 2.0f;
                    boolean z2 = aVar.r > width;
                    float f2 = width / 2.0f;
                    if (z2) {
                        if (aVar.r - width < f2) {
                            f += f2;
                        }
                    } else if (width - aVar.r < f2) {
                        f -= f2;
                    }
                    Path path = new Path();
                    path.moveTo(aVar.n.getX(), aVar.n.getY());
                    if (aVar.q) {
                        y = ((aVar.s - aVar.n.getY()) / 2.0f) + aVar.n.getY();
                    } else {
                        y = ((aVar.n.getY() - aVar.s) / 2.0f) + aVar.s;
                    }
                    ViewGroup.LayoutParams layoutParams = aVar.n.getLayoutParams();
                    path.quadTo(f, y, aVar.r - (layoutParams.width / 2.0f), aVar.s - (layoutParams.height / 2.0f));
                    if (aVar.q) {
                        aVar.n.setRotationX(180.0f);
                    }
                    if (z2) {
                        aVar.n.setRotationY(180.0f);
                    }
                    ImageView imageView = aVar.n;
                    Object[] objArr4 = {imageView, path, animatorListenerAdapter3};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.guidepop.utils.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0682129f3b49f51fa0983a2d3eea36e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0682129f3b49f51fa0983a2d3eea36e5");
                    } else if (imageView != null) {
                        com.sankuai.waimai.guidepop.utils.b.a("[AnimatorHelper-performTranslateAnimator]");
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, View.X, View.Y, path);
                        ofFloat.setInterpolator(new PathInterpolator(0.6f, 0.49f, 0.28f, 0.68f));
                        ofFloat.setDuration(300L);
                        if (animatorListenerAdapter3 != null) {
                            ofFloat.addListener(animatorListenerAdapter3);
                        }
                        ofFloat.start();
                    }
                }
            }
        };
        Object[] objArr2 = {frameLayout, Byte.valueOf(z ? (byte) 1 : (byte) 0), animatorListenerAdapter2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.guidepop.utils.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "36bbd612a8f16ddc9cab3c22b96b4122", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "36bbd612a8f16ddc9cab3c22b96b4122");
        } else if (frameLayout != null) {
            com.sankuai.waimai.guidepop.utils.b.a("[AnimatorHelper-performScaleDismissAnimator]");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, View.SCALE_X, 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout, View.SCALE_Y, 1.0f, 0.0f);
            float y = frameLayout.getY();
            Property property = View.Y;
            float[] fArr = new float[2];
            fArr[0] = y;
            fArr[1] = z ? y - (frameLayout.getHeight() / 2.0f) : y + (frameLayout.getHeight() / 2.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout, property, fArr);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(animatorListenerAdapter2);
            animatorSet.setDuration(400L);
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
            animatorSet.start();
        }
    }
}
