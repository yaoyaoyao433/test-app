package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bumptech.glide.d;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.m;
import com.bumptech.glide.signature.a;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoUtil {
    private static String a;
    private static final List<String> b = Arrays.asList("p0.meituan.net", "p1.meituan.net", "img.meituan.net", "osp.meituan.net", "p0.meituan.com", "p1.meituan.com");

    PicassoUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            Integer.toHexString(((Integer) obj).intValue());
            return null;
        }
        return c(obj);
    }

    public static Uri b(Object obj) {
        if (obj != null && (obj instanceof Uri)) {
            return (Uri) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Uri) {
            return ((Uri) obj).toString();
        }
        if (obj instanceof File) {
            return ((File) obj).getAbsolutePath();
        }
        return null;
    }

    private static String a(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            StringBuilder sb = new StringBuilder();
            if (min > 1284) {
                return "";
            }
            sb.append("@");
            if (min > 1080) {
                sb.append(1284);
            } else if (min > 750) {
                sb.append(1080);
            } else {
                sb.append(750);
            }
            sb.append("w_1l");
            String sb2 = sb.toString();
            a = sb2;
            return sb2;
        }
        return "";
    }

    private static String a(Context context, String str, String str2, boolean z) {
        if (z && b.contains(str)) {
            if ((str2.contains("@") || str2.contains("%40") || str2.endsWith(".gif")) || Pattern.compile("(\\d+)\\.(\\d+)(\\.(a|o|\\d+))?").matcher(str2).find()) {
                return str2;
            }
            int indexOf = str2.indexOf(CommonConstant.Symbol.QUESTION_MARK);
            if (indexOf > 0) {
                String substring = str2.substring(0, indexOf);
                String substring2 = str2.substring(indexOf);
                return substring + a(context) + substring2;
            }
            return str2 + a(context);
        }
        return str2;
    }

    public static d a(Picasso picasso, Context context, Object obj, boolean z) {
        if (obj == null) {
            return picasso.d(context).a((String) null);
        }
        if (obj instanceof String) {
            String host = Uri.parse((String) obj).getHost();
            String a2 = a(context, host, obj.toString(), z);
            if (Picasso.d != null && Picasso.d.a && Picasso.d.b != null) {
                Uri parse = Uri.parse(a2);
                String scheme = parse.getScheme();
                String path = parse.getPath();
                if ("http".equalsIgnoreCase(scheme) && !TextUtils.isEmpty(host) && Picasso.d.b.contains(host)) {
                    a2 = AbsApiFactory.HTTPS + host + path;
                }
            }
            return picasso.d(context).a(a2);
        } else if (obj instanceof Uri) {
            String host2 = ((Uri) obj).getHost();
            Uri parse2 = Uri.parse(a(context, host2, obj.toString(), z));
            if (Picasso.d != null && Picasso.d.a && Picasso.d.b != null) {
                Uri uri = parse2;
                String scheme2 = uri.getScheme();
                String path2 = uri.getPath();
                if ("http".equalsIgnoreCase(scheme2) && !TextUtils.isEmpty(host2) && Picasso.d.b.contains(host2)) {
                    parse2 = Uri.parse(AbsApiFactory.HTTPS + host2 + path2);
                }
            }
            return (d) picasso.d(context).a(Uri.class).b((d) parse2);
        } else if (!(obj instanceof File)) {
            if (obj instanceof Integer) {
                m d = picasso.d(context);
                return (d) ((d) d.a(Integer.class).b(a.a(d.a))).b((d) ((Integer) obj));
            } else if (obj instanceof byte[]) {
                return (d) ((d) picasso.d(context).a(byte[].class).b((c) new com.bumptech.glide.signature.c(UUID.randomUUID().toString())).b(b.NONE).a(true)).b((d) ((byte[]) obj));
            } else {
                return (d) picasso.d(context).a(m.a(obj)).b((d) obj);
            }
        } else {
            return (d) picasso.d(context).a(File.class).b((d) ((File) obj));
        }
    }
}
