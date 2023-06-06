package com.sankuai.meituan.mapsdk.core.annotations;

import android.animation.Animator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.mtmap.rendersdk.LocalGlyphRasterizer;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.MarkerSelectHelper;
import com.sankuai.meituan.mapsdk.maps.interfaces.n;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import com.sankuai.meituan.mapsdk.maps.model.MarkerOptions;
import com.sankuai.meituan.mapsdk.maps.model.animation.Animation;
import com.sankuai.meituan.mapsdk.maps.model.animation.FrameAnimation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class x extends c implements com.sankuai.meituan.mapsdk.core.interfaces.e {
    public static ChangeQuickRedirect b;
    protected static final String c = com.sankuai.meituan.mapsdk.core.render.b.g(-16777216);
    public static volatile boolean g;
    private StringBuilder A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private Animator G;
    private LatLng H;
    private BitmapDescriptor I;
    private n.a J;
    private String K;
    private String L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private r S;
    private float T;
    private float U;
    private boolean V;
    private float W;
    private float X;
    private float Y;
    private int Z;
    private int aa;
    private String ab;
    private String ac;
    private int ad;
    private boolean ae;
    @ColorInt
    private int af;
    private String ag;
    private g ah;
    private MarkerSelectHelper ai;
    private boolean aj;
    private int ak;
    private float al;
    private List<BitmapDescriptor> am;
    protected volatile boolean d;
    boolean e;
    public String f;
    int h;
    int y;
    public boolean z;

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getPlatformMarker() {
        return this;
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ String a(String str) {
        return super.a(str);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ Object b() {
        return super.b();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.g
    public final /* bridge */ /* synthetic */ float getAlpha() {
        return super.getAlpha();
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
    public final /* bridge */ /* synthetic */ boolean isClickable() {
        return super.isClickable();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final /* bridge */ /* synthetic */ boolean isVisible() {
        return super.isVisible();
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMaxZoomLevel(float f) {
        super.setMaxZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final /* bridge */ /* synthetic */ void setMinZoomLevel(float f) {
        super.setMinZoomLevel(f);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final String getId() {
        return this.ag;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.e
    public final boolean h() {
        return this.aj;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    public final BitmapDescriptor getIcon() {
        return this.I;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.e
    public final BitmapDescriptor[] i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98df64b55c733183776b9d38365127c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapDescriptor[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98df64b55c733183776b9d38365127c");
        }
        if (this.G instanceof com.sankuai.meituan.mapsdk.api.model.animation.f) {
            return ((com.sankuai.meituan.mapsdk.api.model.animation.f) this.G).b;
        }
        return null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final MarkerOptions.MarkerName getMarkerName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0498ce9a6228dd9d08897248550cc76d", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions.MarkerName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0498ce9a6228dd9d08897248550cc76d");
        }
        if (this.r == null) {
            return null;
        }
        return ((MarkerOptions) this.r).getMarkerName();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowLevel() {
        return this.ak;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getInfoWindowZIndex() {
        return this.al;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowAllowOverlap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2ed37e088d126b295a2e055c7830661", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2ed37e088d126b295a2e055c7830661")).booleanValue();
        }
        if (this.r == null) {
            return false;
        }
        return ((MarkerOptions) this.r).isInfoWindowAllowOverlap();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowIgnorePlacement() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ee91cdc990d55567d8b3c7df7789f79", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ee91cdc990d55567d8b3c7df7789f79")).booleanValue();
        }
        if (this.r == null) {
            return false;
        }
        return ((MarkerOptions) this.r).isInfoWindowIgnorePlacement();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final LatLng getPosition() {
        return this.H;
    }

    private void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fe61d9c867d7a65a0cf9d5f351ea69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fe61d9c867d7a65a0cf9d5f351ea69");
            return;
        }
        if (jSONObject.has("name")) {
            setMarkerName(jSONObject.optString("name"));
        }
        if (jSONObject.has("namecolor")) {
            setMarkerNameColor(Integer.parseInt(jSONObject.optString("namecolor").substring(1), 16));
        }
        if (jSONObject.has("namesize")) {
            setMarkerNameSize(jSONObject.optInt("namesize"));
        }
        if (this.u != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (opt instanceof Boolean) {
                    this.u.a(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Integer) {
                    this.u.a(next, ((Integer) opt).intValue());
                } else if (opt instanceof String) {
                    this.u.a(next, (String) opt);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getAnchorU() {
        return this.X;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getAnchorV() {
        return this.Y;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getOffsetX() {
        return this.Z;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getOffsetY() {
        return this.aa;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getRotateAngle() {
        return this.T;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.e, com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final float getScale() {
        return this.U;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final String getTitle() {
        return this.L;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final String getSnippet() {
        return this.K;
    }

    private void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f62649667001c6a8fbce08f36d0279f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f62649667001c6a8fbce08f36d0279f");
        } else {
            super.setZIndex(f);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowEnable() {
        return this.O;
    }

    private boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e034d9731046c73401995d8383b6e197", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e034d9731046c73401995d8383b6e197")).booleanValue();
        }
        MTMap.InfoWindowAdapter infoWindowAdapter = this.ah.b.getInfoWindowAdapter();
        Marker marker = new Marker(this);
        if (infoWindowAdapter != null) {
            return (infoWindowAdapter.getInfoWindow(marker) == null && infoWindowAdapter.getInfoContents(marker) == null) ? false : true;
        }
        return false;
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f767f7ca7bbed1692b435f8486be4c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f767f7ca7bbed1692b435f8486be4c1");
            return;
        }
        this.P = z;
        if (!this.O) {
            this.P = false;
        }
        boolean n = n();
        if (!this.P || n) {
            return;
        }
        this.P = false;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isInfoWindowShown() {
        return this.P;
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.e
    public final boolean j() {
        return this.Q;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowOffsetX() {
        return this.M;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final int getInfoWindowOffsetY() {
        return this.N;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "531871bb76b7e985c81d21f09625946b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "531871bb76b7e985c81d21f09625946b");
        } else {
            setInfoWindowOffset(i, i2, true);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isDraggable() {
        return this.D;
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfaf24679c1d345a80b1fc047f791c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfaf24679c1d345a80b1fc047f791c77");
        } else if (this.S != null) {
            this.S.c();
        }
    }

    private boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79cb1e2cc74d308e49ee062fbb955af9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79cb1e2cc74d308e49ee062fbb955af9")).booleanValue();
        }
        if (this.O && this.P) {
            if (this.S == null) {
                this.S = this.j.f.a(this);
            }
            return this.S.b();
        } else if (this.S != null) {
            this.S.d();
            return true;
        } else {
            return false;
        }
    }

    public final void a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81351e71c838c0cd9553057ac420f5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81351e71c838c0cd9553057ac420f5d");
        } else if (latLng == null || this.H.equals(latLng)) {
        } else {
            this.H = latLng;
            this.u.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, this.H);
            if (this.S != null) {
                this.S.c();
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).position(latLng);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    @Deprecated
    public final void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "237c63d072a5f0761ebbb10d2171323e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "237c63d072a5f0761ebbb10d2171323e");
        } else {
            remove();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final MarkerOptions getOptions(Context context) {
        return (MarkerOptions) this.r;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void removeRotateIconInterceptor() {
        this.J = null;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final boolean isSelect() {
        return this.B;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final Object getTag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0325a1a4c219127d185571634fc833", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0325a1a4c219127d185571634fc833") : getObject();
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setTag(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2336589bf782129805618a87aec5abcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2336589bf782129805618a87aec5abcb");
        } else {
            setObject(obj);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98ffb02cd74560d4617ce373ef763758", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98ffb02cd74560d4617ce373ef763758")).intValue() : System.identityHashCode(this);
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f3c97cd00e5ab9a53809d2748b6f6ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f3c97cd00e5ab9a53809d2748b6f6ba")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return hashCode() == xVar.hashCode() && super.b().equals(super.b());
        }
        return false;
    }

    public x(g gVar, MarkerOptions markerOptions) {
        super(gVar, gVar.d.b, gVar.d.c);
        Object[] objArr = {gVar, markerOptions};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a80e76d810f6087789b51a6847fa86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a80e76d810f6087789b51a6847fa86");
            return;
        }
        this.d = false;
        this.A = new StringBuilder();
        this.e = true;
        this.B = false;
        this.f = null;
        this.C = 0;
        this.D = false;
        this.E = true;
        this.F = true;
        this.z = false;
        this.O = true;
        this.U = 1.0f;
        this.W = 1.0f;
        this.ac = "";
        this.am = null;
        this.ah = gVar;
        this.ai = gVar.b.f.j;
        this.ag = com.sankuai.meituan.mapsdk.core.render.model.b.a(20);
        this.u.a("id", this.ag);
        this.u.a("sort-key", 0.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconImage", "");
        this.u.a("MapConstant.LayerPropertyFlag_IconRotate", 0.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconOpacity", 1.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconSize", 1.0f);
        this.u.a("MapConstant.LayerPropertyFlag_IconAnchorXY", new double[]{0.5d, 1.0d});
        this.u.a("MapConstant.LayerPropertyFlag_IconAllowOverlap", true);
        this.u.a("MapConstant.LayerPropertyFlag_TextAllowOverlap", true);
        this.u.a("MapConstant.LayerPropertyFlag_IconIgnorePlacement", false);
        this.u.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement", false);
        this.u.a("MapConstant.LayerPropertyFlag_TextField", "");
        this.u.a("MapConstant.LayerPropertyFlag_TextSize", 16.0f);
        this.u.a("MapConstant.LayerPropertyFlag_TextColor", c);
        this.u.a("MapConstant.LayerPropertyFlag_TextOpacity", 1.0f);
        this.u.a("MapConstant.LayerPropertyFlag_TextOptional", true);
        this.s.a(MapConstant.LayerPropertyFlag_TextMaxWidth, 10000.0f);
        gVar.j.add(this);
        if (this.k.b == null || this.k.c == null) {
            this.k.b = this.s;
            this.k.c = this.t;
            this.s.a(MapConstant.LayerPropertyFlag_MarkSortKey, "sort-key");
            this.s.a(4000, 0);
            this.s.b(MapConstant.LayerPropertyFlag_IconImage, super.a("MapConstant.LayerPropertyFlag_IconImage"));
            this.s.b(MapConstant.LayerPropertyFlag_IconRotate, super.a("MapConstant.LayerPropertyFlag_IconRotate"));
            this.s.b(MapConstant.LayerPropertyFlag_IconOpacity, super.a("MapConstant.LayerPropertyFlag_IconOpacity"));
            this.s.b(MapConstant.LayerPropertyFlag_IconAnchorXY, super.a("MapConstant.LayerPropertyFlag_IconAnchorXY"));
            this.s.b(MapConstant.LayerPropertyFlag_IconOffset, super.a("MapConstant.LayerPropertyFlag_IconOffset"));
            this.s.b(MapConstant.LayerPropertyFlag_IconSize, super.a("MapConstant.LayerPropertyFlag_IconSize"));
            this.s.b(MapConstant.LayerPropertyFlag_IconAllowOverlap, super.a("MapConstant.LayerPropertyFlag_IconAllowOverlap"));
            this.s.b(MapConstant.LayerPropertyFlag_TextAllowOverlap, super.a("MapConstant.LayerPropertyFlag_TextAllowOverlap"));
            this.s.b(MapConstant.LayerPropertyFlag_IconIgnorePlacement, super.a("MapConstant.LayerPropertyFlag_IconIgnorePlacement"));
            this.s.b(MapConstant.LayerPropertyFlag_TextIgnorePlacement, super.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement"));
            this.s.a(MapConstant.LayerPropertyFlag_IconAnchor, 9);
            this.s.b(MapConstant.LayerPropertyFlag_TextField, super.a("MapConstant.LayerPropertyFlag_TextField"));
            this.s.b(MapConstant.LayerPropertyFlag_TextFont, super.a("MapConstant.LayerPropertyFlag_TextFont"));
            this.s.a(MapConstant.LayerPropertyFlag_TextUnique, false);
            this.s.b(MapConstant.LayerPropertyFlag_TextAnchor, super.a("MapConstant.LayerPropertyFlag_TextAnchor"));
            this.s.b(MapConstant.LayerPropertyFlag_TextSize, super.a("MapConstant.LayerPropertyFlag_TextSize"));
            this.s.b(MapConstant.LayerPropertyFlag_TextColor, super.a("MapConstant.LayerPropertyFlag_TextColor"));
            this.s.b(MapConstant.LayerPropertyFlag_TextOpacity, super.a("MapConstant.LayerPropertyFlag_TextOpacity"));
            this.s.b(MapConstant.LayerPropertyFlag_TextHaloColor, super.a("MapConstant.LayerPropertyFlag_TextHaloColor"));
            this.s.b(MapConstant.LayerPropertyFlag_TextHaloWidth, super.a("MapConstant.LayerPropertyFlag_TextHaloWidth"));
            this.s.b(MapConstant.LayerPropertyFlag_TextHaloBlur, super.a("MapConstant.LayerPropertyFlag_TextHaloBlur"));
            this.s.b(MapConstant.LayerPropertyFlag_TextOffset, super.a("MapConstant.LayerPropertyFlag_TextOffset"));
            this.s.b(MapConstant.LayerPropertyFlag_TextOptional, super.a("MapConstant.LayerPropertyFlag_TextOptional"));
            this.s.b(MapConstant.LayerPropertyFlag_TextJustify, super.a("MapConstant.LayerPropertyFlag_TextJustify"));
            a(10000.0f);
        }
        String str = markerOptions == null ? "MarkerOptions is null" : "";
        if (!TextUtils.isEmpty(str)) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.f(str);
        } else {
            setOptions(markerOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677223ae08e196c5382be44950ad7b5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677223ae08e196c5382be44950ad7b5d");
        } else if (obj == null || this.d) {
        } else {
            super.a(obj);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b53a7768d517a54438dae639dbba5faf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b53a7768d517a54438dae639dbba5faf");
                return;
            }
            MarkerOptions markerOptions = (MarkerOptions) super.b();
            if (markerOptions != null) {
                if (!TextUtils.isEmpty(markerOptions.getID())) {
                    this.ag = markerOptions.getID();
                    this.u.a("id", this.ag);
                }
                boolean isUseSharedLayer = markerOptions.isUseSharedLayer();
                Object[] objArr3 = {Byte.valueOf(isUseSharedLayer ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6167a2683afe188017f46cc9f7fb8c54", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6167a2683afe188017f46cc9f7fb8c54");
                } else if (!this.d && this.e != isUseSharedLayer) {
                    HashMap<String, Object> hashMap = this.u.e;
                    com.sankuai.meituan.mapsdk.core.render.model.h hVar = this.t;
                    com.sankuai.meituan.mapsdk.core.render.model.b bVar = this.u;
                    if (this.e && !isUseSharedLayer) {
                        this.t = new com.sankuai.meituan.mapsdk.core.render.model.d(this.j.c, null, false);
                        this.s = this.k.a(this.s, null, this.t);
                        this.j.a(this.s.d, this);
                        if (this.I != null) {
                            this.j.e.a(this.t, this.I);
                            this.j.e.b(hVar, this.I);
                        }
                        this.u = this.t.c();
                        this.u.a(hashMap);
                        a(10000.0f);
                        hVar.a(bVar);
                    }
                    if (!this.e && isUseSharedLayer) {
                        if (this.k.b != null) {
                            this.k.a(this.s);
                            this.s = this.k.b;
                        }
                        if (this.k.c != null) {
                            this.t = this.k.c;
                            if (this.I != null) {
                                this.j.e.a(this.t, this.I);
                                this.j.e.b(hVar, this.I);
                            }
                            this.u = this.t.c();
                            this.u.a(hashMap);
                            hVar.a(bVar);
                            this.k.a(hVar);
                        }
                    }
                    this.e = isUseSharedLayer;
                    if (this.r != null) {
                        ((MarkerOptions) this.r).useSharedLayer(isUseSharedLayer);
                    }
                }
                if (markerOptions.getIcon() == null) {
                    markerOptions.icon(this.ah.m);
                }
                if (markerOptions.getIcons() == null || markerOptions.getIcons().size() == 0) {
                    setIcon(markerOptions.getIcon());
                } else {
                    if (this.G != null) {
                        this.G.cancel();
                        this.G = null;
                    }
                    FrameAnimation frameAnimation = new FrameAnimation((BitmapDescriptor[]) markerOptions.getIcons().toArray(new BitmapDescriptor[0]));
                    frameAnimation.setDuration((int) ((markerOptions.getIcons().size() * 1000.0f) / (60.0f / markerOptions.getPeriod())));
                    frameAnimation.setRepeatMode(Animation.RepeatMode.RESTART);
                    this.G = com.sankuai.meituan.mapsdk.api.model.animation.b.a(this, frameAnimation);
                    if (this.G != null) {
                        this.G.start();
                    }
                }
                if (markerOptions.getPosition() != null) {
                    setPosition(markerOptions.getPosition());
                }
                setScale(markerOptions.getScale());
                setAnchor(markerOptions.getAnchorU(), markerOptions.getAnchorV());
                setOffset(markerOptions.getOffsetX(), markerOptions.getOffsetY());
                setTitle(markerOptions.getTitle());
                setSnippet(markerOptions.getSnippet());
                setZIndex(markerOptions.getZIndex());
                setLevel(markerOptions.getLevel());
                setClickable(markerOptions.isClickable());
                setDraggable(markerOptions.isDraggable());
                setRotateAngle(markerOptions.getRotateAngle());
                setInfoWindowOffset(markerOptions.getInfoWindowOffsetX(), markerOptions.getInfoWindowOffsetY(), true);
                setInfoWindowEnable(markerOptions.isInfoWindowEnable());
                boolean isInfoWindowAlwaysShow = markerOptions.isInfoWindowAlwaysShow();
                Object[] objArr4 = {Byte.valueOf(isInfoWindowAlwaysShow ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect4 = b;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "13fac8842236b2f6ac232b3a0ce91d2c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "13fac8842236b2f6ac232b3a0ce91d2c");
                } else if (!this.d) {
                    this.Q = isInfoWindowAlwaysShow;
                    if (this.r != null) {
                        ((MarkerOptions) this.r).infoWindowAlwaysShow(isInfoWindowAlwaysShow);
                    }
                }
                boolean isFlat = markerOptions.isFlat();
                Object[] objArr5 = {Byte.valueOf(isFlat ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect5 = b;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d6194e701f4d249ca54c6edddbef2a2e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d6194e701f4d249ca54c6edddbef2a2e");
                } else if (!this.d) {
                    this.V = isFlat;
                    this.s.a(MapConstant.LayerPropertyFlag_IconPitchAlignment, !this.V ? 1 : 0);
                    if (this.r != null) {
                        ((MarkerOptions) this.r).setFlat(isFlat);
                    }
                }
                setAlpha(markerOptions.getAlpha());
                setVisible(markerOptions.isVisible());
                setAllowOverlap(markerOptions.isAllowOverlap());
                setIgnorePlacement(markerOptions.isIgnorePlacement());
                setTag(markerOptions.getTag());
                setMarkerName(markerOptions.getMarkerName());
                if (markerOptions.getJsonObject() != null) {
                    a(markerOptions.getJsonObject());
                }
                this.aj = true ^ markerOptions.isViewInfoWindow();
                this.ak = markerOptions.getInfoWindowLevel();
                this.al = markerOptions.getInfoWindowZIndex();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.e
    public final void setClickable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f58d9a056d1104aa23e4a8e010651a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f58d9a056d1104aa23e4a8e010651a");
        } else if (this.d) {
        } else {
            super.setClickable(z);
            if (Float.compare(this.v, 0.0f) == 0 || !this.m) {
                this.u.a("mmr.query", false);
            } else {
                this.u.a("mmr.query", z);
            }
            if (this.r == null || !(this.r instanceof MarkerOptions)) {
                return;
            }
            ((MarkerOptions) this.r).clickable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.p
    public final void setIcon(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e8e08eb701e5413b821ae78661afba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e8e08eb701e5413b821ae78661afba");
        } else if (this.d || bitmapDescriptor == null || bitmapDescriptor.equals(this.I)) {
        } else {
            if (this.r != null && (this.r instanceof MarkerOptions)) {
                ((MarkerOptions) this.r).icon(bitmapDescriptor);
            }
            this.u.a("MapConstant.LayerPropertyFlag_IconImage", bitmapDescriptor.getId());
            this.j.e.a(this.t, bitmapDescriptor, this.I);
            this.I = bitmapDescriptor;
            if (this.aj) {
                k();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4160dff0b2d99e3908f1f1532a89fb21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4160dff0b2d99e3908f1f1532a89fb21");
        } else if (this.d || TextUtils.equals(this.ac, str)) {
        } else {
            if (this.r != null && (this.r instanceof MarkerOptions)) {
                ((MarkerOptions) this.r).markerName(str);
            }
            this.ac = str;
            this.u.a("MapConstant.LayerPropertyFlag_TextField", this.ac);
            this.u.a("MapConstant.LayerPropertyFlag_TextAnchor", 3.0f);
            if (this.r != null) {
                this.u.a("MapConstant.LayerPropertyFlag_TextHaloColor", com.sankuai.meituan.mapsdk.core.render.b.g(((MarkerOptions) this.r).getMarkerNameStrokeColor()));
                this.u.a("MapConstant.LayerPropertyFlag_TextHaloWidth", ((MarkerOptions) this.r).getMarkerNameStrokeWidth());
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setNameAroundIcon(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d6d1065afc5ab8ffb653c43c508ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d6d1065afc5ab8ffb653c43c508ff0");
        } else if (this.d) {
        } else {
            if (this.r != null && (this.r instanceof MarkerOptions)) {
                ((MarkerOptions) this.r).nameAroundIcon(z);
            }
            this.ae = z;
            this.u.a("MapConstant.LayerPropertyFlag_TextAnchor", this.ae ? "around-icon" : "top");
            if (this.ae) {
                this.u.a("MapConstant.LayerPropertyFlag_TextAllowOverlap", false);
                this.u.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement", false);
                this.u.a("MapConstant.LayerPropertyFlag_TextJustify", RemoteMessageConst.Notification.ICON);
                return;
            }
            setAnchor(this.X, this.Y);
            setRotateAngle(this.T);
            this.u.a("MapConstant.LayerPropertyFlag_TextJustify", "center");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4aa1bdee5c0d63184fb19d887edb6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4aa1bdee5c0d63184fb19d887edb6e");
        } else if (this.d) {
        } else {
            this.al = f;
            if (this.r != null) {
                ((MarkerOptions) this.r).infoWindowZIndex(this.al);
            }
            if (this.S != null) {
                this.S.a(f);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowAllowOverlap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3edb1366ef082a9f024b6ffc16e7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3edb1366ef082a9f024b6ffc16e7a1");
        } else if (this.d) {
        } else {
            if (this.S instanceof y) {
                y yVar = (y) this.S;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = y.k;
                if (PatchProxy.isSupport(objArr2, yVar, changeQuickRedirect2, false, "4960b003f0668a440053f2de91694dc0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, yVar, changeQuickRedirect2, false, "4960b003f0668a440053f2de91694dc0");
                } else if (yVar.l != null) {
                    yVar.l.a(z);
                }
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).infoWindowAllowOverlap(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowIgnorePlacement(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8adbef0dac9d0972193069ea8462b3da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8adbef0dac9d0972193069ea8462b3da");
        } else if (this.d) {
        } else {
            if (this.S instanceof y) {
                y yVar = (y) this.S;
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = y.k;
                if (PatchProxy.isSupport(objArr2, yVar, changeQuickRedirect2, false, "dbe53bdce0175da9ac32db984b67f4cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, yVar, changeQuickRedirect2, false, "dbe53bdce0175da9ac32db984b67f4cf");
                } else if (yVar.l != null) {
                    yVar.l.b(z);
                }
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).infoWindowIgnorePlacement(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerNameColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b115b130c3ef614302a3b01547ab6ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b115b130c3ef614302a3b01547ab6ee");
        } else if (this.d) {
        } else {
            this.af = i;
            this.u.a("MapConstant.LayerPropertyFlag_TextColor", com.sankuai.meituan.mapsdk.core.render.b.g(i));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerNameSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa97947d75cb8e548377e41fe4c4b73f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa97947d75cb8e548377e41fe4c4b73f");
        } else if (this.d) {
        } else {
            this.ad = i;
            this.u.a("MapConstant.LayerPropertyFlag_TextSize", com.sankuai.meituan.mapsdk.core.utils.d.a(this.ad));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setPosition(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faa088054e600a1adbd7c46034b8e602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faa088054e600a1adbd7c46034b8e602");
        } else if (this.d || latLng == null) {
        } else {
            this.ah.l.remove(this.ag);
            this.z = false;
            this.H = latLng;
            if (this.S != null) {
                this.S.c();
            }
            this.u.a(com.sankuai.meituan.mapsdk.core.render.model.c.Point, this.H);
            if (this.r == null || !(this.r instanceof MarkerOptions)) {
                return;
            }
            ((MarkerOptions) this.r).position(latLng);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setPositionByPixels(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90cd3b28a7fd1e16192789fcdf38fb22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90cd3b28a7fd1e16192789fcdf38fb22");
        } else if (this.d) {
        } else {
            this.h = i;
            this.y = i2;
            this.z = true;
            this.ah.l.put(this.ag, this);
            if (this.t != null && (this.t instanceof com.sankuai.meituan.mapsdk.core.render.model.d)) {
                ((com.sankuai.meituan.mapsdk.core.render.model.d) this.t).a(com.sankuai.meituan.mapsdk.core.render.model.i.RenderThread);
            }
            a(this.j.c.getLatLngByScreenCoordinate(new PointF(i, i2)));
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAnchor(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b6aa32bb4d1aba88b3dd7778bece37e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b6aa32bb4d1aba88b3dd7778bece37e");
        } else if (this.d) {
        } else {
            if (this.r != null && (this.r instanceof MarkerOptions)) {
                ((MarkerOptions) this.r).anchor(f, f2);
            }
            this.X = f;
            this.Y = f2;
            com.sankuai.meituan.mapsdk.core.render.model.b bVar = this.u;
            bVar.a("MapConstant.LayerPropertyFlag_IconAnchorXY", this.X + CommonConstant.Symbol.COMMA + this.Y);
            if (this.aj) {
                k();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setOffset(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d739119733e7de36059aae444da1139f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d739119733e7de36059aae444da1139f");
        } else if (this.d) {
        } else {
            this.Z = i;
            this.aa = i2;
            this.u.a("MapConstant.LayerPropertyFlag_IconOffset", new double[]{com.sankuai.meituan.mapsdk.core.utils.d.a(this.Z), com.sankuai.meituan.mapsdk.core.utils.d.a(this.aa)});
            if (this.r != null) {
                ((MarkerOptions) this.r).offset(i, i2);
            }
            if (this.aj) {
                k();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setRotateAngle(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc269e00c7791bc68d0cfe52a47fa20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc269e00c7791bc68d0cfe52a47fa20");
        } else if (this.d) {
        } else {
            while (f < 0.0f) {
                f += 360.0f;
            }
            this.T = f % 360.0f;
            if (this.J != null) {
                BitmapDescriptor a = this.J.a(f);
                if (a != null) {
                    setIcon(a);
                }
                this.u.a("MapConstant.LayerPropertyFlag_IconRotate", 0.0f);
            } else {
                this.u.a("MapConstant.LayerPropertyFlag_IconRotate", this.T);
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).rotateAngle(f);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.interfaces.e, com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setScale(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9d1d7cea671e3651cdf6988e2de348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9d1d7cea671e3651cdf6988e2de348");
        } else if (this.d) {
        } else {
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.U = f;
            this.u.a("MapConstant.LayerPropertyFlag_IconSize", f);
            if (this.aj) {
                k();
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).scale(f);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09dbea5fc1ecf6567c3b4f15c15c5041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09dbea5fc1ecf6567c3b4f15c15c5041");
        } else if (this.d) {
        } else {
            this.L = str;
            refreshInfoWindow();
            if (this.r != null) {
                ((MarkerOptions) this.r).title(str);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setSnippet(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1321e90531a585eaf48b539778d65eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1321e90531a585eaf48b539778d65eef");
        } else if (this.d) {
        } else {
            this.K = str;
            refreshInfoWindow();
            if (this.r != null) {
                ((MarkerOptions) this.r).snippet(str);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void setLevel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1248d73288b1e2d8d3b792d4b0eb3d11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1248d73288b1e2d8d3b792d4b0eb3d11");
        } else if (this.d) {
        } else {
            super.setLevel(i);
            a(this.p);
            if (this.r != null) {
                ((MarkerOptions) this.r).level(i);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setZIndex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85382331040a933d23187b0eb41eee1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85382331040a933d23187b0eb41eee1b");
        } else if (this.d) {
        } else {
            this.p = f;
            this.u.a("rank", this.p + 100000.0f);
            if (this.e) {
                this.u.a("sort-key", this.p);
            } else {
                a(this.p);
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).zIndex(f);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d64c81fc554a716aedacc5ebb924d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d64c81fc554a716aedacc5ebb924d3");
        } else if (this.d) {
        } else {
            this.O = z;
            if (!z) {
                this.P = false;
            }
            if (this.O && this.P) {
                showInfoWindow();
            } else {
                hideInfoWindow();
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).infoWindowEnable(z);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void showInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a87577c146a5cc47987db341a29340", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a87577c146a5cc47987db341a29340");
        } else if (this.d) {
        } else {
            if (TextUtils.isEmpty(getTitle()) && TextUtils.isEmpty(getSnippet()) && !m()) {
                hideInfoWindow();
            } else {
                a(true);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void hideInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb96b716f45d2242102525ade0b5e8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb96b716f45d2242102525ade0b5e8a");
        } else if (this.d) {
        } else {
            a(false);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void refreshInfoWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b44d31010c3326ed06e44eba112dedd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b44d31010c3326ed06e44eba112dedd");
        } else if (this.d) {
        } else {
            if (TextUtils.isEmpty(getTitle()) && TextUtils.isEmpty(getSnippet()) && !m()) {
                hideInfoWindow();
            } else if (this.P && isVisible() && this.S != null) {
                this.S.a();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setInfoWindowOffset(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20b3d8010ed1cf23aa9eb2d5cdea8894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20b3d8010ed1cf23aa9eb2d5cdea8894");
        } else if (this.d) {
        } else {
            this.M = i;
            this.N = i2;
            if (this.S != null && z) {
                this.S.c();
            }
            if (this.r != null) {
                ((MarkerOptions) this.r).setInfoWindowOffset(i, i2);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setToTop() {
        boolean containsKey;
        float floatValue;
        float max;
        char c2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c12cb6d2a086e50663692198415e5dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c12cb6d2a086e50663692198415e5dd");
        } else if (!this.d) {
            com.sankuai.meituan.mapsdk.core.render.model.h hVar = this.t;
            com.sankuai.meituan.mapsdk.core.render.model.b bVar = this.u;
            int i = 1;
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.mapsdk.core.render.model.h.c;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "3b4f524644e5887a9960ccb2f0fbdab1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "3b4f524644e5887a9960ccb2f0fbdab1");
            } else if (bVar != null) {
                float f = 0.0f;
                for (com.sankuai.meituan.mapsdk.core.render.model.b bVar2 : hVar.g) {
                    try {
                        Object[] objArr3 = new Object[i];
                        objArr3[c2] = "originalRank";
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.mapsdk.core.render.model.b.a;
                        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "cd6c7ac0e69c517edec33cc7f9d88580", RobustBitConfig.DEFAULT_VALUE)) {
                            try {
                                containsKey = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "cd6c7ac0e69c517edec33cc7f9d88580")).booleanValue();
                            } catch (Exception unused) {
                                com.sankuai.meituan.mapsdk.mapcore.utils.c.b("feature has no rank");
                                i = 1;
                                c2 = 0;
                            }
                        } else {
                            containsKey = bVar2.e.containsKey("originalRank");
                        }
                        if (containsKey) {
                            floatValue = ((Float) bVar2.a("originalRank")).floatValue();
                            bVar2.a("rank", floatValue);
                        } else {
                            floatValue = ((Float) bVar2.a("rank")).floatValue();
                        }
                        max = Math.max(f, floatValue);
                    } catch (Exception unused2) {
                    }
                    try {
                        if (bVar2.equals(bVar)) {
                            bVar2.a("originalRank", floatValue);
                        }
                        f = max;
                    } catch (Exception unused3) {
                        f = max;
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.b("feature has no rank");
                        i = 1;
                        c2 = 0;
                    }
                    i = 1;
                    c2 = 0;
                }
                bVar.a("rank", f + 1.0f);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void startAnimation(Animation animation) {
        Object[] objArr = {animation};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c419ea88b809fce4a042e67ac1622c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c419ea88b809fce4a042e67ac1622c");
        } else if (animation == null || this.d) {
        } else {
            if (this.G != null) {
                this.G.cancel();
                this.G = null;
            }
            this.G = com.sankuai.meituan.mapsdk.api.model.animation.b.a(this, animation);
            if (this.G != null) {
                this.G.start();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setDraggable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5fe99aa051fbf886c85a182c1b67b6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5fe99aa051fbf886c85a182c1b67b6f");
        } else if (this.d) {
        } else {
            this.D = z;
            if (this.r == null || !(this.r instanceof MarkerOptions)) {
                return;
            }
            ((MarkerOptions) this.r).draggable(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setAllowOverlap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a26b8f2d83d9ac9ec9f5a448a533067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a26b8f2d83d9ac9ec9f5a448a533067");
        } else if (this.d) {
        } else {
            this.E = z;
            this.u.a("MapConstant.LayerPropertyFlag_IconAllowOverlap", z);
            if (this.r == null || !(this.r instanceof MarkerOptions)) {
                return;
            }
            ((MarkerOptions) this.r).allowOverlap(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setIgnorePlacement(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cb56504a83a1881d3ca7f70fca39a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cb56504a83a1881d3ca7f70fca39a59");
        } else if (this.d) {
        } else {
            this.F = z;
            this.u.a("MapConstant.LayerPropertyFlag_IconIgnorePlacement", z);
            if (this.r == null || !(this.r instanceof MarkerOptions)) {
                return;
            }
            ((MarkerOptions) this.r).ignorePlacement(z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setMarkerName(MarkerOptions.MarkerName markerName) {
        Object[] objArr = {markerName};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "727b61bc3c045a2b2f035861439a0591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "727b61bc3c045a2b2f035861439a0591");
        } else if (!this.d) {
            if (markerName == null) {
                setMarkerName("");
                return;
            }
            if (this.r != null && (this.r instanceof MarkerOptions)) {
                ((MarkerOptions) this.r).markerName(markerName);
            }
            if (this.am != null) {
                for (BitmapDescriptor bitmapDescriptor : this.am) {
                    this.j.e.b(this.t, bitmapDescriptor);
                }
                this.am.clear();
            }
            this.am = null;
            if (markerName.getImagesInText() != null) {
                this.am = new ArrayList(markerName.getImagesInText());
                for (BitmapDescriptor bitmapDescriptor2 : this.am) {
                    this.j.e.a(this.t, bitmapDescriptor2);
                }
            }
            this.u.a("MapConstant.LayerPropertyFlag_TextField", markerName.getMarkerName());
            final Typeface typeface = markerName.getTypeface();
            Object[] objArr2 = {typeface};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9a2d06f576efcf1299b049d3b7fb15e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9a2d06f576efcf1299b049d3b7fb15e");
            } else if (typeface != null) {
                com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.annotations.x.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49685e1c0e8590f08b7a023515de96c0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49685e1c0e8590f08b7a023515de96c0");
                            return;
                        }
                        LocalGlyphRasterizer.removeTypeface(x.this.ab);
                        x.this.ab = f.c();
                        LocalGlyphRasterizer.putTypeface(x.this.ab, typeface);
                        x.this.u.a("MapConstant.LayerPropertyFlag_TextFont", x.this.ab);
                    }
                });
            }
            this.u.a("MapConstant.LayerPropertyFlag_TextSize", com.sankuai.meituan.mapsdk.core.utils.d.a(markerName.getSize()));
            this.u.a("MapConstant.LayerPropertyFlag_TextAnchor", "top");
            this.u.a("MapConstant.LayerPropertyFlag_TextColor", com.sankuai.meituan.mapsdk.core.render.b.g(markerName.getColor()));
            this.u.a("MapConstant.LayerPropertyFlag_TextHaloColor", com.sankuai.meituan.mapsdk.core.render.b.g(markerName.getStrokeColor()));
            this.u.a("MapConstant.LayerPropertyFlag_TextHaloWidth", com.sankuai.meituan.mapsdk.core.utils.d.a(markerName.getStrokeWidth()));
            if (markerName.isSetOrder()) {
                this.u.a("textRank", markerName.getOrder() + 100000.0f);
            }
            this.u.a("MapConstant.LayerPropertyFlag_TextOffset", new double[]{com.sankuai.meituan.mapsdk.core.utils.d.a(markerName.getOffsetX()), com.sankuai.meituan.mapsdk.core.utils.d.a(markerName.getOffsetY())});
            this.u.a("MapConstant.LayerPropertyFlag_TextOptional", markerName.isOptional());
            String str = "top";
            if (markerName.getAroundIconMode() == MarkerOptions.MarkerName.AROUND_ICON_MODE) {
                str = "around-icon";
            } else if (markerName.getAroundIconMode() == MarkerOptions.MarkerName.AROUND_ICON_MODE_NO_TOP) {
                str = "around-icon-ntop";
            }
            this.u.a("MapConstant.LayerPropertyFlag_TextAnchor", str);
            if (!"top".equals(str)) {
                this.u.a("MapConstant.LayerPropertyFlag_TextAllowOverlap", false);
                this.u.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement", false);
                this.u.a("MapConstant.LayerPropertyFlag_TextJustify", RemoteMessageConst.Notification.ICON);
                return;
            }
            this.u.a("MapConstant.LayerPropertyFlag_TextAllowOverlap", markerName.isAllowOverlap());
            this.u.a("MapConstant.LayerPropertyFlag_TextIgnorePlacement", markerName.isIgnorePlacement());
            this.u.a("MapConstant.LayerPropertyFlag_TextJustify", "center");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void setVisible(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "442f3ff1faa0d309f1b53ddc55c2fce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "442f3ff1faa0d309f1b53ddc55c2fce2");
        } else if (this.d || this.m == z) {
        } else {
            if (this.r != null) {
                ((MarkerOptions) this.r).visible(z);
            }
            this.m = z;
            if (!z) {
                this.R = isInfoWindowShown();
                float f = this.W;
                setAlpha(0.0f);
                this.W = f;
                if (this.r != null) {
                    ((MarkerOptions) this.r).alpha(this.W);
                }
                hideInfoWindow();
                return;
            }
            setAlpha(this.W);
            if (this.R) {
                showInfoWindow();
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.core.interfaces.a
    public final void setAlpha(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b6cd289f780436d886ef6a278c32a96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b6cd289f780436d886ef6a278c32a96");
        } else if (this.d) {
        } else {
            if (f <= 0.0f || this.m) {
                super.setAlpha(f);
                this.W = f;
                this.u.a("MapConstant.LayerPropertyFlag_IconOpacity", this.v);
                this.u.a("MapConstant.LayerPropertyFlag_TextOpacity", this.v);
                if (Float.compare(f, 0.0f) == 0) {
                    this.u.a("mmr.query", false);
                } else {
                    this.u.a("mmr.query", this.n);
                }
                if (this.r != null) {
                    ((MarkerOptions) this.r).alpha(f);
                }
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f, com.sankuai.meituan.mapsdk.maps.interfaces.l
    public final void remove() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b616e8dae209ee7749a186a5a4f4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b616e8dae209ee7749a186a5a4f4c4");
        } else if (this.d) {
        } else {
            l();
            this.t.a(this.u);
            if (!TextUtils.isEmpty(this.ab)) {
                com.sankuai.meituan.mapsdk.mapcore.utils.f.a(new Runnable() { // from class: com.sankuai.meituan.mapsdk.core.annotations.x.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a30972706f7297e5383022825b56d806", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a30972706f7297e5383022825b56d806");
                        } else {
                            LocalGlyphRasterizer.removeTypeface(x.this.ab);
                        }
                    }
                });
            }
            if (!this.e) {
                super.remove();
                return;
            }
            g gVar = this.ah;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            if (!PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "ea85a26b5ac7a6e762efdcbd1fecaea7", RobustBitConfig.DEFAULT_VALUE)) {
                Iterator<x> it = gVar.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next().e) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "ea85a26b5ac7a6e762efdcbd1fecaea7")).booleanValue();
            }
            if (z) {
                return;
            }
            this.k.b = null;
            this.k.c = null;
            super.remove();
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51983c06bff9ee702c5fb9b5ad431e90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51983c06bff9ee702c5fb9b5ad431e90");
        } else if (this.d) {
        } else {
            this.d = true;
            if (this.ai != null) {
                this.ai.removeMarker(this);
            }
            this.ah.b.a((com.sankuai.meituan.mapsdk.maps.interfaces.l) this);
            this.ah.l.remove(this.ag);
            this.ah.j.remove(this);
            if (this.G != null) {
                this.G.cancel();
                this.G = null;
            }
            if (this.S != null) {
                this.S.e();
                this.S = null;
            }
            if (this.I != null) {
                this.j.e.b(this.t, this.I);
            }
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setOptions(MarkerOptions markerOptions) {
        Object[] objArr = {markerOptions};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a4c6fbb2d1d8db4e0ffef23f1eef1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a4c6fbb2d1d8db4e0ffef23f1eef1e");
        } else if (this.d) {
        } else {
            a(markerOptions);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setRotateIconInterceptor(n.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc636ad0b3076eec3e4ec4c323919647", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc636ad0b3076eec3e4ec4c323919647");
        } else if (this.d) {
        } else {
            this.J = aVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.n
    public final void setSelect(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffe3500ad3cba21501bf39752d48e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffe3500ad3cba21501bf39752d48e51");
        } else if (this.d || this.B == z) {
        } else {
            this.B = z;
            this.ai.setMarkerSelect(this, z);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.f
    public final void setObject(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93372ddc8013a1ea021aacb03c93238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93372ddc8013a1ea021aacb03c93238");
        } else if (this.d) {
        } else {
            super.setObject(obj);
            if (this.r == null || !(this.r instanceof MarkerOptions)) {
                return;
            }
            ((MarkerOptions) this.r).tag(obj);
        }
    }
}
