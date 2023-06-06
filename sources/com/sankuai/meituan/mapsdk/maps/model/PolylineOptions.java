package com.sankuai.meituan.mapsdk.maps.model;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.business.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class PolylineOptions {
    public static final int DEFAULT_ARROW_SPACING = 64;
    public static final int DEFAULT_BODY_COLOR = -9518320;
    public static final int DEFAULT_BORDER_COLOR = -1289424;
    public static final int[] DEFAULT_DASH_PATTERN = {30, 15};
    public static ChangeQuickRedirect changeQuickRedirect;
    @Deprecated
    private BitmapDescriptor A;
    @Deprecated
    private int B;
    @Deprecated
    private List<Integer> C;
    @Deprecated
    private float D;
    @Deprecated
    private boolean a;
    private boolean b;
    private List<LatLng> c;
    private boolean d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;
    private Text k;
    private int l;
    private PatternItem m;
    private int n;
    private Object o;
    @Deprecated
    private int p;
    @Deprecated
    private BitmapDescriptor q;
    @Deprecated
    private List<BitmapDescriptor> r;
    @Deprecated
    private List<Integer> s;
    @Deprecated
    private boolean t;
    @Deprecated
    private List<Integer> u;
    @Deprecated
    private int v;
    @Deprecated
    private int w;
    @Deprecated
    private ColorType x;
    @Deprecated
    private String y;
    @Deprecated
    private BitmapDescriptor z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class LineType {
        public static final int LINE_TYPE_DOTTEDLINE = 2;
        public static final int LINE_TYPE_IMAGEINARYLINE = 1;
        public static final int LINE_TYPE_MULTICOLORCAP = 3;
        public static final int LINE_TYPE_MULTICOLORLINE = 0;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class PatternItem {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract PatternItem copy();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class PolylineColors {
        public static final int DARK_BLUE = 6;
        public static final int DASHED = 33;
        public static final int GRAYBLUE = 8;
        public static final int GREEN = 4;
        public static final int GREY = 0;
        public static final int LAST_BLUE = 20;
        public static final int LIGHT_BLUE = 1;
        public static final int LIVER_RED = 9;
        public static final int MID_BLUE = 5;
        public static final int RED = 2;
        public static final int TRANSPARENT = 7;
        public static final int WHITE_BLUE = 19;
        public static final int YELLOW = 3;
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public PolylineOptions() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "379aaf2ba41b2c28abe380940bafb360", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "379aaf2ba41b2c28abe380940bafb360");
            return;
        }
        this.a = false;
        this.b = false;
        this.c = new ArrayList();
        this.d = true;
        this.e = false;
        this.f = 10.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = false;
        this.j = false;
        this.l = 1;
        this.n = 2;
        this.t = true;
        this.w = 100;
        this.x = ColorType.LINE_COLOR_NONE;
        this.D = 0.0f;
    }

    public final int getVersion() {
        return this.n;
    }

    public final boolean isGeodesic() {
        return this.b;
    }

    @Deprecated
    public final boolean isDottedLine() {
        return this.a;
    }

    @Deprecated
    public final PolylineOptions setDottedLine(boolean z) {
        this.n = 1;
        this.a = z;
        return this;
    }

    public final PolylineOptions add(@NonNull LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3db9336351f88c495227ac8712bd6eb0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3db9336351f88c495227ac8712bd6eb0");
        }
        this.c.add(latLng);
        return this;
    }

    public final PolylineOptions addAll(@NonNull Iterable<LatLng> iterable) {
        Object[] objArr = {iterable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12464fd532ecff2dd5eaaa3164fa328f", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12464fd532ecff2dd5eaaa3164fa328f");
        }
        ArrayList arrayList = new ArrayList();
        for (LatLng latLng : iterable) {
            arrayList.add(latLng);
        }
        this.c.addAll(arrayList);
        return this;
    }

    public final PolylineOptions width(float f) {
        if (f >= 0.0f) {
            this.f = f;
        }
        return this;
    }

    public final PolylineOptions zIndex(float f) {
        this.g = f;
        return this;
    }

    public final PolylineOptions visible(boolean z) {
        this.d = z;
        return this;
    }

    public final PolylineOptions avoidable(boolean z) {
        this.e = z;
        return this;
    }

    public final boolean isAvoidable() {
        return this.e;
    }

    public final PolylineOptions geodesic(boolean z) {
        this.b = z;
        return this;
    }

    public final PolylineOptions add(LatLng... latLngArr) {
        Object[] objArr = {latLngArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6865a20b8b761c031aa2a3f89546953", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6865a20b8b761c031aa2a3f89546953");
        }
        this.c.addAll(Arrays.asList(latLngArr));
        return this;
    }

    public final List<LatLng> getPoints() {
        return this.c;
    }

    @Deprecated
    public final void setPoints(List<LatLng> list) {
        this.c = list;
    }

    public final PolylineOptions points(List<LatLng> list) {
        this.c = list;
        return this;
    }

    public final float getWidth() {
        return this.f;
    }

    public final float getZIndex() {
        return this.g;
    }

    public final boolean isVisible() {
        return this.d;
    }

    public final PolylineOptions alpha(float f) {
        this.h = f;
        return this;
    }

    public final float getAlpha() {
        return this.h;
    }

    public final PolylineOptions clickable(boolean z) {
        this.i = z;
        return this;
    }

    public final boolean isClickable() {
        return this.i;
    }

    public final PolylineOptions lineCap(boolean z) {
        this.j = z;
        return this;
    }

    public final boolean getLineCap() {
        return this.j;
    }

    public final Text getText() {
        return this.k;
    }

    @Deprecated
    public final void setText(Text text) {
        this.k = text;
    }

    public final PolylineOptions text(Text text) {
        this.k = text;
        return this;
    }

    public final int getLevel() {
        return this.l;
    }

    @Deprecated
    public final void setLevel(int i) {
        this.l = i;
    }

    public final PolylineOptions level(int i) {
        this.l = i;
        return this;
    }

    public final PolylineOptions tag(Object obj) {
        this.o = obj;
        return this;
    }

    public final Object getTag() {
        return this.o;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum ColorType {
        LINE_COLOR_NONE,
        LINE_COLOR_TEXTURE,
        LINE_COLOR_ARGB;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static ColorType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bac5ce6e710218961bbac122eaabfbbb", RobustBitConfig.DEFAULT_VALUE) ? (ColorType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bac5ce6e710218961bbac122eaabfbbb") : (ColorType) Enum.valueOf(ColorType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ColorType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "373ef02e642c23a826024bc6df588a9b", RobustBitConfig.DEFAULT_VALUE) ? (ColorType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "373ef02e642c23a826024bc6df588a9b") : (ColorType[]) values().clone();
        }

        ColorType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61a0822021f6eb64180b211dd2d2ae2f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61a0822021f6eb64180b211dd2d2ae2f");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum TextPriority {
        NORMAL,
        HIGH;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static TextPriority valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1761e5ca50db5f030e310429e7676d56", RobustBitConfig.DEFAULT_VALUE) ? (TextPriority) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1761e5ca50db5f030e310429e7676d56") : (TextPriority) Enum.valueOf(TextPriority.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static TextPriority[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "495f148bcff8bb0d1d878000beb17d99", RobustBitConfig.DEFAULT_VALUE) ? (TextPriority[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "495f148bcff8bb0d1d878000beb17d99") : (TextPriority[]) values().clone();
        }

        TextPriority() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8223a69174a65788013772ba8a6d2190", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8223a69174a65788013772ba8a6d2190");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class SegmentText {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int a;
        private final int b;
        private final String c;

        public SegmentText(int i, int i2, String str) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cba97288a2cf0c8cb408a0d392a6943", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cba97288a2cf0c8cb408a0d392a6943");
                return;
            }
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public final int getStartIndex() {
            return this.a;
        }

        public final int getEndIndex() {
            return this.b;
        }

        public final String getText() {
            return this.c;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Text {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final List<SegmentText> a;
        private Builder b;

        public Text(Builder builder) {
            Object[] objArr = {builder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cec60d4d53005345cc6f90536b5a9f69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cec60d4d53005345cc6f90536b5a9f69");
                return;
            }
            this.a = Collections.unmodifiableList(builder.a);
            this.b = builder;
        }

        public final List<SegmentText> getSegmentTexts() {
            return this.a;
        }

        public final int getTextColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc77c9bb653f1a8afd9a650995966eea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc77c9bb653f1a8afd9a650995966eea")).intValue() : this.b.b;
        }

        public final void setTextColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5113850901f97a105b00e17e1087961", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5113850901f97a105b00e17e1087961");
            } else {
                this.b.b = i;
            }
        }

        public final int getStrokeColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffca34d138ac92e9081f3378d32f0f2d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffca34d138ac92e9081f3378d32f0f2d")).intValue() : this.b.c;
        }

        public final void setStrokeColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66799d86ab2a7089a91c1c17461d0a83", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66799d86ab2a7089a91c1c17461d0a83");
            } else {
                this.b.c = i;
            }
        }

        public final int getTextSize() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "237a80a1319f74b35149dec81fc7b9a2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "237a80a1319f74b35149dec81fc7b9a2")).intValue() : this.b.d;
        }

        public final void setTextSize(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c51a29b3215001cc26410ac06792e1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c51a29b3215001cc26410ac06792e1d");
            } else {
                this.b.d = i;
            }
        }

        public final TextPriority getPriority() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b591fd91c16ed21cdeb1204cb28d584d", RobustBitConfig.DEFAULT_VALUE) ? (TextPriority) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b591fd91c16ed21cdeb1204cb28d584d") : this.b.e;
        }

        public final void setPriority(TextPriority textPriority) {
            Object[] objArr = {textPriority};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df0eb4797e0041c28d20e7d10dc4c088", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df0eb4797e0041c28d20e7d10dc4c088");
            } else {
                this.b.e = textPriority;
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static final class Builder {
            public static ChangeQuickRedirect changeQuickRedirect;
            private List<SegmentText> a;
            private int b;
            private int c;
            private int d;
            private TextPriority e;

            public Builder(SegmentText segmentText) {
                Object[] objArr = {segmentText};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "795ed18923484be51b8cf9d97ede397a", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "795ed18923484be51b8cf9d97ede397a");
                    return;
                }
                this.a = new ArrayList();
                this.b = -16777216;
                this.c = -1;
                this.d = 14;
                this.e = TextPriority.HIGH;
                addSegmentText(segmentText);
            }

            public Builder(List<SegmentText> list) {
                Object[] objArr = {list};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02fffd3a2d312e03cb9430a819dc3c21", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02fffd3a2d312e03cb9430a819dc3c21");
                    return;
                }
                this.a = new ArrayList();
                this.b = -16777216;
                this.c = -1;
                this.d = 14;
                this.e = TextPriority.HIGH;
                addAllSegmentText(list);
            }

            public final Builder addSegmentText(SegmentText segmentText) {
                Object[] objArr = {segmentText};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fa84e8a52854847711391a2d13167f9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fa84e8a52854847711391a2d13167f9");
                }
                this.a.add(segmentText);
                return this;
            }

            public final Builder addAllSegmentText(List<SegmentText> list) {
                Object[] objArr = {list};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dacabc61710983e2d43a316c469ed2e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dacabc61710983e2d43a316c469ed2e");
                }
                this.a.addAll(list);
                return this;
            }

            public final Builder color(int i) {
                this.b = i;
                return this;
            }

            public final Builder strokeColor(int i) {
                this.c = i;
                return this;
            }

            public final Builder size(int i) {
                this.d = i;
                return this;
            }

            public final Builder priority(TextPriority textPriority) {
                this.e = textPriority;
                return this;
            }

            public final Text build() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b81c0ea03b2f8965417344a37df7493a", RobustBitConfig.DEFAULT_VALUE) ? (Text) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b81c0ea03b2f8965417344a37df7493a") : new Text(this);
            }
        }
    }

    public final PolylineOptions pattern(PatternItem patternItem) {
        this.n = 2;
        this.m = patternItem;
        return this;
    }

    public final PatternItem getPattern() {
        return this.m;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SingleColorPattern extends PatternItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int a;
        private int b;
        private int c;
        private BitmapDescriptor d;
        private int e;

        public SingleColorPattern() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d504c652e34a3a4939e98b9452cfbc49", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d504c652e34a3a4939e98b9452cfbc49");
                return;
            }
            this.a = PolylineOptions.DEFAULT_BODY_COLOR;
            this.b = PolylineOptions.DEFAULT_BORDER_COLOR;
            this.c = 0;
            this.d = null;
            this.e = 64;
        }

        public int getColor() {
            return this.a;
        }

        public SingleColorPattern color(int i) {
            this.a = i;
            return this;
        }

        public int getBorderColor() {
            return this.b;
        }

        public SingleColorPattern borderColor(int i) {
            this.b = i;
            return this;
        }

        public int getBorderWidth() {
            return this.c;
        }

        public SingleColorPattern borderWidth(int i) {
            if (i >= 0) {
                this.c = i;
            }
            return this;
        }

        public BitmapDescriptor getArrowTexture() {
            return this.d;
        }

        public SingleColorPattern arrowTexture(BitmapDescriptor bitmapDescriptor) {
            this.d = bitmapDescriptor;
            return this;
        }

        public int getArrowSpacing() {
            return this.e;
        }

        public SingleColorPattern arrowSpacing(int i) {
            this.e = i;
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.PatternItem
        public PatternItem copy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa8ccd19399acf019864a63d96898d68", RobustBitConfig.DEFAULT_VALUE)) {
                return (PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa8ccd19399acf019864a63d96898d68");
            }
            SingleColorPattern singleColorPattern = new SingleColorPattern();
            singleColorPattern.color(this.a);
            singleColorPattern.borderColor(this.b);
            singleColorPattern.borderWidth(this.c);
            singleColorPattern.arrowTexture(this.d);
            singleColorPattern.arrowSpacing(this.e);
            return singleColorPattern;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96fb6e95f327e1ca1f676c3d232d60a9", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96fb6e95f327e1ca1f676c3d232d60a9");
            }
            return "SingleColorPattern{mColor=" + this.a + ", mBorderColor=" + this.b + ", mBorderWidth=" + this.c + ", mArrowTexture=" + this.d + ", mArrowSpacing=" + this.e + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class MultiColorPattern extends PatternItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int[] a;
        private int[] b;
        private int[] c;
        private float d;
        private BitmapDescriptor e;
        private int f;

        public MultiColorPattern() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "669b1f389c8327d0efb1c3293cdbf1e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "669b1f389c8327d0efb1c3293cdbf1e0");
                return;
            }
            this.a = new int[]{PolylineOptions.DEFAULT_BODY_COLOR};
            this.b = new int[]{0};
            this.c = new int[]{PolylineOptions.DEFAULT_BORDER_COLOR};
            this.d = 0.0f;
            this.e = null;
            this.f = 64;
        }

        public MultiColorPattern colors(int[] iArr, int[] iArr2) {
            this.a = iArr;
            this.b = iArr2;
            return this;
        }

        public int[] getColors() {
            return this.a;
        }

        public int[] getIndexes() {
            return this.b;
        }

        public int[] getBorderColors() {
            return this.c;
        }

        public MultiColorPattern borderColors(int[] iArr) {
            this.c = iArr;
            return this;
        }

        public int getBorderColor() {
            return this.c == null ? PolylineOptions.DEFAULT_BORDER_COLOR : this.c[0];
        }

        public MultiColorPattern borderColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49c4b7c94e81bc63730947a2fc079cfe", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPattern) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49c4b7c94e81bc63730947a2fc079cfe");
            }
            this.c = new int[1];
            this.c[0] = i;
            return this;
        }

        public float getBorderWidth() {
            return this.d;
        }

        public MultiColorPattern borderWidth(float f) {
            if (f >= 0.0f) {
                this.d = f;
            }
            return this;
        }

        public BitmapDescriptor getArrowTexture() {
            return this.e;
        }

        public MultiColorPattern arrowTexture(BitmapDescriptor bitmapDescriptor) {
            this.e = bitmapDescriptor;
            return this;
        }

        public int getArrowSpacing() {
            return this.f;
        }

        public MultiColorPattern arrowSpacing(int i) {
            this.f = i;
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.PatternItem
        public PatternItem copy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "385cc613b08f87376a4bde3bff02c5ef", RobustBitConfig.DEFAULT_VALUE)) {
                return (PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "385cc613b08f87376a4bde3bff02c5ef");
            }
            MultiColorPattern multiColorPattern = new MultiColorPattern();
            multiColorPattern.colors(this.a != null ? (int[]) this.a.clone() : null, this.b != null ? (int[]) this.b.clone() : null);
            multiColorPattern.borderColors(this.c != null ? (int[]) this.c.clone() : null);
            multiColorPattern.borderWidth(this.d);
            multiColorPattern.arrowTexture(this.e);
            multiColorPattern.arrowSpacing(this.f);
            return multiColorPattern;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f889c713536fefa89826b4b74d00c1b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f889c713536fefa89826b4b74d00c1b");
            }
            return "MultiColorPattern{mColors=" + Arrays.toString(this.a) + ", mIndexes=" + Arrays.toString(this.b) + ", mBorderColors=" + Arrays.toString(this.c) + ", mBorderWidth=" + this.d + ", mArrowTexture=" + this.e + ", mArrowSpacing=" + this.f + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class DotLinePattern extends PatternItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int a;
        private BitmapDescriptor b;

        public DotLinePattern() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82ddcd5723addb971b933e33d031c375", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82ddcd5723addb971b933e33d031c375");
                return;
            }
            this.a = 16;
            this.b = BitmapDescriptorFactory.fromBitmap(a.a(PolylineOptions.DEFAULT_BORDER_COLOR, 8));
        }

        public int getSpacing() {
            return this.a;
        }

        public DotLinePattern spacing(int i) {
            this.a = i;
            return this;
        }

        public BitmapDescriptor getTexture() {
            return this.b;
        }

        public DotLinePattern texture(BitmapDescriptor bitmapDescriptor) {
            this.b = bitmapDescriptor;
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.PatternItem
        public PatternItem copy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d94d260be046d097402075efd58fd891", RobustBitConfig.DEFAULT_VALUE)) {
                return (PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d94d260be046d097402075efd58fd891");
            }
            DotLinePattern dotLinePattern = new DotLinePattern();
            dotLinePattern.spacing(this.a);
            dotLinePattern.texture(this.b);
            return dotLinePattern;
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38807bf6e10c3bc11de5d29cc7802bb9", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38807bf6e10c3bc11de5d29cc7802bb9");
            }
            return "DotLinePattern{mSpacing=" + this.a + ", mTexture=" + this.b + '}';
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class DotColorLinePattern extends PatternItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int a;
        private int[] b;

        public DotColorLinePattern() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f63a5a3628a3da91062ef5ad0d80f9a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f63a5a3628a3da91062ef5ad0d80f9a5");
                return;
            }
            this.a = PolylineOptions.DEFAULT_BODY_COLOR;
            this.b = PolylineOptions.DEFAULT_DASH_PATTERN;
        }

        public int getColor() {
            return this.a;
        }

        public DotColorLinePattern color(int i) {
            this.a = i;
            return this;
        }

        public int[] getDashPattern() {
            return this.b;
        }

        public DotColorLinePattern dashPattern(int[] iArr) {
            if (iArr == null) {
                return this;
            }
            this.b = iArr;
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.PatternItem
        public PatternItem copy() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7636e10fa662213ba82b1f0d846a5ab", RobustBitConfig.DEFAULT_VALUE) ? (PatternItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7636e10fa662213ba82b1f0d846a5ab") : new DotColorLinePattern().color(this.a).dashPattern(Arrays.copyOf(this.b, this.b.length));
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "907f5d39d70eebac9edfb4b655c4cc2b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "907f5d39d70eebac9edfb4b655c4cc2b");
            }
            return "DotColorLinePattern{mColor=" + this.a + ", mDashPattern=" + Arrays.toString(this.b) + '}';
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b628b38eefebb9130cd9b11f0a3936fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b628b38eefebb9130cd9b11f0a3936fc");
        }
        return "PolylineOptions{isDottedLine=" + this.a + ", isGeodesic=" + this.b + ", points=" + this.c + ", isVisible=" + this.d + ", width=" + this.f + ", zIndex=" + this.g + ", alpha=" + this.h + ", clickable=" + this.i + ", lineCap=" + this.j + ", text=" + this.k + ", level=" + this.l + ", tag=" + this.o + ", mPatternItem=" + this.m + ", mVersion=" + this.n + '}';
    }

    @Deprecated
    public final PolylineOptions color(int i) {
        this.n = 1;
        this.p = i;
        return this;
    }

    @Deprecated
    public final PolylineOptions setCustomTexture(BitmapDescriptor bitmapDescriptor) {
        this.n = 1;
        this.q = bitmapDescriptor;
        return this;
    }

    @Deprecated
    public final PolylineOptions setCustomTextureList(List<BitmapDescriptor> list) {
        this.n = 1;
        this.r = list;
        return this;
    }

    @Deprecated
    public final PolylineOptions setCustomTextureIndex(List<Integer> list) {
        this.n = 1;
        this.s = list;
        return this;
    }

    @Deprecated
    public final PolylineOptions setUseTexture(boolean z) {
        this.n = 1;
        this.t = z;
        return this;
    }

    @Deprecated
    public final PolylineOptions colorValues(List<Integer> list) {
        this.n = 1;
        this.u = list;
        return this;
    }

    @Deprecated
    public final void setLineType(int i) {
        this.n = 1;
        this.v = i;
    }

    @Deprecated
    public final int getColor() {
        return this.p;
    }

    @Deprecated
    public final BitmapDescriptor getCustomTexture() {
        return this.q;
    }

    @Deprecated
    public final List<BitmapDescriptor> getCustomTextureList() {
        return this.r;
    }

    @Deprecated
    public final List<Integer> getCustomTextureIndex() {
        return this.s;
    }

    @Deprecated
    public final List<Integer> getColorValues() {
        return this.u;
    }

    @Deprecated
    public final boolean isUseTexture() {
        return this.t;
    }

    @Deprecated
    public final PolylineOptions arrowTexture(BitmapDescriptor bitmapDescriptor) {
        this.n = 1;
        this.A = bitmapDescriptor;
        return this;
    }

    @Deprecated
    public final BitmapDescriptor getArrowDescriptor() {
        return this.A;
    }

    @Deprecated
    public final PolylineOptions arrowSpacing(int i) {
        this.n = 1;
        this.w = i;
        return this;
    }

    @Deprecated
    public final int getArrowSpacing() {
        return this.w;
    }

    @Deprecated
    public final int getLineType() {
        return this.v;
    }

    @Deprecated
    public final PolylineOptions colorType(ColorType colorType) {
        this.n = 1;
        this.x = colorType;
        return this;
    }

    @Deprecated
    public final ColorType getColorType() {
        return this.x;
    }

    @Deprecated
    public final PolylineOptions setColorTexture(String str) {
        this.n = 1;
        this.y = str;
        return this;
    }

    @Deprecated
    public final String getStrColorTextureName() {
        return this.y;
    }

    @Deprecated
    public final PolylineOptions colorTexture(BitmapDescriptor bitmapDescriptor) {
        this.n = 1;
        this.z = bitmapDescriptor;
        return this;
    }

    @Deprecated
    public final BitmapDescriptor getColorTexture() {
        return this.z;
    }

    @Deprecated
    public final PolylineOptions borderColor(int i) {
        this.n = 1;
        this.B = i;
        return this;
    }

    @Deprecated
    public final int getBorderColor() {
        return this.B;
    }

    @Deprecated
    public final PolylineOptions borderColors(List<Integer> list) {
        this.n = 1;
        this.C = list;
        return this;
    }

    @Deprecated
    public final List<Integer> getBorderColors() {
        return this.C;
    }

    @Deprecated
    public final PolylineOptions borderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ca8227149bb2e56405d04339c3928220", RobustBitConfig.DEFAULT_VALUE)) {
            return (PolylineOptions) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ca8227149bb2e56405d04339c3928220");
        }
        this.n = 1;
        if (f >= 0.0f) {
            this.D = f;
        }
        return this;
    }

    @Deprecated
    public final float getBorderWidth() {
        return this.D;
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public static class SingleColorPatten extends SingleColorPattern {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Deprecated
        public SingleColorPatten setColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "813953e86bb138c74f75503967c44895", RobustBitConfig.DEFAULT_VALUE) ? (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "813953e86bb138c74f75503967c44895") : color(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public SingleColorPatten color(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f286e922686cc7265166f6f09b0787d9", RobustBitConfig.DEFAULT_VALUE)) {
                return (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f286e922686cc7265166f6f09b0787d9");
            }
            super.color(i);
            return this;
        }

        @Deprecated
        public SingleColorPatten setBorderColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73e24c37fe10841fe9e908c7d371cd7d", RobustBitConfig.DEFAULT_VALUE) ? (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73e24c37fe10841fe9e908c7d371cd7d") : borderColor(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public SingleColorPatten borderColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83874fd902658fb834bb5dee91f9b851", RobustBitConfig.DEFAULT_VALUE)) {
                return (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83874fd902658fb834bb5dee91f9b851");
            }
            super.borderColor(i);
            return this;
        }

        @Deprecated
        public SingleColorPatten setBorderWidth(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce0f7415714e823ba778287af54be92", RobustBitConfig.DEFAULT_VALUE) ? (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce0f7415714e823ba778287af54be92") : borderWidth(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public SingleColorPatten borderWidth(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d70f3f4c085ba5a170b5107d1293375b", RobustBitConfig.DEFAULT_VALUE)) {
                return (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d70f3f4c085ba5a170b5107d1293375b");
            }
            super.borderWidth(i);
            return this;
        }

        @Deprecated
        public SingleColorPatten setArrowTexture(BitmapDescriptor bitmapDescriptor) {
            Object[] objArr = {bitmapDescriptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4379418474cbb05c3086f8ca1d299a7b", RobustBitConfig.DEFAULT_VALUE) ? (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4379418474cbb05c3086f8ca1d299a7b") : arrowTexture(bitmapDescriptor);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public SingleColorPatten arrowTexture(BitmapDescriptor bitmapDescriptor) {
            Object[] objArr = {bitmapDescriptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdfbb9ecc3eca133657515c468d87e40", RobustBitConfig.DEFAULT_VALUE)) {
                return (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdfbb9ecc3eca133657515c468d87e40");
            }
            super.arrowTexture(bitmapDescriptor);
            return this;
        }

        @Deprecated
        public SingleColorPatten setArrowSpacing(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7d7fb62499b1183dfc011d4c2bf35d1", RobustBitConfig.DEFAULT_VALUE) ? (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7d7fb62499b1183dfc011d4c2bf35d1") : arrowSpacing(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public SingleColorPatten arrowSpacing(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f620361af6648e6767476b6f82f679b", RobustBitConfig.DEFAULT_VALUE)) {
                return (SingleColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f620361af6648e6767476b6f82f679b");
            }
            super.arrowSpacing(i);
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public int getColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6043429428beb13c036c49ce260700a7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6043429428beb13c036c49ce260700a7")).intValue() : super.getColor();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public int getBorderColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e06b7f0a3452d81401c9f24924197d36", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e06b7f0a3452d81401c9f24924197d36")).intValue() : super.getBorderColor();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public int getBorderWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "323f31f16ae948eee0c7f35e3fd7e900", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "323f31f16ae948eee0c7f35e3fd7e900")).intValue() : super.getBorderWidth();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public int getArrowSpacing() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4b3f147172321efc82fb9dd159a2fd4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4b3f147172321efc82fb9dd159a2fd4")).intValue() : super.getArrowSpacing();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.SingleColorPattern
        @Deprecated
        public BitmapDescriptor getArrowTexture() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60b7144412ee6d46fb945cba32fceae2", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60b7144412ee6d46fb945cba32fceae2") : super.getArrowTexture();
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public static class MultiColorPatten extends MultiColorPattern {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Deprecated
        public MultiColorPatten colorValues(int[] iArr, int[] iArr2) {
            Object[] objArr = {iArr, iArr2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f81affa29256ce80481a70b7d84b275c", RobustBitConfig.DEFAULT_VALUE) ? (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f81affa29256ce80481a70b7d84b275c") : colors(iArr, iArr2);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public MultiColorPatten colors(int[] iArr, int[] iArr2) {
            Object[] objArr = {iArr, iArr2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3ce0b41b3f885bb92be30c62987c105", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3ce0b41b3f885bb92be30c62987c105");
            }
            super.colors(iArr, iArr2);
            return this;
        }

        @Deprecated
        public MultiColorPatten setBorderColors(int[] iArr) {
            Object[] objArr = {iArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "95c2dce488d82e813f4722498d0f78e7", RobustBitConfig.DEFAULT_VALUE) ? (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "95c2dce488d82e813f4722498d0f78e7") : borderColors(iArr);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public MultiColorPatten borderColors(int[] iArr) {
            Object[] objArr = {iArr};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ecfa4ecebda8d7d8640af3325de5a71", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ecfa4ecebda8d7d8640af3325de5a71");
            }
            super.borderColors(iArr);
            return this;
        }

        @Deprecated
        public MultiColorPatten setBorderColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5ac8eac215fd091ac975bc591f757e1", RobustBitConfig.DEFAULT_VALUE) ? (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5ac8eac215fd091ac975bc591f757e1") : borderColor(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public MultiColorPatten borderColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d3a3fcc6cc135d8b3036ad59a424669", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d3a3fcc6cc135d8b3036ad59a424669");
            }
            super.borderColor(i);
            return this;
        }

        @Deprecated
        public MultiColorPatten setBorderWidth(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "004b71c5f11879ac1153eec3241c4333", RobustBitConfig.DEFAULT_VALUE) ? (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "004b71c5f11879ac1153eec3241c4333") : borderWidth(f);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public MultiColorPatten borderWidth(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "512565fc55eb45b2ae71e726413ecf3d", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "512565fc55eb45b2ae71e726413ecf3d");
            }
            super.borderWidth(f);
            return this;
        }

        @Deprecated
        public MultiColorPatten setArrowTexture(BitmapDescriptor bitmapDescriptor) {
            Object[] objArr = {bitmapDescriptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59783b5b37a4a8ce7ec7bbead8be980e", RobustBitConfig.DEFAULT_VALUE) ? (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59783b5b37a4a8ce7ec7bbead8be980e") : arrowTexture(bitmapDescriptor);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public MultiColorPatten arrowTexture(BitmapDescriptor bitmapDescriptor) {
            Object[] objArr = {bitmapDescriptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5bf4e55b1ab92a4a5d0d0d92bfbfda3", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5bf4e55b1ab92a4a5d0d0d92bfbfda3");
            }
            super.arrowTexture(bitmapDescriptor);
            return this;
        }

        @Deprecated
        public MultiColorPatten setArrowSpacing(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e60ef3c4a99048f023b386f10582288", RobustBitConfig.DEFAULT_VALUE) ? (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e60ef3c4a99048f023b386f10582288") : arrowSpacing(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public MultiColorPatten arrowSpacing(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93dcd4ef66ae257c4e36b29f0f53c960", RobustBitConfig.DEFAULT_VALUE)) {
                return (MultiColorPatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93dcd4ef66ae257c4e36b29f0f53c960");
            }
            super.arrowSpacing(i);
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public float getBorderWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27f1b05a7d79f301173702034556f358", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27f1b05a7d79f301173702034556f358")).floatValue() : super.getBorderWidth();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public int getBorderColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33f1d2231b4bb9b2e10c192ad7581bd5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33f1d2231b4bb9b2e10c192ad7581bd5")).intValue() : super.getBorderColor();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public BitmapDescriptor getArrowTexture() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c0f6f9221adc8c50b673446acd60f04", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c0f6f9221adc8c50b673446acd60f04") : super.getArrowTexture();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public int getArrowSpacing() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc6e95e4be914e86e763591c6578d56e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc6e95e4be914e86e763591c6578d56e")).intValue() : super.getArrowSpacing();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public int[] getBorderColors() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d06633f3527a450273455c6bc2f4575c", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d06633f3527a450273455c6bc2f4575c") : super.getBorderColors();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public int[] getColors() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a52d5703bc767dd7787ceffcf2fea8", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a52d5703bc767dd7787ceffcf2fea8") : super.getColors();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.MultiColorPattern
        @Deprecated
        public int[] getIndexes() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "689857e33e2195be673ed663b1639fa4", RobustBitConfig.DEFAULT_VALUE) ? (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "689857e33e2195be673ed663b1639fa4") : super.getIndexes();
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public static class DotLinePatten extends DotLinePattern {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Deprecated
        public DotLinePatten setSpacing(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d186bf64d2b3fb0d4cc297ef63a8823c", RobustBitConfig.DEFAULT_VALUE) ? (DotLinePatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d186bf64d2b3fb0d4cc297ef63a8823c") : spacing(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DotLinePattern
        @Deprecated
        public DotLinePatten spacing(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94bc49b9b4b3c095dd569d402aba2893", RobustBitConfig.DEFAULT_VALUE)) {
                return (DotLinePatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94bc49b9b4b3c095dd569d402aba2893");
            }
            super.spacing(i);
            return this;
        }

        @Deprecated
        public DotLinePatten setTexture(BitmapDescriptor bitmapDescriptor) {
            Object[] objArr = {bitmapDescriptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23671cf9a644928018567de18d79f7fd", RobustBitConfig.DEFAULT_VALUE) ? (DotLinePatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23671cf9a644928018567de18d79f7fd") : texture(bitmapDescriptor);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DotLinePattern
        @Deprecated
        public DotLinePatten texture(BitmapDescriptor bitmapDescriptor) {
            Object[] objArr = {bitmapDescriptor};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76a6637e783cdb9016c6d34c161240da", RobustBitConfig.DEFAULT_VALUE)) {
                return (DotLinePatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76a6637e783cdb9016c6d34c161240da");
            }
            super.texture(bitmapDescriptor);
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DotLinePattern
        @Deprecated
        public BitmapDescriptor getTexture() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c99b3c24049c60afc43d9bd793881e03", RobustBitConfig.DEFAULT_VALUE) ? (BitmapDescriptor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c99b3c24049c60afc43d9bd793881e03") : super.getTexture();
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DotLinePattern
        @Deprecated
        public int getSpacing() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4d89c0ded59c1d52d5088b50685cbde", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4d89c0ded59c1d52d5088b50685cbde")).intValue() : super.getSpacing();
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes4.dex */
    public static class DotColorLinePatten extends DotColorLinePattern {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Deprecated
        public DotColorLinePatten setColor(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfe27206e89caad643e805b1e25fb886", RobustBitConfig.DEFAULT_VALUE) ? (DotColorLinePatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfe27206e89caad643e805b1e25fb886") : color(i);
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DotColorLinePattern
        @Deprecated
        public DotColorLinePatten color(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce4e2ba12756cd3d6013c77c57b8ddb", RobustBitConfig.DEFAULT_VALUE)) {
                return (DotColorLinePatten) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce4e2ba12756cd3d6013c77c57b8ddb");
            }
            super.color(i);
            return this;
        }

        @Override // com.sankuai.meituan.mapsdk.maps.model.PolylineOptions.DotColorLinePattern
        @Deprecated
        public int getColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9fd2e79261aeee1f14f6b9a042a75c6b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9fd2e79261aeee1f14f6b9a042a75c6b")).intValue() : super.getColor();
        }
    }
}
