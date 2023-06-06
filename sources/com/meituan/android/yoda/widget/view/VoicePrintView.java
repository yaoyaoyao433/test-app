package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VoicePrintView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    private com.meituan.android.yoda.util.c d;
    private VoiceRippleView e;
    private BaseImageView f;
    private BaseImageView g;
    private View h;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(File file);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public VoicePrintView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7f17a873c1f30f859c1f26cf6d4165", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7f17a873c1f30f859c1f26cf6d4165");
        }
    }

    private VoicePrintView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11d9b50b33a707c25aae11159f7191f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11d9b50b33a707c25aae11159f7191f5");
        }
    }

    public VoicePrintView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b34bb5aff74f3bb2e4de226a469206", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b34bb5aff74f3bb2e4de226a469206");
            return;
        }
        this.b = 0L;
        this.c = 0L;
        Object[] objArr2 = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ef6c72888b9d10ac0952b255999b0c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ef6c72888b9d10ac0952b255999b0c64");
        } else {
            View inflate = LayoutInflater.from(context).inflate(R.layout.yoda_widget_voiceprint_layout, (ViewGroup) this, true);
            this.e = (VoiceRippleView) inflate.findViewById(R.id.voice_print_view);
            this.f = (BaseImageView) inflate.findViewById(R.id.voice_icon);
            this.h = inflate.findViewById(R.id.bubble_component);
            this.g = (BaseImageView) inflate.findViewById(R.id.voice_icon_mic);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "96b77237b63cb2c4255042950e9a9030", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "96b77237b63cb2c4255042950e9a9030");
            return;
        }
        this.d = new com.meituan.android.yoda.util.c(getContext());
        this.d.h = this.e;
        this.e.setSampleRate(200L);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d63091e2e13696c9cd215d2b1c51df", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d63091e2e13696c9cd215d2b1c51df")).booleanValue();
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.b = System.currentTimeMillis();
                this.d.a();
                VoiceRippleView voiceRippleView = this.e;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = VoiceRippleView.b;
                if (PatchProxy.isSupport(objArr2, voiceRippleView, changeQuickRedirect2, false, "2139a745b5685fb2a12a3edac8c8e50c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, voiceRippleView, changeQuickRedirect2, false, "2139a745b5685fb2a12a3edac8c8e50c");
                } else {
                    voiceRippleView.c = true;
                    voiceRippleView.invalidate();
                    voiceRippleView.d.start();
                }
                this.f.setImageDrawable(getContext().getResources().getDrawable(R.drawable.yoda_voice_button_pressed));
                this.g.setImageDrawable(getContext().getResources().getDrawable(R.drawable.yoda_voice_button_mic_pressed));
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.tips_faded_out_anim);
                this.h.startAnimation(loadAnimation);
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.yoda.widget.view.VoicePrintView.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr3 = {animation};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f904ec24bfa6e45d004fcf5c377c0678", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f904ec24bfa6e45d004fcf5c377c0678");
                        } else {
                            VoicePrintView.this.h.setVisibility(4);
                        }
                    }
                });
                if (this.i != null) {
                    this.i.a();
                    break;
                }
                break;
            case 1:
                this.c = System.currentTimeMillis();
                VoiceRippleView voiceRippleView2 = this.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = VoiceRippleView.b;
                if (PatchProxy.isSupport(objArr3, voiceRippleView2, changeQuickRedirect3, false, "94a06d614b9c414df307c8f5354dae07", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, voiceRippleView2, changeQuickRedirect3, false, "94a06d614b9c414df307c8f5354dae07");
                } else {
                    voiceRippleView2.c = false;
                    voiceRippleView2.invalidate();
                    voiceRippleView2.d.cancel();
                }
                this.f.setImageDrawable(getContext().getResources().getDrawable(R.drawable.yoda_voice_button_normal));
                this.g.setImageDrawable(getContext().getResources().getDrawable(R.drawable.yoda_voice_button_mic_normal));
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), R.anim.tips_faded_in_anim);
                this.h.startAnimation(loadAnimation2);
                loadAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.android.yoda.widget.view.VoicePrintView.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        Object[] objArr4 = {animation};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "858f5b3096eb2696c88c59a4dd5d4048", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "858f5b3096eb2696c88c59a4dd5d4048");
                        } else {
                            VoicePrintView.this.h.setVisibility(0);
                        }
                    }
                });
                if (this.c - this.b >= 8000) {
                    this.i.c();
                    this.i.b();
                    this.d.a(true);
                    break;
                } else if (this.c - this.b <= ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) {
                    this.i.b();
                    this.i.d();
                    this.d.a(true);
                    break;
                } else {
                    this.i.b();
                    this.d.a(false);
                    break;
                }
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633af1b541ba894fde866cd625a8d267", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633af1b541ba894fde866cd625a8d267")).booleanValue() : super.performClick();
    }

    public void setIVoiceRecordListener(a aVar) {
        this.i = aVar;
    }

    public void setVoiceDataCallback(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f16e22b3bdd61a2f557527df2b140d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f16e22b3bdd61a2f557527df2b140d64");
        } else {
            this.d.k = bVar;
        }
    }
}
