package com.meituan.msc.uimanager;

import android.media.AudioManager;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.GuardedRunnable;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.OnBatchCompleteListener;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.ReadableType;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.events.MSCRenderCommandModule;
import com.meituan.msc.uimanager.events.RCTEventEmitter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UIManagerModule implements com.meituan.msc.c, LifecycleEventListener, OnBatchCompleteListener {
    public static ChangeQuickRedirect a;
    protected com.meituan.msc.exception.a b;
    public com.meituan.msc.uimanager.interaction.a c;
    private final com.meituan.msc.uimanager.events.b d;
    private final av e;
    private final UIImplementation f;
    private final List<Object> g;
    @Nullable
    private final ReactApplicationContext h;
    private MSCRenderCommandModule i;
    private final String j;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        @Nullable
        as a(String str);
    }

    public final void a(UIImplementation uIImplementation) {
        Object[] objArr = {uIImplementation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "515c381cdfd2e2ca10c2a2aba1c9b2f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "515c381cdfd2e2ca10c2a2aba1c9b2f4");
        } else if (this.b == null) {
        } else {
            try {
                this.b.a(uIImplementation);
                this.b.a(this.i, j().getRuntimeDelegate().getPageId());
            } catch (Throwable th) {
                com.meituan.msc.modules.reporter.g.a(this.j, th);
            }
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, com.meituan.msc.b bVar, av avVar, int i, com.meituan.msc.exception.a aVar) {
        Object[] objArr = {reactApplicationContext, bVar, avVar, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5389b7eb721faef2a066f3efb54adee1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5389b7eb721faef2a066f3efb54adee1");
            return;
        }
        this.g = new ArrayList();
        this.j = "UIManagerModule@" + Integer.toHexString(hashCode());
        this.h = reactApplicationContext;
        c.a(reactApplicationContext);
        this.d = new com.meituan.msc.uimanager.events.b(reactApplicationContext);
        this.e = avVar;
        this.b = aVar;
        this.i = (MSCRenderCommandModule) j().getRuntimeDelegate().getJSModule(MSCRenderCommandModule.class);
        this.c = new com.meituan.msc.uimanager.interaction.a(reactApplicationContext);
        UIViewOperationQueue uIViewOperationQueue = new UIViewOperationQueue(reactApplicationContext, new NativeViewHierarchyManager(this.e), i);
        this.f = bVar == com.meituan.msc.b.NATIVE ? new j(reactApplicationContext, this.e, new ag(), uIViewOperationQueue, this.d) : new u(reactApplicationContext, this.e, new ag(), uIViewOperationQueue, this.d);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, av avVar, UIImplementation uIImplementation, com.meituan.msc.uimanager.events.b bVar, com.meituan.msc.exception.a aVar) {
        Object[] objArr = {reactApplicationContext, null, uIImplementation, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a39dd186790b8260081cbb5d57214e5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a39dd186790b8260081cbb5d57214e5a");
            return;
        }
        this.g = new ArrayList();
        this.j = "UIManagerModule@" + Integer.toHexString(hashCode());
        this.h = reactApplicationContext;
        c.a(reactApplicationContext);
        this.d = bVar;
        this.e = null;
        this.b = aVar;
        this.i = (MSCRenderCommandModule) j().getRuntimeDelegate().getJSModule(MSCRenderCommandModule.class);
        this.f = uIImplementation;
        this.c = new com.meituan.msc.uimanager.interaction.a(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public UIImplementation b() {
        return this.f;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed033e47a4fee7b0777e4af9b76847c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed033e47a4fee7b0777e4af9b76847c");
        } else {
            this.d.a(1, (RCTEventEmitter) j().getJSModule(RCTEventEmitter.class));
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7932b4c6e226123bc02a20e9367802e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7932b4c6e226123bc02a20e9367802e2");
        } else {
            this.f.l();
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9833b97a49764f5162efa03e91848f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9833b97a49764f5162efa03e91848f2d");
        } else {
            this.f.m();
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd6400ca4c98f80b4d6e7e32b997d4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd6400ca4c98f80b4d6e7e32b997d4c8");
            return;
        }
        this.f.n();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8801a42c1d76e7addefd9df1bb923b6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8801a42c1d76e7addefd9df1bb923b6e");
            return;
        }
        this.d.a();
        this.f.o();
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a76569b3bd384bfdad95cdae81d8b321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a76569b3bd384bfdad95cdae81d8b321");
            return;
        }
        ay.a();
        au.a();
    }

    @Nullable
    public WritableMap a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51767776ec8b5621d4aaa7c16257896", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51767776ec8b5621d4aaa7c16257896") : this.e.b(str);
    }

    public WritableMap e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f275f1a811c5ee61acccc833095b2924", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f275f1a811c5ee61acccc833095b2924") : Arguments.makeNativeMap(ap.a());
    }

    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "425c80f27ba3165f0b54fd33d6a58664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "425c80f27ba3165f0b54fd33d6a58664");
        } else {
            this.f.c(i);
        }
    }

    public void b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "040143dd58902b4ab59b1c533b38b4e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "040143dd58902b4ab59b1c533b38b4e4");
            return;
        }
        j().assertOnNativeModulesQueueThread();
        this.f.b(i, i2, i3);
    }

    public void a(int i, String str, int i2, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b82fb9d2e38c1133909bb880f9632c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b82fb9d2e38c1133909bb880f9632c");
        } else {
            this.f.a(i, str, i2, readableMap);
        }
    }

    public void a(int i, String str, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494ef62d1fc2d5ca9b98bef4325fa029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494ef62d1fc2d5ca9b98bef4325fa029");
        } else {
            this.f.a(i, str, readableMap);
        }
    }

    public void a(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        Object[] objArr = {Integer.valueOf(i), readableArray, readableArray2, readableArray3, readableArray4, readableArray5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db431cf7c0489aeeeafa750469f7d2cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db431cf7c0489aeeeafa750469f7d2cd");
        } else {
            this.f.a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
        }
    }

    public void a(int i, ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87920ca38ea7c183e2d6917c65da73da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87920ca38ea7c183e2d6917c65da73da");
        } else {
            this.f.a(i, readableArray);
        }
    }

    @Deprecated
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9db1e46c80b31bb16e3c178e35e150ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9db1e46c80b31bb16e3c178e35e150ba");
        } else {
            this.f.a(i, i2);
        }
    }

    @Deprecated
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcc1ddd8155b22d1299cf5f66465bd42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcc1ddd8155b22d1299cf5f66465bd42");
        } else {
            this.f.e(i);
        }
    }

    public void a(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d494406281097d061963dee74003bc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d494406281097d061963dee74003bc8");
            return;
        }
        this.f.a(i, callback);
        k();
    }

    public void b(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d81c11f01576e3d59f6de0cb5e1281fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d81c11f01576e3d59f6de0cb5e1281fc");
            return;
        }
        this.f.b(i, callback);
        k();
    }

    public void a(int i, int i2, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90efbecc351ddf9e30e005e8298a3ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90efbecc351ddf9e30e005e8298a3ee");
            return;
        }
        this.f.a(i, i2, callback, callback2);
        k();
    }

    @Deprecated
    public void a(int i, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "908c4caa06d233b929754a2cee88a07c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "908c4caa06d233b929754a2cee88a07c");
            return;
        }
        this.f.a(i, callback, callback2);
        k();
    }

    public void a(int i, ReadableArray readableArray, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), readableArray, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c686a8797301241f122de5e387f0e295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c686a8797301241f122de5e387f0e295");
            return;
        }
        this.f.a(i, Math.round(s.a(readableArray.getDouble(0))), Math.round(s.a(readableArray.getDouble(1))), callback);
        k();
    }

    @Deprecated
    public void a(int i, int i2, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e971cebc09eb724fc205a6074de898", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e971cebc09eb724fc205a6074de898");
        } else {
            this.f.a(i, i2, callback);
        }
    }

    public void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "848e2e2399ef97882a57628d849e5b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "848e2e2399ef97882a57628d849e5b83");
            return;
        }
        this.f.a(i, z);
        k();
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8700f82c7918c1e066232b26b5787ff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8700f82c7918c1e066232b26b5787ff0");
            return;
        }
        this.f.j();
        k();
    }

    public void a(int i, Dynamic dynamic, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), dynamic, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9594380ebadb07bbc673865de04701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9594380ebadb07bbc673865de04701");
            return;
        }
        com.meituan.msc.c a2 = an.a(j());
        if (a2 == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            a2.a(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            a2.a(i, dynamic.asString(), readableArray);
        }
        k();
    }

    @Override // com.meituan.msc.c
    @Deprecated
    public void a(int i, int i2, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3972e648f5a91a21a3687d4fbd244d4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3972e648f5a91a21a3687d4fbd244d4b");
        } else {
            this.f.a(i, i2, readableArray);
        }
    }

    @Override // com.meituan.msc.c
    public void a(int i, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76adb6723221cad29359d236c4065a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76adb6723221cad29359d236c4065a84");
        } else {
            this.f.a(i, str, readableArray);
        }
    }

    @Deprecated
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3d7286aa7f016c7b9fbbd4a7d78bdaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3d7286aa7f016c7b9fbbd4a7d78bdaf");
            return;
        }
        AudioManager audioManager = (AudioManager) j().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }

    public void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), readableArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6677276b1ba11f92bb44ee4a15f67298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6677276b1ba11f92bb44ee4a15f67298");
            return;
        }
        this.f.a(i, readableArray, callback, callback2);
        k();
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f56a437d53484516669be93b97ad239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f56a437d53484516669be93b97ad239");
            return;
        }
        this.f.k();
        k();
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981ed08010d9c44e91755bbca1373bd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981ed08010d9c44e91755bbca1373bd1");
            return;
        }
        this.f.a(z);
        k();
    }

    public void a(ReadableMap readableMap, Callback callback, Callback callback2) {
        Object[] objArr = {readableMap, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db37823fb5b0a50609fcbd9598497f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db37823fb5b0a50609fcbd9598497f55");
            return;
        }
        this.f.a(readableMap, callback);
        k();
    }

    @Override // com.meituan.msc.jse.bridge.OnBatchCompleteListener
    public void onBatchComplete(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef67f839f2f96ddd7112c5240d609ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef67f839f2f96ddd7112c5240d609ce");
            return;
        }
        com.meituan.msc.systrace.b.a(0L, "onBatchCompleteUI");
        Iterator<Object> it = this.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
        try {
            if (this.f != null) {
                this.f.f(i);
                this.c.a(8, "triggered by BDC");
            } else {
                com.meituan.msc.modules.reporter.g.a("[UIManagerModule@onBatchComplete]", "UIImplementation nulll");
            }
        } finally {
            com.meituan.msc.systrace.a.a(0L);
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20cf8350564449329bdb3eae5d1e07b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20cf8350564449329bdb3eae5d1e07b");
        } else {
            this.f.i();
        }
    }

    @Override // com.meituan.msc.c
    /* renamed from: i */
    public com.meituan.msc.uimanager.events.b a() {
        return this.d;
    }

    public void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213f6acbfe9757fa48649e36e0ec0e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213f6acbfe9757fa48649e36e0ec0e2a");
            return;
        }
        this.f.b(i, i2);
        k();
    }

    public void a(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableArray, readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "889efd9dcc2de708ebe090d5d81e1f61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "889efd9dcc2de708ebe090d5d81e1f61");
            return;
        }
        this.f.a(readableArray, readableMap, callback);
        k();
    }

    public void a(ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c164e24845772016e45a99aa3f836a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c164e24845772016e45a99aa3f836a");
            return;
        }
        this.f.b(readableMap, callback);
        k();
    }

    public void a(am amVar) {
        Object[] objArr = {amVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678e77d5086b12adbcd2c27172e7f398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678e77d5086b12adbcd2c27172e7f398");
            return;
        }
        this.f.a(amVar);
        k();
    }

    @Override // com.meituan.msc.c
    public void a(final int i, final int i2, final int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0456226f156361bae7e92914c424cd03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0456226f156361bae7e92914c424cd03");
            return;
        }
        ReactApplicationContext j = j();
        j.runOnNativeModulesQueueThread(new GuardedRunnable(j) { // from class: com.meituan.msc.uimanager.UIManagerModule.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.GuardedRunnable
            public final void runGuarded() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ec84410238e15bc8ac8da7123de57f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ec84410238e15bc8ac8da7123de57f9");
                    return;
                }
                UIManagerModule.this.f.a(i, i2, i3);
                UIImplementation uIImplementation = UIManagerModule.this.f;
                int i4 = UIImplementation.f;
                UIImplementation.f = i4 - 1;
                uIImplementation.f(i4);
            }
        });
    }

    public View c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075ff6926853fd0b13b31188cf8dcb2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075ff6926853fd0b13b31188cf8dcb2d");
        }
        UiThreadUtil.assertOnUiThread();
        return this.f.h().a().a(i);
    }

    public final ReactApplicationContext j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fde2c07c336a274d7496220e60556fda", RobustBitConfig.DEFAULT_VALUE) ? (ReactApplicationContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fde2c07c336a274d7496220e60556fda") : (ReactApplicationContext) com.facebook.infer.annotation.a.a(this.h, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    }
}
