package com.dianping.shield.dynamic.utils;

import com.dianping.agentsdk.framework.ar;
import com.dianping.archive.DPObject;
import com.dianping.archive.a;
import com.dianping.archive.c;
import com.dianping.model.BasicModel;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMWhiteBoardUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static HashMap dpObjectToHashMap(DPObject dPObject, c<? extends BasicModel> cVar) {
        Object[] objArr = {dPObject, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1b7704f8b00f79030437c64d9fbe79c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1b7704f8b00f79030437c64d9fbe79c");
        }
        try {
            return (HashMap) new Gson().fromJson(((BasicModel) dPObject.a(cVar)).a(), (Class<Object>) HashMap.class);
        } catch (a e) {
            e.printStackTrace();
            return null;
        }
    }

    public static HashMap modelToHashMap(BasicModel basicModel) {
        Object[] objArr = {basicModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "38673b04a43c47697f9d558d524a4950", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "38673b04a43c47697f9d558d524a4950") : (HashMap) new Gson().fromJson(basicModel.a(), (Class<Object>) HashMap.class);
    }

    public static Object adaptWhiteBoardToJS(Object obj) {
        int i = 0;
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2865e2ba2dd146c783247a803c8905bf", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2865e2ba2dd146c783247a803c8905bf");
        }
        JSONArray jSONArray = new JSONArray();
        if (obj instanceof HashMap) {
            try {
                return new JSONObject(new Gson().toJson(obj));
            } catch (JSONException unused) {
                return obj;
            }
        }
        if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            while (i < strArr.length) {
                jSONArray.put(strArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            while (i < zArr.length) {
                jSONArray.put(Boolean.valueOf(zArr[i]));
                i++;
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i < iArr.length) {
                jSONArray.put(Integer.valueOf(iArr[i]));
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i < dArr.length) {
                jSONArray.put(Double.valueOf(dArr[i]));
                i++;
            }
        } else if (!(obj instanceof ArrayList)) {
            return obj;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.size() <= 0 || !(arrayList.get(0) instanceof HashMap)) {
                return obj;
            }
            while (i < arrayList.size()) {
                try {
                    obj = new JSONObject(new Gson().toJson((HashMap) arrayList.get(i)));
                } catch (JSONException unused2) {
                }
                jSONArray.put(obj);
                i++;
            }
        }
        return jSONArray;
    }

    public static void putObjectToWhiteBoard(ar arVar, String str, Object obj) {
        int i = 0;
        Object[] objArr = {arVar, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "063c0b0ba4fd74462002f827e0ab8391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "063c0b0ba4fd74462002f827e0ab8391");
        } else if (str == null || obj == null) {
        } else {
            if (obj instanceof JSONObject) {
                arVar.a(str, (Serializable) new Gson().fromJson(obj.toString(), (Class<Object>) HashMap.class));
            } else if (obj instanceof String) {
                arVar.a(str, (String) obj);
            } else if (obj instanceof Boolean) {
                arVar.a(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                arVar.a(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                arVar.a(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                arVar.a(str, ((Float) obj).floatValue());
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                try {
                    if (jSONArray.length() > 0) {
                        if (jSONArray.get(0) instanceof String) {
                            String[] strArr = new String[jSONArray.length()];
                            while (i < jSONArray.length()) {
                                strArr[i] = jSONArray.getString(i);
                                i++;
                            }
                            arVar.a(str, strArr);
                            return;
                        } else if (jSONArray.get(0) instanceof Boolean) {
                            boolean[] zArr = new boolean[jSONArray.length()];
                            while (i < jSONArray.length()) {
                                zArr[i] = jSONArray.getBoolean(i);
                                i++;
                            }
                            arVar.a(str, zArr);
                            return;
                        } else if (jSONArray.get(0) instanceof Integer) {
                            int[] iArr = new int[jSONArray.length()];
                            while (i < jSONArray.length()) {
                                iArr[i] = jSONArray.getInt(i);
                                i++;
                            }
                            arVar.a(str, iArr);
                            return;
                        } else if (jSONArray.get(0) instanceof Double) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < jSONArray.length()) {
                                dArr[i] = jSONArray.getDouble(i);
                                i++;
                            }
                            arVar.a(str, dArr);
                            return;
                        } else if (((JSONArray) obj).get(0) instanceof JSONObject) {
                            if (str.endsWith(":forceToString")) {
                                arVar.a(str.substring(0, str.indexOf(":forceToString")), (Serializable) obj.toString());
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            Gson gson = new Gson();
                            while (i < jSONArray.length()) {
                                arrayList.add(gson.fromJson(((JSONObject) jSONArray.get(i)).toString(), (Class<Object>) HashMap.class));
                                i++;
                            }
                            arVar.a(str, (Serializable) arrayList);
                            return;
                        } else {
                            arVar.a(str, obj.toString());
                            return;
                        }
                    }
                    arVar.a(str, new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void putMrnObjectToWhiteBoard(ar arVar, String str, Object obj) {
        int i = 0;
        Object[] objArr = {arVar, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13c5da4d1ed03883444292ddf4243c51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13c5da4d1ed03883444292ddf4243c51");
        } else if (str == null || obj == null) {
        } else {
            if (obj instanceof HashMap) {
                arVar.a(str, (Serializable) ((HashMap) obj));
            } else if (obj instanceof String) {
                arVar.a(str, (String) obj);
            } else if (obj instanceof Boolean) {
                arVar.a(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                arVar.a(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                arVar.a(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Float) {
                arVar.a(str, ((Float) obj).floatValue());
            } else if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                try {
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) instanceof String) {
                            String[] strArr = new String[arrayList.size()];
                            while (i < arrayList.size()) {
                                strArr[i] = (String) arrayList.get(i);
                                i++;
                            }
                            arVar.a(str, strArr);
                            return;
                        } else if (arrayList.get(0) instanceof Boolean) {
                            boolean[] zArr = new boolean[arrayList.size()];
                            while (i < arrayList.size()) {
                                zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                                i++;
                            }
                            arVar.a(str, zArr);
                            return;
                        } else if (arrayList.get(0) instanceof Integer) {
                            int[] iArr = new int[arrayList.size()];
                            while (i < arrayList.size()) {
                                iArr[i] = ((Integer) arrayList.get(i)).intValue();
                                i++;
                            }
                            arVar.a(str, iArr);
                            return;
                        } else if (arrayList.get(0) instanceof Double) {
                            double[] dArr = new double[arrayList.size()];
                            while (i < arrayList.size()) {
                                dArr[i] = ((Double) arrayList.get(i)).doubleValue();
                                i++;
                            }
                            arVar.a(str, dArr);
                            return;
                        } else if (((ArrayList) obj).get(0) instanceof HashMap) {
                            arVar.a(str, (Serializable) ((ArrayList) obj));
                            return;
                        } else {
                            arVar.a(str, obj.toString());
                            return;
                        }
                    }
                    arVar.a(str, new String[0]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
