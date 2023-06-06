package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.as;
import java.util.LinkedHashSet;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class o extends UIViewOperationQueue {
    private UIViewOperationQueue a;
    public final k b;
    LinkedHashSet<Integer> c;

    public o(UIViewOperationQueue uIViewOperationQueue) {
        super(null, null, 0);
        this.c = new LinkedHashSet<>();
        this.a = uIViewOperationQueue;
        this.b = new k(this.a.a());
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final NativeViewHierarchyManager a() {
        return this.a.a();
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(@Nullable com.facebook.react.uimanager.debug.a aVar) {
        this.a.a(aVar);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void b() {
        this.a.b();
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final Map<String, Long> c() {
        return this.a.c();
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final boolean d() {
        return this.a.d();
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, View view) {
        this.a.a(i, view);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i) {
        this.a.a(i);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, int i2, boolean z) {
        this.a.a(i, i2, z);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void e() {
        this.a.e();
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, int i2, @Nullable ReadableArray readableArray) {
        this.a.a(i, i2, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, String str, @Nullable ReadableArray readableArray) {
        this.a.a(i, str, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public void a(int i, Object obj) {
        this.a.a(i, obj);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.a.a(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void f() {
        this.a.f();
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(ao aoVar, int i, String str, @Nullable ag agVar) {
        this.a.a(aoVar, i, str, agVar);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, String str, ag agVar) {
        this.a.a(i, str, agVar);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a.a(i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, @Nullable int[] iArr, @Nullable ay[] ayVarArr, @Nullable int[] iArr2) {
        this.a.a(i, iArr, ayVarArr, iArr2);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(ReadableMap readableMap, Callback callback) {
        this.a.a(readableMap, callback);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, Callback callback) {
        this.a.a(i, callback);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void b(int i, Callback callback) {
        this.a.b(i, callback);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, float f, float f2, Callback callback) {
        this.a.a(i, f, f2, callback);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(af afVar, as.a aVar) {
        this.a.a(afVar, aVar);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void a(ar arVar) {
        this.a.a(arVar);
    }

    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void b(ar arVar) {
        this.a.b(arVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void g() {
        this.a.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.facebook.react.uimanager.UIViewOperationQueue
    public final void h() {
        this.a.h();
    }

    public final void a(int i, @Nullable int[] iArr, @Nullable ay[] ayVarArr) {
        az[] azVarArr;
        View d = this.b.d(i);
        String name = this.b.e(i).getName();
        if (ayVarArr != null) {
            azVarArr = new az[ayVarArr.length];
            for (int i2 = 0; i2 < ayVarArr.length; i2++) {
                ay ayVar = ayVarArr[i2];
                azVarArr[i2] = new az(this.b.d(ayVar.b), ayVar.c);
            }
        } else {
            azVarArr = null;
        }
        this.b.a(name, d, iArr, azVarArr, (int[]) null, (int[]) null);
    }

    public final void b(int i) {
        this.b.a(i);
    }
}
