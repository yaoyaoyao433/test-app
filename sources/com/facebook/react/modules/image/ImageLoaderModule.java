package com.facebook.react.modules.image;

import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.dianping.titans.utils.LocalIdUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.m;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.metrics.common.Constants;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.picasso.DiskCacheStrategy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoDrawable;
import com.squareup.picasso.PicassoTarget;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.RequestListener;
import java.util.Locale;
/* compiled from: ProGuard */
@ReactModule(name = ImageLoaderModule.NAME)
/* loaded from: classes.dex */
public class ImageLoaderModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<PicassoTarget> mEnqueuedRequests;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
    }

    @ReactMethod
    public void getSize(Dynamic dynamic, final Promise promise) {
        final String str;
        Uri fromFile;
        Uri parse;
        if (dynamic == null) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            str = dynamic.asString();
        } else if (dynamic.getType() == ReadableType.Map) {
            ReadableMap asMap = dynamic.asMap();
            String string = asMap.hasKey(Constants.TRAFFIC_URI) ? asMap.getString(Constants.TRAFFIC_URI) : null;
            r2 = asMap.hasKey("sceneToken") ? asMap.getString("sceneToken") : null;
            str = string;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        if (LocalIdUtils.isValid(str)) {
            try {
                if (TextUtils.isEmpty(r2) && (parse = Uri.parse(str)) != null) {
                    r2 = parse.getQueryParameter("sceneToken");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            fromFile = Uri.fromFile(LocalIdUtils.getFile(str, r2));
        } else {
            fromFile = Uri.parse(str);
        }
        RequestCreator a = Picasso.g(getReactApplicationContext()).a(fromFile);
        a.k = DiskCacheStrategy.SOURCE;
        a.s = new RequestListener<Object, PicassoDrawable>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.1
            @Override // com.squareup.picasso.RequestListener
            public final boolean a(Exception exc, Object obj, boolean z) {
                promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, new RuntimeException("fetch image exception", exc), ImageLoaderModule.this.getRejectUserInfo(str));
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.squareup.picasso.RequestListener
            public boolean a(PicassoDrawable picassoDrawable, Object obj, boolean z, boolean z2) {
                com.facebook.common.logging.a.a("SIZE", String.format(Locale.ROOT, "%dx%d", Integer.valueOf(picassoDrawable.getIntrinsicWidth()), Integer.valueOf(picassoDrawable.getIntrinsicHeight())));
                try {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("width", picassoDrawable.getIntrinsicWidth());
                    createMap.putInt("height", picassoDrawable.getIntrinsicHeight());
                    promise.resolve(createMap);
                } catch (Exception e) {
                    promise.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e, ImageLoaderModule.this.getRejectUserInfo(str));
                }
                return false;
            }
        };
        a.d(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @ReactMethod
    public void prefetchImage(final String str, double d, final Promise promise) {
        final int i = (int) d;
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI", getRejectUserInfo(str, i));
            return;
        }
        final Uri parse = Uri.parse(str);
        RequestCreator a = Picasso.g(getReactApplicationContext()).a(parse).a(true);
        a.k = DiskCacheStrategy.SOURCE;
        a.s = new RequestListener<Uri, PicassoDrawable>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.squareup.picasso.RequestListener
            public boolean a(Exception exc, Uri uri, boolean z) {
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    promise.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, exc, ImageLoaderModule.this.getRejectUserInfo(str));
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.squareup.picasso.RequestListener
            public boolean a(PicassoDrawable picassoDrawable, Uri uri, boolean z, boolean z2) {
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    m.a().a(parse);
                    promise.resolve(Boolean.TRUE);
                    return false;
                } catch (Exception unused) {
                    return false;
                }
            }
        };
        registerRequest(i, a.d(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @ReactMethod
    public void abortRequest(double d) {
        PicassoTarget removeRequest = removeRequest((int) d);
        if (removeRequest != null) {
            Picasso.a(removeRequest);
        }
    }

    @ReactMethod
    public void queryCache(final ReadableArray readableArray, final Promise promise) {
        b.a(new GuardedAsyncTask<Void, Void>(new NativeModuleCallExceptionHandler() { // from class: com.facebook.react.modules.image.ImageLoaderModule.3
            @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
            public final void handleException(Exception exc) {
                promise.reject(exc);
            }
        }) { // from class: com.facebook.react.modules.image.ImageLoaderModule.4
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public final /* synthetic */ void doInBackgroundGuarded(Void[] voidArr) {
                WritableMap createMap = Arguments.createMap();
                for (int i = 0; i < readableArray.size(); i++) {
                    createMap.putString(readableArray.getString(i), "disk");
                }
                promise.resolve(createMap);
            }
        }, c.a(), new Void[0]);
    }

    private void registerRequest(int i, PicassoTarget picassoTarget) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, picassoTarget);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PicassoTarget removeRequest(int i) {
        PicassoTarget picassoTarget;
        synchronized (this.mEnqueuedRequestMonitor) {
            picassoTarget = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return picassoTarget;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                PicassoTarget valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    Picasso.a(valueAt);
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WritableMap getRejectUserInfo(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uriString", str);
        return createMap;
    }

    private WritableMap getRejectUserInfo(String str, int i) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uriString", str);
        createMap.putInt("requestId", i);
        return createMap;
    }
}
