package com.sankuai.xm.imui.common.util;

import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.AudioMessage;
import com.sankuai.xm.im.message.bean.CustomEmotionMessage;
import com.sankuai.xm.im.message.bean.EmotionMessage;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.im.message.bean.FileMessage;
import com.sankuai.xm.im.message.bean.GPSMessage;
import com.sankuai.xm.im.message.bean.GeneralMessage;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.im.message.bean.TextMessage;
import com.sankuai.xm.im.message.bean.VideoMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.entity.AtInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final int[] b = {1, 2, 3, 4, 6, 7, 8, 11, 12, 17};
    private static final int[] c = {1, 4, 6, 8, 11, 17};

    public static FileMessage a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06555325654b8527c32521185b09dc81", 6917529027641081856L)) {
            return (FileMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06555325654b8527c32521185b09dc81");
        }
        FileMessage fileMessage = new FileMessage();
        fileMessage.setPath(str);
        fileMessage.setName(str2);
        fileMessage.setFormat(str3);
        fileMessage.setOperationType(4);
        return fileMessage;
    }

    public static VideoMessage a(String str, String str2, long j, int i, short s, short s2, long j2) {
        Object[] objArr = {str, str2, new Long(j), Integer.valueOf(i), Short.valueOf(s), Short.valueOf(s2), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7522736431f98c2b37bd2b2aca67a095", 6917529027641081856L)) {
            return (VideoMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7522736431f98c2b37bd2b2aca67a095");
        }
        VideoMessage videoMessage = new VideoMessage();
        videoMessage.setPath(str);
        videoMessage.setScreenshotPath(str2);
        videoMessage.setDuration(i);
        videoMessage.setTimestamp(j);
        videoMessage.setWidth(s);
        videoMessage.setHeight(s2);
        videoMessage.setSize(j2);
        videoMessage.setOperationType(4);
        return videoMessage;
    }

    public static GPSMessage a(double d, double d2, String str, String str2) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a27149e82e9307670f5f0bd3230a807", 6917529027641081856L)) {
            return (GPSMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a27149e82e9307670f5f0bd3230a807");
        }
        GPSMessage gPSMessage = new GPSMessage();
        gPSMessage.setLatitude(d);
        gPSMessage.setLongitude(d2);
        gPSMessage.setName(str);
        gPSMessage.setImgUrl(str2);
        return gPSMessage;
    }

    public static ImageMessage a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af5d879411c7005b5b70bb0f28319d35", 6917529027641081856L)) {
            return (ImageMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af5d879411c7005b5b70bb0f28319d35");
        }
        ImageMessage imageMessage = new ImageMessage();
        imageMessage.setPath(str);
        imageMessage.setUploadOrigin(z);
        imageMessage.setOperationType(4);
        return imageMessage;
    }

    public static EmotionMessage b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8be6bef2cefc9fcf8dccd35d4238b590", 6917529027641081856L)) {
            return (EmotionMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8be6bef2cefc9fcf8dccd35d4238b590");
        }
        EmotionMessage emotionMessage = new EmotionMessage();
        emotionMessage.setGroup(str);
        emotionMessage.setType(str2);
        emotionMessage.setName(str3);
        return emotionMessage;
    }

    public static EmotionMessage a(String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9b27a7c5d1f332a3d289df42d52b4b4", 6917529027641081856L)) {
            return (EmotionMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9b27a7c5d1f332a3d289df42d52b4b4");
        }
        CustomEmotionMessage customEmotionMessage = new CustomEmotionMessage();
        customEmotionMessage.setEmotionFileType("BIG");
        customEmotionMessage.setId(str);
        customEmotionMessage.setPackageId(str2);
        customEmotionMessage.setPackageName(str3);
        customEmotionMessage.setGroup("default");
        customEmotionMessage.setName(str4);
        customEmotionMessage.setType(str5);
        customEmotionMessage.setParams(str6);
        return customEmotionMessage;
    }

    public static TextMessage a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92726e531bd97afd41bee57647357668", 6917529027641081856L)) {
            return (TextMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92726e531bd97afd41bee57647357668");
        }
        TextMessage textMessage = new TextMessage();
        textMessage.setText(str);
        return textMessage;
    }

    public static AudioMessage a(String str, short s, short s2) {
        Object[] objArr = {str, (short) 0, Short.valueOf(s2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab1f69f38118eb9d5e42263040bb287a", 6917529027641081856L)) {
            return (AudioMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab1f69f38118eb9d5e42263040bb287a");
        }
        AudioMessage audioMessage = new AudioMessage();
        audioMessage.setPath(str);
        audioMessage.setDuration(s2);
        audioMessage.setCodec((short) 0);
        audioMessage.setOperationType(4);
        return audioMessage;
    }

    public static EventMessage b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e227ca9b2e3c6d96b72354feed18ba06", 6917529027641081856L)) {
            return (EventMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e227ca9b2e3c6d96b72354feed18ba06");
        }
        EventMessage eventMessage = new EventMessage();
        eventMessage.setText(str);
        return eventMessage;
    }

    public static GeneralMessage a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1101cfe1ac1ed7ccf8d2059deeed0369", 6917529027641081856L) ? (GeneralMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1101cfe1ac1ed7ccf8d2059deeed0369") : a(bArr, 0);
    }

    public static GeneralMessage a(byte[] bArr, int i) {
        Object[] objArr = {bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f0b062067c391404ffe3808a687f6b6", 6917529027641081856L) ? (GeneralMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f0b062067c391404ffe3808a687f6b6") : a(bArr, i, "");
    }

    public static GeneralMessage a(byte[] bArr, int i, String str) {
        Object[] objArr = {bArr, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05cbfa52c709e1341ec49f0cd5429dc4", 6917529027641081856L)) {
            return (GeneralMessage) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05cbfa52c709e1341ec49f0cd5429dc4");
        }
        GeneralMessage generalMessage = new GeneralMessage();
        generalMessage.setData(bArr);
        generalMessage.setType(i);
        generalMessage.setSummary(str);
        return generalMessage;
    }

    public static int[] a() {
        return b;
    }

    public static int[] b() {
        return c;
    }

    public static void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3718f561b8a39fcf3decf35d3eba469", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3718f561b8a39fcf3decf35d3eba469");
            return;
        }
        try {
            String extension = iMMessage.getExtension();
            if (TextUtils.isEmpty(extension)) {
                return;
            }
            Object nextValue = new JSONTokener(extension).nextValue();
            if (!(nextValue instanceof JSONObject)) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "IMKitMessageUtils:cleanAtInfo", new RuntimeException("dirty extension: " + iMMessage.toString()));
                return;
            }
            JSONObject jSONObject = (JSONObject) nextValue;
            jSONObject.remove("at");
            jSONObject.remove("xm_at");
        } catch (Exception e) {
            com.sankuai.xm.monitor.statistics.a.a("imui", "IMKitMessageUtils::cleanAtInfo", e);
            d.a(e, "IMKitMessageUtils:cleanAtInfo", new Object[0]);
        }
    }

    public static boolean b(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12593817c987b5ee037bcdbcbdb32c07", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12593817c987b5ee037bcdbcbdb32c07")).booleanValue() : c(iMMessage) != 0;
    }

    public static int c(IMMessage iMMessage) {
        int i;
        Object nextValue;
        JSONArray optJSONArray;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0417427b4f8327fe75ef850c37508f3f", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0417427b4f8327fe75ef850c37508f3f")).intValue();
        }
        if ((iMMessage instanceof TextMessage) && iMMessage.getCategory() == 2) {
            String extension = iMMessage.getExtension();
            if (TextUtils.isEmpty(extension) || extension.equals("{}")) {
                return 0;
            }
            try {
                nextValue = new JSONTokener(extension).nextValue();
            } catch (Exception e) {
                e = e;
                i = 0;
            }
            if (!(nextValue instanceof JSONObject)) {
                com.sankuai.xm.monitor.statistics.a.a("imui", "IMKitMessageUtils:getAtMeType", new RuntimeException("dirty extension: " + iMMessage.toString()));
                return 0;
            }
            long e2 = IMUIManager.a().e();
            JSONObject jSONObject = (JSONObject) nextValue;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("at");
            JSONArray optJSONArray3 = jSONObject.optJSONArray("xm_at");
            if (optJSONArray3 != null) {
                d.b("IMKitMessageUtils:getAtMeType:: new at.", new Object[0]);
                i = 0;
                for (int i2 = 0; i2 < optJSONArray3.length(); i2++) {
                    try {
                        JSONObject optJSONObject = optJSONArray3.optJSONObject(i2);
                        if (optJSONObject != null && optJSONObject.length() != 0 && (optJSONArray = optJSONObject.optJSONArray("uids")) != null && optJSONArray.length() != 0) {
                            int optInt = optJSONObject.optInt("type", 1);
                            int i3 = i;
                            for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                                try {
                                    long optLong = optJSONArray.optLong(i4, 0L);
                                    if (optLong == -1) {
                                        i3 |= 2;
                                    } else if (optLong == e2) {
                                        i3 |= 1;
                                        if (optInt == 2) {
                                            i3 |= 4;
                                        }
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = i3;
                                }
                            }
                            i = i3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                }
                return i;
            } else if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                return 0;
            } else {
                d.b("IMKitMessageUtils:getAtMeType:: old at.", new Object[0]);
                int i5 = 0;
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    try {
                        long optLong2 = optJSONArray2.optLong(i6, 0L);
                        if (optLong2 == -1) {
                            i5 |= 2;
                        } else if (optLong2 == e2) {
                            i5 |= 1;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        i = i5;
                    }
                }
                return i5;
            }
            com.sankuai.xm.monitor.statistics.a.a("imui", "IMKitMessageUtils::getAtMeType", e);
            d.a(e, "IMKitMessageUtils:getAtMeType", new Object[0]);
            return i;
        }
        return 0;
    }

    public static <T extends IMMessage> T a(T t, List<AtInfo> list, boolean z) {
        int i = 1;
        Object[] objArr = {t, list, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b87917ae230a8dabd319f5bb3dc45b29", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b87917ae230a8dabd319f5bb3dc45b29");
        }
        if (com.sankuai.xm.base.util.b.a(list)) {
            return t;
        }
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = new JSONArray();
        StringBuilder sb = new StringBuilder();
        for (AtInfo atInfo : list) {
            if (atInfo != null) {
                long[] jArr = atInfo.d;
                ArrayList arrayList = new ArrayList();
                if (atInfo.b != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(atInfo.b);
                    arrayList.add(sb2.toString());
                } else if (jArr != null) {
                    for (long j : jArr) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j);
                        arrayList.add(sb3.toString());
                    }
                    i = 2;
                } else {
                    i = 0;
                }
                if (arrayList.size() > 0) {
                    hashSet.addAll(arrayList);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", atInfo.c);
                        jSONObject.put("uids", new JSONArray((Collection) arrayList));
                        jSONObject.put("type", i);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        d.a(e, "obtainTextMessage:: json exception.", new Object[0]);
                        com.sankuai.xm.monitor.statistics.a.a("imui", "InputEditorPlugin::obtainTextMessage", e);
                    }
                    sb.append('@');
                    sb.append(atInfo.c);
                    sb.append(Constants.SPACE);
                }
                i = 1;
            }
        }
        if (jSONArray.length() > 0) {
            hashMap.put("xm_at", jSONArray);
        }
        if (hashSet.size() > 0) {
            hashMap.put("at", new JSONArray((Collection) hashSet));
        }
        t.appendExtension(hashMap);
        return t;
    }
}
