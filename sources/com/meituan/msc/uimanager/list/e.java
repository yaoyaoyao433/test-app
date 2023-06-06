package com.meituan.msc.uimanager.list;

import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.msc.uimanager.am;
import com.meituan.msc.uimanager.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends UIManagerModule {
    public static ChangeQuickRedirect d;
    private UIManagerModule e;
    private a f;
    private c g;

    public e(ReactApplicationContext reactApplicationContext, c cVar, MSCListEventEmitter mSCListEventEmitter, UIManagerModule uIManagerModule) {
        super(reactApplicationContext, (av) null, cVar, uIManagerModule.a(), uIManagerModule.b);
        Object[] objArr = {reactApplicationContext, cVar, mSCListEventEmitter, uIManagerModule};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85af237a0b7e55074678917922a904e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85af237a0b7e55074678917922a904e0");
            return;
        }
        this.e = uIManagerModule;
        this.f = new a(reactApplicationContext, this.e.a(), mSCListEventEmitter);
        this.g = cVar;
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add13018d6118299f81cbfa084935812", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add13018d6118299f81cbfa084935812");
        } else {
            this.e.c();
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    @Nullable
    public final WritableMap a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "142ddeb99f91a7e436f7345f34091f25", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "142ddeb99f91a7e436f7345f34091f25") : this.e.a(str);
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final WritableMap e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7228539f1752e37aa8cf0f103f43ec71", RobustBitConfig.DEFAULT_VALUE) ? (WritableMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7228539f1752e37aa8cf0f103f43ec71") : this.e.e();
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc33ed0f3defb00e7d48bca4f2f339c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc33ed0f3defb00e7d48bca4f2f339c");
        } else {
            this.e.a(i);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c291cad9aa98dab60a463803124bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c291cad9aa98dab60a463803124bc1");
        } else {
            this.e.b(i, i2, i3);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, String str, int i2, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32883228abc617fe258cecc00d9de2b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32883228abc617fe258cecc00d9de2b9");
        } else {
            this.e.a(i, str, i2, readableMap);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, String str, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, readableMap};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8da250374b04fc5465d8c27f23521dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8da250374b04fc5465d8c27f23521dea");
        } else {
            this.e.a(i, str, readableMap);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        Object[] objArr = {Integer.valueOf(i), readableArray, readableArray2, readableArray3, readableArray4, readableArray5};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a00ecb0e3b62ba9e331cd98bddaf962f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a00ecb0e3b62ba9e331cd98bddaf962f");
        } else {
            this.e.a(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac0bce17bef03d86c2fd27951cdb0200", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac0bce17bef03d86c2fd27951cdb0200");
        } else {
            this.e.a(i, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "665bb1de9f7f6112ec498070cdf98e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "665bb1de9f7f6112ec498070cdf98e51");
        } else {
            this.e.a(i, i2);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f17083246998c26c909ecde4cf1a68b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f17083246998c26c909ecde4cf1a68b");
        } else {
            this.e.b(i);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "951f7f7a774a401c9fe406ac500c9b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "951f7f7a774a401c9fe406ac500c9b50");
        } else {
            this.e.a(i, callback);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void b(int i, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), callback};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0086ba6f76c7c53680bb32a253509e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0086ba6f76c7c53680bb32a253509e6");
        } else {
            this.e.b(i, callback);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, int i2, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a2757335c3e65af4181db0c8c575f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a2757335c3e65af4181db0c8c575f7");
        } else {
            this.e.a(i, i2, callback, callback2);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec8dc521fddc88224a93bdc03c37bcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec8dc521fddc88224a93bdc03c37bcf");
        } else {
            this.e.a(i, callback, callback2);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, ReadableArray readableArray, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), readableArray, callback};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f7b6965cba4719e17de506b8df6708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f7b6965cba4719e17de506b8df6708");
        } else {
            this.e.a(i, readableArray, callback);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, int i2, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), callback};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7538b61a85f009deda25cd35044ff6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7538b61a85f009deda25cd35044ff6a");
        } else {
            this.e.a(i, i2, callback);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817d6601270156c32c8b345f08f12dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817d6601270156c32c8b345f08f12dd0");
        } else {
            this.e.a(i, z);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbab5625a8173a4a7ac87ecacf1f891a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbab5625a8173a4a7ac87ecacf1f891a");
        } else {
            this.e.f();
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, Dynamic dynamic, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), dynamic, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8174d2f5ebc4ae7edec86db6a48c867", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8174d2f5ebc4ae7edec86db6a48c867");
        } else {
            this.e.a(i, dynamic, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule, com.meituan.msc.c
    public final void a(int i, int i2, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00fea53e98f68d2390bfd42c7169a429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00fea53e98f68d2390bfd42c7169a429");
        } else {
            this.e.a(i, i2, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule, com.meituan.msc.c
    public final void a(int i, String str, @Nullable ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), str, readableArray};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83429cf28b245c2e01cfe3abed4831ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83429cf28b245c2e01cfe3abed4831ea");
        } else {
            this.e.a(i, str, readableArray);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac0c6d5137425b0a015eb2b5b90de9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac0c6d5137425b0a015eb2b5b90de9f");
        } else {
            this.e.g();
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        Object[] objArr = {Integer.valueOf(i), readableArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "769180975b23d89214009e0f8a07b43a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "769180975b23d89214009e0f8a07b43a");
        } else {
            this.e.a(i, readableArray, callback, callback2);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51e6c8c3329f0d9f3d75df29b7bee9d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51e6c8c3329f0d9f3d75df29b7bee9d5");
        } else {
            this.e.h();
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deb81f5d7cd375ebcf1f353c378c3f69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deb81f5d7cd375ebcf1f353c378c3f69");
        } else {
            this.e.a(z);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(ReadableMap readableMap, Callback callback, Callback callback2) {
        Object[] objArr = {readableMap, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff9b4f05a3da36b3d5aa3dc2b571b641", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff9b4f05a3da36b3d5aa3dc2b571b641");
        } else {
            this.e.a(readableMap, callback, callback2);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule, com.meituan.msc.jse.bridge.OnBatchCompleteListener
    public final void onBatchComplete(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b050aabd952d318ce28644c0ef43999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b050aabd952d318ce28644c0ef43999");
        } else {
            this.e.onBatchComplete(i);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74d1b9e9613669f80c5197d01c35075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74d1b9e9613669f80c5197d01c35075");
        } else {
            this.e.b(i, i2);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(ReadableArray readableArray, ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableArray, readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b1ca9a1cfcfe74d448eb3fec24e339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b1ca9a1cfcfe74d448eb3fec24e339");
        } else {
            this.e.a(readableArray, readableMap, callback);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(ReadableMap readableMap, Callback callback) {
        Object[] objArr = {readableMap, callback};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d1abbf7ef07a82787a2bbcf800f031", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d1abbf7ef07a82787a2bbcf800f031");
        } else {
            this.e.a(readableMap, callback);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final void a(am amVar) {
        Object[] objArr = {amVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c02de945214db722036e5e26b119248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c02de945214db722036e5e26b119248");
        } else {
            this.e.a(amVar);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule, com.meituan.msc.c
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f79d936c1cbcbf87f73ab97335c407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f79d936c1cbcbf87f73ab97335c407");
        } else {
            this.e.a(i, i2, i3);
        }
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final View c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf6c10fc2ea66ad1c5b4ac968e080a65", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf6c10fc2ea66ad1c5b4ac968e080a65") : this.g.g(i);
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final /* bridge */ /* synthetic */ com.meituan.msc.uimanager.events.b i() {
        return this.f;
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule
    public final /* bridge */ /* synthetic */ UIImplementation b() {
        return this.g;
    }

    @Override // com.meituan.msc.uimanager.UIManagerModule, com.meituan.msc.c
    public final /* bridge */ /* synthetic */ Object a() {
        return this.f;
    }
}
