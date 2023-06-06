package com.sankuai.waimai.business.page.home.actinfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.bubble.d;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.dialog.SafeTouchDialog;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public final Context c;
    public final LayoutInflater d;
    public final ViewGroup e;
    public final Dialog f;
    public boolean g;
    public String h;
    private final View i;
    private final ViewGroup j;
    private final ViewGroup k;
    private final ViewGroup l;
    private Animation m;
    private boolean n;
    private boolean o;
    private View.OnClickListener p;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.actinfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0768a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(Dialog dialog);
    }

    public static /* synthetic */ Animation a(a aVar, Animation animation) {
        aVar.m = null;
        return null;
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "eca782ed3bcfda89f20162c22a674b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "eca782ed3bcfda89f20162c22a674b02");
            return;
        }
        aVar.a();
        aVar.f.dismiss();
        com.sankuai.waimai.touchmatrix.views.b.a().b(aVar.f);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5db594a96749a51500dbd2677d2aa8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5db594a96749a51500dbd2677d2aa8");
        } else if (this.j != null) {
            ((ViewGroup) ((Activity) this.c).getWindow().getDecorView()).removeView(this.j);
        }
    }

    public a(Context context) {
        Dialog safeTouchDialog;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96255b91ef6ce5f5c1b994e0b2258e97", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96255b91ef6ce5f5c1b994e0b2258e97");
            return;
        }
        this.g = false;
        this.n = false;
        this.o = true;
        this.p = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actinfo.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33f76fa4406b04b710d29cbddbcc70bf", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33f76fa4406b04b710d29cbddbcc70bf");
                } else if (a.this.i != null && a.this.m != null) {
                    if (a.this.j != null) {
                        a.this.j.setVisibility(4);
                    }
                    if (view.getId() == R.id.close) {
                        JudasManualManager.a("b_0o5mwhu9").a("c_m84bv26").a();
                    } else if (view.getId() == R.id.layout_bg_top) {
                        JudasManualManager.a("b_fbl7w69q").a("c_m84bv26").a();
                    }
                    a.this.i.startAnimation(a.this.m);
                    a.this.m.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.page.home.actinfo.a.1.1
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
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86e39d3026102a79630b3e0a6ffcfbb4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86e39d3026102a79630b3e0a6ffcfbb4");
                                return;
                            }
                            a.d(a.this);
                            if (d.a().b()) {
                                return;
                            }
                            d.a().a(a.this.h);
                        }
                    });
                    a.a(a.this, null);
                } else {
                    a.d(a.this);
                    a.a(a.this, null);
                }
            }
        };
        this.c = context;
        this.d = LayoutInflater.from(context);
        this.i = this.d.inflate(R.layout.wm_page_main_dialog_layout_activities, (ViewGroup) null);
        this.e = (ViewGroup) this.i.findViewById(R.id.content_panel);
        this.j = (ViewGroup) this.i.findViewById(R.id.layout_bg);
        this.k = (ViewGroup) this.i.findViewById(R.id.layout_bg_immersed);
        this.l = (ViewGroup) this.i.findViewById(R.id.layout_bg_top);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22fb0c44468b8d2f6d0d3f894541a617", RobustBitConfig.DEFAULT_VALUE)) {
            safeTouchDialog = (Dialog) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22fb0c44468b8d2f6d0d3f894541a617");
        } else {
            safeTouchDialog = new SafeTouchDialog(this.c, 2131559201);
            safeTouchDialog.getWindow().setLayout(-1, -2);
            safeTouchDialog.setContentView(this.i);
            safeTouchDialog.setCancelable(true);
            safeTouchDialog.setCanceledOnTouchOutside(false);
            safeTouchDialog.findViewById(R.id.close).setVisibility(0);
            safeTouchDialog.findViewById(R.id.close).setOnClickListener(this.p);
        }
        this.f = safeTouchDialog;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d8944dadfcd7db3aa44eceef5a0414d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d8944dadfcd7db3aa44eceef5a0414d");
        } else {
            int a2 = g.a(this.c);
            int b2 = g.b(this.c);
            ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
            layoutParams.width = a2;
            layoutParams.height = b2;
            this.l.setLayoutParams(layoutParams);
            this.l.setOnClickListener(this.p);
            this.j.setVisibility(8);
            this.k.setVisibility(8);
        }
        this.m = AnimationUtils.loadAnimation(this.c, R.anim.wm_common_dialog_bottom_out);
    }

    public final Dialog b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40f7d215e65e6f4287253578e0f505c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40f7d215e65e6f4287253578e0f505c3");
        }
        if (this.o) {
            this.f.show();
            com.sankuai.waimai.touchmatrix.views.b.a().a(this.f);
        }
        return this.f;
    }
}
