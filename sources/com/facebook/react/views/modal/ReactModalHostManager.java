package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.an;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.bb;
import com.facebook.react.viewmanagers.i;
import com.facebook.react.viewmanagers.j;
import com.facebook.react.views.modal.b;
import com.meituan.android.recce.props.gens.HardwareAccelerated;
import com.meituan.android.recce.props.gens.StatusBarTranslucent;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactModalHostManager extends ViewGroupManager<b> implements j<b> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final bb<b> mDelegate = new i(this);

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.j
    public void setAnimated(b bVar, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.j
    public void setIdentifier(b bVar, int i) {
    }

    @Override // com.facebook.react.viewmanagers.j
    public void setPresentationStyle(b bVar, @Nullable String str) {
    }

    @Override // com.facebook.react.viewmanagers.j
    public void setSupportedOrientations(b bVar, @Nullable ReadableArray readableArray) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(ao aoVar) {
        return new b(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ModalHostShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ModalHostShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(b bVar) {
        super.onDropViewInstance((ReactModalHostManager) bVar);
        bVar.a();
    }

    @Override // com.facebook.react.viewmanagers.j
    @ReactProp(name = "animationType")
    public void setAnimationType(b bVar, @Nullable String str) {
        if (str != null) {
            bVar.setAnimationType(str);
        }
    }

    @Override // com.facebook.react.viewmanagers.j
    @ReactProp(name = "transparent")
    public void setTransparent(b bVar, boolean z) {
        bVar.setTransparent(z);
    }

    @Override // com.facebook.react.viewmanagers.j
    @ReactProp(name = StatusBarTranslucent.LOWER_CASE_NAME)
    public void setStatusBarTranslucent(b bVar, boolean z) {
        bVar.setStatusBarTranslucent(z);
    }

    @Override // com.facebook.react.viewmanagers.j
    @ReactProp(name = HardwareAccelerated.LOWER_CASE_NAME)
    public void setHardwareAccelerated(b bVar, boolean z) {
        bVar.setHardwareAccelerated(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ao aoVar, final b bVar) {
        final com.facebook.react.uimanager.events.c eventDispatcher = ((UIManagerModule) aoVar.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        bVar.setOnRequestCloseListener(new b.InterfaceC0152b() { // from class: com.facebook.react.views.modal.ReactModalHostManager.1
            @Override // com.facebook.react.views.modal.b.InterfaceC0152b
            public final void a(DialogInterface dialogInterface) {
                eventDispatcher.a(new c(bVar.getId()));
            }
        });
        bVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.ReactModalHostManager.2
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                eventDispatcher.a(new d(bVar.getId()));
            }
        });
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.c.b().a("topRequestClose", com.facebook.react.common.c.a("registrationName", "onRequestClose")).a("topShow", com.facebook.react.common.c.a("registrationName", "onShow")).a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(b bVar) {
        super.onAfterUpdateTransaction((ReactModalHostManager) bVar);
        bVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(b bVar, ag agVar, @Nullable an anVar) {
        Point a = a.a(bVar.getContext());
        bVar.a.a(anVar, a.x, a.y);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public bb<b> getDelegate() {
        return this.mDelegate;
    }
}
