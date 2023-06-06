package android.support.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    boolean c;
    private f d;
    private PorterDuffColorFilter e;
    private ColorFilter f;
    private boolean g;
    private Drawable.ConstantState h;
    private final float[] i;
    private final Matrix j;
    private final Rect k;

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    VectorDrawableCompat() {
        this.c = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.d = new f();
    }

    VectorDrawableCompat(@NonNull f fVar) {
        this.c = true;
        this.i = new float[9];
        this.j = new Matrix();
        this.k = new Rect();
        this.d = fVar;
        this.e = a(this.e, fVar.c, fVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.d = new f(this.d);
            this.g = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(String str) {
        return this.d.b.h.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.b != null && Build.VERSION.SDK_INT >= 24) {
            return new g(this.b.getConstantState());
        }
        this.d.a = getChangingConfigurations();
        return this.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e2, code lost:
        if ((r1 == r6.f.getWidth() && r3 == r6.f.getHeight()) == false) goto L68;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.VectorDrawableCompat.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.b != null) {
            return DrawableCompat.getAlpha(this.b);
        }
        return this.d.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.d.b.getRootAlpha() != i) {
            this.d.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f = colorFilter;
        invalidateSelf();
    }

    private PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.b != null) {
            DrawableCompat.setTint(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            DrawableCompat.setTintList(this.b, colorStateList);
            return;
        }
        f fVar = this.d;
        if (fVar.c != colorStateList) {
            fVar.c = colorStateList;
            this.e = a(this.e, colorStateList, fVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.b != null) {
            DrawableCompat.setTintMode(this.b, mode);
            return;
        }
        f fVar = this.d;
        if (fVar.d != mode) {
            fVar.d = mode;
            this.e = a(this.e, fVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        return (this.d == null || this.d.c == null || !this.d.c.isStateful()) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        f fVar = this.d;
        if (fVar.c == null || fVar.d == null) {
            return false;
        }
        this.e = a(this.e, fVar.c, fVar.d);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return (int) this.d.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return (int) this.d.b.c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.b != null) {
            DrawableCompat.canApplyTheme(this.b);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.b != null) {
            return DrawableCompat.isAutoMirrored(this.b);
        }
        return this.d.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            DrawableCompat.setAutoMirrored(this.b, z);
        } else {
            this.d.e = z;
        }
    }

    @Nullable
    public static VectorDrawableCompat a(@NonNull Resources resources, @DrawableRes int i, @Nullable Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.b = ResourcesCompat.getDrawable(resources, i, theme);
            vectorDrawableCompat.h = new g(vectorDrawableCompat.b.getConstantState());
            return vectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return a(resources, xml, asAttributeSet, theme);
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    public static VectorDrawableCompat a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    static int a(int i, float f2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (((int) (Color.alpha(i) * f2)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.b != null) {
            DrawableCompat.inflate(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f fVar = this.d;
        fVar.b = new e();
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.a);
        f fVar2 = this.d;
        e eVar = fVar2.b;
        int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (namedInt == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (namedInt == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (namedInt == 9) {
            mode = PorterDuff.Mode.SRC_ATOP;
        } else {
            switch (namedInt) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    if (Build.VERSION.SDK_INT >= 11) {
                        mode = PorterDuff.Mode.ADD;
                        break;
                    }
                    break;
            }
        }
        fVar2.d = mode;
        ColorStateList colorStateList = obtainAttributes.getColorStateList(1);
        if (colorStateList != null) {
            fVar2.c = colorStateList;
        }
        fVar2.e = TypedArrayUtils.getNamedBoolean(obtainAttributes, xmlPullParser, "autoMirrored", 5, fVar2.e);
        eVar.d = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "viewportWidth", 7, eVar.d);
        eVar.e = TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "viewportHeight", 8, eVar.e);
        if (eVar.d <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (eVar.e <= 0.0f) {
            throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            eVar.b = obtainAttributes.getDimension(3, eVar.b);
            eVar.c = obtainAttributes.getDimension(2, eVar.c);
            if (eVar.b <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (eVar.c <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                eVar.setAlpha(TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "alpha", 4, eVar.getAlpha()));
                String string = obtainAttributes.getString(0);
                if (string != null) {
                    eVar.g = string;
                    eVar.h.put(string, eVar);
                }
                obtainAttributes.recycle();
                fVar.a = getChangingConfigurations();
                fVar.k = true;
                b(resources, xmlPullParser, attributeSet, theme);
                this.e = a(this.e, fVar.c, fVar.d);
            }
        }
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar = this.d;
        e eVar = fVar.b;
        Stack stack = new Stack();
        stack.push(eVar.a);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                c cVar = (c) stack.peek();
                if ("path".equals(name)) {
                    b bVar = new b();
                    TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.c);
                    bVar.a(obtainAttributes, xmlPullParser);
                    obtainAttributes.recycle();
                    cVar.b.add(bVar);
                    if (bVar.getPathName() != null) {
                        eVar.h.put(bVar.getPathName(), bVar);
                    }
                    fVar.a = bVar.o | fVar.a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    a aVar = new a();
                    if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.d);
                        aVar.a(obtainAttributes2);
                        obtainAttributes2.recycle();
                    }
                    cVar.b.add(aVar);
                    if (aVar.getPathName() != null) {
                        eVar.h.put(aVar.getPathName(), aVar);
                    }
                    fVar.a = aVar.o | fVar.a;
                } else if ("group".equals(name)) {
                    c cVar2 = new c();
                    TypedArray obtainAttributes3 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.b);
                    cVar2.l = null;
                    cVar2.c = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, RecceAnimUtils.ROTATION, 5, cVar2.c);
                    cVar2.d = obtainAttributes3.getFloat(1, cVar2.d);
                    cVar2.e = obtainAttributes3.getFloat(2, cVar2.e);
                    cVar2.f = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, RecceAnimUtils.SCALE_X, 3, cVar2.f);
                    cVar2.g = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, RecceAnimUtils.SCALE_Y, 4, cVar2.g);
                    cVar2.h = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, "translateX", 6, cVar2.h);
                    cVar2.i = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, "translateY", 7, cVar2.i);
                    String string = obtainAttributes3.getString(0);
                    if (string != null) {
                        cVar2.m = string;
                    }
                    cVar2.a();
                    obtainAttributes3.recycle();
                    cVar.b.add(cVar2);
                    stack.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        eVar.h.put(cVar2.getGroupName(), cVar2);
                    }
                    fVar.a = cVar2.k | fVar.a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                stack.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + ((Object) stringBuffer) + " defined");
        }
    }

    @Override // android.support.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: ProGuard */
    @RequiresApi(24)
    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public g(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.b = (VectorDrawable) this.a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.b = (VectorDrawable) this.a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.b = (VectorDrawable) this.a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class f extends Drawable.ConstantState {
        int a;
        e b;
        ColorStateList c;
        PorterDuff.Mode d;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public f(f fVar) {
            this.c = null;
            this.d = VectorDrawableCompat.a;
            if (fVar != null) {
                this.a = fVar.a;
                this.b = new e(fVar.b);
                if (fVar.b.n != null) {
                    this.b.n = new Paint(fVar.b.n);
                }
                if (fVar.b.m != null) {
                    this.b.m = new Paint(fVar.b.m);
                }
                this.c = fVar.c;
                this.d = fVar.d;
                this.e = fVar.e;
            }
        }

        public final void a(int i, int i2) {
            this.f.eraseColor(0);
            this.b.a(new Canvas(this.f), i, i2, null);
        }

        public f() {
            this.c = null;
            this.d = VectorDrawableCompat.a;
            this.b = new e();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e {
        private static final Matrix k = new Matrix();
        final c a;
        float b;
        float c;
        float d;
        float e;
        int f;
        String g;
        final ArrayMap<String, Object> h;
        private final Path i;
        private final Path j;
        private final Matrix l;
        private Paint m;
        private Paint n;
        private PathMeasure o;
        private int p;

        public e() {
            this.l = new Matrix();
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 255;
            this.g = null;
            this.h = new ArrayMap<>();
            this.a = new c();
            this.i = new Path();
            this.j = new Path();
        }

        public final void setRootAlpha(int i) {
            this.f = i;
        }

        public final int getRootAlpha() {
            return this.f;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public final float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public e(e eVar) {
            this.l = new Matrix();
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 255;
            this.g = null;
            this.h = new ArrayMap<>();
            this.a = new c(eVar.a, this.h);
            this.i = new Path(eVar.i);
            this.j = new Path(eVar.j);
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.p = eVar.p;
            this.f = eVar.f;
            this.g = eVar.g;
            if (eVar.g != null) {
                this.h.put(eVar.g, this);
            }
        }

        public final void a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            a(this.a, k, canvas, i, i2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v4 */
        private void a(c cVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            e eVar;
            float f;
            e eVar2 = this;
            cVar.a.set(matrix);
            cVar.a.preConcat(cVar.j);
            canvas.save();
            ?? r11 = 0;
            int i3 = 0;
            while (i3 < cVar.b.size()) {
                Object obj = cVar.b.get(i3);
                if (obj instanceof c) {
                    a((c) obj, cVar.a, canvas, i, i2, colorFilter);
                } else if (obj instanceof d) {
                    d dVar = (d) obj;
                    float f2 = i / eVar2.d;
                    float f3 = i2 / eVar2.e;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = cVar.a;
                    eVar2.l.set(matrix2);
                    eVar2.l.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[r11], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                    if (abs != 0.0f) {
                        eVar = this;
                        dVar.a(eVar.i);
                        Path path = eVar.i;
                        eVar.j.reset();
                        if (dVar.a()) {
                            eVar.j.addPath(path, eVar.l);
                            canvas.clipPath(eVar.j);
                        } else {
                            b bVar = (b) dVar;
                            if (bVar.g != 0.0f || bVar.h != 1.0f) {
                                float f5 = (bVar.g + bVar.i) % 1.0f;
                                float f6 = (bVar.h + bVar.i) % 1.0f;
                                if (eVar.o == null) {
                                    eVar.o = new PathMeasure();
                                }
                                eVar.o.setPath(eVar.i, r11);
                                float length = eVar.o.getLength();
                                float f7 = f5 * length;
                                float f8 = f6 * length;
                                path.reset();
                                if (f7 > f8) {
                                    eVar.o.getSegment(f7, length, path, true);
                                    f = 0.0f;
                                    eVar.o.getSegment(0.0f, f8, path, true);
                                } else {
                                    f = 0.0f;
                                    eVar.o.getSegment(f7, f8, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            eVar.j.addPath(path, eVar.l);
                            if (bVar.c != 0) {
                                if (eVar.n == null) {
                                    eVar.n = new Paint();
                                    eVar.n.setStyle(Paint.Style.FILL);
                                    eVar.n.setAntiAlias(true);
                                }
                                Paint paint = eVar.n;
                                paint.setColor(VectorDrawableCompat.a(bVar.c, bVar.f));
                                paint.setColorFilter(colorFilter);
                                eVar.j.setFillType(bVar.e == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(eVar.j, paint);
                            }
                            if (bVar.a != 0) {
                                if (eVar.m == null) {
                                    eVar.m = new Paint();
                                    eVar.m.setStyle(Paint.Style.STROKE);
                                    eVar.m.setAntiAlias(true);
                                }
                                Paint paint2 = eVar.m;
                                if (bVar.k != null) {
                                    paint2.setStrokeJoin(bVar.k);
                                }
                                if (bVar.j != null) {
                                    paint2.setStrokeCap(bVar.j);
                                }
                                paint2.setStrokeMiter(bVar.l);
                                paint2.setColor(VectorDrawableCompat.a(bVar.a, bVar.d));
                                paint2.setColorFilter(colorFilter);
                                paint2.setStrokeWidth(bVar.b * abs * min);
                                canvas.drawPath(eVar.j, paint2);
                            }
                        }
                    } else {
                        eVar = this;
                    }
                    i3++;
                    eVar2 = eVar;
                    r11 = 0;
                }
                eVar = eVar2;
                i3++;
                eVar2 = eVar;
                r11 = 0;
            }
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class c {
        final Matrix a;
        final ArrayList<Object> b;
        float c;
        float d;
        float e;
        float f;
        float g;
        float h;
        float i;
        final Matrix j;
        int k;
        int[] l;
        String m;

        public c(c cVar, ArrayMap<String, Object> arrayMap) {
            d aVar;
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.c = cVar.c;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.h = cVar.h;
            this.i = cVar.i;
            this.l = cVar.l;
            this.m = cVar.m;
            this.k = cVar.k;
            if (this.m != null) {
                arrayMap.put(this.m, this);
            }
            this.j.set(cVar.j);
            ArrayList<Object> arrayList = cVar.b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof c) {
                    this.b.add(new c((c) obj, arrayMap));
                } else {
                    if (obj instanceof b) {
                        aVar = new b((b) obj);
                    } else if (obj instanceof a) {
                        aVar = new a((a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.b.add(aVar);
                    if (aVar.n != null) {
                        arrayMap.put(aVar.n, aVar);
                    }
                }
            }
        }

        public c() {
            this.a = new Matrix();
            this.b = new ArrayList<>();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }

        public final String getGroupName() {
            return this.m;
        }

        public final Matrix getLocalMatrix() {
            return this.j;
        }

        void a() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final float getRotation() {
            return this.c;
        }

        public final void setRotation(float f) {
            if (f != this.c) {
                this.c = f;
                a();
            }
        }

        public final float getPivotX() {
            return this.d;
        }

        public final void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                a();
            }
        }

        public final float getPivotY() {
            return this.e;
        }

        public final void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                a();
            }
        }

        public final float getScaleX() {
            return this.f;
        }

        public final void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                a();
            }
        }

        public final float getScaleY() {
            return this.g;
        }

        public final void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                a();
            }
        }

        public final float getTranslateX() {
            return this.h;
        }

        public final void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                a();
            }
        }

        public final float getTranslateY() {
            return this.i;
        }

        public final void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class d {
        protected PathParser.PathDataNode[] m;
        String n;
        int o;

        public boolean a() {
            return false;
        }

        public d() {
            this.m = null;
        }

        public d(d dVar) {
            this.m = null;
            this.n = dVar.n;
            this.o = dVar.o;
            this.m = PathParser.deepCopyNodes(dVar.m);
        }

        public final void a(Path path) {
            path.reset();
            if (this.m != null) {
                PathParser.PathDataNode.nodesToPath(this.m, path);
            }
        }

        public String getPathName() {
            return this.n;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.m;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.canMorph(this.m, pathDataNodeArr)) {
                this.m = PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                PathParser.updateNodes(this.m, pathDataNodeArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends d {
        @Override // android.support.graphics.drawable.VectorDrawableCompat.d
        public final boolean a() {
            return true;
        }

        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }

        void a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.m = PathParser.createNodesFromPathData(string2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b extends d {
        int a;
        float b;
        int c;
        float d;
        int e;
        float f;
        float g;
        float h;
        float i;
        Paint.Cap j;
        Paint.Join k;
        float l;
        private int[] p;

        public b() {
            this.a = 0;
            this.b = 0.0f;
            this.c = 0;
            this.d = 1.0f;
            this.e = 0;
            this.f = 1.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.a = 0;
            this.b = 0.0f;
            this.c = 0;
            this.d = 1.0f;
            this.e = 0;
            this.f = 1.0f;
            this.g = 0.0f;
            this.h = 1.0f;
            this.i = 0.0f;
            this.j = Paint.Cap.BUTT;
            this.k = Paint.Join.MITER;
            this.l = 4.0f;
            this.p = bVar.p;
            this.a = bVar.a;
            this.b = bVar.b;
            this.d = bVar.d;
            this.c = bVar.c;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
        }

        private static Paint.Cap a(int i, Paint.Cap cap) {
            switch (i) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        private static Paint.Join a(int i, Paint.Join join) {
            switch (i) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.p = null;
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.m = PathParser.createNodesFromPathData(string2);
                }
                this.c = TypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "fillColor", 1, this.c);
                this.f = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.f);
                this.j = a(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.j);
                this.k = a(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.k);
                this.l = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.l);
                this.a = TypedArrayUtils.getNamedColor(typedArray, xmlPullParser, "strokeColor", 3, this.a);
                this.d = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.d);
                this.b = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.b);
                this.h = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.h);
                this.i = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.i);
                this.g = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.g);
                this.e = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.e);
            }
        }

        final int getStrokeColor() {
            return this.a;
        }

        final void setStrokeColor(int i) {
            this.a = i;
        }

        final float getStrokeWidth() {
            return this.b;
        }

        final void setStrokeWidth(float f) {
            this.b = f;
        }

        final float getStrokeAlpha() {
            return this.d;
        }

        final void setStrokeAlpha(float f) {
            this.d = f;
        }

        final int getFillColor() {
            return this.c;
        }

        final void setFillColor(int i) {
            this.c = i;
        }

        final float getFillAlpha() {
            return this.f;
        }

        final void setFillAlpha(float f) {
            this.f = f;
        }

        final float getTrimPathStart() {
            return this.g;
        }

        final void setTrimPathStart(float f) {
            this.g = f;
        }

        final float getTrimPathEnd() {
            return this.h;
        }

        final void setTrimPathEnd(float f) {
            this.h = f;
        }

        final float getTrimPathOffset() {
            return this.i;
        }

        final void setTrimPathOffset(float f) {
            this.i = f;
        }
    }
}
