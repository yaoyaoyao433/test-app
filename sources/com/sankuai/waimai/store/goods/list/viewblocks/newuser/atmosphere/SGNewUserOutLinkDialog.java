package com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.airbnb.lottie.f;
import com.airbnb.lottie.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.SGNewUserAnimatorModel;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere.SGNewUserOutLinkDialogTemplateData;
import com.sankuai.waimai.store.goods.list.viewblocks.newuser.raptor.SGNewUserAnimatorRate;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGNewUserOutLinkDialog extends SCBaseDialog implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, View.OnClickListener {
    public static ChangeQuickRedirect a;
    protected LottieAnimationView b;
    protected ImageView c;
    protected boolean d;
    protected boolean e;
    protected boolean f;
    protected long g;
    protected boolean h;
    protected boolean i;
    protected boolean j;
    private SGNewUserAnimatorModel m;
    private SGNewUserAnimatorModel n;
    private SGNewUserAnimatorModel o;
    private int p;
    private long q;
    private SGNewUserOutLinkDialogTemplateData r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    public SGNewUserOutLinkDialog(@NonNull Context context, SGNewUserOutLinkDialogTemplateData sGNewUserOutLinkDialogTemplateData) {
        super(context, R.style.WmStBaseDialogTheme);
        Object[] objArr = {context, sGNewUserOutLinkDialogTemplateData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7eb272625a14e5f2232d14d08959fe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7eb272625a14e5f2232d14d08959fe2");
            return;
        }
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = true;
        this.i = false;
        this.j = false;
        this.p = -1;
        this.q = 0L;
        this.r = sGNewUserOutLinkDialogTemplateData;
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5982207821addfdd5769354ea07c471c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5982207821addfdd5769354ea07c471c");
            return;
        }
        super.onCreate(bundle);
        View inflate = LayoutInflater.from(bB_()).inflate(R.layout.wm_sc_lottie_dialog, (ViewGroup) null);
        setContentView(inflate);
        if (getWindow() != null) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().setWindowAnimations(R.style.WmStNoneAnimation);
            if (Build.VERSION.SDK_INT >= 23) {
                Window window = getWindow();
                window.clearFlags(201326592);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
            }
        }
        if (this.r == null || this.r.responseInfo == 0 || ((SGNewUserOutLinkDialogTemplateData.TemplateData) this.r.responseInfo).redPackage == null) {
            dismiss();
            return;
        }
        this.m = ((SGNewUserOutLinkDialogTemplateData.TemplateData) this.r.responseInfo).redPackage;
        this.n = ((SGNewUserOutLinkDialogTemplateData.TemplateData) this.r.responseInfo).turnTable;
        if (this.n != null) {
            this.n.loopEnd = "0.27";
        }
        a(inflate);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4a686b3356f545683ac760d4fd86d8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4a686b3356f545683ac760d4fd86d8d");
            return;
        }
        view.findViewById(R.id.root_view).setOnClickListener(this);
        this.b = (LottieAnimationView) view.findViewById(R.id.lottie_view);
        this.c = (ImageView) view.findViewById(R.id.iv_close);
        this.b.setOnClickListener(this);
        if (this.h) {
            this.c.setVisibility(0);
            this.c.setOnClickListener(this);
        }
        this.o = this.m;
        this.p = 1;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e1f27456d9acddd98388f973bc4259e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e1f27456d9acddd98388f973bc4259e");
        } else if (this.o == null || TextUtils.isEmpty(this.o.lottieUrl)) {
            dismiss();
        } else {
            f.a(getContext(), this.o.lottieUrl).a(new h<e>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere.SGNewUserOutLinkDialog.2
                public static ChangeQuickRedirect a;

                @Override // com.airbnb.lottie.h
                public final /* synthetic */ void a(e eVar) {
                    e eVar2 = eVar;
                    Object[] objArr2 = {eVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eb5b847cd883c32192a0be6d7606e8c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eb5b847cd883c32192a0be6d7606e8c0");
                        return;
                    }
                    SGNewUserOutLinkDialog.this.b.b(true);
                    SGNewUserOutLinkDialog.this.b.setComposition(eVar2);
                    SGNewUserOutLinkDialog.this.b.setRepeatCount(0);
                    SGNewUserOutLinkDialog.this.b.b.b.addUpdateListener(SGNewUserOutLinkDialog.this);
                    SGNewUserOutLinkDialog.this.b.a(SGNewUserOutLinkDialog.this);
                    SGNewUserOutLinkDialog.this.b.a();
                }
            }).c(new h<Throwable>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere.SGNewUserOutLinkDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.airbnb.lottie.h
                public final /* synthetic */ void a(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8be94db0c5653c466c0edaabd9a4c4de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8be94db0c5653c466c0edaabd9a4c4de");
                        return;
                    }
                    if (SGNewUserOutLinkDialog.this.p != 1) {
                        if (SGNewUserOutLinkDialog.this.p == 2) {
                            com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserAnimatorRate.SGNewUserAnimatorTurnError, null, false, th2.toString());
                        }
                    } else {
                        com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserAnimatorRate.SGNewUserAnimatorRedError, null, false, th2.toString());
                    }
                    th2.printStackTrace();
                    SGNewUserOutLinkDialog.this.dismiss();
                }
            });
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99b5c56b10a585a9c8cb8596b4619c0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99b5c56b10a585a9c8cb8596b4619c0c");
        } else {
            dismiss();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae7004f8a7400e8d701135e7f4ae81b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae7004f8a7400e8d701135e7f4ae81b");
        } else if (this.p == 1) {
            this.q = System.currentTimeMillis();
            com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserAnimatorRate.SGNewUserAnimatorRedEnvelop, null, true, "");
            b.b("c_waimai_baopinnative", b.a((Object) bB_()), "b_waimai_ej6nhtba_mv").a();
        } else if (this.p == 2) {
            SGNewUserOutLinkEvent sGNewUserOutLinkEvent = new SGNewUserOutLinkEvent();
            sGNewUserOutLinkEvent.step = 1;
            com.meituan.android.bus.a.a().c(sGNewUserOutLinkEvent);
            com.sankuai.waimai.store.goods.list.utils.e.a(SGNewUserAnimatorRate.SGNewUserAnimatorTurnTable, null, true, "");
            b.b("c_waimai_baopinnative", b.a((Object) bB_()), "b_waimai_3c2abwnp_mv").a();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Object[] objArr = {animator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0575aaceacbd2b4309302231f0c99850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0575aaceacbd2b4309302231f0c99850");
            return;
        }
        this.e = false;
        if (this.p == 1) {
            this.p = 2;
            this.o = this.n;
            a();
        } else if (this.p == 2) {
            d();
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54de22e9c3ce3195029efa3c520000c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54de22e9c3ce3195029efa3c520000c");
        } else if (valueAnimator == null || valueAnimator.getAnimatedValue() == null || this.o == null) {
        } else {
            if (this.p == 1) {
                try {
                    if (((Float) valueAnimator.getAnimatedValue()).floatValue() > this.o.getLoopEnd() && !this.v) {
                        this.v = true;
                        u.c(this.c);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int i = 2;
            if (this.p == 2) {
                try {
                    if (((Float) valueAnimator.getAnimatedValue()).floatValue() > this.o.getLoopEnd() && !this.t) {
                        this.t = true;
                        u.c(this.c);
                    } else if (((Float) valueAnimator.getAnimatedValue()).floatValue() > 0.1f && !this.u) {
                        this.u = true;
                        u.a(this.c);
                    }
                    if (((Float) valueAnimator.getAnimatedValue()).floatValue() <= 0.6f || this.s) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    this.s = true;
                    if (!"1".equals(this.o.type)) {
                        i = 1;
                    }
                    hashMap.put("result_type", Integer.valueOf(i));
                    u.a(this.c);
                    this.w = true;
                    b.b("c_waimai_baopinnative", b.a((Object) bB_()), "b_waimai_3a9yht9f_mv").a(hashMap).a();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262017c1b85a8a567eee088d697059c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262017c1b85a8a567eee088d697059c8")).floatValue();
        }
        if (this.b == null) {
            return 0.0f;
        }
        return this.b.getProgress();
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b92d7909cb6f9d3588614ddf297692d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b92d7909cb6f9d3588614ddf297692d9");
        } else if (this.b == null) {
        } else {
            this.b.setProgress(f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a330b9bf7094fcf099182fd8069ee00a", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a330b9bf7094fcf099182fd8069ee00a");
        } else if (view.getId() == R.id.iv_close) {
            d();
        } else if (view.getId() == R.id.lottie_view) {
            if (this.p == 1 && !this.e && b() < this.o.getLoopEnd()) {
                u.c(this.c);
                b.a(bB_(), "b_waimai_ej6nhtba_mc").a();
                this.e = true;
                a(this.o.getLoopEnd());
            }
            if (this.p == 2 && !this.f && b() < this.o.getLoopEnd()) {
                u.c(this.c);
                b.a(bB_(), "b_waimai_3c2abwnp_mc").a();
                this.f = true;
                a(this.o.getLoopEnd());
            }
            e();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e024b0c8174d00800f6d3e1e6ce42327", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e024b0c8174d00800f6d3e1e6ce42327");
        } else if (e()) {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.newuser.atmosphere.SGNewUserOutLinkDialog.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d062ecb17e5fbb696004546d3aca7e1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d062ecb17e5fbb696004546d3aca7e1e");
                    } else {
                        SGNewUserOutLinkDialog.this.dismiss();
                    }
                }
            }, 300L);
        } else {
            dismiss();
        }
    }

    private boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4945c1e4597d91386c4d604ff977e85d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4945c1e4597d91386c4d604ff977e85d")).booleanValue();
        }
        if (this.w) {
            this.w = false;
            SGNewUserOutLinkEvent sGNewUserOutLinkEvent = new SGNewUserOutLinkEvent();
            sGNewUserOutLinkEvent.step = 2;
            com.meituan.android.bus.a.a().c(sGNewUserOutLinkEvent);
            return true;
        }
        return false;
    }
}
