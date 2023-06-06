package com.dianping.shield.manager;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.dianping.dataservice.mapi.g;
import com.dianping.picasso.PicassoUtils;
import com.dianping.portal.feature.b;
import com.dianping.portal.feature.c;
import com.dianping.portal.feature.d;
import com.dianping.portal.feature.e;
import com.dianping.portal.feature.i;
import com.dianping.portal.feature.j;
import com.dianping.portal.model.a;
import com.dianping.shield.component.widgets.ScTitleBar;
import com.dianping.shield.component.widgets.ScTitleBarProviderInterface;
import com.dianping.shield.framework.PortalBridgeInterface;
import com.dianping.shield.framework.ShieldLifeCycler;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u0014H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\n\u0010$\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0010H\u0016J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020,H\u0016J\n\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00101\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\u0012\u00105\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u0012\u00109\u001a\u00020\u00102\b\u0010:\u001a\u0004\u0018\u000108H\u0016J\u0010\u0010;\u001a\u00020\u00102\u0006\u0010<\u001a\u00020*H\u0016J\u0018\u0010=\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010>\u001a\u00020!H\u0016J\u0010\u0010?\u001a\u00020\u00102\u0006\u0010@\u001a\u00020*H\u0016J\u0010\u0010A\u001a\u00020\u00102\u0006\u0010B\u001a\u00020*H\u0016J\u0012\u0010C\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\"\u0010C\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020*H\u0016J\u0012\u0010F\u001a\u00020\u00102\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u00020\u0010H\u0016J\u0018\u0010J\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u00102\u001a\u000203H\u0016J\n\u0010K\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010L\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010M\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010N\u001a\u0004\u0018\u00010\u0014H\u0016J\n\u0010O\u001a\u0004\u0018\u00010\u0014H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u001a\u0010\t\u001a\u00020\nX\u0096.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006P"}, d2 = {"Lcom/dianping/shield/manager/PortalBridge;", "Lcom/dianping/shield/framework/PortalBridgeInterface;", "()V", "hostFragment", "Landroid/support/v4/app/Fragment;", "(Landroid/support/v4/app/Fragment;)V", "getHostFragment", "()Landroid/support/v4/app/Fragment;", "setHostFragment", "hostLifeCycler", "Lcom/dianping/shield/framework/ShieldLifeCycler;", "getHostLifeCycler", "()Lcom/dianping/shield/framework/ShieldLifeCycler;", "setHostLifeCycler", "(Lcom/dianping/shield/framework/ShieldLifeCycler;)V", "addRightViewItem", "", Constants.EventType.VIEW, "Landroid/view/View;", "tag", "", "listener", "Landroid/view/View$OnClickListener;", "appendUrlParms", com.meituan.metrics.common.Constants.TRAFFIC_URI, "bindCaptureProvider", Constants.Environment.KEY_CITYID, "", "findRightViewItemByTag", "fingerPrint", "getConfigProperty", "propertyKey", "getConfigPropertyHolder", "Lcom/dianping/portal/feature/PropertyHolderInterface;", "getScTitleBar", "Lcom/dianping/shield/component/widgets/ScTitleBar;", "getToken", "getUser", "Lcom/dianping/portal/model/CommonUser;", "gotoLogin", "hideTitlebar", "isLogin", "", Constants.PRIVACY.KEY_LATITUDE, "", "logout", Constants.PRIVACY.KEY_LONGITUDE, "mapiService", "Lcom/dianping/dataservice/mapi/MApiService;", "registerConfigProperty", "configPropertyChangeListener", "Lcom/dianping/portal/feature/ConfigPropertyChangeListener;", "removeAllRightViewItem", "removeRightViewItem", "setBarSubtitle", "subtitle", "", "setBarTitle", "title", "setIsTransparentTitleBar", "isTransparentTitleBar", "setPropertyHolderInterface", "propertyHolderInterface", "setShowLeftButton", "showLeftButton", "setShowRightButton", "showRightButton", "setTitleCustomView", "showLeft", "showRight", "setTitlebarBackground", PicassoUtils.DEF_TYPE, "Landroid/graphics/drawable/Drawable;", "showTitlebar", "unRegisterConfigProperty", "utmCampaign", "utmContent", "utmMedium", "utmSource", "utmTerm", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public class PortalBridge implements PortalBridgeInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public Fragment hostFragment;
    @NotNull
    public ShieldLifeCycler hostLifeCycler;

    public void logout() {
    }

    @NotNull
    public Fragment getHostFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02f91377d9f6873a0f8df25d0f2b0055", RobustBitConfig.DEFAULT_VALUE)) {
            return (Fragment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02f91377d9f6873a0f8df25d0f2b0055");
        }
        Fragment fragment = this.hostFragment;
        if (fragment == null) {
            h.a("hostFragment");
        }
        return fragment;
    }

    public void setHostFragment(@NotNull Fragment fragment) {
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "428b669fdee1791db43859aa0fb6b31b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "428b669fdee1791db43859aa0fb6b31b");
            return;
        }
        h.b(fragment, "<set-?>");
        this.hostFragment = fragment;
    }

    @NotNull
    public ShieldLifeCycler getHostLifeCycler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01fbd08526e6ef843f7f9b0d47221d36", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldLifeCycler) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01fbd08526e6ef843f7f9b0d47221d36");
        }
        ShieldLifeCycler shieldLifeCycler = this.hostLifeCycler;
        if (shieldLifeCycler == null) {
            h.a("hostLifeCycler");
        }
        return shieldLifeCycler;
    }

    public void setHostLifeCycler(@NotNull ShieldLifeCycler shieldLifeCycler) {
        Object[] objArr = {shieldLifeCycler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a7038f952f5e3c37286afe3f3f0d0ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a7038f952f5e3c37286afe3f3f0d0ff");
            return;
        }
        h.b(shieldLifeCycler, "<set-?>");
        this.hostLifeCycler = shieldLifeCycler;
    }

    public PortalBridge() {
    }

    public PortalBridge(@NotNull Fragment fragment) {
        h.b(fragment, "hostFragment");
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89f64ea1d4f2a55f0665f10528a72826", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89f64ea1d4f2a55f0665f10528a72826");
        } else {
            setHostFragment(fragment);
        }
    }

    @Override // com.dianping.portal.feature.h
    @Nullable
    public g mapiService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23992d5e33b868b3f79c0dc392ff757e", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23992d5e33b868b3f79c0dc392ff757e");
        }
        if (getHostFragment().getActivity() instanceof com.dianping.portal.feature.h) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((com.dianping.portal.feature.h) activity).mapiService();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ServiceProviderInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.h
    @Nullable
    public String appendUrlParms(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "253d3dee7ef5791c2aa88eed8d4e5740", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "253d3dee7ef5791c2aa88eed8d4e5740");
        }
        if (getHostFragment().getActivity() instanceof com.dianping.portal.feature.h) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((com.dianping.portal.feature.h) activity).appendUrlParms(str);
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ServiceProviderInterface");
        }
        return str;
    }

    @Override // com.dianping.portal.feature.e
    public void gotoLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7676ff1074041b1ab29f405087dd6e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7676ff1074041b1ab29f405087dd6e9");
        } else if (getHostFragment().getActivity() instanceof e) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.LoginProviderInterface");
            }
            ((e) activity).gotoLogin();
        }
    }

    @Override // com.dianping.portal.feature.e
    @Nullable
    public String getToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ec66fa2a47e7e87e026105a7508d890", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ec66fa2a47e7e87e026105a7508d890");
        }
        if (getHostFragment().getActivity() instanceof e) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((e) activity).getToken();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.LoginProviderInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.e
    public boolean isLogin() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9266e69d9edf5e3881ee93f041645cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9266e69d9edf5e3881ee93f041645cfe")).booleanValue();
        }
        if (getHostFragment().getActivity() instanceof e) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((e) activity).isLogin();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.LoginProviderInterface");
        }
        return false;
    }

    @Override // com.dianping.portal.feature.e
    @Nullable
    public a getUser() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cad10a4b6b957e73a61dcc387e680d31", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cad10a4b6b957e73a61dcc387e680d31");
        }
        if (getHostFragment().getActivity() instanceof e) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((e) activity).getUser();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.LoginProviderInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.d
    public long cityid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a5fe173dff19a6203f6217ab1e2761e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a5fe173dff19a6203f6217ab1e2761e")).longValue();
        }
        if (getHostFragment().getActivity() instanceof d) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((d) activity).cityid();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.EnvironmentParamsInterface");
        }
        return -1L;
    }

    @Override // com.dianping.portal.feature.d
    public double latitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8415928814d3b614a7d5f5f16f132dba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8415928814d3b614a7d5f5f16f132dba")).doubleValue();
        }
        if (getHostFragment().getActivity() instanceof d) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((d) activity).latitude();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.EnvironmentParamsInterface");
        }
        return 0.0d;
    }

    @Override // com.dianping.portal.feature.d
    public double longitude() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2f70f940c9cecabc2b704c0ac84f63f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2f70f940c9cecabc2b704c0ac84f63f")).doubleValue();
        }
        if (getHostFragment().getActivity() instanceof d) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((d) activity).longitude();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.EnvironmentParamsInterface");
        }
        return 0.0d;
    }

    @Override // com.dianping.portal.feature.j
    @Nullable
    public String fingerPrint() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "034e62402ad370fd568611d3874cc294", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "034e62402ad370fd568611d3874cc294");
        }
        if (getHostFragment().getActivity() instanceof j) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((j) activity).fingerPrint();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.UTMInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.j
    @Nullable
    public String utmMedium() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e99af7d99abb0522c13a1ec0adf9aced", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e99af7d99abb0522c13a1ec0adf9aced");
        }
        if (getHostFragment().getActivity() instanceof j) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((j) activity).utmMedium();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.UTMInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.j
    @Nullable
    public String utmContent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c20abe04891a342877119f1702f0f69f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c20abe04891a342877119f1702f0f69f");
        }
        if (getHostFragment().getActivity() instanceof j) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((j) activity).utmContent();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.UTMInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.j
    @Nullable
    public String utmCampaign() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "208657debbeb3d4bf4099860fa6a805f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "208657debbeb3d4bf4099860fa6a805f");
        }
        if (getHostFragment().getActivity() instanceof j) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((j) activity).utmCampaign();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.UTMInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.j
    @Nullable
    public String utmSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3257e16f5eb13a04e3daf34fe6b45628", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3257e16f5eb13a04e3daf34fe6b45628");
        }
        if (getHostFragment().getActivity() instanceof j) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((j) activity).utmSource();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.UTMInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.j
    @Nullable
    public String utmTerm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a964971f0e8464c7a83f36b2b06a0c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a964971f0e8464c7a83f36b2b06a0c1");
        }
        if (getHostFragment().getActivity() instanceof j) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((j) activity).utmTerm();
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.UTMInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.i
    public void setBarTitle(@Nullable CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1c3e006c88ad37d290a8ca38846ee2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1c3e006c88ad37d290a8ca38846ee2cc");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setBarTitle(charSequence);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setBarTitle(charSequence);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setBarSubtitle(@Nullable CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b91734e6850af7b897e4c318e7b2278b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b91734e6850af7b897e4c318e7b2278b");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setBarSubtitle(charSequence);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setBarSubtitle(charSequence);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setTitlebarBackground(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e2467cdcba9b89150dae11fc2f2e8d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e2467cdcba9b89150dae11fc2f2e8d3");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setTitlebarBackground(drawable);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setTitlebarBackground(drawable);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void showTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94984eb0b2321729b5c907f7cdb16d66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94984eb0b2321729b5c907f7cdb16d66");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.showTitlebar();
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).showTitlebar();
        }
    }

    @Override // com.dianping.portal.feature.i
    public void hideTitlebar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d45e043d259eddd667d42364b62c735c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d45e043d259eddd667d42364b62c735c");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.hideTitlebar();
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).hideTitlebar();
        }
    }

    @Override // com.dianping.portal.feature.i
    public void addRightViewItem(@Nullable View view, @Nullable String str, @Nullable View.OnClickListener onClickListener) {
        Object[] objArr = {view, str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "501900b31cfec03eb690c92df6de9a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "501900b31cfec03eb690c92df6de9a03");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.addRightViewItem(view, str, onClickListener);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).addRightViewItem(view, str, onClickListener);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void removeRightViewItem(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "359e797c8e6b33241c4d85074200d8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "359e797c8e6b33241c4d85074200d8c4");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.removeRightViewItem(str);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).removeRightViewItem(str);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void removeAllRightViewItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "696b2c87aec6a230d5b7a78bacb55705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "696b2c87aec6a230d5b7a78bacb55705");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.removeAllRightViewItem();
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).removeAllRightViewItem();
        }
    }

    @Override // com.dianping.portal.feature.i
    @Nullable
    public View findRightViewItemByTag(@Nullable String str) {
        View findRightViewItemByTag;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "805612b871d4f51caf513dadebc1020e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "805612b871d4f51caf513dadebc1020e");
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar == null || (findRightViewItemByTag = scTitleBar.findRightViewItemByTag(str)) == null) {
            if (getHostFragment().getActivity() instanceof i) {
                FragmentActivity activity = getHostFragment().getActivity();
                if (activity != null) {
                    return ((i) activity).findRightViewItemByTag(str);
                }
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            return null;
        }
        return findRightViewItemByTag;
    }

    @Override // com.dianping.portal.feature.i
    public void setTitleCustomView(@Nullable View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1b0f989d3dab02a997df5082c6e462f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1b0f989d3dab02a997df5082c6e462f");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setTitleCustomView(view);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setTitleCustomView(view);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setShowLeftButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22d3992f1f2b6799d5d7540097dab976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22d3992f1f2b6799d5d7540097dab976");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setShowLeftButton(z);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setShowLeftButton(z);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setShowRightButton(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e48fb2ab823efdda32e866808f6c154d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e48fb2ab823efdda32e866808f6c154d");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setShowRightButton(z);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setShowRightButton(z);
        }
    }

    @Override // com.dianping.portal.feature.i
    public void setTitleCustomView(@Nullable View view, boolean z, boolean z2) {
        Object[] objArr = {view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "536a8c29b1f44a7857ae530b40e73980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "536a8c29b1f44a7857ae530b40e73980");
            return;
        }
        ScTitleBar scTitleBar = getScTitleBar();
        if (scTitleBar != null) {
            scTitleBar.setTitleCustomView(view, z, z2);
        } else if (getHostFragment().getActivity() instanceof i) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.TitleBarProviderInterface");
            }
            ((i) activity).setTitleCustomView(view, z, z2);
        }
    }

    @Override // com.dianping.shield.component.widgets.ScTitleBarProviderInterface
    @Nullable
    public ScTitleBar getScTitleBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ab02583db5c754f0945fa4af1985188", RobustBitConfig.DEFAULT_VALUE)) {
            return (ScTitleBar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ab02583db5c754f0945fa4af1985188");
        }
        if (getHostFragment().getActivity() instanceof ScTitleBarProviderInterface) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((ScTitleBarProviderInterface) activity).getScTitleBar();
            }
            throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.ScTitleBarProviderInterface");
        }
        return null;
    }

    @Override // com.dianping.shield.component.widgets.ScTitleBarProviderInterface
    public void setIsTransparentTitleBar(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7f76c6e966a5e37e751cbcaded87dae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7f76c6e966a5e37e751cbcaded87dae");
        } else if (getHostFragment().getActivity() instanceof ScTitleBarProviderInterface) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.shield.component.widgets.ScTitleBarProviderInterface");
            }
            ((ScTitleBarProviderInterface) activity).setIsTransparentTitleBar(z);
        }
    }

    @Override // com.dianping.portal.feature.a
    public void bindCaptureProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c83df5186fdb70d8db081de514ee3de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c83df5186fdb70d8db081de514ee3de");
        } else if (getHostFragment().getActivity() instanceof com.dianping.portal.feature.a) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.BindCaptureProviderInterface");
            }
            ((com.dianping.portal.feature.a) activity).bindCaptureProvider();
        }
    }

    @Override // com.dianping.portal.feature.c
    @Nullable
    public com.dianping.portal.feature.g getConfigPropertyHolder(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7e7a768a8350d558d693487bcb728e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.portal.feature.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7e7a768a8350d558d693487bcb728e2");
        }
        h.b(str, "propertyKey");
        if (getHostFragment().getActivity() instanceof c) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((c) activity).getConfigPropertyHolder(str);
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ConfigPropertyProviderInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.c
    public boolean setPropertyHolderInterface(@NotNull String str, @NotNull com.dianping.portal.feature.g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de4d7bb1f45655ff3a3c29cb8b3ed0c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de4d7bb1f45655ff3a3c29cb8b3ed0c2")).booleanValue();
        }
        h.b(str, "propertyKey");
        h.b(gVar, "propertyHolderInterface");
        if (getHostFragment().getActivity() instanceof c) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((c) activity).setPropertyHolderInterface(str, gVar);
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ConfigPropertyProviderInterface");
        }
        return false;
    }

    @Override // com.dianping.portal.feature.c
    @Nullable
    public String getConfigProperty(@NotNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c24b47ad93ed8e180842cf9ba3d0ada1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c24b47ad93ed8e180842cf9ba3d0ada1");
        }
        h.b(str, "propertyKey");
        if (getHostFragment().getActivity() instanceof c) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity != null) {
                return ((c) activity).getConfigProperty(str);
            }
            throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ConfigPropertyProviderInterface");
        }
        return null;
    }

    @Override // com.dianping.portal.feature.c
    public void registerConfigProperty(@NotNull String str, @NotNull b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "581ce4a9665eac851bc48b443a7f3937", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "581ce4a9665eac851bc48b443a7f3937");
            return;
        }
        h.b(str, "propertyKey");
        h.b(bVar, "configPropertyChangeListener");
        if (getHostFragment().getActivity() instanceof c) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ConfigPropertyProviderInterface");
            }
            ((c) activity).registerConfigProperty(str, bVar);
        }
    }

    @Override // com.dianping.portal.feature.c
    public void unRegisterConfigProperty(@NotNull String str, @NotNull b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2854bc164ac9b678da19dd8bf1f50e24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2854bc164ac9b678da19dd8bf1f50e24");
            return;
        }
        h.b(str, "propertyKey");
        h.b(bVar, "configPropertyChangeListener");
        if (getHostFragment().getActivity() instanceof c) {
            FragmentActivity activity = getHostFragment().getActivity();
            if (activity == null) {
                throw new o("null cannot be cast to non-null type com.dianping.portal.feature.ConfigPropertyProviderInterface");
            }
            ((c) activity).unRegisterConfigProperty(str, bVar);
        }
    }
}
