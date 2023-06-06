package com.dianping.titans.ble;

import android.content.Context;
import android.os.ParcelUuid;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BluetoothUtils {
    private static final String TAG = "TitansBle";
    private static final String UUID_SUFFIX = "-0000-1000-8000-00805f9b34fb";
    public static ChangeQuickRedirect changeQuickRedirect;

    private static int getHexNumber(char c) {
        Object[] objArr = {Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a22fd51690a4982d4d1b750a8ecfd813", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a22fd51690a4982d4d1b750a8ecfd813")).intValue() : c > '9' ? (c - 'a') + 10 : c - '0';
    }

    private static int pow(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c84bba7fe0988cfb4b1686b5d5d20f8d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c84bba7fe0988cfb4b1686b5d5d20f8d")).intValue();
        }
        int i3 = i;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 *= i;
        }
        return i3;
    }

    public static List<ParcelUuid> generateUUid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f80f6088cfaf8856fa54795dd6864fd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f80f6088cfaf8856fa54795dd6864fd7");
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = length; i < 38; i++) {
            sb.append("0");
        }
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(length < 10 ? "0" : "");
        sb2.append(length);
        String str2 = sb2.toString() + sb.substring(0, 29) + getSuffixFlag(str);
        String str3 = "00003" + sb.substring(29, 32) + UUID_SUFFIX;
        String str4 = "00006" + sb.substring(32, 35) + UUID_SUFFIX;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ParcelUuid.fromString(substring(str2, 0, 8) + CommonConstant.Symbol.MINUS + substring(str2, 8, 12) + CommonConstant.Symbol.MINUS + substring(str2, 12, 16) + CommonConstant.Symbol.MINUS + substring(str2, 16, 20) + CommonConstant.Symbol.MINUS + substring(str2, 20)));
        arrayList.add(ParcelUuid.fromString(str3));
        arrayList.add(ParcelUuid.fromString(str4));
        arrayList.add(ParcelUuid.fromString("00009" + sb.substring(35, 38) + UUID_SUFFIX));
        return arrayList;
    }

    public static int getSuffixFlag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aa2fe3390b342fd42d468aeadc381fcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aa2fe3390b342fd42d468aeadc381fcf")).intValue();
        }
        char[] charArray = toCharArray(str);
        int length = charArray.length;
        int i = 0;
        int i2 = 1;
        for (int i3 = 0; i3 < length; i3++) {
            i += pow(getHexNumber(get(charArray, i3)), ((i2 * i2) % 3) + 1);
            i2++;
        }
        return i % 10;
    }

    public static char get(char[] cArr, int i) {
        Object[] objArr = {cArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9552a4680969262fb27511078f7923ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Character) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9552a4680969262fb27511078f7923ba")).charValue();
        }
        if (cArr == null || i < 0 || i >= cArr.length) {
            return (char) 0;
        }
        return cArr[i];
    }

    public static String verifyUuid(List<ParcelUuid> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16d7903dfa9b8561db5175004053214f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16d7903dfa9b8561db5175004053214f");
        }
        if (list == null || list.size() != 4) {
            c.a("uuids size check isn't pass", 35, new String[]{"TitansBle"});
            return "";
        }
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ParcelUuid parcelUuid = list.get(i2);
            if (parcelUuid.toString().endsWith(UUID_SUFFIX)) {
                arrayList.add(substring(parcelUuid.toString(), 4, 8));
                i++;
            } else {
                str = parcelUuid.toString().replace(CommonConstant.Symbol.MINUS, "");
            }
        }
        if (i != 3 || str == null) {
            c.a("there isn't a 128bit uuid or three 32bit uuid", 35, new String[]{"TitansBle"});
            return "";
        } else if (((String) arrayList.get(0)).charAt(0) != '3' || ((String) arrayList.get(1)).charAt(0) != '6' || ((String) arrayList.get(2)).charAt(0) != '9') {
            c.a("three 16bit first num isn't right", 35, new String[]{"TitansBle"});
            return "";
        } else {
            int parseInt = parseInt(substring(str, 0, 2));
            int parseInt2 = parseInt(substring(str, 31));
            String str2 = substring(str, 2, 31) + substring((String) arrayList.get(0), 1) + substring((String) arrayList.get(1), 1) + substring((String) arrayList.get(2), 1);
            if (str2.length() < parseInt) {
                c.a("data length isn't right", 35, new String[]{"TitansBle"});
                return "";
            }
            int i3 = 38 - parseInt;
            for (int i4 = 0; i4 < i3; i4++) {
                if (str2.charAt(i4) != '0') {
                    c.a("invalid number", 35, new String[]{"TitansBle"});
                    return "";
                }
            }
            String substring = substring(str2, i3);
            c.a("real content=" + substring, 35, new String[]{"TitansBle"});
            if (getSuffixFlag(substring) != parseInt2) {
                c.a("sum is not right, sum1=" + parseInt2 + "  sum2=" + parseInt, 35, new String[]{"TitansBle"});
                return "";
            }
            return substring;
        }
    }

    public static int parseInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "405e654737b4ef7fdc91664143b40150", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "405e654737b4ef7fdc91664143b40150")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static char[] toCharArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad733ddc4c9b69d24af1116c9a320bc5", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad733ddc4c9b69d24af1116c9a320bc5");
        }
        if (str == null) {
            return "".toCharArray();
        }
        return str.toCharArray();
    }

    public static String substring(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc81c3eba1f3f6604567b522e39b3761", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc81c3eba1f3f6604567b522e39b3761") : (TextUtils.isEmpty(str) || i < 0 || i > str.length()) ? str : str.substring(i);
    }

    public static String substring(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b0b95b33cf5e4e07ae2790baf5e14f7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b0b95b33cf5e4e07ae2790baf5e14f7") : TextUtils.isEmpty(str) ? "" : (i >= 0 && i2 <= str.length() && i2 - i >= 0) ? str.substring(i, i2) : str;
    }

    public static boolean isLocationServiceEnable(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3219e9893829fd2371b2cca1741dbf3a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3219e9893829fd2371b2cca1741dbf3a")).booleanValue() : BlueToothProvider.isLocationServiceEnable(context, str);
    }

    public static boolean hasBLESystemFeature(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "47b65df25500bdee60269eb1c95d8aa9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "47b65df25500bdee60269eb1c95d8aa9")).booleanValue() : BlueToothProvider.hasBLESystemFeature(context);
    }

    public static boolean isBluetoothServiceEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a62d17860566834c846c7156ce04ce0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a62d17860566834c846c7156ce04ce0")).booleanValue() : BlueToothProvider.isBluetoothServiceEnable(str);
    }

    @RequiresApi(api = 21)
    public static boolean isSupportBleAdvertising(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ab6690f217984c16c5692a828e5bde3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ab6690f217984c16c5692a828e5bde3")).booleanValue() : BlueToothProvider.isSupportBleAdvertising(str);
    }

    @RequiresApi(api = 21)
    public static boolean isSupportBleScan(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "99bb0e3c2ac4dc5708a43e3e1ef912de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "99bb0e3c2ac4dc5708a43e3e1ef912de")).booleanValue() : BlueToothProvider.isSupportBleScan(str);
    }
}
