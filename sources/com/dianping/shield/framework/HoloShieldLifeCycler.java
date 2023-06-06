package com.dianping.shield.framework;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.ar;
import com.dianping.agentsdk.framework.j;
import com.dianping.agentsdk.framework.v;
import com.dianping.portal.feature.b;
import com.dianping.portal.feature.g;
import com.dianping.portal.model.a;
import com.dianping.shield.component.widgets.ScTitleBar;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.utils.DMConstant;
import com.dianping.shield.feature.LoadingAndLoadingMoreCreator;
import com.dianping.shield.manager.PortalBridge;
import com.dianping.shield.manager.ShieldNodeCellManager;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J9\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u000e\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00170\u0017H\u0096\u0001J!\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\t\u0010\u0019\u001a\u00020\u0010H\u0096\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u0096\u0001J!\u0010\u001c\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010\u001d\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J!\u0010\u001e\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J!\u0010\u001f\u001a\n \u0013*\u0004\u0018\u00010 0 2\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010!\u001a\n \u0013*\u0004\u0018\u00010\"0\"H\u0096\u0001J\u0011\u0010#\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010$\u001a\n \u0013*\u0004\u0018\u00010%0%H\u0096\u0001J\t\u0010&\u001a\u00020\u0010H\u0096\u0001J\t\u0010'\u001a\u00020\u0010H\u0096\u0001J\t\u0010(\u001a\u00020)H\u0096\u0001J\t\u0010*\u001a\u00020+H\u0096\u0001J\t\u0010,\u001a\u00020\u0010H\u0096\u0001J\t\u0010-\u001a\u00020+H\u0096\u0001J\u0011\u0010.\u001a\n \u0013*\u0004\u0018\u00010/0/H\u0096\u0001J\u0012\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u00020\u00102\u0006\u0010(\u001a\u00020)H\u0016J)\u00104\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010505H\u0096\u0001J\t\u00106\u001a\u00020\u0010H\u0096\u0001J\u0019\u00107\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0019\u00108\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010909H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010909H\u0096\u0001J\u0011\u0010;\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020)H\u0096\u0001J)\u0010<\u001a\u00020)2\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010 0 H\u0096\u0001J\u0011\u0010=\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020)H\u0096\u0001J\u0011\u0010>\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020)H\u0096\u0001J\u0019\u0010?\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012H\u0096\u0001J)\u0010?\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00122\u0006\u0010\u0014\u001a\u00020)2\u0006\u0010\u0016\u001a\u00020)H\u0096\u0001J\u0019\u0010@\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010A0AH\u0096\u0001J\t\u0010B\u001a\u00020\u0010H\u0096\u0001J)\u0010C\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00150\u00152\u000e\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010505H\u0096\u0001J\u0011\u0010D\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010E\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010F\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010G\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001J\u0011\u0010H\u001a\n \u0013*\u0004\u0018\u00010\u00150\u0015H\u0096\u0001R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/dianping/shield/framework/HoloShieldLifeCycler;", "Lcom/dianping/shield/framework/ShieldLifeCycler;", "Lcom/dianping/portal/feature/LoginListenerInterface;", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "Lcom/dianping/shield/framework/PortalBridgeInterface;", "portalBridge", "Lcom/dianping/shield/manager/PortalBridge;", "(Lcom/dianping/shield/manager/PortalBridge;)V", "value", "Landroid/support/v4/app/Fragment;", "hostFragment", "getHostFragment", "()Landroid/support/v4/app/Fragment;", "setHostFragment", "(Landroid/support/v4/app/Fragment;)V", "addRightViewItem", "", "p0", "Landroid/view/View;", "kotlin.jvm.PlatformType", VersionInfo.P1, "", "p2", "Landroid/view/View$OnClickListener;", "appendUrlParms", "bindCaptureProvider", Constants.Environment.KEY_CITYID, "", "findRightViewItemByTag", "fingerPrint", "getConfigProperty", "getConfigPropertyHolder", "Lcom/dianping/portal/feature/PropertyHolderInterface;", "getScTitleBar", "Lcom/dianping/shield/component/widgets/ScTitleBar;", "getToken", "getUser", "Lcom/dianping/portal/model/CommonUser;", "gotoLogin", "hideTitlebar", "isLogin", "", Constants.PRIVACY.KEY_LATITUDE, "", "logout", Constants.PRIVACY.KEY_LONGITUDE, "mapiService", "Lcom/dianping/dataservice/mapi/MApiService;", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onLogin", "registerConfigProperty", "Lcom/dianping/portal/feature/ConfigPropertyChangeListener;", "removeAllRightViewItem", "removeRightViewItem", "setBarSubtitle", "", "setBarTitle", "setIsTransparentTitleBar", "setPropertyHolderInterface", "setShowLeftButton", "setShowRightButton", "setTitleCustomView", "setTitlebarBackground", "Landroid/graphics/drawable/Drawable;", "showTitlebar", "unRegisterConfigProperty", "utmCampaign", "utmContent", "utmMedium", "utmSource", "utmTerm", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class HoloShieldLifeCycler extends ShieldLifeCycler implements v, PortalBridgeInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final /* synthetic */ PortalBridge $$delegate_0;
    private PortalBridge portalBridge;

    public HoloShieldLifeCycler() {
        this(null, 1, null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cc994b8aa6a435cf5c811ccbfb67f72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cc994b8aa6a435cf5c811ccbfb67f72");
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void addRightViewItem(View view, String str, View.OnClickListener onClickListener) {
        Object[] objArr = {view, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd76c6cba1026260ad917e10b57320c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd76c6cba1026260ad917e10b57320c0");
        } else {
            this.$$delegate_0.addRightViewItem(view, str, onClickListener);
        }
    }

    @Override // com.dianping.portal.feature.h
    public final String appendUrlParms(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4526e25fd9b64e90a264bd10b74b6ec4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4526e25fd9b64e90a264bd10b74b6ec4") : this.$$delegate_0.appendUrlParms(str);
    }

    @Override // com.dianping.portal.feature.a
    public final void bindCaptureProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1de6867475b0ba0074af8c3e8c64ac6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1de6867475b0ba0074af8c3e8c64ac6a");
        } else {
            this.$$delegate_0.bindCaptureProvider();
        }
    }

    @Override // com.dianping.portal.feature.d
    public final long cityid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a5c20ee4f0ff545e49bf7a4b8e8139f", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a5c20ee4f0ff545e49bf7a4b8e8139f")).longValue() : this.$$delegate_0.cityid();
    }

    @Override // com.dianping.portal.feature.i
    public final View findRightViewItemByTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c6967aefe9fda7d19b0cd5cb74c3f98", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c6967aefe9fda7d19b0cd5cb74c3f98") : this.$$delegate_0.findRightViewItemByTag(str);
    }

    @Override // com.dianping.portal.feature.j
    public final String fingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0681febf85a885a57c88e32df3956ba5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0681febf85a885a57c88e32df3956ba5") : this.$$delegate_0.fingerPrint();
    }

    @Override // com.dianping.portal.feature.c
    public final String getConfigProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db543549e8b6489b4754f88172d2898b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db543549e8b6489b4754f88172d2898b") : this.$$delegate_0.getConfigProperty(str);
    }

    @Override // com.dianping.portal.feature.c
    public final g getConfigPropertyHolder(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2c19006182b18521894119b3ca8cc73", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2c19006182b18521894119b3ca8cc73") : this.$$delegate_0.getConfigPropertyHolder(str);
    }

    @Override // com.dianping.shield.component.widgets.ScTitleBarProviderInterface
    public final ScTitleBar getScTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e369e8181f6306f19b73cbdeb4ed7dd", RobustBitConfig.DEFAULT_VALUE) ? (ScTitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e369e8181f6306f19b73cbdeb4ed7dd") : this.$$delegate_0.getScTitleBar();
    }

    @Override // com.dianping.portal.feature.e
    public final String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ade1d1bce4c16873cd154366dbd40c3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ade1d1bce4c16873cd154366dbd40c3") : this.$$delegate_0.getToken();
    }

    @Override // com.dianping.portal.feature.e
    public final a getUser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43e2137c165397313a3de247893740e2", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43e2137c165397313a3de247893740e2") : this.$$delegate_0.getUser();
    }

    @Override // com.dianping.portal.feature.e
    public final void gotoLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f08f0ce1780f384866b5872fb65204c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f08f0ce1780f384866b5872fb65204c8");
        } else {
            this.$$delegate_0.gotoLogin();
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void hideTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e6bf7472b57a921f01cc3aa3744e418", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e6bf7472b57a921f01cc3aa3744e418");
        } else {
            this.$$delegate_0.hideTitlebar();
        }
    }

    @Override // com.dianping.portal.feature.e
    public final boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02c980ec76a8753412d5a267e9296d20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02c980ec76a8753412d5a267e9296d20")).booleanValue() : this.$$delegate_0.isLogin();
    }

    @Override // com.dianping.portal.feature.d
    public final double latitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bd9272e4b223b57466da36f39b39418", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bd9272e4b223b57466da36f39b39418")).doubleValue() : this.$$delegate_0.latitude();
    }

    public final void logout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59675d5637fb59cee8cadcabc751a04d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59675d5637fb59cee8cadcabc751a04d");
        } else {
            this.$$delegate_0.logout();
        }
    }

    @Override // com.dianping.portal.feature.d
    public final double longitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b9d23f76f5e5a13b909b7a0d1c34310", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b9d23f76f5e5a13b909b7a0d1c34310")).doubleValue() : this.$$delegate_0.longitude();
    }

    @Override // com.dianping.portal.feature.h
    public final com.dianping.dataservice.mapi.g mapiService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6fff7bb042b0b412bacb1a93315fa16b", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.dataservice.mapi.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6fff7bb042b0b412bacb1a93315fa16b") : this.$$delegate_0.mapiService();
    }

    @Override // com.dianping.portal.feature.c
    public final void registerConfigProperty(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92a6ef0dabb62b248024febc907d23d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92a6ef0dabb62b248024febc907d23d0");
        } else {
            this.$$delegate_0.registerConfigProperty(str, bVar);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void removeAllRightViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a220807ffdaa896b3fa25e93a30fe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a220807ffdaa896b3fa25e93a30fe9");
        } else {
            this.$$delegate_0.removeAllRightViewItem();
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void removeRightViewItem(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22666e631de15bfbc7786c961dd6fb2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22666e631de15bfbc7786c961dd6fb2c");
        } else {
            this.$$delegate_0.removeRightViewItem(str);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void setBarSubtitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "647e955b0d92d171ed46814ed493e937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "647e955b0d92d171ed46814ed493e937");
        } else {
            this.$$delegate_0.setBarSubtitle(charSequence);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void setBarTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3f310fc0954ad63633becf291ee20d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3f310fc0954ad63633becf291ee20d3");
        } else {
            this.$$delegate_0.setBarTitle(charSequence);
        }
    }

    @Override // com.dianping.shield.component.widgets.ScTitleBarProviderInterface
    public final void setIsTransparentTitleBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "782f5d82aafa8d8ac2e7aaafcbe1dfde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "782f5d82aafa8d8ac2e7aaafcbe1dfde");
        } else {
            this.$$delegate_0.setIsTransparentTitleBar(z);
        }
    }

    @Override // com.dianping.portal.feature.c
    public final boolean setPropertyHolderInterface(String str, g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3d13cbab3ebb3cfc4fae05a783d0ca5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3d13cbab3ebb3cfc4fae05a783d0ca5")).booleanValue() : this.$$delegate_0.setPropertyHolderInterface(str, gVar);
    }

    @Override // com.dianping.portal.feature.i
    public final void setShowLeftButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04e8f81257b4da7f993c505933d0af18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04e8f81257b4da7f993c505933d0af18");
        } else {
            this.$$delegate_0.setShowLeftButton(z);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void setShowRightButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6f413d8de00833444e969f39111c5c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6f413d8de00833444e969f39111c5c9");
        } else {
            this.$$delegate_0.setShowRightButton(z);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void setTitleCustomView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e98952442dead876d0ee38fae1d2a8b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e98952442dead876d0ee38fae1d2a8b6");
        } else {
            this.$$delegate_0.setTitleCustomView(view);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void setTitleCustomView(View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77431429fbb9d71e7bb1df4a486a6211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77431429fbb9d71e7bb1df4a486a6211");
        } else {
            this.$$delegate_0.setTitleCustomView(view, z, z2);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void setTitlebarBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f3ccee26fcf52d9cc5212081fc355d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f3ccee26fcf52d9cc5212081fc355d7");
        } else {
            this.$$delegate_0.setTitlebarBackground(drawable);
        }
    }

    @Override // com.dianping.portal.feature.i
    public final void showTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d32f8b30c20c8f82a16243ea7c7345c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d32f8b30c20c8f82a16243ea7c7345c3");
        } else {
            this.$$delegate_0.showTitlebar();
        }
    }

    @Override // com.dianping.portal.feature.c
    public final void unRegisterConfigProperty(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6c4d9920d2a3c63ff47f674fc4449c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6c4d9920d2a3c63ff47f674fc4449c8");
        } else {
            this.$$delegate_0.unRegisterConfigProperty(str, bVar);
        }
    }

    @Override // com.dianping.portal.feature.j
    public final String utmCampaign() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80c0f7787e70fa0ad946ba6a3602a505", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80c0f7787e70fa0ad946ba6a3602a505") : this.$$delegate_0.utmCampaign();
    }

    @Override // com.dianping.portal.feature.j
    public final String utmContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "856d29ebc3cbbb0b5898ea11619584ba", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "856d29ebc3cbbb0b5898ea11619584ba") : this.$$delegate_0.utmContent();
    }

    @Override // com.dianping.portal.feature.j
    public final String utmMedium() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7355b5d72e600c1b4f000fd216cb3e1a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7355b5d72e600c1b4f000fd216cb3e1a") : this.$$delegate_0.utmMedium();
    }

    @Override // com.dianping.portal.feature.j
    public final String utmSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cfda16fcc83a1c6df900444cc25e363", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cfda16fcc83a1c6df900444cc25e363") : this.$$delegate_0.utmSource();
    }

    @Override // com.dianping.portal.feature.j
    public final String utmTerm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36cda85a9e199ccafb25052be15533b1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36cda85a9e199ccafb25052be15533b1") : this.$$delegate_0.utmTerm();
    }

    public /* synthetic */ HoloShieldLifeCycler(PortalBridge portalBridge, int i, f fVar) {
        this((i & 1) != 0 ? ShieldPlatformCustomization.INSTANCE.getPortalBridgeCreator().createPortalBridge() : portalBridge);
    }

    public HoloShieldLifeCycler(@NotNull PortalBridge portalBridge) {
        h.b(portalBridge, "portalBridge");
        Object[] objArr = {portalBridge};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d8ade35551095c19bf47a56b2378169", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d8ade35551095c19bf47a56b2378169");
            return;
        }
        this.$$delegate_0 = portalBridge;
        this.portalBridge = portalBridge;
    }

    @Override // com.dianping.shield.framework.ShieldLifeCycler
    @NotNull
    public final Fragment getHostFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a46b82b041ed2764887f7d569a1b588", RobustBitConfig.DEFAULT_VALUE) ? (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a46b82b041ed2764887f7d569a1b588") : super.getHostFragment();
    }

    @Override // com.dianping.shield.framework.ShieldLifeCycler
    public final void setHostFragment(@NotNull Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b26722cc828e7525ed107a880c7859ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b26722cc828e7525ed107a880c7859ca");
            return;
        }
        h.b(fragment, "value");
        this.portalBridge.setHostFragment(fragment);
        this.portalBridge.setHostLifeCycler(this);
        super.setHostFragment(fragment);
    }

    public final void onLogin(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b73317d084ed6a9c4cb26d8eea469c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b73317d084ed6a9c4cb26d8eea469c8");
            return;
        }
        ar hostWhiteBoard = getHostWhiteBoard();
        if (hostWhiteBoard != null) {
            hostWhiteBoard.a("wb_login", z);
        }
        ar hostWhiteBoard2 = getHostWhiteBoard();
        if (hostWhiteBoard2 != null) {
            hostWhiteBoard2.a(DMConstant.LOGIN_KEY, (Object) Boolean.valueOf(z));
        }
    }

    @Override // com.dianping.shield.framework.ShieldLifeCycler
    public final void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a49b9c0903994b9e0a1702f00594be0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a49b9c0903994b9e0a1702f00594be0");
            return;
        }
        if (getPageContainer() instanceof CommonPageContainer) {
            ab<?> pageContainer = getPageContainer();
            if (pageContainer == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.container.CommonPageContainer");
            }
            ((CommonPageContainer) pageContainer).setTitlebarProviderInterface(this.portalBridge);
            ab<?> pageContainer2 = getPageContainer();
            if (pageContainer2 == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.container.CommonPageContainer");
            }
            LoadingAndLoadingMoreCreator loadingCreator = ((CommonPageContainer) pageContainer2).getThemePackage().getLoadingCreator();
            if (loadingCreator != null) {
                if (getCellManager() instanceof com.dianping.agentsdk.manager.b) {
                    j<?> cellManager = getCellManager();
                    if (cellManager == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.agentsdk.manager.SectionRecyclerCellManager");
                    }
                    ((com.dianping.agentsdk.manager.b) cellManager).a(loadingCreator);
                } else if (getCellManager() instanceof ShieldNodeCellManager) {
                    j<?> cellManager2 = getCellManager();
                    if (cellManager2 == null) {
                        throw new o("null cannot be cast to non-null type com.dianping.shield.manager.ShieldNodeCellManager");
                    }
                    ((ShieldNodeCellManager) cellManager2).setLoadingAndLoadingMoreCreator(loadingCreator);
                }
            }
        }
        super.onActivityCreated(bundle);
    }
}
