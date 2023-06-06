package com.dianping.picasso.model;

import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.view.AnimationView;
import com.google.gson.annotations.Expose;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AnimationInfoModel extends PicassoModel {
    public static final int BEHAVIOR_TYPE_KEYFRAME = 1;
    public static final int BEHAVIOR_TYPE_NORMAL = 0;
    public static final int FUNCTION_CUBIC_BEZIER = 4;
    public static final int FUNCTION_EASE_IN = 1;
    public static final int FUNCTION_EASE_IN_OUT = 3;
    public static final int FUNCTION_EASE_OUT = 2;
    public static final int FUNCTION_LINEAR = 0;
    public static final int FUNCTION_SPRING = 5;
    public static final DecodingFactory<AnimationInfoModel> PICASSO_DECODER = new DecodingFactory<AnimationInfoModel>() { // from class: com.dianping.picasso.model.AnimationInfoModel.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationInfoModel createInstance() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04c92874b69fb517b43e03a4ee78a0f3", RobustBitConfig.DEFAULT_VALUE) ? (AnimationInfoModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04c92874b69fb517b43e03a4ee78a0f3") : new AnimationInfoModel();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.dianping.jscore.model.DecodingFactory
        public final AnimationInfoModel[] createArray(int i) {
            return new AnimationInfoModel[i];
        }
    };
    private static final int PICASSO_PATH_TYPE_ARC = 5;
    private static final int PICASSO_PATH_TYPE_CURVE = 2;
    private static final int PICASSO_PATH_TYPE_ELLIPSE_IN_RECT = 4;
    private static final int PICASSO_PATH_TYPE_LINE = 1;
    private static final int PICASSO_PATH_TYPE_QUAD_CURVE = 3;
    public static final int PROPERTY_BACKGROUND_COLOR = 8;
    public static final int PROPERTY_CORNER = 10;
    public static final int PROPERTY_HEIGHT = 12;
    public static final int PROPERTY_NONE = 0;
    public static final int PROPERTY_OPACITY = 9;
    public static final int PROPERTY_POSITION = 13;
    public static final int PROPERTY_ROTATE = 5;
    public static final int PROPERTY_ROTATE_X = 6;
    public static final int PROPERTY_ROTATE_Y = 7;
    public static final int PROPERTY_SCALE_X = 1;
    public static final int PROPERTY_SCALE_Y = 2;
    public static final int PROPERTY_TRANSLATE_X = 3;
    public static final int PROPERTY_TRANSLATE_Y = 4;
    public static final int PROPERTY_WIDTH = 11;
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean autoreverses;
    public int behaviorType;
    public int delay;
    public Integer duration;
    public String fromValue;
    public KeyFrameConfig keyframeConfig;
    public int property;
    public int repeatCount;
    public float springFactor;
    public int timingFunction;
    public PointModel[] timingFunctionControlPoints;
    public String toValue;

    @Override // com.dianping.picasso.model.PicassoModel
    public void readExtraProperty(int i, Unarchived unarchived) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i), unarchived};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9af8b5ebdaea280ef568d7b159fa3491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9af8b5ebdaea280ef568d7b159fa3491");
            return;
        }
        switch (i) {
            case 15532:
                this.behaviorType = (int) unarchived.readDouble();
                return;
            case 19860:
                this.duration = Integer.valueOf((int) unarchived.readDouble());
                return;
            case 26550:
                this.toValue = unarchived.readString();
                return;
            case 27068:
                this.springFactor = (float) unarchived.readDouble();
                return;
            case 31796:
                this.repeatCount = (int) unarchived.readDouble();
                return;
            case 33150:
                this.timingFunctionControlPoints = (PointModel[]) unarchived.readArray(PointModel.POINT_MODEL_DECODING_FACTORY);
                return;
            case 37712:
                this.keyframeConfig = (KeyFrameConfig) unarchived.readObject(KeyFrameConfig.DECODING_FACTORY);
                return;
            case 47491:
                this.delay = (int) unarchived.readDouble();
                return;
            case 50151:
                this.fromValue = unarchived.readString();
                return;
            case 51328:
                this.autoreverses = unarchived.readBoolean();
                return;
            case 56789:
                this.property = (int) unarchived.readDouble();
                return;
            case 56898:
                this.timingFunction = (int) unarchived.readDouble();
                return;
            default:
                super.readExtraProperty(i, unarchived);
                return;
        }
    }

    public Interpolator getInterpolator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c642545a787892dfd345f682e36e2544", RobustBitConfig.DEFAULT_VALUE)) {
            return (Interpolator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c642545a787892dfd345f682e36e2544");
        }
        switch (this.timingFunction) {
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return new AccelerateDecelerateInterpolator();
            case 4:
                if (this.timingFunctionControlPoints == null || this.timingFunctionControlPoints.length != 2) {
                    Log.e("AnimationView", "timingFunctionControlPoints.length !=2, CubicBezier has change to Linear");
                    return new LinearInterpolator();
                }
                return new CubicBezierInterpolator(this.timingFunctionControlPoints[0], this.timingFunctionControlPoints[1]);
            case 5:
                if (this.springFactor == 0.0f) {
                    Log.e("AnimationView", "springFactor ==0, SPRING has change to Linear");
                    return new LinearInterpolator();
                }
                return new SpringInterpolator(this.springFactor);
            default:
                return new LinearInterpolator();
        }
    }

    private String getAnimPropertyName() {
        switch (this.property) {
            case 1:
                return RecceAnimUtils.SCALE_X;
            case 2:
                return RecceAnimUtils.SCALE_Y;
            case 3:
                return RecceAnimUtils.TRANSLATION_X;
            case 4:
                return RecceAnimUtils.TRANSLATION_Y;
            case 5:
                return RecceAnimUtils.ROTATION;
            case 6:
                return RecceAnimUtils.ROTATION_X;
            case 7:
                return RecceAnimUtils.ROTATION_Y;
            case 8:
                return "backgroundColorPicasso";
            case 9:
                return "alpha";
            case 10:
                return "corner";
            case 11:
                return "width";
            case 12:
                return "height";
            case 13:
                return "position";
            default:
                return "";
        }
    }

    public ObjectAnimator createAnimator(AnimationView animationView) {
        Object[] objArr = {animationView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ef697da94b2de18d7d0ed8d62dba1d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ef697da94b2de18d7d0ed8d62dba1d4");
        }
        String animPropertyName = getAnimPropertyName();
        if (TextUtils.isEmpty(animPropertyName)) {
            return null;
        }
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(animationView);
        objectAnimator.setPropertyName(animPropertyName);
        prepareAnimByBehavior(animationView, objectAnimator);
        if (this.duration != null) {
            objectAnimator.setDuration(this.duration.intValue());
        }
        objectAnimator.setStartDelay(this.delay);
        if (this.repeatCount == Integer.MAX_VALUE) {
            objectAnimator.setRepeatCount(-1);
        } else {
            objectAnimator.setRepeatCount(this.repeatCount);
        }
        objectAnimator.setRepeatMode(this.autoreverses ? 2 : 1);
        objectAnimator.setInterpolator(getInterpolator());
        return objectAnimator;
    }

    private void prepareAnimByBehavior(AnimationView animationView, ObjectAnimator objectAnimator) {
        Object[] objArr = {animationView, objectAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c7dc54f4f9cc80a4a1e29699aabfc13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c7dc54f4f9cc80a4a1e29699aabfc13");
        } else if (this.behaviorType == 1) {
            prepareKeyFrameBehavior(animationView, objectAnimator);
        } else {
            prepareNormalBehavior(animationView, objectAnimator);
        }
    }

    private void prepareKeyFrameBehavior(AnimationView animationView, ObjectAnimator objectAnimator) {
        PicassoSubPath[] picassoSubPathArr;
        Object[] objArr = {animationView, objectAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dbfb85c56dd717cae163336b8691ff35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dbfb85c56dd717cae163336b8691ff35");
        } else if (this.keyframeConfig != null) {
            if (this.keyframeConfig.path != null) {
                Path path = new Path();
                PointF position = animationView.getPosition();
                float f = position.x;
                float f2 = position.y;
                if (this.keyframeConfig.path.startPoint != null && this.keyframeConfig.path.startPoint.x != null && this.keyframeConfig.path.startPoint.y != null) {
                    f = getAnimationValue(animationView.getContext(), this.keyframeConfig.path.startPoint.x.floatValue()).floatValue();
                    f2 = getAnimationValue(animationView.getContext(), this.keyframeConfig.path.startPoint.y.floatValue()).floatValue();
                }
                path.moveTo(f, f2);
                for (PicassoSubPath picassoSubPath : this.keyframeConfig.path.subPaths) {
                    switch (picassoSubPath.pathType) {
                        case 1:
                            path.lineTo(getAnimationValue(animationView.getContext(), picassoSubPath.end.floatX()).floatValue(), getAnimationValue(animationView.getContext(), picassoSubPath.end.floatY()).floatValue());
                            break;
                        case 2:
                            path.cubicTo(getAnimationValue(animationView.getContext(), picassoSubPath.control1.floatX()).floatValue(), getAnimationValue(animationView.getContext(), picassoSubPath.control1.floatY()).floatValue(), getAnimationValue(animationView.getContext(), picassoSubPath.control2.floatX()).floatValue(), getAnimationValue(animationView.getContext(), picassoSubPath.control2.floatY()).floatValue(), getAnimationValue(animationView.getContext(), picassoSubPath.end.floatX()).floatValue(), getAnimationValue(animationView.getContext(), picassoSubPath.end.floatY()).floatValue());
                            break;
                    }
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    objectAnimator.setValues(PropertyValuesHolder.ofMultiFloat(objectAnimator.getPropertyName(), path));
                }
            } else if (this.keyframeConfig.keyTimes != null && this.keyframeConfig.values != null && this.keyframeConfig.keyTimes.length <= this.keyframeConfig.values.length) {
                Keyframe[] parseKeyFrames = parseKeyFrames(animationView.getContext());
                if (parseKeyFrames.length == 0) {
                    return;
                }
                objectAnimator.setValues(PropertyValuesHolder.ofKeyframe(objectAnimator.getPropertyName(), parseKeyFrames));
                if (this.property == 13) {
                    objectAnimator.setEvaluator(new PositionEvaluator());
                } else if (this.property == 8) {
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                }
            }
        }
    }

    private Keyframe[] parseKeyFrames(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11a379b4d7149f1fa3a8395c6fc60ab9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Keyframe[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11a379b4d7149f1fa3a8395c6fc60ab9");
        }
        int length = this.keyframeConfig.keyTimes.length;
        Keyframe[] keyframeArr = new Keyframe[length];
        for (int i = 0; i < length; i++) {
            if (this.property == 13) {
                PointF parseString2Point = parseString2Point(context, this.keyframeConfig.values[i]);
                if (parseString2Point == null) {
                    return new Keyframe[0];
                }
                keyframeArr[i] = Keyframe.ofObject((float) this.keyframeConfig.keyTimes[i], parseString2Point);
            } else if (this.property == 8) {
                keyframeArr[i] = Keyframe.ofInt((float) this.keyframeConfig.keyTimes[i], paresColorFromString(this.keyframeConfig.values[i]));
            } else {
                Float animationValue = getAnimationValue(context, this.keyframeConfig.values[i]);
                if (animationValue == null) {
                    return new Keyframe[0];
                }
                keyframeArr[i] = Keyframe.ofFloat((float) this.keyframeConfig.keyTimes[i], animationValue.floatValue());
            }
        }
        return keyframeArr;
    }

    private void prepareNormalBehavior(AnimationView animationView, ObjectAnimator objectAnimator) {
        Object[] objArr = {animationView, objectAnimator};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67cee40161200e14149a35fdb5ade6e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67cee40161200e14149a35fdb5ade6e2");
        } else if (this.property == 8) {
            parseColorAnimator(objectAnimator, animationView.getBgColor());
        } else if (this.property == 13) {
            PointF position = animationView.getPosition();
            if (!TextUtils.isEmpty(this.fromValue)) {
                position = parseString2Point(animationView.getContext(), this.fromValue);
            }
            PointF parseString2Point = parseString2Point(animationView.getContext(), this.toValue);
            if (position == null || parseString2Point == null) {
                return;
            }
            Path path = new Path();
            path.moveTo(position.x, position.y);
            path.lineTo(parseString2Point.x, parseString2Point.y);
            if (Build.VERSION.SDK_INT >= 21) {
                objectAnimator.setValues(PropertyValuesHolder.ofMultiFloat(objectAnimator.getPropertyName(), path));
            }
        } else {
            Float fromValue = getFromValue(animationView);
            Float animationValue = getAnimationValue(animationView.getContext(), this.toValue);
            if (animationValue != null) {
                if (fromValue != null) {
                    objectAnimator.setFloatValues(fromValue.floatValue(), animationValue.floatValue());
                } else {
                    objectAnimator.setFloatValues(animationValue.floatValue());
                }
            }
        }
    }

    private PointF parseString2Point(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c76ac7accf9f1e1e61a94cff8799ad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c76ac7accf9f1e1e61a94cff8799ad1");
        }
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith(CommonConstant.Symbol.BIG_BRACKET_LEFT) && str.endsWith(CommonConstant.Symbol.BIG_BRACKET_RIGHT)) {
                String[] split = str.substring(1, str.length() - 1).split(CommonConstant.Symbol.COMMA);
                if (split.length >= 2) {
                    Float animationValue = getAnimationValue(context, split[0]);
                    Float animationValue2 = getAnimationValue(context, split[1]);
                    if (animationValue == null || animationValue2 == null) {
                        return null;
                    }
                    return new PointF(animationValue.floatValue(), animationValue2.floatValue());
                }
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private Float getFromValue(AnimationView animationView) {
        Object[] objArr = {animationView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "170c2142723331aa8b9659c68d59e9ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "170c2142723331aa8b9659c68d59e9ae");
        }
        Float animationValue = getAnimationValue(animationView.getContext(), this.fromValue);
        if (animationValue == null) {
            switch (this.property) {
                case 10:
                    return Float.valueOf(animationView.getCorner());
                case 11:
                    return Float.valueOf(animationView.getMeasuredWidth());
                case 12:
                    return Float.valueOf(animationView.getMeasuredHeight());
                default:
                    return animationValue;
            }
        }
        return animationValue;
    }

    private Float getAnimationValue(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad1b0d6697aa10ef2c85198121fedaf1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad1b0d6697aa10ef2c85198121fedaf1");
        }
        try {
            return getAnimationValue(context, Float.parseFloat(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private Float getAnimationValue(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89e969989558573f9ca56d068c40bf60", RobustBitConfig.DEFAULT_VALUE)) {
            return (Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89e969989558573f9ca56d068c40bf60");
        }
        if (isDip()) {
            f = PicassoUtils.dp2px(context, f);
        }
        return Float.valueOf(f);
    }

    private boolean isDip() {
        return this.property == 3 || this.property == 4 || this.property == 10 || this.property == 11 || this.property == 12 || this.property == 13;
    }

    private void parseColorAnimator(ObjectAnimator objectAnimator, int i) {
        Object[] objArr = {objectAnimator, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f42ac100b2735b6319f8c5a6964e343e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f42ac100b2735b6319f8c5a6964e343e");
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.fromValue) && this.fromValue.startsWith("#")) {
                i = Color.parseColor(this.fromValue);
                objectAnimator.setIntValues(Color.parseColor(this.fromValue), Color.parseColor(this.toValue));
            }
            objectAnimator.setIntValues(i, Color.parseColor(this.toValue));
            objectAnimator.setEvaluator(new ArgbEvaluator());
        } catch (Exception unused) {
        }
    }

    private int paresColorFromString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70503df008b8e9274d74862b979ea77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70503df008b8e9274d74862b979ea77")).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b753b97c7f826e73765a0c13b8afa2e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b753b97c7f826e73765a0c13b8afa2e9")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnimationInfoModel animationInfoModel = (AnimationInfoModel) obj;
        return this.delay == animationInfoModel.delay && this.repeatCount == animationInfoModel.repeatCount && this.timingFunction == animationInfoModel.timingFunction && this.property == animationInfoModel.property && this.autoreverses == animationInfoModel.autoreverses && Float.compare(animationInfoModel.springFactor, this.springFactor) == 0 && this.behaviorType == animationInfoModel.behaviorType && Objects.equals(this.fromValue, animationInfoModel.fromValue) && Objects.equals(this.duration, animationInfoModel.duration) && Objects.equals(this.toValue, animationInfoModel.toValue) && Arrays.equals(this.timingFunctionControlPoints, animationInfoModel.timingFunctionControlPoints) && Objects.equals(this.keyframeConfig, animationInfoModel.keyframeConfig);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66a193038ef5d8171cf84429c4335bf1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66a193038ef5d8171cf84429c4335bf1")).intValue() : (Objects.hash(this.fromValue, this.duration, Integer.valueOf(this.delay), Integer.valueOf(this.repeatCount), Integer.valueOf(this.timingFunction), Integer.valueOf(this.property), this.toValue, Boolean.valueOf(this.autoreverses), Float.valueOf(this.springFactor), Integer.valueOf(this.behaviorType), this.keyframeConfig) * 31) + Arrays.hashCode(this.timingFunctionControlPoints);
    }

    public int getBgColorToValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e761d2820624a6841c3b27162712549c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e761d2820624a6841c3b27162712549c")).intValue() : getBgColorValue(this.toValue);
    }

    public int getBgColorFromValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be14d22ee4af0366888997808a4483e8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be14d22ee4af0366888997808a4483e8")).intValue() : getBgColorValue(this.fromValue);
    }

    private int getBgColorValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8d786a64c2763f59f947159ec603f94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8d786a64c2763f59f947159ec603f94")).intValue();
        }
        try {
            if (8 == this.property) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class CubicBezierInterpolator implements Interpolator {
        private static int ACCURACY = 1024;
        public static ChangeQuickRedirect changeQuickRedirect;
        private int mLastI;
        private float[] pointX;
        private float[] pointY;

        private float calcBezier(float f, float f2, float f3) {
            Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "042cd2486bb57265487820590b985f40", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "042cd2486bb57265487820590b985f40")).floatValue();
            }
            float f4 = 1.0f - f;
            float f5 = 3.0f * f4;
            return (f4 * f5 * f * f2) + (f5 * f * f * f3) + (f * f * f);
        }

        public CubicBezierInterpolator(PointModel pointModel, PointModel pointModel2) {
            Object[] objArr = {pointModel, pointModel2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b521075497cb879a33cebe44504d8a3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b521075497cb879a33cebe44504d8a3");
                return;
            }
            this.mLastI = 0;
            this.pointX = new float[ACCURACY + 1];
            this.pointY = new float[ACCURACY + 1];
            for (int i = 0; i <= ACCURACY; i++) {
                float f = (i * 1.0f) / ACCURACY;
                this.pointX[i] = calcBezier(f, pointModel.floatX(), pointModel2.floatX());
                this.pointY[i] = calcBezier(f, pointModel.floatY(), pointModel2.floatY());
            }
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4973265c6a67781951cbf0162a0d133", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4973265c6a67781951cbf0162a0d133")).floatValue();
            }
            int i = this.mLastI;
            while (true) {
                if (i > ACCURACY) {
                    i = 0;
                    break;
                } else if (f <= this.pointX[i]) {
                    break;
                } else {
                    i++;
                }
            }
            this.mLastI = f != 1.0f ? i : 0;
            return this.pointY[i];
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class KeyFrameConfig implements Decoding {
        public static final DecodingFactory<KeyFrameConfig> DECODING_FACTORY = new DecodingFactory<KeyFrameConfig>() { // from class: com.dianping.picasso.model.AnimationInfoModel.KeyFrameConfig.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.dianping.jscore.model.DecodingFactory
            public final KeyFrameConfig[] createArray(int i) {
                return new KeyFrameConfig[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.dianping.jscore.model.DecodingFactory
            public final KeyFrameConfig createInstance() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87b45a75abadccb7f4aa5b24132476ce", RobustBitConfig.DEFAULT_VALUE) ? (KeyFrameConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87b45a75abadccb7f4aa5b24132476ce") : new KeyFrameConfig();
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @Expose
        public double[] keyTimes;
        @Expose
        public PicassoPath path;
        @Expose
        public String[] values;

        @Override // com.dianping.jscore.model.Decoding
        public void decode(Unarchived unarchived) throws ArchiveException {
            Object[] objArr = {unarchived};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1fe1d926b99d851e1d964c50da442e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1fe1d926b99d851e1d964c50da442e5");
                return;
            }
            while (true) {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 <= 0) {
                    return;
                }
                if (readMemberHash16 == 25637) {
                    this.path = (PicassoPath) unarchived.readObject(PicassoPath.DECODING_FACTORY);
                } else if (readMemberHash16 == 39975) {
                    this.keyTimes = unarchived.readDoubleArray();
                } else if (readMemberHash16 == 40226) {
                    this.values = unarchived.readStringArray();
                } else {
                    unarchived.skipAny();
                }
            }
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18d1710c2ba90c1ce41bdb697e417937", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18d1710c2ba90c1ce41bdb697e417937")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            KeyFrameConfig keyFrameConfig = (KeyFrameConfig) obj;
            return Arrays.equals(this.keyTimes, keyFrameConfig.keyTimes) && Arrays.equals(this.values, keyFrameConfig.values) && Objects.equals(this.path, keyFrameConfig.path);
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3253397cb88a32a881938c0f2a4f9c02", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3253397cb88a32a881938c0f2a4f9c02")).intValue() : (((Objects.hash(this.path) * 31) + Arrays.hashCode(this.keyTimes)) * 31) + Arrays.hashCode(this.values);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class PicassoPath implements Decoding {
        public static final DecodingFactory<PicassoPath> DECODING_FACTORY = new DecodingFactory<PicassoPath>() { // from class: com.dianping.picasso.model.AnimationInfoModel.PicassoPath.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.dianping.jscore.model.DecodingFactory
            public final PicassoPath[] createArray(int i) {
                return new PicassoPath[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.dianping.jscore.model.DecodingFactory
            public final PicassoPath createInstance() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cac0694697546901951beec00927ca2", RobustBitConfig.DEFAULT_VALUE) ? (PicassoPath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cac0694697546901951beec00927ca2") : new PicassoPath();
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @Expose
        public PointModel startPoint;
        @Expose
        public PicassoSubPath[] subPaths;

        @Override // com.dianping.jscore.model.Decoding
        public void decode(Unarchived unarchived) throws ArchiveException {
            Object[] objArr = {unarchived};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d85209ef276124bc07dd5fac1b8ed5e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d85209ef276124bc07dd5fac1b8ed5e8");
                return;
            }
            while (true) {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 <= 0) {
                    return;
                }
                if (readMemberHash16 == 3662) {
                    this.startPoint = (PointModel) unarchived.readObject(PointModel.POINT_MODEL_DECODING_FACTORY);
                } else if (readMemberHash16 == 23182) {
                    this.subPaths = (PicassoSubPath[]) unarchived.readArray(PicassoSubPath.DECODING_FACTORY);
                } else {
                    unarchived.skipAny();
                }
            }
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7a3bd09db3d3f8115a8f6b0e79712c2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7a3bd09db3d3f8115a8f6b0e79712c2")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PicassoPath picassoPath = (PicassoPath) obj;
            return Objects.equals(this.startPoint, picassoPath.startPoint) && Arrays.equals(this.subPaths, picassoPath.subPaths);
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7d81545f59c84b14364875549a39edc8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7d81545f59c84b14364875549a39edc8")).intValue() : (Objects.hash(this.startPoint) * 31) + Arrays.hashCode(this.subPaths);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class PicassoSubPath implements Decoding {
        public static final DecodingFactory<PicassoSubPath> DECODING_FACTORY = new DecodingFactory<PicassoSubPath>() { // from class: com.dianping.picasso.model.AnimationInfoModel.PicassoSubPath.1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.dianping.jscore.model.DecodingFactory
            public final PicassoSubPath[] createArray(int i) {
                return new PicassoSubPath[i];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.dianping.jscore.model.DecodingFactory
            public final PicassoSubPath createInstance() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc043feba964af4d26f73f7a2784d2d5", RobustBitConfig.DEFAULT_VALUE) ? (PicassoSubPath) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc043feba964af4d26f73f7a2784d2d5") : new PicassoSubPath();
            }
        };
        public static ChangeQuickRedirect changeQuickRedirect;
        @Expose
        public PointModel control1;
        @Expose
        public PointModel control2;
        @Expose
        public PointModel end;
        @Expose
        public int pathType;

        @Override // com.dianping.jscore.model.Decoding
        public void decode(Unarchived unarchived) throws ArchiveException {
            Object[] objArr = {unarchived};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f58c38ac2665a33770b3840eaa539a36", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f58c38ac2665a33770b3840eaa539a36");
                return;
            }
            while (true) {
                int readMemberHash16 = unarchived.readMemberHash16();
                if (readMemberHash16 > 0) {
                    switch (readMemberHash16) {
                        case 18036:
                            this.control1 = (PointModel) unarchived.readObject(PointModel.POINT_MODEL_DECODING_FACTORY);
                            break;
                        case 18037:
                            this.control2 = (PointModel) unarchived.readObject(PointModel.POINT_MODEL_DECODING_FACTORY);
                            break;
                        case 35035:
                            this.end = (PointModel) unarchived.readObject(PointModel.POINT_MODEL_DECODING_FACTORY);
                            break;
                        case 52479:
                            this.pathType = (int) unarchived.readDouble();
                            break;
                        default:
                            unarchived.skipAny();
                            break;
                    }
                } else {
                    return;
                }
            }
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c0b91ead32653b5038fd18783090610", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c0b91ead32653b5038fd18783090610")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PicassoSubPath picassoSubPath = (PicassoSubPath) obj;
            return Objects.equals(this.control1, picassoSubPath.control1) && Objects.equals(this.control2, picassoSubPath.control2) && Objects.equals(this.end, picassoSubPath.end);
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3434a4bb83ca7dcc745f59e1da02915b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3434a4bb83ca7dcc745f59e1da02915b")).intValue() : Objects.hash(this.control1, this.control2, this.end);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class SpringInterpolator implements Interpolator {
        public static ChangeQuickRedirect changeQuickRedirect;
        public float factor;

        public SpringInterpolator(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fda328ac222f8654849145c0d0e5d4e0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fda328ac222f8654849145c0d0e5d4e0");
            } else {
                this.factor = f;
            }
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c41b6e52a748b670ec3b5b9de30e63d", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c41b6e52a748b670ec3b5b9de30e63d")).floatValue() : (float) ((Math.pow(2.0d, (-10.0f) * f) * Math.sin(((f - (this.factor / 4.0f)) * 6.283185307179586d) / this.factor)) + 1.0d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class PositionEvaluator implements TypeEvaluator<PointF> {
        public static ChangeQuickRedirect changeQuickRedirect;
        private PointF mPoint;

        @Override // android.animation.TypeEvaluator
        public PointF evaluate(float f, PointF pointF, PointF pointF2) {
            Object[] objArr = {Float.valueOf(f), pointF, pointF2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79f84cef9a0116d7e0ef820edca6d933", RobustBitConfig.DEFAULT_VALUE)) {
                return (PointF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79f84cef9a0116d7e0ef820edca6d933");
            }
            PointF pointF3 = this.mPoint;
            if (pointF3 == null) {
                pointF3 = new PointF();
            }
            pointF3.x = pointF.x + ((pointF2.x - pointF.x) * f);
            pointF3.y = pointF.y + (f * (pointF2.y - pointF.y));
            return pointF3;
        }
    }
}
