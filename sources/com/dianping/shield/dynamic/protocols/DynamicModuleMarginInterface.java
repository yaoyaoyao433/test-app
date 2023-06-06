package com.dianping.shield.dynamic.protocols;

import com.dianping.shield.dynamic.model.extra.MarginInfo;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0015H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0016R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\fX¦\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006#"}, d2 = {"Lcom/dianping/shield/dynamic/protocols/DynamicModuleMarginInterface;", "", "autoContentMargin", "", "getAutoContentMargin", "()Ljava/lang/Boolean;", "setAutoContentMargin", "(Ljava/lang/Boolean;)V", DMKeys.KEY_AUTO_MARGIN, "getAutoMargin", "setAutoMargin", DMKeys.KEY_CONTENT_MARGIN_INFO, "Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "getContentMarginInfo", "()Lcom/dianping/shield/dynamic/model/extra/MarginInfo;", "setContentMarginInfo", "(Lcom/dianping/shield/dynamic/model/extra/MarginInfo;)V", DMKeys.KEY_MARGIN_INFO, "getMarginInfo", "setMarginInfo", "getAutoLeftMargin", "", "getAutoRightMargin", "getBottomContentMargin", "getBottomMargin", "getHorizontalContentMargin", "getHorizontalMargin", "getLeftContentMargin", "getLeftMargin", "getRightContentMargin", "getRightMargin", "getTopContentMargin", "getTopMargin", "getVerticalContentMargin", "getVerticalMargin", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface DynamicModuleMarginInterface {
    @Nullable
    Boolean getAutoContentMargin();

    int getAutoLeftMargin();

    @Nullable
    Boolean getAutoMargin();

    int getAutoRightMargin();

    int getBottomContentMargin();

    int getBottomMargin();

    @Nullable
    MarginInfo getContentMarginInfo();

    int getHorizontalContentMargin();

    int getHorizontalMargin();

    int getLeftContentMargin();

    int getLeftMargin();

    @Nullable
    MarginInfo getMarginInfo();

    int getRightContentMargin();

    int getRightMargin();

    int getTopContentMargin();

    int getTopMargin();

    int getVerticalContentMargin();

    int getVerticalMargin();

    void setAutoContentMargin(@Nullable Boolean bool);

    void setAutoMargin(@Nullable Boolean bool);

    void setContentMarginInfo(@Nullable MarginInfo marginInfo);

    void setMarginInfo(@Nullable MarginInfo marginInfo);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        public static int getTopMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer topMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63056f8bee5384fb5c359610d22135df", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63056f8bee5384fb5c359610d22135df")).intValue();
            }
            MarginInfo marginInfo = dynamicModuleMarginInterface.getMarginInfo();
            if (marginInfo == null || (topMargin = marginInfo.getTopMargin()) == null) {
                return 0;
            }
            return topMargin.intValue();
        }

        public static int getTopContentMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer topMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3812ba25ed47a723405321748d16359", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3812ba25ed47a723405321748d16359")).intValue();
            }
            MarginInfo contentMarginInfo = dynamicModuleMarginInterface.getContentMarginInfo();
            if (contentMarginInfo == null || (topMargin = contentMarginInfo.getTopMargin()) == null) {
                return 0;
            }
            return topMargin.intValue();
        }

        public static int getBottomMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer bottomMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7824bf6ebb1e9874b2ec6cec4d19b7ad", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7824bf6ebb1e9874b2ec6cec4d19b7ad")).intValue();
            }
            MarginInfo marginInfo = dynamicModuleMarginInterface.getMarginInfo();
            if (marginInfo == null || (bottomMargin = marginInfo.getBottomMargin()) == null) {
                return 0;
            }
            return bottomMargin.intValue();
        }

        public static int getBottomContentMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer bottomMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6484ceed5071df80a3b37d5e4bafabcc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6484ceed5071df80a3b37d5e4bafabcc")).intValue();
            }
            MarginInfo contentMarginInfo = dynamicModuleMarginInterface.getContentMarginInfo();
            if (contentMarginInfo == null || (bottomMargin = contentMarginInfo.getBottomMargin()) == null) {
                return 0;
            }
            return bottomMargin.intValue();
        }

        public static int getLeftMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer leftMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02372312ef1b31233807f9c269469c09", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02372312ef1b31233807f9c269469c09")).intValue();
            }
            MarginInfo marginInfo = dynamicModuleMarginInterface.getMarginInfo();
            if (marginInfo == null || (leftMargin = marginInfo.getLeftMargin()) == null) {
                if (h.a(dynamicModuleMarginInterface.getAutoMargin(), Boolean.TRUE)) {
                    return dynamicModuleMarginInterface.getAutoLeftMargin();
                }
                return 0;
            }
            return leftMargin.intValue();
        }

        public static int getRightMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer rightMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99a909594fb7ec29737dbbebc9358395", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99a909594fb7ec29737dbbebc9358395")).intValue();
            }
            MarginInfo marginInfo = dynamicModuleMarginInterface.getMarginInfo();
            if (marginInfo == null || (rightMargin = marginInfo.getRightMargin()) == null) {
                if (h.a(dynamicModuleMarginInterface.getAutoMargin(), Boolean.TRUE)) {
                    return dynamicModuleMarginInterface.getAutoRightMargin();
                }
                return 0;
            }
            return rightMargin.intValue();
        }

        public static int getLeftContentMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer leftMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a4086b8d89031533185de3d5a93aad7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a4086b8d89031533185de3d5a93aad7")).intValue();
            }
            MarginInfo contentMarginInfo = dynamicModuleMarginInterface.getContentMarginInfo();
            if (contentMarginInfo == null || (leftMargin = contentMarginInfo.getLeftMargin()) == null) {
                if (h.a(dynamicModuleMarginInterface.getAutoContentMargin(), Boolean.TRUE)) {
                    return dynamicModuleMarginInterface.getAutoLeftMargin();
                }
                return 0;
            }
            return leftMargin.intValue();
        }

        public static int getRightContentMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Integer rightMargin;
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1e31bb20507e6641db5510ba6d1ef85", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1e31bb20507e6641db5510ba6d1ef85")).intValue();
            }
            MarginInfo contentMarginInfo = dynamicModuleMarginInterface.getContentMarginInfo();
            if (contentMarginInfo == null || (rightMargin = contentMarginInfo.getRightMargin()) == null) {
                if (h.a(dynamicModuleMarginInterface.getAutoContentMargin(), Boolean.TRUE)) {
                    return dynamicModuleMarginInterface.getAutoRightMargin();
                }
                return 0;
            }
            return rightMargin.intValue();
        }

        public static int getHorizontalMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8214a6e35355498570060f1303ba8f50", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8214a6e35355498570060f1303ba8f50")).intValue() : dynamicModuleMarginInterface.getLeftMargin() + dynamicModuleMarginInterface.getRightMargin();
        }

        public static int getHorizontalContentMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1633220461ce961590925d827a5e5150", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1633220461ce961590925d827a5e5150")).intValue() : dynamicModuleMarginInterface.getLeftContentMargin() + dynamicModuleMarginInterface.getRightContentMargin();
        }

        public static int getVerticalMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "28e419dca256c6d93f5f58307c7d86a1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "28e419dca256c6d93f5f58307c7d86a1")).intValue() : dynamicModuleMarginInterface.getTopMargin() + dynamicModuleMarginInterface.getBottomMargin();
        }

        public static int getVerticalContentMargin(DynamicModuleMarginInterface dynamicModuleMarginInterface) {
            Object[] objArr = {dynamicModuleMarginInterface};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e85e1b892a5adddb98945fc3f52e3c8b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e85e1b892a5adddb98945fc3f52e3c8b")).intValue() : dynamicModuleMarginInterface.getTopContentMargin() + dynamicModuleMarginInterface.getBottomContentMargin();
        }
    }
}
