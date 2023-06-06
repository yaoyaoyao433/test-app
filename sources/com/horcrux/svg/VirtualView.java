package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.common.logging.a;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.v;
import com.facebook.react.uimanager.x;
import com.facebook.react.views.view.f;
import com.horcrux.svg.SVGLength;
import java.util.ArrayList;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public abstract class VirtualView extends f {
    private static final int CLIP_RULE_EVENODD = 0;
    static final int CLIP_RULE_NONZERO = 1;
    private static final double M_SQRT1_2l = 0.7071067811865476d;
    private static final float[] sRawMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private double canvasDiagonal;
    private float canvasHeight;
    private float canvasWidth;
    ArrayList<PathElement> elements;
    private double fontSize;
    private GlyphContext glyphContext;
    RectF mBox;
    Matrix mCTM;
    boolean mCTMInvertible;
    private Path mCachedClipPath;
    private RectF mClientRect;
    RectF mClipBounds;
    @Nullable
    private String mClipPath;
    Region mClipRegion;
    Path mClipRegionPath;
    int mClipRule;
    final ReactContext mContext;
    String mDisplay;
    RectF mFillBounds;
    Path mFillPath;
    Matrix mInvCTM;
    Matrix mInvMatrix;
    final Matrix mInvTransform;
    boolean mInvertible;
    RectF mMarkerBounds;
    @Nullable
    String mMarkerEnd;
    @Nullable
    String mMarkerMid;
    Path mMarkerPath;
    Region mMarkerRegion;
    @Nullable
    String mMarkerStart;
    @Nullable
    String mMask;
    Matrix mMatrix;
    String mName;
    private boolean mOnLayout;
    float mOpacity;
    Path mPath;
    x mPointerEvents;
    Region mRegion;
    private boolean mResponsible;
    final float mScale;
    RectF mStrokeBounds;
    Path mStrokePath;
    Region mStrokeRegion;
    private GroupView mTextRoot;
    Matrix mTransform;
    boolean mTransformInvertible;
    private SvgView svgView;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void draw(Canvas canvas, Paint paint, float f);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Path getPath(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int hitTest(float[] fArr);

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView(ReactContext reactContext) {
        super(reactContext);
        this.mOpacity = 1.0f;
        this.mCTM = new Matrix();
        this.mMatrix = new Matrix();
        this.mTransform = new Matrix();
        this.mInvCTM = new Matrix();
        this.mInvMatrix = new Matrix();
        this.mInvTransform = new Matrix();
        this.mInvertible = true;
        this.mCTMInvertible = true;
        this.mTransformInvertible = true;
        this.fontSize = -1.0d;
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.mContext = reactContext;
        this.mScale = d.b().density;
    }

    @Override // com.facebook.react.views.view.f
    public void setPointerEvents(x xVar) {
        this.mPointerEvents = xVar;
    }

    @Override // android.view.View
    public void invalidate() {
        if ((this instanceof RenderableView) && this.mPath == null) {
            return;
        }
        clearCache();
        clearParentCache();
        super.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearCache() {
        this.canvasDiagonal = -1.0d;
        this.canvasHeight = -1.0f;
        this.canvasWidth = -1.0f;
        this.fontSize = -1.0d;
        this.mStrokeRegion = null;
        this.mMarkerRegion = null;
        this.mRegion = null;
        this.mPath = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearChildCache() {
        clearCache();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).clearChildCache();
            }
        }
    }

    private void clearParentCache() {
        VirtualView virtualView = this;
        while (true) {
            ViewParent parent = virtualView.getParent();
            if (!(parent instanceof VirtualView)) {
                return;
            }
            virtualView = (VirtualView) parent;
            if (virtualView.mPath == null) {
                return;
            }
            virtualView.clearCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public GroupView getTextRoot() {
        if (this.mTextRoot == null) {
            VirtualView virtualView = this;
            while (true) {
                if (virtualView == null) {
                    break;
                }
                if (virtualView instanceof GroupView) {
                    GroupView groupView = (GroupView) virtualView;
                    if (groupView.getGlyphContext() != null) {
                        this.mTextRoot = groupView;
                        break;
                    }
                }
                ViewParent parent = virtualView.getParent();
                virtualView = !(parent instanceof VirtualView) ? null : (VirtualView) parent;
            }
        }
        return this.mTextRoot;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public GroupView getParentTextRoot() {
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            return ((VirtualView) parent).getTextRoot();
        }
        return null;
    }

    private double getFontSizeFromContext() {
        if (this.fontSize != -1.0d) {
            return this.fontSize;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            return 12.0d;
        }
        if (this.glyphContext == null) {
            this.glyphContext = textRoot.getGlyphContext();
        }
        this.fontSize = this.glyphContext.getFontSize();
        return this.fontSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void render(Canvas canvas, Paint paint, float f) {
        draw(canvas, paint, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int saveAndSetupCanvas(Canvas canvas, Matrix matrix) {
        int save = canvas.save();
        this.mCTM.setConcat(this.mMatrix, this.mTransform);
        canvas.concat(this.mCTM);
        this.mCTM.preConcat(matrix);
        this.mCTMInvertible = this.mCTM.invert(this.mInvCTM);
        return save;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void restoreCanvas(Canvas canvas, int i) {
        canvas.restoreToCount(i);
    }

    @ReactProp(name = "name")
    public void setName(String str) {
        this.mName = str;
        invalidate();
    }

    @ReactProp(name = "display")
    public void setDisplay(String str) {
        this.mDisplay = str;
        invalidate();
    }

    @ReactProp(name = "onLayout")
    public void setOnLayout(boolean z) {
        this.mOnLayout = z;
        invalidate();
    }

    @ReactProp(name = "mask")
    public void setMask(String str) {
        this.mMask = str;
        invalidate();
    }

    @ReactProp(name = "markerStart")
    public void setMarkerStart(String str) {
        this.mMarkerStart = str;
        invalidate();
    }

    @ReactProp(name = "markerMid")
    public void setMarkerMid(String str) {
        this.mMarkerMid = str;
        invalidate();
    }

    @ReactProp(name = "markerEnd")
    public void setMarkerEnd(String str) {
        this.mMarkerEnd = str;
        invalidate();
    }

    @ReactProp(name = "clipPath")
    public void setClipPath(String str) {
        this.mCachedClipPath = null;
        this.mClipPath = str;
        invalidate();
    }

    @ReactProp(defaultInt = 1, name = "clipRule")
    public void setClipRule(int i) {
        this.mClipRule = i;
        invalidate();
    }

    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(float f) {
        this.mOpacity = f;
        invalidate();
    }

    @ReactProp(name = "matrix")
    public void setMatrix(Dynamic dynamic) {
        ReadableType type = dynamic.getType();
        if (!dynamic.isNull() && type.equals(ReadableType.Array)) {
            int matrixData = PropHelper.toMatrixData(dynamic.asArray(), sRawMatrix, this.mScale);
            if (matrixData == 6) {
                if (this.mMatrix == null) {
                    this.mMatrix = new Matrix();
                    this.mInvMatrix = new Matrix();
                }
                this.mMatrix.setValues(sRawMatrix);
                this.mInvertible = this.mMatrix.invert(this.mInvMatrix);
            } else if (matrixData != -1) {
                a.c("ReactNative", "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.mMatrix.reset();
            this.mInvMatrix.reset();
            this.mInvertible = true;
        }
        super.invalidate();
        clearParentCache();
    }

    @ReactProp(name = "responsible")
    public void setResponsible(boolean z) {
        this.mResponsible = z;
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Path getClipPath() {
        return this.mCachedClipPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Path getClipPath(Canvas canvas, Paint paint) {
        if (this.mClipPath != null) {
            ClipPathView clipPathView = (ClipPathView) getSvgView().getDefinedClipPath(this.mClipPath);
            if (clipPathView != null) {
                Path path = clipPathView.mClipRule == 0 ? clipPathView.getPath(canvas, paint) : clipPathView.getPath(canvas, paint, Region.Op.UNION);
                path.transform(clipPathView.mMatrix);
                path.transform(clipPathView.mTransform);
                switch (clipPathView.mClipRule) {
                    case 0:
                        path.setFillType(Path.FillType.EVEN_ODD);
                        break;
                    case 1:
                        break;
                    default:
                        a.c("ReactNative", "RNSVG: clipRule: " + this.mClipRule + " unrecognized");
                        break;
                }
                this.mCachedClipPath = path;
            } else {
                a.c("ReactNative", "RNSVG: Undefined clipPath: " + this.mClipPath);
            }
        }
        return getClipPath();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clip(Canvas canvas, Paint paint) {
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgView getSvgView() {
        if (this.svgView != null) {
            return this.svgView;
        }
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof SvgView) {
            this.svgView = (SvgView) parent;
        } else if (parent instanceof VirtualView) {
            this.svgView = ((VirtualView) parent).getSvgView();
        } else {
            a.d("ReactNative", "RNSVG: " + getClass().getName() + " should be descendant of a SvgView.");
        }
        return this.svgView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnWidth(SVGLength sVGLength) {
        SVGLength.UnitType unitType = sVGLength.unit;
        if (unitType == SVGLength.UnitType.NUMBER) {
            return sVGLength.value * this.mScale;
        }
        if (unitType == SVGLength.UnitType.PERCENTAGE) {
            return (sVGLength.value / 100.0d) * getCanvasWidth();
        }
        return fromRelativeFast(sVGLength);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnHeight(SVGLength sVGLength) {
        SVGLength.UnitType unitType = sVGLength.unit;
        if (unitType == SVGLength.UnitType.NUMBER) {
            return sVGLength.value * this.mScale;
        }
        if (unitType == SVGLength.UnitType.PERCENTAGE) {
            return (sVGLength.value / 100.0d) * getCanvasHeight();
        }
        return fromRelativeFast(sVGLength);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double relativeOnOther(SVGLength sVGLength) {
        SVGLength.UnitType unitType = sVGLength.unit;
        if (unitType == SVGLength.UnitType.NUMBER) {
            return sVGLength.value * this.mScale;
        }
        if (unitType == SVGLength.UnitType.PERCENTAGE) {
            return (sVGLength.value / 100.0d) * getCanvasDiagonal();
        }
        return fromRelativeFast(sVGLength);
    }

    private double fromRelativeFast(SVGLength sVGLength) {
        double fontSizeFromContext;
        switch (sVGLength.unit) {
            case EMS:
                fontSizeFromContext = getFontSizeFromContext();
                break;
            case EXS:
                fontSizeFromContext = getFontSizeFromContext() / 2.0d;
                break;
            case CM:
                fontSizeFromContext = 35.43307d;
                break;
            case MM:
                fontSizeFromContext = 3.543307d;
                break;
            case IN:
                fontSizeFromContext = 90.0d;
                break;
            case PT:
                fontSizeFromContext = 1.25d;
                break;
            case PC:
                fontSizeFromContext = 15.0d;
                break;
            default:
                fontSizeFromContext = 1.0d;
                break;
        }
        return sVGLength.value * fontSizeFromContext * this.mScale;
    }

    private float getCanvasWidth() {
        if (this.canvasWidth != -1.0f) {
            return this.canvasWidth;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasWidth = getSvgView().getCanvasBounds().width();
        } else {
            this.canvasWidth = textRoot.getGlyphContext().getWidth();
        }
        return this.canvasWidth;
    }

    private float getCanvasHeight() {
        if (this.canvasHeight != -1.0f) {
            return this.canvasHeight;
        }
        GroupView textRoot = getTextRoot();
        if (textRoot == null) {
            this.canvasHeight = getSvgView().getCanvasBounds().height();
        } else {
            this.canvasHeight = textRoot.getGlyphContext().getHeight();
        }
        return this.canvasHeight;
    }

    private double getCanvasDiagonal() {
        if (this.canvasDiagonal != -1.0d) {
            return this.canvasDiagonal;
        }
        this.canvasDiagonal = Math.sqrt(Math.pow(getCanvasWidth(), 2.0d) + Math.pow(getCanvasHeight(), 2.0d)) * M_SQRT1_2l;
        return this.canvasDiagonal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public void onMeasure(int i, int i2) {
        int defaultSize;
        int defaultSize2;
        if (this.mClientRect != null) {
            defaultSize = (int) Math.ceil(this.mClientRect.width());
        } else {
            defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        }
        if (this.mClientRect != null) {
            defaultSize2 = (int) Math.ceil(this.mClientRect.height());
        } else {
            defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mClientRect == null) {
            return;
        }
        if (!(this instanceof GroupView)) {
            setLeft((int) Math.floor(this.mClientRect.left));
            setTop((int) Math.floor(this.mClientRect.top));
            setRight((int) Math.ceil(this.mClientRect.right));
            setBottom((int) Math.ceil(this.mClientRect.bottom));
        }
        setMeasuredDimension((int) Math.ceil(this.mClientRect.width()), (int) Math.ceil(this.mClientRect.height()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setClientRect(RectF rectF) {
        if (this.mClientRect == null || !this.mClientRect.equals(rectF)) {
            this.mClientRect = rectF;
            if (this.mClientRect == null) {
                return;
            }
            int ceil = (int) Math.ceil(this.mClientRect.width());
            int ceil2 = (int) Math.ceil(this.mClientRect.height());
            int floor = (int) Math.floor(this.mClientRect.left);
            int floor2 = (int) Math.floor(this.mClientRect.top);
            int ceil3 = (int) Math.ceil(this.mClientRect.right);
            int ceil4 = (int) Math.ceil(this.mClientRect.bottom);
            setMeasuredDimension(ceil, ceil2);
            if (!(this instanceof GroupView)) {
                setLeft(floor);
                setTop(floor2);
                setRight(ceil3);
                setBottom(ceil4);
            }
            if (this.mOnLayout) {
                ((UIManagerModule) this.mContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().a(v.a(getId(), floor, floor2, ceil, ceil2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectF getClientRect() {
        return this.mClientRect;
    }
}
