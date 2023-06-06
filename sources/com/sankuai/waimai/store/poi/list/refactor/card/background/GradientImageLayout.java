package com.sankuai.waimai.store.poi.list.refactor.card.background;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class GradientImageLayout extends RelativeLayout {
    public static ChangeQuickRedirect a;
    final a b;
    private List<ImageView> c;
    private List<Animation> d;
    private List<Animation> e;
    private Context f;
    private LinearLayout g;
    private LinearLayout h;
    private long i;
    private long j;
    private int k;

    public GradientImageLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc861fb1d1561283053737d9dac79b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc861fb1d1561283053737d9dac79b4");
        }
    }

    public GradientImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75eb5a7f61258094068f332417dc7195", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75eb5a7f61258094068f332417dc7195");
            return;
        }
        this.i = 300L;
        this.j = 300L;
        this.b = new a(this);
        this.f = context;
    }

    private static int a(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c2eafe83efc7c5b96bd227bc47fab99", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c2eafe83efc7c5b96bd227bc47fab99")).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setImageList(List<ImageView> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec91105a40dcdcf11bd6f49ccb726ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec91105a40dcdcf11bd6f49ccb726ce");
            return;
        }
        if (!com.sankuai.shangou.stone.util.a.b(this.c)) {
            removeAllViews();
        }
        this.c = list;
        int size = list.size() - 1;
        while (size >= 0) {
            ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            if (list.get(size) != null) {
                list.get(size).setVisibility(size == 0 ? 0 : 8);
            }
            addView(list.get(size), layoutParams);
            size--;
        }
        this.k = 0;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe7144e9ba5700e9883e740a2b07d73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe7144e9ba5700e9883e740a2b07d73e");
        } else if (this.c != null && this.c.size() > 0) {
            this.g = new LinearLayout(this.f);
            this.g.setOrientation(1);
            this.g.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{d.a("#00F5F5F6", 0), d.a("#FFF5F5F6", 0)});
            this.g.setBackground(gradientDrawable);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, h.a(this.f, 105.0f));
            layoutParams2.bottomMargin = a(this.f, 43.0f);
            layoutParams2.addRule(12);
            addView(this.g, layoutParams2);
            this.h = new LinearLayout(this.f);
            this.h.setOrientation(1);
            this.h.setGravity(17);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColors(new int[]{d.a("#FFF5F5F6", 0), d.a("#FFF5F5F6", 0)});
            this.h.setBackground(gradientDrawable2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, h.a(this.f, 43.0f));
            layoutParams3.bottomMargin = a(this.f, 0.0f);
            layoutParams3.addRule(12);
            addView(this.h, layoutParams3);
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.animation.Animation] */
    /* JADX WARN: Type inference failed for: r2v7, types: [android.view.animation.AnimationSet] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, android.view.animation.Animation] */
    private void a() {
        AnimationSet animationSet;
        ?? animationSet2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ba10984d2ec9b10a27860a87e75794", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ba10984d2ec9b10a27860a87e75794");
            return;
        }
        this.d = new ArrayList();
        this.e = new ArrayList();
        for (int i = 0; i < this.c.size(); i++) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a98f856c0e69dd54cc2ad605342406d", RobustBitConfig.DEFAULT_VALUE)) {
                animationSet = (Animation) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a98f856c0e69dd54cc2ad605342406d");
            } else {
                AnimationSet animationSet3 = new AnimationSet(false);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(this.j);
                alphaAnimation.setInterpolator(new DecelerateInterpolator());
                animationSet3.addAnimation(alphaAnimation);
                animationSet = animationSet3;
            }
            animationSet.setFillAfter(true);
            this.d.add(animationSet);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4dee45f6ad25fb091e08f9e85b0ffc3a", RobustBitConfig.DEFAULT_VALUE)) {
                animationSet2 = (Animation) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4dee45f6ad25fb091e08f9e85b0ffc3a");
            } else {
                animationSet2 = new AnimationSet(false);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation2.setDuration(this.i);
                alphaAnimation2.setInterpolator(new LinearInterpolator());
                animationSet2.addAnimation(alphaAnimation2);
            }
            animationSet2.setFillAfter(true);
            this.e.add(animationSet2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a extends Handler {
        private WeakReference<GradientImageLayout> a;

        public a(GradientImageLayout gradientImageLayout) {
            this.a = new WeakReference<>(gradientImageLayout);
        }
    }
}
