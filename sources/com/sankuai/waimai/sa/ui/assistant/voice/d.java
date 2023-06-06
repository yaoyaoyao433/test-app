package com.sankuai.waimai.sa.ui.assistant.voice;

import android.animation.AnimatorSet;
import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.sa.ui.assistant.view.RecordWaveView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements RecordWaveView.a, RecordWaveView.c {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.sa.ui.assistant.view.b b;
    int c;
    public RecordWaveView d;
    boolean e;
    private Context f;
    private View g;
    private ImageView h;
    private ImageView i;
    private boolean j;
    private AnimatorSet k;
    private ScaleAnimation l;
    private ScaleAnimation m;
    private int n;
    private Animation o;

    public static /* synthetic */ boolean a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "5d55625d07f7a3974a2d778675663088", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "5d55625d07f7a3974a2d778675663088")).booleanValue();
        }
        if (dVar.n != 2) {
            dVar.b.a();
            return true;
        }
        return false;
    }

    public d(Context context, View view) {
        Object[] objArr = {context, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11893e68055e114d2140bfaf03ab8787", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11893e68055e114d2140bfaf03ab8787");
            return;
        }
        this.c = 0;
        this.j = false;
        this.k = new AnimatorSet();
        this.f = context;
        this.g = view;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2603b3c8ea2518a77672f87ee2f971d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2603b3c8ea2518a77672f87ee2f971d");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27f1c63a8369fc9290d542f0cb390ca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27f1c63a8369fc9290d542f0cb390ca2");
        } else {
            this.h = (ImageView) this.g.findViewById(R.id.mid_view);
            this.i = (ImageView) this.g.findViewById(R.id.mid_flow_view);
            this.d = (RecordWaveView) this.g.findViewById(R.id.record_wave);
            this.d.setRecordWaveInjector(this);
            this.d.setAnimationListener(this);
            this.d.setWaveColor(-15036);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e69ee615e3a98d2e372e31bbdb9c3f1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e69ee615e3a98d2e372e31bbdb9c3f1d");
        } else {
            this.o = AnimationUtils.loadAnimation(this.f, R.anim.wm_smart_assistant_progress_rotate);
            this.k.setInterpolator(new AccelerateDecelerateInterpolator());
            this.m = new ScaleAnimation(1.0f, 0.67f, 1.0f, 0.67f, 1, 0.5f, 1, 0.5f);
            this.m.setDuration(300L);
            this.m.setFillAfter(true);
            this.l = new ScaleAnimation(0.67f, 1.0f, 0.67f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.l.setDuration(300L);
            this.l.setFillAfter(true);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2632c3ae9ac983676378d1d48ff554e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2632c3ae9ac983676378d1d48ff554e2");
            return;
        }
        this.h.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.d.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr6 = {view2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5e869a1513be837ea6144e18bd90cce3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5e869a1513be837ea6144e18bd90cce3");
                } else {
                    d.a(d.this);
                }
            }
        });
        this.h.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.waimai.sa.ui.assistant.voice.d.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                Object[] objArr6 = {view2};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8cfd11f91b4d12f199e498fb79236c07", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8cfd11f91b4d12f199e498fb79236c07")).booleanValue() : d.a(d.this);
            }
        });
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5490d0cedae271309c03b5a5d4e513b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5490d0cedae271309c03b5a5d4e513b");
            return;
        }
        switch (i) {
            case 0:
                this.h.setImageResource(R.drawable.wm_smart_assistant_voice_speaking_icon);
                d();
                return;
            case 1:
                this.h.setImageResource(R.drawable.wm_smart_assistant_voice_defalut_icon);
                e();
                if (this.k.isRunning()) {
                    this.k.end();
                    return;
                }
                return;
            case 2:
                this.i.setVisibility(0);
                this.h.setImageResource(R.drawable.wm_smart_assistant_voice_default_white_icon);
                h();
                return;
            case 3:
                i();
                this.h.setImageResource(R.drawable.wm_smart_assistant_voice_defalut_icon);
                this.i.setVisibility(8);
                return;
            default:
                return;
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16147ff3f34bbf3cc82dbce6471db1eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16147ff3f34bbf3cc82dbce6471db1eb");
            return;
        }
        g();
        this.d.a();
        this.h.startAnimation(this.m);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35b890e882688c8e632e00b49f273ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35b890e882688c8e632e00b49f273ef");
            return;
        }
        this.c = 0;
        f();
        this.d.b();
        this.h.startAnimation(this.l);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451fbf4641e91eb1e0cf95cd235ce630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451fbf4641e91eb1e0cf95cd235ce630");
        } else {
            this.m.cancel();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9347b783c8927b44ab95f09d082642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9347b783c8927b44ab95f09d082642");
        } else {
            this.l.cancel();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750c27e3a10c2664a5d3cb9a7cc523d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750c27e3a10c2664a5d3cb9a7cc523d8");
        } else if (!this.j) {
            a(this.n);
        } else {
            this.j = false;
        }
    }

    public final void a(int i, boolean z) {
        this.n = i;
        this.j = z;
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f8723c9b0250b0d2565c8516b95f2d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f8723c9b0250b0d2565c8516b95f2d2");
            return;
        }
        if (this.e) {
            this.o.setDuration(200L);
        } else {
            this.o.setDuration(1000L);
        }
        this.i.startAnimation(this.o);
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c44718becf37052b5843c31737f3baa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c44718becf37052b5843c31737f3baa4");
        } else {
            this.i.clearAnimation();
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.view.RecordWaveView.c
    public final int b() {
        return (int) (this.c * 1.5f);
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.view.RecordWaveView.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c136c4b8a261b03fcd2bd5d1e0fdc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c136c4b8a261b03fcd2bd5d1e0fdc7");
        } else {
            this.d.setVisibility(8);
        }
    }
}
