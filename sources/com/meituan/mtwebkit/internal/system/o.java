package com.meituan.mtwebkit.internal.system;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.meituan.mtwebkit.MTWebSettings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o extends MTWebSettings {
    public static ChangeQuickRedirect a;
    private WebSettings b;
    private WebView c;

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getNavDump() {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getUseWebViewBackgroundForOverscrollBackground() {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getVideoOverlayForEmbeddedEncryptedVideoEnabled() {
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setNavDump(boolean z) {
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setUseWebViewBackgroundForOverscrollBackground(boolean z) {
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setVideoOverlayForEmbeddedEncryptedVideoEnabled(boolean z) {
    }

    public o(WebView webView) {
        Object[] objArr = {webView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba14d62a062d9d095a05f400a3bda78f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba14d62a062d9d095a05f400a3bda78f");
            return;
        }
        this.c = webView;
        this.b = webView.getSettings();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setSupportZoom(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f70d4b286330de0760681acac244f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f70d4b286330de0760681acac244f4a");
        } else {
            this.b.setSupportZoom(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean supportZoom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e364a2d6123775974dbab9006b0934", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e364a2d6123775974dbab9006b0934")).booleanValue() : this.b.supportZoom();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setMediaPlaybackRequiresUserGesture(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "392b37109266da6d767d2759c0634aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "392b37109266da6d767d2759c0634aea");
        } else {
            this.b.setMediaPlaybackRequiresUserGesture(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getMediaPlaybackRequiresUserGesture() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f82fe173740d5c8cea8693e338cd13e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f82fe173740d5c8cea8693e338cd13e")).booleanValue() : this.b.getMediaPlaybackRequiresUserGesture();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setBuiltInZoomControls(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c41d81c8b52e73845a313b559a1e81e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c41d81c8b52e73845a313b559a1e81e");
        } else {
            this.b.setBuiltInZoomControls(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getBuiltInZoomControls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8b652e0b95428446d43319467bb99e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8b652e0b95428446d43319467bb99e3")).booleanValue() : this.b.getBuiltInZoomControls();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDisplayZoomControls(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa64e7e99d91c4d9aafa80eeba61bbc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa64e7e99d91c4d9aafa80eeba61bbc6");
        } else {
            this.b.setDisplayZoomControls(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getDisplayZoomControls() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b644cd06e544ca350c07bbe49f838cff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b644cd06e544ca350c07bbe49f838cff")).booleanValue() : this.b.getDisplayZoomControls();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAllowFileAccess(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59251c14d64337ff5e6919305c95ce60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59251c14d64337ff5e6919305c95ce60");
        } else {
            this.b.setAllowFileAccess(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getAllowFileAccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a80e0cf329c90d0385ef08f30f3d89a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a80e0cf329c90d0385ef08f30f3d89a")).booleanValue() : this.b.getAllowFileAccess();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAllowContentAccess(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8528d8f3b24ad5416967150e85e24ca2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8528d8f3b24ad5416967150e85e24ca2");
        } else {
            this.b.setAllowContentAccess(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getAllowContentAccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed35a9031ff8974e2a5143a36492cf7a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed35a9031ff8974e2a5143a36492cf7a")).booleanValue() : this.b.getAllowContentAccess();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setLoadWithOverviewMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a718e390bcf98f981cb75c9e2fff72f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a718e390bcf98f981cb75c9e2fff72f");
        } else {
            this.b.setLoadWithOverviewMode(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getLoadWithOverviewMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8db70345787c6ddca4c67d106e21aece", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8db70345787c6ddca4c67d106e21aece")).booleanValue() : this.b.getLoadWithOverviewMode();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setEnableSmoothTransition(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bf1c5a1218402a1860c134b474af6fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bf1c5a1218402a1860c134b474af6fa");
        } else {
            this.b.setEnableSmoothTransition(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean enableSmoothTransition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5b1dc2e617b7cfb71e087282ee50dfb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5b1dc2e617b7cfb71e087282ee50dfb")).booleanValue() : this.b.enableSmoothTransition();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setSaveFormData(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b46c993dcee40ac013cb1fca92349f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b46c993dcee40ac013cb1fca92349f7");
        } else {
            this.b.setSaveFormData(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getSaveFormData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c805f9a2bf2e01b4156e9f109f6c5e8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c805f9a2bf2e01b4156e9f109f6c5e8b")).booleanValue() : this.b.getSaveFormData();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getSavePassword() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a00998231e7111bc6baa4b133a65f24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a00998231e7111bc6baa4b133a65f24")).booleanValue() : this.b.getSavePassword();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setTextZoom(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34bfe8a990c3d047ae877815f45aab8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34bfe8a990c3d047ae877815f45aab8a");
        } else {
            this.b.setTextZoom(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getTextZoom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a95d07ffbecbe7b74677612064ae810", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a95d07ffbecbe7b74677612064ae810")).intValue() : this.b.getTextZoom();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAcceptThirdPartyCookies(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bc3765c2c72aae8682120d9563b0338", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bc3765c2c72aae8682120d9563b0338");
        } else {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.c, z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getAcceptThirdPartyCookies() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0260c6aa3996f934f31b6d24d43213ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0260c6aa3996f934f31b6d24d43213ef")).booleanValue() : CookieManager.getInstance().acceptThirdPartyCookies(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r1.equals("FAR") != false) goto L15;
     */
    @Override // com.meituan.mtwebkit.MTWebSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.mtwebkit.MTWebSettings.ZoomDensity getDefaultZoom() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mtwebkit.internal.system.o.a
            java.lang.String r10 = "cc43ad3a3d334b3b7344b2abb61a1108"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.meituan.mtwebkit.MTWebSettings$ZoomDensity r0 = (com.meituan.mtwebkit.MTWebSettings.ZoomDensity) r0
            return r0
        L1b:
            android.webkit.WebSettings r1 = r11.b
            android.webkit.WebSettings$ZoomDensity r1 = r1.getDefaultZoom()
            java.lang.String r1 = r1.name()
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -2024701067(0xffffffff87518375, float:-1.5762044E-34)
            if (r3 == r4) goto L4d
            r4 = 69367(0x10ef7, float:9.7204E-41)
            if (r3 == r4) goto L44
            r0 = 64218584(0x3d3e5d8, float:1.2454235E-36)
            if (r3 == r0) goto L3a
            goto L57
        L3a:
            java.lang.String r0 = "CLOSE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L57
            r0 = 2
            goto L58
        L44:
            java.lang.String r3 = "FAR"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L57
            goto L58
        L4d:
            java.lang.String r0 = "MEDIUM"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = -1
        L58:
            switch(r0) {
                case 0: goto L61;
                case 1: goto L5e;
                default: goto L5b;
            }
        L5b:
            com.meituan.mtwebkit.MTWebSettings$ZoomDensity r0 = com.meituan.mtwebkit.MTWebSettings.ZoomDensity.CLOSE
            return r0
        L5e:
            com.meituan.mtwebkit.MTWebSettings$ZoomDensity r0 = com.meituan.mtwebkit.MTWebSettings.ZoomDensity.MEDIUM
            return r0
        L61:
            com.meituan.mtwebkit.MTWebSettings$ZoomDensity r0 = com.meituan.mtwebkit.MTWebSettings.ZoomDensity.FAR
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.system.o.getDefaultZoom():com.meituan.mtwebkit.MTWebSettings$ZoomDensity");
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setLightTouchEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90ebd2690866f53638ec4bb06dd968d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90ebd2690866f53638ec4bb06dd968d");
        } else {
            this.b.setLightTouchEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getLightTouchEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2268197a7e73b48e78b97b996817a170", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2268197a7e73b48e78b97b996817a170")).booleanValue() : this.b.getLightTouchEnabled();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setUserAgent(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97141fe84a2c98d98ff9cb4a54808fdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97141fe84a2c98d98ff9cb4a54808fdc");
        } else if (i == 0) {
            setUserAgentString(null);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getUserAgent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f669da7df772ed510c2183013828b979", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f669da7df772ed510c2183013828b979")).intValue() : WebSettings.getDefaultUserAgent(this.c.getContext()).equals(getUserAgentString()) ? 0 : -1;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setUseWideViewPort(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "953a942ae4637bf762985cef77aff9ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "953a942ae4637bf762985cef77aff9ab");
        } else {
            this.b.setUseWideViewPort(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getUseWideViewPort() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9d8f7416803907c5ee947f48aaf8464", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9d8f7416803907c5ee947f48aaf8464")).booleanValue() : this.b.getUseWideViewPort();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setSupportMultipleWindows(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da204e1b7662afa7b2e89749d9245584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da204e1b7662afa7b2e89749d9245584");
        } else {
            this.b.setSupportMultipleWindows(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean supportMultipleWindows() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c68887af5e2363c64173b1ca74194d66", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c68887af5e2363c64173b1ca74194d66")).booleanValue() : this.b.supportMultipleWindows();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setLayoutAlgorithm(MTWebSettings.LayoutAlgorithm layoutAlgorithm) {
        WebSettings.LayoutAlgorithm layoutAlgorithm2;
        Object[] objArr = {layoutAlgorithm};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e1bf5dbbf96b509bd7bb8f6a478d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e1bf5dbbf96b509bd7bb8f6a478d1e");
            return;
        }
        switch (layoutAlgorithm) {
            case TEXT_AUTOSIZING:
                layoutAlgorithm2 = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
                break;
            case SINGLE_COLUMN:
                layoutAlgorithm2 = WebSettings.LayoutAlgorithm.SINGLE_COLUMN;
                break;
            case NARROW_COLUMNS:
                layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                break;
            default:
                layoutAlgorithm2 = WebSettings.LayoutAlgorithm.NORMAL;
                break;
        }
        this.b.setLayoutAlgorithm(layoutAlgorithm2);
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final MTWebSettings.LayoutAlgorithm getLayoutAlgorithm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbfe9bc9a7b3b3698db8fdd069035f0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebSettings.LayoutAlgorithm) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbfe9bc9a7b3b3698db8fdd069035f0b");
        }
        switch (AnonymousClass1.b[this.b.getLayoutAlgorithm().ordinal()]) {
            case 1:
                return MTWebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
            case 2:
                return MTWebSettings.LayoutAlgorithm.SINGLE_COLUMN;
            case 3:
                return MTWebSettings.LayoutAlgorithm.NARROW_COLUMNS;
            default:
                return MTWebSettings.LayoutAlgorithm.NORMAL;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setStandardFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48735f1b610b337216e82909e4c4d4fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48735f1b610b337216e82909e4c4d4fd");
        } else {
            this.b.setStandardFontFamily(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getStandardFontFamily() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961dcd41a186e022b9491e8a068d185d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961dcd41a186e022b9491e8a068d185d") : this.b.getStandardFontFamily();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setFixedFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5133858087551c9a735f197847dd7640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5133858087551c9a735f197847dd7640");
        } else {
            this.b.setFixedFontFamily(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getFixedFontFamily() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b941cc6031a5cbf7e71fc51923a8496c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b941cc6031a5cbf7e71fc51923a8496c") : this.b.getFixedFontFamily();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setSansSerifFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b83e0e85180bf8b2df799825d66c42e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b83e0e85180bf8b2df799825d66c42e");
        } else {
            this.b.setSansSerifFontFamily(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getSansSerifFontFamily() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1812ab8e0717d3201db8995b7ba75b55", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1812ab8e0717d3201db8995b7ba75b55") : this.b.getSansSerifFontFamily();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setSerifFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096bdc25bc416583e27a9ce173b03d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096bdc25bc416583e27a9ce173b03d66");
        } else {
            this.b.setSerifFontFamily(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getSerifFontFamily() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f454fc719135bc89256f5db976f6a738", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f454fc719135bc89256f5db976f6a738") : this.b.getSerifFontFamily();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setCursiveFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ac88b6fe0ae95eafde6ee73ac38787", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ac88b6fe0ae95eafde6ee73ac38787");
        } else {
            this.b.setCursiveFontFamily(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getCursiveFontFamily() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98a22d50664d92009ed8b04fffe6ccbe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98a22d50664d92009ed8b04fffe6ccbe") : this.b.getCursiveFontFamily();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setFantasyFontFamily(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38b9de4b51ecac2dd8c068cebed0f564", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38b9de4b51ecac2dd8c068cebed0f564");
        } else {
            this.b.setFantasyFontFamily(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getFantasyFontFamily() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "868604b4c9d9ffd1b48f0ab9ea17be54", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "868604b4c9d9ffd1b48f0ab9ea17be54") : this.b.getFantasyFontFamily();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setMinimumFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a29153c42d8ea1aecbe1aab8a91d77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a29153c42d8ea1aecbe1aab8a91d77b");
        } else {
            this.b.setMinimumFontSize(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getMinimumFontSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31218b18c463663a8c5d165c8eb50add", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31218b18c463663a8c5d165c8eb50add")).intValue() : this.b.getMinimumFontSize();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setMinimumLogicalFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c592481a08c84c46b0c66d17ad1381a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c592481a08c84c46b0c66d17ad1381a");
        } else {
            this.b.setMinimumLogicalFontSize(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getMinimumLogicalFontSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b48d505ab03f8790eb5336b121d8d4d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b48d505ab03f8790eb5336b121d8d4d")).intValue() : this.b.getMinimumLogicalFontSize();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDefaultFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a2c1deed5e364c790c36442be49bdec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a2c1deed5e364c790c36442be49bdec");
        } else {
            this.b.setDefaultFontSize(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getDefaultFontSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8558db0b28e210a8c41c3a9407f0a889", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8558db0b28e210a8c41c3a9407f0a889")).intValue() : this.b.getDefaultFontSize();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDefaultFixedFontSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf63ee7a599b6ae3dd7b1030cb6aeec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf63ee7a599b6ae3dd7b1030cb6aeec5");
        } else {
            this.b.setDefaultFixedFontSize(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getDefaultFixedFontSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc418d326ae31b433263b39f353058a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc418d326ae31b433263b39f353058a")).intValue() : this.b.getDefaultFixedFontSize();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setLoadsImagesAutomatically(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7292c02d24f423afd7c4cea04e2a684f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7292c02d24f423afd7c4cea04e2a684f");
        } else {
            this.b.setLoadsImagesAutomatically(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getLoadsImagesAutomatically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfd3cdd000d20d756ef5fbdc931a9a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfd3cdd000d20d756ef5fbdc931a9a1")).booleanValue() : this.b.getLoadsImagesAutomatically();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setBlockNetworkImage(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5451673e56075a2be03b13b8bfd8ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5451673e56075a2be03b13b8bfd8ac7");
        } else {
            this.b.setBlockNetworkImage(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getBlockNetworkImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a5634c51b5910e118c12c82d4275ee3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a5634c51b5910e118c12c82d4275ee3")).booleanValue() : this.b.getBlockNetworkImage();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setBlockNetworkLoads(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "babd9917214f176fe59448351184d2ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "babd9917214f176fe59448351184d2ae");
        } else {
            this.b.setBlockNetworkLoads(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getBlockNetworkLoads() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51809dbeb4952e1c7289e0e75f4f0807", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51809dbeb4952e1c7289e0e75f4f0807")).booleanValue() : this.b.getBlockNetworkLoads();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setJavaScriptEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc37c64d94ce597c3459c0e03b77600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc37c64d94ce597c3459c0e03b77600");
        } else {
            this.b.setJavaScriptEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAllowUniversalAccessFromFileURLs(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d6a26d9e893777205ce7a2782ca23d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d6a26d9e893777205ce7a2782ca23d2");
        } else {
            this.b.setAllowUniversalAccessFromFileURLs(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAllowFileAccessFromFileURLs(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4a7347f749912ba60906862e0da7634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4a7347f749912ba60906862e0da7634");
        } else {
            this.b.setAllowFileAccessFromFileURLs(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setPluginsEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8021f0c51e70593f6054d4d8d9316f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8021f0c51e70593f6054d4d8d9316f6");
        } else {
            this.b.setPluginState(z ? WebSettings.PluginState.ON : WebSettings.PluginState.OFF);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setPluginState(MTWebSettings.PluginState pluginState) {
        WebSettings.PluginState pluginState2;
        Object[] objArr = {pluginState};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe8deaa8bab7b075466cf51abe4781c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe8deaa8bab7b075466cf51abe4781c");
            return;
        }
        switch (pluginState) {
            case ON:
                pluginState2 = WebSettings.PluginState.ON;
                break;
            case ON_DEMAND:
                pluginState2 = WebSettings.PluginState.ON_DEMAND;
                break;
            default:
                pluginState2 = WebSettings.PluginState.OFF;
                break;
        }
        this.b.setPluginState(pluginState2);
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDatabasePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14c1899f21c89c1ff8d6f79e12486c78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14c1899f21c89c1ff8d6f79e12486c78");
        } else {
            this.b.setDatabasePath(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setGeolocationDatabasePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6895c94529bcb755127bda8106b4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6895c94529bcb755127bda8106b4da");
        } else {
            this.b.setGeolocationDatabasePath(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAppCacheEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3c123413b21c561634ff0f8392d97bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3c123413b21c561634ff0f8392d97bc");
        } else {
            this.b.setAppCacheEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAppCachePath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94505160731d00f2abdd68552db1e00f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94505160731d00f2abdd68552db1e00f");
        } else {
            this.b.setAppCachePath(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setAppCacheMaxSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e995876a6bc38eb2ef6de37cc0c93ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e995876a6bc38eb2ef6de37cc0c93ed");
        } else {
            this.b.setAppCacheMaxSize(j);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDatabaseEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8393dbff2565ae2dfdbcb8a4c675c11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8393dbff2565ae2dfdbcb8a4c675c11");
        } else {
            this.b.setDatabaseEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDomStorageEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cab630c371a148d663206993cfed227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cab630c371a148d663206993cfed227");
        } else {
            this.b.setDomStorageEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getDomStorageEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cb55d6cffdb015691b2b9136581e502", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cb55d6cffdb015691b2b9136581e502")).booleanValue() : this.b.getDomStorageEnabled();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getDatabasePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abadd342841dec69dc1d099965b93bfe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abadd342841dec69dc1d099965b93bfe") : this.b.getDatabasePath();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getDatabaseEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498d4d72918905192482e8e4d958d721", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498d4d72918905192482e8e4d958d721")).booleanValue() : this.b.getDatabaseEnabled();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setGeolocationEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76036be7b15889b236deedeb9beebe5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76036be7b15889b236deedeb9beebe5e");
        } else {
            this.b.setGeolocationEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getJavaScriptEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21e6063d74275e9bdee1339ce66d3ffa", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21e6063d74275e9bdee1339ce66d3ffa")).booleanValue() : this.b.getJavaScriptEnabled();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getAllowUniversalAccessFromFileURLs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fc50e307a08968a9244698953c90d0a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fc50e307a08968a9244698953c90d0a")).booleanValue() : this.b.getAllowUniversalAccessFromFileURLs();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getAllowFileAccessFromFileURLs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175701879d6ed5a8e6920ef91ffb5c69", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175701879d6ed5a8e6920ef91ffb5c69")).booleanValue() : this.b.getAllowFileAccessFromFileURLs();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getPluginsEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d280f43ab4f0ea369729ec3438462a1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d280f43ab4f0ea369729ec3438462a1")).booleanValue() : this.b.getPluginState() == WebSettings.PluginState.ON;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final MTWebSettings.PluginState getPluginState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fb69d351b0d6c4d8735a5099f21bb76", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTWebSettings.PluginState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fb69d351b0d6c4d8735a5099f21bb76");
        }
        switch (AnonymousClass1.d[this.b.getPluginState().ordinal()]) {
            case 1:
                return MTWebSettings.PluginState.ON;
            case 2:
                return MTWebSettings.PluginState.ON_DEMAND;
            default:
                return MTWebSettings.PluginState.OFF;
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d61fb5a0afce8d6ddc0840f0a7db717c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d61fb5a0afce8d6ddc0840f0a7db717c");
        } else {
            this.b.setJavaScriptCanOpenWindowsAutomatically(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getJavaScriptCanOpenWindowsAutomatically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "651c5b0edad52be14d60e8a95c854826", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "651c5b0edad52be14d60e8a95c854826")).booleanValue() : this.b.getJavaScriptCanOpenWindowsAutomatically();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDefaultTextEncodingName(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6de7d28fb3cf61600a3970b57103fdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6de7d28fb3cf61600a3970b57103fdb");
        } else {
            this.b.setDefaultTextEncodingName(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getDefaultTextEncodingName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d31eec82ee3b37589279111a1980db8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d31eec82ee3b37589279111a1980db8") : this.b.getDefaultTextEncodingName();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setUserAgentString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3050e493f0383efc78507deb949729bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3050e493f0383efc78507deb949729bf");
        } else {
            this.b.setUserAgentString(str);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final String getUserAgentString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183a8c73b526e364be76bfa3e3cb6f49", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183a8c73b526e364be76bfa3e3cb6f49") : this.b.getUserAgentString();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setNeedInitialFocus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "458220377dbf8869080616750472582c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "458220377dbf8869080616750472582c");
        } else {
            this.b.setNeedInitialFocus(z);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mtwebkit.internal.system.o$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] d;

        static {
            try {
                e[MTWebSettings.RenderPriority.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[MTWebSettings.RenderPriority.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[MTWebSettings.RenderPriority.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            d = new int[WebSettings.PluginState.values().length];
            try {
                d[WebSettings.PluginState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[WebSettings.PluginState.ON_DEMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[WebSettings.PluginState.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            c = new int[MTWebSettings.PluginState.valuesCustom().length];
            try {
                c[MTWebSettings.PluginState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                c[MTWebSettings.PluginState.ON_DEMAND.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                c[MTWebSettings.PluginState.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            b = new int[WebSettings.LayoutAlgorithm.values().length];
            try {
                b[WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[WebSettings.LayoutAlgorithm.SINGLE_COLUMN.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[WebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[WebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            a = new int[MTWebSettings.LayoutAlgorithm.valuesCustom().length];
            try {
                a[MTWebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[MTWebSettings.LayoutAlgorithm.SINGLE_COLUMN.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[MTWebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[MTWebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setRenderPriority(MTWebSettings.RenderPriority renderPriority) {
        WebSettings.RenderPriority renderPriority2;
        Object[] objArr = {renderPriority};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8e18de3a376d08992a37380fca25ae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8e18de3a376d08992a37380fca25ae2");
        } else if (renderPriority == null) {
        } else {
            switch (renderPriority) {
                case LOW:
                    renderPriority2 = WebSettings.RenderPriority.LOW;
                    break;
                case NORMAL:
                    renderPriority2 = WebSettings.RenderPriority.NORMAL;
                    break;
                default:
                    renderPriority2 = WebSettings.RenderPriority.HIGH;
                    break;
            }
            this.b.setRenderPriority(renderPriority2);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setCacheMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd8d3ab582dc1f616e925ef67f40b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd8d3ab582dc1f616e925ef67f40b51");
        } else {
            this.b.setCacheMode(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getCacheMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2f555ff6b5045673fb2e6f0a471c09", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2f555ff6b5045673fb2e6f0a471c09")).intValue() : this.b.getCacheMode();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setMixedContentMode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0201b6cfcf8cd972bc18ff804383aed0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0201b6cfcf8cd972bc18ff804383aed0");
        } else {
            this.b.setMixedContentMode(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getMixedContentMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28b1a67765a18bcbbe79d5efd13873f1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28b1a67765a18bcbbe79d5efd13873f1")).intValue() : this.b.getMixedContentMode();
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setOffscreenPreRaster(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37694888f3eff6224461050242620443", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37694888f3eff6224461050242620443");
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.b.setOffscreenPreRaster(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getOffscreenPreRaster() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dda5c3452c76c5af6da4aa95f8a07eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dda5c3452c76c5af6da4aa95f8a07eb")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return this.b.getOffscreenPreRaster();
        }
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setSafeBrowsingEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d2429306c8499c2b4b7d5d443f2909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d2429306c8499c2b4b7d5d443f2909");
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.b.setSafeBrowsingEnabled(z);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final boolean getSafeBrowsingEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "200b627ef82c83d3c807581285dff27b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "200b627ef82c83d3c807581285dff27b")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return this.b.getSafeBrowsingEnabled();
        }
        return false;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setDisabledActionModeMenuItems(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0b5531aa51548cfcabe7d076a5bdfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0b5531aa51548cfcabe7d076a5bdfc");
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.b.setDisabledActionModeMenuItems(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getDisabledActionModeMenuItems() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47cfb7199e4048f9d4a5a34494139363", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47cfb7199e4048f9d4a5a34494139363")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return this.b.getDisabledActionModeMenuItems();
        }
        return 0;
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final void setForceDark(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c19eb073e333b43825178b0d2db7e050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c19eb073e333b43825178b0d2db7e050");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b.setForceDark(i);
        }
    }

    @Override // com.meituan.mtwebkit.MTWebSettings
    public final int getForceDark() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8e9c82e58862c2d8aaa74a49a689e6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8e9c82e58862c2d8aaa74a49a689e6c")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.b.getForceDark();
        }
        return super.getForceDark();
    }
}
