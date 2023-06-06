package com.sankuai.meituan.mapsdk.core.annotations;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapUtils;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptorFactory;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.PolylineOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class v extends com.sankuai.meituan.mapsdk.core.annotations.b implements com.sankuai.meituan.mapsdk.core.interfaces.d, com.sankuai.meituan.mapsdk.maps.interfaces.r {
    public static ChangeQuickRedirect d;
    private float A;
    private int[] B;
    private int C;
    private int[] D;
    private int E;
    private int[] F;
    private float G;
    private BitmapDescriptor H;
    private BitmapDescriptor I;
    private BitmapDescriptor J;
    private float K;
    private boolean L;
    private int M;
    private int N;
    private int O;
    private final List<PolylineOptions.SegmentText> P;
    private c Q;
    private b R;
    private final List<List<LatLng>> S;
    private final List<Integer> T;
    private final List<Integer> U;
    private boolean V;
    private final d W;
    private Animator X;
    volatile SparseArray<Double> e;
    private Context f;
    private PolylineOptions g;
    private final List<LatLng> h;
    private boolean y;
    private boolean z;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setColorTexture(String str) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setCustomTextureIndex(List<Integer> list) {
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setCustomTextureList(List<BitmapDescriptor> list) {
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final /* bridge */ /* synthetic */ float getAlpha() {
        return super.getAlpha();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ String getId() {
        return super.getId();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ float getMaxZoomLevel() {
        return super.getMaxZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ float getMinZoomLevel() {
        return super.getMinZoomLevel();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ Object getObject() {
        return super.getObject();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ float getZIndex() {
        return super.getZIndex();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ boolean isClickable() {
        return super.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ boolean isVisible() {
        return super.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.b, com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMaxZoomLevel(float f) {
        super.setMaxZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.b, com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMinZoomLevel(float f) {
        super.setMinZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setObject(Object obj) {
        super.setObject(obj);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum b {
        Round,
        Butt,
        Square;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b224c42f0b73cbf7050a2cfd1d6df62", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b224c42f0b73cbf7050a2cfd1d6df62");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bea0594a3817d7690ecc322f736a231", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bea0594a3817d7690ecc322f736a231") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dcd0a125a5ea9f278685a4ea4f67a2a", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dcd0a125a5ea9f278685a4ea4f67a2a") : (b[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        Miter,
        Bevel,
        Round;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ef00878365387d6746421644fdf76f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ef00878365387d6746421644fdf76f");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac7fd2cc17bfe816cb9a1d7f93745221", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac7fd2cc17bfe816cb9a1d7f93745221") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "be57da3109654f92fe45ae4ca3979fae", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "be57da3109654f92fe45ae4ca3979fae") : (c[]) values().clone();
        }
    }

    public v(g gVar, PolylineOptions polylineOptions) {
        super(gVar);
        Object[] objArr = {gVar, polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4010968e7ac825edaa412384825905a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4010968e7ac825edaa412384825905a1");
            return;
        }
        this.h = new ArrayList();
        this.y = false;
        this.G = 0.0f;
        this.P = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = false;
        this.W = new d();
        String str = "";
        if (polylineOptions == null) {
            str = "PolylineOptions is null";
        } else if (polylineOptions.getPoints() == null || polylineOptions.getPoints().isEmpty()) {
            str = "polyline == null or polyline's points is empty";
        }
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
            return;
        }
        if (this.f == null) {
            this.f = com.sankuai.meituan.mapsdk.mapcore.a.a();
        }
        this.s.a(3003, com.sankuai.meituan.mapsdk.core.render.b.f(0));
        this.c.b(MapConstant.LayerPropertyFlag_TextField, super.a("MapConstant.LayerPropertyFlag_TextField"));
        com.sankuai.meituan.mapsdk.core.render.model.h hVar = this.b;
        Object[] objArr2 = {"MapConstant.LayerPropertyFlag_TextField"};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.model.h.c;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "12bfa4ff3a3d6d9692314149b66ab02f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "12bfa4ff3a3d6d9692314149b66ab02f");
        } else if (hVar.d != null) {
            hVar.d.setAutoMergePropertyKey(hVar.e, "MapConstant.LayerPropertyFlag_TextField");
        }
        this.c.a(MapConstant.LayerPropertyFlag_TextAllowOverlap, false);
        this.c.a(MapConstant.LayerPropertyFlag_TextIgnorePlacement, false);
        this.c.a(MapConstant.LayerPropertyFlag_TextUnique, true);
        this.c.a(MapConstant.LayerPropertyFlag_TextLetterSpacing, 0.1f);
        this.c.a(MapConstant.LayerPropertyFlag_MarkerSpacing, 10);
        this.c.a(MapConstant.LayerPropertyFlag_TextMaxAngle, 60.0f);
        this.c.a(4000, 1);
        this.s.a(MapConstant.LayerPropertyFlag_TextUnique, false, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_IconAllowOverlap, true, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_IconSize, 1.0f, "collision");
        this.s.a(4000, 1, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_IconPitchAlignment, 0, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_IconRotationAlignment, 0, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_IconAnchor, 1, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_MarkerSpacing, 10.0f, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, false, "collision");
        this.s.a(MapConstant.LayerPropertyFlag_MarkerCustomCollision, true, "collision");
        setOptions(polylineOptions);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf9e6c960d42584756ceb0cb1ddf6f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf9e6c960d42584756ceb0cb1ddf6f1");
        } else if (obj != null && !f()) {
            super.a(obj);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34af491ca5ba0846fe409bca1d406420", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34af491ca5ba0846fe409bca1d406420");
                return;
            }
            this.g = b();
            if (this.g != null) {
                this.L = this.g.isGeodesic();
                setVisible(this.g.isVisible());
                setWidth(this.g.getWidth());
                setZIndex(this.g.getZIndex());
                setLevel(this.g.getLevel());
                setPoints(this.g.getPoints());
                setText(this.g.getText());
                setAlpha(this.g.getAlpha());
                setClickable(this.g.isClickable());
                setAvoidable(this.g.isAvoidable());
                setTag(this.g.getTag());
                if (this.g.getPattern() == null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "99982808ba77022f82e36ac5de80a7ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "99982808ba77022f82e36ac5de80a7ef");
                    } else {
                        List<Integer> colorValues = this.g.getColorValues();
                        if (colorValues != null) {
                            int[] iArr = new int[colorValues.size()];
                            for (int i = 0; i < colorValues.size(); i++) {
                                iArr[i] = colorValues.get(i).intValue();
                            }
                            a(iArr);
                        } else {
                            setColor(this.g.getColor());
                        }
                        List<Integer> borderColors = this.g.getBorderColors();
                        if (borderColors != null) {
                            int[] iArr2 = new int[borderColors.size()];
                            for (int i2 = 0; i2 < borderColors.size(); i2++) {
                                iArr2[i2] = borderColors.get(i2).intValue();
                            }
                            b(iArr2);
                        } else {
                            a(this.g.getBorderColor());
                        }
                        a(this.g.getBorderWidth());
                        a(this.g.getCustomTexture());
                        b(this.g.getArrowSpacing());
                        setDashPattern(this.g.isDottedLine() ? PolylineOptions.DEFAULT_DASH_PATTERN : null);
                    }
                } else {
                    a(this.g.getPattern());
                }
                boolean lineCap = this.g.getLineCap();
                Object[] objArr4 = {Byte.valueOf(lineCap ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "25192d32fc2672976fdf3398423d4b24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "25192d32fc2672976fdf3398423d4b24");
                } else if (!lineCap || (getPattern() instanceof PolylineOptions.DotColorLinePattern) || b().isDottedLine()) {
                    a(b.Butt);
                } else {
                    a(b.Round);
                }
                c cVar = c.Bevel;
                Object[] objArr5 = {cVar};
                ChangeQuickRedirect changeQuickRedirect5 = d;
                if (!PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4b171c3f53d009d30c47b8bc8145bd30", RobustBitConfig.DEFAULT_VALUE)) {
                    this.Q = cVar;
                    switch (this.Q) {
                        case Round:
                            this.s.a(3001, 2);
                            break;
                        case Bevel:
                            this.s.a(3001, 1);
                            break;
                        default:
                            this.s.a(3001, 0);
                            break;
                    }
                } else {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4b171c3f53d009d30c47b8bc8145bd30");
                }
                d();
                a(1.0f, false);
            }
        }
    }

    private void a(PolylineOptions.PatternItem patternItem) {
        Object[] objArr = {patternItem};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9ef5eb433ad825a1f3ba76ed93056d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9ef5eb433ad825a1f3ba76ed93056d");
        } else if (patternItem instanceof PolylineOptions.SingleColorPattern) {
            PolylineOptions.SingleColorPattern singleColorPattern = (PolylineOptions.SingleColorPattern) patternItem;
            setColor(singleColorPattern.getColor());
            a(singleColorPattern.getBorderColor());
            a(singleColorPattern.getBorderWidth());
            a(singleColorPattern.getArrowTexture());
            b(singleColorPattern.getArrowSpacing());
        } else if (patternItem instanceof PolylineOptions.MultiColorPattern) {
            PolylineOptions.MultiColorPattern multiColorPattern = (PolylineOptions.MultiColorPattern) patternItem;
            a(multiColorPattern);
            a(multiColorPattern.getBorderWidth());
            a(multiColorPattern.getArrowTexture());
            b(multiColorPattern.getArrowSpacing() + 8);
        } else if (patternItem instanceof PolylineOptions.DotLinePattern) {
            PolylineOptions.DotLinePattern dotLinePattern = (PolylineOptions.DotLinePattern) patternItem;
            a(dotLinePattern.getTexture());
            b(dotLinePattern.getSpacing() + 32);
        } else if (patternItem instanceof PolylineOptions.DotColorLinePattern) {
            PolylineOptions.DotColorLinePattern dotColorLinePattern = (PolylineOptions.DotColorLinePattern) patternItem;
            setColor(dotColorLinePattern.getColor());
            setDashPattern(dotColorLinePattern.getDashPattern());
        }
    }

    private void a(@NonNull PolylineOptions.MultiColorPattern multiColorPattern) {
        Object[] objArr = {multiColorPattern};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a7e37ecd9ec1431e45ee9b632f3889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a7e37ecd9ec1431e45ee9b632f3889");
        } else if (this.h.isEmpty()) {
        } else {
            int[] indexes = multiColorPattern.getIndexes();
            int[] colors = multiColorPattern.getColors();
            int[] borderColors = multiColorPattern.getBorderColors();
            int size = this.h.size() - 1;
            if (indexes == null || indexes.length <= 0) {
                indexes = new int[]{size};
            }
            if (colors == null || colors.length <= 0) {
                colors = new int[]{PolylineOptions.DEFAULT_BODY_COLOR};
            }
            if (borderColors == null || borderColors.length <= 0) {
                borderColors = new int[]{PolylineOptions.DEFAULT_BORDER_COLOR};
            }
            c(indexes);
            a(colors);
            b(borderColors);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void startAnimation(Animation animation, LatLng latLng) {
        Object[] objArr = {animation, latLng};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8caa108030b85c7e098af56019919ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8caa108030b85c7e098af56019919ee3");
        } else if (f()) {
        } else {
            Object[] objArr2 = {animation};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e17bdcaddc100e8d54f501db82b8f780", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e17bdcaddc100e8d54f501db82b8f780");
            } else if (animation != null) {
                if (this.X != null) {
                    this.X.cancel();
                }
                this.X = com.sankuai.meituan.mapsdk.api.model.animation.b.a(this, animation);
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "760b8ce3de6cf85dd3b68941a6dc50bb", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "760b8ce3de6cf85dd3b68941a6dc50bb")).booleanValue();
            } else if (this.X != null) {
                this.X.start();
            }
        }
    }

    public final void a(float f, boolean z) {
        boolean z2 = false;
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a277773d0861fdc5276adf5cf1a15ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a277773d0861fdc5276adf5cf1a15ded");
        } else if (f()) {
        } else {
            if (this.s != null) {
                this.s.a(MapConstant.LayerPropertyFlag_LineDisplayPart, f);
                this.s.a(MapConstant.LayerPropertyFlag_MarkerDisplayPart, f);
            }
            if (this.c != null) {
                this.c.b((z || f == 1.0f) ? true : true);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd0302d4d13403425be263e3b0d8b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd0302d4d13403425be263e3b0d8b82");
        } else if (f()) {
        } else {
            super.setAlpha(f);
            this.s.a(3002, this.v);
            this.c.a(3002, this.v);
            if (Float.compare(f, 0.0f) == 0) {
                this.s.a(false);
            } else {
                this.s.a(this.n);
            }
            if (this.r != null) {
                ((PolylineOptions) this.r).alpha(f);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final List<LatLng> getPoints() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a784e767c35d3e29cc19fd004bd9a6", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a784e767c35d3e29cc19fd004bd9a6") : Collections.unmodifiableList(this.h);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setPoints(List<LatLng> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e1dfb0e165ba4f7036777f430b9842", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e1dfb0e165ba4f7036777f430b9842");
        } else if (f()) {
        } else {
            if (list == null || list.isEmpty()) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("points == null or points is empty");
            }
            this.h.clear();
            this.h.addAll(list);
            d();
            if (this.r != null && list != ((PolylineOptions) this.r).getPoints()) {
                ((PolylineOptions) this.r).points(list);
            }
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.meituan.mapfoundation.threadcenter.a.a(), new a(this.h));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private List<LatLng> c;

        public a(List<LatLng> list) {
            Object[] objArr = {v.this, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eced53ae6fc5f1a23f94ebc4d56e05d8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eced53ae6fc5f1a23f94ebc4d56e05d8");
            } else {
                this.c = new ArrayList(list);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SparseArray<Double> sparseArray;
            int i = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "122527b7890953ec46aefe7c5a91eef4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "122527b7890953ec46aefe7c5a91eef4");
            } else if (v.this.f() || this.c.size() <= 0) {
            } else {
                v vVar = v.this;
                List<LatLng> list = this.c;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "436550c05594c85cdff2126f84116281", RobustBitConfig.DEFAULT_VALUE)) {
                    sparseArray = (SparseArray) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "436550c05594c85cdff2126f84116281");
                } else {
                    SparseArray<Double> sparseArray2 = new SparseArray<>();
                    double d = 0.0d;
                    sparseArray2.put(0, Double.valueOf(0.0d));
                    while (i < list.size() - 1) {
                        i++;
                        d += MapUtils.calculateLineDistanceByMercatorDouble(list.get(i), list.get(i));
                        sparseArray2.put(i, Double.valueOf(d));
                    }
                    sparseArray = sparseArray2;
                }
                vVar.e = sparseArray;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isDottedLine() {
        return this.z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setDashPattern(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1507b24581a5a8d4785d5a6f2571c29b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1507b24581a5a8d4785d5a6f2571c29b");
        } else if (!f()) {
            if (this.H != null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("You had set texture line property, it'll not response the dotted line setting.");
                return;
            }
            this.z = iArr != null && iArr.length > 1;
            if (this.z) {
                this.s.a(MapConstant.LayerPropertyFlag_LineGradientType, 1);
                float[] fArr = new float[iArr.length];
                for (int i = 0; i < fArr.length; i++) {
                    fArr[i] = iArr[i] / this.A;
                }
                this.s.a(3009, fArr);
            } else {
                this.s.a(3009, h.c);
            }
            PolylineOptions polylineOptions = (PolylineOptions) this.r;
            if (polylineOptions == null || polylineOptions.getPattern() != null) {
                return;
            }
            polylineOptions.setDottedLine(this.z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final float getWidth() {
        return this.A;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6a9e309dbd05838238db8534cea354", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6a9e309dbd05838238db8534cea354");
        } else if (f()) {
        } else {
            float abs = Math.abs(f);
            this.A = abs;
            this.s.a(3006, com.sankuai.meituan.mapsdk.core.utils.d.a(abs));
            this.c.a(3006, com.sankuai.meituan.mapsdk.core.utils.d.a(abs));
            if (this.H != null) {
                h();
                b(this.K);
            }
            if (this.r != null) {
                ((PolylineOptions) this.r).width(abs);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.b, com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e457ad03ed0de68d510c980f2406d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e457ad03ed0de68d510c980f2406d99");
        } else if (f()) {
        } else {
            super.setVisible(z);
            if (z) {
                this.s.a(this.n);
            } else {
                this.s.a(false);
            }
            if (this.r != null) {
                ((PolylineOptions) this.r).visible(z);
            }
        }
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ee13c6cc11c3f5186498628428a9753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ee13c6cc11c3f5186498628428a9753");
            return;
        }
        this.G = f;
        if (this.r != null) {
            ((PolylineOptions) this.r).borderWidth(f);
        }
        if (this.H != null) {
            h();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final int getColor() {
        return this.C;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4bccc6f944d16d4dc9d7951b9b2ac99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4bccc6f944d16d4dc9d7951b9b2ac99");
        } else if (f() || i == 0) {
        } else {
            if (this.T != null && this.T.size() > 1) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("You had set multiColors property, it'll not response the single color setting.");
                return;
            }
            this.s.a(3003, com.sankuai.meituan.mapsdk.core.render.b.f(i));
            this.C = i;
            a(new int[]{i});
            PolylineOptions polylineOptions = (PolylineOptions) this.r;
            if (polylineOptions != null) {
                if (polylineOptions.getPattern() instanceof PolylineOptions.SingleColorPattern) {
                    ((PolylineOptions.SingleColorPattern) polylineOptions.getPattern()).color(i);
                } else {
                    polylineOptions.color(i);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setColors(int[] iArr, int[] iArr2) {
        Object[] objArr = {iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd1bff06e755dc59c683529dc19b2e8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd1bff06e755dc59c683529dc19b2e8e");
        } else if (f() || iArr == null || iArr2 == null) {
        } else {
            a(iArr);
            PolylineOptions polylineOptions = (PolylineOptions) this.r;
            if (polylineOptions == null || !(polylineOptions.getPattern() instanceof PolylineOptions.MultiColorPattern)) {
                return;
            }
            ((PolylineOptions.MultiColorPattern) polylineOptions.getPattern()).colors(iArr, iArr2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions.Text getText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10043f3ef99dfca868d9ed7917b009a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions.Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10043f3ef99dfca868d9ed7917b009a9");
        }
        PolylineOptions polylineOptions = (PolylineOptions) this.r;
        if (polylineOptions != null) {
            return polylineOptions.getText();
        }
        return null;
    }

    private void a(Iterable<PolylineOptions.SegmentText> iterable) {
        Object[] objArr = {iterable};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e88b0d94dfff1749da8f33336c7203", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e88b0d94dfff1749da8f33336c7203");
        } else if (!f()) {
            ArrayList arrayList = new ArrayList();
            for (PolylineOptions.SegmentText segmentText : iterable) {
                arrayList.add(segmentText);
            }
            this.P.clear();
            this.P.addAll(arrayList);
            i();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setAvoidable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bca823d49a2ab83b8c41f504a1ae289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bca823d49a2ab83b8c41f504a1ae289");
        } else if (f()) {
        } else {
            this.V = z;
            this.s.a(MapConstant.LayerPropertyFlag_MarkerCustomCollision, this.V, "collision");
            if (this.V && this.A > 0.0f) {
                if (this.J != null) {
                    this.j.e.b(this.t, this.J);
                    this.J = null;
                }
                int max = Math.max((int) this.A, 1);
                Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(0);
                canvas.drawRect(new Rect(0, 0, max, max), paint);
                this.J = BitmapDescriptorFactory.fromBitmap(createBitmap);
                if (this.J != null) {
                    this.j.e.a(this.t, this.J);
                    this.s.a(MapConstant.LayerPropertyFlag_IconImage, this.J.getId(), "collision");
                }
            }
            if (this.r != null) {
                ((PolylineOptions) this.r).avoidable(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final boolean isAvoidable() {
        return this.V;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions.PatternItem getPattern() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b30c28a8a4969bf4cff33698f6b6cb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions.PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b30c28a8a4969bf4cff33698f6b6cb2");
        }
        if (this.r == null) {
            return null;
        }
        return ((PolylineOptions) this.r).getPattern();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setPattern(PolylineOptions.PatternItem patternItem) {
        Object[] objArr = {patternItem};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b99916cbfb9420bcd41522ef0994357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b99916cbfb9420bcd41522ef0994357");
        } else if (this.r == null || f()) {
        } else {
            ((PolylineOptions) this.r).pattern(patternItem);
            if (patternItem != null) {
                a(patternItem);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final Object getTag() {
        return this.q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51d684419e65bc1ded6eb954d70b669d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51d684419e65bc1ded6eb954d70b669d");
            return;
        }
        this.q = obj;
        if (this.r != null) {
            ((PolylineOptions) this.r).tag(obj);
        }
    }

    private void a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc27e7cc0c250ae045f27edf6e5c0f34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc27e7cc0c250ae045f27edf6e5c0f34");
        } else if (f() || iArr == null) {
        } else {
            this.D = (int[]) iArr.clone();
            if (this.z) {
                this.s.a(MapConstant.LayerPropertyFlag_LineGradientType, 1);
            } else {
                this.s.a(MapConstant.LayerPropertyFlag_LineGradientType, 0);
            }
            d();
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d73e05d462389db5fff5b23c58da912b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d73e05d462389db5fff5b23c58da912b");
        } else if (f() || i == 0) {
        } else {
            if (this.F != null && this.F.length > 0) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("You had set multiBorderColors property, it'll not response the single borderColor setting.");
                return;
            }
            this.E = i;
            b(new int[]{i});
        }
    }

    private void b(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2ca63d6c759c5fd49e856a6924dd4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2ca63d6c759c5fd49e856a6924dd4f");
        } else if (f() || iArr == null) {
        } else {
            this.F = (int[]) iArr.clone();
            d();
        }
    }

    private void a(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3addac862e1255683aa546e57a3eb69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3addac862e1255683aa546e57a3eb69c");
        } else if (f() || bitmapDescriptor == null) {
        } else {
            Bitmap bitmap = bitmapDescriptor.getBitmap();
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.setRotate(90.0f);
            BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false));
            this.j.e.a(this.t, fromBitmap, this.H);
            this.H = fromBitmap;
            a(this.s, fromBitmap.getId());
        }
    }

    private void a(com.sankuai.meituan.mapsdk.core.render.model.f fVar, String str) {
        Object[] objArr = {fVar, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252c82089bb62631290433636152e464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252c82089bb62631290433636152e464");
            return;
        }
        fVar.a(MapConstant.LayerPropertyFlag_MarkerAvoidScreen, false);
        fVar.a(MapConstant.LayerPropertyFlag_IconAllowOverlap, true);
        fVar.a(MapConstant.LayerPropertyFlag_IconIgnorePlacement, true);
        fVar.a(MapConstant.LayerPropertyFlag_IconPitchAlignment, 0);
        fVar.a(MapConstant.LayerPropertyFlag_IconRotationAlignment, 0);
        fVar.a(MapConstant.LayerPropertyFlag_TextUnique, false);
        fVar.a(4000, 1);
        fVar.a(MapConstant.LayerPropertyFlag_IconImage, str);
        h();
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "970a1fbed68fe590cf33c19795b382db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "970a1fbed68fe590cf33c19795b382db");
        } else if (this.H != null) {
            float f = this.A;
            if (this.G != 0.0f) {
                f = this.A - (this.G * 2.0f);
            }
            this.s.a(MapConstant.LayerPropertyFlag_IconSize, f > 0.0f ? f / this.H.getHeight() : 0.0f);
        }
    }

    private void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fccfd3bd4d0a839fcc015e13d21e0e4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fccfd3bd4d0a839fcc015e13d21e0e4d");
        } else if (f()) {
        } else {
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.K = f;
            if (this.H != null) {
                this.s.a(MapConstant.LayerPropertyFlag_MarkerSpacing, com.sankuai.meituan.mapsdk.core.utils.d.a(this.K));
            }
        }
    }

    private void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9a3bb3ab7e808cf42766d67431265d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9a3bb3ab7e808cf42766d67431265d");
            return;
        }
        this.R = bVar;
        switch (this.R) {
            case Square:
                this.s.a(3000, 2);
                return;
            case Round:
                this.s.a(3000, 0);
                return;
            default:
                this.s.a(3000, 1);
                return;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void eraseTo(int i, LatLng latLng) {
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e937ea826458fdd9c2222968e30ab168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e937ea826458fdd9c2222968e30ab168");
        } else {
            eraseTo(i, latLng, false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void eraseTo(int i, LatLng latLng, boolean z) {
        LatLng latLng2;
        boolean z2;
        int i2 = i;
        Object[] objArr = {Integer.valueOf(i), latLng, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d852e8b4523f227a89bf979816bac034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d852e8b4523f227a89bf979816bac034");
        } else if ((this.y || !f()) && i2 >= 0 && i2 < this.h.size()) {
            int i3 = i2 + 1;
            if (this.h.size() > i3) {
                LatLng latLng3 = this.h.get(i2);
                LatLng latLng4 = this.h.get(i3);
                boolean z3 = Math.abs(latLng3.longitude - latLng4.longitude) < Math.abs(latLng3.latitude - latLng4.latitude);
                if ((z3 && (latLng.latitude - latLng3.latitude) * (latLng.latitude - latLng4.latitude) < 0.0d) || (!z3 && (latLng.longitude - latLng3.longitude) * (latLng.longitude - latLng4.longitude) < 0.0d)) {
                    latLng2 = MapUtils.getFoot(latLng3, latLng4, latLng);
                    if ((((latLng2.latitude - latLng3.latitude) * (latLng2.latitude - latLng4.latitude) < 0.0d || latLng3.latitude == latLng4.latitude) && ((latLng2.longitude - latLng3.longitude) * (latLng2.longitude - latLng4.longitude) < 0.0d || latLng3.longitude == latLng4.longitude)) || latLng3.equals(latLng2) || latLng4.equals(latLng2)) {
                        z2 = false;
                        if (z2 && latLng4.equals(latLng2)) {
                            i2 = i3;
                        }
                    }
                }
                latLng2 = latLng;
                z2 = true;
                if (z2) {
                    i2 = i3;
                }
            } else {
                latLng2 = latLng;
                z2 = true;
            }
            if (this.e != null && this.e.size() > i2) {
                double doubleValue = this.e.get(i2).doubleValue();
                if (!z2) {
                    doubleValue += MapUtils.calculateLineDistanceByMercatorDouble(latLng2, this.h.get(i2));
                }
                double doubleValue2 = this.e.get(this.e.size() - 1).doubleValue();
                double d2 = doubleValue2 != 0.0d ? doubleValue / doubleValue2 : 0.0d;
                if (d2 > 0.0d) {
                    a((float) (-d2), z);
                    return;
                }
                return;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(i2);
            objArr2[1] = latLng2.toString();
            objArr2[2] = Integer.valueOf(this.e != null ? this.e.size() : -1);
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(String.format(locale, "LineAnnotation.eraseTo error index: %d, erasePoint: %s, pointDistances: %s", objArr2));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setOptions(PolylineOptions polylineOptions) {
        Object[] objArr = {polylineOptions};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5219fd5b86100fffc454a2f0584b2ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5219fd5b86100fffc454a2f0584b2ef7");
        } else {
            a(polylineOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final PolylineOptions getOptions(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1a6c4faf6b139f9196b9878e6a0f2c5", RobustBitConfig.DEFAULT_VALUE) ? (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1a6c4faf6b139f9196b9878e6a0f2c5") : b();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    /* renamed from: getOptions */
    public final PolylineOptions b() {
        return (PolylineOptions) this.r;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setText(PolylineOptions.Text text) {
        Object[] objArr = {text};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58dbb4a3fc97c03f1cd8b2c9d9945d21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58dbb4a3fc97c03f1cd8b2c9d9945d21");
        } else if (!f() && text != null) {
            if (!text.getSegmentTexts().isEmpty()) {
                List<PolylineOptions.SegmentText> segmentTexts = text.getSegmentTexts();
                ArrayList arrayList = new ArrayList();
                for (PolylineOptions.SegmentText segmentText : segmentTexts) {
                    if (segmentText.getEndIndex() != -1 && segmentText.getStartIndex() != -1) {
                        arrayList.add(segmentText);
                    }
                }
                a((Iterable<PolylineOptions.SegmentText>) arrayList);
            }
            int textSize = text.getTextSize();
            Object[] objArr2 = {Integer.valueOf(textSize)};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1e9739e4d04841b9bfd53712aedc3d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1e9739e4d04841b9bfd53712aedc3d5");
            } else if (!f()) {
                if (textSize > 50) {
                    textSize = 50;
                }
                this.M = textSize;
                this.c.a(MapConstant.LayerPropertyFlag_TextSize, this.M);
            }
            int textColor = text.getTextColor();
            Object[] objArr3 = {Integer.valueOf(textColor)};
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bad024025273bec15ab45c955840a6f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bad024025273bec15ab45c955840a6f3");
            } else if (!f()) {
                this.N = textColor;
                this.c.a(MapConstant.LayerPropertyFlag_TextColor, com.sankuai.meituan.mapsdk.core.render.b.f(this.N));
            }
            int strokeColor = text.getStrokeColor();
            Object[] objArr4 = {Integer.valueOf(strokeColor)};
            ChangeQuickRedirect changeQuickRedirect4 = d;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0fba54ba09faf9981ab3f850b21155f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0fba54ba09faf9981ab3f850b21155f4");
            } else if (!f()) {
                this.O = strokeColor;
                this.c.a(MapConstant.LayerPropertyFlag_TextHaloColor, com.sankuai.meituan.mapsdk.core.render.b.f(this.O));
                this.c.a(MapConstant.LayerPropertyFlag_TextHaloWidth, 1.0f);
                this.c.a(MapConstant.LayerPropertyFlag_TextHaloBlur, 0.1f);
            }
            if (this.r != null) {
                ((PolylineOptions) this.r).setText(text);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.e
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53018a9e9e489af966b916f9b4025713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53018a9e9e489af966b916f9b4025713");
        } else if (f()) {
        } else {
            super.setClickable(z);
            if (Float.compare(this.v, 0.0f) == 0 || !this.m) {
                this.s.a(false);
            } else {
                this.s.a(z);
            }
            if (this.r != null) {
                ((PolylineOptions) this.r).clickable(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.b, com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61388bc57fa61076736a74e81a94a4ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61388bc57fa61076736a74e81a94a4ab");
            return;
        }
        super.setZIndex(f);
        if (this.r != null) {
            ((PolylineOptions) this.r).zIndex(f);
        }
    }

    private List<LatLng> a(List<LatLng> list) {
        LatLng latLng;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b85641437cd9ae3b19ccf0d06b92f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b85641437cd9ae3b19ccf0d06b92f2");
        }
        LatLng latLng2 = list.get(0);
        LatLng latLng3 = list.get(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(latLng2);
        double d2 = latLng2.latitude * 0.017453292519943295d;
        double d3 = latLng2.longitude * 0.017453292519943295d;
        double d4 = latLng3.latitude * 0.017453292519943295d;
        double d5 = latLng3.longitude * 0.017453292519943295d;
        try {
            latLng = latLng3;
            try {
                double asin = Math.asin(Math.sqrt(Math.pow(Math.sin((d2 - d4) / 2.0d), 2.0d) + (Math.cos(d2) * Math.cos(d4) * Math.pow(Math.sin((d3 - d5) / 2.0d), 2.0d)))) * 2.0d;
                double ceil = 1.0d / Math.ceil((6378137.0d * asin) / 5000.0d);
                double d6 = ceil;
                while (d6 <= 1.0d) {
                    double sin = Math.sin((1.0d - d6) * asin) / Math.sin(asin);
                    double sin2 = Math.sin(d6 * asin) / Math.sin(asin);
                    double cos = (Math.cos(d2) * sin * Math.cos(d3)) + (Math.cos(d4) * sin2 * Math.cos(d5));
                    double d7 = asin;
                    double cos2 = (Math.cos(d2) * sin * Math.sin(d3)) + (Math.cos(d4) * sin2 * Math.sin(d5));
                    double d8 = d2;
                    double d9 = d3;
                    arrayList.add(new LatLng(Math.atan2((sin * Math.sin(d2)) + (sin2 * Math.sin(d4)), Math.sqrt(Math.pow(cos, 2.0d) + Math.pow(cos2, 2.0d))) * 57.29577951308232d, Math.atan2(cos2, cos) * 57.29577951308232d));
                    d6 += ceil;
                    asin = d7;
                    d2 = d8;
                    d3 = d9;
                }
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                arrayList.add(latLng);
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            latLng = latLng3;
        }
        arrayList.add(latLng);
        return arrayList;
    }

    private Bitmap a(Bitmap bitmap, float f, float f2) {
        Bitmap bitmap2;
        Object[] objArr = {bitmap, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f6a217d1d96ba9e4a8a8b789aa55298", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f6a217d1d96ba9e4a8a8b789aa55298");
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f / bitmap.getWidth(), f2 / bitmap.getHeight());
        try {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            bitmap2 = null;
            System.gc();
        }
        bitmap.recycle();
        return bitmap2;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void e() {
        boolean z;
        int i;
        int i2;
        BitmapDescriptor fromBitmap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a745e27320ed89eafca3df7436d7b26f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a745e27320ed89eafca3df7436d7b26f");
        } else if (!f()) {
            if (this.D != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41c5fe15b8fcd01709f7627b88ab56a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41c5fe15b8fcd01709f7627b88ab56a3");
                } else {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = d;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d03ca01c45221dd7cf9e8cdc16b0e5fb", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d03ca01c45221dd7cf9e8cdc16b0e5fb")).booleanValue();
                    } else {
                        this.S.clear();
                        this.T.clear();
                        this.U.clear();
                        int i3 = 0;
                        for (int i4 = 0; i4 < this.D.length; i4++) {
                            if (i4 >= this.D.length - 1 || this.D[i4] != this.D[i4 + 1]) {
                                if (this.B == null || this.B.length <= 0) {
                                    i = i4;
                                } else {
                                    boolean z2 = this.B[0] == 0;
                                    if ((!z2 && i4 < this.B.length) || (z2 && i4 + 1 < this.B.length)) {
                                        i = z2 ? this.B[i4 + 1] : this.B[i4];
                                    } else {
                                        i = this.h.size();
                                    }
                                }
                                if (this.h.size() > i3 && i3 >= 0) {
                                    if (i4 + 1 < this.D.length && this.h.size() > (i2 = i + 1) && i3 <= i2) {
                                        this.S.add(this.h.subList(i3, i2));
                                    } else {
                                        this.S.add(this.h.subList(i3, this.h.size()));
                                    }
                                }
                                this.T.add(Integer.valueOf(this.D[i4]));
                                if (this.F != null) {
                                    this.U.add(Integer.valueOf(this.F[Math.min(i4, this.F.length - 1)]));
                                } else {
                                    this.U.add(Integer.valueOf(this.E));
                                }
                                i3 = i;
                            }
                        }
                        d dVar = this.W;
                        List<List<LatLng>> list = this.S;
                        List<Integer> list2 = this.T;
                        List<Integer> list3 = this.U;
                        int i5 = (int) this.A;
                        int i6 = (int) this.G;
                        Object[] objArr4 = {list, list2, list3, Integer.valueOf(i5), Integer.valueOf(i6)};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "667ba47dbea8add17c680264a413b480", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "667ba47dbea8add17c680264a413b480")).booleanValue();
                        } else {
                            boolean z3 = (dVar.e == i5 && dVar.f == i6) ? false : true;
                            dVar.e = i5;
                            dVar.f = i6;
                            dVar.d.clear();
                            int size = list.size();
                            int i7 = 0;
                            for (int i8 = 0; i8 < size; i8++) {
                                d.a aVar = new d.a(list2.get(i8).intValue(), list3.get(i8).intValue());
                                Integer num = dVar.b.get(aVar);
                                if (num == null) {
                                    num = Integer.valueOf(dVar.c.size());
                                    dVar.b.put(aVar, Integer.valueOf(dVar.c.size()));
                                    dVar.c.add(aVar);
                                    z3 = true;
                                }
                                dVar.d.add(new d.b(i7, num.intValue()));
                                i7 += list.get(i8).size();
                            }
                            if (z3) {
                                dVar.a();
                            }
                            z = z3;
                        }
                    }
                    if (z && this.W.g != null && (fromBitmap = BitmapDescriptorFactory.fromBitmap(a(this.W.g, this.W.g.getWidth(), this.W.g.getHeight() * 4))) != null) {
                        this.j.e.a(this.t, fromBitmap, this.I);
                        this.I = fromBitmap;
                        if (!f()) {
                            this.s.a(3010, this.I.getId());
                        }
                    }
                }
            }
            if (f()) {
                return;
            }
            this.t.d();
            if (this.L && this.h.size() == 2) {
                com.sankuai.meituan.mapsdk.core.render.model.h hVar = this.t;
                List<LatLng> a2 = a(this.h);
                a(hVar, a2, null, this.s.d + "_line");
            } else if (this.D != null) {
                com.sankuai.meituan.mapsdk.core.render.model.h hVar2 = this.t;
                List<LatLng> list4 = this.h;
                List<List<LatLng>> list5 = this.S;
                a(hVar2, list4, list5, this.s.d + "_line");
            } else {
                com.sankuai.meituan.mapsdk.core.render.model.h hVar3 = this.t;
                List<LatLng> list6 = this.h;
                a(hVar3, list6, null, this.s.d + "_line");
            }
        }
    }

    private void a(com.sankuai.meituan.mapsdk.core.render.model.h hVar, List<LatLng> list, List<List<LatLng>> list2, String str) {
        Object[] objArr = {hVar, list, list2, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52a6c88163f15a3cd9f09ba67145e945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52a6c88163f15a3cd9f09ba67145e945");
        } else if (list.size() >= 2) {
            if (list2 == null) {
                com.sankuai.meituan.mapsdk.core.render.model.b c2 = hVar.c();
                c2.a(com.sankuai.meituan.mapsdk.core.render.model.c.Line, list);
                c2.a("id", str);
                c2.a("rank", this.p + 100000.0f);
                return;
            }
            for (int i = 0; i < list2.size(); i++) {
                com.sankuai.meituan.mapsdk.core.render.model.b c3 = hVar.c();
                c3.a(com.sankuai.meituan.mapsdk.core.render.model.c.Line, list2.get(i));
                c3.a("id", str + i);
                c3.a("segment-color", (((float) this.W.d.get(i).b) + 0.5f) / ((float) this.W.c.size()));
                c3.a("rank", this.p + 100000.0f);
            }
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "950f34bbf34d3200456b52c80b0abcd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "950f34bbf34d3200456b52c80b0abcd6");
        } else if (this.P.size() > 0) {
            this.b.d();
            for (int i = 0; i < this.P.size(); i++) {
                if (this.P.get(i).getEndIndex() >= 0) {
                    int min = Math.min(this.h.size(), this.P.get(i).getStartIndex());
                    int min2 = Math.min(this.h.size(), this.P.get(i).getEndIndex() + 1);
                    if (min >= 0 && min2 >= 0 && min < min2) {
                        List<LatLng> subList = this.h.subList(min, min2);
                        com.sankuai.meituan.mapsdk.core.render.model.b c2 = this.b.c();
                        c2.a(com.sankuai.meituan.mapsdk.core.render.model.c.Line, subList);
                        c2.a("id", this.s.d + "_text" + CommonConstant.Symbol.UNDERLINE + i);
                        c2.a("MapConstant.LayerPropertyFlag_TextField", this.P.get(i).getText());
                        c2.a("rank", this.p + 100000.0f);
                        c2.a("mmr.query", false);
                    }
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.b, com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9288da1f851367bdcefaed1045880f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9288da1f851367bdcefaed1045880f4f");
        } else if (f()) {
        } else {
            if (this.X != null) {
                this.X.cancel();
            }
            if (this.H != null) {
                this.j.e.b(this.t, this.H);
                this.H = null;
            }
            if (this.I != null) {
                this.j.e.b(this.t, this.I);
                this.I = null;
            }
            if (this.J != null) {
                this.j.e.b(this.t, this.J);
                this.J = null;
            }
            super.remove();
        }
    }

    private void c(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "348263849356e52b0354e16ebe717af6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "348263849356e52b0354e16ebe717af6");
        } else if (f() || iArr == null) {
        } else {
            this.B = iArr;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d {
        public static ChangeQuickRedirect a;
        Map<a, Integer> b;
        List<a> c;
        List<b> d;
        int e;
        int f;
        Bitmap g;

        public d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803a8c1be1e6d3e99e310df5945cd1e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803a8c1be1e6d3e99e310df5945cd1e1");
                return;
            }
            this.b = new HashMap();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e432282864229043163a6dccf7d1f84c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e432282864229043163a6dccf7d1f84c");
                return;
            }
            if (this.g != null && !this.g.isRecycled()) {
                this.g.recycle();
            }
            if (this.e <= 0) {
                return;
            }
            int size = this.c.size();
            this.g = Bitmap.createBitmap(size, this.e, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.g);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, 1, this.f);
            Rect rect2 = new Rect(0, this.f, 1, this.e - this.f);
            Rect rect3 = new Rect(0, this.e - this.f, 1, this.e);
            for (int i = 0; i < size; i++) {
                a aVar = this.c.get(i);
                paint.setColor(aVar.c);
                if (!rect.isEmpty()) {
                    canvas.drawRect(rect, paint);
                    rect.offset(1, 0);
                }
                if (!rect3.isEmpty()) {
                    canvas.drawRect(rect3, paint);
                    rect3.offset(1, 0);
                }
                paint.setColor(aVar.b);
                if (!rect2.isEmpty()) {
                    canvas.drawRect(rect2, paint);
                    rect2.offset(1, 0);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class b {
            public static ChangeQuickRedirect a;
            final int b;
            private final int c;

            public b(int i, int i2) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e14de00bc478297fa9a143d92657c2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e14de00bc478297fa9a143d92657c2");
                    return;
                }
                this.c = i;
                this.b = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class a {
            public static ChangeQuickRedirect a;
            final int b;
            final int c;

            public a(int i, int i2) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1613a4f1b282ae65c49b03e7a08653d2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1613a4f1b282ae65c49b03e7a08653d2");
                    return;
                }
                this.b = i;
                this.c = i2;
            }

            public final boolean equals(Object obj) {
                Object[] objArr = {obj};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d0f8d990763999bbcaa842aa6ef4e0", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d0f8d990763999bbcaa842aa6ef4e0")).booleanValue();
                }
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.b == aVar.b && this.c == aVar.c;
            }

            public final int hashCode() {
                return (this.b * 31) + this.c;
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void insertPoint(int i, LatLng latLng) {
        Object[] objArr = {Integer.valueOf(i), latLng};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11b391813cdd32f0334e32c41e2126ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11b391813cdd32f0334e32c41e2126ef");
            return;
        }
        this.y = true;
        eraseTo(i, latLng, false);
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.r
    public final void setEraseable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5608e0d476003261cd70ecbd507b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5608e0d476003261cd70ecbd507b40");
        } else {
            this.y = z;
        }
    }
}
