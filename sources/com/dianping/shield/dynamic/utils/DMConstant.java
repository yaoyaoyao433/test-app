package com.dianping.shield.dynamic.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMConstant {
    public static final String IMPORTED_MODULE_HOST_PREFIX = "GCPicassoImportedModule";
    public static final String LOGIN_KEY = "qm_login";
    public static final String PAGE_BACKGROUND_COLOR = "pageBackgroundColor";
    public static final String PAGE_REFRESH = "refresh";
    public static final String PICASSO_COMPAT = "picassoCompat";
    public static final int SECTION_FOOTER = -2;
    public static final int SECTION_HEADER = -1;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum DefaultCellType {
        CELL,
        HEADER,
        FOOTER;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        DefaultCellType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1b8556ad5f26e8fda757930dd8439af", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1b8556ad5f26e8fda757930dd8439af");
            }
        }

        public static DefaultCellType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e4a36bcdef29b3989bff286029eea03", RobustBitConfig.DEFAULT_VALUE) ? (DefaultCellType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e4a36bcdef29b3989bff286029eea03") : (DefaultCellType) Enum.valueOf(DefaultCellType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DefaultCellType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad50417d0b8ebb2e633001bd3934859c", RobustBitConfig.DEFAULT_VALUE) ? (DefaultCellType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad50417d0b8ebb2e633001bd3934859c") : (DefaultCellType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum HoverType {
        TOP,
        BOTTOM;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HoverType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa47387d00bcb179dbb2c6a80cb25958", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa47387d00bcb179dbb2c6a80cb25958");
            }
        }

        public static HoverType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d703acd1fae433751023dfa36ee5d269", RobustBitConfig.DEFAULT_VALUE) ? (HoverType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d703acd1fae433751023dfa36ee5d269") : (HoverType) Enum.valueOf(HoverType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HoverType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72c34d11ea5f4ca8e09df5147fe86094", RobustBitConfig.DEFAULT_VALUE) ? (HoverType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72c34d11ea5f4ca8e09df5147fe86094") : (HoverType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum DynamicModuleViewType {
        PicassoView,
        PicassoVCView,
        PicassoVCImportedView,
        MRNView;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        DynamicModuleViewType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49ab9e34a2cdedbfe8a7c24f97cad1a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49ab9e34a2cdedbfe8a7c24f97cad1a1");
            }
        }

        public static DynamicModuleViewType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "280e811c08a96582f3cb8127232831e8", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "280e811c08a96582f3cb8127232831e8") : (DynamicModuleViewType) Enum.valueOf(DynamicModuleViewType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DynamicModuleViewType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98beb6435ff500a164b639336e8a8b30", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98beb6435ff500a164b639336e8a8b30") : (DynamicModuleViewType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum VCViewComputeStep {
        First,
        Second;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        VCViewComputeStep() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1eb5bc86f8a68b3c7dfaffbe3f45e59", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1eb5bc86f8a68b3c7dfaffbe3f45e59");
            }
        }

        public static VCViewComputeStep valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "29222d2e42d2e6ecf0980c5ee585569a", RobustBitConfig.DEFAULT_VALUE) ? (VCViewComputeStep) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "29222d2e42d2e6ecf0980c5ee585569a") : (VCViewComputeStep) Enum.valueOf(VCViewComputeStep.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static VCViewComputeStep[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74a96b79c1320483ceab902bccb9b382", RobustBitConfig.DEFAULT_VALUE) ? (VCViewComputeStep[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74a96b79c1320483ceab902bccb9b382") : (VCViewComputeStep[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum DynamicModuleCellType {
        DynamicModuleCellTypeNormal,
        DynamicModuleCellTypeGrid,
        DynamicModuleCellTypeScroll,
        DynamicModuleCellTypeHoverTop,
        DynamicModuleCellTypeHoverBottom,
        DynamicModuleCellTypeTab;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        DynamicModuleCellType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a9a860ed26b5a5ac1e3be3af080849c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a9a860ed26b5a5ac1e3be3af080849c");
            }
        }

        public static DynamicModuleCellType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5505e0c62da4b9b31a8cfc04f6301120", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleCellType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5505e0c62da4b9b31a8cfc04f6301120") : (DynamicModuleCellType) Enum.valueOf(DynamicModuleCellType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DynamicModuleCellType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "97acc54ac3d4d8a4f54fd249a715b4bf", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleCellType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "97acc54ac3d4d8a4f54fd249a715b4bf") : (DynamicModuleCellType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum SelectionStyle {
        NONE(0),
        DEFAULT(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static SelectionStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9289766cfb165a9a4e7de569fb0fdcbc", RobustBitConfig.DEFAULT_VALUE) ? (SelectionStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9289766cfb165a9a4e7de569fb0fdcbc") : (SelectionStyle) Enum.valueOf(SelectionStyle.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SelectionStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3963ec74e6e71731481f73cc3fb2aca", RobustBitConfig.DEFAULT_VALUE) ? (SelectionStyle[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3963ec74e6e71731481f73cc3fb2aca") : (SelectionStyle[]) values().clone();
        }

        SelectionStyle(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74e42688f55950c11f3c1dc0b3b95a44", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74e42688f55950c11f3c1dc0b3b95a44");
            } else {
                this.value = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum DynamicModuleViewCellType {
        DynamicModuleCellTypeNormal,
        DynamicModuleCellTypeGrid,
        DynamicModuleCellTypeScrollNormal,
        DynamicModuleCellTypeScrollViewPager,
        DynamicModuleCellTypeHoverTop,
        DynamicModuleCellTypeHoverBottom,
        DynamicModuleCellTypeTab,
        DynamicModuleCellTypeWaterFall;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        DynamicModuleViewCellType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb31c07fb0d5793ccb95ec3240a49279", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb31c07fb0d5793ccb95ec3240a49279");
            }
        }

        public static DynamicModuleViewCellType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "134ec1f306434e63a79ffc78275e6f0d", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewCellType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "134ec1f306434e63a79ffc78275e6f0d") : (DynamicModuleViewCellType) Enum.valueOf(DynamicModuleViewCellType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static DynamicModuleViewCellType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "324428e893423bacd0df571ff8a3a5a5", RobustBitConfig.DEFAULT_VALUE) ? (DynamicModuleViewCellType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "324428e893423bacd0df571ff8a3a5a5") : (DynamicModuleViewCellType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ScrollStyle {
        Normal,
        Page,
        LoopPage,
        GalleryPage,
        GalleryLoopPage;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ScrollStyle() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "782f15b5656123c82ac25a1d78cd0b72", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "782f15b5656123c82ac25a1d78cd0b72");
            }
        }

        public static ScrollStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12b25ffaac5d3856c62ba0887bf627b6", RobustBitConfig.DEFAULT_VALUE) ? (ScrollStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12b25ffaac5d3856c62ba0887bf627b6") : (ScrollStyle) Enum.valueOf(ScrollStyle.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ScrollStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37d757becd4f20d7ec353abbe73b2aa9", RobustBitConfig.DEFAULT_VALUE) ? (ScrollStyle[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37d757becd4f20d7ec353abbe73b2aa9") : (ScrollStyle[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum PopAnimationType {
        PopAnimationTypeNone,
        PopAnimationTypeFade,
        PopAnimationTypeLeft,
        PopAnimationTypeRight,
        PopAnimationTypeTop,
        PopAnimationTypeBottom;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        PopAnimationType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1be3207ecc19dbdca3431ce32adac2cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1be3207ecc19dbdca3431ce32adac2cb");
            }
        }

        public static PopAnimationType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ca308cde189b1865929169e90d36f2d", RobustBitConfig.DEFAULT_VALUE) ? (PopAnimationType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ca308cde189b1865929169e90d36f2d") : (PopAnimationType) Enum.valueOf(PopAnimationType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PopAnimationType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8cd4b2958ce4c4080108f4a65601621e", RobustBitConfig.DEFAULT_VALUE) ? (PopAnimationType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8cd4b2958ce4c4080108f4a65601621e") : (PopAnimationType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ShareResultStatus {
        SUCCESS,
        FAIL,
        CANCEL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ShareResultStatus() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86ed6ed2e971e0de5efecaca8fc5d36e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86ed6ed2e971e0de5efecaca8fc5d36e");
            }
        }

        public static ShareResultStatus valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b872715deda16efa9565671dfd54d3d", RobustBitConfig.DEFAULT_VALUE) ? (ShareResultStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b872715deda16efa9565671dfd54d3d") : (ShareResultStatus) Enum.valueOf(ShareResultStatus.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ShareResultStatus[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "562c3ec90f64136d13237874908a8555", RobustBitConfig.DEFAULT_VALUE) ? (ShareResultStatus[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "562c3ec90f64136d13237874908a8555") : (ShareResultStatus[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum HoverStatus {
        NotStartHover,
        Hovering,
        EndHover;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        HoverStatus() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0b763e9bd877f2947acaba3a106425f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0b763e9bd877f2947acaba3a106425f");
            }
        }

        public static HoverStatus valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6cf837699ee956f8d92c9c9d1331ffe2", RobustBitConfig.DEFAULT_VALUE) ? (HoverStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6cf837699ee956f8d92c9c9d1331ffe2") : (HoverStatus) Enum.valueOf(HoverStatus.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HoverStatus[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24f8cd810851f42a9d705828b96628cf", RobustBitConfig.DEFAULT_VALUE) ? (HoverStatus[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24f8cd810851f42a9d705828b96628cf") : (HoverStatus[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum AutoStopHoverType {
        Module,
        Section,
        Cell;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        AutoStopHoverType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e19e6e7e01d48c531a9f9c0495d2554", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e19e6e7e01d48c531a9f9c0495d2554");
            }
        }

        public static AutoStopHoverType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "adb715e6d4858cf899d86bcc35df277d", RobustBitConfig.DEFAULT_VALUE) ? (AutoStopHoverType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "adb715e6d4858cf899d86bcc35df277d") : (AutoStopHoverType) Enum.valueOf(AutoStopHoverType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AutoStopHoverType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1ecde767fd77799fd7610ce78d77532", RobustBitConfig.DEFAULT_VALUE) ? (AutoStopHoverType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1ecde767fd77799fd7610ce78d77532") : (AutoStopHoverType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum SendMsgType {
        SendEvent,
        CallModuleMethod;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        SendMsgType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b42a42780fb6a73cc139642ffabffb68", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b42a42780fb6a73cc139642ffabffb68");
            }
        }

        public static SendMsgType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76a70c1102f0a27904f9b46a4977710c", RobustBitConfig.DEFAULT_VALUE) ? (SendMsgType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76a70c1102f0a27904f9b46a4977710c") : (SendMsgType) Enum.valueOf(SendMsgType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SendMsgType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d52c094f2bcf68ddd74bdbaa8dacc75f", RobustBitConfig.DEFAULT_VALUE) ? (SendMsgType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d52c094f2bcf68ddd74bdbaa8dacc75f") : (SendMsgType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ArrowPositionType {
        CellCenter,
        ContentCenter,
        ContentTop,
        ContentBottom;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ArrowPositionType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22114a9e2652a7e06708db92a82ef553", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22114a9e2652a7e06708db92a82ef553");
            }
        }

        public static ArrowPositionType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d4c4dd62306fae91107fb006b3f7a64e", RobustBitConfig.DEFAULT_VALUE) ? (ArrowPositionType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d4c4dd62306fae91107fb006b3f7a64e") : (ArrowPositionType) Enum.valueOf(ArrowPositionType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ArrowPositionType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d8390161225abef879dd92e8fad6dac", RobustBitConfig.DEFAULT_VALUE) ? (ArrowPositionType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d8390161225abef879dd92e8fad6dac") : (ArrowPositionType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ModuleOnAppearType {
        Appear(0),
        PageBack(1),
        ScrollInFromTop(2),
        ScrollInFromBottom(3),
        ScrollInFromLeft(4),
        ScrollInFromRight(5),
        BecomeActive(6);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int id;

        public static ModuleOnAppearType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8ebc7b160839785fe453d1b401a423e7", RobustBitConfig.DEFAULT_VALUE) ? (ModuleOnAppearType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8ebc7b160839785fe453d1b401a423e7") : (ModuleOnAppearType) Enum.valueOf(ModuleOnAppearType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ModuleOnAppearType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa7580c9386428b2b54bd8d3db2a4034", RobustBitConfig.DEFAULT_VALUE) ? (ModuleOnAppearType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa7580c9386428b2b54bd8d3db2a4034") : (ModuleOnAppearType[]) values().clone();
        }

        ModuleOnAppearType(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd42bcc2253587fddf79b23c9a210a08", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd42bcc2253587fddf79b23c9a210a08");
            } else {
                this.id = i;
            }
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ModuleOnDisappearType {
        Disappear(0),
        Goahead(1),
        Goback(2),
        ScrollOutFromTop(3),
        ScrollOutFromBottom(4),
        ScrollOutFromLeft(5),
        ScrollOutFromRight(6),
        ResignActive(7);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        private final int id;

        public static ModuleOnDisappearType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a14acfb4a0625e0ee185d9df7ced97b", RobustBitConfig.DEFAULT_VALUE) ? (ModuleOnDisappearType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a14acfb4a0625e0ee185d9df7ced97b") : (ModuleOnDisappearType) Enum.valueOf(ModuleOnDisappearType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ModuleOnDisappearType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3b6bd15e9d2452684f42e6f1ca93d1d", RobustBitConfig.DEFAULT_VALUE) ? (ModuleOnDisappearType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3b6bd15e9d2452684f42e6f1ca93d1d") : (ModuleOnDisappearType[]) values().clone();
        }

        ModuleOnDisappearType(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ffc62845255f23fdc2d9127249c3c9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ffc62845255f23fdc2d9127249c3c9");
            } else {
                this.id = i;
            }
        }

        public final int getId() {
            return this.id;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum LoadingStatus {
        Done,
        Loading,
        Fail;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        LoadingStatus() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b14a6bbc8e04f25b0ca83573cea1bba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b14a6bbc8e04f25b0ca83573cea1bba");
            }
        }

        public static LoadingStatus valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "954b3487df1869cee1e936d308f22dbd", RobustBitConfig.DEFAULT_VALUE) ? (LoadingStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "954b3487df1869cee1e936d308f22dbd") : (LoadingStatus) Enum.valueOf(LoadingStatus.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LoadingStatus[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "925478138ae11a292a4b41a3b80fa831", RobustBitConfig.DEFAULT_VALUE) ? (LoadingStatus[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "925478138ae11a292a4b41a3b80fa831") : (LoadingStatus[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ContextActionStyle {
        Normal,
        Destructive;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ContextActionStyle() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "419e6015824d4e0b157881d19762ebb1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "419e6015824d4e0b157881d19762ebb1");
            }
        }

        public static ContextActionStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9405d117ee3b194dbc207918926af0ee", RobustBitConfig.DEFAULT_VALUE) ? (ContextActionStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9405d117ee3b194dbc207918926af0ee") : (ContextActionStyle) Enum.valueOf(ContextActionStyle.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ContextActionStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d69e6063881dff0a62208979f82c231d", RobustBitConfig.DEFAULT_VALUE) ? (ContextActionStyle[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d69e6063881dff0a62208979f82c231d") : (ContextActionStyle[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum SectionType {
        Normal,
        WATERFALL,
        GRID;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        SectionType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4d04e084b67379f493a3ad1840d290e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4d04e084b67379f493a3ad1840d290e8");
            }
        }

        public static SectionType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4172eeffcd1786f9cbdfaa6cf907ddef", RobustBitConfig.DEFAULT_VALUE) ? (SectionType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4172eeffcd1786f9cbdfaa6cf907ddef") : (SectionType) Enum.valueOf(SectionType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SectionType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "749c7b1a4d1f4621f36b3b0d1059e46a", RobustBitConfig.DEFAULT_VALUE) ? (SectionType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "749c7b1a4d1f4621f36b3b0d1059e46a") : (SectionType[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum FontStyle {
        FontStyleNone,
        FontStyleBold,
        FontStyleItalic,
        FontStyleBoldAndItalic;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        FontStyle() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb11e3774f1184ca10a5e45f7aa583d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb11e3774f1184ca10a5e45f7aa583d9");
            }
        }

        public static FontStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "208abaea59811951227e195147f20046", RobustBitConfig.DEFAULT_VALUE) ? (FontStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "208abaea59811951227e195147f20046") : (FontStyle) Enum.valueOf(FontStyle.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static FontStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e4e12b9df3b72b6bbccb35ccb47b4137", RobustBitConfig.DEFAULT_VALUE) ? (FontStyle[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e4e12b9df3b72b6bbccb35ccb47b4137") : (FontStyle[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum TitleBarStyle {
        Normal,
        Hidden,
        Transparent;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        TitleBarStyle() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59f99a1fb52b591342e5ccd09d35c4e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59f99a1fb52b591342e5ccd09d35c4e5");
            }
        }

        public static TitleBarStyle valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a70ad72d50db07905719b30a6acddf0", RobustBitConfig.DEFAULT_VALUE) ? (TitleBarStyle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a70ad72d50db07905719b30a6acddf0") : (TitleBarStyle) Enum.valueOf(TitleBarStyle.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static TitleBarStyle[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a16f312f2ec254356edf026f9c0127b0", RobustBitConfig.DEFAULT_VALUE) ? (TitleBarStyle[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a16f312f2ec254356edf026f9c0127b0") : (TitleBarStyle[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ScrollDirection {
        Horizontal,
        Vertical;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ScrollDirection() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a09fc0a1bf77d5879aa76c30fa4b4e99", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a09fc0a1bf77d5879aa76c30fa4b4e99");
            }
        }

        public static ScrollDirection valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f09e12a7eb40c61447a8ceb047e3f2e2", RobustBitConfig.DEFAULT_VALUE) ? (ScrollDirection) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f09e12a7eb40c61447a8ceb047e3f2e2") : (ScrollDirection) Enum.valueOf(ScrollDirection.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ScrollDirection[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08b799807ce22af19681414cd89073e6", RobustBitConfig.DEFAULT_VALUE) ? (ScrollDirection[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08b799807ce22af19681414cd89073e6") : (ScrollDirection[]) values().clone();
        }
    }
}
