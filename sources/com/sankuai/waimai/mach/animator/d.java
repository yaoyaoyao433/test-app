package com.sankuai.waimai.mach.animator;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends b {
    public static ChangeQuickRedirect c;
    private ObjectAnimator d;
    private final Map<String, Object> e;

    @Override // com.sankuai.waimai.mach.animator.b
    public final /* bridge */ /* synthetic */ void a(View view) {
        super.a(view);
    }

    @Override // com.sankuai.waimai.mach.animator.b
    public final /* bridge */ /* synthetic */ View b() {
        return super.b();
    }

    public d(View view, Map<String, Object> map) {
        Object[] objArr = {view, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f693682c46ffae75daa6fcb92394be9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f693682c46ffae75daa6fcb92394be9");
            return;
        }
        super.a(view);
        this.e = new HashMap();
        if (map.containsKey("transform-origin")) {
            this.b = f.d(map.get("transform-origin").toString());
        }
        a(map);
    }

    private void a(Map<String, Object> map) {
        String obj;
        String[] d;
        int i = 1;
        char c2 = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aaadf615689ceee7537bb94fc721593", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aaadf615689ceee7537bb94fc721593");
            return;
        }
        Object[] objArr2 = {map};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa08b3e8a82c17e08c421066dd20c9f1", RobustBitConfig.DEFAULT_VALUE)) {
            d = (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa08b3e8a82c17e08c421066dd20c9f1");
        } else {
            if (map.containsKey("transition-property")) {
                obj = map.get("transition-property").toString();
            } else {
                obj = map.get("transition").toString();
            }
            d = f.d(obj);
        }
        String[] strArr = d;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            char c3 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1267206133) {
                if (hashCode != 605322756) {
                    if (hashCode == 1052666732 && str.equals("transform")) {
                        c3 = 0;
                    }
                } else if (str.equals(BackgroundColor.NAME)) {
                    c3 = 2;
                }
            } else if (str.equals("opacity")) {
                c3 = 1;
            }
            switch (c3) {
                case 0:
                    Map<String, Float> a = a(map.get(str));
                    this.e.put("transform", a);
                    Object[] objArr3 = new Object[i];
                    objArr3[c2] = a;
                    ChangeQuickRedirect changeQuickRedirect3 = c;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a69bdafac914385dd3f4e33ec30e794e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a69bdafac914385dd3f4e33ec30e794e");
                        break;
                    } else if (this.d == null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry<String, Float> entry : a.entrySet()) {
                            arrayList.add(PropertyValuesHolder.ofFloat(entry.getKey(), entry.getValue().floatValue()));
                        }
                        if (arrayList.size() > 0) {
                            this.d = new ObjectAnimator();
                            this.d.setDuration(0L);
                            this.d.setAutoCancel(true);
                            this.d.setValues((PropertyValuesHolder[]) arrayList.toArray(new PropertyValuesHolder[arrayList.size()]));
                            this.d.setTarget(super.b());
                            a();
                            this.d.start();
                        } else {
                            continue;
                        }
                        i2++;
                        i = 1;
                        c2 = 0;
                    }
                    break;
                case 1:
                    this.e.put(str, Float.valueOf(super.b().getAlpha()));
                    break;
                case 2:
                    Drawable background = super.b().getBackground();
                    if (background != null && (background instanceof ColorDrawable)) {
                        this.e.put(str, Integer.valueOf(((ColorDrawable) background).getColor()));
                        break;
                    }
                    break;
                default:
                    this.e.put(str, a(super.b().getLayoutParams()));
                    continue;
                    i2++;
                    i = 1;
                    c2 = 0;
            }
            i2++;
            i = 1;
            c2 = 0;
        }
    }

    private ArrayList<PropertyValuesHolder> b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55029bc140a069971cdd988bf1c0aa17", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55029bc140a069971cdd988bf1c0aa17");
        }
        ArrayList<PropertyValuesHolder> arrayList = new ArrayList<>();
        Map map2 = (Map) this.e.get("transform");
        Map<String, Float> a = a(map.get("transform"));
        for (String str : map2.keySet()) {
            if (a.containsKey(str)) {
                float floatValue = ((Float) map2.get(str)).floatValue();
                float floatValue2 = a.get(str).floatValue();
                if (floatValue != floatValue2) {
                    arrayList.add(PropertyValuesHolder.ofFloat(str, floatValue, floatValue2));
                }
            }
        }
        this.e.put("transform", a);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, java.util.Map<java.lang.String, java.lang.Object> r22) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.animator.d.a(android.view.View, java.util.Map):void");
    }
}
