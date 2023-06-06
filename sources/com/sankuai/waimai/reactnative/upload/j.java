package com.sankuai.waimai.reactnative.upload;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.dianping.titans.utils.LocalIdUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.upload.k;
import com.sankuai.waimai.reactnative.upload.m;
import com.tencent.mapsdk.internal.jw;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class j {
    public static ChangeQuickRedirect a;
    public static volatile HashSet<String> b;
    private static volatile j i;
    public k<h, String> c;
    public boolean d;
    public ArrayList<h> e;
    public ArrayList<m> f;
    public Promise g;
    public e h;
    private com.sankuai.waimai.reactnative.utils.c j;
    private int k;
    private int l;

    private j(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c199b40e9ff472e00f6d6928596d530", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c199b40e9ff472e00f6d6928596d530");
            return;
        }
        this.d = false;
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.k = jw.h;
        this.l = 75;
        this.d = false;
        this.j = new com.sankuai.waimai.reactnative.utils.c(reactApplicationContext);
        this.c = new b(reactApplicationContext.getApplicationContext());
        this.c.e = new a();
        HashSet<String> hashSet = new HashSet<>();
        b = hashSet;
        hashSet.add("wm-choose-image");
        b.add("ugc-tool-attach-poi");
    }

    private j(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "413da7d9d012005e9f17161b82b5dc14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "413da7d9d012005e9f17161b82b5dc14");
            return;
        }
        this.d = false;
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.k = jw.h;
        this.l = 75;
        this.d = false;
        this.j = new com.sankuai.waimai.reactnative.utils.c(context);
        this.c = new b(context.getApplicationContext());
        this.c.e = new a();
        HashSet<String> hashSet = new HashSet<>();
        b = hashSet;
        hashSet.add("wm-choose-image");
        b.add("ugc-tool-attach-poi");
    }

    public void a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cec6ea1f3da2ecfc55e550fabb87f7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cec6ea1f3da2ecfc55e550fabb87f7e0");
        } else if (g.c()) {
            com.sankuai.waimai.ugc.image.a a2 = g.a();
            if (a2 instanceof c) {
                ((c) a2).a(this.k, this.l);
            }
        } else {
            g.b = new com.sankuai.waimai.reactnative.upload.a() { // from class: com.sankuai.waimai.reactnative.upload.j.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.reactnative.upload.f
                @NonNull
                public final com.sankuai.waimai.ugc.image.a a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d4777c78fa035ba4812a9288573e5ea", RobustBitConfig.DEFAULT_VALUE)) {
                        return (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d4777c78fa035ba4812a9288573e5ea");
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("ImageUploadManager", "createImageUploadHook ->" + str, new Object[0]);
                    int i2 = j.this.k;
                    int i3 = j.this.k;
                    int i4 = j.this.l;
                    String str2 = str;
                    Object[] objArr3 = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = i.a;
                    return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1c98e6e8cf7be702e2251c3a42319462", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.ugc.image.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1c98e6e8cf7be702e2251c3a42319462") : new c(i2, i3, i4, str2);
                }
            };
        }
    }

    public final void a(int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cddef5d53590d945e3a985a6537ad0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cddef5d53590d945e3a985a6537ad0ad");
            return;
        }
        if (i2 > 0) {
            this.k = i2;
        }
        if (i3 > 0) {
            this.l = i3;
        }
    }

    public static j a(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "312f3c1e6825739fa99fd76470becaae", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "312f3c1e6825739fa99fd76470becaae");
        }
        if (i == null) {
            synchronized (j.class) {
                if (i == null) {
                    i = new j(reactApplicationContext);
                }
            }
        }
        return i;
    }

    public static j a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c40ac3fa5dc6750bc08b24d3d7f959ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c40ac3fa5dc6750bc08b24d3d7f959ea");
        }
        if (i == null) {
            synchronized (j.class) {
                if (i == null) {
                    i = new j(context);
                }
            }
        }
        return i;
    }

    public final void a(ArrayList<Object> arrayList, String str, Promise promise, e eVar, String str2) {
        File file;
        Object[] objArr = {arrayList, str, promise, eVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3be7d7af27a71409c4fa1dcab6baba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3be7d7af27a71409c4fa1dcab6baba1");
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        a(!TextUtils.isEmpty(str) ? str : "v6/comment/picture/upload");
        this.h = eVar;
        this.g = promise;
        this.e.clear();
        this.f.clear();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (LocalIdUtils.isValid(str3) && (file = LocalIdUtils.getFile(str3, str2)) != null && file.exists() && file.isFile()) {
                    ArrayList<m> arrayList2 = this.f;
                    m.a aVar = new m.a(i2);
                    aVar.c = str3;
                    aVar.e = file.getAbsolutePath();
                    arrayList2.add(aVar.a());
                    h hVar = new h(file.getAbsolutePath());
                    hVar.b = i2;
                    this.e.add(hVar);
                }
            }
        }
        this.c.a(this.e);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cceb20c2aeef2f608c4c9b61b40d76b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cceb20c2aeef2f608c4c9b61b40d76b4");
            return;
        }
        if (this.c != null) {
            this.c.cancel();
        }
        this.e.clear();
        g.b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements k.b<String> {
        public static ChangeQuickRedirect a;
        public int b;

        private a() {
            Object[] objArr = {j.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bdcb6ae0650fef90fb1cc489f96675", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bdcb6ae0650fef90fb1cc489f96675");
            } else {
                this.b = -1;
            }
        }

        @Override // com.sankuai.waimai.reactnative.upload.k.b
        public final /* synthetic */ void a(int i, String str, int i2) {
            String str2 = str;
            Object[] objArr = {Integer.valueOf(i), str2, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdba6a3c25b217a5123381180b0669b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdba6a3c25b217a5123381180b0669b4");
            } else if (j.this.j == null || i >= j.this.f.size() || j.this.h == null) {
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                createMap.putString(DeviceInfo.LOCAL_ID, ((m) j.this.f.get(i)).b);
                createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, 1.0d);
                createMap.putString("imageUrlString", str2);
                createMap.putString("error", "");
                j.this.h.sendEvent("UploadImageSuccessEvent", createMap);
            }
        }

        @Override // com.sankuai.waimai.reactnative.upload.k.b
        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb10c91b2e4be11d2881f61260e055a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb10c91b2e4be11d2881f61260e055a2")).booleanValue() : j.this.d;
        }

        @Override // com.sankuai.waimai.reactnative.upload.k.b
        public final void a(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5197274011179dbc9ca356e014478a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5197274011179dbc9ca356e014478a0");
            } else if (j.this.j == null || i >= j.this.f.size() || j.this.h == null) {
            } else {
                this.b = -1;
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                createMap.putString(DeviceInfo.LOCAL_ID, ((m) j.this.f.get(i)).b);
                createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, 0.0d);
                j.this.h.sendEvent("UploadImageStartEvent", createMap);
            }
        }

        @Override // com.sankuai.waimai.reactnative.upload.k.b
        public final void a(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad987a1015409406f4f36017370a1515", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad987a1015409406f4f36017370a1515");
            } else if (j.this.j == null || i >= j.this.f.size() || j.this.h == null) {
            } else {
                if (i2 < 100) {
                    if ((i2 > 0 && i2 - this.b < 50) || i2 == this.b) {
                        return;
                    }
                    this.b = i2;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                createMap.putString(DeviceInfo.LOCAL_ID, ((m) j.this.f.get(i)).b);
                createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, i2 / 100.0d);
                j.this.h.sendEvent("UploadImageUpdateProgressEvent", createMap);
            }
        }

        @Override // com.sankuai.waimai.reactnative.upload.k.b
        public final void b(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6cca1ef6982eaa8baef9f715bd1ef06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6cca1ef6982eaa8baef9f715bd1ef06");
            } else if (j.this.j == null || i >= j.this.f.size() || j.this.h == null) {
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                createMap.putString(DeviceInfo.LOCAL_ID, ((m) j.this.f.get(i)).b);
                createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, 0.0d);
                createMap.putString("error", "");
                j.this.h.sendEvent("UploadImageFailedEvent", createMap);
            }
        }

        @Override // com.sankuai.waimai.reactnative.upload.k.b
        public final void c(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01dfde2b7842175e97f188cd4eeca731", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01dfde2b7842175e97f188cd4eeca731");
            } else if (j.this.g != null) {
                if (i2 > 0) {
                    Promise promise = j.this.g;
                    promise.reject("0", "countFailed:" + i2);
                    return;
                }
                j.this.g.resolve("");
            } else if (j.this.j == null || j.this.h == null) {
            } else {
                WritableMap createMap = Arguments.createMap();
                if (i2 > 0) {
                    createMap.putString("error", "countFailed:" + i2);
                }
                j.this.h.sendEvent("UploadImageCompleteEvent", createMap);
            }
        }
    }
}
