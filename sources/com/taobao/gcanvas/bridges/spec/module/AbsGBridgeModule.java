package com.taobao.gcanvas.bridges.spec.module;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import com.sankuai.waimai.launcher.util.image.a;
import com.taobao.gcanvas.GCanvasJNI;
import com.taobao.gcanvas.adapters.img.IGImageLoader;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackDataFactory;
import com.taobao.gcanvas.bridges.spec.bridge.IJSCallbackMap;
import com.taobao.gcanvas.surface.GTextureView;
import com.taobao.gcanvas.util.GLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class AbsGBridgeModule<JSCallback> implements IGBridgeModule<JSCallback> {
    public static final String TAG = "AbsGBridgeModule";
    protected IGImageLoader mImageLoader;
    protected HashMap<String, GImageLoadInfo> mImageIdCache = new HashMap<>();
    protected HashMap<String, ArrayList<JSCallback>> mCallbacks = new HashMap<>();

    public abstract Context getContext();

    protected abstract IJSCallbackDataFactory getDataFactory();

    protected abstract void invokeCallback(JSCallback jscallback, Object obj);

    public void setImageLoader(IGImageLoader iGImageLoader) {
        this.mImageLoader = iGImageLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class AbsImageCallback implements IGImageLoader.ImageCallback {
        final AtomicBoolean finished;
        private final Object sync;

        protected abstract void doSuccessAction(Bitmap bitmap);

        private AbsImageCallback() {
            this.sync = new Object();
            this.finished = new AtomicBoolean(false);
        }

        @Override // com.taobao.gcanvas.adapters.img.IGImageLoader.ImageCallback
        public void onSuccess(Bitmap bitmap) {
            doSuccessAction(bitmap);
            synchronized (this.sync) {
                this.sync.notifyAll();
                this.finished.set(true);
            }
        }

        @Override // com.taobao.gcanvas.adapters.img.IGImageLoader.ImageCallback
        public void onFail(Object obj) {
            synchronized (this.sync) {
                this.sync.notifyAll();
                this.finished.set(true);
            }
        }

        @Override // com.taobao.gcanvas.adapters.img.IGImageLoader.ImageCallback
        public void onCancel() {
            synchronized (this.sync) {
                this.sync.notifyAll();
                this.finished.set(true);
            }
        }

        protected void waitTillFinish() {
            synchronized (this.sync) {
                while (!this.finished.get()) {
                    try {
                        this.sync.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public void bindImageTexture(final GTextureView gTextureView, final String str, String str2, final int i) {
        if (TextUtils.isEmpty(str2) || gTextureView.hasBindTexture(i)) {
            return;
        }
        try {
            if (str2.startsWith("data:image")) {
                Bitmap handleBase64Texture = handleBase64Texture(str2.substring(str2.indexOf("base64,") + 7));
                if (handleBase64Texture != null) {
                    GCanvasJNI.bindTexture(str, handleBase64Texture, i, 3553, 0, 6408, 6408, fixType(5121, handleBase64Texture));
                    gTextureView.addBindTexture(i);
                    return;
                }
                GLog.d("decode base64 texture failed,bitmap is null.");
                return;
            }
            AbsImageCallback absImageCallback = new AbsImageCallback() { // from class: com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.AbsImageCallback
                protected void doSuccessAction(Bitmap bitmap) {
                    if (bitmap != null) {
                        GCanvasJNI.bindTexture(str, bitmap, i, 3553, 0, 6408, 6408, AbsGBridgeModule.this.fixType(5121, bitmap));
                        gTextureView.addBindTexture(i);
                        return;
                    }
                    GLog.d("bitmap is null in teximage2D.");
                }
            };
            this.mImageLoader.load(getContext(), str2, absImageCallback);
            absImageCallback.waitTillFinish();
        } catch (Throwable th) {
            GLog.e(TAG, th.getMessage(), th);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public void setLogLevel(int i) {
        String str = "debug";
        switch (i) {
            case 0:
                str = "debug";
                break;
            case 1:
                str = "info";
                break;
            case 2:
                str = "warn";
                break;
            case 3:
                str = "error";
                break;
        }
        GCanvasJNI.setLogLevel(str);
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public void texSubImage2D(final String str, final int i, final int i2, final int i3, final int i4, final int i5, final int i6, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (str2.startsWith("data:image")) {
                Bitmap handleBase64Texture = handleBase64Texture(str2.substring(str2.indexOf("base64,7")));
                if (handleBase64Texture != null) {
                    GCanvasJNI.texSubImage2D(str, handleBase64Texture, 0, i, i2, i3, i4, i5, fixType(i6, handleBase64Texture));
                    return;
                } else {
                    GLog.d("[texSubImage2D] decode base64 texture failed,bitmap is null.");
                    return;
                }
            }
            AbsImageCallback absImageCallback = new AbsImageCallback() { // from class: com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.AbsImageCallback
                protected void doSuccessAction(Bitmap bitmap) {
                    if (bitmap != null) {
                        GLog.d("[texSubImage2D] start to bindtexture in 3dmodule.");
                        GCanvasJNI.texSubImage2D(str, bitmap, 0, i, i2, i3, i4, i5, AbsGBridgeModule.this.fixType(i6, bitmap));
                        return;
                    }
                    GLog.d("[texSubImage2D] bitmap is null.");
                }
            };
            this.mImageLoader.load(getContext(), str2, absImageCallback);
            absImageCallback.waitTillFinish();
        } catch (Throwable th) {
            GLog.e(TAG, th.getMessage(), th);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public void texImage2D(final String str, final int i, final int i2, final int i3, final int i4, final int i5, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            if (str2.startsWith("data:image")) {
                Bitmap handleBase64Texture = handleBase64Texture(str2.substring(str2.indexOf("base64,") + 7));
                if (handleBase64Texture != null) {
                    GCanvasJNI.bindTexture(str, handleBase64Texture, 0, i, i2, i3, i4, fixType(i5, handleBase64Texture));
                    return;
                } else {
                    GLog.d("decode base64 texture failed,bitmap is null.");
                    return;
                }
            }
            AbsImageCallback absImageCallback = new AbsImageCallback() { // from class: com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.AbsImageCallback
                protected void doSuccessAction(Bitmap bitmap) {
                    if (bitmap != null) {
                        GCanvasJNI.bindTexture(str, bitmap, 0, i, i2, i3, i4, AbsGBridgeModule.this.fixType(i5, bitmap));
                    } else {
                        GLog.d("bitmap is null in teximage2D.");
                    }
                }
            };
            this.mImageLoader.load(getContext(), str2, absImageCallback);
            absImageCallback.waitTillFinish();
        } catch (Throwable th) {
            GLog.e(TAG, th.getMessage(), th);
        }
    }

    @Override // com.taobao.gcanvas.bridges.spec.module.IGBridgeModule
    public void preLoadImage(JSONArray jSONArray, final JSCallback jscallback) {
        IJSCallbackMap createJSCallbackMap = getDataFactory().createJSCallbackMap();
        if (jSONArray == null || jSONArray.length() != 2) {
            createJSCallbackMap.putString("error", "invalid input param. specify an json array which length is 2, and index 0 is url to load, index 1 is image id.");
            invokeCallback(jscallback, createJSCallbackMap);
            return;
        }
        try {
            final String string = jSONArray.getString(0);
            final int i = jSONArray.getInt(1);
            if (TextUtils.isEmpty(string)) {
                createJSCallbackMap.putString("error", "invalid input param. url is empty.");
                return;
            }
            try {
                final IJSCallbackMap createJSCallbackMap2 = getDataFactory().createJSCallbackMap();
                if (string.startsWith("data:image")) {
                    Bitmap handleBase64Texture = handleBase64Texture(string.substring(string.indexOf("base64,") + 7));
                    if (handleBase64Texture != null) {
                        createJSCallbackMap2.putInt("id", i);
                        createJSCallbackMap2.putString("url", string);
                        createJSCallbackMap2.putInt("width", handleBase64Texture.getWidth());
                        createJSCallbackMap2.putInt("height", handleBase64Texture.getHeight());
                    } else {
                        createJSCallbackMap2.putString("error", "process base64 failed,url=" + string);
                    }
                    invokeCallback(jscallback, createJSCallbackMap2);
                    return;
                }
                GImageLoadInfo gImageLoadInfo = this.mImageIdCache.get(string);
                if (gImageLoadInfo == null) {
                    gImageLoadInfo = new GImageLoadInfo();
                    this.mImageIdCache.put(string, gImageLoadInfo);
                }
                if (gImageLoadInfo.status.get() == -1) {
                    gImageLoadInfo.status.set(256);
                    gImageLoadInfo.id = i;
                    ArrayList<JSCallback> arrayList = this.mCallbacks.get(string);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.mCallbacks.put(string, arrayList);
                    }
                    arrayList.add(jscallback);
                    this.mImageLoader.load(getContext(), string, new IGImageLoader.ImageCallback() { // from class: com.taobao.gcanvas.bridges.spec.module.AbsGBridgeModule.4
                        @Override // com.taobao.gcanvas.adapters.img.IGImageLoader.ImageCallback
                        public void onCancel() {
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.taobao.gcanvas.adapters.img.IGImageLoader.ImageCallback
                        public void onSuccess(Bitmap bitmap) {
                            if (bitmap != null) {
                                GImageLoadInfo gImageLoadInfo2 = AbsGBridgeModule.this.mImageIdCache.get(string);
                                gImageLoadInfo2.width = bitmap.getWidth();
                                gImageLoadInfo2.height = bitmap.getHeight();
                                createJSCallbackMap2.putInt("id", i);
                                createJSCallbackMap2.putString("url", string);
                                createJSCallbackMap2.putInt("width", gImageLoadInfo2.width);
                                createJSCallbackMap2.putInt("height", gImageLoadInfo2.height);
                                gImageLoadInfo2.status.set(512);
                                try {
                                    ArrayList<JSCallback> remove = AbsGBridgeModule.this.mCallbacks.remove(string);
                                    if (remove != null) {
                                        Iterator<JSCallback> it = remove.iterator();
                                        while (it.hasNext()) {
                                            AbsGBridgeModule.this.invokeCallback(it.next(), createJSCallbackMap2);
                                        }
                                        return;
                                    }
                                    return;
                                } catch (Throwable unused) {
                                    gImageLoadInfo2.status.set(-1);
                                    AbsGBridgeModule.this.invokeCallback(jscallback, createJSCallbackMap2);
                                    return;
                                }
                            }
                            createJSCallbackMap2.putString("error", "bitmap load failed");
                            try {
                                ArrayList<JSCallback> remove2 = AbsGBridgeModule.this.mCallbacks.remove(string);
                                if (remove2 != null) {
                                    Iterator<JSCallback> it2 = remove2.iterator();
                                    while (it2.hasNext()) {
                                        AbsGBridgeModule.this.invokeCallback(it2.next(), createJSCallbackMap2);
                                    }
                                }
                            } catch (Throwable unused2) {
                                AbsGBridgeModule.this.invokeCallback(jscallback, createJSCallbackMap2);
                            }
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.taobao.gcanvas.adapters.img.IGImageLoader.ImageCallback
                        public void onFail(Object obj) {
                            createJSCallbackMap2.putString("error", (String) obj);
                            try {
                                ArrayList<JSCallback> remove = AbsGBridgeModule.this.mCallbacks.remove(string);
                                if (remove != null) {
                                    Iterator<JSCallback> it = remove.iterator();
                                    while (it.hasNext()) {
                                        AbsGBridgeModule.this.invokeCallback(it.next(), createJSCallbackMap2);
                                    }
                                }
                            } catch (Throwable unused) {
                                AbsGBridgeModule.this.invokeCallback(jscallback, createJSCallbackMap2);
                            }
                        }
                    });
                } else if (256 == gImageLoadInfo.status.get()) {
                    ArrayList<JSCallback> arrayList2 = this.mCallbacks.get(string);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                        this.mCallbacks.put(string, arrayList2);
                    }
                    arrayList2.add(jscallback);
                } else if (512 == gImageLoadInfo.status.get()) {
                    createJSCallbackMap2.putInt("id", i);
                    createJSCallbackMap2.putString("url", string);
                    createJSCallbackMap2.putInt("width", gImageLoadInfo.width);
                    createJSCallbackMap2.putInt("height", gImageLoadInfo.height);
                    ArrayList<JSCallback> remove = this.mCallbacks.remove(string);
                    if (remove != null) {
                        Iterator<JSCallback> it = remove.iterator();
                        while (it.hasNext()) {
                            it.next();
                            invokeCallback(jscallback, createJSCallbackMap2);
                        }
                    }
                    invokeCallback(jscallback, createJSCallbackMap2);
                }
            } catch (Throwable th) {
                Log.e(TAG, th.getMessage(), th);
            }
        } catch (JSONException e) {
            createJSCallbackMap.putString("error", "invalid input param. error parse preload image data:" + e.getMessage());
            String str = TAG;
            GLog.d(str, "error parse preload image data:" + e.getMessage());
            invokeCallback(jscallback, createJSCallbackMap);
        }
    }

    public Bitmap handleBase64Texture(String str) {
        try {
            byte[] decode = decode(str.getBytes());
            return a.a(decode, 0, decode.length);
        } catch (Throwable th) {
            String str2 = TAG;
            Log.e(str2, "error in processing base64Texture,error=" + th);
            return null;
        }
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, bArr.length);
    }

    public static byte[] decode(byte[] bArr, int i) {
        int i2;
        int i3 = (i / 4) * 3;
        if (i3 == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (true) {
            byte b = bArr[i - 1];
            if (b != 10 && b != 13 && b != 32 && b != 9) {
                if (b != 61) {
                    break;
                }
                i4++;
            }
            i--;
        }
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            byte b2 = bArr[i8];
            if (b2 != 10 && b2 != 13 && b2 != 32 && b2 != 9) {
                if (b2 >= 65 && b2 <= 90) {
                    i2 = b2 - 65;
                } else if (b2 >= 97 && b2 <= 122) {
                    i2 = b2 - 71;
                } else if (b2 >= 48 && b2 <= 57) {
                    i2 = b2 + 4;
                } else if (b2 == 43) {
                    i2 = 62;
                } else if (b2 != 47) {
                    return null;
                } else {
                    i2 = 63;
                }
                i5 = (i5 << 6) | ((byte) i2);
                if (i7 % 4 == 3) {
                    int i9 = i6 + 1;
                    bArr2[i6] = (byte) (i5 >> 16);
                    int i10 = i9 + 1;
                    bArr2[i9] = (byte) (i5 >> 8);
                    bArr2[i10] = (byte) i5;
                    i6 = i10 + 1;
                }
                i7++;
            }
        }
        if (i4 > 0) {
            int i11 = i5 << (i4 * 6);
            int i12 = i6 + 1;
            bArr2[i6] = (byte) (i11 >> 16);
            if (i4 == 1) {
                i6 = i12 + 1;
                bArr2[i12] = (byte) (i11 >> 8);
            } else {
                i6 = i12;
            }
        }
        byte[] bArr3 = new byte[i6];
        System.arraycopy(bArr2, 0, bArr3, 0, i6);
        return bArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int fixType(int i, Bitmap bitmap) {
        if (bitmap == null || !Bitmap.Config.RGB_565.equals(bitmap.getConfig())) {
            return i;
        }
        return 33635;
    }
}
