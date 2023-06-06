package com.dianping.picasso;

import com.dianping.picasso.model.flex.FlexEdgeModel;
import com.dianping.picasso.model.flex.FlexStyleModel;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class FlexUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface IEdgeProcessor {
        void process(YogaEdge yogaEdge, float f);
    }

    public static void bindYogaStyle(final d dVar, FlexStyleModel flexStyleModel) {
        Object[] objArr = {dVar, flexStyleModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08354fb6ed9d479488a20e2e57af6877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08354fb6ed9d479488a20e2e57af6877");
        } else if (flexStyleModel == null) {
        } else {
            if (flexStyleModel.direction != -1) {
                dVar.a(YogaDirection.a(flexStyleModel.direction));
            }
            if (flexStyleModel.flexDirection != -1) {
                dVar.a(YogaFlexDirection.a(flexStyleModel.flexDirection));
            }
            if (flexStyleModel.justifyContent != -1) {
                dVar.a(YogaJustify.a(flexStyleModel.justifyContent));
            }
            if (flexStyleModel.alignContent != -1) {
                dVar.c(YogaAlign.a(flexStyleModel.alignContent));
            }
            if (flexStyleModel.alignItems != -1) {
                dVar.a(YogaAlign.a(flexStyleModel.alignItems));
            }
            if (flexStyleModel.alignSelf != -1) {
                dVar.b(YogaAlign.a(flexStyleModel.alignSelf));
            }
            if (flexStyleModel.positionType != -1) {
                dVar.a(YogaPositionType.a(flexStyleModel.positionType));
            }
            if (flexStyleModel.wrap != -1) {
                dVar.a(YogaWrap.a(flexStyleModel.wrap));
            }
            if (flexStyleModel.overflow != -1) {
                dVar.a(YogaOverflow.a(flexStyleModel.overflow));
            }
            if (!Float.isNaN(flexStyleModel.flex)) {
                dVar.a(flexStyleModel.flex);
            }
            if (!Float.isNaN(flexStyleModel.flexGrow)) {
                dVar.b(flexStyleModel.flexGrow);
            }
            if (!Float.isNaN(flexStyleModel.flexShrink)) {
                dVar.c(flexStyleModel.flexShrink);
            }
            if (!Float.isNaN(flexStyleModel.flexBasis)) {
                dVar.d(flexStyleModel.flexBasis);
            }
            if (!Float.isNaN(flexStyleModel.width)) {
                dVar.f(flexStyleModel.width);
            }
            if (!Float.isNaN(flexStyleModel.height)) {
                dVar.h(flexStyleModel.height);
            }
            if (!Float.isNaN(flexStyleModel.maxWidth)) {
                dVar.n(flexStyleModel.maxWidth);
            }
            if (!Float.isNaN(flexStyleModel.maxHeight)) {
                dVar.p(flexStyleModel.maxHeight);
            }
            if (!Float.isNaN(flexStyleModel.minWidth)) {
                dVar.j(flexStyleModel.minWidth);
            }
            if (!Float.isNaN(flexStyleModel.minHeight)) {
                dVar.l(flexStyleModel.minHeight);
            }
            if (!Float.isNaN(flexStyleModel.widthPercent)) {
                dVar.g(flexStyleModel.widthPercent);
            }
            if (!Float.isNaN(flexStyleModel.heightPercent)) {
                dVar.i(flexStyleModel.heightPercent);
            }
            if (!Float.isNaN(flexStyleModel.minWidthPercent)) {
                dVar.k(flexStyleModel.minWidthPercent);
            }
            if (!Float.isNaN(flexStyleModel.minHeightPercent)) {
                dVar.m(flexStyleModel.minHeightPercent);
            }
            if (!Float.isNaN(flexStyleModel.maxWidthPercent)) {
                dVar.o(flexStyleModel.maxWidthPercent);
            }
            if (!Float.isNaN(flexStyleModel.maxHeightPercent)) {
                dVar.q(flexStyleModel.maxHeightPercent);
            }
            processEdge(flexStyleModel.margin, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "78b8f7f3fba1214c1034b6dabdfcf0e0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "78b8f7f3fba1214c1034b6dabdfcf0e0");
                    } else {
                        d.this.a(yogaEdge, f);
                    }
                }
            });
            processEdgePercent(flexStyleModel.margin, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9ef5f5d5920b44716617f8dabe6dc1f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9ef5f5d5920b44716617f8dabe6dc1f9");
                    } else {
                        d.this.b(yogaEdge, f);
                    }
                }
            });
            processEdge(flexStyleModel.position, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.3
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd011b9baf032e9139c56cfa4c494a94", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd011b9baf032e9139c56cfa4c494a94");
                    } else {
                        d.this.f(yogaEdge, f);
                    }
                }
            });
            processEdgePercent(flexStyleModel.position, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "33a86d15da764235eb1fe3360f3407aa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "33a86d15da764235eb1fe3360f3407aa");
                    } else {
                        d.this.g(yogaEdge, f);
                    }
                }
            });
            processEdge(flexStyleModel.padding, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8cb93109bdd71005ca2535e2f5f63a33", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8cb93109bdd71005ca2535e2f5f63a33");
                    } else {
                        d.this.c(yogaEdge, f);
                    }
                }
            });
            processEdgePercent(flexStyleModel.padding, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "62fcff115c716f2c32ef5761fdedb7b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "62fcff115c716f2c32ef5761fdedb7b2");
                    } else {
                        d.this.d(yogaEdge, f);
                    }
                }
            });
            processEdge(flexStyleModel.border, new IEdgeProcessor() { // from class: com.dianping.picasso.FlexUtils.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.picasso.FlexUtils.IEdgeProcessor
                public final void process(YogaEdge yogaEdge, float f) {
                    Object[] objArr2 = {yogaEdge, Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a90ff5fb830abb2cce1f67d092575941", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a90ff5fb830abb2cce1f67d092575941");
                    } else {
                        d.this.e(yogaEdge, f);
                    }
                }
            });
        }
    }

    private static void processEdge(FlexEdgeModel flexEdgeModel, IEdgeProcessor iEdgeProcessor) {
        Object[] objArr = {flexEdgeModel, iEdgeProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d039d62c3dc62d7fa65fbd854d8b755b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d039d62c3dc62d7fa65fbd854d8b755b");
        } else if (flexEdgeModel == null) {
        } else {
            if (!Float.isNaN(flexEdgeModel.left)) {
                iEdgeProcessor.process(YogaEdge.LEFT, flexEdgeModel.left);
            }
            if (!Float.isNaN(flexEdgeModel.top)) {
                iEdgeProcessor.process(YogaEdge.TOP, flexEdgeModel.top);
            }
            if (!Float.isNaN(flexEdgeModel.right)) {
                iEdgeProcessor.process(YogaEdge.RIGHT, flexEdgeModel.right);
            }
            if (!Float.isNaN(flexEdgeModel.bottom)) {
                iEdgeProcessor.process(YogaEdge.BOTTOM, flexEdgeModel.bottom);
            }
            if (!Float.isNaN(flexEdgeModel.start)) {
                iEdgeProcessor.process(YogaEdge.START, flexEdgeModel.start);
            }
            if (!Float.isNaN(flexEdgeModel.end)) {
                iEdgeProcessor.process(YogaEdge.END, flexEdgeModel.end);
            }
            if (!Float.isNaN(flexEdgeModel.horizontal)) {
                iEdgeProcessor.process(YogaEdge.HORIZONTAL, flexEdgeModel.horizontal);
            }
            if (!Float.isNaN(flexEdgeModel.vertical)) {
                iEdgeProcessor.process(YogaEdge.VERTICAL, flexEdgeModel.vertical);
            }
            if (Float.isNaN(flexEdgeModel.all)) {
                return;
            }
            iEdgeProcessor.process(YogaEdge.ALL, flexEdgeModel.all);
        }
    }

    private static void processEdgePercent(FlexEdgeModel flexEdgeModel, IEdgeProcessor iEdgeProcessor) {
        Object[] objArr = {flexEdgeModel, iEdgeProcessor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e84e05b02ba870c37456f8f6c8db3ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e84e05b02ba870c37456f8f6c8db3ce");
        } else if (flexEdgeModel == null) {
        } else {
            if (!Float.isNaN(flexEdgeModel.leftPercent)) {
                iEdgeProcessor.process(YogaEdge.LEFT, flexEdgeModel.leftPercent);
            }
            if (!Float.isNaN(flexEdgeModel.topPercent)) {
                iEdgeProcessor.process(YogaEdge.TOP, flexEdgeModel.topPercent);
            }
            if (!Float.isNaN(flexEdgeModel.rightPercent)) {
                iEdgeProcessor.process(YogaEdge.RIGHT, flexEdgeModel.rightPercent);
            }
            if (!Float.isNaN(flexEdgeModel.bottomPercent)) {
                iEdgeProcessor.process(YogaEdge.BOTTOM, flexEdgeModel.bottomPercent);
            }
            if (!Float.isNaN(flexEdgeModel.startPercent)) {
                iEdgeProcessor.process(YogaEdge.START, flexEdgeModel.startPercent);
            }
            if (!Float.isNaN(flexEdgeModel.endPercent)) {
                iEdgeProcessor.process(YogaEdge.END, flexEdgeModel.endPercent);
            }
            if (!Float.isNaN(flexEdgeModel.horizontalPercent)) {
                iEdgeProcessor.process(YogaEdge.HORIZONTAL, flexEdgeModel.horizontalPercent);
            }
            if (!Float.isNaN(flexEdgeModel.verticalPercent)) {
                iEdgeProcessor.process(YogaEdge.VERTICAL, flexEdgeModel.verticalPercent);
            }
            if (Float.isNaN(flexEdgeModel.allPercent)) {
                return;
            }
            iEdgeProcessor.process(YogaEdge.ALL, flexEdgeModel.allPercent);
        }
    }
}
