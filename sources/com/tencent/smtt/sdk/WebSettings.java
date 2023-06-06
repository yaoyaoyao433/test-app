package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.meituan.mtmap.rendersdk.MapConstant;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings;
/* loaded from: classes6.dex */
public class WebSettings {
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;
    private IX5WebSettings a;
    private android.webkit.WebSettings b;
    private boolean c;

    /* loaded from: classes6.dex */
    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS
    }

    /* loaded from: classes6.dex */
    public enum PluginState {
        ON,
        ON_DEMAND,
        OFF
    }

    /* loaded from: classes6.dex */
    public enum RenderPriority {
        NORMAL,
        HIGH,
        LOW
    }

    /* loaded from: classes6.dex */
    public enum TextSize {
        SMALLEST(50),
        SMALLER(75),
        NORMAL(100),
        LARGER(125),
        LARGEST(MapConstant.ANIMATION_DURATION_SHORT);
        
        int value;

        TextSize(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes6.dex */
    public enum ZoomDensity {
        FAR(MapConstant.ANIMATION_DURATION_SHORT),
        MEDIUM(100),
        CLOSE(75);
        
        int value;

        ZoomDensity(int i) {
            this.value = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSettings(android.webkit.WebSettings webSettings) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = null;
        this.b = webSettings;
        this.c = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WebSettings(IX5WebSettings iX5WebSettings) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.a = iX5WebSettings;
        this.b = null;
        this.c = true;
    }

    @TargetApi(17)
    public static String getDefaultUserAgent(Context context) {
        Object a;
        if (x.a().b()) {
            return x.a().c().i(context);
        }
        if (Build.VERSION.SDK_INT >= 17 && (a = com.tencent.smtt.utils.i.a((Class<?>) android.webkit.WebSettings.class, "getDefaultUserAgent", (Class<?>[]) new Class[]{Context.class}, context)) != null) {
            return (String) a;
        }
        return null;
    }

    @Deprecated
    public boolean enableSmoothTransition() {
        Object a;
        if (!this.c || this.a == null) {
            if (this.c || this.b == null || Build.VERSION.SDK_INT < 11 || (a = com.tencent.smtt.utils.i.a(this.b, "enableSmoothTransition")) == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
        return this.a.enableSmoothTransition();
    }

    @TargetApi(11)
    public boolean getAllowContentAccess() {
        Object a;
        if (!this.c || this.a == null) {
            if (this.c || this.b == null || Build.VERSION.SDK_INT < 11 || (a = com.tencent.smtt.utils.i.a(this.b, "getAllowContentAccess")) == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
        return this.a.getAllowContentAccess();
    }

    @TargetApi(3)
    public boolean getAllowFileAccess() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.getAllowFileAccess();
        }
        return this.a.getAllowFileAccess();
    }

    public synchronized boolean getBlockNetworkImage() {
        if (this.c && this.a != null) {
            return this.a.getBlockNetworkImage();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getBlockNetworkImage();
        }
    }

    @TargetApi(8)
    public synchronized boolean getBlockNetworkLoads() {
        if (this.c && this.a != null) {
            return this.a.getBlockNetworkLoads();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT >= 8) {
                return this.b.getBlockNetworkLoads();
            }
            return false;
        }
    }

    @TargetApi(3)
    public boolean getBuiltInZoomControls() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.getBuiltInZoomControls();
        }
        return this.a.getBuiltInZoomControls();
    }

    public int getCacheMode() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return 0;
            }
            return this.b.getCacheMode();
        }
        return this.a.getCacheMode();
    }

    public synchronized String getCursiveFontFamily() {
        if (this.c && this.a != null) {
            return this.a.getCursiveFontFamily();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getCursiveFontFamily();
        }
    }

    @TargetApi(5)
    public synchronized boolean getDatabaseEnabled() {
        if (this.c && this.a != null) {
            return this.a.getDatabaseEnabled();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getDatabaseEnabled();
        }
    }

    @TargetApi(5)
    @Deprecated
    public synchronized String getDatabasePath() {
        if (this.c && this.a != null) {
            return this.a.getDatabasePath();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getDatabasePath();
        }
    }

    public synchronized int getDefaultFixedFontSize() {
        if (this.c && this.a != null) {
            return this.a.getDefaultFixedFontSize();
        } else if (this.c || this.b == null) {
            return 0;
        } else {
            return this.b.getDefaultFixedFontSize();
        }
    }

    public synchronized int getDefaultFontSize() {
        if (this.c && this.a != null) {
            return this.a.getDefaultFontSize();
        } else if (this.c || this.b == null) {
            return 0;
        } else {
            return this.b.getDefaultFontSize();
        }
    }

    public synchronized String getDefaultTextEncodingName() {
        if (this.c && this.a != null) {
            return this.a.getDefaultTextEncodingName();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getDefaultTextEncodingName();
        }
    }

    @TargetApi(7)
    @Deprecated
    public ZoomDensity getDefaultZoom() {
        String name;
        if (this.c && this.a != null) {
            name = this.a.getDefaultZoom().name();
        } else if (this.c || this.b == null) {
            return null;
        } else {
            name = this.b.getDefaultZoom().name();
        }
        return ZoomDensity.valueOf(name);
    }

    @TargetApi(11)
    public boolean getDisplayZoomControls() {
        Object a;
        if (!this.c || this.a == null) {
            if (this.c || this.b == null || Build.VERSION.SDK_INT < 11 || (a = com.tencent.smtt.utils.i.a(this.b, "getDisplayZoomControls")) == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
        return this.a.getDisplayZoomControls();
    }

    @TargetApi(7)
    public synchronized boolean getDomStorageEnabled() {
        if (this.c && this.a != null) {
            return this.a.getDomStorageEnabled();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getDomStorageEnabled();
        }
    }

    public synchronized String getFantasyFontFamily() {
        if (this.c && this.a != null) {
            return this.a.getFantasyFontFamily();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getFantasyFontFamily();
        }
    }

    public synchronized String getFixedFontFamily() {
        if (this.c && this.a != null) {
            return this.a.getFixedFontFamily();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getFixedFontFamily();
        }
    }

    public synchronized boolean getJavaScriptCanOpenWindowsAutomatically() {
        if (this.c && this.a != null) {
            return this.a.getJavaScriptCanOpenWindowsAutomatically();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getJavaScriptCanOpenWindowsAutomatically();
        }
    }

    public synchronized boolean getJavaScriptEnabled() {
        if (this.c && this.a != null) {
            return this.a.getJavaScriptEnabled();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getJavaScriptEnabled();
        }
    }

    public synchronized LayoutAlgorithm getLayoutAlgorithm() {
        if (this.c && this.a != null) {
            return LayoutAlgorithm.valueOf(this.a.getLayoutAlgorithm().name());
        } else if (this.c || this.b == null) {
            return null;
        } else {
            return LayoutAlgorithm.valueOf(this.b.getLayoutAlgorithm().name());
        }
    }

    @Deprecated
    public boolean getLightTouchEnabled() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.getLightTouchEnabled();
        }
        return this.a.getLightTouchEnabled();
    }

    @TargetApi(7)
    public boolean getLoadWithOverviewMode() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.getLoadWithOverviewMode();
        }
        return this.a.getLoadWithOverviewMode();
    }

    public synchronized boolean getLoadsImagesAutomatically() {
        if (this.c && this.a != null) {
            return this.a.getLoadsImagesAutomatically();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getLoadsImagesAutomatically();
        }
    }

    @TargetApi(17)
    public boolean getMediaPlaybackRequiresUserGesture() {
        Object a;
        if (!this.c || this.a == null) {
            if (this.c || this.b == null || Build.VERSION.SDK_INT < 17 || (a = com.tencent.smtt.utils.i.a(this.b, "getMediaPlaybackRequiresUserGesture")) == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
        return this.a.getMediaPlaybackRequiresUserGesture();
    }

    public synchronized int getMinimumFontSize() {
        if (this.c && this.a != null) {
            return this.a.getMinimumFontSize();
        } else if (this.c || this.b == null) {
            return 0;
        } else {
            return this.b.getMinimumFontSize();
        }
    }

    public synchronized int getMinimumLogicalFontSize() {
        if (this.c && this.a != null) {
            return this.a.getMinimumLogicalFontSize();
        } else if (this.c || this.b == null) {
            return 0;
        } else {
            return this.b.getMinimumLogicalFontSize();
        }
    }

    public synchronized int getMixedContentMode() {
        if (this.c && this.a != null) {
            return this.a.getMixedContentMode();
        } else if (Build.VERSION.SDK_INT < 21) {
            return -1;
        } else {
            Object a = com.tencent.smtt.utils.i.a(this.b, "getMixedContentMode", new Class[0], new Object[0]);
            if (a == null) {
                return -1;
            }
            return ((Integer) a).intValue();
        }
    }

    @Deprecated
    public boolean getNavDump() {
        Object a;
        if (!this.c || this.a == null) {
            if (this.c || this.b == null || (a = com.tencent.smtt.utils.i.a(this.b, "getNavDump")) == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
        return this.a.getNavDump();
    }

    @TargetApi(8)
    @Deprecated
    public synchronized PluginState getPluginState() {
        if (this.c && this.a != null) {
            return PluginState.valueOf(this.a.getPluginState().name());
        } else if (this.c || this.b == null) {
            return null;
        } else {
            if (Build.VERSION.SDK_INT >= 8) {
                Object a = com.tencent.smtt.utils.i.a(this.b, "getPluginState");
                if (a == null) {
                    return null;
                }
                return PluginState.valueOf(((WebSettings.PluginState) a).name());
            }
            return null;
        }
    }

    @TargetApi(8)
    @Deprecated
    public synchronized boolean getPluginsEnabled() {
        if (this.c && this.a != null) {
            return this.a.getPluginsEnabled();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            if (Build.VERSION.SDK_INT > 17) {
                if (Build.VERSION.SDK_INT == 18) {
                    return WebSettings.PluginState.ON == this.b.getPluginState();
                }
                return false;
            }
            Object a = com.tencent.smtt.utils.i.a(this.b, "getPluginsEnabled");
            if (a == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
    }

    @Deprecated
    public synchronized String getPluginsPath() {
        if (this.c && this.a != null) {
            return this.a.getPluginsPath();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            if (Build.VERSION.SDK_INT <= 17) {
                Object a = com.tencent.smtt.utils.i.a(this.b, "getPluginsPath");
                if (a == null) {
                    return null;
                }
                return (String) a;
            }
            return "";
        }
    }

    public boolean getSafeBrowsingEnabled() {
        if (!this.c && this.b != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                return this.b.getSafeBrowsingEnabled();
            }
            return false;
        } else if (!this.c || this.a == null) {
            return false;
        } else {
            try {
                return this.a.getSafeBrowsingEnabled();
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        }
    }

    public synchronized String getSansSerifFontFamily() {
        if (this.c && this.a != null) {
            return this.a.getSansSerifFontFamily();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getSansSerifFontFamily();
        }
    }

    @Deprecated
    public boolean getSaveFormData() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.getSaveFormData();
        }
        return this.a.getSaveFormData();
    }

    @Deprecated
    public boolean getSavePassword() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.getSavePassword();
        }
        return this.a.getSavePassword();
    }

    public synchronized String getSerifFontFamily() {
        if (this.c && this.a != null) {
            return this.a.getSerifFontFamily();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getSerifFontFamily();
        }
    }

    public synchronized String getStandardFontFamily() {
        if (this.c && this.a != null) {
            return this.a.getStandardFontFamily();
        } else if (this.c || this.b == null) {
            return "";
        } else {
            return this.b.getStandardFontFamily();
        }
    }

    @Deprecated
    public TextSize getTextSize() {
        String name;
        if (this.c && this.a != null) {
            name = this.a.getTextSize().name();
        } else if (this.c || this.b == null) {
            return null;
        } else {
            name = this.b.getTextSize().name();
        }
        return TextSize.valueOf(name);
    }

    @TargetApi(14)
    public synchronized int getTextZoom() {
        if (this.c && this.a != null) {
            return this.a.getTextZoom();
        } else if (this.c || this.b == null) {
            return 0;
        } else {
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            try {
                return this.b.getTextZoom();
            } catch (Exception unused) {
                Object a = com.tencent.smtt.utils.i.a(this.b, "getTextZoom");
                if (a == null) {
                    return 0;
                }
                return ((Integer) a).intValue();
            }
        }
    }

    @Deprecated
    public boolean getUseWebViewBackgroundForOverscrollBackground() {
        Object a;
        if (!this.c || this.a == null) {
            if (this.c || this.b == null || (a = com.tencent.smtt.utils.i.a(this.b, "getUseWebViewBackgroundForOverscrollBackground")) == null) {
                return false;
            }
            return ((Boolean) a).booleanValue();
        }
        return this.a.getUseWebViewBackgroundForOverscrollBackground();
    }

    public synchronized boolean getUseWideViewPort() {
        if (this.c && this.a != null) {
            return this.a.getUseWideViewPort();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.getUseWideViewPort();
        }
    }

    @TargetApi(3)
    public String getUserAgentString() {
        return (!this.c || this.a == null) ? (this.c || this.b == null) ? "" : this.b.getUserAgentString() : this.a.getUserAgentString();
    }

    @TargetApi(11)
    public void setAllowContentAccess(boolean z) {
        if (this.c && this.a != null) {
            this.a.setAllowContentAccess(z);
        } else if (this.c || this.b == null || Build.VERSION.SDK_INT < 11) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setAllowContentAccess", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    @TargetApi(3)
    public void setAllowFileAccess(boolean z) {
        if (this.c && this.a != null) {
            this.a.setAllowFileAccess(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setAllowFileAccess(z);
        }
    }

    @TargetApi(16)
    public void setAllowFileAccessFromFileURLs(boolean z) {
        if (this.c && this.a != null) {
            this.a.setAllowFileAccessFromFileURLs(z);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setAllowFileAccessFromFileURLs", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    @TargetApi(16)
    public void setAllowUniversalAccessFromFileURLs(boolean z) {
        if (this.c && this.a != null) {
            this.a.setAllowUniversalAccessFromFileURLs(z);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setAllowUniversalAccessFromFileURLs", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    @TargetApi(7)
    public void setAppCacheEnabled(boolean z) {
        if (this.c && this.a != null) {
            this.a.setAppCacheEnabled(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setAppCacheEnabled(z);
        }
    }

    @TargetApi(7)
    @Deprecated
    public void setAppCacheMaxSize(long j) {
        if (this.c && this.a != null) {
            this.a.setAppCacheMaxSize(j);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setAppCacheMaxSize(j);
        }
    }

    @TargetApi(7)
    public void setAppCachePath(String str) {
        if (this.c && this.a != null) {
            this.a.setAppCachePath(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setAppCachePath(str);
        }
    }

    public void setBlockNetworkImage(boolean z) {
        if (this.c && this.a != null) {
            this.a.setBlockNetworkImage(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setBlockNetworkImage(z);
        }
    }

    @TargetApi(8)
    public synchronized void setBlockNetworkLoads(boolean z) {
        if (this.c && this.a != null) {
            this.a.setBlockNetworkLoads(z);
        } else if (this.c || this.b == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 8) {
                this.b.setBlockNetworkLoads(z);
            }
        }
    }

    @TargetApi(3)
    public void setBuiltInZoomControls(boolean z) {
        if (this.c && this.a != null) {
            this.a.setBuiltInZoomControls(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setBuiltInZoomControls(z);
        }
    }

    public void setCacheMode(int i) {
        if (this.c && this.a != null) {
            this.a.setCacheMode(i);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setCacheMode(i);
        }
    }

    public synchronized void setCursiveFontFamily(String str) {
        if (this.c && this.a != null) {
            this.a.setCursiveFontFamily(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setCursiveFontFamily(str);
        }
    }

    @TargetApi(5)
    public void setDatabaseEnabled(boolean z) {
        if (this.c && this.a != null) {
            this.a.setDatabaseEnabled(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setDatabaseEnabled(z);
        }
    }

    @TargetApi(5)
    @Deprecated
    public void setDatabasePath(String str) {
        if (this.c && this.a != null) {
            this.a.setDatabasePath(str);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setDatabasePath", new Class[]{String.class}, str);
        }
    }

    public synchronized void setDefaultFixedFontSize(int i) {
        if (this.c && this.a != null) {
            this.a.setDefaultFixedFontSize(i);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setDefaultFixedFontSize(i);
        }
    }

    public synchronized void setDefaultFontSize(int i) {
        if (this.c && this.a != null) {
            this.a.setDefaultFontSize(i);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setDefaultFontSize(i);
        }
    }

    public synchronized void setDefaultTextEncodingName(String str) {
        if (this.c && this.a != null) {
            this.a.setDefaultTextEncodingName(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setDefaultTextEncodingName(str);
        }
    }

    @TargetApi(7)
    @Deprecated
    public void setDefaultZoom(ZoomDensity zoomDensity) {
        if (this.c && this.a != null) {
            this.a.setDefaultZoom(IX5WebSettings.ZoomDensity.valueOf(zoomDensity.name()));
        } else if (this.c || this.b == null) {
        } else {
            this.b.setDefaultZoom(WebSettings.ZoomDensity.valueOf(zoomDensity.name()));
        }
    }

    @TargetApi(11)
    public void setDisplayZoomControls(boolean z) {
        if (this.c && this.a != null) {
            this.a.setDisplayZoomControls(z);
        } else if (this.c || this.b == null || Build.VERSION.SDK_INT < 11) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setDisplayZoomControls", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    @TargetApi(7)
    public void setDomStorageEnabled(boolean z) {
        if (this.c && this.a != null) {
            this.a.setDomStorageEnabled(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setDomStorageEnabled(z);
        }
    }

    @TargetApi(11)
    @Deprecated
    public void setEnableSmoothTransition(boolean z) {
        if (this.c && this.a != null) {
            this.a.setEnableSmoothTransition(z);
        } else if (this.c || this.b == null || Build.VERSION.SDK_INT < 11) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setEnableSmoothTransition", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public synchronized void setFantasyFontFamily(String str) {
        if (this.c && this.a != null) {
            this.a.setFantasyFontFamily(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setFantasyFontFamily(str);
        }
    }

    public synchronized void setFixedFontFamily(String str) {
        if (this.c && this.a != null) {
            this.a.setFixedFontFamily(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setFixedFontFamily(str);
        }
    }

    @TargetApi(5)
    @Deprecated
    public void setGeolocationDatabasePath(String str) {
        if (this.c && this.a != null) {
            this.a.setGeolocationDatabasePath(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setGeolocationDatabasePath(str);
        }
    }

    @TargetApi(5)
    public void setGeolocationEnabled(boolean z) {
        if (this.c && this.a != null) {
            this.a.setGeolocationEnabled(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setGeolocationEnabled(z);
        }
    }

    public synchronized void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        if (this.c && this.a != null) {
            this.a.setJavaScriptCanOpenWindowsAutomatically(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setJavaScriptCanOpenWindowsAutomatically(z);
        }
    }

    @Deprecated
    public void setJavaScriptEnabled(boolean z) {
        try {
            if (this.c && this.a != null) {
                this.a.setJavaScriptEnabled(z);
            } else if (this.c || this.b == null) {
            } else {
                this.b.setJavaScriptEnabled(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
        if (this.c && this.a != null) {
            this.a.setLayoutAlgorithm(IX5WebSettings.LayoutAlgorithm.valueOf(layoutAlgorithm.name()));
        } else if (this.c || this.b == null) {
        } else {
            this.b.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.valueOf(layoutAlgorithm.name()));
        }
    }

    @Deprecated
    public void setLightTouchEnabled(boolean z) {
        if (this.c && this.a != null) {
            this.a.setLightTouchEnabled(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setLightTouchEnabled(z);
        }
    }

    @TargetApi(7)
    public void setLoadWithOverviewMode(boolean z) {
        if (this.c && this.a != null) {
            this.a.setLoadWithOverviewMode(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setLoadWithOverviewMode(z);
        }
    }

    public void setLoadsImagesAutomatically(boolean z) {
        if (this.c && this.a != null) {
            this.a.setLoadsImagesAutomatically(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setLoadsImagesAutomatically(z);
        }
    }

    @TargetApi(17)
    public void setMediaPlaybackRequiresUserGesture(boolean z) {
        if (this.c && this.a != null) {
            this.a.setMediaPlaybackRequiresUserGesture(z);
        } else if (this.c || this.b == null || Build.VERSION.SDK_INT < 17) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setMediaPlaybackRequiresUserGesture", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public synchronized void setMinimumFontSize(int i) {
        if (this.c && this.a != null) {
            this.a.setMinimumFontSize(i);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setMinimumFontSize(i);
        }
    }

    public synchronized void setMinimumLogicalFontSize(int i) {
        if (this.c && this.a != null) {
            this.a.setMinimumLogicalFontSize(i);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setMinimumLogicalFontSize(i);
        }
    }

    @TargetApi(21)
    public void setMixedContentMode(int i) {
        if ((!this.c || this.a == null) && !this.c && this.b != null && Build.VERSION.SDK_INT >= 21) {
            com.tencent.smtt.utils.i.a(this.b, "setMixedContentMode", new Class[]{Integer.TYPE}, Integer.valueOf(i));
        }
    }

    @Deprecated
    public void setNavDump(boolean z) {
        if (this.c && this.a != null) {
            this.a.setNavDump(z);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setNavDump", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public void setNeedInitialFocus(boolean z) {
        if (this.c && this.a != null) {
            this.a.setNeedInitialFocus(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setNeedInitialFocus(z);
        }
    }

    @TargetApi(8)
    @Deprecated
    public synchronized void setPluginState(PluginState pluginState) {
        if (this.c && this.a != null) {
            this.a.setPluginState(IX5WebSettings.PluginState.valueOf(pluginState.name()));
        } else if (this.c || this.b == null) {
        } else {
            if (Build.VERSION.SDK_INT >= 8) {
                com.tencent.smtt.utils.i.a(this.b, "setPluginState", new Class[]{WebSettings.PluginState.class}, WebSettings.PluginState.valueOf(pluginState.name()));
            }
        }
    }

    @Deprecated
    public void setPluginsEnabled(boolean z) {
        if (this.c && this.a != null) {
            this.a.setPluginsEnabled(z);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setPluginsEnabled", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public synchronized void setPluginsPath(String str) {
        if (this.c && this.a != null) {
            this.a.setPluginsPath(str);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setPluginsPath", new Class[]{String.class}, str);
        }
    }

    @Deprecated
    public void setRenderPriority(RenderPriority renderPriority) {
        if (this.c && this.a != null) {
            this.a.setRenderPriority(IX5WebSettings.RenderPriority.valueOf(renderPriority.name()));
        } else if (this.c || this.b == null) {
        } else {
            this.b.setRenderPriority(WebSettings.RenderPriority.valueOf(renderPriority.name()));
        }
    }

    public void setSafeBrowsingEnabled(boolean z) {
        if (!this.c && this.b != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.b.setSafeBrowsingEnabled(z);
            }
        } else if (!this.c || this.a == null) {
        } else {
            try {
                this.a.setSafeBrowsingEnabled(z);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public synchronized void setSansSerifFontFamily(String str) {
        if (this.c && this.a != null) {
            this.a.setSansSerifFontFamily(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setSansSerifFontFamily(str);
        }
    }

    @Deprecated
    public void setSaveFormData(boolean z) {
        if (this.c && this.a != null) {
            this.a.setSaveFormData(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setSaveFormData(z);
        }
    }

    @Deprecated
    public void setSavePassword(boolean z) {
        if (this.c && this.a != null) {
            this.a.setSavePassword(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setSavePassword(z);
        }
    }

    public synchronized void setSerifFontFamily(String str) {
        if (this.c && this.a != null) {
            this.a.setSerifFontFamily(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setSerifFontFamily(str);
        }
    }

    public synchronized void setStandardFontFamily(String str) {
        if (this.c && this.a != null) {
            this.a.setStandardFontFamily(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setStandardFontFamily(str);
        }
    }

    public void setSupportMultipleWindows(boolean z) {
        if (this.c && this.a != null) {
            this.a.setSupportMultipleWindows(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setSupportMultipleWindows(z);
        }
    }

    public void setSupportZoom(boolean z) {
        if (this.c && this.a != null) {
            this.a.setSupportZoom(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setSupportZoom(z);
        }
    }

    @Deprecated
    public void setTextSize(TextSize textSize) {
        if (this.c && this.a != null) {
            this.a.setTextSize(IX5WebSettings.TextSize.valueOf(textSize.name()));
        } else if (this.c || this.b == null) {
        } else {
            this.b.setTextSize(WebSettings.TextSize.valueOf(textSize.name()));
        }
    }

    @TargetApi(14)
    public synchronized void setTextZoom(int i) {
        if (this.c && this.a != null) {
            this.a.setTextZoom(i);
            return;
        }
        if (!this.c && this.b != null) {
            if (Build.VERSION.SDK_INT < 14) {
                return;
            }
            try {
                this.b.setTextZoom(i);
            } catch (Exception unused) {
                com.tencent.smtt.utils.i.a(this.b, "setTextZoom", new Class[]{Integer.TYPE}, Integer.valueOf(i));
            }
        }
    }

    @Deprecated
    public void setUseWebViewBackgroundForOverscrollBackground(boolean z) {
        if (this.c && this.a != null) {
            this.a.setUseWebViewBackgroundForOverscrollBackground(z);
        } else if (this.c || this.b == null) {
        } else {
            com.tencent.smtt.utils.i.a(this.b, "setUseWebViewBackgroundForOverscrollBackground", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
        }
    }

    public void setUseWideViewPort(boolean z) {
        if (this.c && this.a != null) {
            this.a.setUseWideViewPort(z);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setUseWideViewPort(z);
        }
    }

    public void setUserAgent(String str) {
        if (this.c && this.a != null) {
            this.a.setUserAgent(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setUserAgentString(str);
        }
    }

    @TargetApi(3)
    public void setUserAgentString(String str) {
        if (this.c && this.a != null) {
            this.a.setUserAgentString(str);
        } else if (this.c || this.b == null) {
        } else {
            this.b.setUserAgentString(str);
        }
    }

    public synchronized boolean supportMultipleWindows() {
        if (this.c && this.a != null) {
            return this.a.supportMultipleWindows();
        } else if (this.c || this.b == null) {
            return false;
        } else {
            return this.b.supportMultipleWindows();
        }
    }

    public boolean supportZoom() {
        if (!this.c || this.a == null) {
            if (this.c || this.b == null) {
                return false;
            }
            return this.b.supportZoom();
        }
        return this.a.supportZoom();
    }
}
