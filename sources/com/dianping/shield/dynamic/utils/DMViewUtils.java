package com.dianping.shield.dynamic.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.aq;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMViewUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static List<IDynamicModuleViewItem> filterViewItemByViewType(List<IDynamicModuleViewItem> list, DMConstant.DynamicModuleViewType dynamicModuleViewType) {
        Object[] objArr = {list, dynamicModuleViewType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75cdabf12391db3a11159eefd0ac6409", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75cdabf12391db3a11159eefd0ac6409");
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            for (IDynamicModuleViewItem iDynamicModuleViewItem : list) {
                if (dynamicModuleViewType == iDynamicModuleViewItem.getViewItemData().getViewTypeInModel()) {
                    arrayList.add(iDynamicModuleViewItem);
                }
            }
        }
        return arrayList;
    }

    public static Animation crateTransitionAnimation(boolean z, DMConstant.PopAnimationType popAnimationType) {
        float f;
        float f2;
        float f3;
        float f4;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), popAnimationType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ae9f8993897cdb904f3f127aaafd448", RobustBitConfig.DEFAULT_VALUE)) {
            return (Animation) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ae9f8993897cdb904f3f127aaafd448");
        }
        if (popAnimationType == DMConstant.PopAnimationType.PopAnimationTypeNone) {
            return null;
        }
        if (popAnimationType == DMConstant.PopAnimationType.PopAnimationTypeFade) {
            if (z) {
                return new AlphaAnimation(0.0f, 1.0f);
            }
            return new AlphaAnimation(1.0f, 0.0f);
        }
        if (popAnimationType != DMConstant.PopAnimationType.PopAnimationTypeLeft) {
            if (popAnimationType == DMConstant.PopAnimationType.PopAnimationTypeRight) {
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                    f2 = 1.0f;
                    f3 = 0.0f;
                }
            } else if (popAnimationType == DMConstant.PopAnimationType.PopAnimationTypeTop) {
                if (!z) {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = -1.0f;
                    return new TranslateAnimation(1, f, 1, f2, 1, f3, 1, f4);
                }
                f = 0.0f;
                f2 = 0.0f;
                f3 = -1.0f;
            } else if (popAnimationType != DMConstant.PopAnimationType.PopAnimationTypeBottom) {
                f = 0.0f;
            } else if (!z) {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 0.0f;
                f4 = 1.0f;
                return new TranslateAnimation(1, f, 1, f2, 1, f3, 1, f4);
            } else {
                f = 0.0f;
                f2 = 0.0f;
                f3 = 1.0f;
            }
            f2 = 0.0f;
            f3 = 0.0f;
        } else if (z) {
            f = -1.0f;
            f2 = 0.0f;
            f3 = 0.0f;
        } else {
            f = 0.0f;
            f2 = -1.0f;
            f3 = 0.0f;
        }
        f4 = 0.0f;
        return new TranslateAnimation(1, f, 1, f2, 1, f3, 1, f4);
    }

    public static int getAutoLeftMargin(HoloAgent holoAgent) {
        Object[] objArr = {holoAgent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f663286dfca31c9adeb4c480f4614590", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f663286dfca31c9adeb4c480f4614590")).intValue();
        }
        int leftCellMargin = holoAgent instanceof DynamicAgent ? ((DynamicAgent) holoAgent).getLeftCellMargin() : 0;
        return leftCellMargin != 0 ? leftCellMargin : getDefaultAutoMargin();
    }

    public static int getAutoRightMargin(HoloAgent holoAgent) {
        Object[] objArr = {holoAgent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97885bbb9b0c79eac9384184c8da77a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97885bbb9b0c79eac9384184c8da77a9")).intValue();
        }
        int rightCellMargin = holoAgent instanceof DynamicAgent ? ((DynamicAgent) holoAgent).getRightCellMargin() : 0;
        return rightCellMargin != 0 ? rightCellMargin : getDefaultAutoMargin();
    }

    public static int getDefaultAutoMargin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ced5ab85921d8039566f1a251819d02", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ced5ab85921d8039566f1a251819d02")).intValue();
        }
        if (DMUtils.isMT()) {
            return 12;
        }
        return DMUtils.isDP() ? 15 : 0;
    }

    public static int getRecyclerWidth(DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bebbf7c1822cf5748b4aaf119915801", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bebbf7c1822cf5748b4aaf119915801")).intValue();
        }
        Rect innerMargin = dynamicChassisInterface.getContainerThemePackage().getInnerMargin();
        return (getPageContainerWidth(dynamicChassisInterface) - innerMargin.left) - innerMargin.right;
    }

    public static int getPageContainerWidth(DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e59b229e4f70f62d5555482eb38a7c71", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e59b229e4f70f62d5555482eb38a7c71")).intValue();
        }
        Rect outerMargin = dynamicChassisInterface.getContainerThemePackage().getOuterMargin();
        return (aq.a(dynamicChassisInterface.getHostContext()) - outerMargin.left) - outerMargin.right;
    }

    public static int getPageContainerHeight(DynamicChassisInterface dynamicChassisInterface) {
        Object[] objArr = {dynamicChassisInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e0c4eb0c7746b09c0aa06462c99fcfa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e0c4eb0c7746b09c0aa06462c99fcfa")).intValue();
        }
        Rect outerMargin = dynamicChassisInterface.getContainerThemePackage().getOuterMargin();
        return (getWindowDisplayHeight(dynamicChassisInterface.getHostContext()) - outerMargin.top) - outerMargin.bottom;
    }

    public static int getWindowDisplayHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "da4cc144dc57853b881213134a02fe27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "da4cc144dc57853b881213134a02fe27")).intValue();
        }
        if (context instanceof Activity) {
            Rect rect = new Rect();
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.height();
        }
        return aq.b(context);
    }
}
