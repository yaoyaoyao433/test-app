package com.dianping.shield;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.agentsdk.framework.b;
import com.dianping.agentsdk.utils.a;
import com.dianping.eunomia.c;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.mapping.AgentProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentConfigParser {
    public static final String PICASSO_AGENT_PATH = "com.dianping.picassomodule.PicassoAgent";
    public static final String PICASSO_PREFIX = "picasso";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Class picassoClass;

    @Deprecated
    public static String[][][] parserFromAppKit(List<ArrayList<String>> list, HashMap<String, String> hashMap) {
        Object[] objArr = {list, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a746454882f63e3e31c65c722e28009", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[][][]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a746454882f63e3e31c65c722e28009");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        String[][][] strArr = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayList = list.get(i);
            if (arrayList != null && !arrayList.isEmpty()) {
                String[][] strArr2 = new String[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str = arrayList.get(i2);
                    String agentClass = getAgentClass(str, hashMap);
                    String[] strArr3 = new String[2];
                    strArr3[0] = str;
                    strArr3[1] = agentClass;
                    strArr2[i2] = strArr3;
                }
                strArr[i] = strArr2;
            }
        }
        return strArr;
    }

    @Deprecated
    public static Map<String, b> getAgents(List<ArrayList<String>> list, HashMap<String, Class> hashMap) {
        Object[] objArr = {list, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1c1e730806d71f1b16c4d0dec51307d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1c1e730806d71f1b16c4d0dec51307d");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayList = list.get(i);
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str = arrayList.get(i2);
                    try {
                        linkedHashMap.put(str, a.a(getAgentClazz(str, hashMap), i, i2, list.size(), arrayList.size()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Deprecated
    public static Map<String, b> getAgentsFromPath(List<ArrayList<String>> list, HashMap<String, String> hashMap) {
        Object[] objArr = {list, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26053c7dfcb20866b8c63fe157c32255", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26053c7dfcb20866b8c63fe157c32255");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayList = list.get(i);
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    String str = arrayList.get(i2);
                    try {
                        linkedHashMap.put(str, a.a(Class.forName(getAgentClass(str, hashMap)), i, i2, list.size(), arrayList.size()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Deprecated
    public static Class getAgentClazz(String str, HashMap<String, Class> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc9265819959d90133b7b1337a9e3852", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc9265819959d90133b7b1337a9e3852");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        String[] split = trim.split(CommonConstant.Symbol.UNDERLINE);
        if (split != null && split.length > 0 && PICASSO_PREFIX.equals(split[0])) {
            try {
                if (picassoClass == null) {
                    picassoClass = Class.forName("com.dianping.picassomodule.PicassoAgent");
                }
                return picassoClass;
            } catch (ClassNotFoundException unused) {
                Log.e("Shield", "PicassoAgent Class Not Found");
                return null;
            }
        }
        return hashMap.get(trim);
    }

    @Deprecated
    public static String getAgentClass(String str, HashMap<String, String> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9c178d22515351e4ec3ae0c40db121f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9c178d22515351e4ec3ae0c40db121f3");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        String[] split = trim.split(CommonConstant.Symbol.UNDERLINE);
        String str2 = (split.length <= 0 || !PICASSO_PREFIX.equals(split[0])) ? hashMap.get(trim) : "com.dianping.picassomodule.PicassoAgent";
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return str2;
    }

    @Deprecated
    public static Map<String, String> getABTestHashMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b742c0d83d94290865184c7c7e135830", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b742c0d83d94290865184c7c7e135830");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split == null || split.length == 0) {
            return null;
        }
        for (String str2 : split) {
            Matcher matcher = Pattern.compile("[^\\\"$|{|}|:]*[^\\\"$|{|}|:]").matcher(str2);
            String str3 = "";
            String str4 = "";
            boolean z = true;
            while (matcher.find()) {
                if (z) {
                    str4 = matcher.group(0);
                    z = false;
                } else {
                    str3 = matcher.group(0);
                }
            }
            if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                linkedHashMap.put(str4, str3);
            }
        }
        if (linkedHashMap.size() == 0) {
            return null;
        }
        return linkedHashMap;
    }

    public static List<ArrayList<String>> modules2Strings(List<ArrayList<c>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff08e341e104e0dff86b10e10df98c0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff08e341e104e0dff86b10e10df98c0f");
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            ArrayList<c> arrayList2 = list.get(i);
            if (arrayList2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    arrayList3.add(arrayList2.get(i2).a);
                }
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigInfo(List<ArrayList<c>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6641ee13259cb994842cb71c10fe2803", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6641ee13259cb994842cb71c10fe2803") : getShieldConfigInfo(list, new HashMap(), null);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigInfo(List<ArrayList<c>> list, HashMap<String, String> hashMap) {
        Object[] objArr = {list, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71abd4247526d94167fbbc74a9415df4", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71abd4247526d94167fbbc74a9415df4") : getShieldConfigInfo(list, hashMap, null);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigInfo(List<ArrayList<c>> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7eaf1ddff5c5e02828d2568cad89cd85", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7eaf1ddff5c5e02828d2568cad89cd85") : getShieldConfigInfo(list, (HashMap) getABTestHashMap(str), null);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigInfo(List<ArrayList<c>> list, HashMap<String, String> hashMap, String str) {
        ShieldConfigInfo agentWithPriority;
        Object[] objArr = {list, hashMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "52d4dba6f29389bd4d73da4205881108", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "52d4dba6f29389bd4d73da4205881108");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<ArrayList<ShieldConfigInfo>> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ArrayList<c> arrayList2 = list.get(i);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList<ShieldConfigInfo> arrayList3 = new ArrayList<>();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c cVar = arrayList2.get(i2);
                    if (hashMap != null) {
                        agentWithPriority = AgentsRegisterMapping.getInstance().getAgentWithPriority(cVar, hashMap.get(cVar.a), str);
                    } else {
                        agentWithPriority = AgentsRegisterMapping.getInstance().getAgentWithPriority(cVar, null, str);
                    }
                    if (agentWithPriority != null) {
                        arrayList3.add(agentWithPriority);
                    }
                }
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfig(List<ArrayList<String>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a785077c8765a3155dd2dcdb8ae62283", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a785077c8765a3155dd2dcdb8ae62283") : getShieldConfig(list, new HashMap(), (String) null);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfig(List<ArrayList<String>> list, HashMap<String, String> hashMap) {
        Object[] objArr = {list, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "158349dbe91cdd32d03d06c0660c3440", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "158349dbe91cdd32d03d06c0660c3440") : getShieldConfig(list, hashMap, (String) null);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfig(List<ArrayList<String>> list, HashMap<String, String> hashMap, String str) {
        ShieldConfigInfo agent;
        Object[] objArr = {list, hashMap, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f7f3960de6e192f9004d448140c4f58", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f7f3960de6e192f9004d448140c4f58");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<ArrayList<ShieldConfigInfo>> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayList2 = list.get(i);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList<ShieldConfigInfo> arrayList3 = new ArrayList<>();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str2 = arrayList2.get(i2);
                    if (hashMap != null) {
                        agent = AgentsRegisterMapping.getInstance().getAgent(str2, hashMap.get(str2), str);
                    } else {
                        agent = AgentsRegisterMapping.getInstance().getAgent(str2, null, str);
                    }
                    if (agent != null) {
                        arrayList3.add(agent);
                    }
                }
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfig(List<ArrayList<String>> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2d76b0d0bf0c5d33672eb20a3d40c21d", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2d76b0d0bf0c5d33672eb20a3d40c21d") : getShieldConfig(list, (HashMap) getABTestHashMap(str), (String) null);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfig(List<ArrayList<String>> list, String str, String str2) {
        Object[] objArr = {list, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "904ea911df0ba60e2922fb7b6e11d637", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "904ea911df0ba60e2922fb7b6e11d637") : getShieldConfig(list, (HashMap) getABTestHashMap(str), str2);
    }

    public static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigFromCustomMapping(List<ArrayList<String>> list, HashMap<String, Class> hashMap) {
        Object[] objArr = {list, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4494b23c3b2c8f05f6169db682b4508c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4494b23c3b2c8f05f6169db682b4508c");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<ArrayList<ShieldConfigInfo>> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayList2 = list.get(i);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList<ShieldConfigInfo> arrayList3 = new ArrayList<>();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str = arrayList2.get(i2);
                    ShieldConfigInfo mappingDynamicAgent = AgentProvider.mappingDynamicAgent(new AgentRegisterKey(str));
                    if (mappingDynamicAgent == null) {
                        mappingDynamicAgent = new ShieldConfigInfo(str, hashMap.get(str));
                    }
                    if (mappingDynamicAgent != null) {
                        arrayList3.add(mappingDynamicAgent);
                    }
                }
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }

    private static ArrayList<ArrayList<ShieldConfigInfo>> getShieldConfigInternal(List<ArrayList<String>> list, HashMap<String, String> hashMap, String str, HashMap<String, Class> hashMap2) {
        ShieldConfigInfo agent;
        Object[] objArr = {list, hashMap, str, hashMap2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e48101e200d7676c84395cc85e1f5dd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e48101e200d7676c84395cc85e1f5dd2");
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList<ArrayList<ShieldConfigInfo>> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> arrayList2 = list.get(i);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                ArrayList<ShieldConfigInfo> arrayList3 = new ArrayList<>();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    String str2 = arrayList2.get(i2);
                    if (hashMap2 != null) {
                        agent = new ShieldConfigInfo(str2, hashMap2.get(str2));
                    } else {
                        agent = AgentsRegisterMapping.getInstance().getAgent(str2, hashMap != null ? hashMap.get(str2) : null, str);
                    }
                    if (agent != null) {
                        arrayList3.add((ShieldConfigInfo) agent.clone());
                    }
                }
                arrayList.add(arrayList3);
            }
        }
        return arrayList;
    }
}
