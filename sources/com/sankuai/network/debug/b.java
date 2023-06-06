package com.sankuai.network.debug;

import com.dianping.archive.DPObject;
import com.dianping.util.h;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopStartRadius;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(DPObject dPObject) {
        byte[] bArr;
        String str;
        Object[] objArr = {dPObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89e8e016c215a4d3debabc385506a0eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89e8e016c215a4d3debabc385506a0eb");
        }
        if (dPObject == null) {
            return null;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = DPObject.a;
        if (PatchProxy.isSupport(objArr2, dPObject, changeQuickRedirect2, false, "2d756d2455e2a787a4f418fe217f42c4", 6917529027641081856L)) {
            bArr = (byte[]) PatchProxy.accessDispatch(objArr2, dPObject, changeQuickRedirect2, false, "2d756d2455e2a787a4f418fe217f42c4");
        } else {
            int c = dPObject.c();
            if (c > 0) {
                byte[] bArr2 = new byte[c];
                System.arraycopy(dPObject.c, dPObject.d, bArr2, 0, c);
                bArr = bArr2;
            } else {
                bArr = new byte[]{79, 0, 0, 90};
            }
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        long currentTimeMillis = System.currentTimeMillis();
        h.b("ModelHelper", "Converting>>>in JVM");
        h.b("ModelHelper", "Start@" + currentTimeMillis);
        if (wrap.remaining() > 3) {
            byte b = wrap.get();
            String a2 = a(wrap.getShort());
            JSONObject jSONObject = new JSONObject();
            try {
                if (b == 83) {
                    a(wrap, a2, jSONObject);
                    str = jSONObject.toString();
                } else if (b == 79) {
                    b(wrap, a2, jSONObject);
                    str = jSONObject.get(a2).toString();
                } else if (b == 65) {
                    c(wrap, a2, jSONObject);
                    str2 = jSONObject.get(a2).toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            h.b("ModelHelper", "End@" + currentTimeMillis2);
            h.c("ModelHelper", "All Takes " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            return str;
        }
        str = str2;
        long currentTimeMillis22 = System.currentTimeMillis();
        h.b("ModelHelper", "End@" + currentTimeMillis22);
        h.c("ModelHelper", "All Takes " + (currentTimeMillis22 - currentTimeMillis) + " ms");
        return str;
    }

    private static int a(ByteBuffer byteBuffer, String str, Object obj) throws JSONException {
        int i;
        Object[] objArr = {byteBuffer, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f22ae68de95ef5b38a134cabbbad327", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f22ae68de95ef5b38a134cabbbad327")).intValue();
        }
        if (byteBuffer.remaining() >= 2 && byteBuffer.remaining() >= (i = byteBuffer.getShort() & ISelectionInterface.HELD_NOTHING)) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            try {
                String str2 = new String(bArr, "UTF-8");
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).put(str, str2);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).put(str2);
                }
                return 0;
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return -2;
            }
        }
        return -1;
    }

    private static int b(ByteBuffer byteBuffer, String str, Object obj) throws JSONException {
        Object[] objArr = {byteBuffer, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a70406516f5da448fbdc3ec6dc3063a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a70406516f5da448fbdc3ec6dc3063a")).intValue();
        }
        if (byteBuffer.remaining() < 2) {
            return -1;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__name", str);
        if (obj instanceof JSONObject) {
            ((JSONObject) obj).put(str, jSONObject);
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).put(jSONObject);
        }
        while (byteBuffer.remaining() > 0) {
            byte b = byteBuffer.get();
            if (b != 77) {
                return b == 90 ? 0 : -2;
            } else if (byteBuffer.remaining() < 2) {
                return -1;
            } else {
                int d = d(byteBuffer, a(byteBuffer.getShort()), jSONObject);
                if (d != 0) {
                    return d;
                }
            }
        }
        return -1;
    }

    private static int c(ByteBuffer byteBuffer, String str, Object obj) throws JSONException {
        Object[] objArr = {byteBuffer, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fa777469a8b640234b0340c503787ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fa777469a8b640234b0340c503787ea")).intValue();
        }
        if (byteBuffer.remaining() < 2) {
            return -1;
        }
        JSONArray jSONArray = new JSONArray();
        if (obj instanceof JSONObject) {
            ((JSONObject) obj).put(str, jSONArray);
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).put(jSONArray);
        }
        int i = byteBuffer.getShort() & ISelectionInterface.HELD_NOTHING;
        for (int i2 = 0; i2 < i; i2++) {
            int d = d(byteBuffer, str, jSONArray);
            if (d != 0) {
                return d;
            }
        }
        return 0;
    }

    private static int d(ByteBuffer byteBuffer, String str, Object obj) throws JSONException {
        Object[] objArr = {byteBuffer, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a6a629a025e026e74b99fdd954a897c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a6a629a025e026e74b99fdd954a897c")).intValue();
        }
        if (byteBuffer.remaining() == 0) {
            return -1;
        }
        byte b = byteBuffer.get();
        if (b != 65) {
            if (b == 68) {
                if (byteBuffer.remaining() < 8) {
                    return -1;
                }
                double d = byteBuffer.getDouble();
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).put(str, d);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).put(d);
                }
                return 0;
            } else if (b != 70) {
                if (b != 73) {
                    if (b == 76) {
                        if (byteBuffer.remaining() < 8) {
                            return -1;
                        }
                        long j = byteBuffer.getLong();
                        if (obj instanceof JSONObject) {
                            ((JSONObject) obj).put(str, j);
                        } else if (obj instanceof JSONArray) {
                            ((JSONArray) obj).put(j);
                        }
                        return 0;
                    }
                    switch (b) {
                        case 78:
                            return 0;
                        case 79:
                            return b(byteBuffer, a(byteBuffer.getShort()), obj);
                        default:
                            switch (b) {
                                case BorderTopLeftRadius.INDEX_ID /* 83 */:
                                    return a(byteBuffer, str, obj);
                                case 84:
                                    if (obj instanceof JSONObject) {
                                        ((JSONObject) obj).put(str, true);
                                    } else if (obj instanceof JSONArray) {
                                        ((JSONArray) obj).put(true);
                                    }
                                    return 0;
                                case BorderTopStartRadius.INDEX_ID /* 85 */:
                                    break;
                                default:
                                    return -2;
                            }
                    }
                }
                if (byteBuffer.remaining() < 4) {
                    return -1;
                }
                int i = byteBuffer.getInt();
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).put(str, i);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).put(i);
                }
                return 0;
            } else {
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).put(str, false);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).put(false);
                }
                return 0;
            }
        }
        return c(byteBuffer, str, obj);
    }

    private static String a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fbfcb02d3a3bc5d1427e029ac5904d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fbfcb02d3a3bc5d1427e029ac5904d6");
        }
        return "0x" + Integer.toHexString(s & ISelectionInterface.HELD_NOTHING);
    }
}
