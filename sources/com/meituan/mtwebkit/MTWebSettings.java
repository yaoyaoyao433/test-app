package com.meituan.mtwebkit;

import android.content.Context;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class MTWebSettings {
    public static final int FORCE_DARK_AUTO = 1;
    public static final int FORCE_DARK_OFF = 0;
    public static final int FORCE_DARK_ON = 2;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    @Deprecated
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;
    public static final int MENU_ITEM_NONE = 0;
    public static final int MENU_ITEM_PROCESS_TEXT = 4;
    public static final int MENU_ITEM_SHARE = 1;
    public static final int MENU_ITEM_WEB_SEARCH = 2;
    public static final int MIXED_CONTENT_ALWAYS_ALLOW = 0;
    public static final int MIXED_CONTENT_COMPATIBILITY_MODE = 2;
    public static final int MIXED_CONTENT_NEVER_ALLOW = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public abstract boolean enableSmoothTransition();

    public abstract boolean getAcceptThirdPartyCookies();

    public abstract boolean getAllowContentAccess();

    public abstract boolean getAllowFileAccess();

    public abstract boolean getAllowFileAccessFromFileURLs();

    public abstract boolean getAllowUniversalAccessFromFileURLs();

    public abstract boolean getBlockNetworkImage();

    public abstract boolean getBlockNetworkLoads();

    public abstract boolean getBuiltInZoomControls();

    public abstract int getCacheMode();

    public abstract String getCursiveFontFamily();

    public abstract boolean getDatabaseEnabled();

    @Deprecated
    public abstract String getDatabasePath();

    public abstract int getDefaultFixedFontSize();

    public abstract int getDefaultFontSize();

    public abstract String getDefaultTextEncodingName();

    @Deprecated
    public abstract ZoomDensity getDefaultZoom();

    public abstract int getDisabledActionModeMenuItems();

    public abstract boolean getDisplayZoomControls();

    public abstract boolean getDomStorageEnabled();

    public abstract String getFantasyFontFamily();

    public abstract String getFixedFontFamily();

    public int getForceDark() {
        return 1;
    }

    public abstract boolean getJavaScriptCanOpenWindowsAutomatically();

    public abstract boolean getJavaScriptEnabled();

    public abstract LayoutAlgorithm getLayoutAlgorithm();

    @Deprecated
    public abstract boolean getLightTouchEnabled();

    public abstract boolean getLoadWithOverviewMode();

    public abstract boolean getLoadsImagesAutomatically();

    public abstract boolean getMediaPlaybackRequiresUserGesture();

    public abstract int getMinimumFontSize();

    public abstract int getMinimumLogicalFontSize();

    public abstract int getMixedContentMode();

    @Deprecated
    public abstract boolean getNavDump();

    public abstract boolean getOffscreenPreRaster();

    @Deprecated
    public abstract PluginState getPluginState();

    @Deprecated
    public abstract boolean getPluginsEnabled();

    @Deprecated
    public String getPluginsPath() {
        return "";
    }

    public abstract boolean getSafeBrowsingEnabled();

    public abstract String getSansSerifFontFamily();

    @Deprecated
    public abstract boolean getSaveFormData();

    @Deprecated
    public abstract boolean getSavePassword();

    public abstract String getSerifFontFamily();

    public abstract String getStandardFontFamily();

    public abstract int getTextZoom();

    @Deprecated
    public boolean getUseDoubleTree() {
        return false;
    }

    @Deprecated
    public abstract boolean getUseWebViewBackgroundForOverscrollBackground();

    public abstract boolean getUseWideViewPort();

    @Deprecated
    public abstract int getUserAgent();

    public abstract String getUserAgentString();

    public abstract boolean getVideoOverlayForEmbeddedEncryptedVideoEnabled();

    public abstract void setAcceptThirdPartyCookies(boolean z);

    public abstract void setAllowContentAccess(boolean z);

    public abstract void setAllowFileAccess(boolean z);

    public abstract void setAllowFileAccessFromFileURLs(boolean z);

    public abstract void setAllowUniversalAccessFromFileURLs(boolean z);

    public abstract void setAppCacheEnabled(boolean z);

    @Deprecated
    public abstract void setAppCacheMaxSize(long j);

    public abstract void setAppCachePath(String str);

    public abstract void setBlockNetworkImage(boolean z);

    public abstract void setBlockNetworkLoads(boolean z);

    public abstract void setBuiltInZoomControls(boolean z);

    public abstract void setCacheMode(int i);

    public abstract void setCursiveFontFamily(String str);

    public abstract void setDatabaseEnabled(boolean z);

    @Deprecated
    public abstract void setDatabasePath(String str);

    public abstract void setDefaultFixedFontSize(int i);

    public abstract void setDefaultFontSize(int i);

    public abstract void setDefaultTextEncodingName(String str);

    public abstract void setDisabledActionModeMenuItems(int i);

    public abstract void setDisplayZoomControls(boolean z);

    public abstract void setDomStorageEnabled(boolean z);

    @Deprecated
    public abstract void setEnableSmoothTransition(boolean z);

    public abstract void setFantasyFontFamily(String str);

    public abstract void setFixedFontFamily(String str);

    public void setForceDark(int i) {
    }

    @Deprecated
    public abstract void setGeolocationDatabasePath(String str);

    public abstract void setGeolocationEnabled(boolean z);

    public abstract void setJavaScriptCanOpenWindowsAutomatically(boolean z);

    public abstract void setJavaScriptEnabled(boolean z);

    public abstract void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm);

    @Deprecated
    public abstract void setLightTouchEnabled(boolean z);

    public abstract void setLoadWithOverviewMode(boolean z);

    public abstract void setLoadsImagesAutomatically(boolean z);

    public abstract void setMediaPlaybackRequiresUserGesture(boolean z);

    public abstract void setMinimumFontSize(int i);

    public abstract void setMinimumLogicalFontSize(int i);

    public abstract void setMixedContentMode(int i);

    @Deprecated
    public abstract void setNavDump(boolean z);

    public abstract void setNeedInitialFocus(boolean z);

    public abstract void setOffscreenPreRaster(boolean z);

    @Deprecated
    public abstract void setPluginState(PluginState pluginState);

    @Deprecated
    public abstract void setPluginsEnabled(boolean z);

    @Deprecated
    public void setPluginsPath(String str) {
    }

    @Deprecated
    public abstract void setRenderPriority(RenderPriority renderPriority);

    public abstract void setSafeBrowsingEnabled(boolean z);

    public abstract void setSansSerifFontFamily(String str);

    @Deprecated
    public abstract void setSaveFormData(boolean z);

    public abstract void setSerifFontFamily(String str);

    public abstract void setStandardFontFamily(String str);

    public abstract void setSupportMultipleWindows(boolean z);

    public abstract void setSupportZoom(boolean z);

    public abstract void setTextZoom(int i);

    @Deprecated
    public void setUseDoubleTree(boolean z) {
    }

    @Deprecated
    public abstract void setUseWebViewBackgroundForOverscrollBackground(boolean z);

    public abstract void setUseWideViewPort(boolean z);

    @Deprecated
    public abstract void setUserAgent(int i);

    public abstract void setUserAgentString(String str);

    public abstract void setVideoOverlayForEmbeddedEncryptedVideoEnabled(boolean z);

    public abstract boolean supportMultipleWindows();

    public abstract boolean supportZoom();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS,
        TEXT_AUTOSIZING;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        LayoutAlgorithm() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acc557c7538d1644c5161e53bf7d3fb1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acc557c7538d1644c5161e53bf7d3fb1");
            }
        }

        public static LayoutAlgorithm valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27c0a76eca90a9de163c774bb0c18697", RobustBitConfig.DEFAULT_VALUE) ? (LayoutAlgorithm) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27c0a76eca90a9de163c774bb0c18697") : (LayoutAlgorithm) Enum.valueOf(LayoutAlgorithm.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LayoutAlgorithm[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "466b876713cbbc0b368e0bfb030b0b4f", RobustBitConfig.DEFAULT_VALUE) ? (LayoutAlgorithm[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "466b876713cbbc0b368e0bfb030b0b4f") : (LayoutAlgorithm[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes3.dex */
    public enum TextSize {
        SMALLEST(50),
        SMALLER(75),
        NORMAL(100),
        LARGER(MapConstant.ANIMATION_DURATION_SHORT),
        LARGEST(200);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static TextSize valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09ac3d6d967a523b18231c594b7c8d21", RobustBitConfig.DEFAULT_VALUE) ? (TextSize) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09ac3d6d967a523b18231c594b7c8d21") : (TextSize) Enum.valueOf(TextSize.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static TextSize[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63e6461847c241f38676b4e8f47b5cd3", RobustBitConfig.DEFAULT_VALUE) ? (TextSize[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63e6461847c241f38676b4e8f47b5cd3") : (TextSize[]) values().clone();
        }

        TextSize(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a2aa1ea13ca1de97e1754d988accbf9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a2aa1ea13ca1de97e1754d988accbf9");
            } else {
                this.value = i;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum ZoomDensity {
        FAR(MapConstant.ANIMATION_DURATION_SHORT),
        MEDIUM(100),
        CLOSE(75);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static ZoomDensity valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "89b6c05206ea8c4ab1d325abbbdad500", RobustBitConfig.DEFAULT_VALUE) ? (ZoomDensity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "89b6c05206ea8c4ab1d325abbbdad500") : (ZoomDensity) Enum.valueOf(ZoomDensity.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ZoomDensity[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ad5af566bcf1271066477d6b7dd78c2", RobustBitConfig.DEFAULT_VALUE) ? (ZoomDensity[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ad5af566bcf1271066477d6b7dd78c2") : (ZoomDensity[]) values().clone();
        }

        ZoomDensity(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5742f41dc41a26cc034a7897012d752b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5742f41dc41a26cc034a7897012d752b");
            } else {
                this.value = i;
            }
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum RenderPriority {
        NORMAL,
        HIGH,
        LOW;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        RenderPriority() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe9e35c84aa5061f0e4a4328f723d7d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe9e35c84aa5061f0e4a4328f723d7d2");
            }
        }

        public static RenderPriority valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1dcae975518b254390982265419bad77", RobustBitConfig.DEFAULT_VALUE) ? (RenderPriority) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1dcae975518b254390982265419bad77") : (RenderPriority) Enum.valueOf(RenderPriority.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static RenderPriority[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c5d9e9bf50fe876310179dde9012e725", RobustBitConfig.DEFAULT_VALUE) ? (RenderPriority[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c5d9e9bf50fe876310179dde9012e725") : (RenderPriority[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum PluginState {
        ON,
        ON_DEMAND,
        OFF;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        PluginState() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d576d368a113d1088d80ce8d627b359", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d576d368a113d1088d80ce8d627b359");
            }
        }

        public static PluginState valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1c695454b86637617f8ec2a9f24143be", RobustBitConfig.DEFAULT_VALUE) ? (PluginState) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1c695454b86637617f8ec2a9f24143be") : (PluginState) Enum.valueOf(PluginState.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PluginState[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b2df1c65f48adadf49bd48eadc11cab", RobustBitConfig.DEFAULT_VALUE) ? (PluginState[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b2df1c65f48adadf49bd48eadc11cab") : (PluginState[]) values().clone();
        }
    }

    @Deprecated
    public synchronized void setTextSize(TextSize textSize) {
        Object[] objArr = {textSize};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c64eeb209fb46cbee2a6ac6355c48212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c64eeb209fb46cbee2a6ac6355c48212");
        } else {
            setTextZoom(textSize.value);
        }
    }

    @Deprecated
    public synchronized TextSize getTextSize() {
        TextSize[] valuesCustom;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3e8f82dfa235180d7206a6cebb5e0ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextSize) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3e8f82dfa235180d7206a6cebb5e0ac");
        }
        TextSize textSize = null;
        int i = Integer.MAX_VALUE;
        int textZoom = getTextZoom();
        for (TextSize textSize2 : TextSize.valuesCustom()) {
            int abs = Math.abs(textZoom - textSize2.value);
            if (abs == 0) {
                return textSize2;
            }
            if (abs < i) {
                textSize = textSize2;
                i = abs;
            }
        }
        if (textSize != null) {
            return textSize;
        }
        return TextSize.NORMAL;
    }

    public static String getDefaultUserAgent(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7e242220f25bc3922aa4be410f6b4ba", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7e242220f25bc3922aa4be410f6b4ba") : MTWebViewFactory.getProvider().getStatics().getDefaultUserAgent(context);
    }
}
