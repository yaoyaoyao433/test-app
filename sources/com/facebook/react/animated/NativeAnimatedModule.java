package com.facebook.react.animated;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ar;
import com.facebook.react.uimanager.ax;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: ProGuard */
@ReactModule(name = NativeAnimatedModule.NAME)
/* loaded from: classes.dex */
public class NativeAnimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, ax {
    public static final String NAME = "NativeAnimatedModule";
    private final com.facebook.react.uimanager.g mAnimatedFrameCallback;
    @Nullable
    private l mNodesManager;
    private ArrayList<a> mOperations;
    private ArrayList<a> mPreOperations;
    private final com.facebook.react.modules.core.g mReactChoreographer;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(l lVar);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @ReactMethod
    public void removeListeners(double d) {
    }

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mPreOperations = new ArrayList<>();
        this.mReactChoreographer = com.facebook.react.modules.core.g.b();
        this.mAnimatedFrameCallback = new com.facebook.react.uimanager.g(reactApplicationContext) { // from class: com.facebook.react.animated.NativeAnimatedModule.1
            /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[Catch: Exception -> 0x00ba, TryCatch #0 {Exception -> 0x00ba, blocks: (B:2:0x0000, B:4:0x0010, B:10:0x001e, B:11:0x0022, B:13:0x002a, B:14:0x003a, B:15:0x0041, B:17:0x0049, B:20:0x0060, B:21:0x0063, B:23:0x006f, B:25:0x0078, B:27:0x0084, B:29:0x0088, B:30:0x009a, B:31:0x009f, B:32:0x00a2), top: B:37:0x0000 }] */
            @Override // com.facebook.react.uimanager.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(long r9) {
                /*
                    r8 = this;
                    com.facebook.react.animated.NativeAnimatedModule r0 = com.facebook.react.animated.NativeAnimatedModule.this     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.animated.l r0 = com.facebook.react.animated.NativeAnimatedModule.access$000(r0)     // Catch: java.lang.Exception -> Lba
                    android.util.SparseArray<com.facebook.react.animated.d> r1 = r0.b     // Catch: java.lang.Exception -> Lba
                    int r1 = r1.size()     // Catch: java.lang.Exception -> Lba
                    r2 = 0
                    r3 = 1
                    if (r1 > 0) goto L1b
                    android.util.SparseArray<com.facebook.react.animated.b> r1 = r0.c     // Catch: java.lang.Exception -> Lba
                    int r1 = r1.size()     // Catch: java.lang.Exception -> Lba
                    if (r1 <= 0) goto L19
                    goto L1b
                L19:
                    r1 = 0
                    goto L1c
                L1b:
                    r1 = 1
                L1c:
                    if (r1 == 0) goto La2
                    com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch: java.lang.Exception -> Lba
                    r1 = 0
                L22:
                    android.util.SparseArray<com.facebook.react.animated.b> r4 = r0.c     // Catch: java.lang.Exception -> Lba
                    int r4 = r4.size()     // Catch: java.lang.Exception -> Lba
                    if (r1 >= r4) goto L3a
                    android.util.SparseArray<com.facebook.react.animated.b> r4 = r0.c     // Catch: java.lang.Exception -> Lba
                    java.lang.Object r4 = r4.valueAt(r1)     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.animated.b r4 = (com.facebook.react.animated.b) r4     // Catch: java.lang.Exception -> Lba
                    java.util.List<com.facebook.react.animated.b> r5 = r0.f     // Catch: java.lang.Exception -> Lba
                    r5.add(r4)     // Catch: java.lang.Exception -> Lba
                    int r1 = r1 + 1
                    goto L22
                L3a:
                    android.util.SparseArray<com.facebook.react.animated.b> r1 = r0.c     // Catch: java.lang.Exception -> Lba
                    r1.clear()     // Catch: java.lang.Exception -> Lba
                    r1 = 0
                    r4 = 0
                L41:
                    android.util.SparseArray<com.facebook.react.animated.d> r5 = r0.b     // Catch: java.lang.Exception -> Lba
                    int r5 = r5.size()     // Catch: java.lang.Exception -> Lba
                    if (r1 >= r5) goto L63
                    android.util.SparseArray<com.facebook.react.animated.d> r5 = r0.b     // Catch: java.lang.Exception -> Lba
                    java.lang.Object r5 = r5.valueAt(r1)     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.animated.d r5 = (com.facebook.react.animated.d) r5     // Catch: java.lang.Exception -> Lba
                    r5.a(r9)     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.animated.s r6 = r5.b     // Catch: java.lang.Exception -> Lba
                    java.util.List<com.facebook.react.animated.b> r7 = r0.f     // Catch: java.lang.Exception -> Lba
                    r7.add(r6)     // Catch: java.lang.Exception -> Lba
                    boolean r5 = r5.a     // Catch: java.lang.Exception -> Lba
                    if (r5 == 0) goto L60
                    r4 = 1
                L60:
                    int r1 = r1 + 1
                    goto L41
                L63:
                    java.util.List<com.facebook.react.animated.b> r9 = r0.f     // Catch: java.lang.Exception -> Lba
                    r0.a(r9)     // Catch: java.lang.Exception -> Lba
                    java.util.List<com.facebook.react.animated.b> r9 = r0.f     // Catch: java.lang.Exception -> Lba
                    r9.clear()     // Catch: java.lang.Exception -> Lba
                    if (r4 == 0) goto La2
                    android.util.SparseArray<com.facebook.react.animated.d> r9 = r0.b     // Catch: java.lang.Exception -> Lba
                    int r9 = r9.size()     // Catch: java.lang.Exception -> Lba
                    int r9 = r9 - r3
                L76:
                    if (r9 < 0) goto La2
                    android.util.SparseArray<com.facebook.react.animated.d> r10 = r0.b     // Catch: java.lang.Exception -> Lba
                    java.lang.Object r10 = r10.valueAt(r9)     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.animated.d r10 = (com.facebook.react.animated.d) r10     // Catch: java.lang.Exception -> Lba
                    boolean r1 = r10.a     // Catch: java.lang.Exception -> Lba
                    if (r1 == 0) goto L9f
                    com.facebook.react.bridge.Callback r1 = r10.c     // Catch: java.lang.Exception -> Lba
                    if (r1 == 0) goto L9a
                    com.facebook.react.bridge.WritableMap r1 = com.facebook.react.bridge.Arguments.createMap()     // Catch: java.lang.Exception -> Lba
                    java.lang.String r4 = "finished"
                    r1.putBoolean(r4, r3)     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.bridge.Callback r10 = r10.c     // Catch: java.lang.Exception -> Lba
                    java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lba
                    r4[r2] = r1     // Catch: java.lang.Exception -> Lba
                    r10.invoke(r4)     // Catch: java.lang.Exception -> Lba
                L9a:
                    android.util.SparseArray<com.facebook.react.animated.d> r10 = r0.b     // Catch: java.lang.Exception -> Lba
                    r10.removeAt(r9)     // Catch: java.lang.Exception -> Lba
                L9f:
                    int r9 = r9 + (-1)
                    goto L76
                La2:
                    com.facebook.react.animated.NativeAnimatedModule r9 = com.facebook.react.animated.NativeAnimatedModule.this     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.modules.core.g r9 = com.facebook.react.animated.NativeAnimatedModule.access$200(r9)     // Catch: java.lang.Exception -> Lba
                    java.lang.Object r9 = com.facebook.infer.annotation.a.a(r9)     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.modules.core.g r9 = (com.facebook.react.modules.core.g) r9     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.modules.core.g$a r10 = com.facebook.react.modules.core.g.a.NATIVE_ANIMATED_MODULE     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.animated.NativeAnimatedModule r0 = com.facebook.react.animated.NativeAnimatedModule.this     // Catch: java.lang.Exception -> Lba
                    com.facebook.react.uimanager.g r0 = com.facebook.react.animated.NativeAnimatedModule.access$100(r0)     // Catch: java.lang.Exception -> Lba
                    r9.a(r10, r0)     // Catch: java.lang.Exception -> Lba
                    return
                Lba:
                    r9 = move-exception
                    java.lang.String r10 = "ReactNative"
                    java.lang.String r0 = "Exception while executing animated frame callback."
                    com.facebook.common.logging.a.d(r10, r0, r9)
                    java.lang.RuntimeException r10 = new java.lang.RuntimeException
                    r10.<init>(r9)
                    throw r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.NativeAnimatedModule.AnonymousClass1.a(long):void");
            }
        };
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn == null || reactApplicationContextIfActiveOrWarn.isBridgeless()) {
            return;
        }
        reactApplicationContextIfActiveOrWarn.addLifecycleEventListener(this);
        ((UIManagerModule) reactApplicationContextIfActiveOrWarn.getNativeModule(UIManagerModule.class)).addUIManagerListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.react.uimanager.ax
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty() && this.mPreOperations.isEmpty()) {
            return;
        }
        final ArrayList<a> arrayList = this.mPreOperations;
        final ArrayList<a> arrayList2 = this.mOperations;
        this.mPreOperations = new ArrayList<>();
        this.mOperations = new ArrayList<>();
        uIManagerModule.prependUIBlock(new ar() { // from class: com.facebook.react.animated.NativeAnimatedModule.12
            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                l nodesManager = NativeAnimatedModule.this.getNodesManager();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((a) it.next()).a(nodesManager);
                    } catch (Throwable th) {
                        com.facebook.common.logging.a.d(NativeAnimatedModule.NAME, "", th);
                    }
                }
            }
        });
        uIManagerModule.addUIBlock(new ar() { // from class: com.facebook.react.animated.NativeAnimatedModule.15
            @Override // com.facebook.react.uimanager.ar
            public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                l nodesManager = NativeAnimatedModule.this.getNodesManager();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((a) it.next()).a(nodesManager);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        com.facebook.common.logging.a.d(NativeAnimatedModule.NAME, "", th);
                    }
                }
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            this.mNodesManager = new l((UIManagerModule) reactApplicationContextIfActiveOrWarn.getNativeModule(UIManagerModule.class));
        }
        return this.mNodesManager;
    }

    private void clearFrameCallback() {
        ((com.facebook.react.modules.core.g) com.facebook.infer.annotation.a.a(this.mReactChoreographer)).b(g.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    private void enqueueFrameCallback() {
        ((com.facebook.react.modules.core.g) com.facebook.infer.annotation.a.a(this.mReactChoreographer)).a(g.a.NATIVE_ANIMATED_MODULE, this.mAnimatedFrameCallback);
    }

    @VisibleForTesting
    public void setNodesManager(l lVar) {
        this.mNodesManager = lVar;
    }

    @ReactMethod
    public void createAnimatedNode(double d, final ReadableMap readableMap) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.16
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                b qVar;
                int i2 = i;
                ReadableMap readableMap2 = readableMap;
                if (lVar.a.get(i2) != null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " already exists");
                }
                String string = readableMap2.getString("type");
                if ("style".equals(string)) {
                    qVar = new o(readableMap2, lVar);
                } else if ("value".equals(string)) {
                    qVar = new s(readableMap2);
                } else if ("props".equals(string)) {
                    qVar = new m(readableMap2, lVar, lVar.e);
                } else if ("interpolation".equals(string)) {
                    qVar = new i(readableMap2);
                } else if (MsgAddition.TABLE.equals(string)) {
                    qVar = new com.facebook.react.animated.a(readableMap2, lVar);
                } else if ("subtraction".equals(string)) {
                    qVar = new p(readableMap2, lVar);
                } else if ("division".equals(string)) {
                    qVar = new g(readableMap2, lVar);
                } else if ("multiplication".equals(string)) {
                    qVar = new k(readableMap2, lVar);
                } else if ("modulus".equals(string)) {
                    qVar = new j(readableMap2, lVar);
                } else if ("diffclamp".equals(string)) {
                    qVar = new f(readableMap2, lVar);
                } else if ("transform".equals(string)) {
                    qVar = new r(readableMap2, lVar);
                } else if ("tracking".equals(string)) {
                    qVar = new q(readableMap2, lVar);
                } else {
                    throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
                }
                qVar.d = i2;
                lVar.a.put(i2, qVar);
                lVar.c.put(i2, qVar);
            }
        });
    }

    @ReactMethod
    public void startListeningToAnimatedNodeValue(double d) {
        final int i = (int) d;
        final c cVar = new c() { // from class: com.facebook.react.animated.NativeAnimatedModule.17
            @Override // com.facebook.react.animated.c
            public final void a(double d2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("tag", i);
                createMap.putDouble("value", d2);
                ReactApplicationContext reactApplicationContextIfActiveOrWarn = NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
                if (reactApplicationContextIfActiveOrWarn != null) {
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onAnimatedValueUpdate", createMap);
                }
            }
        };
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.18
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                c cVar2 = cVar;
                b bVar = lVar.a.get(i2);
                if (bVar == null || !(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists or is not a 'value' node");
                }
                ((s) bVar).h = cVar2;
            }
        });
    }

    @ReactMethod
    public void stopListeningToAnimatedNodeValue(double d) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.19
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                b bVar = lVar.a.get(i2);
                if (bVar == null || !(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists or is not a 'value' node");
                }
                ((s) bVar).h = null;
            }
        });
    }

    @ReactMethod
    public void dropAnimatedNode(double d) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.20
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                lVar.a.remove(i2);
                lVar.c.remove(i2);
            }
        });
    }

    @ReactMethod
    public void setAnimatedNodeValue(double d, final double d2) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.21
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                double d3 = d2;
                b bVar = lVar.a.get(i2);
                if (bVar == null || !(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists or is not a 'value' node");
                }
                lVar.a(bVar);
                ((s) bVar).f = d3;
                lVar.c.put(i2, bVar);
            }
        });
    }

    @ReactMethod
    public void setAnimatedNodeOffset(double d, final double d2) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.2
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                double d3 = d2;
                b bVar = lVar.a.get(i2);
                if (bVar == null || !(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists or is not a 'value' node");
                }
                ((s) bVar).g = d3;
                lVar.c.put(i2, bVar);
            }
        });
    }

    @ReactMethod
    public void flattenAnimatedNodeOffset(double d) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.3
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                b bVar = lVar.a.get(i2);
                if (bVar == null || !(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists or is not a 'value' node");
                }
                s sVar = (s) bVar;
                sVar.f += sVar.g;
                sVar.g = 0.0d;
            }
        });
    }

    @ReactMethod
    public void extractAnimatedNodeOffset(double d) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.4
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                b bVar = lVar.a.get(i2);
                if (bVar == null || !(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists or is not a 'value' node");
                }
                s sVar = (s) bVar;
                sVar.g += sVar.f;
                sVar.f = 0.0d;
            }
        });
    }

    @ReactMethod
    public void startAnimatingNode(double d, double d2, final ReadableMap readableMap, final Callback callback) {
        final int i = (int) d;
        final int i2 = (int) d2;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.5
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                lVar.a(i, i2, readableMap, callback);
            }
        });
    }

    @ReactMethod
    public void stopAnimation(double d) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.6
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                for (int i3 = 0; i3 < lVar.b.size(); i3++) {
                    d valueAt = lVar.b.valueAt(i3);
                    if (valueAt.d == i2) {
                        if (valueAt.c != null) {
                            WritableMap createMap = Arguments.createMap();
                            createMap.putBoolean("finished", false);
                            valueAt.c.invoke(createMap);
                        }
                        lVar.b.removeAt(i3);
                        return;
                    }
                }
            }
        });
    }

    @ReactMethod
    public void connectAnimatedNodes(double d, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.7
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i3 = i;
                int i4 = i2;
                b bVar = lVar.a.get(i3);
                if (bVar == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i3 + " does not exists");
                }
                b bVar2 = lVar.a.get(i4);
                if (bVar2 == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i4 + " does not exists");
                }
                if (bVar.a == null) {
                    bVar.a = new ArrayList(1);
                }
                ((List) com.facebook.infer.annotation.a.a(bVar.a)).add(bVar2);
                bVar2.a(bVar);
                lVar.c.put(i4, bVar2);
            }
        });
    }

    @ReactMethod
    public void disconnectAnimatedNodes(double d, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.8
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i3 = i;
                int i4 = i2;
                b bVar = lVar.a.get(i3);
                if (bVar == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i3 + " does not exists");
                }
                b bVar2 = lVar.a.get(i4);
                if (bVar2 == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i4 + " does not exists");
                }
                if (bVar.a != null) {
                    bVar2.b(bVar);
                    bVar.a.remove(bVar2);
                }
                lVar.c.put(i4, bVar2);
            }
        });
    }

    @ReactMethod
    public void connectAnimatedNodeToView(double d, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.9
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i3 = i;
                int i4 = i2;
                b bVar = lVar.a.get(i3);
                if (bVar == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i3 + " does not exists");
                } else if (!(bVar instanceof m)) {
                    throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + m.class.getName());
                } else {
                    m mVar = (m) bVar;
                    if (mVar.e != -1) {
                        throw new JSApplicationIllegalArgumentException("Animated node " + mVar.d + " is already attached to a view");
                    }
                    mVar.e = i4;
                    lVar.c.put(i3, bVar);
                }
            }
        });
    }

    @ReactMethod
    public void disconnectAnimatedNodeFromView(double d, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.10
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i3 = i;
                int i4 = i2;
                b bVar = lVar.a.get(i3);
                if (bVar == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i3 + " does not exists");
                } else if (!(bVar instanceof m)) {
                    throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + m.class.getName());
                } else {
                    m mVar = (m) bVar;
                    if (mVar.e != i4) {
                        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node");
                    }
                    mVar.e = -1;
                }
            }
        });
    }

    @ReactMethod
    public void restoreDefaultValues(double d) {
        final int i = (int) d;
        this.mPreOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.11
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                b bVar = lVar.a.get(i);
                if (bVar != null) {
                    if (!(bVar instanceof m)) {
                        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + m.class.getName());
                    }
                    ((m) bVar).b();
                }
            }
        });
    }

    @ReactMethod
    public void addAnimatedEventToView(double d, final String str, final ReadableMap readableMap) {
        final int i = (int) d;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.13
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i2 = i;
                String str2 = str;
                ReadableMap readableMap2 = readableMap;
                int i3 = readableMap2.getInt("animatedValueTag");
                b bVar = lVar.a.get(i3);
                if (bVar == null) {
                    throw new JSApplicationIllegalArgumentException("Animated node with tag " + i3 + " does not exists");
                } else if (!(bVar instanceof s)) {
                    throw new JSApplicationIllegalArgumentException("Animated node connected to event should beof type " + s.class.getName());
                } else {
                    ReadableArray array = readableMap2.getArray("nativeEventPath");
                    ArrayList arrayList = new ArrayList(array.size());
                    for (int i4 = 0; i4 < array.size(); i4++) {
                        arrayList.add(array.getString(i4));
                    }
                    EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (s) bVar);
                    String str3 = i2 + str2;
                    if (lVar.d.containsKey(str3)) {
                        lVar.d.get(str3).add(eventAnimationDriver);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(eventAnimationDriver);
                    lVar.d.put(str3, arrayList2);
                }
            }
        });
    }

    @ReactMethod
    public void removeAnimatedEventFromView(double d, final String str, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        this.mOperations.add(new a() { // from class: com.facebook.react.animated.NativeAnimatedModule.14
            @Override // com.facebook.react.animated.NativeAnimatedModule.a
            public final void a(l lVar) {
                int i3 = i;
                String str2 = str;
                int i4 = i2;
                String str3 = i3 + str2;
                if (lVar.d.containsKey(str3)) {
                    List<EventAnimationDriver> list = lVar.d.get(str3);
                    if (list.size() == 1) {
                        lVar.d.remove(i3 + str2);
                        return;
                    }
                    ListIterator<EventAnimationDriver> listIterator = list.listIterator();
                    while (listIterator.hasNext()) {
                        if (listIterator.next().mValueNode.d == i4) {
                            listIterator.remove();
                            return;
                        }
                    }
                }
            }
        });
    }
}
