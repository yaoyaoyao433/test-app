package com.meituan.android.mrn.bindingx;

import android.support.annotation.NonNull;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.e;
import com.alibaba.android.bindingx.core.internal.t;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.as;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Map<String, com.meituan.android.mrn.bindingx.c> b;
    private static final g c = new g();

    public static /* synthetic */ double a(double d2, e.b bVar) {
        Object[] objArr = {Double.valueOf(d2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "974ae3c9d0f97df457801c593c0c4e16", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "974ae3c9d0f97df457801c593c0c4e16")).doubleValue() : bVar.a(d2, new Object[0]);
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("opacity", new h());
        b.put("transform.translate", new o());
        b.put("transform.translateX", new p());
        b.put("transform.translateY", new q());
        b.put("transform.scale", new l());
        b.put("transform.scaleX", new m());
        b.put("transform.scaleY", new n());
        b.put("transform.rotate", new i());
        b.put("transform.rotateZ", new i());
        b.put("transform.rotateX", new j());
        b.put("transform.rotateY", new k());
        b.put(BackgroundColor.NAME, new a());
        b.put("color", new b());
        b.put("scroll.contentOffset", new c());
        b.put("scroll.contentOffsetX", new d());
        b.put("scroll.contentOffsetY", new C0278e());
        b.put("width", new r());
        b.put("height", new f());
    }

    @NonNull
    public static com.meituan.android.mrn.bindingx.c a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "304aa72b9cff01b9dc935686f233b706", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mrn.bindingx.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "304aa72b9cff01b9dc935686f233b706");
        }
        final com.meituan.android.mrn.bindingx.c cVar = b.get(str);
        if (cVar == null) {
            com.alibaba.android.bindingx.core.d.c("unknown property [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return c;
        }
        return new com.meituan.android.mrn.bindingx.c() { // from class: com.meituan.android.mrn.bindingx.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.bindingx.c
            public final void a(int i2, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
                Object[] objArr2 = {Integer.valueOf(i2), view, obj, bVar, map, asVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "051553777aef8784eab35222f9e1c7e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "051553777aef8784eab35222f9e1c7e9");
                    return;
                }
                com.meituan.android.mrn.bindingx.c.this.a(i2, view, obj, bVar, map, asVar);
                asVar.a(i2, new ag(Arguments.createMap()));
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class g implements com.meituan.android.mrn.bindingx.c {
        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
        }

        public g() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class h implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public h() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f878d2715027ce569b4b529d9ca74a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f878d2715027ce569b4b529d9ca74a7");
            } else if (obj instanceof Double) {
                view.setAlpha((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class o implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public o() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "955a07fefced4292ba9fe0c6bc9d23a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "955a07fefced4292ba9fe0c6bc9d23a8");
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                    double doubleValue = ((Double) arrayList.get(0)).doubleValue();
                    double doubleValue2 = ((Double) arrayList.get(1)).doubleValue();
                    view.setTranslationX((float) e.a(doubleValue, bVar));
                    view.setTranslationY((float) e.a(doubleValue2, bVar));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class p implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public p() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59075e5c5c875f1d36d6054ab7959cd9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59075e5c5c875f1d36d6054ab7959cd9");
            } else if (obj instanceof Double) {
                view.setTranslationX((float) e.a(((Double) obj).doubleValue(), bVar));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class q implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public q() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe90d4e34ddca916967ef97d0dbe05f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe90d4e34ddca916967ef97d0dbe05f");
            } else if (obj instanceof Double) {
                view.setTranslationY((float) e.a(((Double) obj).doubleValue(), bVar));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class l implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public l() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6205efc85f1fdb3587c5c6193610d1f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6205efc85f1fdb3587c5c6193610d1f0");
                return;
            }
            int a2 = t.a(view.getContext(), com.meituan.android.mrn.bindingx.d.a(map.get("perspective"), 0));
            Pair<Float, Float> a3 = t.a(com.meituan.android.mrn.bindingx.d.a(map.get("transformOrigin"), (String) null), view);
            if (a2 != 0) {
                view.setCameraDistance(a2);
            }
            if (a3 != null) {
                view.setPivotX(((Float) a3.first).floatValue());
                view.setPivotY(((Float) a3.second).floatValue());
            }
            if (obj instanceof Double) {
                float doubleValue = (float) ((Double) obj).doubleValue();
                view.setScaleX(doubleValue);
                view.setScaleY(doubleValue);
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                    double doubleValue2 = ((Double) arrayList.get(0)).doubleValue();
                    double doubleValue3 = ((Double) arrayList.get(1)).doubleValue();
                    view.setScaleX((float) doubleValue2);
                    view.setScaleY((float) doubleValue3);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class m implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public m() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17899889c850566f0a88f1617f435192", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17899889c850566f0a88f1617f435192");
            } else if (obj instanceof Double) {
                Pair<Float, Float> a2 = t.a(com.meituan.android.mrn.bindingx.d.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != null) {
                    view.setPivotX(((Float) a2.first).floatValue());
                    view.setPivotY(((Float) a2.second).floatValue());
                }
                view.setScaleX((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class n implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public n() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9645cd32746ebcf89c08368226dc68b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9645cd32746ebcf89c08368226dc68b");
            } else if (obj instanceof Double) {
                Pair<Float, Float> a2 = t.a(com.meituan.android.mrn.bindingx.d.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != null) {
                    view.setPivotX(((Float) a2.first).floatValue());
                    view.setPivotY(((Float) a2.second).floatValue());
                }
                view.setScaleY((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class i implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public i() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6021a9ba2b7cde0b188c5c8e620ba480", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6021a9ba2b7cde0b188c5c8e620ba480");
            } else if (obj instanceof Double) {
                int a2 = t.a(view.getContext(), com.meituan.android.mrn.bindingx.d.a(map.get("perspective"), 0));
                Pair<Float, Float> a3 = t.a(com.meituan.android.mrn.bindingx.d.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != 0) {
                    view.setCameraDistance(a2);
                }
                if (a3 != null) {
                    view.setPivotX(((Float) a3.first).floatValue());
                    view.setPivotY(((Float) a3.second).floatValue());
                }
                view.setRotation((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class j implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public j() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20143bd4c1312d19ff7c4179f05eb35b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20143bd4c1312d19ff7c4179f05eb35b");
            } else if (obj instanceof Double) {
                int a2 = t.a(view.getContext(), com.meituan.android.mrn.bindingx.d.a(map.get("perspective"), 0));
                Pair<Float, Float> a3 = t.a(com.meituan.android.mrn.bindingx.d.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != 0) {
                    view.setCameraDistance(a2);
                }
                if (a3 != null) {
                    view.setPivotX(((Float) a3.first).floatValue());
                    view.setPivotY(((Float) a3.second).floatValue());
                }
                view.setRotationX((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class k implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public k() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc960ee53f69d9be359e5adf25e28755", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc960ee53f69d9be359e5adf25e28755");
            } else if (obj instanceof Double) {
                int a2 = t.a(view.getContext(), com.meituan.android.mrn.bindingx.d.a(map.get("perspective"), 0));
                Pair<Float, Float> a3 = t.a(com.meituan.android.mrn.bindingx.d.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != 0) {
                    view.setCameraDistance(a2);
                }
                if (a3 != null) {
                    view.setPivotX(((Float) a3.first).floatValue());
                    view.setPivotY(((Float) a3.second).floatValue());
                }
                view.setRotationY((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class r implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public r() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d34d01e484df9a7b8d5e7ffa40d9852", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d34d01e484df9a7b8d5e7ffa40d9852");
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) e.a(doubleValue, bVar);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class f implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public f() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8154b8f19b9b5a6749c15e3744208e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8154b8f19b9b5a6749c15e3744208e");
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) e.a(doubleValue, bVar);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class a implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "228be3d8207e7a6291841ab12156d2c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "228be3d8207e7a6291841ab12156d2c1");
            } else if (obj instanceof Integer) {
                view.setBackgroundColor(((Integer) obj).intValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class b implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d674a3b859225c6acf01b8026381be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d674a3b859225c6acf01b8026381be");
            } else if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(intValue);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class c implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75831dbbe41ceafeac69a5566bb5f3f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75831dbbe41ceafeac69a5566bb5f3f3");
            } else if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (obj instanceof Double) {
                    double doubleValue = ((Double) obj).doubleValue();
                    scrollView.setScrollX((int) e.a(doubleValue, bVar));
                    scrollView.setScrollY((int) e.a(doubleValue, bVar));
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                        double doubleValue2 = ((Double) arrayList.get(0)).doubleValue();
                        double doubleValue3 = ((Double) arrayList.get(1)).doubleValue();
                        scrollView.setScrollX((int) e.a(doubleValue2, bVar));
                        scrollView.setScrollY((int) e.a(doubleValue3, bVar));
                    }
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static final class d implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ce1e4a69163d18620f15f15fe7b0da5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ce1e4a69163d18620f15f15fe7b0da5");
            } else if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (obj instanceof Double) {
                    scrollView.setScrollX((int) e.a(((Double) obj).doubleValue(), bVar));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.mrn.bindingx.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0278e implements com.meituan.android.mrn.bindingx.c {
        public static ChangeQuickRedirect a;

        public C0278e() {
        }

        @Override // com.meituan.android.mrn.bindingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull as asVar) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, asVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9674eae1d410906d26d5bc075d18f5bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9674eae1d410906d26d5bc075d18f5bb");
            } else if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (obj instanceof Double) {
                    scrollView.setScrollY((int) e.a(((Double) obj).doubleValue(), bVar));
                }
            }
        }
    }
}
