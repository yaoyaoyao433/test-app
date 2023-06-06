package com.sankuai.waimai.irmo.render.bean.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.anim.draw.BorderDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.CornerDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.HaloDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.ShadowDrawUpdateCommand;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.BorderData;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.CornerData;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.HaloData;
import com.sankuai.waimai.irmo.render.bean.anim.draw.bean.ShadowData;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.monitor.a;
import com.sankuai.waimai.irmo.widget.DelegateDrawView;
import com.sankuai.waimai.irmo.widget.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoDrawAnimator extends IrmoAnimationDelegate<List<BaseAnimEffectParams.Property>> {
    private static final String BORDER_COLOR_KEY = "borderColor";
    private static final String BORDER_WIDTH_KEY = "borderWidth";
    private static final String CORNER_RADIUS_KEY = "cornerRadius";
    private static final String HALO_COLOR_KEY = "haloColor";
    private static final String HALO_WIDTH_KEY = "haloWidth";
    private static final String SHADOW_COLOR_KEY = "shadowColor";
    private static final String SHADOW_H_OFFSET_KEY = "shadowOffsetX";
    private static final String SHADOW_V_OFFSET_KEY = "shadowOffsetY";
    private static final String TAG = "IrmoDrawAnimator";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Animator animator;
    private long delay;
    private ValueAnimator.AnimatorUpdateListener updateListener;

    public IrmoDrawAnimator(List<BaseAnimEffectParams.Property> list, View view) {
        super(list, view);
        Object[] objArr = {list, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e4dd23ba5ee71f3017f88c9a96fe0a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e4dd23ba5ee71f3017f88c9a96fe0a5");
            return;
        }
        this.delay = 0L;
        this.updateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.irmo.render.bean.anim.IrmoDrawAnimator.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float[] fArr;
                Object[] objArr2 = {valueAnimator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "583905b9cdad24ecfd7cb33a4ef25450", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "583905b9cdad24ecfd7cb33a4ef25450");
                } else if (valueAnimator == null || !(IrmoDrawAnimator.this.targetView instanceof DelegateDrawView)) {
                } else {
                    Float f = (Float) valueAnimator.getAnimatedValue(IrmoDrawAnimator.CORNER_RADIUS_KEY);
                    if (f != null) {
                        DelegateDrawView delegateDrawView = (DelegateDrawView) IrmoDrawAnimator.this.targetView;
                        float floatValue = f.floatValue();
                        Object[] objArr3 = {Float.valueOf(floatValue)};
                        ChangeQuickRedirect changeQuickRedirect4 = DelegateDrawView.a;
                        if (PatchProxy.isSupport(objArr3, delegateDrawView, changeQuickRedirect4, false, "86779643ea4dca41e818d8e6fe8aaf36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, delegateDrawView, changeQuickRedirect4, false, "86779643ea4dca41e818d8e6fe8aaf36");
                        } else {
                            try {
                                b bVar = delegateDrawView.b;
                                Object[] objArr4 = {Float.valueOf(floatValue)};
                                ChangeQuickRedirect changeQuickRedirect5 = b.a;
                                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect5, false, "598718e5fc833c31911e9635a02a66f1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect5, false, "598718e5fc833c31911e9635a02a66f1");
                                } else {
                                    if (bVar.h == null) {
                                        bVar.h = new CornerDrawUpdateCommand();
                                    }
                                    if (bVar.b == null) {
                                        bVar.b = new CornerData();
                                    }
                                    bVar.b.rect = bVar.j;
                                    CornerData cornerData = bVar.b;
                                    Object[] objArr5 = {Float.valueOf(floatValue)};
                                    ChangeQuickRedirect changeQuickRedirect6 = b.a;
                                    if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect6, false, "2e10209d8dc77e52047230e0b85e9148", RobustBitConfig.DEFAULT_VALUE)) {
                                        fArr = (float[]) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect6, false, "2e10209d8dc77e52047230e0b85e9148");
                                    } else {
                                        if (bVar.k != null && bVar.k.length == 8) {
                                            if (bVar.k[0] != floatValue) {
                                                Arrays.fill(bVar.k, floatValue);
                                            }
                                            fArr = bVar.k;
                                        }
                                        bVar.k = new float[]{floatValue, floatValue, floatValue, floatValue, floatValue, floatValue, floatValue, floatValue};
                                        fArr = bVar.k;
                                    }
                                    cornerData.corner = fArr;
                                    bVar.h.update(bVar.b);
                                }
                            } catch (Throwable th) {
                                if (delegateDrawView.c != null) {
                                    delegateDrawView.c.onMsg(th);
                                }
                            }
                        }
                    }
                    Integer num = (Integer) valueAnimator.getAnimatedValue(IrmoDrawAnimator.SHADOW_COLOR_KEY);
                    Float f2 = (Float) valueAnimator.getAnimatedValue(IrmoDrawAnimator.SHADOW_H_OFFSET_KEY);
                    Float f3 = (Float) valueAnimator.getAnimatedValue(IrmoDrawAnimator.SHADOW_V_OFFSET_KEY);
                    if (num != null && f2 != null && f3 != null) {
                        DelegateDrawView delegateDrawView2 = (DelegateDrawView) IrmoDrawAnimator.this.targetView;
                        int intValue = num.intValue();
                        float floatValue2 = f2.floatValue();
                        float floatValue3 = f3.floatValue();
                        Object[] objArr6 = {Integer.valueOf(intValue), Float.valueOf(floatValue2), Float.valueOf(floatValue3)};
                        ChangeQuickRedirect changeQuickRedirect7 = DelegateDrawView.a;
                        if (PatchProxy.isSupport(objArr6, delegateDrawView2, changeQuickRedirect7, false, "d97412fd5e1afdf46607b07e0061a1b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, delegateDrawView2, changeQuickRedirect7, false, "d97412fd5e1afdf46607b07e0061a1b1");
                        } else {
                            try {
                                b bVar2 = delegateDrawView2.b;
                                Object[] objArr7 = {Integer.valueOf(intValue), Float.valueOf(floatValue2), Float.valueOf(floatValue3)};
                                ChangeQuickRedirect changeQuickRedirect8 = b.a;
                                if (PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect8, false, "ad0da57ca10694a46d154aa677e3948b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect8, false, "ad0da57ca10694a46d154aa677e3948b");
                                } else {
                                    if (bVar2.f == null) {
                                        bVar2.f = new ShadowDrawUpdateCommand();
                                    }
                                    if (bVar2.c == null) {
                                        bVar2.c = new ShadowData();
                                    }
                                    bVar2.c.rect = bVar2.j;
                                    if (bVar2.k != null && bVar2.k.length == 8) {
                                        bVar2.c.corner = bVar2.k;
                                    }
                                    bVar2.c.color = intValue;
                                    bVar2.c.hOffset = floatValue2;
                                    bVar2.c.vOffset = floatValue3;
                                    bVar2.f.update(bVar2.c);
                                }
                            } catch (Throwable th2) {
                                if (delegateDrawView2.c != null) {
                                    delegateDrawView2.c.onMsg(th2);
                                }
                            }
                        }
                    }
                    Integer num2 = (Integer) valueAnimator.getAnimatedValue(IrmoDrawAnimator.HALO_COLOR_KEY);
                    Float f4 = (Float) valueAnimator.getAnimatedValue(IrmoDrawAnimator.HALO_WIDTH_KEY);
                    if (num2 != null && f4 != null) {
                        DelegateDrawView delegateDrawView3 = (DelegateDrawView) IrmoDrawAnimator.this.targetView;
                        int intValue2 = num2.intValue();
                        float floatValue4 = f4.floatValue();
                        Object[] objArr8 = {Integer.valueOf(intValue2), Float.valueOf(floatValue4)};
                        ChangeQuickRedirect changeQuickRedirect9 = DelegateDrawView.a;
                        if (PatchProxy.isSupport(objArr8, delegateDrawView3, changeQuickRedirect9, false, "eb02fc425b9a82f5e1ca7241bac534e0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, delegateDrawView3, changeQuickRedirect9, false, "eb02fc425b9a82f5e1ca7241bac534e0");
                        } else {
                            try {
                                b bVar3 = delegateDrawView3.b;
                                Object[] objArr9 = {Integer.valueOf(intValue2), Float.valueOf(floatValue4)};
                                ChangeQuickRedirect changeQuickRedirect10 = b.a;
                                if (PatchProxy.isSupport(objArr9, bVar3, changeQuickRedirect10, false, "aa60c9ee66e5a810979a280f5ba98a6a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, bVar3, changeQuickRedirect10, false, "aa60c9ee66e5a810979a280f5ba98a6a");
                                } else {
                                    if (bVar3.g == null) {
                                        bVar3.g = new HaloDrawUpdateCommand();
                                    }
                                    if (bVar3.d == null) {
                                        bVar3.d = new HaloData();
                                    }
                                    bVar3.d.rect = bVar3.j;
                                    if (bVar3.k != null && bVar3.k.length == 8) {
                                        bVar3.d.corner = bVar3.k;
                                    }
                                    bVar3.d.color = intValue2;
                                    bVar3.d.radius = floatValue4;
                                    bVar3.g.update(bVar3.d);
                                }
                            } catch (Throwable th3) {
                                if (delegateDrawView3.c != null) {
                                    delegateDrawView3.c.onMsg(th3);
                                }
                            }
                        }
                    }
                    Integer num3 = (Integer) valueAnimator.getAnimatedValue("borderColor");
                    Float f5 = (Float) valueAnimator.getAnimatedValue("borderWidth");
                    if (num3 != null && f5 != null) {
                        DelegateDrawView delegateDrawView4 = (DelegateDrawView) IrmoDrawAnimator.this.targetView;
                        int intValue3 = num3.intValue();
                        float floatValue5 = f5.floatValue();
                        Object[] objArr10 = {Integer.valueOf(intValue3), Float.valueOf(floatValue5)};
                        ChangeQuickRedirect changeQuickRedirect11 = DelegateDrawView.a;
                        if (PatchProxy.isSupport(objArr10, delegateDrawView4, changeQuickRedirect11, false, "87bcb18104a7c90ad9f5bf845021c15d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr10, delegateDrawView4, changeQuickRedirect11, false, "87bcb18104a7c90ad9f5bf845021c15d");
                        } else {
                            try {
                                b bVar4 = delegateDrawView4.b;
                                Object[] objArr11 = {Integer.valueOf(intValue3), Float.valueOf(floatValue5)};
                                ChangeQuickRedirect changeQuickRedirect12 = b.a;
                                if (PatchProxy.isSupport(objArr11, bVar4, changeQuickRedirect12, false, "38fec76c8e0b6ec070bffe4ce9afc656", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr11, bVar4, changeQuickRedirect12, false, "38fec76c8e0b6ec070bffe4ce9afc656");
                                } else {
                                    if (bVar4.i == null) {
                                        bVar4.i = new BorderDrawUpdateCommand();
                                    }
                                    if (bVar4.e == null) {
                                        bVar4.e = new BorderData();
                                    }
                                    bVar4.e.rect = bVar4.j;
                                    if (bVar4.k != null && bVar4.k.length == 8) {
                                        bVar4.e.corner = bVar4.k;
                                    }
                                    bVar4.e.width = floatValue5;
                                    bVar4.e.color = intValue3;
                                    bVar4.i.update(bVar4.e);
                                }
                            } catch (Throwable th4) {
                                if (delegateDrawView4.c != null) {
                                    delegateDrawView4.c.onMsg(th4);
                                }
                            }
                        }
                    }
                    IrmoDrawAnimator.this.targetView.invalidate();
                }
            }
        };
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean prepare() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b9f1e9fcbfc255e7275add22788582", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b9f1e9fcbfc255e7275add22788582")).booleanValue();
        }
        if (this.animator == null) {
            this.animator = touchCanvasAnimator();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.irmo.render.bean.anim.IrmoDrawAnimator.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8e023a1d6855e67842786e3c516a8947", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8e023a1d6855e67842786e3c516a8947");
                    return;
                }
                super.onAnimationEnd(animator);
                if (IrmoDrawAnimator.this.endListener != null) {
                    IrmoDrawAnimator.this.endListener.execute();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Object[] objArr2 = {animator};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "42700634e0f8040beefc484c2a44ab62", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "42700634e0f8040beefc484c2a44ab62");
                    return;
                }
                super.onAnimationStart(animator);
                if (IrmoDrawAnimator.this.startListener != null) {
                    IrmoDrawAnimator.this.startListener.execute();
                }
            }
        });
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfea2cb0baaa19b052cea4e53ac63ddb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfea2cb0baaa19b052cea4e53ac63ddb")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.start();
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e8d4357d75ac5806a800e00d45ed731", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e8d4357d75ac5806a800e00d45ed731")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        if (this.animator.isRunning()) {
            this.animator.cancel();
            return true;
        }
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4543d8e08b4e46d365df4e14c198d64d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4543d8e08b4e46d365df4e14c198d64d")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.pause();
        return true;
    }

    @Override // com.sankuai.waimai.irmo.render.bean.anim.IrmoAnimationDelegate
    public boolean resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d2173f6207a6e88c0e12d7d072d4785", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d2173f6207a6e88c0e12d7d072d4785")).booleanValue();
        }
        if (this.animator == null) {
            return false;
        }
        this.animator.resume();
        return true;
    }

    public void setStartDelay(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d18e55db17073b36c9e5a94cf63846ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d18e55db17073b36c9e5a94cf63846ce");
        } else {
            this.delay = j;
        }
    }

    private Animator touchCanvasAnimator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41548ee2f85d3792f84ba288c74d4f52", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41548ee2f85d3792f84ba288c74d4f52");
        }
        if (d.a((List) this.animInfo) || this.targetView == null) {
            a.e("IRMO_BASE_ANIM", "slice anim has no info.", new Object[0]);
            if (this.reporter != null) {
                i iVar = this.reporter;
                a.C0976a a = new a.C0976a().a(1007).a("cannot create property animator.");
                Object[] objArr2 = new Object[2];
                objArr2[0] = Boolean.valueOf(d.a((List) this.animInfo));
                objArr2[1] = Boolean.valueOf(this.targetView == null);
                iVar.a(a.b(String.format("缺失创建动画的条件. 1、anim info: %b, 2、target view：%b", objArr2)).a(), false);
                return null;
            }
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (BaseAnimEffectParams.Property property : (List) this.animInfo) {
            Animator obtainAnimator = obtainAnimator(property);
            if (obtainAnimator != null) {
                arrayList.add(obtainAnimator);
            }
        }
        animatorSet.setStartDelay(this.delay);
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private Animator obtainAnimator(BaseAnimEffectParams.Property property) {
        ValueAnimator ofPropertyValuesHolder;
        Object[] objArr = {property};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1eaca464c0f318a4ed0cb6c4ebafc968", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1eaca464c0f318a4ed0cb6c4ebafc968");
        }
        ValueAnimator valueAnimator = null;
        if (property == null || this.targetView == null) {
            return null;
        }
        switch (property.type) {
            case shadow:
                try {
                    JSONObject jSONObject = new JSONObject(property.fromValue);
                    JSONObject jSONObject2 = new JSONObject(property.toValue);
                    if (jSONObject.length() == 3 && jSONObject2.length() == 3) {
                        ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofObject(SHADOW_COLOR_KEY, new ArgbEvaluator(), Integer.valueOf(safeParseColor(jSONObject.getString(SHADOW_COLOR_KEY))), Integer.valueOf(safeParseColor(jSONObject2.getString(SHADOW_COLOR_KEY)))), PropertyValuesHolder.ofFloat(SHADOW_H_OFFSET_KEY, dp2px(safeParseFloat(jSONObject.getString(SHADOW_H_OFFSET_KEY))), dp2px(safeParseFloat(jSONObject2.getString(SHADOW_H_OFFSET_KEY)))), PropertyValuesHolder.ofFloat(SHADOW_V_OFFSET_KEY, dp2px(safeParseFloat(jSONObject.getString(SHADOW_V_OFFSET_KEY))), dp2px(safeParseFloat(jSONObject2.getString(SHADOW_V_OFFSET_KEY)))));
                        break;
                    }
                    return null;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return null;
                }
            case halo:
                try {
                    JSONObject jSONObject3 = new JSONObject(property.fromValue);
                    JSONObject jSONObject4 = new JSONObject(property.toValue);
                    if (jSONObject3.length() == 2 && jSONObject4.length() == 2) {
                        ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofObject(HALO_COLOR_KEY, new ArgbEvaluator(), Integer.valueOf(safeParseColor(jSONObject3.getString(HALO_COLOR_KEY))), Integer.valueOf(safeParseColor(jSONObject4.getString(HALO_COLOR_KEY)))), PropertyValuesHolder.ofFloat(HALO_WIDTH_KEY, dp2px(safeParseFloat(jSONObject3.getString(HALO_WIDTH_KEY))), dp2px(safeParseFloat(jSONObject4.getString(HALO_WIDTH_KEY)))));
                        break;
                    }
                    return null;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    return null;
                }
            case cornerRadius:
                valueAnimator = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat(CORNER_RADIUS_KEY, dp2px(safeParseFloat(property.fromValue)), dp2px(safeParseFloat(property.toValue))));
                ofPropertyValuesHolder = valueAnimator;
                break;
            case border:
                try {
                    JSONObject jSONObject5 = new JSONObject(property.fromValue);
                    JSONObject jSONObject6 = new JSONObject(property.toValue);
                    if (jSONObject5.length() == 2 && jSONObject6.length() == 2) {
                        ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofObject("borderColor", new ArgbEvaluator(), Integer.valueOf(safeParseColor(jSONObject5.getString("borderColor"))), Integer.valueOf(safeParseColor(jSONObject6.getString("borderColor")))), PropertyValuesHolder.ofFloat("borderWidth", dp2px(safeParseFloat(jSONObject5.getString("borderWidth"))), dp2px(safeParseFloat(jSONObject6.getString("borderWidth")))));
                        break;
                    }
                    return null;
                } catch (JSONException e3) {
                    e3.printStackTrace();
                    return null;
                }
            default:
                ofPropertyValuesHolder = valueAnimator;
                break;
        }
        if (ofPropertyValuesHolder != null) {
            ofPropertyValuesHolder.setStartDelay(property.delay);
            ofPropertyValuesHolder.setDuration(property.duration);
            ofPropertyValuesHolder.addUpdateListener(this.updateListener);
        }
        return ofPropertyValuesHolder;
    }

    private float safeParseFloat(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57edba301678d42f177afae7d0ed4907", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57edba301678d42f177afae7d0ed4907")).floatValue();
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            if (this.reporter != null) {
                this.reporter.a(new a.C0976a().a(1007).a("property value invalid when create property animator.").a(), true);
                return 0.0f;
            }
            return 0.0f;
        }
    }

    public static int safeParseColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e03b47ed75d5f99d23bf88b99d772d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e03b47ed75d5f99d23bf88b99d772d5")).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public float dp2px(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9f15b9c3ce6d0240f121749efb42dea", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9f15b9c3ce6d0240f121749efb42dea")).floatValue() : (this.targetView == null || this.targetView.getResources() == null) ? f : (int) (f * this.targetView.getResources().getDisplayMetrics().density);
    }
}
