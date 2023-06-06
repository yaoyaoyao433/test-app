package com.dianping.shield.dynamic.diff.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.support.v4.view.GravityCompat;
import android.view.ViewGroup;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.items.paintingcallback.DynamicViewPaintingCallback;
import com.dianping.shield.dynamic.model.DiffableInfo;
import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.model.view.BaseViewInfo;
import com.dianping.shield.dynamic.model.view.FixedMarginViewInfo;
import com.dianping.shield.dynamic.model.view.HoverViewInfo;
import com.dianping.shield.dynamic.model.view.ViewInfo;
import com.dianping.shield.dynamic.objects.DynamicModuleViewData;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.dynamic.utils.DMViewUtils;
import com.dianping.shield.node.useritem.FloatViewItem;
import com.dianping.shield.node.useritem.ViewItem;
import com.dianping.util.j;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJI\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00012\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010(J\u0015\u0010)\u001a\u00020\u00142\u0006\u0010'\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010(R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011¨\u0006*"}, d2 = {"Lcom/dianping/shield/dynamic/diff/view/HoverViewInfoDiff;", "T", "Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;", "V", "Lcom/dianping/shield/node/useritem/FloatViewItem;", "Lcom/dianping/shield/dynamic/diff/view/FixedMarginViewInfoDiff;", "hostChassis", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "(Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;)V", "floatViewItem", "getFloatViewItem", "()Lcom/dianping/shield/node/useritem/FloatViewItem;", "floatViewItem$delegate", "Lkotlin/Lazy;", "viewPaintingCallback", "Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "getViewPaintingCallback", "()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;", "viewPaintingCallback$delegate", "diffChildren", "", "newInfo", "computingItem", "diffResult", "Ljava/util/ArrayList;", "Lcom/dianping/shield/dynamic/agent/node/ComputeUnit;", "Lkotlin/collections/ArrayList;", "suggestWidth", "", "suggestHeight", "(Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;Lcom/dianping/shield/node/useritem/FloatViewItem;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setHoverInAnimationType", "popInAnimationType", "Lcom/dianping/shield/dynamic/utils/DMConstant$PopAnimationType;", "rectangleHover", "Landroid/graphics/RectF;", "setHoverOutAnimationType", "popOutAnimationType", "updateFloatViewProps", "info", "(Lcom/dianping/shield/dynamic/model/view/HoverViewInfo;)V", "updateProps", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoverViewInfoDiff<T extends HoverViewInfo, V extends FloatViewItem> extends FixedMarginViewInfoDiff<T, V> {
    public static final /* synthetic */ i[] $$delegatedProperties = {u.a(new s(u.a(HoverViewInfoDiff.class), "floatViewItem", "getFloatViewItem()Lcom/dianping/shield/node/useritem/FloatViewItem;")), u.a(new s(u.a(HoverViewInfoDiff.class), "viewPaintingCallback", "getViewPaintingCallback()Lcom/dianping/shield/dynamic/items/paintingcallback/DynamicViewPaintingCallback;"))};
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final d floatViewItem$delegate;
    @NotNull
    private final d viewPaintingCallback$delegate;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            int[] iArr = new int[DMConstant.PopAnimationType.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DMConstant.PopAnimationType.PopAnimationTypeFade.ordinal()] = 1;
            $EnumSwitchMapping$0[DMConstant.PopAnimationType.PopAnimationTypeLeft.ordinal()] = 2;
            $EnumSwitchMapping$0[DMConstant.PopAnimationType.PopAnimationTypeRight.ordinal()] = 3;
            $EnumSwitchMapping$0[DMConstant.PopAnimationType.PopAnimationTypeTop.ordinal()] = 4;
            $EnumSwitchMapping$0[DMConstant.PopAnimationType.PopAnimationTypeBottom.ordinal()] = 5;
            int[] iArr2 = new int[DMConstant.PopAnimationType.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[DMConstant.PopAnimationType.PopAnimationTypeFade.ordinal()] = 1;
            $EnumSwitchMapping$1[DMConstant.PopAnimationType.PopAnimationTypeLeft.ordinal()] = 2;
            $EnumSwitchMapping$1[DMConstant.PopAnimationType.PopAnimationTypeRight.ordinal()] = 3;
            $EnumSwitchMapping$1[DMConstant.PopAnimationType.PopAnimationTypeTop.ordinal()] = 4;
            $EnumSwitchMapping$1[DMConstant.PopAnimationType.PopAnimationTypeBottom.ordinal()] = 5;
        }
    }

    @NotNull
    public final FloatViewItem getFloatViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (FloatViewItem) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d200932a01c979986579a808697ed4d", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d200932a01c979986579a808697ed4d") : this.floatViewItem$delegate.a());
    }

    @Override // com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    @NotNull
    public final DynamicViewPaintingCallback getViewPaintingCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (DynamicViewPaintingCallback) (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44c46bd047b6cbfdbfc5658b4731b323", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44c46bd047b6cbfdbfc5658b4731b323") : this.viewPaintingCallback$delegate.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.FixedMarginViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void diffChildren(DiffableInfo diffableInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((HoverViewInfoDiff<T, V>) ((HoverViewInfo) diffableInfo), (HoverViewInfo) ((FloatViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.FixedMarginViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(BaseViewInfo baseViewInfo, Object obj, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((HoverViewInfoDiff<T, V>) ((HoverViewInfo) baseViewInfo), (HoverViewInfo) ((FloatViewItem) obj), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.FixedMarginViewInfoDiff
    public final /* bridge */ /* synthetic */ void diffChildren(FixedMarginViewInfo fixedMarginViewInfo, ViewItem viewItem, ArrayList arrayList, Integer num, Integer num2) {
        diffChildren((HoverViewInfoDiff<T, V>) ((HoverViewInfo) fixedMarginViewInfo), (HoverViewInfo) ((FloatViewItem) viewItem), (ArrayList<ComputeUnit>) arrayList, num, num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff, com.dianping.shield.dynamic.diff.DynamicBaseDiff
    public final /* bridge */ /* synthetic */ void updateProps(DiffableInfo diffableInfo) {
        updateProps((HoverViewInfoDiff<T, V>) ((HoverViewInfo) diffableInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff, com.dianping.shield.dynamic.diff.view.BaseViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(BaseViewInfo baseViewInfo) {
        updateProps((HoverViewInfoDiff<T, V>) ((HoverViewInfo) baseViewInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.dianping.shield.dynamic.diff.view.ViewInfoDiff
    public final /* bridge */ /* synthetic */ void updateProps(ViewInfo viewInfo) {
        updateProps((HoverViewInfoDiff<T, V>) ((HoverViewInfo) viewInfo));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverViewInfoDiff(@NotNull DynamicChassisInterface dynamicChassisInterface) {
        super(dynamicChassisInterface);
        h.b(dynamicChassisInterface, "hostChassis");
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d575cb2a85665c4e386bf23f5b0d1b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d575cb2a85665c4e386bf23f5b0d1b0");
            return;
        }
        this.floatViewItem$delegate = e.a(kotlin.i.NONE, new HoverViewInfoDiff$floatViewItem$2(this));
        this.viewPaintingCallback$delegate = e.a(kotlin.i.NONE, new HoverViewInfoDiff$viewPaintingCallback$2(this, dynamicChassisInterface));
    }

    public final void diffChildren(@NotNull T t, @NotNull V v, @NotNull ArrayList<ComputeUnit> arrayList, @Nullable Integer num, @Nullable Integer num2) {
        Object[] objArr = {t, v, arrayList, num, num2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e30779cbbd47a9187fece1e64603c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e30779cbbd47a9187fece1e64603c0e");
            return;
        }
        h.b(t, "newInfo");
        h.b(v, "computingItem");
        h.b(arrayList, "diffResult");
        super.diffChildren((HoverViewInfoDiff<T, V>) t, (T) v, arrayList, Integer.valueOf(j.b(getHostChassis().getHostContext(), j.a(getHostChassis().getHostContext()))), Integer.valueOf(j.b(getHostChassis().getHostContext(), DMViewUtils.getWindowDisplayHeight(getHostChassis().getHostContext())) - DMUtils.getTitleBarHeight()));
    }

    public final void updateProps(@NotNull T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5274bf628f674df499adb89d7002144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5274bf628f674df499adb89d7002144");
            return;
        }
        h.b(t, "info");
        super.updateProps((HoverViewInfoDiff<T, V>) t);
        updateFloatViewProps(t);
    }

    private final void updateFloatViewProps(T t) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer rightMargin;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        Integer bottomMargin;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        Integer topMargin;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        Integer leftMargin;
        DynamicModuleViewData dynamicModuleViewData;
        DynamicModuleViewData dynamicModuleViewData2;
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc46b49f4e558794ee30f3aea3479819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc46b49f4e558794ee30f3aea3479819");
            return;
        }
        getFloatViewItem().gravity = 17;
        Context hostContext = getHostChassis().getHostContext();
        Object obj = getViewItem().data;
        if (!(obj instanceof DynamicModuleViewItemData)) {
            obj = null;
        }
        DynamicModuleViewItemData dynamicModuleViewItemData = (DynamicModuleViewItemData) obj;
        int a = aq.a(hostContext, (dynamicModuleViewItemData == null || (dynamicModuleViewData2 = dynamicModuleViewItemData.viewData) == null) ? 0.0f : dynamicModuleViewData2.getInputHeight());
        Context hostContext2 = getHostChassis().getHostContext();
        Object obj2 = getViewItem().data;
        DynamicModuleViewItemData dynamicModuleViewItemData2 = obj2 instanceof DynamicModuleViewItemData ? obj2 : null;
        int a2 = aq.a(hostContext2, (dynamicModuleViewItemData2 == null || (dynamicModuleViewData = dynamicModuleViewItemData2.viewData) == null) ? 0.0f : dynamicModuleViewData.getInputWidth());
        RectF rectF = new RectF();
        float f = a2;
        rectF.left = (DMViewUtils.getRecyclerWidth(getHostChassis()) / 2.0f) - (f / 2.0f);
        float f2 = a;
        rectF.top = (DMViewUtils.getWindowDisplayHeight(getHostChassis().getHostContext()) / 2.0f) - (f2 / 2.0f);
        rectF.right = rectF.left + f;
        rectF.bottom = rectF.top + f2;
        MarginInfo fixedMarginInfo = t.getFixedMarginInfo();
        if (fixedMarginInfo != null) {
            getFloatViewItem().layoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            if (fixedMarginInfo.getLeftMargin() != null) {
                getFloatViewItem().gravity |= GravityCompat.START;
                rectF.left = getFloatViewItem().layoutParams != null ? marginLayoutParams4.leftMargin : 0.0f;
                ViewGroup.MarginLayoutParams marginLayoutParams5 = getFloatViewItem().layoutParams;
                if (marginLayoutParams5 != null) {
                    Context hostContext3 = getHostChassis().getHostContext();
                    if (fixedMarginInfo.getLeftMargin() == null) {
                        h.a();
                    }
                    marginLayoutParams5.leftMargin = aq.a(hostContext3, leftMargin.intValue());
                }
            } else if (fixedMarginInfo.getRightMargin() != null) {
                getFloatViewItem().gravity |= GravityCompat.END;
                rectF.left = (DMViewUtils.getRecyclerWidth(getHostChassis()) - (getFloatViewItem().layoutParams != null ? marginLayoutParams.rightMargin : 0)) - f;
                ViewGroup.MarginLayoutParams marginLayoutParams6 = getFloatViewItem().layoutParams;
                if (marginLayoutParams6 != null) {
                    Context hostContext4 = getHostChassis().getHostContext();
                    if (fixedMarginInfo.getRightMargin() == null) {
                        h.a();
                    }
                    marginLayoutParams6.rightMargin = aq.a(hostContext4, rightMargin.intValue());
                }
            }
            if (fixedMarginInfo.getTopMargin() != null) {
                getFloatViewItem().gravity |= 48;
                rectF.top = getFloatViewItem().layoutParams != null ? marginLayoutParams3.topMargin : 0.0f;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = getFloatViewItem().layoutParams;
                if (marginLayoutParams7 != null) {
                    Context hostContext5 = getHostChassis().getHostContext();
                    if (fixedMarginInfo.getTopMargin() == null) {
                        h.a();
                    }
                    marginLayoutParams7.topMargin = aq.a(hostContext5, topMargin.intValue());
                }
            } else if (fixedMarginInfo.getBottomMargin() != null) {
                getFloatViewItem().gravity |= 80;
                rectF.top = (DMViewUtils.getPageContainerHeight(getHostChassis()) - (getFloatViewItem().layoutParams != null ? marginLayoutParams2.bottomMargin : 0)) - f2;
                ViewGroup.MarginLayoutParams marginLayoutParams8 = getFloatViewItem().layoutParams;
                if (marginLayoutParams8 != null) {
                    Context hostContext6 = getHostChassis().getHostContext();
                    if (fixedMarginInfo.getBottomMargin() == null) {
                        h.a();
                    }
                    marginLayoutParams8.bottomMargin = aq.a(hostContext6, bottomMargin.intValue());
                }
            }
        }
        rectF.right = rectF.left + f;
        rectF.bottom = rectF.top + f2;
        DMConstant.PopAnimationType[] valuesCustom = DMConstant.PopAnimationType.valuesCustom();
        Integer showAnimationType = t.getShowAnimationType();
        setHoverInAnimationType(valuesCustom[showAnimationType != null ? showAnimationType.intValue() : 0], rectF);
        DMConstant.PopAnimationType[] valuesCustom2 = DMConstant.PopAnimationType.valuesCustom();
        Integer dismissAnimationType = t.getDismissAnimationType();
        setHoverOutAnimationType(valuesCustom2[dismissAnimationType != null ? dismissAnimationType.intValue() : 0], rectF);
        FloatViewItem floatViewItem = getFloatViewItem();
        Boolean needFollowScroll = t.getNeedFollowScroll();
        floatViewItem.needFollowScroll = needFollowScroll != null ? needFollowScroll.booleanValue() : false;
    }

    private final void setHoverInAnimationType(DMConstant.PopAnimationType popAnimationType, RectF rectF) {
        Object[] objArr = {popAnimationType, rectF};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28e056442ac8d607df73bf83794524c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28e056442ac8d607df73bf83794524c1");
            return;
        }
        FloatViewItem floatViewItem = getFloatViewItem();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        switch (WhenMappings.$EnumSwitchMapping$0[popAnimationType.ordinal()]) {
            case 1:
                objectAnimator.setFloatValues(0.0f, 1.0f);
                objectAnimator.setPropertyName("alpha");
                break;
            case 2:
                objectAnimator.setFloatValues(-rectF.right, 0.0f);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_X);
                break;
            case 3:
                objectAnimator.setFloatValues(DMViewUtils.getRecyclerWidth(getHostChassis()) - rectF.left, 0.0f);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_X);
                break;
            case 4:
                objectAnimator.setFloatValues(-rectF.bottom, 0.0f);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_Y);
                break;
            case 5:
                objectAnimator.setFloatValues(DMViewUtils.getPageContainerHeight(getHostChassis()) - rectF.top, 0.0f);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_Y);
                break;
        }
        objectAnimator.setDuration(500L);
        floatViewItem.appearingAnimator = objectAnimator;
        if (popAnimationType == DMConstant.PopAnimationType.PopAnimationTypeNone) {
            getFloatViewItem().appearingAnimator = null;
        }
    }

    private final void setHoverOutAnimationType(DMConstant.PopAnimationType popAnimationType, RectF rectF) {
        Object[] objArr = {popAnimationType, rectF};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa2f873fd83aa4678a853c403e5fc8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa2f873fd83aa4678a853c403e5fc8c");
            return;
        }
        FloatViewItem floatViewItem = getFloatViewItem();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        switch (WhenMappings.$EnumSwitchMapping$1[popAnimationType.ordinal()]) {
            case 1:
                objectAnimator.setFloatValues(1.0f, 0.0f);
                objectAnimator.setPropertyName("alpha");
                break;
            case 2:
                objectAnimator.setFloatValues(0.0f, -rectF.right);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_X);
                break;
            case 3:
                objectAnimator.setFloatValues(0.0f, DMViewUtils.getRecyclerWidth(getHostChassis()) - rectF.left);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_X);
                break;
            case 4:
                objectAnimator.setFloatValues(0.0f, -rectF.bottom);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_Y);
                break;
            case 5:
                objectAnimator.setFloatValues(0.0f, DMViewUtils.getPageContainerHeight(getHostChassis()) - rectF.top);
                objectAnimator.setPropertyName(RecceAnimUtils.TRANSLATION_Y);
                break;
        }
        objectAnimator.setDuration(500L);
        floatViewItem.disappearingAnimator = objectAnimator;
        if (popAnimationType == DMConstant.PopAnimationType.PopAnimationTypeNone) {
            getFloatViewItem().disappearingAnimator = null;
        }
    }
}
