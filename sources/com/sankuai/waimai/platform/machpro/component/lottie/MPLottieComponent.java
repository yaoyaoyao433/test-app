package com.sankuai.waimai.platform.machpro.component.lottie;

import android.animation.Animator;
import android.graphics.Rect;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.e;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.recce.props.gens.ResizeMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.bridge.MPJSCallBack;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.machpro.component.lottie.b;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPLottieComponent extends MPComponent<LottieAnimationView> {
    public static ChangeQuickRedirect a;
    private boolean b;
    private String c;
    private boolean d;
    private String e;
    private int f;
    private int g;
    private boolean h;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ LottieAnimationView createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb70372e398f6f1e749242ed1184f425", RobustBitConfig.DEFAULT_VALUE)) {
            return (LottieAnimationView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb70372e398f6f1e749242ed1184f425");
        }
        MPLottieView mPLottieView = new MPLottieView(this.mMachContext.getContext());
        mPLottieView.setRepeatCount(-1);
        return mPLottieView;
    }

    public MPLottieComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27f0bfb08644416c04479ba1a685433", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27f0bfb08644416c04479ba1a685433");
        } else {
            this.b = true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        char c;
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6513b4e22c62a3ef5ee19ccda8508eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6513b4e22c62a3ef5ee19ccda8508eb");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            switch (str.hashCode()) {
                case 3327652:
                    if (str.equals("loop")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3433509:
                    if (str.equals("path")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1439562083:
                    if (str.equals("autoplay")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 2030705998:
                    if (str.equals("animationData")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 2049757303:
                    if (str.equals(ResizeMode.LOWER_CASE_NAME)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (com.sankuai.waimai.machpro.util.b.d(obj)) {
                        ((LottieAnimationView) this.mView).setRepeatCount(-1);
                        return;
                    } else {
                        ((LottieAnimationView) this.mView).setRepeatCount(0);
                        return;
                    }
                case 1:
                    this.b = com.sankuai.waimai.machpro.util.b.d(obj);
                    return;
                case 2:
                    a(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    return;
                case 3:
                    this.c = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    final b a2 = b.a();
                    String str2 = this.c;
                    final a aVar = new a(this);
                    Object[] objArr2 = {str2, aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = b.a;
                    if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2ca9d3915442680902e677d0f564d6c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2ca9d3915442680902e677d0f564d6c9");
                        return;
                    } else {
                        a2.b.submit(new b.a(a2.a(str2), str2, new b.InterfaceC1062b() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.b.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.platform.machpro.component.lottie.b.InterfaceC1062b
                            public final void a(String str3, String str4) {
                                Object[] objArr3 = {str3, str4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccad7e85bcb012aad3b772cbe2594630", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccad7e85bcb012aad3b772cbe2594630");
                                } else if (TextUtils.isEmpty(str4)) {
                                    b.a(a2, str3, aVar);
                                } else if (aVar != null) {
                                    aVar.a(str3, str4);
                                }
                            }
                        }));
                        return;
                    }
                case 4:
                    this.e = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    return;
                default:
                    super.updateAttribute(str, obj);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70fc6a651caeff137ffad74f5d0c79e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70fc6a651caeff137ffad74f5d0c79e1");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                ((LottieAnimationView) this.mView).setComposition(e.a.a(str));
                this.f = (int) ((LottieAnimationView) this.mView).getMinFrame();
                this.g = (int) ((LottieAnimationView) this.mView).getMaxFrame();
                if (!TextUtils.isEmpty(this.e)) {
                    ((LottieAnimationView) this.mView).post(new Runnable() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.MPLottieComponent.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ec1cb2bbdbd0fc5232a6972e399bee8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ec1cb2bbdbd0fc5232a6972e399bee8");
                                return;
                            }
                            e composition = ((LottieAnimationView) MPLottieComponent.this.mView).getComposition();
                            if (composition != null) {
                                Rect rect = composition.h;
                                float width = (rect.width() * 1.0f) / rect.height();
                                if ("widthFix".equals(MPLottieComponent.this.e)) {
                                    MPLottieComponent.this.mYogaNode.h(((LottieAnimationView) MPLottieComponent.this.mView).getWidth() / width);
                                    MPLottieComponent.this.requestLayout();
                                } else if ("heightFix".equals(MPLottieComponent.this.e)) {
                                    MPLottieComponent.this.mYogaNode.f(((LottieAnimationView) MPLottieComponent.this.mView).getHeight() * width);
                                    MPLottieComponent.this.requestLayout();
                                }
                            }
                        }
                    });
                }
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a("Mach Pro Lottie Json 解析异常：" + e.getMessage());
            }
            if (this.b || this.h) {
                this.h = false;
                ((LottieAnimationView) this.mView).a();
            }
        } else {
            com.sankuai.waimai.machpro.util.a.a("MPLottieComponent jsonContent Empty!!!");
        }
    }

    @JSMethod(methodName = "play")
    @Keep
    public void play() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb12345b7c7ad0900c29aca78ee3d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb12345b7c7ad0900c29aca78ee3d41");
        } else if (((LottieAnimationView) this.mView).getComposition() == null) {
            this.h = true;
        } else {
            ((LottieAnimationView) this.mView).a(this.f, this.g);
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79d90d9aa1471f0ad2d8440f8940fd23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79d90d9aa1471f0ad2d8440f8940fd23");
            return;
        }
        if (this.d) {
            ((LottieAnimationView) this.mView).b();
        } else {
            ((LottieAnimationView) this.mView).a();
        }
        this.d = false;
    }

    @JSMethod(methodName = "stop")
    @Keep
    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72212ef92b135c673c8ac12dc20a66e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72212ef92b135c673c8ac12dc20a66e8");
        } else if (((LottieAnimationView) this.mView).getComposition() == null) {
        } else {
            ((LottieAnimationView) this.mView).e();
        }
    }

    @JSMethod(methodName = "pause")
    @Keep
    public void pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c385cd5a4d56ec710e85288b51f0f178", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c385cd5a4d56ec710e85288b51f0f178");
        } else if (((LottieAnimationView) this.mView).getComposition() == null) {
        } else {
            this.d = true;
            ((LottieAnimationView) this.mView).f();
        }
    }

    @JSMethod(methodName = "playSegment")
    @Keep
    public void playSegment(MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7284793fabbbb22e29ad89eabd05f864", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7284793fabbbb22e29ad89eabd05f864");
        } else if (machMap == null || ((LottieAnimationView) this.mView).getComposition() == null) {
        } else {
            ((LottieAnimationView) this.mView).a(this.f, this.g);
            ((LottieAnimationView) this.mView).a(com.sankuai.waimai.machpro.util.b.c(machMap.get("from")), com.sankuai.waimai.machpro.util.b.c(machMap.get(RemoteMessageConst.TO)));
            ((LottieAnimationView) this.mView).a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.MPLottieComponent.2
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf658dbedfd0d3277eba5ed656bf0fbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf658dbedfd0d3277eba5ed656bf0fbf");
                        return;
                    }
                    ((LottieAnimationView) MPLottieComponent.this.mView).b(this);
                    if (mPJSCallBack != null) {
                        MachMap machMap2 = new MachMap();
                        machMap2.put("animationFinished", Boolean.TRUE);
                        mPJSCallBack.invoke(machMap2);
                    }
                }
            });
            a();
        }
    }

    @JSMethod(methodName = "playTo")
    @Keep
    public void playTo(MachMap machMap, final MPJSCallBack mPJSCallBack) {
        Object[] objArr = {machMap, mPJSCallBack};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74be332c27733995b112e3c6a7a17d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74be332c27733995b112e3c6a7a17d72");
        } else if (machMap == null || ((LottieAnimationView) this.mView).getComposition() == null) {
        } else {
            ((LottieAnimationView) this.mView).a(this.f, this.g);
            ((LottieAnimationView) this.mView).setMaxFrame(com.sankuai.waimai.machpro.util.b.c(machMap.get(RemoteMessageConst.TO)));
            ((LottieAnimationView) this.mView).a(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.MPLottieComponent.3
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb8030bc9fe1764783dc2da1b27213b9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb8030bc9fe1764783dc2da1b27213b9");
                        return;
                    }
                    ((LottieAnimationView) MPLottieComponent.this.mView).b(this);
                    if (mPJSCallBack != null) {
                        MachMap machMap2 = new MachMap();
                        machMap2.put("animationFinished", Boolean.TRUE);
                        mPJSCallBack.invoke(machMap2);
                    }
                }
            });
            a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class a implements b.InterfaceC1062b {
        public static ChangeQuickRedirect a;
        WeakReference<MPLottieComponent> b;

        public a(MPLottieComponent mPLottieComponent) {
            Object[] objArr = {mPLottieComponent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f5373ce77c2fd98dc86b681ea5398ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f5373ce77c2fd98dc86b681ea5398ac");
            } else {
                this.b = new WeakReference<>(mPLottieComponent);
            }
        }

        @Override // com.sankuai.waimai.platform.machpro.component.lottie.b.InterfaceC1062b
        public final void a(final String str, final String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a5fecf73cb65d50453e21f03c89e2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a5fecf73cb65d50453e21f03c89e2e");
            } else {
                com.sankuai.waimai.machpro.util.b.b().post(new Runnable() { // from class: com.sankuai.waimai.platform.machpro.component.lottie.MPLottieComponent.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad58652c9ef9d857d502a99446ed901a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad58652c9ef9d857d502a99446ed901a");
                        } else if (a.this.b.get() == null || !TextUtils.equals(str, a.this.b.get().c)) {
                        } else {
                            a.this.b.get().a(str2);
                        }
                    }
                });
            }
        }
    }
}
