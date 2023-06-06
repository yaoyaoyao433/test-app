package com.facebook.react;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.image.RCTImageManager;
import com.facebook.react.views.image.RCTRoundImageView;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.squareup.picasso.PicassoGifDrawable;
import com.squareup.picasso.RequestCreator;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a {
    private static volatile a a;
    private static final Pattern d = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    private LruCache<Uri, Drawable> b;
    private Context c;

    /* compiled from: ProGuard */
    /* renamed from: com.facebook.react.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0141a {
        void onFailure(Exception exc);

        void onSuccess(Drawable drawable);
    }

    private a(Context context) {
        this.c = context.getApplicationContext();
        this.b = new LruCache<>(((ActivityManager) this.c.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryClass() / 16);
    }

    public static a a(Context context) {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a(context);
                }
            }
        }
        return a;
    }

    public final void a(@NonNull final Uri uri, String str, final InterfaceC0141a interfaceC0141a) {
        InputStream inputStream;
        InputStream inputStream2;
        if (uri.getScheme() == null) {
            interfaceC0141a.onFailure(new IllegalArgumentException("Invalid uri: scheme"));
        }
        final String uri2 = uri.toString();
        synchronized (this.b) {
            Drawable drawable = this.b.get(uri);
            if (drawable != null) {
                interfaceC0141a.onSuccess(drawable);
                return;
            }
            if (TextUtils.equals(uri.getScheme(), "data")) {
                Matcher matcher = d.matcher(uri.toString());
                if (matcher != null && matcher.find() && !TextUtils.isEmpty(matcher.group(1))) {
                    byte[] decode = Base64.decode(matcher.group(1), 0);
                    if (decode.length > 0) {
                        Drawable bitmapDrawable = new BitmapDrawable(this.c.getResources(), com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length));
                        interfaceC0141a.onSuccess(bitmapDrawable);
                        this.b.put(uri, bitmapDrawable);
                    } else {
                        interfaceC0141a.onFailure(new IllegalArgumentException("Invalid base64:" + uri2));
                    }
                }
            } else {
                InputStream inputStream3 = null;
                r4 = null;
                r4 = null;
                r4 = null;
                InputStream inputStream4 = null;
                inputStream3 = null;
                inputStream3 = null;
                if (TextUtils.equals(uri.getScheme(), "asset")) {
                    String name = new File(uri2.length() > 7 ? uri2.substring(7) : null).getName();
                    int lastIndexOf = name.lastIndexOf(CommonConstant.Symbol.DOT);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    int a2 = com.facebook.react.views.imagehelper.a.a().a(this.c, name);
                    Drawable drawable2 = a2 > 0 ? this.c.getResources().getDrawable(a2) : null;
                    if (drawable2 != null) {
                        interfaceC0141a.onSuccess(drawable2);
                        this.b.put(uri, drawable2);
                    } else {
                        interfaceC0141a.onFailure(new IllegalArgumentException("invalid asset:" + uri2));
                    }
                } else {
                    try {
                        if (com.meituan.android.mrn.util.b.a(uri)) {
                            try {
                                inputStream = com.meituan.android.mrn.util.b.b(uri).b();
                            } catch (Exception e) {
                                e = e;
                            }
                            try {
                                Drawable createFromStream = Drawable.createFromStream(inputStream, uri2);
                                if (createFromStream != null) {
                                    interfaceC0141a.onSuccess(createFromStream);
                                    this.b.put(uri, createFromStream);
                                } else {
                                    interfaceC0141a.onFailure(new IllegalArgumentException("Invalid file:" + uri2));
                                }
                                com.meituan.dio.utils.c.a((Closeable) inputStream);
                            } catch (Exception e2) {
                                e = e2;
                                inputStream3 = inputStream;
                                e.printStackTrace();
                                interfaceC0141a.onFailure(e);
                                com.meituan.dio.utils.c.a((Closeable) inputStream3);
                            } catch (Throwable th) {
                                th = th;
                                com.meituan.dio.utils.c.a((Closeable) inputStream);
                                throw th;
                            }
                        } else {
                            try {
                                if (TextUtils.equals(uri.getScheme(), "file")) {
                                    try {
                                        inputStream2 = Privacy.createContentResolver(this.c, str).b(uri);
                                    } catch (FileNotFoundException e3) {
                                        e = e3;
                                    }
                                    try {
                                        Drawable createFromStream2 = Drawable.createFromStream(inputStream2, uri2);
                                        if (createFromStream2 != null) {
                                            interfaceC0141a.onSuccess(createFromStream2);
                                            this.b.put(uri, createFromStream2);
                                        } else {
                                            interfaceC0141a.onFailure(new IllegalArgumentException("Invalid file:" + uri2));
                                        }
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (IOException e4) {
                                                e = e4;
                                                e.printStackTrace();
                                            }
                                        }
                                    } catch (FileNotFoundException e5) {
                                        e = e5;
                                        inputStream4 = inputStream2;
                                        e.printStackTrace();
                                        interfaceC0141a.onFailure(e);
                                        if (inputStream4 != null) {
                                            try {
                                                inputStream4.close();
                                            } catch (IOException e6) {
                                                e = e6;
                                                e.printStackTrace();
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (IOException e7) {
                                                e7.printStackTrace();
                                            }
                                        }
                                        throw th;
                                    }
                                } else {
                                    com.sankuai.android.jarvis.c.a("mrn_drawable", new Runnable() { // from class: com.facebook.react.a.1
                                        /* JADX WARN: Removed duplicated region for block: B:39:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                        @Override // java.lang.Runnable
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final void run() {
                                            /*
                                                r5 = this;
                                                r0 = 0
                                                java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                java.lang.String r2 = r2     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                r1.<init>(r2)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                java.net.URLConnection r1 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r1)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                r1.connect()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L4e
                                                android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                com.facebook.react.a r2 = com.facebook.react.a.this     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                android.content.Context r2 = com.facebook.react.a.a(r2)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                android.content.res.Resources r2 = r2.getResources()     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                android.graphics.Bitmap r3 = com.sankuai.waimai.launcher.util.image.a.a(r1)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                r0.<init>(r2, r3)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                com.facebook.react.a$a r2 = r3     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                r2.onSuccess(r0)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                com.facebook.react.a r2 = com.facebook.react.a.this     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                android.util.LruCache r2 = com.facebook.react.a.b(r2)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                android.net.Uri r3 = r4     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                r2.put(r3, r0)     // Catch: java.io.IOException -> L47 java.lang.Throwable -> L66
                                                if (r1 == 0) goto L65
                                                r1.close()     // Catch: java.io.IOException -> L42
                                                return
                                            L42:
                                                r0 = move-exception
                                                r0.printStackTrace()
                                                return
                                            L47:
                                                r0 = move-exception
                                                goto L52
                                            L49:
                                                r1 = move-exception
                                                r4 = r1
                                                r1 = r0
                                                r0 = r4
                                                goto L67
                                            L4e:
                                                r1 = move-exception
                                                r4 = r1
                                                r1 = r0
                                                r0 = r4
                                            L52:
                                                r0.printStackTrace()     // Catch: java.lang.Throwable -> L66
                                                com.facebook.react.a$a r2 = r3     // Catch: java.lang.Throwable -> L66
                                                r2.onFailure(r0)     // Catch: java.lang.Throwable -> L66
                                                if (r1 == 0) goto L65
                                                r1.close()     // Catch: java.io.IOException -> L60
                                                return
                                            L60:
                                                r0 = move-exception
                                                r0.printStackTrace()
                                                return
                                            L65:
                                                return
                                            L66:
                                                r0 = move-exception
                                            L67:
                                                if (r1 == 0) goto L71
                                                r1.close()     // Catch: java.io.IOException -> L6d
                                                goto L71
                                            L6d:
                                                r1 = move-exception
                                                r1.printStackTrace()
                                            L71:
                                                throw r0
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.a.AnonymousClass1.run():void");
                                        }
                                    }).start();
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStream2 = inputStream4;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream = inputStream3;
                    }
                }
            }
        }
    }

    public static RequestCreator a(Context context, Uri uri) {
        try {
            return Picasso.g(context.getApplicationContext()).a(com.meituan.android.mrn.util.b.b(uri));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(Drawable drawable, boolean z) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof PicassoBitmapDrawable) {
            return ((PicassoBitmapDrawable) drawable).b();
        }
        if (drawable instanceof PicassoGifDrawable) {
            return ((PicassoGifDrawable) drawable).b();
        }
        if (z) {
            try {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap.Config config = drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                if (drawable instanceof ColorDrawable) {
                    createBitmap = Bitmap.createBitmap(2, 2, config);
                } else {
                    createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, config);
                }
                Canvas canvas = new Canvas(createBitmap);
                Rect copyBounds = drawable.copyBounds();
                drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                drawable.draw(canvas);
                drawable.setBounds(copyBounds);
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static RCTImageManager a(ReactContext reactContext) {
        UIManagerModule uIManagerModule;
        if (reactContext == null || (uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)) == null) {
            return null;
        }
        ViewManager viewManagerByName = uIManagerModule.getViewManagerByName(RCTImageManager.REACT_CLASS);
        if (viewManagerByName instanceof RCTImageManager) {
            return (RCTImageManager) viewManagerByName;
        }
        return null;
    }

    public static Collection<RCTRoundImageView> b(ReactContext reactContext) {
        RCTImageManager a2 = a(reactContext);
        return a2 == null ? Collections.emptyList() : a2.getAllViewInstances();
    }
}
