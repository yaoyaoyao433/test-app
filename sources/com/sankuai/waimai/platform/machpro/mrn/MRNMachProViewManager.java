package com.sankuai.waimai.platform.machpro.mrn;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.c;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import com.sankuai.waimai.machpro.container.MPBaseFragment;
import com.sankuai.waimai.machpro.h;
import com.sankuai.waimai.machpro.util.b;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNMachProViewManager extends SimpleViewManager<a> {
    private static final int COMMAND_CALL_JS_MODULE = 102;
    private static final int COMMAND_SEND_EVENT = 101;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "WMMachProView";
    }

    @ReactProp(name = Constants.ModelBeanConstants.KEY_BUNDLE_NAME)
    public void setBundleName(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc9975336a600eadc2fcefe96ae13b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc9975336a600eadc2fcefe96ae13b3");
        } else {
            aVar.e = str;
        }
    }

    @ReactProp(name = "data")
    public void setData(a aVar, ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a493d6e1eb29b17ad27db643c933bcee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a493d6e1eb29b17ad27db643c933bcee");
        } else if (readableMap != null) {
            aVar.setRenderParams(b.a((Map<String, Object>) readableMap.toHashMap()));
        }
    }

    @ReactProp(name = "env")
    public void setEnv(a aVar, ReadableMap readableMap) {
        Object[] objArr = {aVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c3bf4677c274454300738b4d101d536", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c3bf4677c274454300738b4d101d536");
        } else if (readableMap != null) {
            aVar.setCustomEnv(b.a((Map<String, Object>) readableMap.toHashMap()));
        }
    }

    @ReactProp(name = "delayDisplay")
    public void setDelayDisplay(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a41e0b75ea2ddcaba5f901bad3c951ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a41e0b75ea2ddcaba5f901bad3c951ed");
        } else {
            aVar.setDelayDisplay(z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NonNull
    public a createViewInstance(@NonNull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d77dd36d21aabb46ed865af15c0b0676", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d77dd36d21aabb46ed865af15c0b0676") : new a(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Integer> getCommandsMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f9e11c550858faf5efcd69cfd42312a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f9e11c550858faf5efcd69cfd42312a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sendEvent", 101);
        hashMap.put("callJSModule", 102);
        return hashMap;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull a aVar, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, str, readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ddd98559e3341f51ff0e485b4e2fe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ddd98559e3341f51ff0e485b4e2fe2");
            return;
        }
        super.receiveCommand((MRNMachProViewManager) aVar, str, readableArray);
        switch (b.c((Object) str)) {
            case 101:
                a.a(aVar, readableArray);
                return;
            case 102:
                a.b(aVar, readableArray);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NonNull a aVar, int i, @Nullable ReadableArray readableArray) {
        Object[] objArr = {aVar, Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c954364edbf0feccf39313b80cad753", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c954364edbf0feccf39313b80cad753");
            return;
        }
        super.receiveCommand((MRNMachProViewManager) aVar, i, readableArray);
        switch (i) {
            case 101:
                a.a(aVar, readableArray);
                return;
            case 102:
                a.b(aVar, readableArray);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8c22a09d5c798e0f0b2efd15f99e24f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8c22a09d5c798e0f0b2efd15f99e24f");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("onReceiveEvent", c.a("phasedRegistrationNames", c.a("bubbled", "onReceiveEvent")));
        hashMap.put("onJSModuleCallback", c.a("phasedRegistrationNames", c.a("bubbled", "onJSModuleCallback")));
        return hashMap;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class MRNMachProFragment extends MPBaseFragment {
        public static ChangeQuickRedirect a;
        a b;
        MachMap c;

        @Override // android.support.v4.app.Fragment
        public void onSaveInstanceState(Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8367e476fb1c70f345cfc53841b8f1e7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8367e476fb1c70f345cfc53841b8f1e7");
                return;
            }
            super.onSaveInstanceState(bundle);
            if (this.c != null) {
                bundle.putSerializable("env", this.c);
            }
        }

        @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, com.sankuai.waimai.machpro.container.b
        public final void a(com.sankuai.waimai.mach.manager.cache.c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed1ec1c56919f709c69b5b52200e9244", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed1ec1c56919f709c69b5b52200e9244");
                return;
            }
            super.a(cVar);
            if (this.b != null) {
                this.b.post(new Runnable() { // from class: com.sankuai.waimai.platform.machpro.mrn.MRNMachProViewManager.MRNMachProFragment.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12a4e1d880a475f2b1118861886346eb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12a4e1d880a475f2b1118861886346eb");
                            return;
                        }
                        MRNMachProFragment.this.b.setVisibility(0);
                        MRNMachProFragment.this.b.measure(View.MeasureSpec.makeMeasureSpec(MRNMachProFragment.this.b.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(MRNMachProFragment.this.b.getHeight(), 1073741824));
                        MRNMachProFragment.this.b.layout(0, 0, MRNMachProFragment.this.b.getWidth(), MRNMachProFragment.this.b.getHeight());
                    }
                });
            }
        }

        @Override // com.sankuai.waimai.machpro.container.MPBaseFragment, android.support.v4.app.Fragment
        public void onCreate(@Nullable Bundle bundle) {
            Object[] objArr = {bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "034dacfa67f8fdce5d83aba6767fed71", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "034dacfa67f8fdce5d83aba6767fed71");
                return;
            }
            super.onCreate(bundle);
            if (this.b == null) {
                try {
                    this.c = (MachMap) f.a(bundle, "env");
                    this.g.a(this.c);
                    return;
                } catch (Exception e) {
                    com.sankuai.waimai.machpro.util.a.a("MRNMachProViewManager-->" + e.getMessage());
                    return;
                }
            }
            this.c = this.b.g;
            this.g.a(this.b.g);
            this.g.a(this.b.h);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends FrameLayout {
        public static ChangeQuickRedirect a;
        private boolean b;
        private final ao c;
        private MRNMachProFragment d;
        private String e;
        private MachMap f;
        private MachMap g;
        private h h;

        public static /* synthetic */ void a(a aVar, ReadableArray readableArray) {
            Object[] objArr = {readableArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "f8fe9cce2e8940703cef4524b06b1634", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "f8fe9cce2e8940703cef4524b06b1634");
            } else if (readableArray != null) {
                try {
                    if (readableArray.size() <= 0) {
                        return;
                    }
                    String string = readableArray.getString(0);
                    MachMap machMap = null;
                    if (readableArray.size() >= 2 && readableArray.getMap(1) != null) {
                        machMap = b.a((Map<String, Object>) readableArray.getMap(1).toHashMap());
                    }
                    aVar.d.g.a(string, machMap);
                } catch (Exception e) {
                    com.sankuai.waimai.machpro.util.a.a("MRNMachProViewManager-->" + e.getMessage());
                }
            }
        }

        public static /* synthetic */ void b(a aVar, ReadableArray readableArray) {
            Object[] objArr = {readableArray};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "79932d65bc6eff2b7b6ab468e5cd723e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "79932d65bc6eff2b7b6ab468e5cd723e");
            } else if (readableArray != null) {
                try {
                    if (readableArray.size() < 3) {
                        return;
                    }
                    Object a2 = aVar.d.g.a(readableArray.getString(0), readableArray.getString(1), readableArray.getArray(2) != null ? b.a((List) readableArray.getArray(2).toArrayList()) : null);
                    if (readableArray.size() >= 4) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putDouble("callbackId", readableArray.getDouble(3));
                        if (a2 instanceof MachMap) {
                            createMap.putMap("data", (WritableMap) Arguments.makeNativeMap(b.b((MachMap) a2)));
                        }
                        ((RCTEventEmitter) aVar.c.getJSModule(RCTEventEmitter.class)).receiveEvent(aVar.getId(), "onJSModuleCallback", createMap);
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.machpro.util.a.a("MRNMachProViewManager-->" + e.getMessage());
                }
            }
        }

        public a(@NonNull Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64cb8491ff9526314950373551c3471f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64cb8491ff9526314950373551c3471f");
                return;
            }
            this.h = new h() { // from class: com.sankuai.waimai.platform.machpro.mrn.MRNMachProViewManager.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.machpro.h
                public final void a(String str, MachMap machMap) {
                    Object[] objArr2 = {str, machMap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25705fade0cb131690bbea1d269ad449", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25705fade0cb131690bbea1d269ad449");
                        return;
                    }
                    try {
                        if (!TextUtils.isEmpty(str) && a.this.c != null) {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putString("event", str);
                            createMap.putMap("params", (WritableMap) Arguments.makeNativeMap(b.b(machMap)));
                            ((RCTEventEmitter) a.this.c.getJSModule(RCTEventEmitter.class)).receiveEvent(a.this.getId(), "onReceiveEvent", createMap);
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.machpro.util.a.a(e.getMessage());
                    }
                }
            };
            this.c = (ao) context;
        }

        public final void setDelayDisplay(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "062db9484d9a9131c930a29623c97975", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "062db9484d9a9131c930a29623c97975");
            } else if (z) {
                setVisibility(4);
            }
        }

        public final void setRenderParams(MachMap machMap) {
            Object[] objArr = {machMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab02a4d9a83aa647ff4a747de75bc2f3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab02a4d9a83aa647ff4a747de75bc2f3");
                return;
            }
            this.f = machMap;
            if (this.d != null) {
                MRNMachProFragment mRNMachProFragment = this.d;
                Object[] objArr2 = {machMap};
                ChangeQuickRedirect changeQuickRedirect2 = MRNMachProFragment.a;
                if (PatchProxy.isSupport(objArr2, mRNMachProFragment, changeQuickRedirect2, false, "78950700beb3fb206dca6bfb17a8bfbd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mRNMachProFragment, changeQuickRedirect2, false, "78950700beb3fb206dca6bfb17a8bfbd");
                } else {
                    mRNMachProFragment.g.b(machMap);
                }
            }
        }

        public final void setCustomEnv(MachMap machMap) {
            Object[] objArr = {machMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a883e582c9a89e336a647747b0fa1b29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a883e582c9a89e336a647747b0fa1b29");
                return;
            }
            this.g = machMap;
            if (this.d != null) {
                MRNMachProFragment mRNMachProFragment = this.d;
                Object[] objArr2 = {machMap};
                ChangeQuickRedirect changeQuickRedirect2 = MRNMachProFragment.a;
                if (PatchProxy.isSupport(objArr2, mRNMachProFragment, changeQuickRedirect2, false, "c5a16d4870c549a012e2f5c8acec7c9f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mRNMachProFragment, changeQuickRedirect2, false, "c5a16d4870c549a012e2f5c8acec7c9f");
                    return;
                }
                mRNMachProFragment.c = machMap;
                mRNMachProFragment.g.a(machMap);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3e0851776696ce812641133872691a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3e0851776696ce812641133872691a");
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.b) {
                return;
            }
            this.b = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2615079e2ca0c37e679d869a37fb7cd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2615079e2ca0c37e679d869a37fb7cd6");
            } else {
                post(new Runnable() { // from class: com.sankuai.waimai.platform.machpro.mrn.MRNMachProViewManager.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "47bc048d75d321ad49a55661ba96996d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "47bc048d75d321ad49a55661ba96996d");
                            return;
                        }
                        try {
                            if (a.this.c == null || !(a.this.c.getCurrentActivity() instanceof FragmentActivity)) {
                                return;
                            }
                            if (a.this.c.getCurrentActivity().findViewById(a.this.getId()) == null) {
                                com.sankuai.waimai.machpro.util.a.a("MRNMachProViewManager | renderMachPro | view = null!!!");
                                return;
                            }
                            a.this.d = new MRNMachProFragment();
                            a.this.d.b = a.this;
                            Bundle bundle = new Bundle();
                            bundle.putString("bundle_name", a.this.e);
                            bundle.putSerializable("bundle_params", a.this.f);
                            a.this.d.setArguments(bundle);
                            ((FragmentActivity) a.this.c.getCurrentActivity()).getSupportFragmentManager().beginTransaction().add(a.this.getId(), a.this.d).commitAllowingStateLoss();
                        } catch (Exception e) {
                            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
                        }
                    }
                });
            }
        }

        @Override // android.view.View, android.view.ViewParent
        public final void requestLayout() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae916971afd636122467ba08376eb4a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae916971afd636122467ba08376eb4a");
                return;
            }
            super.requestLayout();
            post(new Runnable() { // from class: com.sankuai.waimai.platform.machpro.mrn.MRNMachProViewManager.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1505c3d8239c0f906b78808acef7321", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1505c3d8239c0f906b78808acef7321");
                        return;
                    }
                    a.this.measure(View.MeasureSpec.makeMeasureSpec(a.this.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(a.this.getHeight(), 1073741824));
                    a.this.layout(0, 0, a.this.getWidth(), a.this.getHeight());
                }
            });
        }
    }
}
