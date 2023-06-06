package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.aq;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.x;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.android.recce.props.gens.AlignContent;
import com.meituan.android.recce.props.gens.AlignItems;
import com.meituan.android.recce.props.gens.AlignSelf;
import com.meituan.android.recce.props.gens.BorderBottomWidth;
import com.meituan.android.recce.props.gens.BorderEndWidth;
import com.meituan.android.recce.props.gens.BorderLeftWidth;
import com.meituan.android.recce.props.gens.BorderRightWidth;
import com.meituan.android.recce.props.gens.BorderStartWidth;
import com.meituan.android.recce.props.gens.FlexBasis;
import com.meituan.android.recce.props.gens.FlexDirection;
import com.meituan.android.recce.props.gens.FlexGrow;
import com.meituan.android.recce.props.gens.FlexShrink;
import com.meituan.android.recce.props.gens.FlexWrap;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.JustifyContent;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginEnd;
import com.meituan.android.recce.props.gens.MarginHorizontal;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginStart;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MarginVertical;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.MinWidth;
import com.meituan.android.recce.props.gens.PaddingEnd;
import com.meituan.android.recce.props.gens.PaddingStart;
import com.meituan.android.recce.props.gens.PaddingVertical;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.v;
import java.lang.reflect.Array;
import java.util.Locale;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RenderableViewManager extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private final String mClassName;
    private final SVGClass svgClass;
    private static final MatrixDecompositionContext sMatrixDecompositionContext = new MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum SVGClass {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGMarker,
        RNSVGForeignObject
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class RenderableShadowNode extends LayoutShadowNode {
        @ReactPropGroup(names = {AlignSelf.LOWER_CASE_NAME, AlignItems.LOWER_CASE_NAME, "collapsable", "flex", FlexBasis.LOWER_CASE_NAME, FlexDirection.LOWER_CASE_NAME, FlexGrow.LOWER_CASE_NAME, FlexShrink.LOWER_CASE_NAME, FlexWrap.LOWER_CASE_NAME, JustifyContent.LOWER_CASE_NAME, "overflow", AlignContent.LOWER_CASE_NAME, "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", MinWidth.LOWER_CASE_NAME, "maxWidth", MinHeight.LOWER_CASE_NAME, "maxHeight", "margin", MarginVertical.LOWER_CASE_NAME, MarginHorizontal.LOWER_CASE_NAME, MarginLeft.LOWER_CASE_NAME, MarginRight.LOWER_CASE_NAME, MarginTop.LOWER_CASE_NAME, MarginBottom.LOWER_CASE_NAME, MarginStart.LOWER_CASE_NAME, MarginEnd.LOWER_CASE_NAME, "padding", PaddingVertical.LOWER_CASE_NAME, "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", PaddingStart.LOWER_CASE_NAME, PaddingEnd.LOWER_CASE_NAME, "borderWidth", BorderStartWidth.LOWER_CASE_NAME, BorderEndWidth.LOWER_CASE_NAME, "borderTopWidth", BorderBottomWidth.LOWER_CASE_NAME, BorderLeftWidth.LOWER_CASE_NAME, BorderRightWidth.LOWER_CASE_NAME})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }

        RenderableShadowNode() {
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new RenderableShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<RenderableShadowNode> getShadowNodeClass() {
        return RenderableShadowNode.class;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MatrixDecompositionContext extends p.a {
        final double[] perspective = new double[4];
        final double[] scale = new double[3];
        final double[] skew = new double[3];
        final double[] translation = new double[3];
        final double[] rotationDegrees = new double[3];

        MatrixDecompositionContext() {
        }
    }

    private static boolean isZero(double d) {
        return !Double.isNaN(d) && Math.abs(d) < EPSILON;
    }

    private static void decomposeMatrix() {
        double[] dArr = sMatrixDecompositionContext.perspective;
        double[] dArr2 = sMatrixDecompositionContext.scale;
        double[] dArr3 = sMatrixDecompositionContext.skew;
        double[] dArr4 = sMatrixDecompositionContext.translation;
        double[] dArr5 = sMatrixDecompositionContext.rotationDegrees;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance(double.class, 4, 4);
        double[] dArr7 = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = (i * 4) + i2;
                double d = sTransformDecompositionArray[i3] / sTransformDecompositionArray[15];
                dArr6[i][i2] = d;
                if (i2 == 3) {
                    d = 0.0d;
                }
                dArr7[i3] = d;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(p.a(dArr7))) {
            return;
        }
        if (!isZero(dArr6[0][3]) || !isZero(dArr6[1][3]) || !isZero(dArr6[2][3])) {
            p.a(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, p.c(p.b(dArr7)), dArr);
        } else {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr8 = (double[][]) Array.newInstance(double.class, 3, 3);
        for (int i4 = 0; i4 < 3; i4++) {
            dArr8[i4][0] = dArr6[i4][0];
            dArr8[i4][1] = dArr6[i4][1];
            dArr8[i4][2] = dArr6[i4][2];
        }
        dArr2[0] = p.d(dArr8[0]);
        dArr8[0] = p.a(dArr8[0], dArr2[0]);
        dArr3[0] = p.a(dArr8[0], dArr8[1]);
        dArr8[1] = p.a(dArr8[1], dArr8[0], 1.0d, -dArr3[0]);
        dArr3[0] = p.a(dArr8[0], dArr8[1]);
        dArr8[1] = p.a(dArr8[1], dArr8[0], 1.0d, -dArr3[0]);
        dArr2[1] = p.d(dArr8[1]);
        dArr8[1] = p.a(dArr8[1], dArr2[1]);
        dArr3[0] = dArr3[0] / dArr2[1];
        dArr3[1] = p.a(dArr8[0], dArr8[2]);
        dArr8[2] = p.a(dArr8[2], dArr8[0], 1.0d, -dArr3[1]);
        dArr3[2] = p.a(dArr8[1], dArr8[2]);
        dArr8[2] = p.a(dArr8[2], dArr8[1], 1.0d, -dArr3[2]);
        dArr2[2] = p.d(dArr8[2]);
        dArr8[2] = p.a(dArr8[2], dArr2[2]);
        dArr3[1] = dArr3[1] / dArr2[2];
        dArr3[2] = dArr3[2] / dArr2[2];
        if (p.a(dArr8[0], p.b(dArr8[1], dArr8[2])) < 0.0d) {
            for (int i5 = 0; i5 < 3; i5++) {
                dArr2[i5] = dArr2[i5] * (-1.0d);
                double[] dArr9 = dArr8[i5];
                dArr9[0] = dArr9[0] * (-1.0d);
                double[] dArr10 = dArr8[i5];
                dArr10[1] = dArr10[1] * (-1.0d);
                double[] dArr11 = dArr8[i5];
                dArr11[2] = dArr11[2] * (-1.0d);
            }
        }
        dArr5[0] = p.b((-Math.atan2(dArr8[2][1], dArr8[2][2])) * 57.29577951308232d);
        dArr5[1] = p.b((-Math.atan2(-dArr8[2][0], Math.sqrt((dArr8[2][1] * dArr8[2][1]) + (dArr8[2][2] * dArr8[2][2])))) * 57.29577951308232d);
        dArr5[2] = p.b((-Math.atan2(dArr8[1][0], dArr8[0][0])) * 57.29577951308232d);
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        aq.a(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        view.setTranslationX(w.a((float) sMatrixDecompositionContext.translation[0]));
        view.setTranslationY(w.a((float) sMatrixDecompositionContext.translation[1]));
        view.setRotation((float) sMatrixDecompositionContext.rotationDegrees[2]);
        view.setRotationX((float) sMatrixDecompositionContext.rotationDegrees[0]);
        view.setRotationY((float) sMatrixDecompositionContext.rotationDegrees[1]);
        view.setScaleX((float) sMatrixDecompositionContext.scale[0]);
        view.setScaleY((float) sMatrixDecompositionContext.scale[1]);
        double[] dArr = sMatrixDecompositionContext.perspective;
        if (dArr.length > 2) {
            float f = (float) dArr[2];
            if (f == 0.0f) {
                f = 7.8125E-4f;
            }
            float f2 = (-1.0f) / f;
            float f3 = d.b().density;
            view.setCameraDistance(f3 * f3 * f2 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class GroupViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public GroupViewManager() {
            super(SVGClass.RNSVGGroup);
        }

        GroupViewManager(SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "font")
        public void setFont(GroupView groupView, @Nullable ReadableMap readableMap) {
            groupView.setFont(readableMap);
        }

        @ReactProp(name = "fontSize")
        public void setFontSize(GroupView groupView, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            switch (dynamic.getType()) {
                case Number:
                    javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
                    break;
                case String:
                    javaOnlyMap.putString("fontSize", dynamic.asString());
                    break;
                default:
                    return;
            }
            groupView.setFont(javaOnlyMap);
        }

        @ReactProp(name = FontWeight.LOWER_CASE_NAME)
        public void setFontWeight(GroupView groupView, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            switch (dynamic.getType()) {
                case Number:
                    javaOnlyMap.putDouble(FontWeight.LOWER_CASE_NAME, dynamic.asDouble());
                    break;
                case String:
                    javaOnlyMap.putString(FontWeight.LOWER_CASE_NAME, dynamic.asString());
                    break;
                default:
                    return;
            }
            groupView.setFont(javaOnlyMap);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class PathViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PathViewManager() {
            super(SVGClass.RNSVGPath);
        }

        @ReactProp(name = "d")
        public void setD(PathView pathView, String str) {
            pathView.setD(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class TextViewManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TextViewManager() {
            super(SVGClass.RNSVGText);
        }

        TextViewManager(SVGClass sVGClass) {
            super(sVGClass);
        }

        @ReactProp(name = "inlineSize")
        public void setInlineSize(TextView textView, Dynamic dynamic) {
            textView.setInlineSize(dynamic);
        }

        @ReactProp(name = "textLength")
        public void setTextLength(TextView textView, Dynamic dynamic) {
            textView.setTextLength(dynamic);
        }

        @ReactProp(name = "lengthAdjust")
        public void setLengthAdjust(TextView textView, @Nullable String str) {
            textView.setLengthAdjust(str);
        }

        @ReactProp(name = "alignmentBaseline")
        public void setMethod(TextView textView, @Nullable String str) {
            textView.setMethod(str);
        }

        @ReactProp(name = "baselineShift")
        public void setBaselineShift(TextView textView, Dynamic dynamic) {
            textView.setBaselineShift(dynamic);
        }

        @ReactProp(name = "verticalAlign")
        public void setVerticalAlign(TextView textView, @Nullable String str) {
            textView.setVerticalAlign(str);
        }

        @ReactProp(name = AnimationViewCommandModel.Rotation)
        public void setRotate(TextView textView, Dynamic dynamic) {
            textView.setRotate(dynamic);
        }

        @ReactProp(name = "dx")
        public void setDeltaX(TextView textView, Dynamic dynamic) {
            textView.setDeltaX(dynamic);
        }

        @ReactProp(name = "dy")
        public void setDeltaY(TextView textView, Dynamic dynamic) {
            textView.setDeltaY(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(TextView textView, Dynamic dynamic) {
            textView.setPositionX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(TextView textView, Dynamic dynamic) {
            textView.setPositionY(dynamic);
        }

        @ReactProp(name = "font")
        public void setFont(TextView textView, @Nullable ReadableMap readableMap) {
            textView.setFont(readableMap);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class TSpanViewManager extends TextViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TSpanViewManager() {
            super(SVGClass.RNSVGTSpan);
        }

        @ReactProp(name = "content")
        public void setContent(TSpanView tSpanView, @Nullable String str) {
            tSpanView.setContent(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class TextPathViewManager extends TextViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TextPathViewManager() {
            super(SVGClass.RNSVGTextPath);
        }

        @ReactProp(name = "href")
        public void setHref(TextPathView textPathView, String str) {
            textPathView.setHref(str);
        }

        @ReactProp(name = "startOffset")
        public void setStartOffset(TextPathView textPathView, Dynamic dynamic) {
            textPathView.setStartOffset(dynamic);
        }

        @ReactProp(name = "method")
        public void setMethod(TextPathView textPathView, @Nullable String str) {
            textPathView.setMethod(str);
        }

        @ReactProp(name = "spacing")
        public void setSpacing(TextPathView textPathView, @Nullable String str) {
            textPathView.setSpacing(str);
        }

        @ReactProp(name = "side")
        public void setSide(TextPathView textPathView, @Nullable String str) {
            textPathView.setSide(str);
        }

        @ReactProp(name = "midLine")
        public void setSharp(TextPathView textPathView, @Nullable String str) {
            textPathView.setSharp(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class ImageViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ImageViewManager() {
            super(SVGClass.RNSVGImage);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(ImageView imageView, Dynamic dynamic) {
            imageView.setX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(ImageView imageView, Dynamic dynamic) {
            imageView.setY(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(ImageView imageView, Dynamic dynamic) {
            imageView.setWidth(dynamic);
        }

        @ReactProp(name = "height")
        public void setHeight(ImageView imageView, Dynamic dynamic) {
            imageView.setHeight(dynamic);
        }

        @ReactProp(name = RaptorUploaderImpl.SRC)
        public void setSrc(ImageView imageView, @Nullable ReadableMap readableMap) {
            imageView.setSrc(readableMap);
        }

        @ReactProp(name = "align")
        public void setAlign(ImageView imageView, String str) {
            imageView.setAlign(str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(ImageView imageView, int i) {
            imageView.setMeetOrSlice(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class CircleViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CircleViewManager() {
            super(SVGClass.RNSVGCircle);
        }

        @ReactProp(name = "cx")
        public void setCx(CircleView circleView, Dynamic dynamic) {
            circleView.setCx(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(CircleView circleView, Dynamic dynamic) {
            circleView.setCy(dynamic);
        }

        @ReactProp(name = r.o)
        public void setR(CircleView circleView, Dynamic dynamic) {
            circleView.setR(dynamic);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class EllipseViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public EllipseViewManager() {
            super(SVGClass.RNSVGEllipse);
        }

        @ReactProp(name = "cx")
        public void setCx(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setCx(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setCy(dynamic);
        }

        @ReactProp(name = com.meituan.metrics.common.Constants.KEY_RX)
        public void setRx(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setRx(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(EllipseView ellipseView, Dynamic dynamic) {
            ellipseView.setRy(dynamic);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class LineViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public LineViewManager() {
            super(SVGClass.RNSVGLine);
        }

        @ReactProp(name = "x1")
        public void setX1(LineView lineView, Dynamic dynamic) {
            lineView.setX1(dynamic);
        }

        @ReactProp(name = "y1")
        public void setY1(LineView lineView, Dynamic dynamic) {
            lineView.setY1(dynamic);
        }

        @ReactProp(name = "x2")
        public void setX2(LineView lineView, Dynamic dynamic) {
            lineView.setX2(dynamic);
        }

        @ReactProp(name = "y2")
        public void setY2(LineView lineView, Dynamic dynamic) {
            lineView.setY2(dynamic);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class RectViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RectViewManager() {
            super(SVGClass.RNSVGRect);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(RectView rectView, Dynamic dynamic) {
            rectView.setX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(RectView rectView, Dynamic dynamic) {
            rectView.setY(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(RectView rectView, Dynamic dynamic) {
            rectView.setWidth(dynamic);
        }

        @ReactProp(name = "height")
        public void setHeight(RectView rectView, Dynamic dynamic) {
            rectView.setHeight(dynamic);
        }

        @ReactProp(name = com.meituan.metrics.common.Constants.KEY_RX)
        public void setRx(RectView rectView, Dynamic dynamic) {
            rectView.setRx(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(RectView rectView, Dynamic dynamic) {
            rectView.setRy(dynamic);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class ClipPathViewManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ClipPathViewManager() {
            super(SVGClass.RNSVGClipPath);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class DefsViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public DefsViewManager() {
            super(SVGClass.RNSVGDefs);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class UseViewManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public UseViewManager() {
            super(SVGClass.RNSVGUse);
        }

        @ReactProp(name = "href")
        public void setHref(UseView useView, String str) {
            useView.setHref(str);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(UseView useView, Dynamic dynamic) {
            useView.setX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(UseView useView, Dynamic dynamic) {
            useView.setY(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(UseView useView, Dynamic dynamic) {
            useView.setWidth(dynamic);
        }

        @ReactProp(name = "height")
        public void setHeight(UseView useView, Dynamic dynamic) {
            useView.setHeight(dynamic);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class SymbolManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public SymbolManager() {
            super(SVGClass.RNSVGSymbol);
        }

        @ReactProp(name = "minX")
        public void setMinX(SymbolView symbolView, float f) {
            symbolView.setMinX(f);
        }

        @ReactProp(name = "minY")
        public void setMinY(SymbolView symbolView, float f) {
            symbolView.setMinY(f);
        }

        @ReactProp(name = "vbWidth")
        public void setVbWidth(SymbolView symbolView, float f) {
            symbolView.setVbWidth(f);
        }

        @ReactProp(name = "vbHeight")
        public void setVbHeight(SymbolView symbolView, float f) {
            symbolView.setVbHeight(f);
        }

        @ReactProp(name = "align")
        public void setAlign(SymbolView symbolView, String str) {
            symbolView.setAlign(str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(SymbolView symbolView, int i) {
            symbolView.setMeetOrSlice(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class PatternManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PatternManager() {
            super(SVGClass.RNSVGPattern);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(PatternView patternView, Dynamic dynamic) {
            patternView.setX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(PatternView patternView, Dynamic dynamic) {
            patternView.setY(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(PatternView patternView, Dynamic dynamic) {
            patternView.setWidth(dynamic);
        }

        @ReactProp(name = "height")
        public void setHeight(PatternView patternView, Dynamic dynamic) {
            patternView.setHeight(dynamic);
        }

        @ReactProp(name = "patternUnits")
        public void setPatternUnits(PatternView patternView, int i) {
            patternView.setPatternUnits(i);
        }

        @ReactProp(name = "patternContentUnits")
        public void setPatternContentUnits(PatternView patternView, int i) {
            patternView.setPatternContentUnits(i);
        }

        @ReactProp(name = "patternTransform")
        public void setPatternTransform(PatternView patternView, @Nullable ReadableArray readableArray) {
            patternView.setPatternTransform(readableArray);
        }

        @ReactProp(name = "minX")
        public void setMinX(PatternView patternView, float f) {
            patternView.setMinX(f);
        }

        @ReactProp(name = "minY")
        public void setMinY(PatternView patternView, float f) {
            patternView.setMinY(f);
        }

        @ReactProp(name = "vbWidth")
        public void setVbWidth(PatternView patternView, float f) {
            patternView.setVbWidth(f);
        }

        @ReactProp(name = "vbHeight")
        public void setVbHeight(PatternView patternView, float f) {
            patternView.setVbHeight(f);
        }

        @ReactProp(name = "align")
        public void setAlign(PatternView patternView, String str) {
            patternView.setAlign(str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(PatternView patternView, int i) {
            patternView.setMeetOrSlice(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class MaskManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public MaskManager() {
            super(SVGClass.RNSVGMask);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(MaskView maskView, Dynamic dynamic) {
            maskView.setX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(MaskView maskView, Dynamic dynamic) {
            maskView.setY(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(MaskView maskView, Dynamic dynamic) {
            maskView.setWidth(dynamic);
        }

        @ReactProp(name = "height")
        public void setHeight(MaskView maskView, Dynamic dynamic) {
            maskView.setHeight(dynamic);
        }

        @ReactProp(name = "maskUnits")
        public void setMaskUnits(MaskView maskView, int i) {
            maskView.setMaskUnits(i);
        }

        @ReactProp(name = "maskContentUnits")
        public void setMaskContentUnits(MaskView maskView, int i) {
            maskView.setMaskContentUnits(i);
        }

        @ReactProp(name = "maskTransform")
        public void setMaskTransform(MaskView maskView, @Nullable ReadableArray readableArray) {
            maskView.setMaskTransform(readableArray);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class ForeignObjectManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ForeignObjectManager() {
            super(SVGClass.RNSVGForeignObject);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_X)
        public void setX(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setX(dynamic);
        }

        @ReactProp(name = Constants.GestureMoveEvent.KEY_Y)
        public void setY(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setY(dynamic);
        }

        @ReactProp(name = "width")
        public void setWidth(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setWidth(dynamic);
        }

        @ReactProp(name = "height")
        public void setHeight(ForeignObjectView foreignObjectView, Dynamic dynamic) {
            foreignObjectView.setHeight(dynamic);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class MarkerManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public MarkerManager() {
            super(SVGClass.RNSVGMarker);
        }

        @ReactProp(name = "refX")
        public void setRefX(MarkerView markerView, Dynamic dynamic) {
            markerView.setRefX(dynamic);
        }

        @ReactProp(name = "refY")
        public void setRefY(MarkerView markerView, Dynamic dynamic) {
            markerView.setRefY(dynamic);
        }

        @ReactProp(name = "markerWidth")
        public void setMarkerWidth(MarkerView markerView, Dynamic dynamic) {
            markerView.setMarkerWidth(dynamic);
        }

        @ReactProp(name = "markerHeight")
        public void setMarkerHeight(MarkerView markerView, Dynamic dynamic) {
            markerView.setMarkerHeight(dynamic);
        }

        @ReactProp(name = "markerUnits")
        public void setMarkerUnits(MarkerView markerView, String str) {
            markerView.setMarkerUnits(str);
        }

        @ReactProp(name = "orient")
        public void setOrient(MarkerView markerView, String str) {
            markerView.setOrient(str);
        }

        @ReactProp(name = "minX")
        public void setMinX(MarkerView markerView, float f) {
            markerView.setMinX(f);
        }

        @ReactProp(name = "minY")
        public void setMinY(MarkerView markerView, float f) {
            markerView.setMinY(f);
        }

        @ReactProp(name = "vbWidth")
        public void setVbWidth(MarkerView markerView, float f) {
            markerView.setVbWidth(f);
        }

        @ReactProp(name = "vbHeight")
        public void setVbHeight(MarkerView markerView, float f) {
            markerView.setVbHeight(f);
        }

        @ReactProp(name = "align")
        public void setAlign(MarkerView markerView, String str) {
            markerView.setAlign(str);
        }

        @ReactProp(name = "meetOrSlice")
        public void setMeetOrSlice(MarkerView markerView, int i) {
            markerView.setMeetOrSlice(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class LinearGradientManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public LinearGradientManager() {
            super(SVGClass.RNSVGLinearGradient);
        }

        @ReactProp(name = "x1")
        public void setX1(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setX1(dynamic);
        }

        @ReactProp(name = "y1")
        public void setY1(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setY1(dynamic);
        }

        @ReactProp(name = "x2")
        public void setX2(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setX2(dynamic);
        }

        @ReactProp(name = "y2")
        public void setY2(LinearGradientView linearGradientView, Dynamic dynamic) {
            linearGradientView.setY2(dynamic);
        }

        @ReactProp(name = "gradient")
        public void setGradient(LinearGradientView linearGradientView, ReadableArray readableArray) {
            linearGradientView.setGradient(readableArray);
        }

        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(LinearGradientView linearGradientView, int i) {
            linearGradientView.setGradientUnits(i);
        }

        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(LinearGradientView linearGradientView, @Nullable ReadableArray readableArray) {
            linearGradientView.setGradientTransform(readableArray);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class RadialGradientManager extends RenderableViewManager {
        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void addEventEmitters(@Nonnull ao aoVar, @Nonnull View view) {
            super.addEventEmitters(aoVar, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ af createShadowNodeInstance() {
            return super.createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        @Nonnull
        public /* bridge */ /* synthetic */ View createViewInstance(@Nonnull ao aoVar) {
            return super.createViewInstance(aoVar);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(@Nonnull View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(@Nonnull View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @ReactProp(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(@Nonnull View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RadialGradientManager() {
            super(SVGClass.RNSVGRadialGradient);
        }

        @ReactProp(name = "fx")
        public void setFx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setFx(dynamic);
        }

        @ReactProp(name = "fy")
        public void setFy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setFy(dynamic);
        }

        @ReactProp(name = com.meituan.metrics.common.Constants.KEY_RX)
        public void setRx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setRx(dynamic);
        }

        @ReactProp(name = "ry")
        public void setRy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setRy(dynamic);
        }

        @ReactProp(name = "cx")
        public void setCx(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setCx(dynamic);
        }

        @ReactProp(name = "cy")
        public void setCy(RadialGradientView radialGradientView, Dynamic dynamic) {
            radialGradientView.setCy(dynamic);
        }

        @ReactProp(name = "gradient")
        public void setGradient(RadialGradientView radialGradientView, ReadableArray readableArray) {
            radialGradientView.setGradient(readableArray);
        }

        @ReactProp(name = "gradientUnits")
        public void setGradientUnits(RadialGradientView radialGradientView, int i) {
            radialGradientView.setGradientUnits(i);
        }

        @ReactProp(name = "gradientTransform")
        public void setGradientTransform(RadialGradientView radialGradientView, @Nullable ReadableArray readableArray) {
            radialGradientView.setGradientTransform(readableArray);
        }
    }

    private RenderableViewManager(SVGClass sVGClass) {
        this.svgClass = sVGClass;
        this.mClassName = sVGClass.toString();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return this.mClassName;
    }

    @ReactProp(name = "mask")
    public void setMask(VirtualView virtualView, String str) {
        virtualView.setMask(str);
    }

    @ReactProp(name = "markerStart")
    public void setMarkerStart(VirtualView virtualView, String str) {
        virtualView.setMarkerStart(str);
    }

    @ReactProp(name = "markerMid")
    public void setMarkerMid(VirtualView virtualView, String str) {
        virtualView.setMarkerMid(str);
    }

    @ReactProp(name = "markerEnd")
    public void setMarkerEnd(VirtualView virtualView, String str) {
        virtualView.setMarkerEnd(str);
    }

    @ReactProp(name = "clipPath")
    public void setClipPath(VirtualView virtualView, String str) {
        virtualView.setClipPath(str);
    }

    @ReactProp(name = "clipRule")
    public void setClipRule(VirtualView virtualView, int i) {
        virtualView.setClipRule(i);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(@Nonnull VirtualView virtualView, float f) {
        virtualView.setOpacity(f);
    }

    @ReactProp(name = "fill")
    public void setFill(RenderableView renderableView, @Nullable Dynamic dynamic) {
        renderableView.setFill(dynamic);
    }

    @ReactProp(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(RenderableView renderableView, float f) {
        renderableView.setFillOpacity(f);
    }

    @ReactProp(defaultInt = 1, name = "fillRule")
    public void setFillRule(RenderableView renderableView, int i) {
        renderableView.setFillRule(i);
    }

    @ReactProp(name = "stroke")
    public void setStroke(RenderableView renderableView, @Nullable Dynamic dynamic) {
        renderableView.setStroke(dynamic);
    }

    @ReactProp(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(RenderableView renderableView, float f) {
        renderableView.setStrokeOpacity(f);
    }

    @ReactProp(name = "strokeDasharray")
    public void setStrokeDasharray(RenderableView renderableView, @Nullable ReadableArray readableArray) {
        renderableView.setStrokeDasharray(readableArray);
    }

    @ReactProp(name = "strokeDashoffset")
    public void setStrokeDashoffset(RenderableView renderableView, float f) {
        renderableView.setStrokeDashoffset(f);
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStrokeWidth(dynamic);
    }

    @ReactProp(defaultFloat = v.a.j, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(RenderableView renderableView, float f) {
        renderableView.setStrokeMiterlimit(f);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(RenderableView renderableView, int i) {
        renderableView.setStrokeLinecap(i);
    }

    @ReactProp(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(RenderableView renderableView, int i) {
        renderableView.setStrokeLinejoin(i);
    }

    @ReactProp(name = "vectorEffect")
    public void setVectorEffect(RenderableView renderableView, int i) {
        renderableView.setVectorEffect(i);
    }

    @ReactProp(name = "matrix")
    public void setMatrix(VirtualView virtualView, Dynamic dynamic) {
        virtualView.setMatrix(dynamic);
    }

    @ReactProp(name = "transform")
    public void setTransform(VirtualView virtualView, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        ReadableArray asArray = dynamic.asArray();
        if (asArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, asArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @ReactProp(name = "propList")
    public void setPropList(RenderableView renderableView, @Nullable ReadableArray readableArray) {
        renderableView.setPropList(readableArray);
    }

    @ReactProp(name = "responsible")
    public void setResponsible(VirtualView virtualView, boolean z) {
        virtualView.setResponsible(z);
    }

    @ReactProp(name = "pointerEvents")
    public void setPointerEvents(VirtualView virtualView, @Nullable String str) {
        if (str == null) {
            virtualView.setPointerEvents(x.AUTO);
        } else {
            virtualView.setPointerEvents(x.valueOf(str.toUpperCase(Locale.US).replace(CommonConstant.Symbol.MINUS, CommonConstant.Symbol.UNDERLINE)));
        }
    }

    @ReactProp(name = "onLayout")
    public void setOnLayout(VirtualView virtualView, boolean z) {
        virtualView.setOnLayout(z);
    }

    @ReactProp(name = "name")
    public void setName(VirtualView virtualView, String str) {
        virtualView.setName(str);
    }

    @ReactProp(name = "display")
    public void setDisplay(VirtualView virtualView, String str) {
        virtualView.setDisplay(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(VirtualView virtualView) {
        SvgView svgView = virtualView.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (virtualView instanceof TextView) {
            ((TextView) virtualView).getTextContainer().clearChildCache();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@Nonnull ao aoVar, @Nonnull VirtualView virtualView) {
        super.addEventEmitters(aoVar, (ao) virtualView);
        virtualView.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.horcrux.svg.RenderableViewManager.1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewAdded(View view, View view2) {
                if (view instanceof VirtualView) {
                    RenderableViewManager.this.invalidateSvgView((VirtualView) view);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public void onChildViewRemoved(View view, View view2) {
                if (view instanceof VirtualView) {
                    RenderableViewManager.this.invalidateSvgView((VirtualView) view);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@Nonnull VirtualView virtualView) {
        super.onAfterUpdateTransaction((RenderableViewManager) virtualView);
        invalidateSvgView(virtualView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public VirtualView createViewInstance(@Nonnull ao aoVar) {
        switch (this.svgClass) {
            case RNSVGGroup:
                return new GroupView(aoVar);
            case RNSVGPath:
                return new PathView(aoVar);
            case RNSVGCircle:
                return new CircleView(aoVar);
            case RNSVGEllipse:
                return new EllipseView(aoVar);
            case RNSVGLine:
                return new LineView(aoVar);
            case RNSVGRect:
                return new RectView(aoVar);
            case RNSVGText:
                return new TextView(aoVar);
            case RNSVGTSpan:
                return new TSpanView(aoVar);
            case RNSVGTextPath:
                return new TextPathView(aoVar);
            case RNSVGImage:
                return new ImageView(aoVar);
            case RNSVGClipPath:
                return new ClipPathView(aoVar);
            case RNSVGDefs:
                return new DefsView(aoVar);
            case RNSVGUse:
                return new UseView(aoVar);
            case RNSVGSymbol:
                return new SymbolView(aoVar);
            case RNSVGLinearGradient:
                return new LinearGradientView(aoVar);
            case RNSVGRadialGradient:
                return new RadialGradientView(aoVar);
            case RNSVGPattern:
                return new PatternView(aoVar);
            case RNSVGMask:
                return new MaskView(aoVar);
            case RNSVGMarker:
                return new MarkerView(aoVar);
            case RNSVGForeignObject:
                return new ForeignObjectView(aoVar);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setRenderableView(int i, RenderableView renderableView) {
        mTagToRenderableView.put(i, renderableView);
        Runnable runnable = mTagToRunnable.get(i);
        if (runnable != null) {
            runnable.run();
            mTagToRunnable.delete(i);
        }
    }

    static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static RenderableView getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@Nonnull VirtualView virtualView) {
        super.onDropViewInstance((RenderableViewManager) virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }
}
