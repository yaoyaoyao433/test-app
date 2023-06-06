package com.sankuai.waimai.reactnative.pullrefresh;

import android.view.View;
import com.alipay.sdk.widget.d;
import com.dianping.shield.consts.WhiteBoardKeyConsts;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.modular.wrapper.pull2refresh.a;
import com.sankuai.waimai.reactnative.pullfresh.b;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMPullRefreshManager extends ViewGroupManager<b> {
    public static final int REFRESH_COMPLETE_COMMAND = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMPullRefresh";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc012a458110aa2f517af66d2e96889a", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc012a458110aa2f517af66d2e96889a");
        }
        com.sankuai.waimai.foundation.utils.log.a.b("test", "PullToRefreshView createViewInstance:", new Object[0]);
        return new b(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ao aoVar, final b bVar) {
        Object[] objArr = {aoVar, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09d325eb3ccb99b4e4867aeb9e17bcd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09d325eb3ccb99b4e4867aeb9e17bcd5");
            return;
        }
        super.addEventEmitters(aoVar, (ao) bVar);
        bVar.setRefreshListener(new a.InterfaceC1030a() { // from class: com.sankuai.waimai.reactnative.pullrefresh.WMPullRefreshManager.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.modular.wrapper.pull2refresh.a.InterfaceC1030a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "690346ecd7273eb9d4ab35ddf8ceb747", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "690346ecd7273eb9d4ab35ddf8ceb747");
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("test", "onRefresh viewId:" + bVar.getId(), new Object[0]);
                ((RCTEventEmitter) aoVar.getJSModule(RCTEventEmitter.class)).receiveEvent(bVar.getId(), d.p, null);
            }
        });
    }

    @ReactProp(defaultInt = 0, name = "headerType")
    public void setHeaderType(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1af9f57a94e8ddc7d8fdb76eb608357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1af9f57a94e8ddc7d8fdb76eb608357");
        } else {
            bVar.setHeaderType(i);
        }
    }

    @ReactProp(defaultBoolean = true, name = "pullDownEnabled")
    public void setHeaderPullRefreshEnable(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b8089275b914b718ffac2b3c4d2605b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b8089275b914b718ffac2b3c4d2605b");
        } else {
            bVar.setHeaderPullRefreshEnable(z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9947575c169288c96ab2fa3c7870e6b5", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9947575c169288c96ab2fa3c7870e6b5") : c.b().a(d.p, c.a("phasedRegistrationNames", c.a("bubbled", d.p))).a();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(b bVar, View view, int i) {
        Object[] objArr = {bVar, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "458f3e524dcfc5b06bfe04d4d48fcfdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "458f3e524dcfc5b06bfe04d4d48fcfdc");
            return;
        }
        super.addView((WMPullRefreshManager) bVar, view, i);
        com.sankuai.waimai.foundation.utils.log.a.b("test", "addView", new Object[0]);
        bVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06ad941a6f61bee8a96a9ff655c0e75e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06ad941a6f61bee8a96a9ff655c0e75e") : c.a(WhiteBoardKeyConsts.REFRESH_COMPLETE, 1);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(b bVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {bVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d86048b7b072534832828c5f56f9eab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d86048b7b072534832828c5f56f9eab3");
            return;
        }
        super.receiveCommand((WMPullRefreshManager) bVar, i, readableArray);
        com.sankuai.waimai.foundation.utils.log.a.b("test", "receiveCommand commandId:" + i, new Object[0]);
        if (i == 1) {
            bVar.b();
        }
    }
}
