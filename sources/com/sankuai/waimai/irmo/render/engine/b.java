package com.sankuai.waimai.irmo.render.engine;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.irmo.render.a;
import com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimation;
import com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.monitor.a;
import com.sankuai.waimai.irmo.widget.DelegateDrawView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends c {
    public static ChangeQuickRedirect a;
    IrmoLayerInfo b;
    View c;
    volatile IrmoAnimation d;
    Map<BaseAnimEffectParams.PropertyType, Double> e;
    Runnable f;
    boolean g;
    public List<View> h;

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void c() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void d() {
    }

    public b(com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        super(aVar, iVar, fVar);
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b412fa07664d79098ab9600dcaab54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b412fa07664d79098ab9600dcaab54");
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c, com.sankuai.waimai.irmo.render.engine.a
    public final void a(@NonNull IrmoLayerInfo irmoLayerInfo, final View view) {
        Object[] objArr = {irmoLayerInfo, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e0bccac0b6f6bf764ef5fb57c0e86ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e0bccac0b6f6bf764ef5fb57c0e86ce");
            return;
        }
        super.a(irmoLayerInfo, view);
        if (view == null) {
            a("view invalid.", true);
            return;
        }
        this.b = irmoLayerInfo;
        BaseAnimEffectParams baseAnimEffectParams = (BaseAnimEffectParams) this.b.effectParams;
        if (baseAnimEffectParams != null && baseAnimEffectParams.hasDraw) {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.clear();
            final DelegateDrawView delegateDrawView = new DelegateDrawView(view.getContext());
            delegateDrawView.setErrorListener(new IrmoAnimationDelegate.Observer<Throwable>() { // from class: com.sankuai.waimai.irmo.render.engine.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate.Observer
                public final /* synthetic */ void onMsg(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr2 = {th2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09362667f26b6573c19da979e89a2d43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09362667f26b6573c19da979e89a2d43");
                    } else if (th2 == null || b.this.k == null) {
                    } else {
                        try {
                            JsonObject jsonObject = new JsonObject();
                            jsonObject.addProperty("stackTrace", Log.getStackTraceString(th2));
                            b.this.k.a(new a.C0976a().a(1007).a(th2.getMessage()).c(jsonObject.toString()).a(), true);
                            com.sankuai.waimai.foundation.utils.log.a.a("IRMO_BASE_ANIM", th2);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
            if (view.isLayoutRequested()) {
                view.post(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.b.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94a86607830822d82902b5d8e9019912", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94a86607830822d82902b5d8e9019912");
                            return;
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b("IRMO_BASE_ANIM", "bind by post.", new Object[0]);
                        b.this.a(view, delegateDrawView);
                    }
                });
            } else {
                com.sankuai.waimai.foundation.utils.log.a.b("IRMO_BASE_ANIM", "bind directly.", new Object[0]);
                a(view, delegateDrawView);
            }
            this.c = delegateDrawView;
            this.h.add(delegateDrawView);
            return;
        }
        this.c = view;
    }

    void a(View view, ViewGroup viewGroup) {
        Object[] objArr = {view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0010bb5124f47efe8fc8d9e6f3b15343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0010bb5124f47efe8fc8d9e6f3b15343");
        } else if (view == null || viewGroup == null) {
        } else {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                viewGroup2.removeViewAt(viewGroup2.indexOfChild(view));
                viewGroup.addView(view);
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a0351cbcd241e58d94facbf25e6212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a0351cbcd241e58d94facbf25e6212");
        } else if (this.c == null || this.b == null || !(this.b.effectParams instanceof BaseAnimEffectParams)) {
        } else {
            if (this.d == null) {
                this.d = new IrmoAnimation((BaseAnimEffectParams) this.b.effectParams, this.c);
            }
            this.d.setReporter(this.k);
            this.d.setStartListener(new IrmoAnimationDelegate.StatusListener() { // from class: com.sankuai.waimai.irmo.render.engine.b.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate.StatusListener
                public final void execute() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "629ebdf4ec7b6c089202246afb0be39e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "629ebdf4ec7b6c089202246afb0be39e");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("IRMO_BASE_ANIM", "start...", new Object[0]);
                    if (b.this.j != null) {
                        b.this.j.a(a.EnumC0973a.effect_start, null);
                    }
                    b.this.g = false;
                }
            });
            this.d.setEndListener(new IrmoAnimationDelegate.StatusListener() { // from class: com.sankuai.waimai.irmo.render.engine.b.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate.StatusListener
                public final void execute() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95b6b8c3ce76f89a651e8c8975496705", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95b6b8c3ce76f89a651e8c8975496705");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("IRMO_BASE_ANIM", "end...", new Object[0]);
                    if (!TextUtils.equals(BaseAnimEffectParams.FILL_MODE_FORWARDS, ((BaseAnimEffectParams) b.this.b.effectParams).fillMode)) {
                        b bVar = b.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b.a;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "2a7d61280c4e34e8e30291275cf0dac9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "2a7d61280c4e34e8e30291275cf0dac9");
                        } else if (bVar.c != null && bVar.e != null && !bVar.e.isEmpty()) {
                            for (Map.Entry<BaseAnimEffectParams.PropertyType, Double> entry : bVar.e.entrySet()) {
                                if (entry.getValue() != null) {
                                    switch (entry.getKey()) {
                                        case translationX:
                                            bVar.c.setTranslationX(entry.getValue().floatValue());
                                            continue;
                                        case translationY:
                                            bVar.c.setTranslationY(entry.getValue().floatValue());
                                            continue;
                                        case translationZ:
                                            bVar.c.setTranslationZ(entry.getValue().floatValue());
                                            continue;
                                        case rotationX:
                                            bVar.c.setRotationX(entry.getValue().floatValue());
                                            continue;
                                        case rotationY:
                                            bVar.c.setRotationY(entry.getValue().floatValue());
                                            continue;
                                        case rotationZ:
                                            bVar.c.setRotation(entry.getValue().floatValue());
                                            continue;
                                        case scaleX:
                                            bVar.c.setScaleX(entry.getValue().floatValue());
                                            continue;
                                        case scaleY:
                                            bVar.c.setScaleY(entry.getValue().floatValue());
                                            continue;
                                        case opacity:
                                            bVar.c.setAlpha(entry.getValue().floatValue());
                                            continue;
                                        case backgroundColor:
                                            bVar.c.setBackgroundColor(entry.getValue().intValue());
                                            continue;
                                    }
                                }
                            }
                        }
                    }
                    if (b.this.j != null) {
                        b.this.j.a(b.this.g ? a.EnumC0973a.effect_cancel : a.EnumC0973a.effect_finished, null);
                    }
                    b.this.g = false;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void a(final g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "874e29f80a9ba57f14e0ed0a28fbf043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "874e29f80a9ba57f14e0ed0a28fbf043");
            return;
        }
        if (this.k != null) {
            this.k.a("InfiniteEngineWillPlay", 1007);
        }
        if (this.d == null) {
            if (gVar != null) {
                gVar.a(this.b, false);
            }
            if (this.k != null) {
                a aVar = a.UNKNOWN;
                if (this.c == null) {
                    aVar = a.VIEW_INVALID;
                } else if (this.b == null) {
                    aVar = a.LAYER_NULL;
                } else if (this.b.effectParams == null) {
                    aVar = a.PARAMS_NULL;
                } else if (!(this.b.effectParams instanceof BaseAnimEffectParams)) {
                    aVar = a.PARAMS_INVALID;
                }
                this.k.a(false, 1007, aVar.ordinal());
            }
            a("animation is null or running when starting.", true);
        } else if (this.d.isRunning()) {
            a("animation is null or running when starting.", false);
        } else {
            this.f = new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.b.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d88b2a0e3527e6ba79d0d27985290a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d88b2a0e3527e6ba79d0d27985290a8");
                    } else if (b.this.d == null) {
                        if (gVar != null) {
                            gVar.a(b.this.b, false);
                        }
                        if (b.this.k != null) {
                            b.this.k.a(true, 1007, a.START_CANCEL.ordinal());
                        }
                    } else if (b.this.d.isRunning()) {
                        b.this.a("animation released or running when starting.", false);
                    } else {
                        if (!TextUtils.equals(BaseAnimEffectParams.FILL_MODE_FORWARDS, ((BaseAnimEffectParams) b.this.b.effectParams).fillMode)) {
                            b bVar = b.this;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = b.a;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "22ab8c1f13645de5f5b5b8263dcc2766", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "22ab8c1f13645de5f5b5b8263dcc2766");
                            } else if (bVar.c != null) {
                                if (bVar.e == null) {
                                    bVar.e = new HashMap();
                                }
                                bVar.e.put(BaseAnimEffectParams.PropertyType.translationX, Double.valueOf(bVar.c.getTranslationX()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.translationY, Double.valueOf(bVar.c.getTranslationY()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.translationZ, Double.valueOf(bVar.c.getTranslationZ()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.scaleX, Double.valueOf(bVar.c.getScaleX()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.scaleY, Double.valueOf(bVar.c.getScaleY()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.rotationX, Double.valueOf(bVar.c.getRotationX()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.rotationY, Double.valueOf(bVar.c.getRotationY()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.rotationZ, Double.valueOf(bVar.c.getRotation()));
                                bVar.e.put(BaseAnimEffectParams.PropertyType.opacity, Double.valueOf(bVar.c.getAlpha()));
                                Drawable background = bVar.c.getBackground();
                                if (background instanceof ColorDrawable) {
                                    bVar.e.put(BaseAnimEffectParams.PropertyType.backgroundColor, Double.valueOf(((ColorDrawable) background).getColor()));
                                }
                            }
                        }
                        a aVar2 = a.SUCCESS;
                        if (!b.this.d.prepare()) {
                            aVar2 = a.PREPARE_FAILED;
                        } else if (!b.this.d.start()) {
                            aVar2 = a.START_FAILED;
                        }
                        if (b.this.k != null) {
                            b.this.k.a(aVar2 == a.SUCCESS, 1007, aVar2.ordinal());
                        }
                        if (gVar != null) {
                            gVar.a(b.this.b, aVar2 == a.SUCCESS);
                        }
                        if (aVar2 != a.SUCCESS) {
                            HashMap hashMap = new HashMap();
                            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, Integer.valueOf(aVar2.ordinal()));
                            b.this.j.a(a.EnumC0973a.effect_failed, hashMap);
                        }
                        b.this.f = null;
                    }
                }
            };
            ad.a(this.f, (long) (this.b.startTime * 1000.0d));
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75216abceddbb7f926a5f67c66504231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75216abceddbb7f926a5f67c66504231");
        } else if (this.d == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "no anim.", new Object[0]);
        } else {
            if (this.f != null) {
                ad.b(this.f);
                this.f = null;
            }
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.b.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4341f14df3434afc93aadf4c8e379d20", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4341f14df3434afc93aadf4c8e379d20");
                    } else if (b.this.d == null) {
                        com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "no anim.", new Object[0]);
                    } else {
                        if (b.this.d.isRunning()) {
                            b.this.g = true;
                        }
                        b.this.d.stop();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5262bd8408046b16711879d5e7d4fb7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5262bd8408046b16711879d5e7d4fb7a");
        } else if (this.d == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "no anim.", new Object[0]);
        } else {
            if (this.f != null) {
                ad.b(this.f);
                this.f = null;
            }
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.b.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e629d09c201e856037171c5e2e6a6ec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e629d09c201e856037171c5e2e6a6ec");
                    } else if (b.this.d == null) {
                        com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "no anim.", new Object[0]);
                    } else {
                        b.this.d.pause();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74ea5c02274c05cabb187c7ceeab113d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74ea5c02274c05cabb187c7ceeab113d");
        } else if (this.d == null) {
            com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "no anim.", new Object[0]);
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.b.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bff11462a61fd9e624115f5bfc65db69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bff11462a61fd9e624115f5bfc65db69");
                    } else if (b.this.d == null) {
                        com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", "no anim.", new Object[0]);
                    } else {
                        b.this.d.resume();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @NonNull
    public final List<View> b() {
        return this.h;
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa87739377785a4e80fcff43f819562e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa87739377785a4e80fcff43f819562e");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("IRMO_BASE_ANIM", "release", new Object[0]);
        if (this.d == null) {
            return;
        }
        ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.b.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "426188c4f72aa7600ea693db5550d7be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "426188c4f72aa7600ea693db5550d7be");
                } else if (b.this.d == null) {
                } else {
                    if (b.this.d.isRunning()) {
                        b.this.g = true;
                        b.this.d.stop();
                    }
                    b.this.d = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3db36b366a026862c9b4013ed2cc728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3db36b366a026862c9b4013ed2cc728");
        } else if (this.k == null || TextUtils.isEmpty(str)) {
        } else {
            this.k.a(new a.C0976a().a(1007).a(str).a(), z);
            com.sankuai.waimai.foundation.utils.log.a.e("IRMO_BASE_ANIM", str, new Object[0]);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        SUCCESS,
        PREPARE_FAILED,
        START_FAILED,
        START_CANCEL,
        VIEW_INVALID,
        LAYER_NULL,
        PARAMS_NULL,
        PARAMS_INVALID,
        UNKNOWN;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2fefae1a778f0ba1b0cbffb2c3419ff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2fefae1a778f0ba1b0cbffb2c3419ff");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdd7239fa5d18fc73a1ff98ffc58f7aa", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdd7239fa5d18fc73a1ff98ffc58f7aa") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aab93c42f4180b07c6def7c0c180a8fe", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aab93c42f4180b07c6def7c0c180a8fe") : (a[]) values().clone();
        }
    }
}
