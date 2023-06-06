package com.meituan.android.common.statistics.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.c;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.neohybrid.neo.bridge.presenter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ABCHelper {
    private static final String CHAR = "0123456789ABCDEF";
    private static final String EVS_KEY = "evs.";
    private static final String EVS_LAT = "evs.lat";
    private static final String EVS_LNG = "evs.lng";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final String enc_key = "&\";/(=')564XEqc$D7PBYZ>W_:owNi^~0R*.yQp+hs<G|OjzFmH@MAK3JV[\\]SUL9b?C1fIa`Tl,xnv%erktugd8!-{#}2";
    private static final String ALG = "A#E#S".replace("#", "");
    private static final String TRANSFORM = "A-E-S/E-C-B/P-K-C-S5P-addi-ng".replace(CommonConstant.Symbol.MINUS, "");
    private static final byte[] ABC = {61, -6, -111, -124, 6, 99, -36, 49, -46, -68, -18, -35, 25, -53, 5, -34};
    private static final KeyWordBean[] KEY_WORDS = {new KeyWordBean("mac", 1), new KeyWordBean("imei", 2), new KeyWordBean("imei2", 2), new KeyWordBean("did", 2), new KeyWordBean(Constants.Environment.KEY_IMSI, 3), new KeyWordBean("lat", 4), new KeyWordBean(Constants.PRIVACY.KEY_LATITUDE, 4), new KeyWordBean("lng", 5), new KeyWordBean(Constants.PRIVACY.KEY_LONGITUDE, 5), new KeyWordBean("android_id", 6), new KeyWordBean(Constants.Environment.KEY_IDFA, 7), new KeyWordBean(Constants.Environment.KEY_IDFV, 8), new KeyWordBean("meid", 9), new KeyWordBean(Constants.PRIVACY.KEY_SSID, 10), new KeyWordBean(Constants.Environment.KEY_BSSID, 10)};
    private static final KeyWordBean[] FUZZY_KEY_WORDS = {new KeyWordBean(Constants.PRIVACY.KEY_FUZZY_LAT, 4), new KeyWordBean(Constants.PRIVACY.KEY_FUZZY_LATITUDE, 4), new KeyWordBean(Constants.PRIVACY.KEY_FUZZY_LNG, 5), new KeyWordBean(Constants.PRIVACY.KEY_FUZZY_LONGITUDE, 5)};
    private static final String[] WHITE_KEY = {"mt_aurl", "url", "refer_url"};

    public static String encrypt(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "219a2e9cff860e0cda467a1845c51921", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "219a2e9cff860e0cda467a1845c51921") : byte2String(encrypt(str.getBytes()));
    }

    public static String decrypt(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7dd6f102491adc05c7b4f3c1ca627292", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7dd6f102491adc05c7b4f3c1ca627292") : new String(decrypt(string2Byte(str)));
    }

    public static void process(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7e717dbb3404166023950d0376067ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7e717dbb3404166023950d0376067ff");
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("a" + System.currentTimeMillis(), System.currentTimeMillis());
        } catch (Exception unused) {
        }
        try {
            jSONObject2.put("android_id", jSONObject.opt("android_id"));
            jSONObject.remove("android_id");
        } catch (Exception unused2) {
        }
        try {
            jSONObject2.put("did", jSONObject.opt("did"));
            jSONObject.remove("did");
        } catch (Exception unused3) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_BSSID, jSONObject.opt(Constants.Environment.KEY_BSSID));
            jSONObject.remove(Constants.Environment.KEY_BSSID);
        } catch (Exception unused4) {
        }
        try {
            jSONObject2.put("mac", jSONObject.opt("mac"));
            jSONObject.remove("mac");
        } catch (Exception unused5) {
        }
        try {
            jSONObject2.put("imei", jSONObject.opt("imei"));
            jSONObject.remove("imei");
        } catch (Exception unused6) {
        }
        try {
            jSONObject2.put("imei2", jSONObject.opt("imei2"));
            jSONObject.remove("imei2");
        } catch (Exception unused7) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_IMSI, jSONObject.opt(Constants.Environment.KEY_IMSI));
            jSONObject.remove(Constants.Environment.KEY_IMSI);
        } catch (Exception unused8) {
        }
        try {
            jSONObject2.put("meid", jSONObject.opt("meid"));
            jSONObject.remove("meid");
        } catch (Exception unused9) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_SERIAL_NUMBER, jSONObject.opt(Constants.Environment.KEY_SERIAL_NUMBER));
            jSONObject.remove(Constants.Environment.KEY_SERIAL_NUMBER);
        } catch (Exception unused10) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_APN, jSONObject.opt(Constants.Environment.KEY_APN));
            jSONObject.remove(Constants.Environment.KEY_APN);
        } catch (Exception unused11) {
        }
        try {
            jSONObject2.put("net", jSONObject.opt("net"));
            jSONObject.remove("net");
        } catch (Exception unused12) {
        }
        try {
            jSONObject2.put("wifi", jSONObject.opt("wifi"));
            jSONObject.remove("wifi");
        } catch (Exception unused13) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_MNO, jSONObject.opt(Constants.Environment.KEY_MNO));
            jSONObject.remove(Constants.Environment.KEY_MNO);
        } catch (Exception unused14) {
        }
        try {
            jSONObject2.put("oaid", jSONObject.opt("oaid"));
            jSONObject.remove("oaid");
        } catch (Exception unused15) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_ICCID, jSONObject.opt(Constants.Environment.KEY_ICCID));
            jSONObject.remove(Constants.Environment.KEY_ICCID);
        } catch (Exception unused16) {
        }
        try {
            jSONObject2.put("uuid", jSONObject.opt("uuid"));
        } catch (Exception unused17) {
        }
        try {
            jSONObject2.put("dpid", jSONObject.opt("dpid"));
        } catch (Exception unused18) {
        }
        try {
            jSONObject2.put(Constants.Environment.KEY_UNION_ID, jSONObject.opt(Constants.Environment.KEY_UNION_ID));
        } catch (Exception unused19) {
        }
        try {
            if (jSONObject.opt(Constants.Reporter.KEY_PACKAGE_TM) != null) {
                jSONObject2.put(Constants.Reporter.KEY_PACKAGE_TM, jSONObject.opt(Constants.Reporter.KEY_PACKAGE_TM));
            }
        } catch (Exception unused20) {
        }
        try {
            jSONObject.put("checksum", encrypt(jSONObject2.toString()));
        } catch (Exception unused21) {
        }
    }

    private static byte[] encrypt(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1bd0be962a397fa44b9bead29918b584", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1bd0be962a397fa44b9bead29918b584");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(ABC, ALG);
        Cipher cipher = Cipher.getInstance(TRANSFORM);
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    private static byte[] decrypt(byte[] bArr) throws Exception {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac2d8b7b7f36246db0bc40f71acf5518", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac2d8b7b7f36246db0bc40f71acf5518");
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(ABC, ALG);
        Cipher cipher = Cipher.getInstance(TRANSFORM);
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr);
    }

    private static String byte2String(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fda4d15a83b88232312b9637421fdad", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fda4d15a83b88232312b9637421fdad");
        }
        if (bArr == null) {
            return null;
        }
        char[] charArray = CHAR.toCharArray();
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr[i] = charArray[(b >>> 4) & 15];
            i = i2 + 1;
            cArr[i2] = charArray[b & 15];
        }
        return new String(cArr);
    }

    private static byte[] string2Byte(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d2355b3276b98f6ed62c993e873cb11", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d2355b3276b98f6ed62c993e873cb11");
        }
        byte[] bArr = new byte[str.length() / 2];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (((CHAR.indexOf(charArray[i2]) << 4) + CHAR.indexOf(charArray[i2 + 1])) & 255);
        }
        return bArr;
    }

    public static void processLatLngQuickReport(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "03f5adff019a85defb4866aceaff1906", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "03f5adff019a85defb4866aceaff1906");
        } else {
            processLatLng(jSONObject, (String) jSONObject.opt(EVS_LAT), (String) jSONObject.opt(EVS_LNG), true);
        }
    }

    public static void processLatLng(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fbf93a328ea817fa02c3d4bb4cc0226", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fbf93a328ea817fa02c3d4bb4cc0226");
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    processLatLng(jSONObject, (String) jSONObject.opt("lat"), (String) jSONObject.opt("lng"), false);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static void processLatLng(JSONObject jSONObject, String str, String str2, boolean z) {
        int i;
        int i2 = 0;
        Object[] objArr = {jSONObject, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c3c0f98475a2fc03ead4f76751c979a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c3c0f98475a2fc03ead4f76751c979a");
        } else if (!z && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && jSONObject.has("ji") && jSONObject.has("jf") && jSONObject.has("wi") && jSONObject.has("wf")) {
        } else {
            String str3 = "";
            String str4 = "";
            if (TextUtils.isEmpty(str2)) {
                i = 0;
            } else {
                String[] split = str2.split("\\.");
                try {
                    i = Integer.parseInt(split[0]) * 777;
                } catch (Exception unused) {
                    i = 0;
                }
                try {
                    str3 = split[1].replace("2", "b").replace("4", "d").replace("6", "f");
                } catch (Exception unused2) {
                }
                String[] split2 = str.split("\\.");
                try {
                    i2 = Integer.parseInt(split2[0]) * 999;
                } catch (Exception unused3) {
                }
                try {
                    str4 = split2[1].replace("3", c.a).replace("7", g.n).replace("9", "i");
                } catch (Exception unused4) {
                }
            }
            if (z) {
                try {
                    jSONObject.put("evs.ji", i);
                } catch (Exception unused5) {
                }
                try {
                    jSONObject.put("evs.jf", str3);
                } catch (Exception unused6) {
                }
                try {
                    jSONObject.put("evs.wi", i2);
                } catch (Exception unused7) {
                }
                try {
                    jSONObject.put("evs.wf", str4);
                } catch (Exception unused8) {
                }
                jSONObject.remove(EVS_LAT);
                jSONObject.remove(EVS_LNG);
                return;
            }
            try {
                jSONObject.put("ji", i);
            } catch (Exception unused9) {
            }
            try {
                jSONObject.put("jf", str3);
            } catch (Exception unused10) {
            }
            try {
                jSONObject.put("wi", i2);
            } catch (Exception unused11) {
            }
            try {
                jSONObject.put("wf", str4);
            } catch (Exception unused12) {
            }
            jSONObject.remove("lat");
            jSONObject.remove("lng");
        }
    }

    public static JSONObject checkJsonObject(JSONObject jSONObject, int i) throws JSONException {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af555b1b9e137c76e9d63fe83e91f95a", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af555b1b9e137c76e9d63fe83e91f95a");
        }
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        return traverse(jSONObject, i);
    }

    public static String checkUtmChild(String str) {
        DefaultEnvironment defaultEnvironment;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f320022df1e87bdc4cdff9281ca1b046", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f320022df1e87bdc4cdff9281ca1b046");
        }
        if (!TextUtils.isEmpty(str) && Statistics.getContext() != null && (defaultEnvironment = Statistics.getDefaultEnvironment()) != null && defaultEnvironment.getEnvironment() != null) {
            Map<String, String> environment = defaultEnvironment.getEnvironment();
            if (fuzzyMatchSpecificWord(str, environment.get("imei")) || fuzzyMatchSpecificWord(str, environment.get("imei2")) || fuzzyMatchSpecificWord(str, environment.get(Constants.Environment.KEY_IMSI)) || fuzzyMatchSpecificWord(str, environment.get("did")) || fuzzyMatchSpecificWord(str, environment.get("meid")) || fuzzyMatchLat(str) || fuzzyMatchLng(str)) {
                return "hit";
            }
        }
        return str;
    }

    private static boolean inWhite(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c8715f602b70f5f1c1729e8ea3fe206", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c8715f602b70f5f1c1729e8ea3fe206")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : WHITE_KEY) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private static JSONObject traverse(JSONObject jSONObject, int i) throws JSONException {
        Object[] objArr = {jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36650cda89ab8e9fbe5de63abdb02949", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36650cda89ab8e9fbe5de63abdb02949");
        }
        if (i <= 0) {
            return new JSONObject(jSONObject.toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (inWhite(next)) {
                jSONObject2.put(next, obj);
            } else if (!matchKeyWord(next, jSONArray)) {
                if (obj instanceof JSONObject) {
                    jSONObject2.put(next, traverse((JSONObject) obj, i - 1));
                } else if (!fuzzyMatchKeyWord(obj.toString(), jSONArray)) {
                    jSONObject2.put(next, obj);
                }
            }
        }
        if (jSONArray.length() > 0) {
            jSONObject2.put("hit_1", jSONArray);
        }
        return jSONObject2;
    }

    private static boolean matchKeyWord(String str, JSONArray jSONArray) {
        KeyWordBean[] keyWordBeanArr;
        KeyWordBean[] keyWordBeanArr2;
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "154b1d1065116674b2e0873c0c0bbe2e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "154b1d1065116674b2e0873c0c0bbe2e")).booleanValue();
        }
        for (KeyWordBean keyWordBean : KEY_WORDS) {
            if (str.equalsIgnoreCase(keyWordBean.keyWord)) {
                jSONArray.put(keyWordBean.index);
                return true;
            }
        }
        for (KeyWordBean keyWordBean2 : FUZZY_KEY_WORDS) {
            if (str.toLowerCase().contains(keyWordBean2.keyWord)) {
                jSONArray.put(keyWordBean2.index);
                return true;
            }
        }
        return false;
    }

    private static boolean fuzzyMatchLat(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27de7430db7674d724fc3eb45c34c8a3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27de7430db7674d724fc3eb45c34c8a3")).booleanValue();
        }
        Map<String, String> customEnvironment = Statistics.getCustomEnvironment();
        if (customEnvironment != null) {
            String str2 = customEnvironment.get("lat");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    int indexOf = str2.indexOf(CommonConstant.Symbol.DOT);
                    if (indexOf != -1 && str2.length() > indexOf + 3) {
                        if (str.contains(str2.substring(0, indexOf + 4))) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    private static boolean fuzzyMatchLng(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1bb1815cad6cfc11734254e48b7e8cf", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1bb1815cad6cfc11734254e48b7e8cf")).booleanValue();
        }
        Map<String, String> customEnvironment = Statistics.getCustomEnvironment();
        if (customEnvironment != null) {
            String str2 = customEnvironment.get("lng");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    int indexOf = str2.indexOf(CommonConstant.Symbol.DOT);
                    if (indexOf != -1 && str2.length() > indexOf + 3) {
                        if (str.contains(str2.substring(0, indexOf + 4))) {
                            return true;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    private static boolean fuzzyMatchSpecificWord(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4620d0ff98b36e4c5444ae1c4647a02f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4620d0ff98b36e4c5444ae1c4647a02f")).booleanValue() : (TextUtils.isEmpty(str2) || "unknown".equalsIgnoreCase(str2) || !str.toLowerCase().contains(str2.toLowerCase())) ? false : true;
    }

    private static boolean fuzzyMatchKeyWord(String str, JSONArray jSONArray) {
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "618006bfc444b003165d3c807a9d5259", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "618006bfc444b003165d3c807a9d5259")).booleanValue();
        }
        DefaultEnvironment defaultEnvironment = Statistics.getDefaultEnvironment();
        if (defaultEnvironment != null && defaultEnvironment.getEnvironment() != null) {
            Map<String, String> environment = defaultEnvironment.getEnvironment();
            if (fuzzyMatchSpecificWord(str, environment.get("mac"))) {
                jSONArray.put(1);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get("imei"))) {
                jSONArray.put(2);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get("imei2"))) {
                jSONArray.put(2);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get("did"))) {
                jSONArray.put(2);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get(Constants.Environment.KEY_IMSI))) {
                jSONArray.put(3);
                return true;
            } else if (fuzzyMatchLat(str)) {
                jSONArray.put(4);
                return true;
            } else if (fuzzyMatchLng(str)) {
                jSONArray.put(5);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get("android_id"))) {
                jSONArray.put(6);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get("meid"))) {
                jSONArray.put(9);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get(Constants.Environment.KEY_BSSID))) {
                jSONArray.put(10);
                return true;
            } else if (fuzzyMatchSpecificWord(str, environment.get(Constants.Environment.KEY_SERIAL_NUMBER))) {
                jSONArray.put(11);
                return true;
            } else {
                return false;
            }
        }
        return fuzzyMatchDefaultKeyWord(str, jSONArray);
    }

    private static boolean fuzzyMatchDefaultKeyWord(String str, JSONArray jSONArray) {
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8411445fcb90ad19a2b1deba5c5bf141", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8411445fcb90ad19a2b1deba5c5bf141")).booleanValue();
        }
        Context context = Statistics.getContext();
        if (fuzzyMatchSpecificWord(str, NetworkUtils.mac(context))) {
            jSONArray.put(1);
            return true;
        } else if (fuzzyMatchSpecificWord(str, AppUtil.getIMEI(context))) {
            jSONArray.put(2);
            return true;
        } else if (fuzzyMatchSpecificWord(str, AppUtil.getIMEI2(context))) {
            jSONArray.put(2);
            return true;
        } else if (fuzzyMatchSpecificWord(str, AppUtil.getDeviceId(context))) {
            jSONArray.put(2);
            return true;
        } else if (fuzzyMatchSpecificWord(str, AppUtil.getIMSI(context))) {
            jSONArray.put(3);
            return true;
        } else if (fuzzyMatchLat(str)) {
            jSONArray.put(4);
            return true;
        } else if (fuzzyMatchLng(str)) {
            jSONArray.put(5);
            return true;
        } else if (fuzzyMatchSpecificWord(str, AppUtil.getAndroidId(context))) {
            jSONArray.put(6);
            return true;
        } else if (fuzzyMatchSpecificWord(str, AppUtil.getMEID(context))) {
            jSONArray.put(9);
            return true;
        } else if (fuzzyMatchSpecificWord(str, NetworkUtils.getBSSID(context))) {
            jSONArray.put(10);
            return true;
        } else if (fuzzyMatchSpecificWord(str, com.meituan.android.common.unionid.oneid.util.AppUtil.getSerial(context))) {
            jSONArray.put(11);
            return true;
        } else {
            return false;
        }
    }

    public static String encHReport(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7626e550f6b8af3f33eaf95eb1903762", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7626e550f6b8af3f33eaf95eb1903762");
        }
        if (jSONObject == null) {
            return "";
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (jSONObject.opt(next) != null) {
                    String obj = jSONObject.opt(next).toString();
                    if (next.contains(EVS_KEY)) {
                        jSONObject2.put(next, enc(obj));
                    } else {
                        jSONObject2.put(next, obj);
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2.toString();
    }

    public static String enc(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8eadc3549c36833ae45e0e8c444c0640", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8eadc3549c36833ae45e0e8c444c0640");
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= '~' && charAt >= '!') {
                sb.append(enc_key.charAt(charAt - '!'));
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class KeyWordBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int index;
        public String keyWord;

        public KeyWordBean(String str, int i) {
            this.keyWord = str;
            this.index = i;
        }
    }
}
