package com.meituan.android.mrn.component.list.turbo;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m implements l {
    public static ChangeQuickRedirect a;
    public com.facebook.react.uimanager.n b;

    public m(com.facebook.react.uimanager.n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81df4d417b18ee38b251e46ab7b66409", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81df4d417b18ee38b251e46ab7b66409");
        } else {
            this.b = nVar;
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, float f, float f2, com.facebook.react.uimanager.c cVar) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed0edb58fb3f9a83ddc7b595b700b85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed0edb58fb3f9a83ddc7b595b700b85");
        } else {
            this.b.a(i, f, f2, cVar);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final af a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc737fecd0a57d5d2a61ca20c3a85e5f", RobustBitConfig.DEFAULT_VALUE) ? (af) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc737fecd0a57d5d2a61ca20c3a85e5f") : this.b.a(i);
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, View view, boolean z, int i2) {
        Object[] objArr = {Integer.valueOf(i), null, (byte) 0, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14e3612bf8558372f400a5eb1bdac298", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14e3612bf8558372f400a5eb1bdac298");
        } else {
            this.b.a(i, (View) null, false, 0);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, String str, ReadableMap readableMap, View view) {
        String valueOf;
        Object[] objArr = {Integer.valueOf(i), str, readableMap, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ff82f5b5a8dbc8b83f0119dd0a2fa4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ff82f5b5a8dbc8b83f0119dd0a2fa4b");
            return;
        }
        if ("RCTRawText".equals(str) && (readableMap instanceof WritableMap) && readableMap.getType("text") == ReadableType.Number) {
            double d = readableMap.getDouble("text");
            int i2 = (int) d;
            if (d == i2) {
                valueOf = String.valueOf(i2);
            } else {
                valueOf = String.valueOf(d);
            }
            ((WritableMap) readableMap).putString("text", valueOf);
        }
        this.b.a(i, str, readableMap, view);
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, String str, int i2, ReadableMap readableMap) {
        String valueOf;
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f48ec1389a36cdbff97adb6e9ce6067", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f48ec1389a36cdbff97adb6e9ce6067");
            return;
        }
        if ("RCTRawText".equals(str) && (readableMap instanceof WritableMap) && readableMap.getType("text") == ReadableType.Number) {
            double d = readableMap.getDouble("text");
            int i3 = (int) d;
            if (d == i3) {
                valueOf = String.valueOf(i3);
            } else {
                valueOf = String.valueOf(d);
            }
            ((WritableMap) readableMap).putString("text", valueOf);
        }
        this.b.a(i, str, i2, readableMap);
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c9b507d28f9091c7c476fbb4e4accab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c9b507d28f9091c7c476fbb4e4accab");
        } else {
            this.b.a(i, readableArray);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(String str, View view, ArrayList<View> arrayList) {
        Object[] objArr = {str, view, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77c33063d01523617d33c76d2f3d7b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77c33063d01523617d33c76d2f3d7b23");
        } else {
            this.b.a(str, view, arrayList);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd5b8efaf2d5d7270a3cc050ad2d76a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd5b8efaf2d5d7270a3cc050ad2d76a4");
        } else {
            this.b.a(i, i2, i3);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "926dc221c74a785d02a9bc2ac471259a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "926dc221c74a785d02a9bc2ac471259a");
        } else {
            this.b.a(i, i2);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final View a(ao aoVar, int i, String str) {
        Object[] objArr = {aoVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bb700fbbc25ae8c82c69cd41de42b04", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bb700fbbc25ae8c82c69cd41de42b04") : this.b.a(aoVar, i, str);
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final com.facebook.react.uimanager.n a() {
        return this.b;
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(ArrayList<TurboNode> arrayList) {
        int i = 1;
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dad563e14072caab7643c97fc0cecd49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dad563e14072caab7643c97fc0cecd49");
        } else if (arrayList == null || arrayList.isEmpty()) {
        } else {
            int i2 = arrayList.get(0).mRootTag;
            Iterator<TurboNode> it = arrayList.iterator();
            while (it.hasNext()) {
                TurboNode next = it.next();
                a(next);
                int i3 = next.mReactTag;
                Object[] objArr2 = new Object[i];
                objArr2[0] = Integer.valueOf(i3);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40894834588490fe61aefe7a60b1a5ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40894834588490fe61aefe7a60b1a5ee");
                } else {
                    try {
                        this.b.b(i3);
                    } catch (Throwable th) {
                        com.facebook.common.logging.a.b("[UIOperatorImpl@destroyNodeTreeRecursive]", (String) null, th);
                    }
                }
                i = 1;
            }
            this.b.c(i2);
            this.b = null;
        }
    }

    private void a(TurboNode turboNode) {
        Object[] objArr = {turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e627f6d4a221d8cee91a700fe5f1102c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e627f6d4a221d8cee91a700fe5f1102c");
            return;
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<TurboNode> it = turboNode.mChildren.iterator();
        while (it.hasNext()) {
            TurboNode next = it.next();
            createArray.pushInt(next.mReactTag);
            a(next);
        }
        try {
            this.b.c(turboNode.mReactTag, createArray);
        } catch (Throwable th) {
            com.facebook.common.logging.a.b("[UIOperatorImpl@destroyViewTreeRecursive]", (String) null, th);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e625487a41451f3c4f64bc7134416700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e625487a41451f3c4f64bc7134416700");
        } else {
            this.b.b.a.b.a(view);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.l
    public final View b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acf8146781568a9a397f0729b769101a", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acf8146781568a9a397f0729b769101a") : this.b.b.a.b.d(i);
    }
}
