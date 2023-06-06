package com.sankuai.meituan.mapsdk.maps.model;

import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MarkerOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;
    private JSONObject B;
    private boolean C;
    private boolean D;
    private boolean E;
    private float F;
    private boolean G;
    private Object H;
    private int I;
    private float J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private MarkerName O;
    private float P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private String a;
    private BitmapDescriptor b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;
    private int g;
    private int h;
    private String i;
    private LatLng j;
    private String k;
    private boolean l;
    private int m;
    private ArrayList<BitmapDescriptor> n;
    private int o;
    private float p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private IndoorInfo v;
    private float w;
    private boolean x;
    private String y;
    private boolean z;

    public MarkerOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "944657e2d6539d6343149de017014060", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "944657e2d6539d6343149de017014060");
            return;
        }
        this.c = false;
        this.d = true;
        this.e = 0.5f;
        this.f = 1.0f;
        this.m = 20;
        this.o = 2;
        this.p = 0.0f;
        this.q = true;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.x = false;
        this.z = true;
        this.A = true;
        this.B = null;
        this.C = true;
        this.D = true;
        this.E = true;
        this.F = 1.0f;
        this.G = true;
        this.I = this.o;
        this.J = this.p;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = true;
        this.P = 1.0f;
        this.Q = true;
        this.R = true;
        this.S = true;
    }

    public final String getID() {
        return this.a;
    }

    public final MarkerOptions id(String str) {
        this.a = str;
        return this;
    }

    public final boolean isDefaultInfoWindowEnable() {
        return this.C;
    }

    public final void defaultInfoWindowEnable(boolean z) {
        this.C = z;
    }

    public final JSONObject getJsonObject() {
        return this.B;
    }

    public final void setJsonObject(JSONObject jSONObject) {
        this.B = jSONObject;
    }

    public final MarkerOptions allowOverlap(boolean z) {
        this.z = z;
        return this;
    }

    public final boolean isAllowOverlap() {
        return this.z;
    }

    public final MarkerOptions ignorePlacement(boolean z) {
        this.A = z;
        return this;
    }

    public final boolean isIgnorePlacement() {
        return this.A;
    }

    public final MarkerOptions position(@NonNull LatLng latLng) {
        this.j = latLng;
        return this;
    }

    public final MarkerOptions icon(@NonNull BitmapDescriptor bitmapDescriptor) {
        this.b = bitmapDescriptor;
        return this;
    }

    public final MarkerOptions anchor(float f, float f2) {
        this.e = f;
        this.f = f2;
        return this;
    }

    public final MarkerOptions offset(int i, int i2) {
        this.g = i;
        this.h = i2;
        return this;
    }

    public final MarkerOptions title(@NonNull String str) {
        this.k = str;
        return this;
    }

    public final MarkerOptions snippet(@NonNull String str) {
        this.i = str;
        return this;
    }

    public final MarkerOptions draggable(boolean z) {
        this.c = z;
        return this;
    }

    public final MarkerOptions visible(boolean z) {
        this.d = z;
        return this;
    }

    public final MarkerOptions icons(ArrayList<BitmapDescriptor> arrayList) {
        this.n = arrayList;
        return this;
    }

    public final MarkerOptions period(int i) {
        this.m = i;
        return this;
    }

    public final MarkerOptions setFlat(boolean z) {
        this.l = z;
        return this;
    }

    public final int getLevel() {
        return this.o;
    }

    public final MarkerOptions level(int i) {
        this.o = i;
        if (!this.K) {
            this.I = i;
        }
        return this;
    }

    public final MarkerOptions zIndex(float f) {
        this.p = f;
        if (!this.L) {
            this.J = f;
        }
        return this;
    }

    public final MarkerOptions infoWindowEnable(boolean z) {
        this.q = z;
        return this;
    }

    public final MarkerOptions viewInfoWindow(boolean z) {
        this.R = z;
        return this;
    }

    public final LatLng getPosition() {
        return this.j;
    }

    public final MarkerOptions rotateAngle(float f) {
        this.w = f;
        return this;
    }

    public final String getTitle() {
        return this.k;
    }

    public final String getSnippet() {
        return this.i;
    }

    public final BitmapDescriptor getIcon() {
        return this.b;
    }

    public final float getAnchorU() {
        return this.e;
    }

    public final float getAnchorV() {
        return this.f;
    }

    public final int getOffsetX() {
        return this.g;
    }

    public final int getOffsetY() {
        return this.h;
    }

    public final boolean isDraggable() {
        return this.c;
    }

    public final boolean isVisible() {
        return this.d;
    }

    public final boolean isFlat() {
        return this.l;
    }

    public final int getPeriod() {
        return this.m;
    }

    public final ArrayList<BitmapDescriptor> getIcons() {
        return this.n;
    }

    public final float getZIndex() {
        return this.p;
    }

    public final boolean isInfoWindowEnable() {
        return this.q;
    }

    public final MarkerOptions infoWindowAlwaysShow(boolean z) {
        this.r = z;
        return this;
    }

    public final boolean isInfoWindowAlwaysShow() {
        return this.r;
    }

    public final float getRotateAngle() {
        return this.w;
    }

    public final boolean isViewInfoWindow() {
        return this.R;
    }

    public final MarkerOptions setInfoWindowOffsetY(int i) {
        this.t = i;
        return this;
    }

    public final MarkerOptions setInfoWindowOffsetX(int i) {
        this.s = i;
        return this;
    }

    public final MarkerOptions setInfoWindowOffset(int i, int i2) {
        this.s = i;
        this.t = i2;
        return this;
    }

    public final int getInfoWindowOffsetY() {
        return this.t;
    }

    public final int getInfoWindowOffsetX() {
        return this.s;
    }

    public final void isBaiduFitDensityDpi(boolean z) {
        this.u = z;
    }

    public final boolean getBaiduFitDensityDpi() {
        return this.u;
    }

    public final MarkerOptions indoorInfo(IndoorInfo indoorInfo) {
        this.v = indoorInfo;
        return this;
    }

    public final IndoorInfo getIndoorInfo() {
        return this.v;
    }

    public final MarkerOptions select(boolean z) {
        this.x = z;
        return this;
    }

    public final boolean isSelect() {
        return this.x;
    }

    public final boolean isFastLoad() {
        return this.S;
    }

    public final MarkerOptions fastLoad(boolean z) {
        this.S = z;
        return this;
    }

    public final MarkerOptions contentDescription(String str) {
        this.y = str;
        return this;
    }

    public final String getContentDescription() {
        return this.y;
    }

    public final boolean isNeedKeep() {
        return this.D;
    }

    public final MarkerOptions needKeep(boolean z) {
        this.D = z;
        return this;
    }

    public final boolean isUseSharedLayer() {
        return this.E;
    }

    public final MarkerOptions useSharedLayer(boolean z) {
        this.E = z;
        return this;
    }

    public final MarkerOptions alpha(float f) {
        this.F = f;
        return this;
    }

    public final float getAlpha() {
        return this.F;
    }

    public final boolean isClickable() {
        return this.G;
    }

    public final MarkerOptions clickable(boolean z) {
        this.G = z;
        return this;
    }

    public final MarkerName getMarkerName() {
        return this.O;
    }

    public final MarkerOptions markerName(MarkerName markerName) {
        this.O = markerName;
        return this;
    }

    public final int getInfoWindowLevel() {
        return this.I;
    }

    public final MarkerOptions infoWindowLevel(int i) {
        this.K = true;
        this.I = i;
        return this;
    }

    public final float getInfoWindowZIndex() {
        return this.J;
    }

    public final MarkerOptions infoWindowZIndex(float f) {
        this.L = true;
        this.J = f;
        return this;
    }

    public final boolean isInfoWindowAllowOverlap() {
        return this.M;
    }

    public final MarkerOptions infoWindowAllowOverlap(boolean z) {
        this.M = z;
        return this;
    }

    public final boolean isInfoWindowIgnorePlacement() {
        return this.N;
    }

    public final MarkerOptions infoWindowIgnorePlacement(boolean z) {
        this.N = z;
        return this;
    }

    public final MarkerOptions tag(Object obj) {
        this.H = obj;
        return this;
    }

    public final MarkerOptions nameAroundIcon(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b0556bc0552bfd1933f9e1e01098a6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b0556bc0552bfd1933f9e1e01098a6b");
        }
        if (this.O == null) {
            this.O = new MarkerName();
        }
        this.O.aroundMarker(z);
        return this;
    }

    public final boolean isNameAroundMarker() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d11bcafe06c675a19164b92ff539bf2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d11bcafe06c675a19164b92ff539bf2")).booleanValue() : this.O != null && this.O.getAroundIconMode() == MarkerName.AROUND_ICON_MODE;
    }

    public final MarkerOptions markerName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18ed382f9033940f2c8500a50f69246e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18ed382f9033940f2c8500a50f69246e");
        }
        if (this.O == null) {
            this.O = new MarkerName();
        }
        this.O.markerName(str);
        return this;
    }

    public final int getMarkerNameStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fc47c13cbffc37fdd711a54a2a78721", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fc47c13cbffc37fdd711a54a2a78721")).intValue();
        }
        if (this.O == null) {
            return 0;
        }
        return this.O.getStrokeColor();
    }

    public final MarkerOptions markerNameStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13ddb5da6392cbb6a06046b3b7587a21", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13ddb5da6392cbb6a06046b3b7587a21");
        }
        if (this.O == null) {
            this.O = new MarkerName();
        }
        this.O.strokeColor(i);
        return this;
    }

    public final int getMarkerNameStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1ada3cd49b84e422f1e95e8ddfc5f4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1ada3cd49b84e422f1e95e8ddfc5f4f")).intValue();
        }
        if (this.O == null) {
            return 0;
        }
        return this.O.getStrokeWidth();
    }

    public final MarkerOptions markerNameStrokeWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cecf08a95c147e5eab9df764d099b70e", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cecf08a95c147e5eab9df764d099b70e");
        }
        if (this.O == null) {
            this.O = new MarkerName();
        }
        this.O.strokeWidth(i);
        return this;
    }

    public final float getMarkerNameZindex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2fb431cef991c6e83d6084ca248a4f04", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2fb431cef991c6e83d6084ca248a4f04")).floatValue();
        }
        if (this.O == null) {
            return this.p;
        }
        return this.O.getOrder();
    }

    public final MarkerOptions markerNameZindex(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9729fc91ec54c7e65dc518dbb0e196f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (MarkerOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9729fc91ec54c7e65dc518dbb0e196f4");
        }
        if (this.O == null) {
            this.O = new MarkerName();
        }
        this.O.order(f);
        return this;
    }

    public final float getScale() {
        return this.P;
    }

    public final MarkerOptions scale(float f) {
        this.P = f;
        return this;
    }

    public final Object getTag() {
        return this.H;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a046428734f052508033b46eead1926f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a046428734f052508033b46eead1926f");
        }
        return "MarkerOptions{bitmapDescriptor=" + this.b + ", isDraggable=" + this.c + ", isVisible=" + this.d + ", anchorU=" + this.e + ", anchorV=" + this.f + ", snippet='" + this.i + "', latLng=" + this.j + ", title='" + this.k + "', isFlat=" + this.l + ", period=" + this.m + ", icons=" + this.n + ", level=" + this.o + ", zIndex=" + this.p + ", infoWindowEnable=" + this.q + ", infoWindowOffsetX=" + this.s + ", infoWindowOffsetY=" + this.t + ", baiduFitDensityDpi=" + this.u + ", indoorInfo=" + this.v + ", mRotation=" + this.w + ", mIsSelect=" + this.x + ", contentDescription='" + this.y + "', allowOverlap=" + this.z + ", ignorePlacement=" + this.A + ", jsonObject=" + this.B + ", defaultInfoWindowEnable=" + this.C + ", needKeep=" + this.D + ", useSharedLayer=" + this.E + ", useViewInfoWindowProperty=" + this.Q + ", viewInfoWindow=" + this.R + ", mFastLoad=" + this.S + ", alpha=" + this.F + ", mMarkerName=" + this.O + ", infoWindowLevel=" + this.I + ", infoWindowZIndex=" + this.J + ", isInfoWindowAllowOverlap=" + this.M + ", isInfoWindowIgnorePlacement=" + this.N + ", tag=" + this.H + ", scale=" + this.P + '}';
    }

    @Deprecated
    public final void setLevel(int i) {
        this.o = i;
    }

    @Deprecated
    public final MarkerOptions useViewInfoWindowProperty(boolean z) {
        this.Q = z;
        return this;
    }

    @Deprecated
    public final boolean canUseViewInfoWindowProperty() {
        return this.Q;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class MarkerName {
        public static final Orientation[] AROUND_ICON_MODE = {Orientation.BOTTOM, Orientation.TOP, Orientation.LEFT, Orientation.RIGHT};
        public static final Orientation[] AROUND_ICON_MODE_NO_TOP = {Orientation.BOTTOM, Orientation.LEFT, Orientation.RIGHT, Orientation.NONE};
        @Deprecated
        public static final Oritation[] AROUND_MODE = null;
        @Deprecated
        public static final Oritation[] AROUND_MODE_NO_TOP = null;
        public static ChangeQuickRedirect changeQuickRedirect;
        private String a;
        private List<BitmapDescriptor> b;
        private Typeface c;
        private Orientation[] d;
        @ColorInt
        private int e;
        private int f;
        @ColorInt
        private int g;
        private int h;
        private float i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private float n;
        private float o;

        @Deprecated
        public final MarkerName aroundMarker(Oritation[] oritationArr) {
            return this;
        }

        @Deprecated
        public final Oritation[] getAroundMarkerMode() {
            return null;
        }

        public MarkerName() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8923be9ad78e33ffd830c03fdcf59f83", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8923be9ad78e33ffd830c03fdcf59f83");
                return;
            }
            this.a = "";
            this.b = null;
            this.c = null;
            this.e = -16777216;
            this.h = 16;
            this.k = true;
            this.l = true;
            this.m = true;
        }

        public final String getMarkerName() {
            return this.a;
        }

        public final MarkerName markerName(@NonNull String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36d18b68ee591d9f24bc0d95824a5324", RobustBitConfig.DEFAULT_VALUE) ? (MarkerName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36d18b68ee591d9f24bc0d95824a5324") : markerName(str, null);
        }

        public final MarkerName markerName(@NonNull String str, @Nullable List<BitmapDescriptor> list) {
            this.a = str;
            this.b = list;
            return this;
        }

        public final List<BitmapDescriptor> getImagesInText() {
            return this.b;
        }

        public final MarkerName typeface(Typeface typeface) {
            this.c = typeface;
            return this;
        }

        public final Typeface getTypeface() {
            return this.c;
        }

        public final int getColor() {
            return this.e;
        }

        public final MarkerName color(@ColorInt int i) {
            this.e = i;
            return this;
        }

        public final int getSize() {
            return this.h;
        }

        public final MarkerName size(int i) {
            this.h = i;
            return this;
        }

        public final Orientation[] getAroundIconMode() {
            return this.d;
        }

        public final MarkerName aroundIcon(Orientation[] orientationArr) {
            Object[] objArr = {orientationArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f8e7f440c2fcc6891797d8f438a32ff", RobustBitConfig.DEFAULT_VALUE)) {
                return (MarkerName) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f8e7f440c2fcc6891797d8f438a32ff");
            }
            if (orientationArr == AROUND_ICON_MODE) {
                this.d = AROUND_ICON_MODE;
            } else if (orientationArr == AROUND_ICON_MODE_NO_TOP) {
                this.d = AROUND_ICON_MODE_NO_TOP;
            } else {
                this.d = null;
            }
            return this;
        }

        public final int getStrokeColor() {
            return this.g;
        }

        public final MarkerName strokeColor(@ColorInt int i) {
            this.g = i;
            return this;
        }

        public final int getStrokeWidth() {
            return this.f;
        }

        public final MarkerName strokeWidth(int i) {
            this.f = i;
            return this;
        }

        public final float getOrder() {
            return this.i;
        }

        public final MarkerName order(float f) {
            this.i = f;
            this.j = true;
            return this;
        }

        public final boolean isOptional() {
            return this.m;
        }

        public final MarkerName optional(boolean z) {
            this.m = z;
            return this;
        }

        public final boolean isIgnorePlacement() {
            return this.k;
        }

        public final MarkerName ignorePlacement(boolean z) {
            this.k = z;
            return this;
        }

        public final boolean isAllowOverlap() {
            return this.l;
        }

        public final MarkerName allowOverlap(boolean z) {
            this.l = z;
            return this;
        }

        public final MarkerName offset(float f, float f2) {
            this.n = f;
            this.o = f2;
            return this;
        }

        public final float getOffsetX() {
            return this.n;
        }

        public final float getOffsetY() {
            return this.o;
        }

        public final boolean isSetOrder() {
            return this.j;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c4db364f5e234e69bda923603d80b2b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c4db364f5e234e69bda923603d80b2b");
            }
            return "MarkerName{markerName='" + this.a + "', aroundMode=" + this.d + ", color=" + this.e + ", strokeWidth=" + this.f + ", strokeColor=" + this.g + ", size=" + this.h + ", order=" + this.i + ", ignorePlacement=" + this.k + ", allowOverlap=" + this.l + ", optional=" + this.m + ", offsetX=" + this.n + ", offsetY=" + this.o + '}';
        }

        @Deprecated
        public final boolean isAroundMarker() {
            return this.d == AROUND_ICON_MODE;
        }

        @Deprecated
        public final MarkerName aroundMarker(boolean z) {
            if (z) {
                this.d = AROUND_ICON_MODE;
            } else {
                this.d = null;
            }
            return this;
        }
    }
}
