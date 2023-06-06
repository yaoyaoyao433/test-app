package com.dianping.picasso;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.creator.BaseViewWrapper;
import com.dianping.picasso.model.GroupModel;
import com.dianping.picasso.model.PicassoModel;
import com.dianping.picassocontroller.monitor.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import rx.exceptions.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoUtils {
    public static final int BUFFER_SIZE = 84;
    public static final int COLOR_SIZE = 9;
    public static final String DEF_TYPE = "drawable";
    private static final int MAX_RESOURCE_CACHE_COUNT = 30;
    public static final int NO_COLOR = 1;
    public static final int X_SIZE = 2;
    public static final int Y_SIZE = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static LinkedHashMap<String, Integer> resourcesIdCacheMap = new LinkedHashMap<>();
    private static int screenHeightPixels;
    private static int screenWidthPixels;

    public static int getScreenWidthPixels(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a6cb5c949c4d8c2652338546aba6255c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a6cb5c949c4d8c2652338546aba6255c")).intValue() : getScreenWidthPixels(context, true);
    }

    public static int getScreenWidthPixels(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f2d8881bfb98ac4393b5d3131fe069ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f2d8881bfb98ac4393b5d3131fe069ea")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (screenWidthPixels > 0 && z) {
            return screenWidthPixels;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
            screenWidthPixels = displayMetrics.widthPixels;
        }
        return screenWidthPixels;
    }

    public static int getNavigationBarHeight(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0fa3713c7c5075ecd3d785d06c735381", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0fa3713c7c5075ecd3d785d06c735381")).intValue();
        }
        if (activity == null) {
            return 0;
        }
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier(isPortrait(activity) ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", "android");
        if (identifier > 0 && checkDeviceHasNavigationBar(activity) && isNavigationBarVisible(activity)) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static boolean isPortrait(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3df54447118aac86d72d351c3765a703", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3df54447118aac86d72d351c3765a703")).booleanValue() : activity.getResources().getConfiguration().orientation == 1;
    }

    private static boolean isNavigationBarVisible(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a506ba068e549c84cf7134dedb491682", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a506ba068e549c84cf7134dedb491682")).booleanValue();
        }
        Display defaultDisplay = activity.getWindow().getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        View decorView = activity.getWindow().getDecorView();
        if (2 == activity.getResources().getConfiguration().orientation) {
            if (point.x != decorView.findViewById(16908290).getWidth()) {
                return true;
            }
        } else {
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            if (rect.bottom != point.y) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDeviceHasNavigationBar(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a85efefe60148b3def3286658eae9e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a85efefe60148b3def3286658eae9e7")).booleanValue();
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i2 - displayMetrics2.widthPixels > 0 || i - displayMetrics2.heightPixels > 0;
    }

    public static int getScreenHeightPixels(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96640b261e25d39c34acfa2634c2cc0c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96640b261e25d39c34acfa2634c2cc0c")).intValue() : getScreenHeightPixels(context, true);
    }

    public static int getScreenHeightPixels(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f30eab3d2921f80b78557c2754e260c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f30eab3d2921f80b78557c2754e260c")).intValue();
        }
        if (context == null) {
            return 0;
        }
        if (screenHeightPixels > 0 && z) {
            return screenHeightPixels;
        }
        new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            screenHeightPixels = point.y;
        }
        return screenHeightPixels;
    }

    public static int getResourcesId(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1aec371237df043e726ce13bb471eafa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1aec371237df043e726ce13bb471eafa")).intValue() : getResourcesId(context, str, 0);
    }

    public static synchronized int getResourcesId(Context context, String str, int i) {
        synchronized (PicassoUtils.class) {
            Object[] objArr = {context, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9af0bbaad7d1d6c0e54d74454356b932", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9af0bbaad7d1d6c0e54d74454356b932")).intValue();
            }
            if (!TextUtils.isEmpty(str)) {
                Integer num = resourcesIdCacheMap.get(str);
                if (num != null) {
                    return num.intValue();
                }
                int identifier = context.getResources().getIdentifier(str, DEF_TYPE, context.getPackageName());
                if (identifier != 0) {
                    if (resourcesIdCacheMap.size() > 30) {
                        LinkedHashMap<String, Integer> linkedHashMap = resourcesIdCacheMap;
                        linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                    }
                    resourcesIdCacheMap.put(str, Integer.valueOf(identifier));
                    return identifier;
                }
            }
            return i;
        }
    }

    @Deprecated
    public static int px2dip(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a855fe6b01d8ac8a009663fc228c35f2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a855fe6b01d8ac8a009663fc228c35f2")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        return (int) ((f / context.getResources().getDisplayMetrics().density) + (f > 0.0f ? 0.5f : -0.5f));
    }

    @Deprecated
    public static int dip2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1814fd1dc84764fbf36143ac032608be", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1814fd1dc84764fbf36143ac032608be")).intValue() : dip2px(context, f, 0.0f);
    }

    @Deprecated
    public static int dip2px(Context context, float f, float f2) {
        Object[] objArr = {context, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4ce9bfdae80e21adf18e017ee2b9e20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4ce9bfdae80e21adf18e017ee2b9e20")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        if (f2 == 0.0f) {
            f2 = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((f2 * f) + (f > 0.0f ? 0.5f : -0.5f));
    }

    public static float px2dp(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb873b4e56f892f5328901ed668ad5a9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb873b4e56f892f5328901ed668ad5a9")).floatValue() : context == null ? f : f / context.getResources().getDisplayMetrics().density;
    }

    public static int dp2px(Context context, float f) {
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b620f019d283f57bed29e34821b4b1e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b620f019d283f57bed29e34821b4b1e1")).intValue() : dp2px(context, f, 0.0f);
    }

    public static int dp2px(Context context, float f, float f2) {
        Object[] objArr = {context, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "864fab42f0afde2a7216e3d0de11b014", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "864fab42f0afde2a7216e3d0de11b014")).intValue();
        }
        if (context == null) {
            return (int) f;
        }
        if (f2 == 0.0f) {
            f2 = context.getResources().getDisplayMetrics().density;
        }
        return Math.round(f * f2);
    }

    public static boolean isValidColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1b3584d853fd2f45f8a981fe8363c14a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1b3584d853fd2f45f8a981fe8363c14a")).booleanValue() : !TextUtils.isEmpty(str) && str.startsWith("#") && (str.length() == 7 || str.length() == 9);
    }

    public static String getFromAssets(Context context, String[] strArr) {
        InputStream inputStream;
        byte[] bArr;
        Object[] objArr = {context, strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b14367e03955f252a1be3e4f60ce646", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b14367e03955f252a1be3e4f60ce646");
        }
        String str = "";
        for (String str2 : strArr) {
            try {
                inputStream = context.getResources().getAssets().open(str2);
                try {
                    try {
                        inputStream.read(new byte[inputStream.available()]);
                        String str3 = str + new String(bArr) + "\n";
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        str = str3;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            } catch (Exception e5) {
                e = e5;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        }
        return str;
    }

    public static PicassoModel valueToModel(Value value) {
        Object[] objArr = {value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd6bfdc43fd903edc34f2e0ca9f13826", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoModel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd6bfdc43fd903edc34f2e0ca9f13826");
        }
        try {
            Unarchived unarchived = value.getUnarchived();
            unarchived.rewind();
            int i = -1;
            if (unarchived.peek() == 79) {
                while (true) {
                    int readMemberHash16 = unarchived.readMemberHash16();
                    if (readMemberHash16 <= 0) {
                        break;
                    } else if (36666 == readMemberHash16) {
                        i = (int) unarchived.readDouble();
                        break;
                    } else {
                        unarchived.skipAny();
                    }
                }
            }
            return (PicassoModel) value.object(PicassoViewWrapperUtil.viewWrapperByType(Integer.valueOf(i)).getDecodingFactory());
        } catch (ArchiveException e) {
            throw b.a(e);
        }
    }

    public static boolean isRectValid(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "463966cd3517d31203f73caeea901080", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "463966cd3517d31203f73caeea901080")).booleanValue() : (rect == null || (rect.left == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0)) ? false : true;
    }

    public static byte[] getNinePatchChunk(int i, int i2, Rect rect) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb9970fe3bced413fd7f1dbe93c6d042", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb9970fe3bced413fd7f1dbe93c6d042");
        }
        if (rect == null) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(rect.left);
        order.putInt(i - rect.right);
        order.putInt(rect.top);
        order.putInt(i2 - rect.bottom);
        for (int i3 = 0; i3 < 9; i3++) {
            order.putInt(1);
        }
        return order.array();
    }

    public static String readAssetFile(Context context, String str) {
        InputStream inputStream;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        InputStream inputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63dc3d7b26a8788b25019d411771fdf2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63dc3d7b26a8788b25019d411771fdf2");
        }
        try {
            try {
                inputStream = context.getResources().getAssets().open(str);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            inputStream = inputStream2;
        }
        try {
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            String str2 = new String(bArr);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return str2;
        } catch (Exception e3) {
            e = e3;
            inputStream2 = inputStream;
            e.printStackTrace();
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                    return "";
                } catch (IOException e4) {
                    e4.printStackTrace();
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static String md5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3f00f877fcc465882f073cf6e57b4a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3f00f877fcc465882f073cf6e57b4a7");
        }
        try {
            return toHex(MessageDigest.getInstance("MD5").digest(str.getBytes("utf-8")));
        } catch (Exception unused) {
            return "";
        }
    }

    private static String toHex(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2b377f1f34275146d11bec2ab48e3793", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2b377f1f34275146d11bec2ab48e3793");
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    @WorkerThread
    public static String reportException(Exception exc, String str, String str2, JSONObject jSONObject) {
        Object[] objArr = {exc, str, str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6158601385061b7c23ed9ec5fcddafa4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6158601385061b7c23ed9ec5fcddafa4") : g.a(exc, str, str2, jSONObject);
    }

    @WorkerThread
    public static String reportException(Exception exc, String str, String str2, JSONObject jSONObject, com.dianping.picassocontroller.vc.b bVar) {
        Object[] objArr = {exc, str, str2, jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb8c80c65de6e346f7c874b15fa8c053", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb8c80c65de6e346f7c874b15fa8c053") : g.a(exc, str, str2, jSONObject, bVar);
    }

    public static void setBackgroundColor(GradientDrawable gradientDrawable, PicassoModel picassoModel) {
        Object[] objArr = {gradientDrawable, picassoModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3eb4cfa90a54274e68c7e51ac1e14de4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3eb4cfa90a54274e68c7e51ac1e14de4");
        } else if (isValidColor(picassoModel.backgroundColor)) {
            gradientDrawable.setColor(Color.parseColor(picassoModel.backgroundColor));
        } else if (isValidColor(picassoModel.startColor) && isValidColor(picassoModel.endColor)) {
            gradientDrawable.setColors(new int[]{Color.parseColor(picassoModel.startColor), Color.parseColor(picassoModel.endColor)});
            if (picassoModel.orientation < 0 || picassoModel.orientation > 7) {
                picassoModel.orientation = 0;
            }
            gradientDrawable.setOrientation(GradientDrawable.Orientation.values()[picassoModel.orientation]);
        } else {
            gradientDrawable.setColor(0);
        }
    }

    public static String getOKString(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "22084d2fde8399d6775aee4a2d087ca8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "22084d2fde8399d6775aee4a2d087ca8") : context.getResources().getString(17039370);
    }

    public static String getCancelString(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "069ae1099947df97a591ef1010e2e823", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "069ae1099947df97a591ef1010e2e823") : context.getResources().getString(17039360);
    }

    @Deprecated
    public static void createViewTree(PicassoModel picassoModel, ViewGroup viewGroup, int i, PicassoView picassoView) {
        BaseViewWrapper viewWrapper;
        Object[] objArr = {picassoModel, viewGroup, Integer.valueOf(i), picassoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "09b9217a37537bf095e81f2c969df034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "09b9217a37537bf095e81f2c969df034");
        } else if (picassoModel == null || (viewWrapper = PicassoViewMap.getViewWrapper(Integer.valueOf(picassoModel.type))) == null) {
        } else {
            if (viewGroup.getChildCount() > i) {
                View childAt = viewGroup.getChildAt(i);
                PicassoModel picassoModel2 = (PicassoModel) childAt.getTag(R.id.id_picasso_model);
                if (picassoModel2 != null && picassoModel2.type == picassoModel.type) {
                    viewWrapper.refreshView(childAt, picassoModel, picassoView);
                    return;
                }
                viewGroup.removeViewAt(i);
                View initView = viewWrapper.initView(viewGroup.getContext(), picassoModel, picassoView);
                viewGroup.addView(initView, i);
                viewWrapper.refreshView(initView, picassoModel, picassoView);
                return;
            }
            View initView2 = viewWrapper.initView(viewGroup.getContext(), picassoModel, picassoView);
            viewGroup.addView(initView2);
            viewWrapper.refreshView(initView2, picassoModel, picassoView);
        }
    }

    @Deprecated
    public static void reUseViewTree(GroupModel groupModel, ViewGroup viewGroup, PicassoView picassoView) {
        Object[] objArr = {groupModel, viewGroup, picassoView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c528212054f4666b31abdf2dc7c04cde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c528212054f4666b31abdf2dc7c04cde");
        } else {
            PicassoRenderEngine.updateViewTree(picassoView, groupModel, viewGroup);
        }
    }

    public static float getStatusbarHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "775698455ae38f9bcc2a34a329669ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "775698455ae38f9bcc2a34a329669ee6")).floatValue();
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return px2dp(context, system.getDimensionPixelSize(identifier));
        }
        return 0.0f;
    }
}
