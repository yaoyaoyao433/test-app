package com.sankuai.waimai.machpro.animator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.facebook.yoga.YogaEdge;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.bean.layers.BaseAnimEffectParams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d {
    public static ChangeQuickRedirect a;
    protected int b;
    protected int c;
    protected String d;
    protected String[] e;
    protected boolean f;
    protected h g;
    protected AnimatorSet h;
    protected com.facebook.yoga.d i;
    protected Map<String, Object> j;
    private View k;
    private com.facebook.yoga.d l;

    public void a(com.facebook.yoga.d dVar, Map<String, Object> map, Map<String, Object> map2) {
    }

    @Deprecated
    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ebe65020b90dea0a2ad9be18d23177", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ebe65020b90dea0a2ad9be18d23177");
        } else {
            this.f = false;
        }
    }

    public d(com.facebook.yoga.d dVar, Map<String, Object> map) {
        Object[] objArr = {dVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa7d7999227dde15e21eb3cebfb22662", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa7d7999227dde15e21eb3cebfb22662");
            return;
        }
        this.f = false;
        this.i = dVar.x();
        this.l = dVar;
        this.k = (View) dVar.w();
        this.h = new AnimatorSet();
        this.h.setTarget(dVar);
        this.h.setInterpolator(new LinearInterpolator());
        this.h.setDuration(0L);
        a(this.h, map);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d71595e7dcdfeadf999263aea4866f89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d71595e7dcdfeadf999263aea4866f89");
        } else if (this.k == null) {
        } else {
            int measuredWidth = this.k.getMeasuredWidth();
            int measuredHeight = this.k.getMeasuredHeight();
            if (this.e == null || this.e.length < 2) {
                this.k.setPivotX(measuredWidth * 0.5f);
                this.k.setPivotY(measuredHeight * 0.5f);
                return;
            }
            String trim = this.e[0].trim();
            String trim2 = this.e[1].trim();
            if ("left".equals(trim)) {
                this.k.setPivotX(0.0f);
            } else if ("right".equals(trim)) {
                this.k.setPivotX(measuredWidth);
            } else if ("center".equals(trim)) {
                this.k.setPivotX(measuredWidth * 0.5f);
            } else {
                this.k.setPivotX(measuredWidth * c.c(trim));
            }
            if ("top".equals(trim2)) {
                this.k.setPivotY(0.0f);
            } else if ("bottom".equals(trim2)) {
                this.k.setPivotY(measuredHeight);
            } else if ("center".equals(trim2)) {
                this.k.setPivotY(measuredHeight * 0.5f);
            } else {
                this.k.setPivotY(measuredHeight * c.c(trim2));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(AnimatorSet animatorSet, Map<String, Object> map) {
        char c;
        int i;
        int c2;
        int i2;
        Object[] objArr = {animatorSet, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e928db7ab27bc6cc4768366c97dac95b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e928db7ab27bc6cc4768366c97dac95b");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dfaea1301f951292275685178b7bbe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dfaea1301f951292275685178b7bbe6");
        } else {
            this.b = 0;
            this.c = 1;
            this.d = BaseAnimEffectParams.FILL_MODE_FORWARDS;
            this.f = false;
            if (this.g != null) {
                this.g.b = new LinearInterpolator();
            }
        }
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String valueOf = String.valueOf(entry.getValue());
            this.g = new h(new LinearInterpolator());
            String key = entry.getKey();
            char c3 = 65535;
            switch (key.hashCode()) {
                case -1992012396:
                    if (key.equals("duration")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1185691484:
                    if (key.equals("animation-fill-mode")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -986025866:
                    if (key.equals("animation-direction")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -962590849:
                    if (key.equals("direction")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -781597262:
                    if (key.equals("transformOrigin")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -729273914:
                    if (key.equals("fillMode")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -607295043:
                    if (key.equals("animation-duration")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 95467907:
                    if (key.equals("delay")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 400766002:
                    if (key.equals("iterationCount")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 937178618:
                    if (key.equals("animation-delay")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1352416423:
                    if (key.equals("transform-origin")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1820478898:
                    if (key.equals("animation-timing-function")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1939639766:
                    if (key.equals("animation-iteration-count")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2045697602:
                    if (key.equals("timingFunction")) {
                        c = '\t';
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
                case 1:
                    animatorSet.setDuration(c.b(valueOf));
                    break;
                case 2:
                case 3:
                    animatorSet.setStartDelay(c.b(valueOf));
                    break;
                case 4:
                case 5:
                    this.d = valueOf;
                    break;
                case 6:
                case 7:
                    this.e = c.d(valueOf);
                    break;
                case '\b':
                case '\t':
                    TimeInterpolator a2 = c.a(valueOf);
                    animatorSet.setInterpolator(a2);
                    this.g.b = a2;
                    break;
                case '\n':
                case 11:
                    Object[] objArr3 = {valueOf};
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4a953276bfe86653c227ad518c82b4cb", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4a953276bfe86653c227ad518c82b4cb")).intValue();
                    } else {
                        i = ("infinite".equals(valueOf) || (c2 = com.sankuai.waimai.machpro.util.b.c((Object) valueOf)) <= 0) ? -1 : c2 - 1;
                    }
                    this.b = i;
                    break;
                case '\f':
                case '\r':
                    Object[] objArr4 = {valueOf};
                    ChangeQuickRedirect changeQuickRedirect4 = c.a;
                    if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "21059210b0ca77a00a859509789b8d1b", RobustBitConfig.DEFAULT_VALUE)) {
                        int hashCode = valueOf.hashCode();
                        if (hashCode != -1408024454) {
                            if (hashCode == 1099846370 && valueOf.equals("reverse")) {
                                c3 = 0;
                            }
                        } else if (valueOf.equals("alternate")) {
                            c3 = 1;
                        }
                        switch (c3) {
                            case 0:
                            case 1:
                                i2 = 3;
                                break;
                            default:
                                i2 = 1;
                                break;
                        }
                    } else {
                        i2 = ((Integer) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "21059210b0ca77a00a859509789b8d1b")).intValue();
                    }
                    this.c = i2;
                    break;
            }
        }
    }

    public final ArrayList<Animator> a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62adc086822c820e44bda3782c7e3c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62adc086822c820e44bda3782c7e3c5");
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.sankuai.waimai.machpro.animator.d.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                Object[] objArr2 = {str3, str4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38c118eaea30f522d4ab520fabc59b64", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38c118eaea30f522d4ab520fabc59b64")).intValue();
                }
                if (str3.endsWith("%") && str4.endsWith("%") && com.sankuai.waimai.mach.utils.g.a(str3.substring(0, str3.length() - 1)) <= com.sankuai.waimai.mach.utils.g.c(str4.substring(0, str4.length() - 1))) {
                    return com.sankuai.waimai.mach.utils.g.a(str3.substring(0, str3.length() - 1)) < ((float) com.sankuai.waimai.mach.utils.g.c(str4.substring(0, str4.length() - 1))) ? -1 : 0;
                }
                return 1;
            }
        });
        treeMap.putAll(map);
        Map<String, Object> map2 = this.j;
        c.a(treeMap, hashMap, hashMap2, map2);
        ArrayList<Animator> arrayList = new ArrayList<>();
        if (hashMap.size() != 0) {
            arrayList.addAll(a(hashMap, map2));
        }
        if (hashMap2.size() != 0) {
            arrayList.addAll(b(hashMap2, map2));
        }
        return arrayList;
    }

    private ArrayList<Animator> a(Map<String, ArrayList<Keyframe>> map, Map<String, Object> map2) {
        Keyframe keyframe;
        Keyframe ofFloat;
        int i = 2;
        char c = 0;
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced98b428754fca7814836bc5d5781c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced98b428754fca7814836bc5d5781c9");
        }
        ArrayList<Animator> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<String, ArrayList<Keyframe>> entry : map.entrySet()) {
            ArrayList<Keyframe> value = entry.getValue();
            int size = value.size();
            if (size >= i) {
                if (entry.getKey().equals("backgroundColor")) {
                    arrayList3.add(PropertyValuesHolder.ofKeyframe(entry.getKey(), (Keyframe[]) value.toArray(new Keyframe[size])));
                } else if (this.f || "backwards".equals(this.d)) {
                    value.get(size - 1).setFraction(com.sankuai.waimai.machpro.util.b.b(Double.valueOf(this.f ? keyframe.getFraction() / 2.0f : keyframe.getFraction() - 1.0E-5d)));
                    String key = entry.getKey();
                    com.facebook.yoga.d dVar = this.i;
                    Object[] objArr2 = new Object[i];
                    objArr2[c] = key;
                    objArr2[1] = dVar;
                    ChangeQuickRedirect changeQuickRedirect2 = c.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aac4e31e351512e45208d4cfa8492e55", RobustBitConfig.DEFAULT_VALUE)) {
                        ofFloat = (Keyframe) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aac4e31e351512e45208d4cfa8492e55");
                    } else if (key.contains("scale")) {
                        ofFloat = Keyframe.ofFloat(1.0f, 1.0f);
                    } else {
                        if (key.contains("alpha")) {
                            if (dVar != null && dVar.w() != null) {
                                Keyframe.ofFloat(1.0f, ((View) dVar.w()).getAlpha());
                            } else {
                                Keyframe.ofFloat(1.0f, 1.0f);
                            }
                        }
                        ofFloat = Keyframe.ofFloat(1.0f, 0.0f);
                    }
                    value.add(ofFloat);
                    arrayList2.add(PropertyValuesHolder.ofKeyframe(entry.getKey(), (Keyframe[]) value.toArray(new Keyframe[size + 1])));
                    i = 2;
                    c = 0;
                } else {
                    arrayList2.add(PropertyValuesHolder.ofKeyframe(entry.getKey(), (Keyframe[]) value.toArray(new Keyframe[size])));
                }
            }
        }
        if (arrayList2.size() > 0) {
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.k, (PropertyValuesHolder[]) arrayList2.toArray(new PropertyValuesHolder[0]));
            ofPropertyValuesHolder.setEvaluator(new FloatEvaluator());
            a(ofPropertyValuesHolder);
            if (map2 != null) {
                String str = map2.keySet().iterator().hasNext() ? map2.keySet().iterator().next().split("#")[0] : "";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("#animation-duration");
                long c2 = com.sankuai.waimai.machpro.util.b.c(map2.get(str + "#animation-delay"));
                Object obj = map2.get(str + "#animation-timing-function");
                ofPropertyValuesHolder.setStartDelay(c2);
                ofPropertyValuesHolder.setDuration((long) com.sankuai.waimai.machpro.util.b.c(map2.get(sb.toString())));
                if (obj != null) {
                    ofPropertyValuesHolder.setInterpolator(c.a(String.valueOf(obj)));
                }
            }
            arrayList.add(ofPropertyValuesHolder);
        }
        if (arrayList3.size() > 0) {
            ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this.k, (PropertyValuesHolder[]) arrayList3.toArray(new PropertyValuesHolder[0]));
            ofPropertyValuesHolder2.setEvaluator(new ArgbEvaluator());
            a(ofPropertyValuesHolder2);
            if (map2 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(BackgroundColor.NAME);
                sb2.append("#animation-duration");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(BackgroundColor.NAME);
                sb3.append("#animation-delay");
                Object obj2 = map2.get(BackgroundColor.NAME + "#animation-timing-function");
                ofPropertyValuesHolder2.setStartDelay((long) com.sankuai.waimai.machpro.util.b.c(map2.get(sb3.toString())));
                ofPropertyValuesHolder2.setDuration((long) com.sankuai.waimai.machpro.util.b.c(map2.get(sb2.toString())));
                if (obj2 != null) {
                    ofPropertyValuesHolder2.setInterpolator(c.a(String.valueOf(obj2)));
                }
            }
            arrayList.add(ofPropertyValuesHolder2);
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private ArrayList<Animator> b(Map<String, ArrayList<Keyframe>> map, Map<String, Object> map2) {
        Keyframe keyframe;
        char c;
        Keyframe ofFloat;
        PropertyValuesHolder ofKeyframe;
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0c6a6a75dc6fc6b1a846200a23881c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0c6a6a75dc6fc6b1a846200a23881c2");
        }
        ArrayList<Animator> arrayList = new ArrayList<>();
        for (Map.Entry<String, ArrayList<Keyframe>> entry : map.entrySet()) {
            ArrayList<Keyframe> value = entry.getValue();
            int size = value.size();
            if (size >= 2) {
                if (this.f || "backwards".equals(this.d)) {
                    value.get(size - 1).setFraction(com.sankuai.waimai.machpro.util.b.b(Double.valueOf(this.f ? keyframe.getFraction() / 2.0f : keyframe.getFraction() - 1.0E-5d)));
                    String key = entry.getKey();
                    com.facebook.yoga.d dVar = this.i;
                    Object[] objArr2 = {key, dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = c.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "db6da2f52506799afd77280448f7fbf7", RobustBitConfig.DEFAULT_VALUE)) {
                        ofFloat = (Keyframe) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "db6da2f52506799afd77280448f7fbf7");
                    } else {
                        float f = 0.0f;
                        switch (key.hashCode()) {
                            case -1977798646:
                                if (key.equals("topWithPercent")) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1928379655:
                                if (key.equals("widthWithPercent")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1383228885:
                                if (key.equals("bottom")) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1221029593:
                                if (key.equals("height")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -887955139:
                                if (key.equals(MarginRight.NAME)) {
                                    c = 14;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -724174855:
                                if (key.equals("margin-leftWithPercent")) {
                                    c = '\r';
                                    break;
                                }
                                c = 65535;
                                break;
                            case -642083468:
                                if (key.equals("bottomWithPercent")) {
                                    c = 11;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -220557800:
                                if (key.equals("leftWithPercent")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -117523229:
                                if (key.equals("rightWithPercent")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 115029:
                                if (key.equals("top")) {
                                    c = '\b';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3317767:
                                if (key.equals("left")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 108511772:
                                if (key.equals("right")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 113126854:
                                if (key.equals("width")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 638354953:
                                if (key.equals("margin-topWithPercent")) {
                                    c = 17;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 713231125:
                                if (key.equals("margin-bottomWithPercent")) {
                                    c = 19;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 941004998:
                                if (key.equals(MarginLeft.NAME)) {
                                    c = '\f';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1234741496:
                                if (key.equals("heightWithPercent")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1450217250:
                                if (key.equals("margin-rightWithPercent")) {
                                    c = 15;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1970025654:
                                if (key.equals(MarginTop.NAME)) {
                                    c = 16;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 2086035242:
                                if (key.equals(MarginBottom.NAME)) {
                                    c = 18;
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
                            case 1:
                                f = dVar.m().d;
                                break;
                            case 2:
                            case 3:
                                f = dVar.o().d;
                                break;
                            case 4:
                            case 5:
                                f = dVar.d(YogaEdge.LEFT).d;
                                break;
                            case 6:
                            case 7:
                                f = dVar.d(YogaEdge.RIGHT).d;
                                break;
                            case '\b':
                            case '\t':
                                f = dVar.d(YogaEdge.TOP).d;
                                break;
                            case '\n':
                            case 11:
                                f = dVar.d(YogaEdge.BOTTOM).d;
                                break;
                            case '\f':
                            case '\r':
                                f = dVar.a(YogaEdge.LEFT).d;
                                break;
                            case 14:
                            case 15:
                                f = dVar.a(YogaEdge.RIGHT).d;
                                break;
                            case 16:
                            case 17:
                                f = dVar.a(YogaEdge.TOP).d;
                                break;
                            case 18:
                            case 19:
                                f = dVar.a(YogaEdge.BOTTOM).d;
                                break;
                        }
                        ofFloat = Keyframe.ofFloat(1.0f, f);
                    }
                    value.add(ofFloat);
                    ofKeyframe = PropertyValuesHolder.ofKeyframe("", (Keyframe[]) value.toArray(new Keyframe[size + 1]));
                } else {
                    ofKeyframe = PropertyValuesHolder.ofKeyframe("", (Keyframe[]) value.toArray(new Keyframe[size]));
                }
                g a2 = g.a(this.l, entry.getKey(), ofKeyframe);
                a(a2);
                if (map2 != null) {
                    String key2 = entry.getKey();
                    StringBuilder sb = new StringBuilder();
                    sb.append(key2);
                    sb.append("#animation-duration");
                    long c2 = com.sankuai.waimai.machpro.util.b.c(map2.get(key2 + "#animation-delay"));
                    String valueOf = String.valueOf(map2.get(key2 + "#animation-timing-function"));
                    a2.setEvaluator(new FloatEvaluator());
                    a2.setStartDelay(c2);
                    a2.setDuration((long) com.sankuai.waimai.machpro.util.b.c(map2.get(sb.toString())));
                    if (!TextUtils.isEmpty(valueOf)) {
                        a2.setInterpolator(c.a(valueOf));
                    }
                }
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @SuppressLint({"WrongConstant"})
    private void a(ValueAnimator valueAnimator) {
        Object[] objArr = {valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22e9c9c19615cabd771151c9efe49f3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22e9c9c19615cabd771151c9efe49f3c");
            return;
        }
        if (this.c == 3) {
            this.f = true;
        } else {
            valueAnimator.setRepeatMode(this.c);
        }
        valueAnimator.setRepeatCount(this.b);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        Object[] objArr = {animatorListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b6205712de4bd22683426d8d189eb29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b6205712de4bd22683426d8d189eb29");
        } else if (this.h != null) {
            this.h.addListener(animatorListener);
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b190af8b542903815ee947062e5148a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b190af8b542903815ee947062e5148a");
        } else if (this.h != null) {
            this.h.removeAllListeners();
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8db7ad6def7a3ed14e8d4548b86dda9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8db7ad6def7a3ed14e8d4548b86dda9");
        } else if (this.h != null) {
            this.h.cancel();
            this.h = null;
            this.j = null;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0724e0110d7b71e58aec6061c2d27ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0724e0110d7b71e58aec6061c2d27ac7");
        } else if (this.h != null) {
            Iterator<Animator> it = this.h.getChildAnimations().iterator();
            while (it.hasNext()) {
                it.next().end();
            }
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e99ced9466150109539836b2211fb8b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e99ced9466150109539836b2211fb8b")).booleanValue();
        }
        if (this.h != null) {
            return this.h.isRunning();
        }
        return false;
    }

    public final void b(Map<String, Object> map) {
        this.j = map;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d03cff7acedaf41753788cf6424456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d03cff7acedaf41753788cf6424456");
        } else {
            this.k.post(new Runnable() { // from class: com.sankuai.waimai.machpro.animator.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4229aa7ebbb38bb912fc776a31924441", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4229aa7ebbb38bb912fc776a31924441");
                    } else if (d.this.h != null) {
                        d.this.a();
                        if (d.this.f) {
                            d.this.h.setDuration(d.this.h.getDuration() * 2);
                        }
                        d.this.h.start();
                    }
                }
            });
        }
    }
}
