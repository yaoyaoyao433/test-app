package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.annotation.AnimatorRes;
import android.support.annotation.RestrictTo;
import android.support.v4.content.res.TypedArrayUtils;
import android.support.v4.graphics.PathParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class d {
    private static boolean a(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, @AnimatorRes int i, float f) throws Resources.NotFoundException {
        XmlResourceParser animation;
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                animation = resources.getAnimation(i);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (XmlPullParserException e2) {
            e = e2;
        }
        try {
            Animator a2 = a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
            if (animation != null) {
                animation.close();
            }
            return a2;
        } catch (IOException e3) {
            e = e3;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e4) {
            e = e4;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e);
            throw notFoundException2;
        } catch (Throwable th2) {
            th = th2;
            xmlResourceParser = animation;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<PathParser.PathDataNode[]> {
        private PathParser.PathDataNode[] a;

        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ PathParser.PathDataNode[] evaluate(float f, PathParser.PathDataNode[] pathDataNodeArr, PathParser.PathDataNode[] pathDataNodeArr2) {
            PathParser.PathDataNode[] pathDataNodeArr3 = pathDataNodeArr;
            PathParser.PathDataNode[] pathDataNodeArr4 = pathDataNodeArr2;
            if (!PathParser.canMorph(pathDataNodeArr3, pathDataNodeArr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (this.a == null || !PathParser.canMorph(this.a, pathDataNodeArr3)) {
                this.a = PathParser.deepCopyNodes(pathDataNodeArr3);
            }
            for (int i = 0; i < pathDataNodeArr3.length; i++) {
                this.a[i].interpolatePathDataNode(pathDataNodeArr3[i], pathDataNodeArr4[i], f);
            }
            return this.a;
        }

        private a() {
        }
    }

    private static PropertyValuesHolder a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && a(i7)) || (z2 && a(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            PathParser.PathDataNode[] createNodesFromPathData = PathParser.createNodesFromPathData(string);
            PathParser.PathDataNode[] createNodesFromPathData2 = PathParser.createNodesFromPathData(string2);
            if (createNodesFromPathData != null || createNodesFromPathData2 != null) {
                if (createNodesFromPathData != null) {
                    a aVar = new a();
                    if (createNodesFromPathData2 == null) {
                        return PropertyValuesHolder.ofObject(str, aVar, createNodesFromPathData);
                    }
                    if (!PathParser.canMorph(createNodesFromPathData, createNodesFromPathData2)) {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, aVar, createNodesFromPathData, createNodesFromPathData2);
                } else if (createNodesFromPathData2 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofObject(str, new a(), createNodesFromPathData2);
                }
            }
            return propertyValuesHolder;
        }
        e a2 = i == 3 ? e.a() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
            }
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (a(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (a(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (a(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i4);
        }
        PropertyValuesHolder propertyValuesHolder2 = propertyValuesHolder;
        if (propertyValuesHolder2 == null || a2 == null) {
            return propertyValuesHolder2;
        }
        propertyValuesHolder2.setEvaluator(a2);
        return propertyValuesHolder2;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long namedInt = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "duration", 1, 300);
        long namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom") && TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                TypedValue peekValue = typedArray.peekValue(5);
                boolean z = peekValue != null;
                int i = z ? peekValue.type : 0;
                TypedValue peekValue2 = typedArray.peekValue(6);
                boolean z2 = peekValue2 != null;
                namedInt3 = ((z && a(i)) || (z2 && a(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder a2 = a(typedArray, namedInt3, 5, 6, "");
            if (a2 != null) {
                valueAnimator.setValues(a2);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, RecceAnimUtils.REPEAT_COUNT, 3, 0));
        valueAnimator.setRepeatMode(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, RecceAnimUtils.REPEAT_MODE, 4, 1));
        if (typedArray2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
            String namedString = TypedArrayUtils.getNamedString(typedArray2, xmlPullParser, "pathData", 1);
            if (namedString != null) {
                String namedString2 = TypedArrayUtils.getNamedString(typedArray2, xmlPullParser, "propertyXName", 2);
                String namedString3 = TypedArrayUtils.getNamedString(typedArray2, xmlPullParser, "propertyYName", 3);
                if (namedString2 == null && namedString3 == null) {
                    throw new InflateException(typedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                a(PathParser.createPathFromPathData(namedString), objectAnimator, 0.5f * f, namedString2, namedString3);
                return;
            }
            objectAnimator.setPropertyName(TypedArrayUtils.getNamedString(typedArray2, xmlPullParser, "propertyName", 0));
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        char c = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / (min - 1);
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f4, fArr3, null);
            pathMeasure2.getPosTan(f4, fArr3, null);
            fArr[i] = fArr3[c];
            fArr2[i] = fArr3[1];
            f4 += f3;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f4 > ((Float) arrayList.get(i3)).floatValue()) {
                f4 -= ((Float) arrayList.get(i3)).floatValue();
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
            c = 0;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.animation.Animator a(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.graphics.drawable.d.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static PropertyValuesHolder[] a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i;
        Keyframe ofInt;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 3) {
                int i2 = 1;
                if (eventType != 1) {
                    if (eventType != 2) {
                        xmlPullParser.next();
                    } else {
                        if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.i);
                            String namedString = TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "propertyName", 3);
                            int i3 = 4;
                            int namedInt = TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "valueType", 2, 4);
                            int i4 = namedInt;
                            ArrayList arrayList2 = null;
                            while (true) {
                                int next = xmlPullParser.next();
                                if (next != 3 && next != i2) {
                                    if (xmlPullParser.getName().equals("keyframe")) {
                                        if (i4 == i3) {
                                            TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, Xml.asAttributeSet(xmlPullParser), android.support.graphics.drawable.a.j);
                                            TypedValue peekNamedValue = TypedArrayUtils.peekNamedValue(obtainAttributes2, xmlPullParser, "value", 0);
                                            i4 = ((peekNamedValue != null) && a(peekNamedValue.type)) ? 3 : 0;
                                            obtainAttributes2.recycle();
                                        }
                                        TypedArray obtainAttributes3 = TypedArrayUtils.obtainAttributes(resources, theme, Xml.asAttributeSet(xmlPullParser), android.support.graphics.drawable.a.j);
                                        float namedFloat = TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, "fraction", 3, -1.0f);
                                        TypedValue peekNamedValue2 = TypedArrayUtils.peekNamedValue(obtainAttributes3, xmlPullParser, "value", 0);
                                        boolean z = peekNamedValue2 != null;
                                        if (i4 == i3) {
                                            i = (z && a(peekNamedValue2.type)) ? 3 : 0;
                                        } else {
                                            i = i4;
                                        }
                                        if (z) {
                                            if (i != 3) {
                                                switch (i) {
                                                    case 0:
                                                        ofInt = Keyframe.ofFloat(namedFloat, TypedArrayUtils.getNamedFloat(obtainAttributes3, xmlPullParser, "value", 0, 0.0f));
                                                        break;
                                                    case 1:
                                                        break;
                                                    default:
                                                        ofInt = null;
                                                        break;
                                                }
                                            }
                                            ofInt = Keyframe.ofInt(namedFloat, TypedArrayUtils.getNamedInt(obtainAttributes3, xmlPullParser, "value", 0, 0));
                                        } else if (i == 0) {
                                            ofInt = Keyframe.ofFloat(namedFloat);
                                        } else {
                                            ofInt = Keyframe.ofInt(namedFloat);
                                        }
                                        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes3, xmlPullParser, RecceAnimUtils.INTERPOLATOR, 1, 0);
                                        if (namedResourceId > 0) {
                                            ofInt.setInterpolator(c.a(context, namedResourceId));
                                        }
                                        obtainAttributes3.recycle();
                                        if (ofInt != null) {
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            arrayList2.add(ofInt);
                                        }
                                        xmlPullParser.next();
                                    }
                                    i2 = 1;
                                    i3 = 4;
                                }
                            }
                            if (arrayList2 == null || (size = arrayList2.size()) <= 0) {
                                propertyValuesHolder = null;
                            } else {
                                Keyframe keyframe = (Keyframe) arrayList2.get(0);
                                Keyframe keyframe2 = (Keyframe) arrayList2.get(size - 1);
                                float fraction = keyframe2.getFraction();
                                if (fraction < 1.0f) {
                                    if (fraction < 0.0f) {
                                        keyframe2.setFraction(1.0f);
                                    } else {
                                        arrayList2.add(arrayList2.size(), a(keyframe2, 1.0f));
                                        size++;
                                    }
                                }
                                float fraction2 = keyframe.getFraction();
                                if (fraction2 != 0.0f) {
                                    if (fraction2 < 0.0f) {
                                        keyframe.setFraction(0.0f);
                                    } else {
                                        arrayList2.add(0, a(keyframe, 0.0f));
                                        size++;
                                    }
                                }
                                Keyframe[] keyframeArr = new Keyframe[size];
                                arrayList2.toArray(keyframeArr);
                                for (int i5 = 0; i5 < size; i5++) {
                                    Keyframe keyframe3 = keyframeArr[i5];
                                    if (keyframe3.getFraction() < 0.0f) {
                                        if (i5 == 0) {
                                            keyframe3.setFraction(0.0f);
                                        } else {
                                            int i6 = size - 1;
                                            if (i5 == i6) {
                                                keyframe3.setFraction(1.0f);
                                            } else {
                                                int i7 = i5;
                                                for (int i8 = i5 + 1; i8 < i6 && keyframeArr[i8].getFraction() < 0.0f; i8++) {
                                                    i7 = i8;
                                                }
                                                a(keyframeArr, keyframeArr[i7 + 1].getFraction() - keyframeArr[i5 - 1].getFraction(), i5, i7);
                                            }
                                        }
                                    }
                                }
                                propertyValuesHolder = PropertyValuesHolder.ofKeyframe(namedString, keyframeArr);
                                if (i4 == 3) {
                                    propertyValuesHolder.setEvaluator(e.a());
                                }
                            }
                            if (propertyValuesHolder == null) {
                                propertyValuesHolder = a(obtainAttributes, namedInt, 0, 1, namedString);
                            }
                            if (propertyValuesHolder != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(propertyValuesHolder);
                            }
                            obtainAttributes.recycle();
                        }
                        xmlPullParser.next();
                    }
                }
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                propertyValuesHolderArr[i9] = (PropertyValuesHolder) arrayList.get(i9);
            }
            return propertyValuesHolderArr;
        }
        return null;
    }

    private static Keyframe a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.g);
        TypedArray obtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, android.support.graphics.drawable.a.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, obtainAttributes, obtainAttributes2, f, xmlPullParser);
        int namedResourceId = TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, RecceAnimUtils.INTERPOLATOR, 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(c.a(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator;
    }
}
