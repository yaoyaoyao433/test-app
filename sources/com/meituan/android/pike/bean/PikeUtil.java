package com.meituan.android.pike.bean;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PikeUtil {
    public static final int NETWORN_2G = 2;
    public static final int NETWORN_3G = 3;
    public static final int NETWORN_4G = 4;
    public static final int NETWORN_MOBILE = 5;
    public static final int NETWORN_NONE = 0;
    public static final int NETWORN_WIFI = 1;
    private static final String TAG = "PikeUtil";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int getNetworkState(Context context) {
        NetworkInfo activeNetworkInfo;
        NetworkInfo.State state;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1b1030629e181c551392ad2cde92303", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1b1030629e181c551392ad2cde92303")).intValue();
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
            return 0;
        }
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
        if (networkInfo == null || (state = networkInfo.getState()) == null || !(state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
            if (networkInfo2 != null) {
                NetworkInfo.State state2 = networkInfo2.getState();
                String subtypeName = networkInfo2.getSubtypeName();
                if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            return 3;
                        case 13:
                            return 4;
                        default:
                            return (subtypeName.equalsIgnoreCase(MTCellInfo.TYPE_TDSCDMA) || subtypeName.equalsIgnoreCase(MTCellInfo.TYPE_WCDMA) || subtypeName.equalsIgnoreCase("CDMA2000")) ? 3 : 5;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public static String getSigture(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db2cb4152aa9f5eadbcffde5f471f26d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db2cb4152aa9f5eadbcffde5f471f26d");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String encodeToString = Base64.encodeToString(messageDigest.digest((str + str2 + str3 + str4).getBytes(Charset.forName("utf-8"))), 2);
            StringBuilder sb = new StringBuilder("getSigture");
            sb.append(encodeToString);
            PikeLog.d(TAG, sb.toString());
            return encodeToString;
        } catch (Exception e) {
            PikeLog.e(TAG, "GetSigture is " + e.toString());
            return "";
        }
    }

    public static String getToken(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "052de4fbcdecf4bcd70c517eb94ee316", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "052de4fbcdecf4bcd70c517eb94ee316");
        }
        String str = (String) PikeSharedPreference.get(context, "token", "");
        if (TextUtils.isEmpty(str)) {
            PikeLog.e(TAG, "GetToken with null");
            return "";
        }
        return str;
    }
}
