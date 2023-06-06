package com.meituan.msc.uimanager.bingingx;

import android.support.annotation.NonNull;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.alibaba.android.bindingx.core.e;
import com.alibaba.android.bindingx.core.internal.t;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final Map<String, com.meituan.msc.uimanager.bingingx.c> b;
    private static final g c = new g();

    public static /* synthetic */ double a(double d2, e.b bVar) {
        Object[] objArr = {Double.valueOf(d2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d3ed6b2f90bf84c6d176bd397e10d57", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d3ed6b2f90bf84c6d176bd397e10d57")).doubleValue() : bVar.a(d2, new Object[0]);
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
        b.put("scroll.contentOffsetY", new C0485e());
        b.put("width", new r());
        b.put("height", new f());
    }

    @NonNull
    public static com.meituan.msc.uimanager.bingingx.c a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55d62ef41eb2dc7120199866381e8ffb", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.uimanager.bingingx.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55d62ef41eb2dc7120199866381e8ffb");
        }
        final com.meituan.msc.uimanager.bingingx.c cVar = b.get(str);
        if (cVar == null) {
            com.alibaba.android.bindingx.core.d.c("unknown property [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return c;
        }
        return new com.meituan.msc.uimanager.bingingx.c() { // from class: com.meituan.msc.uimanager.bingingx.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.uimanager.bingingx.c
            public final void a(int i2, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
                Object[] objArr2 = {Integer.valueOf(i2), view, obj, bVar, map, uIImplementation};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d6ac995f19578a70c8ef09462d1adf4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d6ac995f19578a70c8ef09462d1adf4");
                    return;
                }
                com.meituan.msc.uimanager.bingingx.c.this.a(i2, view, obj, bVar, map, uIImplementation);
                uIImplementation.a(i2, new ab(Arguments.createMap()));
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class g implements com.meituan.msc.uimanager.bingingx.c {
        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
        }

        public g() {
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class h implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public h() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02dab6be3628894ef50aa359604bed6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02dab6be3628894ef50aa359604bed6");
            } else if (obj instanceof Double) {
                view.setAlpha((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class o implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public o() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc1e7938d2a9a057ebae83caae211c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc1e7938d2a9a057ebae83caae211c4");
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                view.setTranslationX((float) e.a(doubleValue, bVar));
                view.setTranslationY((float) e.a(doubleValue, bVar));
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() >= 2 && (arrayList.get(0) instanceof Double) && (arrayList.get(1) instanceof Double)) {
                    double doubleValue2 = ((Double) arrayList.get(0)).doubleValue();
                    double doubleValue3 = ((Double) arrayList.get(1)).doubleValue();
                    view.setTranslationX((float) e.a(doubleValue2, bVar));
                    view.setTranslationY((float) e.a(doubleValue3, bVar));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class p implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public p() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1612200c8a87455da4d5ac5405b41ab", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1612200c8a87455da4d5ac5405b41ab");
            } else if (obj instanceof Double) {
                view.setTranslationX((float) e.a(((Double) obj).doubleValue(), bVar));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class q implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public q() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22a9a29296cb4fc965cb4c8105ea33ff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22a9a29296cb4fc965cb4c8105ea33ff");
            } else if (obj instanceof Double) {
                view.setTranslationY((float) e.a(((Double) obj).doubleValue(), bVar));
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class l implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public l() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7df6cd272f36400fc6efd008b412ec10", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7df6cd272f36400fc6efd008b412ec10");
                return;
            }
            int a2 = t.a(view.getContext(), com.meituan.msc.uimanager.bingingx.b.a(map.get("perspective"), 0));
            Pair<Float, Float> a3 = t.a(com.meituan.msc.uimanager.bingingx.b.a(map.get("transformOrigin"), (String) null), view);
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
    /* loaded from: classes3.dex */
    static final class m implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public m() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ca0ec21e57c4e8ff496c8a1add36b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ca0ec21e57c4e8ff496c8a1add36b9");
                return;
            }
            Log.e("MSCLOG", "ScaleXUpdater " + obj);
            if (obj instanceof Double) {
                Pair<Float, Float> a2 = t.a(com.meituan.msc.uimanager.bingingx.b.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != null) {
                    view.setPivotX(((Float) a2.first).floatValue());
                    view.setPivotY(((Float) a2.second).floatValue());
                }
                view.setScaleX((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class n implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public n() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79fc65d93bc1e2c00f27e77b69aff4ad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79fc65d93bc1e2c00f27e77b69aff4ad");
                return;
            }
            Log.e("MSCLOG", "ScaleYUpdater " + obj);
            if (obj instanceof Double) {
                Pair<Float, Float> a2 = t.a(com.meituan.msc.uimanager.bingingx.b.a(map.get("transformOrigin"), (String) null), view);
                if (a2 != null) {
                    view.setPivotX(((Float) a2.first).floatValue());
                    view.setPivotY(((Float) a2.second).floatValue());
                }
                view.setScaleY((float) ((Double) obj).doubleValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class i implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public i() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daeb6404020a7cc7bdae26a3378e2686", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daeb6404020a7cc7bdae26a3378e2686");
            } else if (obj instanceof Double) {
                int a2 = t.a(view.getContext(), com.meituan.msc.uimanager.bingingx.b.a(map.get("perspective"), 0));
                Pair<Float, Float> a3 = t.a(com.meituan.msc.uimanager.bingingx.b.a(map.get("transformOrigin"), (String) null), view);
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
    /* loaded from: classes3.dex */
    static final class j implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public j() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5c764a577bbf52a855b5edf9c79047", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5c764a577bbf52a855b5edf9c79047");
            } else if (obj instanceof Double) {
                int a2 = t.a(view.getContext(), com.meituan.msc.uimanager.bingingx.b.a(map.get("perspective"), 0));
                Pair<Float, Float> a3 = t.a(com.meituan.msc.uimanager.bingingx.b.a(map.get("transformOrigin"), (String) null), view);
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
    /* loaded from: classes3.dex */
    public static final class k implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public k() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9481f6063d3718571a11d690612fc81c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9481f6063d3718571a11d690612fc81c");
            } else if (obj instanceof Double) {
                int a2 = t.a(view.getContext(), com.meituan.msc.uimanager.bingingx.b.a(map.get("perspective"), 0));
                Pair<Float, Float> a3 = t.a(com.meituan.msc.uimanager.bingingx.b.a(map.get("transformOrigin"), (String) null), view);
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
    /* loaded from: classes3.dex */
    public static final class r implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public r() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf33fff64bd04590d350712f654635bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf33fff64bd04590d350712f654635bb");
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) e.a(doubleValue, bVar);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class f implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public f() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a431adc97ddfdf8ceaf2676963c4b0d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a431adc97ddfdf8ceaf2676963c4b0d5");
            } else if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = (int) e.a(doubleValue, bVar);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class a implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc8c0e46b9f22606b944f9d1d495db4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc8c0e46b9f22606b944f9d1d495db4");
            } else if (obj instanceof Integer) {
                view.setBackgroundColor(((Integer) obj).intValue());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class b implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55ec48ed1a725318672f9f6a2efddcec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55ec48ed1a725318672f9f6a2efddcec");
            } else if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(intValue);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static final class c implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37e2015eb056f42220efe2a8427e1b2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37e2015eb056f42220efe2a8427e1b2");
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
    /* loaded from: classes3.dex */
    public static final class d implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a15fb62705d7c911816472ef09ce38b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a15fb62705d7c911816472ef09ce38b");
            } else if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (obj instanceof Double) {
                    scrollView.setScrollX((int) e.a(((Double) obj).doubleValue(), bVar));
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.uimanager.bingingx.e$e  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0485e implements com.meituan.msc.uimanager.bingingx.c {
        public static ChangeQuickRedirect a;

        public C0485e() {
        }

        @Override // com.meituan.msc.uimanager.bingingx.c
        public final void a(int i, @NonNull View view, @NonNull Object obj, @NonNull e.b bVar, @NonNull Map<String, Object> map, @NonNull UIImplementation uIImplementation) {
            Object[] objArr = {Integer.valueOf(i), view, obj, bVar, map, uIImplementation};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c43ffc5f1bbe18971ae6ae49028638d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c43ffc5f1bbe18971ae6ae49028638d");
            } else if (view instanceof ScrollView) {
                ScrollView scrollView = (ScrollView) view;
                if (obj instanceof Double) {
                    scrollView.setScrollY((int) e.a(((Double) obj).doubleValue(), bVar));
                }
            }
        }
    }
}
