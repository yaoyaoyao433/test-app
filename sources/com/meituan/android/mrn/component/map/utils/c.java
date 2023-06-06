package com.meituan.android.mrn.component.map.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final Pattern c = Pattern.compile("data:image/[\\*a-z]+;base64,([a-zA-Z0-9\\+/=]+)");
    public Context b;

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e54feadcf2ce554c014ac542f3237f7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e54feadcf2ce554c014ac542f3237f7d");
        } else {
            this.b = context.getApplicationContext();
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f1968f79d5de63179c673bc05c4d477", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f1968f79d5de63179c673bc05c4d477");
        }
        if (bitmap == null) {
            return null;
        }
        if (i2 >= 0 || i >= 0) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width == 0 || height == 0) {
                return bitmap;
            }
            if (width == i && height == i2) {
                return bitmap;
            }
            if (i <= 0) {
                i = width;
            }
            if (i2 <= 0) {
                i2 = height;
            }
            if (width == i && height == i2) {
                return bitmap;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(i / width, i2 / height);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        }
        return bitmap;
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "444679369512f23eb83f508a949516a2", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "444679369512f23eb83f508a949516a2") : new c(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.FileInputStream] */
    public static byte[] a(File file) {
        FileChannel channel;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileChannel fileChannel = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce0748a9e97dd6b4753437f579fd0f3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce0748a9e97dd6b4753437f579fd0f3a");
        }
        ?? exists = file.exists();
        try {
            if (exists == 0) {
                throw new FileNotFoundException(file.getPath());
            }
            try {
                exists = new FileInputStream(file);
                try {
                    channel = exists.getChannel();
                } catch (IOException e) {
                    e = e;
                }
                try {
                    ByteBuffer allocate = ByteBuffer.allocate((int) channel.size());
                    do {
                    } while (channel.read(allocate) > 0);
                    byte[] array = allocate.array();
                    try {
                        channel.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        exists.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    return array;
                } catch (IOException e4) {
                    e = e4;
                    e.printStackTrace();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fileChannel = channel;
                    try {
                        fileChannel.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    try {
                        exists.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th2) {
                th = th2;
                exists = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41bf588a40c776947cac3ba1599829be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41bf588a40c776947cac3ba1599829be")).intValue();
        }
        if (TextUtils.isEmpty(str) || this.b == null) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.a(e, "param");
            synchronized (this) {
                return this.b.getResources().getIdentifier(str, PicassoUtils.DEF_TYPE, this.b.getPackageName());
            }
        }
    }

    public Uri a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6eea39fd816425be5c84118a952222d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6eea39fd816425be5c84118a952222d");
        }
        try {
            return Uri.parse(str);
        } catch (Exception e) {
            e.a(e, "param");
            return null;
        }
    }

    public final void a(String str, final Target target) {
        Object obj;
        Object[] objArr = {str, target};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "961dce689b2b6e8f8e347e7588716b20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "961dce689b2b6e8f8e347e7588716b20");
        } else if (this.b == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                Uri a2 = a(str);
                RequestCreator requestCreator = null;
                if (a2 == null || TextUtils.isEmpty(a2.getScheme())) {
                    obj = Integer.valueOf(b(str));
                } else if (TextUtils.equals(a2.getScheme(), "data")) {
                    Matcher matcher = c.matcher(str);
                    obj = a2;
                    if (matcher != null) {
                        obj = a2;
                        if (matcher.find()) {
                            obj = a2;
                            if (!TextUtils.isEmpty(matcher.group(1))) {
                                obj = Base64.decode(matcher.group(1), 0);
                            }
                        }
                    }
                } else {
                    boolean a3 = com.meituan.android.mrn.util.b.a(a2);
                    obj = a2;
                    if (a3) {
                        requestCreator = com.facebook.react.a.a(this.b, a2);
                        obj = a2;
                    }
                }
                if (obj == null) {
                    return;
                }
                if (requestCreator == null) {
                    requestCreator = Picasso.g(this.b).a(obj);
                }
                requestCreator.a(new Target() { // from class: com.meituan.android.mrn.component.map.utils.c.1
                    public static ChangeQuickRedirect a;

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapFailed(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2245d2581830c2941f493209142e6d9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2245d2581830c2941f493209142e6d9");
                        } else if (target != null) {
                            target.onBitmapFailed(drawable);
                        }
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
                        Object[] objArr2 = {bitmap, loadedFrom};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a2544f3f3eb55054927b072cc850321", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a2544f3f3eb55054927b072cc850321");
                        } else if (target != null) {
                            target.onBitmapLoaded(bitmap, loadedFrom);
                        }
                    }

                    @Override // com.squareup.picasso.Target
                    public final void onPrepareLoad(Drawable drawable) {
                        Object[] objArr2 = {drawable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3508f041a7bdd8ef81d733f68a7b6d8c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3508f041a7bdd8ef81d733f68a7b6d8c");
                        } else if (target != null) {
                            target.onPrepareLoad(drawable);
                        }
                    }
                });
            } catch (Exception e) {
                e.a(e, "other");
            }
        }
    }
}
