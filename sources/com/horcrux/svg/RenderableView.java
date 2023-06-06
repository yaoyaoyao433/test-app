package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.v4.view.ViewCompat;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.x;
import com.tencent.mapsdk.internal.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class RenderableView extends VirtualView {
    private static final int CAP_BUTT = 0;
    static final int CAP_ROUND = 1;
    private static final int CAP_SQUARE = 2;
    private static final int FILL_RULE_EVENODD = 0;
    static final int FILL_RULE_NONZERO = 1;
    private static final int JOIN_BEVEL = 2;
    private static final int JOIN_MITER = 0;
    static final int JOIN_ROUND = 1;
    private static final int VECTOR_EFFECT_DEFAULT = 0;
    private static final int VECTOR_EFFECT_NON_SCALING_STROKE = 1;
    static RenderableView contextElement;
    private static final Pattern regex = Pattern.compile("[0-9.-]+");
    @Nullable
    public ReadableArray fill;
    public float fillOpacity;
    public Path.FillType fillRule;
    @Nullable
    private ArrayList<String> mAttributeList;
    @Nullable
    private ArrayList<String> mLastMergedList;
    @Nullable
    private ArrayList<Object> mOriginProperties;
    @Nullable
    private ArrayList<String> mPropList;
    @Nullable
    public ReadableArray stroke;
    @Nullable
    public SVGLength[] strokeDasharray;
    public float strokeDashoffset;
    public Paint.Cap strokeLinecap;
    public Paint.Join strokeLinejoin;
    public float strokeMiterlimit;
    public float strokeOpacity;
    public SVGLength strokeWidth;
    public int vectorEffect;

    private static double saturate(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public RenderableView(ReactContext reactContext) {
        super(reactContext);
        this.vectorEffect = 0;
        this.strokeWidth = new SVGLength(1.0d);
        this.strokeOpacity = 1.0f;
        this.strokeMiterlimit = 4.0f;
        this.strokeDashoffset = 0.0f;
        this.strokeLinecap = Paint.Cap.BUTT;
        this.strokeLinejoin = Paint.Join.MITER;
        this.fillOpacity = 1.0f;
        this.fillRule = Path.FillType.WINDING;
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        RenderableViewManager.setRenderableView(i, this);
    }

    @ReactProp(name = "vectorEffect")
    public void setVectorEffect(int i) {
        this.vectorEffect = i;
        invalidate();
    }

    @ReactProp(name = "fill")
    public void setFill(@Nullable Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.fill = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            this.fill = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.fill = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.fill = javaOnlyArray;
        }
        invalidate();
    }

    @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f) {
        this.fillOpacity = f;
        invalidate();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i) {
        switch (i) {
            case 0:
                this.fillRule = Path.FillType.EVEN_ODD;
                break;
            case 1:
                break;
            default:
                throw new JSApplicationIllegalArgumentException("fillRule " + i + " unrecognized");
        }
        invalidate();
    }

    @ReactProp(name = "stroke")
    public void setStroke(@Nullable Dynamic dynamic) {
        if (dynamic == null || dynamic.isNull()) {
            this.stroke = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            this.stroke = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            this.stroke = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = regex.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.stroke = javaOnlyArray;
        }
        invalidate();
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f) {
        this.strokeOpacity = f;
        invalidate();
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.strokeDasharray = new SVGLength[size];
            for (int i = 0; i < size; i++) {
                this.strokeDasharray[i] = SVGLength.from(readableArray.getDynamic(i));
            }
        } else {
            this.strokeDasharray = null;
        }
        invalidate();
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f) {
        this.strokeDashoffset = f * this.mScale;
        invalidate();
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(Dynamic dynamic) {
        this.strokeWidth = SVGLength.from(dynamic);
        invalidate();
    }

    @ReactProp(defaultFloat = v.a.j, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f) {
        this.strokeMiterlimit = f;
        invalidate();
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i) {
        switch (i) {
            case 0:
                this.strokeLinecap = Paint.Cap.BUTT;
                break;
            case 1:
                this.strokeLinecap = Paint.Cap.ROUND;
                break;
            case 2:
                this.strokeLinecap = Paint.Cap.SQUARE;
                break;
            default:
                throw new JSApplicationIllegalArgumentException("strokeLinecap " + i + " unrecognized");
        }
        invalidate();
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i) {
        switch (i) {
            case 0:
                this.strokeLinejoin = Paint.Join.MITER;
                break;
            case 1:
                this.strokeLinejoin = Paint.Join.ROUND;
                break;
            case 2:
                this.strokeLinejoin = Paint.Join.BEVEL;
                break;
            default:
                throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i + " unrecognized");
        }
        invalidate();
    }

    @ReactProp(name = "propList")
    public void setPropList(@Nullable ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.mAttributeList = arrayList;
            this.mPropList = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.mPropList.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void render(Canvas canvas, Paint paint, float f) {
        MaskView maskView = this.mMask != null ? (MaskView) getSvgView().getDefinedMask(this.mMask) : null;
        if (maskView != null) {
            Rect clipBounds = canvas.getClipBounds();
            int height = clipBounds.height();
            int width = clipBounds.width();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Canvas canvas3 = new Canvas(createBitmap);
            Canvas canvas4 = new Canvas(createBitmap3);
            canvas3.clipRect((float) relativeOnWidth(maskView.mX), (float) relativeOnHeight(maskView.mY), (float) relativeOnWidth(maskView.mW), (float) relativeOnHeight(maskView.mH));
            Paint paint2 = new Paint(1);
            maskView.draw(canvas3, paint2, 1.0f);
            int i = width * height;
            int[] iArr = new int[i];
            createBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i2 = 0;
            while (i2 < i) {
                int i3 = iArr[i2];
                iArr[i2] = ((int) ((i3 >>> 24) * saturate((((((i3 >> 16) & 255) * 0.299d) + (((i3 >> 8) & 255) * 0.587d)) + ((i3 & 255) * 0.144d)) / 255.0d))) << 24;
                i2++;
                paint2 = paint2;
                i = i;
            }
            Paint paint3 = paint2;
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            draw(canvas2, paint, f);
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas4.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            canvas4.drawBitmap(createBitmap, 0.0f, 0.0f, paint3);
            canvas.drawBitmap(createBitmap3, 0.0f, 0.0f, paint);
            return;
        }
        draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.mOpacity;
        boolean z = this.mPath == null;
        if (z) {
            this.mPath = getPath(canvas, paint);
            this.mPath.setFillType(this.fillRule);
        }
        boolean z2 = this.vectorEffect == 1;
        Path path = this.mPath;
        if (z2) {
            path = new Path();
            this.mPath.transform(this.mCTM, path);
            canvas.setMatrix(null);
        }
        if (z || path != this.mPath) {
            this.mBox = new RectF();
            path.computeBounds(this.mBox, true);
        }
        RectF rectF = new RectF(this.mBox);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
        clip(canvas, paint);
        if (setupFillPaint(paint, this.fillOpacity * f2)) {
            if (z) {
                this.mFillPath = new Path();
                paint.getFillPath(path, this.mFillPath);
            }
            canvas.drawPath(path, paint);
        }
        if (setupStrokePaint(paint, this.strokeOpacity * f2)) {
            if (z) {
                this.mStrokePath = new Path();
                paint.getFillPath(path, this.mStrokePath);
            }
            canvas.drawPath(path, paint);
        }
        renderMarkers(canvas, paint, f2);
    }

    void renderMarkers(Canvas canvas, Paint paint, float f) {
        MarkerView markerView;
        MarkerView markerView2 = (MarkerView) getSvgView().getDefinedMarker(this.mMarkerStart);
        MarkerView markerView3 = (MarkerView) getSvgView().getDefinedMarker(this.mMarkerMid);
        MarkerView markerView4 = (MarkerView) getSvgView().getDefinedMarker(this.mMarkerEnd);
        if (this.elements != null) {
            if (markerView2 == null && markerView3 == null && markerView4 == null) {
                return;
            }
            contextElement = this;
            ArrayList<RNSVGMarkerPosition> fromPath = RNSVGMarkerPosition.fromPath(this.elements);
            float relativeOnOther = (float) (this.strokeWidth != null ? relativeOnOther(this.strokeWidth) : 1.0d);
            this.mMarkerPath = new Path();
            Iterator<RNSVGMarkerPosition> it = fromPath.iterator();
            while (it.hasNext()) {
                RNSVGMarkerPosition next = it.next();
                switch (next.type) {
                    case kStartMarker:
                        markerView = markerView2;
                        break;
                    case kMidMarker:
                        markerView = markerView3;
                        break;
                    case kEndMarker:
                        markerView = markerView4;
                        break;
                    default:
                        markerView = null;
                        break;
                }
                if (markerView != null) {
                    markerView.renderMarker(canvas, paint, f, next, relativeOnOther);
                    this.mMarkerPath.addPath(markerView.getPath(canvas, paint), markerView.markerTransform);
                }
            }
            contextElement = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setupFillPaint(Paint paint, float f) {
        if (this.fill == null || this.fill.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        setupPaint(paint, f, this.fill);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setupStrokePaint(Paint paint, float f) {
        paint.reset();
        double relativeOnOther = relativeOnOther(this.strokeWidth);
        if (relativeOnOther == 0.0d || this.stroke == null || this.stroke.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.strokeLinecap);
        paint.setStrokeJoin(this.strokeLinejoin);
        paint.setStrokeMiter(this.strokeMiterlimit * this.mScale);
        paint.setStrokeWidth((float) relativeOnOther);
        setupPaint(paint, f, this.stroke);
        if (this.strokeDasharray != null) {
            int length = this.strokeDasharray.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) relativeOnOther(this.strokeDasharray[i]);
            }
            paint.setPathEffect(new DashPathEffect(fArr, this.strokeDashoffset));
            return true;
        }
        return true;
    }

    private void setupPaint(Paint paint, float f, ReadableArray readableArray) {
        while (true) {
            switch (readableArray.getInt(0)) {
                case 0:
                    if (readableArray.size() == 2) {
                        int i = readableArray.getInt(1);
                        paint.setColor((Math.round((i >>> 24) * f) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK));
                        return;
                    }
                    paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * f * 255.0d : f * 255.0f), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
                    return;
                case 1:
                    Brush definedBrush = getSvgView().getDefinedBrush(readableArray.getString(1));
                    if (definedBrush != null) {
                        definedBrush.setupPaint(paint, this.mBox, this.mScale, f);
                        return;
                    }
                    return;
                case 2:
                    paint.setColor(getSvgView().mTintColor);
                    return;
                case 3:
                    if (contextElement == null || contextElement.fill == null) {
                        return;
                    }
                    setupPaint(paint, f, contextElement.fill);
                    return;
                case 4:
                    if (contextElement == null || contextElement.stroke == null) {
                        return;
                    }
                    readableArray = contextElement.stroke;
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (this.mPath == null || !this.mInvertible || !this.mTransformInvertible || this.mPointerEvents == x.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        initBounds();
        if ((this.mRegion == null || !this.mRegion.contains(round, round2)) && (this.mStrokeRegion == null || (!this.mStrokeRegion.contains(round, round2) && (this.mMarkerRegion == null || !this.mMarkerRegion.contains(round, round2))))) {
            return -1;
        }
        if (getClipPath() == null || this.mClipRegion.contains(round, round2)) {
            return getId();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initBounds() {
        if (this.mRegion == null && this.mFillPath != null) {
            this.mFillBounds = new RectF();
            this.mFillPath.computeBounds(this.mFillBounds, true);
            this.mRegion = getRegion(this.mFillPath, this.mFillBounds);
        }
        if (this.mRegion == null && this.mPath != null) {
            this.mFillBounds = new RectF();
            this.mPath.computeBounds(this.mFillBounds, true);
            this.mRegion = getRegion(this.mPath, this.mFillBounds);
        }
        if (this.mStrokeRegion == null && this.mStrokePath != null) {
            this.mStrokeBounds = new RectF();
            this.mStrokePath.computeBounds(this.mStrokeBounds, true);
            this.mStrokeRegion = getRegion(this.mStrokePath, this.mStrokeBounds);
        }
        if (this.mMarkerRegion == null && this.mMarkerPath != null) {
            this.mMarkerBounds = new RectF();
            this.mMarkerPath.computeBounds(this.mMarkerBounds, true);
            this.mMarkerRegion = getRegion(this.mMarkerPath, this.mMarkerBounds);
        }
        Path clipPath = getClipPath();
        if (clipPath == null || this.mClipRegionPath == clipPath) {
            return;
        }
        this.mClipRegionPath = clipPath;
        this.mClipBounds = new RectF();
        clipPath.computeBounds(this.mClipBounds, true);
        this.mClipRegion = getRegion(clipPath, this.mClipBounds);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Region getRegion(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
        return region;
    }

    private ArrayList<String> getAttributeList() {
        return this.mAttributeList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void mergeProperties(RenderableView renderableView) {
        ArrayList<String> attributeList = renderableView.getAttributeList();
        if (attributeList == null || attributeList.size() == 0) {
            return;
        }
        this.mOriginProperties = new ArrayList<>();
        this.mAttributeList = this.mPropList == null ? new ArrayList<>() : new ArrayList<>(this.mPropList);
        int size = attributeList.size();
        for (int i = 0; i < size; i++) {
            try {
                String str = attributeList.get(i);
                Field field = getClass().getField(str);
                Object obj = field.get(renderableView);
                this.mOriginProperties.add(field.get(this));
                if (!hasOwnProperty(str)) {
                    this.mAttributeList.add(str);
                    field.set(this, obj);
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        this.mLastMergedList = attributeList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetProperties() {
        if (this.mLastMergedList == null || this.mOriginProperties == null) {
            return;
        }
        try {
            for (int size = this.mLastMergedList.size() - 1; size >= 0; size--) {
                getClass().getField(this.mLastMergedList.get(size)).set(this, this.mOriginProperties.get(size));
            }
            this.mLastMergedList = null;
            this.mOriginProperties = null;
            this.mAttributeList = this.mPropList;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    private boolean hasOwnProperty(String str) {
        return this.mAttributeList != null && this.mAttributeList.contains(str);
    }
}
