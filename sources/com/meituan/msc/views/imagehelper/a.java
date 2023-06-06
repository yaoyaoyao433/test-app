package com.meituan.msc.views.imagehelper;

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
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static volatile a b;
    private static final Pattern e = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    private LruCache<Uri, Drawable> c;
    private Context d;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.views.imagehelper.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0490a {
        void a(Drawable drawable);

        void a(Exception exc);
    }

    private a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0ed18c3b6c9e5bc250f7a4f6a46f2cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0ed18c3b6c9e5bc250f7a4f6a46f2cd");
            return;
        }
        this.d = context.getApplicationContext();
        this.c = new LruCache<>(((ActivityManager) this.d.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryClass() / 16);
    }

    public static a a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94e1a4648d7e1d83f713393e9753bda4", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94e1a4648d7e1d83f713393e9753bda4");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a(context);
                }
            }
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    public final void a(@NonNull final Uri uri, String str, final InterfaceC0490a interfaceC0490a) {
        InputStream inputStream;
        InputStream inputStream2;
        Object[] objArr = {uri, str, interfaceC0490a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "383a20d3a4e83dd8076041b071a16210", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "383a20d3a4e83dd8076041b071a16210");
            return;
        }
        if (uri.getScheme() == null) {
            interfaceC0490a.a(new IllegalArgumentException("Invalid uri: scheme"));
        }
        final String uri2 = uri.toString();
        synchronized (this.c) {
            Drawable drawable = this.c.get(uri);
            if (drawable != null) {
                interfaceC0490a.a(drawable);
                return;
            }
            if (TextUtils.equals(uri.getScheme(), "data")) {
                Matcher matcher = e.matcher(uri.toString());
                if (matcher != null && matcher.find() && !TextUtils.isEmpty(matcher.group(1))) {
                    byte[] decode = Base64.decode(matcher.group(1), 0);
                    if (decode.length > 0) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.d.getResources(), com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length));
                        interfaceC0490a.a(bitmapDrawable);
                        this.c.put(uri, bitmapDrawable);
                    } else {
                        interfaceC0490a.a(new IllegalArgumentException("Invalid base64:" + uri2));
                    }
                }
            } else {
                InputStream inputStream3 = null;
                r3 = null;
                r3 = null;
                InputStream inputStream4 = null;
                inputStream3 = null;
                if (TextUtils.equals(uri.getScheme(), "asset")) {
                    String substring = uri2.length() > 7 ? uri2.substring(7) : null;
                    if (substring == null) {
                        interfaceC0490a.a(new IllegalArgumentException("filepath null, invalid asset:" + uri2));
                        return;
                    }
                    String name = new File(substring).getName();
                    int lastIndexOf = name.lastIndexOf(CommonConstant.Symbol.DOT);
                    if (lastIndexOf != -1) {
                        name = name.substring(0, lastIndexOf);
                    }
                    Drawable b2 = b(name);
                    if (b2 != null) {
                        interfaceC0490a.a(b2);
                        this.c.put(uri, b2);
                    } else {
                        interfaceC0490a.a(new IllegalArgumentException("invalid asset:" + uri2));
                    }
                } else if (com.meituan.msc.utils.a.a(uri)) {
                    try {
                        try {
                            inputStream = com.meituan.msc.utils.a.b(uri).b();
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream3;
                    }
                    try {
                        Drawable createFromStream = Drawable.createFromStream(inputStream, uri2);
                        if (createFromStream != null) {
                            interfaceC0490a.a(createFromStream);
                            this.c.put(uri, createFromStream);
                        } else {
                            interfaceC0490a.a(new IllegalArgumentException("Invalid file:" + uri2));
                        }
                        com.meituan.dio.utils.c.a((Closeable) inputStream);
                    } catch (Exception e3) {
                        e = e3;
                        inputStream3 = inputStream;
                        e.printStackTrace();
                        interfaceC0490a.a(e);
                        com.meituan.dio.utils.c.a((Closeable) inputStream3);
                    } catch (Throwable th2) {
                        th = th2;
                        com.meituan.dio.utils.c.a((Closeable) inputStream);
                        throw th;
                    }
                } else {
                    try {
                        if (TextUtils.equals(uri.getScheme(), "file")) {
                            try {
                                inputStream2 = Privacy.createContentResolver(this.d, str).b(uri);
                            } catch (FileNotFoundException e4) {
                                e = e4;
                            }
                            try {
                                Drawable createFromStream2 = Drawable.createFromStream(inputStream2, uri2);
                                if (createFromStream2 != null) {
                                    interfaceC0490a.a(createFromStream2);
                                    this.c.put(uri, createFromStream2);
                                } else {
                                    interfaceC0490a.a(new IllegalArgumentException("Invalid file:" + uri2));
                                    inputStream4 = "Invalid file:";
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e5) {
                                        e = e5;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (FileNotFoundException e6) {
                                e = e6;
                                inputStream4 = inputStream2;
                                e.printStackTrace();
                                interfaceC0490a.a(e);
                                if (inputStream4 != null) {
                                    try {
                                        inputStream4.close();
                                    } catch (IOException e7) {
                                        e = e7;
                                        e.printStackTrace();
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } else {
                            com.sankuai.android.jarvis.c.a("mrn_drawable", new Runnable() { // from class: com.meituan.msc.views.imagehelper.a.1
                                public static ChangeQuickRedirect a;

                                /* JADX WARN: Removed duplicated region for block: B:40:0x0081 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        r12 = this;
                                        r0 = 0
                                        java.lang.Object[] r8 = new java.lang.Object[r0]
                                        com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.msc.views.imagehelper.a.AnonymousClass1.a
                                        java.lang.String r10 = "5a14c9725f6a63c3709e1152cdfdaff8"
                                        r4 = 0
                                        r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                                        r1 = r8
                                        r2 = r12
                                        r3 = r9
                                        r5 = r10
                                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                                        if (r1 == 0) goto L18
                                        com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r9, r0, r10)
                                        return
                                    L18:
                                        r0 = 0
                                        java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        java.lang.String r2 = r2     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        r1.<init>(r2)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        java.net.URLConnection r1 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r1)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        r1.connect()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
                                        android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        com.meituan.msc.views.imagehelper.a r2 = com.meituan.msc.views.imagehelper.a.this     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        android.content.Context r2 = com.meituan.msc.views.imagehelper.a.a(r2)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        android.content.res.Resources r2 = r2.getResources()     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        android.graphics.Bitmap r3 = com.sankuai.waimai.launcher.util.image.a.a(r1)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        r0.<init>(r2, r3)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        com.meituan.msc.views.imagehelper.a$a r2 = r3     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        r2.a(r0)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        com.meituan.msc.views.imagehelper.a r2 = com.meituan.msc.views.imagehelper.a.this     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        android.util.LruCache r2 = com.meituan.msc.views.imagehelper.a.b(r2)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        android.net.Uri r3 = r4     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        r2.put(r3, r0)     // Catch: java.io.IOException -> L5f java.lang.Throwable -> L7e
                                        if (r1 == 0) goto L7d
                                        r1.close()     // Catch: java.io.IOException -> L5a
                                        return
                                    L5a:
                                        r0 = move-exception
                                        r0.printStackTrace()
                                        return
                                    L5f:
                                        r0 = move-exception
                                        goto L6a
                                    L61:
                                        r1 = move-exception
                                        r11 = r1
                                        r1 = r0
                                        r0 = r11
                                        goto L7f
                                    L66:
                                        r1 = move-exception
                                        r11 = r1
                                        r1 = r0
                                        r0 = r11
                                    L6a:
                                        r0.printStackTrace()     // Catch: java.lang.Throwable -> L7e
                                        com.meituan.msc.views.imagehelper.a$a r2 = r3     // Catch: java.lang.Throwable -> L7e
                                        r2.a(r0)     // Catch: java.lang.Throwable -> L7e
                                        if (r1 == 0) goto L7d
                                        r1.close()     // Catch: java.io.IOException -> L78
                                        return
                                    L78:
                                        r0 = move-exception
                                        r0.printStackTrace()
                                        return
                                    L7d:
                                        return
                                    L7e:
                                        r0 = move-exception
                                    L7f:
                                        if (r1 == 0) goto L89
                                        r1.close()     // Catch: java.io.IOException -> L85
                                        goto L89
                                    L85:
                                        r1 = move-exception
                                        r1.printStackTrace()
                                    L89:
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.imagehelper.a.AnonymousClass1.run():void");
                                }
                            }).start();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream2 = inputStream4;
                    }
                }
            }
        }
    }

    private int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8122dad787a9974370e32fd816ba0ad1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8122dad787a9974370e32fd816ba0ad1")).intValue() : b.a().a(this.d, str);
    }

    private Drawable b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2af9bf5d34ed7e83fe3c836f9f9e4784", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2af9bf5d34ed7e83fe3c836f9f9e4784");
        }
        int a2 = a(str);
        if (a2 > 0) {
            return this.d.getResources().getDrawable(a2);
        }
        return null;
    }

    public static RequestCreator a(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2539c38b12b36801027dcce58e309ca2", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequestCreator) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2539c38b12b36801027dcce58e309ca2");
        }
        try {
            return Picasso.g(context.getApplicationContext()).a(com.meituan.msc.utils.a.b(uri));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(Drawable drawable, boolean z) {
        Bitmap createBitmap;
        Object[] objArr = {drawable, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b2d761c15b0b1603f586784ceab7b25c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b2d761c15b0b1603f586784ceab7b25c");
        }
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
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
