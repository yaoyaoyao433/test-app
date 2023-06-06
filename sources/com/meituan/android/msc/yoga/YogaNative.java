package com.meituan.android.msc.yoga;

import com.meituan.android.msc.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public class YogaNative {
    public static native void jni_YGConfigFreeJNI(long j);

    public static native long jni_YGConfigNewJNI();

    public static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long j, int i, boolean z);

    public static native void jni_YGConfigSetLoggerJNI(long j, YogaLogger yogaLogger);

    public static native void jni_YGConfigSetPointScaleFactorJNI(long j, float f);

    public static native void jni_YGConfigSetPrintTreeFlagJNI(long j, boolean z);

    public static native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviourJNI(long j, boolean z);

    public static native void jni_YGConfigSetUseLegacyStretchBehaviourJNI(long j, boolean z);

    public static native void jni_YGConfigSetUseWebDefaultsJNI(long j, boolean z);

    public static native void jni_YGNodeCalculateLayoutJNI(long j, float f, float f2, long[] jArr, YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    public static native void jni_YGNodeClearChildrenJNI(long j);

    public static native long jni_YGNodeCloneJNI(long j);

    public static native void jni_YGNodeCopyStyleJNI(long j, long j2);

    public static native void jni_YGNodeFreeJNI(long j);

    public static native long[] jni_YGNodeGetAllSortedDrawingChildrenNativePointIds(long j);

    public static native int[] jni_YGNodeGetAllSortedDrawingChildrenRNTags(long j);

    public static native long jni_YGNodeGetContainingBlock(long j);

    public static native void jni_YGNodeInsertChildJNI(long j, long j2, int i);

    public static native boolean jni_YGNodeIsDirtyJNI(long j);

    public static native boolean jni_YGNodeIsReferenceBaselineJNI(long j);

    public static native boolean jni_YGNodeIsRootViewFuncJNI(long j);

    public static native void jni_YGNodeMarkDirtyAndPropogateToDescendantsJNI(long j);

    public static native void jni_YGNodeMarkDirtyJNI(long j);

    public static native long jni_YGNodeNewJNI();

    public static native long jni_YGNodeNewWithConfigJNI(long j);

    public static native void jni_YGNodePrintJNI(long j);

    public static native void jni_YGNodeRemoveChildJNI(long j, long j2);

    public static native void jni_YGNodeRemoveChildWithoutPositionOPJNI(long j, long j2);

    public static native void jni_YGNodeResetJNI(long j);

    public static native void jni_YGNodeSetClassNames(long j, String str);

    public static native void jni_YGNodeSetHasBaselineFuncJNI(long j, boolean z);

    public static native void jni_YGNodeSetHasMeasureFuncJNI(long j, boolean z);

    public static native void jni_YGNodeSetIdForStyle(long j, String str);

    public static native void jni_YGNodeSetInlineStyle(long j, String str);

    public static native void jni_YGNodeSetIsReferenceBaselineJNI(long j, boolean z);

    public static native void jni_YGNodeSetIsRootViewFuncJNI(long j, boolean z);

    public static native void jni_YGNodeSetIsVirtual(long j, boolean z);

    public static native void jni_YGNodeSetRNTag(long j, int i);

    public static native void jni_YGNodeSetRenderTypeJNI(long j, int i);

    public static native void jni_YGNodeSetStyleInputsJNI(long j, float[] fArr, int i);

    public static native void jni_YGNodeSetViewTagName(long j, String str);

    public static native void jni_YGNodeSetZIndex(long j, int i);

    public static native int jni_YGNodeStyleGetAlignContentJNI(long j);

    public static native int jni_YGNodeStyleGetAlignItemsJNI(long j);

    public static native int jni_YGNodeStyleGetAlignSelfJNI(long j);

    public static native float jni_YGNodeStyleGetAspectRatioJNI(long j);

    public static native float jni_YGNodeStyleGetBorderJNI(long j, int i);

    public static native int jni_YGNodeStyleGetDirectionJNI(long j);

    public static native int jni_YGNodeStyleGetDisplayJNI(long j);

    public static native long jni_YGNodeStyleGetFlexBasisJNI(long j);

    public static native int jni_YGNodeStyleGetFlexDirectionJNI(long j);

    public static native float jni_YGNodeStyleGetFlexGrowJNI(long j);

    public static native float jni_YGNodeStyleGetFlexJNI(long j);

    public static native float jni_YGNodeStyleGetFlexShrinkJNI(long j);

    public static native int jni_YGNodeStyleGetFlexWrapJNI(long j);

    public static native long jni_YGNodeStyleGetHeightJNI(long j);

    public static native int jni_YGNodeStyleGetJustifyContentJNI(long j);

    public static native long jni_YGNodeStyleGetMarginJNI(long j, int i);

    public static native long jni_YGNodeStyleGetMaxHeightJNI(long j);

    public static native long jni_YGNodeStyleGetMaxWidthJNI(long j);

    public static native long jni_YGNodeStyleGetMinHeightJNI(long j);

    public static native long jni_YGNodeStyleGetMinWidthJNI(long j);

    public static native int jni_YGNodeStyleGetOverflowJNI(long j);

    public static native long jni_YGNodeStyleGetPaddingJNI(long j, int i);

    public static native long jni_YGNodeStyleGetPositionJNI(long j, int i);

    public static native int jni_YGNodeStyleGetPositionTypeJNI(long j);

    public static native long jni_YGNodeStyleGetWidthJNI(long j);

    public static native void jni_YGNodeStyleSetAlignContentJNI(long j, int i);

    public static native void jni_YGNodeStyleSetAlignItemsJNI(long j, int i);

    public static native void jni_YGNodeStyleSetAlignSelfJNI(long j, int i);

    public static native void jni_YGNodeStyleSetAspectRatioJNI(long j, float f);

    public static native void jni_YGNodeStyleSetBorderJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetDirectionJNI(long j, int i);

    public static native void jni_YGNodeStyleSetDisplayJNI(long j, int i);

    public static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long j);

    public static native void jni_YGNodeStyleSetFlexBasisJNI(long j, float f);

    public static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long j, float f);

    public static native void jni_YGNodeStyleSetFlexDirectionJNI(long j, int i);

    public static native void jni_YGNodeStyleSetFlexGrowJNI(long j, float f);

    public static native void jni_YGNodeStyleSetFlexJNI(long j, float f);

    public static native void jni_YGNodeStyleSetFlexShrinkJNI(long j, float f);

    public static native void jni_YGNodeStyleSetFlexWrapJNI(long j, int i);

    public static native void jni_YGNodeStyleSetHeightAutoJNI(long j);

    public static native void jni_YGNodeStyleSetHeightJNI(long j, float f);

    public static native void jni_YGNodeStyleSetHeightPercentJNI(long j, float f);

    public static native void jni_YGNodeStyleSetJustifyContentJNI(long j, int i);

    public static native void jni_YGNodeStyleSetMarginAutoJNI(long j, int i);

    public static native void jni_YGNodeStyleSetMarginJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMarginPercentJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMaxHeightJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidthJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeightJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeightPercentJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidthJNI(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidthPercentJNI(long j, float f);

    public static native void jni_YGNodeStyleSetOverflowJNI(long j, int i);

    public static native void jni_YGNodeStyleSetPaddingJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPaddingPercentJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionPercentJNI(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionTypeJNI(long j, int i);

    public static native void jni_YGNodeStyleSetWidthAutoJNI(long j);

    public static native void jni_YGNodeStyleSetWidthJNI(long j, float f);

    public static native void jni_YGNodeStyleSetWidthPercentJNI(long j, float f);

    public static native void jni_YGNodeSwapChildJNI(long j, long j2, int i);

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        com.meituan.android.soloader.k.a("msccsslib", arrayList);
    }
}
