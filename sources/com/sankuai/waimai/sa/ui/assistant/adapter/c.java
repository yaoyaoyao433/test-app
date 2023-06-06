package com.sankuai.waimai.sa.ui.assistant.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.platform.widget.roundview.RoundedImageView;
import com.sankuai.waimai.sa.model.n;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.log.judas.c<a> {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.sa.model.f b;
    private Context c;
    private int d;

    @Override // com.sankuai.waimai.log.judas.c
    public final /* synthetic */ a a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eeb04c9db21c251822e0f5464edcde5", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eeb04c9db21c251822e0f5464edcde5");
        }
        this.c = viewGroup.getContext();
        return new a(LayoutInflater.from(this.c).inflate(R.layout.wm_smart_assistant_fast_reply_item_view, viewGroup, false));
    }

    @Override // com.sankuai.waimai.log.judas.c
    public final /* synthetic */ void a(ViewGroup viewGroup, int i, a aVar) {
        final a aVar2 = aVar;
        Object[] objArr = {viewGroup, Integer.valueOf(i), aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e73815b6fd5f2526308a6e0eb778780a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e73815b6fd5f2526308a6e0eb778780a");
            return;
        }
        Object[] objArr2 = {viewGroup, aVar2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0131223fb0be69dfc07dea2e3f32449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0131223fb0be69dfc07dea2e3f32449");
        } else if (aVar2 == null || aVar2.a == null) {
        } else {
            if (!this.b.e) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(600L);
                duration.start();
                duration.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.sa.ui.assistant.adapter.c.1
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        Object[] objArr3 = {animator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "53445ef50424f703c6c7d0e22b8eeb84", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "53445ef50424f703c6c7d0e22b8eeb84");
                            return;
                        }
                        super.onAnimationStart(animator);
                        aVar2.a.clearAnimation();
                    }
                });
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.sa.ui.assistant.adapter.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr3 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b809e76d2cfcf9d0cee3994030feb8fb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b809e76d2cfcf9d0cee3994030feb8fb");
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        aVar2.a.setAlpha(floatValue);
                        aVar2.a.setScaleX(floatValue);
                        aVar2.a.setScaleY(floatValue);
                        aVar2.a.setPivotX(aVar2.a.getMeasuredWidth() / 2);
                        aVar2.a.setPivotY(aVar2.a.getMeasuredHeight() / 2);
                        if (Float.compare(floatValue, 0.0f) > 0) {
                            aVar2.a.setVisibility(0);
                        }
                    }
                });
                return;
            }
            aVar2.a.setVisibility(0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(RecyclerView.s sVar, int i) {
        a aVar = (a) sVar;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2579a68c5cefc368a5b17dac487de23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2579a68c5cefc368a5b17dac487de23");
        } else if (this.b == null || com.sankuai.waimai.foundation.utils.b.b(this.b.a)) {
        } else {
            n nVar = this.b.a.get(i);
            if (TextUtils.isEmpty(nVar.e)) {
                aVar.c.setVisibility(8);
            } else {
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.c;
                a2.c = nVar.e;
                a2.a((ImageView) aVar.c);
                aVar.c.setVisibility(0);
            }
            aVar.d.setText(this.b.a.get(i).a);
            if (nVar.g == 1) {
                aVar.e.setVisibility(0);
            } else {
                aVar.e.setVisibility(8);
            }
        }
    }

    public c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a62960f5c96820685b8f568166f7d63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a62960f5c96820685b8f568166f7d63");
        } else {
            this.d = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public final int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cabf35abf1165a5f6a453ec7cf78091", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cabf35abf1165a5f6a453ec7cf78091")).intValue();
        }
        if (this.b == null || com.sankuai.waimai.foundation.utils.b.b(this.b.a) || (1 == this.b.a.size() && 1 == this.b.a.get(0).h)) {
            return 0;
        }
        return this.b.a.size();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends RecyclerView.s {
        public RelativeLayout a;
        public LinearLayout b;
        public RoundedImageView c;
        public TextView d;
        public ImageView e;

        public a(View view) {
            super(view);
            this.a = (RelativeLayout) view.findViewById(R.id.wm_smart_assistant_fast_reply_container);
            this.b = (LinearLayout) view.findViewById(R.id.wm_smart_assistant_fast_reply_ll);
            this.c = (RoundedImageView) view.findViewById(R.id.wm_smart_assistant_fast_reply_img);
            this.d = (TextView) view.findViewById(R.id.wm_smart_assistant_fast_reply_txt);
            this.e = (ImageView) view.findViewById(R.id.wm_smart_assistant_fast_reply_dot);
        }
    }
}
