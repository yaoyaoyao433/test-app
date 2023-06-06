package com.meituan.msc.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.views.modal.ReactModalHostManager;
import com.meituan.android.recce.props.gens.HardwareAccelerated;
import com.meituan.android.recce.props.gens.StatusBarTranslucent;
import com.meituan.msc.jse.module.annotations.ReactModule;
import com.meituan.msc.uimanager.RNViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.ai;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.at;
import com.meituan.msc.views.modal.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNModalHostManager extends RNViewGroupManager<b> implements com.meituan.msc.viewmanagers.b<b> {
    public static ChangeQuickRedirect b;
    private final at<b> d;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return ReactModalHostManager.REACT_CLASS;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0fe28c7afe2eac14324382b4ee440d", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0fe28c7afe2eac14324382b4ee440d") : new b(themedReactContext);
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ Object a(View view, ab abVar, @Nullable ai aiVar) {
        b bVar = (b) view;
        Object[] objArr = {bVar, abVar, aiVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae0b2eff1cabf3087d93c0258e0ce24e", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae0b2eff1cabf3087d93c0258e0ce24e");
        }
        Point a = a.a(bVar.getContext());
        int i = a.x;
        int i2 = a.y;
        Object[] objArr2 = {aiVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c1f7b22d53aa5291571202704bf649d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c1f7b22d53aa5291571202704bf649d4");
            return null;
        }
        bVar.b.a(aiVar, i, i2);
        return null;
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(View view) {
        b bVar = (b) view;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3b05929fa9b47dcbfb221349ca646b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3b05929fa9b47dcbfb221349ca646b4");
            return;
        }
        super.a((RNModalHostManager) bVar);
        bVar.b();
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void a(ThemedReactContext themedReactContext, View view) {
        final b bVar = (b) view;
        Object[] objArr = {themedReactContext, bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daad9244035d44e23d418123ef0391be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daad9244035d44e23d418123ef0391be");
            return;
        }
        final com.meituan.msc.uimanager.events.b a = themedReactContext.getUIManagerModule().a();
        bVar.setOnRequestCloseListener(new b.InterfaceC0491b() { // from class: com.meituan.msc.views.modal.RNModalHostManager.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.views.modal.b.InterfaceC0491b
            public final void a(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b60b9d61d7265385c3bc85f351a3c129", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b60b9d61d7265385c3bc85f351a3c129");
                } else {
                    a.a(new c(bVar.getId()));
                }
            }
        });
        bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.meituan.msc.views.modal.RNModalHostManager.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c73d21ed9879447ae99a86f15f1b557b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c73d21ed9879447ae99a86f15f1b557b");
                } else {
                    a.a(new d(bVar.getId()));
                }
            }
        });
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ void b(View view) {
        b bVar = (b) view;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc4c14256f77a9f33b48f4b2ee64af4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc4c14256f77a9f33b48f4b2ee64af4b");
            return;
        }
        super.b((RNModalHostManager) bVar);
        bVar.a();
    }

    public RNModalHostManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4c5ac9d2482c6f65ee7dd9476dd239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4c5ac9d2482c6f65ee7dd9476dd239");
        } else {
            this.d = new com.meituan.msc.viewmanagers.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meituan.msc.uimanager.RNViewGroupManager
    /* renamed from: j */
    public RNModalHostShadowNode g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8cf4826e09a10c100d3c8a43bcbfde8", RobustBitConfig.DEFAULT_VALUE) ? (RNModalHostShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8cf4826e09a10c100d3c8a43bcbfde8") : new RNModalHostShadowNode();
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.as
    public final Class<? extends RNModalHostShadowNode> c() {
        return RNModalHostShadowNode.class;
    }

    @Override // com.meituan.msc.viewmanagers.b
    @ReactProp(name = "animationType")
    public void setAnimationType(b bVar, @Nullable String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3a5ce57e0f7f09ae524ccfc0d896c9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3a5ce57e0f7f09ae524ccfc0d896c9d");
        } else if (str != null) {
            bVar.setAnimationType(str);
        }
    }

    @Override // com.meituan.msc.viewmanagers.b
    @ReactProp(name = "transparent")
    public void setTransparent(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c82d655e83a7e3636a96a5d781c05978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c82d655e83a7e3636a96a5d781c05978");
        } else {
            bVar.setTransparent(z);
        }
    }

    @Override // com.meituan.msc.viewmanagers.b
    @ReactProp(name = StatusBarTranslucent.LOWER_CASE_NAME)
    public void setStatusBarTranslucent(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "812550bf2a1226e889c25cfada20f98f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "812550bf2a1226e889c25cfada20f98f");
        } else {
            bVar.setStatusBarTranslucent(z);
        }
    }

    @Override // com.meituan.msc.viewmanagers.b
    @ReactProp(name = HardwareAccelerated.LOWER_CASE_NAME)
    public void setHardwareAccelerated(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81255488317de06f3152abe0f878c83e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81255488317de06f3152abe0f878c83e");
        } else {
            bVar.setHardwareAccelerated(z);
        }
    }

    @Override // com.meituan.msc.uimanager.BaseViewManager, com.meituan.msc.uimanager.as
    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f4c67a17568c3285c5b11844a62a250", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f4c67a17568c3285c5b11844a62a250") : com.meituan.msc.jse.common.a.c().a("topRequestClose", com.meituan.msc.jse.common.a.a("registrationName", "onRequestClose")).a("topShow", com.meituan.msc.jse.common.a.a("registrationName", "onShow")).a();
    }

    @Override // com.meituan.msc.uimanager.as
    public final at<b> i() {
        return this.d;
    }
}
